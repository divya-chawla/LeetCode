class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int count = 0;
        char second = 'A';
        for(int i = 0; i<len; i++){
            char first = s.charAt(i);
            if(i != len-1){
                second = s.charAt(i+1);  
            }
            if(first == 'M'){
                count += 1000;
            }
            else if(first == 'D'){
                count += 500; 
            }
            else if(first == 'C'){
                if(second == 'D' ){
                    count += 400;
                    i++;
                }
                else if(second == 'M' ){
                    count += 900;
                    i++;
                }
                else{
                    count += 100;    
                } 
            }
            else if(first == 'L'){
                count += 50; 
            }
            else if(first == 'X'){
                if(second == 'L' ){
                    count += 40;
                    i++;
                }
                else if(second == 'C' ){
                    count += 90;
                    i++;
                }
                else{
                    count += 10;    
                }
            }
            else if(first == 'V'){
                count += 5; 
            }
            else if(first == 'I'){
                if(second == 'V' ){
                    count += 4;
                    i++;
                }
                else if(second == 'X' ){
                    count += 9;
                    i++;
                }
                else{
                    count += 1;    
                }
               
            }
        }
        return count;    
    }
}