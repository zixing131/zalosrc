package com.zing.zalo.story.usecase.story_interaction;

import ae.InterfaceC0765j;
import androidx.work.AbstractC2144f;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import p185gc.AbstractC19384h;
import p458qr.AbstractC25468a;
import p716zh.C31980jc;
import p716zh.C32123ta;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class HideOrReportAdsUseCase extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC0765j f55131a;

    /* loaded from: classes5.dex */
    public static final class ExceptionHideOrReportStoryAds extends Exception {

        /* renamed from: p */
        private final String f55132p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExceptionHideOrReportStoryAds(String str) {
            super(str);
            AbstractC19074t.m100208f(str, "err");
            this.f55132p = str;
        }

        /* renamed from: a */
        public final String m56610a() {
            return this.f55132p;
        }
    }

    /* renamed from: com.zing.zalo.story.usecase.story_interaction.HideOrReportAdsUseCase$a */
    /* loaded from: classes5.dex */
    public static final class C10916a {

        /* renamed from: a */
        private final C32123ta f55133a;

        /* renamed from: b */
        private final C31980jc f55134b;

        /* renamed from: c */
        private final boolean f55135c;

        public C10916a(C32123ta c32123ta, C31980jc c31980jc, boolean z11) {
            this.f55133a = c32123ta;
            this.f55134b = c31980jc;
            this.f55135c = z11;
        }

        /* renamed from: a */
        public final C32123ta m56611a() {
            return this.f55133a;
        }

        /* renamed from: b */
        public final C31980jc m56612b() {
            return this.f55134b;
        }

        /* renamed from: c */
        public final boolean m56613c() {
            return this.f55135c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10916a)) {
                return false;
            }
            C10916a c10916a = (C10916a) obj;
            return AbstractC19074t.m100204b(this.f55133a, c10916a.f55133a) && AbstractC19074t.m100204b(this.f55134b, c10916a.f55134b) && this.f55135c == c10916a.f55135c;
        }

        public int hashCode() {
            C32123ta c32123ta = this.f55133a;
            int hashCode = (c32123ta == null ? 0 : c32123ta.hashCode()) * 31;
            C31980jc c31980jc = this.f55134b;
            return ((hashCode + (c31980jc != null ? c31980jc.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f55135c);
        }

        public String toString() {
            return "Param(storyItem=" + this.f55133a + ", userStory=" + this.f55134b + ", isHideOnly=" + this.f55135c + ")";
        }
    }

    /* renamed from: com.zing.zalo.story.usecase.story_interaction.HideOrReportAdsUseCase$b */
    /* loaded from: classes5.dex */
    public static final class C10917b {

        /* renamed from: a */
        private final C32123ta f55136a;

        /* renamed from: b */
        private final C31980jc f55137b;

        /* renamed from: c */
        private final String f55138c;

        /* renamed from: d */
        private final String f55139d;

        public C10917b(C32123ta c32123ta, C31980jc c31980jc, String str, String str2) {
            AbstractC19074t.m100208f(c32123ta, "storyItem");
            AbstractC19074t.m100208f(c31980jc, "userStory");
            AbstractC19074t.m100208f(str, "urlReport");
            AbstractC19074t.m100208f(str2, "toastSuccess");
            this.f55136a = c32123ta;
            this.f55137b = c31980jc;
            this.f55138c = str;
            this.f55139d = str2;
        }

        /* renamed from: a */
        public final C32123ta m56614a() {
            return this.f55136a;
        }

        /* renamed from: b */
        public final String m56615b() {
            return this.f55139d;
        }

        /* renamed from: c */
        public final String m56616c() {
            return this.f55138c;
        }

        /* renamed from: d */
        public final C31980jc m56617d() {
            return this.f55137b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10917b)) {
                return false;
            }
            C10917b c10917b = (C10917b) obj;
            return AbstractC19074t.m100204b(this.f55136a, c10917b.f55136a) && AbstractC19074t.m100204b(this.f55137b, c10917b.f55137b) && AbstractC19074t.m100204b(this.f55138c, c10917b.f55138c) && AbstractC19074t.m100204b(this.f55139d, c10917b.f55139d);
        }

        public int hashCode() {
            return (((((this.f55136a.hashCode() * 31) + this.f55137b.hashCode()) * 31) + this.f55138c.hashCode()) * 31) + this.f55139d.hashCode();
        }

        public String toString() {
            return "Result(storyItem=" + this.f55136a + ", userStory=" + this.f55137b + ", urlReport=" + this.f55138c + ", toastSuccess=" + this.f55139d + ")";
        }
    }

    /* renamed from: com.zing.zalo.story.usecase.story_interaction.HideOrReportAdsUseCase$c */
    /* loaded from: classes5.dex */
    public static final class C10918c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ HideOrReportAdsUseCase f55140A;

        /* renamed from: t */
        Object f55141t;

        /* renamed from: u */
        Object f55142u;

        /* renamed from: v */
        Object f55143v;

        /* renamed from: w */
        Object f55144w;

        /* renamed from: x */
        int f55145x;

        /* renamed from: y */
        private /* synthetic */ Object f55146y;

        /* renamed from: z */
        final /* synthetic */ C10916a f55147z;

        /* renamed from: com.zing.zalo.story.usecase.story_interaction.HideOrReportAdsUseCase$c$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ C10916a f55148a;

            /* renamed from: b */
            final /* synthetic */ Continuation f55149b;

            /* renamed from: c */
            final /* synthetic */ C32123ta f55150c;

            /* renamed from: d */
            final /* synthetic */ C31980jc f55151d;

            a(C10916a c10916a, Continuation continuation, C32123ta c32123ta, C31980jc c31980jc) {
                this.f55148a = c10916a;
                this.f55149b = continuation;
                this.f55150c = c32123ta;
                this.f55151d = c31980jc;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                String m104492d;
                if (c20096c != null && (m104492d = c20096c.m104492d()) != null && m104492d.length() != 0) {
                    Continuation continuation = this.f55149b;
                    C24861r.a aVar = C24861r.f119264q;
                    String m104492d2 = c20096c.m104492d();
                    AbstractC19074t.m100207e(m104492d2, "getError_message(...)");
                    continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionHideOrReportStoryAds(m104492d2))));
                    return;
                }
                Continuation continuation2 = this.f55149b;
                C24861r.a aVar2 = C24861r.f119264q;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionHideOrReportStoryAds(m118743r0))));
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                String str;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                String str2 = "";
                if (this.f55148a.m56613c() || optJSONObject == null || optJSONObject.optInt("flag") != 1) {
                    str = "";
                } else {
                    str = optJSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, "");
                    AbstractC19074t.m100207e(str, "optString(...)");
                }
                if (this.f55148a.m56613c()) {
                    str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_ads_hide_success);
                    AbstractC19074t.m100207e(str2, "getString(...)");
                }
                Continuation continuation = this.f55149b;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(new C10917b(this.f55150c, this.f55151d, str, str2)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10918c(C10916a c10916a, HideOrReportAdsUseCase hideOrReportAdsUseCase, Continuation continuation) {
            super(2, continuation);
            this.f55147z = c10916a;
            this.f55140A = hideOrReportAdsUseCase;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C10918c c10918c = new C10918c(this.f55147z, this.f55140A, continuation);
            c10918c.f55146y = obj;
            return c10918c;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x010e A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            C31980jc c31980jc;
            C32123ta c32123ta;
            Continuation m142576c;
            Object m139856a;
            Object m142578e2;
            FlowCollector flowCollector3;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f55145x;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            flowCollector2 = (FlowCollector) this.f55146y;
                            try {
                                AbstractC24862s.m129228b(obj);
                            } catch (Exception e11) {
                                e = e11;
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector3 = (FlowCollector) this.f55146y;
                    try {
                        AbstractC24862s.m129228b(obj);
                        m139856a = obj;
                        cVar = new AbstractC25468a.c((C10917b) m139856a);
                        this.f55146y = flowCollector3;
                        this.f55141t = null;
                        this.f55142u = null;
                        this.f55143v = null;
                        this.f55144w = null;
                        this.f55145x = 3;
                        if (flowCollector3.mo12109b(cVar, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        flowCollector2 = flowCollector3;
                    }
                    return C24848g0.f119245a;
                }
                c32123ta = (C32123ta) this.f55142u;
                C31980jc c31980jc2 = (C31980jc) this.f55141t;
                FlowCollector flowCollector4 = (FlowCollector) this.f55146y;
                try {
                    AbstractC24862s.m129228b(obj);
                    c31980jc = c31980jc2;
                    flowCollector = flowCollector4;
                } catch (Exception e13) {
                    e = e13;
                    flowCollector2 = flowCollector4;
                }
                AbstractC25468a.a aVar = new AbstractC25468a.a(e);
                this.f55146y = null;
                this.f55141t = null;
                this.f55142u = null;
                this.f55143v = null;
                this.f55144w = null;
                this.f55145x = 4;
                if (flowCollector2.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
            AbstractC24862s.m129228b(obj);
            flowCollector = (FlowCollector) this.f55146y;
            try {
                C31980jc m56612b = this.f55147z.m56612b();
                C32123ta m56611a = this.f55147z.m56611a();
                if (m56612b != null && m56611a != null && m56612b.f147029v == 2) {
                    AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                    this.f55146y = flowCollector;
                    this.f55141t = m56612b;
                    this.f55142u = m56611a;
                    this.f55145x = 1;
                    if (flowCollector.mo12109b(bVar, this) == m142578e) {
                        return m142578e;
                    }
                    c31980jc = m56612b;
                    c32123ta = m56611a;
                } else {
                    throw new Exception("Invalid data");
                }
            } catch (Exception e14) {
                e = e14;
                flowCollector2 = flowCollector;
            }
            HideOrReportAdsUseCase hideOrReportAdsUseCase = this.f55140A;
            C10916a c10916a = this.f55147z;
            this.f55146y = flowCollector;
            this.f55141t = c31980jc;
            this.f55142u = c32123ta;
            this.f55143v = hideOrReportAdsUseCase;
            this.f55144w = c10916a;
            this.f55145x = 2;
            m142576c = AbstractC28297c.m142576c(this);
            C27317h c27317h = new C27317h(m142576c);
            hideOrReportAdsUseCase.m56608c().mo1704o8(new a(c10916a, c27317h, c32123ta, c31980jc));
            hideOrReportAdsUseCase.m56608c().mo1464Ja(c32123ta.f148135f0, c32123ta.f148137g0, !c10916a.m56613c() ? 1 : 0, c32123ta.f148137g0, 0, c32123ta.f148139h0);
            m139856a = c27317h.m139856a();
            m142578e2 = AbstractC28298d.m142578e();
            if (m139856a == m142578e2) {
                AbstractC29100h.m145355c(this);
            }
            if (m139856a == m142578e) {
                return m142578e;
            }
            flowCollector3 = flowCollector;
            cVar = new AbstractC25468a.c((C10917b) m139856a);
            this.f55146y = flowCollector3;
            this.f55141t = null;
            this.f55142u = null;
            this.f55143v = null;
            this.f55144w = null;
            this.f55145x = 3;
            if (flowCollector3.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((C10918c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public HideOrReportAdsUseCase(InterfaceC0765j interfaceC0765j) {
        AbstractC19074t.m100208f(interfaceC0765j, "api");
        this.f55131a = interfaceC0765j;
    }

    /* renamed from: c */
    public final InterfaceC0765j m56608c() {
        return this.f55131a;
    }

    @Override // p185gc.AbstractC19384h
    /* renamed from: d */
    public Flow mo13388b(C10916a c10916a) {
        AbstractC19074t.m100208f(c10916a, "params");
        return FlowKt.m113265A(new C10918c(c10916a, this, null));
    }
}
