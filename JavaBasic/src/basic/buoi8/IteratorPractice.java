package basic.buoi8;

import java.util.*;

public class IteratorPractice
{
	/**
	 * Random number int
	 *
	 * @param from
	 * @param to
	 * @return
	 */
	public double random(double from, double to)
	{
		Random random = new Random();
		double temp;
		do
		{
			temp = random.nextDouble();
		} while (temp < from || temp > to);
		return temp;
	}

	public int getFraction(double a)
	{
		return Integer.parseInt(String.valueOf(a).substring(String.valueOf(a).indexOf(".")+1,String.valueOf(a).indexOf(".")+2));
	}

	public void show(List<Double> lists){
		for (Double d : lists){
			System.out.println(d);
		}
	}

	public void run(){
		// init list
		List<Double> numbers = new ArrayList<>();
		for(int i = 0; i< 11; i++){
			numbers.add(random(-100,120));
		}

		// show
		show(numbers);

		//remove
		ListIterator i = numbers.listIterator();
		while(i.hasNext()){
			Double d = (Double) i.next();
			if(getFraction(d) >= 0 && getFraction(d) <=4){
				i.remove();
			}
			if(d < 101){
				i.add(random(-100,120));
			}
		}
		System.out.println("-----------");

		//
		show(numbers);




	}

	public static void main(String[] args)
	{
		new IteratorPractice().run();
	}
}
