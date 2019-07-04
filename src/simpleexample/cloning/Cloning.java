package simpleexample.cloning;

/*
* What is Cloning Process
* Cloning process in which we will create exactly duplicate copy of given object
* Cloning will support if Class implement Cloneable interface
* Cloneable interface is a Marker interface
* You need to use Object class clone  method to create new Object from given Object
*
* Advantage of Cloning
* Faster than new Object Creation some steps are not needed
*
*
* */
public class Cloning implements Cloneable{

    int a=10;
    int b=20;

    public static void main(String[] args) {
        Cloning cloning = new Cloning();
        System.out.println(cloning.a);
        System.out.println(cloning.b);
        try {
            Cloning cloning1 = (Cloning)cloning.clone();
            System.out.println(cloning1.a);
            System.out.println(cloning1.b);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
