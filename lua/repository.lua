local repository = {}

--[[
Takes a table (of numbers) and returns the sum of all values in the table
--]]
function sumTable(tab)
	sum = 0
	for i=1,#tab do
		if type(tab[i]) == "number" then
			sum = sum + tab[i]
		end
	end
	return sum
end

--[[
Rewrites print to appear in Slot-Constructor output
--]]
function print(n)
	io.stderr:write(tostring(n))
end


function readNum(num)
	local num = tostring(num)
	local positions = {"","thousand","million","billion","trillion","quadrillion","quintillion","sextillion",
	"septillion","octillion","nonillion","decillion"}
	local digits,set = d(num)
	--print(digits.." digits\n")
	if digits then
		local output = ""
		if digits%3 == 0 then
			output = flr(num / 10^(digits - 3))
		else
			output = flr(num / 10^(digits - digits%3))
		end
		
		--print(roof(digits/3).." positions\n")
		return output..positions[roof(digits/3)]
	else
		return num
	end
end

--[[
Splits Number into table of digits
@return length of table, table of digits
--]]
function d(num)
	if tonumber(num) >= 10000000000000 then
		print("Number Too Large To Write Out \n")
		return false
	end
	local num = tostring(num)
	local set = {}
	for letter in string.gmatch(num,"%d") do
		--print("insert "..letter.."\n")
		table.insert(set,letter)
	end
	return #set, set
end

--[[
Concatonates two tables one after the other
@return table tab1 + tab2
--]]
function concat(tab1,tab2)
	assert(type(tab1) == type(tab2),"Cannot concat different types "..type(tab1).." and "..type(tab2))
	assert(type(tab1) == "table","USE .. rather than concat")
	for _,v in ipairs(tab2) do
		table.insert(tab1,v)
	end
	return tab1
end

--takes input (num n) and returns both n! and n
function factorial(n)
	assert(type(n) == "number","NOT A VALID NUMBER FOR FACTORIAL")
	local x = 1
	for i=1,n do
		x = x * i
	end
	--io.stderr:write()
	return x,n
end

--takes input (num n) and returns both n? and n
function summatorial(n)
	assert(type(n) == "number","NOT A VALID NUMBER FOR SUMMATORIAL")
	local x = 0
	for i=1,n do
		x = x + i
	end
	--io.stderr:write()
	return x,n
end

--takes input (num n) and returns both the square root of n and n
function root(n)
	assert(type(n) == "number","NOT A VALID NUMBER FOR ROOT")
	--io.stderr:write()
	return n^0.5, n
end

--takes input(num n) and returns both n rounded up to the next lowest integer and n
function roof(n)
	assert(type(n) == "number","NOT A VALID NUMBER FOR ROOFING")
	--io.stderr:write()
	return math.ceil(n),n
end

--takes input (num n) and returns both n rounded down to the next highest integer and n
function flr(n)
	assert(type(n) == "number","NOT A VALID NUMBER FOR FLOORING")
	--io.stderr:write()
	return math.floor(n),n
end

--takes input (table t and num n) and returns true if n is within t else returns false
function contains(t,n)
	for _, value in ipairs(t) do
		if value == n then
				return true
		end
	end
	--io.stderr:write(type(value).." "..tostring(n).."\n")
	return false
end

return repository
