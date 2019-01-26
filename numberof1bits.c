int numSetBits(unsigned int A) {
    int c=0;
    while(A)
    {
        if(A&1==1)
        {
            c++;
        }
        A=A>>1;
    }
    return c;
}
