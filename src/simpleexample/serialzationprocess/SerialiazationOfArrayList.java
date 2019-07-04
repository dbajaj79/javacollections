package simpleexample.serialzationprocess;

import simpleexample.model.Empolyee;
import simpleexample.model.School;

import java.io.*;
import java.util.ArrayList;

public class SerialiazationOfArrayList {

     void serializationOfArrayList() throws IOException
    {
        ArrayList<School>empolyeeArrayList = new ArrayList<>();
        empolyeeArrayList.add(new School("DAV","Delhi","Vasant Kunj"));
        empolyeeArrayList.add(new School("DPS","Delhi","Vasant Kunj"));
        empolyeeArrayList.add(new School("Amity","Delhi","Vasant Kunj"));
        empolyeeArrayList.add(new School("GDGoenka","Delhi","Vasant Kunj"));
        FileOutputStream fileOutputStream = new FileOutputStream("arraylist.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(empolyeeArrayList);
        outputStream.close();
        fileOutputStream.close();
        System.out.println("Serialization Process is Completed");
    }
    void deserializationOfArrayList() throws IOException,ClassNotFoundException
    {
        FileInputStream fileInputStream = new FileInputStream("arraylist.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<School>schools = (ArrayList<School>)objectInputStream.readObject();
        System.out.println(schools);
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException{
        SerialiazationOfArrayList  serialiazation= new SerialiazationOfArrayList();
        serialiazation.serializationOfArrayList();
        serialiazation.deserializationOfArrayList();
    }
}
