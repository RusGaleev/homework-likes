var likes = 1234
fun main(){
    println(countLikes(likes))
}

fun countLikes(likes: Int):String{
    if (likes <= 0 ) {return ""}
    return "Понравилось $likes ${when(likes % 1000 % 100 / 10) {
        0 -> "человеку"
        in 1..9 -> "людям"
        else -> ""}}"
}