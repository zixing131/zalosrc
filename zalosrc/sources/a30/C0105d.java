package a30;

/* renamed from: a30.d */
/* loaded from: classes5.dex */
public class C0105d {

    /* renamed from: c */
    private static C0105d f621c;

    /* renamed from: b */
    private String f623b = "";

    /* renamed from: a */
    private final C0106e f622a = new C0106e(100);

    private C0105d() {
    }

    /* renamed from: b */
    public static synchronized C0105d m474b() {
        C0105d c0105d;
        synchronized (C0105d.class) {
            try {
                if (f621c == null) {
                    f621c = new C0105d();
                }
                c0105d = f621c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0105d;
    }

    /* renamed from: a */
    public void m475a() {
        C0106e c0106e = this.f622a;
        if (c0106e != null) {
            c0106e.clear();
        }
    }
}
