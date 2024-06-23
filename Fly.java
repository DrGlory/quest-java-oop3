public interface Fly {
    // 1- Méthode takeOff : voler
    void takeOff();

    // 2 - Méthode ascend : monter / altitude
    int ascend(int altitude);

    // 3 - Méthode ascend 2 : monter / altitude
    double ascend(double altitude);

    // 4 - Méthode glide : planer
    void glide();

    // 5 - Méthode descend : descente
    int descend(int altitude);

    // 6 - Méthode land : atterissage
    void land();

    // 7 - Méthode descend 2 : descente 2
    double descend(double altitude);

    // 8 - Méthode land : atterissage 2
    void land(String param);
}
