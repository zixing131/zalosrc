package p310l0;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p310l0.AbstractC21981b;

/* renamed from: l0.e */
/* loaded from: classes2.dex */
public class C21984e extends AbstractC21981b implements C1072e.a {

    /* renamed from: r */
    private Context f108246r;

    /* renamed from: s */
    private ActionBarContextView f108247s;

    /* renamed from: t */
    private AbstractC21981b.a f108248t;

    /* renamed from: u */
    private WeakReference f108249u;

    /* renamed from: v */
    private boolean f108250v;

    /* renamed from: w */
    private boolean f108251w;

    /* renamed from: x */
    private C1072e f108252x;

    public C21984e(Context context, ActionBarContextView actionBarContextView, AbstractC21981b.a aVar, boolean z11) {
        this.f108246r = context;
        this.f108247s = actionBarContextView;
        this.f108248t = aVar;
        C1072e m5069W = new C1072e(actionBarContextView.getContext()).m5069W(1);
        this.f108252x = m5069W;
        m5069W.mo5068V(this);
        this.f108251w = z11;
    }

    @Override // androidx.appcompat.view.menu.C1072e.a
    /* renamed from: a */
    public boolean mo4805a(C1072e c1072e, MenuItem menuItem) {
        return this.f108248t.mo4852a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C1072e.a
    /* renamed from: b */
    public void mo4807b(C1072e c1072e) {
        mo4960k();
        this.f108247s.m5158l();
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: c */
    public void mo4954c() {
        if (this.f108250v) {
            return;
        }
        this.f108250v = true;
        this.f108247s.sendAccessibilityEvent(32);
        this.f108248t.mo4855d(this);
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: d */
    public View mo4955d() {
        WeakReference weakReference = this.f108249u;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: e */
    public Menu mo4956e() {
        return this.f108252x;
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: f */
    public MenuInflater mo4957f() {
        return new C21986g(this.f108247s.getContext());
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: g */
    public CharSequence mo4958g() {
        return this.f108247s.getSubtitle();
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: i */
    public CharSequence mo4959i() {
        return this.f108247s.getTitle();
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: k */
    public void mo4960k() {
        this.f108248t.mo4854c(this, this.f108252x);
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: l */
    public boolean mo4961l() {
        return this.f108247s.m5156j();
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: m */
    public void mo4962m(View view) {
        WeakReference weakReference;
        this.f108247s.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f108249u = weakReference;
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: n */
    public void mo4963n(int i11) {
        mo4964o(this.f108246r.getString(i11));
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: o */
    public void mo4964o(CharSequence charSequence) {
        this.f108247s.setSubtitle(charSequence);
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: q */
    public void mo4965q(int i11) {
        mo4966r(this.f108246r.getString(i11));
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: r */
    public void mo4966r(CharSequence charSequence) {
        this.f108247s.setTitle(charSequence);
    }

    @Override // p310l0.AbstractC21981b
    /* renamed from: s */
    public void mo4967s(boolean z11) {
        super.mo4967s(z11);
        this.f108247s.setTitleOptional(z11);
    }
}
