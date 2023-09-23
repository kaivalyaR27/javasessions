import java.util.*;
import java.io.*;
import java.lang.*;
class Queue{
int front,rear,capacity;
private static int queue[];
Queue(int size){
front=rear=0;
capacity=size;
queue=new int[capacity];
}
static void queueEnqueue(int item){
if(capacity==rear){
System.out.println("queue is full");
return;
}
else{
queue[rear]=item;
rear++;
}
return;
}
static void queueDequeue(){
if(front==rear){
System.out.println("Already the queue is empty");
return;
}
else{
for(int i=0;i<rear-1;i++){
queue[i]=queue[i+1];
}
if(rear<capacity){
queue[rear]=0;
rear--;
}
return;
}
void queuedisplay(){
int i;
if(front==rear){
System.out.println("Empty queue");
return;
}
for(i=front;i<rear;i++){
System.out.println("%d",queu[i]);
}
return;
}
   }  

public class queueprogram{
public static void main(String args[]){
Queue q=new Queue(4);
q.queuedisplay();
q.queueEnqueue(10);
q.queueEnqueue(10);
q.queueEnqueue(10);
System.out.println("queue after enqueue");
q.queuedisplay();
q.queueDequeue();
q.queueDequeue();
System.out.println("after dequeue");
q.queuedisplay();
}
}

