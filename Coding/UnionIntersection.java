package Coding;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {

    public static void main(String[] args) {

        int A[] = { 1, 2, 3, 4, 5 };
        int B[] = { 5, 6, 7 };

        Set<Integer> union = getUnion(A, B);
        Set<Integer> intersection = getIntersection(A, B);

        System.out.println("Union :" + union);
        System.out.println("Intersection :" + intersection);
    }

    private static Set<Integer> getUnion(int[] a, int[] b) {
        Set<Integer> union = new HashSet<>();

        for (int i : a) {
            union.add(i);
        }
        for (int i : b) {
            union.add(i);
        }
        return union;
    }

    private static Set<Integer> getIntersection(int[] a, int[] b) {
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for (int i : a) {
            set.add(i);
        }
        for (int i : b) {
            if (set.contains(i)) {
                intersection.add(i);
            }
        }
        return intersection;
    }
}
