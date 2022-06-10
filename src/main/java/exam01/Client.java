package exam01;

public class Client {

    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.addChildren(new File());
        directory.addChildren(new Directory());

        Directory directory1 = new Directory();
        directory1.addChildren(directory);

    }
}
