
public class strStr {
	
	public static int strStr(String haystack, String needle) {
		if(needle.length()==0) return 0;
        if(haystack.length()==0) return -1;
        for(int i=0; i<=haystack.length()-needle.length();i++) {
        	if(haystack.substring(i, i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "";
		String needle = "a";
		System.out.println(strStr(haystack, needle));
		
	}
}
