package observer

class StockTrader:Observer  {

   lateinit var traderName:String
        private set

    public constructor(traderName: String) {
        this.traderName = traderName
    }


    override fun update(price: Int, product: String) {
        println(traderName+ "   "+ price + "  " + product)
    }
}