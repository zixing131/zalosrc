package org.bouncycastle.asn1;

import java.io.IOException;
import zn0.InterfaceC32514a;
import zn0.InterfaceC32520g;

/* renamed from: org.bouncycastle.asn1.r0 */
/* loaded from: classes7.dex */
public class C24461r0 implements InterfaceC32514a, InterfaceC32520g {

    /* renamed from: a */
    private C24450m f118000a;

    public C24461r0(C24450m c24450m) {
        this.f118000a = c24450m;
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return new C24459q0(this.f118000a.m127797d(), false);
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
