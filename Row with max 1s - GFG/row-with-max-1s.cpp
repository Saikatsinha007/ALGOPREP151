//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++
class Solution{
public:
	int rowWithMax1s(vector<vector<int> > arr, int N, int M) {
	    // code here
	 int maxOnes = 0;
    int maxOnesRowIndex = -1;

    // Traverse each row
    for (int i = 0; i < N; ++i) {
        int onesCount = 0;

        // Count the number of 1's in the current row
        for (int j = 0; j < M; ++j) {
            if (arr[i][j] == 1) {
                onesCount++;
            }
        }

        // Update maxOnesRowIndex if the current row has more 1's
        if (onesCount > maxOnes) {
            maxOnes = onesCount;
            maxOnesRowIndex = i;
        }
    }

    return maxOnesRowIndex;
}

};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        vector< vector<int> > arr(n,vector<int>(m));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin>>arr[i][j];
            }
        }
        Solution ob;
        auto ans = ob.rowWithMax1s(arr, n, m);
        cout << ans << "\n";
    }
    return 0;
}

// } Driver Code Ends