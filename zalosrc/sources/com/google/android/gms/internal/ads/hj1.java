package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class hj1 extends g00 {

    /* renamed from: p */
    private final vj1 f21787p;

    /* renamed from: q */
    private InterfaceC4271b f21788q;

    public hj1(vj1 vj1Var) {
        this.f21787p = vj1Var;
    }

    /* renamed from: N */
    private static float m22923N(InterfaceC4271b interfaceC4271b) {
        Drawable drawable;
        if (interfaceC4271b == null || (drawable = (Drawable) BinderC4273d.m19914Q(interfaceC4271b)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.h00
    /* renamed from: k2 */
    public final void mo22655k2(t10 t10Var) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21352q5)).booleanValue() && (this.f21787p.m27249R() instanceof wr0)) {
            ((wr0) this.f21787p.m27249R()).m27702Y4(t10Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final float zze() {
        float f11;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21342p5)).booleanValue()) {
            return 0.0f;
        }
        if (this.f21787p.m27241J() != 0.0f) {
            return this.f21787p.m27241J();
        }
        if (this.f21787p.m27249R() != null) {
            try {
                return this.f21787p.m27249R().zze();
            } catch (RemoteException e11) {
                yk0.zzh("Remote exception getting video controller aspect ratio.", e11);
                return 0.0f;
            }
        }
        InterfaceC4271b interfaceC4271b = this.f21788q;
        if (interfaceC4271b != null) {
            return m22923N(interfaceC4271b);
        }
        k00 m27252U = this.f21787p.m27252U();
        if (m27252U == null) {
            return 0.0f;
        }
        if (m27252U.zzd() != -1 && m27252U.zzc() != -1) {
            f11 = m27252U.zzd() / m27252U.zzc();
        } else {
            f11 = 0.0f;
        }
        if (f11 == 0.0f) {
            return m22923N(m27252U.zzf());
        }
        return f11;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final float zzf() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21352q5)).booleanValue() || this.f21787p.m27249R() == null) {
            return 0.0f;
        }
        return this.f21787p.m27249R().zzf();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final float zzg() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21352q5)).booleanValue() || this.f21787p.m27249R() == null) {
            return 0.0f;
        }
        return this.f21787p.m27249R().zzg();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21352q5)).booleanValue()) {
            return null;
        }
        return this.f21787p.m27249R();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final InterfaceC4271b zzi() {
        InterfaceC4271b interfaceC4271b = this.f21788q;
        if (interfaceC4271b != null) {
            return interfaceC4271b;
        }
        k00 m27252U = this.f21787p.m27252U();
        if (m27252U == null) {
            return null;
        }
        return m27252U.zzf();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void zzj(InterfaceC4271b interfaceC4271b) {
        this.f21788q = interfaceC4271b;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final boolean zzk() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21352q5)).booleanValue() || this.f21787p.m27249R() == null) {
            return false;
        }
        return true;
    }
}
