package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
final class uf4 implements ef4, df4 {

    /* renamed from: p */
    private final ef4[] f28848p;

    /* renamed from: t */
    private df4 f28852t;

    /* renamed from: u */
    private dh4 f28853u;

    /* renamed from: x */
    private final qe4 f28856x;

    /* renamed from: r */
    private final ArrayList f28850r = new ArrayList();

    /* renamed from: s */
    private final HashMap f28851s = new HashMap();

    /* renamed from: w */
    private yg4 f28855w = new pe4(new yg4[0]);

    /* renamed from: q */
    private final IdentityHashMap f28849q = new IdentityHashMap();

    /* renamed from: v */
    private ef4[] f28854v = new ef4[0];

    public uf4(qe4 qe4Var, long[] jArr, ef4[] ef4VarArr, byte... bArr) {
        this.f28856x = qe4Var;
        this.f28848p = ef4VarArr;
        for (int i11 = 0; i11 < ef4VarArr.length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                this.f28848p[i11] = new sf4(ef4VarArr[i11], j11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: a */
    public final boolean mo21704a(long j11) {
        if (!this.f28850r.isEmpty()) {
            int size = this.f28850r.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((ef4) this.f28850r.get(i11)).mo21704a(j11);
            }
            return false;
        }
        return this.f28855w.mo21704a(j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: b */
    public final long mo21705b(ui4[] ui4VarArr, boolean[] zArr, vg4[] vg4VarArr, boolean[] zArr2, long j11) {
        int length;
        vg4 vg4Var;
        vg4 vg4Var2;
        int intValue;
        int length2 = ui4VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i11 = 0;
        while (true) {
            length = ui4VarArr.length;
            vg4Var = null;
            Integer num = null;
            if (i11 >= length) {
                break;
            }
            vg4 vg4Var3 = vg4VarArr[i11];
            if (vg4Var3 != null) {
                num = (Integer) this.f28849q.get(vg4Var3);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i11] = intValue;
            iArr2[i11] = -1;
            ui4 ui4Var = ui4VarArr[i11];
            if (ui4Var != null) {
                jt0 jt0Var = (jt0) this.f28851s.get(ui4Var.zze());
                jt0Var.getClass();
                int i12 = 0;
                while (true) {
                    ef4[] ef4VarArr = this.f28848p;
                    if (i12 >= ef4VarArr.length) {
                        break;
                    }
                    if (ef4VarArr[i12].zzh().m21392a(jt0Var) != -1) {
                        iArr2[i11] = i12;
                        break;
                    }
                    i12++;
                }
            }
            i11++;
        }
        this.f28849q.clear();
        vg4[] vg4VarArr2 = new vg4[length];
        vg4[] vg4VarArr3 = new vg4[length];
        ArrayList arrayList = new ArrayList(this.f28848p.length);
        long j12 = j11;
        int i13 = 0;
        ui4[] ui4VarArr2 = new ui4[length];
        while (i13 < this.f28848p.length) {
            for (int i14 = 0; i14 < ui4VarArr.length; i14++) {
                if (iArr[i14] == i13) {
                    vg4Var2 = vg4VarArr[i14];
                } else {
                    vg4Var2 = vg4Var;
                }
                vg4VarArr3[i14] = vg4Var2;
                if (iArr2[i14] == i13) {
                    ui4 ui4Var2 = ui4VarArr[i14];
                    ui4Var2.getClass();
                    jt0 jt0Var2 = (jt0) this.f28851s.get(ui4Var2.zze());
                    jt0Var2.getClass();
                    ui4VarArr2[i14] = new rf4(ui4Var2, jt0Var2);
                } else {
                    ui4VarArr2[i14] = vg4Var;
                }
            }
            int i15 = i13;
            ArrayList arrayList2 = arrayList;
            vg4[] vg4VarArr4 = vg4VarArr3;
            ui4[] ui4VarArr3 = ui4VarArr2;
            long mo21705b = this.f28848p[i13].mo21705b(ui4VarArr2, zArr, vg4VarArr3, zArr2, j12);
            if (i15 == 0) {
                j12 = mo21705b;
            } else if (mo21705b != j12) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < ui4VarArr.length; i16++) {
                boolean z12 = true;
                if (iArr2[i16] == i15) {
                    vg4 vg4Var4 = vg4VarArr4[i16];
                    vg4Var4.getClass();
                    vg4VarArr2[i16] = vg4Var4;
                    this.f28849q.put(vg4Var4, Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr[i16] == i15) {
                    if (vg4VarArr4[i16] != null) {
                        z12 = false;
                    }
                    v71.m27175f(z12);
                }
            }
            if (z11) {
                arrayList2.add(this.f28848p[i15]);
            }
            i13 = i15 + 1;
            arrayList = arrayList2;
            vg4VarArr3 = vg4VarArr4;
            ui4VarArr2 = ui4VarArr3;
            vg4Var = null;
        }
        System.arraycopy(vg4VarArr2, 0, vg4VarArr, 0, length);
        ef4[] ef4VarArr2 = (ef4[]) arrayList.toArray(new ef4[0]);
        this.f28854v = ef4VarArr2;
        this.f28855w = new pe4(ef4VarArr2);
        return j12;
    }

    @Override // com.google.android.gms.internal.ads.xg4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo21937c(yg4 yg4Var) {
        df4 df4Var = this.f28852t;
        df4Var.getClass();
        df4Var.mo21937c(this);
    }

    @Override // com.google.android.gms.internal.ads.df4
    /* renamed from: d */
    public final void mo21382d(ef4 ef4Var) {
        this.f28850r.remove(ef4Var);
        if (!this.f28850r.isEmpty()) {
            return;
        }
        int i11 = 0;
        for (ef4 ef4Var2 : this.f28848p) {
            i11 += ef4Var2.zzh().f19251a;
        }
        jt0[] jt0VarArr = new jt0[i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ef4[] ef4VarArr = this.f28848p;
            if (i12 < ef4VarArr.length) {
                dh4 zzh = ef4VarArr[i12].zzh();
                int i14 = zzh.f19251a;
                int i15 = 0;
                while (i15 < i14) {
                    jt0 m21393b = zzh.m21393b(i15);
                    jt0 m23748c = m21393b.m23748c(i12 + ":" + m21393b.f22987b);
                    this.f28851s.put(m23748c, m21393b);
                    jt0VarArr[i13] = m23748c;
                    i15++;
                    i13++;
                }
                i12++;
            } else {
                this.f28853u = new dh4(jt0VarArr);
                df4 df4Var = this.f28852t;
                df4Var.getClass();
                df4Var.mo21382d(this);
                return;
            }
        }
    }

    /* renamed from: e */
    public final ef4 m26922e(int i11) {
        ef4 ef4Var;
        ef4 ef4Var2 = this.f28848p[i11];
        if (ef4Var2 instanceof sf4) {
            ef4Var = ((sf4) ef4Var2).f27665p;
            return ef4Var;
        }
        return ef4Var2;
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    /* renamed from: g */
    public final void mo21706g(long j11) {
        this.f28855w.mo21706g(j11);
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: j */
    public final long mo21707j(long j11) {
        long mo21707j = this.f28854v[0].mo21707j(j11);
        int i11 = 1;
        while (true) {
            ef4[] ef4VarArr = this.f28854v;
            if (i11 < ef4VarArr.length) {
                if (ef4VarArr[i11].mo21707j(mo21707j) == mo21707j) {
                    i11++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return mo21707j;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: k */
    public final long mo21708k(long j11, f44 f44Var) {
        ef4 ef4Var;
        ef4[] ef4VarArr = this.f28854v;
        if (ef4VarArr.length > 0) {
            ef4Var = ef4VarArr[0];
        } else {
            ef4Var = this.f28848p[0];
        }
        return ef4Var.mo21708k(j11, f44Var);
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: l */
    public final void mo21709l(long j11, boolean z11) {
        for (ef4 ef4Var : this.f28854v) {
            ef4Var.mo21709l(j11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ef4
    /* renamed from: n */
    public final void mo21710n(df4 df4Var, long j11) {
        this.f28852t = df4Var;
        Collections.addAll(this.f28850r, this.f28848p);
        for (ef4 ef4Var : this.f28848p) {
            ef4Var.mo21710n(this, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzb() {
        return this.f28855w.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final long zzc() {
        return this.f28855w.zzc();
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final long zzd() {
        long j11 = -9223372036854775807L;
        for (ef4 ef4Var : this.f28854v) {
            long zzd = ef4Var.zzd();
            if (zzd != -9223372036854775807L) {
                if (j11 == -9223372036854775807L) {
                    for (ef4 ef4Var2 : this.f28854v) {
                        if (ef4Var2 == ef4Var) {
                            break;
                        }
                        if (ef4Var2.mo21707j(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j11 = zzd;
                } else if (zzd != j11) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j11 != -9223372036854775807L && ef4Var.mo21707j(j11) != j11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final dh4 zzh() {
        dh4 dh4Var = this.f28853u;
        dh4Var.getClass();
        return dh4Var;
    }

    @Override // com.google.android.gms.internal.ads.ef4
    public final void zzk() {
        for (ef4 ef4Var : this.f28848p) {
            ef4Var.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.ef4, com.google.android.gms.internal.ads.yg4
    public final boolean zzp() {
        return this.f28855w.zzp();
    }
}
