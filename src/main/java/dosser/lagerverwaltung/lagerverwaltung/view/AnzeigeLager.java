package dosser.lagerverwaltung.lagerverwaltung.view;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AnzeigeLager {

	private static int reihen = 4;
	private static int spalten = 2;
		
	public static List<Integer[]> anzeige(List<String> liste)
	{
		int z = 0;
		int anzahlItems = liste.size();
		
		System.out.print("  ");
		for(int i = 0; i < spalten;i++)
		{
			System.out.print("|\t"+(i+1)+"\t\t\t\t|");
		}
		
		System.out.println();

		List<Integer[]> positionen = new ArrayList<Integer[]>();


		loop:
		for(int i = 0; i < reihen; i++ )
		{
			if(i<10) System.out.print(" "+(i+1));			
			else  System.out.print((i+1));
			
			for(int y = 0; y < spalten; y++)
			{
				if(z >= anzahlItems) break loop;
				Integer[] position = new Integer[2];
				position[0] = i;
				position[1] = y;
				positionen.add(position);
				//liste.get(z).setPosition(new Position(i,y)); //muss positiion irgendwie anders vergeben

				if(liste.get(z).length() >=12)	System.out.print("| "+ liste.get(z)+"\t|");
				else if(liste.get(z).length() <=6) System.out.print("| "+ liste.get(z)+"\t\t\t|");
				else System.out.print("| "+ liste.get(z)+"\t\t|");
				z++;
			}
			System.out.println();
		}
		
		System.out.println();
		return positionen;
	}

	public static int getReihen() {
		return reihen;
	}
	public static void setReihen(int reihe) {
		reihen = reihe;
	}
	public static int getSpalten() {
		return spalten;
	}
	public static void setSpalten(int spalte) {
		spalten = spalte;
	}
	
}
