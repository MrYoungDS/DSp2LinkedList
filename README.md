# <code>DSp2LinkedList</code> Linked List Project

For this assignment you will implement a linked list of integers.

This time we implement the list data structure using linked nodes instead of an array, a choice which has significant
implications for coding and also efficiency. There are also a few different variations on linked lists and the structure
of the node objects that make up the list. For this project we will implement a singly-linked list (so each node
"points" to the next node in the list). This makes the <code>addLast</code> method less efficient, and the
<code>addFirst</code> method much more efficient.

As another change to mix things up a bit, each element of our linked list will be a big-I <code>Integer</code>
(as opposed to a little-i <code>int</code>). With autoboxing, there is not **too** much difference. The main thing
is that an array of <code>Integer</code>s initializes every entry to <code>null</code>, so this project will also
have methods that throw a <code>NullPointerException</code>. Again, you will likely want to add an instance field
to keep track of the size of the list.

It may help you to start by implementing the simple methods size, clear, and isEmpty, then addFirst, get, and set.
This will get the first test working, and you can proceed with addLast, add, and remove, finishing with indexOf
and contains. Just a suggestion.  ; )
