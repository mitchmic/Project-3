



public class Movie {

    private String name;
    private int runtime;

    private String genre;

    public Movie(String name, int runtime, String genre){
        this.name = name;
        this.runtime = runtime;
        this.genre = genre;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRuntime(){
        return runtime;
    }
    public void  setRuntime(int runtime){
        this.runtime = runtime;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nRunTime in hrs: %d\nGenre: %s\n", name, runtime, genre);
    }
}
