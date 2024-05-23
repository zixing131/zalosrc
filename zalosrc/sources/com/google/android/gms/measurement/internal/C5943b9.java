package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C5346df;
import com.google.android.gms.internal.measurement.C5674x3;
import java.util.HashMap;

/* renamed from: com.google.android.gms.measurement.internal.b9 */
/* loaded from: classes.dex */
public final class C5943b9 extends AbstractC6197y8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5943b9(C6055l9 c6055l9) {
        super(c6055l9);
    }

    /* renamed from: i */
    private final String m30805i(String str) {
        String m31137w = this.f34628b.m31078a0().m31137w(str);
        if (!TextUtils.isEmpty(m31137w)) {
            Uri parse = Uri.parse((String) AbstractC5972e3.f33943s.m30827a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(m31137w + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) AbstractC5972e3.f33943s.m30827a(null);
    }

    /* renamed from: h */
    public final C5931a9 m30806h(String str) {
        String str2;
        C5346df.m29069b();
        C5931a9 c5931a9 = null;
        if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33944s0)) {
            this.f34158a.mo31033c().m31201u().m31108a("sgtm feature flag enabled.");
            C6084o5 m30990R = this.f34628b.m31074W().m30990R(str);
            if (m30990R == null) {
                return new C5931a9(m30805i(str));
            }
            if (m30990R.m31219O()) {
                this.f34158a.mo31033c().m31201u().m31108a("sgtm upload enabled in manifest.");
                C5674x3 m31134s = this.f34628b.m31078a0().m31134s(m30990R.m31248i0());
                if (m31134s != null) {
                    String m30002J = m31134s.m30002J();
                    if (!TextUtils.isEmpty(m30002J)) {
                        String m30001I = m31134s.m30001I();
                        C6060m3 m31201u = this.f34158a.mo31033c().m31201u();
                        if (true != TextUtils.isEmpty(m30001I)) {
                            str2 = "N";
                        } else {
                            str2 = "Y";
                        }
                        m31201u.m31110c("sgtm configured with upload_url, server_info", m30002J, str2);
                        if (TextUtils.isEmpty(m30001I)) {
                            this.f34158a.mo31035f();
                            c5931a9 = new C5931a9(m30002J);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", m30001I);
                            c5931a9 = new C5931a9(m30002J, hashMap);
                        }
                    }
                }
            }
            if (c5931a9 != null) {
                return c5931a9;
            }
        }
        return new C5931a9(m30805i(str));
    }
}
