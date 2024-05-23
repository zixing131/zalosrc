package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class x22 implements y22 {
    /* renamed from: e */
    private static yx2 m27812e(String str) {
        char c11;
        int hashCode = str.hashCode();
        if (hashCode != -382745961) {
            if (hashCode != 112202875) {
                if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                    c11 = 1;
                }
                c11 = 65535;
            } else {
                if (str.equals("video")) {
                    c11 = 2;
                }
                c11 = 65535;
            }
        } else {
            if (str.equals("htmlDisplay")) {
                c11 = 0;
            }
            c11 = 65535;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 != 2) {
                    return null;
                }
                return yx2.VIDEO;
            }
            return yx2.NATIVE_DISPLAY;
        }
        return yx2.HTML_DISPLAY;
    }

    /* renamed from: f */
    private static ay2 m27813f(String str) {
        char c11;
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    c11 = 2;
                }
                c11 = 65535;
            } else {
                if (str.equals("definedByJavascript")) {
                    c11 = 1;
                }
                c11 = 65535;
            }
        } else {
            if (str.equals("beginToRender")) {
                c11 = 0;
            }
            c11 = 65535;
        }
        if (c11 != 0) {
            if (c11 != 1) {
                if (c11 != 2) {
                    return ay2.UNSPECIFIED;
                }
                return ay2.ONE_PIXEL;
            }
            return ay2.DEFINED_BY_JAVASCRIPT;
        }
        return ay2.BEGIN_TO_RENDER;
    }

    /* renamed from: g */
    private static by2 m27814g(String str) {
        if ("native".equals(str)) {
            return by2.NATIVE;
        }
        if ("javascript".equals(str)) {
            return by2.JAVASCRIPT;
        }
        return by2.NONE;
    }

    @Override // com.google.android.gms.internal.ads.y22
    /* renamed from: a */
    public final InterfaceC4271b mo27815a(String str, WebView webView, String str2, String str3, String str4, b32 b32Var, a32 a32Var, String str5) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21251g4)).booleanValue() || !rx2.m26203b()) {
            return null;
        }
        dy2 m21566a = dy2.m21566a("Google", str);
        by2 m27814g = m27814g("javascript");
        yx2 m27812e = m27812e(a32Var.toString());
        by2 by2Var = by2.NONE;
        if (m27814g == by2Var) {
            yk0.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (m27812e == null) {
            yk0.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(a32Var)));
            return null;
        }
        by2 m27814g2 = m27814g(str4);
        if (m27812e == yx2.VIDEO && m27814g2 == by2Var) {
            yk0.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return BinderC4273d.m19913I3(tx2.m26792a(ux2.m27086a(m27812e, m27813f(b32Var.toString()), m27814g, m27814g2, true), vx2.m27428b(m21566a, webView, str5, "")));
    }

    @Override // com.google.android.gms.internal.ads.y22
    /* renamed from: b */
    public final InterfaceC4271b mo27816b(String str, WebView webView, String str2, String str3, String str4, String str5, b32 b32Var, a32 a32Var, String str6) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21251g4)).booleanValue() || !rx2.m26203b()) {
            return null;
        }
        dy2 m21566a = dy2.m21566a(str5, str);
        by2 m27814g = m27814g("javascript");
        by2 m27814g2 = m27814g(str4);
        yx2 m27812e = m27812e(a32Var.toString());
        by2 by2Var = by2.NONE;
        if (m27814g == by2Var) {
            yk0.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (m27812e == null) {
            yk0.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(a32Var)));
            return null;
        }
        if (m27812e == yx2.VIDEO && m27814g2 == by2Var) {
            yk0.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return BinderC4273d.m19913I3(tx2.m26792a(ux2.m27086a(m27812e, m27813f(b32Var.toString()), m27814g, m27814g2, true), vx2.m27429c(m21566a, webView, str6, "")));
    }

    @Override // com.google.android.gms.internal.ads.y22
    /* renamed from: c */
    public final void mo27817c(InterfaceC4271b interfaceC4271b, View view) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21251g4)).booleanValue() && rx2.m26203b()) {
            Object m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
            if (m19914Q instanceof tx2) {
                ((tx2) m19914Q).mo26795d(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y22
    /* renamed from: d */
    public final boolean mo27818d(Context context) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21251g4)).booleanValue()) {
            yk0.zzj("Omid flag is disabled");
            return false;
        }
        if (rx2.m26203b()) {
            return true;
        }
        rx2.m26202a(context);
        return rx2.m26203b();
    }

    @Override // com.google.android.gms.internal.ads.y22
    public final void zzd(InterfaceC4271b interfaceC4271b) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21251g4)).booleanValue() && rx2.m26203b()) {
            Object m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
            if (m19914Q instanceof tx2) {
                ((tx2) m19914Q).mo26796e();
            }
        }
    }
}
