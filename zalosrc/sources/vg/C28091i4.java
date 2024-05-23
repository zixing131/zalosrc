package vg;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import in.C20629c;
import in.InterfaceC20633g;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mm0.AbstractC23352g;
import org.json.JSONObject;
import p185gc.AbstractC19384h;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vg.C28101j4;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: vg.i4 */
/* loaded from: classes3.dex */
public final class C28091i4 extends AbstractC19384h {

    /* renamed from: vg.i4$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f131040a;

        /* renamed from: b */
        private final InterfaceC25792a.b f131041b;

        /* renamed from: c */
        private final InterfaceC27218a f131042c;

        /* renamed from: d */
        private final InterfaceC20633g f131043d;

        public a(String str, InterfaceC25792a.b bVar, InterfaceC27218a interfaceC27218a, InterfaceC20633g interfaceC20633g) {
            AbstractC19074t.m100208f(str, "mediaUrl");
            AbstractC19074t.m100208f(interfaceC20633g, "listener");
            this.f131040a = str;
            this.f131041b = bVar;
            this.f131042c = interfaceC27218a;
            this.f131043d = interfaceC20633g;
        }

        /* renamed from: a */
        public final InterfaceC27218a m141555a() {
            return this.f131042c;
        }

        /* renamed from: b */
        public final InterfaceC20633g m141556b() {
            return this.f131043d;
        }

        /* renamed from: c */
        public final String m141557c() {
            return this.f131040a;
        }

        /* renamed from: d */
        public final InterfaceC25792a.b m141558d() {
            return this.f131041b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f131040a, aVar.f131040a) && AbstractC19074t.m100204b(this.f131041b, aVar.f131041b) && AbstractC19074t.m100204b(this.f131042c, aVar.f131042c) && AbstractC19074t.m100204b(this.f131043d, aVar.f131043d);
        }

        public int hashCode() {
            int hashCode = this.f131040a.hashCode() * 31;
            InterfaceC25792a.b bVar = this.f131041b;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            InterfaceC27218a interfaceC27218a = this.f131042c;
            return ((hashCode2 + (interfaceC27218a != null ? interfaceC27218a.hashCode() : 0)) * 31) + this.f131043d.hashCode();
        }

        public String toString() {
            return "Params(mediaUrl=" + this.f131040a + ", processListener=" + this.f131041b + ", act=" + this.f131042c + ", listener=" + this.f131043d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.i4$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f131044t;

        /* renamed from: u */
        final /* synthetic */ a f131045u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: vg.i4$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ a f131046p;

            a(a aVar) {
                this.f131046p = aVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C28101j4.a aVar, Continuation continuation) {
                if (aVar instanceof C28101j4.a.b) {
                    if (this.f131046p.m141558d() != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("progress", 0);
                            jSONObject.put("mediaUrl", this.f131046p.m141557c());
                            jSONObject.put("id", this.f131046p.m141557c());
                            this.f131046p.m141558d().mo40737b(jSONObject);
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                        }
                    }
                    String m104825D = AbstractC20130d.m104825D();
                    AbstractC19074t.m100207e(m104825D, "getDownloadExternalOrInternalStorageDirectory(...)");
                    File file = new File(m104825D, AbstractC23352g.m122788d(this.f131046p.m141557c()) + "." + ((C28101j4.a.b) aVar).m141573a());
                    C20629c m107461a = C20629c.Companion.m107461a();
                    String m141557c = this.f131046p.m141557c();
                    String absolutePath = file.getAbsolutePath();
                    AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
                    m107461a.m107458r(m141557c, absolutePath, this.f131046p.m141557c(), this.f131046p.m141556b(), false, "");
                } else {
                    ToastUtils.showMess(this.f131046p.m141555a().getString(AbstractC8020f0.unknown_error));
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f131045u = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f131045u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f131044t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = (Flow) new C28101j4(this.f131045u.m141557c()).m101506a();
                if (flow != null) {
                    a aVar = new a(this.f131045u);
                    this.f131044t = 1;
                    if (flow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
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

    @Override // p185gc.AbstractC19384h
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo13388b(Object obj) {
        m141554c((a) obj);
        return C24848g0.f119245a;
    }

    /* renamed from: c */
    protected void m141554c(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        if (aVar.m141555a() != null) {
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new b(aVar, null), 3, null);
        }
    }
}
