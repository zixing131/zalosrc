package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class in1 {

    /* renamed from: a */
    public final Object f22234a;

    /* renamed from: b */
    private zk4 f22235b = new zk4();

    /* renamed from: c */
    private boolean f22236c;

    /* renamed from: d */
    private boolean f22237d;

    public in1(Object obj) {
        this.f22234a = obj;
    }

    /* renamed from: a */
    public final void m23306a(int i11, gl1 gl1Var) {
        if (!this.f22237d) {
            if (i11 != -1) {
                this.f22235b.m28538a(i11);
            }
            this.f22236c = true;
            gl1Var.zza(this.f22234a);
        }
    }

    /* renamed from: b */
    public final void m23307b(hm1 hm1Var) {
        if (!this.f22237d && this.f22236c) {
            C4336b m28539b = this.f22235b.m28539b();
            this.f22235b = new zk4();
            this.f22236c = false;
            hm1Var.mo20402a(this.f22234a, m28539b);
        }
    }

    /* renamed from: c */
    public final void m23308c(hm1 hm1Var) {
        this.f22237d = true;
        if (this.f22236c) {
            hm1Var.mo20402a(this.f22234a, this.f22235b.m28539b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && in1.class == obj.getClass()) {
            return this.f22234a.equals(((in1) obj).f22234a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22234a.hashCode();
    }
}
