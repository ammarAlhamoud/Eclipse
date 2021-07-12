package graphische_Componente;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

public class BewegteKugel extends Panel {
	private Image imageClip;
	private Graphics graphics_imageClip;
	private Thread kugelbewegung;
	private boolean isBewegungsende;
	private int x = 17;
	private int y = 17;
	
	public static void main(String[] args) 
		{BewegteKugel b = new BewegteKugel();
		Frame f = new Frame("BewegteKugel");
		f.setSize(420,420);
		f.add(b);
		f.setVisible(true);
		b.start();	
		}
	
	public void start() 
		{for(int i=0; i<200;i++) 
				{try 
					{Thread.sleep(100);
					}
				catch(InterruptedException e)
					{System.out.println(e.getMessage());
					}
				repaint();
				}
		}
	
	public void update(Graphics g)
		{if(imageClip == null)
			{imageClip = createImage(400,400);
			graphics_imageClip = imageClip.getGraphics();
			}
		paint(graphics_imageClip);
		g.drawImage(imageClip,0,0,this);	
		}
	
	public void paint(Graphics g) 
		{g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.blue);
		g.fillOval(x, (int)(Math.sin(y)*50)+100, 20, 20);	
		g.setColor(Color.black);
		g.drawString("x: "+x + " : "+y,20, 20);
		if(x<=300) 
			{x +=6;
			}
		else
			{isBewegungsende = true;		
			}
			
		
		if(y <=70)
			{y += 1;	
			}
		else
			{isBewegungsende = true;	
			}
		}

}
