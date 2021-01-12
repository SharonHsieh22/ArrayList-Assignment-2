import java.util.ArrayList;

class SieveOfEratosthenes {    
    public static ArrayList<Integer> prime(int n) {
        int p = 2;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 2; i < n; i++) {
            ans.add(i);
        }
        for(int j = ans.size()-1; j > ans.indexOf(p); j--) {
            if(ans.get(j)%p == 0) ans.remove(j); 
            if(j == ans.indexOf(p)+1) {
                p = ans.get(j);
                j = ans.size();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
         System.out.println(prime(100));
    }

}