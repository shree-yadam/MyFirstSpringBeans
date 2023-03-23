package spring.march22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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
        
        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
        Student student2 = ctx.getBean("student2", Student.class);
        
        ((FileSystemXmlApplicationContext)ctx).close();
        
        System.out.println(student2);
       
       
       
    }
}
