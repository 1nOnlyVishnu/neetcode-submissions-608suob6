import math

class Solution:
    def calculateHours(self, piles: List[int], speed: int) -> int:
        totalHours = 0

        for pile in piles:
            totalHours += (pile + speed - 1) // speed
            # or: math.ceil(pile / speed)

        return totalHours

    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        start = 1
        end = max(piles)

        while start <= end:
            mid = start + (end - start) // 2

            totalHours = self.calculateHours(piles, mid)

            if totalHours <= h:
                end = mid - 1
            else:
                start = mid + 1

        return start