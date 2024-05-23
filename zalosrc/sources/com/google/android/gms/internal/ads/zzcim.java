package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzcim extends FrameLayout implements mm0 {

    /* renamed from: A */
    private long f32055A;

    /* renamed from: B */
    private long f32056B;

    /* renamed from: C */
    private String f32057C;

    /* renamed from: D */
    private String[] f32058D;

    /* renamed from: E */
    private Bitmap f32059E;

    /* renamed from: F */
    private final ImageView f32060F;

    /* renamed from: G */
    private boolean f32061G;

    /* renamed from: H */
    private final Integer f32062H;

    /* renamed from: p */
    private final fn0 f32063p;

    /* renamed from: q */
    private final FrameLayout f32064q;

    /* renamed from: r */
    private final View f32065r;

    /* renamed from: s */
    private final C5110vx f32066s;

    /* renamed from: t */
    final in0 f32067t;

    /* renamed from: u */
    private final long f32068u;

    /* renamed from: v */
    private final zzcie f32069v;

    /* renamed from: w */
    private boolean f32070w;

    /* renamed from: x */
    private boolean f32071x;

    /* renamed from: y */
    private boolean f32072y;

    /* renamed from: z */
    private boolean f32073z;

    public zzcim(Context context, fn0 fn0Var, int i11, boolean z11, C5110vx c5110vx, en0 en0Var, Integer num) {
        super(context);
        zzcie zzcicVar;
        String str;
        this.f32063p = fn0Var;
        this.f32066s = c5110vx;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32064q = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        AbstractC4205o.m19722k(fn0Var.zzm());
        nm0 nm0Var = fn0Var.zzm().zza;
        gn0 gn0Var = new gn0(context, fn0Var.zzp(), fn0Var.mo22092a(), c5110vx, fn0Var.zzn());
        if (i11 == 2) {
            zzcicVar = new zzcjq(context, gn0Var, fn0Var, z11, nm0.m24960a(fn0Var), en0Var, num);
        } else {
            zzcicVar = new zzcic(context, fn0Var, z11, nm0.m24960a(fn0Var), en0Var, new gn0(context, fn0Var.zzp(), fn0Var.mo22092a(), c5110vx, fn0Var.zzn()), num);
        }
        this.f32069v = zzcicVar;
        this.f32062H = num;
        View view = new View(context);
        this.f32065r = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcicVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20961D)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20931A)).booleanValue()) {
            m28772r();
        }
        this.f32060F = new ImageView(context);
        this.f32068u = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f20981F)).longValue();
        boolean booleanValue = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20951C)).booleanValue();
        this.f32073z = booleanValue;
        if (c5110vx != null) {
            if (true != booleanValue) {
                str = "0";
            } else {
                str = "1";
            }
            c5110vx.m27426d("spinner_used", str);
        }
        this.f32067t = new in0(this);
        zzcicVar.mo28743v(this);
    }

    /* renamed from: l */
    private final void m28753l() {
        if (this.f32063p.zzk() != null && this.f32071x && !this.f32072y) {
            this.f32063p.zzk().getWindow().clearFlags(128);
            this.f32071x = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m28754m(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer m28771p = m28771p();
        if (m28771p != null) {
            hashMap.put("playerId", m28771p.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f32063p.mo23552V("onVideoEvent", hashMap);
    }

    /* renamed from: n */
    private final boolean m28755n() {
        if (this.f32060F.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public final void m28757A() {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.mo28741s();
    }

    /* renamed from: B */
    public final void m28758B(int i11) {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.mo28742u(i11);
    }

    /* renamed from: C */
    public final void m28759C(MotionEvent motionEvent) {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: D */
    public final void m28760D(int i11) {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.mo28752z(i11);
    }

    /* renamed from: E */
    public final void m28761E(int i11) {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.mo28747A(i11);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    /* renamed from: a */
    public final void mo24630a(int i11, int i12) {
        if (this.f32073z) {
            AbstractC5184xw abstractC5184xw = AbstractC4554gx.f20971E;
            int max = Math.max(i11 / ((Integer) zzay.zzc().m21823b(abstractC5184xw)).intValue(), 1);
            int max2 = Math.max(i12 / ((Integer) zzay.zzc().m21823b(abstractC5184xw)).intValue(), 1);
            Bitmap bitmap = this.f32059E;
            if (bitmap != null && bitmap.getWidth() == max && this.f32059E.getHeight() == max2) {
                return;
            }
            this.f32059E = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.f32061G = false;
        }
    }

    /* renamed from: b */
    public final void m28762b(int i11) {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.mo28748B(i11);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    /* renamed from: c */
    public final void mo24631c(String str, String str2) {
        m28754m(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "what", str, "extra", str2);
    }

    /* renamed from: d */
    public final void m28763d(int i11) {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.mo28749C(i11);
    }

    /* renamed from: e */
    public final void m28764e(int i11) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20961D)).booleanValue()) {
            this.f32064q.setBackgroundColor(i11);
            this.f32065r.setBackgroundColor(i11);
        }
    }

    /* renamed from: f */
    public final void m28765f(int i11) {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.mo28750d(i11);
    }

    public final void finalize() {
        try {
            this.f32067t.m23304a();
            final zzcie zzcieVar = this.f32069v;
            if (zzcieVar != null) {
                kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.om0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcie.this.mo28745x();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void m28766g(String str, String[] strArr) {
        this.f32057C = str;
        this.f32058D = strArr;
    }

    /* renamed from: h */
    public final void m28767h(int i11, int i12, int i13, int i14) {
        if (zze.zzc()) {
            zze.zza("Set video bounds to x:" + i11 + ";y:" + i12 + ";w:" + i13 + ";h:" + i14);
        }
        if (i13 != 0 && i14 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
            layoutParams.setMargins(i11, i12, 0, 0);
            this.f32064q.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: i */
    public final void m28768i(float f11) {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.f32053q.m23974e(f11);
        zzcieVar.zzn();
    }

    /* renamed from: j */
    public final void m28769j(float f11, float f12) {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar != null) {
            zzcieVar.mo28746y(f11, f12);
        }
    }

    /* renamed from: k */
    public final void m28770k() {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.f32053q.m23973d(false);
        zzcieVar.zzn();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z11) {
        super.onWindowFocusChanged(z11);
        if (z11) {
            this.f32067t.m23305b();
        } else {
            this.f32067t.m23304a();
            this.f32056B = this.f32055A;
        }
        zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.pm0
            @Override // java.lang.Runnable
            public final void run() {
                zzcim.this.m28775v(z11);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.mm0
    public final void onWindowVisibilityChanged(int i11) {
        boolean z11;
        super.onWindowVisibilityChanged(i11);
        if (i11 == 0) {
            this.f32067t.m23305b();
            z11 = true;
        } else {
            this.f32067t.m23304a();
            this.f32056B = this.f32055A;
            z11 = false;
        }
        zzs.zza.post(new tm0(this, z11));
    }

    /* renamed from: p */
    public final Integer m28771p() {
        zzcie zzcieVar = this.f32069v;
        return zzcieVar != null ? zzcieVar.f32054r : this.f32062H;
    }

    /* renamed from: r */
    public final void m28772r() {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        TextView textView = new TextView(zzcieVar.getContext());
        textView.setText("AdMob - ".concat(this.f32069v.mo28739q()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f32064q.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f32064q.bringChildToFront(textView);
    }

    /* renamed from: s */
    public final void m28773s() {
        this.f32067t.m23304a();
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar != null) {
            zzcieVar.mo28745x();
        }
        m28753l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void m28774u() {
        m28754m("firstFrameRendered", new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final /* synthetic */ void m28775v(boolean z11) {
        m28754m("windowFocusChanged", "hasWindowFocus", String.valueOf(z11));
    }

    /* renamed from: w */
    public final void m28776w() {
        if (this.f32069v == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f32057C)) {
            this.f32069v.mo28751e(this.f32057C, this.f32058D);
        } else {
            m28754m("no_src", new String[0]);
        }
    }

    /* renamed from: x */
    public final void m28777x() {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.f32053q.m23973d(true);
        zzcieVar.zzn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final void m28778y() {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        long mo28731h = zzcieVar.mo28731h();
        if (this.f32055A != mo28731h && mo28731h > 0) {
            float f11 = ((float) mo28731h) / 1000.0f;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue()) {
                m28754m("timeupdate", "time", String.valueOf(f11), "totalBytes", String.valueOf(this.f32069v.mo28738p()), "qoeCachedBytes", String.valueOf(this.f32069v.mo28736m()), "qoeLoadedBytes", String.valueOf(this.f32069v.mo28737n()), "droppedFrames", String.valueOf(this.f32069v.mo28732i()), "reportTime", String.valueOf(zzt.zzB().mo105913a()));
            } else {
                m28754m("timeupdate", "time", String.valueOf(f11));
            }
            this.f32055A = mo28731h;
        }
    }

    /* renamed from: z */
    public final void m28779z() {
        zzcie zzcieVar = this.f32069v;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.mo28740r();
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final void zza() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20993G1)).booleanValue()) {
            this.f32067t.m23304a();
        }
        m28754m("ended", new String[0]);
        m28753l();
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final void zzc(String str, String str2) {
        m28754m("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final void zzd() {
        m28754m("pause", new String[0]);
        m28753l();
        this.f32070w = false;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final void zze() {
        boolean z11;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20993G1)).booleanValue()) {
            this.f32067t.m23305b();
        }
        if (this.f32063p.zzk() != null && !this.f32071x) {
            if ((this.f32063p.zzk().getWindow().getAttributes().flags & 128) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f32072y = z11;
            if (!z11) {
                this.f32063p.zzk().getWindow().addFlags(128);
                this.f32071x = true;
            }
        }
        this.f32070w = true;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final void zzf() {
        if (this.f32069v != null && this.f32056B == 0) {
            m28754m("canplaythrough", "duration", String.valueOf(r0.mo28733j() / 1000.0f), "videoWidth", String.valueOf(this.f32069v.mo28735l()), "videoHeight", String.valueOf(this.f32069v.mo28734k()));
        }
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final void zzg() {
        this.f32065r.setVisibility(4);
        zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.qm0
            @Override // java.lang.Runnable
            public final void run() {
                zzcim.this.m28774u();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final void zzh() {
        this.f32067t.m23305b();
        zzs.zza.post(new rm0(this));
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final void zzi() {
        if (this.f32061G && this.f32059E != null && !m28755n()) {
            this.f32060F.setImageBitmap(this.f32059E);
            this.f32060F.invalidate();
            this.f32064q.addView(this.f32060F, new FrameLayout.LayoutParams(-1, -1));
            this.f32064q.bringChildToFront(this.f32060F);
        }
        this.f32067t.m23304a();
        this.f32056B = this.f32055A;
        zzs.zza.post(new sm0(this));
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final void zzk() {
        if (this.f32070w && m28755n()) {
            this.f32064q.removeView(this.f32060F);
        }
        if (this.f32069v != null && this.f32059E != null) {
            long mo105914b = zzt.zzB().mo105914b();
            if (this.f32069v.getBitmap(this.f32059E) != null) {
                this.f32061G = true;
            }
            long mo105914b2 = zzt.zzB().mo105914b() - mo105914b;
            if (zze.zzc()) {
                zze.zza("Spinner frame grab took " + mo105914b2 + "ms");
            }
            if (mo105914b2 > this.f32068u) {
                yk0.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f32073z = false;
                this.f32059E = null;
                C5110vx c5110vx = this.f32066s;
                if (c5110vx != null) {
                    c5110vx.m27426d("spinner_jank", Long.toString(mo105914b2));
                }
            }
        }
    }
}
