public class PracticeProblem{
	static int find(int[] array, int number){
		for(int i = 0; i < array.length; ++i){
			if(array[i] == number){
				return i;
			}
		}
		return -1;
	}

	static int findLast(String[] array, String string){
		for(int i = array.length-1; i > -1; --i){
			if(array[i] == string){
				return i;
			}
		}
		return -1;
	}

	static int findSecond(char[] array, char character){
		int first = -1;
		for(int i = 0; i < array.length; i++){
			if(array[i] == character){
				if(first == -1){
					first = i;
				}else{
					return i;
				}
			}
		}
		return first;
	}

	public static void main(String args[]){}
}
