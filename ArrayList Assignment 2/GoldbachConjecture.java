import java.util.ArrayList;

class GoldbachConjecture {    
    public static ArrayList<Integer> prime(int n) {
        int p = 2;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i < n; i++) {
            primes.add(i);
        }
        for(int j = primes.size()-1; j > primes.indexOf(p); j--) {
            if(primes.get(j)%p == 0) primes.remove(j); 
            if(j == primes.indexOf(p)+1) {
                p = primes.get(j);
                j = primes.size();
            }
        }
        return primes;
    }
    
    public static ArrayList<Integer> nums(int m) {  
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> primesList = new ArrayList<Integer>();
        primesList = prime(m);
        int num1 = primesList.get(0);
        int num2 = primesList.get(0);
        for(int i = 0; i < primesList.size(); i++) {
            if(m - num1 == primesList.get(i)) num2 = primesList.get(i);
            else num1 = primesList.get(i);
        }
        ans.add(num1);
        ans.add(num2);
        return ans;
    }

    public static void main(String[] args) {
         System.out.println(nums(16));
    }

}