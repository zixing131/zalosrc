package bn0;

import fn0.AbstractC19074t;
import java.io.File;

/* renamed from: bn0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC2934c {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m13892b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }
}
