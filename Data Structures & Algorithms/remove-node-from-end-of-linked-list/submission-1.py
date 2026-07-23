# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy_node = ListNode(-1)
        dummy_node.next = head

        leader_node = dummy_node
        trailer_node = dummy_node

        for _ in range(n):
            leader_node = leader_node.next

            if leader_node is None:
                return head
            
        
        while leader_node.next:
            leader_node = leader_node.next
            trailer_node = trailer_node.next

        
        trailer_node.next = trailer_node.next.next

        return dummy_node.next