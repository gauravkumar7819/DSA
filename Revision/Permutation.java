import java.util.*;

class ListNode {
int data;
ListNode next;

ListNode(int data) {
this.data = data;
this.next = null;
}
}

class Solution {
ListNode addAtkthElement(ListNode head, int k, ListNode newElement) {
if (head == null) {
return newElement;
}

if (k == 1) {
newElement.next = head;
return newElement;
}

ListNode current = head;
int count = 1;

while (count < k - 1 && current.next != null) {
current = current.next;
count++;
}

newElement.next = current.next;
current.next = newElement;

return head;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
ListNode head = null;
ListNode tail = null;

for (int i = 0; i < n; i++) {
int data = sc.nextInt();
ListNode newNode = new ListNode(data);

if (head == null) {
head = newNode;
tail = newNode;
} else {
tail.next = newNode;
tail = newNode;
}
}

int k = sc.nextInt();
int val = sc.nextInt();
ListNode newElement = new ListNode(val);

Solution solution = new Solution();
head = solution.addAtkthElement(head, k, newElement);

ListNode current = head;
while (current != null) {
System.out.print(current.data + " ");
current = current.next;
}
}
}


