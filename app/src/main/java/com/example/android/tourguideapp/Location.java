package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;

import java.util.Random;

/**
 * Created by an0o0nym on 25/06/17.
 */

public class Location extends AppCompatActivity {
    private String locTitle;
    private String description;
    private int imgResource;
    private int rating;
    private static final int MAX_RATING = 5;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String title, String description, int imgResource) {
        this.locTitle = title;
        this.description = description;
        this.imgResource = imgResource;
        this.rating = generateFakeRating(MAX_RATING);
    }

    public Location(String title, String description) {
        this.locTitle = title;
        this.description = description;
        this.imgResource = NO_IMAGE_PROVIDED;
        this.rating = generateFakeRating(MAX_RATING);
    }
    
    public String getLocTitle() {
        return locTitle;
    }

    public void setLocTitle(String title) {
        this.locTitle = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean hasImage() {
        return imgResource != NO_IMAGE_PROVIDED;
    }

    /**
     * Helper function used to generate random rating value for location
     * @param maxRating int representing maximum value acceptable in rating
     * @return randomly generated rating value
     */
    public static int generateFakeRating(int maxRating) {
        Random random = new Random();
        return random.nextInt(maxRating);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nTitle: " + getLocTitle());
        sb.append("\nDescription: " + getDescription());
        sb.append("\nRating: " + getRating());
        sb.append(" out of" + MAX_RATING);
        return sb.toString();
    }
}
