# Tourists Pairing Problem

import heapq


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


T = [2, 3, 4, 2]
S = [2, 5, 7, 2]
find_min_vehicles(T, S)
