package p310l0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: l0.b */
/* loaded from: classes2.dex */
public abstract class AbstractC21981b {

    /* renamed from: p */
    private Object f108239p;

    /* renamed from: q */
    private boolean f108240q;

    /* renamed from: l0.b$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        boolean mo4852a(AbstractC21981b abstractC21981b, MenuItem menuItem);

        /* renamed from: b */
        boolean mo4853b(AbstractC21981b abstractC21981b, Menu menu);

        /* renamed from: c */
        boolean mo4854c(AbstractC21981b abstractC21981b, Menu menu);

        /* renamed from: d */
        void mo4855d(AbstractC21981b abstractC21981b);
    }

    /* renamed from: c */
    public abstract void mo4954c();

    /* renamed from: d */
    public abstract View mo4955d();

    /* renamed from: e */
    public abstract Menu mo4956e();

    /* renamed from: f */
    public abstract MenuInflater mo4957f();

    /* renamed from: g */
    public abstract CharSequence mo4958g();

    /* renamed from: h */
    public Object m114795h() {
        return this.f108239p;
    }

    /* renamed from: i */
    public abstract CharSequence mo4959i();

    /* renamed from: j */
    public boolean m114796j() {
        return this.f108240q;
    }

    /* renamed from: k */
    public abstract void mo4960k();

    /* renamed from: l */
    public abstract boolean mo4961l();

    /* renamed from: m */
    public abstract void mo4962m(View view);

    /* renamed from: n */
    public abstract void mo4963n(int i11);

    /* renamed from: o */
    public abstract void mo4964o(CharSequence charSequence);

    /* renamed from: p */
    public void m114797p(Object obj) {
        this.f108239p = obj;
    }

    /* renamed from: q */
    public abstract void mo4965q(int i11);

    /* renamed from: r */
    public abstract void mo4966r(CharSequence charSequence);

    /* renamed from: s */
    public void mo4967s(boolean z11) {
        this.f108240q = z11;
    }
}
