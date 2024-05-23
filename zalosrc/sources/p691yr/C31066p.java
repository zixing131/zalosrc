package p691yr;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import p167fs.C19137b;
import p185gc.AbstractC19379c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: yr.p */
/* loaded from: classes4.dex */
public final class C31066p extends AbstractC19379c {

    /* renamed from: a */
    private final C31061k f143223a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yr.p$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f143224s;

        /* renamed from: t */
        /* synthetic */ Object f143225t;

        /* renamed from: v */
        int f143227v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f143225t = obj;
            this.f143227v |= Integer.MIN_VALUE;
            return C31066p.this.mo90291b(this);
        }
    }

    public C31066p(C31061k c31061k) {
        AbstractC19074t.m100208f(c31061k, "repository");
        this.f143223a = c31061k;
    }

    /* renamed from: c */
    private final boolean m150972c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C31058h c31058h = (C31058h) obj;
            if (c31058h.m150899j() > 0 && c31058h.m150898i()) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(Integer.valueOf(((C31058h) obj2).m150899j()))) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.size() == 6) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
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
        C31066p c31066p;
        C31065o c31065o;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f143227v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f143227v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f143225t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f143227v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c31066p = (C31066p) aVar.f143224s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C31061k c31061k = this.f143223a;
                    aVar.f143224s = this;
                    aVar.f143227v = 1;
                    obj = c31061k.m150954b(aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c31066p = this;
                }
                c31065o = (C31065o) obj;
                if (c31065o.m150968c() && !c31066p.m150972c(c31065o.m150971f())) {
                    c31065o = C31065o.m150966b(c31065o, false, 0L, false, C31060j.f143193a.m150945r(), 7, null);
                    C19137b.f95167a.m100444f("FEED_REACTION_CONFIG_USE_CASE", "Server config is invalid - Fallback to default !!!");
                }
                C31060j c31060j = C31060j.f143193a;
                c31060j.m150934L(c31065o);
                c31060j.m150938T();
                return C24848g0.f119245a;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f143225t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f143227v;
        if (i11 == 0) {
        }
        c31065o = (C31065o) obj2;
        if (c31065o.m150968c()) {
            c31065o = C31065o.m150966b(c31065o, false, 0L, false, C31060j.f143193a.m150945r(), 7, null);
            C19137b.f95167a.m100444f("FEED_REACTION_CONFIG_USE_CASE", "Server config is invalid - Fallback to default !!!");
        }
        C31060j c31060j2 = C31060j.f143193a;
        c31060j2.m150934L(c31065o);
        c31060j2.m150938T();
        return C24848g0.f119245a;
    }

    public /* synthetic */ C31066p(C31061k c31061k, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C31061k(null, 1, null) : c31061k);
    }
}
