//package cc.intelli.radar.entity;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//
///**
// * Created by Selene on 2018/4/30.
// *
// */
//@Entity
//@Table(name = "hdMissingValue")
//public class HDMissingValue extends BaseEntity {
//    @Id
//    @Column(name = "rowid")
//    private long rowid;
//    @Id
//    @Column(name = "code")
//    private String code;
//    @Id
//    @Column(name = "radarid")
//    private long radarid;
//    @Id
//    @Column(name = "timestamp")
//    private java.sql.Timestamp timestamp;
//
//    private int corr_type;
//    private int polar;
//    private int hi;
//    private double angle;
//    private double longitude;
//    private double latitude;
//    private int height;
//    private int original;
//    private int status;
//
//    public long getRowid() {
//        return rowid;
//    }
//
//    public void setRowid(long rowid) {
//        this.rowid = rowid;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public long getRadarid() {
//        return radarid;
//    }
//
//    public void setRadarid(long radarid) {
//        this.radarid = radarid;
//    }
//
//    public Timestamp getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(Timestamp timestamp) {
//        this.timestamp = timestamp;
//    }
//
//    public int getCorr_type() {
//        return corr_type;
//    }
//
//    public void setCorr_type(int corr_type) {
//        this.corr_type = corr_type;
//    }
//
//    public int getPolar() {
//        return polar;
//    }
//
//    public void setPolar(int polar) {
//        this.polar = polar;
//    }
//
//    public int getHi() {
//        return hi;
//    }
//
//    public void setHi(int hi) {
//        this.hi = hi;
//    }
//
//    public double getAngle() {
//        return angle;
//    }
//
//    public void setAngle(double angle) {
//        this.angle = angle;
//    }
//
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }
//
//    public double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int getOriginal() {
//        return original;
//    }
//
//    public void setOriginal(int original) {
//        this.original = original;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//}
