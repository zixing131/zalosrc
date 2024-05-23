package p455qo;

import ag0.C0824j;
import am.AbstractC0939u;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import p185gc.AbstractC19379c;
import p302ko.C21785g;
import p398oo.C24371m0;
import p398oo.InterfaceC24374o;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: qo.f */
/* loaded from: classes4.dex */
public final class C25407f extends AbstractC19379c {

    /* renamed from: a */
    private final InterfaceC24374o f121644a;

    /* renamed from: b */
    private final C21785g f121645b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f121646s;

        /* renamed from: t */
        /* synthetic */ Object f121647t;

        /* renamed from: v */
        int f121649v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121647t = obj;
            this.f121649v |= Integer.MIN_VALUE;
            return C25407f.this.mo90291b(this);
        }
    }

    /* renamed from: qo.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC0939u {
        b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C21785g c21785g = C25407f.this.f121645b;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            c21785g.mo112424y(str);
        }
    }

    public /* synthetic */ C25407f(InterfaceC24374o interfaceC24374o, C21785g c21785g, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o, (i11 & 2) != 0 ? C21785g.Companion.m112431a() : c21785g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object mo90291b(Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        C25407f c25407f;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f121649v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f121649v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f121647t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f121649v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c25407f = (C25407f) aVar.f121646s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    this.f121644a.mo127469a();
                    InterfaceC24374o interfaceC24374o = this.f121644a;
                    aVar.f121646s = this;
                    aVar.f121649v = 1;
                    if (interfaceC24374o.mo127470b(aVar) == m142578e) {
                        return m142578e;
                    }
                    c25407f = this;
                }
                C0824j.m2153b(new b());
                return C24848g0.f119245a;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f121647t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f121649v;
        if (i11 == 0) {
        }
        C0824j.m2153b(new b());
        return C24848g0.f119245a;
    }

    public C25407f(InterfaceC24374o interfaceC24374o, C21785g c21785g) {
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        AbstractC19074t.m100208f(c21785g, "profileFeedRepo");
        this.f121644a = interfaceC24374o;
        this.f121645b = c21785g;
    }
}
