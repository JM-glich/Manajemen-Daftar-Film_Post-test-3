
package model;

public class RomanceMovie extends Movie {
    private String loveTheme; // tambahan atribut khusus
    private final String leadCouple;

    public RomanceMovie(int id, String title, String genre, int year, double rating, String leadCouple) {
    super(id, title, genre, year, rating);
    this.leadCouple = leadCouple;
    }

    public String getLoveTheme() {
        return loveTheme;
    }

    public void setLoveTheme(String loveTheme) {
        this.loveTheme = loveTheme;
    }

    // overriding
    @Override
    public String getInfo() {
        return super.getInfo() + " | Tema Cinta: " + loveTheme;
    }
}
