package dl0;

import bl0.AbstractC2838d;
import bl0.C2837c;
import bl0.C2839e;
import bl0.C2842h;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fn0.AbstractC19074t;
import ik0.InterfaceC20578a0;
import kotlin.coroutines.Continuation;
import nk0.C23855s0;
import pm0.AbstractC24862s;
import vk0.C28284f;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import zk0.InterfaceC32222a;

/* renamed from: dl0.a */
/* loaded from: classes7.dex */
public final class C18024a extends AbstractC2838d {

    /* renamed from: dl0.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f91280s;

        /* renamed from: t */
        /* synthetic */ Object f91281t;

        /* renamed from: v */
        int f91283v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f91281t = obj;
            this.f91283v |= Integer.MIN_VALUE;
            return C18024a.this.mo13718g(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18024a(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "zomDocumentInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo13718g(Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        ZOMDocument mo124396d;
        InterfaceC20578a0 interfaceC20578a0;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f91283v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f91283v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f91281t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f91283v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            interfaceC20578a0 = (InterfaceC20578a0) aVar.f91280s;
                            AbstractC24862s.m129228b(obj);
                            C2839e c2839e = (C2839e) obj;
                            return new C2842h((C23855s0) interfaceC20578a0, (ZOMDocument) c2839e.m142538c(), c2839e.m142537b());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                AbstractC24862s.m129228b(obj);
                InterfaceC20578a0 m13699d = ((C2837c) m142531b()).m13699d();
                if (m13699d instanceof ZOMDocument) {
                    aVar.f91283v = 1;
                    obj = m95844h((ZOMDocument) m13699d, aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return obj;
                }
                if ((m13699d instanceof C23855s0) && (mo124396d = ((C23855s0) m13699d).mo124396d()) != null) {
                    aVar.f91280s = m13699d;
                    aVar.f91283v = 2;
                    Object m95844h = m95844h(mo124396d, aVar);
                    if (m95844h == m142578e) {
                        return m142578e;
                    }
                    interfaceC20578a0 = m13699d;
                    obj = m95844h;
                    C2839e c2839e2 = (C2839e) obj;
                    return new C2842h((C23855s0) interfaceC20578a0, (ZOMDocument) c2839e2.m142538c(), c2839e2.m142537b());
                }
                return new C2839e(null, new C28284f(400, "current tree - response empty"), 1, null);
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f91281t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f91283v;
        if (i11 == 0) {
        }
    }

    /* renamed from: h */
    public final Object m95844h(ZOMDocument zOMDocument, Continuation continuation) {
        return new C18025b(zOMDocument, (C2837c) m142531b(), m142532c()).mo13718g(continuation);
    }
}
