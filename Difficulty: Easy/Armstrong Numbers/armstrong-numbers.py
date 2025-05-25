#User function Template for python3

class Solution:
    def armstrongNumber (self, n):
        originalNum = n
        sum = 0
        while(n>0):
            last = n%10
            sum = sum + pow(last , 3)
            n=n//10
        if(originalNum == sum):
            return True
        else:
            False