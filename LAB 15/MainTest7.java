n = int(input())
arr = list(map(int, input().split()))

count = 0
for x in arr:
    if x % 2 == 0:
        count += 1

print(count)
