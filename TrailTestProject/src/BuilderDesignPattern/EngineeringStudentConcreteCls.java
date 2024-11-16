package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentConcreteCls extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subject=new ArrayList<>();
        subject.add("cop");
        subject.add("alogorithms");
        subject.add("m3");
        subject.add("microprocessor");
        this.Subjects=subject; //very important lines
        return this;
    }
}
