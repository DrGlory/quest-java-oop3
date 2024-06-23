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

    // /**
    // * Implémentation de la méthode takeOff ()
    // */
    // @Override
    // public void takeOff() {
    // System.out.println(this.getName() + " takes off in the sky.");
    // System.out.flush();
    // }

    // /**
    // * Méthode ascend premier
    // *
    // * @param prend un nombre de type int en paramètre qui a
    // * @return un nombre de type int
    // */
    // @Override
    // public int ascend(int altitude) {
    // System.out.println(this.getName() + " Flies upward, altitude : " +
    // this.altitude);
    // System.out.flush();
    // return altitude;
    // }

    // /**
    // * Implémentation de la méthode ascend 2
    // *
    // * @param a prend un nombre de type int
    // * @return un nombre de type int
    // */
    // @Override
    // public double ascend(double a) {
    // System.out.println(this.getName() + " flies upward, altitude : " + a);
    // System.out.flush();
    // return a;
    // }

    // /**
    // * Implémation de la méthode glide () planer
    // */
    // @Override
    // public void glide() {
    // System.out.println("Glides into the air.");
    // System.out.flush();
    // }

    // /**
    // * Implémentation de la première méthode descend
    // *
    // * @param c un nombre de type int
    // * @return un nombre de type int
    // */
    // @Override
    // public int descend(int c) {
    // System.out.println(this.getName() + " Flies downward, altitude : " + c);
    // System.out.flush();
    // return c;
    // }

    // /**
    // * Implémentation de la méthode land () : aterissage
    // */
    // @Override
    // public void land() {
    // System.out.println(this.getName() + " is too high, it can't land.");
    // System.out.flush();
    // }

    // /**
    // * Implémentation de la méthode descend 2
    // *
    // * @param c paramètre un nombre de type int dans ce overload du premier
    // * descend donc un double
    // * @return un nombre de type int en overload du premier descend donc double
    // */
    // @Override
    // public double descend(double c) {
    // System.out.println(this.getName() + " flies downward, altitude : " + c);
    // System.out.flush();
    // return c;
    // }

    // /**
    // * Implémentation de la méthode land 2
    // *
    // * @param param en paramètre une chaine de caractère de type String
    // * @return ne retourne rien de particulier fait juste les traitements
    // * d'affichage
    // */
    // @Override
    // public void land(String param) {
    // System.out.println(this.getName() + " lands on the ground.");
    // System.out.flush();
    // }

    // -----------------------------------------------------------------------------------

    /**
     * Implémentation de la méthode takeOff ()
     */
    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky.");
        } else {
            System.out.println(this.getName() + " is already flying.");
        }
        System.out.flush();
    }

    /**
     * Méthode ascend premier
     * 
     * @param altitude prend un nombre de type int en paramètre qui a
     * @return un nombre de type int
     */
    @Override
    public int ascend(int altitude) {
        if (this.flying) {
            this.altitude += altitude;
            System.out.println(this.getName() + " flies upward, altitude: " + this.altitude);
        } else {
            System.out.println(this.getName() + " can't ascend, it's not flying.");
        }
        System.out.flush();
        return this.altitude;
    }

    /**
     * Implémentation de la méthode ascend 2
     * 
     * @param altitude prend un nombre de type double
     * @return un nombre de type double
     */
    @Override
    public double ascend(double altitude) {
        if (this.flying) {
            this.altitude += altitude;
            System.out.println(this.getName() + " flies upward, altitude: " + this.altitude);
        } else {
            System.out.println(this.getName() + " can't ascend, it's not flying.");
        }
        System.out.flush();
        return this.altitude;
    }

    /**
     * Implémation de la méthode glide () planer
     */
    @Override
    public void glide() {
        if (this.flying) {
            System.out.println(this.getName() + " glides into the air.");
        } else {
            System.out.println(this.getName() + " can't glide, it's not flying.");
        }
        System.out.flush();
    }

    /**
     * Implémentation de la première méthode descend
     * 
     * @param altitude un nombre de type int
     * @return un nombre de type int
     */
    @Override
    public int descend(int altitude) {
        if (this.flying) {
            this.altitude -= altitude;
            if (this.altitude < 0) {
                this.altitude = 0;
            }
            System.out.println(this.getName() + " flies downward, altitude: " + this.altitude);
        } else {
            System.out.println(this.getName() + " can't descend, it's not flying.");
        }
        System.out.flush();
        return this.altitude;
    }

    /**
     * Implémentation de la méthode land () : atterrissage
     */
    @Override
    public void land() {
        if (this.flying && this.altitude == 0) {
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground.");
        } else if (this.flying) {
            System.out.println(this.getName() + " is too high, it can't land.");
        } else {
            System.out.println(this.getName() + " is not flying.");
        }
        System.out.flush();
    }

    /**
     * Implémentation de la méthode descend 2
     * 
     * @param altitude paramètre un nombre de type double
     * @return un nombre de type double
     */
    @Override
    public double descend(double altitude) {
        if (this.flying) {
            this.altitude -= altitude;
            if (this.altitude < 0) {
                this.altitude = 0;
            }
            System.out.println(this.getName() + " flies downward, altitude: " + this.altitude);
        } else {
            System.out.println(this.getName() + " can't descend, it's not flying.");
        }
        System.out.flush();
        return this.altitude;
    }

    /**
     * Implémentation de la méthode land 2
     * 
     * @param param en paramètre une chaine de caractères de type String
     * @return ne retourne rien de particulier, fait juste les traitements
     *         d'affichage
     */
    @Override
    public void land(String param) {
        if (this.flying && this.altitude == 0) {
            this.flying = false;
            System.out.println(this.getName() + " lands on the ground with " + param + ".");
        } else if (this.flying) {
            System.out.println(this.getName() + " is too high, it can't land.");
        } else {
            System.out.println(this.getName() + " is not flying.");
        }
        System.out.flush();
    }
}
