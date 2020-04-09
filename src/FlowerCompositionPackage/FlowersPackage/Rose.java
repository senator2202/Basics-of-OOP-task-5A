package FlowerCompositionPackage.FlowersPackage;

/**
 * Класс Роза, наследник класса Цветок с переопределенным методом интерфейса FlowerBehavior
 */
public class Rose extends Flower {
    public Rose(Color color, int length) {
        super(color, length);
    }

    @Override
    public void smell() {
        System.out.println("Rose's smell");
    }

    @Override
    public String toString() {
        return "flower: rose; color: " + color + "; length: " + length;
    }
}
