public interface DollBuilder {
    DollBuilder reset();
    DollBuilder buildName(String name);
    DollBuilder buildHairColor(String hairColor);
    DollBuilder buildOutfit(String outfit);
    DollBuilder buildAccessory(String accessory);
    DollBuilder buildSoundModule(boolean hasSound);
    Doll build();
}