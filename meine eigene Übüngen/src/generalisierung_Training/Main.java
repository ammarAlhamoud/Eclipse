package generalisierung_Training;

public class Main {
	 
    // هنا قمنا ببناء دالة نعطيها رقمين من أي نوع, فتقوم بمقارنتهما و ترجع الرقم الأكبر
    public static <N extends Number> N max (N x, N y)
    {
        // حتى نستطيع مقارنتهم, بعدها سيتم إرجاع العدد الأكبر بينهما double هنا سيتم تحويل نوع الأرقام المدخلة إلى النوع
        if ( x.doubleValue() > y.doubleValue() )
            return x;
        else
            return y;
    }
    
    public static <T> T toString(T ss_t) {
    	return ss_t;
    }
 
 
    // هنا قمنا ببناء دالة مشابهة للدالة السابقة, لكنها تقارن ثلاث أرقام مع بعض
    public static <N extends Number> N max (N x, N y, N z)
    {
        // بكل بساطة, تستدعي الدالة السابقة لمقارنة أول عددين, و معرفة الأكبر بينهما
        // بعدها تستدعيها من جديد لمقارنة العدد الأكبر بين العددين السابقين مع العدد الأخير
        return max( max(x, y), z );
    }
 
 
    public static void main(String[] args) {
 
        // التي تأخذ باراميترين max() هنا قمنا بإجراء ثلاث عمليات مقارنة باستخدام الدالة
 
        // int هنا قمنا بمقارنة رقمين نوعهما
        System.out.println( max(3, 7) );
 
        // long مع رقم نوعه float هنا قمنا بمقارنة رقم نوعه
        System.out.println( max(5.5F, 8L) );
 
        // long مع رقم نوعه float هنا قمنا بمقارنة رقم نوعه
        System.out.println( max(6.9D, 8L) );
 
        // التي تأخذ ثلاث باراميترات max() هنا قمنا بإجراء عمليتين مقارنة تعتمدان على الدالة
 
        // int هنا قمنا بمقارنة ثلاث أرقام نوعهم
        System.out.println( max(10, 15, 5) );
 
        // double مع رقم نوعه float مع رقم نوعه int هنا قمنا رقم نوعه
        System.out.println( max(11, 12.5F, 17.8D) );
        
        System.out.println("Das toString: " + toString("Ammar"));
        System.out.println("Das toString: " + toString(1007));
        System.out.println("Das toString: " + toString(7>5));


 
    }
 
}
