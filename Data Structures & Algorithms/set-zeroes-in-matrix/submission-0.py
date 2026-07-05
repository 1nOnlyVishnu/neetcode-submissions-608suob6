class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        if not matrix or not matrix[0]:
            return
        
        m = len(matrix)
        n = len(matrix[0])

        zero_rows = set()
        zero_cols = set()

        for r in range(m):
            for c in range(n):
                if matrix[r][c] == 0:
                    zero_rows.add(r)
                    zero_cols.add(c)

        
        for r in range(m):
            for c in range(n):
                if r in zero_rows or c in zero_cols:
                    matrix[r][c] = 0

        
        
        