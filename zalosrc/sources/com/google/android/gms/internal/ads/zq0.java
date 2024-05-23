package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p229i5.InterfaceC20296q;

/* loaded from: classes2.dex */
public interface zq0 extends zza, pf1, qq0, x60, xr0, as0, l70, InterfaceC4880pp, es0, zzl, hs0, is0, fn0, js0 {
    /* renamed from: A */
    void mo26667A(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    /* renamed from: A0 */
    void mo26668A0(boolean z11);

    /* renamed from: B */
    boolean mo26669B();

    /* renamed from: C */
    void mo26670C();

    /* renamed from: D */
    boolean mo26671D();

    /* renamed from: E */
    void mo26672E(boolean z11);

    /* renamed from: K */
    void mo26676K(int i11);

    /* renamed from: L */
    void mo26678L(iq2 iq2Var, lq2 lq2Var);

    /* renamed from: M */
    boolean mo26680M();

    /* renamed from: N */
    void mo26682N();

    /* renamed from: O */
    void mo26684O(ps0 ps0Var);

    /* renamed from: P */
    String mo26685P();

    /* renamed from: R */
    void mo26686R(String str, c40 c40Var);

    /* renamed from: S */
    void mo26687S(String str, c40 c40Var);

    /* renamed from: T */
    boolean mo26688T();

    /* renamed from: U */
    void mo26689U(boolean z11);

    /* renamed from: W */
    void mo26690W();

    /* renamed from: X */
    void mo26691X(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    /* renamed from: b */
    iq2 mo25866b();

    /* renamed from: c0 */
    void mo26692c0(InterfaceC5112vz interfaceC5112vz);

    boolean canGoBack();

    /* renamed from: d */
    C4830od mo23008d();

    /* renamed from: d0 */
    void mo26693d0(int i11);

    void destroy();

    /* renamed from: e */
    Context mo26694e();

    /* renamed from: e0 */
    void mo26695e0(Context context);

    /* renamed from: f */
    boolean mo26696f();

    /* renamed from: f0 */
    boolean mo26697f0(boolean z11, int i11);

    /* renamed from: g0 */
    void mo26698g0(InterfaceC4271b interfaceC4271b);

    @Override // com.google.android.gms.internal.ads.as0, com.google.android.gms.internal.ads.fn0
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    /* renamed from: h */
    WebViewClient mo26699h();

    /* renamed from: i */
    View mo23737i();

    /* renamed from: k0 */
    void mo26700k0(InterfaceC5187xz interfaceC5187xz);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    WebView mo26701m();

    void measure(int i11, int i12);

    /* renamed from: o0 */
    void mo26702o0(boolean z11);

    void onPause();

    void onResume();

    /* renamed from: p */
    ps0 mo22517p();

    /* renamed from: p0 */
    void mo26703p0(String str, String str2, String str3);

    /* renamed from: q */
    void mo22097q(String str, kp0 kp0Var);

    /* renamed from: q0 */
    void mo26704q0();

    /* renamed from: r0 */
    void mo26705r0(boolean z11);

    /* renamed from: s */
    void mo22099s(wr0 wr0Var);

    @Override // com.google.android.gms.internal.ads.fn0
    void setBackgroundColor(int i11);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* renamed from: t0 */
    InterfaceC4271b mo26706t0();

    /* renamed from: u */
    InterfaceC4437dr mo26707u();

    /* renamed from: u0 */
    void mo26708u0(InterfaceC4437dr interfaceC4437dr);

    /* renamed from: v */
    boolean mo26709v();

    /* renamed from: w */
    lq2 mo26710w();

    /* renamed from: w0 */
    void mo26711w0(String str, InterfaceC20296q interfaceC20296q);

    /* renamed from: x */
    void mo26712x(boolean z11);

    /* renamed from: y */
    void mo26713y();

    /* renamed from: y0 */
    tc3 mo26714y0();

    /* renamed from: z0 */
    void mo26715z0();

    InterfaceC5187xz zzM();

    com.google.android.gms.ads.internal.overlay.zzl zzN();

    com.google.android.gms.ads.internal.overlay.zzl zzO();

    ns0 zzP();

    void zzX();

    void zzZ();

    Activity zzk();

    com.google.android.gms.ads.internal.zza zzm();

    C5036tx zzo();

    zzcgv zzp();

    wr0 zzs();
}
