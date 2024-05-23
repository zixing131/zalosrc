package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.AbstractC1023b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC1022a;
import androidx.core.app.AbstractC1324b;
import androidx.core.app.AbstractC1327c;
import androidx.core.app.C1344h1;
import androidx.core.app.C1358n;
import androidx.core.app.InterfaceC1338f1;
import androidx.core.util.InterfaceC1479a;
import androidx.core.view.C1616x;
import androidx.lifecycle.AbstractC1759b1;
import androidx.lifecycle.AbstractC1762c1;
import androidx.lifecycle.AbstractC1782m0;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1788p0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1805y;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1783n;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.ReportFragment;
import androidx.savedstate.C1938a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p089d2.AbstractC17713e;
import p089d2.C17711c;
import p089d2.InterfaceC17712d;
import p117e0.C18155a;
import p117e0.InterfaceC18156b;
import p145f0.AbstractC18683a;
import p253j2.AbstractC20905b;
import p534u1.AbstractC26941a;
import p534u1.C26944d;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC1801w, InterfaceC1756a1, InterfaceC1783n, InterfaceC17712d, InterfaceC1012f, InterfaceC1338f1 {

    /* renamed from: A */
    private final ActivityResultRegistry f3551A;

    /* renamed from: B */
    private final CopyOnWriteArrayList f3552B;

    /* renamed from: C */
    private final CopyOnWriteArrayList f3553C;

    /* renamed from: D */
    private final CopyOnWriteArrayList f3554D;

    /* renamed from: E */
    private final CopyOnWriteArrayList f3555E;

    /* renamed from: F */
    private final CopyOnWriteArrayList f3556F;

    /* renamed from: r */
    final C18155a f3557r = new C18155a();

    /* renamed from: s */
    private final C1616x f3558s = new C1616x(new Runnable() { // from class: androidx.activity.b
        public /* synthetic */ RunnableC1008b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.m4651y1();
        }
    });

    /* renamed from: t */
    private final C1805y f3559t = new C1805y(this);

    /* renamed from: u */
    final C17711c f3560u;

    /* renamed from: v */
    private C1808z0 f3561v;

    /* renamed from: w */
    private C1802w0.b f3562w;

    /* renamed from: x */
    private final OnBackPressedDispatcher f3563x;

    /* renamed from: y */
    private int f3564y;

    /* renamed from: z */
    private final AtomicInteger f3565z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$3 */
    /* loaded from: classes.dex */
    public class C09993 implements InterfaceC1795t {
        C09993() {
        }

        @Override // androidx.lifecycle.InterfaceC1795t
        /* renamed from: X6 */
        public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            View view;
            if (aVar == AbstractC1785o.a.ON_STOP) {
                Window window = ComponentActivity.this.getWindow();
                if (window != null) {
                    view = window.peekDecorView();
                } else {
                    view = null;
                }
                if (view != null) {
                    C1004c.m4654a(view);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$4 */
    /* loaded from: classes.dex */
    public class C10004 implements InterfaceC1795t {
        C10004() {
        }

        @Override // androidx.lifecycle.InterfaceC1795t
        /* renamed from: X6 */
        public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            if (aVar == AbstractC1785o.a.ON_DESTROY) {
                ComponentActivity.this.f3557r.m96452b();
                if (!ComponentActivity.this.isChangingConfigurations()) {
                    ComponentActivity.this.mo4644Oc().m9414a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$5 */
    /* loaded from: classes.dex */
    public class C10015 implements InterfaceC1795t {
        C10015() {
        }

        @Override // androidx.lifecycle.InterfaceC1795t
        /* renamed from: X6 */
        public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            ComponentActivity.this.m4650v1();
            ComponentActivity.this.getLifecycle().mo9338d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes.dex */
    public class RunnableC1002a implements Runnable {
        RunnableC1002a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e11) {
                if (TextUtils.equals(e11.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                } else {
                    throw e11;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes.dex */
    public class C1003b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ int f3571p;

            /* renamed from: q */
            final /* synthetic */ IntentSender.SendIntentException f3572q;

            a(int i11, IntentSender.SendIntentException sendIntentException) {
                this.f3571p = i11;
                this.f3572q = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1003b.this.m4677b(this.f3571p, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f3572q));
            }
        }

        C1003b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: e */
        public void mo4653e(int i11, AbstractC18683a abstractC18683a, Object obj, AbstractC1327c abstractC1327c) {
            Bundle bundle;
            Bundle bundle2;
            ComponentActivity componentActivity = ComponentActivity.this;
            abstractC18683a.m98587b(componentActivity, obj);
            Intent mo98586a = abstractC18683a.mo98586a(componentActivity, obj);
            if (mo98586a.getExtras() != null && mo98586a.getExtras().getClassLoader() == null) {
                mo98586a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (mo98586a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = mo98586a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo98586a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle2 = bundleExtra;
            } else {
                if (abstractC1327c != null) {
                    bundle = abstractC1327c.mo6661b();
                } else {
                    bundle = null;
                }
                bundle2 = bundle;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo98586a.getAction())) {
                String[] stringArrayExtra = mo98586a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC1324b.m6640w(componentActivity, stringArrayExtra, i11);
                return;
            }
            if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo98586a.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) mo98586a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    AbstractC1324b.m6643z(componentActivity, intentSenderRequest.m4688d(), i11, intentSenderRequest.m4685a(), intentSenderRequest.m4686b(), intentSenderRequest.m4687c(), 0, bundle2);
                    return;
                } catch (IntentSender.SendIntentException e11) {
                    new Handler(Looper.getMainLooper()).post(new a(i11, e11));
                    return;
                }
            }
            AbstractC1324b.m6642y(componentActivity, mo98586a, i11, bundle2);
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes2.dex */
    static class C1004c {
        /* renamed from: a */
        static void m4654a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes2.dex */
    public static final class C1005d {

        /* renamed from: a */
        Object f3574a;

        /* renamed from: b */
        C1808z0 f3575b;

        C1005d() {
        }
    }

    public ComponentActivity() {
        C17711c m93782a = C17711c.m93782a(this);
        this.f3560u = m93782a;
        this.f3563x = new OnBackPressedDispatcher(new RunnableC1002a());
        this.f3565z = new AtomicInteger();
        this.f3551A = new C1003b();
        this.f3552B = new CopyOnWriteArrayList();
        this.f3553C = new CopyOnWriteArrayList();
        this.f3554D = new CopyOnWriteArrayList();
        this.f3555E = new CopyOnWriteArrayList();
        this.f3556F = new CopyOnWriteArrayList();
        if (getLifecycle() != null) {
            int i11 = Build.VERSION.SDK_INT;
            getLifecycle().mo9335a(new InterfaceC1795t() { // from class: androidx.activity.ComponentActivity.3
                C09993() {
                }

                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                    View view;
                    if (aVar == AbstractC1785o.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            C1004c.m4654a(view);
                        }
                    }
                }
            });
            getLifecycle().mo9335a(new InterfaceC1795t() { // from class: androidx.activity.ComponentActivity.4
                C10004() {
                }

                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                    if (aVar == AbstractC1785o.a.ON_DESTROY) {
                        ComponentActivity.this.f3557r.m96452b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.mo4644Oc().m9414a();
                        }
                    }
                }
            });
            getLifecycle().mo9335a(new InterfaceC1795t() { // from class: androidx.activity.ComponentActivity.5
                C10015() {
                }

                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                    ComponentActivity.this.m4650v1();
                    ComponentActivity.this.getLifecycle().mo9338d(this);
                }
            });
            m93782a.m93784c();
            AbstractC1782m0.m9327c(this);
            if (i11 <= 23) {
                getLifecycle().mo9335a(new ImmLeaksCleaner(this));
            }
            mo4648jf().m10709h("android:support:activity-result", new C1938a.c() { // from class: androidx.activity.c
                public /* synthetic */ C1009c() {
                }

                @Override // androidx.savedstate.C1938a.c
                /* renamed from: a */
                public final Bundle mo4659a() {
                    Bundle m4638z1;
                    m4638z1 = ComponentActivity.this.m4638z1();
                    return m4638z1;
                }
            });
            m4649u1(new InterfaceC18156b() { // from class: androidx.activity.d
                public /* synthetic */ C1010d() {
                }

                @Override // p117e0.InterfaceC18156b
                /* renamed from: a */
                public final void mo4660a(Context context) {
                    ComponentActivity.this.m4633B1(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: B1 */
    public /* synthetic */ void m4633B1(Context context) {
        Bundle m10704b = mo4648jf().m10704b("android:support:activity-result");
        if (m10704b != null) {
            this.f3551A.m4678f(m10704b);
        }
    }

    /* renamed from: w1 */
    private void m4637w1() {
        AbstractC1759b1.m9260b(getWindow().getDecorView(), this);
        AbstractC1762c1.m9271a(getWindow().getDecorView(), this);
        AbstractC17713e.m93788a(getWindow().getDecorView(), this);
        AbstractC1014h.m4667a(getWindow().getDecorView(), this);
    }

    /* renamed from: z1 */
    public /* synthetic */ Bundle m4638z1() {
        Bundle bundle = new Bundle();
        this.f3551A.m4679g(bundle);
        return bundle;
    }

    @Override // androidx.core.app.InterfaceC1338f1
    /* renamed from: C0 */
    public final void mo4639C0(InterfaceC1479a interfaceC1479a) {
        this.f3555E.add(interfaceC1479a);
    }

    /* renamed from: C1 */
    public Object m4640C1() {
        return null;
    }

    /* renamed from: F1 */
    public final AbstractC1023b m4641F1(AbstractC18683a abstractC18683a, InterfaceC1022a interfaceC1022a) {
        return m4645P1(abstractC18683a, this.f3551A, interfaceC1022a);
    }

    @Override // androidx.activity.InterfaceC1012f
    /* renamed from: Ko */
    public final OnBackPressedDispatcher mo4642Ko() {
        return this.f3563x;
    }

    @Override // androidx.core.app.InterfaceC1338f1
    /* renamed from: N */
    public final void mo4643N(InterfaceC1479a interfaceC1479a) {
        this.f3555E.remove(interfaceC1479a);
    }

    @Override // androidx.lifecycle.InterfaceC1756a1
    /* renamed from: Oc */
    public C1808z0 mo4644Oc() {
        if (getApplication() != null) {
            m4650v1();
            return this.f3561v;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: P1 */
    public final AbstractC1023b m4645P1(AbstractC18683a abstractC18683a, ActivityResultRegistry activityResultRegistry, InterfaceC1022a interfaceC1022a) {
        return activityResultRegistry.m4680h("activity_rq#" + this.f3565z.getAndIncrement(), this, abstractC18683a, interfaceC1022a);
    }

    @Override // androidx.lifecycle.InterfaceC1783n
    /* renamed from: Xs */
    public C1802w0.b mo4646Xs() {
        Bundle bundle;
        if (this.f3562w == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.f3562w = new C1788p0(application, this, bundle);
        }
        return this.f3562w;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4637w1();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC1783n
    /* renamed from: at */
    public AbstractC26941a mo4647at() {
        C26944d c26944d = new C26944d();
        if (getApplication() != null) {
            c26944d.m138790c(C1802w0.a.f7414f, getApplication());
        }
        c26944d.m138790c(AbstractC1782m0.f7352a, this);
        c26944d.m138790c(AbstractC1782m0.f7353b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c26944d.m138790c(AbstractC1782m0.f7354c, getIntent().getExtras());
        }
        return c26944d;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC1801w
    public AbstractC1785o getLifecycle() {
        return this.f3559t;
    }

    @Override // p089d2.InterfaceC17712d
    /* renamed from: jf */
    public final C1938a mo4648jf() {
        return this.f3560u.m93783b();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (!this.f3551A.m4677b(i11, i12, intent)) {
            super.onActivityResult(i11, i12, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f3563x.m4658c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f3552B.iterator();
        while (it.hasNext()) {
            ((InterfaceC1479a) it.next()).accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f3560u.m93785d(bundle);
        this.f3557r.m96453c(this);
        super.onCreate(bundle);
        ReportFragment.m9243e(this);
        int i11 = this.f3564y;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i11, Menu menu) {
        if (i11 == 0) {
            super.onCreatePanelMenu(i11, menu);
            this.f3558s.m8247a(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 == 0) {
            return this.f3558s.m8249c(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z11) {
        Iterator it = this.f3555E.iterator();
        while (it.hasNext()) {
            ((InterfaceC1479a) it.next()).accept(new C1358n(z11));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f3554D.iterator();
        while (it.hasNext()) {
            ((InterfaceC1479a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, Menu menu) {
        this.f3558s.m8248b(menu);
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z11) {
        Iterator it = this.f3556F.iterator();
        while (it.hasNext()) {
            ((InterfaceC1479a) it.next()).accept(new C1344h1(z11));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i11, View view, Menu menu) {
        if (i11 == 0) {
            super.onPreparePanel(i11, view, menu);
            this.f3558s.m8250d(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (!this.f3551A.m4677b(i11, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C1005d c1005d;
        Object m4640C1 = m4640C1();
        C1808z0 c1808z0 = this.f3561v;
        if (c1808z0 == null && (c1005d = (C1005d) getLastNonConfigurationInstance()) != null) {
            c1808z0 = c1005d.f3575b;
        }
        if (c1808z0 == null && m4640C1 == null) {
            return null;
        }
        C1005d c1005d2 = new C1005d();
        c1005d2.f3574a = m4640C1;
        c1005d2.f3575b = c1808z0;
        return c1005d2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1785o lifecycle = getLifecycle();
        if (lifecycle instanceof C1805y) {
            ((C1805y) lifecycle).m9402o(AbstractC1785o.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f3560u.m93786e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        Iterator it = this.f3553C.iterator();
        while (it.hasNext()) {
            ((InterfaceC1479a) it.next()).accept(Integer.valueOf(i11));
        }
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC20905b.m109374d()) {
                AbstractC20905b.m109371a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            AbstractC20905b.m109372b();
        } catch (Throwable th2) {
            AbstractC20905b.m109372b();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i11) {
        m4637w1();
        super.setContentView(i11);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i11) {
        super.startActivityForResult(intent, i11);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14) {
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14);
    }

    /* renamed from: u1 */
    public final void m4649u1(InterfaceC18156b interfaceC18156b) {
        this.f3557r.m96451a(interfaceC18156b);
    }

    /* renamed from: v1 */
    void m4650v1() {
        if (this.f3561v == null) {
            C1005d c1005d = (C1005d) getLastNonConfigurationInstance();
            if (c1005d != null) {
                this.f3561v = c1005d.f3575b;
            }
            if (this.f3561v == null) {
                this.f3561v = new C1808z0();
            }
        }
    }

    /* renamed from: y1 */
    public void m4651y1() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        super.startActivityForResult(intent, i11, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z11, Configuration configuration) {
        Iterator it = this.f3555E.iterator();
        while (it.hasNext()) {
            ((InterfaceC1479a) it.next()).accept(new C1358n(z11, configuration));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z11, Configuration configuration) {
        Iterator it = this.f3556F.iterator();
        while (it.hasNext()) {
            ((InterfaceC1479a) it.next()).accept(new C1344h1(z11, configuration));
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m4637w1();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m4637w1();
        super.setContentView(view, layoutParams);
    }
}
