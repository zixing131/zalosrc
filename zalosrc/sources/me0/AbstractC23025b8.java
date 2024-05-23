package me0;

import a30.C0102a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23025b8;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: me0.b8 */
/* loaded from: classes4.dex */
public abstract class AbstractC23025b8 {
    public static final a Companion = new a(null);

    /* renamed from: me0.b8$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: me0.b8$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32895a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f112000t;

            /* renamed from: u */
            final /* synthetic */ List f112001u;

            /* renamed from: v */
            final /* synthetic */ InterfaceC27218a f112002v;

            /* renamed from: w */
            final /* synthetic */ long f112003w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC25792a.b f112004x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32895a(List list, InterfaceC27218a interfaceC27218a, long j11, InterfaceC25792a.b bVar, Continuation continuation) {
                super(2, continuation);
                this.f112001u = list;
                this.f112002v = interfaceC27218a;
                this.f112003w = j11;
                this.f112004x = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: t */
            public static final void m118079t(List list, InterfaceC25792a.b bVar, List list2) {
                List list3 = list;
                if (list3 != null && !list3.isEmpty()) {
                    if (list.size() <= list2.size()) {
                        bVar.mo40749n(list, list2.size());
                        return;
                    }
                    return;
                }
                bVar.mo40742g();
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32895a(this.f112001u, this.f112002v, this.f112003w, this.f112004x, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                final ArrayList arrayList;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f112000t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f112001u == null) {
                        return C24848g0.f119245a;
                    }
                    C0102a c0102a = new C0102a();
                    C0102a.a aVar = new C0102a.a(this.f112002v, this.f112001u, this.f112003w);
                    this.f112000t = 1;
                    obj = c0102a.m101498a(aVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                List list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                final InterfaceC25792a.b bVar = this.f112004x;
                final List list2 = this.f112001u;
                AbstractC19444a.m101697e(new Runnable() { // from class: me0.a8
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC23025b8.a.C32895a.m118079t(arrayList, bVar, list2);
                    }
                });
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32895a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m118077a(InterfaceC27218a interfaceC27218a, List list, long j11, InterfaceC25792a.b bVar) {
            AbstractC19074t.m100208f(bVar, "processListener");
            bVar.mo40744i();
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new C32895a(list, interfaceC27218a, j11, bVar, null), 3, null);
        }
    }
}
