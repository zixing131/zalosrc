package f20;

import android.os.Bundle;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.view.VideoPageView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18187a;
import e20.InterfaceC18189c;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Map;
import pm0.AbstractC24866w;
import qm0.AbstractC25363p0;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: f20.f */
/* loaded from: classes5.dex */
public final class C18708f extends AbstractC17505t0 implements InterfaceC18703a {

    /* renamed from: w */
    private final ViewPager f93993w;

    /* renamed from: x */
    private final Map f93994x;

    /* renamed from: y */
    private Bundle f93995y;

    /* renamed from: z */
    private Channel f93996z;

    /* renamed from: f20.f$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            VideoPageView videoPageView = new VideoPageView();
            videoPageView.mo60305zK(C18708f.this.f93995y);
            return videoPageView;
        }
    }

    /* renamed from: f20.f$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            ChannelPageView.C10134b c10134b = ChannelPageView.Companion;
            Channel channel = C18708f.this.f93996z;
            if (channel == null) {
                channel = Channel.Anonymous.f49775h0;
            }
            return ChannelPageView.C10134b.m53981c(c10134b, channel, null, 2, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: f20.f$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: p */
        public static final c f93999p = new c("VIDEO", 0);

        /* renamed from: q */
        public static final c f94000q = new c("CHANNEL", 1);

        /* renamed from: r */
        private static final /* synthetic */ c[] f94001r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f94002s;

        static {
            c[] m98672b = m98672b();
            f94001r = m98672b;
            f94002s = AbstractC30166b.m148796a(m98672b);
        }

        private c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m98672b() {
            return new c[]{f93999p, f94000q};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f94001r.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18708f(ViewPager viewPager, C17487o0 c17487o0) {
        super(c17487o0);
        Map m131407l;
        AbstractC19074t.m100208f(viewPager, "viewPager");
        AbstractC19074t.m100208f(c17487o0, "zvm");
        this.f93993w = viewPager;
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a(Integer.valueOf(c.f93999p.ordinal()), new a()), AbstractC24866w.m129235a(Integer.valueOf(c.f94000q.ordinal()), new b()));
        this.f93994x = m131407l;
    }

    /* renamed from: C */
    public void m98665C(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93993w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.mo53932Bg();
        }
    }

    /* renamed from: D */
    public void m98666D(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93993w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.deactivate();
        }
    }

    /* renamed from: E */
    public final void m98667E(int i11) {
        InterfaceC18189c interfaceC18189c;
        Object mo35339k = mo35339k(this.f93993w, i11);
        if (mo35339k instanceof InterfaceC18189c) {
            interfaceC18189c = (InterfaceC18189c) mo35339k;
        } else {
            interfaceC18189c = null;
        }
        if (interfaceC18189c != null) {
            interfaceC18189c.mo54480ni();
        }
    }

    /* renamed from: F */
    public final void m98668F(Channel channel) {
        this.f93996z = channel;
    }

    /* renamed from: G */
    public final void m98669G(Bundle bundle) {
        this.f93995y = bundle;
    }

    @Override // f20.InterfaceC18703a
    /* renamed from: a */
    public void mo98626a(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93993w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.mo53934d0();
        }
    }

    @Override // f20.InterfaceC18703a
    /* renamed from: c */
    public void mo98627c(int i11) {
        InterfaceC18187a interfaceC18187a;
        Object mo35339k = mo35339k(this.f93993w, i11);
        if (mo35339k instanceof InterfaceC18187a) {
            interfaceC18187a = (InterfaceC18187a) mo35339k;
        } else {
            interfaceC18187a = null;
        }
        if (interfaceC18187a != null) {
            interfaceC18187a.mo53937r4();
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f93994x.size();
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ZaloView zaloView;
        InterfaceC18494a interfaceC18494a = (InterfaceC18494a) this.f93994x.get(Integer.valueOf(i11));
        if (interfaceC18494a != null && (zaloView = (ZaloView) interfaceC18494a.mo12V4()) != null) {
            return zaloView;
        }
        throw new IllegalArgumentException();
    }
}
