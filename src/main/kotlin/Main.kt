fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    /*val game : VideoPoker = VideoPoker()
    var hand : MutableList<CARD> = mutableListOf()
    val checker : CheckCard = CheckCard()

    game.GenerateCARDForTest()
    game.PrintHand()
    game.ChangeHand()
    game.PrintHand()
    hand = game.GetHand()

    checker.Sorting(hand)
    checker.PrintHandCheck(hand)*/
    var game : VideoPoker = VideoPoker()
    game.TotalProbability()
}