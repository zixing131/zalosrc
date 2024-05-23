package p665y0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: y0.a */
/* loaded from: classes.dex */
public class C30239a extends C30245g implements Map {

    /* renamed from: w */
    AbstractC30244f f140444w;

    /* renamed from: y0.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC30244f {
        a() {
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: a */
        protected void mo149099a() {
            C30239a.this.clear();
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: b */
        protected Object mo149100b(int i11, int i12) {
            return C30239a.this.f140493q[(i11 << 1) + i12];
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: c */
        protected Map mo149101c() {
            return C30239a.this;
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: d */
        protected int mo149102d() {
            return C30239a.this.f140494r;
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: e */
        protected int mo149103e(Object obj) {
            return C30239a.this.m149160f(obj);
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: f */
        protected int mo149104f(Object obj) {
            return C30239a.this.m149162h(obj);
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: g */
        protected void mo149105g(Object obj, Object obj2) {
            C30239a.this.put(obj, obj2);
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: h */
        protected void mo149106h(int i11) {
            C30239a.this.m149165l(i11);
        }

        @Override // p665y0.AbstractC30244f
        /* renamed from: i */
        protected Object mo149107i(int i11, Object obj) {
            return C30239a.this.m149166n(i11, obj);
        }
    }

    public C30239a() {
    }

    /* renamed from: p */
    private AbstractC30244f m149097p() {
        if (this.f140444w == null) {
            this.f140444w = new a();
        }
        return this.f140444w;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return m149097p().m149148l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return m149097p().m149149m();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        m149158c(this.f140494r + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: q */
    public boolean m149098q(Collection collection) {
        return AbstractC30244f.m149147p(this, collection);
    }

    @Override // java.util.Map
    public Collection values() {
        return m149097p().m149150n();
    }

    public C30239a(int i11) {
        super(i11);
    }

    public C30239a(C30245g c30245g) {
        super(c30245g);
    }
}
