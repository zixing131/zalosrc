package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.AbstractC1487i;
import androidx.lifecycle.InterfaceC1756a1;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes2.dex */
public class C1730d {

    /* renamed from: a */
    private final AbstractC1732f f7039a;

    private C1730d(AbstractC1732f abstractC1732f) {
        this.f7039a = abstractC1732f;
    }

    /* renamed from: b */
    public static C1730d m8958b(AbstractC1732f abstractC1732f) {
        return new C1730d((AbstractC1732f) AbstractC1487i.m7493h(abstractC1732f, "callbacks == null"));
    }

    /* renamed from: a */
    public void m8959a(Fragment fragment) {
        AbstractC1732f abstractC1732f = this.f7039a;
        abstractC1732f.f7045t.m9114r(abstractC1732f, abstractC1732f, fragment);
    }

    /* renamed from: c */
    public void m8960c() {
        this.f7039a.f7045t.m9041A();
    }

    /* renamed from: d */
    public void m8961d(Configuration configuration) {
        this.f7039a.f7045t.m9043B(configuration);
    }

    /* renamed from: e */
    public boolean m8962e(MenuItem menuItem) {
        return this.f7039a.f7045t.m9045C(menuItem);
    }

    /* renamed from: f */
    public void m8963f() {
        this.f7039a.f7045t.m9047D();
    }

    /* renamed from: g */
    public boolean m8964g(Menu menu, MenuInflater menuInflater) {
        return this.f7039a.f7045t.m9049E(menu, menuInflater);
    }

    /* renamed from: h */
    public void m8965h() {
        this.f7039a.f7045t.m9051F();
    }

    /* renamed from: i */
    public void m8966i() {
        this.f7039a.f7045t.m9054H();
    }

    /* renamed from: j */
    public void m8967j(boolean z11) {
        this.f7039a.f7045t.m9056I(z11);
    }

    /* renamed from: k */
    public boolean m8968k(MenuItem menuItem) {
        return this.f7039a.f7045t.m9082X(menuItem);
    }

    /* renamed from: l */
    public void m8969l(Menu menu) {
        this.f7039a.f7045t.m9084Y(menu);
    }

    /* renamed from: m */
    public void m8970m() {
        this.f7039a.f7045t.m9086a0();
    }

    /* renamed from: n */
    public void m8971n(boolean z11) {
        this.f7039a.f7045t.m9088b0(z11);
    }

    /* renamed from: o */
    public boolean m8972o(Menu menu) {
        return this.f7039a.f7045t.m9089c0(menu);
    }

    /* renamed from: p */
    public void m8973p() {
        this.f7039a.f7045t.m9093e0();
    }

    /* renamed from: q */
    public void m8974q() {
        this.f7039a.f7045t.m9095f0();
    }

    /* renamed from: r */
    public void m8975r() {
        this.f7039a.f7045t.m9097h0();
    }

    /* renamed from: s */
    public boolean m8976s() {
        return this.f7039a.f7045t.m9109n0();
    }

    /* renamed from: t */
    public Fragment m8977t(String str) {
        return this.f7039a.f7045t.m9117s0(str);
    }

    /* renamed from: u */
    public AbstractC1733g m8978u() {
        return this.f7039a.f7045t;
    }

    /* renamed from: v */
    public void m8979v() {
        this.f7039a.f7045t.m9078U0();
    }

    /* renamed from: w */
    public View m8980w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f7039a.f7045t.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: x */
    public void m8981x(Parcelable parcelable) {
        AbstractC1732f abstractC1732f = this.f7039a;
        if (abstractC1732f instanceof InterfaceC1756a1) {
            abstractC1732f.f7045t.m9094e1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: y */
    public Parcelable m8982y() {
        return this.f7039a.f7045t.m9096g1();
    }
}
