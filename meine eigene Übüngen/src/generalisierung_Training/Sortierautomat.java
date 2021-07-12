package generalisierung_Training;

public class Sortierautomat<T> {
	
	public <T> void sort(T[] ss_t_objekte,Comparator<T>
									ss_Comparator){
		for(int i = 0;i<ss_t_objekte.length-1;i++) {
			for(int j=i+1; j<ss_t_objekte.length;j++) {
				if(ss_Comparator.compare(ss_t_objekte[j], ss_t_objekte[i])<0) {
					T w_objekt = ss_t_objekte[j];
				}
			}
		}
		
	}

}
