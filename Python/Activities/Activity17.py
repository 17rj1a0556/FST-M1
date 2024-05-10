import pandas

data = {
  "Usernames": ["Charles Leclerc", "Carlos Sainz", "Landon Norris"],
  "Passwords": ["Charles12", "Carlos13", "babylandon23"]
}

dataframe = pandas.DataFrame(data)

print(dataframe)


dataframe.to_csv("sample.csv", index=False)