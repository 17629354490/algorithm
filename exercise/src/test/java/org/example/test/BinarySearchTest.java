package org.example.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.example.test.BinarySearch.binarySearch;
import static org.example.test.BinarySearch.binarySearchBasic;

/**
 * @author rpf
 * @version 1.0
 * @date 2023/4/22 11:35
 */
public class BinarySearchTest {

    @Test
    @DisplayName(value = "二分查找数据")
    public void binarySearchTest() {
        int[] a = new int[]{1, 3, 5, 6, 24, 26, 40};
        Assertions.assertEquals(0, binarySearchBasic(a, 1));
        Assertions.assertEquals(1, binarySearchBasic(a, 3));
        Assertions.assertEquals(2, binarySearchBasic(a, 5));
        Assertions.assertEquals(3, binarySearchBasic(a, 6));
        Assertions.assertEquals(4, binarySearchBasic(a, 24));
        Assertions.assertEquals(5, binarySearchBasic(a, 26));
        Assertions.assertEquals(6, binarySearchBasic(a, 40));
        Assertions.assertEquals(-1, binarySearchBasic(a, 4));
    }

    @Test
    @DisplayName(value = "二分查找数据")
    public void binarySearch_CodeOptimizeTest() {
        int[] a = new int[]{1, 3, 5, 6, 24, 26, 40};
        Assertions.assertEquals(0, binarySearch(a, 1));
        Assertions.assertEquals(1, binarySearch(a, 3));
        Assertions.assertEquals(2, binarySearch(a, 5));
        Assertions.assertEquals(3, binarySearch(a, 6));
        Assertions.assertEquals(4, binarySearch(a, 24));
        Assertions.assertEquals(5, binarySearch(a, 26));
        Assertions.assertEquals(6, binarySearch(a, 40));
        Assertions.assertEquals(-1, binarySearch(a, 4));
    }
}
