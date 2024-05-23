package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class zzhc extends RuntimeException {
    public zzhc(InterfaceC5775i2 interfaceC5775i2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public final zzff m30590a() {
        return new zzff(getMessage());
    }
}
