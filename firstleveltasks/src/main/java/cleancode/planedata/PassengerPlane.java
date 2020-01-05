package cleancode.planedata;

import java.util.Objects;

public class PassengerPlane extends Plane {

    private int passengerPlaneCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengerPlaneCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengerPlaneCapacity = passengerPlaneCapacity;
    }

    public int getPassengerPlaneCapacity() {
        return passengerPlaneCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity= " + passengerPlaneCapacity +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return passengerPlaneCapacity == that.passengerPlaneCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerPlaneCapacity);
    }
}
