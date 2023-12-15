public class TheaterMovie extends Movie {

    private String description;

    public TheaterMovie(String name, int runtime, String genre, String description) {
        super(name, runtime, genre);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nRunTime in hrs: %d\nGenre: %s\n Description: %d\n"
                , getName(), getRuntime(), getGenre(), description);

    }
}
