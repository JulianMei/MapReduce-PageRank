//import UnitMulplication.*
//import UnitSum.*
// Why don't we need to import the classes?


public class Driver {
    
	public static void main(String[] args) throws Exception {
		// Don't forget to instantiate both classes!
		UnitMultiplication multiplication = new UnitMultiplication();
        UnitSum sum = new UnitSum();
		//args0: dir of transition.txt
        //args1: dir of PageRank.txt
        //args2: dir of unitMultiplication result
        //args3: times of convergence
	    String transitionMatrix = args[0];
        String prMatrix = args[1];
        String unitState = args[2];
        int count = Integer.parseInt(args[3]);
		
		
		for(int i = 0; i < repeatCount; i++) {
		    String[] input1 = {transitionMatrix, prMatrix+i, unitState+i};  // Don't forget (unitState+i)!
            UnitMulplication.main(input1);
			String[] input2 = {unitState+i, prMatrix+(i+1)};
			UnitSum.main(input2);
		}
	}

}