package Les1;

public class main {
    public static void main(String[] args) {
        Team team = new Team("Gregory Team");
        Team.Playername("Boris", 3, 50);
        Team.Playername("Olga", 3, 100);
        Team.Playername("Max", 3, 60);
        Team.Playername("Lena", 3, 65);
        Team.Teamname("Gregory Team");
        Course Experience = new Course("Gregory Team");
        System.out.println("*********************");
        Course.Rules();
        Course.LetsGo("Boris");
        Course.LetsGo("Olga");
        Course.LetsGo("Max");
        Course.LetsGo("Lena");

    }
}
