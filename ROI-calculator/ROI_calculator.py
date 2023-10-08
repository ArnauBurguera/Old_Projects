#Shift + alt + A = comment whole selection
Income = float(input("Income: "))
Expenses = float(input("Expenses: "))

def bnfts():
  Benefits = round(Income - Expenses, 2)
  return Benefits

print(f"Benefits: {bnfts()}")

#def bnfts_expns_ratio():
#  ratio = round(((Income / Expenses) * 100) - 100, 2)
#  return ratio
# Per alguna raó matemàgica que no arribo a comprendre, això em dona el mateix que el ROI

#print(f"Benefits/Expenses ratio: {bnfts_expns_ratio()}%")

def roi():
  ROI = round(((Income - Expenses) / Expenses), 2)
  return ROI

print(f"Roi: {roi()}")