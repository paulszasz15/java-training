package code._4_student_effort.hardchallenge_1_decorations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChristmasTree implements DecorableTree {
    private final List<List<String>> tree;
    private final int  size;

    public ChristmasTree() {
        this.size = 10;
        this.tree = getTree();
    }

    public List<List<String>> getTree(){
        List<List<String>> tree = new ArrayList<>();
        List<String> row;

        for (int i = 0; i < size; i++){
            row = new ArrayList<>();

            for (int j = 0 ; j < size * 2; j++){

                if (j == (size - i)) {
                    row.add("<");
                }
                if (j == (size + i)) {
                    row.add(">");
                }
                row.add(" ");
            }

            tree.add(Collections.unmodifiableList(row));
        }

        for (int i = 0; i < 3; i++){
            row = new ArrayList<>();
            for (int j = 0; j < size * 2; j++){
                if (j == size - 2){
                    row.add("|");
                }
                if ( j == size + 2){
                    row.add("|");
                }
                row.add(" ");
            }
            tree.add(Collections.unmodifiableList(row));
        }
        return Collections.unmodifiableList(tree);
    }

    public void display() {
        for (List<String> strings : tree) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
