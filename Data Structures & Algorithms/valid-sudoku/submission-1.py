class Solution:

    def validBox(self, board: List[List[str]], sr: int, er: int,sc: int, ec: int)-> bool:
        seen = set()
        for i in range(sr, er + 1):
            for j in range(sc, ec + 1):
                if board[i][j] == '.':
                    continue
                if board[i][j] in seen:
                    return False
                seen.add(board[i][j])

        return True
 
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for row in range(9):
            seen = set()
            for col in range(9):
                if board[row][col] == '.':
                    continue
                if board[row][col] in seen:
                    return False
                else:
                    seen.add(board[row][col])


        for col in range(9):
            seen = set()
            for row in range(9):
                if board[row][col] == '.':
                    continue
                if board[row][col] in seen:
                    return False
                else:
                    seen.add(board[row][col])

        
        for sr in range(0,9,3):
            er = sr + 2
            for sc in range(0,9,3):
                ec = sc + 2
                if not self.validBox(board,sr,er,sc,ec):
                    return False

        return True
                
        