package rw.kwizera.twitter_api.model;

public class BoundingBox {
    private Float[][][] coordinates;
    private String type;
    public Float[][][] getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Float[][][] coordinates) {
        this.coordinates = coordinates;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
