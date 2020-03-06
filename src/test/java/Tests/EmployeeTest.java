package Tests;

import ie.gmit.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    Employee myEmployee;
    EmployeeTest myList;

    @BeforeEach
    void setup()
    {
        myEmployee = new Employee("Mr","John Burke", "8761477E", 1234567,"Full-Time",19);
        myList = new EmployeeTest();
    }

  /*  @Test
    void testFindByNameEmployee()
    {
        myList.addEmployee(myEmployee);
        assertEquals(1, myEmployee, myList.FindByName("John Burke"));
    }

   */



    @Test
    void testConstructorNoTitle()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("", "John Burke", "8761477E", 1234567,"Full-Time",19));
    }

    @Test
    void testConstructorNoName()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "", "8761477E", 1234567,"Full-Time",19));
    }

    @Test
    void testConstructorNoPPS()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "John Burke", "", 1234567,"Full-Time",19));
    }

    @Test
    void testConstructorWrongPhoneNumber()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "John Burke", "8761477E",1234567890 ,"Full-Time",19));
    }

    @Test
    void testConstructorNoemploymentType()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "John Burke", "8761477E", 1234567,"",19));
    }

    @Test
    void testConstructorWrongAge()
    {
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr", "John Burke", "8761477E", 1234567,"Full-Time",17));
    }

}
