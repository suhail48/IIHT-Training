x = {
	 "2":"Two","1":"One","5":"Five"
	 }

y = sorted(x.items(), key=lambda x: x[1], reverse=False)

t=dict(y)
print(t)
