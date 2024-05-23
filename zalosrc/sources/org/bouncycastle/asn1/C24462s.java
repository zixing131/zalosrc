package org.bouncycastle.asn1;

import eo0.AbstractC18530a;
import java.io.IOException;
import java.io.InputStream;
import zn0.InterfaceC32517d;

/* renamed from: org.bouncycastle.asn1.s */
/* loaded from: classes7.dex */
public class C24462s implements InterfaceC32517d {

    /* renamed from: a */
    private C24450m f118001a;

    public C24462s(C24450m c24450m) {
        this.f118001a = c24450m;
    }

    @Override // zn0.InterfaceC32517d
    /* renamed from: a */
    public InputStream mo127767a() {
        return new C24476z(this.f118001a);
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return new C24460r(AbstractC18530a.m97919b(mo127767a()));
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
