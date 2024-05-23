package com.zing.zalo.shortvideo.p072ui.view;

import a10.C0054s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.AbstractC1415b;
import androidx.core.os.AbstractC1438d;
import androidx.lifecycle.InterfaceC1801w;
import androidx.recyclerview.widget.RecyclerView;
import c20.C3226p;
import c20.C3227q;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.PersonalizeStream;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.VideoAdsData;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.data.model.config.LikeSuggestionConfig;
import com.zing.zalo.shortvideo.data.model.config.Messages;
import com.zing.zalo.shortvideo.data.model.config.ShareSuggestionConfig;
import com.zing.zalo.shortvideo.data.remote.common.AdsDeletionDeniedException;
import com.zing.zalo.shortvideo.data.remote.common.LimitationReachedException;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.data.remote.common.NoFriendDataException;
import com.zing.zalo.shortvideo.data.remote.common.NoNewFriendVideoException;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.bts.VideoFeedBackBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.AdvertisingVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.SimpleLivestreamItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9768d;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.model.Action;
import com.zing.zalo.shortvideo.p072ui.model.Banner;
import com.zing.zalo.shortvideo.p072ui.model.Ended;
import com.zing.zalo.shortvideo.p072ui.model.FooterVideoPromote;
import com.zing.zalo.shortvideo.p072ui.model.PersonalizeVideo;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import com.zing.zalo.shortvideo.p072ui.model.VideoLabel;
import com.zing.zalo.shortvideo.p072ui.model.VideoPromote;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10058f;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.CommentReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.LivestreamReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.LoadMoreVideoReceiver;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.view.CommentView;
import com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f;
import com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView;
import com.zing.zalo.shortvideo.p072ui.view.MainPageLayout;
import com.zing.zalo.shortvideo.p072ui.view.SearchPageView;
import com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout;
import com.zing.zalo.shortvideo.p072ui.view.VideoPageView;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import com.zing.zalo.shortvideo.p072ui.widget.seek.VideoSeekBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.utils.other.CommentSource;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.C17507u0;
import com.zing.zalo.zview.ZaloView;
import e10.C18168e;
import e20.InterfaceC18189c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import f20.C18705c;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.C19071q;
import g20.C19205a;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k20.C21456b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import mj0.AbstractC23322a;
import on0.AbstractC24342w;
import p021an.AbstractC0955d;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C25026k2;
import q10.C25055t1;
import q20.C25093p;
import q20.C25095r;
import q20.C25097t;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import s20.AbstractC26102d;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import t20.C26466c;
import u10.C26947a;
import u10.C26948b;
import ui0.AbstractViewOnTouchListenerC27278e;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27413h;
import v00.C27417l;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import x00.InterfaceC29280a;
import z10.C31179n0;

/* loaded from: classes5.dex */
public final class VideoPageView extends AbstractC10623a implements InterfaceC10628f, InterfaceC18189c, C21456b.c, CommentView.InterfaceC10179b, ZchBaseView.InterfaceC10622a {
    public static final C10573b Companion = new C10573b(null);

    /* renamed from: o1 */
    private static Section f53607o1;

    /* renamed from: p1 */
    private static int f53608p1;

    /* renamed from: B0 */
    private final InterfaceC10058f f53609B0;

    /* renamed from: C0 */
    private C31179n0 f53610C0;

    /* renamed from: D0 */
    private C9768d f53611D0;

    /* renamed from: E0 */
    private ChannelReceiver f53612E0;

    /* renamed from: F0 */
    private CommentReceiver f53613F0;

    /* renamed from: G0 */
    private LivestreamReceiver f53614G0;

    /* renamed from: H0 */
    private String f53615H0;

    /* renamed from: I0 */
    private String f53616I0;

    /* renamed from: J0 */
    private String f53617J0;

    /* renamed from: K0 */
    private String f53618K0;

    /* renamed from: L0 */
    private String f53619L0;

    /* renamed from: M0 */
    private String f53620M0;

    /* renamed from: N0 */
    private boolean f53621N0;

    /* renamed from: O0 */
    private C31179n0 f53622O0;

    /* renamed from: P0 */
    private C26947a.c f53623P0;

    /* renamed from: Q0 */
    private C25093p.c f53624Q0;

    /* renamed from: R0 */
    private int f53625R0;

    /* renamed from: S0 */
    private int f53626S0;

    /* renamed from: T0 */
    private boolean f53627T0;

    /* renamed from: U0 */
    private int f53628U0;

    /* renamed from: V0 */
    private boolean f53629V0;

    /* renamed from: W0 */
    private InterfaceC18505l f53630W0;

    /* renamed from: X0 */
    private InterfaceC18505l f53631X0;

    /* renamed from: Y0 */
    private CoroutineScope f53632Y0;

    /* renamed from: Z0 */
    private InterfaceC18505l f53633Z0;

    /* renamed from: a1 */
    private InterfaceC18505l f53634a1;

    /* renamed from: b1 */
    private InterfaceC18494a f53635b1;

    /* renamed from: c1 */
    private InterfaceC18494a f53636c1;

    /* renamed from: d1 */
    private InterfaceC18494a f53637d1;

    /* renamed from: e1 */
    private InterfaceC18505l f53638e1;

    /* renamed from: f1 */
    private boolean f53639f1;

    /* renamed from: g1 */
    private boolean f53640g1;

    /* renamed from: h1 */
    private boolean f53641h1;

    /* renamed from: i1 */
    private boolean f53642i1;

    /* renamed from: j1 */
    private boolean f53643j1;

    /* renamed from: k1 */
    private InterfaceC18505l f53644k1;

    /* renamed from: l1 */
    private final Runnable f53645l1;

    /* renamed from: m1 */
    private boolean f53646m1;

    /* renamed from: n1 */
    private boolean f53647n1;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10571a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10571a f53648y = new C10571a();

        C10571a() {
            super(3, C25026k2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageVideoBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m55404h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25026k2 m55404h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25026k2.m129870c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$a0 */
    /* loaded from: classes5.dex */
    public static final class C10572a0 implements OverScrollableRecyclerView.InterfaceC10832c {
        C10572a0() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31179n0 c31179n0;
            C31179n0 c31179n02 = VideoPageView.this.f53610C0;
            if (c31179n02 != null && !c31179n02.m151444M() && (c31179n0 = VideoPageView.this.f53610C0) != null) {
                c31179n0.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$b */
    /* loaded from: classes5.dex */
    public static final class C10573b {
        private C10573b() {
        }

        public /* synthetic */ C10573b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m55405a(Video video) {
            AbstractC19074t.m100208f(video, "video");
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("RESERVED_VIDEO", video), AbstractC24866w.m129235a("SOURCE", "SOURCE_BTS_COMMENT"), AbstractC24866w.m129235a("SHOW_WITH_FLAGS", 134217728));
        }

        /* renamed from: b */
        public final Bundle m55406b(Section section, int i11, String str) {
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str, "uuid");
            m55419o(section);
            m55418n(i11);
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_BOOKMARK"), AbstractC24866w.m129235a("SOURCE_UUID", str));
        }

        /* renamed from: c */
        public final Bundle m55407c(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "collectionId");
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str2, "uuid");
            m55419o(section);
            m55418n(i11);
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_COLLECTION"), AbstractC24866w.m129235a("COLLECTION", str), AbstractC24866w.m129235a("SOURCE_UUID", str2));
        }

        /* renamed from: d */
        public final Bundle m55408d(Video video) {
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_FOR_U"), AbstractC24866w.m129235a("RESERVED_VIDEO", video));
        }

        /* renamed from: e */
        public final Bundle m55409e(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "hashtag");
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str2, "uuid");
            m55419o(section);
            m55418n(i11);
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_HASHTAG"), AbstractC24866w.m129235a("HASHTAG", str), AbstractC24866w.m129235a("SOURCE_UUID", str2));
        }

        /* renamed from: f */
        public final Bundle m55410f(Section section, int i11, String str) {
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str, "uuid");
            m55419o(section);
            m55418n(i11);
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_LIKED"), AbstractC24866w.m129235a("SOURCE_UUID", str));
        }

        /* renamed from: g */
        public final Bundle m55411g(String str, String str2, String str3) {
            AbstractC19074t.m100208f(str, "videoId");
            long j11 = 0;
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_NOTI"), AbstractC24866w.m129235a("RESERVED_VIDEO", new Video(str, (String) null, (String) null, 0.0f, 0L, 0.0f, (String) null, (String) null, (String) null, (Channel) Channel.Anonymous.f49775h0, 0L, j11, j11, 0L, 0L, false, false, false, false, false, false, false, false, false, false, false, (String) null, (String) null, 0L, (String) null, 0, (String) null, (String) null, (String) null, (String) null, "noti", (String) null, (Integer) null, false, (String) null, (String) null, (String) null, (VideoPromote) null, (FooterVideoPromote) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (VideoAdsInfo) null, (List) null, 0L, (List) null, (Integer) null, (Integer) null, false, (String) null, -514, 67108855, (AbstractC19060k) null)), AbstractC24866w.m129235a("COMMENT_ID", str2), AbstractC24866w.m129235a("PARENT_CMT_ID", str3));
        }

        /* renamed from: h */
        public final Bundle m55412h(Section section, int i11, String str, String str2, String str3) {
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str, "kw");
            AbstractC19074t.m100208f(str2, "uuid");
            AbstractC19074t.m100208f(str3, "source");
            m55419o(section);
            m55418n(i11);
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", str3), AbstractC24866w.m129235a("SEARCH_KW", str), AbstractC24866w.m129235a("SOURCE_UUID", str2));
        }

        /* renamed from: i */
        public final Bundle m55413i(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "similarId");
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str2, "uuid");
            m55419o(section);
            m55418n(i11);
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_SIMILAR"), AbstractC24866w.m129235a("SIMILAR_ID", str), AbstractC24866w.m129235a("SOURCE_UUID", str2));
        }

        /* renamed from: j */
        public final Bundle m55414j(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "locationValue");
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str2, "uuid");
            m55419o(section);
            m55418n(i11);
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("VIDEO_LOCATION_VALUE", str), AbstractC24866w.m129235a("SOURCE", "SOURCE_LOCATION"), AbstractC24866w.m129235a("SOURCE_UUID", str2));
        }

        /* renamed from: k */
        public final VideoPageView m55415k(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "channelId");
            AbstractC19074t.m100208f(section, "videos");
            AbstractC19074t.m100208f(str2, "uuid");
            VideoPageView videoPageView = new VideoPageView();
            videoPageView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_CHANNEL"), AbstractC24866w.m129235a("CHANNEL_ID", str), AbstractC24866w.m129235a("SOURCE_UUID", str2)));
            C10573b c10573b = VideoPageView.Companion;
            c10573b.m55419o(section);
            c10573b.m55418n(i11);
            return videoPageView;
        }

        /* renamed from: l */
        public final VideoPageView m55416l(Video video) {
            VideoPageView videoPageView = new VideoPageView();
            videoPageView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_FOLLOWING"), AbstractC24866w.m129235a("RESERVED_VIDEO", video)));
            return videoPageView;
        }

        /* renamed from: m */
        public final VideoPageView m55417m(Video video) {
            VideoPageView videoPageView = new VideoPageView();
            videoPageView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SOURCE", "SOURCE_FRIEND"), AbstractC24866w.m129235a("RESERVED_VIDEO", video)));
            return videoPageView;
        }

        /* renamed from: n */
        public final void m55418n(int i11) {
            VideoPageView.f53608p1 = i11;
        }

        /* renamed from: o */
        public final void m55419o(Section section) {
            VideoPageView.f53607o1 = section;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$b0 */
    /* loaded from: classes5.dex */
    public static final class C10574b0 implements OverScrollableRecyclerView.InterfaceC10830a {

        /* renamed from: b */
        final /* synthetic */ OverScrollableRecyclerView f53651b;

        /* renamed from: c */
        final /* synthetic */ C25026k2 f53652c;

        C10574b0(OverScrollableRecyclerView overScrollableRecyclerView, C25026k2 c25026k2) {
            this.f53651b = overScrollableRecyclerView;
            this.f53652c = c25026k2;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10830a
        /* renamed from: a */
        public void mo52660a(float f11, float f12) {
            LoadMoreInfo loadMoreInfo;
            Section m151862c0;
            C31179n0 c31179n0 = VideoPageView.this.f53610C0;
            if (c31179n0 != null && (m151862c0 = c31179n0.m151862c0()) != null) {
                loadMoreInfo = m151862c0.m51171p();
            } else {
                loadMoreInfo = null;
            }
            if (loadMoreInfo != null) {
                if (f12 < 0.0f) {
                    if (this.f53651b.getScrollState() == 1) {
                        this.f53652c.getRoot().m55223r0();
                        return;
                    }
                    return;
                }
                this.f53652c.getRoot().m55215X();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$c */
    /* loaded from: classes5.dex */
    static final class C10575c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Section f53653q;

        /* renamed from: r */
        final /* synthetic */ Throwable f53654r;

        /* renamed from: s */
        final /* synthetic */ VideoPageView f53655s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10575c(Section section, Throwable th2, VideoPageView videoPageView) {
            super(0);
            this.f53653q = section;
            this.f53654r = th2;
            this.f53655s = videoPageView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55420a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55420a() {
            Section section = this.f53653q;
            if (section != null) {
                InterfaceC10628f.a.m55559c(this.f53655s, section, null, null, 2, null);
            }
            Throwable th2 = this.f53654r;
            if (th2 != null) {
                this.f53655s.mo55388d(th2);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$c0 */
    /* loaded from: classes5.dex */
    public static final class C10576c0 extends RecyclerView.AbstractC1892s {
        C10576c0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            VideoPageView.this.m55322WL();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$d */
    /* loaded from: classes5.dex */
    static final class C10577d extends AbstractC19075u implements InterfaceC18494a {
        C10577d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55421a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55421a() {
            VideoPageView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$d0 */
    /* loaded from: classes5.dex */
    static final class C10578d0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C25026k2 f53659r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10578d0(C25026k2 c25026k2) {
            super(2);
            this.f53659r = c25026k2;
        }

        /* renamed from: a */
        public final void m55422a(String str, PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(personalizeChannel, "channel");
            if (!VideoPageView.this.f53642i1 && VideoPageView.this.f53641h1) {
                if (!personalizeChannel.m51104c()) {
                    VideoPageView.this.f53640g1 = true;
                }
                VideoPageView.this.f53626S0 = 1;
                if (((ZaloView) VideoPageView.this).f88775p == 5 && VideoPageView.this.f53627T0 && !this.f53659r.f120036J.m55218b0() && !this.f53659r.f120036J.m55220d0()) {
                    VideoPageView.this.m55293BM();
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m55422a((String) obj, (PersonalizeChannel) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$e */
    /* loaded from: classes5.dex */
    public static final class C10579e extends AbstractC19075u implements InterfaceC18494a {
        C10579e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55423a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55423a() {
            LoadingLayout loadingLayout;
            C25026k2 c25026k2 = (C25026k2) VideoPageView.this.m55556SK();
            if (c25026k2 != null && (loadingLayout = c25026k2.f120035I) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10058f.a.m53677b(VideoPageView.this.f53609B0, null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$e0 */
    /* loaded from: classes5.dex */
    static final class C10580e0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10580e0 f53661q = new C10580e0();

        C10580e0() {
            super(1);
        }

        /* renamed from: a */
        public final void m55424a(long j11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55424a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$f */
    /* loaded from: classes5.dex */
    public static final class C10581f extends AbstractC19075u implements InterfaceC18494a {
        C10581f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24848g0 mo12V4() {
            MainPageView mainPageView;
            ZaloView m92650VI = VideoPageView.this.m92650VI();
            if (m92650VI instanceof MainPageView) {
                mainPageView = (MainPageView) m92650VI;
            } else {
                mainPageView = null;
            }
            if (mainPageView == null) {
                return null;
            }
            mainPageView.m54534bL(C18705c.d.f93973r.m98645c());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$f0 */
    /* loaded from: classes5.dex */
    static final class C10582f0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10582f0 f53663q = new C10582f0();

        C10582f0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55426a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55426a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$g */
    /* loaded from: classes5.dex */
    public static final class C10583g extends AbstractC19075u implements InterfaceC18494a {
        C10583g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24848g0 mo12V4() {
            MainPageView mainPageView;
            ZaloView m92650VI = VideoPageView.this.m92650VI();
            if (m92650VI instanceof MainPageView) {
                mainPageView = (MainPageView) m92650VI;
            } else {
                mainPageView = null;
            }
            if (mainPageView == null) {
                return null;
            }
            mainPageView.m54534bL(C18705c.d.f93973r.m98645c());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$g0 */
    /* loaded from: classes5.dex */
    static final class C10584g0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10584g0 f53665q = new C10584g0();

        C10584g0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55428a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55428a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$h */
    /* loaded from: classes5.dex */
    public static final class C10585h extends AbstractC19075u implements InterfaceC18494a {
        C10585h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55429a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55429a() {
            LoadingLayout loadingLayout;
            C25026k2 c25026k2 = (C25026k2) VideoPageView.this.m55556SK();
            if (c25026k2 != null && (loadingLayout = c25026k2.f120035I) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10058f.a.m53677b(VideoPageView.this.f53609B0, null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$h0 */
    /* loaded from: classes5.dex */
    static final class C10586h0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10586h0 f53667q = new C10586h0();

        C10586h0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55430a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55430a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$i */
    /* loaded from: classes5.dex */
    public static final class C10587i extends AbstractC19075u implements InterfaceC18494a {
        C10587i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55431a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55431a() {
            LoadingLayout loadingLayout;
            C25026k2 c25026k2 = (C25026k2) VideoPageView.this.m55556SK();
            if (c25026k2 != null && (loadingLayout = c25026k2.f120035I) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10058f.a.m53677b(VideoPageView.this.f53609B0, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$i0 */
    /* loaded from: classes5.dex */
    public static final class C10588i0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ CoreConfig f53669q;

        /* renamed from: r */
        final /* synthetic */ C25026k2 f53670r;

        /* renamed from: s */
        final /* synthetic */ VideoPageView f53671s;

        /* renamed from: t */
        final /* synthetic */ C19051f0 f53672t;

        /* renamed from: u */
        final /* synthetic */ Channel f53673u;

        /* renamed from: v */
        final /* synthetic */ C31179n0 f53674v;

        /* renamed from: w */
        final /* synthetic */ int f53675w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$i0$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: A */
            final /* synthetic */ long f53676A;

            /* renamed from: t */
            int f53677t;

            /* renamed from: u */
            final /* synthetic */ Channel f53678u;

            /* renamed from: v */
            final /* synthetic */ VideoPageView f53679v;

            /* renamed from: w */
            final /* synthetic */ CoreConfig f53680w;

            /* renamed from: x */
            final /* synthetic */ C31179n0 f53681x;

            /* renamed from: y */
            final /* synthetic */ int f53682y;

            /* renamed from: z */
            final /* synthetic */ C19051f0 f53683z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$i0$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32745a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f53684t;

                /* renamed from: u */
                final /* synthetic */ C31179n0 f53685u;

                /* renamed from: v */
                final /* synthetic */ int f53686v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32745a(C31179n0 c31179n0, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f53685u = c31179n0;
                    this.f53686v = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32745a(this.f53685u, this.f53686v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f53684t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C31179n0.m151848r0(this.f53685u, this.f53686v, true, false, 4, null);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32745a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$i0$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f53687t;

                /* renamed from: u */
                final /* synthetic */ C19051f0 f53688u;

                /* renamed from: v */
                final /* synthetic */ VideoPageView f53689v;

                /* renamed from: w */
                final /* synthetic */ long f53690w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C19051f0 c19051f0, VideoPageView videoPageView, long j11, Continuation continuation) {
                    super(2, continuation);
                    this.f53688u = c19051f0;
                    this.f53689v = videoPageView;
                    this.f53690w = j11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f53688u, this.f53689v, this.f53690w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f53687t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f53688u.f94928p = false;
                        this.f53689v.f53630W0.mo205i9(AbstractC29094b.m145342d(this.f53690w));
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Channel channel, VideoPageView videoPageView, CoreConfig coreConfig, C31179n0 c31179n0, int i11, C19051f0 c19051f0, long j11, Continuation continuation) {
                super(2, continuation);
                this.f53678u = channel;
                this.f53679v = videoPageView;
                this.f53680w = coreConfig;
                this.f53681x = c31179n0;
                this.f53682y = i11;
                this.f53683z = c19051f0;
                this.f53676A = j11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f53678u, this.f53679v, this.f53680w, this.f53681x, this.f53682y, this.f53683z, this.f53676A, continuation);
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0110 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00e5 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:10:0x0017, B:14:0x001f, B:15:0x00d7, B:17:0x00e5, B:18:0x00ec, B:22:0x0024, B:23:0x00a4, B:26:0x0029, B:27:0x0063, B:29:0x0079, B:31:0x0082, B:33:0x008c, B:36:0x00ba, B:41:0x0030, B:43:0x0038, B:46:0x004d), top: B:2:0x0007 }] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00f5 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:10:0x0017, B:14:0x001f, B:15:0x00d7, B:17:0x00e5, B:18:0x00ec, B:22:0x0024, B:23:0x00a4, B:26:0x0029, B:27:0x0063, B:29:0x0079, B:31:0x0082, B:33:0x008c, B:36:0x00ba, B:41:0x0030, B:43:0x0038, B:46:0x004d), top: B:2:0x0007 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                MainCoroutineDispatcher m112681c;
                b bVar;
                C0054s c0054s;
                int m160c;
                Integer m51451n;
                int i11;
                InterfaceC10058f interfaceC10058f;
                InterfaceC10058f interfaceC10058f2;
                String m50769l;
                InterfaceC10058f interfaceC10058f3;
                Integer m51450m;
                int i12;
                m142578e = AbstractC28298d.m142578e();
                switch (this.f53677t) {
                    case 0:
                        AbstractC24862s.m129228b(obj);
                        if (this.f53678u.m50741Q()) {
                            InterfaceC10058f interfaceC10058f4 = this.f53679v.f53609B0;
                            String m50769l2 = this.f53678u.m50769l();
                            this.f53677t = 1;
                            if (interfaceC10058f4.mo53569O2(m50769l2, this) == m142578e) {
                                return m142578e;
                            }
                            m112681c = Dispatchers.m112681c();
                            bVar = new b(this.f53683z, this.f53679v, this.f53676A, null);
                            this.f53677t = 7;
                            if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        InterfaceC10058f interfaceC10058f5 = this.f53679v.f53609B0;
                        String m50769l3 = this.f53678u.m50769l();
                        this.f53677t = 2;
                        obj = interfaceC10058f5.mo53587p1(m50769l3, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c0054s = (C0054s) obj;
                        c0054s.m162e(c0054s.m160c() + 1);
                        m160c = c0054s.m160c();
                        m51451n = this.f53680w.m51451n();
                        if (m51451n == null) {
                            i11 = m51451n.intValue();
                        } else {
                            i11 = 10;
                        }
                        if (m160c >= i11 || !this.f53681x.m151871l0(this.f53682y)) {
                            interfaceC10058f = this.f53679v.f53609B0;
                            c0054s.m161d(C27417l.f129055a.m140382f().m130131a());
                            this.f53677t = 5;
                            if (interfaceC10058f.mo53580f3(c0054s, this) == m142578e) {
                                return m142578e;
                            }
                            interfaceC10058f3 = this.f53679v.f53609B0;
                            m51450m = this.f53680w.m51450m();
                            if (m51450m != null) {
                                i12 = m51450m.intValue();
                            } else {
                                i12 = 100;
                            }
                            this.f53677t = 6;
                            if (interfaceC10058f3.mo53566J3(i12, this) == m142578e) {
                                return m142578e;
                            }
                            m112681c = Dispatchers.m112681c();
                            bVar = new b(this.f53683z, this.f53679v, this.f53676A, null);
                            this.f53677t = 7;
                            if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                            }
                            return C24848g0.f119245a;
                        }
                        MainCoroutineDispatcher m112681c2 = Dispatchers.m112681c();
                        C32745a c32745a = new C32745a(this.f53681x, this.f53682y, null);
                        this.f53677t = 3;
                        if (BuildersKt.m112534g(m112681c2, c32745a, this) == m142578e) {
                            return m142578e;
                        }
                        interfaceC10058f2 = this.f53679v.f53609B0;
                        m50769l = this.f53678u.m50769l();
                        this.f53677t = 4;
                        if (interfaceC10058f2.mo53569O2(m50769l, this) == m142578e) {
                            return m142578e;
                        }
                        m112681c = Dispatchers.m112681c();
                        bVar = new b(this.f53683z, this.f53679v, this.f53676A, null);
                        this.f53677t = 7;
                        if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    case 1:
                    case 4:
                    case 6:
                        AbstractC24862s.m129228b(obj);
                        m112681c = Dispatchers.m112681c();
                        bVar = new b(this.f53683z, this.f53679v, this.f53676A, null);
                        this.f53677t = 7;
                        if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    case 2:
                        AbstractC24862s.m129228b(obj);
                        c0054s = (C0054s) obj;
                        c0054s.m162e(c0054s.m160c() + 1);
                        m160c = c0054s.m160c();
                        m51451n = this.f53680w.m51451n();
                        if (m51451n == null) {
                        }
                        if (m160c >= i11) {
                            break;
                        }
                        interfaceC10058f = this.f53679v.f53609B0;
                        c0054s.m161d(C27417l.f129055a.m140382f().m130131a());
                        this.f53677t = 5;
                        if (interfaceC10058f.mo53580f3(c0054s, this) == m142578e) {
                        }
                        interfaceC10058f3 = this.f53679v.f53609B0;
                        m51450m = this.f53680w.m51450m();
                        if (m51450m != null) {
                        }
                        this.f53677t = 6;
                        if (interfaceC10058f3.mo53566J3(i12, this) == m142578e) {
                        }
                        m112681c = Dispatchers.m112681c();
                        bVar = new b(this.f53683z, this.f53679v, this.f53676A, null);
                        this.f53677t = 7;
                        if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    case 3:
                        AbstractC24862s.m129228b(obj);
                        interfaceC10058f2 = this.f53679v.f53609B0;
                        m50769l = this.f53678u.m50769l();
                        this.f53677t = 4;
                        if (interfaceC10058f2.mo53569O2(m50769l, this) == m142578e) {
                        }
                        m112681c = Dispatchers.m112681c();
                        bVar = new b(this.f53683z, this.f53679v, this.f53676A, null);
                        this.f53677t = 7;
                        if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    case 5:
                        AbstractC24862s.m129228b(obj);
                        interfaceC10058f3 = this.f53679v.f53609B0;
                        m51450m = this.f53680w.m51450m();
                        if (m51450m != null) {
                        }
                        this.f53677t = 6;
                        if (interfaceC10058f3.mo53566J3(i12, this) == m142578e) {
                        }
                        m112681c = Dispatchers.m112681c();
                        bVar = new b(this.f53683z, this.f53679v, this.f53676A, null);
                        this.f53677t = 7;
                        if (BuildersKt.m112534g(m112681c, bVar, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    case 7:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10588i0(CoreConfig coreConfig, C25026k2 c25026k2, VideoPageView videoPageView, C19051f0 c19051f0, Channel channel, C31179n0 c31179n0, int i11) {
            super(1);
            this.f53669q = coreConfig;
            this.f53670r = c25026k2;
            this.f53671s = videoPageView;
            this.f53672t = c19051f0;
            this.f53673u = channel;
            this.f53674v = c31179n0;
            this.f53675w = i11;
        }

        /* renamed from: a */
        public final void m55432a(long j11) {
            long j12;
            Long m51452o = this.f53669q.m51452o();
            if (m51452o != null) {
                j12 = m51452o.longValue();
            } else {
                j12 = 120000;
            }
            if (j11 >= j12) {
                this.f53670r.f120038L.m52619c0(this.f53671s.f53631X0);
                BuildersKt__Builders_commonKt.m112540d(this.f53671s.f53632Y0, null, null, new a(this.f53673u, this.f53671s, this.f53669q, this.f53674v, this.f53675w, this.f53672t, j11, null), 3, null);
                this.f53672t.f94928p = true;
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55432a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$j */
    /* loaded from: classes5.dex */
    public static final class C10589j extends AbstractC19075u implements InterfaceC18494a {
        C10589j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55436a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55436a() {
            LoadingLayout loadingLayout;
            C25026k2 c25026k2 = (C25026k2) VideoPageView.this.m55556SK();
            if (c25026k2 != null && (loadingLayout = c25026k2.f120035I) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10058f.a.m53677b(VideoPageView.this.f53609B0, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$j0 */
    /* loaded from: classes5.dex */
    public static final class C10590j0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C19051f0 f53692q;

        /* renamed from: r */
        final /* synthetic */ CoreConfig f53693r;

        /* renamed from: s */
        final /* synthetic */ C25026k2 f53694s;

        /* renamed from: t */
        final /* synthetic */ VideoPageView f53695t;

        /* renamed from: u */
        final /* synthetic */ Channel f53696u;

        /* renamed from: v */
        final /* synthetic */ C31179n0 f53697v;

        /* renamed from: w */
        final /* synthetic */ int f53698w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10590j0(C19051f0 c19051f0, CoreConfig coreConfig, C25026k2 c25026k2, VideoPageView videoPageView, Channel channel, C31179n0 c31179n0, int i11) {
            super(1);
            this.f53692q = c19051f0;
            this.f53693r = coreConfig;
            this.f53694s = c25026k2;
            this.f53695t = videoPageView;
            this.f53696u = channel;
            this.f53697v = c31179n0;
            this.f53698w = i11;
        }

        /* renamed from: a */
        public final void m55437a(long j11) {
            long j12;
            if (!this.f53692q.f94928p) {
                Long m51446i = this.f53693r.m51446i();
                if (m51446i != null) {
                    j12 = m51446i.longValue();
                } else {
                    j12 = 15000;
                }
                if (j11 >= j12) {
                    this.f53694s.f120038L.m52619c0(this.f53695t.f53630W0);
                    if (!this.f53696u.m50741Q()) {
                        C31179n0.m151848r0(this.f53697v, this.f53698w, false, false, 6, null);
                    }
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55437a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$k */
    /* loaded from: classes5.dex */
    static final class C10591k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Section f53700r;

        /* renamed from: s */
        final /* synthetic */ List f53701s;

        /* renamed from: t */
        final /* synthetic */ List f53702t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10591k(Section section, List list, List list2) {
            super(0);
            this.f53700r = section;
            this.f53701s = list;
            this.f53702t = list2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55438a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55438a() {
            VideoPageView.this.mo55380MD(this.f53700r, this.f53701s, this.f53702t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$k0 */
    /* loaded from: classes5.dex */
    public static final class C10592k0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10592k0 f53703q = new C10592k0();

        C10592k0() {
            super(1);
        }

        /* renamed from: a */
        public final void m55439a(long j11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55439a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$l */
    /* loaded from: classes5.dex */
    static final class C10593l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10593l f53704q = new C10593l();

        C10593l() {
            super(1);
        }

        /* renamed from: a */
        public final void m55440a(long j11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55440a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$l0 */
    /* loaded from: classes5.dex */
    public static final class C10594l0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: A */
        final /* synthetic */ C31179n0 f53705A;

        /* renamed from: q */
        final /* synthetic */ C19051f0 f53706q;

        /* renamed from: r */
        final /* synthetic */ Integer f53707r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC29280a f53708s;

        /* renamed from: t */
        final /* synthetic */ Video f53709t;

        /* renamed from: u */
        final /* synthetic */ int f53710u;

        /* renamed from: v */
        final /* synthetic */ boolean f53711v;

        /* renamed from: w */
        final /* synthetic */ C25026k2 f53712w;

        /* renamed from: x */
        final /* synthetic */ VideoPageView f53713x;

        /* renamed from: y */
        final /* synthetic */ long f53714y;

        /* renamed from: z */
        final /* synthetic */ int f53715z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$l0$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPageView f53716q;

            /* renamed from: r */
            final /* synthetic */ int f53717r;

            /* renamed from: s */
            final /* synthetic */ InterfaceC29280a f53718s;

            /* renamed from: t */
            final /* synthetic */ Video f53719t;

            /* renamed from: u */
            final /* synthetic */ C31179n0 f53720u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VideoPageView videoPageView, int i11, InterfaceC29280a interfaceC29280a, Video video, C31179n0 c31179n0) {
                super(0);
                this.f53716q = videoPageView;
                this.f53717r = i11;
                this.f53718s = interfaceC29280a;
                this.f53719t = video;
                this.f53720u = c31179n0;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55442a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55442a() {
                this.f53716q.m55295CM(this.f53717r, this.f53718s, this.f53719t, this.f53720u.m151863d0());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10594l0(C19051f0 c19051f0, Integer num, InterfaceC29280a interfaceC29280a, Video video, int i11, boolean z11, C25026k2 c25026k2, VideoPageView videoPageView, long j11, int i12, C31179n0 c31179n0) {
            super(1);
            this.f53706q = c19051f0;
            this.f53707r = num;
            this.f53708s = interfaceC29280a;
            this.f53709t = video;
            this.f53710u = i11;
            this.f53711v = z11;
            this.f53712w = c25026k2;
            this.f53713x = videoPageView;
            this.f53714y = j11;
            this.f53715z = i12;
            this.f53705A = c31179n0;
        }

        /* renamed from: a */
        public final void m55441a(long j11) {
            C19051f0 c19051f0 = this.f53706q;
            if (!c19051f0.f94928p && this.f53707r != null) {
                c19051f0.f94928p = true;
                this.f53708s.mo146316R(this.f53709t.m52911t());
            }
            Integer num = this.f53707r;
            if ((num != null && num.intValue() < this.f53710u) || this.f53711v) {
                this.f53712w.f120038L.m52619c0(this.f53713x.f53633Z0);
            }
            Integer num2 = this.f53707r;
            if ((num2 == null || num2.intValue() >= this.f53710u) && !this.f53711v && AbstractC19074t.m100204b(this.f53709t.m52918x0(), Boolean.TRUE) && j11 >= this.f53714y && !this.f53709t.m52909q0()) {
                if (this.f53713x.f53628U0 <= 0) {
                    this.f53713x.m55295CM(this.f53715z, this.f53708s, this.f53709t, this.f53705A.m151863d0());
                } else {
                    VideoPageView videoPageView = this.f53713x;
                    videoPageView.f53637d1 = new a(videoPageView, this.f53715z, this.f53708s, this.f53709t, this.f53705A);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55441a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$m */
    /* loaded from: classes5.dex */
    static final class C10595m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10595m f53721q = new C10595m();

        C10595m() {
            super(1);
        }

        /* renamed from: a */
        public final void m55443a(long j11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55443a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$m0 */
    /* loaded from: classes5.dex */
    public static final class C10596m0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Integer f53722q;

        /* renamed from: r */
        final /* synthetic */ int f53723r;

        /* renamed from: s */
        final /* synthetic */ boolean f53724s;

        /* renamed from: t */
        final /* synthetic */ Video f53725t;

        /* renamed from: u */
        final /* synthetic */ VideoPageView f53726u;

        /* renamed from: v */
        final /* synthetic */ int f53727v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC29280a f53728w;

        /* renamed from: x */
        final /* synthetic */ C31179n0 f53729x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$m0$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPageView f53730q;

            /* renamed from: r */
            final /* synthetic */ int f53731r;

            /* renamed from: s */
            final /* synthetic */ InterfaceC29280a f53732s;

            /* renamed from: t */
            final /* synthetic */ Video f53733t;

            /* renamed from: u */
            final /* synthetic */ C31179n0 f53734u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VideoPageView videoPageView, int i11, InterfaceC29280a interfaceC29280a, Video video, C31179n0 c31179n0) {
                super(0);
                this.f53730q = videoPageView;
                this.f53731r = i11;
                this.f53732s = interfaceC29280a;
                this.f53733t = video;
                this.f53734u = c31179n0;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55445a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55445a() {
                this.f53730q.m55295CM(this.f53731r, this.f53732s, this.f53733t, this.f53734u.m151863d0());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10596m0(Integer num, int i11, boolean z11, Video video, VideoPageView videoPageView, int i12, InterfaceC29280a interfaceC29280a, C31179n0 c31179n0) {
            super(0);
            this.f53722q = num;
            this.f53723r = i11;
            this.f53724s = z11;
            this.f53725t = video;
            this.f53726u = videoPageView;
            this.f53727v = i12;
            this.f53728w = interfaceC29280a;
            this.f53729x = c31179n0;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55444a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55444a() {
            Integer num = this.f53722q;
            if ((num == null || num.intValue() >= this.f53723r) && !this.f53724s && AbstractC19074t.m100204b(this.f53725t.m52918x0(), Boolean.TRUE) && !this.f53725t.m52909q0()) {
                if (this.f53726u.f53628U0 <= 0) {
                    this.f53726u.m55295CM(this.f53727v, this.f53728w, this.f53725t, this.f53729x.m151863d0());
                } else {
                    VideoPageView videoPageView = this.f53726u;
                    videoPageView.f53637d1 = new a(videoPageView, this.f53727v, this.f53728w, this.f53725t, this.f53729x);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$n */
    /* loaded from: classes5.dex */
    static final class C10597n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10597n f53735q = new C10597n();

        C10597n() {
            super(1);
        }

        /* renamed from: a */
        public final void m55446a(long j11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55446a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$n0 */
    /* loaded from: classes5.dex */
    public static final class C10598n0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: A */
        final /* synthetic */ C31179n0 f53736A;

        /* renamed from: B */
        final /* synthetic */ int f53737B;

        /* renamed from: q */
        final /* synthetic */ C19051f0 f53738q;

        /* renamed from: r */
        final /* synthetic */ Integer f53739r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC29280a f53740s;

        /* renamed from: t */
        final /* synthetic */ Video f53741t;

        /* renamed from: u */
        final /* synthetic */ int f53742u;

        /* renamed from: v */
        final /* synthetic */ boolean f53743v;

        /* renamed from: w */
        final /* synthetic */ C25026k2 f53744w;

        /* renamed from: x */
        final /* synthetic */ VideoPageView f53745x;

        /* renamed from: y */
        final /* synthetic */ long f53746y;

        /* renamed from: z */
        final /* synthetic */ CoreConfig f53747z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10598n0(C19051f0 c19051f0, Integer num, InterfaceC29280a interfaceC29280a, Video video, int i11, boolean z11, C25026k2 c25026k2, VideoPageView videoPageView, long j11, CoreConfig coreConfig, C31179n0 c31179n0, int i12) {
            super(1);
            this.f53738q = c19051f0;
            this.f53739r = num;
            this.f53740s = interfaceC29280a;
            this.f53741t = video;
            this.f53742u = i11;
            this.f53743v = z11;
            this.f53744w = c25026k2;
            this.f53745x = videoPageView;
            this.f53746y = j11;
            this.f53747z = coreConfig;
            this.f53736A = c31179n0;
            this.f53737B = i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m55447a(long j11) {
            int hashCode;
            int i11;
            Map m131407l;
            List m131496e;
            List m131496e2;
            C19051f0 c19051f0 = this.f53738q;
            if (!c19051f0.f94928p && this.f53739r != null) {
                c19051f0.f94928p = true;
                this.f53740s.mo146337l(this.f53741t.m52911t());
            }
            Integer num = this.f53739r;
            if ((num != null && num.intValue() < this.f53742u) || this.f53743v) {
                this.f53744w.f120038L.m52619c0(this.f53745x.f53634a1);
            }
            Integer num2 = this.f53739r;
            if ((num2 == null || num2.intValue() >= this.f53742u) && !this.f53743v) {
                Boolean m52921z0 = this.f53741t.m52921z0();
                Boolean bool = Boolean.TRUE;
                if (AbstractC19074t.m100204b(m52921z0, bool) && j11 >= this.f53746y) {
                    this.f53740s.mo146313O(this.f53741t.m52911t());
                    this.f53740s.mo146344s();
                    this.f53744w.f120038L.m52619c0(this.f53745x.f53634a1);
                    String mo146341p = this.f53740s.mo146341p();
                    if (((mo146341p != null && mo146341p.length() != 0) || !AbstractC19074t.m100204b(this.f53747z.m51456s().m51486a(), bool)) && (!AbstractC19074t.m100204b(mo146341p, ShareBottomSheet.EnumC9518c.f50458q.m51924c()) || !AbstractC19074t.m100204b(this.f53747z.m51456s().m51486a(), bool))) {
                        ShareBottomSheet.EnumC9518c enumC9518c = ShareBottomSheet.EnumC9518c.f50459r;
                        if (!AbstractC19074t.m100204b(mo146341p, enumC9518c.m51924c()) || AbstractC19074t.m100204b(this.f53747z.m51456s().m51487b(), bool) || !AbstractC19074t.m100204b(this.f53747z.m51456s().m51486a(), bool)) {
                            if (AbstractC19074t.m100204b(mo146341p, enumC9518c.m51924c()) && AbstractC19074t.m100204b(this.f53747z.m51456s().m51487b(), bool)) {
                                C31179n0 c31179n0 = this.f53736A;
                                int i12 = this.f53737B;
                                m131496e2 = AbstractC25366r.m131496e("SUGGEST_SHARE_DIARY");
                                c31179n0.m10010r(i12, m131496e2);
                                C19205a c19205a = C19205a.f95429a;
                                VideoPageView videoPageView = this.f53745x;
                                String m151863d0 = this.f53736A.m151863d0();
                                hashCode = m151863d0.hashCode();
                                if (hashCode == -507563187) {
                                    if (hashCode != 596808987) {
                                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                                            i11 = AbstractC27413h.zch_action_key_friend_show_share_suggestion;
                                        }
                                        i11 = AbstractC27413h.zch_action_key_player_show_share_suggestion;
                                    } else {
                                        if (m151863d0.equals("SOURCE_FOR_U")) {
                                            i11 = AbstractC27413h.zch_action_key_foru_show_share_suggestion;
                                        }
                                        i11 = AbstractC27413h.zch_action_key_player_show_share_suggestion;
                                    }
                                } else {
                                    if (m151863d0.equals("SOURCE_FOLLOWING")) {
                                        i11 = AbstractC27413h.zch_action_key_following_show_share_suggestion;
                                    }
                                    i11 = AbstractC27413h.zch_action_key_player_show_share_suggestion;
                                }
                                String m92652XI = videoPageView.m92652XI(i11);
                                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f53741t.m52911t()), AbstractC24866w.m129235a("channel_uid", this.f53741t.m52887f().m50769l()));
                                c19205a.m100713L(m92652XI, m131407l);
                            }
                            return;
                        }
                    }
                    C31179n0 c31179n02 = this.f53736A;
                    int i13 = this.f53737B;
                    m131496e = AbstractC25366r.m131496e("SUGGEST_SHARE_CHAT");
                    c31179n02.m10010r(i13, m131496e);
                    C19205a c19205a2 = C19205a.f95429a;
                    VideoPageView videoPageView2 = this.f53745x;
                    String m151863d02 = this.f53736A.m151863d0();
                    hashCode = m151863d02.hashCode();
                    if (hashCode == -507563187) {
                    }
                    String m92652XI2 = videoPageView2.m92652XI(i11);
                    AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                    m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f53741t.m52911t()), AbstractC24866w.m129235a("channel_uid", this.f53741t.m52887f().m50769l()));
                    c19205a2.m100713L(m92652XI2, m131407l);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55447a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$o */
    /* loaded from: classes5.dex */
    static final class C10599o extends AbstractC19075u implements InterfaceC18494a {
        C10599o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55448a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55448a() {
            C9768d c9768d = VideoPageView.this.f53611D0;
            if (c9768d != null) {
                Integer valueOf = Integer.valueOf(c9768d.m52731t());
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    VideoPageView videoPageView = VideoPageView.this;
                    int intValue = valueOf.intValue();
                    C31179n0 c31179n0 = videoPageView.f53610C0;
                    if (c31179n0 != null) {
                        C31179n0.m151848r0(c31179n0, intValue, false, true, 2, null);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$o0 */
    /* loaded from: classes5.dex */
    public static final class C10600o0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ VideoAdsInfo f53749q;

        /* renamed from: r */
        final /* synthetic */ C25026k2 f53750r;

        /* renamed from: s */
        final /* synthetic */ VideoPageView f53751s;

        /* renamed from: t */
        final /* synthetic */ C31179n0 f53752t;

        /* renamed from: u */
        final /* synthetic */ int f53753u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10600o0(VideoAdsInfo videoAdsInfo, C25026k2 c25026k2, VideoPageView videoPageView, C31179n0 c31179n0, int i11) {
            super(1);
            this.f53749q = videoAdsInfo;
            this.f53750r = c25026k2;
            this.f53751s = videoPageView;
            this.f53752t = c31179n0;
            this.f53753u = i11;
        }

        /* renamed from: a */
        public final void m55449a(long j11) {
            List m131496e;
            if (j11 >= this.f53749q.m52938n()) {
                this.f53750r.f120038L.m52619c0(this.f53751s.f53638e1);
                C31179n0 c31179n0 = this.f53752t;
                int i11 = this.f53753u;
                m131496e = AbstractC25366r.m131496e("TRIGGER_UPDATE_ACTION");
                c31179n0.m10010r(i11, m131496e);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55449a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$p */
    /* loaded from: classes5.dex */
    public static final class C10601p extends AbstractC19075u implements InterfaceC18505l {
        C10601p() {
            super(1);
        }

        /* renamed from: a */
        public final void m55450a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "throwable");
            C25097t.f120556a.m130155r(VideoPageView.this.getContext(), th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55450a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$p0 */
    /* loaded from: classes5.dex */
    static final class C10602p0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10602p0 f53756q = new C10602p0();

        C10602p0() {
            super(1);
        }

        /* renamed from: a */
        public final void m55451a(long j11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55451a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$q */
    /* loaded from: classes5.dex */
    public static final class C10603q extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f53758r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$q$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C9768d f53759q;

            /* renamed from: r */
            final /* synthetic */ int f53760r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9768d c9768d, int i11) {
                super(1);
                this.f53759q = c9768d;
                this.f53760r = i11;
            }

            /* renamed from: a */
            public final void m55455a(RecyclerView recyclerView) {
                AbstractC19074t.m100208f(recyclerView, "it");
                this.f53759q.m52725P(this.f53760r);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m55455a((RecyclerView) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10603q(Video video) {
            super(1);
            this.f53758r = video;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m55453c(C9768d c9768d) {
            AbstractC19074t.m100208f(c9768d, "$videoManager");
            C9768d.m52698B(c9768d, false, 1, null);
        }

        /* renamed from: b */
        public final void m55454b(Video video) {
            LoadingLayout loadingLayout;
            OverScrollableRecyclerView overScrollableRecyclerView;
            AbstractC19074t.m100208f(video, "videoDetail");
            try {
                C31179n0 c31179n0 = VideoPageView.this.f53610C0;
                AbstractC19074t.m100205c(c31179n0);
                final C9768d c9768d = VideoPageView.this.f53611D0;
                AbstractC19074t.m100205c(c9768d);
                if (!c31179n0.mo151443L()) {
                    VideoPageView videoPageView = VideoPageView.this;
                    Video video2 = this.f53758r;
                    video.m52868T0(video2.m52858O());
                    video.m52870U0(video2.m52861Q());
                    video.m52853L0(0);
                    videoPageView.mo55392hp(video);
                    return;
                }
                Object obj = c31179n0.f143912B.get(c9768d.m52730s());
                String str = null;
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video3 = (Video) obj;
                if (video3 != null) {
                    str = video3.m52911t();
                }
                if (AbstractC19074t.m100204b(str, video.m52911t())) {
                    return;
                }
                if (c9768d.m52730s() != -1 && c9768d.m52730s() == c31179n0.m151866g0()) {
                    int m52730s = c9768d.m52730s();
                    Video video4 = this.f53758r;
                    AbstractC19074t.m100207e(video4, "$video");
                    c31179n0.m151850A0(m52730s, video4);
                    AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.view.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoPageView.C10603q.m55453c(C9768d.this);
                        }
                    });
                    return;
                }
                int m52730s2 = c9768d.m52730s() + 1;
                Video video5 = this.f53758r;
                video.m52868T0(video5.m52858O());
                video.m52870U0(video5.m52861Q());
                video.m52853L0(Integer.valueOf(m52730s2));
                C24848g0 c24848g0 = C24848g0.f119245a;
                c31179n0.m151869j0(m52730s2, video);
                C25026k2 c25026k2 = (C25026k2) VideoPageView.this.m55556SK();
                if (c25026k2 != null && (overScrollableRecyclerView = c25026k2.f120031E) != null) {
                    AbstractC26112n.m134406k(overScrollableRecyclerView, new a(c9768d, m52730s2));
                }
                C25026k2 c25026k22 = (C25026k2) VideoPageView.this.m55556SK();
                if (c25026k22 != null && (loadingLayout = c25026k22.f120035I) != null) {
                    loadingLayout.m55781c();
                    loadingLayout.m55780b();
                }
            } catch (Exception e11) {
                C25097t.f120556a.m130155r(VideoPageView.this.getContext(), e11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55454b((Video) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$q0 */
    /* loaded from: classes5.dex */
    public static final class C10604q0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ long f53761q;

        /* renamed from: r */
        final /* synthetic */ VideoPageView f53762r;

        /* renamed from: s */
        final /* synthetic */ C25026k2 f53763s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10604q0(long j11, VideoPageView videoPageView, C25026k2 c25026k2) {
            super(1);
            this.f53761q = j11;
            this.f53762r = videoPageView;
            this.f53763s = c25026k2;
        }

        /* renamed from: a */
        public final void m55456a(long j11) {
            int i11;
            CoreConfig m51425b;
            Integer m51454q;
            if (j11 >= this.f53761q) {
                int mo146346u = AbstractC28684a.Companion.m143681o().mo146346u();
                ChannelConfig m140381e = C27417l.f129055a.m140381e();
                if (m140381e != null && (m51425b = m140381e.m51425b()) != null && (m51454q = m51425b.m51454q()) != null) {
                    i11 = m51454q.intValue();
                } else {
                    i11 = 0;
                }
                if (mo146346u > i11) {
                    ZaloView m92650VI = this.f53762r.m92650VI();
                    AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView");
                    if (!((VideoChannelPagerView) m92650VI).m55101jL() && this.f53763s.f120031E.getScrollState() == 0 && !this.f53763s.f120036J.m55220d0() && !this.f53763s.f120036J.m55218b0() && !this.f53763s.f120036J.m55219c0() && !this.f53762r.f53642i1) {
                        this.f53763s.f120036J.m55221o0();
                        this.f53762r.f53646m1 = true;
                        this.f53762r.f53647n1 = true;
                        C19205a c19205a = C19205a.f95429a;
                        String m92652XI = this.f53762r.m92652XI(AbstractC27413h.zch_action_key_show_guide_swipe_up_bottom);
                        AbstractC19074t.m100207e(m92652XI, "getString(...)");
                        C19205a.m100675M(c19205a, m92652XI, null, 2, null);
                    }
                }
                this.f53763s.f120038L.m52619c0(this.f53762r.f53644k1);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55456a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$r */
    /* loaded from: classes5.dex */
    static final class C10605r extends AbstractC19075u implements InterfaceC18510q {
        C10605r() {
            super(3);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m55457a((String) obj, ((Number) obj2).intValue(), (String) obj3);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55457a(String str, int i11, String str2) {
            C9768d c9768d;
            List m131505m;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            C31179n0 c31179n0 = VideoPageView.this.f53610C0;
            if (c31179n0 == null || (c9768d = VideoPageView.this.f53611D0) == null) {
                return;
            }
            Integer valueOf = Integer.valueOf(c9768d.m52730s());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj2 = c31179n0.f143912B.get(intValue);
                if (obj2 instanceof Object) {
                    obj = obj2;
                }
                if ((obj instanceof LivestreamData) && AbstractC19074t.m100204b(((LivestreamData) obj).m51016f(), str)) {
                    m131505m = AbstractC25368s.m131505m("STATUS", Integer.valueOf(i11), str2);
                    c31179n0.m10010r(intValue, m131505m);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$r0 */
    /* loaded from: classes5.dex */
    public static final class RunnableC10606r0 implements Runnable {
        public RunnableC10606r0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoLayout videoLayout;
            List m131496e;
            if (!VideoPageView.this.mo60294yp()) {
                C9768d c9768d = VideoPageView.this.f53611D0;
                if (c9768d != null) {
                    Integer valueOf = Integer.valueOf(c9768d.m52730s());
                    if (valueOf.intValue() <= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        C31179n0 c31179n0 = VideoPageView.this.f53610C0;
                        if (c31179n0 != null) {
                            m131496e = AbstractC25366r.m131496e("TRIGGER_SCROLL_FOOTER");
                            c31179n0.m10010r(intValue, m131496e);
                        }
                    }
                }
                C25026k2 c25026k2 = (C25026k2) VideoPageView.this.m55556SK();
                if (c25026k2 != null && (videoLayout = c25026k2.f120038L) != null) {
                    VideoPageView videoPageView = VideoPageView.this;
                    AbstractC19074t.m100205c(videoLayout);
                    videoPageView.m55363tM(videoLayout);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$s */
    /* loaded from: classes5.dex */
    public static final class C10607s implements VideoPageLayout.InterfaceC10526a {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$s$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPageView f53767q;

            /* renamed from: r */
            final /* synthetic */ Channel f53768r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VideoPageView videoPageView, Channel channel) {
                super(0);
                this.f53767q = videoPageView;
                this.f53768r = channel;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55458a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55458a() {
                InterfaceC10058f.a.m53679d(this.f53767q.f53609B0, this.f53768r, false, false, null, 12, null);
            }
        }

        C10607s() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: a */
        public void mo55227a() {
            C9768d c9768d = VideoPageView.this.f53611D0;
            if (c9768d != null) {
                c9768d.m52716E();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: b */
        public void mo55228b() {
            VideoPageView.this.m55322WL();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: c */
        public void mo55229c(Channel channel, boolean z11) {
            AbstractC19074t.m100208f(channel, "channel");
            if (z11) {
                InterfaceC10058f.a.m53679d(VideoPageView.this.f53609B0, channel, true, false, null, 12, null);
                return;
            }
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_title), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_message), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_positive), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_negative), null, false, false, 112, null);
            m51992b.m51991lL(new a(VideoPageView.this, channel));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, VideoPageView.this.m55340fM(), null, 2, null);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: d */
        public void mo55230d(long j11, long j12) {
            int i11;
            Map m131407l;
            C19205a c19205a = C19205a.f95429a;
            VideoPageView videoPageView = VideoPageView.this;
            String mo53582h = videoPageView.f53609B0.mo53582h();
            int hashCode = mo53582h.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && mo53582h.equals("SOURCE_FRIEND")) {
                        i11 = AbstractC27413h.zch_action_key_friend_seek;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_seek;
                } else {
                    if (mo53582h.equals("SOURCE_FOR_U")) {
                        i11 = AbstractC27413h.zch_action_key_for_u_seek;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_seek;
                }
            } else {
                if (mo53582h.equals("SOURCE_FOLLOWING")) {
                    i11 = AbstractC27413h.zch_action_key_following_seek;
                }
                i11 = AbstractC27413h.zch_action_key_player_seek;
            }
            String m92652XI = videoPageView.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("seek_from", Long.valueOf(j11)), AbstractC24866w.m129235a("seek_to", Long.valueOf(j12)));
            c19205a.m100713L(m92652XI, m131407l);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: e */
        public void mo55231e() {
            VideoPageView.this.f53629V0 = false;
            VideoPageView.this.m55301FM();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: f */
        public void mo55232f(int i11) {
            if (VideoPageView.this.m55348jM()) {
                VideoPageView.this.m55342gM(3);
            }
            ZaloView m92650VI = VideoPageView.this.m92650VI();
            if (m92650VI instanceof VideoChannelPagerView) {
                ((VideoChannelPagerView) m92650VI).m55107pL(true);
            } else if (m92650VI instanceof MainPageView) {
                ((MainPageView) m92650VI).m54533YK(true);
            }
            VideoPageView.this.m55301FM();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: g */
        public void mo55233g() {
            VideoPageView.this.f53629V0 = true;
            VideoPageView.this.m55301FM();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: h */
        public void mo55234h(int i11) {
            boolean m131390w;
            if (VideoPageView.this.m55348jM()) {
                m131390w = AbstractC25358n.m131390w(new Integer[]{1, 3}, Integer.valueOf(VideoPageView.this.f53626S0));
                if (m131390w) {
                    VideoPageView.this.m55293BM();
                }
            }
            ZaloView m92650VI = VideoPageView.this.m92650VI();
            if (m92650VI instanceof VideoChannelPagerView) {
                ((VideoChannelPagerView) m92650VI).m55107pL(false);
            } else if (m92650VI instanceof MainPageView) {
                ((MainPageView) m92650VI).m54533YK(false);
            }
            if (i11 == 0) {
                CommentView m55338eM = VideoPageView.this.m55338eM();
                if (m55338eM != null) {
                    m55338eM.m54164mL();
                }
            } else if (i11 == 1) {
                VideoPageView.this.f53609B0.mo53575aE();
            }
            VideoPageView.this.m55301FM();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: i */
        public void mo55235i(Video video, int i11) {
            C31179n0.b m151861b0;
            AbstractC19074t.m100208f(video, "video");
            C31179n0 c31179n0 = VideoPageView.this.f53610C0;
            if (c31179n0 != null && (m151861b0 = c31179n0.m151861b0()) != null) {
                m151861b0.mo55500r(video, i11);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: j */
        public void mo55236j(boolean z11) {
            C9768d c9768d;
            Map m131407l;
            int i11;
            C31179n0 c31179n0 = VideoPageView.this.f53610C0;
            if (c31179n0 != null && (c9768d = VideoPageView.this.f53611D0) != null) {
                Object obj = c31179n0.f143912B.get(c9768d.m52730s());
                if (!(obj instanceof BreakSlot)) {
                    obj = null;
                }
                BreakSlot breakSlot = (BreakSlot) obj;
                if (breakSlot != null) {
                    VideoPageView videoPageView = VideoPageView.this;
                    if (!z11) {
                        C9768d c9768d2 = videoPageView.f53611D0;
                        if (c9768d2 != null) {
                            C9768d.m52699G(c9768d2, false, 1, null);
                            return;
                        }
                        return;
                    }
                    int m50690k = breakSlot.m50690k();
                    if (m50690k != 1) {
                        if (m50690k != 2) {
                            if (m50690k == 3) {
                                C19205a c19205a = C19205a.f95429a;
                                if (AbstractC19074t.m100204b(videoPageView.f53609B0.mo53582h(), "SOURCE_FOR_U")) {
                                    i11 = AbstractC27413h.zch_action_key_foru_suggest_channel_button_skip;
                                } else {
                                    i11 = AbstractC27413h.zch_action_key_following_suggest_channel_button_skip;
                                }
                                String m92652XI = videoPageView.m92652XI(i11);
                                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                                C19205a.m100675M(c19205a, m92652XI, null, 2, null);
                            }
                        } else {
                            videoPageView.f53609B0.mo53585nb(breakSlot, true, true);
                            C19205a c19205a2 = C19205a.f95429a;
                            String m92652XI2 = videoPageView.m92652XI(AbstractC27413h.zch_action_key_onboarding_button_skip);
                            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                            C19205a.m100675M(c19205a2, m92652XI2, null, 2, null);
                        }
                    } else {
                        videoPageView.f53609B0.mo53590sA(breakSlot, true);
                        C19205a c19205a3 = C19205a.f95429a;
                        String m92652XI3 = videoPageView.m92652XI(AbstractC27413h.zch_action_key_survey_button_skip);
                        AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                        C24860q[] c24860qArr = new C24860q[2];
                        String m50691l = breakSlot.m50691l();
                        String str = "";
                        if (m50691l == null) {
                            m50691l = "";
                        }
                        c24860qArr[0] = AbstractC24866w.m129235a("video_id", m50691l);
                        String m50687h = breakSlot.m50687h();
                        if (m50687h != null) {
                            str = m50687h;
                        }
                        c24860qArr[1] = AbstractC24866w.m129235a("survey_template", str);
                        m131407l = AbstractC25363p0.m131407l(c24860qArr);
                        c19205a3.m100713L(m92652XI3, m131407l);
                    }
                    C31179n0 c31179n02 = videoPageView.f53610C0;
                    if (c31179n02 != null) {
                        c31179n02.m151872o0(breakSlot);
                    }
                    C9768d c9768d3 = videoPageView.f53611D0;
                    if (c9768d3 != null) {
                        c9768d3.m52713A(true);
                    }
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: k */
        public void mo55237k() {
            C9768d.e m52728q;
            C9768d c9768d = VideoPageView.this.f53611D0;
            if (c9768d != null && (m52728q = c9768d.m52728q()) != null) {
                m52728q.mo52742f();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: l */
        public void mo55238l() {
            VideoPageView.this.mo53934d0();
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_click_refresh_button);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: m */
        public void mo55239m(BreakSlot breakSlot) {
            Map m131401f;
            AbstractC19074t.m100208f(breakSlot, "onboarding");
            InterfaceC10058f.a.m53680e(VideoPageView.this.f53609B0, breakSlot, true, false, 4, null);
            C31179n0 c31179n0 = VideoPageView.this.f53610C0;
            if (c31179n0 != null) {
                c31179n0.m151872o0(breakSlot);
            }
            C9768d c9768d = VideoPageView.this.f53611D0;
            if (c9768d != null) {
                c9768d.m52713A(true);
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_onboarding_submit);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            ArrayList m50685f = breakSlot.m50685f();
            int i11 = 0;
            if (m50685f != null && !m50685f.isEmpty()) {
                Iterator it = m50685f.iterator();
                while (it.hasNext()) {
                    if (((BreakSlot.Option) it.next()).m50702c() && (i11 = i11 + 1) < 0) {
                        AbstractC25368s.m131508p();
                    }
                }
            }
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("topic_num", Integer.valueOf(i11)));
            c19205a.m100713L(m92652XI, m131401f);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: n */
        public void mo55240n(String str, LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(str, "videoId");
            VideoPageView.this.f53609B0.mo53581gl(str, loadMoreInfo);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: o */
        public void mo55241o(String str) {
            C31179n0.b m151861b0;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            C31179n0 c31179n0 = VideoPageView.this.f53610C0;
            if (c31179n0 != null && (m151861b0 = c31179n0.m151861b0()) != null) {
                m151861b0.mo55488f(str);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: p */
        public void mo55242p(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "videoId");
            AbstractC19074t.m100208f(section, "section");
            AbstractC19074t.m100208f(str2, "uuid");
            VideoPageView.this.m55551QK(VideoChannelPagerView.Companion.m55121j(str, section, i11, str2));
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: q */
        public void mo55243q(Channel channel) {
            AbstractC19074t.m100208f(channel, "channel");
            VideoPageView.this.m55551QK(ChannelPageView.C10134b.m53981c(ChannelPageView.Companion, channel, null, 2, null));
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout.InterfaceC10526a
        /* renamed from: r */
        public void mo55244r(String str) {
            String m127189r0;
            AbstractC19074t.m100208f(str, "hashtag");
            VideoPageView videoPageView = VideoPageView.this;
            SearchPageView.C10392b c10392b = SearchPageView.Companion;
            m127189r0 = AbstractC24342w.m127189r0(str, "#");
            videoPageView.m55551QK(c10392b.m54827b(m127189r0));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$s0 */
    /* loaded from: classes5.dex */
    static final class C10608s0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10608s0 f53769q = new C10608s0();

        C10608s0() {
            super(1);
        }

        /* renamed from: a */
        public final void m55459a(long j11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55459a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$t */
    /* loaded from: classes5.dex */
    static final class C10609t extends AbstractC19075u implements InterfaceC18505l {
        C10609t() {
            super(1);
        }

        /* renamed from: a */
        public final void m55460a(View view) {
            AbstractC19074t.m100208f(view, "it");
            VideoPageView.this.m55395nM();
            VideoPageView.this.m55549OK(true);
            FloatingManager.Companion.m53870l(null);
            VideoPageView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55460a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$t0 */
    /* loaded from: classes5.dex */
    public static final class C10610t0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10610t0 f53771q = new C10610t0();

        C10610t0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55461a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55461a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$u */
    /* loaded from: classes5.dex */
    static final class C10611u extends AbstractC19075u implements InterfaceC18505l {
        C10611u() {
            super(1);
        }

        /* renamed from: a */
        public final void m55462a(View view) {
            Map m131401f;
            C17487o0 mo35579p;
            C17507u0 m92998F;
            AbstractC19074t.m100208f(view, "it");
            VideoPageView.this.m55549OK(true);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_floating_btn);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("from_item", 1));
            c19205a.m100713L(m92652XI, m131401f);
            FloatingManager.Companion.m53872n();
            StateManager.Companion.m53805i();
            InterfaceC27218a m92676n2 = VideoPageView.this.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null && (m92998F = mo35579p.m92998F(ZChannelFloatingAnimView.class, true)) != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("xAnim4View", 1);
                C17507u0 m93139f = m92998F.m93139f(bundle);
                if (m93139f != null) {
                    m93139f.m93136a();
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55462a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$u0 */
    /* loaded from: classes5.dex */
    public static final class C10612u0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10612u0 f53773q = new C10612u0();

        C10612u0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55463a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55463a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$v */
    /* loaded from: classes5.dex */
    static final class C10613v extends AbstractC19075u implements InterfaceC18509p {
        C10613v() {
            super(2);
        }

        /* renamed from: a */
        public final void m55464a(String str, long j11) {
            C9768d c9768d;
            List m131496e;
            AbstractC19074t.m100208f(str, "videoId");
            try {
                C31179n0 c31179n0 = VideoPageView.this.f53610C0;
                if (c31179n0 == null || (c9768d = VideoPageView.this.f53611D0) == null) {
                    return;
                }
                Integer valueOf = Integer.valueOf(c9768d.m52730s());
                Object obj = null;
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    Object obj2 = c31179n0.f143912B.get(intValue);
                    if (obj2 instanceof Video) {
                        obj = obj2;
                    }
                    Video video = (Video) obj;
                    if (video != null && AbstractC19074t.m100204b(video.m52911t(), str)) {
                        video.m52859O0(j11);
                        m131496e = AbstractC25366r.m131496e("COMMENT");
                        c31179n0.m10010r(intValue, m131496e);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m55464a((String) obj, ((Number) obj2).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$w */
    /* loaded from: classes5.dex */
    public static final class C10614w extends RecyclerView.AbstractC1890q {
        C10614w() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
        /* renamed from: a */
        public boolean mo10175a(int i11, int i12) {
            String m92652XI;
            Map m131407l;
            if (i12 > 0) {
                m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_swipe_next_video);
            } else {
                m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_swipe_previous_video);
            }
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            ArrayList arrayList = new ArrayList();
            VideoPageView videoPageView = VideoPageView.this;
            if (videoPageView.f53646m1) {
                videoPageView.f53646m1 = false;
                arrayList.add(AbstractC24866w.m129235a("action_by", "guide_swipe_up_bottom"));
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            C24860q[] c24860qArr = (C24860q[]) arrayList.toArray(new C24860q[0]);
            m131407l = AbstractC25363p0.m131407l((C24860q[]) Arrays.copyOf(c24860qArr, c24860qArr.length));
            c19205a.m100713L(m92652XI, m131407l);
            return false;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$x */
    /* loaded from: classes5.dex */
    public static final class C10615x implements C9768d.e {

        /* renamed from: b */
        final /* synthetic */ C25026k2 f53777b;

        C10615x(C25026k2 c25026k2) {
            this.f53777b = c25026k2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static final void m55467j(C31179n0 c31179n0, int i11) {
            List m131496e;
            AbstractC19074t.m100208f(c31179n0, "$this_run");
            m131496e = AbstractC25366r.m131496e("SYNC");
            c31179n0.m10010r(i11, m131496e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static final void m55468k(C31179n0 c31179n0, int i11) {
            List m131496e;
            AbstractC19074t.m100208f(c31179n0, "$this_run");
            m131496e = AbstractC25366r.m131496e("SYNC");
            c31179n0.m10010r(i11, m131496e);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:            if ((r1 instanceof java.lang.Object) == false) goto L69;     */
        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9768d.e
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo52737a(final int i11) {
            Object obj;
            VideoChannelPagerView videoChannelPagerView;
            VideoChannelPagerView videoChannelPagerView2;
            C31179n0 c31179n0;
            Map m131407l;
            int i12;
            VideoChannelPagerView videoChannelPagerView3;
            VideoChannelPagerView videoChannelPagerView4;
            int i13;
            final C31179n0 c31179n02 = VideoPageView.this.f53610C0;
            if (c31179n02 != null) {
                VideoPageView videoPageView = VideoPageView.this;
                C25026k2 c25026k2 = this.f53777b;
                int mo10005m = c31179n02.mo10005m(i11);
                if (mo10005m != 0) {
                    if (mo10005m != 1) {
                        if (mo10005m != 2) {
                            if (mo10005m != 3) {
                                if (mo10005m != 4) {
                                    if (mo10005m != 5) {
                                        if (mo10005m == 999) {
                                            c25026k2.getRoot().m55208L(i11);
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        Object obj2 = c31179n02.f143912B.get(i11);
                                        if (obj2 != null) {
                                            c25026k2.getRoot().m55205I(i11, (LivestreamData) obj2);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.LivestreamData");
                                        }
                                    }
                                } else {
                                    AbstractC19444a.m101695c(new Runnable() { // from class: m20.v2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            VideoPageView.C10615x.m55468k(C31179n0.this, i11);
                                        }
                                    });
                                    Object obj3 = c31179n02.f143912B.get(i11);
                                    if (obj3 != null) {
                                        Video video = (Video) obj3;
                                        VideoPageLayout root = c25026k2.getRoot();
                                        AbstractC19074t.m100207e(root, "getRoot(...)");
                                        VideoPageLayout.m55156G(root, i11, video, videoPageView.f53609B0.mo53582h(), false, 8, null);
                                        videoPageView.m55291AM(i11);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
                                    }
                                }
                            } else {
                                Object obj4 = c31179n02.f143912B.get(i11);
                                if (obj4 != null) {
                                    c25026k2.getRoot().m55204H(i11, (BreakSlot) obj4, videoPageView.f53609B0.mo53582h());
                                    C19205a c19205a = C19205a.f95429a;
                                    if (AbstractC19074t.m100204b(videoPageView.f53609B0.mo53582h(), "SOURCE_FOR_U")) {
                                        i13 = AbstractC27413h.zch_action_key_foru_suggest_channel_show;
                                    } else {
                                        i13 = AbstractC27413h.zch_action_key_following_suggest_channel_show;
                                    }
                                    String m92652XI = videoPageView.m92652XI(i13);
                                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                                    C19205a.m100675M(c19205a, m92652XI, null, 2, null);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.BreakSlot");
                                }
                            }
                        } else {
                            Object obj5 = c31179n02.f143912B.get(i11);
                            if (obj5 != null) {
                                c25026k2.getRoot().m55206J(i11, (BreakSlot) obj5);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.BreakSlot");
                            }
                        }
                    } else {
                        Object obj6 = c31179n02.f143912B.get(i11);
                        if (obj6 != null) {
                            c25026k2.getRoot().m55209M(i11, (BreakSlot) obj6);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.BreakSlot");
                        }
                    }
                } else {
                    AbstractC19444a.m101695c(new Runnable() { // from class: m20.u2
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoPageView.C10615x.m55467j(C31179n0.this, i11);
                        }
                    });
                    Object obj7 = c31179n02.f143912B.get(i11);
                    if (obj7 != null) {
                        Video video2 = (Video) obj7;
                        VideoPageLayout root2 = c25026k2.getRoot();
                        AbstractC19074t.m100207e(root2, "getRoot(...)");
                        VideoPageLayout.m55156G(root2, i11, video2, videoPageView.f53609B0.mo53582h(), false, 8, null);
                        videoPageView.m55367wM(i11);
                        videoPageView.m55369xM(i11);
                        videoPageView.m55373zM(i11);
                        videoPageView.m55371yM(i11);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
                    }
                }
            }
            C31179n0 c31179n03 = VideoPageView.this.f53610C0;
            if (c31179n03 != null) {
                Object obj8 = c31179n03.f143912B.get(i11);
                if (!(obj8 instanceof Object)) {
                    obj8 = null;
                }
                if (obj8 != null) {
                    ZaloView m92650VI = VideoPageView.this.m92650VI();
                    if (m92650VI instanceof VideoChannelPagerView) {
                        videoChannelPagerView4 = (VideoChannelPagerView) m92650VI;
                    } else {
                        videoChannelPagerView4 = null;
                    }
                    if (videoChannelPagerView4 != null) {
                        videoChannelPagerView4.m55108qL(obj8);
                    }
                }
            }
            C31179n0 c31179n04 = VideoPageView.this.f53610C0;
            if (c31179n04 != null) {
                obj = c31179n04.f143912B.get(i11);
            }
            obj = null;
            if (obj instanceof Video) {
                ZaloView m92650VI2 = VideoPageView.this.m92650VI();
                if (m92650VI2 instanceof VideoChannelPagerView) {
                    videoChannelPagerView3 = (VideoChannelPagerView) m92650VI2;
                } else {
                    videoChannelPagerView3 = null;
                }
                if (videoChannelPagerView3 != null) {
                    videoChannelPagerView3.m55109rL(!this.f53777b.f120038L.m52613G());
                }
            } else if (obj instanceof LivestreamData) {
                ZaloView m92650VI3 = VideoPageView.this.m92650VI();
                if (m92650VI3 instanceof VideoChannelPagerView) {
                    videoChannelPagerView2 = (VideoChannelPagerView) m92650VI3;
                } else {
                    videoChannelPagerView2 = null;
                }
                if (videoChannelPagerView2 != null) {
                    videoChannelPagerView2.m55109rL(true);
                }
            } else {
                ZaloView m92650VI4 = VideoPageView.this.m92650VI();
                if (m92650VI4 instanceof VideoChannelPagerView) {
                    videoChannelPagerView = (VideoChannelPagerView) m92650VI4;
                } else {
                    videoChannelPagerView = null;
                }
                if (videoChannelPagerView != null) {
                    videoChannelPagerView.m55109rL(false);
                }
            }
            if (i11 >= 1 && (c31179n0 = VideoPageView.this.f53610C0) != null) {
                Object obj9 = c31179n0.f143912B.get(i11 - 1);
                if (!(obj9 instanceof BreakSlot)) {
                    obj9 = null;
                }
                BreakSlot breakSlot = (BreakSlot) obj9;
                if (breakSlot != null) {
                    VideoPageView videoPageView2 = VideoPageView.this;
                    int m50690k = breakSlot.m50690k();
                    if (m50690k != 1) {
                        if (m50690k != 2) {
                            if (m50690k == 3) {
                                C19205a c19205a2 = C19205a.f95429a;
                                if (AbstractC19074t.m100204b(videoPageView2.f53609B0.mo53582h(), "SOURCE_FOR_U")) {
                                    i12 = AbstractC27413h.zch_action_key_foru_suggest_channel_swipe_skip;
                                } else {
                                    i12 = AbstractC27413h.zch_action_key_following_suggest_channel_swipe_skip;
                                }
                                String m92652XI2 = videoPageView2.m92652XI(i12);
                                AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                                C19205a.m100675M(c19205a2, m92652XI2, null, 2, null);
                            }
                        } else {
                            videoPageView2.f53609B0.mo53585nb(breakSlot, false, true);
                            C19205a c19205a3 = C19205a.f95429a;
                            String m92652XI3 = videoPageView2.m92652XI(AbstractC27413h.zch_action_key_onboarding_swipe_skip);
                            AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                            C19205a.m100675M(c19205a3, m92652XI3, null, 2, null);
                        }
                    } else {
                        videoPageView2.f53609B0.mo53590sA(breakSlot, false);
                        C19205a c19205a4 = C19205a.f95429a;
                        String m92652XI4 = videoPageView2.m92652XI(AbstractC27413h.zch_action_key_survey_swipe_skip);
                        AbstractC19074t.m100207e(m92652XI4, "getString(...)");
                        C24860q[] c24860qArr = new C24860q[2];
                        String m50691l = breakSlot.m50691l();
                        String str = "";
                        if (m50691l == null) {
                            m50691l = "";
                        }
                        c24860qArr[0] = AbstractC24866w.m129235a("video_id", m50691l);
                        String m50687h = breakSlot.m50687h();
                        if (m50687h != null) {
                            str = m50687h;
                        }
                        c24860qArr[1] = AbstractC24866w.m129235a("survey_template", str);
                        m131407l = AbstractC25363p0.m131407l(c24860qArr);
                        c19205a4.m100713L(m92652XI4, m131407l);
                    }
                }
            }
            if (i11 == 1) {
                if (!VideoPageView.this.f53621N0) {
                    AbstractC28684a.Companion.m143681o().mo146303E(0);
                }
                this.f53777b.f120038L.m52619c0(VideoPageView.this.f53644k1);
            }
            VideoPageView.this.f53621N0 = false;
            VideoPageView.this.m55350kM(i11);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9768d.e
        /* renamed from: b */
        public void mo52738b(int i11) {
            VideoChannelPagerView videoChannelPagerView;
            ZaloView m92650VI = VideoPageView.this.m92650VI();
            Object obj = null;
            if (m92650VI instanceof VideoChannelPagerView) {
                videoChannelPagerView = (VideoChannelPagerView) m92650VI;
            } else {
                videoChannelPagerView = null;
            }
            if (videoChannelPagerView != null) {
                C31179n0 c31179n0 = VideoPageView.this.f53610C0;
                if (c31179n0 != null) {
                    Object obj2 = c31179n0.f143912B.get(i11);
                    if (obj2 instanceof Object) {
                        obj = obj2;
                    }
                }
                if (obj instanceof Video) {
                    Video video = (Video) obj;
                    videoChannelPagerView.m55104mL(video.m52887f(), video.m52911t());
                } else if (obj instanceof LivestreamData) {
                    LivestreamData livestreamData = (LivestreamData) obj;
                    videoChannelPagerView.m55104mL(livestreamData.m51010b(), livestreamData.m51016f());
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9768d.e
        /* renamed from: c */
        public void mo52739c(int i11) {
            this.f53777b.f120038L.m52619c0(VideoPageView.this.f53631X0);
            this.f53777b.f120038L.m52619c0(VideoPageView.this.f53630W0);
            this.f53777b.f120038L.m52619c0(VideoPageView.this.f53633Z0);
            this.f53777b.f120038L.m52619c0(VideoPageView.this.f53634a1);
            this.f53777b.f120038L.m52619c0(VideoPageView.this.f53638e1);
            this.f53777b.f120038L.m52618b0(VideoPageView.this.f53635b1);
            VideoPageView videoPageView = VideoPageView.this;
            VideoLayout videoLayout = this.f53777b.f120038L;
            AbstractC19074t.m100207e(videoLayout, "lytVideo");
            videoPageView.m55363tM(videoLayout);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9768d.e
        /* renamed from: d */
        public void mo52740d(int i11, String str) {
            Map m131401f;
            AbstractC19074t.m100208f(str, "id");
            InterfaceC10058f interfaceC10058f = VideoPageView.this.f53609B0;
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a(str, Integer.valueOf(i11)));
            interfaceC10058f.mo53563Bu(m131401f);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9768d.e
        /* renamed from: e */
        public void mo52741e(boolean z11) {
            VideoChannelPagerView videoChannelPagerView;
            this.f53777b.getRoot().m55225x0(z11);
            ZaloView m92650VI = VideoPageView.this.m92650VI();
            if (m92650VI instanceof VideoChannelPagerView) {
                videoChannelPagerView = (VideoChannelPagerView) m92650VI;
            } else {
                videoChannelPagerView = null;
            }
            if (videoChannelPagerView != null) {
                videoChannelPagerView.m55109rL(!z11);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9768d.e
        /* renamed from: f */
        public void mo52742f() {
            Map m131401f;
            boolean m131390w;
            Section m151862c0;
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_video_risk_warning);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("warning_action", 1));
            c19205a.m100713L(m92652XI, m131401f);
            C9768d c9768d = VideoPageView.this.f53611D0;
            LoadMoreInfo loadMoreInfo = null;
            if (c9768d == null || !C9768d.m52699G(c9768d, false, 1, null)) {
                C31179n0 c31179n0 = VideoPageView.this.f53610C0;
                if (c31179n0 != null && (m151862c0 = c31179n0.m151862c0()) != null) {
                    loadMoreInfo = m151862c0.m51171p();
                }
                if (loadMoreInfo != null) {
                    C31179n0 c31179n02 = VideoPageView.this.f53610C0;
                    if (c31179n02 != null) {
                        c31179n02.mo151429P();
                        return;
                    }
                    return;
                }
                m131390w = AbstractC25358n.m131390w(new String[]{"SOURCE_FOLLOWING", "SOURCE_FRIEND", "SOURCE_FOR_U"}, VideoPageView.this.f53609B0.mo53582h());
                if (!m131390w) {
                    VideoPageView.this.finish();
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9768d.e
        /* renamed from: g */
        public void mo52743g() {
            Map m131401f;
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_video_risk_warning);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("warning_action", 2));
            c19205a.m100713L(m92652XI, m131401f);
            C9768d c9768d = VideoPageView.this.f53611D0;
            if (c9768d != null) {
                int m52730s = c9768d.m52730s();
                VideoPageView videoPageView = VideoPageView.this;
                C25026k2 c25026k2 = this.f53777b;
                C31179n0 c31179n0 = videoPageView.f53610C0;
                if (c31179n0 != null) {
                    Object obj = c31179n0.f143912B.get(m52730s);
                    VideoChannelPagerView videoChannelPagerView = null;
                    if (!(obj instanceof Video)) {
                        obj = null;
                    }
                    Video video = (Video) obj;
                    if (video != null) {
                        ZaloView m92650VI = videoPageView.m92650VI();
                        if (m92650VI instanceof VideoChannelPagerView) {
                            videoChannelPagerView = (VideoChannelPagerView) m92650VI;
                        }
                        if (videoChannelPagerView != null) {
                            videoChannelPagerView.m55109rL(true);
                        }
                        c25026k2.getRoot().m55210N(m52730s, video, videoPageView.f53609B0.mo53582h());
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y */
    /* loaded from: classes5.dex */
    public static final class C10616y implements C31179n0.b {

        /* renamed from: b */
        final /* synthetic */ C25026k2 f53779b;

        /* renamed from: c */
        final /* synthetic */ C31179n0 f53780c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ VideoPageView f53781q;

            /* renamed from: r */
            final /* synthetic */ Video f53782r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VideoPageView videoPageView, Video video) {
                super(1);
                this.f53781q = videoPageView;
                this.f53782r = video;
            }

            /* renamed from: a */
            public final void m55509a(String str) {
                AbstractC19074t.m100208f(str, "it");
                C25095r.f120555a.m130134b(str);
                this.f53781q.m55352lM(this.f53782r, "zalo_message");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m55509a((String) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$b */
        /* loaded from: classes5.dex */
        public static final class b implements ShareBottomSheet.InterfaceC9516a {

            /* renamed from: a */
            final /* synthetic */ VideoPageView f53783a;

            /* renamed from: b */
            final /* synthetic */ Video f53784b;

            b(VideoPageView videoPageView, Video video) {
                this.f53783a = videoPageView;
                this.f53784b = video;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
            /* renamed from: a */
            public void mo51915a(boolean z11) {
                this.f53783a.m55352lM(this.f53784b, "zalo_message");
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
            /* renamed from: b */
            public void mo51916b() {
                this.f53783a.m55352lM(this.f53784b, "other");
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
            /* renamed from: c */
            public void mo51917c(boolean z11) {
                this.f53783a.m55352lM(this.f53784b, "zalo_feed");
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
            /* renamed from: d */
            public void mo51918d() {
                this.f53783a.m55352lM(this.f53784b, "copy_link");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPageView f53785q;

            /* renamed from: r */
            final /* synthetic */ C31179n0 f53786r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(VideoPageView videoPageView, C31179n0 c31179n0) {
                super(0);
                this.f53785q = videoPageView;
                this.f53786r = c31179n0;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55510a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55510a() {
                C9768d c9768d = this.f53785q.f53611D0;
                if (c9768d != null) {
                    C31179n0.m151848r0(this.f53786r, c9768d.m52731t(), false, true, 2, null);
                }
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$d */
        /* loaded from: classes5.dex */
        static final class d extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C25026k2 f53787q;

            /* renamed from: r */
            final /* synthetic */ VideoPageView f53788r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C25026k2 c25026k2, VideoPageView videoPageView) {
                super(0);
                this.f53787q = c25026k2;
                this.f53788r = videoPageView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55511a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55511a() {
                this.f53787q.f120035I.m55786j();
                InterfaceC10058f.a.m53677b(this.f53788r.f53609B0, null, 1, null);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$e */
        /* loaded from: classes5.dex */
        public static final class e implements LivestreamPageView.InterfaceC10284b {

            /* renamed from: a */
            final /* synthetic */ VideoPageView f53789a;

            /* renamed from: b */
            final /* synthetic */ SimpleLivestreamItem f53790b;

            e(VideoPageView videoPageView, SimpleLivestreamItem simpleLivestreamItem) {
                this.f53789a = videoPageView;
                this.f53790b = simpleLivestreamItem;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView.InterfaceC10284b
            /* renamed from: a */
            public ZVideoView mo54487a() {
                C9768d c9768d = this.f53789a.f53611D0;
                if (c9768d != null) {
                    c9768d.m52715D();
                }
                return this.f53790b.getTransitionView();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$f */
        /* loaded from: classes5.dex */
        public static final class f extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPageView f53791q;

            /* renamed from: r */
            final /* synthetic */ Video f53792r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(VideoPageView videoPageView, Video video) {
                super(0);
                this.f53791q = videoPageView;
                this.f53792r = video;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55512a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55512a() {
                this.f53791q.f53609B0.mo53584lB(this.f53792r);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$g */
        /* loaded from: classes5.dex */
        static final class g extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPageView f53793q;

            /* renamed from: r */
            final /* synthetic */ Channel f53794r;

            /* renamed from: s */
            final /* synthetic */ Video f53795s;

            /* renamed from: t */
            final /* synthetic */ ConfirmPopupView f53796t;

            /* renamed from: u */
            final /* synthetic */ C31179n0 f53797u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(VideoPageView videoPageView, Channel channel, Video video, ConfirmPopupView confirmPopupView, C31179n0 c31179n0) {
                super(0);
                this.f53793q = videoPageView;
                this.f53794r = channel;
                this.f53795s = video;
                this.f53796t = confirmPopupView;
                this.f53797u = c31179n0;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55513a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55513a() {
                int i11;
                Map m131407l;
                InterfaceC10058f.a.m53679d(this.f53793q.f53609B0, this.f53794r, false, false, this.f53795s, 4, null);
                C19205a c19205a = C19205a.f95429a;
                ConfirmPopupView confirmPopupView = this.f53796t;
                String m151863d0 = this.f53797u.m151863d0();
                int hashCode = m151863d0.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_big_unfollow_confirm;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_big_unfollow_confirm;
                    } else {
                        if (m151863d0.equals("SOURCE_FOR_U")) {
                            i11 = AbstractC27413h.zch_action_key_foru_big_unfollow_confirm;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_big_unfollow_confirm;
                    }
                } else {
                    if (m151863d0.equals("SOURCE_FOLLOWING")) {
                        i11 = AbstractC27413h.zch_action_key_following_big_unfollow_confirm;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_big_unfollow_confirm;
                }
                String m92652XI = confirmPopupView.m92652XI(i11);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(this.f53794r.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(this.f53794r.m50777p())), AbstractC24866w.m129235a("channel_uid", this.f53794r.m50769l()));
                c19205a.m100713L(m92652XI, m131407l);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$h */
        /* loaded from: classes5.dex */
        static final class h extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ VideoPageView f53798q;

            /* renamed from: r */
            final /* synthetic */ Channel f53799r;

            /* renamed from: s */
            final /* synthetic */ ConfirmPopupView f53800s;

            /* renamed from: t */
            final /* synthetic */ C31179n0 f53801t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(VideoPageView videoPageView, Channel channel, ConfirmPopupView confirmPopupView, C31179n0 c31179n0) {
                super(0);
                this.f53798q = videoPageView;
                this.f53799r = channel;
                this.f53800s = confirmPopupView;
                this.f53801t = c31179n0;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55514a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55514a() {
                int i11;
                Map m131407l;
                this.f53798q.f53609B0.mo53573Wf(this.f53799r, false, true, null);
                C19205a c19205a = C19205a.f95429a;
                ConfirmPopupView confirmPopupView = this.f53800s;
                if (AbstractC19074t.m100204b(this.f53801t.m151863d0(), "SOURCE_FOR_U")) {
                    i11 = AbstractC27413h.zch_action_key_foru_suggest_channel_unfollow_confirm;
                } else {
                    i11 = AbstractC27413h.zch_action_key_following_suggest_channel_unfollow_confirm;
                }
                String m92652XI = confirmPopupView.m92652XI(i11);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(this.f53799r.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(this.f53799r.m50777p())), AbstractC24866w.m129235a("channel_uid", this.f53799r.m50769l()));
                c19205a.m100713L(m92652XI, m131407l);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$i */
        /* loaded from: classes5.dex */
        public static final class i implements VideoActionBottomSheet.InterfaceC9526a {

            /* renamed from: b */
            final /* synthetic */ Video f53803b;

            /* renamed from: c */
            final /* synthetic */ VideoPageView f53804c;

            /* renamed from: d */
            final /* synthetic */ C31179n0 f53805d;

            /* renamed from: e */
            final /* synthetic */ VideoActionBottomSheet f53806e;

            /* renamed from: f */
            final /* synthetic */ C25026k2 f53807f;

            /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$i$a */
            /* loaded from: classes5.dex */
            static final class a extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                final /* synthetic */ VideoActionBottomSheet f53808q;

                /* renamed from: r */
                final /* synthetic */ C25026k2 f53809r;

                /* renamed from: s */
                final /* synthetic */ Video f53810s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(VideoActionBottomSheet videoActionBottomSheet, C25026k2 c25026k2, Video video) {
                    super(1);
                    this.f53808q = videoActionBottomSheet;
                    this.f53809r = c25026k2;
                    this.f53810s = video;
                }

                /* renamed from: a */
                public final void m55515a(List list) {
                    String m131214n0;
                    Map m131407l;
                    AbstractC19074t.m100208f(list, "it");
                    String m92652XI = this.f53808q.m92652XI(AbstractC27413h.zch_action_key_dislike_channel);
                    int duration = this.f53809r.f120038L.getDuration() / 1000;
                    int currentPosition = this.f53809r.f120038L.getCurrentPosition() / 1000;
                    Video video = this.f53810s;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (true ^ AbstractC19074t.m100204b((String) obj, video.m52911t())) {
                            arrayList.add(obj);
                        }
                    }
                    C19205a c19205a = C19205a.f95429a;
                    AbstractC19074t.m100205c(m92652XI);
                    m131214n0 = AbstractC25332a0.m131214n0(arrayList, ",", null, null, 0, null, null, 62, null);
                    m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("channel_uid", this.f53810s.m52887f().m50769l()), AbstractC24866w.m129235a("video_id", this.f53810s.m52911t()), AbstractC24866w.m129235a("duration_video", Integer.valueOf(duration)), AbstractC24866w.m129235a("current_play_time", Integer.valueOf(currentPosition)), AbstractC24866w.m129235a("removed_video_id", m131214n0), AbstractC24866w.m129235a("removed_video_count", Integer.valueOf(arrayList.size())));
                    c19205a.m100713L(m92652XI, m131407l);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                    m55515a((List) obj);
                    return C24848g0.f119245a;
                }
            }

            i(Video video, VideoPageView videoPageView, C31179n0 c31179n0, VideoActionBottomSheet videoActionBottomSheet, C25026k2 c25026k2) {
                this.f53803b = video;
                this.f53804c = videoPageView;
                this.f53805d = c31179n0;
                this.f53806e = videoActionBottomSheet;
                this.f53807f = c25026k2;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: a */
            public List mo51945a() {
                List m52931g;
                VideoAdsInfo m52881b = this.f53803b.m52881b();
                if (m52881b == null || (m52931g = m52881b.m52931g()) == null) {
                    return this.f53803b.m52884d();
                }
                return m52931g;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: b */
            public void mo51946b() {
                Map m131401f;
                C10616y.this.mo55478B(this.f53803b);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_delete_video);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("video_id", this.f53803b.m52911t()));
                c19205a.m100713L(m92652XI, m131401f);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: c */
            public void mo51947c() {
                String m92652XI;
                Map m131408m;
                C10616y.this.m55473K(this.f53803b);
                String m151863d0 = this.f53805d.m151863d0();
                int hashCode = m151863d0.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                            m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_friend_bts_share);
                        }
                        m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_player_bts_share);
                    } else {
                        if (m151863d0.equals("SOURCE_FOR_U")) {
                            m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_foru_bts_share);
                        }
                        m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_player_bts_share);
                    }
                } else {
                    if (m151863d0.equals("SOURCE_FOLLOWING")) {
                        m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_following_bts_share);
                    }
                    m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_player_bts_share);
                }
                String str = m92652XI;
                m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("video_id", this.f53803b.m52911t()), AbstractC24866w.m129235a("channel_uid", this.f53803b.m52887f().m50769l()));
                if (this.f53803b.m52834A0()) {
                    C19205a c19205a = C19205a.f95429a;
                    AbstractC19074t.m100205c(str);
                    C19205a.m100676P(c19205a, str, this.f53803b, null, 4, null);
                } else {
                    C19205a c19205a2 = C19205a.f95429a;
                    AbstractC19074t.m100205c(str);
                    c19205a2.m100713L(str, m131408m);
                }
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: d */
            public void mo51948d(String str) {
                int i11;
                Map m131407l;
                if (str == null) {
                    VideoAdsInfo m52881b = this.f53803b.m52881b();
                    if (m52881b != null) {
                        str = m52881b.m52934j();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = this.f53803b.m52849J();
                    }
                }
                if (str != null) {
                    this.f53804c.m55361sM(str);
                }
                if (this.f53803b.m52834A0()) {
                    C19205a c19205a = C19205a.f95429a;
                    String m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_ad_report);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    C19205a.m100676P(c19205a, m92652XI, this.f53803b, null, 4, null);
                    return;
                }
                C19205a c19205a2 = C19205a.f95429a;
                VideoActionBottomSheet videoActionBottomSheet = this.f53806e;
                String m151863d0 = this.f53805d.m151863d0();
                int hashCode = m151863d0.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_bts_report;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_bts_report;
                    } else {
                        if (m151863d0.equals("SOURCE_FOR_U")) {
                            i11 = AbstractC27413h.zch_action_key_for_u_bts_report;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_bts_report;
                    }
                } else {
                    if (m151863d0.equals("SOURCE_FOLLOWING")) {
                        i11 = AbstractC27413h.zch_action_key_following_bts_report;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_bts_report;
                }
                String m92652XI2 = videoActionBottomSheet.m92652XI(i11);
                AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", this.f53803b.m52911t()), AbstractC24866w.m129235a("channel_uid", this.f53803b.m52887f().m50769l()));
                c19205a2.m100713L(m92652XI2, m131407l);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: e */
            public void mo51949e() {
                Map m131401f;
                this.f53804c.f53609B0.mo53592tH(this.f53803b, false);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_unpin_video);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("video_id", this.f53803b.m52911t()));
                c19205a.m100713L(m92652XI, m131401f);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: f */
            public void mo51950f() {
                if (this.f53803b.m52834A0()) {
                    C31179n0 c31179n0 = this.f53804c.f53610C0;
                    if (c31179n0 != null) {
                        c31179n0.m151875s0(this.f53803b.m52871V());
                    }
                    C9768d c9768d = this.f53804c.f53611D0;
                    if (c9768d != null) {
                        c9768d.m52713A(true);
                    }
                    C19205a c19205a = C19205a.f95429a;
                    String m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_ad_not_interested);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    C19205a.m100676P(c19205a, m92652XI, this.f53803b, null, 4, null);
                    C25097t.f120556a.m130153n(this.f53806e.getContext(), AbstractC27413h.zch_bts_uninterested_ads_toast_msg);
                    return;
                }
                C10616y.this.m55475M(this.f53803b, true);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: g */
            public void mo51951g(boolean z11) {
                List m131496e;
                C10616y.this.m55474L(this.f53803b, z11, true);
                C9768d c9768d = this.f53804c.f53611D0;
                if (c9768d != null) {
                    int m52731t = c9768d.m52731t();
                    C31179n0 c31179n0 = this.f53805d;
                    m131496e = AbstractC25366r.m131496e("BOOKMARK");
                    c31179n0.m10010r(m52731t, m131496e);
                }
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: h */
            public void mo51952h() {
                Map m131401f;
                this.f53804c.f53609B0.mo53592tH(this.f53803b, true);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = this.f53806e.m92652XI(AbstractC27413h.zch_action_key_pin_video);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("video_id", this.f53803b.m52911t()));
                c19205a.m100713L(m92652XI, m131401f);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: i */
            public void mo51953i(boolean z11) {
                this.f53804c.f53609B0.mo53591ss(this.f53803b, z11);
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoActionBottomSheet.InterfaceC9526a
            /* renamed from: j */
            public void mo51954j() {
                this.f53804c.f53609B0.mo53594yk(this.f53803b.m52911t(), this.f53803b.m52887f().m50769l());
                this.f53807f.f120038L.m52611E(this.f53803b.m52887f().m50769l());
                C19205a c19205a = C19205a.f95429a;
                c19205a.m100709G().add(this.f53803b.m52887f().m50769l());
                C9768d c9768d = this.f53804c.f53611D0;
                if (c9768d != null) {
                    int m52730s = c9768d.m52730s();
                    VideoPageView videoPageView = this.f53804c;
                    C25026k2 c25026k2 = this.f53807f;
                    VideoActionBottomSheet videoActionBottomSheet = this.f53806e;
                    Video video = this.f53803b;
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(c19205a.m100710H());
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(c19205a.m100709G());
                    C31179n0 c31179n0 = videoPageView.f53610C0;
                    if (c31179n0 != null) {
                        c31179n0.m151873p0(m52730s, arrayList2, arrayList, new a(videoActionBottomSheet, c25026k2, video));
                    }
                    c25026k2.getRoot().m55208L(m52730s);
                }
                this.f53807f.getRoot().m55213U();
                C9768d c9768d2 = this.f53804c.f53611D0;
                if (c9768d2 != null) {
                    c9768d2.m52713A(true);
                }
                C25097t.f120556a.m130153n(this.f53806e.getContext(), AbstractC27413h.zch_page_video_uninterested_channel_message);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$j */
        /* loaded from: classes5.dex */
        public static final class j implements VideoFeedBackBottomSheet.InterfaceC9530a {

            /* renamed from: a */
            final /* synthetic */ VideoPageView f53811a;

            /* renamed from: b */
            final /* synthetic */ Video f53812b;

            /* renamed from: c */
            final /* synthetic */ VideoFeedBackBottomSheet f53813c;

            /* renamed from: d */
            final /* synthetic */ int f53814d;

            /* renamed from: e */
            final /* synthetic */ int f53815e;

            j(VideoPageView videoPageView, Video video, VideoFeedBackBottomSheet videoFeedBackBottomSheet, int i11, int i12) {
                this.f53811a = videoPageView;
                this.f53812b = video;
                this.f53813c = videoFeedBackBottomSheet;
                this.f53814d = i11;
                this.f53815e = i12;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.VideoFeedBackBottomSheet.InterfaceC9530a
            /* renamed from: a */
            public void mo51967a(List list, List list2) {
                String str;
                Map m131408m;
                AbstractC19074t.m100208f(list, "hashtag");
                AbstractC19074t.m100208f(list2, "feedback");
                String str2 = null;
                if (!list.isEmpty()) {
                    str = AbstractC25332a0.m131214n0(list, ",", null, null, 0, null, null, 62, null);
                } else {
                    str = null;
                }
                if (!list2.isEmpty()) {
                    str2 = AbstractC25332a0.m131214n0(list2, ",", null, null, 0, null, null, 62, null);
                }
                if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
                    this.f53811a.f53609B0.mo53583in(this.f53812b.m52911t(), str, str2);
                    C25097t.f120556a.m130153n(this.f53813c.getContext(), AbstractC27413h.zch_item_video_survey_confirm);
                    String m92652XI = this.f53813c.m92652XI(AbstractC27413h.zch_action_key_dislike_detail_send);
                    C19205a c19205a = C19205a.f95429a;
                    AbstractC19074t.m100205c(m92652XI);
                    m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("channel_uid", this.f53812b.m52887f().m50769l()), AbstractC24866w.m129235a("video_id", this.f53812b.m52911t()), AbstractC24866w.m129235a("duration_video", Integer.valueOf(this.f53814d)), AbstractC24866w.m129235a("current_play_time", Integer.valueOf(this.f53815e)));
                    if (str != null && str.length() != 0) {
                        m131408m.put("hashtag", str);
                    }
                    if (str2 != null && str2.length() != 0) {
                        m131408m.put("feedback", str2);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    c19205a.m100713L(m92652XI, m131408m);
                }
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$k */
        /* loaded from: classes5.dex */
        public static final class k extends AbstractViewOnTouchListenerC27278e {

            /* renamed from: q */
            final /* synthetic */ Snackbar f53816q;

            /* renamed from: r */
            final /* synthetic */ Snackbar.SnackbarLayout f53817r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(Snackbar snackbar, Snackbar.SnackbarLayout snackbarLayout, Context context) {
                super(context);
                this.f53816q = snackbar;
                this.f53817r = snackbarLayout;
            }

            @Override // ui0.AbstractViewOnTouchListenerC27278e
            /* renamed from: a */
            public void mo55516a() {
            }

            @Override // ui0.AbstractViewOnTouchListenerC27278e
            /* renamed from: b */
            public void mo55517b() {
            }

            @Override // ui0.AbstractViewOnTouchListenerC27278e
            /* renamed from: c */
            public void mo55518c() {
                this.f53817r.getParent().requestDisallowInterceptTouchEvent(true);
            }

            @Override // ui0.AbstractViewOnTouchListenerC27278e
            /* renamed from: d */
            public void mo55519d() {
                this.f53816q.m90656o(0);
            }

            @Override // ui0.AbstractViewOnTouchListenerC27278e
            /* renamed from: e */
            public void mo55520e() {
            }

            @Override // ui0.AbstractViewOnTouchListenerC27278e
            /* renamed from: f */
            public void mo55521f() {
            }

            @Override // ui0.AbstractViewOnTouchListenerC27278e
            /* renamed from: g */
            public void mo55522g() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$y$l */
        /* loaded from: classes5.dex */
        public static final class l extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ boolean f53818q;

            /* renamed from: r */
            final /* synthetic */ VideoPageView f53819r;

            /* renamed from: s */
            final /* synthetic */ Video f53820s;

            /* renamed from: t */
            final /* synthetic */ int f53821t;

            /* renamed from: u */
            final /* synthetic */ int f53822u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(boolean z11, VideoPageView videoPageView, Video video, int i11, int i12) {
                super(1);
                this.f53818q = z11;
                this.f53819r = videoPageView;
                this.f53820s = video;
                this.f53821t = i11;
                this.f53822u = i12;
            }

            /* renamed from: a */
            public final void m55523a(List list) {
                String m92652XI;
                String m131214n0;
                Map m131407l;
                AbstractC19074t.m100208f(list, "it");
                if (this.f53818q) {
                    m92652XI = this.f53819r.m92652XI(AbstractC27413h.zch_action_key_dislike_video_bts);
                } else {
                    m92652XI = this.f53819r.m92652XI(AbstractC27413h.zch_action_key_dislike_video_icon);
                }
                Video video = this.f53820s;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (true ^ AbstractC19074t.m100204b((String) obj, video.m52911t())) {
                        arrayList.add(obj);
                    }
                }
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                m131214n0 = AbstractC25332a0.m131214n0(arrayList, ",", null, null, 0, null, null, 62, null);
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("channel_uid", this.f53820s.m52887f().m50769l()), AbstractC24866w.m129235a("video_id", this.f53820s.m52911t()), AbstractC24866w.m129235a("duration_video", Integer.valueOf(this.f53821t)), AbstractC24866w.m129235a("current_play_time", Integer.valueOf(this.f53822u)), AbstractC24866w.m129235a("removed_video_id", m131214n0), AbstractC24866w.m129235a("removed_video_count", Integer.valueOf(arrayList.size())));
                c19205a.m100713L(m92652XI, m131407l);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m55523a((List) obj);
                return C24848g0.f119245a;
            }
        }

        C10616y(C25026k2 c25026k2, C31179n0 c31179n0) {
            this.f53779b = c25026k2;
            this.f53780c = c31179n0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:            if (r0 == null) goto L13;     */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0027, code lost:            if (r0.length() > 0) goto L23;     */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:            if (r0.length() > 0) goto L23;     */
        /* renamed from: K */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m55473K(Video video) {
            String m52856N;
            if (video.m52834A0()) {
                VideoAdsInfo m52881b = video.m52881b();
                if (m52881b != null && (m52856N = m52881b.m52935k()) != null) {
                    if (m52856N.length() <= 0) {
                        m52856N = null;
                    }
                }
                m52856N = video.m52856N();
                if (m52856N != null) {
                }
                m52856N = null;
            } else {
                m52856N = video.m52856N();
                if (m52856N != null) {
                }
                m52856N = null;
            }
            if (m52856N == null) {
                return;
            }
            if (C27417l.f129055a.m140378b().m51233f()) {
                VideoPageView.this.f53609B0.mo53565G2(m52856N, "app_content_share", "messageZalo", new a(VideoPageView.this, video));
            } else {
                ShareBottomSheet m51922d = ShareBottomSheet.Companion.m51922d(m52856N);
                m51922d.m51914sL(new b(VideoPageView.this, video));
                m51922d.m51757bL(true);
                BaseBottomSheetView.m51747hL(m51922d, VideoPageView.this.m55340fM(), null, 2, null);
            }
            VideoPageView videoPageView = VideoPageView.this;
            videoPageView.f53636c1 = new c(videoPageView, this.f53780c);
            this.f53779b.f120038L.m52609C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L */
        public final void m55474L(Video video, boolean z11, boolean z12) {
            int i11;
            Map m131407l;
            VideoPageView.this.f53609B0.mo53564DA(video, z11);
            VideoPageView videoPageView = VideoPageView.this;
            if (z11) {
                String m151863d0 = this.f53780c.m151863d0();
                int hashCode = m151863d0.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_save_video;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_save_video;
                    } else {
                        if (m151863d0.equals("SOURCE_FOR_U")) {
                            i11 = AbstractC27413h.zch_action_key_foru_save_video;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_save_video;
                    }
                } else {
                    if (m151863d0.equals("SOURCE_FOLLOWING")) {
                        i11 = AbstractC27413h.zch_action_key_following_save_video;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_save_video;
                }
            } else {
                String m151863d02 = this.f53780c.m151863d0();
                int hashCode2 = m151863d02.hashCode();
                if (hashCode2 != -507563187) {
                    if (hashCode2 != 596808987) {
                        if (hashCode2 == 1323686722 && m151863d02.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_unsave_video;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_unsave_video;
                    } else {
                        if (m151863d02.equals("SOURCE_FOR_U")) {
                            i11 = AbstractC27413h.zch_action_key_foru_unsave_video;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_unsave_video;
                    }
                } else {
                    if (m151863d02.equals("SOURCE_FOLLOWING")) {
                        i11 = AbstractC27413h.zch_action_key_following_unsave_video;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_unsave_video;
                }
            }
            String m92652XI = videoPageView.m92652XI(i11);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
            c19205a.m100713L(m92652XI, m131407l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:3:0x0003, B:6:0x0011, B:7:0x0023, B:9:0x0029, B:16:0x002f, B:12:0x0037, B:19:0x0050, B:21:0x0059, B:23:0x005f, B:24:0x0065, B:28:0x007b, B:30:0x00af, B:31:0x00c6, B:33:0x00cc, B:35:0x00e2, B:36:0x00f2, B:38:0x0104, B:40:0x011b, B:42:0x0121, B:43:0x0124, B:45:0x012a, B:48:0x013b, B:50:0x0141, B:53:0x014a, B:55:0x0133, B:57:0x014d, B:59:0x0174, B:60:0x0178, B:62:0x0181, B:63:0x0192, B:65:0x01ab, B:67:0x01d5, B:68:0x01ed, B:69:0x01f4, B:71:0x01fc, B:76:0x006d, B:78:0x0071), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cc A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:3:0x0003, B:6:0x0011, B:7:0x0023, B:9:0x0029, B:16:0x002f, B:12:0x0037, B:19:0x0050, B:21:0x0059, B:23:0x005f, B:24:0x0065, B:28:0x007b, B:30:0x00af, B:31:0x00c6, B:33:0x00cc, B:35:0x00e2, B:36:0x00f2, B:38:0x0104, B:40:0x011b, B:42:0x0121, B:43:0x0124, B:45:0x012a, B:48:0x013b, B:50:0x0141, B:53:0x014a, B:55:0x0133, B:57:0x014d, B:59:0x0174, B:60:0x0178, B:62:0x0181, B:63:0x0192, B:65:0x01ab, B:67:0x01d5, B:68:0x01ed, B:69:0x01f4, B:71:0x01fc, B:76:0x006d, B:78:0x0071), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0174 A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:3:0x0003, B:6:0x0011, B:7:0x0023, B:9:0x0029, B:16:0x002f, B:12:0x0037, B:19:0x0050, B:21:0x0059, B:23:0x005f, B:24:0x0065, B:28:0x007b, B:30:0x00af, B:31:0x00c6, B:33:0x00cc, B:35:0x00e2, B:36:0x00f2, B:38:0x0104, B:40:0x011b, B:42:0x0121, B:43:0x0124, B:45:0x012a, B:48:0x013b, B:50:0x0141, B:53:0x014a, B:55:0x0133, B:57:0x014d, B:59:0x0174, B:60:0x0178, B:62:0x0181, B:63:0x0192, B:65:0x01ab, B:67:0x01d5, B:68:0x01ed, B:69:0x01f4, B:71:0x01fc, B:76:0x006d, B:78:0x0071), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0181 A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:3:0x0003, B:6:0x0011, B:7:0x0023, B:9:0x0029, B:16:0x002f, B:12:0x0037, B:19:0x0050, B:21:0x0059, B:23:0x005f, B:24:0x0065, B:28:0x007b, B:30:0x00af, B:31:0x00c6, B:33:0x00cc, B:35:0x00e2, B:36:0x00f2, B:38:0x0104, B:40:0x011b, B:42:0x0121, B:43:0x0124, B:45:0x012a, B:48:0x013b, B:50:0x0141, B:53:0x014a, B:55:0x0133, B:57:0x014d, B:59:0x0174, B:60:0x0178, B:62:0x0181, B:63:0x0192, B:65:0x01ab, B:67:0x01d5, B:68:0x01ed, B:69:0x01f4, B:71:0x01fc, B:76:0x006d, B:78:0x0071), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01ab A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:3:0x0003, B:6:0x0011, B:7:0x0023, B:9:0x0029, B:16:0x002f, B:12:0x0037, B:19:0x0050, B:21:0x0059, B:23:0x005f, B:24:0x0065, B:28:0x007b, B:30:0x00af, B:31:0x00c6, B:33:0x00cc, B:35:0x00e2, B:36:0x00f2, B:38:0x0104, B:40:0x011b, B:42:0x0121, B:43:0x0124, B:45:0x012a, B:48:0x013b, B:50:0x0141, B:53:0x014a, B:55:0x0133, B:57:0x014d, B:59:0x0174, B:60:0x0178, B:62:0x0181, B:63:0x0192, B:65:0x01ab, B:67:0x01d5, B:68:0x01ed, B:69:0x01f4, B:71:0x01fc, B:76:0x006d, B:78:0x0071), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01fc A[Catch: Exception -> 0x000e, TRY_LEAVE, TryCatch #0 {Exception -> 0x000e, blocks: (B:3:0x0003, B:6:0x0011, B:7:0x0023, B:9:0x0029, B:16:0x002f, B:12:0x0037, B:19:0x0050, B:21:0x0059, B:23:0x005f, B:24:0x0065, B:28:0x007b, B:30:0x00af, B:31:0x00c6, B:33:0x00cc, B:35:0x00e2, B:36:0x00f2, B:38:0x0104, B:40:0x011b, B:42:0x0121, B:43:0x0124, B:45:0x012a, B:48:0x013b, B:50:0x0141, B:53:0x014a, B:55:0x0133, B:57:0x014d, B:59:0x0174, B:60:0x0178, B:62:0x0181, B:63:0x0192, B:65:0x01ab, B:67:0x01d5, B:68:0x01ed, B:69:0x01f4, B:71:0x01fc, B:76:0x006d, B:78:0x0071), top: B:2:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /* renamed from: M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m55475M(final Video video, boolean z11) {
            List list;
            boolean z12;
            Snackbar.SnackbarLayout m90658q;
            Integer m52885e;
            Integer m52885e2;
            C9768d c9768d;
            C9768d c9768d2;
            List m131185M0;
            Button button;
            Button button2;
            Button button3;
            CoreConfig m51425b;
            try {
                String m52894j = video.m52894j();
                if (m52894j == null) {
                    m52894j = "";
                }
                Matcher matcher = Pattern.compile("#\\w+").matcher(new SpannableString(m52894j));
                final StringBuilder sb2 = new StringBuilder();
                while (matcher.find()) {
                    if (sb2.length() == 0) {
                        sb2.append(matcher.group());
                    } else {
                        sb2.append(", " + matcher.group());
                    }
                }
                ChannelConfig m140381e = C27417l.f129055a.m140381e();
                String str = null;
                if (m140381e != null && (m51425b = m140381e.m51425b()) != null) {
                    list = m51425b.m51441d();
                } else {
                    list = null;
                }
                if (sb2.length() <= 0) {
                    List list2 = list;
                    if (list2 != null) {
                        if (list2.isEmpty()) {
                        }
                    }
                    z12 = false;
                    Snackbar.C16925c c16925c = Snackbar.Companion;
                    FrameLayout frameLayout = this.f53779b.f120032F;
                    AbstractC19074t.m100207e(frameLayout, "lytContent");
                    String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_page_video_uninterested_message);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    Snackbar m90669d = c16925c.m90669d(frameLayout, m92652XI, 3000);
                    final int duration = this.f53779b.f120038L.getDuration() / 1000;
                    final int currentPosition = this.f53779b.f120038L.getCurrentPosition() / 1000;
                    if (z12) {
                        String m92652XI2 = VideoPageView.this.m92652XI(AbstractC27413h.zch_page_video_uninterested_detail);
                        final VideoPageView videoPageView = VideoPageView.this;
                        m90669d.m90636A(m92652XI2, new View.OnClickListener() { // from class: m20.w2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                VideoPageView.C10616y.m55476N(sb2, videoPageView, video, duration, currentPosition, view);
                            }
                        });
                    }
                    m90658q = m90669d.m90658q();
                    if (m90658q != null) {
                        VideoPageView videoPageView2 = VideoPageView.this;
                        m90658q.setOnTouchListener(new k(m90669d, m90658q, m90658q.getContext()));
                        if (C3226p.Companion.m16362e()) {
                            m90669d.m90645K(AbstractC26112n.m134433y(m90658q, AbstractC27407b.zch_page_video_footer_height) + AbstractC26105g.m134347n(16));
                        }
                        AbstractC26112n.m134391c0(m90658q, AbstractC26112n.m134426u(m90658q, AbstractC27406a.zch_border_subtle), AbstractC26105g.m134347n(8));
                        if (z12) {
                            Context m92689tK = videoPageView2.m92689tK();
                            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                            Drawable m139659b = C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC27406a.zch_icon_accent_blue);
                            ButtonWithProgress buttonAction = m90658q.getButtonAction();
                            if (buttonAction != null && (button3 = buttonAction.getButton()) != null) {
                                button3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, m139659b, (Drawable) null);
                            }
                            ButtonWithProgress buttonAction2 = m90658q.getButtonAction();
                            if (buttonAction2 != null) {
                                button = buttonAction2.getButton();
                            } else {
                                button = null;
                            }
                            if (button != null) {
                                button.setCompoundDrawablePadding(AbstractC26105g.m134347n(2));
                            }
                            ButtonWithProgress buttonAction3 = m90658q.getButtonAction();
                            if (buttonAction3 != null) {
                                button2 = buttonAction3.getButton();
                            } else {
                                button2 = null;
                            }
                            if (button2 != null) {
                                button2.setBackground(null);
                            }
                        }
                    }
                    m90669d.m90648N();
                    this.f53779b.getRoot().m55213U();
                    InterfaceC10058f.a.m53681f(VideoPageView.this.f53609B0, video.m52911t(), null, null, 6, null);
                    VideoLayout videoLayout = this.f53779b.f120038L;
                    m52885e = video.m52885e();
                    if (m52885e != null) {
                        str = m52885e.toString();
                    }
                    videoLayout.m52610D(str);
                    m52885e2 = video.m52885e();
                    if (m52885e2 != null) {
                        C19205a.f95429a.m100710H().add(String.valueOf(m52885e2.intValue()));
                    }
                    C19205a c19205a = C19205a.f95429a;
                    c19205a.m100709G().add(video.m52887f().m50769l());
                    c9768d = VideoPageView.this.f53611D0;
                    if (c9768d != null) {
                        int m52730s = c9768d.m52730s();
                        VideoPageView videoPageView3 = VideoPageView.this;
                        C25026k2 c25026k2 = this.f53779b;
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(c19205a.m100710H());
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(c19205a.m100709G());
                        C31179n0 c31179n0 = videoPageView3.f53610C0;
                        if (c31179n0 != null) {
                            m131185M0 = AbstractC25332a0.m131185M0(arrayList2);
                            c31179n0.m151873p0(m52730s, m131185M0, arrayList, new l(z11, videoPageView3, video, duration, currentPosition));
                        }
                        c25026k2.getRoot().m55208L(m52730s);
                    }
                    c9768d2 = VideoPageView.this.f53611D0;
                    if (c9768d2 == null) {
                        c9768d2.m52713A(true);
                        return;
                    }
                    return;
                }
                z12 = true;
                Snackbar.C16925c c16925c2 = Snackbar.Companion;
                FrameLayout frameLayout2 = this.f53779b.f120032F;
                AbstractC19074t.m100207e(frameLayout2, "lytContent");
                String m92652XI3 = VideoPageView.this.m92652XI(AbstractC27413h.zch_page_video_uninterested_message);
                AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                Snackbar m90669d2 = c16925c2.m90669d(frameLayout2, m92652XI3, 3000);
                final int duration2 = this.f53779b.f120038L.getDuration() / 1000;
                final int currentPosition2 = this.f53779b.f120038L.getCurrentPosition() / 1000;
                if (z12) {
                }
                m90658q = m90669d2.m90658q();
                if (m90658q != null) {
                }
                m90669d2.m90648N();
                this.f53779b.getRoot().m55213U();
                InterfaceC10058f.a.m53681f(VideoPageView.this.f53609B0, video.m52911t(), null, null, 6, null);
                VideoLayout videoLayout2 = this.f53779b.f120038L;
                m52885e = video.m52885e();
                if (m52885e != null) {
                }
                videoLayout2.m52610D(str);
                m52885e2 = video.m52885e();
                if (m52885e2 != null) {
                }
                C19205a c19205a2 = C19205a.f95429a;
                c19205a2.m100709G().add(video.m52887f().m50769l());
                c9768d = VideoPageView.this.f53611D0;
                if (c9768d != null) {
                }
                c9768d2 = VideoPageView.this.f53611D0;
                if (c9768d2 == null) {
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104548a("zch processUninterestedVideo ex: " + e11, new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: N */
        public static final void m55476N(StringBuilder sb2, VideoPageView videoPageView, Video video, int i11, int i12, View view) {
            AbstractC19074t.m100208f(sb2, "$hashtagBuilder");
            AbstractC19074t.m100208f(videoPageView, "this$0");
            AbstractC19074t.m100208f(video, "$video");
            VideoFeedBackBottomSheet.C9531b c9531b = VideoFeedBackBottomSheet.Companion;
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            VideoFeedBackBottomSheet m51968a = c9531b.m51968a(sb3);
            m51968a.m51966pL(new j(videoPageView, video, m51968a, i11, i12));
            BaseBottomSheetView.m51747hL(m51968a, videoPageView.m55340fM(), null, 2, null);
            String m92652XI = videoPageView.m92652XI(AbstractC27413h.zch_action_key_dislike_detail_touch);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            C19205a.m100675M(c19205a, m92652XI, null, 2, null);
        }

        @Override // z10.C31179n0.b
        /* renamed from: A */
        public void mo55477A(SimpleLivestreamItem simpleLivestreamItem, LivestreamData livestreamData) {
            AbstractC19074t.m100208f(simpleLivestreamItem, "view");
            AbstractC19074t.m100208f(livestreamData, "livestreamData");
            C9768d c9768d = VideoPageView.this.f53611D0;
            if (c9768d != null) {
                c9768d.m52723M(true);
            }
            VideoPageView videoPageView = VideoPageView.this;
            LivestreamPageView m54488a = LivestreamPageView.Companion.m54488a("1", livestreamData);
            m54488a.m54485yL(new e(VideoPageView.this, simpleLivestreamItem));
            videoPageView.m55552RK(m54488a);
        }

        @Override // z10.C31179n0.b
        /* renamed from: B */
        public void mo55478B(Video video) {
            AbstractC19074t.m100208f(video, "video");
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_delete_video_title), Integer.valueOf(AbstractC27413h.zch_popup_delete_video_message), Integer.valueOf(AbstractC27413h.zch_popup_delete_video_positive), Integer.valueOf(AbstractC27413h.zch_popup_delete_video_negative), null, true, false, 80, null);
            m51992b.m51991lL(new f(VideoPageView.this, video));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, VideoPageView.this.m55340fM(), null, 2, null);
        }

        @Override // z10.C31179n0.b
        /* renamed from: C */
        public void mo55479C(Video video) {
            Action m52926b;
            Banner m52774a;
            String m52779a;
            AbstractC19074t.m100208f(video, "video");
            VideoAdsInfo m52881b = video.m52881b();
            if (m52881b != null && (m52926b = m52881b.m52926b()) != null && (m52774a = m52926b.m52774a()) != null && (m52779a = m52774a.m52779a()) != null) {
                VideoPageView.this.m55361sM(m52779a);
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_open_ad_banner);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100676P(c19205a, m92652XI, video, null, 4, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
        @Override // z10.C31179n0.b
        /* renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo55480D(Video video, boolean z11, boolean z12) {
            int i11;
            Integer m51232e;
            int i12;
            int i13;
            VideoPageLayout videoPageLayout;
            Integer m51232e2;
            AbstractC19074t.m100208f(video, "video");
            if (!video.m52834A0() && (video.m52902n() || ((m51232e2 = C27417l.f129055a.m140378b().m51232e()) != null && m51232e2.intValue() == 2))) {
                C25026k2 c25026k2 = (C25026k2) VideoPageView.this.m55556SK();
                if (c25026k2 != null && (videoPageLayout = c25026k2.f120036J) != null) {
                    videoPageLayout.m55224s0(video);
                }
                InterfaceC10058f.a.m53678c(VideoPageView.this.f53609B0, video.m52911t(), null, 2, null);
                C19205a c19205a = C19205a.f95429a;
                VideoPageView videoPageView = VideoPageView.this;
                String m151863d0 = this.f53780c.m151863d0();
                int hashCode = m151863d0.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                            i13 = AbstractC27413h.zch_action_key_friend_caption_similar;
                        }
                        i13 = AbstractC27413h.zch_action_key_player_caption_similar;
                    } else {
                        if (m151863d0.equals("SOURCE_FOR_U")) {
                            i13 = AbstractC27413h.zch_action_key_foru_caption_similar;
                        }
                        i13 = AbstractC27413h.zch_action_key_player_caption_similar;
                    }
                } else {
                    if (m151863d0.equals("SOURCE_FOLLOWING")) {
                        i13 = AbstractC27413h.zch_action_key_following_caption_similar;
                    }
                    i13 = AbstractC27413h.zch_action_key_player_caption_similar;
                }
                String m92652XI = videoPageView.m92652XI(i13);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                C19205a.m100675M(c19205a, m92652XI, null, 2, null);
                return true;
            }
            if (!video.m52834A0() && !video.m52886e0() && (m51232e = C27417l.f129055a.m140378b().m51232e()) != null && m51232e.intValue() == 1) {
                VideoPageView.m55336dM(VideoPageView.this, video, null, null, 0, true, 14, null);
                C19205a c19205a2 = C19205a.f95429a;
                VideoPageView videoPageView2 = VideoPageView.this;
                String m151863d02 = this.f53780c.m151863d0();
                int hashCode2 = m151863d02.hashCode();
                if (hashCode2 != -507563187) {
                    if (hashCode2 != 596808987) {
                        if (hashCode2 == 1323686722 && m151863d02.equals("SOURCE_FRIEND")) {
                            if (z12) {
                                i12 = AbstractC27413h.zch_action_key_friend_caption_see_more_comment;
                            } else {
                                i12 = AbstractC27413h.zch_action_key_friend_caption_comment;
                            }
                        }
                        if (z12) {
                            i12 = AbstractC27413h.zch_action_key_player_caption_see_more_comment;
                        } else {
                            i12 = AbstractC27413h.zch_action_key_player_caption_comment;
                        }
                    } else {
                        if (m151863d02.equals("SOURCE_FOR_U")) {
                            if (z12) {
                                i12 = AbstractC27413h.zch_action_key_foru_caption_see_more_comment;
                            } else {
                                i12 = AbstractC27413h.zch_action_key_foru_caption_comment;
                            }
                        }
                        if (z12) {
                        }
                    }
                } else {
                    if (m151863d02.equals("SOURCE_FOLLOWING")) {
                        if (z12) {
                            i12 = AbstractC27413h.zch_action_key_following_caption_see_more_comment;
                        } else {
                            i12 = AbstractC27413h.zch_action_key_following_caption_comment;
                        }
                    }
                    if (z12) {
                    }
                }
                String m92652XI2 = videoPageView2.m92652XI(i12);
                AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                C19205a.m100675M(c19205a2, m92652XI2, null, 2, null);
                return true;
            }
            C19205a c19205a3 = C19205a.f95429a;
            VideoPageView videoPageView3 = VideoPageView.this;
            String m151863d03 = this.f53780c.m151863d0();
            int hashCode3 = m151863d03.hashCode();
            if (hashCode3 != -507563187) {
                if (hashCode3 != 596808987) {
                    if (hashCode3 == 1323686722 && m151863d03.equals("SOURCE_FRIEND")) {
                        if (z11) {
                            i11 = AbstractC27413h.zch_action_key_friend_expand_description;
                        } else {
                            i11 = AbstractC27413h.zch_action_key_friend_collapse_description;
                        }
                    }
                    if (z11) {
                        i11 = AbstractC27413h.zch_action_key_player_expand_description;
                    } else {
                        i11 = AbstractC27413h.zch_action_key_player_collapse_description;
                    }
                } else {
                    if (m151863d03.equals("SOURCE_FOR_U")) {
                        if (z11) {
                            i11 = AbstractC27413h.zch_action_key_for_u_expand_description;
                        } else {
                            i11 = AbstractC27413h.zch_action_key_for_u_collapse_description;
                        }
                    }
                    if (z11) {
                    }
                }
            } else {
                if (m151863d03.equals("SOURCE_FOLLOWING")) {
                    if (z11) {
                        i11 = AbstractC27413h.zch_action_key_following_expand_description;
                    } else {
                        i11 = AbstractC27413h.zch_action_key_following_collapse_description;
                    }
                }
                if (z11) {
                }
            }
            String m92652XI3 = videoPageView3.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI3, "getString(...)");
            C19205a.m100675M(c19205a3, m92652XI3, null, 2, null);
            return false;
        }

        @Override // z10.C31179n0.b
        /* renamed from: E */
        public void mo55481E(Video video) {
            String m92652XI;
            Map m131407l;
            String m52959b;
            AbstractC19074t.m100208f(video, "video");
            VideoPromote m52873W = video.m52873W();
            if (m52873W != null && (m52959b = m52873W.m52959b()) != null) {
                VideoPageView.this.m55361sM(m52959b);
            }
            String m151863d0 = this.f53780c.m151863d0();
            int hashCode = m151863d0.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                        m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_friend_open_promote_link);
                    }
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_open_promote_link);
                } else {
                    if (m151863d0.equals("SOURCE_FOR_U")) {
                        m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_foru_open_promote_link);
                    }
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_open_promote_link);
                }
            } else {
                if (m151863d0.equals("SOURCE_FOLLOWING")) {
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_following_open_promote_link);
                }
                m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_open_promote_link);
            }
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
            c19205a.m100713L(m92652XI, m131407l);
        }

        @Override // z10.C31179n0.b
        /* renamed from: F */
        public void mo55482F() {
            Map m131407l;
            C31179n0 c31179n0 = VideoPageView.this.f53610C0;
            if (c31179n0 != null && c31179n0.mo151443L()) {
                Object obj = this.f53780c.f143912B.get(0);
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video = (Video) obj;
                if (video != null) {
                    VideoPageView videoPageView = VideoPageView.this;
                    C25026k2 c25026k2 = this.f53779b;
                    FooterVideoPromote m52900m = video.m52900m();
                    if (m52900m != null && m52900m.m52808h()) {
                        VideoLayout videoLayout = c25026k2.f120038L;
                        AbstractC19074t.m100207e(videoLayout, "lytVideo");
                        videoPageView.m55320VL(videoLayout);
                        InterfaceC10058f interfaceC10058f = videoPageView.f53609B0;
                        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                        interfaceC10058f.mo53593ws(m131407l);
                        return;
                    }
                    VideoLayout videoLayout2 = c25026k2.f120038L;
                    AbstractC19074t.m100207e(videoLayout2, "lytVideo");
                    videoPageView.m55363tM(videoLayout2);
                }
            }
        }

        @Override // z10.C31179n0.b
        /* renamed from: a */
        public void mo55483a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "loadMore");
            VideoPageView.this.f53609B0.mo53588q1(loadMoreInfo);
        }

        @Override // z10.C31179n0.b
        /* renamed from: b */
        public void mo55484b(String str, Video video) {
            String str2;
            String m127189r0;
            Map m131401f;
            AbstractC19074t.m100208f(str, "hashtag");
            AbstractC19074t.m100208f(video, "video");
            Bundle m92642L3 = VideoPageView.this.m92642L3();
            if (m92642L3 != null) {
                str2 = m92642L3.getString("HASHTAG");
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str, str2)) {
                VideoPageView.this.finish();
                return;
            }
            VideoPageView videoPageView = VideoPageView.this;
            SearchPageView.C10392b c10392b = SearchPageView.Companion;
            m127189r0 = AbstractC24342w.m127189r0(str, "#");
            videoPageView.m55551QK(c10392b.m54827b(m127189r0));
            if (video.m52834A0()) {
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_video_ad_hashtag);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                C19205a.m100676P(c19205a, m92652XI, video, null, 4, null);
                return;
            }
            C19205a c19205a2 = C19205a.f95429a;
            String m92652XI2 = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_search_video_hashtag);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("hashtag", str));
            c19205a2.m100713L(m92652XI2, m131401f);
        }

        @Override // z10.C31179n0.b
        /* renamed from: c */
        public void mo55485c(Video video) {
            String m92652XI;
            Map m131407l;
            Map m131408m;
            AbstractC19074t.m100208f(video, "video");
            m55473K(video);
            String m151863d0 = this.f53780c.m151863d0();
            int hashCode = m151863d0.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                        m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_friend_icon_share);
                    }
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_icon_share);
                } else {
                    if (m151863d0.equals("SOURCE_FOR_U")) {
                        m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_foru_icon_share);
                    }
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_icon_share);
                }
            } else {
                if (m151863d0.equals("SOURCE_FOLLOWING")) {
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_following_icon_share);
                }
                m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_icon_share);
            }
            if (video.m52834A0()) {
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                c19205a.m100714N(m92652XI, video, m131408m);
                return;
            }
            C19205a c19205a2 = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
            c19205a2.m100713L(m92652XI, m131407l);
        }

        @Override // z10.C31179n0.b
        /* renamed from: d */
        public void mo55486d(Video video) {
            AbstractC19074t.m100208f(video, "video");
            m55475M(video, false);
        }

        @Override // z10.C31179n0.b
        /* renamed from: e */
        public void mo55487e(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "loadMoreInfo");
            VideoPageView.this.f53609B0.mo53568La(false, loadMoreInfo);
        }

        @Override // z10.C31179n0.b
        /* renamed from: f */
        public void mo55488f(String str) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            VideoPageView.this.m55361sM(str);
        }

        @Override // z10.C31179n0.b
        /* renamed from: g */
        public void mo55489g(Video video, boolean z11) {
            String m92652XI;
            Ended m52932h;
            String m52792b;
            AbstractC19074t.m100208f(video, "video");
            VideoAdsInfo m52881b = video.m52881b();
            if (m52881b != null && (m52932h = m52881b.m52932h()) != null && (m52792b = m52932h.m52792b()) != null) {
                VideoPageView.this.m55361sM(m52792b);
            }
            if (z11) {
                m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_open_ad_end_cta);
            } else {
                m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_open_ad_end_description);
            }
            String str = m92652XI;
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(str);
            C19205a.m100676P(c19205a, str, video, null, 4, null);
        }

        @Override // z10.C31179n0.b
        /* renamed from: h */
        public void mo55490h(Video video) {
            Action m52926b;
            com.zing.zalo.shortvideo.p072ui.model.Button m52775b;
            String m52784a;
            AbstractC19074t.m100208f(video, "video");
            VideoAdsInfo m52881b = video.m52881b();
            if (m52881b != null && (m52926b = m52881b.m52926b()) != null && (m52775b = m52926b.m52775b()) != null && (m52784a = m52775b.m52784a()) != null) {
                VideoPageView.this.m55361sM(m52784a);
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_open_ad_highlight_cta);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100676P(c19205a, m92652XI, video, null, 4, null);
        }

        @Override // z10.C31179n0.b
        /* renamed from: i */
        public void mo55491i(Channel channel, LivestreamData livestreamData, String str) {
            String m92652XI;
            Map m131408m;
            String str2;
            AbstractC19074t.m100208f(channel, "channel");
            AbstractC19074t.m100208f(livestreamData, "livestreamData");
            String m151863d0 = this.f53780c.m151863d0();
            int hashCode = m151863d0.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                        m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_friend_channel_detail);
                    }
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_channel_detail);
                } else {
                    if (m151863d0.equals("SOURCE_FOR_U")) {
                        m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_foru_channel_detail);
                    }
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_channel_detail);
                }
            } else {
                if (m151863d0.equals("SOURCE_FOLLOWING")) {
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_following_channel_detail);
                }
                m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_channel_detail);
            }
            m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("seen_channel_uid", channel.m50769l()));
            if (VideoPageView.this.m92650VI() instanceof VideoChannelPagerView) {
                ZaloView m92650VI = VideoPageView.this.m92650VI();
                AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView");
                ((VideoChannelPagerView) m92650VI).m55103lL();
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                c19205a.m100713L(m92652XI, m131408m);
                return;
            }
            String m50769l = channel.m50769l();
            Bundle m92642L3 = VideoPageView.this.m92642L3();
            if (m92642L3 != null) {
                str2 = m92642L3.getString("CHANNEL_ID");
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(m50769l, str2)) {
                VideoPageView.this.finish();
                return;
            }
            VideoPageView.this.m55551QK(ChannelPageView.Companion.m53983a(channel, livestreamData.m51016f()));
            C19205a c19205a2 = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a2.m100713L(m92652XI, m131408m);
        }

        @Override // z10.C31179n0.b
        /* renamed from: j */
        public void mo55492j(BreakSlot breakSlot) {
            AbstractC19074t.m100208f(breakSlot, "onboarding");
            this.f53779b.getRoot().m55207K(breakSlot);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:            if (r1.length() != 0) goto L28;     */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:            r14 = true;     */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0136, code lost:            if (r1.equals("SOURCE_FRIEND") == false) goto L81;     */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0144, code lost:            if (r26.m52834A0() == false) goto L74;     */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0146, code lost:            r0 = "9";     */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x014b, code lost:            r0 = "5";     */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x013d, code lost:            if (r1.equals("SOURCE_FOR_U") == false) goto L81;     */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0063, code lost:            if (r1.length() != 0) goto L28;     */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00ad  */
        @Override // z10.C31179n0.b
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo55493k(Video video, boolean z11) {
            boolean m131390w;
            VideoAdsInfo m52881b;
            String m52849J;
            boolean z12;
            String m50769l;
            Channel m140377a;
            String str;
            boolean z13;
            boolean z14;
            Boolean bool;
            boolean z15;
            boolean z16;
            boolean z17;
            String m151863d0;
            String str2;
            String str3;
            String str4;
            int hashCode;
            int i11;
            Map m131407l;
            boolean z18;
            boolean z19;
            boolean z21;
            String m52856N;
            String str5;
            AbstractC19074t.m100208f(video, "video");
            BottomGuideLayout bottomGuideLayout = this.f53779b.f120033G;
            AbstractC19074t.m100207e(bottomGuideLayout, "lytGuideBottom");
            if (AbstractC26112n.m134380U(bottomGuideLayout)) {
                VideoPageView.this.m55322WL();
            }
            C27417l c27417l = C27417l.f129055a;
            if (c27417l.m140378b().m51243p()) {
                VideoAdsInfo m52881b2 = video.m52881b();
                if (m52881b2 != null && m52881b2.m52930f() == 2) {
                    VideoAdsInfo m52881b3 = video.m52881b();
                    if (m52881b3 != null) {
                        str5 = m52881b3.m52935k();
                    } else {
                        str5 = null;
                    }
                    if (str5 != null) {
                    }
                } else {
                    VideoAdsInfo m52881b4 = video.m52881b();
                    if (m52881b4 == null || (m52856N = m52881b4.m52935k()) == null) {
                        m52856N = video.m52856N();
                    }
                    if (m52856N != null) {
                    }
                }
                m131390w = AbstractC25358n.m131390w(new String[]{"SOURCE_FOR_U"}, VideoPageView.this.f53609B0.mo53582h());
                m52881b = video.m52881b();
                if (m52881b != null || (m52849J = m52881b.m52934j()) == null) {
                    m52849J = video.m52849J();
                }
                if (m52849J == null && m52849J.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                boolean z22 = !z12;
                m50769l = video.m52887f().m50769l();
                m140377a = c27417l.m140377a();
                if (m140377a == null) {
                    str = m140377a.m50769l();
                } else {
                    str = null;
                }
                if (!AbstractC19074t.m100204b(m50769l, str)) {
                    if (AbstractC19074t.m100204b(VideoPageView.this.f53609B0.mo53582h(), "SOURCE_CHANNEL")) {
                        z18 = !video.m52912t0();
                        z19 = video.m52912t0();
                        z21 = true;
                    } else {
                        z18 = false;
                        z19 = false;
                        z21 = false;
                    }
                    Channel m140377a2 = c27417l.m140377a();
                    if (m140377a2 != null) {
                        Boolean m50720C = m140377a2.m50720C();
                        Boolean bool2 = Boolean.FALSE;
                        if (AbstractC19074t.m100204b(m50720C, bool2) && AbstractC19074t.m100204b(video.m52869U(), bool2)) {
                            z15 = z18;
                            z16 = z19;
                            z17 = z21;
                            bool = Boolean.valueOf(video.m52886e0());
                            z13 = false;
                            z14 = false;
                        }
                    }
                    z15 = z18;
                    z16 = z19;
                    z17 = z21;
                    bool = null;
                    z13 = false;
                    z14 = false;
                } else {
                    z13 = m131390w;
                    z14 = z22;
                    bool = null;
                    z15 = false;
                    z16 = false;
                    z17 = false;
                }
                VideoActionBottomSheet.C9527b c9527b = VideoActionBottomSheet.Companion;
                boolean m52895j0 = video.m52895j0();
                m151863d0 = this.f53780c.m151863d0();
                switch (m151863d0.hashCode()) {
                    case -576339777:
                        if (m151863d0.equals("SOURCE_CHANNEL")) {
                            String m50769l2 = video.m52887f().m50769l();
                            Channel m140377a3 = c27417l.m140377a();
                            if (m140377a3 != null) {
                                str3 = m140377a3.m50769l();
                            } else {
                                str3 = null;
                            }
                            if (AbstractC19074t.m100204b(m50769l2, str3)) {
                                str4 = "4";
                                str2 = str4;
                                break;
                            }
                        }
                        str2 = "3";
                        break;
                    case -507563187:
                        if (m151863d0.equals("SOURCE_FOLLOWING")) {
                            str4 = "6";
                            str2 = str4;
                            break;
                        }
                        str2 = "3";
                        break;
                    case 596808987:
                        break;
                    case 1323686722:
                        break;
                    default:
                        str2 = "3";
                        break;
                }
                VideoActionBottomSheet m51955a = c9527b.m51955a(r14, z13, z14, z15, z16, z17, m52895j0, bool, str2);
                m51955a.m51944kL(new i(video, VideoPageView.this, this.f53780c, m51955a, this.f53779b));
                m51955a.m51757bL(true);
                BaseBottomSheetView.m51747hL(m51955a, VideoPageView.this.m55340fM(), null, 2, null);
                C19205a c19205a = C19205a.f95429a;
                VideoPageView videoPageView = VideoPageView.this;
                String m151863d02 = this.f53780c.m151863d0();
                hashCode = m151863d02.hashCode();
                if (hashCode == -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d02.equals("SOURCE_FRIEND")) {
                            i11 = AbstractC27413h.zch_action_key_friend_more;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_more;
                    } else {
                        if (m151863d02.equals("SOURCE_FOR_U")) {
                            i11 = AbstractC27413h.zch_action_key_for_u_more;
                        }
                        i11 = AbstractC27413h.zch_action_key_player_more;
                    }
                } else {
                    if (m151863d02.equals("SOURCE_FOLLOWING")) {
                        i11 = AbstractC27413h.zch_action_key_following_more;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_more;
                }
                String m92652XI = videoPageView.m92652XI(i11);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()), AbstractC24866w.m129235a("is_long_touch", Integer.valueOf(z11 ? 1 : 0)));
                c19205a.m100713L(m92652XI, m131407l);
            }
            boolean z23 = false;
            m131390w = AbstractC25358n.m131390w(new String[]{"SOURCE_FOR_U"}, VideoPageView.this.f53609B0.mo53582h());
            m52881b = video.m52881b();
            if (m52881b != null) {
            }
            m52849J = video.m52849J();
            if (m52849J == null) {
            }
            z12 = true;
            boolean z222 = !z12;
            m50769l = video.m52887f().m50769l();
            m140377a = c27417l.m140377a();
            if (m140377a == null) {
            }
            if (!AbstractC19074t.m100204b(m50769l, str)) {
            }
            VideoActionBottomSheet.C9527b c9527b2 = VideoActionBottomSheet.Companion;
            boolean m52895j02 = video.m52895j0();
            m151863d0 = this.f53780c.m151863d0();
            switch (m151863d0.hashCode()) {
                case -576339777:
                    break;
                case -507563187:
                    break;
                case 596808987:
                    break;
                case 1323686722:
                    break;
            }
            VideoActionBottomSheet m51955a2 = c9527b2.m51955a(z23, z13, z14, z15, z16, z17, m52895j02, bool, str2);
            m51955a2.m51944kL(new i(video, VideoPageView.this, this.f53780c, m51955a2, this.f53779b));
            m51955a2.m51757bL(true);
            BaseBottomSheetView.m51747hL(m51955a2, VideoPageView.this.m55340fM(), null, 2, null);
            C19205a c19205a2 = C19205a.f95429a;
            VideoPageView videoPageView2 = VideoPageView.this;
            String m151863d022 = this.f53780c.m151863d0();
            hashCode = m151863d022.hashCode();
            if (hashCode == -507563187) {
            }
            String m92652XI2 = videoPageView2.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()), AbstractC24866w.m129235a("is_long_touch", Integer.valueOf(z11 ? 1 : 0)));
            c19205a2.m100713L(m92652XI2, m131407l);
        }

        @Override // z10.C31179n0.b
        /* renamed from: l */
        public void mo55494l(Channel channel, String str) {
            Map m131401f;
            AbstractC19074t.m100208f(channel, "channel");
            VideoPageView.this.m55551QK(ChannelPageView.Companion.m53983a(channel, str));
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_suggest_channel_detail);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
            c19205a.m100713L(m92652XI, m131401f);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
        @Override // z10.C31179n0.b
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo55495m(int i11, Channel channel, boolean z11, boolean z12, Video video) {
            int i12;
            Map m131407l;
            int i13;
            Map m131408m;
            int i14;
            Map m131408m2;
            AbstractC19074t.m100208f(channel, "channel");
            AbstractC19074t.m100208f(video, "video");
            if (z11) {
                InterfaceC10058f.a.m53679d(VideoPageView.this.f53609B0, channel, true, false, video, 4, null);
                this.f53779b.f120038L.m52629z();
                if (z12) {
                    VideoPageView videoPageView = VideoPageView.this;
                    String m151863d0 = this.f53780c.m151863d0();
                    int hashCode = m151863d0.hashCode();
                    if (hashCode == -507563187) {
                        if (m151863d0.equals("SOURCE_FOLLOWING")) {
                            i14 = AbstractC27413h.zch_action_key_following_big_follow_channel;
                            String m92652XI = videoPageView.m92652XI(i14);
                            m131408m2 = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
                            if (!video.m52834A0()) {
                            }
                        }
                        i14 = AbstractC27413h.zch_action_key_player_big_follow_channel;
                        String m92652XI2 = videoPageView.m92652XI(i14);
                        m131408m2 = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
                        if (!video.m52834A0()) {
                        }
                    } else if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                            i14 = AbstractC27413h.zch_action_key_friend_big_follow_channel;
                            String m92652XI22 = videoPageView.m92652XI(i14);
                            m131408m2 = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
                            if (!video.m52834A0()) {
                                C19205a c19205a = C19205a.f95429a;
                                AbstractC19074t.m100205c(m92652XI22);
                                C19205a.m100676P(c19205a, m92652XI22, video, null, 4, null);
                            } else {
                                C19205a c19205a2 = C19205a.f95429a;
                                AbstractC19074t.m100205c(m92652XI22);
                                c19205a2.m100713L(m92652XI22, m131408m2);
                            }
                        }
                        i14 = AbstractC27413h.zch_action_key_player_big_follow_channel;
                        String m92652XI222 = videoPageView.m92652XI(i14);
                        m131408m2 = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
                        if (!video.m52834A0()) {
                        }
                    } else {
                        if (m151863d0.equals("SOURCE_FOR_U")) {
                            i14 = AbstractC27413h.zch_action_key_foru_big_follow_channel;
                            String m92652XI2222 = videoPageView.m92652XI(i14);
                            m131408m2 = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
                            if (!video.m52834A0()) {
                            }
                        }
                        i14 = AbstractC27413h.zch_action_key_player_big_follow_channel;
                        String m92652XI22222 = videoPageView.m92652XI(i14);
                        m131408m2 = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
                        if (!video.m52834A0()) {
                        }
                    }
                } else {
                    VideoPageView videoPageView2 = VideoPageView.this;
                    String m151863d02 = this.f53780c.m151863d0();
                    int hashCode2 = m151863d02.hashCode();
                    if (hashCode2 == -507563187) {
                        if (m151863d02.equals("SOURCE_FOLLOWING")) {
                            i13 = AbstractC27413h.zch_action_key_following_follow_channel;
                            String m92652XI3 = videoPageView2.m92652XI(i13);
                            m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()), AbstractC24866w.m129235a("is_highlight", Integer.valueOf(this.f53780c.m151870k0(i11) ? 1 : 0)));
                            if (!video.m52834A0()) {
                            }
                        }
                        i13 = AbstractC27413h.zch_action_key_player_follow_channel;
                        String m92652XI32 = videoPageView2.m92652XI(i13);
                        m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()), AbstractC24866w.m129235a("is_highlight", Integer.valueOf(this.f53780c.m151870k0(i11) ? 1 : 0)));
                        if (!video.m52834A0()) {
                        }
                    } else if (hashCode2 != 596808987) {
                        if (hashCode2 == 1323686722 && m151863d02.equals("SOURCE_FRIEND")) {
                            i13 = AbstractC27413h.zch_action_key_friend_follow_channel;
                            String m92652XI322 = videoPageView2.m92652XI(i13);
                            m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()), AbstractC24866w.m129235a("is_highlight", Integer.valueOf(this.f53780c.m151870k0(i11) ? 1 : 0)));
                            if (!video.m52834A0()) {
                                C19205a c19205a3 = C19205a.f95429a;
                                AbstractC19074t.m100205c(m92652XI322);
                                C19205a.m100676P(c19205a3, m92652XI322, video, null, 4, null);
                            } else {
                                C19205a c19205a4 = C19205a.f95429a;
                                AbstractC19074t.m100205c(m92652XI322);
                                c19205a4.m100713L(m92652XI322, m131408m);
                            }
                        }
                        i13 = AbstractC27413h.zch_action_key_player_follow_channel;
                        String m92652XI3222 = videoPageView2.m92652XI(i13);
                        m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()), AbstractC24866w.m129235a("is_highlight", Integer.valueOf(this.f53780c.m151870k0(i11) ? 1 : 0)));
                        if (!video.m52834A0()) {
                        }
                    } else {
                        if (m151863d02.equals("SOURCE_FOR_U")) {
                            i13 = AbstractC27413h.zch_action_key_foru_follow_channel;
                            String m92652XI32222 = videoPageView2.m92652XI(i13);
                            m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()), AbstractC24866w.m129235a("is_highlight", Integer.valueOf(this.f53780c.m151870k0(i11) ? 1 : 0)));
                            if (!video.m52834A0()) {
                            }
                        }
                        i13 = AbstractC27413h.zch_action_key_player_follow_channel;
                        String m92652XI322222 = videoPageView2.m92652XI(i13);
                        m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()), AbstractC24866w.m129235a("is_highlight", Integer.valueOf(this.f53780c.m151870k0(i11) ? 1 : 0)));
                        if (!video.m52834A0()) {
                        }
                    }
                }
                if (AbstractC19074t.m100204b(VideoPageView.this.f53609B0.mo53582h(), "SOURCE_FOR_U")) {
                    ZaloView m92650VI = VideoPageView.this.m92650VI();
                    AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView");
                    ((VideoChannelPagerView) m92650VI).m55106oL();
                    return;
                }
                return;
            }
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_title), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_message), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_positive), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_negative), null, false, false, 112, null);
            m51992b.m51991lL(new g(VideoPageView.this, channel, video, m51992b, this.f53780c));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, VideoPageView.this.m55340fM(), null, 2, null);
            C19205a c19205a5 = C19205a.f95429a;
            VideoPageView videoPageView3 = VideoPageView.this;
            String m151863d03 = this.f53780c.m151863d0();
            int hashCode3 = m151863d03.hashCode();
            if (hashCode3 == -507563187) {
                if (m151863d03.equals("SOURCE_FOLLOWING")) {
                    i12 = AbstractC27413h.zch_action_key_following_big_unfollow_channel;
                }
                i12 = AbstractC27413h.zch_action_key_player_big_unfollow_channel;
            } else if (hashCode3 != 596808987) {
                if (hashCode3 == 1323686722 && m151863d03.equals("SOURCE_FRIEND")) {
                    i12 = AbstractC27413h.zch_action_key_friend_big_unfollow_channel;
                }
                i12 = AbstractC27413h.zch_action_key_player_big_unfollow_channel;
            } else {
                if (m151863d03.equals("SOURCE_FOR_U")) {
                    i12 = AbstractC27413h.zch_action_key_foru_big_unfollow_channel;
                }
                i12 = AbstractC27413h.zch_action_key_player_big_unfollow_channel;
            }
            String m92652XI4 = videoPageView3.m92652XI(i12);
            AbstractC19074t.m100207e(m92652XI4, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
            c19205a5.m100713L(m92652XI4, m131407l);
        }

        @Override // z10.C31179n0.b
        /* renamed from: n */
        public void mo55496n(String str, Video video) {
            AbstractC19074t.m100208f(str, "link");
            AbstractC19074t.m100208f(video, "video");
            VideoPageView.this.m55361sM(str);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_open_ad_end_channel);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100676P(c19205a, m92652XI, video, null, 4, null);
        }

        @Override // z10.C31179n0.b
        /* renamed from: o */
        public void mo55497o(BreakSlot breakSlot) {
            Map m131407l;
            Object obj;
            String m50700a;
            AbstractC19074t.m100208f(breakSlot, "survey");
            VideoPageView.this.f53609B0.mo53590sA(breakSlot, true);
            C31179n0 c31179n0 = VideoPageView.this.f53610C0;
            if (c31179n0 != null) {
                c31179n0.m151872o0(breakSlot);
            }
            C9768d c9768d = VideoPageView.this.f53611D0;
            if (c9768d != null) {
                c9768d.m52713A(true);
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_survey_submit);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C24860q[] c24860qArr = new C24860q[3];
            String m50691l = breakSlot.m50691l();
            String str = "";
            if (m50691l == null) {
                m50691l = "";
            }
            c24860qArr[0] = AbstractC24866w.m129235a("video_id", m50691l);
            String m50687h = breakSlot.m50687h();
            if (m50687h == null) {
                m50687h = "";
            }
            c24860qArr[1] = AbstractC24866w.m129235a("survey_template", m50687h);
            ArrayList m50685f = breakSlot.m50685f();
            if (m50685f != null) {
                Iterator it = m50685f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((BreakSlot.Option) obj).m50702c()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                BreakSlot.Option option = (BreakSlot.Option) obj;
                if (option != null && (m50700a = option.m50700a()) != null) {
                    str = m50700a;
                }
            }
            c24860qArr[2] = AbstractC24866w.m129235a("reply_id", str);
            m131407l = AbstractC25363p0.m131407l(c24860qArr);
            c19205a.m100713L(m92652XI, m131407l);
        }

        @Override // z10.C31179n0.b
        /* renamed from: p */
        public void mo55498p(Video video, String str) {
            AbstractC19074t.m100208f(video, "video");
            if (str != null) {
                VideoPageView.this.m55361sM(str);
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_open_ad_caption);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100676P(c19205a, m92652XI, video, null, 4, null);
        }

        @Override // z10.C31179n0.b
        /* renamed from: q */
        public void mo55499q(int i11, Channel channel, boolean z11, LivestreamData livestreamData) {
            int i12;
            Map m131408m;
            AbstractC19074t.m100208f(channel, "channel");
            AbstractC19074t.m100208f(livestreamData, "livestreamData");
            if (z11) {
                VideoPageView.this.f53609B0.mo53573Wf(channel, true, false, null);
                VideoPageView videoPageView = VideoPageView.this;
                String m151863d0 = this.f53780c.m151863d0();
                int hashCode = m151863d0.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                            i12 = AbstractC27413h.zch_action_key_friend_follow_channel;
                        }
                        i12 = AbstractC27413h.zch_action_key_player_follow_channel;
                    } else {
                        if (m151863d0.equals("SOURCE_FOR_U")) {
                            i12 = AbstractC27413h.zch_action_key_foru_follow_channel;
                        }
                        i12 = AbstractC27413h.zch_action_key_player_follow_channel;
                    }
                } else {
                    if (m151863d0.equals("SOURCE_FOLLOWING")) {
                        i12 = AbstractC27413h.zch_action_key_following_follow_channel;
                    }
                    i12 = AbstractC27413h.zch_action_key_player_follow_channel;
                }
                String m92652XI = videoPageView.m92652XI(i12);
                m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()), AbstractC24866w.m129235a("is_highlight", 0));
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                c19205a.m100713L(m92652XI, m131408m);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
        @Override // z10.C31179n0.b
        /* renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo55500r(Video video, int i11) {
            int i12;
            String m92652XI;
            int i13;
            Map m131407l;
            int i14;
            int i15;
            AbstractC19074t.m100208f(video, "video");
            VideoPageView.m55336dM(VideoPageView.this, video, null, null, i11, false, 22, null);
            String m151863d0 = this.f53780c.m151863d0();
            int hashCode = m151863d0.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                        VideoPageView videoPageView = VideoPageView.this;
                        if (i11 != 0) {
                            i15 = AbstractC27413h.zch_action_key_friend_suggest_comment;
                        } else {
                            i15 = AbstractC27413h.zch_action_key_friend_icon_comment;
                        }
                        m92652XI = videoPageView.m92652XI(i15);
                    }
                    VideoPageView videoPageView2 = VideoPageView.this;
                    if (i11 != 0) {
                        i13 = AbstractC27413h.zch_action_key_player_suggest_comment;
                    } else {
                        i13 = AbstractC27413h.zch_action_key_player_icon_comment;
                    }
                    m92652XI = videoPageView2.m92652XI(i13);
                } else {
                    if (m151863d0.equals("SOURCE_FOR_U")) {
                        VideoPageView videoPageView3 = VideoPageView.this;
                        if (i11 != 0) {
                            i14 = AbstractC27413h.zch_action_key_for_u_suggest_comment;
                        } else {
                            i14 = AbstractC27413h.zch_action_key_for_u_icon_comment;
                        }
                        m92652XI = videoPageView3.m92652XI(i14);
                    }
                    VideoPageView videoPageView22 = VideoPageView.this;
                    if (i11 != 0) {
                    }
                    m92652XI = videoPageView22.m92652XI(i13);
                }
            } else {
                if (m151863d0.equals("SOURCE_FOLLOWING")) {
                    VideoPageView videoPageView4 = VideoPageView.this;
                    if (i11 != 0) {
                        i12 = AbstractC27413h.zch_action_key_following_suggest_comment;
                    } else {
                        i12 = AbstractC27413h.zch_action_key_following_icon_comment;
                    }
                    m92652XI = videoPageView4.m92652XI(i12);
                }
                VideoPageView videoPageView222 = VideoPageView.this;
                if (i11 != 0) {
                }
                m92652XI = videoPageView222.m92652XI(i13);
            }
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("comment_count", Long.valueOf(video.m52837C())));
            c19205a.m100713L(m92652XI, m131407l);
        }

        @Override // z10.C31179n0.b
        /* renamed from: s */
        public void mo55501s(Channel channel, Video video, String str) {
            String m92652XI;
            Map m131408m;
            String str2;
            AbstractC19074t.m100208f(channel, "channel");
            AbstractC19074t.m100208f(video, "video");
            VideoAdsInfo m52881b = video.m52881b();
            if (m52881b != null && m52881b.m52930f() == 2) {
                if (str != null) {
                    VideoPageView.this.m55361sM(str);
                }
                C19205a c19205a = C19205a.f95429a;
                String m92652XI2 = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_open_ad_channel_profile);
                AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                C19205a.m100676P(c19205a, m92652XI2, video, null, 4, null);
                return;
            }
            String m151863d0 = this.f53780c.m151863d0();
            int hashCode = m151863d0.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                        m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_friend_channel_detail);
                    }
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_channel_detail);
                } else {
                    if (m151863d0.equals("SOURCE_FOR_U")) {
                        m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_foru_channel_detail);
                    }
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_channel_detail);
                }
            } else {
                if (m151863d0.equals("SOURCE_FOLLOWING")) {
                    m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_following_channel_detail);
                }
                m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_player_channel_detail);
            }
            m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("seen_channel_uid", channel.m50769l()));
            if (VideoPageView.this.m92650VI() instanceof VideoChannelPagerView) {
                ZaloView m92650VI = VideoPageView.this.m92650VI();
                AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView");
                ((VideoChannelPagerView) m92650VI).m55103lL();
                VideoPageView videoPageView = VideoPageView.this;
                AbstractC19074t.m100205c(m92652XI);
                videoPageView.m55354mM(video, m92652XI, m131408m);
                return;
            }
            String m50769l = channel.m50769l();
            Bundle m92642L3 = VideoPageView.this.m92642L3();
            if (m92642L3 != null) {
                str2 = m92642L3.getString("CHANNEL_ID");
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(m50769l, str2)) {
                VideoPageView.this.finish();
                return;
            }
            VideoPageView.this.m55551QK(ChannelPageView.Companion.m53983a(channel, video.m52911t()));
            VideoPageView videoPageView2 = VideoPageView.this;
            AbstractC19074t.m100205c(m92652XI);
            videoPageView2.m55354mM(video, m92652XI, m131408m);
        }

        @Override // z10.C31179n0.b
        /* renamed from: t */
        public void mo55502t(Video video) {
            Action m52927c;
            com.zing.zalo.shortvideo.p072ui.model.Button m52775b;
            String m52784a;
            AbstractC19074t.m100208f(video, "video");
            VideoAdsInfo m52881b = video.m52881b();
            if (m52881b != null && (m52927c = m52881b.m52927c()) != null && (m52775b = m52927c.m52775b()) != null && (m52784a = m52775b.m52784a()) != null) {
                VideoPageView.this.m55361sM(m52784a);
            }
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_open_ad_normal_cta);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C19205a.m100676P(c19205a, m92652XI, video, null, 4, null);
        }

        @Override // z10.C31179n0.b
        /* renamed from: u */
        public void mo55503u(Channel channel, boolean z11) {
            int i11;
            Map m131407l;
            int i12;
            Map m131407l2;
            AbstractC19074t.m100208f(channel, "channel");
            if (z11) {
                VideoPageView.this.f53609B0.mo53573Wf(channel, true, true, null);
                C19205a c19205a = C19205a.f95429a;
                VideoPageView videoPageView = VideoPageView.this;
                if (AbstractC19074t.m100204b(this.f53780c.m151863d0(), "SOURCE_FOR_U")) {
                    i12 = AbstractC27413h.zch_action_key_foru_suggest_channel_follow;
                } else {
                    i12 = AbstractC27413h.zch_action_key_following_suggest_channel_follow;
                }
                String m92652XI = videoPageView.m92652XI(i12);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m131407l2 = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
                c19205a.m100713L(m92652XI, m131407l2);
                return;
            }
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_title), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_message), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_positive), Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_negative), null, false, false, 112, null);
            m51992b.m51991lL(new h(VideoPageView.this, channel, m51992b, this.f53780c));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, VideoPageView.this.m55340fM(), null, 2, null);
            C19205a c19205a2 = C19205a.f95429a;
            VideoPageView videoPageView2 = VideoPageView.this;
            if (AbstractC19074t.m100204b(this.f53780c.m151863d0(), "SOURCE_FOR_U")) {
                i11 = AbstractC27413h.zch_action_key_foru_suggest_channel_unfollow;
            } else {
                i11 = AbstractC27413h.zch_action_key_following_suggest_channel_unfollow;
            }
            String m92652XI2 = videoPageView2.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("total_video_count", Long.valueOf(channel.m50782t())), AbstractC24866w.m129235a("follow_count", Long.valueOf(channel.m50777p())), AbstractC24866w.m129235a("channel_uid", channel.m50769l()));
            c19205a2.m100713L(m92652XI2, m131407l);
        }

        @Override // z10.C31179n0.b
        /* renamed from: v */
        public void mo55504v() {
            boolean m131390w;
            VideoChannelPagerView videoChannelPagerView;
            m131390w = AbstractC25358n.m131390w(new String[]{"SOURCE_FOLLOWING", "SOURCE_FRIEND", "SOURCE_FOR_U"}, VideoPageView.this.f53609B0.mo53582h());
            if (m131390w) {
                C25026k2 c25026k2 = this.f53779b;
                c25026k2.f120035I.m55783f(new d(c25026k2, VideoPageView.this));
                ZaloView m92650VI = VideoPageView.this.m92650VI();
                if (m92650VI instanceof VideoChannelPagerView) {
                    videoChannelPagerView = (VideoChannelPagerView) m92650VI;
                } else {
                    videoChannelPagerView = null;
                }
                if (videoChannelPagerView != null) {
                    videoChannelPagerView.m55109rL(false);
                }
                this.f53779b.f120036J.setBackgroundResource(AbstractC27406a.zch_surface_background);
                VideoLayout videoLayout = this.f53779b.f120038L;
                AbstractC19074t.m100207e(videoLayout, "lytVideo");
                AbstractC26112n.m134374O(videoLayout);
                VideoSeekBar videoSeekBar = this.f53779b.f120050s;
                AbstractC19074t.m100207e(videoSeekBar, "barSeek");
                AbstractC26112n.m134367H(videoSeekBar);
                VideoPageView.this.f53641h1 = false;
                return;
            }
            VideoPageView.this.finish();
        }

        @Override // z10.C31179n0.b
        /* renamed from: w */
        public void mo55505w(Video video, boolean z11) {
            AbstractC19074t.m100208f(video, "video");
            m55474L(video, z11, false);
        }

        @Override // z10.C31179n0.b
        /* renamed from: x */
        public void mo55506x(Video video) {
            String str;
            Integer m52806f;
            Map m131407l;
            AbstractC19074t.m100208f(video, "video");
            FooterVideoPromote m52900m = video.m52900m();
            if (m52900m != null) {
                str = m52900m.m52807g();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                C26466c.f125664a.m136382d(video.m52900m(), VideoPageView.this.m92676n2(), VideoPageView.this);
            }
            FooterVideoPromote m52900m2 = video.m52900m();
            if (m52900m2 != null && (m52806f = m52900m2.m52806f()) != null) {
                VideoPageView videoPageView = VideoPageView.this;
                int intValue = m52806f.intValue();
                InterfaceC10058f interfaceC10058f = videoPageView.f53609B0;
                m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("open", Integer.valueOf(intValue)), AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                interfaceC10058f.mo53579eE(m131407l);
            }
        }

        @Override // z10.C31179n0.b
        /* renamed from: y */
        public void mo55507y(Video video, boolean z11, boolean z12) {
            int i11;
            Map m131408m;
            String m52929e;
            String m52928d;
            int i12;
            Map m131408m2;
            AbstractC19074t.m100208f(video, "video");
            VideoPageView.this.f53609B0.mo53567Jk(video, z11, video.m52881b());
            if (z11) {
                C9768d c9768d = VideoPageView.this.f53611D0;
                if (c9768d != null) {
                    C31179n0.m151848r0(this.f53780c, c9768d.m52731t(), false, true, 2, null);
                }
                if (AbstractC19074t.m100204b(VideoPageView.this.f53609B0.mo53582h(), "SOURCE_FOR_U")) {
                    ZaloView m92650VI = VideoPageView.this.m92650VI();
                    AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.view.VideoChannelPagerView");
                    ((VideoChannelPagerView) m92650VI).m55106oL();
                }
                boolean mo146329d = C27417l.f129055a.m140380d().mo146329d(video.m52911t());
                VideoPageView videoPageView = VideoPageView.this;
                String m151863d0 = this.f53780c.m151863d0();
                int hashCode = m151863d0.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                            i12 = AbstractC27413h.zch_action_key_friend_like_video;
                        }
                        i12 = AbstractC27413h.zch_action_key_player_like_video;
                    } else {
                        if (m151863d0.equals("SOURCE_FOR_U")) {
                            i12 = AbstractC27413h.zch_action_key_foru_like_video;
                        }
                        i12 = AbstractC27413h.zch_action_key_player_like_video;
                    }
                } else {
                    if (m151863d0.equals("SOURCE_FOLLOWING")) {
                        i12 = AbstractC27413h.zch_action_key_following_like_video;
                    }
                    i12 = AbstractC27413h.zch_action_key_player_like_video;
                }
                String m92652XI = videoPageView.m92652XI(i12);
                m131408m2 = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("like_count", Long.valueOf(video.m52839D())), AbstractC24866w.m129235a("is_double_tap", Integer.valueOf(z12 ? 1 : 0)), AbstractC24866w.m129235a("is_highlight", Integer.valueOf(mo146329d ? 1 : 0)));
                if (video.m52834A0()) {
                    C19205a c19205a = C19205a.f95429a;
                    AbstractC19074t.m100205c(m92652XI);
                    C19205a.m100676P(c19205a, m92652XI, video, null, 4, null);
                } else {
                    C19205a c19205a2 = C19205a.f95429a;
                    AbstractC19074t.m100205c(m92652XI);
                    c19205a2.m100713L(m92652XI, m131408m2);
                }
                this.f53779b.f120038L.m52607A();
                C19205a.f95429a.m100707C();
                return;
            }
            C19205a c19205a3 = C19205a.f95429a;
            VideoPageView videoPageView2 = VideoPageView.this;
            String m151863d02 = this.f53780c.m151863d0();
            int hashCode2 = m151863d02.hashCode();
            if (hashCode2 != -507563187) {
                if (hashCode2 != 596808987) {
                    if (hashCode2 == 1323686722 && m151863d02.equals("SOURCE_FRIEND")) {
                        i11 = AbstractC27413h.zch_action_key_friend_unlike_video;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_unlike_video;
                } else {
                    if (m151863d02.equals("SOURCE_FOR_U")) {
                        i11 = AbstractC27413h.zch_action_key_foru_unlike_video;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_unlike_video;
                }
            } else {
                if (m151863d02.equals("SOURCE_FOLLOWING")) {
                    i11 = AbstractC27413h.zch_action_key_following_unlike_video;
                }
                i11 = AbstractC27413h.zch_action_key_player_unlike_video;
            }
            String m92652XI2 = videoPageView2.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m131408m = AbstractC25363p0.m131408m(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("like_count", Long.valueOf(video.m52839D())));
            VideoAdsInfo m52881b = video.m52881b();
            if (m52881b != null && (m52928d = m52881b.m52928d()) != null) {
                m131408m.put("ad_id", m52928d);
            }
            VideoAdsInfo m52881b2 = video.m52881b();
            if (m52881b2 != null && (m52929e = m52881b2.m52929e()) != null) {
                m131408m.put("ad_src", m52929e);
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            c19205a3.m100713L(m92652XI2, m131408m);
        }

        @Override // z10.C31179n0.b
        /* renamed from: z */
        public void mo55508z(Video video, VideoLabel videoLabel) {
            String str;
            int i11;
            Map m131407l;
            AbstractC19074t.m100208f(video, "video");
            AbstractC19074t.m100208f(videoLabel, "label");
            String m52948g = videoLabel.m52948g();
            Bundle m92642L3 = VideoPageView.this.m92642L3();
            if (m92642L3 != null) {
                str = m92642L3.getString("VIDEO_LOCATION_VALUE");
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(m52948g, str)) {
                VideoPageView.this.finish();
                return;
            }
            C26466c.f125664a.m136381c(videoLabel, VideoPageView.this.m92676n2(), VideoPageView.this);
            C19205a c19205a = C19205a.f95429a;
            VideoPageView videoPageView = VideoPageView.this;
            String mo53582h = videoPageView.f53609B0.mo53582h();
            int hashCode = mo53582h.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && mo53582h.equals("SOURCE_FRIEND")) {
                        i11 = AbstractC27413h.zch_action_key_friend_open_video_label;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_open_video_label;
                } else {
                    if (mo53582h.equals("SOURCE_FOR_U")) {
                        i11 = AbstractC27413h.zch_action_key_foru_open_video_label;
                    }
                    i11 = AbstractC27413h.zch_action_key_player_open_video_label;
                }
            } else {
                if (mo53582h.equals("SOURCE_FOLLOWING")) {
                    i11 = AbstractC27413h.zch_action_key_following_open_video_label;
                }
                i11 = AbstractC27413h.zch_action_key_player_open_video_label;
            }
            String m92652XI = videoPageView.m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            C24860q[] c24860qArr = new C24860q[4];
            c24860qArr[0] = AbstractC24866w.m129235a("video_id", video.m52911t());
            c24860qArr[1] = AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l());
            Object m52947f = videoLabel.m52947f();
            String str2 = "";
            if (m52947f == null) {
                m52947f = "";
            }
            c24860qArr[2] = AbstractC24866w.m129235a("open_type", m52947f);
            String m52944c = videoLabel.m52944c();
            if (m52944c != null) {
                str2 = m52944c;
            }
            c24860qArr[3] = AbstractC24866w.m129235a("src", str2);
            m131407l = AbstractC25363p0.m131407l(c24860qArr);
            c19205a.m100713L(m92652XI, m131407l);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageView$z */
    /* loaded from: classes5.dex */
    public static final class C10617z implements OverScrollableRecyclerView.InterfaceC10831b {

        /* renamed from: b */
        final /* synthetic */ C25026k2 f53824b;

        C10617z(C25026k2 c25026k2) {
            this.f53824b = c25026k2;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10831b
        /* renamed from: a */
        public void mo54127a(float f11, int i11) {
            boolean m131390w;
            m131390w = AbstractC25358n.m131390w(new String[]{"SOURCE_CHANNEL", "SOURCE_NOTI", "SOURCE_LIKED", "SOURCE_BOOKMARK", "SOURCE_BTS_COMMENT", "SOURCE_LOCATION"}, VideoPageView.this.f53609B0.mo53582h());
            if (!m131390w && this.f53824b.f120049r.m56228c(f11, i11)) {
                VideoPageView.this.mo53934d0();
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = VideoPageView.this.m92652XI(AbstractC27413h.zch_action_key_swipe_refresh);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                c19205a.m100713L(m92652XI, null);
            }
        }
    }

    public VideoPageView() {
        super(C10571a.f53648y);
        this.f53609B0 = AbstractC28684a.Companion.m143676M();
        this.f53625R0 = -1;
        this.f53630W0 = C10595m.f53721q;
        this.f53631X0 = C10593l.f53704q;
        this.f53632Y0 = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
        this.f53633Z0 = C10597n.f53735q;
        this.f53634a1 = C10602p0.f53756q;
        this.f53635b1 = C10586h0.f53667q;
        this.f53636c1 = C10582f0.f53663q;
        this.f53637d1 = C10584g0.f53665q;
        this.f53638e1 = C10608s0.f53769q;
        this.f53643j1 = true;
        this.f53644k1 = C10580e0.f53661q;
        this.f53645l1 = new RunnableC10606r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public final void m55291AM(int i11) {
        C31179n0 c31179n0;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 == null || (c31179n0 = this.f53610C0) == null) {
            return;
        }
        Object obj = c31179n0.f143912B.get(i11);
        if (obj != null) {
            VideoAdsInfo m52881b = ((Video) obj).m52881b();
            if (m52881b == null) {
                return;
            }
            c25026k2.f120038L.m52619c0(this.f53638e1);
            C10600o0 c10600o0 = new C10600o0(m52881b, c25026k2, this, c31179n0, i11);
            this.f53638e1 = c10600o0;
            c25026k2.f120038L.m52626w(c10600o0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public final void m55293BM() {
        C25026k2 c25026k2;
        SimpleShadowTextView simpleShadowTextView;
        SimpleShadowTextView simpleShadowTextView2;
        if (m55348jM() && (c25026k2 = (C25026k2) m55556SK()) != null && (simpleShadowTextView = c25026k2.f120027A) != null && simpleShadowTextView.getVisibility() != 0) {
            C25026k2 c25026k22 = (C25026k2) m55556SK();
            if (c25026k22 != null && (simpleShadowTextView2 = c25026k22.f120027A) != null) {
                AbstractC26112n.m134431w0(simpleShadowTextView2);
            }
            if (this.f53626S0 == 1) {
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = m92652XI(AbstractC27413h.zch_action_key_show_refresh_button);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                C19205a.m100675M(c19205a, m92652XI, null, 2, null);
            }
            this.f53626S0 = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public final void m55295CM(int i11, InterfaceC29280a interfaceC29280a, Video video, String str) {
        int i12;
        Map m131407l;
        List m131496e;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null) {
            C31179n0 c31179n0 = this.f53610C0;
            if (c31179n0 != null) {
                m131496e = AbstractC25366r.m131496e("SUGGEST_LIKE");
                c31179n0.m10010r(i11, m131496e);
            }
            interfaceC29280a.mo146349x(video.m52911t());
            interfaceC29280a.mo146345t();
            c25026k2.f120038L.m52619c0(this.f53633Z0);
            c25026k2.f120038L.m52618b0(this.f53635b1);
            C19205a c19205a = C19205a.f95429a;
            int hashCode = str.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && str.equals("SOURCE_FRIEND")) {
                        i12 = AbstractC27413h.zch_action_key_friend_show_like_suggestion;
                    }
                    i12 = AbstractC27413h.zch_action_key_player_show_like_suggestion;
                } else {
                    if (str.equals("SOURCE_FOR_U")) {
                        i12 = AbstractC27413h.zch_action_key_foru_show_like_suggestion;
                    }
                    i12 = AbstractC27413h.zch_action_key_player_show_like_suggestion;
                }
            } else {
                if (str.equals("SOURCE_FOLLOWING")) {
                    i12 = AbstractC27413h.zch_action_key_following_show_like_suggestion;
                }
                i12 = AbstractC27413h.zch_action_key_player_show_like_suggestion;
            }
            String m92652XI = m92652XI(i12);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
            c19205a.m100713L(m92652XI, m131407l);
        }
    }

    /* renamed from: DM */
    private final void m55297DM() {
        C25026k2 c25026k2;
        long j11;
        CoreConfig m51425b;
        Long m51449l;
        CoreConfig m51425b2;
        Integer m51454q;
        Video video;
        AbstractC28684a.h hVar = AbstractC28684a.Companion;
        int i11 = 0;
        if (hVar.m143681o().mo146346u() < 0) {
            C31179n0 c31179n0 = this.f53610C0;
            if (c31179n0 != null) {
                Object obj = c31179n0.f143912B.get(0);
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                video = (Video) obj;
            } else {
                video = null;
            }
            if (video != null) {
                C25026k2 c25026k22 = (C25026k2) m55556SK();
                if (c25026k22 != null) {
                    c25026k22.f120036J.m55221o0();
                    this.f53646m1 = true;
                    this.f53647n1 = true;
                }
                hVar.m143681o().mo146303E(0);
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = m92652XI(AbstractC27413h.zch_action_key_show_guide_swipe_up_bottom);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                C19205a.m100675M(c19205a, m92652XI, null, 2, null);
                return;
            }
            return;
        }
        int mo146346u = hVar.m143681o().mo146346u();
        C27417l c27417l = C27417l.f129055a;
        ChannelConfig m140381e = c27417l.m140381e();
        if (m140381e != null && (m51425b2 = m140381e.m51425b()) != null && (m51454q = m51425b2.m51454q()) != null) {
            i11 = m51454q.intValue();
        }
        if (mo146346u > i11 && !this.f53647n1 && (c25026k2 = (C25026k2) m55556SK()) != null) {
            ChannelConfig m140381e2 = c27417l.m140381e();
            if (m140381e2 != null && (m51425b = m140381e2.m51425b()) != null && (m51449l = m51425b.m51449l()) != null) {
                j11 = m51449l.longValue();
            } else {
                j11 = 0;
            }
            C10604q0 c10604q0 = new C10604q0(j11, this, c25026k2);
            this.f53644k1 = c10604q0;
            c25026k2.f120038L.m52626w(c10604q0);
        }
    }

    /* renamed from: EM */
    private final void m55299EM() {
        C9768d c9768d;
        List m131496e;
        List m131496e2;
        List m131496e3;
        VideoPageLayout videoPageLayout;
        C25026k2 c25026k2;
        C25055t1 c25055t1;
        SimilarVideosLayout root;
        C31179n0 c31179n0 = this.f53610C0;
        if (c31179n0 == null || (c9768d = this.f53611D0) == null) {
            return;
        }
        int mo10003k = c31179n0.mo10003k();
        int m52730s = c9768d.m52730s();
        if (m52730s >= 0 && m52730s < mo10003k) {
            int m52730s2 = c9768d.m52730s();
            Object obj = c31179n0.f143912B.get(m52730s2);
            if (!(obj instanceof Object)) {
                obj = null;
            }
            if (obj instanceof Video) {
                m131496e3 = AbstractC25366r.m131496e("SYNC");
                c31179n0.m10010r(m52730s2, m131496e3);
                C25026k2 c25026k22 = (C25026k2) m55556SK();
                if (c25026k22 != null && (videoPageLayout = c25026k22.f120036J) != null && videoPageLayout.m55220d0() && (c25026k2 = (C25026k2) m55556SK()) != null && (c25055t1 = c25026k2.f120051t) != null && (root = c25055t1.getRoot()) != null) {
                    Object obj2 = c31179n0.f143912B.get(m52730s2);
                    if (obj2 != null) {
                        root.m54972V(((Video) obj2).m52887f());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
                    }
                }
            } else if (obj instanceof LivestreamData) {
                m131496e = AbstractC25366r.m131496e("SYNC");
                c31179n0.m10010r(m52730s2, m131496e);
            }
            if (c31179n0.mo10005m(m52730s2) == 3) {
                m131496e2 = AbstractC25366r.m131496e(new Object());
                c31179n0.m10010r(m52730s2, m131496e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m55301FM() {
        boolean z11;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null) {
            C9768d c9768d = this.f53611D0;
            if (c9768d != null) {
                if (this.f53628U0 == 0 && !this.f53629V0 && !c25026k2.f120036J.m55218b0() && !c25026k2.f120036J.m55220d0()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                c9768d.m52720J(z11);
            }
            if (this.f53628U0 == 0 && !c25026k2.f120036J.m55218b0() && !c25026k2.f120036J.m55220d0()) {
                this.f53636c1.mo12V4();
                this.f53636c1 = C10610t0.f53771q;
                this.f53637d1.mo12V4();
                this.f53637d1 = C10612u0.f53773q;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VL */
    public final void m55320VL(VideoLayout videoLayout) {
        videoLayout.removeCallbacks(this.f53645l1);
        videoLayout.postDelayed(this.f53645l1, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WL */
    public final void m55322WL() {
        VideoChannelPagerView videoChannelPagerView;
        C9768d c9768d;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null) {
            if (c25026k2.getRoot().m55213U() && c25026k2.f120031E.getScrollState() == 0 && (c9768d = this.f53611D0) != null) {
                c9768d.m52725P(0);
            }
            ZaloView m92650VI = m92650VI();
            if (m92650VI instanceof VideoChannelPagerView) {
                videoChannelPagerView = (VideoChannelPagerView) m92650VI;
            } else {
                videoChannelPagerView = null;
            }
            if (videoChannelPagerView != null) {
                videoChannelPagerView.m55105nL();
            }
        }
    }

    /* renamed from: XL */
    private final void m55324XL() {
        C21456b.b m54532XK;
        ZaloView m92650VI = m92650VI();
        String str = null;
        if (m92650VI instanceof MainPageView) {
            C21456b.b m54532XK2 = ((MainPageView) m92650VI).m54532XK();
            if (m54532XK2 == null) {
                return;
            }
            Object m111022a = m54532XK2.m111022a(6);
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                str = m92642L3.getString("SOURCE");
            }
            if (!AbstractC19074t.m100204b(m111022a, str)) {
                return;
            }
            m55401uM(m54532XK2);
            return;
        }
        if (m92650VI instanceof VideoChannelPagerView) {
            ZaloView m92650VI2 = ((VideoChannelPagerView) m92650VI).m92650VI();
            if (!(m92650VI2 instanceof MainPageView) || (m54532XK = ((MainPageView) m92650VI2).m54532XK()) == null) {
                return;
            }
            Object m111022a2 = m54532XK.m111022a(6);
            Bundle m92642L32 = m92642L3();
            if (m92642L32 != null) {
                str = m92642L32.getString("SOURCE");
            }
            if (!AbstractC19074t.m100204b(str, m111022a2)) {
                return;
            }
            m55401uM(m54532XK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YL */
    public static final void m55326YL(VideoPageView videoPageView, Video video) {
        AbstractC19074t.m100208f(videoPageView, "this$0");
        AbstractC19074t.m100208f(video, "$video");
        m55336dM(videoPageView, video, videoPageView.f53615H0, videoPageView.f53616I0, 0, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZL */
    public static final void m55328ZL(OverScrollableRecyclerView overScrollableRecyclerView, final VideoPageView videoPageView) {
        AbstractC19074t.m100208f(overScrollableRecyclerView, "$this_run");
        AbstractC19074t.m100208f(videoPageView, "this$0");
        overScrollableRecyclerView.m9837K1(0);
        overScrollableRecyclerView.post(new Runnable() { // from class: m20.s2
            @Override // java.lang.Runnable
            public final void run() {
                VideoPageView.m55330aM(VideoPageView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aM */
    public static final void m55330aM(VideoPageView videoPageView) {
        AbstractC19074t.m100208f(videoPageView, "this$0");
        videoPageView.f53643j1 = true;
        C9768d c9768d = videoPageView.f53611D0;
        if (c9768d != null) {
            C9768d.m52698B(c9768d, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public static final void m55332bM(VideoPageView videoPageView) {
        AbstractC19074t.m100208f(videoPageView, "this$0");
        C9768d c9768d = videoPageView.f53611D0;
        if (c9768d != null) {
            C9768d.m52698B(c9768d, false, 1, null);
        }
    }

    /* renamed from: cM */
    private final void m55334cM(Video video, String str, String str2, int i11, boolean z11) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Integer num;
        VideoPageLayout videoPageLayout;
        VideoLayout videoLayout;
        VideoLayout videoLayout2;
        Messages m51428e;
        CommentView m55338eM = m55338eM();
        if (m55338eM != null) {
            CommentView.C10180c c10180c = CommentView.Companion;
            CommentSource commentSource = new CommentSource(this.f53609B0.mo53582h(), video);
            ChannelConfig m140381e = C27417l.f129055a.m140381e();
            String str8 = null;
            if (m140381e != null && (m51428e = m140381e.m51428e()) != null) {
                str3 = m51428e.m51478a();
            } else {
                str3 = null;
            }
            if (str3 != null && str3.length() != 0 && AbstractC19074t.m100204b(video.m52897k0(), Boolean.TRUE)) {
                str4 = str3;
            } else {
                str4 = null;
            }
            VideoAdsInfo m52881b = video.m52881b();
            if (m52881b != null) {
                str5 = m52881b.m52928d();
            } else {
                str5 = null;
            }
            VideoAdsInfo m52881b2 = video.m52881b();
            if (m52881b2 != null) {
                str6 = m52881b2.m52929e();
            } else {
                str6 = null;
            }
            C26947a.b bVar = C26947a.Companion;
            C25026k2 c25026k2 = (C25026k2) m55556SK();
            if (c25026k2 != null && (videoLayout2 = c25026k2.f120038L) != null) {
                str7 = videoLayout2.getPlaylistId();
            } else {
                str7 = null;
            }
            C26948b.a m138839b = bVar.m138839b(str7, video);
            if (m138839b != null) {
                num = Integer.valueOf(m138839b.m138882c());
            } else {
                num = null;
            }
            C25026k2 c25026k22 = (C25026k2) m55556SK();
            if (c25026k22 != null && (videoLayout = c25026k22.f120038L) != null) {
                str8 = videoLayout.getPlaylistId();
            }
            m55338eM.mo60305zK(c10180c.m54177a(commentSource, str, str2, i11, str4, str5, str6, num, Integer.valueOf(bVar.m138841f(str8)), z11));
            m55338eM.mo39032PJ();
            C25026k2 c25026k23 = (C25026k2) m55556SK();
            if (c25026k23 != null && (videoPageLayout = c25026k23.f120036J) != null) {
                videoPageLayout.m55222q0();
            }
        }
    }

    /* renamed from: dM */
    static /* synthetic */ void m55336dM(VideoPageView videoPageView, Video video, String str, String str2, int i11, boolean z11, int i12, Object obj) {
        String str3;
        String str4;
        int i13;
        boolean z12;
        if ((i12 & 2) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i12 & 4) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i12 & 8) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        videoPageView.m55334cM(video, str3, str4, i13, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eM */
    public final CommentView m55338eM() {
        ZaloView m92993D0 = m92649TI().m92993D0(CommentView.class);
        if (m92993D0 instanceof CommentView) {
            return (CommentView) m92993D0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fM */
    public final C17487o0 m55340fM() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof VideoChannelPagerView) {
            return ((VideoChannelPagerView) m92650VI).m55099hL();
        }
        if (m92650VI instanceof MainPageView) {
            C17487o0 m92693xK = super.m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            return m92693xK;
        }
        C17487o0 m92649TI = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
        return m92649TI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public final void m55342gM(int i11) {
        C25026k2 c25026k2;
        SimpleShadowTextView simpleShadowTextView;
        SimpleShadowTextView simpleShadowTextView2;
        if (m55348jM() && (c25026k2 = (C25026k2) m55556SK()) != null && (simpleShadowTextView = c25026k2.f120027A) != null && simpleShadowTextView.getVisibility() == 0) {
            this.f53626S0 = i11;
            C25026k2 c25026k22 = (C25026k2) m55556SK();
            if (c25026k22 != null && (simpleShadowTextView2 = c25026k22.f120027A) != null) {
                AbstractC26112n.m134367H(simpleShadowTextView2);
            }
        }
    }

    /* renamed from: hM */
    static /* synthetic */ void m55344hM(VideoPageView videoPageView, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        videoPageView.m55342gM(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final void m55346iM(VideoPageView videoPageView, int i11, VideoAdsData videoAdsData) {
        AbstractC19074t.m100208f(videoPageView, "this$0");
        AbstractC19074t.m100208f(videoAdsData, "$adsData");
        C31179n0 c31179n0 = videoPageView.f53610C0;
        if (c31179n0 != null) {
            c31179n0.m151867h0(i11, videoAdsData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public final boolean m55348jM() {
        return AbstractC19074t.m100204b(this.f53609B0.mo53582h(), "SOURCE_FOLLOWING");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public final void m55350kM(int i11) {
        C31179n0 c31179n0 = this.f53610C0;
        if (c31179n0 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i12 = i11 - 3;
        boolean z11 = false;
        boolean z12 = true;
        if (i12 < 0) {
            i12 = 0;
            z11 = true;
        }
        int i13 = i12 + 10;
        if (i13 > c31179n0.mo10003k()) {
            i13 = c31179n0.mo10003k();
        } else {
            z12 = z11;
        }
        while (i12 < i13) {
            Object obj = c31179n0.f143912B.get(i12);
            if (!(obj instanceof Object)) {
                obj = null;
            }
            if (obj instanceof Video) {
                hashMap.put(((Video) obj).m52911t(), Integer.valueOf(i12));
            } else if (obj instanceof LivestreamData) {
                hashMap2.put(((LivestreamData) obj).m51016f(), Integer.valueOf(i12));
            }
            i12++;
        }
        this.f53609B0.mo53572Up(hashMap, z12);
        this.f53609B0.mo53563Bu(hashMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public final void m55352lM(Video video, String str) {
        int i11;
        int i12;
        String m92652XI;
        String str2;
        Map m131407l;
        Map m131408m;
        VideoLayout videoLayout;
        VideoLayout videoLayout2;
        C19205a c19205a = C19205a.f95429a;
        c19205a.m100708D();
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null && (videoLayout2 = c25026k2.f120038L) != null) {
            i11 = videoLayout2.getDuration();
        } else {
            i11 = 0;
        }
        int i13 = i11 / 1000;
        C25026k2 c25026k22 = (C25026k2) m55556SK();
        if (c25026k22 != null && (videoLayout = c25026k22.f120038L) != null) {
            i12 = videoLayout.getCurrentPosition();
        } else {
            i12 = 0;
        }
        int i14 = i12 / 1000;
        String mo53582h = this.f53609B0.mo53582h();
        int hashCode = mo53582h.hashCode();
        if (hashCode != -507563187) {
            if (hashCode != 596808987) {
                if (hashCode == 1323686722 && mo53582h.equals("SOURCE_FRIEND")) {
                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_friend_share_video);
                }
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_player_share_video);
            } else {
                if (mo53582h.equals("SOURCE_FOR_U")) {
                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_foru_share_video);
                }
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_player_share_video);
            }
        } else {
            if (mo53582h.equals("SOURCE_FOLLOWING")) {
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_following_share_video);
            }
            m92652XI = m92652XI(AbstractC27413h.zch_action_key_player_share_video);
        }
        boolean mo146350y = C27417l.f129055a.m140380d().mo146350y(video.m52911t());
        if (video.m52834A0()) {
            AbstractC19074t.m100205c(m92652XI);
            C24860q[] c24860qArr = new C24860q[8];
            String m52856N = video.m52856N();
            if (m52856N == null) {
                m52856N = "";
            }
            c24860qArr[0] = AbstractC24866w.m129235a("share_url", m52856N);
            c24860qArr[1] = AbstractC24866w.m129235a("duration", Integer.valueOf(i13));
            c24860qArr[2] = AbstractC24866w.m129235a("current_play_time", Integer.valueOf(i14));
            c24860qArr[3] = AbstractC24866w.m129235a("like_count", Long.valueOf(video.m52839D()));
            c24860qArr[4] = AbstractC24866w.m129235a("comment_count", Long.valueOf(video.m52837C()));
            c24860qArr[5] = AbstractC24866w.m129235a("video_id", video.m52911t());
            c24860qArr[6] = AbstractC24866w.m129235a("share_to", str);
            c24860qArr[7] = AbstractC24866w.m129235a("is_highlight", Integer.valueOf(mo146350y ? 1 : 0));
            m131408m = AbstractC25363p0.m131408m(c24860qArr);
            c19205a.m100714N(m92652XI, video, m131408m);
            return;
        }
        AbstractC19074t.m100205c(m92652XI);
        C24860q[] c24860qArr2 = new C24860q[8];
        String m52856N2 = video.m52856N();
        if (m52856N2 == null) {
            str2 = "";
        } else {
            str2 = m52856N2;
        }
        c24860qArr2[0] = AbstractC24866w.m129235a("share_url", str2);
        c24860qArr2[1] = AbstractC24866w.m129235a("duration", Integer.valueOf(i13));
        c24860qArr2[2] = AbstractC24866w.m129235a("current_play_time", Integer.valueOf(i14));
        c24860qArr2[3] = AbstractC24866w.m129235a("like_count", Long.valueOf(video.m52839D()));
        c24860qArr2[4] = AbstractC24866w.m129235a("comment_count", Long.valueOf(video.m52837C()));
        c24860qArr2[5] = AbstractC24866w.m129235a("video_id", video.m52911t());
        c24860qArr2[6] = AbstractC24866w.m129235a("share_to", str);
        c24860qArr2[7] = AbstractC24866w.m129235a("is_highlight", Integer.valueOf(mo146350y ? 1 : 0));
        m131407l = AbstractC25363p0.m131407l(c24860qArr2);
        c19205a.m100713L(m92652XI, m131407l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public final void m55354mM(Video video, String str, Map map) {
        if (video.m52834A0()) {
            C19205a.m100676P(C19205a.f95429a, str, video, null, 4, null);
        } else {
            C19205a.f95429a.m100713L(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public final void m55361sM(String str) {
        InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
        if (interfaceC25792a != null) {
            InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, m92676n2(), str, this, null, null, null, null, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public final void m55363tM(VideoLayout videoLayout) {
        videoLayout.removeCallbacks(this.f53645l1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public final void m55367wM(int i11) {
        C27417l c27417l;
        ChannelConfig m140381e;
        CoreConfig m51425b;
        C31179n0 c31179n0;
        String str;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 == null || (m140381e = (c27417l = C27417l.f129055a).m140381e()) == null || (m51425b = m140381e.m51425b()) == null || (c31179n0 = this.f53610C0) == null) {
            return;
        }
        c25026k2.f120038L.m52619c0(this.f53631X0);
        c25026k2.f120038L.m52619c0(this.f53630W0);
        Object obj = c31179n0.f143912B.get(i11);
        if (obj != null) {
            Channel m52887f = ((Video) obj).m52887f();
            C19051f0 c19051f0 = new C19051f0();
            if (m52887f.m50740O()) {
                String m50769l = m52887f.m50769l();
                Channel m140377a = c27417l.m140377a();
                if (m140377a != null) {
                    str = m140377a.m50769l();
                } else {
                    str = null;
                }
                if (!AbstractC19074t.m100204b(m50769l, str)) {
                    C10588i0 c10588i0 = new C10588i0(m51425b, c25026k2, this, c19051f0, m52887f, c31179n0, i11);
                    this.f53631X0 = c10588i0;
                    c25026k2.f120038L.m52626w(c10588i0);
                }
            }
            if (!m52887f.m50741Q()) {
                C10590j0 c10590j0 = new C10590j0(c19051f0, m51425b, c25026k2, this, m52887f, c31179n0, i11);
                this.f53630W0 = c10590j0;
                c25026k2.f120038L.m52626w(c10590j0);
                return;
            }
            this.f53630W0 = C10592k0.f53703q;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final void m55369xM(int i11) {
        C27417l c27417l;
        ChannelConfig m140381e;
        CoreConfig m51425b;
        C31179n0 c31179n0;
        Integer m51470a;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 == null || (m140381e = (c27417l = C27417l.f129055a).m140381e()) == null || (m51425b = m140381e.m51425b()) == null || (c31179n0 = this.f53610C0) == null) {
            return;
        }
        c25026k2.f120038L.m52619c0(this.f53633Z0);
        c25026k2.f120038L.m52618b0(this.f53635b1);
        Object obj = c31179n0.f143912B.get(i11);
        if (obj != null) {
            Video video = (Video) obj;
            LikeSuggestionConfig m51453p = m51425b.m51453p();
            if (m51453p != null && (m51470a = m51453p.m51470a()) != null) {
                int intValue = m51470a.intValue();
                Long m51471b = m51425b.m51453p().m51471b();
                if (m51471b != null) {
                    long longValue = m51471b.longValue();
                    InterfaceC29280a m140380d = c27417l.m140380d();
                    C19051f0 c19051f0 = new C19051f0();
                    Integer mo146321W = m140380d.mo146321W();
                    boolean mo146329d = m140380d.mo146329d(video.m52911t());
                    C10594l0 c10594l0 = new C10594l0(c19051f0, mo146321W, m140380d, video, intValue, mo146329d, c25026k2, this, longValue, i11, c31179n0);
                    this.f53633Z0 = c10594l0;
                    c25026k2.f120038L.m52626w(c10594l0);
                    C10596m0 c10596m0 = new C10596m0(mo146321W, intValue, mo146329d, video, this, i11, m140380d, c31179n0);
                    this.f53635b1 = c10596m0;
                    c25026k2.f120038L.m52625v(c10596m0);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public final void m55371yM(int i11) {
        C31179n0 c31179n0;
        boolean z11;
        List<VideoLabel> m52916w;
        int i12;
        Map m131407l;
        Map m131407l2;
        int i13;
        Map m131407l3;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 == null || (c31179n0 = this.f53610C0) == null) {
            return;
        }
        Object obj = c31179n0.f143912B.get(i11);
        if (obj != null) {
            Video video = (Video) obj;
            VideoPromote m52873W = video.m52873W();
            int i14 = -507563187;
            if (m52873W != null && m52873W.isValid()) {
                C19205a c19205a = C19205a.f95429a;
                String m151863d0 = c31179n0.m151863d0();
                int hashCode = m151863d0.hashCode();
                if (hashCode != -507563187) {
                    if (hashCode != 596808987) {
                        if (hashCode == 1323686722 && m151863d0.equals("SOURCE_FRIEND")) {
                            i13 = AbstractC27413h.zch_action_key_friend_show_promote_link;
                            String m92652XI = m92652XI(i13);
                            AbstractC19074t.m100207e(m92652XI, "getString(...)");
                            z11 = true;
                            m131407l3 = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                            c19205a.m100713L(m92652XI, m131407l3);
                        }
                        i13 = AbstractC27413h.zch_action_key_player_show_promote_link;
                        String m92652XI2 = m92652XI(i13);
                        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                        z11 = true;
                        m131407l3 = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                        c19205a.m100713L(m92652XI2, m131407l3);
                    } else {
                        if (m151863d0.equals("SOURCE_FOR_U")) {
                            i13 = AbstractC27413h.zch_action_key_foru_show_promote_link;
                            String m92652XI22 = m92652XI(i13);
                            AbstractC19074t.m100207e(m92652XI22, "getString(...)");
                            z11 = true;
                            m131407l3 = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                            c19205a.m100713L(m92652XI22, m131407l3);
                        }
                        i13 = AbstractC27413h.zch_action_key_player_show_promote_link;
                        String m92652XI222 = m92652XI(i13);
                        AbstractC19074t.m100207e(m92652XI222, "getString(...)");
                        z11 = true;
                        m131407l3 = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                        c19205a.m100713L(m92652XI222, m131407l3);
                    }
                } else {
                    if (m151863d0.equals("SOURCE_FOLLOWING")) {
                        i13 = AbstractC27413h.zch_action_key_following_show_promote_link;
                        String m92652XI2222 = m92652XI(i13);
                        AbstractC19074t.m100207e(m92652XI2222, "getString(...)");
                        z11 = true;
                        m131407l3 = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                        c19205a.m100713L(m92652XI2222, m131407l3);
                    }
                    i13 = AbstractC27413h.zch_action_key_player_show_promote_link;
                    String m92652XI22222 = m92652XI(i13);
                    AbstractC19074t.m100207e(m92652XI22222, "getString(...)");
                    z11 = true;
                    m131407l3 = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                    c19205a.m100713L(m92652XI22222, m131407l3);
                }
            } else {
                z11 = true;
            }
            FooterVideoPromote m52900m = video.m52900m();
            if (m52900m != null && m52900m.m52808h() == z11) {
                VideoLayout videoLayout = c25026k2.f120038L;
                AbstractC19074t.m100207e(videoLayout, "lytVideo");
                m55320VL(videoLayout);
                InterfaceC10058f interfaceC10058f = this.f53609B0;
                m131407l2 = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("video_id", video.m52911t()), AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l()));
                interfaceC10058f.mo53593ws(m131407l2);
            } else {
                VideoLayout videoLayout2 = c25026k2.f120038L;
                AbstractC19074t.m100207e(videoLayout2, "lytVideo");
                m55363tM(videoLayout2);
            }
            List m52916w2 = video.m52916w();
            if (m52916w2 != null && !m52916w2.isEmpty() && (m52916w = video.m52916w()) != null) {
                for (VideoLabel videoLabel : m52916w) {
                    C19205a c19205a2 = C19205a.f95429a;
                    String mo53582h = this.f53609B0.mo53582h();
                    int hashCode2 = mo53582h.hashCode();
                    if (hashCode2 != i14) {
                        if (hashCode2 != 596808987) {
                            if (hashCode2 == 1323686722 && mo53582h.equals("SOURCE_FRIEND")) {
                                i12 = AbstractC27413h.zch_action_key_friend_show_video_label;
                            }
                            i12 = AbstractC27413h.zch_action_key_player_show_video_label;
                        } else {
                            if (mo53582h.equals("SOURCE_FOR_U")) {
                                i12 = AbstractC27413h.zch_action_key_foru_show_video_label;
                            }
                            i12 = AbstractC27413h.zch_action_key_player_show_video_label;
                        }
                    } else {
                        if (mo53582h.equals("SOURCE_FOLLOWING")) {
                            i12 = AbstractC27413h.zch_action_key_following_show_video_label;
                        }
                        i12 = AbstractC27413h.zch_action_key_player_show_video_label;
                    }
                    String m92652XI3 = m92652XI(i12);
                    AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                    C24860q[] c24860qArr = new C24860q[4];
                    c24860qArr[0] = AbstractC24866w.m129235a("video_id", video.m52911t());
                    c24860qArr[1] = AbstractC24866w.m129235a("channel_uid", video.m52887f().m50769l());
                    Object m52947f = videoLabel.m52947f();
                    if (m52947f == null) {
                        m52947f = "";
                    }
                    c24860qArr[2] = AbstractC24866w.m129235a("open_type", m52947f);
                    String m52944c = videoLabel.m52944c();
                    if (m52944c == null) {
                        m52944c = "";
                    }
                    c24860qArr[3] = AbstractC24866w.m129235a("src", m52944c);
                    m131407l = AbstractC25363p0.m131407l(c24860qArr);
                    c19205a2.m100713L(m92652XI3, m131407l);
                    i14 = -507563187;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public final void m55373zM(int i11) {
        C27417l c27417l;
        ChannelConfig m140381e;
        CoreConfig m51425b;
        C31179n0 c31179n0;
        Integer m51488c;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 == null || (m140381e = (c27417l = C27417l.f129055a).m140381e()) == null || (m51425b = m140381e.m51425b()) == null || (c31179n0 = this.f53610C0) == null) {
            return;
        }
        c25026k2.f120038L.m52619c0(this.f53634a1);
        Object obj = c31179n0.f143912B.get(i11);
        if (obj != null) {
            Video video = (Video) obj;
            ShareSuggestionConfig m51456s = m51425b.m51456s();
            if (m51456s != null && (m51488c = m51456s.m51488c()) != null) {
                int intValue = m51488c.intValue();
                Long m51489d = m51425b.m51456s().m51489d();
                if (m51489d != null) {
                    long longValue = m51489d.longValue();
                    InterfaceC29280a m140380d = c27417l.m140380d();
                    C10598n0 c10598n0 = new C10598n0(new C19051f0(), m140380d.mo146351z(), m140380d, video, intValue, m140380d.mo146350y(video.m52911t()), c25026k2, this, longValue, m51425b, c31179n0, i11);
                    this.f53634a1 = c10598n0;
                    c25026k2.f120038L.m52626w(c10598n0);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.model.Video");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: Ao */
    public int mo55374Ao() {
        C9768d c9768d = this.f53611D0;
        if (c9768d != null) {
            return c9768d.m52730s();
        }
        return -1;
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: Bg */
    public void mo53932Bg() {
        C25026k2 c25026k2;
        LoadingLayout loadingLayout;
        this.f53627T0 = true;
        if (this.f53640g1) {
            this.f53640g1 = false;
            if (this.f88775p == 5) {
                C31179n0 c31179n0 = this.f53610C0;
                if (c31179n0 != null && !c31179n0.mo151443L() && (c25026k2 = (C25026k2) m55556SK()) != null && (loadingLayout = c25026k2.f120035I) != null) {
                    loadingLayout.m55786j();
                }
                m55344hM(this, 0, 1, null);
                C31179n0 c31179n02 = this.f53610C0;
                if (c31179n02 != null) {
                    c31179n02.m151859Z();
                }
                C31179n0 c31179n03 = this.f53610C0;
                if (c31179n03 != null) {
                    c31179n03.m151860a0();
                }
                this.f53609B0.mo53576aw();
                InterfaceC10058f.a.m53677b(this.f53609B0, null, 1, null);
                InterfaceC10058f.a.m53676a(this.f53609B0, true, null, 2, null);
                this.f53642i1 = true;
            }
        } else if (this.f53641h1 && this.f53626S0 == 1) {
            m55293BM();
        }
        C9768d c9768d = this.f53611D0;
        if (c9768d != null) {
            c9768d.m52726m();
        }
        m55299EM();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        super.mo37111CJ(bundle);
        getLifecycle().mo9335a(this.f53609B0);
        this.f53609B0.mo52965Lb(this);
        m55324XL();
        this.f53609B0.mo52970uo(m92642L3());
        Bundle m92642L3 = m92642L3();
        String str5 = null;
        if (m92642L3 != null) {
            str = m92642L3.getString("COMMENT_ID");
        } else {
            str = null;
        }
        this.f53615H0 = str;
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            str2 = m92642L32.getString("PARENT_CMT_ID");
        } else {
            str2 = null;
        }
        this.f53616I0 = str2;
        Bundle m92642L33 = m92642L3();
        if (m92642L33 != null) {
            str3 = m92642L33.getString("SEARCH_KW");
        } else {
            str3 = null;
        }
        this.f53617J0 = str3;
        Bundle m92642L34 = m92642L3();
        if (m92642L34 != null) {
            str4 = m92642L34.getString("HASHTAG");
        } else {
            str4 = null;
        }
        this.f53618K0 = str4;
        Bundle m92642L35 = m92642L3();
        if (m92642L35 != null) {
            str5 = m92642L35.getString("COLLECTION");
        }
        this.f53619L0 = str5;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.CommentView.InterfaceC10179b
    /* renamed from: E3 */
    public boolean mo54170E3(InterfaceC18494a interfaceC18494a) {
        VideoPageLayout videoPageLayout;
        AbstractC19074t.m100208f(interfaceC18494a, "pendingAction");
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 == null || (videoPageLayout = c25026k2.f120036J) == null || !videoPageLayout.m55217a0(interfaceC18494a)) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: Ea */
    public void mo55375Ea(String str, boolean z11, Throwable th2) {
        int i11;
        C9768d c9768d;
        List m131496e;
        int i12;
        AbstractC19074t.m100208f(str, "videoId");
        if (th2 == null) {
            C25097t c25097t = C25097t.f120556a;
            Context context = getContext();
            if (z11) {
                i12 = AbstractC27413h.zch_page_video_save_success;
            } else {
                i12 = AbstractC27413h.zch_page_video_unsave_success;
            }
            c25097t.m130154o(context, m92652XI(i12));
            return;
        }
        C25097t c25097t2 = C25097t.f120556a;
        Context context2 = getContext();
        if (z11) {
            i11 = AbstractC27413h.zch_page_video_save_fail;
        } else {
            i11 = AbstractC27413h.zch_page_video_unsave_fail;
        }
        c25097t2.m130154o(context2, m92652XI(i11));
        try {
            C31179n0 c31179n0 = this.f53610C0;
            if (c31179n0 == null || (c9768d = this.f53611D0) == null) {
                return;
            }
            Integer valueOf = Integer.valueOf(c9768d.m52730s());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj2 = c31179n0.f143912B.get(intValue);
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && AbstractC19074t.m100204b(str, video.m52911t())) {
                    m131496e = AbstractC25366r.m131496e("BOOKMARK");
                    c31179n0.m10010r(intValue, m131496e);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: Fd */
    public void mo55376Fd(Video video, boolean z11, Throwable th2) {
        int i11;
        AbstractC19074t.m100208f(video, "video");
        if (th2 == null) {
            C25097t c25097t = C25097t.f120556a;
            Context context = getContext();
            if (z11) {
                i11 = AbstractC27413h.zch_page_video_pin_success;
            } else {
                i11 = AbstractC27413h.zch_page_video_unpin_success;
            }
            c25097t.m130154o(context, m92652XI(i11));
            ChannelReceiver.Companion.m53695b(video.m52887f().m50769l());
            return;
        }
        if (th2 instanceof LimitationReachedException) {
            C25097t.f120556a.m130154o(getContext(), ((LimitationReachedException) th2).getMessage());
        } else {
            C25097t.f120556a.m130155r(getContext(), th2);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        m55340fM().m93008I1(this);
        C18168e.Companion.m96538b().m96512E(this.f53620M0);
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: J8 */
    public void mo55377J8(String str, boolean z11, Throwable th2) {
        C9768d c9768d;
        List m131496e;
        VideoPageLayout root;
        AbstractC19074t.m100208f(str, "videoId");
        if (th2 != null) {
            C25097t.f120556a.m130155r(getContext(), th2);
            return;
        }
        if (z11) {
            C25097t.f120556a.m130154o(getContext(), m92652XI(AbstractC27413h.zch_bts_comment_lock_comment));
        } else {
            C25097t.f120556a.m130154o(getContext(), m92652XI(AbstractC27413h.zch_bts_comment_unlock_comment));
        }
        try {
            C31179n0 c31179n0 = this.f53610C0;
            if (c31179n0 == null || (c9768d = this.f53611D0) == null) {
                return;
            }
            Integer valueOf = Integer.valueOf(c9768d.m52730s());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj2 = c31179n0.f143912B.get(intValue);
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && AbstractC19074t.m100204b(str, video.m52911t())) {
                    video.m52841E0(z11);
                    m131496e = AbstractC25366r.m131496e("COMMENT");
                    c31179n0.m10010r(intValue, m131496e);
                    C25026k2 c25026k2 = (C25026k2) m55556SK();
                    if (c25026k2 != null && (root = c25026k2.getRoot()) != null) {
                        root.m55226z0(video, this.f53609B0.mo53582h());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        VideoLayout videoLayout;
        OverScrollableRecyclerView overScrollableRecyclerView;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null && (overScrollableRecyclerView = c25026k2.f120031E) != null) {
            overScrollableRecyclerView.m9841N();
        }
        C25026k2 c25026k22 = (C25026k2) m55556SK();
        if (c25026k22 != null && (videoLayout = c25026k22.f120038L) != null) {
            videoLayout.removeCallbacks(this.f53645l1);
        }
        ChannelReceiver channelReceiver = this.f53612E0;
        if (channelReceiver != null) {
            channelReceiver.mo53687g();
        }
        CommentReceiver commentReceiver = this.f53613F0;
        if (commentReceiver != null) {
            commentReceiver.mo53687g();
        }
        LivestreamReceiver livestreamReceiver = this.f53614G0;
        if (livestreamReceiver != null) {
            livestreamReceiver.mo53687g();
        }
        C9768d c9768d = this.f53611D0;
        if (c9768d != null) {
            c9768d.m52714C();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: Ja */
    public void mo55378Ja(Map map) {
        RecyclerView.AbstractC1888o abstractC1888o;
        OverScrollableRecyclerView.LinearLayoutManager linearLayoutManager;
        String str;
        List m131505m;
        OverScrollableRecyclerView overScrollableRecyclerView;
        AbstractC19074t.m100208f(map, "map");
        C31179n0 c31179n0 = this.f53610C0;
        if (c31179n0 == null) {
            return;
        }
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null && (overScrollableRecyclerView = c25026k2.f120031E) != null) {
            abstractC1888o = overScrollableRecyclerView.getLayoutManager();
        } else {
            abstractC1888o = null;
        }
        if (abstractC1888o instanceof OverScrollableRecyclerView.LinearLayoutManager) {
            linearLayoutManager = (OverScrollableRecyclerView.LinearLayoutManager) abstractC1888o;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            PersonalizeStream personalizeStream = (PersonalizeStream) entry.getValue();
            if (intValue < c31179n0.mo10003k()) {
                Object obj = c31179n0.f143912B.get(intValue);
                if (!(obj instanceof LivestreamData)) {
                    obj = null;
                }
                LivestreamData livestreamData = (LivestreamData) obj;
                if (livestreamData != null) {
                    str = livestreamData.m51016f();
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str, personalizeStream.m51115b())) {
                    if (linearLayoutManager.mo9732P(intValue) != null) {
                        m131505m = AbstractC25368s.m131505m("PERSONALIZE", personalizeStream);
                        c31179n0.m10010r(intValue, m131505m);
                    } else {
                        livestreamData.m50989D(personalizeStream);
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: Jf */
    public void mo55379Jf(Video video, Throwable th2) {
        AbstractC19074t.m100208f(video, "video");
        if (th2 == null) {
            C31179n0 c31179n0 = this.f53610C0;
            if (c31179n0 != null) {
                c31179n0.m151875s0(video.m52871V());
            }
            C9768d c9768d = this.f53611D0;
            if (c9768d != null) {
                c9768d.m52713A(true);
            }
            ChannelReceiver.Companion.m53698e(video.m52887f().m50769l(), video.m52911t());
            return;
        }
        if (th2 instanceof AdsDeletionDeniedException) {
            C25097t.f120556a.m130154o(getContext(), ((AdsDeletionDeniedException) th2).getMessage());
        } else {
            C25097t.f120556a.m130155r(getContext(), th2);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.CommentView.InterfaceC10179b
    /* renamed from: Jn */
    public void mo54171Jn() {
        Video m52729r;
        C9768d c9768d = this.f53611D0;
        if (c9768d != null && (m52729r = c9768d.m52729r()) != null) {
            m55551QK(ChannelPageView.C10134b.m53981c(ChannelPageView.Companion, m52729r.m52887f(), null, 2, null));
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: MD */
    public void mo55380MD(Section section, List list, List list2) {
        LoadingLayout loadingLayout;
        LoadingLayout loadingLayout2;
        List list3;
        boolean m131390w;
        LoadingLayout loadingLayout3;
        LoadingLayout loadingLayout4;
        VideoLayout videoLayout;
        VideoLayout videoLayout2;
        LoadingLayout loadingLayout5;
        OverScrollableRecyclerView overScrollableRecyclerView;
        final OverScrollableRecyclerView overScrollableRecyclerView2;
        List list4;
        VideoChannelPagerView videoChannelPagerView;
        VideoSeekBar videoSeekBar;
        LoadingLayout loadingLayout6;
        VideoPageLayout videoPageLayout;
        C25026k2 c25026k2;
        VideoPageLayout videoPageLayout2;
        VideoPageLayout videoPageLayout3;
        C25026k2 c25026k22;
        VideoPageLayout videoPageLayout4;
        OverScrollableRefreshBar overScrollableRefreshBar;
        OverScrollableRefreshBar overScrollableRefreshBar2;
        AbstractC19074t.m100208f(section, "section");
        MainPageLayout.InterfaceC10301a interfaceC10301a = null;
        if (this.f53642i1) {
            this.f53642i1 = false;
            C25026k2 c25026k23 = (C25026k2) m55556SK();
            if (c25026k23 != null && (overScrollableRefreshBar = c25026k23.f120049r) != null && overScrollableRefreshBar.m56227b()) {
                C25026k2 c25026k24 = (C25026k2) m55556SK();
                if (c25026k24 != null && (overScrollableRefreshBar2 = c25026k24.f120049r) != null) {
                    overScrollableRefreshBar2.m56226a();
                }
            } else {
                C25026k2 c25026k25 = (C25026k2) m55556SK();
                if (c25026k25 != null && (loadingLayout5 = c25026k25.f120035I) != null) {
                    loadingLayout5.m55781c();
                }
            }
            C25026k2 c25026k26 = (C25026k2) m55556SK();
            if (c25026k26 != null && (videoPageLayout3 = c25026k26.f120036J) != null && videoPageLayout3.m55218b0() && (c25026k22 = (C25026k2) m55556SK()) != null && (videoPageLayout4 = c25026k22.f120036J) != null) {
                videoPageLayout4.m55214V(true);
            }
            C25026k2 c25026k27 = (C25026k2) m55556SK();
            if (c25026k27 != null && (videoPageLayout = c25026k27.f120036J) != null && videoPageLayout.m55220d0() && (c25026k2 = (C25026k2) m55556SK()) != null && (videoPageLayout2 = c25026k2.f120036J) != null) {
                videoPageLayout2.m55216Y(true);
            }
            C25026k2 c25026k28 = (C25026k2) m55556SK();
            if (c25026k28 != null && (overScrollableRecyclerView = c25026k28.f120031E) != null && overScrollableRecyclerView.getScrollState() == 0) {
                C31179n0 c31179n0 = this.f53610C0;
                if (c31179n0 != null) {
                    c31179n0.m151853D0(section);
                    C31179n0.m151845X(c31179n0, null, list, list2, 1, null);
                    c31179n0.m10008p();
                    this.f53643j1 = false;
                    if (section.m51168m().isEmpty() && ((list4 = list) == null || list4.isEmpty())) {
                        C25026k2 c25026k29 = (C25026k2) m55556SK();
                        if (c25026k29 != null && (loadingLayout6 = c25026k29.f120035I) != null) {
                            loadingLayout6.m55783f(new C10587i());
                        }
                        ZaloView m92650VI = m92650VI();
                        if (m92650VI instanceof VideoChannelPagerView) {
                            videoChannelPagerView = (VideoChannelPagerView) m92650VI;
                        } else {
                            videoChannelPagerView = null;
                        }
                        if (videoChannelPagerView != null) {
                            videoChannelPagerView.m55109rL(false);
                        }
                        C25026k2 c25026k210 = (C25026k2) m55556SK();
                        if (c25026k210 != null && (videoSeekBar = c25026k210.f120050s) != null) {
                            AbstractC19074t.m100205c(videoSeekBar);
                            AbstractC26112n.m134367H(videoSeekBar);
                        }
                    }
                }
                C25026k2 c25026k211 = (C25026k2) m55556SK();
                if (c25026k211 != null && (overScrollableRecyclerView2 = c25026k211.f120031E) != null) {
                    overScrollableRecyclerView2.post(new Runnable() { // from class: m20.p2
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoPageView.m55328ZL(OverScrollableRecyclerView.this, this);
                        }
                    });
                }
            }
            String mo53582h = this.f53609B0.mo53582h();
            int hashCode = mo53582h.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && mo53582h.equals("SOURCE_FRIEND")) {
                        InterfaceC1801w m92650VI2 = m92650VI();
                        if (m92650VI2 instanceof MainPageLayout.InterfaceC10301a) {
                            interfaceC10301a = (MainPageLayout.InterfaceC10301a) m92650VI2;
                        }
                        if (interfaceC10301a != null) {
                            interfaceC10301a.mo54522al(C18705c.d.f93974s.m98645c());
                        }
                    }
                } else if (mo53582h.equals("SOURCE_FOR_U")) {
                    InterfaceC1801w m92650VI3 = m92650VI();
                    if (m92650VI3 instanceof MainPageLayout.InterfaceC10301a) {
                        interfaceC10301a = (MainPageLayout.InterfaceC10301a) m92650VI3;
                    }
                    if (interfaceC10301a != null) {
                        interfaceC10301a.mo54522al(C18705c.d.f93973r.m98645c());
                    }
                }
            } else if (mo53582h.equals("SOURCE_FOLLOWING")) {
                InterfaceC1801w m92650VI4 = m92650VI();
                if (m92650VI4 instanceof MainPageLayout.InterfaceC10301a) {
                    interfaceC10301a = (MainPageLayout.InterfaceC10301a) m92650VI4;
                }
                if (interfaceC10301a != null) {
                    interfaceC10301a.mo54522al(C18705c.d.f93972q.m98645c());
                }
            }
        } else {
            C31179n0 c31179n02 = this.f53610C0;
            if (c31179n02 != null && c31179n02.mo151443L()) {
                C31179n0 c31179n03 = this.f53610C0;
                if (c31179n03 != null) {
                    int mo10003k = c31179n03.mo10003k();
                    c31179n03.m151858W(section, list, list2);
                    int mo10003k2 = c31179n03.mo10003k() - mo10003k;
                    if (mo10003k2 > 0) {
                        int m151866g0 = c31179n03.m151866g0();
                        if (m151866g0 >= 0) {
                            C31179n0.m151849y0(c31179n03, m151866g0, null, 2, null);
                            c31179n03.m10009q(m151866g0);
                            int i11 = mo10003k2 - 1;
                            if (i11 > 0) {
                                c31179n03.m10015w(mo10003k, i11);
                            }
                            AbstractC19444a.m101695c(new Runnable() { // from class: m20.q2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    VideoPageView.m55332bM(VideoPageView.this);
                                }
                            });
                        } else {
                            c31179n03.m10015w(mo10003k, mo10003k2);
                        }
                    }
                    if (AbstractC19074t.m100204b(this.f53609B0.mo53582h(), "SOURCE_FOR_U") && mo10003k == 1 && mo10003k2 > 0) {
                        m55297DM();
                    }
                }
            } else {
                C31179n0 c31179n04 = this.f53610C0;
                if (c31179n04 != null) {
                    c31179n04.m151853D0(section);
                    C31179n0.m151845X(c31179n04, null, list, list2, 1, null);
                    c31179n04.m10008p();
                }
                if (section.m51168m().isEmpty() && ((list3 = list) == null || list3.isEmpty())) {
                    m131390w = AbstractC25358n.m131390w(new String[]{"SOURCE_FOLLOWING", "SOURCE_FRIEND", "SOURCE_FOR_U"}, this.f53609B0.mo53582h());
                    if (m131390w) {
                        C25026k2 c25026k212 = (C25026k2) m55556SK();
                        if (c25026k212 != null && (loadingLayout4 = c25026k212.f120035I) != null) {
                            loadingLayout4.m55783f(new C10589j());
                        }
                    } else {
                        C25026k2 c25026k213 = (C25026k2) m55556SK();
                        if (c25026k213 != null && (loadingLayout3 = c25026k213.f120035I) != null) {
                            LoadingLayout.m55779i(loadingLayout3, 0, 1, null);
                        }
                    }
                } else {
                    if (AbstractC19074t.m100204b(this.f53609B0.mo53582h(), "SOURCE_FOR_U")) {
                        m55297DM();
                    }
                    C25026k2 c25026k214 = (C25026k2) m55556SK();
                    if (c25026k214 != null && (loadingLayout2 = c25026k214.f120035I) != null) {
                        loadingLayout2.m55781c();
                    }
                    C25026k2 c25026k215 = (C25026k2) m55556SK();
                    if (c25026k215 != null && (loadingLayout = c25026k215.f120035I) != null) {
                        loadingLayout.m55780b();
                    }
                }
            }
            this.f53641h1 = true;
        }
        C31179n0 c31179n05 = this.f53610C0;
        if (c31179n05 != null) {
            c31179n05.m151445N();
        }
        C31179n0 c31179n06 = this.f53610C0;
        if (c31179n06 != null && c31179n06.mo151443L()) {
            C25026k2 c25026k216 = (C25026k2) m55556SK();
            if (c25026k216 != null && (videoLayout2 = c25026k216.f120038L) != null) {
                AbstractC26112n.m134431w0(videoLayout2);
                return;
            }
            return;
        }
        C25026k2 c25026k217 = (C25026k2) m55556SK();
        if (c25026k217 != null && (videoLayout = c25026k217.f120038L) != null) {
            AbstractC26112n.m134374O(videoLayout);
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(VideoPageView.class, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        Video video;
        super.mo39032PJ();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (video = (Video) m92642L3.getParcelable("RESERVED_VIDEO")) != null) {
            this.f53609B0.mo53586oC(video.m52911t(), new C10601p(), new C10603q(video));
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.CommentView.InterfaceC10179b
    /* renamed from: Pt */
    public void mo54172Pt() {
        VideoPageLayout videoPageLayout;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null && (videoPageLayout = c25026k2.f120036J) != null) {
            videoPageLayout.m55211O();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: Rg */
    public void mo55381Rg(Section section, Throwable th2) {
        ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_unavailable_video_title), Integer.valueOf(AbstractC27413h.zch_popup_unavailable_video_message), Integer.valueOf(AbstractC27413h.zch_popup_unavailable_video_positive), Integer.valueOf(AbstractC27413h.zch_popup_unavailable_video_negative), null, false, false, 112, null);
        m51992b.m51991lL(new C10575c(section, th2, this));
        m51992b.m51990kL(new C10577d());
        m51992b.m51978ZK(true);
        BasePopupView.m51974dL(m51992b, m55340fM(), null, 2, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: SH */
    public void mo55382SH(Channel channel, boolean z11, boolean z12, Object obj) {
        int i11;
        String m92652XI;
        int i12;
        Map m131401f;
        int i13;
        int i14;
        C9768d c9768d;
        List m131496e;
        VideoPageLayout videoPageLayout;
        C25026k2 c25026k2;
        C25055t1 c25055t1;
        SimilarVideosLayout root;
        List m131496e2;
        AbstractC19074t.m100208f(channel, "channel");
        AbstractC19074t.m100208f(obj, "result");
        boolean z13 = obj instanceof PersonalizeChannel;
        Throwable th2 = null;
        Object obj2 = null;
        if (z13) {
            if (((PersonalizeChannel) obj).m51104c()) {
                C25097t.f120556a.m130154o(getContext(), m92653YI(AbstractC27413h.zch_page_video_follow_success, channel.m50775o()));
            } else {
                C25097t.f120556a.m130154o(getContext(), m92653YI(AbstractC27413h.zch_page_channel_unfollow_success, channel.m50775o()));
            }
            if (!z12) {
                try {
                    C31179n0 c31179n0 = this.f53610C0;
                    if (c31179n0 == null || (c9768d = this.f53611D0) == null) {
                        return;
                    }
                    Integer valueOf = Integer.valueOf(c9768d.m52730s());
                    if (valueOf.intValue() < 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        Object obj3 = c31179n0.f143912B.get(intValue);
                        if (obj3 instanceof Object) {
                            obj2 = obj3;
                        }
                        if (obj2 instanceof Video) {
                            if (AbstractC19074t.m100204b(channel.m50769l(), ((Video) obj2).m52887f().m50769l())) {
                                m131496e2 = AbstractC25366r.m131496e("FOLLOW");
                                c31179n0.m10010r(intValue, m131496e2);
                            }
                        } else if ((obj2 instanceof LivestreamData) && AbstractC19074t.m100204b(((LivestreamData) obj2).m51010b().m50769l(), channel.m50769l())) {
                            m131496e = AbstractC25366r.m131496e("FOLLOW");
                            c31179n0.m10010r(intValue, m131496e);
                        }
                        C25026k2 c25026k22 = (C25026k2) m55556SK();
                        if (c25026k22 != null && (videoPageLayout = c25026k22.f120036J) != null && videoPageLayout.m55220d0() && (c25026k2 = (C25026k2) m55556SK()) != null && (c25055t1 = c25026k2.f120051t) != null && (root = c25055t1.getRoot()) != null) {
                            root.m54972V(channel);
                        }
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            if (obj instanceof Throwable) {
                th2 = (Throwable) obj;
            }
            if (th2 != null) {
                if (th2 instanceof LimitationReachedException) {
                    C25097t.f120556a.m130154o(getContext(), ((LimitationReachedException) th2).getMessage());
                } else {
                    C25097t.f120556a.m130155r(getContext(), th2);
                }
            }
        }
        C19205a c19205a = C19205a.f95429a;
        if (z12) {
            if (z11) {
                if (AbstractC19074t.m100204b(this.f53609B0.mo53582h(), "SOURCE_FOR_U")) {
                    i14 = AbstractC27413h.zch_action_key_foru_suggest_channel_follow_result;
                } else {
                    i14 = AbstractC27413h.zch_action_key_following_suggest_channel_follow_result;
                }
                m92652XI = m92652XI(i14);
            } else {
                if (AbstractC19074t.m100204b(this.f53609B0.mo53582h(), "SOURCE_FOR_U")) {
                    i13 = AbstractC27413h.zch_action_key_foru_suggest_channel_unfollow_result;
                } else {
                    i13 = AbstractC27413h.zch_action_key_following_suggest_channel_unfollow_result;
                }
                m92652XI = m92652XI(i13);
            }
        } else if (z11) {
            String mo53582h = this.f53609B0.mo53582h();
            int hashCode = mo53582h.hashCode();
            if (hashCode != -507563187) {
                if (hashCode != 596808987) {
                    if (hashCode == 1323686722 && mo53582h.equals("SOURCE_FRIEND")) {
                        i12 = AbstractC27413h.zch_action_key_friend_follow_channel_result;
                        m92652XI = m92652XI(i12);
                    }
                    i12 = AbstractC27413h.zch_action_key_player_follow_channel_result;
                    m92652XI = m92652XI(i12);
                } else {
                    if (mo53582h.equals("SOURCE_FOR_U")) {
                        i12 = AbstractC27413h.zch_action_key_foru_follow_channel_result;
                        m92652XI = m92652XI(i12);
                    }
                    i12 = AbstractC27413h.zch_action_key_player_follow_channel_result;
                    m92652XI = m92652XI(i12);
                }
            } else {
                if (mo53582h.equals("SOURCE_FOLLOWING")) {
                    i12 = AbstractC27413h.zch_action_key_following_follow_channel_result;
                    m92652XI = m92652XI(i12);
                }
                i12 = AbstractC27413h.zch_action_key_player_follow_channel_result;
                m92652XI = m92652XI(i12);
            }
        } else {
            String mo53582h2 = this.f53609B0.mo53582h();
            int hashCode2 = mo53582h2.hashCode();
            if (hashCode2 != -507563187) {
                if (hashCode2 != 596808987) {
                    if (hashCode2 == 1323686722 && mo53582h2.equals("SOURCE_FRIEND")) {
                        i11 = AbstractC27413h.zch_action_key_friend_unfollow_channel_result;
                        m92652XI = m92652XI(i11);
                    }
                    i11 = AbstractC27413h.zch_action_key_player_unfollow_channel_result;
                    m92652XI = m92652XI(i11);
                } else {
                    if (mo53582h2.equals("SOURCE_FOR_U")) {
                        i11 = AbstractC27413h.zch_action_key_foru_unfollow_channel_result;
                        m92652XI = m92652XI(i11);
                    }
                    i11 = AbstractC27413h.zch_action_key_player_unfollow_channel_result;
                    m92652XI = m92652XI(i11);
                }
            } else {
                if (mo53582h2.equals("SOURCE_FOLLOWING")) {
                    i11 = AbstractC27413h.zch_action_key_following_unfollow_channel_result;
                    m92652XI = m92652XI(i11);
                }
                i11 = AbstractC27413h.zch_action_key_player_unfollow_channel_result;
                m92652XI = m92652XI(i11);
            }
        }
        AbstractC19074t.m100205c(m92652XI);
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("status", Integer.valueOf(z13 ? 1 : 0)));
        c19205a.m100713L(m92652XI, m131401f);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        C25026k2 c25026k2;
        LoadingLayout loadingLayout;
        super.mo37584UJ();
        if (this.f53639f1) {
            this.f53639f1 = false;
            C9768d c9768d = this.f53611D0;
            if (c9768d != null) {
                c9768d.m52726m();
            }
        }
        if (this.f53641h1 && !this.f53640g1) {
            if (this.f53627T0 && this.f53626S0 == 1) {
                m55293BM();
            }
        } else {
            m55344hM(this, 0, 1, null);
            C31179n0 c31179n0 = this.f53610C0;
            if (c31179n0 != null && !c31179n0.mo151443L() && (c25026k2 = (C25026k2) m55556SK()) != null && (loadingLayout = c25026k2.f120035I) != null) {
                loadingLayout.m55786j();
            }
            if (this.f53640g1) {
                this.f53640g1 = false;
                this.f53642i1 = true;
            }
            this.f53609B0.mo53576aw();
            InterfaceC10058f.a.m53677b(this.f53609B0, null, 1, null);
            InterfaceC10058f.a.m53676a(this.f53609B0, true, null, 2, null);
        }
        m55299EM();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        C9768d c9768d = this.f53611D0;
        if (c9768d != null && c9768d.m52732v()) {
            C9768d c9768d2 = this.f53611D0;
            if (c9768d2 != null) {
                c9768d2.m52727p();
            }
            this.f53639f1 = true;
        }
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null) {
            if (c25026k2.f120049r.m56227b()) {
                c25026k2.f120049r.m56226a();
            }
            C31179n0 c31179n0 = this.f53610C0;
            if (c31179n0 != null) {
                c31179n0.m151445N();
            }
            c25026k2.f120035I.m55781c();
            this.f53642i1 = false;
        }
        m55322WL();
        super.mo37712VJ();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: W0 */
    public void mo55383W0(boolean z11) {
        C9768d c9768d;
        if (!z11 && (c9768d = this.f53611D0) != null) {
            c9768d.m52733x();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: Wh */
    public int mo55384Wh(int i11, final VideoAdsData videoAdsData) {
        AbstractC19074t.m100208f(videoAdsData, "adsData");
        final int i12 = i11 + 1;
        AbstractC19444a.m101697e(new Runnable() { // from class: m20.t2
            @Override // java.lang.Runnable
            public final void run() {
                VideoPageView.m55346iM(VideoPageView.this, i12, videoAdsData);
            }
        });
        return i12;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: X2 */
    public void mo55385X2(String str, boolean z11, Throwable th2) {
        C9768d c9768d;
        List m131496e;
        AbstractC19074t.m100208f(str, "videoId");
        AbstractC19074t.m100208f(th2, "throwable");
        C25097t.f120556a.m130155r(getContext(), th2);
        try {
            C31179n0 c31179n0 = this.f53610C0;
            if (c31179n0 == null || (c9768d = this.f53611D0) == null) {
                return;
            }
            Integer valueOf = Integer.valueOf(c9768d.m52730s());
            Object obj = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object obj2 = c31179n0.f143912B.get(intValue);
                if (obj2 instanceof Video) {
                    obj = obj2;
                }
                Video video = (Video) obj;
                if (video != null && AbstractC19074t.m100204b(str, video.m52911t())) {
                    m131496e = AbstractC25366r.m131496e("LIKE");
                    c31179n0.m10010r(intValue, m131496e);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        boolean m131390w;
        boolean m131390w2;
        Video mo53578dv;
        Section section;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null) {
            CommentReceiver commentReceiver = new CommentReceiver(null, null, new C10613v(), null, null, null, 59, null);
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            commentReceiver.mo53685d(m92689tK);
            this.f53613F0 = commentReceiver;
            OverScrollableRecyclerView overScrollableRecyclerView = c25026k2.f120031E;
            AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
            VideoLayout videoLayout = c25026k2.f120038L;
            AbstractC19074t.m100207e(videoLayout, "lytVideo");
            C3227q c3227q = new C3227q();
            c3227q.m16365t(new C10614w());
            c3227q.mo10397b(c25026k2.f120031E);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C9768d c9768d = new C9768d(overScrollableRecyclerView, videoLayout, c3227q);
            c9768d.m52718H(new C10615x(c25026k2));
            c9768d.m52724N(this.f53617J0);
            c9768d.m52721K(this.f53618K0);
            c9768d.m52719I(this.f53619L0);
            this.f53611D0 = c9768d;
            C31179n0 c31179n0 = new C31179n0(this.f53609B0.mo53582h(), null, 2, 0 == true ? 1 : 0);
            c31179n0.m151852C0(new C10616y(c25026k2, c31179n0));
            this.f53610C0 = c31179n0;
            C31179n0 c31179n02 = this.f53622O0;
            if (c31179n02 != null) {
                AbstractC19074t.m100205c(c31179n02);
                c31179n0.m151851B0(c31179n02);
            }
            OverScrollableRecyclerView overScrollableRecyclerView2 = c25026k2.f120031E;
            overScrollableRecyclerView2.setAdapter(this.f53610C0);
            final Context context = overScrollableRecyclerView2.getContext();
            overScrollableRecyclerView2.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(context) { // from class: com.zing.zalo.shortvideo.ui.view.VideoPageView$onViewCreated$1$6$1

                /* renamed from: J */
                private final int f53754J;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context, 0, false, false, 14, null);
                    AbstractC19074t.m100205c(context);
                    this.f53754J = Resources.getSystem().getDisplayMetrics().heightPixels;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* renamed from: K1 */
                public void mo9731K1(RecyclerView.C1899z c1899z, int[] iArr) {
                    AbstractC19074t.m100208f(c1899z, "state");
                    AbstractC19074t.m100208f(iArr, "extraLayoutSpace");
                    int i11 = this.f53754J;
                    iArr[0] = i11;
                    iArr[1] = i11;
                }
            });
            C18168e m96538b = C18168e.Companion.m96538b();
            C31179n0 c31179n03 = this.f53610C0;
            AbstractC19074t.m100205c(c31179n03);
            String m96518y = m96538b.m96518y(c31179n03);
            this.f53620M0 = m96518y;
            c25026k2.f120038L.setPlaylistId(m96518y);
            this.f53609B0.mo53562Ab(this.f53620M0);
            AbstractC19074t.m100205c(overScrollableRecyclerView2);
            OverScrollableRecyclerView.m56143g2(overScrollableRecyclerView2, new C10617z(c25026k2), 0.0f, 2, null);
            OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView2, new C10572a0(), 0.0f, 2, null);
            overScrollableRecyclerView2.m56145b2(new C10574b0(overScrollableRecyclerView2, c25026k2));
            overScrollableRecyclerView2.m9826E(new C10576c0());
            boolean z11 = true;
            overScrollableRecyclerView2.setHasFixedSize(true);
            m131390w = AbstractC25358n.m131390w(new String[]{"SOURCE_HASHTAG", "SOURCE_SIMILAR", "SOURCE_COLLECTION", "SOURCE_CHANNEL", "SOURCE_LIKED", "SOURCE_SEARCH_ALL", "SOURCE_SEARCH_VIDEO", "SOURCE_BOOKMARK", "SOURCE_BTS_COMMENT", "SOURCE_LOCATION"}, this.f53609B0.mo53582h());
            if (m131390w && (section = f53607o1) != null) {
                C31179n0 c31179n04 = this.f53610C0;
                if (c31179n04 != null) {
                    c31179n04.m151853D0(section);
                    C31179n0.m151845X(c31179n04, null, null, null, 7, null);
                    c31179n04.m10008p();
                    c25026k2.f120031E.m9837K1(f53608p1);
                    VideoLayout videoLayout2 = c25026k2.f120038L;
                    AbstractC19074t.m100207e(videoLayout2, "lytVideo");
                    AbstractC26112n.m134431w0(videoLayout2);
                }
                f53607o1 = null;
                this.f53641h1 = true;
            }
            if (this.f53622O0 != null) {
                int i11 = this.f53625R0;
                if (i11 != -1) {
                    c25026k2.f120031E.m9837K1(i11);
                }
                VideoLayout videoLayout3 = c25026k2.f120038L;
                AbstractC19074t.m100207e(videoLayout3, "lytVideo");
                AbstractC26112n.m134431w0(videoLayout3);
                this.f53641h1 = true;
            }
            if (AbstractC19074t.m100204b(this.f53609B0.mo53582h(), "SOURCE_FOLLOWING")) {
                ChannelReceiver channelReceiver = new ChannelReceiver(null, null, null, null, new C10578d0(c25026k2), 15, null);
                Context m92689tK2 = m92689tK();
                AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                channelReceiver.mo53685d(m92689tK2);
                this.f53612E0 = channelReceiver;
            }
            m131390w2 = AbstractC25358n.m131390w(new String[]{"SOURCE_FOLLOWING", "SOURCE_FRIEND", "SOURCE_FOR_U", "SOURCE_BTS_COMMENT"}, this.f53609B0.mo53582h());
            if (m131390w2 && (mo53578dv = this.f53609B0.mo53578dv()) != null && mo53578dv.m52903n0()) {
                mo55392hp(mo53578dv);
            }
            LivestreamReceiver livestreamReceiver = new LivestreamReceiver(new C10605r());
            Context m92689tK3 = m92689tK();
            AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
            livestreamReceiver.mo53685d(m92689tK3);
            this.f53614G0 = livestreamReceiver;
            c25026k2.getRoot().setCallback(new C10607s());
            if (!(m92650VI() instanceof MainPageView) && !(m92650VI() instanceof VideoChannelPagerView)) {
                ImageView imageView = c25026k2.f120053v;
                AbstractC19074t.m100207e(imageView, "btnBack");
                AbstractC26112n.m134407k0(imageView, new C10609t());
                ImageView imageView2 = c25026k2.f120057z;
                AbstractC19074t.m100205c(imageView2);
                AbstractC26112n.m134407k0(imageView2, new C10611u());
                view.post(new Runnable() { // from class: m20.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoPageView.this.mo53932Bg();
                    }
                });
            } else {
                m55340fM().m93092y(this);
                LinearLayout linearLayout = c25026k2.f120034H;
                AbstractC19074t.m100207e(linearLayout, "lytHeader");
                AbstractC26112n.m134367H(linearLayout);
            }
            int i12 = 0;
            if (bundle == null) {
                m92649TI().m92998F(CommentView.class, false).m93138e(c25026k2.f120046T.getId()).m93136a();
            }
            SimpleShadowTextView simpleShadowTextView = c25026k2.f120027A;
            Context m92689tK4 = m92689tK();
            AbstractC19074t.m100207e(m92689tK4, "requireContext(...)");
            simpleShadowTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(C27280g.m139659b(m92689tK4, AbstractC23322a.zds_ic_retry_solid_16, AbstractC27406a.zch_control_active), (Drawable) null, (Drawable) null, (Drawable) null);
            SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120027A;
            AbstractC19074t.m100207e(simpleShadowTextView2, "btnRefresh");
            if (this.f53626S0 != 1) {
                z11 = false;
            }
            if (!z11) {
                i12 = 8;
            }
            simpleShadowTextView2.setVisibility(i12);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: Zd */
    public void mo55386Zd(Map map) {
        RecyclerView.AbstractC1888o abstractC1888o;
        OverScrollableRecyclerView.LinearLayoutManager linearLayoutManager;
        String str;
        List m131505m;
        OverScrollableRecyclerView overScrollableRecyclerView;
        AbstractC19074t.m100208f(map, "map");
        C31179n0 c31179n0 = this.f53610C0;
        if (c31179n0 == null) {
            return;
        }
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null && (overScrollableRecyclerView = c25026k2.f120031E) != null) {
            abstractC1888o = overScrollableRecyclerView.getLayoutManager();
        } else {
            abstractC1888o = null;
        }
        if (abstractC1888o instanceof OverScrollableRecyclerView.LinearLayoutManager) {
            linearLayoutManager = (OverScrollableRecyclerView.LinearLayoutManager) abstractC1888o;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            PersonalizeVideo personalizeVideo = (PersonalizeVideo) entry.getValue();
            if (intValue < c31179n0.mo10003k()) {
                Object obj = c31179n0.f143912B.get(intValue);
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video = (Video) obj;
                if (video != null) {
                    str = video.m52911t();
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str, personalizeVideo.m52813b())) {
                    if (linearLayoutManager.mo9732P(intValue) != null) {
                        m131505m = AbstractC25368s.m131505m("PERSONALIZE", personalizeVideo);
                        c31179n0.m10010r(intValue, m131505m);
                    } else {
                        video.m52838C0(personalizeVideo);
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: b */
    public void mo55387b(boolean z11) {
        Integer num;
        Integer num2;
        VideoPageLayout videoPageLayout;
        C25026k2 c25026k2;
        C25055t1 c25055t1;
        SimilarVideosLayout root;
        C25026k2 c25026k22;
        LoadingLayout loadingLayout;
        if (!z11) {
            C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_error_no_connection);
            return;
        }
        if (!this.f53641h1) {
            C31179n0 c31179n0 = this.f53610C0;
            if (c31179n0 != null && !c31179n0.mo151443L() && (c25026k22 = (C25026k2) m55556SK()) != null && (loadingLayout = c25026k22.f120035I) != null) {
                loadingLayout.m55786j();
            }
            C31179n0 c31179n02 = this.f53610C0;
            if (c31179n02 != null && !c31179n02.m151865f0()) {
                this.f53609B0.mo53576aw();
            }
            m55344hM(this, 0, 1, null);
            InterfaceC10058f.a.m53677b(this.f53609B0, null, 1, null);
        } else {
            C31179n0 c31179n03 = this.f53610C0;
            if (c31179n03 != null) {
                num = Integer.valueOf(c31179n03.m151866g0());
            } else {
                num = null;
            }
            C9768d c9768d = this.f53611D0;
            if (c9768d != null) {
                num2 = Integer.valueOf(c9768d.m52730s());
            } else {
                num2 = null;
            }
            if (AbstractC19074t.m100204b(num, num2)) {
                m55344hM(this, 0, 1, null);
                InterfaceC10058f.a.m53677b(this.f53609B0, null, 1, null);
            }
        }
        C25026k2 c25026k23 = (C25026k2) m55556SK();
        if (c25026k23 != null && (videoPageLayout = c25026k23.f120036J) != null && videoPageLayout.m55220d0() && (c25026k2 = (C25026k2) m55556SK()) != null && (c25055t1 = c25026k2.f120051t) != null && (root = c25055t1.getRoot()) != null) {
            root.m54969M(z11);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: d */
    public void mo55388d(Throwable th2) {
        LoadingLayout loadingLayout;
        OverScrollableRefreshBar overScrollableRefreshBar;
        OverScrollableRefreshBar overScrollableRefreshBar2;
        LoadingLayout loadingLayout2;
        LoadingLayout loadingLayout3;
        LoadingLayout loadingLayout4;
        LoadingLayout loadingLayout5;
        AbstractC19074t.m100208f(th2, "throwable");
        C31179n0 c31179n0 = this.f53610C0;
        if (c31179n0 != null && !c31179n0.mo151443L()) {
            if (th2 instanceof NetworkException) {
                C25026k2 c25026k2 = (C25026k2) m55556SK();
                if (c25026k2 != null && (loadingLayout5 = c25026k2.f120035I) != null) {
                    loadingLayout5.m55784g(new C10579e());
                }
            } else if (th2 instanceof NoFriendDataException) {
                C25026k2 c25026k22 = (C25026k2) m55556SK();
                if (c25026k22 != null && (loadingLayout4 = c25026k22.f120035I) != null) {
                    LoadingLayout.m55778e(loadingLayout4, null, Integer.valueOf(AbstractC27413h.zch_error_title_no_friend_data), Integer.valueOf(AbstractC27413h.zch_error_msg_no_friend_data), Integer.valueOf(AbstractC27413h.zch_error_btn_for_u), new C10581f(), null, 33, null);
                }
            } else if (th2 instanceof NoNewFriendVideoException) {
                C25026k2 c25026k23 = (C25026k2) m55556SK();
                if (c25026k23 != null && (loadingLayout3 = c25026k23.f120035I) != null) {
                    LoadingLayout.m55778e(loadingLayout3, null, Integer.valueOf(AbstractC27413h.zch_error_title_no_new_friend_video), Integer.valueOf(AbstractC27413h.zch_error_msg_no_new_friend_video), Integer.valueOf(AbstractC27413h.zch_error_btn_for_u), new C10583g(), null, 33, null);
                }
            } else {
                C25026k2 c25026k24 = (C25026k2) m55556SK();
                if (c25026k24 != null && (loadingLayout2 = c25026k24.f120035I) != null) {
                    loadingLayout2.m55783f(new C10585h());
                }
            }
        } else {
            if (this.f53642i1) {
                this.f53642i1 = false;
                C25097t.f120556a.m130155r(getContext(), th2);
            }
            if (this.f53626S0 == 2) {
                m55293BM();
            }
        }
        C31179n0 c31179n02 = this.f53610C0;
        if (c31179n02 != null) {
            c31179n02.m151445N();
        }
        C25026k2 c25026k25 = (C25026k2) m55556SK();
        if (c25026k25 != null && (overScrollableRefreshBar = c25026k25.f120049r) != null && overScrollableRefreshBar.m56227b()) {
            C25026k2 c25026k26 = (C25026k2) m55556SK();
            if (c25026k26 != null && (overScrollableRefreshBar2 = c25026k26.f120049r) != null) {
                overScrollableRefreshBar2.m56226a();
                return;
            }
            return;
        }
        C25026k2 c25026k27 = (C25026k2) m55556SK();
        if (c25026k27 != null && (loadingLayout = c25026k27.f120035I) != null) {
            loadingLayout.m55781c();
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: d0 */
    public void mo53934d0() {
        OverScrollableRefreshBar overScrollableRefreshBar;
        C25026k2 c25026k2;
        OverScrollableRefreshBar overScrollableRefreshBar2;
        OverScrollableRefreshBar overScrollableRefreshBar3;
        C25026k2 c25026k22;
        LoadingLayout loadingLayout;
        m55342gM(2);
        if (this.f53641h1) {
            if (!this.f53642i1) {
                C25026k2 c25026k23 = (C25026k2) m55556SK();
                if (c25026k23 != null && (overScrollableRefreshBar3 = c25026k23.f120049r) != null && !overScrollableRefreshBar3.m56227b() && (c25026k22 = (C25026k2) m55556SK()) != null && (loadingLayout = c25026k22.f120035I) != null) {
                    loadingLayout.m55786j();
                }
                this.f53609B0.mo53577d0();
                C31179n0 c31179n0 = this.f53610C0;
                if (c31179n0 != null) {
                    c31179n0.m151859Z();
                }
                C31179n0 c31179n02 = this.f53610C0;
                if (c31179n02 != null) {
                    c31179n02.m151860a0();
                }
                this.f53609B0.mo53576aw();
                InterfaceC10058f.a.m53677b(this.f53609B0, null, 1, null);
                InterfaceC10058f.a.m53676a(this.f53609B0, true, null, 2, null);
                this.f53642i1 = true;
                this.f53640g1 = false;
            }
        } else {
            C25026k2 c25026k24 = (C25026k2) m55556SK();
            if (c25026k24 != null && (overScrollableRefreshBar = c25026k24.f120049r) != null && overScrollableRefreshBar.m56227b() && (c25026k2 = (C25026k2) m55556SK()) != null && (overScrollableRefreshBar2 = c25026k2.f120049r) != null) {
                overScrollableRefreshBar2.m56226a();
            }
        }
        m55322WL();
    }

    @Override // e20.InterfaceC18187a
    public void deactivate() {
        this.f53627T0 = false;
        m55322WL();
        C9768d c9768d = this.f53611D0;
        if (c9768d != null) {
            c9768d.m52727p();
        }
        this.f53639f1 = false;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.CommentView.InterfaceC10179b
    /* renamed from: fh */
    public void mo54173fh() {
        VideoLayout videoLayout;
        this.f53636c1 = new C10599o();
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null && (videoLayout = c25026k2.f120038L) != null) {
            videoLayout.m52628y();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: fi */
    public void mo55389fi(List list) {
        C9768d c9768d;
        AbstractC19074t.m100208f(list, "boxes");
        C31179n0 c31179n0 = this.f53610C0;
        if (c31179n0 != null) {
            c31179n0.m151856U(list);
            if (c31179n0.mo151443L() && !this.f53642i1 && (c9768d = this.f53611D0) != null) {
                int m52730s = c9768d.m52730s();
                boolean z11 = this.f53643j1;
                if (!z11 || m52730s < 0) {
                    m52730s = 0;
                }
                c31179n0.m151864e0(m52730s, null, null, !z11);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    public void finish() {
        VideoChannelPagerView videoChannelPagerView;
        ZaloView m92650VI = m92650VI();
        C24848g0 c24848g0 = null;
        if (m92650VI instanceof VideoChannelPagerView) {
            videoChannelPagerView = (VideoChannelPagerView) m92650VI;
        } else {
            videoChannelPagerView = null;
        }
        if (videoChannelPagerView != null) {
            videoChannelPagerView.finish();
            c24848g0 = C24848g0.f119245a;
        }
        if (c24848g0 == null) {
            super.finish();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: fo */
    public void mo55390fo(Section section, Throwable th2) {
        C25055t1 c25055t1;
        SimilarVideosLayout root;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null && (c25055t1 = c25026k2.f120051t) != null && (root = c25055t1.getRoot()) != null) {
            if (section != null) {
                root.m54964D(section);
            } else {
                AbstractC19074t.m100205c(th2);
                root.m54968L(th2);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: gD */
    public C26947a.c mo55391gD() {
        return this.f53623P0;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.C17487o0.l
    /* renamed from: gp */
    public void mo35571gp(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        super.mo35571gp(zaloView);
        if ((zaloView instanceof BaseBottomSheetView) || (zaloView instanceof BasePopupView)) {
            this.f53628U0--;
            m55301FM();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zing.zalo.shortvideo.p072ui.view.CommentView.InterfaceC10179b
    /* renamed from: gr */
    public void mo54174gr(boolean z11) {
        VideoPageLayout root;
        List m131496e;
        C9768d c9768d = this.f53611D0;
        if (c9768d != null) {
            Integer valueOf = Integer.valueOf(c9768d.m52731t());
            Video video = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                C31179n0 c31179n0 = this.f53610C0;
                if (c31179n0 != null) {
                    Object obj = c31179n0.f143912B.get(intValue);
                    if (obj instanceof Video) {
                        video = obj;
                    }
                    video = video;
                }
                if (video != null) {
                    video.m52841E0(z11);
                    C31179n0 c31179n02 = this.f53610C0;
                    if (c31179n02 != null) {
                        m131496e = AbstractC25366r.m131496e("COMMENT");
                        c31179n02.m10010r(intValue, m131496e);
                    }
                    C25026k2 c25026k2 = (C25026k2) m55556SK();
                    if (c25026k2 != null && (root = c25026k2.getRoot()) != null) {
                        root.m55226z0(video, this.f53609B0.mo53582h());
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: hp */
    public void mo55392hp(final Video video) {
        VideoLayout videoLayout;
        LoadingLayout loadingLayout;
        LoadingLayout loadingLayout2;
        ArrayList m131500h;
        VideoPageLayout videoPageLayout;
        AbstractC19074t.m100208f(video, "video");
        C31179n0 c31179n0 = this.f53610C0;
        if (c31179n0 != null && c31179n0.mo151443L()) {
            C31179n0 c31179n02 = this.f53610C0;
            if (c31179n02 != null) {
                Object obj = c31179n02.f143912B.get(0);
                String str = null;
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video2 = (Video) obj;
                if (video2 != null) {
                    str = video2.m52911t();
                }
                if (AbstractC19074t.m100204b(str, video.m52911t())) {
                    c31179n02.m151854E0(video);
                    C25026k2 c25026k2 = (C25026k2) m55556SK();
                    if (c25026k2 != null && (videoPageLayout = c25026k2.f120036J) != null) {
                        videoPageLayout.m55210N(0, video, this.f53609B0.mo53582h());
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C31179n0 c31179n03 = this.f53610C0;
        if (c31179n03 != null) {
            m131500h = AbstractC25368s.m131500h(video);
            c31179n03.m151853D0(new Section(m131500h, 0L, (LoadMoreInfo) null, 6, (AbstractC19060k) null));
            C31179n0.m151845X(c31179n03, null, null, null, 7, null);
            c31179n03.m10008p();
        }
        C25026k2 c25026k22 = (C25026k2) m55556SK();
        if (c25026k22 != null && (loadingLayout2 = c25026k22.f120035I) != null) {
            loadingLayout2.m55781c();
        }
        C25026k2 c25026k23 = (C25026k2) m55556SK();
        if (c25026k23 != null && (loadingLayout = c25026k23.f120035I) != null) {
            loadingLayout.m55780b();
        }
        C25026k2 c25026k24 = (C25026k2) m55556SK();
        if (c25026k24 != null && (videoLayout = c25026k24.f120038L) != null) {
            AbstractC26112n.m134431w0(videoLayout);
        }
        if (this.f53615H0 != null) {
            AbstractC19444a.m101695c(new Runnable() { // from class: m20.r2
                @Override // java.lang.Runnable
                public final void run() {
                    VideoPageView.m55326YL(VideoPageView.this, video);
                }
            });
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: ir */
    public void mo55393ir(List list, LoadMoreInfo loadMoreInfo) {
        C9768d c9768d;
        AbstractC19074t.m100208f(list, "ads");
        C31179n0 c31179n0 = this.f53610C0;
        if (c31179n0 != null) {
            c31179n0.m151855T(list, loadMoreInfo);
            if (c31179n0.mo151443L() && !this.f53642i1 && (c9768d = this.f53611D0) != null) {
                int m52730s = c9768d.m52730s();
                if (!this.f53643j1 || m52730s < 0) {
                    m52730s = 0;
                }
                c31179n0.m151857V(m52730s, true);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: jd */
    public C25093p.c mo55394jd() {
        return this.f53624Q0;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView.InterfaceC10622a
    /* renamed from: lz */
    public boolean mo53979lz() {
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 == null) {
            return false;
        }
        ImageView imageView = c25026k2.f120057z;
        AbstractC19074t.m100207e(imageView, "btnFloat");
        if (!AbstractC26112n.m134380U(imageView) || c25026k2.f120034H.getTranslationX() < 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: nM */
    public final void m55395nM() {
        boolean m131390w;
        C9768d c9768d;
        String str;
        Video m52729r;
        m131390w = AbstractC25358n.m131390w(new String[]{"SOURCE_HASHTAG", "SOURCE_SIMILAR", "SOURCE_COLLECTION", "SOURCE_CHANNEL", "SOURCE_LIKED", "SOURCE_SEARCH_ALL", "SOURCE_SEARCH_VIDEO", "SOURCE_BOOKMARK", "SOURCE_LOCATION"}, this.f53609B0.mo53582h());
        if (m131390w && (c9768d = this.f53611D0) != null) {
            int m52730s = c9768d.m52730s();
            C9768d c9768d2 = this.f53611D0;
            if (c9768d2 == null || (m52729r = c9768d2.m52729r()) == null || (str = m52729r.m52911t()) == null) {
                str = "";
            }
            String mo53589qn = this.f53609B0.mo53589qn();
            String mo53570Sn = this.f53609B0.mo53570Sn();
            if (m52730s >= 0 && mo53589qn.length() > 0) {
                LoadMoreVideoReceiver.Companion.m53734b(mo53589qn, m52730s, mo53570Sn, str);
            }
        }
    }

    @Override // e20.InterfaceC18189c
    /* renamed from: ni */
    public void mo54480ni() {
        m55322WL();
        this.f53621N0 = true;
        C9768d c9768d = this.f53611D0;
        if (c9768d != null) {
            C9768d.m52699G(c9768d, false, 1, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.C17487o0.l
    /* renamed from: o7 */
    public void mo35578o7(ZaloView zaloView) {
        VideoPageLayout videoPageLayout;
        CommentView m55338eM;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        super.mo35578o7(zaloView);
        if ((zaloView instanceof BaseBottomSheetView) || (zaloView instanceof BasePopupView)) {
            this.f53628U0++;
            m55301FM();
            C25026k2 c25026k2 = (C25026k2) m55556SK();
            if (c25026k2 != null && (videoPageLayout = c25026k2.f120036J) != null && videoPageLayout.m55218b0() && (m55338eM = m55338eM()) != null) {
                m55338eM.m54163gL();
            }
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        AbstractC19074t.m100208f(bVar, "extras");
        m55398qM(m92642L3(), bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: oM */
    public final void m55396oM(int i11) {
        VideoAdsInfo m52881b;
        C9768d c9768d = this.f53611D0;
        if (c9768d == null || c9768d.m52730s() == -1) {
            return;
        }
        C31179n0 c31179n0 = this.f53610C0;
        Video video = null;
        if (c31179n0 != null) {
            Object obj = c31179n0.f143912B.get(c9768d.m52730s());
            if (obj instanceof Video) {
                video = obj;
            }
            video = video;
        }
        if (video != null && (m52881b = video.m52881b()) != null && m52881b.m52930f() == 2) {
            if (i11 == 1) {
                c9768d.m52733x();
            } else {
                c9768d.m52734y();
            }
        }
        c9768d.m52722L(i11);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        LinearLayout linearLayout;
        ImageView imageView;
        VideoPageLayout videoPageLayout;
        VideoPageLayout videoPageLayout2;
        VideoPageLayout videoPageLayout3;
        C25026k2 c25026k2;
        VideoPageLayout videoPageLayout4;
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 != 4) {
            return false;
        }
        C25026k2 c25026k22 = (C25026k2) m55556SK();
        if (c25026k22 != null && (videoPageLayout3 = c25026k22.f120036J) != null && videoPageLayout3.m55218b0()) {
            CommentView m55338eM = m55338eM();
            if ((m55338eM == null || !m55338eM.onKeyUp(i11, keyEvent)) && (c25026k2 = (C25026k2) m55556SK()) != null && (videoPageLayout4 = c25026k2.f120036J) != null) {
                VideoPageLayout.m55161W(videoPageLayout4, false, 1, null);
            }
            return true;
        }
        C25026k2 c25026k23 = (C25026k2) m55556SK();
        if (c25026k23 != null && (videoPageLayout = c25026k23.f120036J) != null && videoPageLayout.m55220d0()) {
            C25026k2 c25026k24 = (C25026k2) m55556SK();
            if (c25026k24 != null && (videoPageLayout2 = c25026k24.f120036J) != null) {
                VideoPageLayout.m55162Z(videoPageLayout2, false, 1, null);
            }
            return true;
        }
        C25026k2 c25026k25 = (C25026k2) m55556SK();
        if (c25026k25 != null && (linearLayout = c25026k25.f120034H) != null && AbstractC26112n.m134380U(linearLayout)) {
            C25026k2 c25026k26 = (C25026k2) m55556SK();
            if (c25026k26 != null && (imageView = c25026k26.f120053v) != null) {
                imageView.callOnClick();
            }
            return true;
        }
        m55395nM();
        return false;
    }

    /* renamed from: pM */
    public final void m55397pM(Bundle bundle, C21456b.b bVar) {
        Video video;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C31179n0 c31179n0;
        Integer num;
        int i11;
        C26947a.c cVar;
        Integer num2;
        int i12;
        AbstractC19074t.m100208f(bVar, "extras");
        if (bundle != null) {
            Object m111022a = bVar.m111022a(1);
            C25093p.c cVar2 = null;
            if (m111022a instanceof Video) {
                video = (Video) m111022a;
            } else {
                video = null;
            }
            AbstractC26102d.m134326a(bundle, "RESERVED_VIDEO", video);
            Object m111022a2 = bVar.m111022a(4);
            if (m111022a2 instanceof String) {
                str = (String) m111022a2;
            } else {
                str = null;
            }
            AbstractC26102d.m134326a(bundle, "CHANNEL_ID", str);
            Object m111022a3 = bVar.m111022a(5);
            if (m111022a3 instanceof String) {
                str2 = (String) m111022a3;
            } else {
                str2 = null;
            }
            AbstractC26102d.m134326a(bundle, "SOURCE_UUID", str2);
            Object m111022a4 = bVar.m111022a(6);
            if (m111022a4 instanceof String) {
                str3 = (String) m111022a4;
            } else {
                str3 = null;
            }
            AbstractC26102d.m134326a(bundle, "HASHTAG", str3);
            Object m111022a5 = bVar.m111022a(7);
            if (m111022a5 instanceof String) {
                str4 = (String) m111022a5;
            } else {
                str4 = null;
            }
            AbstractC26102d.m134326a(bundle, "COLLECTION", str4);
            Object m111022a6 = bVar.m111022a(8);
            if (m111022a6 instanceof String) {
                str5 = (String) m111022a6;
            } else {
                str5 = null;
            }
            AbstractC26102d.m134326a(bundle, "SEARCH_KW", str5);
            Object m111022a7 = bVar.m111022a(9);
            if (m111022a7 instanceof String) {
                str6 = (String) m111022a7;
            } else {
                str6 = null;
            }
            AbstractC26102d.m134326a(bundle, "VIDEO_LOCATION_VALUE", str6);
            Object m111022a8 = bVar.m111022a(10);
            if (m111022a8 instanceof String) {
                str7 = (String) m111022a8;
            } else {
                str7 = null;
            }
            AbstractC26102d.m134326a(bundle, "SIMILAR_ID", str7);
            Object m111022a9 = bVar.m111022a(11);
            if (m111022a9 instanceof C31179n0) {
                c31179n0 = (C31179n0) m111022a9;
            } else {
                c31179n0 = null;
            }
            this.f53622O0 = c31179n0;
            Object m111022a10 = bVar.m111022a(12);
            if (m111022a10 instanceof Integer) {
                num = (Integer) m111022a10;
            } else {
                num = null;
            }
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = -1;
            }
            this.f53625R0 = i11;
            Object m111022a11 = bVar.m111022a(13);
            if (m111022a11 instanceof C26947a.c) {
                cVar = (C26947a.c) m111022a11;
            } else {
                cVar = null;
            }
            this.f53623P0 = cVar;
            Object m111022a12 = bVar.m111022a(14);
            if (m111022a12 instanceof Integer) {
                num2 = (Integer) m111022a12;
            } else {
                num2 = null;
            }
            if (num2 != null) {
                i12 = num2.intValue();
            } else {
                i12 = 0;
            }
            this.f53626S0 = i12;
            Object m111022a13 = bVar.m111022a(15);
            if (m111022a13 instanceof C25093p.c) {
                cVar2 = (C25093p.c) m111022a13;
            }
            this.f53624Q0 = cVar2;
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        AbstractC19074t.m100208f(bVar, "extras");
        m55397pM(m92642L3(), bVar);
    }

    /* renamed from: qM */
    public final void m55398qM(Bundle bundle, C21456b.b bVar) {
        Object m130100I;
        Object m138832N;
        Video video;
        Section m151862c0;
        List m51168m;
        Object obj;
        AbstractC19074t.m100208f(bVar, "extras");
        if (bundle != null) {
            Object string = bundle.getString("SOURCE");
            if (string != null) {
                AbstractC19074t.m100205c(string);
                bVar.m111023b(0, string);
            }
            Video video2 = (Video) bundle.getParcelable("RESERVED_VIDEO");
            Integer num = null;
            if (video2 != null) {
                C31179n0 c31179n0 = this.f53610C0;
                if (c31179n0 != null && (m151862c0 = c31179n0.m151862c0()) != null && (m51168m = m151862c0.m51168m()) != null) {
                    Iterator it = m51168m.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC19074t.m100204b(((Video) obj).m52911t(), video2.m52911t())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    video = (Video) obj;
                } else {
                    video = null;
                }
                if (video == null) {
                    AbstractC19074t.m100205c(video2);
                } else {
                    video2 = video;
                }
                bVar.m111023b(1, video2);
            }
            Object string2 = bundle.getString("COMMENT_ID");
            if (string2 != null) {
                AbstractC19074t.m100205c(string2);
                bVar.m111023b(2, string2);
            }
            Object string3 = bundle.getString("PARENT_CMT_ID");
            if (string3 != null) {
                AbstractC19074t.m100205c(string3);
                bVar.m111023b(3, string3);
            }
            Object string4 = bundle.getString("CHANNEL_ID");
            if (string4 != null) {
                AbstractC19074t.m100205c(string4);
                bVar.m111023b(4, string4);
            }
            Object string5 = bundle.getString("SOURCE_UUID");
            if (string5 != null) {
                AbstractC19074t.m100205c(string5);
                bVar.m111023b(5, string5);
            }
            Object string6 = bundle.getString("HASHTAG");
            if (string6 != null) {
                AbstractC19074t.m100205c(string6);
                bVar.m111023b(6, string6);
            }
            Object string7 = bundle.getString("COLLECTION");
            if (string7 != null) {
                AbstractC19074t.m100205c(string7);
                bVar.m111023b(7, string7);
            }
            Object string8 = bundle.getString("SEARCH_KW");
            if (string8 != null) {
                AbstractC19074t.m100205c(string8);
                bVar.m111023b(8, string8);
            }
            Object string9 = bundle.getString("VIDEO_LOCATION_VALUE");
            if (string9 != null) {
                AbstractC19074t.m100205c(string9);
                bVar.m111023b(9, string9);
            }
            Object string10 = bundle.getString("SIMILAR_ID");
            if (string10 != null) {
                AbstractC19074t.m100205c(string10);
                bVar.m111023b(10, string10);
            }
            Object obj2 = this.f53610C0;
            if (obj2 != null) {
                bVar.m111023b(11, obj2);
            }
            C9768d c9768d = this.f53611D0;
            if (c9768d != null) {
                bVar.m111023b(12, Integer.valueOf(c9768d.m52731t()));
            }
            C26947a mo53571UD = this.f53609B0.mo53571UD();
            if (mo53571UD != null && (m138832N = mo53571UD.m138832N()) != null) {
                bVar.m111023b(13, m138832N);
            }
            Integer valueOf = Integer.valueOf(this.f53626S0);
            if (valueOf.intValue() != 0) {
                num = valueOf;
            }
            if (num != null) {
                bVar.m111023b(14, Integer.valueOf(num.intValue()));
            }
            C25093p mo53574Zn = this.f53609B0.mo53574Zn();
            if (mo53574Zn != null && (m130100I = mo53574Zn.m130100I()) != null) {
                bVar.m111023b(15, m130100I);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.CommentView.InterfaceC10179b
    /* renamed from: qa */
    public void mo54175qa(String str) {
        String str2;
        String m127189r0;
        AbstractC19074t.m100208f(str, "tag");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str2 = m92642L3.getString("HASHTAG");
        } else {
            str2 = null;
        }
        if (AbstractC19074t.m100204b(str, str2)) {
            finish();
            return;
        }
        SearchPageView.C10392b c10392b = SearchPageView.Companion;
        m127189r0 = AbstractC24342w.m127189r0(str, "#");
        m55551QK(c10392b.m54827b(m127189r0));
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: r4 */
    public void mo53937r4() {
        mo53934d0();
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_double_tap_refresh);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        c19205a.m100713L(m92652XI, null);
    }

    /* renamed from: rM */
    public final void m55399rM() {
        C9768d c9768d;
        OverScrollableRecyclerView.LinearLayoutManager linearLayoutManager;
        View mo9732P;
        AdvertisingVideoItem advertisingVideoItem;
        Video advertisingVideo;
        String advertisingLink;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 == null || (c9768d = this.f53611D0) == null) {
            return;
        }
        RecyclerView.AbstractC1888o layoutManager = c25026k2.f120031E.getLayoutManager();
        AdvertisingVideoItem advertisingVideoItem2 = null;
        if (layoutManager instanceof OverScrollableRecyclerView.LinearLayoutManager) {
            linearLayoutManager = (OverScrollableRecyclerView.LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null && (mo9732P = linearLayoutManager.mo9732P(c9768d.m52730s())) != null) {
            boolean z11 = mo9732P instanceof AdvertisingVideoItem;
            if (z11) {
                advertisingVideoItem = (AdvertisingVideoItem) mo9732P;
            } else {
                advertisingVideoItem = null;
            }
            if (advertisingVideoItem != null && (advertisingLink = advertisingVideoItem.getAdvertisingLink()) != null) {
                m55361sM(advertisingLink);
            }
            if (z11) {
                advertisingVideoItem2 = (AdvertisingVideoItem) mo9732P;
            }
            if (advertisingVideoItem2 != null && (advertisingVideo = advertisingVideoItem2.getAdvertisingVideo()) != null) {
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = m92652XI(AbstractC27413h.zch_action_key_open_ad_swipe_left);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                C19205a.m100676P(c19205a, m92652XI, advertisingVideo, null, 4, null);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: sC */
    public C31179n0 mo55400sC() {
        return this.f53610C0;
    }

    /* renamed from: uM */
    public final void m55401uM(C21456b.b bVar) {
        C31179n0 c31179n0;
        Integer num;
        int i11;
        C26947a.c cVar;
        Integer num2;
        int i12;
        AbstractC19074t.m100208f(bVar, "extras");
        Object m111022a = bVar.m111022a(5);
        if (m111022a != null) {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                AbstractC26102d.m134326a(m92642L3, "RESERVED_VIDEO", m111022a);
                return;
            }
            return;
        }
        Object m111022a2 = bVar.m111022a(2);
        C25093p.c cVar2 = null;
        if (m111022a2 instanceof C31179n0) {
            c31179n0 = (C31179n0) m111022a2;
        } else {
            c31179n0 = null;
        }
        this.f53622O0 = c31179n0;
        Object m111022a3 = bVar.m111022a(3);
        if (m111022a3 instanceof Integer) {
            num = (Integer) m111022a3;
        } else {
            num = null;
        }
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = -1;
        }
        this.f53625R0 = i11;
        Object m111022a4 = bVar.m111022a(13);
        if (m111022a4 instanceof C26947a.c) {
            cVar = (C26947a.c) m111022a4;
        } else {
            cVar = null;
        }
        this.f53623P0 = cVar;
        Object m111022a5 = bVar.m111022a(14);
        if (m111022a5 instanceof Integer) {
            num2 = (Integer) m111022a5;
        } else {
            num2 = null;
        }
        if (num2 != null) {
            i12 = num2.intValue();
        } else {
            i12 = 0;
        }
        this.f53626S0 = i12;
        Object m111022a6 = bVar.m111022a(15);
        if (m111022a6 instanceof C25093p.c) {
            cVar2 = (C25093p.c) m111022a6;
        }
        this.f53624Q0 = cVar2;
    }

    /* renamed from: vM */
    public final void m55402vM(C21456b.b bVar) {
        Video video;
        int i11;
        Object m130100I;
        Object m138832N;
        C31179n0 c31179n0;
        String str;
        Video m52729r;
        Object string;
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (string = m92642L3.getString("SOURCE")) != null) {
            bVar.m111023b(6, string);
        }
        Bundle m92642L32 = m92642L3();
        Integer num = null;
        if (m92642L32 != null) {
            video = (Video) m92642L32.getParcelable("RESERVED_VIDEO");
        } else {
            video = null;
        }
        if (video != null && (c31179n0 = this.f53610C0) != null && c31179n0.mo10003k() == 1) {
            C9768d c9768d = this.f53611D0;
            if (c9768d != null && (m52729r = c9768d.m52729r()) != null) {
                str = m52729r.m52911t();
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str, video.m52911t())) {
                bVar.m111023b(5, video);
                return;
            }
        }
        Object obj = this.f53610C0;
        if (obj != null) {
            bVar.m111023b(2, obj);
        }
        C9768d c9768d2 = this.f53611D0;
        if (c9768d2 != null) {
            i11 = c9768d2.m52731t();
        } else {
            i11 = -1;
        }
        bVar.m111023b(3, Integer.valueOf(i11));
        C26947a mo53571UD = this.f53609B0.mo53571UD();
        if (mo53571UD != null && (m138832N = mo53571UD.m138832N()) != null) {
            bVar.m111023b(13, m138832N);
        }
        Integer valueOf = Integer.valueOf(this.f53626S0);
        if (valueOf.intValue() != 0) {
            num = valueOf;
        }
        if (num != null) {
            bVar.m111023b(14, Integer.valueOf(num.intValue()));
        }
        C25093p mo53574Zn = this.f53609B0.mo53574Zn();
        if (mo53574Zn != null && (m130100I = mo53574Zn.m130100I()) != null) {
            bVar.m111023b(15, m130100I);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.InterfaceC10628f
    /* renamed from: xw */
    public void mo55403xw(Section section, List list, boolean z11, List list2) {
        C25026k2 c25026k2;
        LoadingLayout loadingLayout;
        AbstractC19074t.m100208f(section, "section");
        this.f53626S0 = 0;
        if (!z11) {
            mo55380MD(section, list, list2);
        } else {
            InterfaceC10628f.a.m55559c(this, new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null), null, list2, 2, null);
        }
        C31179n0 c31179n0 = this.f53610C0;
        if ((c31179n0 == null || !c31179n0.mo151443L()) && (c25026k2 = (C25026k2) m55556SK()) != null && (loadingLayout = c25026k2.f120035I) != null) {
            LoadingLayout.m55778e(loadingLayout, null, null, Integer.valueOf(AbstractC27413h.zch_page_video_following_empty_message), Integer.valueOf(AbstractC27413h.zch_page_video_following_empty_action), new C10591k(section, list, list2), new BitmapDrawable(loadingLayout.getResources(), AbstractC1415b.m7218b(AbstractC26112n.m134434z(loadingLayout, AbstractC27408c.zch_layer_radial_blue), 0, 0, null, 7, null)), 3, null);
            this.f53641h1 = false;
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.CommentView.InterfaceC10179b
    /* renamed from: ye */
    public void mo54176ye() {
        VideoPageLayout videoPageLayout;
        C25026k2 c25026k2 = (C25026k2) m55556SK();
        if (c25026k2 != null && (videoPageLayout = c25026k2.f120036J) != null) {
            videoPageLayout.m55212P();
        }
    }
}
