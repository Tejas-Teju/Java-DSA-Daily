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
			int updatedIndex = index;

			if (left < len) {
				if (isMaxHeap) {
					updatedIndex = nums[left] > nums[updatedIndex] ? left : updatedIndex;
				} else {
					updatedIndex = nums[left] < nums[updatedIndex] ? left : updatedIndex;
				}
			}

			if (right < len) {
				if (isMaxHeap) {
					updatedIndex = nums[right] > nums[updatedIndex] ? right : updatedIndex;
				} else {
					updatedIndex = nums[right] < nums[updatedIndex] ? right : updatedIndex;
				}
			}

			if (updatedIndex != index) {
				swap(nums, updatedIndex, index);
				index = updatedIndex;
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
