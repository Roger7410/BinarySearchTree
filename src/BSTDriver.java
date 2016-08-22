import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BSTDriver {
    public static void main(String [] args) throws FileNotFoundException{
        //String filename = args[0];
        String line = "";
        BST t1 = new BST();
//		t1 = new BST();
//		t1.add(new Node(new Word("a")), t1.getRoot());
//		t1.add(new Node(new Word("b")), t1.getRoot());
//		t1.add(new Node(new Word("c")), t1.getRoot());
//		t1.add(new Node(new Word("d")), t1.getRoot());
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));

            line = br.readLine();
            while(line!=null){
                //System.out.println("%%" + line);
                String t= line.replaceAll("[^a-zA-Z' ]","");
                //line.split("\\s+");
                //String t= line.replaceAll("[*.,()!:/;@$ ]","");
                String [] subline = t.split(" ");
                for(String a :subline){
                    //System.out.println(a);
                    Word word = new Word(a);
                    //t1 = new BST(word);
                    Node newNode = new Node(word);
                    Node rootNode = t1.getRoot();
                    //System.out.println(rootNode);
                    t1.add(newNode, rootNode);
                }
                line = br.readLine();

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

        //System.out.println("In inorder" + t1.getRoot().getKey());

        t1.inorder(t1.getRoot());

        //System.out.println(t1.getRoot());
        //System.out.println(t1.parent(t1.getRoot(),one));
        Node newNode = new Node(new Word("I"));
        System.out.println(t1.minNode(newNode));
        //Node parentNode = t1.findParent(t1.getRoot(), "week");
        //System.out.println(parentNode.getKey());
        t1.delete(newNode);
        //t1.deleteNode (newNode);
        //t1.inorder(t1.getRoot());
//		Scanner scan1 = new Scanner(System.in);
//		Scanner scan2 = new Scanner(System.in);
//		int input1 = 0;
//		String input2 ="";
//		while(true){
//			System.out.println("Enter your choice: ");
//			System.out.println("1.Print the BST using inorder traversal\n2.Remove a user specified word from the BST\n3.Find a user specified word in the BST and print its count\n4.Exit the program");
//			input1 = scan1.nextInt();
//			switch(input1){
//			case 1:
//				
//			break;
//			case 2:
//			break;
//			case 3:
//				input2 = scan2.nextLine();
//			break;
//			case 4:
//				System.out.println("Quit the program.");
//				System.exit(0);
//			break;
//			default:
//				System.out.println("Not an option. Try again.");
//			}
//			
//		}



    }
}
