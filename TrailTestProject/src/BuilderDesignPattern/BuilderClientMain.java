package BuilderDesignPattern;

public class BuilderClientMain {

    /**
     * builder have 3 layers
     * 1 layer is creating builder for object with setters name and one method which will set the original object
     * 2 layer will have the builder object and sets an original object
     *
     * 3 layer director layer which will have the builder object and decide how to call the methods step by step
     */

    public static void main(String arg[]){

        /**
         * this can be basic way to call or we can also use the director
        * */
        Director d=new Director(new EngineeringStudentConcreteCls());//important line to understand
        Director d1=new Director(new MedicalStudentConcreteCls());//important line to understand
       Student s= d.createStudent();
        System.out.println(s.toString());

        System.out.println( "Medical "+d1.createStudent());

    }
}

