package org.bouncycastle.asn1;

import java.io.IOException;
import zn0.C32519f;
import zn0.InterfaceC32514a;
import zn0.InterfaceC32520g;

/* renamed from: org.bouncycastle.asn1.p */
/* loaded from: classes7.dex */
public class C24456p implements InterfaceC32514a, InterfaceC32520g {

    /* renamed from: a */
    private final int f117991a;

    /* renamed from: b */
    private final C24450m f117992b;

    public C24456p(int i11, C24450m c24450m) {
        this.f117991a = i11;
        this.f117992b = c24450m;
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return new C32519f(this.f117991a, this.f117992b.m127797d());
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
