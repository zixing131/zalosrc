package ne0;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import hu.C20131e;
import java.io.File;

/* renamed from: ne0.a */
/* loaded from: classes4.dex */
public final class C23731a {

    /* renamed from: a */
    public static final C23731a f114819a = new C23731a();

    private C23731a() {
    }

    /* renamed from: b */
    public static /* synthetic */ File[] m124077b(C23731a c23731a, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
        }
        return c23731a.m124078a(str);
    }

    /* renamed from: a */
    public final File[] m124078a(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return new File(C20131e.m104919l(), str).listFiles();
    }
}
