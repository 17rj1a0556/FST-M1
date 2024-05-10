
def Sumtotal(num):
  if num<=1:
    return 0
  else:
    return num + Sumtotal(num-1)

total = Sumtotal(10)

# Print result
print(total)