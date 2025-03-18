public class PracticeProblem{
	static int find(int number, int[] array){
		for(int i = 0; i < array.length; ++i){
			if(array[i] == number){
				return i;
			}
		}
		return -1;
	}

	static int findLast(String string, String[] array){
		for(int i = array.length-1; i > -1; --i){
			if(array[i] == string){
				return i;
			}
		}
		return -1;
	}

	static int findSecond(char character, char[] array){
		boolean first = false;
		for(int i = 0; i < array.length; i++){
			if(array[i] == character){
				if(!first){
					first = true;
				}else{
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String args[]){}
}
