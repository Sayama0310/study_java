import java.util.List;

import javax.swing.undo.StateEdit;

public class combination {
    public static void main(String[] args) {
        String[] list = { "A", "B", "C", "D", "E", "F" };
        combination2(list);
    }

    private static void combination2(String[] list) {
        int length = list.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                System.out.println(String.format("{%s, %s}", list[i], list[j]));
            }
        }
    }
}
