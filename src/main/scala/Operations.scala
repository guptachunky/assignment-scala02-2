class Operations {
def meth(): Unit ={
  print("mnfbs")

}
}
object test extends App{
  val obj=new Operations
  obj.meth
  val map=scala.collection.mutable.Map("scala"-> 2,"java"->5,"kafka"->6)
  val n=map.getOrElse("java")
  map.put("java",6)
  println(n)
  print(map)
}
