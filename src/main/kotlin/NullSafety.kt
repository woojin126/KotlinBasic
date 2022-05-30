fun main() {
    val a: String = "meoru"  // 먼저, let 함수를 사용할 객체를 선언합니다.

    a.let { str -> str.plus("1"); print(str)}

    var str:String? = "asd"
    str?.let { str = "-teck" }?: run { str= "meoru" }
}