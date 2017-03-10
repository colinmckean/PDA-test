class Pda {
  //for testing access modifiers need to be public.
  public boolean func1(int val){
    // to check if equality we need to use ==;
    if(val == 1){
      return true;
    }else{
      return false;
    }
  }
//private was spelled incorrectly, for tests to run needs to be public
  public int max(int a, int b){   //parameters need to be comma seperated.
    if(a > b){
      return a;
    }else{
      return b;
    }
  }

  public int looper(){
    int i = 0;
    while(i < 10){ //to have checkLoop pass, we requre loop to to only increment by 1 while i is less than 10.
      i++;
    }
    return i; //return statement needs to be moved outside of loop.
  } 

//body of method has return statements, method signiture needs to have return type rather than void.
  public String checkLoop(){
    if (looper() == 10){ //looper is a function call not a variable so requires ()
      return "looper passed"; //return statement needs to end with semi colon.
    }else{
      return "looper failed";
    }
  }     //missing bracket at the end, to ensure that last function, conditional and class is closed.
}
