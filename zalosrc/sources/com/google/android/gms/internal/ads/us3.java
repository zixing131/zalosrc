package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class us3 implements yv3 {
    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: Q */
    public final /* bridge */ /* synthetic */ yv3 mo27049Q(zv3 zv3Var) {
        if (mo20309b().getClass().isInstance(zv3Var)) {
            return mo25893i((vs3) zv3Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: i */
    protected abstract us3 mo25893i(vs3 vs3Var);
}
