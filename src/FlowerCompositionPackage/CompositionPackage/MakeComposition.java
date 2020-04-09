package FlowerCompositionPackage.CompositionPackage;

/**
 * Класс соблюдает паттерн Factory:
 * Используется, когда у нас есть суперкласс с несколькими подклассами
 * (CompositionMaker->MimosaCompositionMaker,RoseCompositionMaker,TulipCompositionMaker),
 * и на основе ввода, нам нужно вернуть один из подкласса.
 * Класс не знает какого типа объект он должен создать.
 * Объекты создаются в зависимости от входящих данных.
 */
public class MakeComposition {
    private CompositionMaker compositionMaker;

    public MakeComposition(String flower) {
        switch (flower) {
            case "Mimosa":
                compositionMaker = new MimosaCompositionMaker();
                break;
            case "Rose":
                compositionMaker = new RoseCompositionMaker();
                break;
            case "Tulip":
                compositionMaker = new TulipCompositionMaker();
                break;
            default:
                System.out.println("Не правильно введено название цветов!!!!!");
                break;
        }
    }

    public CompositionMaker getCompositionMaker() {
        try {
            return compositionMaker;
        } catch (Exception e) {
            System.out.println("Не правильно введено название цветов!!!!!");
            return null;
        }
    }
}
