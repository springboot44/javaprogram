
public class main {

   

    public static boolean solve(String s, String p, int i, int j) {
        int n = s.length();
        int m = p.length();

        // ✅ memoization
       

        // ✅ base case
        if (j == m) return (i == n);

        boolean match = (i < n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        // ✅ handle '*'
        if (j + 1 < m && p.charAt(j + 1) == '*') {
            boolean skip = solve(s, p, i, j + 2);        // ignore x*
            boolean take = match && solve(s, p, i + 1, j); // use x*
            return (skip || take);
        }

        // ✅ normal match
        if (match) {
            return  solve(s, p, i + 1, j + 1);
        }

        return false;
    }

    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

    
        return solve(s, p, 0, 0);
    }

    public static void main(String[] args) {
  

        // Input
        String s = "aa";

       
        String p = "a*";

        // Output
        boolean result = isMatch(s, p);
        System.out.println("Match result: " + result);

        
    }
}