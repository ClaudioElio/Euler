package it.mariani.problem_11_20;

/*
* Starting in the top left corner of a 2×2 grid,
* and only being able to move to the right and down,
* there are exactly 6 routes to the bottom right corner.
* How many such routes are there through a 20×20 grid?
*/

class pos {

	public pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}

public class Problem15 {

	private static final int MAX = 5;
	private static long numRoutes = 0;

	private static pos[] path = new pos[MAX * 2];

	public static final void singleCalc(pos p) {
		if (p.x < MAX) {
			path[p.x + p.y] = p;
			singleCalc(new pos(p.x + 1, p.y));
		}
		if (p.y < MAX) {
			path[p.x + p.y] = p;
			singleCalc(new pos(p.x, p.y + 1));
		}
		if (p.x == MAX && p.y == MAX) {
			numRoutes++;
//			for (int cont = 0; cont < MAX * 2; cont++) {
//				System.out.print(" {" + path[cont].x + ", " + path[cont].y + "}");
//			}
//			System.out.println(" r: " + numRoutes);
		}
	}

	public static final long calc() {
		singleCalc(new pos(0, 0));
		return numRoutes;
	}

}
