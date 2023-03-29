package spring.march22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import spring.march22.pojo.Person;
import spring.march22.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        /*Student student1 = new Student();
        
       student1.setName("SDY");
       student1.setRollNo(1);
       
       System.out.println(student1);*/
        
        System.out.println("===================== Demo of First Spring Project =======================");
        
        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
        Person person = (Person) ctx.getBean("p_Id1");
        
        ((FileSystemXmlApplicationContext)ctx).close();
        
        System.out.println(person);
        
        System.out.println("===================== Demo of Dependency Injection =======================");
        
        ApplicationContext appCtx2 = new ClassPathXmlApplicationContext("student_beans.xml");
        Student student = (Student) appCtx2.getBean("std1");
        
        System.out.println(student);
        
        ((ClassPathXmlApplicationContext)appCtx2).close();
       
       
       
    }
}
