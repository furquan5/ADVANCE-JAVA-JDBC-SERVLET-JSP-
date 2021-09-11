package test;
public class EmpSalary //SubClass
{
	float TOTSAL;
	public void cal(Float BSAL)
	{
		TOTSAL = BSAL+(0.93F*BSAL)+(0.63F*BSAL);

	}
	public void getTOTSAL()
	{
		System.out.println("TotSal"+TOTSAL);
	}
}