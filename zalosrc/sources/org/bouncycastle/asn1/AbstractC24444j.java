package org.bouncycastle.asn1;

import java.io.IOException;
import zn0.AbstractC32516c;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.j */
/* loaded from: classes7.dex */
public abstract class AbstractC24444j extends AbstractC32516c {
    /* renamed from: i */
    public static AbstractC24444j m127781i(byte[] bArr) {
        try {
            return new C24428d(bArr).m127737r();
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // zn0.AbstractC32516c, zn0.InterfaceC32514a
    /* renamed from: c */
    public AbstractC24444j mo11996c() {
        return this;
    }

    @Override // zn0.AbstractC32516c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC32514a) && mo127713f(((InterfaceC32514a) obj).mo11996c());
    }

    /* renamed from: f */
    abstract boolean mo127713f(AbstractC24444j abstractC24444j);

    /* renamed from: g */
    public abstract void mo127714g(C24442i c24442i);

    /* renamed from: h */
    public abstract int mo127715h();

    @Override // zn0.AbstractC32516c
    public abstract int hashCode();

    /* renamed from: j */
    public abstract boolean mo127716j();

    /* renamed from: k */
    public AbstractC24444j mo127744k() {
        return this;
    }

    /* renamed from: l */
    public AbstractC24444j mo127745l() {
        return this;
    }
}
