# Questions asked in Paytm interview

1. Given a number whose digits are represented as linked list, return a linked list which has digits of the number obtained by adding the given number with 1.

2. Given two numbers with their digits represented with linked list, find their sum.

3. Given an array which can have numbers between 1 and n with one duplicate and obviously, one missing, find both numbers in O(n) time and O(1) space.

4. Given a preorder and inorder tree traversal, generate a unique tree.

###### Soln outline to Q1. and Q2.
First reverse both linked lists. Then add corresponding digits from the beginning of both lists while traversing them(considering carry also) and keep the running sums of the digits in another list. Then reverse the new linked list to get the original answer with the digits at their proper places. Crux is to [reverse the linked list](https://www.geeksforgeeks.org/reverse-a-linked-list/). The code can be found [here](https://github.com/SahinSarkar/InterviewPractice/blob/master/src/main/java/com/paytm/sahin/AddDigitsOnLinkedList.java). The generic solution also caters to Q1 as can be seen in the test method named [testAddTwoLinkedListNumbersWhenOneNumberIsOneAndCarryPropagatesToTheEnd](https://github.com/SahinSarkar/InterviewPractice/blob/master/src/test/java/com/paytm/sahin/AddDigitsOnLinkedListTest.java)

