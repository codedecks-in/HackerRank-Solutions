// only compareLists method
static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2)    {
        while(head1 != null || head2 != null){
            
            if(head1 == null || head2 == null){
                return false;
            }
            
            if(head1.data != head2.data){
                return false;
            }
            
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
