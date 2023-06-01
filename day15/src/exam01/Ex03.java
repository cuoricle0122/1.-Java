package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex03 {
    public static void main(String[] args) {
        Class cls1 = Student.class;
        // Student s1 = new Student();
        // Class cls2 = s1.getClass();

        Field[] fields = cls1.getFields(); // 멤버변수
        for (Field field : fields){
            System.out.println(field);
        }
        System.out.println("========================================================");

        Method[] methods = cls1.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }
        System.out.println("========================================================");

        Constructor[] constructors = cls1.getConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }
        System.out.println("========================================================");
    }
}
