package collections.maintaskflowers;

import collections.maintaskflowers.bouquet.Bouquet;
import collections.maintaskflowers.flower.*;
import collections.maintaskflowers.printer.Printer;

public class Runner {
    public static void main(String[] args) {
        final int BOUQUET_SIZE = 5;
        Bouquet bouquet = new Bouquet(BOUQUET_SIZE);
        Flower rose = new Rose();
        Flower lily = new Lily();
        Flower chrysanthemum = new Chrysanthemum();
        Flower pion = new Pion();
        Flower orchid = new Orchid();
        bouquet.addFlower(rose);
        bouquet.addFlower(lily);
        bouquet.addFlower(chrysanthemum);
        bouquet.addFlower(pion);
        bouquet.addFlower(orchid);

        Printer.printBouquet(bouquet.getFlowers());
        Printer.printPrice(bouquet.getBouquetCost());
        Printer.printArrayBouquetFreshnessSort(bouquet.getFlowers());
        Printer.printFlowerRequiredLength(bouquet.getFlowers(), 15, 22);
    }
}
