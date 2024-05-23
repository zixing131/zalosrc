package p313l3;

/* renamed from: l3.a */
/* loaded from: classes2.dex */
public abstract class AbstractC22008a {
    /* renamed from: a */
    public static boolean m114893a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException | Exception unused) {
            return false;
        }
    }
}
