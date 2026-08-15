public interface DatabaseConnection{
    void connect();
    void disconnect();
}

class PostresDatabase implements DatabaseConnection{
    public void connect(){
        System.out.println("Connection successful!");
    }
    public void disconnect(){
        System.out.println("Disconnected successfully.");
    }
}

public void main(String[] args) {
    PostresDatabase db1 = new PostresDatabase();
    db1.connect();
    db1.disconnect();
}