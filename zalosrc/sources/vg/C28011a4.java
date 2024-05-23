package vg;

import com.zing.zalo.control.ContactProfile;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: vg.a4 */
/* loaded from: classes3.dex */
public class C28011a4 {

    /* renamed from: b */
    private static volatile C28011a4 f130627b;

    /* renamed from: a */
    private final Map f130628a = Collections.synchronizedMap(new LinkedHashMap(100, 0.75f, true));

    /* renamed from: b */
    public static synchronized C28011a4 m141160b() {
        C28011a4 c28011a4;
        synchronized (C28011a4.class) {
            try {
                if (f130627b == null) {
                    synchronized (C28011a4.class) {
                        try {
                            if (f130627b == null) {
                                f130627b = new C28011a4();
                            }
                        } finally {
                        }
                    }
                }
                c28011a4 = f130627b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28011a4;
    }

    /* renamed from: a */
    public ContactProfile.C7868d m141161a(String str) {
        return (ContactProfile.C7868d) this.f130628a.get(str);
    }

    /* renamed from: c */
    public Map m141162c() {
        return this.f130628a;
    }

    /* renamed from: d */
    public void m141163d(String str, ContactProfile.C7868d c7868d) {
        this.f130628a.put(str, c7868d);
    }
}
