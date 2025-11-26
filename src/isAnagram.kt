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
                if(stringMap.getValue(i) != secondStringMap[i]){
                    return false
                }
            }else{
                return false
            }
        }
    }
    return true
}
fun main(){
    print(isAnagram(s = "rat", t = "car"))
}