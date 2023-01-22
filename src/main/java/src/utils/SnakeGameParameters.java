package src.utils;

public class SnakeGameParameters {
    public static final int MAX_WIDTH = 100;
    public static final int MIN_WIDTH = 10;
    public static final int MAX_HEIGHT = 100;
    public static final int MIN_HEIGHT = 10;

    // Game parameters
    public String name;
    public int width;
    public int height;

    // Player parameters
    public SnakeRole role;

    // Model parameters
    public int delay;
    public int foodStatic;

    // Net parameters
    public int announcePeriod;

    public SnakeGameParameters(String name, int width, int height, int delay, int foodStatic) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.delay = delay;
        this.foodStatic = foodStatic;
    }

    public SnakeGameParameters(SnakeGameParameters other) {
        this.name = other.name;
        this.width = other.width;
        this.height = other.height;
        this.delay = other.delay;
        this.role = other.role;
        this.foodStatic = other.foodStatic;
        this.announcePeriod = other.announcePeriod;
    }

}
