class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for index, num in enumerate(nums):
            complement = target - num
            
            if complement in seen:
                return [seen[complement],index]
            else:
                seen[num] = index
        
        return[]