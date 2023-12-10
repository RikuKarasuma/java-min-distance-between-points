package org.example;

public class Main {
    public static void main(String[] args) {

        final var data1 = new int[][]{{1,1},{3,4},{-1,0}};
        assert minTimeToVisitAllPoints(data1) == 7;

        final var data2 = new int[][]{{3,2},{-2,2}};
        assert minTimeToVisitAllPoints(data2) == 5;
    }

    /**
     * On a 2D plane, there are n points with integer coordinates points[i] = [xi, yi].
     * Return the minimum time in seconds to visit all the points in the order given by points.
     *
     * You can move according to these rules:
     *
     * In 1 second, you can either:
     * move vertically by one unit,
     * move horizontally by one unit, or
     * move diagonally sqrt(2) units (in other words, move one unit vertically then one unit
     * horizontally in 1 second).
     *
     * You have to visit the points in the same order as they appear in the array.
     * You are allowed to pass through points that appear later in the order, but these do
     * not count as visits.
     *
     * @param points
     * @return
     */
    private static int minTimeToVisitAllPoints(final int[][] points) {

        int sum = 0;
        for (int i = 0; i < points.length - 1; i ++) {
            final int[] xy1 = points[i];
            final int[] xy2 = points[i + 1];

            int x1 = xy1[0];
            int x2 = xy2[0];

            int y1 = xy1[1];
            int y2 = xy2[1];

            sum += Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
        }

        return sum;
    }
}