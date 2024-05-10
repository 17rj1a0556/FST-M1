import pandas

dataframe = pandas.read_csv("sample.csv")

print("Total Data ")
print(dataframe)

print("--------------------")
print("Usernames:")
print(dataframe["Usernames"])

print("--------------------")
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])

print("--------------------")
print("Usernames sorted in ascending :")
print(dataframe.sort_values('Usernames'))

print("--------------------")
print("Passwords sorted in descending :")
print(dataframe.sort_values('Passwords', ascending=False))