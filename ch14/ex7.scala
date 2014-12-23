object ex7 {
  def main(args: Array[String]) {
    val leaf = Node(
                Node(Leaf(3), Leaf(8)),
                Leaf(2),
                Node(Leaf(5)))
    assert(leafSum(leaf) == 18)
  }

  def leafSum(leaf: BinaryTree): Int = leaf match {
    case Leaf(value) => value
    case Node(leaf, leafs @ _*) => leafSum(leaf) + leafs.map(leafSum).sum
  }

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(leafs: BinaryTree*) extends BinaryTree
}
