package iq;

import androidx.work.AbstractC2144f;
import com.zing.zalo.AbstractC16781w;
import fn0.AbstractC19060k;
import me0.C23212s8;

/* renamed from: iq.r0 */
/* loaded from: classes4.dex */
public final class C20738r0 {

    /* renamed from: a */
    private boolean f101901a;

    /* renamed from: b */
    private int f101902b;

    /* renamed from: c */
    private int f101903c;

    public C20738r0(boolean z11, int i11, int i12) {
        this.f101901a = z11;
        this.f101902b = i11;
        this.f101903c = i12;
    }

    /* renamed from: a */
    public final int m108176a() {
        return this.f101903c;
    }

    /* renamed from: b */
    public final int m108177b() {
        return this.f101902b;
    }

    /* renamed from: c */
    public final boolean m108178c() {
        return this.f101901a;
    }

    /* renamed from: d */
    public final void m108179d(int i11) {
        this.f101903c = i11;
    }

    /* renamed from: e */
    public final void m108180e(int i11) {
        this.f101902b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20738r0)) {
            return false;
        }
        C20738r0 c20738r0 = (C20738r0) obj;
        return this.f101901a == c20738r0.f101901a && this.f101902b == c20738r0.f101902b && this.f101903c == c20738r0.f101903c;
    }

    /* renamed from: f */
    public final void m108181f(boolean z11) {
        this.f101901a = z11;
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f101901a) * 31) + this.f101902b) * 31) + this.f101903c;
    }

    public String toString() {
        return "ButtonPostData(isVisible=" + this.f101901a + ", buttonIconColor=" + this.f101902b + ", buttonBackgroundColor=" + this.f101903c + ")";
    }

    public /* synthetic */ C20738r0(boolean z11, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? C23212s8.m119606n(AbstractC16781w.AppPrimaryColor) : i11, (i13 & 4) != 0 ? C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor) : i12);
    }
}
