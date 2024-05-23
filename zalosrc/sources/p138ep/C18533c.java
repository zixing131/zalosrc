package p138ep;

import ae.C0766k;
import am.C0927o;
import android.text.TextUtils;
import bo.C3023p3;
import bo.C3028q3;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.feed.mvp.feedzshort.data.ExceptionLoadZShortInfo;
import com.zing.zalo.feed.mvp.feedzshort.data.ExceptionNoNetworkZShort;
import com.zing.zalo.feed.mvp.feedzshort.data.ExceptionNotFoundZShort;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import lu.C22652b;
import me0.C23055e5;
import mm0.AbstractC23350e;
import nh0.C23793c;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p716zh.C31944h6;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: ep.c */
/* loaded from: classes4.dex */
public final class C18533c implements InterfaceC18531a {

    /* renamed from: ep.c$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f93207t;

        /* renamed from: u */
        final /* synthetic */ String f93208u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation continuation) {
            super(2, continuation);
            this.f93208u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f93208u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            boolean z11;
            String str;
            boolean m127120J;
            AbstractC28298d.m142578e();
            if (this.f93207t == 0) {
                AbstractC24862s.m129228b(obj);
                if (C23055e5.m118273h(false, 1, null)) {
                    String str2 = this.f93208u;
                    int i11 = 0;
                    while (true) {
                        C22652b.m117234a(str2);
                        URL url = new URL(str2);
                        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                        AbstractC19074t.m100206d(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.connect();
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode != 301 && responseCode != 302 && responseCode != 303) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            AbstractC19074t.m100205c(headerField);
                            m127120J = AbstractC24341v.m127120J(headerField, "/", false, 2, null);
                            if (m127120J) {
                                headerField = url.getProtocol() + "://" + url.getHost() + headerField;
                            }
                            String m153552r = C31944h6.m153552r(str2);
                            AbstractC19074t.m100205c(headerField);
                            boolean equals = TextUtils.equals(m153552r, C31944h6.m153552r(headerField));
                            AbstractC19074t.m100205c(headerField);
                            if (!equals) {
                                i11++;
                            }
                            httpURLConnection.disconnect();
                            str = headerField;
                        } else {
                            str = str2;
                        }
                        if (!z11 || i11 > 2) {
                            break;
                        }
                        str2 = str;
                    }
                    return new C3028q3(str, 0L, 2, null);
                }
                throw ExceptionNoNetworkZShort.f46294p;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: ep.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f93209a;

        b(Continuation continuation) {
            this.f93209a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            if (c20096c.m104491c() == 1001) {
                Continuation continuation = this.f93209a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNotFoundZShort.f46295p)));
                return;
            }
            Continuation continuation2 = this.f93209a;
            C24861r.a aVar2 = C24861r.f119264q;
            continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionLoadZShortInfo(c20096c.m104491c() + " - " + c20096c.m104492d()))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (!jSONObject.isNull("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    AbstractC19074t.m100205c(jSONObject2);
                    C3023p3 c3023p3 = new C3023p3(jSONObject2);
                    c3023p3.m14559p(C23793c.Companion.m124321a().mo124311f());
                    this.f93209a.mo112492g(C24861r.m129218b(c3023p3));
                } else {
                    Continuation continuation = this.f93209a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionLoadZShortInfo("Err empty data"))));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                Continuation continuation2 = this.f93209a;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionLoadZShortInfo("Err parse data"))));
            }
        }
    }

    @Override // p138ep.InterfaceC18531a
    /* renamed from: a */
    public Object mo97922a(String str, Continuation continuation) {
        Continuation m142576c;
        boolean m127128x;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (C23055e5.m118273h(false, 1, null)) {
            m127128x = AbstractC24341v.m127128x(str);
            if (m127128x) {
                C24861r.a aVar = C24861r.f119264q;
                c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNotFoundZShort.f46295p)));
            } else {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new b(c27317h));
                c0766k.mo1451I5(str);
            }
        } else {
            C24861r.a aVar2 = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetworkZShort.f46294p)));
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // p138ep.InterfaceC18531a
    /* renamed from: b */
    public Object mo97923b(String str, String str2, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new a(str2, null), continuation);
    }
}
