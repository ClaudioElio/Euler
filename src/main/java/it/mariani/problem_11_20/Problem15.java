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

	private static final int MAX = 20;
	private static long numRoutes = 0;

	private static pos[] path = new pos[MAX * 2];

	private static long[][] paths = new long[MAX + 1][MAX + 1];

	public static final void singleCalc2(pos p) {
		if (p.x == MAX || p.y == MAX) {
			paths[p.y][p.x] = 1;
			return;
		}
		if (paths[p.y][p.x] == 0) {
			if (p.x < MAX) {
				singleCalc2(new pos(p.x + 1, p.y));
				paths[p.y][p.x] += paths[p.y][p.x + 1];
			}
			if (p.y < MAX) {
				singleCalc2(new pos(p.x, p.y + 1));
				paths[p.y][p.x] += paths[p.y + 1][p.x];
			}
		}
	}

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
//		singleCalc(new pos(0, 0));
		singleCalc2(new pos(0, 0));
//		long l = singleCalc2(new pos(0, 0));
//		System.out.println(" r: " + numRoutes);
//		System.out.println(" l: " + paths[0][0]);

		return numRoutes;
	}

}
