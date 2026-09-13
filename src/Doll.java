public class Doll {
    private String name;
    private String hairColor;
    private String outfit;
    private String accessory;
    private boolean hasSoundModule;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    void setOutfit(String outfit) {
        this.outfit = outfit;
    }

    void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    void setHasSoundModule(boolean hasSoundModule) {
        this.hasSoundModule = hasSoundModule;
    }

    @Override
    public String toString() {
        return "Doll{" +
                "name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", outfit='" + outfit + '\'' +
                ", accessory='" + accessory + '\'' +
                ", hasSoundModule=" + hasSoundModule +
                '}';
    }
}