class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        freq_map_s = {}
        for char in s:
            freq_map_s[char] = freq_map_s.get(char,0) + 1
        
        freq_map_t = {}

        for char in t:
            freq_map_t[char] = freq_map_t.get(char,0) + 1

        
        return freq_map_s == freq_map_t
        