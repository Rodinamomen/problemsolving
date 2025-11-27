fun isAnagram(s: String, t: String): Boolean {
    val stringMap : MutableMap<Char, Int> = mutableMapOf()
    val secondStringMap : MutableMap<Char, Int> = mutableMapOf()
    for(i in s){
        if (stringMap.keys.contains(i)){
            stringMap[i] = stringMap.getValue(i)+1
        }
        else{
            stringMap[i] = 1
        }
    }
    for(i in t){
        if (secondStringMap.keys.contains(i)){
            secondStringMap[i] = secondStringMap.getValue(i)+1
        }
        else{
            secondStringMap[i] = 1
        }
    }
    if(stringMap.size!= secondStringMap.size) {
        return false
    }else{
        for(i in stringMap.keys){
            if(secondStringMap.keys.contains(i)){
                if(stringMap.getValue(i) != secondStringMap.get(i)){
                    return false
                }
            }else{
                return false
            }
        }
    }
    return true
}
// Optimized one remove from the same map + if they are not equal form the start do not check them
/*
* class Solution {
    fun isAnagram(s: String, t: String): Boolean {
   if(s.length != t.length) return false
    val stringMap : MutableMap<Char, Int> = mutableMapOf()
    for(i in s){
        if (stringMap.keys.contains(i)){
            stringMap[i] = stringMap.getValue(i)+1
        }
        else{
            stringMap[i] = 1
        }
    }
    for(i in t){
        if (stringMap.keys.contains(i)){
            stringMap[i] = stringMap.getValue(i)-1
        }
        else{
            return false
        }
    }
    for (i in stringMap.keys){
        stringMap[i]?.let {
            if (it >0){
                return false
            }
        }

    }
    return true
}
}*/
fun main(){
    print(isAnagram(s = "anagram", t = "anagram"))
}