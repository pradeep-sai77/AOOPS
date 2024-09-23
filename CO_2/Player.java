import java.util.Objects;

class Player implements Comparable<Player>, Cloneable {
    private String name;
    private int age;
    private int ranking;

    public Player(String name, int age, int ranking) {
        this.name = name;
        this.age = age;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRanking() {
        return ranking;
    }

    // Comparable: compare players by ranking (default sorting)
    @Override
    public int compareTo(Player other) {
        return Integer.compare(this.ranking, other.ranking);
    }

    // Cloneable: create a copy of Player object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ranking=" + ranking +
                '}';
    }
}
