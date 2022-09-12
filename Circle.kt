class Circle(_name: String): Shape(_name) {
    private var radius = 0.0;
    fun setDimensions() {
        println("Circle: enter Radius: ")
        radius = readLine()?.toDouble()?: 0.0
    }
    override fun getArea() {
        println("Circle Area: " + Math.PI * radius * radius)
    }
}
