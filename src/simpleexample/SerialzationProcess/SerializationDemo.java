package simpleexample.SerialzationProcess;

import simpleexample.model.School;

import java.io.*;
/*
* Serialization is Writing object data into file
* Deserialization is read data from file convert into object
* It is used to send object data over network
* Network work on file data
* communication between to jvm instances is called Network Here
* Class Used in Serialization
* FileOutPutStream
* ObjectOutPutStream
* Class used in DeSerialization
* FileInputStream
* ObjectInputStream
*
* */
public class SerializationDemo  {

    void serialization() throws IOException
    {
        School school = new School("DAV","Delhi","Vasant Kunj");
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(school);
        outputStream.close();
        System.out.println("Serialization Completed");

    }
    void deSerialization() throws IOException,ClassNotFoundException
    {
        FileInputStream inputStream = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        School school = (School)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(school);

    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        SerializationDemo serializationDemo = new SerializationDemo();
        serializationDemo.serialization();
        serializationDemo.deSerialization();
    }
}
