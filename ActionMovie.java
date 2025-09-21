
package model;

public class ActionMovie extends Movie {
    private String stuntLevel; // tambahan atribut khusus
    private final String stuntCoordinator;

    public ActionMovie(int id, String title, String genre, int year, double rating, String stuntCoordinator) {
    super(id, title, genre, year, rating);
    this.stuntCoordinator = stuntCoordinator;
    }

    public String getStuntLevel() {
        return stuntLevel;
    }

    public void setStuntLevel(String stuntLevel) {
        this.stuntLevel = stuntLevel;
    }

    // overriding
    @Override
    public String getInfo() {
        return super.getInfo() + " | Stunt Level: " + stuntLevel;
    }
}
