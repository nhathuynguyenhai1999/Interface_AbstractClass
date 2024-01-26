package Interface.AbstractClass;
import Main.Square;
import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square square1, Square square2) {
        // So sánh chiều dài cạnh của các hình vuông
        return Double.compare(square1.getSide(), square2.getSide());
    }
}
