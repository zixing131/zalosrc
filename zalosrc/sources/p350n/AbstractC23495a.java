package p350n;

import android.util.SparseArray;

/* renamed from: n.a */
/* loaded from: classes2.dex */
public abstract class AbstractC23495a {

    /* renamed from: a */
    private static SparseArray f114056a;

    /* renamed from: b */
    private static SparseArray f114057b;

    static {
        SparseArray sparseArray = new SparseArray();
        f114056a = sparseArray;
        sparseArray.put(0, "There is no error");
        f114056a.put(1, "XML open or read error");
        f114056a.put(2, "XML parse error");
        f114056a.put(3, "Schema validation error");
        f114056a.put(4, "Media file invalid");
        f114056a.put(5, "Exceeded wrapper limit");
        SparseArray sparseArray2 = new SparseArray();
        f114057b = sparseArray2;
        sparseArray2.put(0, "ERROR_NONE");
        f114057b.put(1, "ERROR_XML_OPEN_OR_READ");
        f114057b.put(2, "ERROR_XML_PARSE");
        f114057b.put(3, "ERROR_SCHEMA_VALIDATION");
        f114057b.put(4, "ERROR_MEDIA_FILE_INVALID");
        f114057b.put(5, "ERROR_EXCEEDED_WRAPPER_LIMIT");
    }

    /* renamed from: a */
    public static String m123332a(int i11) {
        String str = (String) f114057b.get(i11);
        return str == null ? "ERROR_UNDEFINED" : str;
    }

    /* renamed from: b */
    public static String m123333b(int i11) {
        String str = (String) f114056a.get(i11);
        return str == null ? "Undefined error" : str;
    }
}
