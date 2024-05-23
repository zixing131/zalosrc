package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC1350j1;
import androidx.core.util.AbstractC1480b;
import androidx.core.view.AbstractC1610v;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1805y;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import androidx.loader.app.AbstractC1809a;
import androidx.savedstate.C1938a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p089d2.C17711c;
import p089d2.InterfaceC17712d;

/* loaded from: classes2.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1801w, InterfaceC1756a1, InterfaceC17712d {

    /* renamed from: m0 */
    static final Object f6916m0 = new Object();

    /* renamed from: A */
    boolean f6917A;

    /* renamed from: B */
    boolean f6918B;

    /* renamed from: C */
    boolean f6919C;

    /* renamed from: D */
    boolean f6920D;

    /* renamed from: E */
    boolean f6921E;

    /* renamed from: F */
    int f6922F;

    /* renamed from: G */
    LayoutInflaterFactory2C1734h f6923G;

    /* renamed from: H */
    AbstractC1732f f6924H;

    /* renamed from: J */
    Fragment f6926J;

    /* renamed from: K */
    int f6927K;

    /* renamed from: L */
    int f6928L;

    /* renamed from: M */
    String f6929M;

    /* renamed from: N */
    boolean f6930N;

    /* renamed from: O */
    boolean f6931O;

    /* renamed from: P */
    boolean f6932P;

    /* renamed from: Q */
    boolean f6933Q;

    /* renamed from: R */
    boolean f6934R;

    /* renamed from: T */
    private boolean f6936T;

    /* renamed from: U */
    ViewGroup f6937U;

    /* renamed from: V */
    View f6938V;

    /* renamed from: W */
    View f6939W;

    /* renamed from: X */
    boolean f6940X;

    /* renamed from: Z */
    C1720d f6942Z;

    /* renamed from: b0 */
    boolean f6944b0;

    /* renamed from: c0 */
    boolean f6945c0;

    /* renamed from: d0 */
    float f6946d0;

    /* renamed from: e0 */
    LayoutInflater f6947e0;

    /* renamed from: f0 */
    boolean f6948f0;

    /* renamed from: h0 */
    C1805y f6950h0;

    /* renamed from: i0 */
    C1740n f6951i0;

    /* renamed from: k0 */
    C17711c f6953k0;

    /* renamed from: l0 */
    private int f6954l0;

    /* renamed from: q */
    Bundle f6956q;

    /* renamed from: r */
    SparseArray f6957r;

    /* renamed from: s */
    Boolean f6958s;

    /* renamed from: u */
    Bundle f6960u;

    /* renamed from: v */
    Fragment f6961v;

    /* renamed from: x */
    int f6963x;

    /* renamed from: z */
    boolean f6965z;

    /* renamed from: p */
    int f6955p = 0;

    /* renamed from: t */
    String f6959t = UUID.randomUUID().toString();

    /* renamed from: w */
    String f6962w = null;

    /* renamed from: y */
    private Boolean f6964y = null;

    /* renamed from: I */
    LayoutInflaterFactory2C1734h f6925I = new LayoutInflaterFactory2C1734h();

    /* renamed from: S */
    boolean f6935S = true;

    /* renamed from: Y */
    boolean f6941Y = true;

    /* renamed from: a0 */
    Runnable f6943a0 = new RunnableC1717a();

    /* renamed from: g0 */
    AbstractC1785o.b f6949g0 = AbstractC1785o.b.RESUMED;

    /* renamed from: j0 */
    C1761c0 f6952j0 = new C1761c0();

    /* renamed from: androidx.fragment.app.Fragment$2 */
    /* loaded from: classes2.dex */
    public class C17152 implements InterfaceC1795t {
        C17152() {
        }

        @Override // androidx.lifecycle.InterfaceC1795t
        /* renamed from: X6 */
        public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            View view;
            if (aVar == AbstractC1785o.a.ON_STOP && (view = Fragment.this.f6938V) != null) {
                view.cancelPendingInputEvents();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1716a();

        /* renamed from: p */
        final Bundle f6967p;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        /* loaded from: classes2.dex */
        static class C1716a implements Parcelable.ClassLoaderCreator {
            C1716a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f6967p = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeBundle(this.f6967p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes2.dex */
    public class RunnableC1717a implements Runnable {
        RunnableC1717a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m8863k1();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes2.dex */
    public class RunnableC1718b implements Runnable {
        RunnableC1718b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m8841d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes2.dex */
    public class C1719c extends AbstractC1729c {
        C1719c() {
        }

        @Override // androidx.fragment.app.AbstractC1729c
        /* renamed from: b */
        public View mo8897b(int i11) {
            View view = Fragment.this.f6938V;
            if (view != null) {
                return view.findViewById(i11);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC1729c
        /* renamed from: c */
        public boolean mo8898c() {
            if (Fragment.this.f6938V != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes2.dex */
    public static class C1720d {

        /* renamed from: a */
        View f6971a;

        /* renamed from: b */
        Animator f6972b;

        /* renamed from: c */
        int f6973c;

        /* renamed from: d */
        int f6974d;

        /* renamed from: e */
        int f6975e;

        /* renamed from: f */
        int f6976f;

        /* renamed from: g */
        Object f6977g = null;

        /* renamed from: h */
        Object f6978h;

        /* renamed from: i */
        Object f6979i;

        /* renamed from: j */
        Object f6980j;

        /* renamed from: k */
        Object f6981k;

        /* renamed from: l */
        Object f6982l;

        /* renamed from: m */
        Boolean f6983m;

        /* renamed from: n */
        Boolean f6984n;

        /* renamed from: o */
        boolean f6985o;

        /* renamed from: p */
        InterfaceC1721e f6986p;

        /* renamed from: q */
        boolean f6987q;

        C1720d() {
            Object obj = Fragment.f6916m0;
            this.f6978h = obj;
            this.f6979i = null;
            this.f6980j = obj;
            this.f6981k = null;
            this.f6982l = obj;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC1721e {
        /* renamed from: a */
        void mo8899a();

        /* renamed from: b */
        void mo8900b();
    }

    public Fragment() {
        m8782I();
    }

    /* renamed from: I */
    private void m8782I() {
        this.f6950h0 = new C1805y(this);
        this.f6953k0 = C17711c.m93782a(this);
        this.f6950h0.mo9335a(new InterfaceC1795t() { // from class: androidx.fragment.app.Fragment.2
            C17152() {
            }

            @Override // androidx.lifecycle.InterfaceC1795t
            /* renamed from: X6 */
            public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                View view;
                if (aVar == AbstractC1785o.a.ON_STOP && (view = Fragment.this.f6938V) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
    }

    /* renamed from: K */
    public static Fragment m8783K(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C1731e.m8985d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.m8843d1(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e11) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (java.lang.InstantiationException e12) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e12);
        } catch (NoSuchMethodException e13) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e13);
        } catch (InvocationTargetException e14) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e14);
        }
    }

    /* renamed from: f */
    private C1720d m8784f() {
        if (this.f6942Z == null) {
            this.f6942Z = new C1720d();
        }
        return this.f6942Z;
    }

    /* renamed from: A */
    public final Resources m8785A() {
        return m8828W0().getResources();
    }

    /* renamed from: A0 */
    public void m8786A0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f6925I.m9043B(configuration);
    }

    /* renamed from: B */
    public final boolean m8787B() {
        return this.f6932P;
    }

    /* renamed from: B0 */
    public boolean m8788B0(MenuItem menuItem) {
        if (!this.f6930N) {
            if (m8827W(menuItem) || this.f6925I.m9045C(menuItem)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: C */
    public Object m8789C() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        Object obj = c1720d.f6978h;
        if (obj == f6916m0) {
            return m8870o();
        }
        return obj;
    }

    /* renamed from: C0 */
    public void m8790C0(Bundle bundle) {
        this.f6925I.m9078U0();
        this.f6955p = 1;
        this.f6936T = false;
        this.f6953k0.m93785d(bundle);
        mo8829X(bundle);
        this.f6948f0 = true;
        if (this.f6936T) {
            this.f6950h0.m9400i(AbstractC1785o.a.ON_CREATE);
            return;
        }
        throw new C1741o("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: D */
    public Object m8791D() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        return c1720d.f6981k;
    }

    /* renamed from: D0 */
    public boolean m8792D0(Menu menu, MenuInflater menuInflater) {
        boolean z11 = false;
        if (this.f6930N) {
            return false;
        }
        if (this.f6934R && this.f6935S) {
            m8835a0(menu, menuInflater);
            z11 = true;
        }
        return z11 | this.f6925I.m9049E(menu, menuInflater);
    }

    /* renamed from: E */
    public Object m8793E() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        Object obj = c1720d.f6982l;
        if (obj == f6916m0) {
            return m8791D();
        }
        return obj;
    }

    /* renamed from: E0 */
    public void m8794E0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f6925I.m9078U0();
        this.f6921E = true;
        this.f6951i0 = new C1740n();
        View m8837b0 = m8837b0(layoutInflater, viewGroup, bundle);
        this.f6938V = m8837b0;
        if (m8837b0 != null) {
            this.f6951i0.m9198b();
            this.f6952j0.mo9224q(this.f6951i0);
        } else {
            if (!this.f6951i0.m9199c()) {
                this.f6951i0 = null;
                return;
            }
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: F */
    public int m8795F() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return 0;
        }
        return c1720d.f6973c;
    }

    /* renamed from: F0 */
    public void m8796F0() {
        this.f6925I.m9051F();
        this.f6950h0.m9400i(AbstractC1785o.a.ON_DESTROY);
        this.f6955p = 0;
        this.f6936T = false;
        this.f6948f0 = false;
        mo8839c0();
        if (this.f6936T) {
            return;
        }
        throw new C1741o("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: G */
    public final Fragment m8797G() {
        String str;
        Fragment fragment = this.f6961v;
        if (fragment != null) {
            return fragment;
        }
        LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = this.f6923G;
        if (layoutInflaterFactory2C1734h != null && (str = this.f6962w) != null) {
            return (Fragment) layoutInflaterFactory2C1734h.f7077v.get(str);
        }
        return null;
    }

    /* renamed from: G0 */
    public void m8798G0() {
        this.f6925I.m9053G();
        if (this.f6938V != null) {
            this.f6951i0.m9197a(AbstractC1785o.a.ON_DESTROY);
        }
        this.f6955p = 1;
        this.f6936T = false;
        mo8845e0();
        if (this.f6936T) {
            AbstractC1809a.m9418b(this).mo9421d();
            this.f6921E = false;
        } else {
            throw new C1741o("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    /* renamed from: H */
    public View m8799H() {
        return this.f6938V;
    }

    /* renamed from: H0 */
    public void m8800H0() {
        this.f6936T = false;
        mo8847f0();
        this.f6947e0 = null;
        if (this.f6936T) {
            if (!this.f6925I.m9052F0()) {
                this.f6925I.m9051F();
                this.f6925I = new LayoutInflaterFactory2C1734h();
                return;
            }
            return;
        }
        throw new C1741o("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* renamed from: I0 */
    public LayoutInflater m8801I0(Bundle bundle) {
        LayoutInflater mo8850g0 = mo8850g0(bundle);
        this.f6947e0 = mo8850g0;
        return mo8850g0;
    }

    /* renamed from: J */
    public void m8802J() {
        m8782I();
        this.f6959t = UUID.randomUUID().toString();
        this.f6965z = false;
        this.f6917A = false;
        this.f6918B = false;
        this.f6919C = false;
        this.f6920D = false;
        this.f6922F = 0;
        this.f6923G = null;
        this.f6925I = new LayoutInflaterFactory2C1734h();
        this.f6924H = null;
        this.f6927K = 0;
        this.f6928L = 0;
        this.f6929M = null;
        this.f6930N = false;
        this.f6931O = false;
    }

    /* renamed from: J0 */
    public void m8803J0() {
        onLowMemory();
        this.f6925I.m9054H();
    }

    /* renamed from: K0 */
    public void m8804K0(boolean z11) {
        m8862k0(z11);
        this.f6925I.m9056I(z11);
    }

    /* renamed from: L */
    public boolean m8805L() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return false;
        }
        return c1720d.f6987q;
    }

    /* renamed from: L0 */
    public boolean m8806L0(MenuItem menuItem) {
        if (!this.f6930N) {
            if ((this.f6934R && this.f6935S && m8865l0(menuItem)) || this.f6925I.m9082X(menuItem)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m8807M() {
        return this.f6922F > 0;
    }

    /* renamed from: M0 */
    public void m8808M0(Menu menu) {
        if (!this.f6930N) {
            if (this.f6934R && this.f6935S) {
                m8867m0(menu);
            }
            this.f6925I.m9084Y(menu);
        }
    }

    /* renamed from: N */
    public boolean m8809N() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return false;
        }
        return c1720d.f6985o;
    }

    /* renamed from: N0 */
    public void m8810N0() {
        this.f6925I.m9086a0();
        if (this.f6938V != null) {
            this.f6951i0.m9197a(AbstractC1785o.a.ON_PAUSE);
        }
        this.f6950h0.m9400i(AbstractC1785o.a.ON_PAUSE);
        this.f6955p = 3;
        this.f6936T = false;
        m8869n0();
        if (this.f6936T) {
            return;
        }
        throw new C1741o("Fragment " + this + " did not call through to super.onPause()");
    }

    /* renamed from: O */
    public final boolean m8811O() {
        return this.f6917A;
    }

    /* renamed from: O0 */
    public void m8812O0(boolean z11) {
        m8871o0(z11);
        this.f6925I.m9088b0(z11);
    }

    @Override // androidx.lifecycle.InterfaceC1756a1
    /* renamed from: Oc */
    public C1808z0 mo4644Oc() {
        LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = this.f6923G;
        if (layoutInflaterFactory2C1734h != null) {
            return layoutInflaterFactory2C1734h.m9046C0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: P */
    public final boolean m8813P() {
        LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = this.f6923G;
        if (layoutInflaterFactory2C1734h == null) {
            return false;
        }
        return layoutInflaterFactory2C1734h.m9059J0();
    }

    /* renamed from: P0 */
    public boolean m8814P0(Menu menu) {
        boolean z11 = false;
        if (this.f6930N) {
            return false;
        }
        if (this.f6934R && this.f6935S) {
            m8873p0(menu);
            z11 = true;
        }
        return z11 | this.f6925I.m9089c0(menu);
    }

    /* renamed from: Q */
    public void m8815Q() {
        this.f6925I.m9078U0();
    }

    /* renamed from: Q0 */
    public void m8816Q0() {
        boolean m9055H0 = this.f6923G.m9055H0(this);
        Boolean bool = this.f6964y;
        if (bool == null || bool.booleanValue() != m9055H0) {
            this.f6964y = Boolean.valueOf(m9055H0);
            m8875q0(m9055H0);
            this.f6925I.m9091d0();
        }
    }

    /* renamed from: R */
    public void mo8817R(Bundle bundle) {
        this.f6936T = true;
    }

    /* renamed from: R0 */
    public void m8818R0() {
        this.f6925I.m9078U0();
        this.f6925I.m9109n0();
        this.f6955p = 4;
        this.f6936T = false;
        mo8879s0();
        if (this.f6936T) {
            C1805y c1805y = this.f6950h0;
            AbstractC1785o.a aVar = AbstractC1785o.a.ON_RESUME;
            c1805y.m9400i(aVar);
            if (this.f6938V != null) {
                this.f6951i0.m9197a(aVar);
            }
            this.f6925I.m9093e0();
            this.f6925I.m9109n0();
            return;
        }
        throw new C1741o("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: S */
    public void mo8819S(int i11, int i12, Intent intent) {
    }

    /* renamed from: S0 */
    public void m8820S0(Bundle bundle) {
        mo8881t0(bundle);
        this.f6953k0.m93786e(bundle);
        Parcelable m9096g1 = this.f6925I.m9096g1();
        if (m9096g1 != null) {
            bundle.putParcelable("android:support:fragments", m9096g1);
        }
    }

    /* renamed from: T */
    public void m8821T(Activity activity) {
        this.f6936T = true;
    }

    /* renamed from: T0 */
    public void m8822T0() {
        this.f6925I.m9078U0();
        this.f6925I.m9109n0();
        this.f6955p = 3;
        this.f6936T = false;
        mo8883u0();
        if (this.f6936T) {
            C1805y c1805y = this.f6950h0;
            AbstractC1785o.a aVar = AbstractC1785o.a.ON_START;
            c1805y.m9400i(aVar);
            if (this.f6938V != null) {
                this.f6951i0.m9197a(aVar);
            }
            this.f6925I.m9095f0();
            return;
        }
        throw new C1741o("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: U */
    public void mo8823U(Context context) {
        Activity m8987d;
        this.f6936T = true;
        AbstractC1732f abstractC1732f = this.f6924H;
        if (abstractC1732f == null) {
            m8987d = null;
        } else {
            m8987d = abstractC1732f.m8987d();
        }
        if (m8987d != null) {
            this.f6936T = false;
            m8821T(m8987d);
        }
    }

    /* renamed from: U0 */
    public void m8824U0() {
        this.f6925I.m9097h0();
        if (this.f6938V != null) {
            this.f6951i0.m9197a(AbstractC1785o.a.ON_STOP);
        }
        this.f6950h0.m9400i(AbstractC1785o.a.ON_STOP);
        this.f6955p = 2;
        this.f6936T = false;
        mo8885v0();
        if (this.f6936T) {
            return;
        }
        throw new C1741o("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: V */
    public void m8825V(Fragment fragment) {
    }

    /* renamed from: V0 */
    public final FragmentActivity m8826V0() {
        FragmentActivity m8852h = m8852h();
        if (m8852h != null) {
            return m8852h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: W */
    public boolean m8827W(MenuItem menuItem) {
        return false;
    }

    /* renamed from: W0 */
    public final Context m8828W0() {
        Context m8868n = m8868n();
        if (m8868n != null) {
            return m8868n;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: X */
    public void mo8829X(Bundle bundle) {
        this.f6936T = true;
        m8834Z0(bundle);
        if (!this.f6925I.m9057I0(1)) {
            this.f6925I.m9047D();
        }
    }

    /* renamed from: X0 */
    public final AbstractC1733g m8830X0() {
        AbstractC1733g m8878s = m8878s();
        if (m8878s != null) {
            return m8878s;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: Y */
    public Animation m8831Y(int i11, boolean z11, int i12) {
        return null;
    }

    /* renamed from: Y0 */
    public final View m8832Y0() {
        View m8799H = m8799H();
        if (m8799H != null) {
            return m8799H;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: Z */
    public Animator m8833Z(int i11, boolean z11, int i12) {
        return null;
    }

    /* renamed from: Z0 */
    public void m8834Z0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f6925I.m9094e1(parcelable);
            this.f6925I.m9047D();
        }
    }

    /* renamed from: a0 */
    public void m8835a0(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: a1 */
    public final void m8836a1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f6957r;
        if (sparseArray != null) {
            this.f6939W.restoreHierarchyState(sparseArray);
            this.f6957r = null;
        }
        this.f6936T = false;
        m8889x0(bundle);
        if (this.f6936T) {
            if (this.f6938V != null) {
                this.f6951i0.m9197a(AbstractC1785o.a.ON_CREATE);
            }
        } else {
            throw new C1741o("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* renamed from: b0 */
    public View m8837b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11 = this.f6954l0;
        if (i11 != 0) {
            return layoutInflater.inflate(i11, viewGroup, false);
        }
        return null;
    }

    /* renamed from: b1 */
    public void m8838b1(View view) {
        m8784f().f6971a = view;
    }

    /* renamed from: c0 */
    public void mo8839c0() {
        this.f6936T = true;
    }

    /* renamed from: c1 */
    public void m8840c1(Animator animator) {
        m8784f().f6972b = animator;
    }

    /* renamed from: d */
    void m8841d() {
        C1720d c1720d = this.f6942Z;
        InterfaceC1721e interfaceC1721e = null;
        if (c1720d != null) {
            c1720d.f6985o = false;
            InterfaceC1721e interfaceC1721e2 = c1720d.f6986p;
            c1720d.f6986p = null;
            interfaceC1721e = interfaceC1721e2;
        }
        if (interfaceC1721e != null) {
            interfaceC1721e.mo8900b();
        }
    }

    /* renamed from: d0 */
    public void m8842d0() {
    }

    /* renamed from: d1 */
    public void m8843d1(Bundle bundle) {
        if (this.f6923G != null && m8813P()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f6960u = bundle;
    }

    /* renamed from: e */
    public void mo8844e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f6927K));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f6928L));
        printWriter.print(" mTag=");
        printWriter.println(this.f6929M);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f6955p);
        printWriter.print(" mWho=");
        printWriter.print(this.f6959t);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f6922F);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f6965z);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f6917A);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f6918B);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f6919C);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f6930N);
        printWriter.print(" mDetached=");
        printWriter.print(this.f6931O);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f6935S);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f6934R);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f6932P);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f6941Y);
        if (this.f6923G != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f6923G);
        }
        if (this.f6924H != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f6924H);
        }
        if (this.f6926J != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f6926J);
        }
        if (this.f6960u != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f6960u);
        }
        if (this.f6956q != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f6956q);
        }
        if (this.f6957r != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f6957r);
        }
        Fragment m8797G = m8797G();
        if (m8797G != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m8797G);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f6963x);
        }
        if (m8884v() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m8884v());
        }
        if (this.f6937U != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f6937U);
        }
        if (this.f6938V != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f6938V);
        }
        if (this.f6939W != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f6938V);
        }
        if (m8861k() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m8861k());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m8795F());
        }
        if (m8868n() != null) {
            AbstractC1809a.m9418b(this).mo9419a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f6925I + ":");
        this.f6925I.mo8991b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e0 */
    public void mo8845e0() {
        this.f6936T = true;
    }

    /* renamed from: e1 */
    public void m8846e1(boolean z11) {
        m8784f().f6987q = z11;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public void mo8847f0() {
        this.f6936T = true;
    }

    /* renamed from: f1 */
    public void m8848f1(int i11) {
        if (this.f6942Z == null && i11 == 0) {
            return;
        }
        m8784f().f6974d = i11;
    }

    /* renamed from: g */
    public Fragment m8849g(String str) {
        if (str.equals(this.f6959t)) {
            return this;
        }
        return this.f6925I.m9117s0(str);
    }

    /* renamed from: g0 */
    public LayoutInflater mo8850g0(Bundle bundle) {
        return m8882u(bundle);
    }

    /* renamed from: g1 */
    public void m8851g1(int i11, int i12) {
        if (this.f6942Z == null && i11 == 0 && i12 == 0) {
            return;
        }
        m8784f();
        C1720d c1720d = this.f6942Z;
        c1720d.f6975e = i11;
        c1720d.f6976f = i12;
    }

    @Override // androidx.lifecycle.InterfaceC1801w
    public AbstractC1785o getLifecycle() {
        return this.f6950h0;
    }

    /* renamed from: h */
    public final FragmentActivity m8852h() {
        AbstractC1732f abstractC1732f = this.f6924H;
        if (abstractC1732f == null) {
            return null;
        }
        return (FragmentActivity) abstractC1732f.m8987d();
    }

    /* renamed from: h0 */
    public void m8853h0(boolean z11) {
    }

    /* renamed from: h1 */
    public void m8854h1(InterfaceC1721e interfaceC1721e) {
        m8784f();
        C1720d c1720d = this.f6942Z;
        InterfaceC1721e interfaceC1721e2 = c1720d.f6986p;
        if (interfaceC1721e == interfaceC1721e2) {
            return;
        }
        if (interfaceC1721e != null && interfaceC1721e2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c1720d.f6985o) {
            c1720d.f6986p = interfaceC1721e;
        }
        if (interfaceC1721e != null) {
            interfaceC1721e.mo8899a();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public boolean m8855i() {
        Boolean bool;
        C1720d c1720d = this.f6942Z;
        if (c1720d != null && (bool = c1720d.f6984n) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: i0 */
    public void m8856i0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f6936T = true;
    }

    /* renamed from: i1 */
    public void m8857i1(int i11) {
        m8784f().f6973c = i11;
    }

    /* renamed from: j */
    public boolean m8858j() {
        Boolean bool;
        C1720d c1720d = this.f6942Z;
        if (c1720d != null && (bool = c1720d.f6983m) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: j0 */
    public void m8859j0(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity m8987d;
        this.f6936T = true;
        AbstractC1732f abstractC1732f = this.f6924H;
        if (abstractC1732f == null) {
            m8987d = null;
        } else {
            m8987d = abstractC1732f.m8987d();
        }
        if (m8987d != null) {
            this.f6936T = false;
            m8856i0(m8987d, attributeSet, bundle);
        }
    }

    /* renamed from: j1 */
    public void m8860j1(Intent intent, int i11, Bundle bundle) {
        AbstractC1732f abstractC1732f = this.f6924H;
        if (abstractC1732f != null) {
            abstractC1732f.mo8919n(this, intent, i11, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Override // p089d2.InterfaceC17712d
    /* renamed from: jf */
    public final C1938a mo4648jf() {
        return this.f6953k0.m93783b();
    }

    /* renamed from: k */
    public View m8861k() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        return c1720d.f6971a;
    }

    /* renamed from: k0 */
    public void m8862k0(boolean z11) {
    }

    /* renamed from: k1 */
    public void m8863k1() {
        LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h = this.f6923G;
        if (layoutInflaterFactory2C1734h != null && layoutInflaterFactory2C1734h.f7056F != null) {
            if (Looper.myLooper() != this.f6923G.f7056F.m8989f().getLooper()) {
                this.f6923G.f7056F.m8989f().postAtFrontOfQueue(new RunnableC1718b());
                return;
            } else {
                m8841d();
                return;
            }
        }
        m8784f().f6985o = false;
    }

    /* renamed from: l */
    public Animator m8864l() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        return c1720d.f6972b;
    }

    /* renamed from: l0 */
    public boolean m8865l0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: m */
    public final AbstractC1733g m8866m() {
        if (this.f6924H != null) {
            return this.f6925I;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: m0 */
    public void m8867m0(Menu menu) {
    }

    /* renamed from: n */
    public Context m8868n() {
        AbstractC1732f abstractC1732f = this.f6924H;
        if (abstractC1732f == null) {
            return null;
        }
        return abstractC1732f.m8988e();
    }

    /* renamed from: n0 */
    public void m8869n0() {
        this.f6936T = true;
    }

    /* renamed from: o */
    public Object m8870o() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        return c1720d.f6977g;
    }

    /* renamed from: o0 */
    public void m8871o0(boolean z11) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f6936T = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m8826V0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f6936T = true;
    }

    /* renamed from: p */
    public AbstractC1350j1 m8872p() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        c1720d.getClass();
        return null;
    }

    /* renamed from: p0 */
    public void m8873p0(Menu menu) {
    }

    /* renamed from: q */
    public Object m8874q() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        return c1720d.f6979i;
    }

    /* renamed from: q0 */
    public void m8875q0(boolean z11) {
    }

    /* renamed from: r */
    public AbstractC1350j1 m8876r() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        c1720d.getClass();
        return null;
    }

    /* renamed from: r0 */
    public void m8877r0(int i11, String[] strArr, int[] iArr) {
    }

    /* renamed from: s */
    public final AbstractC1733g m8878s() {
        return this.f6923G;
    }

    /* renamed from: s0 */
    public void mo8879s0() {
        this.f6936T = true;
    }

    public void startActivityForResult(Intent intent, int i11) {
        m8860j1(intent, i11, null);
    }

    /* renamed from: t */
    public final Object m8880t() {
        AbstractC1732f abstractC1732f = this.f6924H;
        if (abstractC1732f == null) {
            return null;
        }
        return abstractC1732f.mo8914i();
    }

    /* renamed from: t0 */
    public void mo8881t0(Bundle bundle) {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        AbstractC1480b.m7473a(this, sb2);
        sb2.append(" (");
        sb2.append(this.f6959t);
        sb2.append(")");
        if (this.f6927K != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f6927K));
        }
        if (this.f6929M != null) {
            sb2.append(" ");
            sb2.append(this.f6929M);
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: u */
    public LayoutInflater m8882u(Bundle bundle) {
        AbstractC1732f abstractC1732f = this.f6924H;
        if (abstractC1732f != null) {
            LayoutInflater mo8915j = abstractC1732f.mo8915j();
            AbstractC1610v.m8211a(mo8915j, this.f6925I.m9042A0());
            return mo8915j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: u0 */
    public void mo8883u0() {
        this.f6936T = true;
    }

    /* renamed from: v */
    public int m8884v() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return 0;
        }
        return c1720d.f6974d;
    }

    /* renamed from: v0 */
    public void mo8885v0() {
        this.f6936T = true;
    }

    /* renamed from: w */
    public int m8886w() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return 0;
        }
        return c1720d.f6975e;
    }

    /* renamed from: w0 */
    public void m8887w0(View view, Bundle bundle) {
    }

    /* renamed from: x */
    public int m8888x() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return 0;
        }
        return c1720d.f6976f;
    }

    /* renamed from: x0 */
    public void m8889x0(Bundle bundle) {
        this.f6936T = true;
    }

    /* renamed from: y */
    public final Fragment m8890y() {
        return this.f6926J;
    }

    /* renamed from: y0 */
    public void m8891y0(Bundle bundle) {
        this.f6925I.m9078U0();
        this.f6955p = 2;
        this.f6936T = false;
        mo8817R(bundle);
        if (this.f6936T) {
            this.f6925I.m9041A();
            return;
        }
        throw new C1741o("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: z */
    public Object m8892z() {
        C1720d c1720d = this.f6942Z;
        if (c1720d == null) {
            return null;
        }
        Object obj = c1720d.f6980j;
        if (obj == f6916m0) {
            return m8874q();
        }
        return obj;
    }

    /* renamed from: z0 */
    public void m8893z0() {
        this.f6925I.m9114r(this.f6924H, new C1719c(), this);
        this.f6936T = false;
        mo8823U(this.f6924H.m8988e());
        if (this.f6936T) {
            return;
        }
        throw new C1741o("Fragment " + this + " did not call through to super.onAttach()");
    }
}
