

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int index) {

        if (head == null) {
            return new SinglyLinkedListNode(data);
        }
        
        SinglyLinkedListNode currHead = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        int count = 0;

        if (count == index) {
            newNode.next = currHead;
            return newNode;
        }

        while (count < index-1) {
            currHead = currHead.next;
            count++;
        }
        
        SinglyLinkedListNode temp = currHead.next;
        currHead.next = newNode;
        newNode.next = temp;

        return head;
    }

