package level03.exercice01.model;

/**
 * PROGRAM: Viewer
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class Person {

    private String name;

public Person(String name) {

    setName(name);

}

private void setName(String name) {
    if (name.isBlank()) {
        throw new IllegalArgumentException("An empty string can not be assigned to name.");
    } else
        this.name = name;
}

public String getName() {

    return name;
}

}
