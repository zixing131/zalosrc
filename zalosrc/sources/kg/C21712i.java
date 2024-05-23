package kg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: kg.i */
/* loaded from: classes3.dex */
public class C21712i {

    /* renamed from: b */
    private static final C21712i f105453b = new C21712i(true);

    /* renamed from: a */
    private final Map f105454a = new HashMap();

    C21712i(boolean z11) {
        if (z11) {
            m112060a(C21711h.f105450c, "default config");
        }
    }

    /* renamed from: b */
    public static C21712i m112059b() {
        return f105453b;
    }

    /* renamed from: a */
    public boolean m112060a(C21711h c21711h, String str) {
        if (c21711h != null) {
            if (str != null) {
                if (this.f105454a.containsKey(c21711h)) {
                    return false;
                }
                this.f105454a.put(c21711h, str);
                return true;
            }
            throw new IllegalArgumentException("configName is required");
        }
        throw new IllegalArgumentException("springConfig is required");
    }
}
