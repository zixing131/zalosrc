package ua;

import va.C27953a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ua.e */
/* loaded from: classes3.dex */
public final class C27211e extends AbstractC27213g {

    /* renamed from: c */
    private final short f127940c;

    /* renamed from: d */
    private final short f127941d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27211e(AbstractC27213g abstractC27213g, int i11, int i12) {
        super(abstractC27213g);
        this.f127940c = (short) i11;
        this.f127941d = (short) i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ua.AbstractC27213g
    /* renamed from: c */
    public void mo139279c(C27953a c27953a, byte[] bArr) {
        c27953a.m140883b(this.f127940c, this.f127941d);
    }

    public String toString() {
        short s7 = this.f127940c;
        short s11 = this.f127941d;
        return '<' + Integer.toBinaryString((s7 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f127941d)).substring(1) + '>';
    }
}
