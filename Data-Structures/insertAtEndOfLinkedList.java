

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        
        if (head == null){
            return newNode;
        }
        SinglyLinkedListNode currHead = head;

        while(currHead.next != null){
            currHead = currHead.next;
        }
        currHead.next = newNode;
        newNode.next = null;

        return head;
    }

