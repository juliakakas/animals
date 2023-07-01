public class Chicken implements Animal{
    private int eggPerSec;

    private double weight;

    public Chicken(int eggPerSec, double weight){
        this.eggPerSec = eggPerSec;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Chicken " + eggPerSec + " " + weight;
    }

    public int getEggPerSec() {
        return eggPerSec;
    }

    public double getWeight() {
        return weight;
    }

    public void setEggPerSec(int eggPerSec) {
        this.eggPerSec = eggPerSec;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
