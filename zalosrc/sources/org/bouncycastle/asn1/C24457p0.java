package org.bouncycastle.asn1;

import java.io.IOException;
import zn0.InterfaceC32518e;

/* renamed from: org.bouncycastle.asn1.p0 */
/* loaded from: classes7.dex */
public class C24457p0 implements InterfaceC32518e {

    /* renamed from: a */
    private C24450m f117993a;

    public C24457p0(C24450m c24450m) {
        this.f117993a = c24450m;
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return new C24455o0(this.f117993a.m127797d());
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
