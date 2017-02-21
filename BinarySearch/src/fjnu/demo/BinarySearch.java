package fjnu.demo;

/**
 * 
 * @author Hanshuo
 *         <p>
 *         二分搜索算法，递归调用
 *
 */
public class BinarySearch {

	/**
	 * @author LoveTaeyeon
	 *         <p>
	 * @param arr
	 *            数组
	 * @param addr
	 *            当前下标位置
	 */
	public static int getAddr(int arr[], int beginAddr, int endAddr, int flag) {
		int length = arr.length;
		// 进行空值和数组大小判断，如果数组为空或者只有一个元素，则返回不同的状态码
		if (length == 0) {
			return -1;
		} else if (length == 1) {
			return endAddr;
		}
		// 进行判断
		int countNum = (endAddr - beginAddr) / 2;
		// 进行判断，如果数组中最后一个元素也不匹配，则返回-1
		if ((beginAddr == endAddr) && (arr[endAddr] != flag)) {
			return -1;
		}
		// 进行判断，如果数组中最后两个元素也不匹配，则返回-1
		if((endAddr - beginAddr) < 2 && arr[endAddr] != flag && arr[beginAddr] != flag){
			return -1;
		}
		if (arr[beginAddr + countNum] == flag) {
			return beginAddr + countNum;
		} else if (arr[beginAddr + countNum] > flag) {
			System.out.println("beginAddr:" + beginAddr + " endAddr:" + (beginAddr + countNum));
			return getAddr(arr, beginAddr, (beginAddr + countNum), flag);
		} else {
			System.out.println("beginAddr:" + (beginAddr + countNum) + " endAddr:" + endAddr);
			return getAddr(arr, (beginAddr + countNum), endAddr, flag);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 110};
		int addr = BinarySearch.getAddr(arr, 0, arr.length - 1, 11);
		System.out.println(addr);
	}

}
