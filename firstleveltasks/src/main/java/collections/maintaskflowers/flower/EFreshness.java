package collections.maintaskflowers.flower;

 enum EFreshness {
    FRESH("Свежие",1.0), MIDDLE_FRESH("Средней свежести",.8), OLD_FRESH("Старые",0.6);

    String freshnessName;
    private double flowersFreshness;

    EFreshness(String freshnessName, double flowersFreshness) {
        this.freshnessName = freshnessName;
        this.flowersFreshness = flowersFreshness;
    }

     EFreshness() {
            }

    EFreshness(double flowersFreshness) {
        this.flowersFreshness = flowersFreshness;
    }

    public double getFlowersFreshness() {
        return flowersFreshness;
    }

    @Override
    public String toString() {
        return freshnessName;
    }


}




