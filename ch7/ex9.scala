object ex9 {
  import java.lang.System._

  def main(args: Array[String]) {
    val username = getProperty("user.name")
    val password = new String(System.console.readPassword("Enter password: "))

    if (password == "secret") out.println("Greeting " + username) else err.println("Invalid password")
  }
}
