package BuilderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof MedicalStudentConcreteCls) {
            return studentBuilder.setAddress("xyz").setAdharno("56859ABV")
                    .setAge(15).setDob(11 - 12 - 1993).setId(151565).setPercentage(65).build();

        } else if (studentBuilder instanceof EngineeringStudentConcreteCls) {
            return studentBuilder.setAddress("xyz").setAdharno("56859ABV")
                    .setAge(15).setDob(11 - 12 - 2000).setId(151565).setPercentage(65).build();
        } else {
            return null;
        }
    }
}
