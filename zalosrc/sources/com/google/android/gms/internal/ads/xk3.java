package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class xk3 {

    /* renamed from: a */
    private ArrayList f30517a = new ArrayList();

    /* renamed from: b */
    private uk3 f30518b = uk3.f28966b;

    /* renamed from: c */
    private Integer f30519c = null;

    /* renamed from: a */
    public final xk3 m27924a(he3 he3Var, int i11, qe3 qe3Var) {
        ArrayList arrayList = this.f30517a;
        if (arrayList != null) {
            arrayList.add(new zk3(he3Var, i11, qe3Var, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    /* renamed from: b */
    public final xk3 m27925b(uk3 uk3Var) {
        if (this.f30517a != null) {
            this.f30518b = uk3Var;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    /* renamed from: c */
    public final xk3 m27926c(int i11) {
        if (this.f30517a != null) {
            this.f30519c = Integer.valueOf(i11);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    /* renamed from: d */
    public final bl3 m27927d() {
        if (this.f30517a != null) {
            Integer num = this.f30519c;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f30517a;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    if (((zk3) arrayList.get(i11)).m28537a() != intValue) {
                        i11 = i12;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            bl3 bl3Var = new bl3(this.f30518b, Collections.unmodifiableList(this.f30517a), this.f30519c, null);
            this.f30517a = null;
            return bl3Var;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
