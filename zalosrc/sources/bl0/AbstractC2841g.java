package bl0;

import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vk0.C28284f;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import zk0.InterfaceC32222a;

/* renamed from: bl0.g */
/* loaded from: classes7.dex */
public abstract class AbstractC2841g extends AbstractC2838d {

    /* renamed from: bl0.g$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f11338s;

        /* renamed from: t */
        /* synthetic */ Object f11339t;

        /* renamed from: v */
        int f11341v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f11339t = obj;
            this.f11341v |= Integer.MIN_VALUE;
            return AbstractC2841g.this.mo13718g(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2841g(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "info");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
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
        AbstractC2841g abstractC2841g;
        C2839e c2839e;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f11341v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f11341v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f11339t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f11341v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        abstractC2841g = (AbstractC2841g) aVar.f11338s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    aVar.f11338s = this;
                    aVar.f11341v = 1;
                    obj = mo13721j(aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    abstractC2841g = this;
                }
                c2839e = (C2839e) obj;
                if (c2839e.mo13723d()) {
                    c2839e = abstractC2841g.m13719h(c2839e);
                }
                if (!c2839e.mo13723d()) {
                    return abstractC2841g.m13722k(c2839e);
                }
                return c2839e;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f11339t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f11341v;
        if (i11 == 0) {
        }
        c2839e = (C2839e) obj2;
        if (c2839e.mo13723d()) {
        }
        if (!c2839e.mo13723d()) {
        }
    }

    /* renamed from: h */
    public final C2839e m13719h(C2839e c2839e) {
        AbstractC19074t.m100208f(c2839e, "documentResponse");
        if (((C2837c) m142531b()).m13701f().m99716a()) {
            c2839e.m142538c();
            Object m142538c = c2839e.m142538c();
            AbstractC19074t.m100206d(m142538c, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.node.ZOMDocument");
            m13720i((ZOMDocument) m142538c);
            return c2839e;
        }
        return new C2839e(null, new C28284f(405, "verify - environment may have changed"), 1, null);
    }

    /* renamed from: i */
    public final void m13720i(ZOMDocument zOMDocument) {
        AbstractC19074t.m100208f(zOMDocument, "document");
        zOMDocument.setPreferredZinstantDataId(((C2837c) m142531b()).m13703h().m99738h());
        zOMDocument.setIdentifyKey(((C2837c) m142531b()).m13703h().m99735e());
        ((C2837c) m142531b()).m13714t(zOMDocument);
    }

    /* renamed from: j */
    public abstract Object mo13721j(Continuation continuation);

    /* renamed from: k */
    public final C2839e m13722k(C2839e c2839e) {
        AbstractC19074t.m100208f(c2839e, "response");
        ZOMDocument zOMDocument = (ZOMDocument) c2839e.m142538c();
        if (zOMDocument != null) {
            if (zOMDocument.isRequireResources()) {
                return new C2839e(null, new C28284f(402, "verify - missing resources"), 1, null);
            }
            if (zOMDocument.checkIntegrity(((C2837c) m142531b()).m13701f().m99727l(), ((C2837c) m142531b()).m13701f().m99720e(), ((C2837c) m142531b()).m13701f().m99722g(), ((C2837c) m142531b()).m13701f().m99726k(), ((C2837c) m142531b()).m13701f().m99721f(), ((C2837c) m142531b()).m13703h().m99731a())) {
                return c2839e;
            }
            return new C2839e(null, new C28284f(405, "verify - integrity failure"), 1, null);
        }
        return new C2839e(null, new C28284f(400, "verify - document was null"), 1, null);
    }
}
