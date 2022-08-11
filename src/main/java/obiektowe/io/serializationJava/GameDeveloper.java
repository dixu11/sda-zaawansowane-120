package obiektowe.io.serializationJava;

import java.io.Serializable;

public class GameDeveloper implements Serializable {
    private String name;
    private String rank;

    public GameDeveloper(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "GameDeveloper{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
