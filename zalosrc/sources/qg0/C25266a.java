package qg0;

import fn0.AbstractC19074t;
import p479rc.C25724a;
import sg0.C26245a;

/* renamed from: qg0.a */
/* loaded from: classes7.dex */
public final class C25266a extends AbstractC25269d {

    /* renamed from: a */
    private final C25724a f121167a;

    public C25266a(C25724a c25724a) {
        AbstractC19074t.m100208f(c25724a, "backupEncryptionManager");
        this.f121167a = c25724a;
    }

    @Override // qg0.AbstractC25269d
    /* renamed from: c */
    public byte[] mo130732c(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "wrappedKey");
        return C26245a.f124654a.m134947e(C25724a.m132657k(this.f121167a, bArr, null, 2, null));
    }

    @Override // qg0.AbstractC25269d
    /* renamed from: e */
    public byte[] mo130733e(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "keyToWrap");
        return this.f121167a.m132693n(C26245a.f124654a.m134948f(bArr));
    }
}
