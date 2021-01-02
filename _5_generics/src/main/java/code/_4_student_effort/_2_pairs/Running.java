package code._4_student_effort._2_pairs;

public class Running implements Shoe {
    String color;
    Integer size;

    public Running(String color, Integer size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getSize() {
        return size;
    }
}
