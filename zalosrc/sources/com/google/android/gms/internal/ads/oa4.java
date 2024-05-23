package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oa4 {

    /* renamed from: a */
    private l94 f25525a = l94.f23798c;

    /* renamed from: b */
    final na4 f25526b = na4.f25121a;

    /* renamed from: c */
    private za4 f25527c;

    /* renamed from: b */
    public final oa4 m25109b(l94 l94Var) {
        this.f25525a = l94Var;
        return this;
    }

    /* renamed from: c */
    public final oa4 m25110c(n94[] n94VarArr) {
        this.f25527c = new za4(n94VarArr);
        return this;
    }

    /* renamed from: d */
    public final ob4 m25111d() {
        if (this.f25527c == null) {
            this.f25527c = new za4(new n94[0]);
        }
        return new ob4(this, null);
    }
}
