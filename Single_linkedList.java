import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Single_linked{
    Node head;
    Single_linked(){
        this.head=null;
    }
    void addFirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node temp =head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void delFirst(){
        if(head==null){
            System.out.println("list is empty");
        }else{
            head=head.next;
        }
    }
    void delLaast(){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty");
        }else if(head.next==null){
           head=null;
        }else{
        while(temp.next.next!=null){
             temp=temp.next;
        }
        temp.next=null;
        }
    }
    void print(){
        Node temp =head;
        System.out.println("ELements are");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Single_linkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Single_linked l1=new Single_linked();
        int ch;
        do{
        System.out.println("1.addFirst");
        System.out.println("2.addLast");
        System.out.println("3.delFirst");
        System.out.println("4.DelLast");
        System.out.println("5.print");
        System.out.println("6.exit");
         ch=sc.nextInt();
        
        switch (ch) {
            case 1:
                System.out.println("Enter the num");
                l1.addFirst(sc.nextInt());
                break;
            case 2:
                System.out.println("Enter the num");
                l1.addLast(sc.nextInt());
                break;
            case 3:
                l1.delFirst();
                break;
            case 4:
                l1.delLaast();
                break;

            case 5:
                l1.print();
                break;
            case 6:
                System.exit(0);
            default:
                break;
        }
        System.out.println("--------------------------------------------");
    }while(ch!=6);
    sc.close();
    }

}
