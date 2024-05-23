package au;

/* renamed from: au.g */
/* loaded from: classes4.dex */
public abstract class AbstractC2347g {
    /* renamed from: a */
    public static int m12315a(Object obj, int i11) {
        try {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        } catch (Exception unused) {
        }
        return i11;
    }

    /* renamed from: b */
    public static long m12316b(String str, long j11) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j11;
        }
    }

    /* renamed from: c */
    public static String m12317c(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return null;
        }
    }
}
