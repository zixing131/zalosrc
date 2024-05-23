package vg;

import com.zing.zalo.common.C7852a;
import java.util.ArrayList;

/* renamed from: vg.u4 */
/* loaded from: classes3.dex */
public class C28201u4 {

    /* renamed from: b */
    private static volatile C28201u4 f131401b;

    /* renamed from: a */
    private final ArrayList f131402a = new ArrayList();

    private C28201u4() {
    }

    /* renamed from: b */
    public static synchronized C28201u4 m141792b() {
        C28201u4 c28201u4;
        synchronized (C28201u4.class) {
            try {
                if (f131401b == null) {
                    synchronized (C28201u4.class) {
                        try {
                            if (f131401b == null) {
                                f131401b = new C28201u4();
                            }
                        } finally {
                        }
                    }
                }
                c28201u4 = f131401b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28201u4;
    }

    /* renamed from: a */
    public void m141793a(C7852a c7852a) {
        this.f131402a.add(c7852a);
    }

    /* renamed from: c */
    public void m141794c(C7852a c7852a) {
        if (this.f131402a.contains(c7852a)) {
            this.f131402a.remove(c7852a);
        }
    }

    /* renamed from: d */
    public void m141795d() {
        int size = this.f131402a.size();
        for (int i11 = 0; i11 < size; i11++) {
            C7852a c7852a = (C7852a) this.f131402a.get(i11);
            if (!c7852a.m39987G()) {
                c7852a.m39984A();
            }
        }
    }
}
