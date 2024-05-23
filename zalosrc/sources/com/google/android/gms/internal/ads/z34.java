package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z34 extends jm3 {

    /* renamed from: e */
    private final int f31336e;

    /* renamed from: f */
    private final int f31337f;

    /* renamed from: g */
    private final int[] f31338g;

    /* renamed from: h */
    private final int[] f31339h;

    /* renamed from: i */
    private final mr0[] f31340i;

    /* renamed from: j */
    private final Object[] f31341j;

    /* renamed from: k */
    private final HashMap f31342k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z34(Collection collection, zg4 zg4Var, byte[] bArr) {
        super(false, zg4Var, null);
        int i11 = 0;
        int size = collection.size();
        this.f31338g = new int[size];
        this.f31339h = new int[size];
        this.f31340i = new mr0[size];
        this.f31341j = new Object[size];
        this.f31342k = new HashMap();
        Iterator it = collection.iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            o34 o34Var = (o34) it.next();
            this.f31340i[i13] = o34Var.zza();
            this.f31339h[i13] = i11;
            this.f31338g[i13] = i12;
            i11 += this.f31340i[i13].mo20107c();
            i12 += this.f31340i[i13].mo20106b();
            this.f31341j[i13] = o34Var.zzb();
            this.f31342k.put(this.f31341j[i13], Integer.valueOf(i13));
            i13++;
        }
        this.f31336e = i11;
        this.f31337f = i12;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: b */
    public final int mo20106b() {
        return this.f31337f;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: c */
    public final int mo20107c() {
        return this.f31336e;
    }

    @Override // com.google.android.gms.internal.ads.jm3
    /* renamed from: p */
    protected final int mo23651p(Object obj) {
        Integer num = (Integer) this.f31342k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.jm3
    /* renamed from: q */
    protected final int mo23652q(int i11) {
        return g92.m22319M(this.f31338g, i11 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.jm3
    /* renamed from: r */
    protected final int mo23653r(int i11) {
        return g92.m22319M(this.f31339h, i11 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.jm3
    /* renamed from: s */
    protected final int mo23654s(int i11) {
        return this.f31338g[i11];
    }

    @Override // com.google.android.gms.internal.ads.jm3
    /* renamed from: t */
    protected final int mo23655t(int i11) {
        return this.f31339h[i11];
    }

    @Override // com.google.android.gms.internal.ads.jm3
    /* renamed from: u */
    protected final mr0 mo23656u(int i11) {
        return this.f31340i[i11];
    }

    @Override // com.google.android.gms.internal.ads.jm3
    /* renamed from: v */
    protected final Object mo23657v(int i11) {
        return this.f31341j[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final List m28431y() {
        return Arrays.asList(this.f31340i);
    }
}
