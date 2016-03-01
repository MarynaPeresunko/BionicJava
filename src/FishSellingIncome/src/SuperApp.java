import java.time.LocalDate;
import java.util.Arrays;

public class SuperApp {
	public static void main(String[] args) {
		FishSaleOperation[] selling = new FishSaleOperation[10];

		selling[0] = new FishSaleOperation("mahimahi", 16.55, LocalDate.of(2016,2,28), 20.86, LocalDate.of(2016,2,29), 3.00);
		selling[1] = new FishSaleOperation("dolphinfish", 12.85, LocalDate.of(2016,2,23), 18.56, LocalDate.of(2016,2,29), 5.05);
		selling[2] = new FishSaleOperation("mahimahi", 16.55, LocalDate.of(2016,2,12), 20.60, LocalDate.of(2016,2,25), 9.80);
		selling[3] = new FishSaleOperation("dolphinfish", 13.00, LocalDate.of(2016,2,2), 20.06, LocalDate.of(2016,2,4), 3.625);
		selling[4] = new FishSaleOperation("salmon", 6.53, LocalDate.of(2016,2,29), 10.65, LocalDate.of(2016,2,24), 2.56);
		selling[5] = new FishSaleOperation("dolphinfish", 17.15, LocalDate.of(2016,2,6), 23.45, LocalDate.of(2016,2,8), 2.305);
		selling[6] = new FishSaleOperation("lobsters", 52.50, LocalDate.of(2016,2,3), 65.05, LocalDate.of(2016,2,5), 6.90);
		selling[7] = new FishSaleOperation("hake", 5.06, LocalDate.of(2016,2,23), 10.65, LocalDate.of(2016,2,27), 1.76);
		selling[8] = new FishSaleOperation("mahimahi", 14.05, LocalDate.of(2016,2,14), 19.45, LocalDate.of(2016,2,16), 1.89);
		selling[9] = new FishSaleOperation("lobsters", 46.25, LocalDate.of(2016,2,28), 52.65, LocalDate.of(2016,2,29), 23.02);

		int totalOps = selling.length;

		String income[] = new String[totalOps];
		for (int i = 0; i < totalOps; i++) {
			income[i] = selling[i].getFishName() + " " + selling[i].calculateIncome();
		}
		Arrays.sort(income);

		String fn[] = new String[totalOps];		
		double nameTotalIncome[] = new double[totalOps];
		double incomeValue = 0;
		String nameIncomePair[] = new String[2];
		for (int i = 0, j = 0; i < totalOps; i++ ){
			nameIncomePair = income[i].split(" ");
			incomeValue = Float.parseFloat(nameIncomePair[1]);
			if ( i > 0 && !fn[j].equalsIgnoreCase(nameIncomePair[0]) ) {
				j += 1;
			}
			fn[j] = nameIncomePair[0];
			nameTotalIncome[j] += incomeValue;	
		}
		income = null;

		for ( int i = 0; fn[i] != null; i++) {
			nameTotalIncome[i] = Math.round(nameTotalIncome[i]*100) / 100.0;
		}

		IncomeStatement is = new IncomeStatement (fn, nameTotalIncome);
		is.printIncomeStatement();	
	}
}