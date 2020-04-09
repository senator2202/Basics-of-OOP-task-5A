package FlowerCompositionPackage.FlowersPackage;

/**
 * Класс Мимоза, наследник класса Цветок с переопределенным методом интерфейса FlowerBehavior
 */
public class Mimosa extends Flower {
    public Mimosa(Color color, int length) {
        super(color, length);
    }
    public int radius;

    @Override
    public void smell() {
        System.out.println("Mimosa's smell");
    }

    @Override
    public String toString() {
        return "flower: mimosa; color: " + color + "; length: " + length;
    }

}
