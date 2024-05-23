package p643xf;

/* renamed from: xf.l */
/* loaded from: classes3.dex */
public abstract class AbstractC29619l extends AbstractC29608a {

    /* renamed from: F */
    private AbstractC29608a f136774F;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        if (this.f136774F != null) {
            this.f136774F = null;
        }
    }

    /* renamed from: b0 */
    public void mo147198b0(AbstractC29608a abstractC29608a) {
        this.f136774F = abstractC29608a;
        if (abstractC29608a != null) {
            mo1956Z(abstractC29608a.m1949M(), abstractC29608a.m1948L());
        }
    }

    /* renamed from: c0 */
    public AbstractC29608a mo147199c0() {
        AbstractC29608a abstractC29608a = this.f136774F;
        this.f136774F = null;
        return abstractC29608a;
    }

    /* renamed from: d0 */
    public AbstractC29608a mo147200d0() {
        return this.f136774F;
    }

    /* renamed from: e0 */
    public boolean mo147201e0() {
        return this.f136774F != null;
    }
}
