class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map = {}
        # key -- actual num
        # value -- frequency of the key

        result = []

        for num in nums:
            freq_map[num] = freq_map.get(num, 0) + 1

    #  nums = [2,4,4,5,5,5]
        
        keys = list(freq_map.keys()) #[2,4,5]
        values = list(freq_map.values()) # [1,2,3]

        for i in range(k):
            max_value = max(values)
            index = values.index(max_value)# values[3] = 2


            element = keys[index]

            result.append(element)

            values.pop(index)
            keys.pop(index)

        
        return result






