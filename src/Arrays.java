import javax.swing.JOptionPane;
public class Arrays {
	public static void main (String args []) {
		
		String willUgo[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"} ;
		
		int will[] = {1,2,3,4,5,6,7,8,9,10};
		
		int utopian[] = {1,2,3,4,5,6,7,8,9,10};
		
		int ugo[] = {2016,2017,2018,2019,2020,2021};
		
		JOptionPane.showMessageDialog(null, "The date is " + willUgo[0] + "  " + will[6] + "/ " + utopian[0] + " / " + ugo[2]);
	}
}
