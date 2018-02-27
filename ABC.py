a=int(input())
for i in range(a):
    b,c,d=map(int,input().split())
    print("Case #"+str(i+1)+": true" if b+c>d else "Case #"+str(i+1)+": false")
