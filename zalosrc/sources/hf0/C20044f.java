package hf0;

import com.zing.zalo.uicontrol.MiniVideoLayout;

/* renamed from: hf0.f */
/* loaded from: classes5.dex */
public class C20044f {

    /* renamed from: b */
    static C20044f f98535b;

    /* renamed from: a */
    MiniVideoLayout f98536a;

    private C20044f() {
    }

    /* renamed from: a */
    public static synchronized C20044f m104040a() {
        C20044f c20044f;
        synchronized (C20044f.class) {
            try {
                if (f98535b == null) {
                    synchronized (C20044f.class) {
                        try {
                            if (f98535b == null) {
                                f98535b = new C20044f();
                            }
                        } finally {
                        }
                    }
                }
                c20044f = f98535b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20044f;
    }

    /* renamed from: b */
    public void m104041b() {
        MiniVideoLayout miniVideoLayout = this.f98536a;
        if (miniVideoLayout != null) {
            miniVideoLayout.m87768c();
            this.f98536a = null;
        }
    }
}
