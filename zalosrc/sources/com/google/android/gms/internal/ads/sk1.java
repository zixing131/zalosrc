package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class sk1 extends n00 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, sl1 {

    /* renamed from: C */
    public static final c83 f27755C = c83.m20823A("2011", "1009", "3010");

    /* renamed from: A */
    private boolean f27756A;

    /* renamed from: p */
    private final String f27758p;

    /* renamed from: r */
    private FrameLayout f27760r;

    /* renamed from: s */
    private FrameLayout f27761s;

    /* renamed from: t */
    private final uc3 f27762t;

    /* renamed from: u */
    private View f27763u;

    /* renamed from: w */
    private qj1 f27765w;

    /* renamed from: x */
    private ViewOnAttachStateChangeListenerC4917qp f27766x;

    /* renamed from: z */
    private h00 f27768z;

    /* renamed from: q */
    private Map f27759q = new HashMap();

    /* renamed from: y */
    private InterfaceC4271b f27767y = null;

    /* renamed from: B */
    private boolean f27757B = false;

    /* renamed from: v */
    private final int f27764v = 223104000;

    public sk1(FrameLayout frameLayout, FrameLayout frameLayout2, int i11) {
        String str;
        this.f27760r = frameLayout;
        this.f27761s = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f27758p = str;
        zzt.zzx();
        xl0.m27928a(frameLayout, this);
        zzt.zzx();
        xl0.m27929b(frameLayout, this);
        this.f27762t = kl0.f23367e;
        this.f27766x = new ViewOnAttachStateChangeListenerC4917qp(this.f27760r.getContext(), this.f27760r);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* renamed from: N */
    private final synchronized void m26349N(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f27761s.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f27761s.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e11) {
                        yk0.zzk("Encountered invalid base64 watermark.", e11);
                    }
                }
            }
            this.f27761s.addView(frameLayout);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzt() {
        this.f27762t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rk1
            @Override // java.lang.Runnable
            public final void run() {
                sk1.this.zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.sl1
    /* renamed from: Z */
    public final synchronized View mo25758Z(String str) {
        if (this.f27757B) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f27759q.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.sl1
    /* renamed from: kt */
    public final synchronized void mo25759kt(String str, View view, boolean z11) {
        if (this.f27757B) {
            return;
        }
        if (view == null) {
            this.f27759q.remove(str);
            return;
        }
        this.f27759q.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (zzbx.zzi(this.f27764v)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        qj1 qj1Var = this.f27765w;
        if (qj1Var != null) {
            qj1Var.m25731K();
            this.f27765w.m25739S(view, this.f27760r, zzl(), zzm(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        qj1 qj1Var = this.f27765w;
        if (qj1Var != null) {
            FrameLayout frameLayout = this.f27760r;
            qj1Var.m25737Q(frameLayout, zzl(), zzm(), qj1.m25723w(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        qj1 qj1Var = this.f27765w;
        if (qj1Var != null) {
            FrameLayout frameLayout = this.f27760r;
            qj1Var.m25737Q(frameLayout, zzl(), zzm(), qj1.m25723w(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        qj1 qj1Var = this.f27765w;
        if (qj1Var != null) {
            qj1Var.m25745k(view, motionEvent, this.f27760r);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final synchronized InterfaceC4271b zzb(String str) {
        return BinderC4273d.m19913I3(mo25758Z(str));
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final synchronized void zzbA(InterfaceC4271b interfaceC4271b) {
        if (this.f27757B) {
            return;
        }
        Object m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
        if (!(m19914Q instanceof qj1)) {
            yk0.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        qj1 qj1Var = this.f27765w;
        if (qj1Var != null) {
            qj1Var.m25753s(this);
        }
        zzt();
        qj1 qj1Var2 = (qj1) m19914Q;
        this.f27765w = qj1Var2;
        qj1Var2.m25752r(this);
        this.f27765w.m25744j(this.f27760r);
        this.f27765w.m25730J(this.f27761s);
        if (this.f27756A) {
            this.f27765w.m25726C().m26339b(this.f27768z);
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21210c3)).booleanValue() && !TextUtils.isEmpty(this.f27765w.m25727E())) {
            m26349N(this.f27765w.m25727E());
        }
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final synchronized void zzbw(String str, InterfaceC4271b interfaceC4271b) {
        mo25759kt(str, (View) BinderC4273d.m19914Q(interfaceC4271b), true);
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final synchronized void zzbx(InterfaceC4271b interfaceC4271b) {
        this.f27765w.m25747m((View) BinderC4273d.m19914Q(interfaceC4271b));
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final synchronized void zzby(h00 h00Var) {
        if (this.f27757B) {
            return;
        }
        this.f27756A = true;
        this.f27768z = h00Var;
        qj1 qj1Var = this.f27765w;
        if (qj1Var != null) {
            qj1Var.m25726C().m26339b(h00Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final synchronized void zzbz(InterfaceC4271b interfaceC4271b) {
        if (this.f27757B) {
            return;
        }
        this.f27767y = interfaceC4271b;
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final synchronized void zzc() {
        try {
            if (this.f27757B) {
                return;
            }
            qj1 qj1Var = this.f27765w;
            if (qj1Var != null) {
                qj1Var.m25753s(this);
                this.f27765w = null;
            }
            this.f27759q.clear();
            this.f27760r.removeAllViews();
            this.f27761s.removeAllViews();
            this.f27759q = null;
            this.f27760r = null;
            this.f27761s = null;
            this.f27763u = null;
            this.f27766x = null;
            this.f27757B = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void zzd(InterfaceC4271b interfaceC4271b) {
        onTouch(this.f27760r, (MotionEvent) BinderC4273d.m19914Q(interfaceC4271b));
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final synchronized void zze(InterfaceC4271b interfaceC4271b, int i11) {
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final /* synthetic */ View zzf() {
        return this.f27760r;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final FrameLayout zzh() {
        return this.f27761s;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final ViewOnAttachStateChangeListenerC4917qp zzi() {
        return this.f27766x;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final InterfaceC4271b zzj() {
        return this.f27767y;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized String zzk() {
        return this.f27758p;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized Map zzl() {
        return this.f27759q;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized Map zzm() {
        return this.f27759q;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized JSONObject zzo() {
        qj1 qj1Var = this.f27765w;
        if (qj1Var != null) {
            return qj1Var.m25728G(this.f27760r, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sl1
    public final synchronized JSONObject zzp() {
        qj1 qj1Var = this.f27765w;
        if (qj1Var != null) {
            return qj1Var.m25729H(this.f27760r, zzl(), zzm());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzr() {
        if (this.f27763u == null) {
            View view = new View(this.f27760r.getContext());
            this.f27763u = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f27760r != this.f27763u.getParent()) {
            this.f27760r.addView(this.f27763u);
        }
    }
}
