package rg0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import qg0.AbstractC25270e;
import qm0.AbstractC25356m;
import sg0.C26245a;
import tg0.C26676b;

/* renamed from: rg0.d */
/* loaded from: classes7.dex */
public final class C25791d implements InterfaceC25788a {
    public static final a Companion = new a(null);

    /* renamed from: rg0.d$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: c */
    private final void m132930c(int i11, Key key, byte[] bArr, InputStream inputStream, OutputStream outputStream) {
        byte[] bArr2 = new byte[4096];
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        int read = inputStream.read(bArr2);
        while (read >= 0) {
            cipher.init(i11, key, ivParameterSpec);
            if (read == 4096) {
                outputStream.write(cipher.update(bArr2));
            } else {
                outputStream.write(bArr2, 0, read);
            }
            read = inputStream.read(bArr2);
        }
    }

    @Override // rg0.InterfaceC25788a
    /* renamed from: a */
    public void mo132924a(AbstractC25270e abstractC25270e, InputStream inputStream, OutputStream outputStream) {
        AbstractC19074t.m100208f(abstractC25270e, "key");
        AbstractC19074t.m100208f(inputStream, "input");
        AbstractC19074t.m100208f(outputStream, "output");
        try {
            m132930c(2, abstractC25270e.m130788c(), ((AbstractC25270e.b) abstractC25270e).m130792e(), inputStream, outputStream);
        } catch (Exception e11) {
            C26676b.m136955e("SMLZCloudVideoEncryptionV2Impl", "Error occurred while decrypting media file: " + e11.getMessage(), C26676b.b.f126335t);
            throw e11;
        }
    }

    @Override // rg0.InterfaceC25788a
    /* renamed from: b */
    public AbstractC25270e mo132925b(InputStream inputStream, OutputStream outputStream) {
        byte[] m131332o;
        AbstractC19074t.m100208f(inputStream, "input");
        AbstractC19074t.m100208f(outputStream, "output");
        try {
            C26245a c26245a = C26245a.f124654a;
            SecretKey m134951i = c26245a.m134951i("AES", 256);
            m131332o = AbstractC25356m.m131332o(c26245a.m134950h(12), c26245a.m134949g(4));
            m132930c(1, m134951i, m131332o, inputStream, outputStream);
            return new AbstractC25270e.b(m134951i, m131332o);
        } catch (Exception e11) {
            C26676b.m136955e("SMLZCloudVideoEncryptionV2Impl", "Error occurred while encrypting media file: " + e11.getMessage(), C26676b.b.f126335t);
            throw e11;
        }
    }
}
