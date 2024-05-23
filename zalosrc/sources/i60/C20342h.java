package i60;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import p511sw.InterfaceC26392a;

/* renamed from: i60.h */
/* loaded from: classes5.dex */
public final class C20342h {

    /* renamed from: a */
    private final InterfaceC26392a f100325a;

    /* renamed from: b */
    private C20343i f100326b;

    public C20342h(InterfaceC26392a interfaceC26392a, C20343i c20343i) {
        AbstractC19074t.m100208f(interfaceC26392a, ZinstantMetaConstant.TARGET_VIEWPORT);
        this.f100325a = interfaceC26392a;
        this.f100326b = c20343i;
    }

    /* renamed from: a */
    public final C20343i m106058a() {
        return this.f100326b;
    }

    /* renamed from: b */
    public final InterfaceC26392a m106059b() {
        return this.f100325a;
    }

    /* renamed from: c */
    public final void m106060c(C20343i c20343i) {
        this.f100326b = c20343i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20342h)) {
            return false;
        }
        C20342h c20342h = (C20342h) obj;
        return AbstractC19074t.m100204b(this.f100325a, c20342h.f100325a) && AbstractC19074t.m100204b(this.f100326b, c20342h.f100326b);
    }

    public int hashCode() {
        int hashCode = this.f100325a.hashCode() * 31;
        C20343i c20343i = this.f100326b;
        return hashCode + (c20343i == null ? 0 : c20343i.hashCode());
    }

    public String toString() {
        return "InitialTargetJump(target=" + this.f100325a + ", extraFlow=" + this.f100326b + ")";
    }
}
