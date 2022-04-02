var likes = 310
fun main(){
    println(countLikes(likes))
}

fun countLikes(likes: Int):String{
    if (likes <= 0 ) {return ""}
    return "Понравилось $likes ${
        when (likes % 100) {
            10, 11 -> "людям"
            else -> when(likes % 10) {
                0, 1 -> "человеку"
                in 2..9 -> "людям"
                else -> ""}}
        }"
}