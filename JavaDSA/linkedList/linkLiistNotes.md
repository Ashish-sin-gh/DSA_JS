# Linked List

### Defination :

Linked List is a type of data structure of `unfixed` that can store any type of datatype (Object) in a `non-contagious` manner in `heap`.

### How linkList is able to store unlimited elements?

---

unlike Array- which is a contagious data structure i.e. stores element one after the other in the heap location (4000,4001,4002...) hence it will require to have next address empty as if next address is not free, it wont be possible to enter new element in the heap.

> but in linked list - element is stored in a non-contagious manner hence data can be stored in any random address in the heap.

### How we traverse in a link list?

---

**`linkList node - data(element) + next(pointer to the address of next node)`**

this `next` helps the node to know where is the next guy in the linked list and the next node has address of next node and so on.

> The last node has next as null | last = null pointer

## Where Linked list is used?

### In data Structure:

used to implement Stack and queue

### In real life:

#### used in a browser

eg:
Google search tab -> Instagram.com -> open instagram messenger -> open user chat box  
One can move betn above process in a tabs by forward and back button and also added new process to it, hence it is an example of linked list.

### Important operation on Linked list

#### array to LinkedList

> time complexity -> `O(n)`

Always remember to `assign new reference` variable for the linked list head and then work on that new reference variable

#### traverse in LinkedList

> time complexity -> `O(n)`

#### Length of the linked List

> time complexity -> `O(n)`
