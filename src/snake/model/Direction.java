package snake.model;

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    public static boolean isOpposite(Direction target, Direction another){
        if ((target == UP && another == DOWN) || (target == DOWN && another == UP)){
            return true;
        }
        else if ((target == LEFT && another == RIGHT) || (target == RIGHT && another == LEFT)){
            return true;
        }
        return false;
    }
}
