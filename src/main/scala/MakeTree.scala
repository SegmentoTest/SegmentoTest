class MakeTree {

  case class Point(id: String, parentId: String)

  case class Node(point: String, children: Seq[Node])

  def createTree(points: Seq[Point]): Map[String, List[_]] = {
    var pointsList = Map[String, List[String]]().withDefaultValue(Nil)
    var childrenSet: Set[String] = Set()

    //create Map as parent-List(child1, child2, child3...)
    for (point <- points) {
      point.id match {
        case currentPoint if ((!pointsList(point.parentId).contains(currentPoint)) &&
          (currentPoint != point.parentId)
          ) => pointsList += point.parentId -> (pointsList(point.parentId):+point.id)
        case _ =>
      }
      childrenSet += point.id
    }

    //all points with children
    val edgesList = pointsList.keySet
    //all points without parent
    val finalEdges = edgesList.diff(childrenSet)

    //function to create nested Map
    def nest(ns: List[String]): List[Map[String,List[_]]] =
      ns.map(a => Map(a -> nest(pointsList.getOrElse(a,Nil))))
    val allRelations = pointsList.map{case (k,v) => k -> nest(v)}

    //stay only with finalEdges
    val result = allRelations.view.filterKeys(finalEdges).toMap
    result
  }

}
