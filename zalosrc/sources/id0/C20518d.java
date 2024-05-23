package id0;

import kd0.C21693c;

/* renamed from: id0.d */
/* loaded from: classes4.dex */
public class C20518d extends C20516b {

    /* renamed from: i */
    private C21693c.e f100805i;

    /* renamed from: j */
    private boolean f100806j;

    public C20518d() {
        m106593j(150L);
        C21693c.e eVar = new C21693c.e();
        this.f100805i = eVar;
        eVar.f100807a = Float.valueOf(0.0f);
        this.f100805i.f100808b = Float.valueOf(1.0f);
        this.f100798c.add(this.f100805i);
    }

    /* renamed from: o */
    public C20518d m106599o(boolean z11) {
        this.f100806j = z11;
        return this;
    }

    @Override // id0.C20516b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C20518d mo106587c(float f11) {
        this.f100805i.f100807a = Float.valueOf(f11);
        return this;
    }

    /* renamed from: q */
    public boolean m106601q() {
        return this.f100806j;
    }

    @Override // id0.C20516b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C20518d mo106594k(float f11) {
        this.f100805i.f100808b = Float.valueOf(f11);
        return this;
    }
}
