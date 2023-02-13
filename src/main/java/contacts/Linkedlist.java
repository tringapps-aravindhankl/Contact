package contacts;
import java.util.*;
import java.util.logging.Logger;
public class Linkedlist {
	Logger l=Logger.getLogger("hi");
    Node rootnode=null;

    public class Node{
        String name;
        long phone;
        String email;
        Node nextNode;

        Node(String name,long phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
            this.nextNode=null;
        }
    }
    void add(String name,long phone,String email)
    {
        Node temp;
        if(rootnode==null)
        {
            rootnode=new Node(name,phone,email);
        }
        else
        {
            temp=rootnode;
            while(temp.nextNode!=null)
            {
                temp=temp.nextNode;
            }
            temp.nextNode=new Node(name,phone,email);

        }
    }

    void deleteContact(String name)
    {
        Node temp=rootnode;
        Node pre=rootnode;
        String s="This contact is Deleted";
        while(temp!=null)
        {
            if(name.equals(rootnode.name))
            {
                rootnode=temp.nextNode;
                break;
            }
            else if(name.equals(temp.name))
            {
                l.fine(s);
                pre.nextNode=pre.nextNode.nextNode;
                break;
            }
            else
            {
                pre=temp;
                temp=temp.nextNode;
            }
        }
    }
    void search(String name)
    {
        Node temp=rootnode;
        while(temp!=null) {
            if(name.equals(temp.name))
            {
                String searchname="Name:"+temp.name;
                String searchphone="Phone"+temp.phone;
                String searchemail="Email"+temp.email;
                l.info(searchname);
                l.info(searchemail);
                l.info(searchphone);
                break;
            }
            else
            {
                temp=temp.nextNode;
            }
        }
    }
    void display()
    {
        Node temp=rootnode;
        if(temp==null) {
            System.out.println("No Contacts");
        }
        else
        {
            while(temp!=null) {
                String name="Name:"+temp.name;
                String email="Email:"+temp.email;
                String phone="phone:"+temp.phone;
                l.info(name);
                l.info(email);
                l.info(phone);
                temp=temp.nextNode;
            }
        }
    }
}
