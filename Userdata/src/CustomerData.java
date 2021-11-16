import Customer.model.model.Comments;
import Customer.model.model.Customer;
import Customer.model.model.Posts;

import javax.xml.stream.events.Comment;
import java.util.*;

public class CustomerData {
    public static void main(String args[]) {
        List<Customer> al = new ArrayList();
        Customer d1 = new Customer("Kumar", "kumar@145");
        Customer d2 = new Customer("Rajesh", "rajesh@190");
        Customer d3 = new Customer("Sam", "sam@165");
        Customer d4 = new Customer("Raju", "raju@126");

        al.add(d1);
        al.add(d2);
        al.add(d3);
        al.add(d4);
        for (Customer s : al) {
            System.out.println(s.getName() + " " + s.getEmail());
        }
        List<Posts> bl = new ArrayList();
        Posts c1 = new Posts(101, "kumar@145", "products", "good product");
        Posts c2 = new Posts(102, "rajesh@190", "products", "good product");
        Posts c3 = new Posts(103, "sam@165", "products", "good product");
        Posts c4 = new Posts(104, "raju@126", "products", "good product");

        bl.add(c1);
        bl.add(c2);
        bl.add(c3);
        bl.add(c4);
        for(Customer s:al){
            for(Posts k:bl){
                if(s.getEmail()==k.getEmail()){
                    System.out.println("Customer Name"+":"+s.getName()+" "+"Heading"+":"+k.getHeading()+" "+"description"+":"+k.getDescription());
                }
            }
        }
//        for (Posts k : bl) {
//            System.out.println(k.getPostId() + " " + k.getEmail() + " " + k.getHeading() + " " + k.getDescription());
//        }
        List<Comments> cl=new ArrayList();
        Comments b1=new  Comments(101,"kumar@145","best product");
        Comments b2=new  Comments(102,"rajesh@190","best product");
        Comments b3=new  Comments(103,"sam@165","best product");
        Comments b4=new  Comments(104,"raju@126","best product");
        cl.add(b1);
        cl.add(b2);
        cl.add(b3);
        cl.add(b4);
       for(Customer s:al){
           for(Posts k:bl){
               for(Comments h:cl){
                   if((s.getEmail()==k.getEmail())&&(k.getEmail()==h.getEmail())){
                       System.out.println("Customer Name :"+s.getName()+", "+"Heading :"+k.getHeading()+", "+"description :"+k.getDescription()+" ,"+"Comment :"+h.getComment()+" ,"+"Customer Name:"+s.getName());

                   }
               }
           }
       }


       }
}








