class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        # n = len(nums)
        # ans = []
        # for i in range(2):
        #     for num in nums:
        #         ans.append(num)
        
        # return ans

        n = len(nums)
        ans = [None] * ( 2 * n)
        for i in range(n):
            ans[i] = nums[i]
            ans[i + n] = nums[i]

        return ans
