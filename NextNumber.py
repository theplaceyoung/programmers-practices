# 다음에 올 숫자

def solution(common):
    answer = 0
    if (common[1] * 2 == common[0] + common[2]):
        answer = common[len(common)-1] + common[2] - common[1]
    else:
        answer = common[len(common)-1] * common[2] / common[1]
    return answer