package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class my0 {

    /* renamed from: A */
    public static final my0 f24907A;

    /* renamed from: B */
    public static final my0 f24908B;

    /* renamed from: C */
    public static final g94 f24909C;

    /* renamed from: a */
    public final int f24910a = Integer.MAX_VALUE;

    /* renamed from: b */
    public final int f24911b = Integer.MAX_VALUE;

    /* renamed from: c */
    public final int f24912c = Integer.MAX_VALUE;

    /* renamed from: d */
    public final int f24913d = Integer.MAX_VALUE;

    /* renamed from: e */
    public final int f24914e = 0;

    /* renamed from: f */
    public final int f24915f = 0;

    /* renamed from: g */
    public final int f24916g = 0;

    /* renamed from: h */
    public final int f24917h = 0;

    /* renamed from: i */
    public final int f24918i;

    /* renamed from: j */
    public final int f24919j;

    /* renamed from: k */
    public final boolean f24920k;

    /* renamed from: l */
    public final c83 f24921l;

    /* renamed from: m */
    public final int f24922m;

    /* renamed from: n */
    public final c83 f24923n;

    /* renamed from: o */
    public final int f24924o;

    /* renamed from: p */
    public final int f24925p;

    /* renamed from: q */
    public final int f24926q;

    /* renamed from: r */
    public final c83 f24927r;

    /* renamed from: s */
    public final c83 f24928s;

    /* renamed from: t */
    public final int f24929t;

    /* renamed from: u */
    public final int f24930u;

    /* renamed from: v */
    public final boolean f24931v;

    /* renamed from: w */
    public final boolean f24932w;

    /* renamed from: x */
    public final boolean f24933x;

    /* renamed from: y */
    public final f83 f24934y;

    /* renamed from: z */
    public final h83 f24935z;

    static {
        my0 my0Var = new my0(new lx0());
        f24907A = my0Var;
        f24908B = my0Var;
        f24909C = new g94() { // from class: com.google.android.gms.internal.ads.kw0
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public my0(lx0 lx0Var) {
        int i11;
        int i12;
        boolean z11;
        c83 c83Var;
        c83 c83Var2;
        c83 c83Var3;
        c83 c83Var4;
        int i13;
        HashMap hashMap;
        HashSet hashSet;
        i11 = lx0Var.f24278e;
        this.f24918i = i11;
        i12 = lx0Var.f24279f;
        this.f24919j = i12;
        z11 = lx0Var.f24280g;
        this.f24920k = z11;
        c83Var = lx0Var.f24281h;
        this.f24921l = c83Var;
        this.f24922m = 0;
        c83Var2 = lx0Var.f24282i;
        this.f24923n = c83Var2;
        this.f24924o = 0;
        this.f24925p = Integer.MAX_VALUE;
        this.f24926q = Integer.MAX_VALUE;
        c83Var3 = lx0Var.f24285l;
        this.f24927r = c83Var3;
        c83Var4 = lx0Var.f24286m;
        this.f24928s = c83Var4;
        i13 = lx0Var.f24287n;
        this.f24929t = i13;
        this.f24930u = 0;
        this.f24931v = false;
        this.f24932w = false;
        this.f24933x = false;
        hashMap = lx0Var.f24288o;
        this.f24934y = f83.m21966c(hashMap);
        hashSet = lx0Var.f24289p;
        this.f24935z = h83.m22733t(hashSet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            my0 my0Var = (my0) obj;
            if (this.f24920k == my0Var.f24920k && this.f24918i == my0Var.f24918i && this.f24919j == my0Var.f24919j && this.f24921l.equals(my0Var.f24921l) && this.f24923n.equals(my0Var.f24923n) && this.f24927r.equals(my0Var.f24927r) && this.f24928s.equals(my0Var.f24928s) && this.f24929t == my0Var.f24929t && this.f24934y.equals(my0Var.f24934y) && this.f24935z.equals(my0Var.f24935z)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f24920k ? 1 : 0) - 1048002209) * 31) + this.f24918i) * 31) + this.f24919j) * 31) + this.f24921l.hashCode()) * 961) + this.f24923n.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.f24927r.hashCode()) * 31) + this.f24928s.hashCode()) * 31) + this.f24929t) * 28629151) + this.f24934y.hashCode()) * 31) + this.f24935z.hashCode();
    }
}
