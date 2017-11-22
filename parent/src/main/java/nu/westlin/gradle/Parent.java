package nu.westlin.gradle;

@CustomAnnotation
public abstract class Parent {

    protected final String name;

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override public String toString() {
        return "Parent{" +
            "name='" + name + '\'' +
            '}';
    }
}
