package rg0;

import bn0.AbstractC2932a;
import bn0.AbstractC2933b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import pm0.C24848g0;
import qg0.AbstractC25270e;
import qm0.AbstractC25356m;
import sg0.C26245a;
import tg0.C26676b;

/* renamed from: rg0.c */
/* loaded from: classes7.dex */
public final class C25790c implements InterfaceC25788a {
    public static final a Companion = new a(null);

    /* renamed from: rg0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // rg0.InterfaceC25788a
    /* renamed from: a */
    public void mo132924a(AbstractC25270e abstractC25270e, InputStream inputStream, OutputStream outputStream) {
        AbstractC19074t.m100208f(abstractC25270e, "key");
        AbstractC19074t.m100208f(inputStream, "input");
        AbstractC19074t.m100208f(outputStream, "output");
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, abstractC25270e.m130788c(), new GCMParameterSpec(128, ((AbstractC25270e.a) abstractC25270e).m130790e()));
            CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, cipher);
            try {
                AbstractC2932a.m13888b(inputStream, cipherOutputStream, 0, 2, null);
                cipherOutputStream.write(((AbstractC25270e.a) abstractC25270e).m130791f());
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(cipherOutputStream, null);
            } finally {
            }
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudFileEncryptionImpl", e11);
            throw e11;
        }
    }

    @Override // rg0.InterfaceC25788a
    /* renamed from: b */
    public AbstractC25270e mo132925b(InputStream inputStream, OutputStream outputStream) {
        byte[] m131327j;
        AbstractC19074t.m100208f(inputStream, "input");
        AbstractC19074t.m100208f(outputStream, "output");
        try {
            C26245a c26245a = C26245a.f124654a;
            SecretKey m134951i = c26245a.m134951i("AES", 256);
            byte[] m134950h = c26245a.m134950h(12);
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, m134950h);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, m134951i, gCMParameterSpec);
            byte[] doFinal = cipher.doFinal(AbstractC2932a.m13889c(inputStream));
            AbstractC19074t.m100205c(doFinal);
            byte[] copyOf = Arrays.copyOf(doFinal, doFinal.length - 16);
            AbstractC19074t.m100207e(copyOf, "copyOf(...)");
            outputStream.write(copyOf);
            m131327j = AbstractC25356m.m131327j(doFinal, doFinal.length - 16, doFinal.length);
            return new AbstractC25270e.a(m134951i, m134950h, m131327j);
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudFileEncryptionImpl", e11);
            throw e11;
        }
    }
}
