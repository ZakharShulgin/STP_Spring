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
    @Column String name;
    @Column int games;
    @Column int win;
    @Column int draw;
    @Column int lose;
    @Column int balls;
    @Column int points;

    @Column(name = "click_count")
    @ColumnDefault("0")
    int clickCount;
}
