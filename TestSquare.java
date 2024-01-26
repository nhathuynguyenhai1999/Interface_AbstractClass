package Interface.AbstractClass;
import Main.Square;
import java.util.Arrays;

public class TestSquare {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        Square square2 = new Square(3);

        // Mảng các hình vuông
        Square[] squares = {square1, square2};

        // Sử dụng Comparator và generics để sắp xếp danh sách các hình vuông theo chiều dài cạnh
        Arrays.sort(squares);

        // In danh sách đã sắp xếp
        System.out.println("Sorted Squares:");
        for (Square square : squares) {
            System.out.println("Side: " + square.getSide());
        }

        // Sử dụng interface Colorable để in cách tô màu của từng hình vuông
        System.out.println("\nColoring Instructions:");
        for (Square square : squares) {
            square.howToColor();
        }
    }
}

