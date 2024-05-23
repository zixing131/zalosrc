package p228i4;

import p010a4.AbstractC0116i;
import p010a4.AbstractC0123p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i4.b */
/* loaded from: classes.dex */
public final class C20226b extends AbstractC20244k {

    /* renamed from: a */
    private final long f100102a;

    /* renamed from: b */
    private final AbstractC0123p f100103b;

    /* renamed from: c */
    private final AbstractC0116i f100104c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20226b(long j11, AbstractC0123p abstractC0123p, AbstractC0116i abstractC0116i) {
        this.f100102a = j11;
        if (abstractC0123p != null) {
            this.f100103b = abstractC0123p;
            if (abstractC0116i != null) {
                this.f100104c = abstractC0116i;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // p228i4.AbstractC20244k
    /* renamed from: b */
    public AbstractC0116i mo105713b() {
        return this.f100104c;
    }

    @Override // p228i4.AbstractC20244k
    /* renamed from: c */
    public long mo105714c() {
        return this.f100102a;
    }

    @Override // p228i4.AbstractC20244k
    /* renamed from: d */
    public AbstractC0123p mo105715d() {
        return this.f100103b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20244k)) {
            return false;
        }
        AbstractC20244k abstractC20244k = (AbstractC20244k) obj;
        if (this.f100102a == abstractC20244k.mo105714c() && this.f100103b.equals(abstractC20244k.mo105715d()) && this.f100104c.equals(abstractC20244k.mo105713b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f100102a;
        return this.f100104c.hashCode() ^ ((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f100103b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f100102a + ", transportContext=" + this.f100103b + ", event=" + this.f100104c + "}";
    }
}
