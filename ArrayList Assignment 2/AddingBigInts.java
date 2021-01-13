import java.util.ArrayList;

class AddingBigInts {
    
    public static ArrayList<Integer> sum(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(num1.size() < num2.size()) {
          while(num1.size() < num2.size()) {
              num1.add(0, 0);
            }
        }
        
        if(num1.size() > num2.size()) {
          while(num1.size() > num2.size()) {
              num2.add(0, 0);
            }
        }
        
        for(int i = num1.size() - 1; i >= 0; i--) {
          if(i != 0 && num1.get(i) + num2.get(i) > 9) {
              ans.add(0, (num1.get(i) + num2.get(i))%10);
              num1.add(i-1, num1.get(i-1) + 1);
            } else if(i == 0 && num1.get(i) + num2.get(i) > 9) {
              ans.add(0, (num1.get(i) + num2.get(i))%10);
              ans.add(0, 1);
            } else ans.add(0, num1.get(i) + num2.get(i));  
        }
        return ans;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        
        n1.add(7);
        n1.add(4);
        n1.add(9);
        n1.add(6);
        n1.add(2);
        n1.add(8);
        n1.add(9);
        
        n2.add(4);
        n2.add(8);
        n2.add(3);
        n2.add(5);
        n2.add(4);
        n2.add(2);
        n2.add(2);

        
        System.out.println(sum(n1, n2));
    }
    
}