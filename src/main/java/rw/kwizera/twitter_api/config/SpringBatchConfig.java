package rw.kwizera.twitter_api.config;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import rw.kwizera.twitter_api.model.Tweet;
import rw.kwizera.twitter_api.model.UserMention;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {
    
    @Autowired
    public JobBuilderFactory jobBuilderFactory;
    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Value("${file.input}")
    private String fileInput;

    @Bean
    public Job job(JobBuilderFactory jobBuilderFactory,
                    StepBuilderFactory stepBuilderFactory,
                    ItemReader<Tweet> itemReader,
                    ItemProcessor<Tweet, Tweet> itemProcessor,
                    ItemWriter<Tweet> itemWriter) {

        Step step = stepBuilderFactory.get("ETL-json-loader")
                        .<Tweet, Tweet>chunk(1000)
                        .reader(itemReader)
                        .processor(itemProcessor)
                        .writer(itemWriter)
                        .build();

        return jobBuilderFactory.get("ETL_loader")
            .incrementer(new RunIdIncrementer())
            .start(step)
            .build();
    }

    @Bean
    public FlatFileItemReader<Tweet> fileReader() {

        FlatFileItemReader<Tweet> flatFileItemReader = new FlatFileItemReader<>();
        flatFileItemReader.setName("Tweet-reader");
        flatFileItemReader.setResource(new ClassPathResource(fileInput));

        TweetJsonLineMapper lineMapper = new TweetJsonLineMapper();
        flatFileItemReader.setLineMapper(lineMapper);

        return flatFileItemReader;
    }
 
}
