public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        League league = new League();

        // Adding Players
        Player p1 = new Player("John", 25, 5);
        Player p2 = new Player("Mike", 30, 2);
        Player p3 = new Player("Sarah", 22, 1);
        Player p4 = new Player("Zara", 28, 4);

        league.addPlayer(p1);
        league.addPlayer(p2);
        league.addPlayer(p3);
        league.addPlayer(p4);

        // Sorting by Ranking (using Comparable)
        System.out.println("Sorted by Ranking:");
        league.sortByRanking();
        for (Player p : league) {
            System.out.println(p);
        }

        // Sorting by Age (using Comparator)
        System.out.println("\nSorted by Age:");
        league.sortByAge();
        for (Player p : league) {
            System.out.println(p);
        }

        // Sorting by Name (using Comparator)
        System.out.println("\nSorted by Name:");
        league.sortByName();
        for (Player p : league) {
            System.out.println(p);
        }

        // Cloning a player
        Player clonedPlayer = (Player) p1.clone();
        System.out.println("\nCloned Player: " + clonedPlayer);
    }
}
