package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC1012f;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.AbstractC1324b;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1805y;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.loader.app.AbstractC1809a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p665y0.C30246h;

/* loaded from: classes2.dex */
public class FragmentActivity extends ComponentActivity implements AbstractC1324b.d, AbstractC1324b.f {

    /* renamed from: I */
    boolean f6990I;

    /* renamed from: J */
    boolean f6991J;

    /* renamed from: L */
    boolean f6993L;

    /* renamed from: M */
    boolean f6994M;

    /* renamed from: N */
    boolean f6995N;

    /* renamed from: O */
    int f6996O;

    /* renamed from: P */
    C30246h f6997P;

    /* renamed from: G */
    final C1730d f6988G = C1730d.m8958b(new C1722a());

    /* renamed from: H */
    final C1805y f6989H = new C1805y(this);

    /* renamed from: K */
    boolean f6992K = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    /* loaded from: classes2.dex */
    public class C1722a extends AbstractC1732f implements InterfaceC1756a1, InterfaceC1012f {
        public C1722a() {
            super(FragmentActivity.this);
        }

        @Override // androidx.activity.InterfaceC1012f
        /* renamed from: Ko */
        public OnBackPressedDispatcher mo4642Ko() {
            return FragmentActivity.this.mo4642Ko();
        }

        @Override // androidx.lifecycle.InterfaceC1756a1
        /* renamed from: Oc */
        public C1808z0 mo4644Oc() {
            return FragmentActivity.this.mo4644Oc();
        }

        @Override // androidx.fragment.app.AbstractC1729c
        /* renamed from: b */
        public View mo8897b(int i11) {
            return FragmentActivity.this.findViewById(i11);
        }

        @Override // androidx.fragment.app.AbstractC1729c
        /* renamed from: c */
        public boolean mo8898c() {
            Window window = FragmentActivity.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.fragment.app.AbstractC1732f
        /* renamed from: g */
        public void mo8912g(Fragment fragment) {
            FragmentActivity.this.m8908e2(fragment);
        }

        @Override // androidx.lifecycle.InterfaceC1801w
        public AbstractC1785o getLifecycle() {
            return FragmentActivity.this.f6989H;
        }

        @Override // androidx.fragment.app.AbstractC1732f
        /* renamed from: h */
        public void mo8913h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC1732f
        /* renamed from: j */
        public LayoutInflater mo8915j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.AbstractC1732f
        /* renamed from: k */
        public int mo8916k() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.AbstractC1732f
        /* renamed from: l */
        public boolean mo8917l() {
            if (FragmentActivity.this.getWindow() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.fragment.app.AbstractC1732f
        /* renamed from: m */
        public boolean mo8918m(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC1732f
        /* renamed from: n */
        public void mo8919n(Fragment fragment, Intent intent, int i11, Bundle bundle) {
            FragmentActivity.this.m8911l2(fragment, intent, i11, bundle);
        }

        @Override // androidx.fragment.app.AbstractC1732f
        /* renamed from: o */
        public void mo8920o() {
            FragmentActivity.this.mo4750n2();
        }

        @Override // androidx.fragment.app.AbstractC1732f
        /* renamed from: p */
        public FragmentActivity mo8914i() {
            return FragmentActivity.this;
        }
    }

    /* renamed from: T1 */
    private int m8901T1(Fragment fragment) {
        if (this.f6997P.m149179m() < 65534) {
            while (this.f6997P.m149174h(this.f6996O) >= 0) {
                this.f6996O = (this.f6996O + 1) % 65534;
            }
            int i11 = this.f6996O;
            this.f6997P.m149177k(i11, fragment.f6959t);
            this.f6996O = (this.f6996O + 1) % 65534;
            return i11;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: V1 */
    static void m8902V1(int i11) {
        if ((i11 & (-65536)) == 0) {
        } else {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: b2 */
    private void m8903b2() {
        do {
        } while (m8904c2(m8906Z1(), AbstractC1785o.b.CREATED));
    }

    /* renamed from: c2 */
    private static boolean m8904c2(AbstractC1733g abstractC1733g, AbstractC1785o.b bVar) {
        boolean z11 = false;
        for (Fragment fragment : abstractC1733g.mo8995f()) {
            if (fragment != null) {
                if (fragment.getLifecycle().mo9336b().m9345c(AbstractC1785o.b.STARTED)) {
                    fragment.f6950h0.m9402o(bVar);
                    z11 = true;
                }
                if (fragment.m8880t() != null) {
                    z11 |= m8904c2(fragment.m8866m(), bVar);
                }
            }
        }
        return z11;
    }

    @Override // androidx.core.app.AbstractC1324b.f
    /* renamed from: P */
    public final void mo6650P(int i11) {
        if (!this.f6993L && i11 != -1) {
            m8902V1(i11);
        }
    }

    /* renamed from: Y1 */
    final View m8905Y1(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f6988G.m8980w(view, str, context, attributeSet);
    }

    /* renamed from: Z1 */
    public AbstractC1733g m8906Z1() {
        return this.f6988G.m8978u();
    }

    /* renamed from: a2 */
    public AbstractC1809a m8907a2() {
        return AbstractC1809a.m9418b(this);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f6990I);
        printWriter.print(" mResumed=");
        printWriter.print(this.f6991J);
        printWriter.print(" mStopped=");
        printWriter.print(this.f6992K);
        if (getApplication() != null) {
            AbstractC1809a.m9418b(this).mo9419a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f6988G.m8978u().mo8991b(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e2 */
    public void m8908e2(Fragment fragment) {
    }

    /* renamed from: f2 */
    protected boolean m8909f2(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: g2 */
    protected void m8910g2() {
        this.f6989H.m9400i(AbstractC1785o.a.ON_RESUME);
        this.f6988G.m8973p();
    }

    /* renamed from: l2 */
    public void m8911l2(Fragment fragment, Intent intent, int i11, Bundle bundle) {
        this.f6995N = true;
        try {
            if (i11 == -1) {
                AbstractC1324b.m6642y(this, intent, -1, bundle);
            } else {
                m8902V1(i11);
                AbstractC1324b.m6642y(this, intent, ((m8901T1(fragment) + 1) << 16) + (i11 & 65535), bundle);
            }
        } finally {
            this.f6995N = false;
        }
    }

    /* renamed from: n2 */
    public void mo4750n2() {
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.f6988G.m8979v();
        int i13 = i11 >> 16;
        if (i13 != 0) {
            int i14 = i13 - 1;
            String str = (String) this.f6997P.m149172f(i14);
            this.f6997P.m149178l(i14);
            if (str == null) {
                return;
            }
            Fragment m8977t = this.f6988G.m8977t(str);
            if (m8977t == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Activity result no fragment exists for who: ");
                sb2.append(str);
                return;
            }
            m8977t.mo8819S(i11 & 65535, i12, intent);
            return;
        }
        AbstractC1324b.m6637t();
        super.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6988G.m8979v();
        this.f6988G.m8961d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f6988G.m8959a(null);
        if (bundle != null) {
            this.f6988G.m8981x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f6996O = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray != null && stringArray != null && intArray.length == stringArray.length) {
                    this.f6997P = new C30246h(intArray.length);
                    for (int i11 = 0; i11 < intArray.length; i11++) {
                        this.f6997P.m149177k(intArray[i11], stringArray[i11]);
                    }
                }
            }
        }
        if (this.f6997P == null) {
            this.f6997P = new C30246h();
            this.f6996O = 0;
        }
        super.onCreate(bundle);
        this.f6989H.m9400i(AbstractC1785o.a.ON_CREATE);
        this.f6988G.m8963f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i11, Menu menu) {
        if (i11 == 0) {
            return super.onCreatePanelMenu(i11, menu) | this.f6988G.m8964g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i11, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m8905Y1 = m8905Y1(view, str, context, attributeSet);
        return m8905Y1 == null ? super.onCreateView(view, str, context, attributeSet) : m8905Y1;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f6988G.m8965h();
        this.f6989H.m9400i(AbstractC1785o.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f6988G.m8966i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 != 0) {
            if (i11 != 6) {
                return false;
            }
            return this.f6988G.m8962e(menuItem);
        }
        return this.f6988G.m8968k(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z11) {
        this.f6988G.m8967j(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f6988G.m8979v();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, Menu menu) {
        if (i11 == 0) {
            this.f6988G.m8969l(menu);
        }
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f6991J = false;
        this.f6988G.m8970m();
        this.f6989H.m9400i(AbstractC1785o.a.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z11) {
        this.f6988G.m8971n(z11);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m8910g2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i11, View view, Menu menu) {
        if (i11 == 0) {
            return m8909f2(view, menu) | this.f6988G.m8972o(menu);
        }
        return super.onPreparePanel(i11, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        this.f6988G.m8979v();
        int i12 = (i11 >> 16) & 65535;
        if (i12 != 0) {
            int i13 = i12 - 1;
            String str = (String) this.f6997P.m149172f(i13);
            this.f6997P.m149178l(i13);
            if (str == null) {
                return;
            }
            Fragment m8977t = this.f6988G.m8977t(str);
            if (m8977t == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Activity result no fragment exists for who: ");
                sb2.append(str);
                return;
            }
            m8977t.m8877r0(i11 & 65535, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f6991J = true;
        this.f6988G.m8979v();
        this.f6988G.m8976s();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m8903b2();
        this.f6989H.m9400i(AbstractC1785o.a.ON_STOP);
        Parcelable m8982y = this.f6988G.m8982y();
        if (m8982y != null) {
            bundle.putParcelable("android:support:fragments", m8982y);
        }
        if (this.f6997P.m149179m() > 0) {
            bundle.putInt("android:support:next_request_index", this.f6996O);
            int[] iArr = new int[this.f6997P.m149179m()];
            String[] strArr = new String[this.f6997P.m149179m()];
            for (int i11 = 0; i11 < this.f6997P.m149179m(); i11++) {
                iArr[i11] = this.f6997P.m149176j(i11);
                strArr[i11] = (String) this.f6997P.m149180n(i11);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f6992K = false;
        if (!this.f6990I) {
            this.f6990I = true;
            this.f6988G.m8960c();
        }
        this.f6988G.m8979v();
        this.f6988G.m8976s();
        this.f6989H.m9400i(AbstractC1785o.a.ON_START);
        this.f6988G.m8974q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f6988G.m8979v();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f6992K = true;
        m8903b2();
        this.f6988G.m8975r();
        this.f6989H.m9400i(AbstractC1785o.a.ON_STOP);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i11) {
        if (!this.f6995N && i11 != -1) {
            m8902V1(i11);
        }
        super.startActivityForResult(intent, i11);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14) {
        if (!this.f6994M && i11 != -1) {
            m8902V1(i11);
        }
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m8905Y1 = m8905Y1(null, str, context, attributeSet);
        return m8905Y1 == null ? super.onCreateView(str, context, attributeSet) : m8905Y1;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        if (!this.f6995N && i11 != -1) {
            m8902V1(i11);
        }
        super.startActivityForResult(intent, i11, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        if (!this.f6994M && i11 != -1) {
            m8902V1(i11);
        }
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
    }
}
