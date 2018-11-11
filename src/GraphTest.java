
public class GraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		
		g.add_edge("A", "B");
		g.add_edge("A", "D");
		g.add_edge("A", "C");
		g.add_edge("B", "D");
		g.add_edge("D", "E");
		g.add_edge("C", "E");
		
		g.print();
		
		System.out.println(g.getParents("D"));
		
	}

}
