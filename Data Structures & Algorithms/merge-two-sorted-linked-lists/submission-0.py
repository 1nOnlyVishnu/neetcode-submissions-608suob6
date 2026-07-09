# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        t1 = list1
        t2 = list2
        dummy = ListNode(-1)
        temp = dummy

        while t1 != None and t2 != None:
            if t1.val < t2.val:
                temp.next = t1
                temp = t1
                t1 = t1.next
            else:
                temp.next = t2
                temp = t2
                t2 = t2.next
        
        if t1 == None:
            temp.next = t2
        else:
            temp.next = t1
        
        return dummy.next
            
        