package Junit5;

//1 test file
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseUnit {
	MinMaxFinder minmax=new MinMaxFinder();

	@Test
	void test1() {
		int[] arr1=new int[]{3,56};
		int []a= {56,34,7,3,54,3,34,34,53};
		assertArrayEquals(arr1,minmax.findMinMax(a));
	}
	
	@Test
	void test2() {
      int[] arr2=new int[]{5,5};	
      int []b= {5,5,5,5,5,5,5};
      assertArrayEquals(arr2,minmax.findMinMax(b));
	}
	
	@Test
	void test3() {
		int[] arr3=new int[]{-6,88};
		int[] c= {-1,-3,5,67,-6,88};
		assertArrayEquals(arr3,minmax.findMinMax(c));
	}

}