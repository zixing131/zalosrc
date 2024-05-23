package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class f44 {

    /* renamed from: c */
    public static final f44 f20004c;

    /* renamed from: d */
    public static final f44 f20005d;

    /* renamed from: e */
    public static final f44 f20006e;

    /* renamed from: f */
    public static final f44 f20007f;

    /* renamed from: g */
    public static final f44 f20008g;

    /* renamed from: a */
    public final long f20009a;

    /* renamed from: b */
    public final long f20010b;

    static {
        f44 f44Var = new f44(0L, 0L);
        f20004c = f44Var;
        f20005d = new f44(Long.MAX_VALUE, Long.MAX_VALUE);
        f20006e = new f44(Long.MAX_VALUE, 0L);
        f20007f = new f44(0L, Long.MAX_VALUE);
        f20008g = f44Var;
    }

    public f44(long j11, long j12) {
        boolean z11;
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        v71.m27173d(j12 >= 0);
        this.f20009a = j11;
        this.f20010b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f44.class == obj.getClass()) {
            f44 f44Var = (f44) obj;
            if (this.f20009a == f44Var.f20009a && this.f20010b == f44Var.f20010b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f20009a) * 31) + ((int) this.f20010b);
    }
}
