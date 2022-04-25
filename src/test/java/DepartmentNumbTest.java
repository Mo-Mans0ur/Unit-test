import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentNumbTest {


    @Test
    void isItDivisible() {
        DepartmentNumb departmentNumb = new DepartmentNumb();
        assertTrue(departmentNumb.numberOfDepartments(20));
    }
}