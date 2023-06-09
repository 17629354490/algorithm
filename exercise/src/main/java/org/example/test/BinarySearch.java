package org.example.test;

/**
 * @author rpf
 * @version 1.0
 * @date 2023/4/22 11:16
 */
public class BinarySearch {

    /**
     * 二分查找
     *
     * @param a      有序数组
     * @param target 待查找目标值
     * @return 找到返回索引，否则返回-1
     */
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0;
        int j = a.length;
        while (i < j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 二分查找优化(左右查找平衡)
     *
     * @param a      有序数组
     * @param target 待查找目标值
     * @return 找到返回索引，否则返回-1
     */
    public static int binarySearch(int[] a, int target) {
        int i = 0;
        int j = a.length;
        while (1 < j - i) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m;
            } else {
                i = m;
            }
        }
        if (target == a[i]) {
            return i;
        } else {
            return -1;
        }
    }
}
