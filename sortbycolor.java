void sortColors(int* A, int n1) {
    int i,a[3]={0};
    for(i=0;i<n1;i++)
    {
        a[A[i]]++;
    }
    int k=0;
    for(i=0;i<n1;i++)
    {
        if(a[k]!=0)
        {
            A[i]=k;
            a[k]--;
        }
        else
        {
            k++;
            A[i]=k;
            a[k]--;
        }
    }
}
    
