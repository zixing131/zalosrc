package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import p229i5.InterfaceC20285f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o62 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ long f25448a;

    /* renamed from: b */
    final /* synthetic */ String f25449b;

    /* renamed from: c */
    final /* synthetic */ iq2 f25450c;

    /* renamed from: d */
    final /* synthetic */ lq2 f25451d;

    /* renamed from: e */
    final /* synthetic */ kx2 f25452e;

    /* renamed from: f */
    final /* synthetic */ tq2 f25453f;

    /* renamed from: g */
    final /* synthetic */ p62 f25454g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o62(p62 p62Var, long j11, String str, iq2 iq2Var, lq2 lq2Var, kx2 kx2Var, tq2 tq2Var) {
        this.f25454g = p62Var;
        this.f25448a = j11;
        this.f25449b = str;
        this.f25450c = iq2Var;
        this.f25451d = lq2Var;
        this.f25452e = kx2Var;
        this.f25453f = tq2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0078  */
    @Override // com.google.android.gms.internal.ads.gc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th2) {
        InterfaceC20285f interfaceC20285f;
        Integer num;
        int i11;
        zze m28811b;
        boolean z11;
        zze m20996a;
        int i12;
        zze zzeVar;
        g32 g32Var;
        ox2 ox2Var;
        q62 q62Var;
        zzehg zzehgVar;
        interfaceC20285f = this.f25454g.f26086a;
        long mo105914b = interfaceC20285f.mo105914b() - this.f25448a;
        if (th2 instanceof TimeoutException) {
            i11 = 2;
        } else {
            if (th2 instanceof zzekd) {
                num = null;
                i11 = 3;
            } else if (th2 instanceof CancellationException) {
                i11 = 4;
            } else if (th2 instanceof zzfek) {
                i11 = 5;
            } else {
                int i13 = 6;
                if (th2 instanceof zzebh) {
                    if (cs2.m20996a(th2).zza == 3) {
                        i13 = 1;
                    }
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21388u1)).booleanValue() && (th2 instanceof zzehg) && (m28811b = ((zzehg) th2).m28811b()) != null) {
                        num = Integer.valueOf(m28811b.zza);
                        i11 = i13;
                    } else {
                        i11 = i13;
                    }
                } else {
                    num = null;
                    i11 = 6;
                }
            }
            p62.m25408g(this.f25454g, this.f25449b, i11, mo105914b, this.f25450c.f22328h0, num);
            p62 p62Var = this.f25454g;
            z11 = p62Var.f26090e;
            if (z11) {
                q62Var = p62Var.f26087b;
                lq2 lq2Var = this.f25451d;
                iq2 iq2Var = this.f25450c;
                if (th2 instanceof zzehg) {
                    zzehgVar = (zzehg) th2;
                } else {
                    zzehgVar = null;
                }
                q62Var.m25667a(lq2Var, iq2Var, i11, zzehgVar, mo105914b);
            }
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21274i7)).booleanValue()) {
                ox2Var = this.f25454g.f26088c;
                kx2 kx2Var = this.f25452e;
                tq2 tq2Var = this.f25453f;
                iq2 iq2Var2 = this.f25450c;
                ox2Var.m25356d(kx2Var.m24080c(tq2Var, iq2Var2, iq2Var2.f22341o));
            }
            m20996a = cs2.m20996a(th2);
            i12 = m20996a.zza;
            if ((i12 != 3 || i12 == 0) && (zzeVar = m20996a.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                m20996a = cs2.m20996a(new zzehg(13, m20996a.zzd));
            }
            g32Var = this.f25454g.f26091f;
            g32Var.m22272e(this.f25450c, mo105914b, m20996a);
        }
        num = null;
        p62.m25408g(this.f25454g, this.f25449b, i11, mo105914b, this.f25450c.f22328h0, num);
        p62 p62Var2 = this.f25454g;
        z11 = p62Var2.f26090e;
        if (z11) {
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21274i7)).booleanValue()) {
        }
        m20996a = cs2.m20996a(th2);
        i12 = m20996a.zza;
        if (i12 != 3) {
        }
        m20996a = cs2.m20996a(new zzehg(13, m20996a.zzd));
        g32Var = this.f25454g.f26091f;
        g32Var.m22272e(this.f25450c, mo105914b, m20996a);
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zzb(Object obj) {
        InterfaceC20285f interfaceC20285f;
        boolean z11;
        g32 g32Var;
        q62 q62Var;
        interfaceC20285f = this.f25454g.f26086a;
        long mo105914b = interfaceC20285f.mo105914b() - this.f25448a;
        p62.m25408g(this.f25454g, this.f25449b, 0, mo105914b, this.f25450c.f22328h0, null);
        p62 p62Var = this.f25454g;
        z11 = p62Var.f26090e;
        if (z11) {
            q62Var = p62Var.f26087b;
            q62Var.m25667a(this.f25451d, this.f25450c, 0, null, mo105914b);
        }
        g32Var = this.f25454g.f26091f;
        g32Var.m22273f(this.f25450c, mo105914b, null);
    }
}
