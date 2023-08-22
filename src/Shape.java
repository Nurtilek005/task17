
    public abstract class    Shape {
        private double perimeter;

        public Shape(double perimeter) {
            this.perimeter = perimeter;
        }

        public void setPerimeter(double perimeter) {
            this.perimeter = perimeter;
        }
        public abstract double getPerimeter();

        @Override
        public String toString() {
            return "Class\n" +
                    "perimetr:" + perimeter;
        }
    }


