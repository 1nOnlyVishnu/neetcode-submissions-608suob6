class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}

        # x + y = target => y = target - x
        # 2 + y = 5 ==> y = 5 - 2 ===> 3
        # nums array and target [1,2,3,4]


        # HashMap = {num : index}

        for index,num in enumerate(nums):
            y = target - num
            if y in map:
                return [map[y] , index]
            else:
                map[num] = index
            

        return []


