package org.bouncycastle.asn1;

import java.io.IOException;
import zn0.InterfaceC32514a;
import zn0.InterfaceC32520g;

/* renamed from: org.bouncycastle.asn1.e0 */
/* loaded from: classes7.dex */
public class C24432e0 implements InterfaceC32514a, InterfaceC32520g {

    /* renamed from: a */
    private C24450m f117958a;

    public C24432e0(C24450m c24450m) {
        this.f117958a = c24450m;
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        try {
            return new C24429d0(this.f117958a.m127797d());
        } catch (IllegalArgumentException e11) {
            throw new ASN1Exception(e11.getMessage(), e11);
        }
    }

    @Override // zn0.InterfaceC32514a
    /* renamed from: c */
    public AbstractC24444j mo11996c() {
        try {
            return mo127742b();
        } catch (IOException e11) {
            throw new ASN1ParsingException("unable to get DER object", e11);
        } catch (IllegalArgumentException e12) {
            throw new ASN1ParsingException("unable to get DER object", e12);
        }
    }
}
