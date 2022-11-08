package com.series.manage;

public class Series {
    private String series_name;
    private String status;
    private int ratings;

    public Series(String series_name, String status, int ratings)
    {
        this.series_name = series_name;
        this.status = status;
        this.ratings = ratings;
    }

    public void print()
    {
        System.out.println("Series Name :" + this.series_name);
        System.out.println("Status :" + this.status);
        System.out.println("Ratings :" + this.ratings);
        
    }

    public String getSeriesName()
    {
        return this.series_name;
    }

    public String getStatus()
    {
        return this.status;
    }

    public int getRatings()
    {
        return this.ratings;
    }

}
