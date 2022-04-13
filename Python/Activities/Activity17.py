# Import pandas
import pdb
import pandas as pd

data = {
  "Usernames": ["admin", "neeru", "radha"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

dataframe = pd.DataFrame(data)

print(dataframe)

dataframe.to_csv("write.csv", index=False)