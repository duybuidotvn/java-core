package io.duybuivn.je3.item2;

public class Calzone extends Pizza {
    private final boolean saurceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean saurceInside = false; // default

        public Builder saurceInside() {
            saurceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() { return this;}
    }
    private Calzone(Builder builder) {
        super(builder);
        saurceInside = builder.saurceInside;
    }
}
