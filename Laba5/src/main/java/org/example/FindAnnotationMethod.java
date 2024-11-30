package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FindAnnotationMethod {
    public static void main(String[] args) {
       MyClass myClass = new MyClass();

       Method[] methods = myClass.getClass().getDeclaredMethods();
       Field[] fields = myClass.getClass().getDeclaredFields();

       for(Method method : methods){
           if(method.isAnnotationPresent(MyAnnotation.class)){
               MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
               System.out.println("Found method: " + method.getName() + ", with annotation value: " + annotation.value());

               try {
                   method.invoke(myClass);
               }
               catch (Exception e) {
                   e.printStackTrace();
               }
           }
       }
       for(Field field :fields){
           if(field.isAnnotationPresent(MyAnnotation.class)){
               MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);

               field.getAnnotation(MyAnnotation.class);
               System.out.println("Found field: " + field.getName() + ", with annotation value: " + annotation.value());

               try {
                   field.setAccessible(true);
                   field.set(myClass, "New Value");
                   System.out.println("Updated field value: " + field.get(myClass));
               }
               catch (Exception e) {
                   e.printStackTrace();
               }
           }
       }
    }
}
