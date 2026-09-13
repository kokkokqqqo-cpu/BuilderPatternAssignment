public class Main {
    public static void main(String[] args) {
        DollDirector director = new DollDirector();

        DollBuilder princessBuilder = new PrincessDollBuilder();
        director.makeRoyalPrincess(princessBuilder);
        Doll princessDoll = princessBuilder.build();
        System.out.println("Director created: " + princessDoll);

        DollBuilder superheroBuilder = new SuperheroDollBuilder();
        director.makeActionHero(superheroBuilder);
        Doll superheroDoll = superheroBuilder.build();
        System.out.println("Director created: " + superheroDoll);

        Doll customDoll = new PrincessDollBuilder()
                .reset()
                .buildName("Custom Fairy")
                .buildHairColor("Pink")
                .buildOutfit("Wings and Skirt")
                .build();
        System.out.println("Client built directly: " + customDoll);
    }
}