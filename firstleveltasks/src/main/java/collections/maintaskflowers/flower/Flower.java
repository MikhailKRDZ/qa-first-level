package collections.maintaskflowers.flower;

import static collections.maintaskflowers.flower.EFreshness.FRESH;

public abstract class Flower implements  Comparable <Flower> {//comparator
    private EFlower flowerName;
    private int length;
    private EFreshness freshnessName;
    public Flower(EFlower flowerName, EFreshness freshnessName, int length) {
        this.flowerName = flowerName;
        this.freshnessName = freshnessName;
        this.length = length;

    }

    public Flower( EFlower name,int length) {
        this.flowerName = name;
        this.freshnessName = FRESH;
        this.length = length;
    }

    public EFlower getFlowerName() {
        return flowerName;
    }

    public int getLength() {
        return length;
    }

    public double getFlowerFreshnessValue() {
        return freshnessName.getFlowersFreshness();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("(").append(flowerName);
        sb.append(", длинна = ").append(length);
        sb.append(", уровень свежести - ").append(freshnessName).append('\'');
        sb.append(")\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Flower o) {
        return 0;
    }
}
