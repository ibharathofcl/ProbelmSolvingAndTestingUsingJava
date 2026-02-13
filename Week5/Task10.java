#include<bits/stdc++.h>using namespace std;

class Task10 {
public:
    
    long long getMin(vector<int>& arr) {
        long long mn = LLONG_MAX;
        for (int x : arr)
            mn = min(mn, (long long)x);
        return mn;
    }

    bool canAchieve(vector<int>& arr, int n, int k, int w, long long target) {
        
        vector<long long> diff(n + 1, 0);
        long long waterUsed = 0;
        long long currAdd = 0;
        
        for (int i = 0; i < n; i++) {
            
            currAdd += diff[i];
            long long currentHeight = arr[i] + currAdd;
            
            if (currentHeight < target) {
                long long need = target - currentHeight;
                waterUsed += need;
                
                if (waterUsed > k)
                    return false;
                
                currAdd += need;
                
                if (i + w < n)
                    diff[i + w] -= need;
            }
        }
        
        return true;
    }

    int maxMinHeight(vector<int>& arr, int n, int k, int w) {
        
        long long low = getMin(arr);
        long long high = low + k;
        long long ans = low;
        
        while (low <= high) {
            long long mid = low + (high - low) / 2;
            
            if (canAchieve(arr, n, k, w, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return (int)ans;
    }
};

int main() {
    Task10 obj;
    
    int n, k, w;
    cin >> n;
    
    vector<int> arr(n);
    for(int i = 0; i < n; i++)
        cin >> arr[i];
    
    cin >> k >> w;
    
    cout << obj.maxMinHeight(arr, n, k, w);
    
    return 0;
}