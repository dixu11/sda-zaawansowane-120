package obiektowe.reflection;

import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Person person = new Person("Marcin", 20);

        //Korzystanie z refleksji zaczyna się od zdobycie obiektu Class

        //1. z wykorzystaniem typu
        Class class1= Person.class;
        //2. z wykorzystaniem obiektu
        Class class2 = person.getClass();
        //3. z wykorzystaniem pełnej nazwy klasy
        Class class3 = Class.forName("obiektowe.reflection.Person");
        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class3);

        System.out.println(class1.getName());
       Method[] methods= class1.getMethods();
        int gettersCount = 0;
        for (Method method : methods) {
            System.out.println(method);
            if (method.getName().contains("get")) {
                gettersCount++;
            }
        }
        System.out.println("Ilość geterów: "+ gettersCount);

        System.out.println();
       int modifierCode =  class1.getModifiers();
        System.out.println(Modifier.isPublic(modifierCode));
        System.out.println(modifierCode);
        System.out.println(Modifier.toString(modifierCode));

        Method method1 = class1.getMethod("sayHello");
        System.out.println(method1);
        System.out.println(method1.getReturnType());
        //person.sayHello();
        method1.invoke(person);

        Method method2 = class2.getMethod("sayHelloWithTitle", String.class);
        System.out.println(method2);
        //person.sayHelloWithTitle("pan");
        method2.invoke(person,"pan");

        Constructor constructor = class1.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //Person person = new Person("Ada",30);
        Person person2 = (Person) constructor.newInstance("Ada", 30);
        System.out.println(person2);

//        Field field = class1.getField("name"); // nie da prywatnych
        Field field = class1.getDeclaredField("name"); // da wszystkie nawet niewidoczne z tego miesjca
        field.setAccessible(true); //pozwala odczytać nawet prywatne pole
        System.out.println(field.getName());
        System.out.println(field.get(person2));
        field.set(person2, "Adam");
        System.out.println(person2);
    }
}

