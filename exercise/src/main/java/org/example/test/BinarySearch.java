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
        int j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
