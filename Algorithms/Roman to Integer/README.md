**Roman to Integer**
---
****

Problem description can found [here](https://leetcode.com/problems/roman-to-integer/)
<br />
Solution Statistics can be found [here](https://leetcode.com/problems/roman-to-integer/submissions/)
<br />
Programming langugaage used - Java
<br />

---

**Strategy**
* Initialize a variable count to keep count of Integer
* Traverse through the given string
    * Translate each symbol to its integer equivalent
    * Add to count variable (as roman numbers are written largest to smallest)
    * Incorporate 6 special cases (Example - IV where one comes before V )


