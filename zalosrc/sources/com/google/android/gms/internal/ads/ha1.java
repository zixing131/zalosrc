package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ha1 extends kd1 implements q81, w91 {

    /* renamed from: q */
    private final iq2 f21593q;

    /* renamed from: r */
    private final AtomicBoolean f21594r;

    public ha1(Set set, iq2 iq2Var) {
        super(set);
        this.f21594r = new AtomicBoolean();
        this.f21593q = iq2Var;
    }

    private final void zzb() {
        zzs zzsVar;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21018I6)).booleanValue() && this.f21594r.compareAndSet(false, true) && (zzsVar = this.f21593q.f22326g0) != null && zzsVar.zza == 3) {
            m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.ga1
                @Override // com.google.android.gms.internal.ads.jd1
                public final void zza(Object obj) {
                    ha1.this.m22768B0((ja1) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public final /* synthetic */ void m22768B0(ja1 ja1Var) {
        ja1Var.mo22410c(this.f21593q.f22326g0);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void zzh() {
        if (this.f21593q.f22315b == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final void zzl() {
        int i11 = this.f21593q.f22315b;
        if (i11 != 2 && i11 != 5 && i11 != 4 && i11 != 6 && i11 != 7) {
            return;
        }
        zzb();
    }
}
