public class IncomeStatement {
	private static final int CAPACITY = 100;

	private String[] fn = new String[CAPACITY];
	private double[] income = new double[CAPACITY];
	private int position = 0;

	public IncomeStatement () {}

	public IncomeStatement(String[] fn, double[] income) {
		int len = fn.length;
		for ( int i = 0; i < len && fn[i] != null; i++ ) {
			this.fn[i] = fn[i];
			this.income[i] = income[i];
			this.position +=1;
		}
	}
	public void printIncomeStatement() {
		System.out.printf("FISH NAME\tINCOME\n");
		System.out.println("-------------------------");

		for ( int i = 0; i < position; i++ ) {
			System.out.printf("%11s\t%.2f\n", fn[i], income[i]);
		}
	}
}