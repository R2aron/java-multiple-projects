package org.example.equalsHashGenericsEnum;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution",5),
    GREEN("GO",45);

    private final String message;
    private final  int time;

    LightColor(String message, int time) {
        this.message = message;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "LightColor{" +
                "message='" + message + '\'' +
                ", time=" + time +
                '}';
    }
}
