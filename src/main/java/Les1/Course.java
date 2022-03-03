package Les1;

/*3. Добавить класс Course (полоса препятствий), в котором будут находиться:
массив препятствий;
метод, который будет просить команду пройти всю полосу.*/
public class Course extends Team {
    public Course(String teamname) {
        super(teamname);
        this.running = running;
    }

    int running;
    Player Boris = new Player("Boris", 3, 60);
    Player Olga = new Player("Olga", 3, 100);
    Player Max = new Player("Max", 3, 60);
    Player Lena = new Player("Lena", 3, 65);
    public static void Rules(){
        System.out.println("If you can run 3 metres about 60 sec, you win!");
    }

    public static void LetsGo(String Player) {
        if (time < 65) {
            System.out.println(Player + " lost the game");
        } else System.out.println(Player + " wined the game");
    }
}
