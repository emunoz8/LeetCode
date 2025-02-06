import java.util.Arrays;

class Body {
    double mass;
    double[] position;

    public Body(double mass, double[] position) {
        this.mass = mass;
        this.position = position;
    }
}

class GravitySystem {
    private static final double G = 6.67430e-11; // Gravitational constant
    private Body[] bodies;

    public GravitySystem(Body[] bodies) {
        this.bodies = bodies;
    }

    public double[] computeCenterOfMass() {
        double totalMass = Arrays.stream(bodies).mapToDouble(b -> b.mass).sum();
        double[] centerOfMass = new double[3];

        for (Body b : bodies) {
            for (int i = 0; i < 3; i++) {
                centerOfMass[i] += b.mass * b.position[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            centerOfMass[i] /= totalMass;
        }
        return centerOfMass;
    }

    public double[] computeAccelerationOfCenterOfMass() {
        double totalMass = Arrays.stream(bodies).mapToDouble(b -> b.mass).sum();
        double[] accelerationCOM = new double[3];

        for (Body b : bodies) {
            double[] acceleration = computeAcceleration(b);
            for (int i = 0; i < 3; i++) {
                accelerationCOM[i] += b.mass * acceleration[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            accelerationCOM[i] /= totalMass;
        }
        return accelerationCOM;
    }

    private double[] computeAcceleration(Body body) {
        double[] acceleration = new double[3];

        for (Body other : bodies) {
            if (body != other) {
                double[] diff = new double[3];
                double distanceSquared = 0;

                for (int i = 0; i < 3; i++) {
                    diff[i] = other.position[i] - body.position[i];
                    distanceSquared += diff[i] * diff[i];
                }

                double distance = Math.sqrt(distanceSquared);
                double factor = (G * other.mass) / (distance * distanceSquared);

                for (int i = 0; i < 3; i++) {
                    acceleration[i] += factor * diff[i];
                }
            }
        }
        return acceleration;
    }
}

public class GravitySimulation {
    public static void main(String[] args) {
        // Define masses and positions of three objects
        Body[] bodies = {
                new Body(5.0, new double[] { 1, 2, 3 }),
                new Body(10.0, new double[] { 4, 5, 6 }),
                new Body(15.0, new double[] { 7, 8, 9 })
        };

        GravitySystem system = new GravitySystem(bodies);

        double[] centerOfMass = system.computeCenterOfMass();
        System.out.println("Center of Mass: " + Arrays.toString(centerOfMass));

        double[] accelerationCOM = system.computeAccelerationOfCenterOfMass();
        System.out.println("Acceleration of Center of Mass: " + Arrays.toString(accelerationCOM));
    }
}
