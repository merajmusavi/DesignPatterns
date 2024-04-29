package observer

class StockMarket : Subject {
    val list = mutableListOf<Observer>()
    lateinit var stockSymbol: String
    var stockPrice: Int = 0

    fun setData(stockSymbol: String, stockPrice: Int) {
        this.stockSymbol = stockSymbol
        this.stockPrice = stockPrice
        notify1()
    }

    override fun registerObserver(observer: Observer) {
        list.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        list.remove(observer)
    }

    override fun notify1() {
        for (observer in list) {
            observer.update(stockPrice,stockSymbol)
        }
    }
}