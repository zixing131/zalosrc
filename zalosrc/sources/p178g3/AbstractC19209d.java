package p178g3;

import com.adtima.Adtima;

/* renamed from: g3.d */
/* loaded from: classes2.dex */
public abstract class AbstractC19209d {

    /* renamed from: a */
    private static final String f95651a = "d";

    /* renamed from: a */
    public static String m100804a(String str, Object... objArr) {
        String str2 = "";
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("try{");
            sb2.append(str);
            sb2.append("(");
            if (objArr != null) {
                int length = objArr.length;
                int i11 = 0;
                String str3 = "";
                while (i11 < length) {
                    Object obj = objArr[i11];
                    sb2.append(str3);
                    if (obj instanceof String) {
                        sb2.append("'");
                    }
                    sb2.append(obj);
                    if (obj instanceof String) {
                        sb2.append("'");
                    }
                    i11++;
                    str3 = ",";
                }
            }
            sb2.append(")}catch(error){console.error(error.message);}");
            str2 = sb2.toString();
            Adtima.m18326d(f95651a, "buildJavaScriptString: " + str2);
            return str2;
        } catch (Exception e11) {
            Adtima.m18329e(f95651a, "buildJavaScriptString", e11);
            return str2;
        }
    }
}
