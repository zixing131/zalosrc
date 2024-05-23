package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzjf extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzjf(int i11) {
        super(r2);
        String str;
        if (i11 != 1) {
            if (i11 != 2) {
                str = "Detaching surface timed out.";
            } else {
                str = "Setting foreground mode timed out.";
            }
        } else {
            str = "Player release timed out.";
        }
    }
}
