package Les1;
/*2. Добавить класс Team, который будет содержать:
название команды;
массив из четырех участников — в конструкторе можно сразу всех участников указывать);
метод для вывода информации о членах команды, прошедших дистанцию;
метод вывода информации обо всех членах команды.*/
public class Team extends Player {
    String teamname;

    public Team(String teamname) {
        super(name, run, time);
        this.teamname = teamname;
    }
    public static void Playername(String name, int run, int time) {
        System.out.println("My name is " + name + ". I can run " + run + " metres about " + time + " sec.");
    }

    public static void Teamname(String teamname) {
        System.out.println("And together we are a " + teamname);
    }



}