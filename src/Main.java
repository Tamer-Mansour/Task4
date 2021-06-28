public class Main {

    public static void main(String[] args) {
	int i,sum = 0,sum_ar=0;
	for (i=0;i<255;i++){
	    sum_ar +=i;
        //System.out.println(sum_ar);
        //System.out.println(i);

        if ((i % 2) != 0) {
            sum += i;
            // System.out.println(sum);
            //System.out.println(i);

        }
    }
	int X[] ={1,3,5,7,9,11};
	int b;
	for(b=0; b < X.length;b++){
        //System.out.println(X[b]);
    }
        //System.out.println("*************************************");


	int max= X[0] ;
	for (int n=1 ; n<X.length;n++)
	    if (X[n]>max)
	        max=X[n];
        //System.out.println(max);

		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		int sqr;
		for (int q :numbers){
			System.out.println(q*q);
		}
		//sqr =numbers[0]*numbers[0];
		//System.out.println(sqr);

		int sum_2 = 0;
		for(int k=0; k < numbers.length ; k++)
			sum_2 +=numbers[k];
		double average = sum_2 / numbers.length;
		//System.out.println(average);

		int y ;
		for (y=0 ;y<255;y++){
			if ((y % 2) != 0) {
				//System.out.println(y);
			}
		}


	}

}
