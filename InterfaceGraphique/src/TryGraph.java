import java.awt.*;
public class TryGraph extends Frame{
	public TryGraph() {
		super("AppliComplexeLayout");
		setLayout(new BorderLayout());
		Panel pnorth=new Panel();
		Button b1=new Button("b1");
		Button b2=new Button("b2");
		Button b3=new Button("b3");
		Button b4= new Button("b4");
		pnorth.add(b1);
		pnorth.add(b2);
		pnorth.add(b3);
		pnorth.add(b4);
		this.add(pnorth,BorderLayout.NORTH);
		
	
		Panel pcenter=new Panel();
		pcenter.setLayout(new GridLayout(2,2));
		Button gr1=new Button("GR1");
		Button gr2=new Button("GR2");
		Button gr3=new Button("GR3");
		Button gr4=new Button("GR4");
		pcenter.add(gr1);
		pcenter.add(gr2);
		pcenter.add(gr3);
		pcenter.add(gr4);
		this.add(pcenter,BorderLayout.CENTER);
		
		Panel psouth= new Panel();
		psouth.setLayout(new FlowLayout());
		Choice ch=new Choice();
		TextField tf=new TextField("text");
		ch.addItem("Mcdo");
		ch.addItem("BurgerKing");
		psouth.add(ch);
		psouth.add(tf);
		this.add(psouth,BorderLayout.SOUTH);
	}
	public static void main(String[]args) {
		TryGraph t1=new TryGraph();
		t1.show();
		t1.pack();
	}
	
	
	
	
}
	