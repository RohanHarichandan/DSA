int strStr(char* haystack, char* needle) {
    int sizeH=strlen(haystack), sizeN=strlen(needle), flag=0,i,j;
    for(i=0;i<sizeH-sizeN+1;i++)
    {
        if(haystack[i]==needle[0]){
            int firstIndex=i;
            flag=0;
            for(j=0;j<sizeN;j++){
                if(haystack[firstIndex+j]!=needle[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return firstIndex;
            }
        }
    }
    return -1;
}