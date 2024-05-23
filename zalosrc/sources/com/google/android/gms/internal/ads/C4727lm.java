package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.lm */
/* loaded from: classes2.dex */
public final class C4727lm implements InterfaceC4617im {

    /* renamed from: p */
    private final InterfaceC4617im[] f23975p;

    /* renamed from: q */
    private final ArrayList f23976q;

    /* renamed from: s */
    private InterfaceC4580hm f23978s;

    /* renamed from: t */
    private AbstractC4983sh f23979t;

    /* renamed from: v */
    private zzayh f23981v;

    /* renamed from: r */
    private final C4946rh f23977r = new C4946rh();

    /* renamed from: u */
    private int f23980u = -1;

    public C4727lm(InterfaceC4617im... interfaceC4617imArr) {
        this.f23975p = interfaceC4617imArr;
        this.f23976q = new ArrayList(Arrays.asList(interfaceC4617imArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m24329b(C4727lm c4727lm, int i11, AbstractC4983sh abstractC4983sh, Object obj) {
        zzayh zzayhVar;
        if (c4727lm.f23981v == null) {
            for (int i12 = 0; i12 <= 0; i12++) {
                abstractC4983sh.m26305g(i12, c4727lm.f23977r, false);
            }
            int i13 = c4727lm.f23980u;
            if (i13 == -1) {
                c4727lm.f23980u = 1;
            } else if (i13 != 1) {
                zzayhVar = new zzayh(1);
                c4727lm.f23981v = zzayhVar;
            }
            zzayhVar = null;
            c4727lm.f23981v = zzayhVar;
        }
        if (c4727lm.f23981v == null) {
            c4727lm.f23976q.remove(c4727lm.f23975p[i11]);
            if (i11 == 0) {
                c4727lm.f23979t = abstractC4983sh;
            }
            if (c4727lm.f23976q.isEmpty()) {
                c4727lm.f23978s.mo21748b(c4727lm.f23979t, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    /* renamed from: a */
    public final InterfaceC4543gm mo21747a(int i11, C4915qn c4915qn) {
        int length = this.f23975p.length;
        InterfaceC4543gm[] interfaceC4543gmArr = new InterfaceC4543gm[length];
        for (int i12 = 0; i12 < length; i12++) {
            interfaceC4543gmArr[i12] = this.f23975p[i12].mo21747a(i11, c4915qn);
        }
        return new C4653jm(interfaceC4543gmArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    /* renamed from: c */
    public final void mo21749c(InterfaceC5242zg interfaceC5242zg, boolean z11, InterfaceC4580hm interfaceC4580hm) {
        this.f23978s = interfaceC4580hm;
        int i11 = 0;
        while (true) {
            InterfaceC4617im[] interfaceC4617imArr = this.f23975p;
            if (i11 < interfaceC4617imArr.length) {
                interfaceC4617imArr[i11].mo21749c(interfaceC5242zg, false, new C4690km(this, i11));
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    /* renamed from: d */
    public final void mo21750d(InterfaceC4543gm interfaceC4543gm) {
        C4653jm c4653jm = (C4653jm) interfaceC4543gm;
        int i11 = 0;
        while (true) {
            InterfaceC4617im[] interfaceC4617imArr = this.f23975p;
            if (i11 < interfaceC4617imArr.length) {
                interfaceC4617imArr[i11].mo21750d(c4653jm.f22873p[i11]);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    public final void zza() {
        zzayh zzayhVar = this.f23981v;
        if (zzayhVar == null) {
            for (InterfaceC4617im interfaceC4617im : this.f23975p) {
                interfaceC4617im.zza();
            }
            return;
        }
        throw zzayhVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    public final void zzd() {
        for (InterfaceC4617im interfaceC4617im : this.f23975p) {
            interfaceC4617im.zzd();
        }
    }
}
