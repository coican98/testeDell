public class Truck {
    private double pricePerKm;
    private int maxWeight;

    public Truck(int maxWeight, double pricePerKm){
        this.maxWeight = maxWeight;
        this.pricePerKm = pricePerKm;
    }

    public int getMaxWeight(){
        return maxWeight;
    }
    public double getPricePerKm(){
        return pricePerKm;
    }

    //ToString
    @Override
    public String toString(){
        return "{" +
            "Peso Máximo='" + maxWeight + '\'' +
            ", Preço por KM" + pricePerKm + '}';
    }
}
