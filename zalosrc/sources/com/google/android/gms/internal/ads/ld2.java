package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class ld2 implements sh2 {

    /* renamed from: h */
    private static final Object f23855h = new Object();

    /* renamed from: a */
    private final String f23856a;

    /* renamed from: b */
    private final String f23857b;

    /* renamed from: c */
    private final k51 f23858c;

    /* renamed from: d */
    private final is2 f23859d;

    /* renamed from: e */
    private final dr2 f23860e;

    /* renamed from: f */
    private final zzg f23861f = zzt.zzo().m22936h();

    /* renamed from: g */
    private final ys1 f23862g;

    public ld2(String str, String str2, k51 k51Var, is2 is2Var, dr2 dr2Var, ys1 ys1Var) {
        this.f23856a = str;
        this.f23857b = str2;
        this.f23858c = k51Var;
        this.f23859d = is2Var;
        this.f23860e = dr2Var;
        this.f23862g = ys1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m24229a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21006H4)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20996G4)).booleanValue()) {
                synchronized (f23855h) {
                    this.f23858c.m23842c(this.f23860e.f19398d);
                    bundle2.putBundle("quality_signals", this.f23859d.m23385b());
                }
            } else {
                this.f23858c.m23842c(this.f23860e.f19398d);
                bundle2.putBundle("quality_signals", this.f23859d.m23385b());
            }
        }
        bundle2.putString("seq_num", this.f23856a);
        if (!this.f23861f.zzP()) {
            bundle2.putString("session_id", this.f23857b);
        }
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20968D6)).booleanValue()) {
            this.f23862g.m28337a().put("seq_num", this.f23856a);
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21006H4)).booleanValue()) {
            this.f23858c.m23842c(this.f23860e.f19398d);
            bundle.putAll(this.f23859d.m23385b());
        }
        return kc3.m23877i(new rh2() { // from class: com.google.android.gms.internal.ads.jd2
            @Override // com.google.android.gms.internal.ads.rh2
            /* renamed from: a */
            public final void mo20086a(Object obj) {
                ld2.this.m24229a(bundle, (Bundle) obj);
            }
        });
    }
}
