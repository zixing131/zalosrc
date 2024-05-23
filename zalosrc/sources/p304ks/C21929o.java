package p304ks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ks.o */
/* loaded from: classes4.dex */
public class C21929o {

    /* renamed from: b */
    private static volatile C21929o f107854b;

    /* renamed from: a */
    private final Map f107855a = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static synchronized C21929o m114391a() {
        C21929o c21929o;
        synchronized (C21929o.class) {
            try {
                if (f107854b == null) {
                    synchronized (C21929o.class) {
                        try {
                            if (f107854b == null) {
                                f107854b = new C21929o();
                            }
                        } finally {
                        }
                    }
                }
                c21929o = f107854b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c21929o;
    }

    /* renamed from: b */
    public Map m114392b() {
        return this.f107855a;
    }
}
