package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bgroig on 6/20/2017.
 */
@Entity
public class Category {

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Cheese> cheeses = new ArrayList<>();

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15, message = "Name is not correct length")
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
