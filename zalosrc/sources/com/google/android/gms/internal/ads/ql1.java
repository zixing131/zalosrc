package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ql1 {

    /* renamed from: a */
    private final jq1 f26850a;

    /* renamed from: b */
    private final xo1 f26851b;

    /* renamed from: c */
    private ViewTreeObserver.OnScrollChangedListener f26852c = null;

    public ql1(jq1 jq1Var, xo1 xo1Var) {
        this.f26850a = jq1Var;
        this.f26851b = xo1Var;
    }

    /* renamed from: f */
    private static final int m25774f(Context context, String str, int i11) {
        try {
            i11 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzaw.zzb();
        return rk0.m26115y(context, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final View m25775a(final View view, final WindowManager windowManager) {
        zq0 m23723a = this.f26850a.m23723a(zzq.zzc(), null, null);
        View view2 = (View) m23723a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        m23723a.mo26687S("/sendMessageToSdk", new c40() { // from class: com.google.android.gms.internal.ads.ml1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                ql1.this.m25776b((zq0) obj, map);
            }
        });
        m23723a.mo26687S("/hideValidatorOverlay", new c40() { // from class: com.google.android.gms.internal.ads.nl1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                ql1.this.m25777c(windowManager, view, (zq0) obj, map);
            }
        });
        m23723a.mo26687S("/open", new n40(null, null, null, null, null));
        this.f26851b.m27959j(new WeakReference(m23723a), "/loadNativeAdPolicyViolations", new c40() { // from class: com.google.android.gms.internal.ads.ol1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                ql1.this.m25779e(view, windowManager, (zq0) obj, map);
            }
        });
        this.f26851b.m27959j(new WeakReference(m23723a), "/showValidatorOverlay", new c40() { // from class: com.google.android.gms.internal.ads.pl1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                yk0.zze("Show native ad policy validator overlay.");
                ((zq0) obj).mo23737i().setVisibility(0);
            }
        });
        return (View) m23723a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m25776b(zq0 zq0Var, Map map) {
        this.f26851b.m27956g("sendMessageToNativeJs", map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m25777c(WindowManager windowManager, View view, zq0 zq0Var, Map map) {
        yk0.zze("Hide native ad policy validator overlay.");
        zq0Var.mo23737i().setVisibility(8);
        if (zq0Var.mo23737i().getWindowToken() != null) {
            windowManager.removeView(zq0Var.mo23737i());
        }
        zq0Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f26852c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f26852c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m25778d(Map map, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f26851b.m27956g("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void m25779e(final View view, final WindowManager windowManager, final zq0 zq0Var, final Map map) {
        int i11;
        zq0Var.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.internal.ads.kl1
            @Override // com.google.android.gms.internal.ads.ls0
            public final void zza(boolean z11) {
                ql1.this.m25778d(map, z11);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int m25774f = m25774f(context, (String) map.get("validator_width"), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21138U6)).intValue());
        int m25774f2 = m25774f(context, (String) map.get("validator_height"), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21148V6)).intValue());
        int m25774f3 = m25774f(context, (String) map.get("validator_x"), 0);
        int m25774f4 = m25774f(context, (String) map.get("validator_y"), 0);
        zq0Var.mo26684O(ps0.m25532b(m25774f, m25774f2));
        try {
            zq0Var.mo26701m().getSettings().setUseWideViewPort(((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21157W6)).booleanValue());
            zq0Var.mo26701m().getSettings().setLoadWithOverviewMode(((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21166X6)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = zzbx.zzb();
        zzb.x = m25774f3;
        zzb.y = m25774f4;
        windowManager.updateViewLayout(zq0Var.mo23737i(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if (!"1".equals(str) && !"2".equals(str)) {
                i11 = rect.top;
            } else {
                i11 = rect.bottom;
            }
            final int i12 = i11 - m25774f4;
            this.f26852c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.ll1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    zq0 zq0Var2 = zq0Var;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = zzb;
                    int i13 = i12;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (view2.getGlobalVisibleRect(rect2) && zq0Var2.mo23737i().getWindowToken() != null) {
                        if (!"1".equals(str2) && !"2".equals(str2)) {
                            layoutParams.y = rect2.top - i13;
                        } else {
                            layoutParams.y = rect2.bottom - i13;
                        }
                        windowManager2.updateViewLayout(zq0Var2.mo23737i(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f26852c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (!TextUtils.isEmpty(str2)) {
            zq0Var.loadUrl(str2);
        }
    }
}
