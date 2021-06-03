package crelle.test.java.lang.fake_enum;

enum Signal {
    GREEN, YELLOW, RED
}

public class TrafficLight {
    Signal color = Signal.RED;
    public void change() {
        System.out.println(color);
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
        }
        System.out.println(color);
    }

    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.change();
    }

}


