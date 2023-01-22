package src.utils;

import java.util.Random;

public enum SnakeDirection {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    public static SnakeDirection randomDirection()  {
        return SnakeDirection.values()[new Random().nextInt(SnakeDirection.values().length)];
    }
}
