package src.utils;

import src.game.model.SnakeCharacter;

import java.util.HashMap;
import java.util.Vector;

public class SnakeGameState {

    HashMap<Integer, SnakeCharacter> snakes;
    Vector<Point> foods;
    int stateOrder;

    public SnakeGameState(HashMap<Integer, SnakeCharacter> snakes, Vector<Point> foods, int stateNumber) {
        this.snakes = snakes;
        this.foods = foods;
        this.stateOrder = stateNumber;
    }

    public HashMap<Integer, SnakeCharacter> getSnakes() {
        return snakes;
    }

    public Vector<Point> getFoods() {
        return foods;
    }

    public int getOrder() {
        return stateOrder;
    }
}
