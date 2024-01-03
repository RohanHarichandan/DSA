class Solution(object):
    def numberOfBeams(self, bank):
        ans=0
        prev=0
        for row in bank:
            dev=row.count('1')
            if dev>0:
                ans+=dev*prev
                prev=dev
        return ans


        