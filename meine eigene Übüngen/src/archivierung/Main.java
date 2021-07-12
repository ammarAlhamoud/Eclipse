package archivierung;
import java.io.*;                     // File هنا قمنا باستدعاء الكلاس

public class Main {

	public static void main(String[] args) 
	{ // e إسمه Editor في كل مرة نقوم فيها بتشغيل البرنامج سيتم إنشاء كائن من الكلاس
        Editor e = new Editor();
 
 
        // لمعرفة إذا كان يوجد ملف يحفظ حالة الكائن أم لا user-prefrences.ser بعدها سيتم البحث عن الملف
        if ( new File("./user-prefrences.ser").exists() )
        {
            // منه e موجوداً سيحاول البرنامج إستعادة حالة الكائن user-prefrences.ser في حال كان الملف
            try
            {
                // في الذاكرة user-prefrences.ser حتى نستطيع إدخال المعلومات الموجودة في الملف FileInputStream هنا قمنا بإنشاء كائن نوعه
                FileInputStream fis = new FileInputStream("./user-prefrences.ser");
 
                // في الذاكرة user-prefrences.ser المحفوظ في الملف Editor لنتمكن من إعادة خلق كائن الـ ObjectInputStream هنا قمنا بإنشاء كائن نوعه
                ObjectInputStream ois = new ObjectInputStream(fis);
 
                // e و قمنا بتخزين حالته في الكائن Editor هنا قمنا بقراءة حالة الكائن الذي تم خلقه في الذاكرة ككائن من الكلاس
                e = (Editor) ois.readObject();
 
                // user-prefrences.ser في الأخير قمنا بقطع كل إتصال قمنا بإجرائه مع الملف
                fis.close();
                ois.close();
 
                // في حال عدم حدوث أي خطأ, سيتم طباعة الجملة التالية التي تعني أن العملية تمت بنجاح
                System.out.println("Deserialized data has been created in the memory");
                System.out.println("Language:      " + e.language);
                System.out.println("Encoding:      " + e.encoding);
                System.out.println("Font size:     " + e.fontSize);
                System.out.println("Font family:   " + e.fontFamily);
                System.out.println("Auto save:     " + e.autoSave);
                System.out.println("Direction:     " + e.direction);
                System.out.println("Auto Complete: " + e.autoComplete);
                System.out.println();
            }
            catch(IOException | ClassNotFoundException ex)
            {
                // في حال حدوث أي خطأ عند محاولة إسترجاع حالة الكائن سيتم عرضعه
                System.out.println(ex.getMessage());
            }
        }
 
 
 
 
        // user-prefrences.ser و حفظها في ملف جديد إسمه e هنا حاولنا تغيير حالة الكائن
        try
        {
            // ( أي قمنا بتغيير إعدادات البرنامج ) e هنا قمنا بتغيير قيم الكائن
            e.language   = "arabic";
            e.encoding   = "utf-8";
            e.fontSize   = "12pt";
            e.fontFamily = "tahoma";
            e.autoSave   = true;
            e.direction  = "right to left";
 
            // .ser إمتداده ,user-prefrences.ser هنا قمنا بإنشاء ملف إسمه
            FileOutputStream fos = new FileOutputStream("./user-prefrences.ser");
 
            // user-prefrences.ser لنتمكن من استخراج حالة أي كائن موجود في الذاكرة و وضعها في الملف ObjectOutputStream هنا قمنا بإنشاء كائن نوعه
            ObjectOutputStream oos = new ObjectOutputStream(fos);
 
            // لحفظ الإعدادات التي قمنا بإدخالها user-prefrences.ser في الملف e هنا قمنا بنسخ حالة الكائن
            oos.writeObject(e);
 
            // user-prefrences.ser في الأخير قمنا بقطع كل إتصال قمنا بإجرائه مع الملف
            oos.close();
            fos.flush();
            fos.close();
 
            // في حال عدم حدوث أي خطأ, سيتم طباعة الجملة التالية التي تعني أن العملية تمت بنجاح
            System.out.println("Serialized data has been saved in the project in a file called user-prefrences.ser");
        }
        catch(IOException ex)
        {
            // في حال حدوث أي خطأ عند نسخ البيانات من الذاكرة إلى الملف سيتم عرضه
            System.out.println(ex.getMessage());
        }
 
    }

	

}
