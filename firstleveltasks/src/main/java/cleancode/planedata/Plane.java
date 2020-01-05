package cleancode.planedata;

import java.util.Objects;

public abstract class Plane {
    private String planeModel;
    private int planeMaxSpeed;
    private int planeMaxFlightDistance;
    private int planeMaxLoadCapacity;

    Plane(String model, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity) {
        this.planeModel = model;
        this.planeMaxSpeed = planeMaxSpeed;
        this.planeMaxFlightDistance = planeMaxFlightDistance;
        this.planeMaxLoadCapacity = planeMaxLoadCapacity;
    }

    String getModel() {
        return planeModel;
    }

    public int getPlaneMaxSpeed() {
        return planeMaxSpeed;
    }

    public int getPlaneMaxFlightDistance() {
        return planeMaxFlightDistance;
    }

    public int getPlaneMaxLoadCapacity() {
        return planeMaxLoadCapacity;
    }

    @Override
    public String toString() {
        return "\n Plane{" +
                "\t model= " + planeModel + "," +
                "\t maxSpeed= " + planeMaxSpeed + "," +
                "\t maxFlightDistance= " + planeMaxFlightDistance + "," +
                "\t maxLoadCapacity= " + planeMaxLoadCapacity +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return planeMaxSpeed == plane.planeMaxSpeed &&
                planeMaxFlightDistance == plane.planeMaxFlightDistance &&
                planeMaxLoadCapacity == plane.planeMaxLoadCapacity &&
                Objects.equals(planeModel, plane.planeModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeModel, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
    }
}