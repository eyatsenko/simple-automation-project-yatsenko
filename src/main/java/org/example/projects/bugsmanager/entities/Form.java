package org.example.projects.bugsmanager.entities;

import java.util.Objects;

public class Form {

    private String name;
    private String notes;

    public Form(String name, String notes) {
        this.name = name;
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Form form = (Form) o;
        return name.equals(form.name) &&
                notes.equals(form.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, notes);
    }
}
