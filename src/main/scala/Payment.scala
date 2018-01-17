case class PayType(typ: String)

class Payment {

  def amount(paytype: PayType, amt: Double): Double = {
    paytype.typ.toLowerCase match {
      case "paytm" | "freecharge" => amt + amt * 2 / 100
      case "netbalancing" => amt + 5
      case "card pay" => amt + 1.5
      case "cash" => amt
      case _ => -1
    }
  }
}


object prac extends App {
  val obj = new Payment
  val on = PayType("paytm")
  print(obj.amount(on, 1000))
}

