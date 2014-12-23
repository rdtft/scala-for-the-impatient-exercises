object ex6 {
  def main(args: Array[String]) {
    val leaf = Node(Node(Leaf(3), Leaf(8)), Leaf(2))
    assert(leafSum(leaf) == 13)
  }

  def leafSum(leaf: BinaryTree): Int = leaf match {
    case Node(left, right) => leafSum(left) + leafSum(right)
    case Leaf(value) => value
  }

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree
}
