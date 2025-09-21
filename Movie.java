package model;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private int year;
    private double rating;

    // Constructor
    public Movie(int id, String title, String genre, int year, double rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    //(getter & setter)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    
    @Override
    public String toString() {
        return String.format("[%d] %s (%d) - %s | Rating: %.1f",
                id, title, year, genre, rating);
    }
    
    public String getInfo() {
    return String.format("%s (%d) - %s | Rating: %.1f",
            title, year, genre, rating);
    }
}
