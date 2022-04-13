
import pandas as pd
from pandas import ExcelWriter


data = {
	'FirstName':["neeru", "radha", "mahi"],
	'LastName':["b", "k", "y"],
	'Email':["neerub@example.com", "radhak@example.com", "mahi.y@example.com"],
	'PhoneNumber':["4537827658", "5892184058", "6528727830"]
}

dataframe = pd.DataFrame(data)


print(dataframe)

writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)


writer.save()