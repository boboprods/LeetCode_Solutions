# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def numComponents(self, head, nums):
        """
        :type head: ListNode
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        if head == None:
            return count
        if head.next == None and head.val in nums:
            count+=1
            return count
        ptr = head
        while ptr:
            if ptr.val in nums:
                if ptr.next == None or ptr.next.val not in nums:
                    count+=1
            ptr = ptr.next
        return count