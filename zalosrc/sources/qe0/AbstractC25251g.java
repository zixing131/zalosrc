package qe0;

import ae.InterfaceC0765j;
import com.zing.zalo.utils.extensions.ZaloBusinessException;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;

/* renamed from: qe0.g */
/* loaded from: classes4.dex */
public abstract class AbstractC25251g {

    /* renamed from: qe0.g$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f121110a;

        public a(Continuation continuation) {
            this.f121110a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            this.f121110a.mo112492g(C24861r.m129218b(obj));
        }
    }

    /* renamed from: qe0.g$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f121111a;

        public b(Continuation continuation) {
            this.f121111a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Continuation continuation = this.f121111a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ZaloBusinessException(c20096c))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qe0.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f121112s;

        /* renamed from: t */
        int f121113t;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            this.f121112s = obj;
            this.f121113t |= Integer.MIN_VALUE;
            Object m130683c = AbstractC25251g.m130683c(null, null, this);
            m142578e = AbstractC28298d.m142578e();
            return m130683c == m142578e ? m130683c : C24861r.m129217a(m130683c);
        }
    }

    /* renamed from: a */
    public static final void m130681a(InterfaceC0765j interfaceC0765j, InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(interfaceC0765j, "<this>");
        AbstractC19074t.m100208f(interfaceC20094a, "listener");
        InterfaceC20094a mo1741t5 = interfaceC0765j.mo1741t5();
        if (!AbstractC19074t.m100204b(mo1741t5, interfaceC20094a)) {
            if (mo1741t5 instanceof C25252h) {
                ((C25252h) mo1741t5).m130684c(interfaceC20094a);
                return;
            }
            if (mo1741t5 == null) {
                C25252h c25252h = new C25252h();
                c25252h.m130684c(interfaceC20094a);
                interfaceC0765j.mo1704o8(c25252h);
            } else {
                C25252h c25252h2 = new C25252h();
                c25252h2.m130684c(mo1741t5);
                c25252h2.m130684c(interfaceC20094a);
                interfaceC0765j.mo1704o8(c25252h2);
            }
        }
    }

    /* renamed from: b */
    public static final Object m130682b(InterfaceC0765j interfaceC0765j, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        m130681a(interfaceC0765j, new a(c27317h));
        m130681a(interfaceC0765j, new b(c27317h));
        interfaceC18505l.mo205i9(interfaceC0765j);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m130683c(InterfaceC0765j interfaceC0765j, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        try {
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i12 = cVar.f121113t;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    cVar.f121113t = i12 - Integer.MIN_VALUE;
                    Object obj = cVar.f121112s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = cVar.f121113t;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        C24861r.a aVar = C24861r.f119264q;
                        cVar.f121113t = 1;
                        obj = m130682b(interfaceC0765j, interfaceC18505l, cVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24861r.m129218b(obj);
                }
            }
            if (i11 == 0) {
            }
            return C24861r.m129218b(obj);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            return C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f121112s;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f121113t;
    }
}
