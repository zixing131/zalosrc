package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class wr1 implements ta1, l91, z71, q81, zza, hd1 {

    /* renamed from: p */
    private final C4808ns f30084p;

    /* renamed from: q */
    private boolean f30085q = false;

    public wr1(C4808ns c4808ns, bo2 bo2Var) {
        this.f30084p = c4808ns;
        c4808ns.m24994c(2);
        if (bo2Var != null) {
            c4808ns.m24994c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.hd1
    /* renamed from: V */
    public final void mo21987V(final C4697kt c4697kt) {
        this.f30084p.m24993b(new InterfaceC4771ms() { // from class: com.google.android.gms.internal.ads.ur1
            @Override // com.google.android.gms.internal.ads.InterfaceC4771ms
            /* renamed from: a */
            public final void mo20788a(C4514fu c4514fu) {
                c4514fu.m22177w(C4697kt.this);
            }
        });
        this.f30084p.m24994c(1102);
    }

    @Override // com.google.android.gms.internal.ads.hd1
    /* renamed from: Z */
    public final void mo21988Z(final C4697kt c4697kt) {
        this.f30084p.m24993b(new InterfaceC4771ms() { // from class: com.google.android.gms.internal.ads.vr1
            @Override // com.google.android.gms.internal.ads.InterfaceC4771ms
            /* renamed from: a */
            public final void mo20788a(C4514fu c4514fu) {
                c4514fu.m22177w(C4697kt.this);
            }
        });
        this.f30084p.m24994c(1103);
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final void mo20715a(zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.f30084p.m24994c(101);
                return;
            case 2:
                this.f30084p.m24994c(102);
                return;
            case 3:
                this.f30084p.m24994c(5);
                return;
            case 4:
                this.f30084p.m24994c(103);
                return;
            case 5:
                this.f30084p.m24994c(104);
                return;
            case 6:
                this.f30084p.m24994c(105);
                return;
            case 7:
                this.f30084p.m24994c(106);
                return;
            default:
                this.f30084p.m24994c(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.hd1
    /* renamed from: a0 */
    public final void mo21989a0(boolean z11) {
        int i11;
        C4808ns c4808ns = this.f30084p;
        if (true != z11) {
            i11 = 1106;
        } else {
            i11 = 1105;
        }
        c4808ns.m24994c(i11);
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: j */
    public final void mo20718j(final tq2 tq2Var) {
        this.f30084p.m24993b(new InterfaceC4771ms() { // from class: com.google.android.gms.internal.ads.sr1
            @Override // com.google.android.gms.internal.ads.InterfaceC4771ms
            /* renamed from: a */
            public final void mo20788a(C4514fu c4514fu) {
                tq2 tq2Var2 = tq2.this;
                C5254zs c5254zs = (C5254zs) c4514fu.m22172q().m26779m();
                C4995st c4995st = (C4995st) c4514fu.m22172q().m20237H().m26779m();
                c4995st.m26399q(tq2Var2.f28473b.f27823b.f24014b);
                c5254zs.m28595r(c4995st);
                c4514fu.m22176v(c5254zs);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: k */
    public final void mo20719k(zzcbc zzcbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (!this.f30085q) {
            this.f30084p.m24994c(7);
            this.f30085q = true;
        } else {
            this.f30084p.m24994c(8);
        }
    }

    @Override // com.google.android.gms.internal.ads.hd1
    /* renamed from: r */
    public final void mo21990r(final C4697kt c4697kt) {
        this.f30084p.m24993b(new InterfaceC4771ms() { // from class: com.google.android.gms.internal.ads.tr1
            @Override // com.google.android.gms.internal.ads.InterfaceC4771ms
            /* renamed from: a */
            public final void mo20788a(C4514fu c4514fu) {
                c4514fu.m22177w(C4697kt.this);
            }
        });
        this.f30084p.m24994c(1104);
    }

    @Override // com.google.android.gms.internal.ads.hd1
    public final void zzd() {
        this.f30084p.m24994c(1109);
    }

    @Override // com.google.android.gms.internal.ads.hd1
    public final void zzh(boolean z11) {
        int i11;
        C4808ns c4808ns = this.f30084p;
        if (true != z11) {
            i11 = 1108;
        } else {
            i11 = 1107;
        }
        c4808ns.m24994c(i11);
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final synchronized void zzl() {
        this.f30084p.m24994c(6);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void zzn() {
        this.f30084p.m24994c(3);
    }
}
