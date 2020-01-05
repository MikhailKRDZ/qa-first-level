package collections.maintaskflowers.printer;

import collections.maintaskflowers.flower.Flower;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Printer {
    public static void printBouquet(Flower[] flowers) {
        StringBuilder stringBuilder = new StringBuilder(flowers.length);
        stringBuilder.append("Букет состоит из\n[");
        for (Flower flower : flowers) {
            stringBuilder.append(flower.getFlowerName());
            stringBuilder.append(",");
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }

    public static void printPrice(int price) {
        System.out.println("Цена букета с учетом свежести: " + price);
    }

    public static void printArrayBouquetFreshnessSort(Flower[] flowers) {
        StringBuilder stringBuilder = new StringBuilder(flowers.length);
        ArrayList<Flower> listBouquet = new ArrayList<>();
        stringBuilder.append("[");
        for (Flower flower : flowers) {
            stringBuilder.append(flower.getFlowerName());
            stringBuilder.append(",");
            listBouquet.add(flower);
        }
        stringBuilder.append("]");
        listBouquet.sort(Comparator.comparing(Flower::getFlowerFreshnessValue));// переделать
        System.out.println("Букет сортированный по cвежести :\n" + listBouquet);
    }

    public static void printFlowerRequiredLength(Flower[] flowers, int lengthMin, int lengthMax) {
        StringBuilder stringBuilder = new StringBuilder(flowers.length);
        ArrayList<Flower> listBouquet = new ArrayList<>();
        stringBuilder.append("[");
        for (Flower flower : flowers) {
            stringBuilder.append(flower.getFlowerName());
            stringBuilder.append(",");
            listBouquet.add(flower);
        }
        stringBuilder.append("]");
        Iterator<Flower> iterator = listBouquet.iterator();
        while (iterator.hasNext()) {
            Flower flower = iterator.next();
            if (lengthMax <= flower.getLength() && flower.getLength() >= lengthMin) {
                iterator.remove();
            } else {
            }
        }
        System.out.println("Цветок заданной длинны [" + lengthMin + " - " + lengthMax + "]:\n " + listBouquet.get(0).getFlowerName() + ", Длинна: " + listBouquet.get(0).getLength());
    }
}
