package zn0;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.AbstractC24444j;
import org.bouncycastle.asn1.C24442i;
import org.bouncycastle.asn1.C24451m0;
import org.bouncycastle.asn1.C24473x0;

/* renamed from: zn0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC32516c implements InterfaceC32514a {
    @Override // zn0.InterfaceC32514a
    /* renamed from: c */
    public abstract AbstractC24444j mo11996c();

    /* renamed from: d */
    public byte[] m157481d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C24442i(byteArrayOutputStream).mo127779j(this);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    public byte[] m157482e(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (str.equals("DER")) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            new C24451m0(byteArrayOutputStream).mo127779j(this);
        } else {
            if (!str.equals("DL")) {
                return m157481d();
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            new C24473x0(byteArrayOutputStream).mo127779j(this);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC32514a) {
            return mo11996c().equals(((InterfaceC32514a) obj).mo11996c());
        }
        return false;
    }

    public int hashCode() {
        return mo11996c().hashCode();
    }
}
