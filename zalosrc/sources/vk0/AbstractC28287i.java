package vk0;

import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import zk0.InterfaceC32222a;

/* renamed from: vk0.i */
/* loaded from: classes7.dex */
public abstract class AbstractC28287i implements InterfaceC28286h {

    /* renamed from: a */
    private final InterfaceC28285g f131967a;

    /* renamed from: b */
    private final InterfaceC32222a f131968b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vk0.i$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f131969s;

        /* renamed from: t */
        /* synthetic */ Object f131970t;

        /* renamed from: v */
        int f131972v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f131970t = obj;
            this.f131972v |= Integer.MIN_VALUE;
            return AbstractC28287i.this.mo142530a(this);
        }
    }

    public AbstractC28287i(InterfaceC28285g interfaceC28285g, InterfaceC32222a interfaceC32222a) {
        AbstractC19074t.m100208f(interfaceC28285g, "info");
        this.f131967a = interfaceC28285g;
        this.f131968b = interfaceC32222a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // vk0.InterfaceC28286h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo142530a(Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        AbstractC28287i abstractC28287i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f131972v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f131972v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f131970t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f131972v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        abstractC28287i = (AbstractC28287i) aVar.f131969s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m142534e();
                    aVar.f131969s = this;
                    aVar.f131972v = 1;
                    obj = mo13718g(aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    abstractC28287i = this;
                }
                AbstractC28288j abstractC28288j = (AbstractC28288j) obj;
                abstractC28287i.m142535f();
                return abstractC28288j;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f131970t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f131972v;
        if (i11 == 0) {
        }
        AbstractC28288j abstractC28288j2 = (AbstractC28288j) obj2;
        abstractC28287i.m142535f();
        return abstractC28288j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final InterfaceC28285g m142531b() {
        return this.f131967a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final InterfaceC32222a m142532c() {
        return this.f131968b;
    }

    /* renamed from: d */
    public final void m142533d(String str) {
        AbstractC19074t.m100208f(str, "msg");
        InterfaceC32222a interfaceC32222a = this.f131968b;
        if (interfaceC32222a != null) {
            interfaceC32222a.mo2759a(str);
        }
    }

    /* renamed from: e */
    public void m142534e() {
        InterfaceC32222a interfaceC32222a = this.f131968b;
        if (interfaceC32222a != null) {
            interfaceC32222a.mo2760b(this);
        }
    }

    /* renamed from: f */
    public void m142535f() {
        InterfaceC32222a interfaceC32222a = this.f131968b;
        if (interfaceC32222a != null) {
            interfaceC32222a.mo2761c(this);
        }
    }

    /* renamed from: g */
    public abstract Object mo13718g(Continuation continuation);
}
