package ua.in.zloch.core.dto;

import java.util.Date;
import java.util.List;

public class CrimeFilter {
    private List<Long> regions;
    private List<Long> categories;
    private Date dateFrom;
    private Date dateTo;
    private Point southWest;
    private Point northEast;
    private int precision;

    public List<Long> getRegions() {
        return regions;
    }

    public void setRegions(List<Long> regions) {
        this.regions = regions;
    }

    public List<Long> getCategories() {
        return categories;
    }

    public void setCategories(List<Long> categories) {
        this.categories = categories;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Point getSouthWest() {
        return southWest;
    }

    public void setSouthWest(Point southWest) {
        this.southWest = southWest;
    }

    public Point getNorthEast() {
        return northEast;
    }

    public void setNorthEast(Point northEast) {
        this.northEast = northEast;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
}
