package collections.maintaskflowers.bouquet;

import collections.maintaskflowers.flower.Flower;

public class Bouquet implements IBouquet {
    private Flower[] flowers;
    public Bouquet(int count) {
        flowers = new Flower[count];
    }
    public Flower[] getFlowers() {
        return this.flowers;
    }

    @Override
    public void addFlower(Flower flower) {
        if (BouquetChecker.checkLength(this.flowers)) {
            int position = BouquetChecker.getPosition(this.flowers);
            this.flowers[position] = flower;
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public int getBouquetCost() {
        int result = 0;
        for (Flower flower : this.flowers) {
            if (flower != null) {
                result += flower.getLength() * flower.getFlowerFreshnessValue();
            } else
                break;
        }
        return result;
    }
}
