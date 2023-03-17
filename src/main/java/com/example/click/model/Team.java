package com.example.click.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;

@Entity(name = "teams")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
public class Team {
    @Id
    @Column(name = "team_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long teamId;

    @Column
    String name;

    @Column
    @ColumnDefault("0")
    int games;

    @Column
    @ColumnDefault("0")
    int win;

    @Column
    @ColumnDefault("0")
    int draw;


    @Column
    @ColumnDefault("0")
    int lose;

    @Column
    @ColumnDefault("0")
    int balls;

    @ColumnDefault("0")
    @Column
    int points;
}
