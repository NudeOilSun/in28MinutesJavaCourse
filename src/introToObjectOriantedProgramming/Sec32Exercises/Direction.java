package introToObjectOriantedProgramming.Sec32Exercises;

public enum Direction {
    NORTH("North"),
    SOUTH("South"),
    EAST("East"),
    WEST("West");

    private String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Direction left() {
        // You are to implement the logic that correctly gets the Direction on the "left"
        // If we represent the directions in a circular format going clockwise
        // then the direction to the "left" of NORTH is WEST, of WEST is SOUTH, of SOUTH is EAST, and of EAST is NORTH
        switch (this) {
            case Direction.EAST -> {
                return Direction.NORTH;
            }
            case Direction.SOUTH -> {
                return Direction.EAST;
            }
            case Direction.WEST -> {
                return Direction.SOUTH;
            }
            case Direction.NORTH -> {
                return Direction.WEST;
            }
        }
        return this;
    }

    public Direction right() {
        // Similarly, you are to implement the logic that correctly gets the Direction on the "right"
        // If we represent the directions in a circular format going clockwise
        // then the direction to the "right" of NORTH is EAST, of EAST is SOUTH, of SOUTH is WEST, and of WEST is NORTH
        switch (this) {
            case Direction.EAST -> {
                return Direction.SOUTH;
            }
            case Direction.SOUTH -> {
                return Direction.WEST;
            }
            case Direction.WEST -> {
                return Direction.NORTH;
            }
            case Direction.NORTH -> {
                return Direction.EAST;
            }        }
        return this;
    }
}
