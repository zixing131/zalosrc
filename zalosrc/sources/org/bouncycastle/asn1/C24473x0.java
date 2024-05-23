package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.x0 */
/* loaded from: classes7.dex */
public class C24473x0 extends C24442i {
    public C24473x0(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.asn1.C24442i
    /* renamed from: j */
    public void mo127779j(InterfaceC32514a interfaceC32514a) {
        if (interfaceC32514a == null) {
            throw new IOException("null object detected");
        }
        interfaceC32514a.mo11996c().mo127745l().mo127714g(this);
    }
}
