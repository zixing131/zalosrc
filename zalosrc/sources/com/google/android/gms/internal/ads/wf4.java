package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class wf4 extends oe4 {

    /* renamed from: t */
    private static final C4330au f29908t;

    /* renamed from: k */
    private final if4[] f29909k;

    /* renamed from: l */
    private final mr0[] f29910l;

    /* renamed from: m */
    private final ArrayList f29911m;

    /* renamed from: n */
    private final Map f29912n;

    /* renamed from: o */
    private final x83 f29913o;

    /* renamed from: p */
    private int f29914p;

    /* renamed from: q */
    private long[][] f29915q;

    /* renamed from: r */
    private zzsz f29916r;

    /* renamed from: s */
    private final qe4 f29917s;

    static {
        C4787n7 c4787n7 = new C4787n7();
        c4787n7.m24856a("MergingMediaSource");
        f29908t = c4787n7.m24858c();
    }

    public wf4(boolean z11, boolean z12, if4... if4VarArr) {
        qe4 qe4Var = new qe4();
        this.f29909k = if4VarArr;
        this.f29917s = qe4Var;
        this.f29911m = new ArrayList(Arrays.asList(if4VarArr));
        this.f29914p = -1;
        this.f29910l = new mr0[if4VarArr.length];
        this.f29915q = new long[0];
        this.f29912n = new HashMap();
        this.f29913o = e93.m21649a(8).m21290b(2).mo20441c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.oe4
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void mo20503A(Object obj, if4 if4Var, mr0 mr0Var) {
        int i11;
        if (this.f29916r == null) {
            if (this.f29914p == -1) {
                i11 = mr0Var.mo20106b();
                this.f29914p = i11;
            } else {
                int mo20106b = mr0Var.mo20106b();
                int i12 = this.f29914p;
                if (mo20106b == i12) {
                    i11 = i12;
                } else {
                    this.f29916r = new zzsz(0);
                    return;
                }
            }
            if (this.f29915q.length == 0) {
                this.f29915q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i11, this.f29910l.length);
            }
            this.f29911m.remove(if4Var);
            this.f29910l[((Integer) obj).intValue()] = mr0Var;
            if (this.f29911m.isEmpty()) {
                m22814w(this.f29910l[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: d */
    public final void mo20506d(ef4 ef4Var) {
        uf4 uf4Var = (uf4) ef4Var;
        int i11 = 0;
        while (true) {
            if4[] if4VarArr = this.f29909k;
            if (i11 < if4VarArr.length) {
                if4VarArr[i11].mo20506d(uf4Var.m26922e(i11));
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oe4, com.google.android.gms.internal.ads.if4
    /* renamed from: g */
    public final void mo20507g() {
        zzsz zzszVar = this.f29916r;
        if (zzszVar == null) {
            super.mo20507g();
            return;
        }
        throw zzszVar;
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: j */
    public final ef4 mo20508j(gf4 gf4Var, jj4 jj4Var, long j11) {
        int length = this.f29909k.length;
        ef4[] ef4VarArr = new ef4[length];
        int mo20105a = this.f29910l[0].mo20105a(gf4Var.f20363a);
        for (int i11 = 0; i11 < length; i11++) {
            ef4VarArr[i11] = this.f29909k[i11].mo20508j(gf4Var.m22434c(this.f29910l[i11].mo20110f(mo20105a)), jj4Var, j11 - this.f29915q[mo20105a][i11]);
        }
        return new uf4(this.f29917s, this.f29915q[mo20105a], ef4VarArr, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.oe4, com.google.android.gms.internal.ads.he4
    /* renamed from: v */
    public final void mo20509v(dc3 dc3Var) {
        super.mo20509v(dc3Var);
        for (int i11 = 0; i11 < this.f29909k.length; i11++) {
            m25175B(Integer.valueOf(i11), this.f29909k[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.oe4, com.google.android.gms.internal.ads.he4
    /* renamed from: x */
    public final void mo20510x() {
        super.mo20510x();
        Arrays.fill(this.f29910l, (Object) null);
        this.f29914p = -1;
        this.f29916r = null;
        this.f29911m.clear();
        Collections.addAll(this.f29911m, this.f29909k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.oe4
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ gf4 mo20511z(Object obj, gf4 gf4Var) {
        if (((Integer) obj).intValue() == 0) {
            return gf4Var;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.if4
    public final C4330au zzz() {
        if4[] if4VarArr = this.f29909k;
        if (if4VarArr.length > 0) {
            return if4VarArr[0].zzz();
        }
        return f29908t;
    }
}
