package snake.model;

public class Player {

    private String name;
    private int score;
    private static Player instance;

    public static Player getInstance(){
        return Player.instance;
    }

    public static Player create(String name){
        if(Player.instance == null){
            Player.instance = new Player(name);
        }
        return Player.getInstance();
    }

    private Player(String name){
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        if (score >0){
            this.score = score;
        }

    }
}
