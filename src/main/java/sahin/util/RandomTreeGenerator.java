package sahin.util;

public class RandomTreeGenerator {

	public static Node<Integer> generateRandomTree(int nodeCount) {
		Node<Integer> root = null;
		int randomDirection = -1;
		if(nodeCount <= 0) {
			return root;
		} else {
			root = new Node<Integer>(randomNumber());
			while(nodeCount-- > 0) {
//				Node<Integer> previousNode = root;
				Node<Integer> currentNode = root;
				while(currentNode != null) {
					randomDirection = tellRandomDirection();
					if(randomDirection == 1) {
						if(currentNode.right == null) {
							currentNode.right = new Node<Integer>(randomNumber());
							break;
						} else {
							currentNode = currentNode.right;							
						}
					} else {
						if(currentNode.left == null) {
							currentNode.left = new Node<Integer>(randomNumber());
							break;
						} else {
							currentNode = currentNode.left;							
						}
					}
				}
			}
		}
		return root;
		
	}
	
	public static void printInOrder(Node<Integer> root) {
		Node<Integer> node = root;
		if(node != null) {
			printInOrder(node.left);
			System.out.print(node.data + " ");
			printInOrder(node.right);
		}
	}

	private static int tellRandomDirection() {
		final int direction = (int) (Math.random() * 10) > 5 ? 1 : 0;
		System.out.println("direction taken : " +direction);
		return direction;
	}

	private static int randomNumber() {
		return (int) (Math.random() * 10);
	}
}
