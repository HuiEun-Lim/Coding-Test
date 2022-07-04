def solution(board, moves):
    answer = 0
    moved = []

    for i in moves:
        for j in range(len(board)):
            if board[j][i-1] != 0:
                moved.append(board[j][i-1])
                board[j][i-1] = 0
                break
        if len(moved) >= 2 and moved[len(moved)-1] == moved[len(moved)-2]:
            moved.pop(-1)
            moved.pop(-1)
            answer += 2

    return answer