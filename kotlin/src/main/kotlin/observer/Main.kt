package observer

fun main(){
    val s = StockMarket()
    val t = StockTrader("meraj")
    s.registerObserver(t)
    t.update(12,"chips")
}