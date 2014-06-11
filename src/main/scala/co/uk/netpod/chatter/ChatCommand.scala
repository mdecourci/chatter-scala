package co.uk.netpod.chatter

import scala.util.control.Breaks._
import java.io.BufferedReader
import java.io.InputStreamReader

object ChatCommand {
  
  var application: ChatterApplication = new ChatterApplication();

  def main(args: Array[String]) {
    
    val in = new BufferedReader(new InputStreamReader(System.in));
    
    breakable {
      while (true) {
        println("> ");
        if (in.readLine() == "") break;
      }
    }

	  val firstArg = if (args.length > 0) args(0) else "";
    val secondArg = if (args.length > 1) args(1) else "";

    if (secondArg.isEmpty()) {
      println("Second argument is mandatory");
    }
    
    firstArg match {
      case "posting" => application.post(secondArg, args(2));
      case "reading" => application.read(secondArg);
	      	case "following" => 
	      	case "wall" => 
	        }
  }
  
  def processLine(line : String) : String = {
    val response = "";
    return response;
  }
}
