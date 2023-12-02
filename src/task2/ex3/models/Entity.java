package task2.ex3.models;


import task2.ex3.Column;

import java.util.UUID;

@task2.ex3.Entity
public class Entity {

    @Column(name = "id", primaryKey = true)
    private UUID id;

}
