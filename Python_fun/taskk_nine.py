sum = 0
for number in range (1,11):
    score = int(input("Enter a score: "))
        
    if score > 0 and score < 100:
        sum += score
    
print(f"Sum: {sum}")

			
