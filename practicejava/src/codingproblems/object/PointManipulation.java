package codingproblems.object;

// Below is an example of an immutable class in Java representing a 2D point

public class PointManipulation {

   // defines an immutable class in Java called ImmutablePoint. A record is a data class that is immutable by default,
   // so you don't need to add any modifiers to make it immutable.
    private record ImmutablePoint(int x, int y) {

        public ImmutablePoint translate(int dx, int dy) {
                return new ImmutablePoint(this.x + dx, this.y + dy);
            }

            @Override
            public String toString() {
                return STR."(\{x}, \{y})";
            }
        }

    public static void main(String[] args) {
        ImmutablePoint point1 = new ImmutablePoint(3, 4);
        ImmutablePoint point2 = new ImmutablePoint(7, 9);

        // Display the original points
        System.out.println(STR."Point 1: \{point1}");
        System.out.println(STR."Point 2: \{point2}");

        // Translate point 1 by (2, 3)
        ImmutablePoint translatedPoint = point1.translate(2, 3);
        System.out.println(STR."Translated Point 1: \{translatedPoint}");

        // Demonstrate immutability of point 1
        System.out.println(STR."Original Point 1 after translation: \{point1}");
    }
}
