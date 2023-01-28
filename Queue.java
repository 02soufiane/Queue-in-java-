import java.util.Arrays;

public class Queue {
    String[] array;
    int size;
    int front;
    int top;

    public Queue(int size){
        this.size=size;
        array= new String[size];
        front=0;
        top=0;
    }

    public void push(String element){
        if(top>=size-1){
            System.out.println("isFull!");
        }else{
            array[top]=element;
            top+=1;
            array= Arrays.copyOf(array,size*2);
            size=array.length;
        }
    }

    public int getSize() {
        return size;
    }

    public void pop(){
        if(front==top){
            System.out.println("isFull!");
        }else {
            String item = array[front];
            front+=1;
            System.out.println(item);
        }
    }

    public static void main(String[] args){
        Queue test = new Queue(4);
        test.push("h1");
        System.out.println(test.getSize());
        test.push("h2");
        System.out.println(test.getSize());
        test.push("h3");
        System.out.println(test.getSize());
        test.push("h4");
        System.out.println(test.getSize());
        test.pop();
        test.pop();
    }

}
