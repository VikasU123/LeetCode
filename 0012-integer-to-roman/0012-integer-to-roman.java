class Solution {
    public String intToRoman(int num) {
        String[] onse={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hend={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thu={"", "M", "MM", "MMM"};
        return (thu[num/1000] + hend[(num%1000)/100] + tens[(num%100)/10] + onse[(num%10)]);
    }
}