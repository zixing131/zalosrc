package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ps2 implements os2 {

    /* renamed from: a */
    private final ConcurrentHashMap f26327a;

    /* renamed from: b */
    private final zzffx f26328b;

    /* renamed from: c */
    private final rs2 f26329c = new rs2();

    public ps2(zzffx zzffxVar) {
        this.f26327a = new ConcurrentHashMap(zzffxVar.f32107u);
        this.f26328b = zzffxVar;
    }

    /* renamed from: e */
    private final void m25541e() {
        Parcelable.Creator<zzffx> creator = zzffx.CREATOR;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21402v5)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f26328b.f32105s);
            sb2.append(" PoolCollection");
            sb2.append(this.f26329c.m26160b());
            int i11 = 0;
            for (Map.Entry entry : this.f26327a.entrySet()) {
                i11++;
                sb2.append(i11);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((ys2) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i12 = 0; i12 < ((ns2) entry.getValue()).m24997b(); i12++) {
                    sb2.append("[O]");
                }
                for (int m24997b = ((ns2) entry.getValue()).m24997b(); m24997b < this.f26328b.f32107u; m24997b++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((ns2) entry.getValue()).m25002g());
                sb2.append("\n");
            }
            while (i11 < this.f26328b.f32106t) {
                i11++;
                sb2.append(i11);
                sb2.append(".\n");
            }
            yk0.zze(sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.os2
    /* renamed from: a */
    public final synchronized boolean mo25251a(ys2 ys2Var, ws2 ws2Var) {
        boolean m25003h;
        try {
            ns2 ns2Var = (ns2) this.f26327a.get(ys2Var);
            ws2Var.f30094d = zzt.zzB().mo105913a();
            if (ns2Var == null) {
                zzffx zzffxVar = this.f26328b;
                ns2Var = new ns2(zzffxVar.f32107u, zzffxVar.f32108v * 1000);
                int size = this.f26327a.size();
                zzffx zzffxVar2 = this.f26328b;
                if (size == zzffxVar2.f32106t) {
                    int i11 = zzffxVar2.f32101B;
                    int i12 = i11 - 1;
                    ys2 ys2Var2 = null;
                    if (i11 != 0) {
                        long j11 = Long.MAX_VALUE;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    int i13 = Integer.MAX_VALUE;
                                    for (Map.Entry entry : this.f26327a.entrySet()) {
                                        if (((ns2) entry.getValue()).m24996a() < i13) {
                                            i13 = ((ns2) entry.getValue()).m24996a();
                                            ys2Var2 = (ys2) entry.getKey();
                                        }
                                    }
                                    if (ys2Var2 != null) {
                                        this.f26327a.remove(ys2Var2);
                                    }
                                }
                            } else {
                                for (Map.Entry entry2 : this.f26327a.entrySet()) {
                                    if (((ns2) entry2.getValue()).m24999d() < j11) {
                                        j11 = ((ns2) entry2.getValue()).m24999d();
                                        ys2Var2 = (ys2) entry2.getKey();
                                    }
                                }
                                if (ys2Var2 != null) {
                                    this.f26327a.remove(ys2Var2);
                                }
                            }
                        } else {
                            for (Map.Entry entry3 : this.f26327a.entrySet()) {
                                if (((ns2) entry3.getValue()).m24998c() < j11) {
                                    j11 = ((ns2) entry3.getValue()).m24998c();
                                    ys2Var2 = (ys2) entry3.getKey();
                                }
                            }
                            if (ys2Var2 != null) {
                                this.f26327a.remove(ys2Var2);
                            }
                        }
                        this.f26329c.m26165g();
                    } else {
                        throw null;
                    }
                }
                this.f26327a.put(ys2Var, ns2Var);
                this.f26329c.m26162d();
            }
            m25003h = ns2Var.m25003h(ws2Var);
            this.f26329c.m26161c();
            qs2 m26159a = this.f26329c.m26159a();
            lt2 m25001f = ns2Var.m25001f();
            C4439dt m24028F = C4697kt.m24028F();
            C4366bt m21000F = C4402ct.m21000F();
            m21000F.m20709u(2);
            C4587ht m23740F = C4660jt.m23740F();
            m23740F.m23010q(m26159a.f26949p);
            m23740F.m23011r(m26159a.f26950q);
            m23740F.m23012s(m25001f.f24054q);
            m21000F.m20708s(m23740F);
            m24028F.m21537q(m21000F);
            ws2Var.f30091a.zzb().m19990c().mo21987V((C4697kt) m24028F.m25898n());
            m25541e();
        } catch (Throwable th2) {
            throw th2;
        }
        return m25003h;
    }

    @Override // com.google.android.gms.internal.ads.os2
    /* renamed from: b */
    public final synchronized boolean mo25252b(ys2 ys2Var) {
        ns2 ns2Var = (ns2) this.f26327a.get(ys2Var);
        if (ns2Var == null) {
            return true;
        }
        if (ns2Var.m24997b() < this.f26328b.f32107u) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.os2
    /* renamed from: c */
    public final ys2 mo25253c(zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zs2(zzlVar, str, new qf0(this.f26328b.f32103q).m25700a().f27192k, this.f26328b.f32109w, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.os2
    /* renamed from: d */
    public final synchronized ws2 mo25254d(ys2 ys2Var) {
        ws2 ws2Var;
        try {
            ns2 ns2Var = (ns2) this.f26327a.get(ys2Var);
            if (ns2Var != null) {
                ws2Var = ns2Var.m25000e();
                if (ws2Var == null) {
                    this.f26329c.m26163e();
                }
                lt2 m25001f = ns2Var.m25001f();
                if (ws2Var != null) {
                    C4439dt m24028F = C4697kt.m24028F();
                    C4366bt m21000F = C4402ct.m21000F();
                    m21000F.m20709u(2);
                    C4513ft m22518F = C4550gt.m22518F();
                    m22518F.m22160q(m25001f.f24053p);
                    m22518F.m22161r(m25001f.f24054q);
                    m21000F.m20706q(m22518F);
                    m24028F.m21537q(m21000F);
                    ws2Var.f30091a.zzb().m19990c().mo21988Z((C4697kt) m24028F.m25898n());
                }
                m25541e();
            } else {
                this.f26329c.m26164f();
                m25541e();
                ws2Var = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ws2Var;
    }

    @Override // com.google.android.gms.internal.ads.os2
    public final zzffx zza() {
        return this.f26328b;
    }
}
