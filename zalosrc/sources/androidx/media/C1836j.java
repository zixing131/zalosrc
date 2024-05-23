package androidx.media;

import android.text.TextUtils;
import androidx.core.util.AbstractC1482d;

/* renamed from: androidx.media.j */
/* loaded from: classes2.dex */
class C1836j implements InterfaceC1832f {

    /* renamed from: a */
    private String f7554a;

    /* renamed from: b */
    private int f7555b;

    /* renamed from: c */
    private int f7556c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1836j(String str, int i11, int i12) {
        this.f7554a = str;
        this.f7555b = i11;
        this.f7556c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1836j)) {
            return false;
        }
        C1836j c1836j = (C1836j) obj;
        if (TextUtils.equals(this.f7554a, c1836j.f7554a) && this.f7555b == c1836j.f7555b && this.f7556c == c1836j.f7556c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1482d.m7476b(this.f7554a, Integer.valueOf(this.f7555b), Integer.valueOf(this.f7556c));
    }
}
