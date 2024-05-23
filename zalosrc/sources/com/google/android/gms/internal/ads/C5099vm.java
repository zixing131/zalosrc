package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.vm */
/* loaded from: classes2.dex */
public final class C5099vm {

    /* renamed from: a */
    public final int f29402a = 1;

    /* renamed from: b */
    private final zzasw[] f29403b;

    /* renamed from: c */
    private int f29404c;

    public C5099vm(zzasw... zzaswVarArr) {
        this.f29403b = zzaswVarArr;
    }

    /* renamed from: a */
    public final int m27306a(zzasw zzaswVar) {
        for (int i11 = 0; i11 <= 0; i11++) {
            if (zzaswVar == this.f29403b[i11]) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final zzasw m27307b(int i11) {
        return this.f29403b[i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5099vm.class == obj.getClass() && Arrays.equals(this.f29403b, ((C5099vm) obj).f29403b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f29404c;
        if (i11 == 0) {
            int hashCode = Arrays.hashCode(this.f29403b) + 527;
            this.f29404c = hashCode;
            return hashCode;
        }
        return i11;
    }
}
