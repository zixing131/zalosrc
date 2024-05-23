package com.zing.zalo.feed.formpostfeed.data;

import ae.C0766k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: com.zing.zalo.feed.formpostfeed.data.c */
/* loaded from: classes4.dex */
public final class C8455c {

    /* renamed from: com.zing.zalo.feed.formpostfeed.data.c$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f45916a;

        a(Continuation continuation) {
            this.f45916a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            Continuation continuation = this.f45916a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new Exception())));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject2 = new JSONObject(obj.toString());
                if (!jSONObject2.isNull("data")) {
                    jSONObject = jSONObject2.getJSONObject("data");
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    int optInt = jSONObject.optInt("expireTime") * 1000;
                    JSONObject optJSONObject = jSONObject.optJSONObject("settings");
                    if (optJSONObject != null) {
                        String jSONObject3 = optJSONObject.toString();
                        AbstractC19074t.m100207e(jSONObject3, "toString(...)");
                        TimelineFpfEntrySetting m44991b = TimelineFpfEntrySetting.Companion.m44991b(jSONObject3);
                        C8453a c8453a = new C8453a();
                        c8453a.m44997e(m44991b);
                        c8453a.m44996d(optInt + System.currentTimeMillis());
                        this.f45916a.mo112492g(C24861r.m129218b(c8453a));
                        return;
                    }
                    return;
                }
                Continuation continuation = this.f45916a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new LoadTimelineFpfConfigException())));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                Continuation continuation2 = this.f45916a;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new LoadTimelineFpfConfigException())));
            }
        }
    }

    /* renamed from: a */
    public final Object m45000a(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(c27317h));
        c0766k.mo1689m8();
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
