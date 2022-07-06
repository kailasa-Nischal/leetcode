public ListNode deleteDuplicates(ListNode head) {
      if(head==null)  return null;
        ListNode slow=head,fast=head.next;
        while(fast!=null){
          if(slow.val==fast.val){
            fast=fast.next;
            slow.next=fast;
          }
          else{
            slow=slow.next;
            fast=fast.next;
          }
        }
        return head;
    }
