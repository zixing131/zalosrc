package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.jm */
/* loaded from: classes2.dex */
final class C4653jm implements InterfaceC4543gm, InterfaceC4506fm {

    /* renamed from: p */
    public final InterfaceC4543gm[] f22873p;

    /* renamed from: q */
    private final IdentityHashMap f22874q = new IdentityHashMap();

    /* renamed from: r */
    private InterfaceC4506fm f22875r;

    /* renamed from: s */
    private int f22876s;

    /* renamed from: t */
    private C5137wm f22877t;

    /* renamed from: u */
    private InterfaceC4543gm[] f22878u;

    /* renamed from: v */
    private InterfaceC5025tm f22879v;

    public C4653jm(InterfaceC4543gm... interfaceC4543gmArr) {
        this.f22873p = interfaceC4543gmArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm, com.google.android.gms.internal.ads.InterfaceC5025tm
    /* renamed from: a */
    public final boolean mo20586a(long j11) {
        return this.f22879v.mo20586a(j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    /* renamed from: c */
    public final long mo20588c(AbstractC5248zm[] abstractC5248zmArr, boolean[] zArr, InterfaceC4951rm[] interfaceC4951rmArr, boolean[] zArr2, long j11) {
        int length;
        boolean z11;
        InterfaceC4951rm interfaceC4951rm;
        int intValue;
        InterfaceC4951rm[] interfaceC4951rmArr2 = interfaceC4951rmArr;
        int length2 = abstractC5248zmArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i11 = 0;
        while (true) {
            length = abstractC5248zmArr.length;
            if (i11 >= length) {
                break;
            }
            InterfaceC4951rm interfaceC4951rm2 = interfaceC4951rmArr2[i11];
            if (interfaceC4951rm2 == null) {
                intValue = -1;
            } else {
                intValue = ((Integer) this.f22874q.get(interfaceC4951rm2)).intValue();
            }
            iArr[i11] = intValue;
            iArr2[i11] = -1;
            AbstractC5248zm abstractC5248zm = abstractC5248zmArr[i11];
            if (abstractC5248zm != null) {
                C5099vm m28546d = abstractC5248zm.m28546d();
                int i12 = 0;
                while (true) {
                    InterfaceC4543gm[] interfaceC4543gmArr = this.f22873p;
                    if (i12 >= interfaceC4543gmArr.length) {
                        break;
                    }
                    if (interfaceC4543gmArr[i12].zzn().m27654a(m28546d) != -1) {
                        iArr2[i11] = i12;
                        break;
                    }
                    i12++;
                }
            }
            i11++;
        }
        this.f22874q.clear();
        InterfaceC4951rm[] interfaceC4951rmArr3 = new InterfaceC4951rm[length];
        InterfaceC4951rm[] interfaceC4951rmArr4 = new InterfaceC4951rm[length];
        AbstractC5248zm[] abstractC5248zmArr2 = new AbstractC5248zm[length];
        ArrayList arrayList = new ArrayList(this.f22873p.length);
        long j12 = j11;
        int i13 = 0;
        while (i13 < this.f22873p.length) {
            for (int i14 = 0; i14 < abstractC5248zmArr.length; i14++) {
                AbstractC5248zm abstractC5248zm2 = null;
                if (iArr[i14] == i13) {
                    interfaceC4951rm = interfaceC4951rmArr2[i14];
                } else {
                    interfaceC4951rm = null;
                }
                interfaceC4951rmArr4[i14] = interfaceC4951rm;
                if (iArr2[i14] == i13) {
                    abstractC5248zm2 = abstractC5248zmArr[i14];
                }
                abstractC5248zmArr2[i14] = abstractC5248zm2;
            }
            int i15 = i13;
            AbstractC5248zm[] abstractC5248zmArr3 = abstractC5248zmArr2;
            ArrayList arrayList2 = arrayList;
            long mo20588c = this.f22873p[i13].mo20588c(abstractC5248zmArr2, zArr, interfaceC4951rmArr4, zArr2, j12);
            if (i15 == 0) {
                j12 = mo20588c;
            } else if (mo20588c != j12) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z12 = false;
            for (int i16 = 0; i16 < abstractC5248zmArr.length; i16++) {
                boolean z13 = true;
                if (iArr2[i16] == i15) {
                    if (interfaceC4951rmArr4[i16] != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC4361bo.m20613e(z11);
                    InterfaceC4951rm interfaceC4951rm3 = interfaceC4951rmArr4[i16];
                    interfaceC4951rmArr3[i16] = interfaceC4951rm3;
                    this.f22874q.put(interfaceC4951rm3, Integer.valueOf(i15));
                    z12 = true;
                } else if (iArr[i16] == i15) {
                    if (interfaceC4951rmArr4[i16] != null) {
                        z13 = false;
                    }
                    AbstractC4361bo.m20613e(z13);
                }
            }
            if (z12) {
                arrayList2.add(this.f22873p[i15]);
            }
            i13 = i15 + 1;
            arrayList = arrayList2;
            abstractC5248zmArr2 = abstractC5248zmArr3;
            interfaceC4951rmArr2 = interfaceC4951rmArr;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC4951rmArr3, 0, interfaceC4951rmArr2, 0, length);
        InterfaceC4543gm[] interfaceC4543gmArr2 = new InterfaceC4543gm[arrayList3.size()];
        this.f22878u = interfaceC4543gmArr2;
        arrayList3.toArray(interfaceC4543gmArr2);
        this.f22879v = new C5024tl(this.f22878u);
        return j12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    /* renamed from: d */
    public final void mo20589d(InterfaceC4506fm interfaceC4506fm, long j11) {
        this.f22875r = interfaceC4506fm;
        InterfaceC4543gm[] interfaceC4543gmArr = this.f22873p;
        this.f22876s = interfaceC4543gmArr.length;
        for (InterfaceC4543gm interfaceC4543gm : interfaceC4543gmArr) {
            interfaceC4543gm.mo20589d(this, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    /* renamed from: e */
    public final long mo20590e(long j11) {
        long mo20590e = this.f22878u[0].mo20590e(j11);
        int i11 = 1;
        while (true) {
            InterfaceC4543gm[] interfaceC4543gmArr = this.f22878u;
            if (i11 < interfaceC4543gmArr.length) {
                if (interfaceC4543gmArr[i11].mo20590e(mo20590e) == mo20590e) {
                    i11++;
                } else {
                    throw new IllegalStateException("Children seeked to different positions");
                }
            } else {
                return mo20590e;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4506fm
    /* renamed from: f */
    public final void mo22084f(InterfaceC4543gm interfaceC4543gm) {
        int i11 = this.f22876s - 1;
        this.f22876s = i11;
        if (i11 > 0) {
            return;
        }
        int i12 = 0;
        for (InterfaceC4543gm interfaceC4543gm2 : this.f22873p) {
            i12 += interfaceC4543gm2.zzn().f30005a;
        }
        C5099vm[] c5099vmArr = new C5099vm[i12];
        int i13 = 0;
        for (InterfaceC4543gm interfaceC4543gm3 : this.f22873p) {
            C5137wm zzn = interfaceC4543gm3.zzn();
            int i14 = zzn.f30005a;
            int i15 = 0;
            while (i15 < i14) {
                c5099vmArr[i13] = zzn.m27655b(i15);
                i15++;
                i13++;
            }
        }
        this.f22877t = new C5137wm(c5099vmArr);
        this.f22875r.mo22084f(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4988sm
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo22891g(InterfaceC5025tm interfaceC5025tm) {
        if (this.f22877t == null) {
            return;
        }
        this.f22875r.mo22891g(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    /* renamed from: j */
    public final void mo20595j(long j11) {
        for (InterfaceC4543gm interfaceC4543gm : this.f22878u) {
            interfaceC4543gm.mo20595j(j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm, com.google.android.gms.internal.ads.InterfaceC5025tm
    public final long zza() {
        return this.f22879v.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    public final long zzg() {
        long j11 = Long.MAX_VALUE;
        for (InterfaceC4543gm interfaceC4543gm : this.f22878u) {
            long zzg = interfaceC4543gm.zzg();
            if (zzg != Long.MIN_VALUE) {
                j11 = Math.min(j11, zzg);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    public final long zzh() {
        long zzh = this.f22873p[0].zzh();
        int i11 = 1;
        while (true) {
            InterfaceC4543gm[] interfaceC4543gmArr = this.f22873p;
            if (i11 < interfaceC4543gmArr.length) {
                if (interfaceC4543gmArr[i11].zzh() == -9223372036854775807L) {
                    i11++;
                } else {
                    throw new IllegalStateException("Child reported discontinuity");
                }
            } else {
                if (zzh != -9223372036854775807L) {
                    for (InterfaceC4543gm interfaceC4543gm : this.f22878u) {
                        if (interfaceC4543gm != this.f22873p[0] && interfaceC4543gm.mo20590e(zzh) != zzh) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    public final C5137wm zzn() {
        return this.f22877t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4543gm
    public final void zzs() {
        for (InterfaceC4543gm interfaceC4543gm : this.f22873p) {
            interfaceC4543gm.zzs();
        }
    }
}
