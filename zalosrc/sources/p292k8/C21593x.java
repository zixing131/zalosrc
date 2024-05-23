package p292k8;

import p292k8.AbstractC21573d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k8.x */
/* loaded from: classes.dex */
public final class C21593x extends AbstractC21573d0 {

    /* renamed from: a */
    private final AbstractC21573d0.a f104926a;

    /* renamed from: b */
    private final AbstractC21573d0.c f104927b;

    /* renamed from: c */
    private final AbstractC21573d0.b f104928c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21593x(AbstractC21573d0.a aVar, AbstractC21573d0.c cVar, AbstractC21573d0.b bVar) {
        if (aVar != null) {
            this.f104926a = aVar;
            if (cVar != null) {
                this.f104927b = cVar;
                if (bVar != null) {
                    this.f104928c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // p292k8.AbstractC21573d0
    /* renamed from: a */
    public AbstractC21573d0.a mo111498a() {
        return this.f104926a;
    }

    @Override // p292k8.AbstractC21573d0
    /* renamed from: c */
    public AbstractC21573d0.b mo111499c() {
        return this.f104928c;
    }

    @Override // p292k8.AbstractC21573d0
    /* renamed from: d */
    public AbstractC21573d0.c mo111500d() {
        return this.f104927b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21573d0)) {
            return false;
        }
        AbstractC21573d0 abstractC21573d0 = (AbstractC21573d0) obj;
        if (this.f104926a.equals(abstractC21573d0.mo111498a()) && this.f104927b.equals(abstractC21573d0.mo111500d()) && this.f104928c.equals(abstractC21573d0.mo111499c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f104926a.hashCode() ^ 1000003) * 1000003) ^ this.f104927b.hashCode()) * 1000003) ^ this.f104928c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f104926a + ", osData=" + this.f104927b + ", deviceData=" + this.f104928c + "}";
    }
}
