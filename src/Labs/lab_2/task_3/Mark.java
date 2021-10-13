package Labs.lab_2.task_3;

import java.util.List;
import java.util.Objects;

public class Mark {
    private int mark;


    public Mark(final int mark){
        this.mark = mark;
    }

    public int getMark() {

        return mark;
    }

    public void setMark(final int mark) {

        if(mark > 1 && mark <5) this.mark = mark;
        else
            System.out.println("Invalid age");
    }
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        {
            if (o == null || getClass() != o.getClass()) return false;
            final Mark g = (Mark) o;
            return mark == g.mark;
        }
    }

    @Override
    public int hashCode() {
        return 17 * this.getMark();
    }

    @Override
    public String toString() {
        return "Mark is " + mark ;
    }
}
