public class AddTwoNum {
    private Node head;
    class Node{
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
            this.next=null;
        }
    }

    public AddTwoNum() {

    }

    public void insert(int val){
        Node node = new Node(val);
        node.val = val;
        if(head==null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public void reverse(){
        if(head==null || head.next==null)
            return;
        Node prev = head;
        Node cur = head.next;

        while(cur!=null){
            Node nextnode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextnode;
        }
        head.next=null;
        head = prev;
    }

    public static void main(String[] args) {
        AddTwoNum list1 = new AddTwoNum();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.display();

        AddTwoNum list2 = new AddTwoNum();
        list2.insert(1);
        list2.insert(2);
        list2.insert(3);
        list2.insert(4);
        list2.display();

        list1.reverse();
        list1.display();

        list2.reverse();
        list2.display();

        AddTwoNum anslist = new AddTwoNum();
        Node i = list1.head;
        Node j = list2.head;
        int sum = 0;
        while(i!=null && j!=null){
            sum = sum + i.val + j.val;
            int carry = sum % 10;
            anslist.insert(carry);
            sum = sum / 10;
            i = i.next;
            j = j.next;
        }
        while (i==null && j!=null){
            sum = sum + j.val;
            int carry = sum % 10;
            anslist.insert(carry);
            sum = sum / 10;
            j = j.next;
        }
        while (j==null && i!=null){
            sum = sum + i.val;
            int carry = sum % 10;
            anslist.insert(carry);
            sum = sum / 10;
            i = i.next;
        }
        if(sum != 0)
            anslist.insert(sum);

        anslist.display();
    }

}
