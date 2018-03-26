import java.util.Arrays;

public class splitt {

	public static void main(String[] args) {
		
		String getText = "פבר'";
		String allNamesMonth[] = {"none", "Jan ינו'", "Feb פבר'", "Mar מרץ", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int clickOnThisMonth = 0;
		boolean isHere = false;
		
		while (isHere == false) {
			clickOnThisMonth++;
			isHere = allNamesMonth[clickOnThisMonth].contains(getText);
		}
	
		
		
		System.out.println(clickOnThisMonth);
	}

}
