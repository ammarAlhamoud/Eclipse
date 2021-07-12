package schiffe_versenkt_V5;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

public class SchiffeField_Panal  extends Panel
	{private int zeilen, spalten;
	public SchiffeField_Panal(int ss_zeilen, int ss_spalten) 
	{
	this.zeilen = ss_zeilen;
	this.spalten = ss_spalten;
	int i=0 , j=0;
	boolean marker = false;
	Button schiff_button;
	setLayout(new GridLayout(zeilen,spalten));
	
	
	while(i<zeilen) 
		{while(j < spalten) 
			{for(Schiff i_schiff : Schiffsverwalter.lst_schiffe)
				{for(Schiffsteil i_schiffsteil : i_schiff.lst_schiffsteil)
					while((i==i_schiffsteil.getX_pos()) &&
							(j == i_schiffsteil.getY_pos()) && !marker)
						{schiff_button = new Button(""+i_schiff.schiffsart()+
								"(" + i + " , "+ j + ")");
						schiff_button.setBackground(Color.GREEN);
						add(schiff_button);
						marker = true;
						}	
				}
			if(marker)
				{j = j+1;
				marker = false;
				}
			else
				{add(new Button("("+(i)+" , "+(j)+")"));	
				j = j+1;
				}
			}
		i = i+1;
		j = 0;
		}
	}			
	
	}
