package exercises.technology;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("Alienware", 1500,true);
        System.out.println(computer.getBrandName() + " with " + computer.getStorageSizeInGigabytes() + " gigabytes of storage.");

    }

}
