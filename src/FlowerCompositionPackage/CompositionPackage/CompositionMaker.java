package FlowerCompositionPackage.CompositionPackage;

import FlowerCompositionPackage.FlowerComposition;

/**
 * Абстрактный класс для построения композиций. Хранит собственно цветочную композицию
 * (объект класса FlowerComposition) и абстрактный метод для создания объекта FlowerComposition
 */
public abstract class CompositionMaker {
    FlowerComposition flowerComposition;

    public abstract FlowerComposition makeFlowerComposition();
}
