package io.duybuivn.je3.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// Builder Pattern for class hierarchies
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAURCE}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract Pizza build();

        //sub-classes must override this method to return "This"
        protected abstract T self();
    }

    public Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
