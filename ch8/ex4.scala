object ex4 {
  def main(args: Array[String]) {
    val bundle = new Bundle()
    bundle << new SimpleItem(15, "Book")
    bundle << new SimpleItem(1, "Pen")
    bundle << new SimpleItem(5, "Glass")

    assert(bundle.price == 21)
    assert(bundle.description == "Book, Pen, Glass")
  }

  abstract class Item {
    def price: Double
    def description: String
  }

  class SimpleItem(val price: Double, val description: String) extends Item

  class Bundle extends Item {
    private var _items = new scala.collection.mutable.ArrayBuffer[Item]()

    def price = _items.map(_.price).sum
    def description = _items.map(_.description).mkString(", ")

    def << (item: Item) = _items += item
  }
}
