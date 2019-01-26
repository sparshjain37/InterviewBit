/**
 * @input A : Read only ( DON'T MODIFY ) Integer array
 * @input n1 : Integer array's ( A ) length
 * 
 * @Output Integer
 */
int singleNumber(const int* A, int n1) {
    int i=0,n=0;
    for(i=0;i<n1-1;i++)
    {
        n=n^A[i]^A[i+1];
    }

    return n;
}
