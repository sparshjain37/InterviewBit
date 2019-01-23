int Solution::trap(const vector<int> &a) {
     int ans = 0, i = 0;
    stack<int> st;
    while (i < a.size()) {
        while (!st.empty() && a[i] > a[st.top()]) {
            int top = st.top();
            st.pop();
            if (st.empty())
                break;
            int distance = i - st.top() - 1;
            int bounded_height = min(a[i], a[st.top()]) - a[top];
            ans += distance * bounded_height;
        }
        st.push(i++);
    }
    return ans;
    
}
