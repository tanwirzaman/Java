public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str={'a','a','b','c','c','d','a'};
		removeDuplicates(str);
		for(char s:str)
		System.out.println(s);
	}
	public static void removeDuplicates(char[] str) {
		  if (str == null) return;
		  int len = str.length;
		  if (len < 2) return;
		  int tail = 1;
		  for (int i = 1; i < len; ++i) {
		    int j;
		    for (j = 0; j < tail; ++j) {
		      if (str[i] == str[j]) break;
		    }
		    if (j == tail) {
		      str[tail] = str[i];
		      ++tail;
		    }
		  }
		  str[tail] = 0;
		}
}
