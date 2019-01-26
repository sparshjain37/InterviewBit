unsigned int reverse(unsigned int A) {
    unsigned long int x=0;
    int i=0,j=0;
    for(i=31;i>=0;i--)
    {
        int a=A&(1<<j);
        j++;
        if(a)
        {
            x=x|(1<<i);
        }
    }
 return x;   
}
