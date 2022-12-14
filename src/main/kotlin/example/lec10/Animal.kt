package example.lec10

abstract class Animal(
    protected val species: String,
    // Kotlin에서 프로퍼티를 override할 때, 추상 프로퍼티가 아니라면 상속받을 때 open을 꼭 붙여야 한다
    protected open val legCount: Int
) {

    abstract fun move()
}