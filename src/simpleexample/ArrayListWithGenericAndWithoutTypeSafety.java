package simpleexample;

import simpleexample.model.Person;
import simpleexample.model.Product;

import java.util.ArrayList;
/*Collection are not Type Safe
Problems:-
Type Checking
Type Casting
not recommended to use
* */
public class ArrayListWithGenericAndWithoutTypeSafety {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Person("Deepak","test@gmail.com","9088888888","Delhi"));
        arrayList.add(new Product("Pink Lux","Lux",20,"soap"));
        arrayList.add('c');
        arrayList.add(8.0f);
        arrayList.add(9.0);
        arrayList.add("I am String");
        arrayList.add(null);

        for(Object o:arrayList)
        {
            if(o instanceof Person)
            {
                Person person = (Person)o;
                System.out.println("Person Name:"+person.getName()+"\n"+
                        "Person Email:"+person.getEmail()+"\n"+
                        "Person Phone Number:"+person.getPhone()+"\n"+
                        "Person City:"+person.getCity());

            }
            else if(o instanceof Product)
            {
                Product product = (Product)o;
                System.out.println("Product Name:"+product.getName()+"\n"
                +"Product Manufacture:"+product.getManfacture()+"\n"
                +"Product Type:"+product.getType()+"\n"+
                "Product Price:"+product.getPrice());

            }
            else if(o instanceof String)
            {
                String string = (String)o;
                System.out.println(string);
            }
            else if(o instanceof Double)
            {
                Double doublevalue = (Double)o;
                System.out.println(doublevalue);
            }
            else if(o instanceof Character)
            {
                Character charactervalue = (Character)o;
                System.out.println(charactervalue);
            }
            else if(o instanceof Float)
            {
                Float floatValue = (Float)o;
                System.out.println(floatValue);
            }
            else if(o==null)
            {

                System.out.println(o);
            }
        }

    }
}
