package cl0;

import bl0.C2837c;
import fl0.C18990a;
import fl0.C18992c;
import fl0.C18995f;
import fl0.C18996g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ik0.AbstractC20596s;
import ik0.AbstractC20601x;

/* renamed from: cl0.u */
/* loaded from: classes7.dex */
public final class C3591u extends C2837c {

    /* renamed from: j */
    private final byte[] f15153j;

    /* renamed from: k */
    private final String f15154k;

    public /* synthetic */ C3591u(byte[] bArr, String str, C18995f c18995f, C18990a c18990a, C18992c c18992c, C18996g c18996g, AbstractC20596s abstractC20596s, AbstractC20601x abstractC20601x, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : bArr, (i11 & 2) != 0 ? null : str, c18995f, c18990a, c18992c, c18996g, abstractC20596s, abstractC20601x);
    }

    /* renamed from: x */
    public final byte[] m18195x() {
        return this.f15153j;
    }

    /* renamed from: y */
    public final String m18196y() {
        return this.f15154k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3591u(byte[] bArr, String str, C18995f c18995f, C18990a c18990a, C18992c c18992c, C18996g c18996g, AbstractC20596s abstractC20596s, AbstractC20601x abstractC20601x) {
        super(c18995f, c18990a, c18992c, c18996g, abstractC20596s, abstractC20601x);
        AbstractC19074t.m100208f(c18995f, "requestInfo");
        AbstractC19074t.m100208f(c18990a, "config");
        AbstractC19074t.m100208f(c18992c, "environment");
        AbstractC19074t.m100208f(c18996g, "utility");
        AbstractC19074t.m100208f(abstractC20596s, "layoutRequest");
        AbstractC19074t.m100208f(abstractC20601x, "zinstantRequest");
        this.f15153j = bArr;
        this.f15154k = str;
    }
}
