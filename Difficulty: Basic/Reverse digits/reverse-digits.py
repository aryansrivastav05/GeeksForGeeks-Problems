#User function Template for python3

class Solution:
	def reverseDigits(self, n):
	    rev = 0
		while(n>0):
		    last = n%10
            rev = rev * 10 + last
            n = n//10
        return rev    

#{ 
 # Driver Code Starts
# Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        n = int(input())
        ob = Solution()
        ans = ob.reverseDigits(n)
        print(ans)

        print("~")

# } Driver Code Ends