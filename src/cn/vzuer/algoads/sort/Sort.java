package cn.vzuer.algoads.sort;

public abstract class Sort<T extends Comparable<T>> {

    public abstract void sort(T[] nums);
    public class SelectionSort(T[] nums);
    protected boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }
/*
    访问修饰权限：default public protected private
 */
    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
