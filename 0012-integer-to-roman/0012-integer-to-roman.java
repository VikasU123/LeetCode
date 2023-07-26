// class Solution {
//     public String intToRoman(int num) {
//         String[] onse={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//         String[] tens={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//         String[] hend={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//         String[] thu={"", "M", "MM", "MMM"};
//         return (thu[num/1000] + hend[(num%1000)/100] + tens[(num%100)/10] + onse[(num%10)]);
//     }
// }

class Solution {
    public String intToRoman(int num) {
        String[] s={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String t="";
       int i=0;
       while(num>0){
           if(num>=values[i]){
               t+=s[i];
               num-=values[i];
           }
            else
           i++;
       }
        return t;
    }
}