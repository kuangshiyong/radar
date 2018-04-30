package cc.intelli.radar.entity.builder;

import cc.intelli.radar.entity.Radar;

/**
 * @author guaguagua-mac
 */
public class RadarBuilder {

    private long radarid;
    private double longitude;
    private double latitude;
    private double height;

    public RadarBuilder() {
    }

    public RadarBuilder setRadarid(long radarid) {
        this.radarid = radarid;
        return this;
    }

    public RadarBuilder setLongitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public RadarBuilder setLatitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public RadarBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public Radar build() {
        return new Radar(radarid, longitude, latitude, height);
    }
}
