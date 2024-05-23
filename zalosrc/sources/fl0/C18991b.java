package fl0;

import fn0.AbstractC19074t;
import java.io.File;
import pj0.C24777c;

/* renamed from: fl0.b */
/* loaded from: classes7.dex */
public final class C18991b {
    /* renamed from: b */
    public static /* synthetic */ File m99714b(C18991b c18991b, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str2 = null;
        }
        return c18991b.m99715a(str, i11, str2);
    }

    /* renamed from: a */
    public final File m99715a(String str, int i11, String str2) {
        AbstractC19074t.m100208f(str, "fileName");
        File m128778r = C24777c.m128778r(str, i11, str2);
        AbstractC19074t.m100207e(m128778r, "getCacheFile(fileName, type, customPath)");
        return m128778r;
    }
}
