case class Point(a: Int, b: Int)
{
    def x = a
    def y = b

    def add(p: Point) = Point(this.x + p.x, this.y + p.y)

    def move(dx: Int, dy: Int) = {
        Point(this.x + dx, this.y + dy)
    }

    def distance(p: Point) = {
        val dx = this.x - p.x
        val dy = this.y - p.y
        math.sqrt(dx * dx + dy * dy)
    }

    def invert() = Point(this.y, this.x)

    override def toString(): String = {
        "(" + x + ", " + y + ")"
    }
}

object O1 extends App{
    val p1 = Point(1, 2)
    val p2 = Point(2, 3)
    println(p1)
    println(p2)
    println("P1+P2: "+ p1.add(p2))
    println(p1.move(2, 3))
    println("Distance between P1 and P2: "+p1.distance(p2))
    println(p1.invert())
}