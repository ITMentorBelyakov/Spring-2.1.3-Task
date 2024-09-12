package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String name;

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
