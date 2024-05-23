package vg;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: vg.g4 */
/* loaded from: classes3.dex */
public class C28071g4 {

    /* renamed from: c */
    private static final LinkedHashMap f130980c = new a(5, 0.75f, true);

    /* renamed from: d */
    private static volatile C28071g4 f130981d;

    /* renamed from: a */
    private final Handler f130982a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final Map f130983b = Collections.synchronizedMap(new HashMap());

    /* renamed from: vg.g4$a */
    /* loaded from: classes3.dex */
    class a extends LinkedHashMap {
        a(int i11, float f11, boolean z11) {
            super(i11, f11, z11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 5) {
                return true;
            }
            return false;
        }
    }

    private C28071g4() {
    }

    /* renamed from: a */
    public static synchronized C28071g4 m141535a() {
        C28071g4 c28071g4;
        synchronized (C28071g4.class) {
            try {
                if (f130981d == null) {
                    synchronized (C28071g4.class) {
                        try {
                            if (f130981d == null) {
                                f130981d = new C28071g4();
                            }
                        } finally {
                        }
                    }
                }
                c28071g4 = f130981d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28071g4;
    }

    /* renamed from: b */
    public void m141536b(String str, String str2) {
        this.f130983b.put(str, str2);
    }
}
