public interface Fly {
    // 1- Méthode takeOff : voler
    public void takeOff();

    // 2 - Méthode ascend : monter / altitude
    public int ascend(int a);

    // 3 - Méthode ascend 2 : monter / altitude
    public double ascend(double a);

    // 4 - Méthode glide : planer
    public void glide();

    // 5 - Méthode descend : descente
    public int descend(int c);

    // 6 - Méthode land : atterissage
    public void land();

    // 7 - Méthode descend 2 : descente 2
    public double descend(double c);

    // 8 - Méthode land : atterissage 2
    public void land(String param);
}
