package org.bouncycastle.asn1;

import java.io.IOException;
import zn0.InterfaceC32514a;
import zn0.InterfaceC32520g;

/* renamed from: org.bouncycastle.asn1.w */
/* loaded from: classes7.dex */
public class C24470w implements InterfaceC32514a, InterfaceC32520g {

    /* renamed from: a */
    private C24450m f118008a;

    public C24470w(C24450m c24450m) {
        this.f118008a = c24450m;
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return new C24468v(this.f118008a.m127797d());
    }

    @Override // zn0.InterfaceC32514a
    /* renamed from: c */
    public AbstractC24444j mo11996c() {
        try {
            return mo127742b();
        } catch (IOException e11) {
            throw new ASN1ParsingException(e11.getMessage(), e11);
        }
    }
}
