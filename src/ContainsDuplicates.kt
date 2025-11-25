fun containsDuplicates(nums : Array<Int> ): Boolean{
    var disArr = emptyArray<Int>()
    for(i in nums.indices){
        if(disArr.contains(nums[i])){
            return true
        }else{
            disArr = disArr.plus(nums[i])
        }
    }
    return false
}
fun main(){
    print(containsDuplicates(arrayOf(1,4,2,3)))
}