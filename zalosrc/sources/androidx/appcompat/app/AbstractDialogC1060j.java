package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1606u;
import p175g0.AbstractC19178a;
import p310l0.AbstractC21981b;

/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes2.dex */
public abstract class AbstractDialogC1060j extends Dialog implements InterfaceC1052b {

    /* renamed from: p */
    private AbstractC1053c f3842p;

    /* renamed from: q */
    private final AbstractC1606u.a f3843q;

    /* renamed from: androidx.appcompat.app.j$a */
    /* loaded from: classes2.dex */
    class a implements AbstractC1606u.a {
        a() {
        }

        @Override // androidx.core.view.AbstractC1606u.a
        /* renamed from: w */
        public boolean mo4894w(KeyEvent keyEvent) {
            return AbstractDialogC1060j.this.m4892c(keyEvent);
        }
    }

    public AbstractDialogC1060j(Context context, int i11) {
        super(context, m4890b(context, i11));
        this.f3843q = new a();
        AbstractC1053c m4891a = m4891a();
        m4891a.mo4788D(m4890b(context, i11));
        m4891a.mo4824q(null);
    }

    /* renamed from: b */
    private static int m4890b(Context context, int i11) {
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(AbstractC19178a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i11;
    }

    @Override // androidx.appcompat.app.InterfaceC1052b
    /* renamed from: D0 */
    public void mo4741D0(AbstractC21981b abstractC21981b) {
    }

    /* renamed from: a */
    public AbstractC1053c m4891a() {
        if (this.f3842p == null) {
            this.f3842p = AbstractC1053c.m4879h(this, this);
        }
        return this.f3842p;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4891a().mo4808d(view, layoutParams);
    }

    /* renamed from: c */
    boolean m4892c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean m4893d(int i11) {
        return m4891a().mo4837z(i11);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m4891a().mo4825r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1606u.m8207e(this.f3843q, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.appcompat.app.InterfaceC1052b
    /* renamed from: f */
    public void mo4747f(AbstractC21981b abstractC21981b) {
    }

    @Override // android.app.Dialog
    public View findViewById(int i11) {
        return m4891a().mo4813i(i11);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m4891a().mo4820o();
    }

    @Override // androidx.appcompat.app.InterfaceC1052b
    /* renamed from: n */
    public AbstractC21981b mo4749n(AbstractC21981b.a aVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m4891a().mo4818n();
        super.onCreate(bundle);
        m4891a().mo4824q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m4891a().mo4834w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i11) {
        m4891a().mo4785A(i11);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m4891a().mo4790E(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m4891a().mo4786B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4891a().mo4787C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i11) {
        super.setTitle(i11);
        m4891a().mo4790E(getContext().getString(i11));
    }
}
