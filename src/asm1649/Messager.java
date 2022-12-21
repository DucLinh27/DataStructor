package asm1649;

public class Messager {
    private Messager receiver;
    private Queue<String> messageQueue;
    private Stack<String> messageStack;

    public Messager(String name){
        messageQueue = new Queue<>();
        messageStack = new Stack<>();
    }
    public Messager(){
        this("Unamed");
    }
    private boolean isConnected(){
        return this.receiver != null;
    }
    public void connect(Messager receiver) throws  Exception{
        if (receiver == null || receiver == this.receiver){
            throw new Exception("Connection failed");
        }
        this.receiver = receiver;
        receiver.receiver = this;
    }
    public void send(String message) throws Exception{
        if (!isConnected()){
            throw new Exception("No receiver connected");
        }
        messageQueue.offer(message);
    }
    public void receiver() throws Exception{
        if (!isConnected()){
            throw new Exception("No receiver connected");
        }
        while (!receiver.messageQueue.isEmpty()){
            messageStack.push(receiver.messageQueue.poll());

        }
    }
    public void printAll(){
        if (!messageStack.isEmpty()){
            System.out.println("Message receiver: ");
        }
        messageStack.printAllElements();
    }


}

