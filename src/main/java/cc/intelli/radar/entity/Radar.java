package cc.intelli.radar.entity;

import javax.persistence.*;

/**
 * @author guaguagua-mac
 */

@Entity
@Table(name = "radar")
public class Radar extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long sid;
    private double longitude;
    private double latitude;
    private double height;

    public Radar() {
        super();
    }

    public Radar(long sid, double longitude, double latitude,
                 double height) {
        super();
        this.sid = sid;
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
