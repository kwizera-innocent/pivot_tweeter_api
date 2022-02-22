package rw.kwizera.twitter_api.model;

import java.util.Collection;

public class Coordinates {
    private String type;
    private Collection<Float> coordinates;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Collection<Float> getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Collection<Float> coordinates) {
        this.coordinates = coordinates;
    }
}
