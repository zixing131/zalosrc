package com.zing.zalo.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.core.hardware.fingerprint.C1433a;
import androidx.core.os.C1439e;
import com.zing.zalo.biometric.BiometricWrapper;
import com.zing.zalo.biometric.C7350r0;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import le0.AbstractC22459a;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p388od.C24222a;

/* renamed from: com.zing.zalo.biometric.r0 */
/* loaded from: classes3.dex */
public class C7350r0 implements InterfaceC7352s0 {

    /* renamed from: a */
    private C1433a f40097a;

    /* renamed from: b */
    private C1439e f40098b;

    /* renamed from: c */
    private BiometricWrapper.AbstractC7309a f40099c;

    /* renamed from: d */
    private Executor f40100d;

    /* renamed from: e */
    private Context f40101e;

    /* renamed from: f */
    private Dialog f40102f;

    /* renamed from: g */
    private View f40103g;

    /* renamed from: h */
    private TextView f40104h;

    /* renamed from: i */
    private TextView f40105i;

    /* renamed from: j */
    private TextView f40106j;

    /* renamed from: k */
    private ImageView f40107k;

    /* renamed from: l */
    private int f40108l;

    /* renamed from: m */
    private int f40109m;

    /* renamed from: n */
    private int f40110n;

    /* renamed from: o */
    private int f40111o;

    /* renamed from: q */
    private BiometricWrapper.C7312d f40113q;

    /* renamed from: p */
    private boolean f40112p = false;

    /* renamed from: r */
    final C1433a.c f40114r = new a();

    /* renamed from: s */
    private Handler f40115s = new b();

    /* renamed from: t */
    final View.OnClickListener f40116t = new c();

    /* renamed from: com.zing.zalo.biometric.r0$a */
    /* loaded from: classes3.dex */
    public class a extends C1433a.c {
        a() {
        }

        /* renamed from: i */
        public void m37389k(int i11, CharSequence charSequence) {
            C7350r0.this.f40115s.obtainMessage(3).sendToTarget();
            C7350r0.this.f40100d.execute(new Runnable() { // from class: com.zing.zalo.biometric.q0

                /* renamed from: q */
                public final /* synthetic */ int f40095q;

                /* renamed from: r */
                public final /* synthetic */ CharSequence f40096r;

                public /* synthetic */ RunnableC7348q0(int i112, CharSequence charSequence2) {
                    r2 = i112;
                    r3 = charSequence2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7350r0.a.this.m37388j(r2, r3);
                }
            });
        }

        /* renamed from: j */
        public /* synthetic */ void m37388j(int i11, CharSequence charSequence) {
            C7350r0.this.f40099c.mo37276a(i11, charSequence);
        }

        /* renamed from: l */
        public /* synthetic */ void m37390l() {
            C7350r0.this.f40099c.mo37277b();
        }

        /* renamed from: m */
        public /* synthetic */ void m37391m(BiometricWrapper.C7310b c7310b) {
            C7350r0.this.f40099c.mo37278c(c7310b);
        }

        @Override // androidx.core.hardware.fingerprint.C1433a.c
        /* renamed from: a */
        public void mo7324a(int i11, CharSequence charSequence) {
            if (i11 == 5) {
                if (C7350r0.this.f40111o != 0) {
                    i11 = 10;
                }
                m37389k(i11, charSequence);
            } else {
                if (i11 != 7 && i11 != 9) {
                    if (charSequence == null) {
                        AbstractC23350e.m122774d("FingerPrintHelper", "Got null string for error message: " + i11);
                        charSequence = C7350r0.this.f40101e.getResources().getString(AbstractC7362x0.fingerprint_generic_error_user_canceled);
                    }
                    if (C7350r0.m37348A(i11)) {
                        i11 = 8;
                    }
                    C7350r0.this.f40115s.obtainMessage(2, i11, 0, charSequence).sendToTarget();
                    C7350r0.this.f40115s.postDelayed(new Runnable() { // from class: com.zing.zalo.biometric.o0

                        /* renamed from: q */
                        public final /* synthetic */ int f40091q;

                        /* renamed from: r */
                        public final /* synthetic */ CharSequence f40092r;

                        public /* synthetic */ RunnableC7344o0(int i112, CharSequence charSequence2) {
                            r2 = i112;
                            r3 = charSequence2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C7350r0.a.this.m37389k(r2, r3);
                        }
                    }, 2000L);
                    return;
                }
                m37389k(i112, charSequence2);
            }
        }

        @Override // androidx.core.hardware.fingerprint.C1433a.c
        /* renamed from: b */
        public void mo7325b() {
            C7350r0.this.f40115s.obtainMessage(1, C7350r0.this.f40101e.getResources().getString(AbstractC7362x0.fingerprint_not_recognized)).sendToTarget();
            C7350r0.this.f40100d.execute(new Runnable() { // from class: com.zing.zalo.biometric.p0
                public /* synthetic */ RunnableC7346p0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7350r0.a.this.m37390l();
                }
            });
        }

        @Override // androidx.core.hardware.fingerprint.C1433a.c
        /* renamed from: c */
        public void mo7326c(int i11, CharSequence charSequence) {
            C7350r0.this.f40115s.obtainMessage(1, charSequence).sendToTarget();
        }

        @Override // androidx.core.hardware.fingerprint.C1433a.c
        /* renamed from: d */
        public void mo7327d(C1433a.d dVar) {
            BiometricWrapper.C7310b c7310b;
            C7350r0.this.f40115s.obtainMessage(5).sendToTarget();
            if (dVar != null && Build.VERSION.SDK_INT >= 23) {
                c7310b = new BiometricWrapper.C7310b(C7350r0.m37356I(dVar.m7328a()));
            } else {
                c7310b = new BiometricWrapper.C7310b(null);
            }
            C7350r0.this.f40100d.execute(new Runnable() { // from class: com.zing.zalo.biometric.n0

                /* renamed from: q */
                public final /* synthetic */ BiometricWrapper.C7310b f40089q;

                public /* synthetic */ RunnableC7342n0(BiometricWrapper.C7310b c7310b2) {
                    r2 = c7310b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7350r0.a.this.m37391m(r2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.biometric.r0$b */
    /* loaded from: classes3.dex */
    public class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                C7350r0.this.m37382z((CharSequence) message.obj);
                return;
            }
            if (i11 == 2) {
                C7350r0.this.m37381y((CharSequence) message.obj);
                return;
            }
            if (i11 == 3) {
                C7350r0.this.m37379w((CharSequence) message.obj);
            } else if (i11 == 4) {
                C7350r0.this.m37380x();
            } else if (i11 == 5) {
                C7350r0.this.m37354G();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.biometric.r0$c */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C7350r0.this.f40098b != null) {
                C7350r0.this.f40098b.m7342a();
            }
            C7350r0.this.f40115s.obtainMessage(5).sendToTarget();
        }
    }

    public C7350r0(BiometricWrapper.C7312d c7312d, Context context, Executor executor, BiometricWrapper.AbstractC7309a abstractC7309a) {
        this.f40100d = executor;
        this.f40099c = abstractC7309a;
        this.f40101e = context;
        this.f40113q = c7312d;
        this.f40097a = C1433a.m7309b(context);
    }

    /* renamed from: A */
    static boolean m37348A(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return false;
            case 6:
            default:
                return true;
        }
    }

    /* renamed from: B */
    public /* synthetic */ void m37349B(DialogInterface dialogInterface) {
        this.f40111o = 1;
        C1439e c1439e = this.f40098b;
        if (c1439e != null) {
            c1439e.m7342a();
        }
    }

    /* renamed from: C */
    public /* synthetic */ void m37350C(DialogInterface dialogInterface) {
        Handler handler = this.f40115s;
        handler.sendMessage(handler.obtainMessage(4));
    }

    /* renamed from: D */
    public /* synthetic */ void m37351D(BiometricWrapper.C7311c c7311c) {
        try {
            this.f40098b = new C1439e();
            this.f40097a.m7314a(m37358K(c7311c), 0, this.f40098b, this.f40114r, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: E */
    public /* synthetic */ void m37352E() {
        try {
            C1439e c1439e = new C1439e();
            this.f40098b = c1439e;
            this.f40097a.m7314a(null, 0, c1439e, this.f40114r, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: F */
    public /* synthetic */ void m37353F() {
        try {
            Dialog dialog = this.f40102f;
            if (dialog != null && dialog.isShowing()) {
                this.f40102f.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: H */
    private boolean m37355H(int i11, int i12) {
        if (i11 == 0 && i12 == 1) {
            return false;
        }
        if (i11 == 1 && i12 == 2) {
            return true;
        }
        return i11 == 2 && i12 == 1;
    }

    /* renamed from: I */
    public static BiometricWrapper.C7311c m37356I(C1433a.e eVar) {
        if (eVar == null) {
            return null;
        }
        if (eVar.m7329a() != null) {
            return new BiometricWrapper.C7311c(eVar.m7329a());
        }
        if (eVar.m7331c() != null) {
            return new BiometricWrapper.C7311c(eVar.m7331c());
        }
        if (eVar.m7330b() == null) {
            return null;
        }
        return new BiometricWrapper.C7311c(eVar.m7330b());
    }

    /* renamed from: J */
    private void m37357J(int i11) {
        Drawable m37378v;
        AnimatedVectorDrawable animatedVectorDrawable;
        if (this.f40107k == null || Build.VERSION.SDK_INT < 23 || (m37378v = m37378v(this.f40110n, i11)) == null) {
            return;
        }
        if (m37378v instanceof AnimatedVectorDrawable) {
            animatedVectorDrawable = (AnimatedVectorDrawable) m37378v;
        } else {
            animatedVectorDrawable = null;
        }
        this.f40107k.setImageDrawable(m37378v);
        if (animatedVectorDrawable != null && m37355H(this.f40110n, i11)) {
            animatedVectorDrawable.start();
        }
        this.f40110n = i11;
    }

    /* renamed from: K */
    private static C1433a.e m37358K(BiometricWrapper.C7311c c7311c) {
        if (c7311c == null) {
            return null;
        }
        if (c7311c.m37279a() != null) {
            return new C1433a.e(c7311c.m37279a());
        }
        if (c7311c.m37281c() != null) {
            return new C1433a.e(c7311c.m37281c());
        }
        if (c7311c.m37280b() == null) {
            return null;
        }
        return new C1433a.e(c7311c.m37280b());
    }

    /* renamed from: u */
    public void m37354G() {
        Dialog dialog = this.f40102f;
        if (dialog != null && dialog.isShowing()) {
            this.f40115s.post(new Runnable() { // from class: com.zing.zalo.biometric.l0
                public /* synthetic */ RunnableC7338l0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7350r0.this.m37353F();
                }
            });
        }
    }

    /* renamed from: v */
    private Drawable m37378v(int i11, int i12) {
        int i13;
        if (i11 == 0 && i12 == 1) {
            i13 = AbstractC7356u0.fingerprint_dialog_fp_to_error;
        } else if (i11 == 1 && i12 == 2) {
            i13 = AbstractC7356u0.fingerprint_dialog_fp_to_error;
        } else if (i11 == 2 && i12 == 1) {
            i13 = AbstractC7356u0.fingerprint_dialog_error_to_fp;
        } else if (i11 == 1 && i12 == 3) {
            i13 = AbstractC7356u0.fingerprint_dialog_error_to_fp;
        } else {
            return null;
        }
        return AbstractC1388a.m6964f(this.f40101e, i13);
    }

    /* renamed from: w */
    public void m37379w(CharSequence charSequence) {
        TextView textView = this.f40106j;
        if (textView != null) {
            textView.setTextColor(this.f40108l);
            if (charSequence != null) {
                this.f40106j.setText(charSequence);
            } else {
                this.f40106j.setText(AbstractC7362x0.fingerprint_error_lockout);
            }
        }
        this.f40115s.postDelayed(new Runnable() { // from class: com.zing.zalo.biometric.m0
            public /* synthetic */ RunnableC7340m0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7350r0.this.m37354G();
            }
        }, 2000L);
    }

    /* renamed from: x */
    public void m37380x() {
        m37357J(1);
        TextView textView = this.f40106j;
        if (textView != null) {
            textView.setTextColor(this.f40109m);
            this.f40106j.setText(this.f40101e.getString(AbstractC7362x0.fingerprint_dialog_description));
        }
    }

    /* renamed from: y */
    public void m37381y(CharSequence charSequence) {
        m37357J(2);
        this.f40115s.removeMessages(4);
        TextView textView = this.f40106j;
        if (textView != null) {
            textView.setTextColor(this.f40108l);
            this.f40106j.setText(charSequence);
        }
        if (this.f40112p) {
            AbstractC7318b1.m37303a(this.f40101e);
        }
        Handler handler = this.f40115s;
        handler.sendMessageDelayed(handler.obtainMessage(3), 2000L);
    }

    /* renamed from: z */
    public void m37382z(CharSequence charSequence) {
        m37357J(2);
        this.f40115s.removeMessages(4);
        TextView textView = this.f40106j;
        if (textView != null) {
            textView.setTextColor(this.f40108l);
            this.f40106j.setText(charSequence);
        }
        if (this.f40112p) {
            AbstractC7318b1.m37303a(this.f40101e);
        }
        Handler handler = this.f40115s;
        handler.sendMessageDelayed(handler.obtainMessage(4), 2000L);
    }

    @Override // com.zing.zalo.biometric.InterfaceC7352s0
    /* renamed from: a */
    public void mo37323a(Cipher cipher) {
        if (this.f40113q.m37283b() == null) {
            return;
        }
        C24222a m126376c = C24222a.m126376c(LayoutInflater.from(this.f40101e));
        this.f40103g = m126376c.f116934q;
        this.f40104h = m126376c.f116938u;
        this.f40105i = m126376c.f116937t;
        this.f40106j = m126376c.f116935r;
        this.f40107k = m126376c.f116936s;
        boolean m37289h = this.f40113q.m37289h();
        this.f40113q.m37285d();
        if (m37289h && Build.VERSION.SDK_INT < 28) {
            this.f40101e.getString(AbstractC7362x0.fingerprint_close);
        }
        this.f40103g.setOnClickListener(this.f40116t);
        this.f40104h.setText(this.f40113q.m37287f());
        CharSequence m37286e = this.f40113q.m37286e();
        if (TextUtils.isEmpty(m37286e)) {
            this.f40105i.setVisibility(8);
        } else {
            this.f40105i.setText(m37286e);
        }
        Dialog dialog = new Dialog(this.f40101e, AbstractC7364y0.DialogTheme);
        this.f40102f = dialog;
        dialog.requestWindowFeature(1);
        this.f40102f.setContentView(m126376c.getRoot());
        this.f40102f.setCanceledOnTouchOutside(false);
        Window window = this.f40102f.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.5f;
        attributes.y = 20;
        attributes.flags |= 2;
        window.setAttributes(attributes);
        attributes.gravity = 80;
        window.setLayout(-1, -2);
        this.f40102f.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.zing.zalo.biometric.h0
            public /* synthetic */ DialogInterfaceOnCancelListenerC7330h0() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C7350r0.this.m37349B(dialogInterface);
            }
        });
        this.f40102f.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.zing.zalo.biometric.i0
            public /* synthetic */ DialogInterfaceOnShowListenerC7332i0() {
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C7350r0.this.m37350C(dialogInterface);
            }
        });
        this.f40108l = AbstractC22459a.m116119a(this.f40101e, AbstractC7354t0.NotificationColor1);
        this.f40109m = AbstractC22459a.m116119a(this.f40101e, AbstractC21196a.AppPrimaryColor);
        this.f40112p = this.f40113q.m37290i();
        this.f40102f.show();
        if (cipher != null && Build.VERSION.SDK_INT >= 23) {
            this.f40100d.execute(new Runnable() { // from class: com.zing.zalo.biometric.j0

                /* renamed from: q */
                public final /* synthetic */ BiometricWrapper.C7311c f40084q;

                public /* synthetic */ RunnableC7334j0(BiometricWrapper.C7311c c7311c) {
                    r2 = c7311c;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7350r0.this.m37351D(r2);
                }
            });
        } else {
            this.f40100d.execute(new Runnable() { // from class: com.zing.zalo.biometric.k0
                public /* synthetic */ RunnableC7336k0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7350r0.this.m37352E();
                }
            });
        }
    }

    @Override // com.zing.zalo.biometric.InterfaceC7352s0
    /* renamed from: b */
    public void mo37324b(int i11) {
        this.f40111o = i11;
    }

    @Override // com.zing.zalo.biometric.InterfaceC7352s0
    public void cancel() {
        C1439e c1439e = this.f40098b;
        if (c1439e != null) {
            c1439e.m7342a();
        }
        this.f40098b = null;
        m37354G();
    }
}
