# Tourists Pairing Problem


import heapq
###
# heapq is a binary min heap implementation in Python. It is used to implement priority queues.
# info about heapq: https://docs.python.org/3/library/heapq.html
# info about heapq: https://www.geeksforgeeks.org/heap-queue-or-heapq-in-python/
# ####


def convert_to_int(list):
    """Convert a list of strings to a list of integers."""
    return map(lambda x: int(x), list)


def get_T_S():
    """Read the input file and return the list of tourists and the list of vehicles."""
    data_points = open("tourists_input.txt", "r").read().splitlines()
    T = data_points[0].split(" ")
    S = data_points[1].split(" ")
    T = convert_to_int(T)
    S = convert_to_int(S)

    return T, S


def build_max_hep(S):
    """Build a max heap from the list S and return it."""
    S = [-s for s in S]
    heapq.heapify(S)
    print(S)
    return S


def find_min_vehicles(T, S):
    """Find the minimum number of vehicles needed to transport all tourists."""
    S = build_max_hep(S)
    total_tourists = sum(T)
    count = 0
    while total_tourists > 0:
        count += 1
        total_tourists += heapq.heappop(S)
    print(count)
    return count


T, S = get_T_S()
find_min_vehicles(T, S)
