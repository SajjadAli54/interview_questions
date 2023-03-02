public enum BirdName {
    TWEETY("Tweety"),
    ZAZU("zazu"),
    IAGO("Iago"),
    HULA("Hula"),
    MANU("Manu"),
    COUSCOUS("Couscous"), 
    ROO("roo"), 
    TOOKIE("Tookie"), 
    PLUCKY("Plucky"), 
    Jay("Jay");
    
    private String name;

    private BirdName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    
}
