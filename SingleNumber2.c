int singleNumber(const int* A, int n1) {
    int i,sum=0,j;
    for(i=0;i<32;i++)
    {
        int count=0;
        for(j=0;j<n1;j++)
        {
            if(A[j]&(1<<i))
            {
                count++;
            }
            
        }
        count=count%3;
        if(count)
        {
            sum=sum|(1<<i);
        }
    }
    return sum;
}
