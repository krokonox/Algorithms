class Solution {
    func climbStairs(_ n: Int) -> Int {
      var prev1 = 0
      var prev2 = 1

      if n == 1 {
         return 1
       }

       for i in 2...n {
           var current = prev1 + prev2
           prev1 = prev2
           prev2 = current
       }

        return prev1 + prev2
    }
}
