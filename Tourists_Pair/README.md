# Tourists Pairing

Tourism Development Corporation of Bali provides transportation services to groups of tourists traveling to the same destination for sightseeing. They have a fleet of different cars available which have different seating capacities respectively. For a given group of tourists, they want to calculate the number of vehicles required to efficiently accommodate all tourists. Since it's a free-of-cost service and all the tourists are traveling to the same destination, the company wants the vehicles to be filled up to their maximum capacity and they want to use as few vehicles as they can to minimize the operational cost.

There are two arrays given as input:

• T[] which represents the tourist array that contains the number of tourists in each group

• S[] which represents the seating capacities array that contains the number of seats available in each vehicle

Write a function that, given two arrays T[ ] of tourists and S[] of seating capacities, consisting of integer elements, returns the minimum number of

vehicles needed to accommodate all the passengers.

Given:

• Each element of arrays T and S is an integer within the range [1....100]

• T[K] <= S[K] for each K within the range [0..N-1]

## Input

The input will be read from a file. The filename/path is passed to your program as the first command-line argument. The file will have two integer arrays, T[] and S[]. The first line of the file will contain a list of tourists and the second line will contain a list of seating capacities in each vehicle.

## Output

The output will be an integer. (Minimum number of vehicles needed)

## Examples:

### Example 1.

Given T = [4, 4, 2, 4] and S = [5, 5, 2, 5], the function should return 3.

### Explanation:

5 tourists from group number 0 and 1 can travel in car number 0 with 5 seating capacity.

5 tourists from group number 1 and 2 can travel in car number 1 with 5 seating capacity.

The remaining 4 tourists can travel in car number 3 with 5 seating capacity.

### Example 2.

Given P = [2, 3, 4, 2] and S = [2, 5, 7, 2], the function should return 2.

### Explanation:

5 tourists from group number 0 and 1 can travel in car number 1 with 5 seating capacity.

6 tourists from group number 2 and 3 can travel in car number 2 with 7 seating capacity.
