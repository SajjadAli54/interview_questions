public enum Breed {
    ABYSSINIAN("Abyssinian"),
    AMERICAN_SHORTHAIR("American Shorthair"),
    AMERICAN_WIREHAIR("American Wirehair"),
    BALINESE("Balinese"),
    BENGAL("Bengal"),
    BIRMAN("Birman"),
    BOMBAY("Bombay"),
    BRITISH_SHORTHAIR("British Shorthair"),
    BURMESE("Burmese"),
    CHARTREUX("Chartreux"),
    CHINESE_LI_HUA("Chinese Li Hua"),
    COLORPOINT_SHORTHAIR("Colorpoint Shorthair"),
    CORNISH_REX("Cornish Rex"),
    CURIAN("Curian"),
    CYPRUS("Cyprus"),
    DEVON_REX("Devon Rex"),
    DON_SPHYNX("Don Sphynx"),
    EGYPTIAN_MAU("Egyptian Mau"),
    EUROPEAN_SHORTHAIR("European Shorthair"),
    HIMALAYAN("Himalayan"),
    JAPANESE_BOBTAIL("Japanese Bobtail"),
    JAVANESE("Javanese"),
    OCI("Oci"),
    OCICAT("Ocicat"),
    OCELOT("Ocelot"),
    ORIENTAL_SHORTHAIR("Oriental Shorthair"),
    PERSIAN("Persian"),
    RAGAMUFFIN("Ragamuffin"),
    RAGDOLL("Ragdoll"),
    SERVAL("Serval"),
    ;

    private String name;

    private Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Breed getBreed(String name) {
        for (Breed breed : Breed.values()) {
            if (breed.getName().equals(name)) {
                return breed;
            }
        }
        return null;
    }

}
