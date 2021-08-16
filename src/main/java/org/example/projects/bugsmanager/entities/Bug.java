package org.example.projects.bugsmanager.entities;

import java.util.Objects;

public class Bug {

    private String name;
    private String notes;

    public Bug(String name, String notes) {
        this.name = name;
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return name.equals(bug.name) &&
                notes.equals(bug.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, notes);
    }
}
