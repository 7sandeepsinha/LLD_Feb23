package com.scaler.SplitwiseMay2023.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "groups") // using this annotation we can give custom names to the tables, else table name will same as class name
public class Group extends BaseModel {
    private String name;
    @ManyToMany
    private List<User> participants; // One user can be in many groups, one group can have many users.
    @ManyToMany
    private List<User> admins; // One user can be admin in many groups, one group can have many users as admin
    private String description;
    @ManyToOne
    private User createdBy; // One user can create many groups, one group can be created by one user.
    @OneToMany
    private List<Expense> expenses; // One group can have many expenses, but one expense can only belong to one group.
}
