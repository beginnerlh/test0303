/*
 * ����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1��

����:

s = "leetcode"
���� 0.

s = "loveleetcode",
���� 2.
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
        //�ñ����������ַ�����λ�Ƚϣ����ҵ�һ�����ظ��ַ���
        for(int i =0; i<chars.length; i++){
            for(int j = 0;j<chars.length ;j++) {
                if(i!=j){
                    if (chars[i] == chars[j]){
                    	// ֻҪ����ͬ��ֱ�Ӿ�����
                        count = -1;
                        break;
                    }else {
                        count = i;
                    }
                }
            }
            if(count == i){
            	//�ڲ�ѭ�������꣬ ���countû��  ˵��û��ͬ���ַ�  
                return count;
            }
        }
        if (s.equals("")) {
            return -1;
        }
        return count;
        }
}