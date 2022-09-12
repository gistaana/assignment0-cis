class Square(_name:String): Shape(_name) {
    private var length = 0.0;
    private var height = 0.0;
    fun setDimensions() {
        println("Square: enter Length: ")
        length = readLine()?.toDouble()?: 0.0
        println("Square: enter Height: ")
        height = readLine()?.toDouble()?: 0.0
    }
    override fun getArea() {
        println("Square Area: " + length * height);
    }

    override fun printDimensions(): Int {
        TODO("Not yet implemented")
    }
}
