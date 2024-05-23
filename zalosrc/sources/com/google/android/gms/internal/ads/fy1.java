package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class fy1 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ gy1 f20339a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fy1(gy1 gy1Var) {
        this.f20339a = gy1Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        Pattern pattern;
        m12 m12Var;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21312m5)).booleanValue()) {
            pattern = gy1.f21455h;
            Matcher matcher = pattern.matcher(th2.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                m12Var = this.f20339a.f21460e;
                m12Var.m24443i(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        m12 m12Var;
        m12 m12Var2;
        tq2 tq2Var = (tq2) obj;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21312m5)).booleanValue()) {
            m12Var = this.f20339a.f21460e;
            m12Var.m24443i(tq2Var.f28473b.f27823b.f24017e);
            m12Var2 = this.f20339a.f21460e;
            m12Var2.m24444j(tq2Var.f28473b.f27823b.f24018f);
        }
    }
}
