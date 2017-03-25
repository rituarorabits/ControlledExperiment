package gameBoard;

public class initializeBoard {
  boolean checkValidity(Snake s){
	if(  s.startPosition>s.endPosition)
	{
	   return true;
	}
	
	else
	{
		return false;
	}
  
	  
  }
  
  void initSnakes(Snake s)
  {
	  try{
		  Snake a= new Snake(12,13,2);
		  
	  }
	  
	  catch(IllegalArgumentException e){}
  }
	
}
