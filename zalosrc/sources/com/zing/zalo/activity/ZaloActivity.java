package com.zing.zalo.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1788p0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1783n;
import com.zing.zalo.zview.AbstractC17482m;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.InterfaceC17502s;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalo.zview.passcode.PassCodeView;
import h40.AbstractC19783c;
import h40.C19775a;
import java.util.ArrayList;
import java.util.Iterator;
import p542ub.C27221d;
import p542ub.InterfaceC27218a;
import xl0.InterfaceC30160a;
import xl0.InterfaceC30161b;
import xl0.InterfaceC30162c;
import zl0.AbstractC32232i;

/* loaded from: classes.dex */
public class ZaloActivity extends ComponentActivity implements PassCodeView.InterfaceC17497h, InterfaceC27218a, InterfaceC30160a, C17487o0.l, InterfaceC1783n {

    /* renamed from: Q */
    public static boolean f37906Q = false;

    /* renamed from: R */
    public static boolean f37907R = true;

    /* renamed from: K */
    View f37912K;

    /* renamed from: L */
    private C27221d f37913L;

    /* renamed from: O */
    private SparseArray f37916O;

    /* renamed from: G */
    boolean f37908G = false;

    /* renamed from: H */
    boolean f37909H = false;

    /* renamed from: I */
    boolean f37910I = false;

    /* renamed from: J */
    boolean f37911J = false;

    /* renamed from: M */
    protected C17487o0 f37914M = new C17487o0();

    /* renamed from: N */
    InterfaceC17502s f37915N = new C6919a();

    /* renamed from: P */
    final ArrayList f37917P = new ArrayList();

    /* renamed from: com.zing.zalo.activity.ZaloActivity$a */
    /* loaded from: classes.dex */
    public class C6919a implements InterfaceC17502s {
        C6919a() {
        }

        @Override // com.zing.zalo.zview.InterfaceC17502s
        public View findViewById(int i11) {
            return ZaloActivity.this.findViewById(i11);
        }
    }

    /* renamed from: com.zing.zalo.activity.ZaloActivity$b */
    /* loaded from: classes3.dex */
    public static class C6920b {

        /* renamed from: a */
        KeyEventCallbackC17462c f37919a;

        /* renamed from: b */
        Bundle f37920b;

        private C6920b() {
        }

        /* synthetic */ C6920b(C6919a c6919a) {
            this();
        }
    }

    /* renamed from: V1 */
    private KeyEventCallbackC17462c m35544V1(Integer num, Bundle bundle, Bundle bundle2) {
        KeyEventCallbackC17462c mo35560a2 = mo35560a2(num.intValue(), bundle2);
        if (mo35560a2 == null) {
            return null;
        }
        mo35560a2.m92863g(bundle);
        return mo35560a2;
    }

    /* renamed from: g2 */
    private void m35545g2(Bundle bundle) {
        int[] intArray;
        Bundle bundle2 = bundle.getBundle("zalo:savedDialogs");
        if (bundle2 != null && (intArray = bundle2.getIntArray("zalo:savedDialogIds")) != null) {
            this.f37916O = new SparseArray(intArray.length);
            for (int i11 : intArray) {
                Bundle bundle3 = bundle2.getBundle(m35548p2(i11));
                if (bundle3 != null) {
                    C6920b c6920b = new C6920b(null);
                    c6920b.f37920b = bundle2.getBundle(m35547n2(i11));
                    KeyEventCallbackC17462c m35544V1 = m35544V1(Integer.valueOf(i11), bundle3, c6920b.f37920b);
                    c6920b.f37919a = m35544V1;
                    if (m35544V1 != null) {
                        m35544V1.m92853D(i11);
                        this.f37916O.put(i11, c6920b);
                        mo35565c2(i11, c6920b.f37919a, c6920b.f37920b);
                        c6920b.f37919a.mo92846q(bundle3);
                    }
                }
            }
        }
    }

    /* renamed from: l2 */
    private void m35546l2(Bundle bundle) {
        int size;
        SparseArray sparseArray = this.f37916O;
        if (sparseArray == null || (size = sparseArray.size()) == 0) {
            return;
        }
        Bundle bundle2 = new Bundle();
        int[] iArr = new int[this.f37916O.size()];
        for (int i11 = 0; i11 < size; i11++) {
            int keyAt = this.f37916O.keyAt(i11);
            iArr[i11] = keyAt;
            C6920b c6920b = (C6920b) this.f37916O.valueAt(i11);
            bundle2.putBundle(m35548p2(keyAt), c6920b.f37919a.mo92847r());
            if (c6920b.f37920b != null) {
                bundle2.putBundle(m35547n2(keyAt), c6920b.f37920b);
            }
        }
        bundle2.putIntArray("zalo:savedDialogIds", iArr);
        bundle.putBundle("zalo:savedDialogs", bundle2);
    }

    /* renamed from: n2 */
    private static String m35547n2(int i11) {
        return "zalo:dialog_args_" + i11;
    }

    /* renamed from: p2 */
    private static String m35548p2(int i11) {
        return "zalo:dialog_" + i11;
    }

    /* renamed from: B2 */
    public final boolean m35549B2(int i11, Bundle bundle) {
        if (this.f37916O == null) {
            this.f37916O = new SparseArray();
        }
        C6920b c6920b = (C6920b) this.f37916O.get(i11);
        if (c6920b == null) {
            c6920b = new C6920b(null);
            KeyEventCallbackC17462c m35544V1 = m35544V1(Integer.valueOf(i11), null, bundle);
            c6920b.f37919a = m35544V1;
            if (m35544V1 == null) {
                return false;
            }
            m35544V1.m92853D(i11);
            this.f37916O.put(i11, c6920b);
        }
        c6920b.f37920b = bundle;
        mo35565c2(i11, c6920b.f37919a, bundle);
        if (!isDestroyed() && !isFinishing()) {
            c6920b.f37919a.mo13822K();
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: G */
    public String mo35550G() {
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: H2 */
    public void mo35551H2(AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: K0 */
    public int mo35552K0() {
        return 0;
    }

    @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: L0 */
    public String mo35553L0() {
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: O */
    public void mo35554O(int i11) {
        getWindow().setSoftInputMode(i11);
    }

    /* renamed from: T1 */
    public void m35555T1(InterfaceC30161b interfaceC30161b) {
        synchronized (this.f37917P) {
            if (interfaceC30161b != null) {
                try {
                    if (!this.f37917P.contains(interfaceC30161b)) {
                        this.f37917P.add(interfaceC30161b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: V */
    public void mo35556V(ImageView imageView, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.InterfaceC1783n
    /* renamed from: Xs */
    public C1802w0.b mo4646Xs() {
        return new C1788p0((Application) mo35575n1().getApplicationContext(), this);
    }

    /* renamed from: Y1 */
    boolean m35557Y1(MotionEvent motionEvent) {
        InterfaceC30161b interfaceC30161b;
        boolean z11 = false;
        try {
            synchronized (this.f37917P) {
                try {
                    Iterator it = this.f37917P.iterator();
                    while (it.hasNext() && ((interfaceC30161b = (InterfaceC30161b) it.next()) == null || !(z11 = interfaceC30161b.mo47265Kl(motionEvent)))) {
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return z11;
    }

    /* renamed from: Z1 */
    protected KeyEventCallbackC17462c mo35558Z1(int i11) {
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: a */
    public boolean mo35559a() {
        return this.f37910I;
    }

    /* renamed from: a2 */
    public KeyEventCallbackC17462c mo35560a2(int i11, Bundle bundle) {
        return mo35558Z1(i11);
    }

    @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: b */
    public String mo35561b() {
        return "";
    }

    @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: b0 */
    public void mo35562b0() {
    }

    @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: b1 */
    public void mo35563b1() {
    }

    /* renamed from: b2 */
    protected void m35564b2(int i11, KeyEventCallbackC17462c keyEventCallbackC17462c) {
    }

    /* renamed from: c2 */
    public void mo35565c2(int i11, KeyEventCallbackC17462c keyEventCallbackC17462c, Bundle bundle) {
        m35564b2(i11, keyEventCallbackC17462c);
    }

    @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: d */
    public void mo35566d() {
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: d1 */
    public boolean mo35567d1() {
        if (!mo35586v2() && !mo35576n3()) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (m35557Y1(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e2 */
    public void m35568e2(InterfaceC30161b interfaceC30161b) {
        synchronized (this.f37917P) {
            this.f37917P.remove(interfaceC30161b);
        }
    }

    /* renamed from: f2 */
    public final void m35569f2(int i11) {
        C6920b c6920b;
        SparseArray sparseArray = this.f37916O;
        if (sparseArray != null && (c6920b = (C6920b) sparseArray.get(i11)) != null) {
            c6920b.f37919a.dismiss();
            this.f37916O.remove(i11);
        }
    }

    @Override // android.app.Activity, p542ub.InterfaceC27218a
    public View findViewById(int i11) {
        return super.findViewById(i11);
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: g0 */
    public View mo35570g0() {
        return this.f37912K;
    }

    @Override // p542ub.InterfaceC27218a
    public Context getContext() {
        return this;
    }

    @Override // com.zing.zalo.zview.C17487o0.l
    /* renamed from: gp */
    public void mo35571gp(ZaloView zaloView) {
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: i0 */
    public boolean mo35572i0() {
        return this.f37908G;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: l4 */
    public void mo35573l4(Class cls, Bundle bundle, int i11, boolean z11) {
        mo35581q(cls, bundle, 0, i11, z11);
    }

    @Override // xl0.InterfaceC30160a
    /* renamed from: m */
    public void mo35574m(WindowInsets windowInsets) {
        this.f37914M.m93041W(windowInsets);
    }

    @Override // p542ub.InterfaceC27219b
    /* renamed from: n1 */
    public Activity mo35575n1() {
        return this;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: n3 */
    public boolean mo35576n3() {
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: o */
    public boolean mo35577o() {
        return this.f37911J;
    }

    @Override // com.zing.zalo.zview.C17487o0.l
    /* renamed from: o7 */
    public void mo35578o7(ZaloView zaloView) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        int type;
        super.onActionModeFinished(actionMode);
        if (Build.VERSION.SDK_INT >= 23) {
            type = actionMode.getType();
            if (type == 1) {
                return;
            }
        }
        ZaloView m93012K0 = mo35579p().m93012K0();
        if (m93012K0 != null && m93012K0.m92646QI() != null) {
            m93012K0.m92646QI().setVisibility(0);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        int type;
        super.onActionModeStarted(actionMode);
        if (Build.VERSION.SDK_INT >= 23) {
            type = actionMode.getType();
            if (type == 1) {
                return;
            }
        }
        ZaloView m93012K0 = mo35579p().m93012K0();
        if (m93012K0 != null && m93012K0.m92646QI() != null) {
            m93012K0.m92646QI().setVisibility(8);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        this.f37914M.m93088w1(i11, i12, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C17487o0 c17487o0 = this.f37914M;
        if (c17487o0 != null) {
            c17487o0.m93091x1(configuration);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f37914M.m92989C(this, this.f37915N, null);
        this.f37914M.m93092y(this);
        super.onCreate(bundle);
        this.f37913L = (C27221d) new C1802w0(this).m9378a(C27221d.class);
        if (bundle != null && bundle.containsKey("ZALO_VIEW_MANAGER_STATES")) {
            this.f37914M.m93025O1(bundle.getParcelable("ZALO_VIEW_MANAGER_STATES"));
        }
        this.f37914M.m92992D(this.f37913L.m139318M());
        this.f37914M.m93047Y();
        f37906Q = AbstractC32232i.m155457e("x86");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f37914M.m93083u0();
        this.f37914M.m93050Z();
        this.f37914M.m93008I1(this);
        this.f37911J = false;
        SparseArray sparseArray = this.f37916O;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                C6920b c6920b = (C6920b) this.f37916O.valueAt(i11);
                if (c6920b.f37919a.m92868m()) {
                    c6920b.f37919a.dismiss();
                }
            }
            this.f37916O = null;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (mo35579p().m93093y1(i11, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && mo35579p().m93048Y0()) {
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(268435456);
                startActivity(intent);
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if ((i11 == 4 && mo35579p().f89109c) || mo35579p().m93096z1(i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        C17487o0 c17487o0 = this.f37914M;
        if (c17487o0 != null) {
            c17487o0.m93056c0();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 == 6) {
            return this.f37914M.m93044X(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f37909H = false;
        this.f37914M.m93081t0();
        AbstractC19783c.m103532c();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        C17487o0 c17487o0 = this.f37914M;
        if (c17487o0 != null) {
            c17487o0.m93085v0(i11, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        m35545g2(bundle);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f37909H = true;
        this.f37914M.m93087w0();
        AbstractC19783c.m103533d();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable m93034S1 = this.f37914M.m93034S1();
        if (m93034S1 != null) {
            bundle.putParcelable("ZALO_VIEW_MANAGER_STATES", m93034S1);
        }
        m35546l2(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f37910I = false;
        if (!this.f37908G) {
            this.f37908G = true;
            this.f37914M.m93038V();
        }
        this.f37914M.m93090x0();
        C19775a.m103525d().m103526a(this);
        AbstractC17482m.a aVar = AbstractC17482m.Companion;
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f37910I = true;
        this.f37914M.m93095z0();
        C19775a.m103525d().m103527b(this);
        AbstractC17482m.a aVar = AbstractC17482m.Companion;
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean z11) {
        super.onTopResumedActivityChanged(z11);
        C17487o0 c17487o0 = this.f37914M;
        if (c17487o0 != null) {
            c17487o0.m92986A1(z11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        C17487o0 c17487o0 = this.f37914M;
        if (c17487o0 != null) {
            c17487o0.m92988B1(z11);
        }
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: p */
    public C17487o0 mo35579p() {
        C17487o0 c17487o0 = this.f37914M;
        c17487o0.f89108b = null;
        return c17487o0;
    }

    @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: p0 */
    public void mo35580p0(PassCodeView.InterfaceC17495f interfaceC17495f) {
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: q */
    public void mo35581q(Class cls, Bundle bundle, int i11, int i12, boolean z11) {
        C17487o0 mo35579p = mo35579p();
        if (mo35579p != null) {
            mo35579p.m93066i2(cls, bundle, i11, i12, z11);
        }
    }

    @Override // com.zing.zalo.zview.C17487o0.l
    /* renamed from: r5 */
    public void mo35582r5(ZaloView zaloView) {
    }

    @Override // com.zing.zalo.zview.passcode.PassCodeView.InterfaceC17497h
    /* renamed from: s */
    public String mo35583s() {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i11) {
        setContentView(getLayoutInflater().inflate(i11, (ViewGroup) null));
    }

    @Override // android.app.Activity, p542ub.InterfaceC27219b
    public boolean shouldShowRequestPermissionRationale(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return super.shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: t2 */
    public void m35584t2(boolean z11) {
        this.f37911J = z11;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: v */
    public View mo35585v() {
        return this.f37912K;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: v2 */
    public boolean mo35586v2() {
        return false;
    }

    /* renamed from: x2 */
    public final void m35587x2(int i11) {
        m35549B2(i11, null);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onRestoreInstanceState(bundle, persistableBundle);
        if (bundle != null) {
            m35545g2(bundle);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        this.f37912K = view;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.f37912K = view;
    }
}
