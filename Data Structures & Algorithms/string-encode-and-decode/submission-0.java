class Solution {

    public String encode(List<String> strs) {
        StringBuilder lis = new StringBuilder();
        for(String str : strs){
            lis.append(str.length()).append("#").append(str);
        }
        return lis.toString();
    }

    public List<String> decode(String str) {
        int len = str.length();
        int i =0;
        List<String> strs = new ArrayList<>();
        while(i < len){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            strs.add(str.substring(i,i+length));
            i += length;
        }
        return strs;
    }
}
