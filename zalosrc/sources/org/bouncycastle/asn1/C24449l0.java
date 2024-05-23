package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import zn0.InterfaceC32517d;

/* renamed from: org.bouncycastle.asn1.l0 */
/* loaded from: classes7.dex */
public class C24449l0 implements InterfaceC32517d {

    /* renamed from: a */
    private C24424b1 f117980a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24449l0(C24424b1 c24424b1) {
        this.f117980a = c24424b1;
    }

    @Override // zn0.InterfaceC32517d
    /* renamed from: a */
    public InputStream mo127767a() {
        return this.f117980a;
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return new C24447k0(this.f117980a.m127720c());
    }

    @Override // zn0.InterfaceC32514a
    /* renamed from: c */
    public AbstractC24444j mo11996c() {
        try {
            return mo127742b();
        } catch (IOException e11) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e11.getMessage(), e11);
        }
    }
}
