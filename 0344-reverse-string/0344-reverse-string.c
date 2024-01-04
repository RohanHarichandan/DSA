void reverseString(char* s, int sSize) {
    int i=0;
    int j=sSize-1;
    while(i<j){
       char a=s[i];
        s[i]=s[j];
        s[j]=a;
        i++;
        j--;
    }
}