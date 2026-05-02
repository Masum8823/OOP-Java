class Team {
    String name;
    int score;
    static int totalMatches = 0;

    void setData(String n, int s) {
        name = n;
        score = s;
        totalMatches++;
    }

    void addRuns(int r) {
        score += r;
    }

    void display() {
        System.out.println(name + " " + score);
    }
}

public class CricketGame {
    public static void main(String[] args) {

        Team t1 = new Team();
        Team t2 = new Team();
        Team t3 = new Team();
        Team t4 = new Team();

        t1.setData("India", 100);
        t2.setData("Australia", 120);
        t3.setData("England", 150);
        t4.setData("Pakistan", 130);

        t4 = t1;
        t1 = t2;
        t3 = t1;

        t2.addRuns(30);
        t4.addRuns(25);

        t1.display();
        t2.display();
        t3.display();
        t4.display();

        System.out.println(Team.totalMatches);

        t2 = t4;

        t3.addRuns(20);
        t2.addRuns(10);

        t1.display();
        t2.display();
        t3.display();
        t4.display();

        System.out.println(t1 == t3);
    }
}