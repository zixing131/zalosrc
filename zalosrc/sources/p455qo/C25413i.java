package p455qo;

import am.AbstractC0924m0;
import androidx.work.AbstractC2144f;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p173fz.C19172a;
import p185gc.AbstractC19379c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo.i */
/* loaded from: classes4.dex */
public final class C25413i extends AbstractC19379c {

    /* renamed from: qo.i$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final boolean f121665a;

        /* renamed from: b */
        private final String f121666b;

        public a(boolean z11, String str) {
            this.f121665a = z11;
            this.f121666b = str;
        }

        /* renamed from: a */
        public final String m131655a() {
            return this.f121666b;
        }

        /* renamed from: b */
        public final boolean m131656b() {
            return this.f121665a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f121665a == aVar.f121665a && AbstractC19074t.m100204b(this.f121666b, aVar.f121666b);
        }

        public int hashCode() {
            int m11520a = AbstractC2144f.m11520a(this.f121665a) * 31;
            String str = this.f121666b;
            return m11520a + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MiniSurveyConfigResult(isEnable=" + this.f121665a + ", configString=" + this.f121666b + ")";
        }
    }

    /* renamed from: qo.i$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121667t;

        /* renamed from: u */
        private /* synthetic */ Object f121668u;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f121668u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0064 A[Catch: Exception -> 0x005b, TryCatch #1 {Exception -> 0x005b, blocks: (B:23:0x0042, B:25:0x0048, B:28:0x0051, B:32:0x005e, B:34:0x0064, B:36:0x006a, B:37:0x0070), top: B:22:0x0042 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x007f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            boolean z11;
            a aVar;
            boolean z12;
            a aVar2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121667t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        e = (Exception) this.f121668u;
                        AbstractC24862s.m129228b(obj);
                        AbstractC23350e.m122778h(e);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    FlowCollector flowCollector2 = (FlowCollector) this.f121668u;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Exception e11) {
                        e = e11;
                        flowCollector = flowCollector2;
                        aVar2 = new a(false, "");
                        this.f121668u = e;
                        this.f121667t = 2;
                        if (flowCollector.mo12109b(aVar2, this) == m142578e) {
                            return m142578e;
                        }
                        AbstractC23350e.m122778h(e);
                        return C24848g0.f119245a;
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                flowCollector = (FlowCollector) this.f121668u;
                String str = null;
                JSONObject m100604o = C19172a.m100604o("social@mini_survey_mutual_feed", null, 2, null);
                try {
                    if (m100604o.has("enable_survey")) {
                        if (m100604o.optInt("enable_survey", 0) == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (AbstractC0924m0.m3191K9() && z12) {
                            z11 = true;
                            if (m100604o.has("config")) {
                                str = "";
                            } else {
                                JSONObject optJSONObject = m100604o.optJSONObject("config");
                                if (optJSONObject != null) {
                                    str = optJSONObject.toString();
                                }
                            }
                            aVar = new a(z11, str);
                            this.f121668u = flowCollector;
                            this.f121667t = 1;
                            if (flowCollector.mo12109b(aVar, this) == m142578e) {
                                return m142578e;
                            }
                        }
                    }
                    z11 = false;
                    if (m100604o.has("config")) {
                    }
                    aVar = new a(z11, str);
                    this.f121668u = flowCollector;
                    this.f121667t = 1;
                    if (flowCollector.mo12109b(aVar, this) == m142578e) {
                    }
                } catch (Exception e12) {
                    e = e12;
                    aVar2 = new a(false, "");
                    this.f121668u = e;
                    this.f121667t = 2;
                    if (flowCollector.mo12109b(aVar2, this) == m142578e) {
                    }
                    AbstractC23350e.m122778h(e);
                    return C24848g0.f119245a;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    protected Object mo90291b(Continuation continuation) {
        return FlowKt.m113267C(FlowKt.m113265A(new b(null)), Dispatchers.m112680b());
    }
}
