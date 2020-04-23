
public class hairetu3 {

	public static void main(String[] args) {
		
		int[] nums = {8,5,9,2,4};
		int sum=0;
		int count=0;
		
		for(int num : nums) {
			System.out.println(num);//すべて表示
			sum += num;
			if (num >= 5) {
				count++;
			}
		}
		System.out.println(sum);//合計値を表示
		System.out.println(count);//5以上の個数を表示
		
		for(int n=0; n<nums.length ; n++){
		System.out.println(nums[n] * 2);//すべての要素を2倍に書き換え
		}
		
		int max = nums[0];
			for(int m : nums){
				if(max < m){
					max = m; 
				}
		}
		System.out.println(max);//最大値を求める
		
	}

}
