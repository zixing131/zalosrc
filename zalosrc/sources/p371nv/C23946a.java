package p371nv;

import bn0.AbstractC2932a;
import bn0.AbstractC2933b;
import fn0.AbstractC19074t;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: nv.a */
/* loaded from: classes.dex */
public final class C23946a extends AbstractC23950e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23946a(File file, String str, long j11) {
        super(file, str, j11);
        AbstractC19074t.m100208f(file, "logFolder");
    }

    /* renamed from: k */
    public final void m125322k(InputStream inputStream, String str) {
        AbstractC19074t.m100208f(inputStream, "inputStream");
        AbstractC19074t.m100208f(str, "filename");
        File file = new File(m125332f(), str);
        if (file.exists()) {
            file = new File(m125332f(), System.currentTimeMillis() + "_" + str);
        }
        OutputStream m125330d = m125330d(file);
        try {
            AbstractC2932a.m13888b(inputStream, m125330d, 0, 2, null);
            AbstractC2933b.m13890a(m125330d, null);
        } finally {
        }
    }
}
