class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for index, num in enumerate(nums):
            y = target - num

            if y in seen:
                return [seen[y], index]
            else:
                seen[num] = index
            
        return []
        