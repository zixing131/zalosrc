package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class cs0 extends ir0 {
    public cs0(zq0 zq0Var, C4808ns c4808ns, boolean z11) {
        super(zq0Var, c4808ns, z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G0 */
    public final WebResourceResponse m20994G0(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zq0)) {
            yk0.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zq0 zq0Var = (zq0) webView;
        yh0 yh0Var = this.f22365J;
        if (yh0Var != null) {
            yh0Var.mo26962a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.m23365Y(str, map);
        }
        if (zq0Var.zzP() != null) {
            zq0Var.zzP().zzD();
        }
        if (zq0Var.mo22517p().m25539i()) {
            str2 = (String) zzay.zzc().m21823b(AbstractC4554gx.f21051M);
        } else if (zq0Var.mo26680M()) {
            str2 = (String) zzay.zzc().m21823b(AbstractC4554gx.f21041L);
        } else {
            str2 = (String) zzay.zzc().m21823b(AbstractC4554gx.f21031K);
        }
        zzt.zzp();
        return zzs.zzu(zq0Var.getContext(), zq0Var.zzp().f32030p, str2);
    }
}
