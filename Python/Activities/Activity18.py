import pandas as pd

dataframe = pd.read_csv("write.csv")


print("Full Data: ")
print(dataframe)

print("===============")
print("Usernames:")
print(dataframe["Usernames"])


print("===============")
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])

print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('Usernames'))

print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))