package com.example.game.Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Special {

    private String name;
    private Double valueSpecial;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Special special = (Special) o;
        return Objects.equals(name, special.name) && Objects.equals(valueSpecial, special.valueSpecial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, valueSpecial);
    }
}
