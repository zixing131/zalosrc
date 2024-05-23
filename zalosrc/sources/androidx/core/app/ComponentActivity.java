package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.AbstractC1606u;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1805y;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.ReportFragment;
import p665y0.C30245g;

/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements InterfaceC1801w, AbstractC1606u.a {

    /* renamed from: p */
    private C30245g f5838p = new C30245g();

    /* renamed from: q */
    private C1805y f5839q = new C1805y(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && AbstractC1606u.m8206d(decorView, keyEvent)) {
            return true;
        }
        return AbstractC1606u.m8207e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && AbstractC1606u.m8206d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public AbstractC1785o getLifecycle() {
        return this.f5839q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.m9243e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f5839q.m9401k(AbstractC1785o.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.core.view.AbstractC1606u.a
    /* renamed from: w */
    public boolean mo4894w(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
