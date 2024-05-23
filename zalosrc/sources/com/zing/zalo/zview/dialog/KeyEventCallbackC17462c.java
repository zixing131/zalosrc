package com.zing.zalo.zview.dialog;

import android.R;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC1388a;
import com.adtima.Adtima;
import com.zing.zalo.zview.AbstractC17450b;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import java.lang.ref.WeakReference;
import p542ub.InterfaceC27218a;
import zl0.AbstractC32232i;

/* renamed from: com.zing.zalo.zview.dialog.c */
/* loaded from: classes7.dex */
public class KeyEventCallbackC17462c implements InterfaceC17463d, KeyEvent.Callback, C17465f.a {

    /* renamed from: A */
    InterfaceC17463d.h f88995A;

    /* renamed from: B */
    boolean f88996B;

    /* renamed from: C */
    boolean f88997C;

    /* renamed from: D */
    boolean f88998D;

    /* renamed from: E */
    final Handler f88999E;

    /* renamed from: F */
    final Handler f89000F;

    /* renamed from: G */
    final Runnable f89001G;

    /* renamed from: H */
    int f89002H;

    /* renamed from: p */
    Context f89003p;

    /* renamed from: q */
    protected Context f89004q;

    /* renamed from: r */
    C17465f f89005r;

    /* renamed from: s */
    WindowManager f89006s;

    /* renamed from: t */
    View f89007t;

    /* renamed from: u */
    FrameLayout f89008u;

    /* renamed from: v */
    protected boolean f89009v;

    /* renamed from: w */
    Message f89010w;

    /* renamed from: x */
    Message f89011x;

    /* renamed from: y */
    Message f89012y;

    /* renamed from: z */
    InterfaceC17463d.f f89013z;

    /* renamed from: com.zing.zalo.zview.dialog.c$a */
    /* loaded from: classes7.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            KeyEventCallbackC17462c.this.m92861e();
        }
    }

    /* renamed from: com.zing.zalo.zview.dialog.c$b */
    /* loaded from: classes7.dex */
    private static final class b extends Handler {

        /* renamed from: a */
        private final WeakReference f89015a;

        public b(KeyEventCallbackC17462c keyEventCallbackC17462c) {
            this.f89015a = new WeakReference(keyEventCallbackC17462c);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    ((InterfaceC17463d.e) message.obj).mo12457Tv((InterfaceC17463d) this.f89015a.get());
                    return;
                case 68:
                    ((InterfaceC17463d.c) message.obj).mo13013p7((InterfaceC17463d) this.f89015a.get());
                    return;
                case 69:
                    ((InterfaceC17463d.g) message.obj).mo12456a((InterfaceC17463d) this.f89015a.get());
                    return;
                default:
                    return;
            }
        }
    }

    public KeyEventCallbackC17462c(Context context) {
        this(context, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m92849n(View view) {
        if (this.f89009v && this.f88997C && this.f89005r.m92903j()) {
            cancel();
        }
    }

    /* renamed from: A */
    public void m92850A(int i11) {
        this.f89005r.m92882A(i11);
    }

    /* renamed from: B */
    public void m92851B(View view) {
        this.f89005r.m92883B(view);
    }

    /* renamed from: C */
    public void m92852C(View view, ViewGroup.LayoutParams layoutParams) {
        this.f89005r.m92884C(view, layoutParams);
    }

    /* renamed from: D */
    public void m92853D(int i11) {
        this.f89002H = i11;
    }

    /* renamed from: E */
    public void m92854E(InterfaceC17463d.c cVar) {
        if (cVar != null) {
            this.f89010w = this.f89000F.obtainMessage(68, cVar);
        } else {
            this.f89010w = null;
        }
    }

    /* renamed from: F */
    public void m92855F(InterfaceC17463d.e eVar) {
        if (eVar != null) {
            this.f89011x = this.f89000F.obtainMessage(67, eVar);
        } else {
            this.f89011x = null;
        }
    }

    /* renamed from: G */
    public void m92856G(InterfaceC17463d.f fVar) {
        this.f89013z = fVar;
    }

    /* renamed from: H */
    public void mo88280H(InterfaceC17463d.g gVar) {
        if (gVar != null) {
            this.f89012y = this.f89000F.obtainMessage(69, gVar);
        } else {
            this.f89012y = null;
        }
    }

    /* renamed from: I */
    public void m92857I(InterfaceC17463d.h hVar) {
        this.f88995A = hVar;
    }

    /* renamed from: J */
    public void mo43148J(CharSequence charSequence) {
        this.f89005r.m92901h().setTitle(charSequence);
    }

    /* renamed from: K */
    public void mo13822K() {
        if (this.f88997C) {
            View view = this.f89007t;
            if (view != null) {
                view.setVisibility(0);
            }
            FrameLayout frameLayout = this.f89008u;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        this.f88998D = false;
        if (!this.f88996B) {
            m92863g(null);
        } else {
            m92867k().m92904k().dispatchConfigurationChanged(m92865i().getResources().getConfiguration());
        }
        mo13766s();
        this.f89007t = m92867k().m92904k();
        WindowManager.LayoutParams m92901h = this.f89005r.m92901h();
        if ((m92901h.softInputMode & 256) == 0) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(m92901h);
            layoutParams.softInputMode |= 256;
            m92901h = layoutParams;
        }
        if (Build.VERSION.SDK_INT == 31) {
            Object obj = this.f89003p;
            if ((obj instanceof InterfaceC27218a) && ((InterfaceC27218a) obj).mo35567d1()) {
                this.f89008u = new FrameLayout(m92865i());
                this.f89008u.setBackground(AbstractC1388a.m6964f(this.f89004q, R.color.transparent));
                this.f89008u.setOnClickListener(new View.OnClickListener() { // from class: wl0.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        KeyEventCallbackC17462c.this.m92849n(view2);
                    }
                });
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                layoutParams2.format = -2;
                this.f89006s.addView(this.f89008u, layoutParams2);
            }
        }
        this.f89006s.addView(this.f89007t, m92901h);
        this.f88997C = true;
        m92872x();
    }

    @Override // com.zing.zalo.zview.dialog.C17465f.a
    /* renamed from: a */
    public void mo92858a() {
        InterfaceC17463d.h hVar = this.f88995A;
        if (hVar != null) {
            hVar.mo92604n7();
        }
    }

    /* renamed from: c */
    public void m92859c(View view, ViewGroup.LayoutParams layoutParams) {
        this.f89005r.m92894a(view, layoutParams);
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d
    public void cancel() {
        Message message;
        if (!this.f88998D && (message = this.f89010w) != null) {
            this.f88998D = true;
            Message.obtain(message).sendToTarget();
        }
        dismiss();
    }

    /* renamed from: d */
    public void m92860d() {
        if (!this.f88996B) {
            m92863g(null);
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d
    public void dismiss() {
        if (Looper.myLooper() == this.f88999E.getLooper()) {
            m92861e();
        } else {
            this.f88999E.post(this.f89001G);
        }
    }

    @Override // com.zing.zalo.zview.dialog.C17465f.a
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        InterfaceC17463d.f fVar = this.f89013z;
        if ((fVar != null && fVar.mo87296Tx(this, keyEvent.getKeyCode(), keyEvent)) || this.f89005r.m92892K(keyEvent)) {
            return true;
        }
        View view = this.f89007t;
        if (view != null) {
            dispatcherState = view.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(this, dispatcherState, this);
    }

    @Override // com.zing.zalo.zview.dialog.C17465f.a
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f89005r.m92893L(motionEvent)) {
            return true;
        }
        return mo88286u(motionEvent);
    }

    /* renamed from: e */
    void m92861e() {
        View view = this.f89007t;
        if (view != null && this.f88997C) {
            try {
                try {
                    if (view.getParent() != null) {
                        this.f89006s.removeViewImmediate(this.f89007t);
                    }
                    FrameLayout frameLayout = this.f89008u;
                    if (frameLayout != null && frameLayout.getParent() != null) {
                        this.f89006s.removeViewImmediate(this.f89008u);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f89007t = null;
                this.f89008u = null;
                mo13767t();
                this.f88997C = false;
                m92871w();
            } catch (Throwable th2) {
                this.f89007t = null;
                this.f89008u = null;
                mo13767t();
                this.f88997C = false;
                m92871w();
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d
    /* renamed from: f */
    public int mo92862f() {
        return this.f89002H;
    }

    /* renamed from: g */
    public void m92863g(Bundle bundle) {
        if (!this.f88996B) {
            mo13765p(bundle);
            this.f88996B = true;
        }
    }

    /* renamed from: h */
    public View m92864h(int i11) {
        return this.f89005r.m92899f(i11);
    }

    /* renamed from: i */
    public final Context m92865i() {
        return this.f89004q;
    }

    /* renamed from: j */
    public Context m92866j() {
        return this.f89003p;
    }

    /* renamed from: k */
    public final C17465f m92867k() {
        return this.f89005r;
    }

    /* renamed from: l */
    public void mo88281l() {
        View view = this.f89007t;
        if (view != null) {
            view.setVisibility(8);
        }
        FrameLayout frameLayout = this.f89008u;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: m */
    public boolean m92868m() {
        return this.f88997C;
    }

    /* renamed from: o */
    public void m92869o() {
        if (this.f89009v) {
            cancel();
        }
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            keyEvent.startTracking();
            return true;
        }
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i11, int i12, KeyEvent keyEvent) {
        return false;
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && keyEvent.isTracking() && !keyEvent.isCanceled()) {
            m92869o();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.dialog.C17465f.a
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        View view = this.f89007t;
        if (view != null) {
            this.f89006s.updateViewLayout(view, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
    }

    /* renamed from: q */
    public void mo92846q(Bundle bundle) {
        if (bundle.getBundle("android:dialogHierarchy") == null) {
            return;
        }
        m92863g(bundle);
        if (bundle.getBoolean("android:dialogShowing")) {
            mo13822K();
        }
    }

    /* renamed from: r */
    public Bundle mo92847r() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android:dialogShowing", this.f88997C);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void mo13766s() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public void mo13767t() {
    }

    /* renamed from: u */
    public boolean mo88286u(MotionEvent motionEvent) {
        if (this.f89009v && this.f88997C && this.f89005r.m92891J(m92865i(), motionEvent)) {
            cancel();
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m92870v(int i11) {
        return m92867k().m92911u(i11);
    }

    /* renamed from: w */
    void m92871w() {
        Message message = this.f89011x;
        if (message != null) {
            Message.obtain(message).sendToTarget();
        }
    }

    /* renamed from: x */
    void m92872x() {
        Message message = this.f89012y;
        if (message != null) {
            Message.obtain(message).sendToTarget();
        }
    }

    /* renamed from: y */
    public void m92873y(boolean z11) {
        this.f89009v = z11;
    }

    /* renamed from: z */
    public void m92874z(boolean z11) {
        if (z11 && !this.f89009v) {
            this.f89009v = true;
        }
        this.f89005r.m92915y(z11);
    }

    public KeyEventCallbackC17462c(Context context, int i11) {
        this(context, i11, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyEventCallbackC17462c(Context context, int i11, boolean z11) {
        this.f89008u = null;
        this.f89009v = true;
        this.f88996B = false;
        this.f88997C = false;
        this.f88998D = false;
        this.f88999E = new Handler();
        this.f89001G = new a();
        this.f89002H = -1;
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(AbstractC17450b.dialogTheme, typedValue, true);
            i11 = typedValue.resourceId;
        }
        this.f89003p = context;
        this.f89004q = z11 ? new ContextThemeWrapper(context, i11) : context;
        this.f89006s = (WindowManager) m92865i().getSystemService("window");
        C17465f c17465f = new C17465f(this.f89004q);
        this.f89005r = c17465f;
        c17465f.m92914x(this);
        this.f89005r.m92888G(17);
        AbstractC32232i.m155467o(this.f89003p, this.f89005r.m92901h());
        this.f89000F = new b(this);
    }
}
