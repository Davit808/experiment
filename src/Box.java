
import java.lang.Double;
import java.lang.Integer;
import java.util.ArrayList;
import java.io.Serializable;

public class Box<E> {
    private E input;

    private Box(E input) {
        this.input = input;
    }

    public <E extends Number> E getInput() {
        return (E) input;
    }

    public static int sum(Box box1, Box box2) {
        int result = 0;
        switch (box1.getInput().getClass().getSimpleName()) {
            case "Byte", "Short", "Integer", "Long", "Float", "Double":
                switch (box2.getInput().getClass().getSimpleName()) {
                    case "Byte", "Short", "Integer", "Long", "Float", "Double":
                        result = box1.getInput().intValue() + box2.getInput().intValue();
                        break;
                }
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Box<Float> b1 = new Box<>(30f);
        Box<Double> b2 = new Box<>(30.25);
        int a = sum(b1, b2);
        System.out.println(a);
    }
}
