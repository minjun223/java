package chap07;

interface Wearable {
    void putOn();
    void putOff();
}

interface Skinnable {
    int BLACK = 0;
    int RED = 1;
    int GREEN = 2;
    int BLUE = 3;
    int YELLOW = 4;

    public void ChangeSkin(int skin);
}


class HeadMountedDisplay implements Wearable, Skinnable {
    private int skin;

    @Override
    public void putOn() {
        System.out.println("디스플레이를 착용했습니다.");
    }

    @Override
    public void putOff() {
        System.out.println("디스플레이를 벗었습니다.");
    }

    public void ChangeSkin(int skin) {
        this.skin = skin;
    }

    public void putSkin() {
        switch (skin) {
            case BLACK:
                System.out.println("BLACK DISPLAY"); break;
            case RED:
                System.out.println("RED DISPLAY"); break;
            case GREEN:
                System.out.println("GREEN DISPLAY"); break;
            case BLUE:
                System.out.println("BLUE DISPLAY"); break;
            case YELLOW:
                System.out.println("YELLOW DISPLAY"); break;
        }
    }
}

public class Suncheahoon {
    public static void main(String[] args) {
        HeadMountedDisplay h = new HeadMountedDisplay();
        h.putOn();
        h.putOff();
        h.ChangeSkin(Skinnable.YELLOW);
        h.putSkin();

        Wearable w = h;
        w.putOn();
        w.putOff();

        Skinnable s = h;
        s.ChangeSkin(Skinnable.BLACK);

        h.putSkin();
    }
}
