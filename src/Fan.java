public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String coler = "blue";

    public int getSpeed() {
        return this.speed;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean getOn() {
        return this.on;
    }

    public String getColer() {
        return this.coler;
    }

    public void setterAll(int speed, double radius, String coler) {
        this.speed = speed;
        this.radius = radius;
        this.coler = coler;
    }

    public void setOn() {
        this.on = !this.on;
    }

    public Fan() {
    }

        @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", coler='" + coler + '\'' +
                    ",Fan is on"+
                    '}';
        } else {
            return "Fan{"+
                    "radius="+radius+
                    ",coler ="+coler+
                    ",Fan is off"+
                    "}";
        }
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("Fan1");
        fan.setOn();
        fan.setterAll(fan.FAST, 10, "yellow");
        System.out.println("Fan2");
        Fan fan2 = new Fan();
        fan2.setterAll(fan2.SLOW, 5, "blue");
        System.out.println(fan);
        System.out.println(fan2);
    }
}
