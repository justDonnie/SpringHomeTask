package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
       // BusinessDepartment department = new BusinessDepartment();
       // System.out.println(department);


        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        HRDepartment hrDepartment = applicationContext.getBean("hrDepartment", HRDepartment.class);
        BusinessDepartment businessDepartment = applicationContext.getBean("businessDepartment", BusinessDepartment.class);
        ProjectDepartment projectDepartment = applicationContext.getBean("projectDepartment", ProjectDepartment.class);

//        System.out.println(projectDepartment);
//        System.out.println(businessDepartment);
//        System.out.println(hrDepartment.getName());
//        System.out.println(hrDepartment.getSurname());
//        System.out.println(hrDepartment);

        Department department = applicationContext.getBean("department", Department.class);
        System.out.println(department.getDepartmentService());
        System.out.println(department.getName());
        System.out.println(department.getDescription());
        applicationContext.close();
    }
}
