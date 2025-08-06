package org.example.equalsHashGenericsEnum;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class Entities {
    private String name;
    private UUID id;
    private Instant timestamp;

    Entities(String name)
    {
        this.name = name;
        this.id = UUID.randomUUID();
        this.timestamp = Instant.now();
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entities entities = (Entities) o;
        return Objects.equals(id, entities.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Entities{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", timestamp=" + timestamp +
                '}';
    }
}
