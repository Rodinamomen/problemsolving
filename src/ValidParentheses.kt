import java.util.Stack

fun isValid(s: String): Boolean {
    val map = mutableMapOf<Char, Char>('(' to ')', '[' to ']', '{' to '}')
    val stack = Stack<Char>()
    if (s.length% 2 != 0) return false
   if (s.first() in map.values) return false
    for (i in s ){
        if (i in map.keys){
            stack.push(i)
        }else if (i in map.values){
            if(stack.isNotEmpty()){
                if (i != map[stack.pop()]) return false
            }else{
                return false
            }

        }
    }
    if(stack.isNotEmpty())  return false
    return true
}
fun main() {
    print(isValid(s= "(("))
}