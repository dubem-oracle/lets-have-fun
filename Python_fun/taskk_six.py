sum = 0
average = 0
even_counter = 0
for number in range (1,11):
    score = int(input("Enter a score: "))
    if score % 2 == 0:
        even_counter+=1
        sum += score
average = sum / even_counter
print(f"Average: {average}")
			
