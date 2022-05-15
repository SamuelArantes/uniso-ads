import pandas

x = pandas.read_excel(r'''\C:\Uniso\uniso-ads\Projetinhos\pessoas.xlsx''',
sheet_name='pessoas')

print(x)