package FlowerCompositionPackage.FlowersPackage;

/**
 * Абстрактный класс Цветок, инкапсулирующий общее поведение всех наследуемых цветов
 */
public abstract class Flower implements FlowerBehavior {
    Color color;
    int length;

    Flower(Color color, int length) {
        this.color = color;
        this.length = length;
    }

    public enum Color {
        Blue,
        Green,
        Red,
        Yellow
    }
}
