import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class League implements Iterable<Player> {
    private List<Player> players;

    public League() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void sortByRanking() {
        players.sort(null); // Uses Comparable's compareTo method
    }

    public void sortByAge() {
        players.sort(new AgeComparator());
    }

    public void sortByName() {
        players.sort(new NameComparator());
    }

    // Iterator: allows looping over players
    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }
}
