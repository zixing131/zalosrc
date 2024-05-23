package p440q8;

/* renamed from: q8.e */
/* loaded from: classes.dex */
public class C25161e {

    /* renamed from: a */
    public final String f120731a;

    /* renamed from: b */
    public final String f120732b;

    /* renamed from: c */
    public final StackTraceElement[] f120733c;

    /* renamed from: d */
    public final C25161e f120734d;

    public C25161e(Throwable th2, InterfaceC25160d interfaceC25160d) {
        C25161e c25161e;
        this.f120731a = th2.getLocalizedMessage();
        this.f120732b = th2.getClass().getName();
        this.f120733c = interfaceC25160d.mo130299a(th2.getStackTrace());
        Throwable cause = th2.getCause();
        if (cause != null) {
            c25161e = new C25161e(cause, interfaceC25160d);
        } else {
            c25161e = null;
        }
        this.f120734d = c25161e;
    }
}
