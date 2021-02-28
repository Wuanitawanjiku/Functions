fun main(){
    name ()
    var result =module(21,10)
    println(result)
    var numbers =sum( x=19, y=22, z=20, t=21)
    println(numbers)
    me()

}
fun name (){
    var name ="Wuanita"
    println("Hello Wuanita")
}
    fun module (a:Int,b:Int):Int{
        var mode = a % b
        return mode
    }
fun sum (x:Int,y:Int,z:Int,t:Int) :Int{
    var sum=(x+y+z+t)
    return sum

}
fun me (){
    var interesting ="I like drinking hot water"
    println (interesting)
}