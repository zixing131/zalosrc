package qg0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import qg0.AbstractC25270e;
import qm0.AbstractC25356m;
import sg0.C26245a;

/* renamed from: qg0.j */
/* loaded from: classes7.dex */
public final class C25275j extends AbstractC25272g {
    public static final a Companion = new a(null);

    /* renamed from: qg0.j$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25275j(int i11, C25268c c25268c) {
        super(i11, c25268c);
        AbstractC19074t.m100208f(c25268c, "keyManager");
    }

    @Override // qg0.AbstractC25272g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC25270e.b mo130805h(byte[] bArr, String str, int i11) {
        AbstractC19074t.m100208f(bArr, "encryptionKey");
        AbstractC19074t.m100208f(str, "algorithm");
        byte[] bArr2 = new byte[16];
        int length = bArr.length - 16;
        byte[] bArr3 = new byte[length];
        AbstractC25356m.m131324g(bArr, bArr3, 0, 0, length, 2, null);
        AbstractC25356m.m131324g(bArr, bArr2, 0, bArr.length - 16, bArr.length, 2, null);
        return new AbstractC25270e.b(C26245a.f124654a.m134945c(bArr3, str, i11), bArr2);
    }
}
