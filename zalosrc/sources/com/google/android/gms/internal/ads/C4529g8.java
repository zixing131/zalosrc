package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.g8 */
/* loaded from: classes2.dex */
public final class C4529g8 {

    /* renamed from: a */
    private final String f20460a;

    /* renamed from: b */
    private final String f20461b;

    public C4529g8(String str, String str2) {
        this.f20460a = str;
        this.f20461b = str2;
    }

    /* renamed from: a */
    public final String m22291a() {
        return this.f20460a;
    }

    /* renamed from: b */
    public final String m22292b() {
        return this.f20461b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4529g8.class == obj.getClass()) {
            C4529g8 c4529g8 = (C4529g8) obj;
            if (TextUtils.equals(this.f20460a, c4529g8.f20460a) && TextUtils.equals(this.f20461b, c4529g8.f20461b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20460a.hashCode() * 31) + this.f20461b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f20460a + ",value=" + this.f20461b + "]";
    }
}
