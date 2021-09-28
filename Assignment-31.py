
def areAnagram(str1, str2):
	n1 = len(str1)
	n2 = len(str2)
    
	if n1 != n2:
		return 0

	str1 = sorted(str1)
	str2 = sorted(str2)

	for i in range(0, n1):
		if str1[i] != str2[i]:
			return 0

	return 1

#driver code
str1 = "listen"
str2 = "silent"
str3 = "slniet"

if areAnagram(str1, str2) and areAnagram(str1,str3):
	print("The three strings are anagram of each other")
else:
	print("The three strings are not anagram of each other")
