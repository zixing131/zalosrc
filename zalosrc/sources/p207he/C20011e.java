package p207he;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.HashSet;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import org.json.JSONArray;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: he.e */
/* loaded from: classes3.dex */
public final class C20011e {

    /* renamed from: a */
    public static final C20011e f98374a = new C20011e();

    /* renamed from: b */
    private static HashSet f98375b = new HashSet();

    /* renamed from: c */
    private static final CoroutineExceptionHandler f98376c;

    /* renamed from: d */
    private static final CoroutineScope f98377d;

    /* renamed from: he.e$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC27310a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC23350e.m122774d("SettingRingtoneView", "Failed " + th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: he.e$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98378t;

        /* renamed from: u */
        final /* synthetic */ String f98379u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation continuation) {
            super(2, continuation);
            this.f98379u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f98379u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            boolean m127128x;
            AbstractC28298d.m142578e();
            if (this.f98378t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    C20011e.f98374a.m103840a().clear();
                    m127128x = AbstractC24341v.m127128x(this.f98379u);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (m127128x) {
                    return C24848g0.f119245a;
                }
                JSONArray jSONArray = new JSONArray(this.f98379u);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    C20011e.f98374a.m103840a().add(AbstractC29094b.m145341c(jSONArray.optInt(i11)));
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        a aVar = new a(CoroutineExceptionHandler.f105837l);
        f98376c = aVar;
        f98377d = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)).mo112823d0(aVar));
    }

    private C20011e() {
    }

    /* renamed from: a */
    public final HashSet m103840a() {
        return f98375b;
    }

    /* renamed from: b */
    public final boolean m103841b(int i11) {
        return !f98375b.contains(Integer.valueOf(i11));
    }

    /* renamed from: c */
    public final boolean m103842c() {
        if (f98375b.contains(22) && f98375b.contains(21)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final Job m103843d(String str) {
        Job m112540d;
        AbstractC19074t.m100208f(str, "data");
        m112540d = BuildersKt__Builders_commonKt.m112540d(f98377d, null, null, new b(str, null), 3, null);
        return m112540d;
    }
}
