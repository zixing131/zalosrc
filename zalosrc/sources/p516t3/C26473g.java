package p516t3;

import p566v3.C27508p;

/* renamed from: t3.g */
/* loaded from: classes2.dex */
public class C26473g {

    /* renamed from: a */
    C27508p f125713a;

    /* renamed from: b */
    private int f125714b = 60;

    /* renamed from: a */
    public C26469c m136447a() {
        if (this.f125713a != null) {
            return new C26469c(this.f125713a, this.f125714b);
        }
        throw new IllegalArgumentException("No KFImage provided!");
    }

    /* renamed from: b */
    public C26473g m136448b(C27508p c27508p) {
        this.f125713a = c27508p;
        return this;
    }

    /* renamed from: c */
    public C26473g m136449c(int i11) {
        this.f125714b = i11;
        return this;
    }
}
