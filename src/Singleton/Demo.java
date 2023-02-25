package Singleton;

public class Demo{
    public static void main(String[] args) {
        System.out.println("You will see same value, even when 2 instances are created." + "\n" +
                "Since, instance was already created the 1st time. Same is returned when called from 2nd time." + "\n\n" +
                "RESULT:" + "\n");
        Singleton instance1 = Singleton.getInstance("DB1");
        Singleton instance2 = Singleton.getInstance("DB2");
        System.out.println(instance1.value);
        System.out.println(instance2.value);
        
      
    }
}