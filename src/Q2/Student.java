package Q2;

import java.util.Objects;

public record Student(int id, String name, String standard) {
    public Student{
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(standard);
    }
}
