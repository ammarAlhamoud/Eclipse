package java_Swing;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JScrollPane;
 
public class Java_Swing {

	public static void main(String[] args) {
		 
        JFrame frame = new JFrame("JTree demo");                  // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        frame.setSize(350, 300);                                  // هنا قمنا بتحديد النافذة. عرضها 350 و طولها 300
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(new GridLayout());                        // في كامل الشاشة مهما كان حجمها Tree لأننا سنضع الـ Layout Manager كـ GridLayout هنا إستخدمنا كائن من الكلاس
 
        // Tree التي سنضعها في الـ Nodes هنا قمنا بتعريف جميع الـ
        DefaultMutableTreeNode menu = new DefaultMutableTreeNode("Menu");
        DefaultMutableTreeNode food = new DefaultMutableTreeNode("Food");
        DefaultMutableTreeNode drink = new DefaultMutableTreeNode("Drink");
        DefaultMutableTreeNode pizza = new DefaultMutableTreeNode("Pizza");
        DefaultMutableTreeNode hotDogs = new DefaultMutableTreeNode("Hot Dogs");
        DefaultMutableTreeNode chicken = new DefaultMutableTreeNode("Chicken");
        DefaultMutableTreeNode hamburger = new DefaultMutableTreeNode("Hamburger");
        DefaultMutableTreeNode pepsi = new DefaultMutableTreeNode("Pepsi");
        DefaultMutableTreeNode cola = new DefaultMutableTreeNode("Cola");
        DefaultMutableTreeNode rani = new DefaultMutableTreeNode("Rani");
        DefaultMutableTreeNode water = new DefaultMutableTreeNode("Water");
 
        // بداخل بعضهم البعض تماماً كما يظهر في نتيجة التشغيل Nodes هنا قمنا بوضع الـ
        menu.add(food);
        menu.add(drink);
        food.add(pizza);
        food.add(hotDogs);
        food.add(chicken);
        food.add(hamburger);
        drink.add(pepsi);
        drink.add(cola);
        drink.add(rani);
        drink.add(water);
 
        // لها Root Node كـ menu مع وضع كائن الـ Tree هنا قمنا بتعريف الـ
        JTree tree = new JTree(menu);
 
        tree.setToggleClickCount(1);     // تظهر ما فيها من نقرة واحدة Node هنا جعلنا أي
        tree.setEditable(true);          // عند النقر على إسمها ثلاث مرات متتالية Node بالإضافة إلى أنه يمكن تغيير إسم أي
 
        JScrollPane treeScroller = new JScrollPane(tree);       // عند الحاجة Scroll Bar لضمان ظهور JScrollPane بداخل كائن من الكلاس tree هنا وضعنا الـ
        frame.add(treeScroller);                                // frame في الـ treeScroller هنا أضفنا الـ
        frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
 
    }

}
