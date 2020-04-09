package FlowerCompositionPackage;

import FlowerCompositionPackage.CompositionPackage.MakeComposition;
import FlowerCompositionPackage.FlowersPackage.Flower;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Класс Цветочная композиция, агрегатор объектов классов Цветок и Упаковка.
 */
public class FlowerComposition {
    private Flower flower;
    private int number;
    private Package flowerPackage;

    public FlowerComposition(Flower flower, int number, Package flowerPackage) {
        this.flower = flower;
        this.number = number;
        this.flowerPackage = flowerPackage;
    }

    public static void main(String []args) {
        MakeComposition mc=null;
        String menu="\n1-Composition from roses\n" +
                "2-Composition from tulips\n" +
                "3-Composition from mimoses\n" +
                "0-exit";
        System.out.println(menu);
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        while(choice!=0) {
            String flower="";
            boolean flag=true;
            switch (choice){
                case 1:
                    flower="Rose";
                    break;
                case 2:
                    flower="Tulip";
                    break;
                case 3:
                    flower="Mimosa";
                    break;
                case 0:
                    exit(0);
            }
            try {
                mc = new MakeComposition(flower);
                System.out.println(mc.getCompositionMaker().makeFlowerComposition());
            } catch (Exception e) {

            }
            System.out.println(menu);
            choice=scanner.nextInt();
        }
    }

    @Override
    public String toString() {
        return flower.toString() + "\nnumber: " + number + "\n" + flowerPackage.toString();
    }
}
