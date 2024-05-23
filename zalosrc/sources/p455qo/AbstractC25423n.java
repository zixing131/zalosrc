package p455qo;

import bo.C2951b1;
import bo.C3000l0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p509sp.C26359h;
import p509sp.C26360i;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo.n */
/* loaded from: classes4.dex */
public abstract class AbstractC25423n {

    /* renamed from: qo.n$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121718t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qo.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32956a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32956a f121719q = new C32956a();

            C32956a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "[INIT FEED FLOW] All data in cache";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qo.n$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Map f121720q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Map map) {
                super(0);
                this.f121720q = map;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                Map map = this.f121720q;
                AbstractC19074t.m100207e(map, "$dataFeed");
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(entry.getKey() + " " + ((C3000l0) entry.getValue()).f11895q + " " + ((C3000l0) entry.getValue()).f11896q0 + "\n");
                }
                return "[INIT FEED FLOW] feed: \n" + arrayList;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qo.n$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ LinkedHashMap f121721q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(LinkedHashMap linkedHashMap) {
                super(0);
                this.f121721q = linkedHashMap;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                LinkedHashMap linkedHashMap = this.f121721q;
                AbstractC19074t.m100207e(linkedHashMap, "$dataFeedOrder");
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(((C2951b1) entry.getValue()).m13974a() + " " + ((C2951b1) entry.getValue()).m13975b() + "\n");
                }
                return "[INIT FEED FLOW] feed order: \n" + arrayList;
            }
        }

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f121718t == 0) {
                AbstractC24862s.m129228b(obj);
                Map m42579x5 = C7960e.m41971c6().m42579x5(CoreUtility.f89233i);
                LinkedHashMap m42358c7 = C7960e.m41971c6().m42358c7(CoreUtility.f89233i);
                C26359h c26359h = C26359h.f125209a;
                c26359h.mo135685a("FEED_TIMELINE", "INIT_TIMELINE_USE_CASE", C32956a.f121719q);
                c26359h.mo135685a("FEED_TIMELINE", "INIT_TIMELINE_USE_CASE", new b(m42579x5));
                c26359h.mo135685a("FEED_TIMELINE", "INIT_TIMELINE_USE_CASE", new c(m42358c7));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final Object m131697a(Continuation continuation) {
        Object m142578e;
        if (C26360i.f125213a.m135694c("FEED_TIMELINE")) {
            Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new a(null), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m112534g == m142578e) {
                return m112534g;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }
}
