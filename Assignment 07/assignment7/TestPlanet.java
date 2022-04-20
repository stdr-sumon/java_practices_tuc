package assignment7;

public class TestPlanet {
    private final double G_Const = 6.67300E-11;

    private double surfaceGravity(Planet plnt) {
         return plnt.getRelativeMass(G_Const) / plnt.getRadiusSqr();
    }

    private double surfaceWeight(double mass, Planet plnt) {
        return mass * surfaceGravity(plnt);
    }
    
    public static void main(String[] args) {
        TestPlanet tstPlnt = new TestPlanet();
        double tmpMass = (double) 175.00 / tstPlnt.surfaceGravity(Planet.EARTH);
        int i = 0;
        while (i < Planet.values().length) {
            System.out.println("Your weight on " + Planet.values()[i].name() + " is " + String.format("%f", tstPlnt.surfaceWeight(tmpMass, Planet.values()[i])));
            i++;
        }
    }
}