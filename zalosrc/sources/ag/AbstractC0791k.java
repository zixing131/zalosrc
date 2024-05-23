package ag;

/* renamed from: ag.k */
/* loaded from: classes3.dex */
public abstract class AbstractC0791k {

    /* renamed from: p */
    protected final String f2727p = getClass().getSimpleName();

    /* renamed from: q */
    private boolean f2728q;

    /* renamed from: r */
    private long f2729r;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public void mo1905A() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public void mo1965B() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public void mo1966C() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public void mo1889D() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public void mo1890E() {
    }

    /* renamed from: F */
    public final void m1991F() {
        mo1890E();
    }

    public final void destroy() {
        if (!this.f2728q) {
            return;
        }
        this.f2728q = false;
        mo1905A();
    }

    /* renamed from: u */
    public final boolean m1992u() {
        if (Thread.currentThread().getId() == this.f2729r) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public void m1993v() {
        if (!mo1997z()) {
            return;
        }
        mo1965B();
    }

    /* renamed from: w */
    public void m1994w() {
        if (!mo1997z()) {
            return;
        }
        mo1966C();
    }

    /* renamed from: x */
    public final void m1995x() {
        this.f2729r = Thread.currentThread().getId();
        mo1889D();
        this.f2728q = true;
    }

    /* renamed from: y */
    public final void m1996y() {
        if (!this.f2728q) {
            m1995x();
        }
        m1991F();
    }

    /* renamed from: z */
    public boolean mo1997z() {
        return this.f2728q;
    }
}
