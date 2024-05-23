package p008a2;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.atomic.AtomicBoolean;
import p119e2.InterfaceC18186k;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: a2.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC0066f0 {

    /* renamed from: a */
    private final AbstractC0086w f279a;

    /* renamed from: b */
    private final AtomicBoolean f280b;

    /* renamed from: c */
    private final InterfaceC24854k f281c;

    /* renamed from: a2.f0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC18186k mo12V4() {
            return AbstractC0066f0.this.m245d();
        }
    }

    public AbstractC0066f0(AbstractC0086w abstractC0086w) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(abstractC0086w, "database");
        this.f279a = abstractC0086w;
        this.f280b = new AtomicBoolean(false);
        m129210a = AbstractC24856m.m129210a(new a());
        this.f281c = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final InterfaceC18186k m245d() {
        return this.f279a.m344g(mo250e());
    }

    /* renamed from: f */
    private final InterfaceC18186k m246f() {
        return (InterfaceC18186k) this.f281c.getValue();
    }

    /* renamed from: g */
    private final InterfaceC18186k m247g(boolean z11) {
        if (z11) {
            return m246f();
        }
        return m245d();
    }

    /* renamed from: b */
    public InterfaceC18186k m248b() {
        m249c();
        return m247g(this.f280b.compareAndSet(false, true));
    }

    /* renamed from: c */
    protected void m249c() {
        this.f279a.m340c();
    }

    /* renamed from: e */
    protected abstract String mo250e();

    /* renamed from: h */
    public void m251h(InterfaceC18186k interfaceC18186k) {
        AbstractC19074t.m100208f(interfaceC18186k, "statement");
        if (interfaceC18186k == m246f()) {
            this.f280b.set(false);
        }
    }
}
