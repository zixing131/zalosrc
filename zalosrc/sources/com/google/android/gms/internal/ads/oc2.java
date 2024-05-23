package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class oc2 implements sh2 {

    /* renamed from: a */
    private final uc3 f25592a;

    /* renamed from: b */
    private final wq1 f25593b;

    /* renamed from: c */
    private final hv1 f25594c;

    /* renamed from: d */
    private final rc2 f25595d;

    public oc2(uc3 uc3Var, wq1 wq1Var, hv1 hv1Var, rc2 rc2Var) {
        this.f25592a = uc3Var;
        this.f25593b = wq1Var;
        this.f25594c = hv1Var;
        this.f25595d = rc2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ qc2 m25153a() {
        List<String> asList = Arrays.asList(((String) zzay.zzc().m21823b(AbstractC4554gx.f21288k1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                yr2 m27690c = this.f25593b.m27690c(str, new JSONObject());
                m27690c.m28304a();
                Bundle bundle2 = new Bundle();
                try {
                    zzbxq m28312i = m27690c.m28312i();
                    if (m28312i != null) {
                        bundle2.putString("sdk_version", m28312i.toString());
                    }
                } catch (zzfek unused) {
                }
                try {
                    zzbxq m28311h = m27690c.m28311h();
                    if (m28311h != null) {
                        bundle2.putString("adapter_version", m28311h.toString());
                    }
                } catch (zzfek unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfek unused3) {
            }
        }
        return new qc2(bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        if (!z53.m28438d((String) zzay.zzc().m21823b(AbstractC4554gx.f21288k1)) && !this.f25595d.m26066b() && this.f25594c.m23053t()) {
            this.f25595d.m26065a(true);
            return this.f25592a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.nc2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return oc2.this.m25153a();
                }
            });
        }
        return kc3.m23877i(new qc2(new Bundle(), null));
    }
}
