package p321le;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ie.C20525a;
import je.C21228a;
import ke.InterfaceC21698a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p185gc.AbstractC19383g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: le.b */
/* loaded from: classes3.dex */
public final class C22451b extends AbstractC19383g {

    /* renamed from: a */
    private final InterfaceC21698a f109811a;

    /* renamed from: le.b$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo73846a(C21228a c21228a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: le.b$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f109812t;

        /* renamed from: u */
        Object f109813u;

        /* renamed from: v */
        Object f109814v;

        /* renamed from: w */
        int f109815w;

        /* renamed from: y */
        final /* synthetic */ a f109817y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f109817y = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f109817y, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00f4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00f5  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C21228a mo106620a;
            a aVar;
            C22451b c22451b;
            String str;
            C22451b c22451b2;
            a aVar2;
            Object obj2;
            Object obj3;
            C21228a c21228a;
            InterfaceC21698a interfaceC21698a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109815w;
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                obj3 = this.f109812t;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            obj2 = this.f109814v;
                            c22451b2 = (C22451b) this.f109813u;
                            aVar2 = (a) this.f109812t;
                            AbstractC24862s.m129228b(obj);
                            c21228a = (C21228a) obj;
                            aVar2.mo73846a(c21228a);
                            interfaceC21698a = c22451b2.f109811a;
                            this.f109812t = obj2;
                            this.f109813u = obj;
                            this.f109814v = null;
                            this.f109815w = 4;
                            if (interfaceC21698a.mo106627h(c21228a, this) != m142578e) {
                                return m142578e;
                            }
                            obj3 = obj2;
                            obj = obj3;
                            return C24848g0.f119245a;
                        }
                    } else {
                        obj3 = this.f109812t;
                    }
                    AbstractC24862s.m129228b(obj);
                    obj = obj3;
                    return C24848g0.f119245a;
                }
                mo106620a = (C21228a) this.f109814v;
                c22451b = (C22451b) this.f109813u;
                aVar = (a) this.f109812t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                mo106620a = C22451b.this.f109811a.mo106620a();
                a aVar3 = this.f109817y;
                C22451b c22451b3 = C22451b.this;
                if (mo106620a != null) {
                    aVar3.mo73846a(mo106620a);
                }
                InterfaceC21698a interfaceC21698a2 = c22451b3.f109811a;
                this.f109812t = aVar3;
                this.f109813u = c22451b3;
                this.f109814v = mo106620a;
                this.f109815w = 1;
                Object mo106625f = interfaceC21698a2.mo106625f(3, this);
                if (mo106625f == m142578e) {
                    return m142578e;
                }
                aVar = aVar3;
                obj = mo106625f;
                c22451b = c22451b3;
            }
            int abs = Math.abs(Integer.parseInt((String) obj));
            if (AbstractC19074t.m100204b(String.valueOf(abs), "0")) {
                C21228a mo106626g = c22451b.f109811a.mo106626g();
                aVar.mo73846a(mo106626g);
                InterfaceC21698a interfaceC21698a3 = c22451b.f109811a;
                this.f109812t = obj;
                this.f109813u = mo106626g;
                this.f109814v = null;
                this.f109815w = 2;
                if (interfaceC21698a3.mo106627h(mo106626g, this) == m142578e) {
                    return m142578e;
                }
                obj3 = obj;
                obj = obj3;
                return C24848g0.f119245a;
            }
            if (mo106620a != null) {
                str = mo106620a.m110002b();
            } else {
                str = null;
            }
            if (!AbstractC19074t.m100204b(str, String.valueOf(abs))) {
                InterfaceC21698a interfaceC21698a4 = c22451b.f109811a;
                this.f109812t = aVar;
                this.f109813u = c22451b;
                this.f109814v = obj;
                this.f109815w = 3;
                Object mo106621b = interfaceC21698a4.mo106621b(abs, this);
                if (mo106621b == m142578e) {
                    return m142578e;
                }
                c22451b2 = c22451b;
                aVar2 = aVar;
                obj2 = obj;
                obj = mo106621b;
                c21228a = (C21228a) obj;
                aVar2.mo73846a(c21228a);
                interfaceC21698a = c22451b2.f109811a;
                this.f109812t = obj2;
                this.f109813u = obj;
                this.f109814v = null;
                this.f109815w = 4;
                if (interfaceC21698a.mo106627h(c21228a, this) != m142578e) {
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C22451b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new b(aVar, null), 3, null);
    }

    public C22451b(InterfaceC21698a interfaceC21698a) {
        AbstractC19074t.m100208f(interfaceC21698a, "repo");
        this.f109811a = interfaceC21698a;
    }

    public /* synthetic */ C22451b(InterfaceC21698a interfaceC21698a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C20525a() : interfaceC21698a);
    }
}
