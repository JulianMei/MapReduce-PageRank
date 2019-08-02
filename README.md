# MapReduce-PageRank
Implemented a page rank algorithm using Hadoop MapReduce.

A page rank vector can be calculated by multiplying the Transition Matrix with an older page rank vector, iteratively, until the page rank vector converges. 

![alt text](https://github.com/JulianMei/MapReduce-PageRank/blob/master/PageRank_MapReduce.png)

Two Map Reduce are used together to perform the calculation:
1. UnitMultiplication contains two mappers and one reducer, it is aimed to perform the matrix multiplications.

2. UnitSum contains one mapper and one reducer, it is aimed to perform the sum of matrix multiplication results.

Input comes from text files, output is a text file containing the page rank results calculated based on input.
