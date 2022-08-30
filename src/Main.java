public class Main {

    public static void main(String[] args) throws Exception {

        MagicBox<String> magicBox = new MagicBox(6);
        System.out.println("Демонстрация со стрингом:");
        magicBox.add("a");
        magicBox.add("b");
        magicBox.add("c");
        magicBox.add("d");
        magicBox.add("f");
        magicBox.add("g");
        System.out.println(magicBox.pick());

        MagicBox<Integer> magicBox1 = new MagicBox<>(3);
        System.out.println("Демонстрация с интом:");
        magicBox1.add(20);
        magicBox1.add(30);
        magicBox1.add(2);
        System.out.println(magicBox1.pick());

    }
}
