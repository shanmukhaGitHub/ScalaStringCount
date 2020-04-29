import scala.annotation.tailrec

/**
  * Creating String utils class
  */
case class StringUtils() {


  def myReverse(mylist: List[String]): List[String] = {
    @tailrec
    def iter(mylist: List[String], result: List[String]): List[String] =
      if ( mylist.length== 0)
       result
      else
        iter(mylist.tail, mylist.head::result )

    iter(mylist,Nil)
  }



  def myStringReplace(givenString: String): String={
    var result:String ="";
    var counter =1 ;
    givenString.foreach(f=> {
      if(result.length>0 && result.charAt(result.length-1)==f){
        counter +=1
      }else if(result.length>0 && counter>1) {
        result=result+counter+f
        counter = 1;
      }else{
        result=result+f
      }
    })
    if(counter>1)
      result=result+counter
    return result;
  }

}




