class Hello(greeting: Option[String]) {
    val maybeGreeting = greeting

    def greet(): Unit = {
        val someGreeting = maybeGreeting match {
            case None => "Hello, %s".format(Hello.greeting)
            case Some(g) => "Hello, %s".format(g)
        }

        println(someGreeting)
    }
}

object Hello {
    val greeting = "world";
}

object Main extends App {
    val helloClass = new Hello(Some("Reuben"))
    val helloCompanion = new Hello(None)

    println("Using constructor parameters")
    helloClass.greet()

    print("\n")

    println("Defaulting to companion object")
    helloCompanion.greet()
}

