package codetalksdna.enums;

public enum MyBestFood {
    BIRYANI(100), FRIED_RICE(90), MANCHURIAN(80), MOMOS(70), PANEER_BUTTER_MASALA(60);

    final int levelOfDeliciousness;

    MyBestFood(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
