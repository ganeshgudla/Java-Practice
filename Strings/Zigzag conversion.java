class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder res=new StringBuilder();
        int incmt=(numRows-1)*2;
        for(int r=0;r<numRows;r++){
            for(int i=r;i<s.length();i+=incmt){
                res.append(s.charAt(i));
                if(r>0 && r<numRows-1){
                    int secondIndex=i+incmt-2*r;
                
                    if(secondIndex<s.length()){
                       res.append(s.charAt(secondIndex));
                    }
                }
            }
        }
        return res.toString();
    }
}
