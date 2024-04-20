package algoexpert.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Coding Interview Questions Depth First Search Solution 2
 * {@link} https://www.algoexpert.io/questions/depth-first-search
 * 
 * @author Amit Das
 */
public class DepthFirstSearch2 {

	static class Node {
		String name;
		List<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}

		public List<String> depthFirstSearch(List<String> array) {
			// Write your code here.
			array.add(name);
			children.forEach(child -> child.depthFirstSearch(array));
			return array;
		}

		public Node addChild(String name) {
			Node child = new Node(name);
			children.add(child);
			return this;
		}

		public Node addChild(Node node) {
			children.add(node);
			return this;
		}
	}

	public static void main(String[] args) {
		List<String> outputList = new ArrayList<>();
		// 3rd Level
		Node eNode = new Node("E");
		Node fNode = new Node("F");
		fNode.addChild("I");
		fNode.addChild("J");
		Node gNode = new Node("G");
		gNode.addChild("K");
		Node hNode = new Node("H");
		// 2nd Level
		Node bNode = new Node("B");
		bNode.addChild(eNode);
		bNode.addChild(fNode);
		Node cNode = new Node("C");
		Node dNode = new Node("D");
		dNode.addChild(gNode);
		dNode.addChild(hNode);
		// 1st Level
		Node aNode = new Node("A");
		aNode.addChild(bNode);
		aNode.addChild(cNode);
		aNode.addChild(dNode);

		aNode.depthFirstSearch(outputList);
		System.out.println(outputList);
	}
}