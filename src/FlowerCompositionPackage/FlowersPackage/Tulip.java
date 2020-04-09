package FlowerCompositionPackage.FlowersPackage;

/**
 * Класс Тюльпан, наследник класса Цветок с переопределенным методом интерфейса FlowerBehavior
 */
public class Tulip extends Flower {
    public Tulip(Color color, int length) {
        super(color, length);
    }

    @Override
    public void smell() {
        System.out.println("Tulip's smell");
    }

    @Override
    public String toString() {
        return "flower: tulip; color: " + color + "; length: " + length;
    }
}
