package c50;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: c50.f */
/* loaded from: classes5.dex */
public final class C3295f {

    /* renamed from: a */
    private CharSequence f14099a;

    /* renamed from: b */
    private int f14100b;

    /* renamed from: c */
    private int f14101c;

    /* renamed from: d */
    private int f14102d;

    /* renamed from: e */
    private int f14103e;

    public C3295f(CharSequence charSequence, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(charSequence, "text");
        this.f14099a = charSequence;
        this.f14100b = i11;
        this.f14101c = i12;
        this.f14102d = i13;
        this.f14103e = i14;
    }

    /* renamed from: a */
    public final int m16719a() {
        return this.f14102d;
    }

    /* renamed from: b */
    public final int m16720b() {
        return this.f14101c;
    }

    /* renamed from: c */
    public final int m16721c() {
        return this.f14103e;
    }

    /* renamed from: d */
    public final int m16722d() {
        return this.f14100b;
    }

    /* renamed from: e */
    public final CharSequence m16723e() {
        return this.f14099a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3295f)) {
            return false;
        }
        C3295f c3295f = (C3295f) obj;
        return AbstractC19074t.m100204b(this.f14099a, c3295f.f14099a) && this.f14100b == c3295f.f14100b && this.f14101c == c3295f.f14101c && this.f14102d == c3295f.f14102d && this.f14103e == c3295f.f14103e;
    }

    /* renamed from: f */
    public final void m16724f() {
        this.f14099a = "";
        this.f14100b = -1;
        this.f14101c = -1;
        this.f14102d = 0;
    }

    /* renamed from: g */
    public final void m16725g(int i11) {
        this.f14102d = i11;
    }

    /* renamed from: h */
    public final void m16726h(int i11) {
        this.f14101c = i11;
    }

    public int hashCode() {
        return (((((((this.f14099a.hashCode() * 31) + this.f14100b) * 31) + this.f14101c) * 31) + this.f14102d) * 31) + this.f14103e;
    }

    /* renamed from: i */
    public final void m16727i(int i11) {
        this.f14103e = i11;
    }

    /* renamed from: j */
    public final void m16728j(int i11) {
        this.f14100b = i11;
    }

    /* renamed from: k */
    public final void m16729k(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<set-?>");
        this.f14099a = charSequence;
    }

    public String toString() {
        CharSequence charSequence = this.f14099a;
        return "SyncTextSpanInfo(text=" + ((Object) charSequence) + ", startIdx=" + this.f14100b + ", endIdx=" + this.f14101c + ", commonAction=" + this.f14102d + ", percent=" + this.f14103e + ")";
    }

    public /* synthetic */ C3295f(String str, int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? -1 : i11, (i15 & 4) == 0 ? i12 : -1, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0 : i14);
    }
}
