fun containsDuplicates(nums : Array<Int> ): Boolean{
    return nums.size != nums.toSet().size
}
fun main(){
    print(containsDuplicates(arrayOf(1,4,2,3)))
}