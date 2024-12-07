import WareHouse.*;

class WareHouseTest{
    public static void main(String args[]){
        Warehouse wh = Warehouse.instance();
        Client cl = wh.addClient("alice smith", "alice@smith.com");
        Product pr = wh.addProduct("hammer", 12.99f, 10);
        Product pr1 = wh.addProduct("screwdriver", 8.49f, 15);
        pr.setQuantity(200);
        pr.modifyQuantity(10);
        System.out.println(pr.getQuantity());
        System.out.println(pr.getID());
        System.out.println(pr1.getID());
        System.out.println(cl.getName());
        System.out.println(wh.findProduct("1"));
    }
}