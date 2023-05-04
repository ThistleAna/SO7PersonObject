public class Main {
    public static void main(String[] args) {

        // object Person01
        Person Person01 = new Person("James Peterson", 34, 180, 73.5);

        System.out.println("==========================================");
        System.out.println("Name = " + Person01.getName());
        System.out.println("Age = " + Person01.getAge());
        System.out.println("Height = " + Person01.getHeight() + " cm");
        System.out.println("Weight = " + Person01.getWeight() + " lbs");
        System.out.println("==========================================");
        // object Person02 Bob Thornley, 25, 171cm, 68.2lbs and print
        Person Person02 = new Person("Bob Thornley", 25, 171, 68.2);

        System.out.println("==========================================");
        System.out.println("Name = " + Person02.getName());
        System.out.println("Age = " + Person02.getAge());
        System.out.println("Height = " + Person02.getHeight() + " cm");
        System.out.println("Weight = " + Person02.getWeight() + " lbs");
        System.out.println("==========================================");

        System.out.println("After a year, their profile is ");
        // Person01 grow older
        Person01.growOlder();
        System.out.println("==========================================");
        System.out.println("Name = " + Person01.getName());
        System.out.println("Age = " + Person01.getAge());
        System.out.println("Height = " + Person01.getHeight() + " cm");
        System.out.println("Weight = " + Person01.getWeight() + " lbs");
        System.out.println("==========================================");
    }
}
