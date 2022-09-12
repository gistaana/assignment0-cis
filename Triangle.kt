abstract class Triangle(_name: String): Shape(_name) {
    private var first = 0.0;
    private var second = 0.0;
    private var third = 0.0;
    private var s = 0.5;
    fun setDimension() {
        println("Triangle: First side: ")
        first = readLine()?.toDouble() ?: 0.0
        println("Triangle: Second side: ")
        second = readLine()?.toDouble() ?: 0.0
        println("Triangle: Third side: ")
        third = readLine()?.toDouble() ?: 0.0
    }

    override fun getArea(): Int {
        println("Triangle Area: " + Math.sqrt(s * ( s - first) * (s - second) * (s - third)))
    }
}
