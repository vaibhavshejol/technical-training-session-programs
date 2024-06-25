class SeparateEvenOddNumbers {
    public static void main(String[] args) {
        int[] input={20,12,23,17,7,8,10,2,1,0};
        int temp[]=new int[input.length];
        
        int evenIndex=0;
        int oddIndex=input.length-1;
        for(int i=0;i<input.length;i++){
            if(input[i]%2==0){
                temp[evenIndex++]=input[i];
            }
            else{
                temp[oddIndex--]=input[i];
            }
        }
        
        evenIndex=0;
        oddIndex=input.length-1;
        int output[]=new int [input.length];
        for(int i=0;i<input.length;i++){
            if(temp[i]%2==0){
                output[evenIndex++]=temp[i];
            }
            else{
                output[oddIndex--]=temp[i];
            }
        }
        
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
}