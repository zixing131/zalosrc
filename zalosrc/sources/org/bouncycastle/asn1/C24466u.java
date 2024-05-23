package org.bouncycastle.asn1;

import java.io.IOException;
import zn0.InterfaceC32518e;

/* renamed from: org.bouncycastle.asn1.u */
/* loaded from: classes7.dex */
public class C24466u implements InterfaceC32518e {

    /* renamed from: a */
    private C24450m f118004a;

    public C24466u(C24450m c24450m) {
        this.f118004a = c24450m;
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return new C24464t(this.f118004a.m127797d());
    }

    @Override // zn0.InterfaceC32514a
    /* renamed from: c */
    public AbstractC24444j mo11996c() {
        try {
            return mo127742b();
        } catch (IOException e11) {
            throw new IllegalStateException(e11.getMessage());
        }
    }
}
