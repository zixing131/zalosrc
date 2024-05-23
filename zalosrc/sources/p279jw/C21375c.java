package p279jw;

import androidx.work.AbstractC2144f;
import com.zing.zalo.p077ui.chat.C11598e;
import fn0.AbstractC19060k;

/* renamed from: jw.c */
/* loaded from: classes4.dex */
public final class C21375c {

    /* renamed from: a */
    private boolean f104253a;

    /* renamed from: b */
    private int f104254b;

    public C21375c(boolean z11, int i11) {
        this.f104253a = z11;
        this.f104254b = i11;
    }

    /* renamed from: a */
    public final int m110824a() {
        return this.f104254b;
    }

    /* renamed from: b */
    public final boolean m110825b() {
        return this.f104253a;
    }

    /* renamed from: c */
    public final void m110826c(int i11) {
        this.f104254b = i11;
    }

    /* renamed from: d */
    public final void m110827d(boolean z11) {
        this.f104253a = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21375c)) {
            return false;
        }
        C21375c c21375c = (C21375c) obj;
        return this.f104253a == c21375c.f104253a && this.f104254b == c21375c.f104254b;
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(this.f104253a) * 31) + this.f104254b;
    }

    public String toString() {
        return "{enable: " + this.f104253a + ", defaultViewMode: " + this.f104254b + "}";
    }

    public /* synthetic */ C21375c(boolean z11, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? C11598e.e.f60096p.ordinal() : i11);
    }
}
