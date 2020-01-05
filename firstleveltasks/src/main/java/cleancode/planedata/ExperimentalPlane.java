package cleancode.planedata;

import java.util.Objects;

public class ExperimentalPlane extends Plane {

    private ExperimentalPlaneTypes experimentalPlaneTypes;
    private ExperimentalPlaneSecretLevel experimentalPlaneSecretLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalPlaneTypes experimentalPlaneTypes, ExperimentalPlaneSecretLevel experimentalPlaneSecretLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalPlaneTypes = experimentalPlaneTypes;
        this.experimentalPlaneSecretLevel = experimentalPlaneSecretLevel;
    }

    public ExperimentalPlaneTypes getExperimentalPlaneTypes() {
        return experimentalPlaneTypes;
    }

    public void setExperimentalPlaneSecretLevel(ExperimentalPlaneSecretLevel experimentalPlaneSecretLevel) {
        this.experimentalPlaneSecretLevel = experimentalPlaneSecretLevel;
    }
    public ExperimentalPlaneSecretLevel getExperimentalPlaneSecretLevel() {
        return experimentalPlaneSecretLevel;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", experimentalType= " + experimentalPlaneTypes +
                        ", experimentalSecretLevel= " + experimentalPlaneSecretLevel + '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane that = (ExperimentalPlane) o;
        return experimentalPlaneTypes == that.experimentalPlaneTypes &&
                experimentalPlaneSecretLevel == that.experimentalPlaneSecretLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalPlaneTypes, experimentalPlaneTypes);
    }
}
