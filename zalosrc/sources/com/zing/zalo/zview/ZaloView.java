package com.zing.zalo.zview;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.lifecycle.AbstractC1781m;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1788p0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1805y;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1783n;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.LiveData;
import androidx.savedstate.C1938a;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ho0.AbstractC20110a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p089d2.C17711c;
import p089d2.InterfaceC17712d;
import p534u1.AbstractC26941a;
import p542ub.InterfaceC27218a;
import zl0.AbstractC32226c;
import zl0.AbstractC32227d;

/* loaded from: classes.dex */
public class ZaloView implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1801w, InterfaceC1756a1, InterfaceC17712d, InterfaceC1783n {

    /* renamed from: u0 */
    public static boolean f88732u0 = false;

    /* renamed from: v0 */
    public static int f88733v0 = 2;

    /* renamed from: A */
    private boolean f88734A;

    /* renamed from: B */
    InterfaceC27218a f88735B;

    /* renamed from: C */
    C17487o0 f88736C;

    /* renamed from: D */
    C17487o0 f88737D;

    /* renamed from: E */
    ZaloView f88738E;

    /* renamed from: F */
    int f88739F;

    /* renamed from: G */
    String f88740G;

    /* renamed from: H */
    boolean f88741H;

    /* renamed from: I */
    boolean f88742I;

    /* renamed from: J */
    private boolean f88743J;

    /* renamed from: K */
    private boolean f88744K;

    /* renamed from: L */
    ViewGroup f88745L;

    /* renamed from: M */
    View f88746M;

    /* renamed from: N */
    View f88747N;

    /* renamed from: O */
    boolean f88748O;

    /* renamed from: P */
    boolean f88749P;

    /* renamed from: Q */
    public Runnable f88750Q;

    /* renamed from: R */
    AbstractC1785o.b f88751R;

    /* renamed from: S */
    C1805y f88752S;

    /* renamed from: T */
    C17506u f88753T;

    /* renamed from: U */
    C1761c0 f88754U;

    /* renamed from: V */
    C17711c f88755V;

    /* renamed from: W */
    public int f88756W;

    /* renamed from: X */
    final String f88757X;

    /* renamed from: Y */
    public final String f88758Y;

    /* renamed from: Z */
    private final List f88759Z;

    /* renamed from: a0 */
    public ActionBar f88760a0;

    /* renamed from: b0 */
    public boolean f88761b0;

    /* renamed from: c0 */
    public ZaloView f88762c0;

    /* renamed from: d0 */
    protected ActionBarMenu f88763d0;

    /* renamed from: e0 */
    protected boolean f88764e0;

    /* renamed from: f0 */
    String f88765f0;

    /* renamed from: g0 */
    int f88766g0;

    /* renamed from: h0 */
    boolean f88767h0;

    /* renamed from: i0 */
    String f88768i0;

    /* renamed from: j0 */
    int f88769j0;

    /* renamed from: k0 */
    Intent f88770k0;

    /* renamed from: l0 */
    int f88771l0;

    /* renamed from: m0 */
    int f88772m0;

    /* renamed from: n0 */
    boolean f88773n0;

    /* renamed from: o0 */
    boolean f88774o0;

    /* renamed from: p */
    protected int f88775p;

    /* renamed from: p0 */
    boolean f88776p0;

    /* renamed from: q */
    Bundle f88777q;

    /* renamed from: q0 */
    private boolean f88778q0;

    /* renamed from: r */
    SparseArray f88779r;

    /* renamed from: r0 */
    private Map f88780r0;

    /* renamed from: s */
    String f88781s;

    /* renamed from: s0 */
    private int f88782s0;

    /* renamed from: t */
    Bundle f88783t;

    /* renamed from: t0 */
    private int f88784t0;

    /* renamed from: u */
    int f88785u;

    /* renamed from: v */
    boolean f88786v;

    /* renamed from: w */
    boolean f88787w;

    /* renamed from: x */
    boolean f88788x;

    /* renamed from: y */
    boolean f88789y;

    /* renamed from: z */
    boolean f88790z;

    /* renamed from: com.zing.zalo.zview.ZaloView$1 */
    /* loaded from: classes.dex */
    public class C174141 implements InterfaceC1795t {
        C174141() {
        }

        @Override // androidx.lifecycle.InterfaceC1795t
        /* renamed from: X6 */
        public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            View view;
            if (aVar == AbstractC1785o.a.ON_STOP && (view = ZaloView.this.f88746M) != null) {
                view.cancelPendingInputEvents();
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes7.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17415a();

        /* renamed from: p */
        final Bundle f88792p;

        /* renamed from: com.zing.zalo.zview.ZaloView$SavedState$a */
        /* loaded from: classes7.dex */
        class C17415a implements Parcelable.Creator {
            C17415a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Bundle bundle) {
            this.f88792p = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeBundle(this.f88792p);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f88792p = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$a */
    /* loaded from: classes7.dex */
    public class C17416a extends ActionBar.C17431a {
        C17416a() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBar.C17431a
        /* renamed from: b */
        public void mo46831b(int i11) {
            super.mo46831b(i11);
            ZaloView.this.mo37491QJ(i11);
        }
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC17417b {
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC17418c {
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$d */
    /* loaded from: classes7.dex */
    public interface InterfaceC17419d {
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$e */
    /* loaded from: classes7.dex */
    public interface InterfaceC17420e {
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$f */
    /* loaded from: classes7.dex */
    public interface InterfaceC17421f {
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$g */
    /* loaded from: classes7.dex */
    public interface InterfaceC17422g extends InterfaceC17423h {
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$h */
    /* loaded from: classes7.dex */
    public interface InterfaceC17423h {
        /* renamed from: c8 */
        boolean mo66383c8();
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$i */
    /* loaded from: classes7.dex */
    public interface InterfaceC17424i extends InterfaceC17426k {
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$j */
    /* loaded from: classes7.dex */
    public interface InterfaceC17425j {
        /* renamed from: bC */
        Class mo66706bC();
    }

    /* renamed from: com.zing.zalo.zview.ZaloView$k */
    /* loaded from: classes7.dex */
    public interface InterfaceC17426k {
    }

    public ZaloView() {
        this.f88775p = 0;
        this.f88781s = UUID.randomUUID().toString();
        this.f88734A = false;
        this.f88744K = false;
        this.f88749P = true;
        this.f88750Q = new Runnable() { // from class: com.zing.zalo.zview.o
            public /* synthetic */ RunnableC17486o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloView.this.finish();
            }
        };
        this.f88751R = AbstractC1785o.b.RESUMED;
        this.f88754U = new C1761c0();
        this.f88756W = 1;
        this.f88757X = "ZaloView";
        this.f88758Y = getClass().getSimpleName();
        this.f88759Z = new ArrayList();
        this.f88761b0 = false;
        this.f88762c0 = this;
        this.f88764e0 = false;
        this.f88767h0 = false;
        this.f88768i0 = null;
        this.f88769j0 = 0;
        this.f88771l0 = -1;
        this.f88772m0 = -1;
        this.f88773n0 = false;
        this.f88774o0 = false;
        this.f88776p0 = false;
        this.f88778q0 = false;
        m92632iJ();
    }

    /* renamed from: AK */
    private void m92627AK(String str, int i11) {
        this.f88765f0 = str;
        this.f88766g0 = i11;
    }

    /* renamed from: GK */
    private void m92628GK(int i11, KeyEventCallbackC17462c keyEventCallbackC17462c) {
        if (this.f88780r0 == null) {
            this.f88780r0 = new HashMap();
        }
        if (keyEventCallbackC17462c != null) {
            removeDialog(this.f88782s0);
            this.f88782s0 = i11;
            keyEventCallbackC17462c.m92853D(i11);
            this.f88780r0.put(Integer.valueOf(this.f88782s0), keyEventCallbackC17462c);
            keyEventCallbackC17462c.mo13822K();
        }
    }

    /* renamed from: iJ */
    private void m92632iJ() {
        this.f88752S = new C1805y(this);
        this.f88755V = C17711c.m93782a(this);
    }

    /* renamed from: kJ */
    public static ZaloView m92633kJ(Context context, String str, Bundle bundle) {
        try {
            ZaloView zaloView = (ZaloView) AbstractC17504t.m93127c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(zaloView.getClass().getClassLoader());
                zaloView.mo60305zK(bundle);
            }
            return zaloView;
        } catch (IllegalAccessException e11) {
            AbstractC32227d.m155418b("ZaloView", "IllegalAccessException occurred in instantiate()", e11);
            throw new InstantiationException("Unable to instantiate ZaloView " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (java.lang.InstantiationException e12) {
            AbstractC32227d.m155418b("ZaloView", "InstantiationException occurred in instantiate()", e12);
            throw new InstantiationException("Unable to instantiate ZaloView " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e12);
        } catch (NoSuchMethodException e13) {
            AbstractC32227d.m155418b("ZaloView", "NoSuchMethodException occurred in instantiate()", e13);
            throw new InstantiationException("Unable to instantiate ZaloView " + str + ": could not find ZaloView constructor", e13);
        } catch (InvocationTargetException e14) {
            AbstractC32227d.m155418b("ZaloView", "InvocationTargetException occurred in instantiate()", e14);
            throw new InstantiationException("Unable to instantiate ZaloView " + str + ": calling ZaloView constructor caused an exception", e14);
        }
    }

    /* renamed from: tJ */
    public /* synthetic */ void m92634tJ() {
        C17478k c17478k;
        ZaloView zaloView;
        C17487o0 c17487o0 = this.f88736C;
        if (c17487o0 != null && !this.f88787w && !this.f88742I) {
            if (!c17487o0.f89111e.isEmpty()) {
                for (int size = this.f88736C.f89111e.size() - 1; size >= 0; size--) {
                    if (this.f88781s.equals(((C17478k) this.f88736C.f89111e.get(size)).f89078e)) {
                        c17478k = (C17478k) this.f88736C.f89111e.get(size);
                        break;
                    }
                }
            }
            c17478k = null;
            if (c17478k != null) {
                this.f88736C.mo92702G1(this, this.f88756W);
                return;
            }
            if (m92692wK().mo35576n3()) {
                this.f88736C.mo92702G1(this, this.f88756W);
                return;
            }
            C17487o0 c17487o02 = this.f88736C;
            if (c17487o02.f89119m && c17487o02.f89110d.size() > 0) {
                boolean z11 = false;
                for (int size2 = this.f88736C.f89110d.size() - 1; size2 >= 0; size2--) {
                    C17478k c17478k2 = (C17478k) this.f88736C.f89110d.get(size2);
                    if (c17478k2 != null && (zaloView = c17478k2.f89075b) != null && !zaloView.m92681pJ() && size2 == 0 && c17478k2.f89075b == this) {
                        z11 = true;
                    }
                }
                if (z11) {
                    ZaloView zaloView2 = this.f88738E;
                    if (zaloView2 != null) {
                        zaloView2.finish();
                        return;
                    }
                    if (m92676n2() != null && m92676n2().mo35577o() && m92676n2().mo35585v() != null) {
                        this.f88736C.mo92702G1(this, this.f88756W);
                        return;
                    } else {
                        if (m92676n2() != null && !m92676n2().isFinishing() && (m92676n2() instanceof Activity)) {
                            ((Activity) m92648SI()).setResult(this.f88769j0, this.f88770k0);
                            ((Activity) m92648SI()).finish();
                            return;
                        }
                        return;
                    }
                }
                this.f88736C.mo92702G1(this, this.f88756W);
                return;
            }
            this.f88736C.mo92702G1(this, this.f88756W);
        }
    }

    /* renamed from: uJ */
    public /* synthetic */ View m92635uJ(int i11) {
        View view = this.f88746M;
        if (view != null) {
            return view.findViewById(i11);
        }
        throw new IllegalStateException("ZaloView does not have a view");
    }

    /* renamed from: vJ */
    public /* synthetic */ void m92636vJ() {
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null) {
            mo37493TJ();
        } else if (this.f88743J) {
            if (this.f88763d0 == null) {
                this.f88763d0 = actionBar.m92712g();
            }
            mo37482FJ(this.f88763d0);
        }
    }

    /* renamed from: AJ */
    public void mo59563AJ() {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onAttachViewToContainer");
        }
    }

    /* renamed from: BJ */
    public boolean mo87132BJ(MenuItem menuItem) {
        return false;
    }

    /* renamed from: BK */
    public void m92637BK(boolean z11) {
        if (this.f88743J != z11) {
            this.f88743J = z11;
            if (m92674mJ() && !m92679oJ()) {
                if (!this.f88743J) {
                    ActionBarMenu actionBarMenu = this.f88763d0;
                    if (actionBarMenu != null) {
                        actionBarMenu.m92750r();
                        return;
                    }
                    return;
                }
                invalidateOptionsMenu();
            }
        }
    }

    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onCreate");
        }
        this.f88744K = true;
    }

    /* renamed from: CK */
    public void mo50035CK(int i11, Intent intent) {
        synchronized (this) {
            this.f88769j0 = i11;
            this.f88770k0 = intent;
        }
    }

    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return null;
    }

    /* renamed from: DK */
    public void m92638DK(boolean z11) {
        boolean z12;
        if (!this.f88749P && z11 && this.f88775p < 4) {
            this.f88736C.m92991C1(this);
        }
        this.f88749P = z11;
        if (this.f88775p < 4 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f88748O = z12;
    }

    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        return null;
    }

    /* renamed from: EK */
    public void m92639EK(int i11, Object... objArr) {
        if (m92676n2() != null && !m92676n2().isFinishing() && !m92681pJ()) {
            m92628GK(i11, mo49769EJ(i11, objArr));
        }
    }

    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
    }

    /* renamed from: FK */
    public void m92640FK(KeyEventCallbackC17462c keyEventCallbackC17462c) {
        if (m92676n2() != null && !m92676n2().isFinishing() && !m92681pJ()) {
            if (this.f88780r0 == null) {
                this.f88780r0 = new HashMap();
            }
            if (keyEventCallbackC17462c != null) {
                removeDialog(this.f88782s0);
                this.f88782s0 = Integer.MAX_VALUE;
                keyEventCallbackC17462c.m92853D(Integer.MAX_VALUE);
                this.f88780r0.put(Integer.valueOf(this.f88782s0), keyEventCallbackC17462c);
                keyEventCallbackC17462c.mo13822K();
            }
        }
    }

    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onCreateView");
        }
        int i11 = this.f88784t0;
        if (i11 != 0) {
            return layoutInflater.inflate(i11, viewGroup, false);
        }
        return null;
    }

    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        return null;
    }

    /* renamed from: HK */
    public void m92641HK(Intent intent) {
        InterfaceC27218a interfaceC27218a = this.f88735B;
        if (interfaceC27218a != null) {
            interfaceC27218a.startActivityForResult(intent, -1);
            return;
        }
        throw new IllegalStateException("ZaloView " + this + " not attached to Activity");
    }

    /* renamed from: IJ */
    public void mo39024IJ() {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onDestroy");
        }
        this.f88773n0 = false;
        this.f88744K = true;
    }

    /* renamed from: IK */
    protected void mo78937IK(Bundle bundle) {
    }

    /* renamed from: JJ */
    public void mo37484JJ() {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onDestroyView");
        }
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            this.f88763d0 = null;
        }
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.removeAllViews();
            this.f88760a0 = null;
        }
        this.f88744K = true;
    }

    /* renamed from: KJ */
    public void mo40200KJ() {
    }

    /* renamed from: L3 */
    public final Bundle m92642L3() {
        return this.f88783t;
    }

    /* renamed from: LJ */
    public void mo39029LJ() {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onDetachViewFromContainer");
        }
    }

    /* renamed from: MJ */
    public void mo67117MJ(boolean z11) {
    }

    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: OI */
    public void m92643OI(int i11, int i12, Intent intent) {
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null) {
            c17487o0.m93088w1(i11, i12, intent);
        }
    }

    /* renamed from: OJ */
    public void m92644OJ(boolean z11) {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onMultiWindowModeChange");
        }
    }

    @Override // androidx.lifecycle.InterfaceC1756a1
    /* renamed from: Oc */
    public C1808z0 mo4644Oc() {
        C17487o0 c17487o0 = this.f88736C;
        if (c17487o0 != null) {
            return c17487o0.m93015L0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: PI */
    public void m92645PI() {
        Iterator it = this.f88759Z.iterator();
        while (it.hasNext()) {
            AbstractC32226c.m155403b((AbstractC32226c.b) it.next(), false);
        }
    }

    /* renamed from: PJ */
    public void mo39032PJ() {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onNewIntent");
        }
    }

    /* renamed from: QI */
    public ActionBar m92646QI() {
        View view = this.f88746M;
        if (view != null) {
            return (ActionBar) view.findViewById(AbstractC17468f.zalo_action_bar);
        }
        return null;
    }

    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332 && !m92681pJ() && !m92677nJ()) {
            finish();
            return true;
        }
        return false;
    }

    /* renamed from: RI */
    public ActionBarMenu m92647RI() {
        return this.f88763d0;
    }

    /* renamed from: RJ */
    public void mo13886RJ() {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onPause");
        }
        View view = this.f88746M;
        if (view != null && (view instanceof SlideAnimationLayout)) {
            this.f88778q0 = ((SlideAnimationLayout) view).f88698K;
        }
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.m92721r();
        }
        this.f88744K = true;
        this.f88734A = false;
    }

    /* renamed from: SI */
    public final Context m92648SI() {
        InterfaceC27218a interfaceC27218a = this.f88735B;
        if (interfaceC27218a == null) {
            return null;
        }
        if (interfaceC27218a instanceof ZaloActivity) {
            return (ZaloActivity) interfaceC27218a;
        }
        return interfaceC27218a.getContext();
    }

    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onSaveInstanceState");
        }
    }

    /* renamed from: TI */
    public C17487o0 m92649TI() {
        if (this.f88737D == null) {
            C17487o0 c17487o0 = new C17487o0();
            this.f88737D = c17487o0;
            c17487o0.m92989C(this.f88735B, new InterfaceC17502s() { // from class: com.zing.zalo.zview.p
                public /* synthetic */ C17488p() {
                }

                @Override // com.zing.zalo.zview.InterfaceC17502s
                public final View findViewById(int i11) {
                    View m92635uJ;
                    m92635uJ = ZaloView.this.m92635uJ(i11);
                    return m92635uJ;
                }
            }, this);
            int i11 = this.f88775p;
            if (i11 >= 5) {
                this.f88737D.m93087w0();
            } else if (i11 >= 4) {
                this.f88737D.m93090x0();
            } else if (i11 >= 2) {
                this.f88737D.m93038V();
            } else if (i11 >= 1) {
                this.f88737D.m93047Y();
            }
        }
        return this.f88737D;
    }

    /* renamed from: TJ */
    public void mo37493TJ() {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onSetupActionBar");
        }
        if (this.f88746M != null) {
            ActionBar m92646QI = m92646QI();
            this.f88760a0 = m92646QI;
            if (m92646QI != null) {
                m92646QI.setActionBarMenuOnItemClick(new C17416a());
                if (this.f88743J) {
                    if (this.f88763d0 == null) {
                        this.f88763d0 = this.f88760a0.m92712g();
                    }
                    mo37482FJ(this.f88763d0);
                }
            }
        }
    }

    /* renamed from: UI */
    public LayoutInflater mo79283UI(Bundle bundle) {
        return this.f88735B.getLayoutInflater();
    }

    /* renamed from: UJ */
    public void mo37584UJ() {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onStart");
        }
        this.f88744K = true;
    }

    /* renamed from: VI */
    public ZaloView m92650VI() {
        ZaloView zaloView = this.f88738E;
        if (zaloView != null) {
            zaloView.f88765f0 = this.f88781s;
        }
        return zaloView;
    }

    /* renamed from: VJ */
    public void mo37712VJ() {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onStop");
        }
        this.f88744K = true;
        removeDialog(this.f88782s0);
        this.f88734A = false;
    }

    /* renamed from: WI */
    public final Resources m92651WI() {
        return m92689tK().getResources();
    }

    /* renamed from: WJ */
    public void mo72216WJ(boolean z11) {
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null) {
            c17487o0.m92986A1(z11);
        }
    }

    /* renamed from: XI */
    public final String m92652XI(int i11) {
        return m92651WI().getString(i11);
    }

    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onTransitionAnimationEnd isOpen ");
            sb2.append(z11);
            sb2.append(" isBackward ");
            sb2.append(z12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1783n
    /* renamed from: Xs */
    public C1802w0.b mo4646Xs() {
        Context m92648SI = m92648SI();
        if (m92648SI != null) {
            return new C1788p0((Application) m92648SI.getApplicationContext(), this);
        }
        return new C1788p0();
    }

    /* renamed from: YI */
    public final String m92653YI(int i11, Object... objArr) {
        return m92651WI().getString(i11, objArr);
    }

    /* renamed from: YJ */
    public void mo49153YJ(boolean z11, boolean z12) {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onTransitionAnimationStart isOpen ");
            sb2.append(z11);
            sb2.append(" isBackward ");
            sb2.append(z12);
        }
    }

    /* renamed from: ZI */
    public final String m92654ZI() {
        return this.f88740G;
    }

    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onViewCreated");
        }
    }

    /* renamed from: aJ */
    public int m92655aJ() {
        return this.f88785u;
    }

    /* renamed from: aK */
    public void mo54160aK(Bundle bundle) {
        this.f88744K = true;
    }

    @Override // androidx.lifecycle.InterfaceC1783n
    /* renamed from: at */
    public /* synthetic */ AbstractC26941a mo4647at() {
        return AbstractC1781m.m9324a(this);
    }

    /* renamed from: bJ */
    public View m92656bJ() {
        return this.f88746M;
    }

    /* renamed from: bK */
    public void mo39045bK(boolean z11) {
    }

    /* renamed from: cJ */
    public InterfaceC1801w m92657cJ() {
        C17506u c17506u = this.f88753T;
        if (c17506u != null) {
            return c17506u;
        }
        throw new IllegalStateException("Can't access the ZaloView View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* renamed from: cK */
    public void m92658cK(Bundle bundle) {
        this.f88744K = false;
        mo37135xJ(bundle);
        if (this.f88744K) {
            C17487o0 c17487o0 = this.f88737D;
            if (c17487o0 != null) {
                c17487o0.m93038V();
                return;
            }
            return;
        }
        throw new C17480l("ZaloView " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: dJ */
    public LiveData m92659dJ() {
        return this.f88754U;
    }

    /* renamed from: dK */
    public void m92660dK(Configuration configuration) {
        this.f88744K = false;
        onConfigurationChanged(configuration);
        if (!this.f88744K && AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" did not call through to super.onConfigurationChanged()");
        }
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null) {
            c17487o0.m93091x1(configuration);
        }
    }

    /* renamed from: eJ */
    public String mo81386eJ() {
        return null;
    }

    /* renamed from: eK */
    public void m92661eK(Bundle bundle) {
        Parcelable parcelable;
        this.f88744K = false;
        this.f88752S.mo9335a(new InterfaceC1795t() { // from class: com.zing.zalo.zview.ZaloView.1
            C174141() {
            }

            @Override // androidx.lifecycle.InterfaceC1795t
            /* renamed from: X6 */
            public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                View view;
                if (aVar == AbstractC1785o.a.ON_STOP && (view = ZaloView.this.f88746M) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        if (getLifecycle().mo9336b() != AbstractC1785o.b.INITIALIZED) {
            m92632iJ();
            AbstractC20110a.m104545n("IllegalStateException of zaloview --> workaround for reattach zaloview (clear-top...)", new Object[0]);
        }
        this.f88755V.m93785d(bundle);
        mo37111CJ(bundle);
        if (this.f88744K) {
            this.f88752S.m9400i(AbstractC1785o.a.ON_CREATE);
            if (bundle != null && (parcelable = bundle.getParcelable("ZALO_VIEW_MANAGER_STATES")) != null) {
                m92649TI();
                this.f88737D.m93025O1(parcelable);
                this.f88737D.m92992D(this.f88736C.m93007I0(this));
                this.f88737D.m93047Y();
                return;
            }
            return;
        }
        throw new C17480l("ZaloView " + this + " did not call through to super.onCreate()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: fJ */
    public C17487o0 m92662fJ() {
        C17487o0 c17487o0 = this.f88736C;
        if (c17487o0 != null) {
            c17487o0.f89108b = this.f88781s;
        }
        return c17487o0;
    }

    /* renamed from: fK */
    public void m92663fK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f88789y = true;
        this.f88753T = new C17506u();
        View mo37483GJ = mo37483GJ(layoutInflater, viewGroup, bundle);
        this.f88746M = mo37483GJ;
        if (mo37483GJ != null) {
            this.f88753T.m93132b();
            this.f88754U.mo9224q(this.f88753T);
        } else {
            if (!this.f88753T.m93133c()) {
                this.f88753T = null;
                return;
            }
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void finish() {
        C17487o0 c17487o0 = this.f88736C;
        if (c17487o0 != null) {
            c17487o0.f89105F.post(new Runnable() { // from class: com.zing.zalo.zview.r
                public /* synthetic */ RunnableC17500r() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloView.this.m92634tJ();
                }
            });
        }
    }

    /* renamed from: gJ */
    public boolean m92664gJ() {
        Map map = this.f88780r0;
        if (map != null) {
            for (KeyEventCallbackC17462c keyEventCallbackC17462c : map.values()) {
                if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: gK */
    public void m92665gK() {
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null) {
            c17487o0.m93050Z();
        }
        if (this.f88752S.mo9336b() != AbstractC1785o.b.DESTROYED && this.f88752S.mo9336b() != AbstractC1785o.b.INITIALIZED) {
            this.f88752S.m9400i(AbstractC1785o.a.ON_DESTROY);
        } else {
            try {
                AbstractC20110a.m104538g("invalid destroy child zview: %s", this.f88752S.mo9336b());
                this.f88752S.m9400i(AbstractC1785o.a.ON_DESTROY);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        this.f88744K = false;
        mo39024IJ();
        if (this.f88744K) {
            this.f88789y = false;
            return;
        }
        throw new C17480l("ZaloView " + this + " did not call through to super.onDestroy()");
    }

    public Context getContext() {
        InterfaceC27218a interfaceC27218a = this.f88735B;
        if (interfaceC27218a != null) {
            return interfaceC27218a.getContext();
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC1801w
    public AbstractC1785o getLifecycle() {
        return this.f88752S;
    }

    /* renamed from: hJ */
    public boolean m92666hJ() {
        return this.f88743J;
    }

    /* renamed from: hK */
    public void m92667hK() {
        C17506u c17506u;
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null) {
            c17487o0.m93053a0();
        }
        if (this.f88746M != null && (c17506u = this.f88753T) != null) {
            c17506u.m93131a(AbstractC1785o.a.ON_DESTROY);
        }
        this.f88744K = false;
        mo37484JJ();
        if (this.f88744K) {
            return;
        }
        throw new C17480l("ZaloView " + this + " did not call through to super.onDestroyView()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: iK */
    public void m92668iK() {
        this.f88744K = false;
        onLowMemory();
        if (!this.f88744K && AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" did not call through to super.onLowMemory()");
        }
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null) {
            c17487o0.m93056c0();
        }
    }

    public void invalidateOptionsMenu() {
        View view = this.f88746M;
        if (view != null) {
            view.post(new Runnable() { // from class: com.zing.zalo.zview.q
                public /* synthetic */ RunnableC17498q() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZaloView.this.m92636vJ();
                }
            });
        }
    }

    /* renamed from: jJ */
    public void m92669jJ() {
        this.f88786v = false;
        this.f88787w = false;
        this.f88788x = false;
        this.f88790z = false;
        this.f88735B = null;
        this.f88741H = false;
        this.f88742I = false;
        if (getLifecycle().mo9336b() != AbstractC1785o.b.INITIALIZED) {
            m92632iJ();
            AbstractC20110a.m104539h(new IllegalStateException("Reuse ZaloView instance - Restarter must be created only during owner's initialization stage"));
        }
    }

    /* renamed from: jK */
    public void m92670jK(boolean z11) {
        m92644OJ(z11);
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null) {
            c17487o0.m93057d0(z11);
        }
    }

    @Override // p089d2.InterfaceC17712d
    /* renamed from: jf */
    public final C1938a mo4648jf() {
        return this.f88755V.m93783b();
    }

    /* renamed from: kK */
    public void m92671kK(boolean z11) {
        C17506u c17506u;
        if (this.f88746M != null && (c17506u = this.f88753T) != null) {
            c17506u.m93131a(AbstractC1785o.a.ON_PAUSE);
        }
        this.f88752S.m9400i(AbstractC1785o.a.ON_PAUSE);
        this.f88744K = false;
        mo13886RJ();
        if (this.f88744K) {
            C17487o0 c17487o0 = this.f88737D;
            if (c17487o0 != null) {
                if (!z11) {
                    Iterator it = c17487o0.f89110d.iterator();
                    while (it.hasNext()) {
                        ((C17478k) it.next()).f89081h = false;
                    }
                    Iterator it2 = this.f88737D.f89111e.iterator();
                    while (it2.hasNext()) {
                        ((C17478k) it2.next()).f89081h = false;
                    }
                }
                this.f88737D.m93081t0();
                return;
            }
            return;
        }
        throw new C17480l("ZaloView " + this + " did not call through to super.onPause()");
    }

    /* renamed from: lJ */
    public final boolean m92672lJ() {
        return this.f88734A;
    }

    /* renamed from: lK */
    public void m92673lK() {
        C17506u c17506u;
        this.f88744K = false;
        onResume();
        if (this.f88744K) {
            C1805y c1805y = this.f88752S;
            AbstractC1785o.a aVar = AbstractC1785o.a.ON_RESUME;
            c1805y.m9400i(aVar);
            if (this.f88746M != null && (c17506u = this.f88753T) != null) {
                c17506u.m93131a(aVar);
            }
            C17487o0 c17487o0 = this.f88737D;
            if (c17487o0 != null) {
                c17487o0.m93087w0();
                return;
            }
            return;
        }
        throw new C17480l("ZaloView " + this + " did not call through to super.onResume()");
    }

    /* renamed from: mJ */
    public final boolean m92674mJ() {
        return this.f88735B != null && this.f88786v;
    }

    /* renamed from: mK */
    public void m92675mK(Bundle bundle) {
        Parcelable m93034S1;
        mo37118SJ(bundle);
        this.f88755V.m93786e(bundle);
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null && (m93034S1 = c17487o0.m93034S1()) != null) {
            bundle.putParcelable("ZALO_VIEW_MANAGER_STATES", m93034S1);
        }
        mo78937IK(bundle);
    }

    /* renamed from: n2 */
    public InterfaceC27218a m92676n2() {
        return this.f88735B;
    }

    /* renamed from: nJ */
    public final boolean m92677nJ() {
        return this.f88742I;
    }

    /* renamed from: nK */
    public void m92678nK() {
        C17506u c17506u;
        this.f88744K = false;
        mo37584UJ();
        if (this.f88744K) {
            C1805y c1805y = this.f88752S;
            AbstractC1785o.a aVar = AbstractC1785o.a.ON_START;
            c1805y.m9400i(aVar);
            if (this.f88746M != null && (c17506u = this.f88753T) != null) {
                c17506u.m93131a(aVar);
            }
            C17487o0 c17487o0 = this.f88737D;
            if (c17487o0 != null) {
                c17487o0.m93090x0();
                return;
            }
            return;
        }
        throw new C17480l("ZaloView " + this + " did not call through to super.onStart()");
    }

    /* renamed from: oJ */
    public final boolean m92679oJ() {
        return this.f88741H;
    }

    /* renamed from: oK */
    public void m92680oK() {
        C17506u c17506u;
        if (this.f88746M != null && (c17506u = this.f88753T) != null) {
            c17506u.m93131a(AbstractC1785o.a.ON_STOP);
        }
        this.f88752S.m9400i(AbstractC1785o.a.ON_STOP);
        this.f88744K = false;
        mo37712VJ();
        if (this.f88744K) {
            C17487o0 c17487o0 = this.f88737D;
            if (c17487o0 != null) {
                c17487o0.m93095z0();
                return;
            }
            return;
        }
        throw new C17480l("ZaloView " + this + " did not call through to super.onStop()");
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        if (this.f88766g0 != 0 && this.f88765f0 != null) {
            int size = this.f88737D.f89111e.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C17478k c17478k = (C17478k) this.f88737D.f89111e.get(size);
                if (c17478k.f89078e.equals(this.f88765f0)) {
                    ZaloView zaloView = c17478k.f89075b;
                    if (zaloView != null && zaloView.m92674mJ() && !c17478k.f89075b.m92681pJ()) {
                        c17478k.f89075b.onActivityResult(i11, i12, intent);
                    }
                } else {
                    size--;
                }
            }
        }
        this.f88765f0 = null;
        this.f88766g0 = 0;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f88744K = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Context m92648SI = m92648SI();
        if (m92648SI instanceof Activity) {
            ((Activity) m92648SI).onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && m92681pJ()) {
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f88744K = true;
    }

    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null) {
            c17487o0.m93085v0(i11, strArr, iArr);
        }
    }

    public void onResume() {
        View view;
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onResume");
        }
        this.f88744K = true;
        this.f88734A = true;
        if (this.f88778q0 && (view = this.f88746M) != null) {
            view.requestLayout();
        }
    }

    /* renamed from: pJ */
    public final boolean m92681pJ() {
        return this.f88787w;
    }

    /* renamed from: pK */
    public void m92682pK(AbstractC32226c.b bVar) {
        if (bVar != null && bVar.f148638j != null) {
            this.f88759Z.add(bVar);
            AbstractC32226c.m155403b(bVar, false);
        }
    }

    /* renamed from: qJ */
    public final boolean m92683qJ() {
        return this.f88788x;
    }

    /* renamed from: qK */
    public void m92684qK(AbstractC32226c.b bVar, boolean z11) {
        if (bVar == null) {
            return;
        }
        AbstractC32226c.m155403b(bVar, z11);
    }

    /* renamed from: rJ */
    public final boolean m92685rJ() {
        return this.f88790z;
    }

    /* renamed from: rK */
    public final Context m92686rK() {
        Context m92648SI = m92648SI();
        if (m92648SI != null) {
            return m92648SI;
        }
        throw new IllegalStateException("ZaloView " + this + " not attached to an activity.");
    }

    public void removeDialog(int i11) {
        Map map = this.f88780r0;
        if (map != null && map.containsKey(Integer.valueOf(i11))) {
            KeyEventCallbackC17462c keyEventCallbackC17462c = (KeyEventCallbackC17462c) this.f88780r0.get(Integer.valueOf(i11));
            this.f88780r0.remove(Integer.valueOf(i11));
            this.f88782s0 = 0;
            if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
                keyEventCallbackC17462c.dismiss();
            }
        }
    }

    /* renamed from: sJ */
    public final boolean m92687sJ() {
        View view;
        if (m92674mJ() && !m92679oJ() && (view = this.f88746M) != null && view.getWindowToken() != null && this.f88746M.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: sK */
    public final Bundle m92688sK() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            return m92642L3;
        }
        throw new IllegalStateException("ZaloView " + this + " does not have any arguments.");
    }

    public void showDialog(int i11) {
        if (m92676n2() != null && !m92676n2().isFinishing() && !m92681pJ()) {
            m92628GK(i11, mo39014DJ(i11));
        }
    }

    public void startActivityForResult(Intent intent, int i11) {
        if (this.f88735B != null) {
            ZaloView zaloView = this.f88738E;
            if (zaloView != null) {
                zaloView.m92627AK(this.f88781s, i11);
            }
            this.f88735B.startActivityForResult(intent, i11);
            return;
        }
        throw new IllegalStateException("ZaloView " + this + " not attached to Activity");
    }

    /* renamed from: tK */
    public final Context m92689tK() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("ZaoView " + this + " not attached to a context.");
    }

    /* renamed from: uK */
    public final ZaloView m92690uK() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI == null) {
            if (getContext() == null) {
                throw new IllegalStateException("ZaloView " + this + " is not attached to any ZaloView or Activity");
            }
            throw new IllegalStateException("ZaloView " + this + " is not a child ZaloView, it is directly attached to " + getContext());
        }
        return m92650VI;
    }

    /* renamed from: vK */
    public final View m92691vK() {
        View m92656bJ = m92656bJ();
        if (m92656bJ != null) {
            return m92656bJ;
        }
        throw new IllegalStateException("ZaloView " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: wJ */
    public boolean mo49160wJ() {
        return false;
    }

    /* renamed from: wK */
    public final InterfaceC27218a m92692wK() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            return m92676n2;
        }
        throw new IllegalStateException("ZaloView " + this + " not attached to an activity.");
    }

    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        if (AbstractC17482m.f89087a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f88758Y);
            sb2.append(" onActivityCreated");
        }
        this.f88744K = true;
    }

    /* renamed from: xK */
    public final C17487o0 m92693xK() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            return m92662fJ;
        }
        throw new IllegalStateException("ZaloView " + this + " not associated with a zalo view manager.");
    }

    /* renamed from: yJ */
    public void mo46830yJ(WindowInsets windowInsets) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.m92726x();
        }
        C17487o0 c17487o0 = this.f88737D;
        if (c17487o0 != null) {
            c17487o0.m93041W(windowInsets);
        }
        m92645PI();
    }

    /* renamed from: yK */
    public final void m92694yK(Bundle bundle) {
        C17506u c17506u;
        SparseArray<Parcelable> sparseArray = this.f88779r;
        if (sparseArray != null) {
            this.f88747N.restoreHierarchyState(sparseArray);
            this.f88779r = null;
        }
        this.f88744K = false;
        mo54160aK(bundle);
        if (this.f88744K) {
            if (this.f88746M != null && (c17506u = this.f88753T) != null) {
                c17506u.m93131a(AbstractC1785o.a.ON_CREATE);
                return;
            }
            return;
        }
        throw new C17480l("ZaloView " + this + " did not call through to super.onViewStateRestored()");
    }

    /* renamed from: yp */
    public boolean mo60294yp() {
        if (!m92677nJ() && !m92681pJ() && m92674mJ()) {
            return false;
        }
        return true;
    }

    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
    }

    /* renamed from: zK */
    public void mo60305zK(Bundle bundle) {
        this.f88783t = bundle;
    }

    public ZaloView(int i11) {
        this();
        this.f88784t0 = i11;
    }
}
