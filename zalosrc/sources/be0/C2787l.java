package be0;

import fn0.AbstractC19074t;
import java.util.Map;
import kotlin.coroutines.Continuation;
import mh.C23298d;
import org.json.JSONArray;
import p185gc.AbstractC19377a;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: be0.l */
/* loaded from: classes4.dex */
public final class C2787l extends AbstractC19377a {

    /* renamed from: a */
    private final C23298d f11093a;

    /* renamed from: be0.l$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final JSONArray f11094a;

        public a(JSONArray jSONArray) {
            AbstractC19074t.m100208f(jSONArray, "jsArrData");
            this.f11094a = jSONArray;
        }

        /* renamed from: a */
        public final JSONArray m13426a() {
            return this.f11094a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f11094a, ((a) obj).f11094a);
        }

        public int hashCode() {
            return this.f11094a.hashCode();
        }

        public String toString() {
            return "Params(jsArrData=" + this.f11094a + ")";
        }
    }

    /* renamed from: be0.l$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final Map f11095a;

        public b(Map map) {
            AbstractC19074t.m100208f(map, "mapCountChanges");
            this.f11095a = map;
        }

        /* renamed from: a */
        public final Map m13427a() {
            return this.f11095a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f11095a, ((b) obj).f11095a);
        }

        public int hashCode() {
            return this.f11095a.hashCode();
        }

        public String toString() {
            return "Result(mapCountChanges=" + this.f11095a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: be0.l$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f11096s;

        /* renamed from: u */
        int f11098u;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f11096s = obj;
            this.f11098u |= Integer.MIN_VALUE;
            return C2787l.this.mo451b(null, this);
        }
    }

    public C2787l(C23298d c23298d) {
        AbstractC19074t.m100208f(c23298d, "statusMessageRepo");
        this.f11093a = c23298d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f11098u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f11098u = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f11096s;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f11098u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C23298d c23298d = this.f11093a;
                    JSONArray m13426a = aVar.m13426a();
                    cVar.f11098u = 1;
                    obj = c23298d.m120482r(m13426a, cVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                return new b((Map) obj);
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f11096s;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f11098u;
        if (i11 == 0) {
        }
        return new b((Map) obj2);
    }
}
