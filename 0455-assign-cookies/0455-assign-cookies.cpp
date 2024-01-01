class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        
         std::sort(g.begin(), g.end());
        std::sort(s.begin(), s.end());
        int contentChildren = 0;
        int cookieIndex = 0;
        while (cookieIndex < s.size() && contentChildren < g.size()) {
            if (s[cookieIndex] >= g[contentChildren]) {
                contentChildren++;
            }
            cookieIndex++;
        }
        return contentChildren;
    }
};