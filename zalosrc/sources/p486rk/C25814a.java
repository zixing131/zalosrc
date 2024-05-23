package p486rk;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import me0.AbstractC23148n;
import me0.AbstractC23153n4;
import org.json.JSONObject;
import p173fz.C19172a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: rk.a */
/* loaded from: classes3.dex */
public final class C25814a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rk.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f123118t;

        /* renamed from: u */
        /* synthetic */ Object f123119u;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f123119u = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f123118t == 0) {
                AbstractC24862s.m129228b(obj);
                JSONObject jSONObject = (JSONObject) this.f123119u;
                AbstractC23153n4.m119085A(jSONObject, false, false);
                return AbstractC29094b.m145339a(AbstractC23148n.m118837k(jSONObject));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(JSONObject jSONObject, Continuation continuation) {
            return ((a) mo238a(jSONObject, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rk.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f123120t;

        /* renamed from: u */
        /* synthetic */ Object f123121u;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f123121u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f123120t == 0) {
                AbstractC24862s.m129228b(obj);
                JSONObject jSONObject = (JSONObject) this.f123121u;
                AbstractC23153n4.m119085A(jSONObject, false, false);
                return AbstractC29094b.m145339a(AbstractC23148n.m118837k(jSONObject));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(JSONObject jSONObject, Continuation continuation) {
            return ((b) mo238a(jSONObject, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public final void m133103a(JSONObject jSONObject) {
        C19172a.m100594e(jSONObject, new a(null));
    }

    /* renamed from: b */
    public final void m133104b(JSONObject jSONObject) {
        C19172a.m100595f(jSONObject);
    }

    /* renamed from: c */
    public final void m133105c(JSONObject jSONObject) {
        C19172a.m100596g(jSONObject, new b(null));
    }
}
