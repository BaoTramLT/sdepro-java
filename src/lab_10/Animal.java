package lab_10;

public class Animal {
    private String species;
    private boolean isFlying;
    private int speed;

    public String getSpecies() {
        return this.species;
    }

    public boolean isFlying() {
        return this.isFlying;
    }

    public int getSpeed() {
        return this.speed;
    }

    protected Animal (Builder builder) {
        this.species = builder.species;
        this.isFlying = builder.isFlying;;
        this.speed = builder.speed;
    }

    public static class Builder {
        private String species;
        private boolean isFlying;
        private int speed;

        protected Builder() {
        }

        public Builder setSpecies(String species) {
            this.species = species;
            return this;
        }

        public Builder setFlying(boolean flying) {
            isFlying = flying;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal" +
                "speices='" + species +'\''+
                ", speed=" + speed +
                ", isFlying=" + isFlying +
                '}';
    }
}
