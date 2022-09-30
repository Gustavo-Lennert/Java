package java_projects.entities;

public class Triangle {
        public double a;
        public double b;
        public double c;

        public double area() {
                double t = (a + b + c) /2;
                return Math.sqrt(t * (t-a) * (t-b) * (t-c));
        }
}
