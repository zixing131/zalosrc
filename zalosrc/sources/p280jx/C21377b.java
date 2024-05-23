package p280jx;

import android.content.Context;
import p220hx.AbstractC20164b;

/* renamed from: jx.b */
/* loaded from: classes4.dex */
public class C21377b extends AbstractC20164b {

    /* renamed from: a */
    private boolean f104258a;

    /* renamed from: b */
    final AbstractC21378c f104259b;

    /* renamed from: c */
    private final long[] f104260c;

    /* renamed from: d */
    private final long[] f104261d;

    public C21377b(Context context) {
        this.f104258a = true;
        AbstractC21378c m110831a = AbstractC21378c.m110831a(context);
        this.f104259b = m110831a;
        this.f104260c = AbstractC21378c.m110832b();
        this.f104261d = AbstractC21378c.m110832b();
        if (m110831a == null) {
            this.f104258a = false;
        }
    }

    /* renamed from: a */
    public C21376a m110828a() {
        return new C21376a();
    }

    /* renamed from: b */
    public synchronized boolean m110829b(C21376a c21376a) {
        if (this.f104258a && this.f104259b.mo110833c(this.f104260c)) {
            boolean m110838b = AbstractC21380e.m110838b(this.f104260c, this.f104261d);
            this.f104258a = m110838b;
            if (!m110838b) {
                return false;
            }
            boolean mo110835e = this.f104259b.mo110835e();
            c21376a.f104255p = mo110835e;
            AbstractC21380e.m110839c(c21376a.f104256q);
            AbstractC21380e.m110837a(c21376a.f104256q, this.f104260c, 0);
            if (mo110835e) {
                AbstractC21380e.m110839c(c21376a.f104257r);
                AbstractC21380e.m110837a(c21376a.f104257r, this.f104260c, 4);
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m110830c() {
        return this.f104258a;
    }
}
