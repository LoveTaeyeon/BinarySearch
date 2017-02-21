package fjnu.demo;

/**
 * 
 * @author Hanshuo<p>
 * 二分搜索算法，递归调用
 *
 */
public class BinarySearch {

	/**
	 * @author LoveTaeyeon<p>
	 * @param arr 数组
	 * @param addr 当前下标位置
	 */
	public static int getAddr(int arr[],int beginAddr,int endAddr,int flag){
		int length = arr.length;
		//进行空值和数组大小判断，如果数组为空或者只有一个元素，则返回不同的状态码
		if(length == 0){
			return -1;
		}else if(length == 1){
			return endAddr;
		}
		//进行判断
		int countNum = (endAddr - beginAddr)/2;
		if(arr[beginAddr + countNum] == flag){
			return beginAddr + countNum;
		}else if(arr[beginAddr + countNum] > flag){
			return getAddr(arr, beginAddr, (beginAddr + countNum), flag);
		}else{
			return getAddr(arr, (beginAddr + countNum), endAddr, flag);
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int addr = BinarySearch.getAddr(arr, 0, arr.length - 1,0);
		System.out.println(addr);
	}
	
}
