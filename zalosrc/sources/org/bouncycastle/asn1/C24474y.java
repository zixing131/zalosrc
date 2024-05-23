package org.bouncycastle.asn1;

import java.io.IOException;
import zn0.InterfaceC32514a;
import zn0.InterfaceC32520g;

/* renamed from: org.bouncycastle.asn1.y */
/* loaded from: classes7.dex */
public class C24474y implements InterfaceC32514a, InterfaceC32520g {

    /* renamed from: a */
    private boolean f118010a;

    /* renamed from: b */
    private int f118011b;

    /* renamed from: c */
    private C24450m f118012c;

    public C24474y(boolean z11, int i11, C24450m c24450m) {
        this.f118010a = z11;
        this.f118011b = i11;
        this.f118012c = c24450m;
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return this.f118012c.m127796c(this.f118010a, this.f118011b);
    }

    @Override // zn0.InterfaceC32514a
    /* renamed from: c */
    public AbstractC24444j mo11996c() {
        try {
            return mo127742b();
        } catch (IOException e11) {
            throw new ASN1ParsingException(e11.getMessage());
        }
    }
}
