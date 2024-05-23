package vk0;

import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import xk0.C29699f;
import zk0.InterfaceC32222a;

/* renamed from: vk0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC28282d extends AbstractC28287i {

    /* renamed from: vk0.d$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f131957s;

        /* renamed from: t */
        /* synthetic */ Object f131958t;

        /* renamed from: v */
        int f131960v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f131958t = obj;
            this.f131960v |= Integer.MIN_VALUE;
            return AbstractC28282d.this.mo13718g(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC28282d(InterfaceC28285g interfaceC28285g, InterfaceC32222a interfaceC32222a) {
        super(interfaceC28285g, interfaceC32222a);
        AbstractC19074t.m100208f(interfaceC28285g, "info");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo13718g(Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        AbstractC28282d abstractC28282d;
        AbstractC28288j abstractC28288j;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f131960v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f131960v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f131958t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f131960v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        abstractC28282d = (AbstractC28282d) aVar.f131957s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C29699f m142526h = m142526h();
                    mo18152i(m142526h);
                    aVar.f131957s = this;
                    aVar.f131960v = 1;
                    obj = m142526h.m147693b(aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    abstractC28282d = this;
                }
                abstractC28288j = (AbstractC28288j) obj;
                if (abstractC28288j == null) {
                    return abstractC28288j;
                }
                return abstractC28282d.mo18153j();
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f131958t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f131960v;
        if (i11 == 0) {
        }
        abstractC28288j = (AbstractC28288j) obj2;
        if (abstractC28288j == null) {
        }
    }

    /* renamed from: h */
    public final C29699f m142526h() {
        return new C29699f(null, 1, null);
    }

    /* renamed from: i */
    public abstract void mo18152i(C29699f c29699f);

    /* renamed from: j */
    public abstract AbstractC28288j mo18153j();
}
