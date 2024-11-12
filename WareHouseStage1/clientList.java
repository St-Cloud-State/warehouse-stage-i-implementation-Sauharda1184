import java.util.*;

public class ClientList {
    // Private fields
    private static ClientList clientList;
    private List<Client> clients = new LinkedList<Client>();

    // Constructor
    private ClientList(){}; // Private to enforce singleton

    // Operations
    public static ClientList instance() { // Creation method
        if (clientList == null) {
            return (clientList = new ClientList());
        }
        else {
            return clientList;
        }
    }

    public boolean addClient(Client client) {
        clients.add(client);
        return true;
    }

    public Client getClient(String clientID) {
        Iterator<Client> it = clients.iterator();
        while( it.hasNext()) {
            Client i = it.next();
            if( i.getID() == clientID) {
                return i;
            }
        }
        return null;
    }
}