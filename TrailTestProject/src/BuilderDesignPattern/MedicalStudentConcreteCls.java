package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MedicalStudentConcreteCls extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subject=new ArrayList<>();
        subject.add("abcd");
        subject.add("abcd45");
        subject.add("abcd111");
        subject.add("abcd123");
        this.Subjects=subject; //very important lines
        return this;
    }
}
