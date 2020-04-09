package FlowerCompositionPackage.CompositionPackage;

import FlowerCompositionPackage.FlowerComposition;
import FlowerCompositionPackage.FlowersPackage.Flower;
import FlowerCompositionPackage.FlowersPackage.Mimosa;
import FlowerCompositionPackage.Package;

import java.util.Random;

/**
 * Класс для создания композиции из мимоз, который переопределяет метод суперкласса
 * makeFlowerComposition(), который инициализирует и возвращает
 * объект - цветочную композцию из мимоз
 */
public class MimosaCompositionMaker extends CompositionMaker {
    @Override
    public FlowerComposition makeFlowerComposition() {
        Random r = new Random();
        Flower.Color color = null;
        switch (r.nextInt(4)) {
            case 1:
                color = Flower.Color.Blue;
                break;
            case 2:
                color = Flower.Color.Green;
                break;
            case 0:
                color = Flower.Color.Red;
                break;
            case 3:
                color = Flower.Color.Yellow;
        }
        Flower flower = new Mimosa(color, r.nextInt(30) + 30);
        Package.PackageType packageType = r.nextBoolean() ? Package.PackageType.Cellophane : Package.PackageType.Paper;
        Package flowerPackage = new Package(packageType);
        int number = r.nextInt(20);
        flowerComposition = new FlowerComposition(flower, number, flowerPackage);
        return flowerComposition;
    }
}
