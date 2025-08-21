public class Heapify {

	public static void main(String[] args) throws InterruptedException {
		int[] numsForMaxHeap = {5,9,1,7,6,3,8};
		heapify(numsForMaxHeap, true);
		System.out.println(Arrays.toString(numsForMaxHeap));

		int[] numsForMinHeap = {5,9,1,7,6,3,8};
		heapify(numsForMinHeap, false);
		System.out.println(Arrays.toString(numsForMinHeap));
	}

	private static void heapify(int[] nums, boolean isMaxHeap) {
		for (int i=nums.length-1; i>=0; i--) {
			percolateDown(nums, i, isMaxHeap);
		}
	}

	private static void percolateDown(int[] nums, int index, boolean isMaxHeap) {
		int len = nums.length;

		while (true) {
			int left = (2 * index) + 1;
			int right = (2 * index) + 2;
			int largestSmallest = index;

			if (isMaxHeap) {
				if (left < len && nums[left] > nums[largestSmallest]) largestSmallest = left;
				if (right < len && nums[right] > nums[largestSmallest]) largestSmallest = right;
			} else {
				if (left < len && nums[left] < nums[largestSmallest]) largestSmallest = left;
				if (right < len && nums[right] < nums[largestSmallest]) largestSmallest = right;
			}

			if (largestSmallest != index) {
				swap(nums, largestSmallest, index);
				index = largestSmallest;
			} else {
				break;
			}
		}
	}

	private static void swap(int[] nums, int from, int to) {
		int temp = nums[from];
		nums[from] = nums[to];
		nums[to] = temp;
	}
}

Output:
[9, 7, 8, 5, 6, 3, 1]
[1, 6, 3, 7, 9, 5, 8]
