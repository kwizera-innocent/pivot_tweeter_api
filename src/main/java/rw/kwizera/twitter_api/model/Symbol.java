package rw.kwizera.twitter_api.model;

public class Symbol {
    private int[] indices;
    private String text;
    public Symbol() {
    }
    public Symbol(int[] indices, String text) {
        this.indices = indices;
        this.text = text;
    }
    public int[] getIndices() {
        return indices;
    }
    public void setIndices(int[] indices) {
        this.indices = indices;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
