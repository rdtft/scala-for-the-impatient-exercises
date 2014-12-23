object ex8 {
  def main(args: Array[String]) {
    // (3 * 8) + 2 + (-5) = 21
    val leaf = (Node
      ('+',
        Node('*',
          Leaf(3),
          Leaf(8)),
        Leaf(2),
        Node('-',
          Leaf(5))))

    assert(eval(leaf) == 21)
  }

  def eval(leaf: BinaryTree): Int = leaf match {
    case Leaf(value) => value
    case Node('-', leafs @ _*) => -leafs.map(eval).sum
    case Node('*', leafs @ _*) => leafs.map(eval).product
    case Node(_, leafs @ _*) => leafs.map(eval).sum
  }

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(operator: Char, leafs: BinaryTree*) extends BinaryTree
}
