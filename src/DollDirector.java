public class DollDirector {

    public void makeRoyalPrincess(DollBuilder builder) {
        builder.reset()
                .buildName("Princess Elsa")
                .buildHairColor("Blonde")
                .buildOutfit("Sparkly Blue Dress")
                .buildAccessory("Tiara")
                .buildSoundModule(true);
    }

    public void makeActionHero(DollBuilder builder) {
        builder.reset()
                .buildName("Captain Justice")
                .buildHairColor("Black")
                .buildOutfit("Armored Suit")
                .buildAccessory("Shield")
                .buildSoundModule(false);
    }
}