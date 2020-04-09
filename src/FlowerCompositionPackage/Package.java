package FlowerCompositionPackage;

/**
 * Класс, хранящий информацию о цветочной упаковке
 */
public class Package {
    private final PackageType packageType;

    public Package(PackageType packageType) {
        this.packageType = packageType;
    }

    @Override
    public String toString() {
        return "package: " + packageType;
    }

    public enum PackageType {
        Cellophane,
        Paper
    }

}
