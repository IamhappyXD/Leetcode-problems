class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ||(x % 10 == 0 && x != 0)){
            return false;
        }else{
            int rev = 0;
            while(x>rev){
                rev = rev*10+ x%10;
                x /= 10;
            }
            return x==rev || x == rev/10;
        }
    }
}
//---------2nd solution faster------------------

// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x < 0 ||(x % 10 == 0 && x != 0)){
//             return false;
//         }else{
//             String str = String.valueOf(x);
//             for(int i = 0, j = str.length()-1; i< j; i++, j--){
//                 if(str.charAt(i) != str.charAt(j)){
//                     return false;
//                 }
//             }
//             return true;
//         }
//     }
// }
