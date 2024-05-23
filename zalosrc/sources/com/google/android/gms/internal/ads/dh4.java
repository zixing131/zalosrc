package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class dh4 {

    /* renamed from: d */
    public static final dh4 f19249d = new dh4(new jt0[0]);

    /* renamed from: e */
    public static final g94 f19250e = new g94() { // from class: com.google.android.gms.internal.ads.ch4
    };

    /* renamed from: a */
    public final int f19251a;

    /* renamed from: b */
    private final c83 f19252b;

    /* renamed from: c */
    private int f19253c;

    public dh4(jt0... jt0VarArr) {
        this.f19252b = c83.m20831v(jt0VarArr);
        this.f19251a = jt0VarArr.length;
        int i11 = 0;
        while (i11 < this.f19252b.size()) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < this.f19252b.size(); i13++) {
                if (((jt0) this.f19252b.get(i11)).equals(this.f19252b.get(i13))) {
                    lr1.m24354c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i11 = i12;
        }
    }

    /* renamed from: a */
    public final int m21392a(jt0 jt0Var) {
        int indexOf = this.f19252b.indexOf(jt0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: b */
    public final jt0 m21393b(int i11) {
        return (jt0) this.f19252b.get(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dh4.class == obj.getClass()) {
            dh4 dh4Var = (dh4) obj;
            if (this.f19251a == dh4Var.f19251a && this.f19252b.equals(dh4Var.f19252b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f19253c;
        if (i11 == 0) {
            int hashCode = this.f19252b.hashCode();
            this.f19253c = hashCode;
            return hashCode;
        }
        return i11;
    }
}
