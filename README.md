# 💻 Java Backend Developer Interview Prep – All-in-One (2025 Market)

Curated, filtered, and structured for real-world Java backend interviews, including **DSA, Java 8, SQL, and Backend Questions**, with exact LeetCode links and interview Q&A.

---

## 📂 DATA STRUCTURES & ALGORITHMS (DSA)

---

### 📁 Array + Two Pointer

#### ✅ Two Sum  
🔗 [LeetCode #1](https://leetcode.com/problems/two-sum/)  
💬 Return indices of two numbers that add up to the target.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Time & Space Complexity? | O(n) time, O(n) space |
| Why HashMap and not HashSet? | HashMap tracks indices |
| Sorted input – can we improve? | Yes → Two Pointers → O(n), O(1) |
| Duplicates like [3,3] for target 6? | Works – complement matched |
| Can we return all pairs? | Yes → use list of lists |
| Java 8 Stream way? | Not feasible – index logic needed |

---

#### ✅ Best Time to Buy and Sell Stock  
🔗 [LeetCode #121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)  
💬 Return max profit from one transaction.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Time & Space Complexity? | O(n), O(1) |
| Why minPrice? | To track cheapest buy |
| 2 transactions? | Use 2-pass DP |
| Unlimited transactions? | Use greedy strategy |
| Can sliding window help? | No – greedy fits better |
| Negative prices? | Works fine |

---

#### ✅ Remove Duplicates from Sorted Array  
🔗 [LeetCode #26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)  
💬 Remove duplicates in-place.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Time & Space Complexity? | O(n), O(1) |
| Why does this work? | Sorted ⇒ duplicates adjacent |
| Unsorted input? | Needs sorting first |
| Return new array instead? | Use Set or Stream |
| At most 2 duplicates? | Modify pointer logic |

---

#### ✅ Maximum Subarray  
🔗 [LeetCode #53](https://leetcode.com/problems/maximum-subarray/)  
💬 Return subarray with largest sum.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Time & Space Complexity? | O(n), O(1) |
| Why is it greedy? | Carry max sum ending at i |
| Recursive version? | Yes with memoization |
| All negatives? | Returns max single |
| Return actual subarray? | Track start & end |

---

#### ✅ Container With Most Water *(Optional)*  
🔗 [LeetCode #11](https://leetcode.com/problems/container-with-most-water/)  
💬 Max water held between two lines.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Time & Space Complexity? | O(n), O(1) |
| Why move smaller height? | Potential to gain |
| Can brute force work? | Yes, O(n²) |
| Formula for area? | `min(h[i], h[j]) * (j-i)` |

---

#### ✅ Rotate Array  
🔗 [LeetCode #189](https://leetcode.com/problems/rotate-array/)  
💬 Rotate array by `k` steps.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Time & Space Complexity? | O(n), O(1) |
| Reverse-based logic? | Yes – 3 reverses |
| What if k > n? | Use `k = k % n` |
| In-place using cycles? | Yes – advanced pointer method |

---

### 📁 Sliding Window

#### ✅ Longest Substring Without Repeating Characters  
🔗 [LeetCode #3](https://leetcode.com/problems/longest-substring-without-repeating-characters/)  
💬 Return longest substring with no repeating characters.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Time & Space Complexity? | O(n), O(n) |
| Why use Set? | To track current window |
| Optimized version? | Use Map for index jumps |
| Want actual substring? | Track start & maxLen |

---

### 📁 HashMap + Frequency

#### ✅ Group Anagrams  
🔗 [LeetCode #49](https://leetcode.com/problems/group-anagrams/)  
💬 Group words that are anagrams.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Why use sorted key? | Sorted anagrams are identical |
| Time Complexity? | O(n * k log k) |
| Alternate way? | Use frequency hash as key |

---

#### ✅ Top K Frequent Elements  
🔗 [LeetCode #347](https://leetcode.com/problems/top-k-frequent-elements/)  
💬 Return k most frequent numbers.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Stream input? | Use heap of k elements |
| Without heap? | Use bucket sort |
| Time Complexity? | O(n log k) |
| Why not sort entire array? | Less efficient than heap |

---

### 📁 Heap

#### ✅ Kth Largest Element in Array  
🔗 [LeetCode #215](https://leetcode.com/problems/kth-largest-element-in-an-array/)  
💬 Find the kth largest element.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Why min heap of k? | Retains k largest |
| Sorting method? | Sort array & pick n-k |
| Stream input? | Heap still works |
| Time & Space? | O(n log k), O(k) space |

---

### 📁 Linked List

#### ✅ Reverse Linked List  
🔗 [LeetCode #206](https://leetcode.com/problems/reverse-linked-list/)  
💬 Reverse a singly linked list.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Time & Space? | O(n), O(1) |
| Recursive version? | Yes |
| Real usage? | Stack, undo systems |

---

#### ✅ Merge Two Sorted Lists  
🔗 [LeetCode #21](https://leetcode.com/problems/merge-two-sorted-lists/)  
💬 Merge two sorted linked lists.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Time & Space? | O(n + m), O(1) |
| Recursive okay? | Yes, but iterative preferred |
| In-place possible? | Yes – reuse nodes |

---

### 📁 Stack

#### ✅ Valid Parentheses  
🔗 [LeetCode #20](https://leetcode.com/problems/valid-parentheses/)  
💬 Check valid bracket pairings.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Push closing brackets? | Simplifies compare logic |
| Extra close bracket? | Stack empty ⇒ false |
| Extend to HTML? | Yes – with tag parsing |
| Mixed input? | Filter or extend validation logic |

---

### 📁 LRU Cache

#### ✅ LRU Cache  
🔗 [LeetCode #146](https://leetcode.com/problems/lru-cache/)  
💬 Implement least recently used cache.

🚀 Follow-Up Q&A

| Question | Answer |
|----------|--------|
| Why LinkedHashMap? | Maintains access order |
| Time Complexity? | O(1) get/put |
| Why not ArrayList? | O(n) to shift |
| Custom logic needed? | Use DLL + HashMap if no LinkedHashMap |

---

## ☕ JAVA 8 QUESTIONS

| Java 8 Problem | LeetCode (if any) |
|----------------|-------------------|
| Filter Even Numbers | ❌ |
| Convert List to Uppercase | ❌ |
| Group by Department | ❌ |
| Join student names ≤15 | ❌ |
| Max salary from list | ❌ |
| Flatten nested list | ❌ |
| Sum of (n > 2) × 3 | ❌ |
| Convert list to map | ❌ |
| Sort list | ❌ |
| Count frequency | ❌ |

---

## 🧮 SQL QUESTIONS

| SQL Query | LeetCode |
|-----------|----------|
| Second Highest Salary | [#176](https://leetcode.com/problems/second-highest-salary/) |
| Top 3 Salaries Per Dept | [#185](https://leetcode.com/problems/department-top-three-salaries/) |
| Find Duplicate Emails | [#182](https://leetcode.com/problems/duplicate-emails/) |
| Dept-wise Avg Salary | ❌ |
| Salary > Dept Avg | ❌ |
| Employees Without Managers | ❌ |
| Who Reports to Manager X | ❌ |
| Count by Dept | ❌ |
| Hired After 2020 | ❌ |
| Salary 40–50k, Age > 35 | ❌ |
| Count by Gender | ❌ |
| Less than Alice | ❌ |

---

## 🧱 JAVA BACKEND QUESTIONS

| Question | LeetCode |
|----------|----------|
| Second Highest Without Sorting | ❌ |
| 2nd Largest – Stream + Non-Stream | ❌ |
| Pair With Given Sum | [#1](https://leetcode.com/problems/two-sum/) |
| Java 8 filter + map + sum | ❌ |
| Longest Substring No Repeat | [#3](https://leetcode.com/problems/longest-substring-without-repeating-characters/) |
| First Non-Repeating Char | [#387](https://leetcode.com/problems/first-unique-character-in-a-string/) |
| Longest Common Prefix | [#14](https://leetcode.com/problems/longest-common-prefix/) |
| Group Students by Age (≤15/≥15) | ❌ |
| LRU Cache | [#146](https://leetcode.com/problems/lru-cache/) |
| Reverse Linked List | [#206](https://leetcode.com/problems/reverse-linked-list/) |

---

🙏 Thanks
