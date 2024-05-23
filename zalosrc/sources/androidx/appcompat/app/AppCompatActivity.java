package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C1229z1;
import androidx.core.app.AbstractC1324b;
import androidx.core.app.AbstractC1360o;
import androidx.core.app.C1353k1;
import androidx.fragment.app.FragmentActivity;
import p310l0.AbstractC21981b;

/* loaded from: classes2.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC1052b, C1353k1.a {

    /* renamed from: Q */
    private AbstractC1053c f3738Q;

    /* renamed from: R */
    private Resources f3739R;

    /* renamed from: M2 */
    private boolean m4739M2(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B2 */
    public void m4740B2(int i11) {
    }

    @Override // androidx.appcompat.app.InterfaceC1052b
    /* renamed from: D0 */
    public void mo4741D0(AbstractC21981b abstractC21981b) {
    }

    /* renamed from: G2 */
    public void m4742G2(C1353k1 c1353k1) {
    }

    /* renamed from: K2 */
    public void m4743K2() {
    }

    /* renamed from: L2 */
    public boolean m4744L2() {
        Intent mo4748h = mo4748h();
        if (mo4748h != null) {
            if (m4746P2(mo4748h)) {
                C1353k1 m6775j = C1353k1.m6775j(this);
                m4753x2(m6775j);
                m4742G2(m6775j);
                m6775j.m6779k();
                try {
                    AbstractC1324b.m6636s(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            m4745O2(mo4748h);
            return true;
        }
        return false;
    }

    /* renamed from: O2 */
    public void m4745O2(Intent intent) {
        AbstractC1360o.m6791e(this, intent);
    }

    /* renamed from: P2 */
    public boolean m4746P2(Intent intent) {
        return AbstractC1360o.m6792f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4751p2().mo4808d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(m4751p2().mo4811f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar m4752t2 = m4752t2();
        if (getWindow().hasFeature(0)) {
            if (m4752t2 == null || !m4752t2.m4694f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar m4752t2 = m4752t2();
        if (keyCode == 82 && m4752t2 != null && m4752t2.m4703o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.InterfaceC1052b
    /* renamed from: f */
    public void mo4747f(AbstractC21981b abstractC21981b) {
    }

    @Override // android.app.Activity
    public View findViewById(int i11) {
        return m4751p2().mo4813i(i11);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m4751p2().mo4815l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f3739R == null && C1229z1.m5794b()) {
            this.f3739R = new C1229z1(this, super.getResources());
        }
        Resources resources = this.f3739R;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    @Override // androidx.core.app.C1353k1.a
    /* renamed from: h */
    public Intent mo4748h() {
        return AbstractC1360o.m6787a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m4751p2().mo4820o();
    }

    @Override // androidx.appcompat.app.InterfaceC1052b
    /* renamed from: n */
    public AbstractC21981b mo4749n(AbstractC21981b.a aVar) {
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity
    /* renamed from: n2 */
    public void mo4750n2() {
        m4751p2().mo4820o();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f3739R != null) {
            this.f3739R.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        m4751p2().mo4822p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m4743K2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC1053c m4751p2 = m4751p2();
        m4751p2.mo4818n();
        m4751p2.mo4824q(bundle);
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m4751p2().mo4825r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (m4739M2(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        ActionBar m4752t2 = m4752t2();
        if (menuItem.getItemId() == 16908332 && m4752t2 != null && (m4752t2.mo4697i() & 4) != 0) {
            return m4744L2();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i11, Menu menu) {
        return super.onMenuOpened(i11, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, Menu menu) {
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m4751p2().mo4827s(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m4751p2().mo4829t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m4751p2().mo4830u(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        m4751p2().mo4832v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m4751p2().mo4834w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i11) {
        super.onTitleChanged(charSequence, i11);
        m4751p2().mo4790E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar m4752t2 = m4752t2();
        if (getWindow().hasFeature(0)) {
            if (m4752t2 == null || !m4752t2.m4704p()) {
                super.openOptionsMenu();
            }
        }
    }

    /* renamed from: p2 */
    public AbstractC1053c m4751p2() {
        if (this.f3738Q == null) {
            this.f3738Q = AbstractC1053c.m4878g(this, this);
        }
        return this.f3738Q;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i11) {
        m4751p2().mo4785A(i11);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        super.setTheme(i11);
        m4751p2().mo4788D(i11);
    }

    /* renamed from: t2 */
    public ActionBar m4752t2() {
        return m4751p2().mo4816m();
    }

    /* renamed from: x2 */
    public void m4753x2(C1353k1 c1353k1) {
        c1353k1.m6777e(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        m4751p2().mo4786B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4751p2().mo4787C(view, layoutParams);
    }
}
