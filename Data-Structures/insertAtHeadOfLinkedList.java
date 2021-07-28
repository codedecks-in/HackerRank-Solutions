

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        
        newNode.next = llist;
        llist = newNode; //considering llist is the pointer to head node
        
        return newNode;
    }

