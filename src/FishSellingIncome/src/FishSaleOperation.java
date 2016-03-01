/* Given an array of objects which contains information about one operation of fish sale:
 - name of fish
 - price of purchase (PP)
 - date of purchase
 - price of sale(PS)
 - date of sale
 - sale weight (W)
Create an Income Statement grouped by fish names. 
Income value is calculated as:
  Income = (PS – PP – store_days*const) * W
Here const is some value that contains overheads */

import java.time.*;
import java.time.temporal.*;

public class FishSaleOperation {
	private static final double CONST = 0.17;
	
	private String fn; 		// fn - name of fish
	private double pp;		// pp - price of purchase 
	private LocalDate pd;	// pd - date of purchase
	private double ps;		// ps - price of sale;
	private LocalDate sd; 	// sd - date of sale;
	private double w; 		// w - sale weight;
	private int storeDays;
	
	public FishSaleOperation() {};
	public FishSaleOperation(String fn, double pp, LocalDate pd, double ps, LocalDate sd, double w) {
		
		if (pd.isAfter(sd) ) {
			   throw new Exception("Incorrect Date of Purchase or Date of Sale. Date of Sale should be after Date of Purchase");
			  }
			
		this.fn = fn;
		this.pp = pp;
		this.pd = pd;
		this.ps = ps;
		this.sd = sd;
		this.w = w;
		this.storeDays = (int) (pd.until(sd, ChronoUnit.DAYS)+ 1);
	}
	
	public String getFishName() {
		return fn;
	}
	public void setFishName(String fn){
		this.fn = fn;
	}
	public double getPriceOfPurchase() {
		return pp;
	}
	public void setPriceOfPurchase(double pp) {
		this.pp = pp;
	}
	public LocalDate getDateOfPurchase() {
		return pd;
	}
	public void setDateOfPurchase(LocalDate pd){
		this.pd = pd;
	}
	public double getPriceOfSale() {
		return ps;
	}
	public void setPriceOfSale(double ps){
		this.ps = ps;
	}
	public LocalDate getDateOfSale() {
		return sd;
	}
	public void setDateOfSale(LocalDate sd) {
		this.sd = sd;
	}
	public double getSaleWeight() {
		return w;
	}
	public void setSaleWeight(double w) {
		this.w = w;
	}
	public int getStoreDays() {
		return storeDays;
	}
	public static double getOverheads() {
		return CONST;
	}
	public double calculateIncome() {
		return (ps - pp - storeDays * CONST) * 1000 * w;
	}
}