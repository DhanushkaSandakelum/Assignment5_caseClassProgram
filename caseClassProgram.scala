object caseClassProgram extends App {
	case class Point(a: Int, b: Int) {
		def x: Int = a
		def y: Int = b
	}

	// ADD
	val add = (p: Point, q: Point) => new Point(p.x + q.x, p.y + q.y)
	
	// MOVE
	val move = (p: Point, dx: Int, dy: Int) => new Point(p.x + dx, p.y + dy)

	// DISTANCE
	def distance(p: Point, q: Point): Double = {
		val dist = Math.sqrt(Math.pow((p.x - q.x), 2) + Math.pow((p.y - q.y), 2)).toDouble
		dist
	}

	//INVERT
	val invert = (p: Point) => new Point(p.y, p.x)


	/* Declare Points */
	val p1 = new Point(1, 4)
	val p2 = new Point(4, 8)
	println("p1 is " + p1)
	println("p2 is " + p2)

	/* Adding */
	var p3 = add(p1, p2)
	println("p1 = p2 + p3 = " + p3)

	/* Moving */
	p3 = move(p3, 5, 6)
	println("p3 moved by (5, 6) then new p3 is " + p3)

	/* Taking the distance */
	val d = distance(p1, p2)
	println("Distance of p1 and p2 is " + d)

	/* Inverting */
	p3 = invert(p3)
	println("p3 is inverted and new p3 is " + p3)
}