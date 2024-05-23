package te0;

import android.graphics.BitmapFactory;
import java.io.InputStream;
import me0.AbstractC23009a3;
import p239ih.C20556f;
import p620wt.AbstractC29237l;
import th.AbstractC26689j;

/* renamed from: te0.b */
/* loaded from: classes4.dex */
public final class C26644b {

    /* renamed from: a */
    public static final C26644b f126107a = new C26644b();

    private C26644b() {
    }

    /* renamed from: a */
    public final synchronized boolean m136772a(String str, int i11) {
        return AbstractC23009a3.m117952c(str, AbstractC26689j.m137112u(i11), AbstractC26689j.m137112u(i11));
    }

    /* renamed from: b */
    public final synchronized boolean m136773b(String str, int i11) {
        boolean z11;
        int m137112u = AbstractC26689j.m137112u(i11);
        BitmapFactory.Options options = new BitmapFactory.Options();
        z11 = true;
        options.inJustDecodeBounds = true;
        InputStream m106838k = new C20556f(str).m106838k();
        BitmapFactory.decodeStream(m106838k, null, options);
        AbstractC29237l.m145996a(m106838k);
        if (options.outWidth * options.outHeight > m137112u * m137112u) {
            z11 = false;
        }
        return z11;
    }
}
