import pandas as pd
df=pd.DataFrame(
    [
        [1.3,1.4,1.5],
        [2.6,3.4,4.6],
        [2.1,4.5,6.6],
    ],
    columns=["a","b","c"],
    index=["x","y","z"],
)
xml_data=["<root>"]
for column in df.columns:
    xml_data.append(f"{field}>{df[column][field]}</{field}>")
    xml_data.append(f"</{column}>")
    xml_data.append("</root>")

    with open("coordinates.xml","w") as f:
        for line in xml_data:
       f.write(line)