package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p229i5.InterfaceC20296q;

/* loaded from: classes2.dex */
public final class zzcne extends FrameLayout implements zq0 {

    /* renamed from: p */
    private final zq0 f32091p;

    /* renamed from: q */
    private final um0 f32092q;

    /* renamed from: r */
    private final AtomicBoolean f32093r;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcne(zq0 zq0Var) {
        super(zq0Var.getContext());
        this.f32093r = new AtomicBoolean();
        this.f32091p = zq0Var;
        this.f32092q = new um0(zq0Var.mo26694e(), this, this);
        addView((View) zq0Var);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: A */
    public final void mo26667A(zzl zzlVar) {
        this.f32091p.mo26667A(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: A0 */
    public final void mo26668A0(boolean z11) {
        this.f32091p.mo26668A0(z11);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: B */
    public final boolean mo26669B() {
        return this.f32091p.mo26669B();
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: B0 */
    public final void mo21786B0(boolean z11, int i11, String str, String str2, boolean z12) {
        this.f32091p.mo21786B0(z11, i11, str, str2, z12);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: C */
    public final void mo26670C() {
        TextView textView = new TextView(getContext());
        zzt.zzp();
        textView.setText(zzs.zzv());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.l70
    /* renamed from: C0 */
    public final void mo23550C0(String str, JSONObject jSONObject) {
        ((tr0) this.f32091p).mo23553c(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: D */
    public final boolean mo26671D() {
        return this.f32091p.mo26671D();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: E */
    public final void mo26672E(boolean z11) {
        this.f32091p.mo26672E(z11);
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: G */
    public final void mo22089G(int i11) {
        this.f32092q.m26999f(i11);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: K */
    public final void mo26676K(int i11) {
        this.f32091p.mo26676K(i11);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: L */
    public final void mo26678L(iq2 iq2Var, lq2 lq2Var) {
        this.f32091p.mo26678L(iq2Var, lq2Var);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: M */
    public final boolean mo26680M() {
        return this.f32091p.mo26680M();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: N */
    public final void mo26682N() {
        this.f32091p.mo26682N();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: O */
    public final void mo26684O(ps0 ps0Var) {
        this.f32091p.mo26684O(ps0Var);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: P */
    public final String mo26685P() {
        return this.f32091p.mo26685P();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: Q */
    public final void mo22090Q(int i11) {
        this.f32091p.mo22090Q(i11);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: R */
    public final void mo26686R(String str, c40 c40Var) {
        this.f32091p.mo26686R(str, c40Var);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: S */
    public final void mo26687S(String str, c40 c40Var) {
        this.f32091p.mo26687S(str, c40Var);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: T */
    public final boolean mo26688T() {
        return this.f32093r.get();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: U */
    public final void mo26689U(boolean z11) {
        this.f32091p.mo26689U(z11);
    }

    @Override // com.google.android.gms.internal.ads.x60
    /* renamed from: V */
    public final void mo23552V(String str, Map map) {
        this.f32091p.mo23552V(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: W */
    public final void mo26690W() {
        setBackgroundColor(0);
        this.f32091p.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: X */
    public final void mo26691X(zzl zzlVar) {
        this.f32091p.mo26691X(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: Y */
    public final void mo22091Y(int i11) {
        this.f32091p.mo22091Y(i11);
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: a */
    public final String mo22092a() {
        return this.f32091p.mo22092a();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: a0 */
    public final um0 mo22093a0() {
        return this.f32092q;
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.qq0
    /* renamed from: b */
    public final iq2 mo25866b() {
        return this.f32091p.mo25866b();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: b0 */
    public final void mo22094b0(boolean z11, long j11) {
        this.f32091p.mo22094b0(z11, j11);
    }

    @Override // com.google.android.gms.internal.ads.l70, com.google.android.gms.internal.ads.z60
    /* renamed from: c */
    public final void mo23553c(String str, String str2) {
        this.f32091p.mo23553c("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: c0 */
    public final void mo26692c0(InterfaceC5112vz interfaceC5112vz) {
        this.f32091p.mo26692c0(interfaceC5112vz);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final boolean canGoBack() {
        return this.f32091p.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.hs0
    /* renamed from: d */
    public final C4830od mo23008d() {
        return this.f32091p.mo23008d();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: d0 */
    public final void mo26693d0(int i11) {
        this.f32091p.mo26693d0(i11);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void destroy() {
        final InterfaceC4271b mo26706t0 = mo26706t0();
        if (mo26706t0 != null) {
            m23 m23Var = zzs.zza;
            m23Var.post(new Runnable() { // from class: com.google.android.gms.internal.ads.or0
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC4271b interfaceC4271b = InterfaceC4271b.this;
                    zzt.zzA();
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21251g4)).booleanValue() && rx2.m26203b()) {
                        Object m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
                        if (m19914Q instanceof tx2) {
                            ((tx2) m19914Q).mo26794c();
                        }
                    }
                }
            });
            final zq0 zq0Var = this.f32091p;
            zq0Var.getClass();
            m23Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.pr0
                @Override // java.lang.Runnable
                public final void run() {
                    zq0.this.destroy();
                }
            }, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21261h4)).intValue());
            return;
        }
        this.f32091p.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: e */
    public final Context mo26694e() {
        return this.f32091p.mo26694e();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: e0 */
    public final void mo26695e0(Context context) {
        this.f32091p.mo26695e0(context);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: f */
    public final boolean mo26696f() {
        return this.f32091p.mo26696f();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: f0 */
    public final boolean mo26697f0(boolean z11, int i11) {
        if (!this.f32093r.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20982F0)).booleanValue()) {
            return false;
        }
        if (this.f32091p.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f32091p.getParent()).removeView((View) this.f32091p);
        }
        this.f32091p.mo26697f0(z11, i11);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: g */
    public final void mo22095g() {
        this.f32091p.mo22095g();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: g0 */
    public final void mo26698g0(InterfaceC4271b interfaceC4271b) {
        this.f32091p.mo26698g0(interfaceC4271b);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void goBack() {
        this.f32091p.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: h */
    public final WebViewClient mo26699h() {
        return this.f32091p.mo26699h();
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.js0
    /* renamed from: i */
    public final View mo23737i() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: k */
    public final void mo22096k() {
        this.f32091p.mo22096k();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: k0 */
    public final void mo26700k0(InterfaceC5187xz interfaceC5187xz) {
        this.f32091p.mo26700k0(interfaceC5187xz);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void loadData(String str, String str2, String str3) {
        this.f32091p.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f32091p.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void loadUrl(String str) {
        this.f32091p.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: m */
    public final WebView mo26701m() {
        return (WebView) this.f32091p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
    /* renamed from: m0 */
    public final void mo21778m0(C4842op c4842op) {
        this.f32091p.mo21778m0(c4842op);
    }

    @Override // com.google.android.gms.internal.ads.x60, com.google.android.gms.internal.ads.z60
    /* renamed from: n */
    public final void mo23555n(String str, JSONObject jSONObject) {
        this.f32091p.mo23555n(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: n0 */
    public final void mo21787n0(boolean z11, int i11, String str, boolean z12) {
        this.f32091p.mo21787n0(z11, i11, str, z12);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: o0 */
    public final void mo26702o0(boolean z11) {
        this.f32091p.mo26702o0(z11);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zq0 zq0Var = this.f32091p;
        if (zq0Var != null) {
            zq0Var.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void onPause() {
        this.f32092q.m26998e();
        this.f32091p.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void onResume() {
        this.f32091p.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.gs0
    /* renamed from: p */
    public final ps0 mo22517p() {
        return this.f32091p.mo22517p();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: p0 */
    public final void mo26703p0(String str, String str2, String str3) {
        this.f32091p.mo26703p0(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    /* renamed from: q */
    public final void mo22097q(String str, kp0 kp0Var) {
        this.f32091p.mo22097q(str, kp0Var);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: q0 */
    public final void mo26704q0() {
        this.f32091p.mo26704q0();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: r */
    public final kp0 mo22098r(String str) {
        return this.f32091p.mo22098r(str);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: r0 */
    public final void mo26705r0(boolean z11) {
        this.f32091p.mo26705r0(z11);
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    /* renamed from: s */
    public final void mo22099s(wr0 wr0Var) {
        this.f32091p.mo22099s(wr0Var);
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: s0 */
    public final void mo21788s0(zzc zzcVar, boolean z11) {
        this.f32091p.mo21788s0(zzcVar, z11);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zq0
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f32091p.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zq0
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f32091p.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f32091p.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f32091p.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: t0 */
    public final InterfaceC4271b mo26706t0() {
        return this.f32091p.mo26706t0();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: u */
    public final InterfaceC4437dr mo26707u() {
        return this.f32091p.mo26707u();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: u0 */
    public final void mo26708u0(InterfaceC4437dr interfaceC4437dr) {
        this.f32091p.mo26708u0(interfaceC4437dr);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: v */
    public final boolean mo26709v() {
        return this.f32091p.mo26709v();
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: v0 */
    public final void mo21789v0(boolean z11, int i11, boolean z12) {
        this.f32091p.mo21789v0(z11, i11, z12);
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.xr0
    /* renamed from: w */
    public final lq2 mo26710w() {
        return this.f32091p.mo26710w();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: w0 */
    public final void mo26711w0(String str, InterfaceC20296q interfaceC20296q) {
        this.f32091p.mo26711w0(str, interfaceC20296q);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: x */
    public final void mo26712x(boolean z11) {
        this.f32091p.mo26712x(z11);
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: x0 */
    public final void mo21790x0(zzbr zzbrVar, n22 n22Var, dt1 dt1Var, rv2 rv2Var, String str, String str2, int i11) {
        this.f32091p.mo21790x0(zzbrVar, n22Var, dt1Var, rv2Var, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: y */
    public final void mo26713y() {
        this.f32092q.m26997d();
        this.f32091p.mo26713y();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: y0 */
    public final tc3 mo26714y0() {
        return this.f32091p.mo26714y0();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: z */
    public final void mo22100z(int i11) {
        this.f32091p.mo22100z(i11);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: z0 */
    public final void mo26715z0() {
        zq0 zq0Var = this.f32091p;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(zzt.zzr().zza()));
        tr0 tr0Var = (tr0) zq0Var;
        hashMap.put("device_volume", String.valueOf(zzab.zzb(tr0Var.getContext())));
        tr0Var.mo23552V("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void zzB(boolean z11) {
        this.f32091p.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final InterfaceC5187xz zzM() {
        return this.f32091p.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final zzl zzN() {
        return this.f32091p.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final zzl zzO() {
        return this.f32091p.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final ns0 zzP() {
        return ((tr0) this.f32091p).m26673F0();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void zzX() {
        this.f32091p.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void zzZ() {
        this.f32091p.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.l70, com.google.android.gms.internal.ads.z60
    public final void zza(String str) {
        ((tr0) this.f32091p).m26677K0(str);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbn() {
        this.f32091p.zzbn();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbo() {
        this.f32091p.zzbo();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final int zzf() {
        return this.f32091p.zzf();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final int zzg() {
        return this.f32091p.zzg();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final int zzh() {
        return this.f32091p.zzh();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final int zzi() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21171Y2)).booleanValue()) {
            return this.f32091p.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final int zzj() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21171Y2)).booleanValue()) {
            return this.f32091p.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    public final Activity zzk() {
        return this.f32091p.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    public final zza zzm() {
        return this.f32091p.zzm();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final C4999sx zzn() {
        return this.f32091p.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    public final C5036tx zzo() {
        return this.f32091p.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.is0, com.google.android.gms.internal.ads.fn0
    public final zzcgv zzp() {
        return this.f32091p.zzp();
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void zzq() {
        zq0 zq0Var = this.f32091p;
        if (zq0Var != null) {
            zq0Var.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    public final wr0 zzs() {
        return this.f32091p.zzs();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final String zzt() {
        return this.f32091p.zzt();
    }
}
