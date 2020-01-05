package cleancode;

import cleancode.planeaction.*;
import cleancode.planedata.*;


public class Runner {

    public static void main(String[] args) {
        Planes planes = new Planes(PlanesData.planes);
        Planes militaryPlanes = new Planes(planes.getMilitaryPlanes());
        Planes passengerPlanes = new Planes(planes.getPassengerPlanes());

        militaryPlanes.sortByMaxDistance().print("Military planes sorted by max distance:");
        passengerPlanes.sortByMaxSpeed().print("Passenger planes sorted by max speed:");
        System.out.println("\nPassenger plane with max capacity: " + passengerPlanes.getPassengerPlaneWithMaxCapacity());

    }
}
