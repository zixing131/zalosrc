package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C5719ze;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
/* loaded from: classes2.dex */
final class RunnableC6107q6 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ boolean f34377p;

    /* renamed from: q */
    final /* synthetic */ Uri f34378q;

    /* renamed from: r */
    final /* synthetic */ String f34379r;

    /* renamed from: s */
    final /* synthetic */ String f34380s;

    /* renamed from: t */
    final /* synthetic */ C6118r6 f34381t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6107q6(C6118r6 c6118r6, boolean z11, Uri uri, String str, String str2) {
        this.f34381t = c6118r6;
        this.f34377p = z11;
        this.f34378q = uri;
        this.f34379r = str;
        this.f34380s = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100 A[Catch: RuntimeException -> 0x007c, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x007c, blocks: (B:3:0x0011, B:9:0x00a6, B:11:0x00c4, B:14:0x00d1, B:16:0x00d7, B:17:0x00ec, B:18:0x00f8, B:23:0x0100, B:27:0x0128, B:28:0x0146, B:30:0x0135, B:31:0x014e, B:33:0x0154, B:35:0x015a, B:37:0x0160, B:39:0x0166, B:41:0x016e, B:43:0x0176, B:45:0x017c, B:48:0x0183, B:50:0x003f, B:52:0x0045, B:54:0x004b, B:56:0x0051, B:58:0x0057, B:60:0x005f, B:62:0x0067, B:65:0x0071, B:69:0x007f, B:70:0x008d, B:72:0x009d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6 A[Catch: RuntimeException -> 0x007c, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x007c, blocks: (B:3:0x0011, B:9:0x00a6, B:11:0x00c4, B:14:0x00d1, B:16:0x00d7, B:17:0x00ec, B:18:0x00f8, B:23:0x0100, B:27:0x0128, B:28:0x0146, B:30:0x0135, B:31:0x014e, B:33:0x0154, B:35:0x015a, B:37:0x0160, B:39:0x0166, B:41:0x016e, B:43:0x0176, B:45:0x017c, B:48:0x0183, B:50:0x003f, B:52:0x0045, B:54:0x004b, B:56:0x0051, B:58:0x0057, B:60:0x005f, B:62:0x0067, B:65:0x0071, B:69:0x007f, B:70:0x008d, B:72:0x009d), top: B:2:0x0011 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bundle m31356v0;
        C6118r6 c6118r6 = this.f34381t;
        boolean z11 = this.f34377p;
        Uri uri = this.f34378q;
        String str = this.f34379r;
        String str2 = this.f34380s;
        c6118r6.f34401p.mo31036g();
        try {
            C6121r9 m31381N = c6118r6.f34401p.f34158a.m31381N();
            C5719ze.m30110b();
            C5990g m31401z = c6118r6.f34401p.f34158a.m31401z();
            C5961d3 c5961d3 = AbstractC5972e3.f33954x0;
            boolean m30913B = m31401z.m30913B(null, c5961d3);
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.contains("gclid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid")) {
                    if (m30913B && str2.contains("sfmc_id")) {
                        m30913B = true;
                    }
                    m31381N.f34158a.mo31033c().m31196p().m31108a("Activity created with data 'referrer' without required params");
                }
                m31356v0 = m31381N.m31356v0(Uri.parse("https://google.com/search?".concat(str2)), m30913B);
                if (m31356v0 != null) {
                    m31356v0.putString("_cis", "referrer");
                }
                if (z11) {
                    C6121r9 m31381N2 = c6118r6.f34401p.f34158a.m31381N();
                    C5719ze.m30110b();
                    Bundle m31356v02 = m31381N2.m31356v0(uri, c6118r6.f34401p.f34158a.m31401z().m30913B(null, c5961d3));
                    if (m31356v02 != null) {
                        m31356v02.putString("_cis", "intent");
                        if (!m31356v02.containsKey("gclid") && m31356v0 != null && m31356v0.containsKey("gclid")) {
                            m31356v02.putString("_cer", String.format("gclid=%s", m31356v0.getString("gclid")));
                        }
                        c6118r6.f34401p.m31440t(str, "_cmp", m31356v02);
                        c6118r6.f34401p.f34467n.m31492a(str, m31356v02);
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    c6118r6.f34401p.f34158a.mo31033c().m31196p().m31109b("Activity created with referrer", str2);
                    if (c6118r6.f34401p.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33912c0)) {
                        if (m31356v0 != null) {
                            c6118r6.f34401p.m31440t(str, "_cmp", m31356v0);
                            c6118r6.f34401p.f34467n.m31492a(str, m31356v0);
                        } else {
                            c6118r6.f34401p.f34158a.mo31033c().m31196p().m31109b("Referrer does not contain valid parameters", str2);
                        }
                        c6118r6.f34401p.m31418K("auto", "_ldl", null, true);
                        return;
                    }
                    if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content"))) {
                        if (!TextUtils.isEmpty(str2)) {
                            c6118r6.f34401p.m31418K("auto", "_ldl", str2, true);
                            return;
                        }
                        return;
                    }
                    c6118r6.f34401p.f34158a.mo31033c().m31196p().m31108a("Activity created with data 'referrer' without required params");
                    return;
                }
                return;
            }
            m31356v0 = null;
            if (z11) {
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e11) {
            c6118r6.f34401p.f34158a.mo31033c().m31197q().m31109b("Throwable caught in handleReferrerForOnActivityCreated", e11);
        }
    }
}
