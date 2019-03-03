/*
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

案例:

s = "leetcode"
返回 0.

s = "loveleetcode",
返回 2.
*/
package lianxi0303;

public class Test0303 {
	public static void main(String[] args) {
		Solution S = new Solution();
		String s = "leetcode";
		int a = S.firstUniqChar(s);
		System.out.println(a);
	}
}

class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        //用遍历方法将字符串逐位比较，来找第一个不重复字符。
        for(int i =0; i<chars.length; i++){
            for(int j = 0;j<chars.length ;j++) {
                if(i!=j){
                    if (chars[i] == chars[j]){
                    	// 只要有相同的直接就跳出
                        count = -1;
                        break;
                    }else {
                        count = i;
                    }
                }
            }
            if(count == i){
            	//内层循环遍历完， 如果count没变  说明没相同的字符  
                return count;
            }
        }
        if (s.equals("")) {
            return -1;
        }
        return count;
        }
}