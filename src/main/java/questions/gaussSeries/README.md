### Question Title : GaussSeries

#### Reason
- i saw this question on math lessons and on programming interviews
- i think it’s quite simple but important question
- an interesting story was about Gauss. When he studied on 3rd grade, teacher asked class to count sum of numbers from 1,2,3,..100 and he answered immediately on this question. He realised that sum of numbers from both sides are the same.

#### Description
When Gauss has studied in the school, his teacher punished him and asked to count sum from 1 to 100. But for him it was not a punishment, as he could do this immediately and changed punishment to encouraging.

Given first to numbers of the series (a1, a2) and the series length (n).

Return series sum = a1 + a2 + ... aN

#### Example1:

Given a1 = 1, a2 = 2, y = 100, result = 5050
Because a1 + a2  + ... + aN = 1 + 2 + ... + 100 = 5050

#### Example2:

Given a1 = 1, a2 = 3, y = 5, result = 25
Because a1 + a2  + ... + aN = 1 + 3 + 5 + 7 + 9 = 25

#### Example3:

Given a1 = 2, a2 = 7, y = 6, result = 87
Because a1 + a2  + ... + aN = 2 + 7 + 12 + 17 + 22 + 27 = 87

#### Constraints:

a1 > 0, a2 >= a1, a2 - a1 <= 100, n <= 10000

#### Solutions

```java
    public class Solution {
       public long getSum(int a1, int a2, int n){
            int d = a2 - a1;
            long an = a1 + ((n - 1) * d);
            return ((a1 + an) * n) / 2;
        }
    }
```


#### Test Cases

input: a1 = 1, a2 = 1, n = 6
output: 6

input: a1 = 1, a2 = 2, n = 100
output: 5050

input: a1 = 2, a2 = 8, n = 10
output: 29900

input: a1 = 1, a2 = 100, n = 10000
output: 654547704

#### Tags: Math
