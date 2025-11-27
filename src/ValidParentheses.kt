import java.util.Stack
/**
 * first we remove from our algorithm cases that will end up wrong like
 * if the string length is odd
 * or if the first string character is closing one
 * then we check if the charter of type key we push it into the stack if not if the stack is empty then it should return false because that means we reach a point the stack does not have start char
 * else we pop from rhw stack is the value of the map equals to char we continue
 * we check that stack it is not empty at the end then return false else true*/
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