package ua.in.zloch.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Crime implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double latitude;
    private double longitude;
    @Column(length = 12)
    private String geohash;
    @OneToOne
    private Category category;
    @OneToOne
    @JoinColumn(name = "koatuu", referencedColumnName = "koatuu")
    private Region region;
    private Date date;

    @Transient
    private long count;

    public Crime(long count, double latitude, double longitude){
        this(count, latitude, longitude, null, null);
    }

    public Crime(long count, double latitude, double longitude, Category category){
        this(count, latitude, longitude, category, null);
    }

    public Crime(long count, double latitude, double longitude, Region region){
        this(count, latitude, longitude, null, region);
    }

    public Crime(long count, double latitude, double longitude, Category category, Region region){
        this.count = count;
        this.latitude = latitude;
        this.longitude = longitude;
        this.category = category;
        this.region = region;
    }

    public Crime(){
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
