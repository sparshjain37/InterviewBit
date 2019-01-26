public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int max=A.get(0)+A.get(1)+A.get(2);
        for(int i=0;i<A.size();i++)
        {
            int target=B-A.get(i);
            int k=i+1;
            int l=A.size()-1;
            int newmax;
            while(k<l)
            {
                int x=A.get(k);
                int y=A.get(l);
                newmax=x+y+A.get(i);
                if(x+y==target)
                {
                    return B;
                }
                
                else if(x+y>target)
                {
                    
                    l--;
                }
                else
                {
                    k++;
                }
                if(B-max>B-newmax)
                {
                    max=newmax;
                }
            }
            
        }
        return max;
        }
    }
