public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    /**
     * Implémentation de la méthode takeOff ()
     */
    @Override
    public void takeOff() {
        System.out.println(this.getName() + "takes off in the sky");
    }

    /**
     * Méthode ascend premier
     * 
     * @param prend un nombre de type int en paramètre qui a
     * @return un nombre de type int
     */
    @Override
    public int ascend(int a) {
        System.out.println(this.getName() + " Flies upward, altitude : " + a);
        return a;
    }

    /**
     * Implémentation de la méthode ascend 2
     * 
     * @param prend en paramètre deux nombres : celui du premier ascend et un
     *              nouveau
     * @return un nombre de type int après calcul des deux nombres en addition
     */
    @Override
    public double ascend(double a) {
        System.out.println(this.getName() + " flies upward, altitude : " + a);
        return a;
    }

    /**
     * Implémation de la méthode glide () planer
     */
    @Override
    public void glide() {
        System.out.println("Glides into the air.");
    }

    /**
     * Implémentation de la première méthode descend
     * 
     * @param prend un nombre de type int
     * @return un nombre de type int
     */
    @Override
    public int descend(int c) {
        System.out.println(this.getName() + " Flies downward, altitude : " + c);
        return c;
    }

    /**
     * Implémentation de la méthode land () : aterissage
     */
    @Override
    public void land() {
        System.out.println(this.getName() + " is too high, it can't land.");
    }

    /**
     * Implémentation de la méthode descend 2
     * 
     * @param prend en paramètre un nombre de type int dans ce overload du premier
     *              descend donc un double
     * @return un nombre de type int en overload du premier descend donc double
     */
    @Override
    public double descend(double c) {
        System.out.println(this.getName() + " flies downward, altitude : " + c);
        return c;
    }

    /**
     * Implémentation de la méthode land 2
     * 
     * @param prend en paramètre une chaine de caractère de type String
     * @return ne retourne rien de particulier fait juste les traitements
     *         d'affichage
     */
    @Override
    public void land(String param) {
        System.out.println(this.getName() + " lands on the ground.");
    }
}
