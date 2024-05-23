package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class xw3 {
    /* renamed from: a */
    public abstract int mo20329a(Object obj);

    /* renamed from: b */
    public abstract int mo20330b(Object obj);

    /* renamed from: c */
    public abstract Object mo20331c(Object obj);

    /* renamed from: d */
    public abstract Object mo20332d(Object obj);

    /* renamed from: e */
    public abstract Object mo20333e(Object obj, Object obj2);

    /* renamed from: f */
    public abstract Object mo20334f();

    /* renamed from: g */
    abstract Object mo20335g(Object obj);

    /* renamed from: h */
    abstract void mo20336h(Object obj, int i11, int i12);

    /* renamed from: i */
    abstract void mo20337i(Object obj, int i11, long j11);

    /* renamed from: j */
    abstract void mo20338j(Object obj, int i11, Object obj2);

    /* renamed from: k */
    public abstract void mo20339k(Object obj, int i11, mt3 mt3Var);

    /* renamed from: l */
    public abstract void mo20340l(Object obj, int i11, long j11);

    /* renamed from: m */
    public abstract void mo20341m(Object obj);

    /* renamed from: n */
    public abstract void mo20342n(Object obj, Object obj2);

    /* renamed from: o */
    public abstract void mo20343o(Object obj, Object obj2);

    /* renamed from: p */
    public final boolean m28056p(Object obj, kw3 kw3Var) {
        int zzd = kw3Var.zzd();
        int i11 = zzd >>> 3;
        int i12 = zzd & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                mo20336h(obj, i11, kw3Var.zzf());
                                return true;
                            }
                            throw zzgrq.m28817a();
                        }
                        return false;
                    }
                    Object mo20334f = mo20334f();
                    int i13 = 4 | (i11 << 3);
                    while (kw3Var.zzc() != Integer.MAX_VALUE && m28056p(mo20334f, kw3Var)) {
                    }
                    if (i13 == kw3Var.zzd()) {
                        mo20335g(mo20334f);
                        mo20338j(obj, i11, mo20334f);
                        return true;
                    }
                    throw zzgrq.m28818b();
                }
                mo20339k(obj, i11, kw3Var.zzp());
                return true;
            }
            mo20337i(obj, i11, kw3Var.zzk());
            return true;
        }
        mo20340l(obj, i11, kw3Var.zzl());
        return true;
    }

    /* renamed from: q */
    public abstract boolean mo20344q(kw3 kw3Var);

    /* renamed from: r */
    public abstract void mo20345r(Object obj, cu3 cu3Var);
}
