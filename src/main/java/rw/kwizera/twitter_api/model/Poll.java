package rw.kwizera.twitter_api.model;

public class Poll {
    private Option[] options;
    private String end_datetime;
    private String duration_minutes;
    public Option[] getOptions() {
        return options;
    }
    public void setOptions(Option[] options) {
        this.options = options;
    }
    public String getEnd_datetime() {
        return end_datetime;
    }
    public void setEnd_datetime(String end_datetime) {
        this.end_datetime = end_datetime;
    }
    public String getDuration_minutes() {
        return duration_minutes;
    }
    public void setDuration_minutes(String duration_minutes) {
        this.duration_minutes = duration_minutes;
    }
}
