package p010a4;

import java.util.Arrays;
import p668y3.C30276b;

/* renamed from: a4.h */
/* loaded from: classes.dex */
public final class C0115h {

    /* renamed from: a */
    private final C30276b f692a;

    /* renamed from: b */
    private final byte[] f693b;

    public C0115h(C30276b c30276b, byte[] bArr) {
        if (c30276b != null) {
            if (bArr != null) {
                this.f692a = c30276b;
                this.f693b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    /* renamed from: a */
    public byte[] m529a() {
        return this.f693b;
    }

    /* renamed from: b */
    public C30276b m530b() {
        return this.f692a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0115h)) {
            return false;
        }
        C0115h c0115h = (C0115h) obj;
        if (!this.f692a.equals(c0115h.f692a)) {
            return false;
        }
        return Arrays.equals(this.f693b, c0115h.f693b);
    }

    public int hashCode() {
        return ((this.f692a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f693b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f692a + ", bytes=[...]}";
    }
}
