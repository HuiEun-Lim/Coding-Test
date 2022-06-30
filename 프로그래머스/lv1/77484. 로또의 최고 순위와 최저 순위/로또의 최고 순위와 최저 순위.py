def solution(lottos, win_nums):
    answer = []
    cnt = 0
    zero = 0
    
    for i in lottos:
        if i == 0:
            zero += 1
            
        elif i in win_nums:
            cnt += 1
    
    def rank(answer, count):
        if count == 6:
            answer += [1]
        elif count == 5:
            answer += [2]
        elif count == 4:
            answer += [3]
        elif count == 3:
            answer += [4]
        elif count == 2:
            answer += [5]
        else:
            answer += [6]
            
    rank(answer, cnt+zero)        
    rank(answer, cnt)
        
                
    
    return answer
