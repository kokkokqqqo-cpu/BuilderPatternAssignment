public class SuperheroDollBuilder implements DollBuilder {
    private Doll doll;

    public SuperheroDollBuilder() {
        this.reset();
    }

    @Override
    public DollBuilder reset() {
        this.doll = new Doll();
        this.doll.setOutfit("Hero Battle Suit");
        return this;
    }

    @Override
    public DollBuilder buildName(String name) {
        this.doll.setName(name);
        return this;
    }

    @Override
    public DollBuilder buildHairColor(String hairColor) {
        this.doll.setHairColor(hairColor);
        return this;
    }

    @Override
    public DollBuilder buildOutfit(String outfit) {
        this.doll.setOutfit(outfit);
        return this;
    }

    @Override
    public DollBuilder buildAccessory(String accessory) {
        this.doll.setAccessory(accessory);
        return this;
    }

    @Override
    public DollBuilder buildSoundModule(boolean hasSound) {
        this.doll.setHasSoundModule(hasSound);
        return this;
    }

    @Override
    public Doll build() {
        if (this.doll.getName() == null || this.doll.getName().trim().isEmpty()) {
            throw new IllegalStateException("Superhero Doll must have a name!");
        }
        Doll result = this.doll;
        this.reset();
        return result;
    }
}