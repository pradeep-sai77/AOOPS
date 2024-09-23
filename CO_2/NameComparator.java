import java.util.Comparator;

// Comparator: compare players by name
class NameComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
