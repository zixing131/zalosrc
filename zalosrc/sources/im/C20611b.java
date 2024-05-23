package im;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: im.b */
/* loaded from: classes3.dex */
public final class C20611b extends AbstractC20613d {

    /* renamed from: a */
    private boolean f101359a;

    /* renamed from: b */
    private int f101360b;

    public C20611b() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* renamed from: a */
    public final int m107255a() {
        return this.f101360b;
    }

    /* renamed from: b */
    public final boolean m107256b() {
        return this.f101359a;
    }

    /* renamed from: c */
    public final void m107257c(int i11) {
        this.f101360b = i11;
    }

    /* renamed from: d */
    public final void m107258d(boolean z11) {
        this.f101359a = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20611b)) {
            return false;
        }
        C20611b c20611b = (C20611b) obj;
        return this.f101359a == c20611b.f101359a && this.f101360b == c20611b.f101360b;
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(this.f101359a) * 31) + this.f101360b;
    }

    public String toString() {
        return "CameraContent(selfieCamera=" + this.f101359a + ", flashMode=" + this.f101360b + ")";
    }

    public C20611b(boolean z11, int i11) {
        super(null);
        this.f101359a = z11;
        this.f101360b = i11;
    }

    public /* synthetic */ C20611b(boolean z11, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 0 : i11);
    }
}
