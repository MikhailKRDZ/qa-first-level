package cleancode.planedata;

import java.util.Objects;

public class MilitaryPlane extends Plane {

    private MilitaryPlaneType militaryPlaneType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryPlaneType militaryPlaneType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryPlaneType = militaryPlaneType;
    }

    public MilitaryPlaneType getMilitaryType() {
        return militaryPlaneType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", militaryType= " + militaryPlaneType +
                        '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return militaryPlaneType == that.militaryPlaneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryPlaneType);
    }
}