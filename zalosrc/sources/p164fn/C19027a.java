package p164fn;

import ho0.AbstractC20110a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: fn.a */
/* loaded from: classes3.dex */
public class C19027a {

    /* renamed from: b */
    private static volatile C19027a f94833b;

    /* renamed from: a */
    private final Map f94834a = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public static synchronized C19027a m100086c() {
        C19027a c19027a;
        synchronized (C19027a.class) {
            try {
                if (f94833b == null) {
                    synchronized (C19027a.class) {
                        try {
                            if (f94833b == null) {
                                f94833b = new C19027a();
                            }
                        } finally {
                        }
                    }
                }
                c19027a = f94833b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c19027a;
    }

    /* renamed from: a */
    public void m100087a() {
        try {
            synchronized (this.f94834a) {
                try {
                    Iterator it = this.f94834a.entrySet().iterator();
                    while (it.hasNext()) {
                        C19032f c19032f = (C19032f) ((Map.Entry) it.next()).getValue();
                        if (c19032f != null) {
                            c19032f.m100105b();
                        }
                    }
                    this.f94834a.clear();
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public C19032f m100088b(String str) {
        return (C19032f) this.f94834a.get(str);
    }

    /* renamed from: d */
    public void m100089d(String str) {
        synchronized (this.f94834a) {
            try {
                Map map = this.f94834a;
                if (map != null) {
                    map.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public void m100090e(C19032f c19032f) {
        synchronized (this.f94834a) {
            this.f94834a.put(c19032f.f94865a, c19032f);
            c19032f.m100110h();
        }
    }
}
