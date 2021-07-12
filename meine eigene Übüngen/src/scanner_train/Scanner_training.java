package scanner_train;
import java.io.FileReader;         // و الذي سنستخدمه للقراءة من الملف الذي قمنا بإنشائه FileReader هنا قمنا باستدعاء الكلاس
import java.io.FileWriter;         // و الذي سنستخدمه للكتابة في الملف الذي سننشأه FileWriter هنا قمنا باستدعاء الكلاس
import java.util.Scanner;          // Scanner هنا قمنا باستدعاء الكلاس
 

public class Scanner_training {
	
	 
	    public static void main(String[] args) {
	 
	        Scanner input = new Scanner(System.in);     // input إسمه Scanner هنا قمنا بإنشاء كائن من الكلاس
	        String name;                                // سنستخدم هذا المتغير لتخزين إسم المستخدم
	        String password;                            // سنستخدم هذا المتغير لتخزين كلمة مرور المستخدم
	 
	        try {
	            System.out.print("User Name: ");        // هنا طلبنا من المستخدم إدخال علامة المادة الأولى
	            name = input.next();                    // هنا قمنا بتخزين العلامة التي أدخلها في العنصر الأول في المصفوفة
	 
	            System.out.print("Password: ");         // هنا طلبنا من المستخدم إدخال علامة المادة الثانية
	            password = input.next();                // هنا قمنا بتخزين العلامة التي أدخلها في العنصر الثاني في المصفوفة
	 
	            FileWriter fw = new FileWriter("users.txt", true);     // في حال لم يكن أصلاً موجوداً و فتحه للكتابة فيه users.txt لإنشاء ملف إسمه FileWriter هنا قمنا بإنشاء كائن نوعه
	 
	            fw.write("User Name: " +name + "\n");                  // هنا قمنا بكتابة إسم المستخدم في الملف
	            fw.write("Password: " + password + "\n\n");            // ثم قمنا بكتابة كلمة المرور
	            fw.flush();                                            // بعدها قمنا بتفريغ الذاكرة
	            fw.close();                                            // بعدها قمنا بإغلاق الكائن المتصل بالملف
	 
	            FileReader fr = new FileReader("users.txt");           // users.txt و الذي سنستخدمه لقراءة الأشياء الموجودة في الملف FileReader هنا قمنا بإنشاء كائن نوعه
	 
	            int c;
	            while ((c = fr.read()) != -1) {     // هنا قمنا بإنشاء حلقة تمر على جميع أحرف الملف, في كل دورة تقرأ حرف من الملف
	                System.out.print((char)c);      // ثم تعرضه
	            }
	            fr.close();                         // بعدها قمنا بإغلاق الكائن المتصل بالملف
	        }
	        catch (Exception e) {                   // هنا سيتم إلتقاط أي خطأ قد يحدث و عرضه
	            System.out.print(e.toString());
	        }
	        finally {                               // Scanner في حال تم أو لم يتم إدخال البيانات, سيتم إغلاق الـ
	            input.close();
	        }
	 
	    }
	 
	}



