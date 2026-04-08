class Solution {
  public:
    void sort012(vector<int>& arr) {
        // code here
        int zero=0;
        int one = 0;
        int two =0;
        for(auto ele : arr){
            if(ele==0) zero++;
            if(ele==1) one++;
            if(ele==2) two++;
        }
        int i=0;
        while(zero){
            arr[i]=0;
            i++;
            zero--;
        }
        while(one){
            arr[i]=1;
            i++;
            one--;
        }
        while(two){
            arr[i]=2;
            i++;
            two--;
        }
        
    }
};