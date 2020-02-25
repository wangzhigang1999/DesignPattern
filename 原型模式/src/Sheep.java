import java.io.*;

public class Sheep implements Cloneable, Serializable {
    int age;
    String color;
    String name;
    public Sheep friend;

    public Sheep(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        try {

            //字节数组输出流
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            //对象输出流
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            //将这个对象写到对象输出流中
            oos.writeObject(this);
            //强制发送
            oos.flush();
            ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bin);

            bos.close();
            oos.close();
            bin.close();
            ois.close();

            return ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", friend=" + friend +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep(12, "red", "tom");
        sheep.friend = new Sheep(1, "blue", "wang");
        Sheep clone = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(clone);
        System.out.println(sheep.friend == clone.friend);
    }
}


