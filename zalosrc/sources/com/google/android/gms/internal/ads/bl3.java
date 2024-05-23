package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class bl3 {

    /* renamed from: a */
    private final uk3 f17859a;

    /* renamed from: b */
    private final List f17860b;

    /* renamed from: c */
    private final Integer f17861c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bl3(uk3 uk3Var, List list, Integer num, al3 al3Var) {
        this.f17859a = uk3Var;
        this.f17860b = list;
        this.f17861c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bl3)) {
            return false;
        }
        bl3 bl3Var = (bl3) obj;
        if (this.f17859a.equals(bl3Var.f17859a) && this.f17860b.equals(bl3Var.f17860b)) {
            Integer num = this.f17861c;
            Integer num2 = bl3Var.f17861c;
            if (num != num2) {
                if (num != null && num.equals(num2)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17859a, this.f17860b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f17859a, this.f17860b, this.f17861c);
    }
}
