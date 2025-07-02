package Q3;


import java.util.Objects;

public record Student(int id, String name, String standard) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student other)) return false;
        return id == other.id &&
                name.equals(other.name) &&
                standard.equals(other.standard);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name,standard);
    }
}
