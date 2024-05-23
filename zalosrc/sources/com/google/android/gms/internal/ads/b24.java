package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* loaded from: classes2.dex */
public final class b24 {

    /* renamed from: a */
    public final AudioAttributes f17513a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ b24(b44 b44Var, b14 b14Var) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i11 = g92.f20474a;
        if (i11 >= 29) {
            tm2.m26627a(usage, 1);
        }
        if (i11 >= 32) {
            fd3.m21991a(usage, 0);
        }
        this.f17513a = usage.build();
    }
}
