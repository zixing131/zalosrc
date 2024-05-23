package v00;

import android.os.Bundle;
import androidx.core.os.AbstractC1438d;
import c10.C3196a;
import c10.C3197b;
import c10.C3198c;
import c10.C3199d;
import c10.C3200e;
import c10.C3201f;
import c10.C3202g;
import c10.C3203h;
import c10.C3204i;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.state.ZchMasterView;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.view.ChannelView;
import com.zing.zalo.shortvideo.p072ui.view.HashTagListView;
import com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView;
import com.zing.zalo.shortvideo.p072ui.view.MainPageView;
import com.zing.zalo.shortvideo.p072ui.view.SearchPageView;
import com.zing.zalo.shortvideo.p072ui.view.UploadView;
import com.zing.zalo.shortvideo.p072ui.view.VideoLocationListView;
import com.zing.zalo.zview.C17487o0;
import f20.C18705c;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import g20.C19205a;
import p021an.AbstractC0955d;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q20.C25091n;
import w00.AbstractC28684a;

/* renamed from: v00.m */
/* loaded from: classes5.dex */
public abstract class AbstractC27418m {
    public static final a Companion = new a(null);

    /* renamed from: v00.m$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: f */
        public static /* synthetic */ void m140399f(a aVar, C17487o0 c17487o0, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            aVar.m140406e(c17487o0, str, z11);
        }

        /* renamed from: n */
        private final void m140400n(C17487o0 c17487o0, Class cls, Bundle bundle, Integer num) {
            if (c17487o0 == null) {
                return;
            }
            AbstractC28684a.Companion.m143681o().mo146323Y();
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (num != null) {
                bundle.putInt("SHOW_WITH_FLAGS", num.intValue());
            }
            bundle.putString("xTarget", cls.getCanonicalName());
            C24848g0 c24848g0 = C24848g0.f119245a;
            c17487o0.m93069k2(ZchMasterView.class, bundle, 0, true);
        }

        /* renamed from: o */
        static /* synthetic */ void m140401o(a aVar, C17487o0 c17487o0, Class cls, Bundle bundle, Integer num, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            if ((i11 & 4) != 0) {
                num = null;
            }
            aVar.m140400n(c17487o0, cls, bundle, num);
        }

        /* renamed from: a */
        public final boolean m140402a(Class cls) {
            AbstractC19074t.m100208f(cls, "klass");
            return AbstractC19074t.m100204b(cls, ZchMasterView.class);
        }

        /* renamed from: b */
        public final void m140403b(C17487o0 c17487o0, String str) {
            C3198c c3198c;
            String m16276a;
            AbstractC19074t.m100208f(c17487o0, "zvm");
            C3196a m130053b = C25091n.f120500a.m130053b(str);
            if (m130053b != null && (c3198c = (C3198c) m130053b.m16267a()) != null && (m16276a = c3198c.m16276a()) != null) {
                C27415j.Companion.m140374a();
                StateManager.C10098a c10098a = StateManager.Companion;
                c10098a.m53798b();
                c10098a.m53804h(m130053b);
                AbstractC27418m.Companion.m140400n(c17487o0, HashTagListView.class, HashTagListView.Companion.m54390b(m16276a), 16777216);
                C19205a.f95429a.m100723Z(m130053b.m16269c(), m130053b.m16270d());
            }
        }

        /* renamed from: c */
        public final void m140404c(C17487o0 c17487o0, String str) {
            C3199d c3199d;
            String m16279a;
            AbstractC19074t.m100208f(c17487o0, "zvm");
            C3196a m130055d = C25091n.f120500a.m130055d(str);
            if (m130055d != null && (c3199d = (C3199d) m130055d.m16267a()) != null && (m16279a = c3199d.m16279a()) != null) {
                C27415j.Companion.m140374a();
                StateManager.C10098a c10098a = StateManager.Companion;
                c10098a.m53798b();
                c10098a.m53804h(m130055d);
                AbstractC27418m.Companion.m140400n(c17487o0, HashTagListView.class, HashTagListView.Companion.m54391c(m16279a), 16777216);
                C19205a.f95429a.m100723Z(m130055d.m16269c(), m130055d.m16270d());
            }
        }

        /* renamed from: d */
        public final void m140405d(C17487o0 c17487o0) {
            AbstractC19074t.m100208f(c17487o0, "zvm");
            m140399f(this, c17487o0, null, false, 4, null);
        }

        /* renamed from: e */
        public final void m140406e(C17487o0 c17487o0, String str, boolean z11) {
            C3204i c3204i;
            int m98645c;
            Video video;
            String str2;
            Integer num;
            AbstractC19074t.m100208f(c17487o0, "zvm");
            C3196a m130060i = C25091n.f120500a.m130060i(str);
            boolean z12 = false;
            String str3 = null;
            if (m130060i != null && (c3204i = (C3204i) m130060i.m16267a()) != null) {
                c3204i.m16295b().m52868T0(m130060i.m16269c());
                c3204i.m16295b().m52870U0(m130060i.m16270d());
                c3204i.m16295b().m52853L0(0);
            } else {
                c3204i = null;
            }
            C27415j.Companion.m140374a();
            StateManager.C10098a c10098a = StateManager.Companion;
            c10098a.m53798b();
            c10098a.m53804h(m130060i);
            if (z11) {
                if (c3204i != null) {
                    num = Integer.valueOf(c3204i.m16294a());
                } else {
                    num = null;
                }
                if (num == null || c3204i.m16294a() == C18705c.d.f93973r.m98645c()) {
                    z12 = true;
                }
            }
            MainPageView.C10303b c10303b = MainPageView.Companion;
            if (c3204i != null) {
                m98645c = c3204i.m16294a();
            } else {
                m98645c = C18705c.d.f93973r.m98645c();
            }
            if (c3204i != null) {
                video = c3204i.m16295b();
            } else {
                video = null;
            }
            m140401o(this, c17487o0, MainPageView.class, c10303b.m54537a(m98645c, video, z12), null, 4, null);
            C19205a c19205a = C19205a.f95429a;
            if (m130060i != null) {
                str2 = m130060i.m16269c();
            } else {
                str2 = null;
            }
            if (m130060i != null) {
                str3 = m130060i.m16270d();
            }
            c19205a.m100723Z(str2, str3);
        }

        /* renamed from: g */
        public final void m140407g(InterfaceC27218a interfaceC27218a, C17487o0 c17487o0, String str) {
            String str2;
            AbstractC19074t.m100208f(interfaceC27218a, "activity");
            AbstractC19074t.m100208f(c17487o0, "zvm");
            C3196a m130056e = C25091n.f120500a.m130056e(str);
            if (m130056e == null) {
                return;
            }
            C27415j.Companion.m140374a();
            StateManager.Companion.m53798b();
            m140401o(this, c17487o0, MainPageView.class, MainPageView.C10303b.m54536b(MainPageView.Companion, C18705c.d.f93973r.m98645c(), null, false, 4, null), null, 4, null);
            InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(interfaceC27218a.getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
            if (interfaceC25792a != null) {
                C3200e c3200e = (C3200e) m130056e.m16267a();
                if (c3200e != null) {
                    str2 = c3200e.m16282a();
                } else {
                    str2 = null;
                }
                InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, interfaceC27218a, str2, null, null, null, null, null, 496, null);
            }
            C19205a.f95429a.m100723Z(m130056e.m16269c(), m130056e.m16270d());
        }

        /* renamed from: h */
        public final void m140408h(C17487o0 c17487o0, String str) {
            C3201f c3201f;
            String m16285a;
            AbstractC19074t.m100208f(c17487o0, "zvm");
            C3196a m130057f = C25091n.f120500a.m130057f(str);
            if (m130057f != null && (c3201f = (C3201f) m130057f.m16267a()) != null && (m16285a = c3201f.m16285a()) != null) {
                C27415j.Companion.m140374a();
                StateManager.C10098a c10098a = StateManager.Companion;
                c10098a.m53798b();
                c10098a.m53804h(m130057f);
                AbstractC27418m.Companion.m140400n(c17487o0, LivestreamPageView.class, LivestreamPageView.Companion.m54489b(new LivestreamData(m16285a, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0.0f, 0.0f, Channel.Anonymous.f49775h0, 0L, 0L, 0L, 0L, (Long) null, (Boolean) null, (Boolean) null, (String) null, m130057f.m16269c(), m130057f.m16270d(), (Integer) null, (String) null, 109035518, (AbstractC19060k) null), "5", m130057f.m16269c()), 16777216);
                C19205a.f95429a.m100723Z(m130057f.m16269c(), m130057f.m16270d());
            }
        }

        /* renamed from: i */
        public final void m140409i(C17487o0 c17487o0, String str) {
            String str2;
            AbstractC19074t.m100208f(c17487o0, "zvm");
            C3196a m130054c = C25091n.f120500a.m130054c(str);
            C27415j.Companion.m140374a();
            StateManager.C10098a c10098a = StateManager.Companion;
            c10098a.m53798b();
            c10098a.m53804h(m130054c);
            m140400n(c17487o0, ChannelPageView.class, ChannelView.Companion.m54082a(), 16777216);
            C19205a c19205a = C19205a.f95429a;
            String str3 = null;
            if (m130054c != null) {
                str2 = m130054c.m16269c();
            } else {
                str2 = null;
            }
            if (m130054c != null) {
                str3 = m130054c.m16270d();
            }
            c19205a.m100723Z(str2, str3);
        }

        /* renamed from: j */
        public final void m140410j(C17487o0 c17487o0, String str) {
            String str2;
            String str3;
            C3197b c3197b;
            Channel m16273a;
            AbstractC19074t.m100208f(c17487o0, "zvm");
            C3196a m130052a = C25091n.f120500a.m130052a(str);
            C27415j.Companion.m140374a();
            StateManager.C10098a c10098a = StateManager.Companion;
            c10098a.m53798b();
            c10098a.m53804h(m130052a);
            ChannelView.C10141b c10141b = ChannelView.Companion;
            if (m130052a == null || (c3197b = (C3197b) m130052a.m16267a()) == null || (m16273a = c3197b.m16273a()) == null || (str2 = m16273a.m50769l()) == null) {
                str2 = "";
            }
            String str4 = null;
            m140400n(c17487o0, ChannelPageView.class, ChannelView.C10141b.m54081d(c10141b, str2, null, 2, null), 16777216);
            C19205a c19205a = C19205a.f95429a;
            if (m130052a != null) {
                str3 = m130052a.m16269c();
            } else {
                str3 = null;
            }
            if (m130052a != null) {
                str4 = m130052a.m16270d();
            }
            c19205a.m100723Z(str3, str4);
        }

        /* renamed from: k */
        public final void m140411k(C17487o0 c17487o0, String str) {
            String str2;
            String str3;
            C3203h c3203h;
            AbstractC19074t.m100208f(c17487o0, "zvm");
            C3196a m130059h = C25091n.f120500a.m130059h(str);
            C27415j.Companion.m140374a();
            StateManager.C10098a c10098a = StateManager.Companion;
            c10098a.m53798b();
            c10098a.m53804h(m130059h);
            SearchPageView.C10392b c10392b = SearchPageView.Companion;
            String str4 = null;
            if (m130059h != null && (c3203h = (C3203h) m130059h.m16267a()) != null) {
                str2 = c3203h.m16291a();
            } else {
                str2 = null;
            }
            m140400n(c17487o0, SearchPageView.class, c10392b.m54826a(str2), 16777216);
            C19205a c19205a = C19205a.f95429a;
            if (m130059h != null) {
                str3 = m130059h.m16269c();
            } else {
                str3 = null;
            }
            if (m130059h != null) {
                str4 = m130059h.m16270d();
            }
            c19205a.m100723Z(str3, str4);
        }

        /* renamed from: l */
        public final void m140412l(C17487o0 c17487o0, C27373c c27373c, String str) {
            AbstractC19074t.m100208f(c17487o0, "zvm");
            AbstractC19074t.m100208f(c27373c, "videoInfo");
            AbstractC19074t.m100208f(str, "videoLog");
            m140400n(c17487o0, UploadView.class, AbstractC1438d.m7341b(AbstractC24866w.m129235a("EXTRA_VIDEO_INFO", c27373c), AbstractC24866w.m129235a("xVideoLog", str)), 16777216);
        }

        /* renamed from: m */
        public final void m140413m(C17487o0 c17487o0, String str) {
            C3202g c3202g;
            String m16288a;
            AbstractC19074t.m100208f(c17487o0, "zvm");
            C3196a m130058g = C25091n.f120500a.m130058g(str);
            if (m130058g != null && (c3202g = (C3202g) m130058g.m16267a()) != null && (m16288a = c3202g.m16288a()) != null) {
                C27415j.Companion.m140374a();
                StateManager.C10098a c10098a = StateManager.Companion;
                c10098a.m53798b();
                c10098a.m53804h(m130058g);
                AbstractC27418m.Companion.m140400n(c17487o0, VideoLocationListView.class, VideoLocationListView.Companion.m55143b(m16288a), 16777216);
                C19205a.f95429a.m100723Z(m130058g.m16269c(), m130058g.m16270d());
            }
        }
    }

    /* renamed from: a */
    public static final boolean m140397a(Class cls) {
        return Companion.m140402a(cls);
    }

    /* renamed from: b */
    public static final void m140398b(C17487o0 c17487o0, C27373c c27373c, String str) {
        Companion.m140412l(c17487o0, c27373c, str);
    }
}
