package Revision;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board ={{'A','B','C','E'},
                         {'S','F','C','S'},
                         {'A','D','E','E'}};  
                         String word = "ABCCED";
                   for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
if (board[i][j]==word.charAt(0)) {
print(board, j, j, 0, word);
    
}                    }
                   } 
     
      }

    private static boolean print(char[][] board, int row, int col, int idx, String word) {
     

        if (idx==word.length()) {
            return true;
            
        }
        if(row < 0 || col < 0 || row == board.length || col == board[0].length || board[row][col]=='*' || board[row][col]!=word.charAt(idx)){
            return false;
        }
        int r[]={0,1,0,-1};
        int c[]={1,0,-1,0};
        char ch=board[row][col];
        board[row][col]='*';
        boolean flag = false;
        for (int i = 0; i < c.length; i++) {
            flag=print(board, row+r[i], col+c[i], idx+1, word);
            if (flag==true) {
                return flag;
            }
            board[row][col]=ch;

        }
        return flag;
      
    }
}





//histogram
import java.util.*;
public class Main {

public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
Scanner sp = new Scanner(System.in);
int n=sp.nextInt();
long ar[]=new long [n];
for(int i=0;i<ar.length;i++)
{
ar[i]=sp.nextLong();
}
long lb[]=new long [n];
Stack<Integer>st=new Stack<>();
st.push(0);
lb[0]=-1;
for(int i=1;i<ar.length;i++)
{
while(st.size()>0&&ar[st.peek()]>=ar[i])
{
st.pop();
}
if(st.size()==0){
lb[i]=-1;
st.push(i);
}
else 
{
lb[i]=st.peek();
st.push(i);
}
}
Stack<Integer>sr=new Stack<>();
long rb[]=new long [n];
rb[n-1]=n;
sr.push(n-1);
for(int i=n-2;i>=0;i--)
{
while(sr.size()>0&&ar[sr.peek()]>=ar[i]){
sr.pop();
}
if(sr.size()==0)
{
rb[i]=ar.length;
sr.push(i);
}
else {
rb[i]=sr.peek();
sr.push(i);
}
}
// for(int i=0;i<lb.length;i++)
// {
// 	System.out.print(lb[i]+" ");
// }
// for(int j=0;j<rb.length;j++)
// {
// 	System.out.print(rb[j]+" ");
// }
long ans=0;
for(int i=0;i<ar.length;i++)
{
ans=Math.max(ans,ar[i]*(rb[i]-lb[i]-1));
}
System.out.print(ans);

}

}
//parenthesis score
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scnn = new Scanner(System.in);
        String s = scnn.next();

        int ans = validscore(s);
        System.out.println(ans);
    }

    private static int validscore(String str) {
        int score = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                st.push(score);
                score=0;
            }else{
                score=st.peek()+Math.max(2*score,1);
                st.pop();
            }
        }
        return score;
    }
}
//pattern bool
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scnn = new Scanner(System.in);
        int n = scnn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scnn.nextInt();
        }
        System.out.println(checkConditions(arr));
    }
    
    public static int checkConditions(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] < arr[k] && arr[k] < arr[j]) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}

//Validpa
class Solution {
public boolean isValid(String s) {
Stack<Character> stack = new Stack<Character>(); // create an empty stack
for (char c : s.toCharArray()) { // loop through each character in the string
if (c == '(') // if the character is an opening parenthesis
stack.push(')'); // push the corresponding closing parenthesis onto the stack
else if (c == '{') // if the character is an opening brace
stack.push('}'); // push the corresponding closing brace onto the stack
else if (c == '[') // if the character is an opening bracket
stack.push(']'); // push the corresponding closing bracket onto the stack
else if (stack.isEmpty() || stack.pop() != c) // if the character is a closing bracket

return false;
}

return stack.isEmpty();
}
}
//important of time
int count=0;
for(int i=0;i<orig_order.length;i++)
{
int p=q.deQueue();
int r=orig_order[i];
if(p==r)
{
count++;
}
else
{
while(p!=r)
{
q.enQueue(p);
count++;
p=q.deQueue();
}
count++;
}
}

return count;
//minimum
import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner scn=new Scanner(System.in); 
int n=scn.nextInt();
while(n-->0)    
{
String s=scn.next();
System.out.println(Smallest_Number(s));
}  
}
public static String Smallest_Number(String st)
{        
int [] ans=new int [st.length()+1];
int count=1;  
for(int i=0;i<=st.length();i++) 
{        
if(i==st.length()||st.charAt(i)=='I') 
{          
ans[i]=count;  
count++;   
for(int j=i-1;j>=0&&st.charAt(j)!='I';j--) 
{                 ans[j]=count;    
count++;           
}        
}       
}        
String s="";        
for(int i=0;i<ans.length;i++)       
{            
s=s+ans[i];        
}       
return s;     
} 
}
//calculator
import java.util.*;
public class Main {
public static void main (String args[]) {
Scanner sc =new Scanner(System.in);
String str=sc.next();
int x=calculate(str);
System.out.print(x);
}

public static int calculate(String s) {

if (s == null || s.isEmpty()) return 0;
int len = s.length();
Stack<Integer> stack = new Stack<Integer>();
int currentNumber = 0;
char operation = '+';
for (int i = 0; i < len; i++) {
char currentChar = s.charAt(i);
if (Character.isDigit(currentChar)) {
currentNumber = (currentNumber * 10) + (currentChar - '0');
}
if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1) {
if (operation == '-') {
stack.push(-currentNumber);
}
else if (operation == '+') {
stack.push(currentNumber);
}
else if (operation == '*') {
stack.push(stack.pop() * currentNumber);
}
else if (operation == '/') {
stack.push(stack.pop() / currentNumber);
}
operation = currentChar;
currentNumber = 0;
}
}
int result = 0;
while (!stack.isEmpty()) {
result += stack.pop();
}
return result;
}

}
//get mininmum
import java.util.*;
public class Main {
public static void main (String args[]) {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
String s[]=new String [n];
for(int i=0;i<n;i++)
{
s[i]=scn.next();
}
List<Integer>lst=new ArrayList<>();
for(int i=0;i<n;i++)
{

if(s[i].equals("push"))
{
int t=scn.nextInt();
lst.add(t);
}
else if(s[i].equals("pop"))
{
lst.remove(lst.size()-1);

}
else if(s[i].equals("getMin"))
{
System.out.print(Collections.min(lst)+" ");
}
else if(s[i].equals("top"))
{
System.out.print(lst.get(lst.size()-1)+" ");
}
}
}
}
//circular
class Solution {
public int[] nextGreaterElements(int[] arr) {
int [] res=new int[arr.length];
Arrays.fill(res,-1);
Stack<Integer> st=new Stack<>();
int n=arr.length;
for(int i=0;i<n*2;i++){
while(!st.isEmpty()&& arr[i%n]>arr[st.peek()]){
res[st.pop()]=arr[i%n];
}
st.push(i%n);
}

return res;
}}

//kartik bhaiya and cell
import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int ar[][]=new int [n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
ar[i][j]=scn.nextInt();
}
}
Stack<Integer>st=new Stack<>();
int m=0;
while(m<n)
{
st.push(m);
m++;
}
while(st.size()>=2){
int p=st.pop();
int q=st.pop();
if(ar[p][q]==1)
{
st.push(q);
}
else
st.push(p);
}
int lst=st.pop();
for(int i=0;i<ar.length;i++)
{
if(i!=lst)
{
if(ar[i][lst]==0||ar[lst][i]==1){
System.out.println("No Celebrity");
return;
}
}
}
System.out.println(lst);
}
}
//Queue game
import java.util.*;
public class Main {
public static void main (String args[]) {
Scanner scn=new Scanner(System.in);
int t=scn.nextInt();
while(t-->0)
{
int n=scn.nextInt();
int ar[]=new int [n];
for(int i=0;i<n;i++)
ar[i]=scn.nextInt();
int count=0;
int flag=0;
for(int i=0;i<n;i++)
{
if(ar[i]==1)
count++;
else count--;
if(count<0)
{
System.out.println("Invalid");
flag=1;
break;
}
}
if(flag==0)
System.out.println("Valid");
}
}
}
//baseBall
#include <bits/stdc++.h>
using namespace std;

int calPoints(vector<string> &ops)
{
int sum = 0, score = 0;
vector<int> rounds;
for (string op : ops)
{
if (op == "C")
{
sum -= rounds.back();
rounds.pop_back();
continue;
}
if (op == "D")
{
sum += score = rounds.back() * 2;
}
else if (op == "+")
{
sum += score = rounds[rounds.size() - 1] + rounds[rounds.size() - 2];
}
else
{
sum += score = stoi(op);
}
rounds.push_back(score);
}
return sum;
}

int main()
{
int testCases;
cin >> testCases;
while (testCases--)
{
int n;
cin >> n;
vector<string> ops(n);
for (string &s : ops)
{
cin >> s;
}
cout << calPoints(ops) << '\n';
}

return 0;
}
//outer para
import java.util.*;

class Main {
public static void main(String[] args) {
Scanner scer = new Scanner(System.in);
String s = scer.next();
System.out.println(removeOuterParentheses(s));
}

public static String removeOuterParentheses(String S) {
StringBuilder result = new StringBuilder();
int openCount = 0;
for (char c : S.toCharArray()) {
if (c == '(') {
if (openCount > 0) {
result.append(c);
}
openCount++;
} else {
openCount--;
if (openCount > 0) {
result.append(c);
}
}
}
return result.toString();
}
}
//stock span
import java.util.*;
public class Main {

public static void main(String args[])  {

Scanner ga=new Scanner(System.in);
int n=ga.nextInt();
int arr[]=new int [n];
for(int i=0;i<n;i++)
arr[i]=ga.nextInt();
int ans[]=new int [arr.length];
ans[0]=1;
Stack<Integer>st=new Stack<>();
st.push(0);
for (int i = 1; i < arr.length; i++) {
while(st.size()>0&&arr[st.peek()]<arr[i])
{
st.pop();
}
if(st.size()==0)
ans[i]=i+1;
else
ans[i]=i-st.peek();
st.push(i);
}
for (int i = 0; i < ans.length; i++) {
System.out.print(ans[i]+" ");
}
System.out.print("END");

}

}

//valaene pare
import java.util.*;
public class Main {

public static void main(String[] args) throws Exception {

Scanner ss = new Scanner(System.in);
String str = ss.next();
Main mainobj = new Main();
StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
if (isBalanced(str, stack)) {
System.out.println("Yes");
} else {
System.out.println("No");
}

}

public static boolean isBalanced(String s, StacksUsingArrays st) throws Exception {
for (int i=0;i<s.length();i++) {
if(s.charAt(i)==')')
{
if(st.peek()=='('){
st.pop();
}
else return false;

}
else if(s.charAt(i)==']'){
if(st.peek()=='[')
st.pop();
else return false;
}
else if(s.charAt(i)=='}'){
if(st.peek()=='{') st.pop();
else return false;
}
else if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
st.push(s.charAt(i));
}
return true;

}

private class StacksUsingArrays {
private int[] data;
private int tos;

public static final int DEFAULT_CAPACITY = 10;

public StacksUsingArrays() throws Exception {
// TODO Auto-generated constructor stub
this(DEFAULT_CAPACITY);
}

public StacksUsingArrays(int capacity) throws Exception {
if (capacity <= 0) {
System.out.println("Invalid Capacity");
}
this.data = new int[capacity];
this.tos = -1;
}

public int size() {
return this.tos + 1;
}

public boolean isEmpty() {
if (this.size() == 0) {
return true;
} else {
return false;
}
}

public void push(int item) throws Exception {
if (this.size() == this.data.length) {
throw new Exception("Stack is Full");
}
this.tos++;
this.data[this.tos] = item;
}

public int pop() throws Exception {
if (this.size() == 0) {
throw new Exception("Stack is Empty");
}
int retVal = this.data[this.tos];
this.data[this.tos] = 0;
this.tos--;
return retVal;
}

public int peek() throws Exception {
if (this.size() == 0) {
throw new Exception("Stack is Empty");
}
int retVal = this.data[this.tos];
return retVal;
}

public void display() throws Exception {
if (this.size() == 0) {
throw new Exception("Stack is Empty");
}
for (int i = this.tos; i >= 0; i--) {
System.out.println(this.data[i]);
}

}

}

}
//Next Greater
import java.util.*;

public class Main {
public static void main(String[] args) {

Scanner scn = new Scanner(System.in);

int t = scn.nextInt();

while (t > 0) {
int n = scn.nextInt();
int[] arr = new int[n];

for (int i = 0; i < arr.length; i++)
arr[i] = scn.nextInt();

nextLarger(arr);

t--;
}

}

// Function to print Next Greater Element for each element of the array
public static void nextLarger(int[] ar) {
int ans[]=new int [ar.length];
Stack<Integer>st=new Stack<>();
ans[ar.length-1]=-1;
st.push(ar[ar.length-1]);
for(int i=ar.length-2;i>=0;i--)
{
while(st.size()>0&&st.peek()<ar[i])
{
st.pop();
}
if(st.size()==0)
{
st.push(ar[i]);
ans[i]=-1;
}
else 
{
ans[i]=st.peek();  
st.push(ar[i]);

}
}
for (int i=0;i<ar.length;i++) {
System.out.println(ar[i]+","+ans[i]);
}
// Write Code here

}
}
//find next greater
import java.util.Arrays;
import java.util.*;

public class Main {

public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] arr=new int [n];
for(int i=0;i<arr.length;i++)
arr[i]=scn.nextInt();
int[] result = getNextGreater(arr);
for(int i=0;i<result.length;i++) 
{
System.out.print(result[i]+" ");
}
}
public static int[] getNextGreater(int[] arr) {
int n = arr.length;
int[] result = new int[n];
Arrays.fill(result, -1); // initialize all elements with -1
Stack<Integer> stack = new Stack<>();
for (int i = 0; i < n * 2; i++) {
int index = i % n; // get the index in the original array
while (!stack.isEmpty() && arr[stack.peek()] < arr[index]) {
result[stack.pop()] = arr[index]; // current element is the next greater for elements in the stack
}
stack.push(index);
}
return result;
}
}
//hoodies at coding
//#include<bits/stdc++.h>
#include<unordered_set>
using namespace std;

#define ll long long int

#define s(x) scanf("%lld",&x)
#define s2(x,y) s(x)+s(y)
#define s3(x,y,z) s(x)+s(y)+s(z)

#define p(x) printf("%lld\n",x)
#define p2(x,y) p(x)+p(y)
#define p3(x,y,z) p(x)+p(y)+p(z)
#define F(i,a,b) for(ll i = (ll)(a); i <= (ll)(b); i++)
#define RF(i,a,b) for(ll i = (ll)(a); i >= (ll)(b); i--)

#define ff first
#define ss second
#define mp(x,y) make_pair(x,y)
#define pll pair<ll,ll>
#define pb push_back
ll mod = 1e9 + 7 ;
ll gcd(ll a , ll b){return b==0?a:gcd(b,a%b);}

int main()
{
// freopen("input.txt","r",stdin);
// freopen("output.txt","w",stdout);
ll q;
s(q);
// tot[0] will contain the overall timestamp
// tot[i] will contain the timestamp for the ith course for i>0
ll tot[5];
memset(tot,-1,sizeof(tot));
tot[0]=0;

// qu[i] will contain the students of the ith course in the order of their entry 
queue<ll>qu[5];

while(q--){
char ch;
cin>>ch;
if(ch=='E'){
ll x,r;
s2(x,r);
// Increase the overall timestamp
tot[0]++;
// Push the child in the xth course's queue
qu[x].push(r);

// If the student is the first student in the course, set the timestamp of the xth course to that of the overall time stamp
if(tot[x]==-1)
tot[x]=tot[0];
}
else{
ll id=0;
ll mini=INT_MAX;
// Simply compute the course with the minimum timestamp 
for(ll i=1;i<=4;i++)
if(tot[i]!=-1 and tot[i]<mini){ mini=tot[i]; id=i; }

cout<<id<<" "<<qu[id].front()<<endl;

// Ppp the child from the course with the least timestamp
qu[id].pop();
// If that was the only child in the course, reset the timestamp of that course to -1.
if(qu[id].empty())tot[id]=-1;
}
}
}

//play with card
#include <bits/stdc++.h>
using namespace std;
#define MAX 1299709        
bool sieve[MAX];
vector<int> primes;
void createSieve(){
for(long i=0;i<MAX;i++){
sieve[i] = true;
}
sieve[0] = sieve[1] = false;
for(long i=2;i<MAX;i++){
if(sieve[i]){
primes.push_back(i);
for(long j=i*i;j<MAX;j+=i){
sieve[j] = false;
}
}
}
}
int main() {
primes.push_back(1);  
createSieve();
int n,q;
cin >> n >> q;
int size = q+1;
stack<int> a[size];
stack<int> b[size];
while(n--){
int x;
cin >> x;
a[0].push(x);
}
int i=1;
while(q--){
while(!a[i-1].empty()){
int topElement = a[i-1].top();
a[i-1].pop();
if(topElement % primes[i] == 0){
b[i].push(topElement);
}
else {
a[i].push(topElement);
}
}
i++;
}
for(int i=0;i<size;i++){
while(!b[i].empty()){
cout << b[i].top() << endl;
b[i].pop();
}
}
for(int i=0;i<size;i++){
while(!a[i].empty()){
cout << a[i].top() << endl;
a[i].pop();
}
}
return 0;    
}
//asteroid
import java.util.*;

public class Main {
public static int[] asteroidCollision(int[] asteroids) {
Stack<Integer> stack = new Stack<>();

for (int asteroid : asteroids) {
if (asteroid > 0) {
stack.push(asteroid);
} else {
while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
stack.pop();
}
if (stack.isEmpty() || stack.peek() < 0) {
stack.push(asteroid);
} else if (stack.peek() == Math.abs(asteroid)) {
stack.pop();
}
}
}

int[] result = new int[stack.size()];
for (int i = result.length - 1; i >= 0; i--) {
result[i] = stack.pop();
}

return result;
}

public static void main(String[] args) {
Scanner scaer = new Scanner(System.in);
int N = scaer.nextInt();
int[] asteroids = new int[N];
for (int i = 0; i < N; i++) {
asteroids[i] = scaer.nextInt();
}
int[] result = asteroidCollision(asteroids);
for (int i = 0; i < result.length; i++) {
System.out.print(result[i] + " ");
}
}
}
//Kartik and coding
import java.util.*;
public class Main {
static Scanner s = new Scanner(System.in);
public static void main(String args[]) throws Exception {
// Your Code Here


int qu = s.nextInt();
Main obj = new Main();
StacksUsingArrays stack = obj.new StacksUsingArrays();
Calculate(stack, qu);
}

public static void Calculate(StacksUsingArrays stack, int qu) throws Exception {


for(int i=0;i<qu;i++)
{
int t=s.nextInt();
if(t==2)
{
int p=s.nextInt();
stack.push(p);
}
else if(stack.size()==0)
{
System.out.println("No Code");
}
else
System.out.println(stack.pop());

}
/* Donot initialize another Scanner use the static scanner already declared*/
}

private class StacksUsingArrays {
private int[] data;
private int tos;

public static final int DEFAULT_CAPACITY = 10;

public StacksUsingArrays() throws Exception {
// TODO Auto-generated constructor stub
this(DEFAULT_CAPACITY);
}

public StacksUsingArrays(int capacity) throws Exception {
if (capacity <= 0) {
System.out.println("Invalid Capacity");
}
this.data = new int[capacity];
this.tos = -1;
}

public int size() {
return this.tos + 1;
}

public boolean isEmpty() {
if (this.size() == 0) {
return true;
} else {
return false;
}
}

public void push(int item) throws Exception {
if (this.size() == this.data.length) {

int[] temp = new int[2 * data.length];
for(int i = 0;i < data.length;i++){
temp[i] = data[i];
}

data = temp;
}
this.tos++;
this.data[this.tos] = item;
}

public int pop() throws Exception {
if (this.size() == 0) {
throw new Exception("Stack is Empty");
}
int retVal = this.data[this.tos];
this.data[this.tos] = 0;
this.tos--;
return retVal;
}

public int top() throws Exception {
if (this.size() == 0) {
throw new Exception("Stack is Empty");
}
int retVal = this.data[this.tos];
return retVal;
}

public void display() throws Exception {
if (this.size() == 0) {
throw new Exception("Stack is Empty");
}
for (int i = this.tos; i >= 0; i--) {
System.out.println(this.data[i]);
}

}

}

}

import java.util.*;
class ListNode {
int val;
ListNode next;

ListNode(int val) {
this.val = val;
this.next = null;
}
}

public class Main {
public static ListNode oddEvenList(ListNode head) {
if (head == null || head.next == null) {
return head;
}

ListNode odd = head;
ListNode even = head.next;
ListNode evenHead = even;

while (even != null && even.next != null) {
odd.next = even.next;
odd = odd.next;
even.next = odd.next;
even = even.next;
}

odd.next = evenHead;

return head;
}

public static void printLinkedList(ListNode head) {
while (head != null) {
System.out.print(head.val + " ");
head = head.next;
}
System.out.println();
}

public static void main(String[] args) {
// Input
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
ListNode dummy = new ListNode(0);
ListNode temp = dummy;
for (int i = 0; i < n; i++) {
int num = scanner.nextInt();
temp.next = new ListNode(num);
temp = temp.next;
}
ListNode head = dummy.next;

// Call the function to reorder the linked list
head = oddEvenList(head);

// Print the updated linked list
printLinkedList(head);
}
}
// JAVA program to count occurrences
// of a character

class GFG
{
// Method that return count of the given
// character in the string
public static int count(String s, char c)
{
int res = 0;

for (int i=0; i<s.length(); i++)
{
// checking character in string
if (s.charAt(i) == c)
res++;
} 
return res;
}

// Driver method
public static void main(String args[])
{
String str= "geeksforgeeks";
char c = 'e';
System.out.println(count(str, c));
}
}

//palindrome
class Solution {
public boolean isPalindrome(ListNode head) {
List<Integer> list = new ArrayList();
while(head != null) {
list.add(head.val);
head = head.next;
}

int left = 0;
int right = list.size()-1;
while(left < right && list.get(left) == list.get(right)) {
left++;
right--;
}
return left >= right;
}
}

// Java program to delete a node from doubly linked list
import java.util.*;
import java.io.*;

public class LinkedList {

static Node head, head1, head2;

static class Node {

int data;
Node next, prev;

Node(int d)
{
data = d;
next = prev = null;
}
}

/* Function to split a list (starting with head) into
two lists. head1_ref and head2_ref are references to
head nodes of the two resultant linked lists */
void splitList()
{
Node slow_ptr = head;
Node fast_ptr = head;

if (head == null) {
return;
}

/* If there are odd nodes in the circular list then
fast_ptr->next becomes head and for even nodes
fast_ptr->next->next becomes head */
while (fast_ptr.next != head
&& fast_ptr.next.next != head) {
fast_ptr = fast_ptr.next.next;
slow_ptr = slow_ptr.next;
}

/* If there are even elements in list then move
* fast_ptr */
if (fast_ptr.next.next == head) {
fast_ptr = fast_ptr.next;
}

/* Set the head pointer of first half */
head1 = head;

/* Set the head pointer of second half */
if (head.next != head) {
head2 = slow_ptr.next;
}
/* Make second half circular */
fast_ptr.next = slow_ptr.next;

/* Make first half circular */
slow_ptr.next = head;
}

/* Function to print nodes in a given singly linked list
*/
void printList(Node node)
{
Node temp = node;
if (node != null) {
do {
System.out.print(temp.data + " ");
temp = temp.next;
} while (temp != node);
}
}

public static void main(String[] args)
{
LinkedList list = new LinkedList();

// Created linked list will be 12->56->2->11
list.head = new Node(12);
list.head.next = new Node(56);
list.head.next.next = new Node(2);
list.head.next.next.next = new Node(11);
list.head.next.next.next.next = list.head;

System.out.println(
"Original Circular Linked list ");
list.printList(head);

// Split the list
list.splitList();
System.out.println("");
System.out.println("First Circular List ");
list.printList(head1);
System.out.println("");
System.out.println("Second Circular List ");
list.printList(head2);
}
}

// This code has been contributed by Mayank Jaiswal

//kth element from last
import java.util.*;

class Node {
int data;
Node next;

Node(int data) {
this.data = data;
next = null;
}
}

class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Node head = null;
Node tail = null;

int data = sc.nextInt();
while (data != -1) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
tail = newNode;
} else {
tail.next = newNode;
tail = newNode;
}
data = sc.nextInt();
}

int k = sc.nextInt();
int result = findKthFromLast(head, k);
System.out.println(result);
}

public static int findKthFromLast(Node head, int k) {
Node slow = head;
Node fast = head;

for (int i = 0; i < k; i++) {
if (fast == null) {
return -1; // k is greater than the length of the linked list
}
fast = fast.next;
}

while (fast != null) {
slow = slow.next;
fast = fast.next;
}

return slow.data;
}
}
//sumof two linedlist
import java.util.*;

class Node {
int data;
Node next;

Node(int d) {
data = d;
next = null;
}
}

public class Main {
static Node addLists(Node first, Node second, int carry) {
if (first == null && second == null && carry == 0) {
return null;
}

int sum = carry;
if (first != null) {
sum += first.data;
}
if (second != null) {
sum += second.data;
}

Node result = new Node(sum % 10);

if (first != null || second != null) {
Node next = addLists(first != null ? first.next : null,
second != null ? second.next : null,
sum >= 10 ? 1 : 0);
result.next = next;
}

return result;
}

static void printList(Node node) {
Stack<Integer>st=new Stack<>();
while (node != null) {
st.add(node.data);
node = node.next;
}
while(st.size()>0)
{
System.out.print(st.pop()+" ");
}
}

public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int m = scanner.nextInt();

Node first = null;
for (int i = 0; i < n; i++) {
int num = scanner.nextInt();
Node node = new Node(num);
node.next = first;
first = node;
}

Node second = null;
for (int i = 0; i < m; i++) {
int num = scanner.nextInt();tr
Node node = new Node(num);
node.next = second;
second = node;
}

Node result = addLists(first, second, 0);
printList(result);
}
}
//tripplet from last
import java.util.*;
import java.util.LinkedList ;
public class Main {
public static void main (String args[]) {
Scanner value= new Scanner(System.in) ;
int n= value.nextInt() ;
int m= value.nextInt() ;
int o= value.nextInt() ;
int first[]= new int[n] ;
int second[]= new int[m] ;
int third[]= new int[o] ;

for(int i=0; i<n; i++) first[i]= value.nextInt() ;
for(int i=0; i<m; i++) second[i]= value.nextInt() ;
for(int i=0; i<o; i++) third[i]= value.nextInt() ;

int target= value.nextInt() ;

for(int i=0; i<n; i++){
for(int j=0; j<m; j++){
for(int k=0; k<o; k++){
if(first[i]+ second[j]+ third[k] == target){
System.out.print(first[i] +" " + second[j] + " " + third[k]) ;
return;}}}}}}

//delete node
import java.util.*;

class Node {
int data;
Node next;

Node(int data) {
this.data = data;
next = null;
}
}

class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Node head = null;
Node tail = null;

int data = sc.nextInt();
while (data != -1) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
tail = newNode;
} else {
tail.next = newNode;
tail = newNode;
}
data = sc.nextInt();
}

int k = sc.nextInt();
int result = findKthFromLast(head, k);
System.out.println(result);
}

public static int findKthFromLast(Node head, int k) {
Node slow = head;
Node fast = head;

for (int i = 0; i < k; i++) {
if (fast == null) {
return -1; // k is greater than the length of the linked list
}
fast = fast.next;
}

while (fast != null) {
slow = slow.next;
fast = fast.next;
}

return slow.data;
}
}
//Merge two sorted list
import java.util.*;

class Node {
int data;
Node next;

Node(int data) {
this.data = data;
this.next = null;
}
}

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while (t-- > 0) {
int n1 = sc.nextInt();
Node head1 = null, tail1 = null;
for (int i = 0; i < n1; i++) {
int data = sc.nextInt();
Node node = new Node(data);
if (head1 == null) {
head1 = tail1 = node;
} else {
tail1.next = node;
tail1 = node;
}
}
int n2 = sc.nextInt();
Node head2 = null, tail2 = null;
for (int i = 0; i < n2; i++) {
int data = sc.nextInt();
Node node = new Node(data);
if (head2 == null) {
head2 = tail2 = node;
} else {
tail2.next = node;
tail2 = node;
}
}

Node merged = merge(head1, head2);
printList(merged);
}
}

static Node merge(Node head1, Node head2) {
if (head1 == null)
return head2;
if (head2 == null)
return head1;

Node mergedHead = null, mergedTail = null;
if (head1.data <= head2.data) {
mergedHead = mergedTail = head1;
head1 = head1.next;
} else {
mergedHead = mergedTail = head2;
head2 = head2.next;
}

while (head1 != null && head2 != null) {
if (head1.data <= head2.data) {
mergedTail.next = head1;
mergedTail = head1;
head1 = head1.next;
} else {
mergedTail.next = head2;
mergedTail = head2;
head2 = head2.next;
}
}

if (head1 == null) {
mergedTail.next = head2;
} else {
mergedTail.next = head1;
}

return mergedHead;
}

static void printList(Node head) {
while (head != null) {
System.out.print(head.data + " ");
head = head.next;
}
System.out.println();
}
}
//Linked List-K Append
import java.util.*;
import java.util.LinkedList ;
public class Main {
public static void main(String args[]) {
Scanner obj= new Scanner(System.in) ;
int n= obj.nextInt() ;
LinkedList<Integer>currentNode= new LinkedList<>() ;
for(int i=0; i<n; i++)
currentNode.add(obj.nextInt()) ;
int k= obj.nextInt() ;

if(k >= currentNode.size())
{
k%= currentNode.size() ;
}

k= currentNode.size()- k ;

for(int i=k; i<currentNode.size(); i++) 
System.out.print(currentNode.get(i) + " ") ;
for(int i=0; i<k; i++) 
System.out.print(currentNode.get(i) + " ");}
}
//ReverseList
import java.util.*;

class Main {
static Node head;

static class Node {
int data;
Node next;

Node(int d) {
data = d;
next = null;
}
}

static Node reverse(Node head, int k) {
Node current = head;
Node next = null;
Node prev = null;
int count = 0;

// Reverse first k nodes of the linked list
while (count < k && current != null) {
next = current.next;
current.next = prev;
prev = current;
current = next;
count++;
}

// Recursively call for the rest of the list and link the two parts
if (next != null) {
head.next = reverse(next, k);
}

// prev is now the head of the reversed list
return prev;
}

static void printList(Node node) {
while (node != null) {
System.out.print(node.data + " ");
node = node.next;
}
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();

// Build the linked list
Node prev = null;
for (int i = 0; i < n; i++) {
int data = sc.nextInt();
Node newNode = new Node(data);
if (prev == null) {
head = newNode;
} else {
prev.next = newNode;
}
prev = newNode;
}

// Reverse the list in groups of k elements
head = reverse(head, k);

// Print the reversed list
printList(head);
}
}
//partion
import java.util.Scanner;

class ListNode {
int val;
ListNode next;
ListNode(int val) { 
this.val = val; 
}
}

public class Main {
public static ListNode partition(ListNode head, int x) {
ListNode smallerHead = new ListNode(0);
ListNode greaterEqualHead = new ListNode(0);
ListNode smallerTail = smallerHead;
ListNode greaterEqualTail = greaterEqualHead;

while (head != null) {
if (head.val < x) {
smallerTail.next = head;
smallerTail = smallerTail.next;
} else {
greaterEqualTail.next = head;
greaterEqualTail = greaterEqualTail.next;
}
head = head.next;
}

// Connect the two partitions
smallerTail.next = greaterEqualHead.next;
// Ensure to end the list at the last node of the greater or equal partition
greaterEqualTail.next = null;

return smallerHead.next;
}

public static void printLinkedList(ListNode head) {
while (head != null) {
System.out.print(head.val + " ");
head = head.next;
}
System.out.println();
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int N = scanner.nextInt();
int x = scanner.nextInt();

ListNode dummy = new ListNode(0);
ListNode current = dummy;
for (int i = 0; i < N; i++) {
current.next = new ListNode(scanner.nextInt());
current = current.next;
}

ListNode head = dummy.next;

// Partition the linked list
ListNode partitionedHead = partition(head, x);


printLinkedList(partitionedHead);
}
}
//delete node -2
import java.util.Scanner;
import java.util.Stack;

class Node {
int data;
Node next;

public Node(int data) {
this.data = data;
this.next = null;
}
}

class LinkedList {
Node head;

// Function to insert node at the end of the linked list
public void insert(int data) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
} else {
Node current = head;
while (current.next != null) {
current = current.next;
}
current.next = newNode;
}
}

// Function to print the linked list
public void display() {
Node current = head;
while (current != null) {
System.out.print(current.data + " ");
current = current.next;
}
System.out.println();
}

// Function to delete nodes which have a greater value on the right side
public void deleteNodesWithGreaterRight() {
if (head == null || head.next == null) {
return; // No or only one node
}

Stack<Node> stack = new Stack<>();
Node current = head;

// Traverse the list
while (current != null) {
// Keep nodes in the stack which have smaller or equal values on the right side
while (!stack.isEmpty() && stack.peek().data < current.data) {
stack.pop(); // Remove nodes with smaller values
}

stack.push(current); // Push current node onto the stack
current = current.next; // Move to the next node
}

// Rebuild the list in the correct order
head = null;
Node reversedList = null; // Head of the reversed list

while (!stack.isEmpty()) {
Node currentNode = stack.pop();
currentNode.next = reversedList; // Insert node at the beginning of the reversed list
reversedList = currentNode; // Update the head of the reversed list
}

head = reversedList; // Update head to the correctly ordered list
}
}

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt(); // Number of nodes
LinkedList list = new LinkedList();

for (int i = 0; i < N; i++) {
int data = scanner.nextInt();
list.insert(data);
}

// Delete nodes with greater value on the right
list.deleteNodesWithGreaterRight();

// Display the modified linked list
list.display();

scanner.close();
}
}
//cycle
import java.util.*;

class Node {
public int data;
public Node next;

Node(int d) {
data = d;
next = null;
}
}

class Solution {
// head - Head pointer of the Linked List
// Return a boolean value indicating the presence of cycle
// If the cycle is present, modify the linked list to remove the cycle as well
boolean floydCycleRemoval(Node head) {
Node slow = head, fast = head, prev = null;
int a = 0;
while(fast != null && fast.next != null) {
slow = slow.next;
fast = fast.next.next;
if(slow == fast) {
a = 1;
break;
}
}
if(a == 0) return false;
fast = head;
while(fast != slow) {
prev = slow;
slow = slow.next;
fast = fast.next;
}
prev.next = null;
return true;
}

}


/*
*
*
*   You do not need to refer or modify any code below this. 
*   Only modify the above class definition.
*	Any modications to code below could lead to a 'Wrong Answer' verdict despite above code being correct.
*	You do not even need to read or know about the code below.
*
*
*
*/

public class Main {

public static Node buildCycleList() {
Scanner val = new Scanner(System.in);
Hashtable<Integer, Node> hash = new Hashtable<Integer, Node>();
int x = val.nextInt();
if (x == -1) {
return null;
}
Node head = new Node(x);
hash.put(x, head);
Node current = head;
while (x != -1) {
x = val.nextInt();
if (x == -1)
break;
if (hash.containsKey(x)) {
current.next = hash.get(x);
return head;
}
Node n = new Node(x);
current.next = n;
current = n;
hash.put(x, n);
}
current.next = null;
return head;
}

public static void printLinkedList(Node head) {
HashSet<Integer> s = new HashSet<Integer>();
while (head != null) {
if (s.contains(head.data)) {
System.out.println("\nCycle detected at " + head.data);
return;
}
System.out.print(head.data + " ");
s.add(head.data);
head = head.next;
}
}

public static void main(String[] args) {

Node head = buildCycleList();
Solution s = new Solution();

boolean cyclePresent = s.floydCycleRemoval(head);
if (cyclePresent) {
System.out.println("Cycle was present");
} else {
System.out.println("No cycle");
}

System.out.print("Linked List - ");
printLinkedList(head);
}
}
//LL k -reverse
import java.util.*;

class Main {
static Node head;

static class Node {
int data;
Node next;

Node(int d) {
data = d;
next = null;
}
}

static Node reverse(Node head, int k) {
Node current = head;
Node next = null;
Node prev = null;
int count = 0;

// Reverse first k nodes of the linked list
while (count < k && current != null) {
next = current.next;
current.next = prev;
prev = current;
current = next;
count++;
}

// Recursively call for the rest of the list and link the two parts
if (next != null) {
head.next = reverse(next, k);
}

// prev is now the head of the reversed list
return prev;
}

static void printList(Node node) {
while (node != null) {
System.out.print(node.data + " ");
node = node.next;
}
}

public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();
int k = obj.nextInt();

// Build the linked list
Node prev = null;
for (int i = 0; i < n; i++) {
int data = obj.nextInt();
Node newNode = new Node(data);
if (prev == null) {
head = newNode;
} else {
prev.next = newNode;
}
prev = newNode;
}

// Reverse the list in groups of k elements
head = reverse(head, k);

// Print the reversed list
printList(head);
}
}
//intersectpoint
import java.util.*;

class Node {
public int data;
public Node next;

Node(int d) {
data = d;
next = null;
}
}

class Solution {
// This function gets two arguments - the head pointers of the two linked lists
// Return the node which is the intersection point of these linked lists
// It is assured that the two lists intersect
Node intersectionOfTwoLinkedLists(Node l1, Node l2) {
Node a=l1;
Node b=l2;
while(a!=b){
if(a==null){
a=l2;
}
else{
a=a.next;
}
if(b==null){
b=l1;
}else{
b=b.next;}}return a;
}
}

/*
*
*
*   You do not need to refer or modify any code below this. 
*   Only modify the above class definition.
*	Any modications to code below could lead to a 'Wrong Answer' verdict despite above code being correct.
*	You do not even need to read or know about the code below.
*
*
*
*/

public class Main {

static Scanner sc = new Scanner(System.in);

public static Node buildList(HashMap<Integer, Node> hash) {
int x = sc.nextInt();
Node head = new Node(x);
Node current = head;
hash.put(x, head);
while (x != -1) {
x = sc.nextInt();
if (x == -1)
break;
Node n = new Node(x);
hash.put(x, n);
current.next = n;
current = n;
}
current.next = null;
return head;
}

public static void printLinkedList(Node head) {
Node temp = head;
while (temp != null) {
System.out.print(temp.data + " ");
temp = temp.next;
}
System.out.println();
}

public static void main(String[] args) {

HashMap<Integer, Node> hash = new HashMap<Integer, Node>();
Node l1 = buildList(hash);

Node l2 = null;
int x = sc.nextInt();
l2 = new Node(x);
Node temp = l2;

while (x != -1) {
x = sc.nextInt();
if (x == -1)
break;
if (hash.containsKey(x)) {
temp.next = hash.get(x);
break;
}
Node n = new Node(x);
temp.next = n;
temp = n;
}

System.out.print("L1 - ");
printLinkedList(l1);
System.out.print("L2 - ");
printLinkedList(l2);

Solution s = new Solution();

Node intersectionPoint = s.intersectionOfTwoLinkedLists(l1, l2);
System.out.println("Intersection at node with data = " + intersectionPoint.data);

}
}
remove nth of end
import java.util.Scanner;

class ListNode {
int val;
ListNode next;

ListNode(int val) {
this.val = val;
this.next = null;
}
}

public class Main {
public ListNode removeNthFromEnd(ListNode head, int n) {
// Create a dummy node before head to handle edge cases easily
ListNode dummy = new ListNode(-1);
dummy.next = head;
ListNode first = dummy;
ListNode second = dummy;

// Move first pointer n+1 steps ahead of second
for (int i = 0; i <= n; i++) {
if (first == null) {
return null; // Invalid input case, should not happen based on constraints
}
first = first.next;
}

// Move both pointers until first reaches the end
while (first != null) {
first = first.next;
second = second.next;
}

// Now second is at the node just before the nth from end
if (second.next != null) {
second.next = second.next.next; // Skip the nth node from end
}

return dummy.next; // Return the head of the updated list
}

public void printLinkedList(ListNode head) {
ListNode current = head;
while (current != null) {
System.out.print(current.val + " ");
current = current.next;
}
System.out.println();
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


int n = scanner.nextInt();


int x = scanner.nextInt();


ListNode head = null;
ListNode tail = null;

for (int i = 0; i < n; i++) {
int value = scanner.nextInt();
ListNode newNode = new ListNode(value);
if (head == null) {
head = newNode;
tail = newNode;
} else {
tail.next = newNode;
tail = newNode;
}
}

Main remover = new Main();



head = remover.removeNthFromEnd(head, x);


remover.printLinkedList(head);

scanner.close();
}
}
//delete q query
import java.util.*;

class Node {
int data;
Node next;

public Node(int data) {
this.data = data;
this.next = null;
}
}

public class LinkedListDeletionQueries {
private static Node deleteAtIndex(Node head, int index) {
if (head == null) {
return null;
}

if (index == 0) {
return head.next; // Removing the head node
}

Node current = head;
Node prev = null;
int count = 0;

// Traverse to the node at the specified index
while (current != null && count < index) {
prev = current;
current = current.next;
count++;
}

// If the index is out of bounds
if (current == null) {
return head;
}

// Remove the node at the specified index
prev.next = current.next;

return head;
}

private static void printLinkedList(Node head) {
Node current = head;
List<Integer> nodeList = new ArrayList<>();

// Traverse the linked list and collect node values
while (current != null) {
nodeList.add(current.data);
current = current.next;
}

// Print the collected node values
for (int i = 0; i < nodeList.size(); i++) {
System.out.print(nodeList.get(i));
if (i < nodeList.size() - 1) {
System.out.print(" ");
}
}
System.out.println();
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Read number of nodes and number of queries
int n = scanner.nextInt();
int q = scanner.nextInt();

// Read the node values
Node head = null;
Node tail = null;

for (int i = 0; i < n; i++) {
int data = scanner.nextInt();
Node newNode = new Node(data);
if (head == null) {
head = newNode;
tail = newNode;
} else {
tail.next = newNode;
tail = newNode;
}
}

// Process each deletion query
for (int i = 0; i < q; i++) {
int indexToDelete = scanner.nextInt();
head = deleteAtIndex(head, indexToDelete);
printLinkedList(head);
}

scanner.close();
}
}
//backtraking
import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int ans = chess_board(0,0,n,n);
chess_board(0,0,n,n,"");
System.out.println("\n"+ans);
}
public static void chess_board(int cr, int cc, int er, int ec, String ans) {
if (cr == er - 1 && cc == ec - 1) {
System.out.print(ans + "{" + cr + "-" + cc + "} ");
return;
}
if (cr >= er || cc >= ec) {
return;
}
chess_board(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
chess_board(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");
if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {
for (int moves = 1; moves < ec; moves++)
chess_board(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}R");
for (int moves = 1; moves < er; moves++)
chess_board(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");

}
if (cr == cc || cr + cc == er - 1) {
for (int moves = 1; moves < er; moves++) {
chess_board(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}B");
}
}
}

public static int chess_board(int cr, int cc, int er, int ec) {
if (cr == er - 1 && cc == ec - 1) {
return 1;
}
if (cr >= er || cc >= ec) {
return 0;
}
int cnt = 0;
cnt += chess_board(cr + 2, cc + 1, er, ec);
cnt += chess_board(cr + 1, cc + 2, er, ec);
if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {
for (int moves = 1; moves < ec; moves++)
cnt += chess_board(cr, cc + moves, er, ec);
for (int moves = 1; moves < er; moves++)
cnt += chess_board(cr + moves, cc, er, ec);
}
if (cr == cc || (cr + cc == er - 1)) {
for (int moves = 1; moves < er; moves++) {
cnt += chess_board(cr + moves, cc + moves, er, ec);
}
}
return cnt;
}
}
//chessBoard ab uper h code
import java.util.*;
public class Main {
public static void main(String args[]) {
// Your Code Here
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int ar[]=new int [n];
for(int i=0;i<ar.length;i++)
ar[i]=scn.nextInt();
int t=print(ar,0,0,"",0,"");
System.out.print(t);
}
public static int print(int ar[],int idx,int suml,String ansl,int sumr,String ansr)
{
if(ar.length==idx){
if(suml==sumr)
{
System.out.println(ansl+" and "+ansr);
return 1;

}
return 0 ;}
int a=print(ar,idx+1,suml+ar[idx],ansl+ar[idx]+" ",sumr,ansr);
int b=print(ar,idx+1,suml,ansl,sumr+ar[idx],ansr+ar[idx]+" ");
return a+b;
}
}
//split array
import java.util.*;
public class Main {
public static void main(String args[]) {
// Your Code Here
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
boolean ar[][]=new boolean[n][n];
solution(0,0,ar,n,n,"");
System.out.print("\n"+count);
}
static int count=0;
public static void solution(int r,int c,boolean ar[][],int tk,int tl,String ans)
{
if(tk==0)
{
System.out.print(ans+" ");
count++;
return ;
}

if(c==tl)
{
c=0;
r=r+1;
}
if(r==tl)
return;
if(knightsafe(ar,r,c))
{
ar[r][c]=true;
solution(r,c+1,ar,tk-1,tl,ans+"{"+r+"-"+c+"}"+" ");
ar[r][c]=false;
}
solution(r,c+1,ar,tk,tl,ans);   
}
public static boolean knightsafe(boolean ar[][],int r, int c)
{
if(r-2>=0&&c-1>=0&&ar[r-2][c-1]==true)
return false;
else if(r-1>=0&&c-2>=0&&ar[r-1][c-2]==true)
return false;
else if(r-2>=0&&c+1<ar.length&&ar[r-2][c+1]==true)
return false;
else if(r-1>=0&&c+2<ar.length&&ar[r-1][c+2]==true)
return false;
else 
return true;
}
}
//k_night
import java.util.*;
public class Main {
public static void main(String arg[]){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int m=scn.nextInt();
char mz[][]=new char[n][m];
for(int i=0;i<mz.length;i++)
{
String s=scn.next();
for(int j=0;j<s.length();j++)
{
mz[i][j]=s.charAt(j);
}
}
int sn[][]=new int[n][m];
solution(mz,0,0,sn);
if(f==false)
{
System.out.println("NO PATH  FOUND");
}
} 
static boolean f=false;
public static void solution(char [][]mz,int cr ,int cc,int sn[][])
{
if(cr==mz.length-1&&cc==mz[0].length-1&&mz[cr][cc]!='X')
{
sn[cr][cc]=1;
f=true;
display(sn);
return ;

}
if(cr<0||cc<0||cr>=mz.length||cc>=mz[0].length||mz[cr][cc]=='X')
{
return ;
}
int []r={-1,1,0,0};
int []c={0,0,1,-1};
mz[cr][cc]='X';
sn[cr][cc]=1;
for(int i=0;i<c.length;i++)
{
solution(mz,cr+r[i],cc+c[i],sn);
}
mz[cr][cc]='O';
sn[cr][cc]=0;

}
public static void display(int [][] sn)
{
for(int i=0;i<sn.length;i++)
{
for(int j=0;j<sn[0].length;j++)
{
System.out.print(sn[i][j]+" ");
}
System.out.println();
}
}
}
//rat cheses its
import java.util.*;
public class Main {
public static void main (String args[]) {
Scanner scn=new Scanner(System.in);
String s=scn.next();
// TreeSet<Character>tr=new TreeSet<>();
// String ans="";
// for(int i=0;i<s.length();i++){
//     tr.add(s.charAt(i));
// }
// for(char st:tr){
//     ans=ans+st;
// }
String ans=removeDuplicateLetters(s);
System.out.print(ans);
}

public static  class Node{         
int val;        
boolean vis;         
Node(int val,boolean vis){             
this.val = val;             
this.vis = vis;        
}   
}    
public static String removeDuplicateLetters(String s) {        
Map<Character,Node> map = new HashMap<>();         
for(char ch : s.toCharArray()){             
int temp = 1;            
if(map.containsKey(ch)){                 
temp = map.get(ch).val+1;             
}             

map.put(ch,new Node(temp,false));        
}        
StringBuilder sb = new StringBuilder();         
for(char ch: s.toCharArray()){             
if(map.containsKey(ch)){                 
if(!map.get(ch).vis){                    
int temp = map.get(ch).val;                    
temp--;                    
if(temp != 0)map.put(ch,new Node(temp,true));                   
else map.remove(ch);                        
while(sb.length() != 0 && ch < sb.charAt(sb.length()-1) && map.containsKey(sb.charAt(sb.length()-1))){                            
char c = sb.charAt(sb.length()-1);                             
map.put(c,new Node(map.get(c).val,false));                               
sb.deleteCharAt(sb.length()-1);                         
}                    
sb.append(ch);                 
}else{                     
int temp = map.get(ch).val-1;                    
if(temp != 0)map.put(ch,new Node(temp,true));                    
else map.remove(ch);                
}             
}        
}        
return sb.toString();     } }



//monu bhaiya
import java.util.*;
public class Main {
public static void main(String arg[]){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int m=scn.nextInt();
char mz[][]=new char[n][m];
for(int i=0;i<mz.length;i++)
{
String s=scn.next();
for(int j=0;j<s.length();j++)
{
mz[i][j]=s.charAt(j);
}
}
int sn[][]=new int[n][m];
solution(mz,0,0,sn);
if(f==false)
{
System.out.println(-1);
}
} 
static boolean f=false;
public static void solution(char [][]mz,int cr ,int cc,int sn[][])
{
if(cr==mz.length-1&&cc==mz[0].length-1&&mz[cr][cc]!='X')
{
sn[cr][cc]=1;
f=true;
display(sn);
return ;

}
if(cr<0||cc<0||cr>=mz.length||cc>=mz[0].length||mz[cr][cc]=='X')
{
return ;
}
if(f==false){
int []r={0,1};
int []c={1,0};
mz[cr][cc]='X';
sn[cr][cc]=1;
for(int i=0;i<c.length;i++)
{
solution(mz,cr+r[i],cc+c[i],sn);
}
mz[cr][cc]='O';
sn[cr][cc]=0;
}

}
public static void display(int [][] sn)
{   
for(int i=0;i<sn.length;i++)
{
for(int j=0;j<sn[0].length;j++)
{
System.out.print(sn[i][j]+" ");
}
System.out.println();
}
}
}
//rat in maz
import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
toh( n , "A","B","C");
}
public static void toh(int n, String s1,String s2,String s3){
if(n==0)
return ;
toh(n-1,s1,s3,s2);
System.out.println("Moving ring "+n+" from "+s1+" to "+ s2);
toh(n-1,s3,s2,s1);
}
}
// tower
package DSA_Hackathon;


public class NQueen {
public static void main(String[] args) {
int[][]arr=new int[4][4];

int tq=4;
print(arr,tq,0);

}

private static void print(int[][] arr, int tq, int row) {
if (tq==0) {
Display(arr);
}
if (row == arr.length) {
return;
}

for (int col = 0; col < arr.length; col++) {
if (check(arr,row,col)) {
arr[row][col]=1;
print(arr, tq-1, row+1);
arr[row][col]=0;


}

}
}

private static boolean check(int[][] arr, int row, int col) {

int r=row;
int c=col;
// col
while (r>=0) {
if (arr[r][c]==1) {
return false;

}
r--;

}
r=row;
c=col;
while (r>=0 && arr[0].length>c) {
if (arr[r][c]==1) {
return false;
}
r--;
c++;


}
r=row;
c=col;
while (r>=0 &&c>=0) {
if (arr[r][c]==1) {

return false;
} 
r--;
c--;
}
return true;

}
private static void Display(int[][] board) {

for (int i = 0; i < board.length; i++) {
for (int j = 0; j < board.length; j++) {
if (board[i][j]==1) {


System.out.print("{"+(i+1)+ "-"+(j+1) +"}"+" ");
}

}
}
System.out.print("  ");

}
}
//Nqueen
package DSA_Hackathon;


public class NQueen {
public static void main(String[] args) {
int[][]arr=new int[4][4];

int tq=4;
print(arr,tq,0);

}

private static void print(int[][] arr, int tq, int row) {
if (tq==0) {
Display(arr);
}
if (row == arr.length) {
return;
}

for (int col = 0; col < arr.length; col++) {
if (check(arr,row,col)) {
arr[row][col]=1;
print(arr, tq-1, row+1);
arr[row][col]=0;


}

}
}

private static boolean check(int[][] arr, int row, int col) {

int r=row;
int c=col;
// col
while (r>=0) {
if (arr[r][c]==1) {
return false;

}
r--;

}
r=row;
c=col;
while (r>=0 && arr[0].length>c) {
if (arr[r][c]==1) {
return false;
}
r--;
c++;


}
r=row;
c=col;
while (r>=0 &&c>=0) {
if (arr[r][c]==1) {

return false;
} 
r--;
c--;
}
return true;

}
private static void Display(int[][] board) {

for (int i = 0; i < board.length; i++) {
for (int j = 0; j < board.length; j++) {
if (board[i][j]==1) {


System.out.print("{"+(i+1)+ "-"+(j+1) +"}"+" ");
}

}
}
System.out.print("  ");

}
}
//mapped String
import java.util.*;
public class Main {
public static void main(String args[]) {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for (int i = 0; i < n; i++) {
arr[i]=sc.nextInt();

}
int idx=sc.nextInt();
List<Integer> list=new ArrayList<>();
List<List> ans=new ArrayList<>();
print(arr,0,idx,list,ans);
// System.out.println(ans);
}

private static void print(int[] arr, int lp,int idx, List<Integer> list, List<List> ans) {

if (idx==0) {
for (int i = 0; i < list.size(); i++) {
System.out.print(" "+list.get(i));
// System.out.print(" ");

}
System.out.print("  ");
ans.add(new ArrayList<>(list)); 
}


for (int i = lp; i < arr.length; i++) {
list.add(arr[i]);
print(arr, i+1, idx-arr[i], list, ans);
list.remove(list.size()-1);
}
}
}
//subset



import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String a=sc.next();
String str="";
for (char i = 0; i < a.length(); i++) {
char ch=(char) (97+i);
str=str+ch;

}


ArrayList<String> list=new ArrayList<>();
print(str,"",list);
// System.out.println(list);
int b= list.indexOf(a);
for (int i = 0; i < b; i++) {
System.out.println(list.get(i));

}
}

private static void print(String str, String ans, ArrayList<String> list) {
if (str.length()==0) {
//    System.out.println(ans);
list.add(ans);
return;
}

for (int i = 0; i < str.length(); i++) {

print(str.substring(0, i)+str.substring(i+1), ans+str.charAt(i), list);
}
}
}
//dic

//sudoku
import java.util.*;
public class Main {
public static void main(String args[]) {
// Your Code Here

Scanner scanner = new Scanner(System.in);
int N = scanner.nextInt();
int[][] board = new int[N][N];


for (int i = 0; i < N; i++) {
for (int j = 0; j < N; j++) {
board[i][j] = scanner.nextInt();
}
}


if (solveSudoku(board)) {

printBoard(board);
} else {
System.out.println("No solution exists.");
}
}

private static boolean solveSudoku(int[][] board) {
int N = board.length;
for (int row = 0; row < N; row++) {
for (int col = 0; col < N; col++) {
if (board[row][col] == 0) {
for (int num = 1; num <= 9; num++) {
if (isValid(board, row, col, num)) {
board[row][col] = num;
if (solveSudoku(board)) {
return true;
}
board[row][col] = 0;
}
}
return false;
}
}
}
return true;
}

private static boolean isValid(int[][] board, int row, int col, int num) {
for (int i = 0; i < 9; i++) {
if (board[row][i] == num || board[i][col] == num || board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
return false;
}
}
return true;
}

private static void printBoard(int[][] board) {
int N = board.length;
for (int i = 0; i < N; i++) {
for (int j = 0; j < N; j++) {
System.out.print(board[i][j] + " ");
}
System.out.println();
}
}}
//single in engineering
import java.util.*;
public class Main {
public static void main (String args[]) {

Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int[] heights = new int[n];
for (int i = 0; i < n; i++) {
heights[i] = scanner.nextInt();
}
int x = scanner.nextInt();

int maxHeight = getMaxSawBladeHeight(heights, x);
System.out.println(maxHeight);
}

public static int getMaxSawBladeHeight(int[] heights, int x) {
int left = 1;
int right = Arrays.stream(heights).max().getAsInt();

while (left < right) {
int mid = left + (right - left + 1) / 2;
long woodCut = totalWoodCut(heights, mid);

if (woodCut >= x) {
left = mid;
} else {
right = mid - 1;
}
}

return left;
}

private static long totalWoodCut(int[] heights, int height) {
long totalWood = 0;
for (int h : heights) {
totalWood += Math.max(0, h - height);
}
return totalWood;


}
}
//keypad

import java.util.*;

public class Main {

private static final String[] keyPad = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};

public static int countWo(String str) {
if (str == null || str.length() == 0)
return 0;

List<String> result = new ArrayList<>();
Helper(str, "", result);
return result.size();
}

public static void print(String str) {
if (str == null || str.length() == 0)
return;

List<String> result = new ArrayList<>();
printWordsHelper(str, "", result);
for (String word : result) {
System.out.print(word + " ");
}
System.out.println();
System.out.println(result.size());
}

private static void Helper(String digits, String current, List<String> result) {
if (digits.isEmpty()) {
result.add(current);
return;
}

int digit = Character.getNumericValue(digits.charAt(0)) - 1;
String letters = keyPad[digit];
for (int i = 0; i < letters.length(); i++) {
Helper(digits.substring(1), current + letters.charAt(i), result);
}
}

private static void printWordsHelper(String digits, String current, List<String> result) {
if (digits.isEmpty()) {
result.add(current);
return;
}

int digit = Character.getNumericValue(digits.charAt(0)) - 1;
String letters = keyPad[digit];
for (int i = 0; i < letters.length(); i++) {
printWordsHelper(digits.substring(1), current + letters.charAt(i), result);
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String str = scanner.nextLine().trim();
print(str);
scanner.close();
}
}
//sub sequence

import java.util.*;

public class Main {

public static int subsequences(String str) {
return countSubsequencesHelper(str, str.length());
}

public static void printSubsequences(String str, List<String> ans) {
List<String> result = new ArrayList<>();
printr(str, "", result,ans);



}

private static int countSubsequencesHelper(String str, int length) {
if (length == 0)
return 1;

return 2 * countSubsequencesHelper(str, length - 1);
}

private static void printr(String str, String current, List<String> result, List<String> ans) {
if (str.length() == 0) {
result.add(current);
ans.add(current);
return;
}


printr(str.substring(1), current + str.charAt(0), result, ans);


printr(str.substring(1), current, result, ans);
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
List<String> ans = new ArrayList<>();
String str = scanner.nextLine().trim();
printSubsequences(str,ans);

for (int i = ans.size()-1; i >-1; i--) {


System.out.print(ans.get(i) +" ");}
System.out.println();
System.out.println(ans.size());

}
}
//lexographical

import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int N = input.nextInt();
lexiNumbers(N);
}

public static void lexiNumbers(int n) {
List<String> s = new ArrayList<>();
for (int i = 0; i <= n; i++) {
s.add(Integer.toString(i));
}
Collections.sort(s);
List<Integer> ans = new ArrayList<>();
for (String str : s) {
ans.add(Integer.parseInt(str));
}
for (int i = 0; i <= n; i++) {
System.out.print(ans.get(i) + " ");
}
}
}
//vivek love array game
import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner scn=new Scanner(System.in);
    int t=scn.nextInt();
    while(t-->0)
    {
        int n=scn.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=scn.nextInt();
     System.out.println(output(ar, 0, ar.length-1));
		}
	}
public static int output(int[] ar, int sti, int edi) {	
	int fh=0;
	int sh=0;	
	for(int i=sti; i<edi; i++ ) 	{
		int Sum1=sum(ar, sti, i);
		int Sum2=sum(ar, i+1, edi);
		if(Sum1==Sum2) { 
			 fh=output(ar, sti, i);
			 sh=output(ar, i+1, edi);
			 return Math.max(fh, sh)+1;
			 }
		}
	return 0;
	}
public static int sum(int[] ar, int sti, int edi ) {
	int sum=0;
	for(int i=sti; i<=edi; i++) {
		sum=sum+ar[i];
	}
	return sum;
}
}
//recursion twins
import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
String str = scanner.nextLine();
int count = countTwins(str, 0);
System.out.println(count);
scanner.close();
}

public static int countTwins(String str, int index) {
if (index >= str.length() - 2) {
return 0;
}

int count = 0;
if (str.charAt(index) == str.charAt(index + 2)) {
count = 1 + countTwins(str, index + 1);
} else {
count = countTwins(str, index + 1);
}

return count;

}
}








