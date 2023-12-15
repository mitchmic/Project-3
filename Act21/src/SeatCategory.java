public class SeatCategory extends Movie{
    private double priceing;

    public SeatCategory(String name, int runtime, String genre, double priceing){
        super(name, runtime, genre);
        this.priceing = priceing;
    }

    public double getPriceing(){
        return priceing;
    }

    public void setPriceing(double priceing){
        this.priceing = priceing;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nRunTime in hrs: %d\nGenre: %s\nPriceing: %.2f\n"
                , getName(), getRuntime(), getGenre(), priceing);
    }

}
