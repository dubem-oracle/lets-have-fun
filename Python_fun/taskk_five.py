sum = 0
average = 0
for number in range (1,11):
    score = int(input("Enter a score: "))
    if score % 2 == 0:
        sum += score
    
print(f"Sum: {sum}")
