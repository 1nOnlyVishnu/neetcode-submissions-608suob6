class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map = {}

        for num in nums:
           freq_map[num] = freq_map.get(num,0) + 1
        
        keys = list(freq_map.keys())
        values = list(freq_map.values()) #frequency 

        result = []

        for i in range(k):
            max_val = max(values)
            index = values.index(max_val)

            element = keys[index]

            result.append(element)

            values.pop(index)
            keys.pop(index)

        
        return result