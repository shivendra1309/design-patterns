package creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StudentsTest {

    @Test
    public void testStudent(){
        Students students = new Students();
        students.loadNames();

        Students students1 = students.clone();
        Students students2 = students.clone();
        assertNotEquals(students1,students2);
       System.out.println("student = " + students.getStuNameList() + " hashcode = "+ students.hashCode());
        System.out.println("students1 = " + students1.getStuNameList()+ " hashcode = "+ students1.hashCode());
        System.out.println("students2 = " + students2.getStuNameList()+ " hashcode = "+ students2.hashCode());

    }

}
