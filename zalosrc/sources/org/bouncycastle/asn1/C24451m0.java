package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.m0 */
/* loaded from: classes7.dex */
public class C24451m0 extends C24442i {
    public C24451m0(OutputStream outputStream) {
        super(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.C24442i
    /* renamed from: a */
    public C24442i mo127770a() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.C24442i
    /* renamed from: b */
    public C24442i mo127771b() {
        return this;
    }

    @Override // org.bouncycastle.asn1.C24442i
    /* renamed from: j */
    public void mo127779j(InterfaceC32514a interfaceC32514a) {
        if (interfaceC32514a == null) {
            throw new IOException("null object detected");
        }
        interfaceC32514a.mo11996c().mo127744k().mo127714g(this);
    }
}
