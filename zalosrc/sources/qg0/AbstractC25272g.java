package qg0;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: qg0.g */
/* loaded from: classes7.dex */
public abstract class AbstractC25272g extends AbstractC25269d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f121224a;

    /* renamed from: b */
    private final C25268c f121225b;

    /* renamed from: c */
    private final InterfaceC24854k f121226c;

    /* renamed from: d */
    private final InterfaceC24854k f121227d;

    /* renamed from: qg0.g$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: qg0.g$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Key mo12V4() {
            return AbstractC25272g.this.f121225b.m130766s();
        }
    }

    /* renamed from: qg0.g$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Key mo12V4() {
            return AbstractC25272g.this.f121225b.m130767t();
        }
    }

    public AbstractC25272g(int i11, C25268c c25268c) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(c25268c, "keyManager");
        this.f121224a = i11;
        this.f121225b = c25268c;
        m129210a = AbstractC24856m.m129210a(new c());
        this.f121226c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new b());
        this.f121227d = m129210a2;
    }

    /* renamed from: j */
    private final Key m130802j() {
        return (Key) this.f121227d.getValue();
    }

    /* renamed from: k */
    private final Key m130803k() {
        return (Key) this.f121226c.getValue();
    }

    @Override // qg0.AbstractC25269d
    /* renamed from: c */
    public byte[] mo130732c(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "wrappedKey");
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
        cipher.init(2, m130802j(), m130806i());
        byte[] doFinal = cipher.doFinal(bArr);
        AbstractC19074t.m100207e(doFinal, "with(...)");
        return doFinal;
    }

    @Override // qg0.AbstractC25269d
    /* renamed from: e */
    public byte[] mo130733e(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "keyToWrap");
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
        cipher.init(1, m130803k(), m130806i());
        byte[] doFinal = cipher.doFinal(bArr);
        AbstractC19074t.m100207e(doFinal, "with(...)");
        return doFinal;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qg0.AbstractC25269d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC25270e mo130783a(byte[] bArr, String str, int i11) {
        AbstractC19074t.m100208f(bArr, "key");
        AbstractC19074t.m100208f(str, "algorithm");
        return mo130805h(bArr, str, i11);
    }

    /* renamed from: h */
    public abstract AbstractC25270e mo130805h(byte[] bArr, String str, int i11);

    /* renamed from: i */
    protected AlgorithmParameterSpec m130806i() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT);
    }
}
