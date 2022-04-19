package data;

import business.Container;

import java.io.*;

public class Serializator {

    public static void serializare(Container con)
    {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C:\\PT2021_30226_Hagymas_Alexandra_Assignment_4\\src\\main\\resources\\s.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(con);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

    }

    public static Container deserializare()
    {
        Container con = null;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\PT2021_30226_Hagymas_Alexandra_Assignment_4\\src\\main\\resources\\s.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            con = (Container) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }

        return con;
    }
}
