package on0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: on0.c */
/* loaded from: classes.dex */
public abstract class AbstractC24319c extends AbstractC24317b {
    /* renamed from: d */
    public static final boolean m126979d(char c11, char c12, boolean z11) {
        if (c11 == c12) {
            return true;
        }
        if (!z11) {
            return false;
        }
        char upperCase = Character.toUpperCase(c11);
        char upperCase2 = Character.toUpperCase(c12);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m126980e(char c11) {
        return AbstractC24324e0.m127001a(c11);
    }
}
