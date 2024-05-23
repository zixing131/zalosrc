package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.l */
/* loaded from: classes2.dex */
public abstract class AbstractC5790l extends AbstractC5748e implements Set {

    /* renamed from: q */
    private transient AbstractC5766h f33345q;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC5838t.m30478a(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: j */
    public AbstractC5766h mo30208j() {
        AbstractC5766h abstractC5766h = this.f33345q;
        if (abstractC5766h == null) {
            AbstractC5766h mo30320m = mo30320m();
            this.f33345q = mo30320m;
            return mo30320m;
        }
        return abstractC5766h;
    }

    /* renamed from: m */
    AbstractC5766h mo30320m() {
        Object[] array = toArray();
        int i11 = AbstractC5766h.f33323r;
        return AbstractC5766h.m30235n(array, array.length);
    }
}
