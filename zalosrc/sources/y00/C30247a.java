package y00;

import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.p071db.entities.LogActive;
import com.zing.zalo.shortvideo.data.p071db.entities.LogEvent;
import com.zing.zalo.shortvideo.data.p071db.entities.LogGetList;
import com.zing.zalo.shortvideo.data.p071db.entities.LogImps;
import com.zing.zalo.shortvideo.data.p071db.entities.LogImpsAds;
import com.zing.zalo.shortvideo.data.p071db.entities.LogSession;
import com.zing.zalo.shortvideo.data.p071db.entities.LogUpload;
import com.zing.zalo.shortvideo.data.p071db.entities.LogViewStream;
import com.zing.zalo.shortvideo.data.p071db.entities.LogViewVideo;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import pm0.C24848g0;
import rn0.AbstractC25935a;
import tn0.C26788f;
import tn0.C26814n1;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;

/* renamed from: y00.a */
/* loaded from: classes5.dex */
public final class C30247a {

    /* renamed from: a */
    public static final C30247a f140500a = new C30247a();

    /* renamed from: b */
    private static final AbstractC27323a f140501b = AbstractC27336n.m139941b(null, a.f140502q, 1, null);

    /* renamed from: y00.a$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f140502q = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m149207a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139882g(true);
            c27326d.m139881f(true);
            c27326d.m139883h(false);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m149207a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    private C30247a() {
    }

    /* renamed from: a */
    public final String m149181a(ChannelConfig channelConfig) {
        if (channelConfig == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(ChannelConfig.Companion.serializer(), channelConfig);
    }

    /* renamed from: b */
    public final String m149182b(Channel channel) {
        if (channel == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(Channel.Companion.serializer(), channel);
    }

    /* renamed from: c */
    public final Channel m149183c(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (Channel) abstractC27323a.m139867d(AbstractC25935a.m133630u(Channel.Companion.serializer()), str);
    }

    /* renamed from: d */
    public final ChannelConfig m149184d(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (ChannelConfig) abstractC27323a.m139867d(AbstractC25935a.m133630u(ChannelConfig.Companion.serializer()), str);
    }

    /* renamed from: e */
    public final User m149185e(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (User) abstractC27323a.m139867d(AbstractC25935a.m133630u(User.Companion.serializer()), str);
    }

    /* renamed from: f */
    public final List m149186f(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(LogActive.Companion.serializer())), str);
    }

    /* renamed from: g */
    public final List m149187g(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(LogEvent.Companion.serializer())), str);
    }

    /* renamed from: h */
    public final List m149188h(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(LogGetList.Companion.serializer())), str);
    }

    /* renamed from: i */
    public final List m149189i(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(LogImps.Companion.serializer())), str);
    }

    /* renamed from: j */
    public final List m149190j(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(LogImpsAds.Companion.serializer())), str);
    }

    /* renamed from: k */
    public final List m149191k(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(LogSession.Companion.serializer())), str);
    }

    /* renamed from: l */
    public final List m149192l(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(LogUpload.Companion.serializer())), str);
    }

    /* renamed from: m */
    public final List m149193m(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(LogViewStream.Companion.serializer())), str);
    }

    /* renamed from: n */
    public final List m149194n(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(LogViewVideo.Companion.serializer())), str);
    }

    /* renamed from: o */
    public final List m149195o(String str) {
        if (str == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return (List) abstractC27323a.m139867d(AbstractC25935a.m133630u(new C26788f(C26814n1.f127034a)), str);
    }

    /* renamed from: p */
    public final String m149196p(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(C26814n1.f127034a), list);
    }

    /* renamed from: q */
    public final String m149197q(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(LogActive.Companion.serializer()), list);
    }

    /* renamed from: r */
    public final String m149198r(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(LogEvent.Companion.serializer()), list);
    }

    /* renamed from: s */
    public final String m149199s(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(LogGetList.Companion.serializer()), list);
    }

    /* renamed from: t */
    public final String m149200t(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(LogImpsAds.Companion.serializer()), list);
    }

    /* renamed from: u */
    public final String m149201u(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(LogImps.Companion.serializer()), list);
    }

    /* renamed from: v */
    public final String m149202v(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(LogSession.Companion.serializer()), list);
    }

    /* renamed from: w */
    public final String m149203w(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(LogUpload.Companion.serializer()), list);
    }

    /* renamed from: x */
    public final String m149204x(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(LogViewStream.Companion.serializer()), list);
    }

    /* renamed from: y */
    public final String m149205y(List list) {
        if (list == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(new C26788f(LogViewVideo.Companion.serializer()), list);
    }

    /* renamed from: z */
    public final String m149206z(User user) {
        if (user == null) {
            return null;
        }
        AbstractC27323a abstractC27323a = f140501b;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(User.Companion.serializer(), user);
    }
}
