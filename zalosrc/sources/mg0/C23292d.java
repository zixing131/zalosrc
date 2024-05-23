package mg0;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: mg0.d */
/* loaded from: classes7.dex */
public final class C23292d {

    /* renamed from: mg0.d$a */
    /* loaded from: classes7.dex */
    public static abstract class a {

        /* renamed from: mg0.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32897a extends a {

            /* renamed from: a */
            public static final C32897a f113056a = new C32897a();

            private C32897a() {
                super(null);
            }
        }

        /* renamed from: mg0.d$a$b */
        /* loaded from: classes7.dex */
        public static final class b extends a {

            /* renamed from: a */
            public static final b f113057a = new b();

            private b() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: mg0.d$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113058t;

        /* renamed from: u */
        final /* synthetic */ String f113059u;

        /* renamed from: v */
        final /* synthetic */ String f113060v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f113059u = str;
            this.f113060v = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f113059u, this.f113060v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113058t == 0) {
                AbstractC24862s.m129228b(obj);
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://www.googleapis.com/drive/v3/files/" + this.f113059u).openConnection());
                AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("DELETE");
                httpURLConnection.setRequestProperty("Authorization", "Bearer " + this.f113060v);
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode == 204) {
                    return a.b.f113057a;
                }
                return a.C32897a.f113056a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public final Object m120406a(String str, String str2, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new b(str2, str, null), continuation);
    }
}
