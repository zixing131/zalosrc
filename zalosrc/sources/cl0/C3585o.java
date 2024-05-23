package cl0;

import bl0.AbstractC2838d;
import bl0.C2837c;
import bl0.C2839e;
import el0.C18485e;
import el0.C18486f;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import zk0.InterfaceC32222a;

/* renamed from: cl0.o */
/* loaded from: classes7.dex */
public final class C3585o extends AbstractC2838d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cl0.o$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f15149s;

        /* renamed from: t */
        /* synthetic */ Object f15150t;

        /* renamed from: v */
        int f15152v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15150t = obj;
            this.f15152v |= Integer.MIN_VALUE;
            return C3585o.this.mo13718g(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3585o(C2837c c2837c, InterfaceC32222a interfaceC32222a) {
        super(c2837c, interfaceC32222a);
        AbstractC19074t.m100208f(c2837c, "info");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
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
        C3585o c3585o;
        C18486f c18486f;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f15152v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f15152v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f15150t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f15152v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3585o = (C3585o) aVar.f15149s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    aVar.f15149s = this;
                    aVar.f15152v = 1;
                    obj = m18189i(aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c3585o = this;
                }
                c18486f = (C18486f) obj;
                if (!c18486f.mo13723d()) {
                    aVar.f15149s = null;
                    aVar.f15152v = 2;
                    obj = c3585o.m18188h(aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return obj;
                }
                return c3585o.m18190j(c18486f);
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f15150t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f15152v;
        if (i11 == 0) {
        }
        c18486f = (C18486f) obj2;
        if (!c18486f.mo13723d()) {
        }
    }

    /* renamed from: h */
    public final Object m18188h(Continuation continuation) {
        return new C3574d((C2837c) m142531b(), m142532c()).mo18187a(continuation);
    }

    /* renamed from: i */
    public final Object m18189i(Continuation continuation) {
        return new C18485e((C2837c) m142531b(), m142532c()).mo18187a(continuation);
    }

    /* renamed from: j */
    public final C2839e m18190j(C18486f c18486f) {
        AbstractC19074t.m100208f(c18486f, "response");
        return new C2839e(null, c18486f.m142537b(), 1, 0 == true ? 1 : 0);
    }
}
