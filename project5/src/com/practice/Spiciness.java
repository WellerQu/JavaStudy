package com.practice;

public enum Spiciness {
    NOT(2), MILD, MEDIUM, HOT, FLAMING;

    private Integer value;

    Spiciness(Integer value) {
        this.value = value;
    }

    Spiciness() {

    }

    public Integer getValue() {
        return this.value;
    }
}

