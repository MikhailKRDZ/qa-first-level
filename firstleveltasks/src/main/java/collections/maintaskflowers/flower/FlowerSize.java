package collections.maintaskflowers.flower;

public enum FlowerSize {
    SMALL("small", 0.8),
    MEDIUM("medium", 1.0),
    BIG("big", 1.2),
    ;

    FlowerSize(String flowerSizeName, double coefficient) {
        this.flowerSizeName = flowerSizeName;
        this.coefficient = coefficient;
    }

    private String flowerSizeName;

    private double coefficient;

    FlowerSize(String flowerSizeName) {
        this.flowerSizeName = flowerSizeName;
    }

    FlowerSize(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public String getFlowerSizeName() {
        return flowerSizeName;
    }
}
