package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgtx extends RuntimeException {
    public zzgtx(zv3 zv3Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final zzgrq m28829a() {
        return new zzgrq(getMessage());
    }
}
