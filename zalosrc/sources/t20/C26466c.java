package t20;

import android.content.Context;
import com.zing.zalo.shortvideo.p072ui.model.FooterVideoPromote;
import com.zing.zalo.shortvideo.p072ui.model.VideoLabel;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.view.HashTagListView;
import com.zing.zalo.shortvideo.p072ui.view.SearchPageView;
import com.zing.zalo.shortvideo.p072ui.view.VideoChannelPagerView;
import com.zing.zalo.shortvideo.p072ui.view.VideoLocationListView;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import fn0.AbstractC19061k0;
import p021an.AbstractC0955d;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;

/* renamed from: t20.c */
/* loaded from: classes5.dex */
public final class C26466c {

    /* renamed from: a */
    public static final C26466c f125664a = new C26466c();

    private C26466c() {
    }

    /* renamed from: b */
    private final void m136379b(Integer num, String str, InterfaceC27218a interfaceC27218a, ZchBaseView zchBaseView) {
        Context context;
        InterfaceC25792a interfaceC25792a;
        if (num != null && num.intValue() == 0) {
            if (str != null && interfaceC27218a != null && (context = interfaceC27218a.getContext()) != null && (interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(context, AbstractC19061k0.m100169b(InterfaceC25792a.class))) != null) {
                InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, interfaceC27218a, str, zchBaseView, null, null, null, null, 480, null);
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 1) {
            if (str != null && zchBaseView != null) {
                zchBaseView.m55551QK(HashTagListView.Companion.m54392d(str));
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 2) {
            if (str != null && zchBaseView != null) {
                zchBaseView.m55551QK(SearchPageView.Companion.m54827b(str));
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 3) {
            if (str != null && zchBaseView != null) {
                zchBaseView.m55551QK(ChannelPageView.C10134b.m53982d(ChannelPageView.Companion, str, null, 2, null));
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 4) {
            if (str == null) {
                return;
            }
            VideoChannelPagerView m55112h = VideoChannelPagerView.C10509b.m55112h(VideoChannelPagerView.Companion, str, null, null, 6, null);
            if (zchBaseView != null) {
                zchBaseView.m55551QK(m55112h);
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 6) {
            if (str != null && str.length() != 0) {
                HashTagListView m54389a = HashTagListView.Companion.m54389a(str);
                if (zchBaseView != null) {
                    zchBaseView.m55551QK(m54389a);
                    return;
                }
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 7 && str != null && str.length() != 0 && zchBaseView != null) {
            zchBaseView.m55551QK(VideoLocationListView.Companion.m55142a(str));
        }
    }

    /* renamed from: a */
    public final boolean m136380a(Integer num) {
        if (num != null && num.intValue() >= 0 && num.intValue() <= 7) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m136381c(VideoLabel videoLabel, InterfaceC27218a interfaceC27218a, ZchBaseView zchBaseView) {
        Integer num;
        String str = null;
        if (videoLabel != null) {
            num = videoLabel.m52947f();
        } else {
            num = null;
        }
        if (videoLabel != null) {
            str = videoLabel.m52948g();
        }
        m136379b(num, str, interfaceC27218a, zchBaseView);
    }

    /* renamed from: d */
    public final void m136382d(FooterVideoPromote footerVideoPromote, InterfaceC27218a interfaceC27218a, ZchBaseView zchBaseView) {
        Integer num;
        String str = null;
        if (footerVideoPromote != null) {
            num = footerVideoPromote.m52806f();
        } else {
            num = null;
        }
        if (footerVideoPromote != null) {
            str = footerVideoPromote.m52807g();
        }
        m136379b(num, str, interfaceC27218a, zchBaseView);
    }
}
