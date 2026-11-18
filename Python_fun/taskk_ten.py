sum = 0
average = 0
for number in range (1,11):
    score = int(input("Enter a score: "))
        
    if score > 0 and score < 100:
        sum += score
    average = sum / 10
    
print(f"Average: {average}")

			
