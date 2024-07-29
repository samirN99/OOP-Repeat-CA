import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



class Block{                                                // class that reps a block of shares and has both a quantity and a price
        int quantity;
        double price;



public Block(int quantity,double price){                //a constructor to initialize the block above
        this.quantity=quantity;
        this.price=price;
        }
        }
public class Q10 {


    private Queue<Block> blocks = new LinkedList<>();           //?

    public void buy(int quantity, double price) {                                   // method for buying shares
        blocks.add(new Block(quantity, price));                                             // adding a new block
        System.out.println("Bought " + quantity + " shares at $" + price + " per share.");
    }

    public void sell(int quantity, double sellPrice) {                  //method for selling shares
        double totalCost = 0;                                               // initialize cost
        int remainingQuantity = quantity;                               // Quantity of shares left to be sold



        while (remainingQuantity > 0 && !blocks.isEmpty()) {            //process each block until sold
            Block block = blocks.peek();                                    //peek first block in the queue
            if (block.quantity <= remainingQuantity) {
                totalCost += block.quantity * block.price;                  // add the cost of the block to the total cost
                remainingQuantity -= block.quantity;                    //decrease the remaining quantity
                blocks.poll();                                               // Remove the block from the queue
            } else {
                totalCost += remainingQuantity * block.price;           // add the remaining to the total cost
                block.quantity -= remainingQuantity;                    // decrease blocks quantity
                remainingQuantity = 0;                                      // all required quantity has been sold
            }
        }

        double totalRevenue = quantity * sellPrice;         //calc the total revenue from sale
        double gain = totalRevenue - totalCost;             // calc the gan from sale
        System.out.printf("Total gain: $%.2f\n", gain);             // show the gain
    }

    public static void main(String[] args) {                  // this method handles the input and the execution of buying and selling
        Q10 stockTransaction = new Q10();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (buy quantity price, sell quantity price, quit):");
            String command = scanner.nextLine();
            String[] parts = command.split(" ");

            if (parts[0].equalsIgnoreCase("quit")) {
                System.out.println("Exiting...");
                break;
            }

            if (parts[0].equalsIgnoreCase("buy")) {
                int quantity = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);
                stockTransaction.buy(quantity, price);
            } else if (parts[0].equalsIgnoreCase("sell")) {
                int quantity = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);
                stockTransaction.sell(quantity, price);
            } else {
                System.out.println("Invalid command. Try again.");
            }
        }

        scanner.close();
    }
}


