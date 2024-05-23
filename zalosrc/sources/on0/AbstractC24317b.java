package on0;

import ln0.C22537f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: on0.b */
/* loaded from: classes.dex */
public abstract class AbstractC24317b {
    /* renamed from: a */
    public static int m126975a(int i11) {
        if (new C22537f(2, 36).m116554l(i11)) {
            return i11;
        }
        throw new IllegalArgumentException("radix " + i11 + " was not in valid range " + new C22537f(2, 36));
    }

    /* renamed from: b */
    public static final int m126976b(char c11, int i11) {
        return Character.digit((int) c11, i11);
    }

    /* renamed from: c */
    public static boolean m126977c(char c11) {
        if (!Character.isWhitespace(c11) && !Character.isSpaceChar(c11)) {
            return false;
        }
        return true;
    }
}
