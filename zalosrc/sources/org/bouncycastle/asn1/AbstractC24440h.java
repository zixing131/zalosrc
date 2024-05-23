package org.bouncycastle.asn1;

import co0.AbstractC3634a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.encoders.AbstractC24478a;
import zn0.InterfaceC32514a;
import zn0.InterfaceC32517d;

/* renamed from: org.bouncycastle.asn1.h */
/* loaded from: classes7.dex */
public abstract class AbstractC24440h extends AbstractC24444j implements InterfaceC32517d {

    /* renamed from: a */
    byte[] f117969a;

    public AbstractC24440h(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f117969a = bArr;
    }

    /* renamed from: m */
    public static AbstractC24440h m127766m(Object obj) {
        if (obj == null || (obj instanceof AbstractC24440h)) {
            return (AbstractC24440h) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m127766m(AbstractC24444j.m127781i((byte[]) obj));
            } catch (IOException e11) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e11.getMessage());
            }
        }
        if (obj instanceof InterfaceC32514a) {
            AbstractC24444j mo11996c = ((InterfaceC32514a) obj).mo11996c();
            if (mo11996c instanceof AbstractC24440h) {
                return (AbstractC24440h) mo11996c;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // zn0.InterfaceC32517d
    /* renamed from: a */
    public InputStream mo127767a() {
        return new ByteArrayInputStream(this.f117969a);
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return mo11996c();
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof AbstractC24440h) {
            return AbstractC3634a.m18318a(this.f117969a, ((AbstractC24440h) abstractC24444j).f117969a);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return AbstractC3634a.m18321d(mo127768n());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: k */
    public AbstractC24444j mo127744k() {
        return new C24447k0(this.f117969a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: l */
    public AbstractC24444j mo127745l() {
        return new C24447k0(this.f117969a);
    }

    /* renamed from: n */
    public byte[] mo127768n() {
        return this.f117969a;
    }

    public String toString() {
        return "#" + new String(AbstractC24478a.m127816a(this.f117969a));
    }
}
