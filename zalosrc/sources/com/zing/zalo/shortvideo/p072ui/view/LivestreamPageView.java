package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.core.os.AbstractC1438d;
import androidx.recyclerview.widget.RecyclerView;
import c20.C3212b;
import com.zing.zalo.shortvideo.data.model.C9440a;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.data.remote.common.LimitationReachedException;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.data.remote.ws.call.LiveChanelStats;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.bts.LivestreamBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.bts.ProfileLivestreamBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9767c;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.LivestreamVideoLayout;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.LivestreamConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.presenter.InterfaceC10056d;
import com.zing.zalo.shortvideo.p072ui.receiver.LivestreamReceiver;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.view.LivestreamPageLayout;
import com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.shortvideo.p072ui.widget.CommentBox;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.C17507u0;
import com.zing.zalo.zview.ZaloView;
import e20.InterfaceC18189c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import gg0.AbstractC19444a;
import i20.C20196i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C21456b;
import m20.InterfaceC22758j0;
import p021an.AbstractC0955d;
import p10.EnumC24601e;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25002e2;
import q20.C25095r;
import q20.C25097t;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import s20.AbstractC26102d;
import s20.AbstractC26112n;
import su.C26388b;
import v00.AbstractC27406a;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import z10.C31178n;

/* loaded from: classes5.dex */
public final class LivestreamPageView extends AbstractC10623a implements InterfaceC22758j0, InterfaceC18189c, C21456b.c, ZchBaseView.InterfaceC10622a {
    public static final C10285c Companion = new C10285c(null);

    /* renamed from: B0 */
    private InterfaceC10284b f52928B0;

    /* renamed from: C0 */
    private final InterfaceC10056d f52929C0;

    /* renamed from: D0 */
    private C31178n f52930D0;

    /* renamed from: E0 */
    private C9767c f52931E0;

    /* renamed from: F0 */
    private int f52932F0;

    /* renamed from: G0 */
    private int f52933G0;

    /* renamed from: H0 */
    private int f52934H0;

    /* renamed from: I0 */
    private C20196i f52935I0;

    /* renamed from: J0 */
    private Drawable f52936J0;

    /* renamed from: K0 */
    private C31178n f52937K0;

    /* renamed from: L0 */
    private int f52938L0;

    /* renamed from: M0 */
    private boolean f52939M0;

    /* renamed from: N0 */
    private boolean f52940N0;

    /* renamed from: O0 */
    private boolean f52941O0;

    /* renamed from: P0 */
    private boolean f52942P0;

    /* renamed from: Q0 */
    private boolean f52943Q0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10283a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10283a f52944y = new C10283a();

        C10283a() {
            super(3, C25002e2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageLivestreamBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54486h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25002e2 m54486h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25002e2.m129802c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10284b {
        /* renamed from: a */
        ZVideoView mo54487a();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$c */
    /* loaded from: classes5.dex */
    public static final class C10285c {
        private C10285c() {
        }

        public /* synthetic */ C10285c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final LivestreamPageView m54488a(String str, LivestreamData livestreamData) {
            AbstractC19074t.m100208f(str, "sourceLog");
            LivestreamPageView livestreamPageView = new LivestreamPageView();
            livestreamPageView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("RESERVED_VIDEO", livestreamData), AbstractC24866w.m129235a("SOURCE", str)));
            return livestreamPageView;
        }

        /* renamed from: b */
        public final Bundle m54489b(LivestreamData livestreamData, String str, String str2) {
            AbstractC19074t.m100208f(livestreamData, "stream");
            AbstractC19074t.m100208f(str, "sourceLog");
            AbstractC19074t.m100208f(str2, "sourceIdFromShare");
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("RESERVED_VIDEO", livestreamData), AbstractC24866w.m129235a("SOURCE", str), AbstractC24866w.m129235a("SOURCE_ID_FROM_SHARE", str2));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$d */
    /* loaded from: classes5.dex */
    public static final class EnumC10286d extends Enum {

        /* renamed from: q */
        public static final EnumC10286d f52945q = new EnumC10286d("UNDEFINED", 0, 0);

        /* renamed from: r */
        public static final EnumC10286d f52946r = new EnumC10286d("PORTRAIT", 1, 1);

        /* renamed from: s */
        public static final EnumC10286d f52947s = new EnumC10286d("LANDSCAPE", 2, 2);

        /* renamed from: t */
        public static final EnumC10286d f52948t = new EnumC10286d("SQUARE", 3, 3);

        /* renamed from: u */
        private static final /* synthetic */ EnumC10286d[] f52949u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f52950v;

        /* renamed from: p */
        private final int f52951p;

        static {
            EnumC10286d[] m54490b = m54490b();
            f52949u = m54490b;
            f52950v = AbstractC30166b.m148796a(m54490b);
        }

        private EnumC10286d(String str, int i11, int i12) {
            super(str, i11);
            this.f52951p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC10286d[] m54490b() {
            return new EnumC10286d[]{f52945q, f52946r, f52947s, f52948t};
        }

        public static EnumC10286d valueOf(String str) {
            return (EnumC10286d) Enum.valueOf(EnumC10286d.class, str);
        }

        public static EnumC10286d[] values() {
            return (EnumC10286d[]) f52949u.clone();
        }

        /* renamed from: c */
        public final int m54491c() {
            return this.f52951p;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$e */
    /* loaded from: classes5.dex */
    static final class C10287e extends AbstractC19075u implements InterfaceC18494a {
        C10287e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54492a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54492a() {
            LoadingLayout loadingLayout;
            C25002e2 c25002e2 = (C25002e2) LivestreamPageView.this.m55556SK();
            if (c25002e2 != null && (loadingLayout = c25002e2.f119890t) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10056d.a.m53674a(LivestreamPageView.this.f52929C0, null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$f */
    /* loaded from: classes5.dex */
    static final class C10288f extends AbstractC19075u implements InterfaceC18494a {
        C10288f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54493a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54493a() {
            LoadingLayout loadingLayout;
            C25002e2 c25002e2 = (C25002e2) LivestreamPageView.this.m55556SK();
            if (c25002e2 != null && (loadingLayout = c25002e2.f119890t) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10056d.a.m53674a(LivestreamPageView.this.f52929C0, null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$g */
    /* loaded from: classes5.dex */
    static final class C10289g extends AbstractC19075u implements InterfaceC18505l {
        C10289g() {
            super(1);
        }

        /* renamed from: a */
        public final void m54494a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "it");
            C25097t.f120556a.m130155r(LivestreamPageView.this.getContext(), th2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54494a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$h */
    /* loaded from: classes5.dex */
    static final class C10290h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$h$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C9767c f52956q;

            /* renamed from: r */
            final /* synthetic */ int f52957r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9767c c9767c, int i11) {
                super(1);
                this.f52956q = c9767c;
                this.f52957r = i11;
            }

            /* renamed from: a */
            public final void m54496a(RecyclerView recyclerView) {
                AbstractC19074t.m100208f(recyclerView, "it");
                this.f52956q.m52691u(this.f52957r);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m54496a((RecyclerView) obj);
                return C24848g0.f119245a;
            }
        }

        C10290h() {
            super(1);
        }

        /* renamed from: a */
        public final void m54495a(LivestreamData livestreamData) {
            LoadingLayout loadingLayout;
            OverScrollableRecyclerView overScrollableRecyclerView;
            AbstractC19074t.m100208f(livestreamData, "it");
            try {
                C31178n c31178n = LivestreamPageView.this.f52930D0;
                AbstractC19074t.m100205c(c31178n);
                C9767c c9767c = LivestreamPageView.this.f52931E0;
                AbstractC19074t.m100205c(c9767c);
                if (!c31178n.mo151443L()) {
                    LivestreamPageView.this.mo54473cp(livestreamData);
                    return;
                }
                if (AbstractC19074t.m100204b(c31178n.m151826T(c9767c.m52682l()).m51016f(), livestreamData.m51016f())) {
                    return;
                }
                int m52682l = c9767c.m52682l() + 1;
                c31178n.m151829W(m52682l, livestreamData);
                C25002e2 c25002e2 = (C25002e2) LivestreamPageView.this.m55556SK();
                if (c25002e2 != null && (overScrollableRecyclerView = c25002e2.f119888r) != null) {
                    AbstractC26112n.m134406k(overScrollableRecyclerView, new a(c9767c, m52682l));
                }
                C25002e2 c25002e22 = (C25002e2) LivestreamPageView.this.m55556SK();
                if (c25002e22 != null && (loadingLayout = c25002e22.f119890t) != null) {
                    loadingLayout.m55781c();
                    loadingLayout.m55780b();
                }
            } catch (Exception e11) {
                C25097t.f120556a.m130155r(LivestreamPageView.this.getContext(), e11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54495a((LivestreamData) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$i */
    /* loaded from: classes5.dex */
    public static final class C10291i implements C9767c.c {

        /* renamed from: b */
        final /* synthetic */ C25002e2 f52959b;

        C10291i(C25002e2 c25002e2) {
            this.f52959b = c25002e2;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9767c.c
        /* renamed from: a */
        public void mo52692a(int i11) {
            LivestreamData livestreamData;
            LivestreamItem m52685o;
            String m51016f;
            int i12;
            C31178n c31178n = LivestreamPageView.this.f52930D0;
            if (c31178n != null) {
                livestreamData = c31178n.m151827U(Integer.valueOf(i11));
            } else {
                livestreamData = null;
            }
            C9767c c9767c = LivestreamPageView.this.f52931E0;
            if (c9767c != null && (m52685o = c9767c.m52685o(i11)) != null && livestreamData != null && (m51016f = livestreamData.m51016f()) != null) {
                boolean m100204b = AbstractC19074t.m100204b(C27417l.f129055a.m140378b().m51234g(), livestreamData.m51010b().m50769l());
                LivestreamPageView livestreamPageView = LivestreamPageView.this;
                if (m100204b) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                livestreamPageView.m54429EL(i12);
                InterfaceC10056d interfaceC10056d = LivestreamPageView.this.f52929C0;
                String m50769l = livestreamData.m51010b().m50769l();
                String m50775o = livestreamData.m51010b().m50775o();
                if (m50775o == null) {
                    m50775o = "";
                }
                interfaceC10056d.mo53278zs(m51016f, m50769l, m50775o);
                LivestreamItem.m52189F0(m52685o, livestreamData.m51029q(), Long.valueOf(livestreamData.m51028p()), Long.valueOf(livestreamData.m51013d()), false, 8, null);
                this.f52959b.f119887q.m55702w();
                this.f52959b.f119892v.m52545q0();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9767c.c
        /* renamed from: b */
        public void mo52693b(int i11) {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.C9767c.c
        /* renamed from: c */
        public void mo52694c(int i11) {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$j */
    /* loaded from: classes5.dex */
    static final class C10292j extends AbstractC19075u implements InterfaceC18494a {
        C10292j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54497a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54497a() {
            LivestreamItem m52685o;
            C9767c c9767c = LivestreamPageView.this.f52931E0;
            if (c9767c != null) {
                Integer valueOf = Integer.valueOf(c9767c.m52682l());
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    LivestreamPageView livestreamPageView = LivestreamPageView.this;
                    int intValue = valueOf.intValue();
                    C9767c c9767c2 = livestreamPageView.f52931E0;
                    if (c9767c2 != null && (m52685o = c9767c2.m52685o(intValue)) != null) {
                        m52685o.m52262v0();
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$k */
    /* loaded from: classes5.dex */
    public static final class C10293k implements CommentBox.InterfaceC10658a {

        /* renamed from: b */
        final /* synthetic */ C25002e2 f52962b;

        C10293k(C25002e2 c25002e2) {
            this.f52962b = c25002e2;
        }

        /* renamed from: k */
        public static final void m54499k(C9767c c9767c, int i11, C25002e2 c25002e2, int i12) {
            AbstractC19074t.m100208f(c9767c, "$this_run");
            AbstractC19074t.m100208f(c25002e2, "$this_run$1");
            LivestreamItem m52685o = c9767c.m52685o(i11);
            if (m52685o != null) {
                CommentBox commentBox = c25002e2.f119887q;
                AbstractC19074t.m100207e(commentBox, "boxComment");
                if (!AbstractC26112n.m134380U(commentBox)) {
                    i12 = 0;
                }
                m52685o.setCommentBoxHeight(i12);
                CommentBox commentBox2 = c25002e2.f119887q;
                AbstractC19074t.m100207e(commentBox2, "boxComment");
                if (!AbstractC26112n.m134380U(commentBox2)) {
                    m52685o.setFooterText(c25002e2.f119887q.getInputText());
                } else {
                    m52685o.setFooterText("");
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: a */
        public void mo54185a(Comment.Identity identity, String str, boolean z11, Comment comment, Video video) {
            AbstractC19074t.m100208f(identity, "identity");
            AbstractC19074t.m100208f(str, "content");
            LivestreamData m54452pL = LivestreamPageView.this.m54452pL();
            if (m54452pL == null) {
                return;
            }
            LivestreamPageView.this.f52929C0.mo53265aa(m54452pL.m51016f(), m54452pL.m51010b().m50769l(), str, identity, z11);
            C25002e2 c25002e2 = (C25002e2) LivestreamPageView.this.m55556SK();
            if (c25002e2 == null) {
                return;
            }
            if (c25002e2.f119887q.m55692C()) {
                c25002e2.f119887q.m55690A();
            } else {
                c25002e2.f119887q.m55691B();
            }
            CommentBox commentBox = c25002e2.f119887q;
            AbstractC19074t.m100207e(commentBox, "boxComment");
            AbstractC26112n.m134374O(commentBox);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: b */
        public void mo54186b(boolean z11) {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: c */
        public void mo54187c(String str) {
            AbstractC19074t.m100208f(str, "emoji");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: m20.o0.<init>(com.zing.zalo.shortvideo.ui.component.rv.snaper.c, int, q10.e2, int):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: d */
        public void mo54188d(int r5, int r6) {
            /*
                r4 = this;
                com.zing.zalo.shortvideo.ui.view.LivestreamPageView r5 = com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView.this
                com.zing.zalo.shortvideo.ui.component.rv.snaper.c r5 = com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView.m54439cL(r5)
                if (r5 == 0) goto L24
                com.zing.zalo.shortvideo.ui.view.LivestreamPageView r0 = com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView.this
                q10.e2 r1 = r4.f52962b
                int r2 = r5.m52682l()
                m2.a r0 = r0.m55556SK()
                q10.e2 r0 = (q10.C25002e2) r0
                if (r0 == 0) goto L24
                com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView r0 = r0.f119888r
                if (r0 == 0) goto L24
                m20.o0 r3 = new m20.o0
                r3.<init>()
                r0.post(r3)
            L24:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView.C10293k.mo54188d(int, int):void");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: e */
        public void mo54189e() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: f */
        public C17487o0 mo54190f() {
            return LivestreamPageView.this.m92662fJ();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: g */
        public InterfaceC27218a mo54191g() {
            return LivestreamPageView.this.m92676n2();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: h */
        public void mo54192h(String str) {
            AbstractC19074t.m100208f(str, "emoji");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.CommentBox.InterfaceC10658a
        /* renamed from: i */
        public void mo54193i(Comment.Identity identity) {
            AbstractC19074t.m100208f(identity, "currentIdentity");
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$l */
    /* loaded from: classes5.dex */
    static final class C10294l extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C25002e2 f52963q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10294l(C25002e2 c25002e2) {
            super(2);
            this.f52963q = c25002e2;
        }

        /* renamed from: a */
        public final void m54500a(int i11, float f11) {
            CommentBox commentBox = this.f52963q.f119887q;
            AbstractC19074t.m100207e(commentBox, "boxComment");
            CommentBox.m55666W(commentBox, i11, f11, false, 4, null);
            if (i11 > 0 && f11 == 1.0f) {
                AbstractC28684a.Companion.m143681o().mo146340o(i11);
            }
            if (this.f52963q.f119887q.m55694E()) {
                CommentBox commentBox2 = this.f52963q.f119887q;
                AbstractC19074t.m100207e(commentBox2, "boxComment");
                AbstractC26112n.m134431w0(commentBox2);
            } else {
                CommentBox commentBox3 = this.f52963q.f119887q;
                AbstractC19074t.m100207e(commentBox3, "boxComment");
                AbstractC26112n.m134374O(commentBox3);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54500a(((Number) obj).intValue(), ((Number) obj2).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$m */
    /* loaded from: classes5.dex */
    public static final class C10295m implements C31178n.b {

        /* renamed from: b */
        final /* synthetic */ C25002e2 f52965b;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$m$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ LivestreamPageView f52966q;

            /* renamed from: r */
            final /* synthetic */ String f52967r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LivestreamPageView livestreamPageView, String str) {
                super(0);
                this.f52966q = livestreamPageView;
                this.f52967r = str;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54516a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54516a() {
                this.f52966q.m54459wL(this.f52967r);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$m$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f52968q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54517a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54517a() {
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$m$c */
        /* loaded from: classes5.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ LivestreamPageView f52969q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(LivestreamPageView livestreamPageView) {
                super(0);
                this.f52969q = livestreamPageView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54518a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54518a() {
                InterfaceC10056d.a.m53674a(this.f52969q.f52929C0, null, 1, null);
                this.f52969q.m54456tL();
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$m$d */
        /* loaded from: classes5.dex */
        public static final class d implements LivestreamBottomSheet.InterfaceC9507a {

            /* renamed from: a */
            final /* synthetic */ LivestreamPageView f52970a;

            d(LivestreamPageView livestreamPageView) {
                this.f52970a = livestreamPageView;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.bts.LivestreamBottomSheet.InterfaceC9507a
            /* renamed from: a */
            public void mo51882a() {
                LivestreamData m54452pL = this.f52970a.m54452pL();
                if (m54452pL != null) {
                    LivestreamPageView livestreamPageView = this.f52970a;
                    livestreamPageView.m54459wL(m54452pL.m51023k());
                    livestreamPageView.f52929C0.mo53261Lu(m54452pL.m51016f(), m54452pL.m51010b().m50769l());
                }
            }
        }

        C10295m(C25002e2 c25002e2) {
            this.f52965b = c25002e2;
        }

        @Override // z10.C31178n.b
        /* renamed from: a */
        public void mo54501a(LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(loadMoreInfo, "next");
            LivestreamPageView.this.f52929C0.mo53270ej(loadMoreInfo);
        }

        @Override // z10.C31178n.b
        /* renamed from: b */
        public void mo54502b() {
            this.f52965b.f119892v.m52539e0();
        }

        @Override // z10.C31178n.b
        /* renamed from: c */
        public void mo54503c() {
            LivestreamData m151826T;
            C9767c c9767c = LivestreamPageView.this.f52931E0;
            if (c9767c != null) {
                int m52682l = c9767c.m52682l();
                C31178n c31178n = LivestreamPageView.this.f52930D0;
                if (c31178n != null && (m151826T = c31178n.m151826T(m52682l)) != null) {
                    LivestreamPageView.this.f52929C0.mo53257A9(m151826T.m51016f(), m151826T.m51010b(), true, false);
                }
            }
        }

        @Override // z10.C31178n.b
        /* renamed from: d */
        public void mo54504d() {
            LivestreamPageView.this.f52929C0.mo53258BG();
        }

        @Override // z10.C31178n.b
        /* renamed from: e */
        public void mo54505e() {
            CommentBox commentBox;
            CommentBox commentBox2;
            C25002e2 c25002e2 = (C25002e2) LivestreamPageView.this.m55556SK();
            if (c25002e2 != null && (commentBox2 = c25002e2.f119887q) != null) {
                commentBox2.m55701a0();
            }
            C25002e2 c25002e22 = (C25002e2) LivestreamPageView.this.m55556SK();
            if (c25002e22 != null && (commentBox = c25002e22.f119887q) != null) {
                AbstractC26112n.m134431w0(commentBox);
            }
        }

        @Override // z10.C31178n.b
        /* renamed from: f */
        public void mo54506f() {
            LivestreamPageView livestreamPageView = LivestreamPageView.this;
            livestreamPageView.m54428DL(livestreamPageView.m54452pL());
        }

        @Override // z10.C31178n.b
        /* renamed from: g */
        public void mo54507g() {
            LivestreamBottomSheet m51883a = LivestreamBottomSheet.Companion.m51883a();
            m51883a.m51881jL(new d(LivestreamPageView.this));
            C17487o0 m92649TI = LivestreamPageView.this.m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            BaseBottomSheetView.m51747hL(m51883a, m92649TI, null, 2, null);
        }

        @Override // z10.C31178n.b
        /* renamed from: h */
        public void mo54508h() {
            C25002e2 c25002e2 = (C25002e2) LivestreamPageView.this.m55556SK();
            if (c25002e2 != null && c25002e2.f119887q.m55694E()) {
                c25002e2.f119887q.m55703x();
                CommentBox commentBox = c25002e2.f119887q;
                AbstractC19074t.m100207e(commentBox, "boxComment");
                AbstractC26112n.m134374O(commentBox);
            }
        }

        @Override // z10.C31178n.b
        /* renamed from: i */
        public void mo54509i() {
            if (LivestreamPageView.this.f52941O0 && LivestreamPageView.this.m54458vL()) {
                LivestreamPageView.this.m54483xL();
                LivestreamPageView.this.m54455sL();
            } else if (LivestreamPageView.this.f52934H0 == EnumC10286d.f52947s.m54491c()) {
                LivestreamPageView.this.f52939M0 = true;
                LivestreamPageView.this.m54483xL();
            } else {
                LivestreamPageView.this.m54455sL();
            }
        }

        @Override // z10.C31178n.b
        /* renamed from: j */
        public void mo54510j() {
            String str;
            if (LivestreamPageView.this.f52941O0 && LivestreamPageView.this.m54458vL()) {
                LivestreamPageView.this.m54483xL();
                LivestreamPageView.this.m54456tL();
                return;
            }
            LivestreamPageView.this.m54483xL();
            LivestreamData m54452pL = LivestreamPageView.this.m54452pL();
            if (m54452pL != null) {
                LivestreamPageView livestreamPageView = LivestreamPageView.this;
                InterfaceC10056d interfaceC10056d = livestreamPageView.f52929C0;
                String m51016f = m54452pL.m51016f();
                String m50769l = m54452pL.m51010b().m50769l();
                if (livestreamPageView.f52933G0 == 0) {
                    str = "1";
                } else {
                    str = "2";
                }
                interfaceC10056d.mo53262Ma(m51016f, m50769l, str);
            }
        }

        @Override // z10.C31178n.b
        /* renamed from: k */
        public void mo54511k() {
            CoreConfig m51425b;
            String m51459v;
            ChannelConfig m140381e = C27417l.f129055a.m140381e();
            if (m140381e != null && (m51425b = m140381e.m51425b()) != null && (m51459v = m51425b.m51459v()) != null) {
                LivestreamPageView livestreamPageView = LivestreamPageView.this;
                ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_popup_ekyc_user_title), Integer.valueOf(AbstractC27413h.zch_popup_ekyc_user_message), Integer.valueOf(AbstractC27413h.zch_popup_ekyc_user_positive), Integer.valueOf(AbstractC27413h.zch_popup_ekyc_user_negative), null, false, false, 112, null);
                m51992b.m51991lL(new a(livestreamPageView, m51459v));
                m51992b.m51990kL(b.f52968q);
                m51992b.m51978ZK(true);
                BasePopupView.m51974dL(m51992b, livestreamPageView.m54457uL(), null, 2, null);
            }
        }

        @Override // z10.C31178n.b
        /* renamed from: l */
        public void mo54512l(boolean z11) {
            if (LivestreamPageView.this.f52940N0) {
                LivestreamPageView.this.f52940N0 = false;
                if (z11) {
                    int i11 = LivestreamPageView.this.f52934H0;
                    EnumC10286d enumC10286d = EnumC10286d.f52947s;
                    if (i11 != enumC10286d.m54491c()) {
                        LivestreamPageView.this.f52934H0 = enumC10286d.m54491c();
                        LivestreamPageView.this.m54460zL();
                    }
                }
            }
        }

        @Override // z10.C31178n.b
        /* renamed from: m */
        public void mo54513m() {
            String str;
            LivestreamPageView.this.m54483xL();
            LivestreamData m54452pL = LivestreamPageView.this.m54452pL();
            if (m54452pL != null) {
                LivestreamPageView livestreamPageView = LivestreamPageView.this;
                InterfaceC10056d interfaceC10056d = livestreamPageView.f52929C0;
                String m51016f = m54452pL.m51016f();
                String m50769l = m54452pL.m51010b().m50769l();
                if (livestreamPageView.f52933G0 == 0) {
                    str = "1";
                } else {
                    str = "2";
                }
                interfaceC10056d.mo53262Ma(m51016f, m50769l, str);
            }
        }

        @Override // z10.C31178n.b
        /* renamed from: n */
        public void mo54514n(int i11) {
            LivestreamData m54452pL = LivestreamPageView.this.m54452pL();
            if (m54452pL == null) {
                return;
            }
            LivestreamPageView.this.f52929C0.mo53260Ho(m54452pL.m51016f());
        }

        @Override // z10.C31178n.b
        /* renamed from: o */
        public void mo54515o(boolean z11) {
            if (!z11) {
                LivestreamPageView.this.m54456tL();
                return;
            }
            LivestreamConfirmPopupView m52004b = LivestreamConfirmPopupView.C9541a.m52004b(LivestreamConfirmPopupView.Companion, Integer.valueOf(AbstractC27413h.zch_item_livestream_popup_exit_title), Integer.valueOf(AbstractC27413h.zch_item_livestream_popup_exit_msg), Integer.valueOf(AbstractC27413h.zch_item_livestream_popup_exit_positive), Integer.valueOf(AbstractC27413h.zch_item_livestream_popup_exit_negative), null, true, false, 80, null);
            m52004b.m52003kL(new c(LivestreamPageView.this));
            m52004b.m51978ZK(true);
            BasePopupView.m51974dL(m52004b, LivestreamPageView.this.m54457uL(), null, 2, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$n */
    /* loaded from: classes5.dex */
    public static final class C10296n implements OverScrollableRecyclerView.InterfaceC10832c {
        C10296n() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31178n c31178n;
            C31178n c31178n2 = LivestreamPageView.this.f52930D0;
            if (c31178n2 != null && !c31178n2.m151444M() && (c31178n = LivestreamPageView.this.f52930D0) != null) {
                c31178n.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$o */
    /* loaded from: classes5.dex */
    public static final class C10297o implements LivestreamPageLayout.InterfaceC10282a {
        C10297o() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.LivestreamPageLayout.InterfaceC10282a
        /* renamed from: a */
        public void mo54424a() {
            C9767c c9767c = LivestreamPageView.this.f52931E0;
            if (c9767c != null) {
                c9767c.m52689s();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$p */
    /* loaded from: classes5.dex */
    public static final class C10298p implements ProfileLivestreamBottomSheet.InterfaceC9509a {

        /* renamed from: b */
        final /* synthetic */ LivestreamData f52975b;

        /* renamed from: c */
        final /* synthetic */ Channel f52976c;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$p$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ LivestreamPageView f52977q;

            /* renamed from: r */
            final /* synthetic */ LivestreamData f52978r;

            /* renamed from: s */
            final /* synthetic */ Channel f52979s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LivestreamPageView livestreamPageView, LivestreamData livestreamData, Channel channel) {
                super(0);
                this.f52977q = livestreamPageView;
                this.f52978r = livestreamData;
                this.f52979s = channel;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m54519a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m54519a() {
                this.f52977q.f52929C0.mo53257A9(this.f52978r.m51016f(), this.f52979s, false, true);
            }
        }

        C10298p(LivestreamData livestreamData, Channel channel) {
            this.f52975b = livestreamData;
            this.f52976c = channel;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ProfileLivestreamBottomSheet.InterfaceC9509a
        /* renamed from: a */
        public void mo51894a(boolean z11) {
            boolean z12;
            if (z11) {
                LivestreamPageView.this.f52929C0.mo53257A9(this.f52975b.m51016f(), this.f52976c, true, true);
                return;
            }
            ConfirmPopupView.C9537a c9537a = ConfirmPopupView.Companion;
            Integer valueOf = Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_title);
            Integer valueOf2 = Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_message);
            Integer valueOf3 = Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_positive);
            Integer valueOf4 = Integer.valueOf(AbstractC27413h.zch_popup_unfollow_channel_negative);
            if (LivestreamPageView.this.f52934H0 == EnumC10286d.f52947s.m54491c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(c9537a, valueOf, valueOf2, valueOf3, valueOf4, null, false, z12, 48, null);
            m51992b.m51991lL(new a(LivestreamPageView.this, this.f52975b, this.f52976c));
            m51992b.m51978ZK(true);
            BasePopupView.m51974dL(m51992b, LivestreamPageView.this.m54457uL(), null, 2, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$q */
    /* loaded from: classes5.dex */
    public static final class C10299q extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10299q f52980q = new C10299q();

        C10299q() {
            super(1);
        }

        /* renamed from: a */
        public final void m54520a(String str) {
            AbstractC19074t.m100208f(str, "it");
            C25095r.f120555a.m130134b(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54520a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$r */
    /* loaded from: classes5.dex */
    public static final class C10300r implements ShareBottomSheet.InterfaceC9516a {

        /* renamed from: b */
        final /* synthetic */ LivestreamData f52982b;

        /* renamed from: c */
        final /* synthetic */ String f52983c;

        C10300r(LivestreamData livestreamData, String str) {
            this.f52982b = livestreamData;
            this.f52983c = str;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
        /* renamed from: a */
        public void mo51915a(boolean z11) {
            LivestreamPageView.this.f52929C0.mo53274kk(this.f52982b.m51016f(), this.f52982b.m51010b().m50769l(), this.f52983c, String.valueOf(this.f52982b.m51019h()), "zalo_message");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
        /* renamed from: b */
        public void mo51916b() {
            LivestreamPageView.this.f52929C0.mo53274kk(this.f52982b.m51016f(), this.f52982b.m51010b().m50769l(), this.f52983c, String.valueOf(this.f52982b.m51019h()), "other");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
        /* renamed from: c */
        public void mo51917c(boolean z11) {
            LivestreamPageView.this.f52929C0.mo53274kk(this.f52982b.m51016f(), this.f52982b.m51010b().m50769l(), this.f52983c, String.valueOf(this.f52982b.m51019h()), "zalo_feed");
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.bts.ShareBottomSheet.InterfaceC9516a
        /* renamed from: d */
        public void mo51918d() {
            LivestreamPageView.this.f52929C0.mo53274kk(this.f52982b.m51016f(), this.f52982b.m51010b().m50769l(), this.f52983c, String.valueOf(this.f52982b.m51019h()), "copy_link");
        }
    }

    public LivestreamPageView() {
        super(C10283a.f52944y);
        this.f52929C0 = AbstractC28684a.Companion.m143691y();
        this.f52932F0 = 1;
        this.f52933G0 = 1;
        this.f52934H0 = EnumC10286d.f52945q.m54491c();
        this.f52938L0 = -1;
    }

    /* renamed from: AL */
    public static final void m54425AL(C9767c c9767c, int i11) {
        AbstractC19074t.m100208f(c9767c, "$this_run");
        LivestreamItem m52685o = c9767c.m52685o(i11);
        if (m52685o != null) {
            m52685o.setOrientationMode(true);
        }
    }

    /* renamed from: BL */
    public static final void m54426BL(C9767c c9767c, int i11) {
        AbstractC19074t.m100208f(c9767c, "$this_run");
        LivestreamItem m52685o = c9767c.m52685o(i11);
        if (m52685o != null) {
            m52685o.setOrientationMode(false);
        }
    }

    /* renamed from: CL */
    private final void m54427CL(boolean z11) {
        Window window;
        int statusBars;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (window = m92676n2.getWindow()) != null) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 4096);
            if (Build.VERSION.SDK_INT >= 30) {
                statusBars = WindowInsets.Type.statusBars();
                if (z11) {
                    insetsController2 = window.getInsetsController();
                    if (insetsController2 != null) {
                        insetsController2.show(statusBars);
                        return;
                    }
                    return;
                }
                insetsController = window.getInsetsController();
                if (insetsController != null) {
                    insetsController.hide(statusBars);
                    return;
                }
                return;
            }
            if (z11) {
                window.clearFlags(1024);
            } else {
                window.addFlags(1024);
            }
        }
    }

    /* renamed from: DL */
    public final void m54428DL(LivestreamData livestreamData) {
        String m51025m;
        boolean z11;
        if (livestreamData != null && (m51025m = livestreamData.m51025m()) != null) {
            if (C27417l.f129055a.m140378b().m51233f()) {
                this.f52929C0.mo53259G2(m51025m, "app_content_share", "messageZalo", C10299q.f52980q);
            } else {
                ShareBottomSheet.C9517b c9517b = ShareBottomSheet.Companion;
                if (this.f52934H0 == EnumC10286d.f52947s.m54491c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ShareBottomSheet m51920b = c9517b.m51920b(m51025m, z11);
                m51920b.m51914sL(new C10300r(livestreamData, m51025m));
                m51920b.m51757bL(true);
                BaseBottomSheetView.m51747hL(m51920b, m54457uL(), null, 2, null);
            }
            this.f52929C0.mo53264VA(livestreamData.m51016f(), livestreamData.m51010b().m50769l());
        }
    }

    /* renamed from: EL */
    public final void m54429EL(int i11) {
        CommentBox commentBox;
        C25002e2 c25002e2 = (C25002e2) m55556SK();
        if (c25002e2 != null && (commentBox = c25002e2.f119887q) != null) {
            if (i11 == 1) {
                AbstractC28684a.Companion.m143681o().mo146326a0(1);
                User m140378b = C27417l.f129055a.m140378b();
                CommentBox.m55665U(commentBox, new Comment.Identity(m140378b.m51234g(), 1, m140378b.m51235h(), m140378b.m51230c(), (String) null, (String) null, (String) null, (String) null, false, 240, (AbstractC19060k) null), false, false, 4, null);
            } else {
                Channel m140377a = C27417l.f129055a.m140377a();
                if (m140377a != null) {
                    commentBox.m55697T(new Comment.Identity(m140377a.m50769l(), 2, m140377a.m50775o(), m140377a.m50754c(), (String) null, (String) null, (String) null, (String) null, false, 240, (AbstractC19060k) null), false, false);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:            if (r0.intValue() >= 0) goto L23;     */
    /* renamed from: pL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LivestreamData m54452pL() {
        Integer num;
        C31178n c31178n;
        C9767c c9767c = this.f52931E0;
        if (c9767c != null) {
            num = Integer.valueOf(c9767c.m52682l());
        }
        num = null;
        if (num == null || (c31178n = this.f52930D0) == null) {
            return null;
        }
        return c31178n.m151827U(num);
    }

    /* renamed from: qL */
    private final LivestreamItem m54453qL() {
        C9767c c9767c = this.f52931E0;
        if (c9767c == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(c9767c.m52682l());
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        C9767c c9767c2 = this.f52931E0;
        if (c9767c2 == null) {
            return null;
        }
        return c9767c2.m52685o(intValue);
    }

    /* renamed from: rL */
    public static final void m54454rL(LivestreamData livestreamData, String str, LivestreamPageView livestreamPageView, int i11) {
        C9767c c9767c;
        LivestreamItem m52684n;
        AbstractC19074t.m100208f(livestreamData, "$item");
        AbstractC19074t.m100208f(str, "$liveId");
        AbstractC19074t.m100208f(livestreamPageView, "this$0");
        if (AbstractC19074t.m100204b(livestreamData.m51016f(), str) && (c9767c = livestreamPageView.f52931E0) != null && (m52684n = c9767c.m52684n()) != null) {
            m52684n.m52258r(i11);
        }
    }

    /* renamed from: sL */
    public final void m54455sL() {
        Map m131401f;
        C17487o0 mo35579p;
        C17507u0 m92998F;
        m55549OK(true);
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_floating_btn);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("from_item", 2));
        c19205a.m100713L(m92652XI, m131401f);
        FloatingManager.Companion.m53872n();
        StateManager.Companion.m53805i();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null && (m92998F = mo35579p.m92998F(ZChannelFloatingAnimView.class, true)) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("xAnim4View", 1);
            C17507u0 m93139f = m92998F.m93139f(bundle);
            if (m93139f != null) {
                m93139f.m93136a();
            }
        }
    }

    /* renamed from: tL */
    public final void m54456tL() {
        C9767c c9767c = this.f52931E0;
        if (c9767c != null) {
            c9767c.m52687q();
        }
        finish();
    }

    /* renamed from: uL */
    public final C17487o0 m54457uL() {
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

    /* renamed from: vL */
    public final boolean m54458vL() {
        try {
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            if (Settings.System.getInt(C26388b.m135977c(m92689tK), "accelerometer_rotation", 0) != 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: wL */
    public final void m54459wL(String str) {
        InterfaceC25792a interfaceC25792a;
        if (str != null && str.length() != 0 && (interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class))) != null) {
            InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, m92676n2(), str, this, null, null, null, null, 480, null);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: m20.k0.<init>(com.zing.zalo.shortvideo.ui.component.rv.snaper.c, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: zL */
    public final void m54460zL() {
        /*
            r4 = this;
            int r0 = r4.f52934H0
            com.zing.zalo.shortvideo.ui.view.LivestreamPageView$d r1 = com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView.EnumC10286d.f52947s
            int r1 = r1.m54491c()
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L4b
            r4.m54427CL(r3)
            m2.a r0 = r4.m55556SK()
            q10.e2 r0 = (q10.C25002e2) r0
            if (r0 == 0) goto L1f
            com.zing.zalo.shortvideo.ui.widget.CommentBox r0 = r0.f119887q
            if (r0 == 0) goto L1f
            r1 = 2
            r0.setMaxLinesInput(r1)
        L1f:
            m2.a r0 = r4.m55556SK()
            q10.e2 r0 = (q10.C25002e2) r0
            if (r0 == 0) goto L2e
            com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout r0 = r0.f119892v
            if (r0 == 0) goto L2e
            r0.m52548t0(r2)
        L2e:
            com.zing.zalo.shortvideo.ui.component.rv.snaper.c r0 = r4.f52931E0
            if (r0 == 0) goto L89
            int r1 = r0.m52682l()
            m2.a r2 = r4.m55556SK()
            q10.e2 r2 = (q10.C25002e2) r2
            if (r2 == 0) goto L89
            com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView r2 = r2.f119888r
            if (r2 == 0) goto L89
            m20.k0 r3 = new m20.k0
            r3.<init>()
            r2.post(r3)
            goto L89
        L4b:
            m2.a r0 = r4.m55556SK()
            q10.e2 r0 = (q10.C25002e2) r0
            if (r0 == 0) goto L5b
            com.zing.zalo.shortvideo.ui.widget.CommentBox r0 = r0.f119887q
            if (r0 == 0) goto L5b
            r1 = 4
            r0.setMaxLinesInput(r1)
        L5b:
            m2.a r0 = r4.m55556SK()
            q10.e2 r0 = (q10.C25002e2) r0
            if (r0 == 0) goto L6a
            com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout r0 = r0.f119892v
            if (r0 == 0) goto L6a
            r0.m52548t0(r3)
        L6a:
            r4.m54427CL(r2)
            com.zing.zalo.shortvideo.ui.component.rv.snaper.c r0 = r4.f52931E0
            if (r0 == 0) goto L89
            int r1 = r0.m52682l()
            m2.a r2 = r4.m55556SK()
            q10.e2 r2 = (q10.C25002e2) r2
            if (r2 == 0) goto L89
            com.zing.zalo.shortvideo.ui.widget.rv.OverScrollableRecyclerView r2 = r2.f119888r
            if (r2 == 0) goto L89
            m20.l0 r3 = new m20.l0
            r3.<init>()
            r2.post(r3)
        L89:
            m2.a r0 = r4.m55556SK()
            q10.e2 r0 = (q10.C25002e2) r0
            if (r0 == 0) goto L9a
            com.zing.zalo.shortvideo.ui.widget.CommentBox r0 = r0.f119887q
            if (r0 == 0) goto L9a
            r1 = 100
            r0.setMaxLength(r1)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView.m54460zL():void");
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: Bg */
    public void mo53932Bg() {
        C9767c c9767c = this.f52931E0;
        if (c9767c != null) {
            c9767c.m52679h();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        Drawable drawable;
        View mo35570g0;
        super.mo37111CJ(bundle);
        if (m92651WI().getConfiguration().smallestScreenWidthDp >= 600) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f52941O0 = z11;
        int requestedOrientation = m92692wK().getRequestedOrientation();
        this.f52932F0 = requestedOrientation;
        this.f52933G0 = requestedOrientation;
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35570g0 = m92676n2.mo35570g0()) != null) {
            drawable = mo35570g0.getBackground();
        } else {
            drawable = null;
        }
        this.f52936J0 = drawable;
        this.f52934H0 = m92651WI().getConfiguration().orientation;
        getLifecycle().mo9335a(this.f52929C0);
        this.f52929C0.mo52965Lb(this);
        this.f52929C0.mo52970uo(m92642L3());
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: Eg */
    public void mo54461Eg(boolean z11, Channel channel, Object obj) {
        C9767c c9767c;
        String str;
        Channel m51010b;
        List m131496e;
        LivestreamVideoLayout livestreamVideoLayout;
        int i11;
        AbstractC19074t.m100208f(channel, "channel");
        AbstractC19074t.m100208f(obj, "result");
        if (obj instanceof PersonalizeChannel) {
            String m50775o = channel.m50775o();
            if (m50775o != null && m50775o.length() != 0) {
                C25097t c25097t = C25097t.f120556a;
                Context context = getContext();
                if (z11) {
                    i11 = AbstractC27413h.zch_page_channel_follow_success;
                } else {
                    i11 = AbstractC27413h.zch_page_channel_unfollow_success;
                }
                c25097t.m130154o(context, m92653YI(i11, channel.m50775o()));
            }
            try {
                C31178n c31178n = this.f52930D0;
                if (c31178n == null || (c9767c = this.f52931E0) == null) {
                    return;
                }
                C25002e2 c25002e2 = (C25002e2) m55556SK();
                if (c25002e2 != null && (livestreamVideoLayout = c25002e2.f119892v) != null) {
                    livestreamVideoLayout.m52547s0(z11, channel);
                }
                Integer valueOf = Integer.valueOf(c9767c.m52682l());
                ProfileLivestreamBottomSheet profileLivestreamBottomSheet = null;
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    LivestreamData m151827U = c31178n.m151827U(Integer.valueOf(intValue));
                    if (m151827U != null && AbstractC19074t.m100204b(m151827U.m51010b().m50769l(), channel.m50769l())) {
                        m131496e = AbstractC25366r.m131496e("FOLLOW");
                        c31178n.m10010r(intValue, m131496e);
                    }
                    if (m151827U != null && (m51010b = m151827U.m51010b()) != null) {
                        str = m51010b.m50769l();
                    } else {
                        str = null;
                    }
                    if (AbstractC19074t.m100204b(str, channel.m50769l())) {
                        ZaloView m92996E0 = m92649TI().m92996E0(ProfileLivestreamBottomSheet.class.getCanonicalName());
                        if (m92996E0 instanceof ProfileLivestreamBottomSheet) {
                            profileLivestreamBottomSheet = (ProfileLivestreamBottomSheet) m92996E0;
                        }
                        if (profileLivestreamBottomSheet == null) {
                            return;
                        }
                        profileLivestreamBottomSheet.m51892oL(z11, true);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (obj instanceof Throwable) {
            if (obj instanceof LimitationReachedException) {
                C25097t.f120556a.m130154o(getContext(), ((LimitationReachedException) obj).getMessage());
            } else {
                C25097t.f120556a.m130155r(getContext(), (Throwable) obj);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        C9767c c9767c = this.f52931E0;
        if (c9767c != null) {
            c9767c.m52687q();
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: Le */
    public void mo54462Le(String str, String str2) {
        LivestreamItem m52684n;
        String str3;
        String str4;
        LivestreamVideoLayout livestreamVideoLayout;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "streamUrl");
        C9767c c9767c = this.f52931E0;
        if (c9767c != null && (m52684n = c9767c.m52684n()) != null) {
            LivestreamData currentStream = m52684n.getCurrentStream();
            String str5 = null;
            if (currentStream != null) {
                str3 = currentStream.m51016f();
            } else {
                str3 = null;
            }
            if (AbstractC19074t.m100204b(str3, str)) {
                LivestreamData currentStream2 = m52684n.getCurrentStream();
                if (currentStream2 != null) {
                    str4 = currentStream2.m51030t();
                } else {
                    str4 = null;
                }
                if (str4 == null || str4.length() == 0) {
                    LivestreamData currentStream3 = m52684n.getCurrentStream();
                    if (currentStream3 != null) {
                        str5 = currentStream3.m51030t();
                    }
                    if (!AbstractC19074t.m100204b(str5, str2)) {
                        C25002e2 c25002e2 = (C25002e2) m55556SK();
                        if (c25002e2 != null && (livestreamVideoLayout = c25002e2.f119892v) != null) {
                            livestreamVideoLayout.m52550x0(str2, str);
                        }
                        m52684n.m52251J0(str2, str);
                    }
                }
            }
            C31178n c31178n = this.f52930D0;
            if (c31178n != null) {
                c31178n.m151838f0(str, str2);
            }
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: Mk */
    public void mo54463Mk(String str) {
        LivestreamItem m54453qL;
        LivestreamData m54452pL = m54452pL();
        if (m54452pL == null || mo60294yp() || !AbstractC19074t.m100204b(m54452pL.m51016f(), str) || (m54453qL = m54453qL()) == null) {
            return;
        }
        m54453qL.m52253o0();
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(LivestreamPageView.class, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        LivestreamData livestreamData;
        super.mo39032PJ();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (livestreamData = (LivestreamData) m92642L3.getParcelable("RESERVED_VIDEO")) != null) {
            this.f52929C0.mo53263Oy(livestreamData.m51016f(), new C10289g(), new C10290h());
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: Pg */
    public void mo54464Pg(String str, InteractEventResponse.InteractItem interactItem) {
        C9767c c9767c;
        LivestreamItem m52684n;
        String str2;
        AbstractC19074t.m100208f(interactItem, "item");
        if (!mo60294yp() && (c9767c = this.f52931E0) != null && (m52684n = c9767c.m52684n()) != null) {
            LivestreamData m54452pL = m54452pL();
            if (m54452pL != null) {
                str2 = m54452pL.m51016f();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str, str2)) {
                m52684n.m52259s(str, interactItem);
            }
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: Sz */
    public void mo54465Sz(String str, String str2) {
        C9767c c9767c;
        LivestreamItem m52684n;
        String str3;
        AbstractC19074t.m100208f(str2, "statusMsg");
        if (!mo60294yp() && (c9767c = this.f52931E0) != null && (m52684n = c9767c.m52684n()) != null) {
            LivestreamData m54452pL = m54452pL();
            if (m54452pL != null) {
                str3 = m54452pL.m51016f();
            } else {
                str3 = null;
            }
            if (AbstractC19074t.m100204b(str3, str)) {
                m52684n.m52250I0(str2);
            }
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        C25002e2 c25002e2;
        LoadingLayout loadingLayout;
        View mo35570g0;
        C25002e2 c25002e22;
        LivestreamVideoLayout livestreamVideoLayout;
        super.mo37584UJ();
        C31178n c31178n = this.f52930D0;
        if (c31178n != null && c31178n.mo151443L() && (c25002e22 = (C25002e2) m55556SK()) != null && (livestreamVideoLayout = c25002e22.f119892v) != null) {
            livestreamVideoLayout.m52545q0();
        }
        if (this.f52932F0 != this.f52933G0) {
            this.f52940N0 = true;
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.setRequestedOrientation(this.f52933G0);
            }
        }
        InterfaceC27218a m92676n22 = m92676n2();
        if (m92676n22 != null && (mo35570g0 = m92676n22.mo35570g0()) != null) {
            mo35570g0.setBackgroundColor(-16777216);
        }
        if (this.f52942P0) {
            this.f52942P0 = false;
            C9767c c9767c = this.f52931E0;
            if (c9767c != null) {
                c9767c.m52679h();
            }
        }
        if (!this.f52943Q0) {
            C31178n c31178n2 = this.f52930D0;
            if (c31178n2 != null && !c31178n2.mo151443L() && (c25002e2 = (C25002e2) m55556SK()) != null && (loadingLayout = c25002e2.f119890t) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10056d.a.m53674a(this.f52929C0, null, 1, null);
        }
        C20196i c20196i = this.f52935I0;
        if (c20196i != null) {
            C20196i.m105317q(c20196i, null, 1, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        View view;
        super.mo37712VJ();
        if (this.f52932F0 != this.f52933G0 && (!this.f52941O0 || !m54458vL())) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.setRequestedOrientation(this.f52932F0);
            }
            m54427CL(true);
        }
        InterfaceC27218a m92676n22 = m92676n2();
        if (m92676n22 != null) {
            view = m92676n22.mo35570g0();
        } else {
            view = null;
        }
        if (view != null) {
            view.setBackground(this.f52936J0);
        }
        C9767c c9767c = this.f52931E0;
        if (c9767c != null && c9767c.m52686p()) {
            C9767c c9767c2 = this.f52931E0;
            if (c9767c2 != null) {
                c9767c2.m52680j();
            }
            this.f52942P0 = true;
        }
        C25002e2 c25002e2 = (C25002e2) m55556SK();
        if (c25002e2 != null) {
            C31178n c31178n = this.f52930D0;
            if (c31178n != null) {
                c31178n.m151445N();
            }
            c25002e2.f119890t.m55781c();
        }
        C20196i c20196i = this.f52935I0;
        if (c20196i != null) {
            c20196i.m105321s();
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: W0 */
    public void mo54466W0(boolean z11) {
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: Xo */
    public void mo54467Xo(String str, Long l11) {
        C9767c c9767c;
        LivestreamItem m52684n;
        String str2;
        LivestreamVideoLayout livestreamVideoLayout;
        AbstractC19074t.m100208f(str, "liveId");
        if (!mo60294yp() && l11 != null && (c9767c = this.f52931E0) != null && (m52684n = c9767c.m52684n()) != null) {
            LivestreamData m54452pL = m54452pL();
            if (m54452pL != null) {
                str2 = m54452pL.m51016f();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str2, str)) {
                m54452pL.m50990F(l11);
                m52684n.m52248H(str, l11);
                m52684n.m52247F();
                C25002e2 c25002e2 = (C25002e2) m55556SK();
                if (c25002e2 != null && (livestreamVideoLayout = c25002e2.f119892v) != null) {
                    livestreamVideoLayout.m52546r0(l11.longValue());
                }
            }
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: YB */
    public void mo54468YB(String str, Boolean bool, Boolean bool2) {
        LivestreamItem m54453qL;
        LivestreamData m54452pL = m54452pL();
        if (m54452pL == null || mo60294yp() || !AbstractC19074t.m100204b(m54452pL.m51016f(), str) || (m54453qL = m54453qL()) == null) {
            return;
        }
        m54452pL.m51000S(bool);
        m54453qL.m52247F();
        m54452pL.m51001T(bool2);
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: ZD */
    public void mo54469ZD(List list) {
        C9767c c9767c;
        LivestreamItem m52684n;
        String str;
        Object m131206f0;
        Long m51644b;
        AbstractC19074t.m100208f(list, "comment");
        if (!mo60294yp() && (c9767c = this.f52931E0) != null && (m52684n = c9767c.m52684n()) != null) {
            LivestreamData m54452pL = m54452pL();
            String str2 = null;
            if (m54452pL != null) {
                str = m54452pL.m51016f();
            } else {
                str = null;
            }
            m131206f0 = AbstractC25332a0.m131206f0(list);
            GetCommentLiveRes.CommentData commentData = (GetCommentLiveRes.CommentData) m131206f0;
            if (commentData != null && (m51644b = commentData.m51644b()) != null) {
                str2 = m51644b.toString();
            }
            if (AbstractC19074t.m100204b(str, str2)) {
                m52684n.m52252n(list);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        ZVideoView zVideoView;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m54460zL();
        C25002e2 c25002e2 = (C25002e2) m55556SK();
        if (c25002e2 != null) {
            c25002e2.f119892v.setIsStreamDetail(true);
            LivestreamData mo53277xv = this.f52929C0.mo53277xv();
            InterfaceC10284b interfaceC10284b = this.f52928B0;
            if (interfaceC10284b != null) {
                zVideoView = interfaceC10284b.mo54487a();
            } else {
                zVideoView = null;
            }
            if (zVideoView != null && mo53277xv != null && mo53277xv.m50988C()) {
                c25002e2.f119890t.m55781c();
                LivestreamVideoLayout livestreamVideoLayout = c25002e2.f119892v;
                AbstractC19074t.m100207e(livestreamVideoLayout, "lytVideo");
                AbstractC26112n.m134431w0(livestreamVideoLayout);
                c25002e2.f119892v.setReservedView(zVideoView);
                c25002e2.f119892v.setCurrentStreamData(mo53277xv);
                c25002e2.f119892v.setBlurBackground(mo53277xv);
                mo54473cp(mo53277xv);
            } else {
                mo53277xv = null;
            }
            OverScrollableRecyclerView overScrollableRecyclerView = c25002e2.f119888r;
            AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
            LivestreamVideoLayout livestreamVideoLayout2 = c25002e2.f119892v;
            AbstractC19074t.m100207e(livestreamVideoLayout2, "lytVideo");
            C3212b c3212b = new C3212b();
            c3212b.mo10397b(c25002e2.f119888r);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C9767c c9767c = new C9767c(overScrollableRecyclerView, livestreamVideoLayout2, c3212b, mo53277xv);
            c9767c.m52690t(new C10291i(c25002e2));
            this.f52931E0 = c9767c;
            c25002e2.f119892v.setErrorAction(new C10292j());
            c25002e2.f119887q.setCallback(new C10293k(c25002e2));
            c25002e2.f119887q.setRecentEmojiEnable(false);
            this.f52935I0 = new C20196i(this, false, new C10294l(c25002e2), 2, null);
            C31178n c31178n = new C31178n("", null, 2, null);
            c31178n.m151834b0(new C10295m(c25002e2));
            this.f52930D0 = c31178n;
            C31178n c31178n2 = this.f52937K0;
            if (c31178n2 != null) {
                AbstractC19074t.m100205c(c31178n2);
                c31178n.m151833a0(c31178n2);
            }
            OverScrollableRecyclerView overScrollableRecyclerView2 = c25002e2.f119888r;
            overScrollableRecyclerView2.setAdapter(this.f52930D0);
            overScrollableRecyclerView2.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(overScrollableRecyclerView2.getContext()) { // from class: com.zing.zalo.shortvideo.ui.view.LivestreamPageView$onViewCreated$1$7$1

                /* renamed from: J */
                private final int f52973J;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LivestreamPageView$onViewCreated$1$7$1(Context context) {
                    super(context, 0, false, true, 6, null);
                    AbstractC19074t.m100205c(context);
                    this.f52973J = Resources.getSystem().getDisplayMetrics().heightPixels;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* renamed from: K1 */
                public void mo9731K1(RecyclerView.C1899z c1899z, int[] iArr) {
                    AbstractC19074t.m100208f(c1899z, "state");
                    AbstractC19074t.m100208f(iArr, "extraLayoutSpace");
                    int i11 = this.f52973J;
                    iArr[0] = i11;
                    iArr[1] = i11;
                }
            });
            AbstractC19074t.m100205c(overScrollableRecyclerView2);
            OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView2, new C10296n(), 0.0f, 2, null);
            if (this.f52937K0 != null) {
                int i11 = this.f52938L0;
                if (i11 != -1) {
                    c25002e2.f119888r.m9837K1(i11);
                }
                LivestreamVideoLayout livestreamVideoLayout3 = c25002e2.f119892v;
                AbstractC19074t.m100207e(livestreamVideoLayout3, "lytVideo");
                AbstractC26112n.m134431w0(livestreamVideoLayout3);
                this.f52943Q0 = true;
            }
            c25002e2.getRoot().setCallback(new C10297o());
            view.post(new Runnable() { // from class: m20.m0
                public /* synthetic */ RunnableC22770m0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LivestreamPageView.this.mo53932Bg();
                }
            });
            m54429EL(1);
            c25002e2.getRoot().setBackgroundResource(AbstractC27406a.zch_surface_background);
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: a8 */
    public void mo54470a8(String str, String str2, int i11) {
        LivestreamData m54452pL;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(str2, "channelId");
        if (mo60294yp() || (m54452pL = m54452pL()) == null) {
            return;
        }
        this.f52929C0.mo53279zx(str, str2, i11);
        AbstractC19444a.m101697e(new Runnable() { // from class: m20.n0

            /* renamed from: q */
            public final /* synthetic */ String f111361q;

            /* renamed from: r */
            public final /* synthetic */ LivestreamPageView f111362r;

            /* renamed from: s */
            public final /* synthetic */ int f111363s;

            public /* synthetic */ RunnableC22774n0(String str3, LivestreamPageView this, int i112) {
                r2 = str3;
                r3 = this;
                r4 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LivestreamPageView.m54454rL(LivestreamData.this, r2, r3, r4);
            }
        });
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: aB */
    public void mo54471aB(String str, InteractEventResponse.InteractItem interactItem) {
        C9767c c9767c;
        LivestreamItem m52684n;
        String str2;
        AbstractC19074t.m100208f(interactItem, "item");
        if (!mo60294yp() && (c9767c = this.f52931E0) != null && (m52684n = c9767c.m52684n()) != null) {
            LivestreamData m54452pL = m54452pL();
            if (m54452pL != null) {
                str2 = m54452pL.m51016f();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str, str2)) {
                m52684n.m52254p(interactItem);
            }
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: b */
    public void mo54472b(boolean z11) {
        C25002e2 c25002e2;
        LoadingLayout loadingLayout;
        if (!z11) {
            C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_error_no_connection);
            return;
        }
        if (!this.f52943Q0) {
            C31178n c31178n = this.f52930D0;
            if (c31178n != null && !c31178n.mo151443L() && (c25002e2 = (C25002e2) m55556SK()) != null && (loadingLayout = c25002e2.f119890t) != null) {
                loadingLayout.m55786j();
            }
            InterfaceC10056d.a.m53674a(this.f52929C0, null, 1, null);
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: cp */
    public void mo54473cp(LivestreamData livestreamData) {
        LivestreamVideoLayout livestreamVideoLayout;
        LoadingLayout loadingLayout;
        LoadingLayout loadingLayout2;
        ArrayList m131500h;
        LivestreamVideoLayout livestreamVideoLayout2;
        AbstractC19074t.m100208f(livestreamData, "stream");
        C25002e2 c25002e2 = (C25002e2) m55556SK();
        if (c25002e2 != null && (livestreamVideoLayout2 = c25002e2.f119892v) != null) {
            LivestreamVideoLayout.m52521w0(livestreamVideoLayout2, livestreamData.m51029q(), false, 2, null);
        }
        C31178n c31178n = this.f52930D0;
        if (c31178n != null && c31178n.mo151443L()) {
            C31178n c31178n2 = this.f52930D0;
            if (c31178n2 != null && AbstractC19074t.m100204b(c31178n2.m151826T(0).m51016f(), livestreamData.m51016f())) {
                c31178n2.m151836d0(livestreamData);
                return;
            }
            return;
        }
        C31178n c31178n3 = this.f52930D0;
        if (c31178n3 != null) {
            m131500h = AbstractC25368s.m131500h(livestreamData);
            c31178n3.m151835c0(new Section(m131500h, 0L, (LoadMoreInfo) null, 6, (AbstractC19060k) null));
            c31178n3.m10008p();
        }
        C25002e2 c25002e22 = (C25002e2) m55556SK();
        if (c25002e22 != null && (loadingLayout2 = c25002e22.f119890t) != null) {
            loadingLayout2.m55781c();
        }
        C25002e2 c25002e23 = (C25002e2) m55556SK();
        if (c25002e23 != null && (loadingLayout = c25002e23.f119890t) != null) {
            loadingLayout.m55780b();
        }
        C25002e2 c25002e24 = (C25002e2) m55556SK();
        if (c25002e24 != null && (livestreamVideoLayout = c25002e24.f119892v) != null) {
            AbstractC26112n.m134431w0(livestreamVideoLayout);
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: d */
    public void mo54474d(Throwable th2) {
        LoadingLayout loadingLayout;
        LoadingLayout loadingLayout2;
        LivestreamVideoLayout livestreamVideoLayout;
        LivestreamVideoLayout livestreamVideoLayout2;
        LoadingLayout loadingLayout3;
        AbstractC19074t.m100208f(th2, "throwable");
        C31178n c31178n = this.f52930D0;
        if (c31178n != null && !c31178n.mo151443L()) {
            if (th2 instanceof NetworkException) {
                C25002e2 c25002e2 = (C25002e2) m55556SK();
                if (c25002e2 != null && (loadingLayout3 = c25002e2.f119890t) != null) {
                    loadingLayout3.m55784g(new C10287e());
                }
            } else {
                C25002e2 c25002e22 = (C25002e2) m55556SK();
                if (c25002e22 != null && (loadingLayout2 = c25002e22.f119890t) != null) {
                    loadingLayout2.m55783f(new C10288f());
                }
            }
            C25002e2 c25002e23 = (C25002e2) m55556SK();
            if (c25002e23 != null && (livestreamVideoLayout2 = c25002e23.f119892v) != null) {
                livestreamVideoLayout2.m52543m0();
            }
            C25002e2 c25002e24 = (C25002e2) m55556SK();
            if (c25002e24 != null && (livestreamVideoLayout = c25002e24.f119892v) != null) {
                AbstractC26112n.m134374O(livestreamVideoLayout);
            }
            C9767c c9767c = this.f52931E0;
            if (c9767c != null) {
                c9767c.m52688r();
            }
        } else {
            C25097t.f120556a.m130155r(getContext(), th2);
        }
        C31178n c31178n2 = this.f52930D0;
        if (c31178n2 != null) {
            c31178n2.m151445N();
        }
        C25002e2 c25002e25 = (C25002e2) m55556SK();
        if (c25002e25 != null && (loadingLayout = c25002e25.f119890t) != null) {
            loadingLayout.m55781c();
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: d0 */
    public void mo53934d0() {
        InterfaceC18189c.a.m96943a(this);
    }

    @Override // e20.InterfaceC18187a
    public void deactivate() {
        C9767c c9767c = this.f52931E0;
        if (c9767c != null) {
            c9767c.m52680j();
        }
        this.f52942P0 = false;
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: dy */
    public void mo54475dy(String str, long j11, long j12) {
        LivestreamData m54452pL;
        C9767c c9767c;
        LivestreamItem m52684n;
        AbstractC19074t.m100208f(str, "liveId");
        if (!mo60294yp() && (m54452pL = m54452pL()) != null && AbstractC19074t.m100204b(m54452pL.m51016f(), str) && (c9767c = this.f52931E0) != null && (m52684n = c9767c.m52684n()) != null) {
            m52684n.m52249H0(j11, j12);
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: e5 */
    public void mo54476e5(Section section) {
        LivestreamVideoLayout livestreamVideoLayout;
        LivestreamVideoLayout livestreamVideoLayout2;
        LoadingLayout loadingLayout;
        AbstractC19074t.m100208f(section, "section");
        C31178n c31178n = this.f52930D0;
        if (c31178n != null && c31178n.mo151443L()) {
            C31178n c31178n2 = this.f52930D0;
            if (c31178n2 != null) {
                c31178n2.m151445N();
                int mo10003k = c31178n2.mo10003k();
                c31178n2.m151824R(section);
                int mo10003k2 = c31178n2.mo10003k() - mo10003k;
                if (mo10003k2 > 0) {
                    c31178n2.m10015w(mo10003k, mo10003k2);
                }
            }
        } else {
            C31178n c31178n3 = this.f52930D0;
            if (c31178n3 != null) {
                c31178n3.m151445N();
                c31178n3.m151835c0(section);
                c31178n3.m10008p();
            }
        }
        C31178n c31178n4 = this.f52930D0;
        if (c31178n4 != null) {
            c31178n4.m151445N();
        }
        C31178n c31178n5 = this.f52930D0;
        if (c31178n5 != null && c31178n5.mo151443L()) {
            C25002e2 c25002e2 = (C25002e2) m55556SK();
            if (c25002e2 != null && (loadingLayout = c25002e2.f119890t) != null) {
                loadingLayout.m55781c();
            }
            C25002e2 c25002e22 = (C25002e2) m55556SK();
            if (c25002e22 != null && (livestreamVideoLayout2 = c25002e22.f119892v) != null) {
                AbstractC26112n.m134431w0(livestreamVideoLayout2);
            }
        } else {
            C25002e2 c25002e23 = (C25002e2) m55556SK();
            if (c25002e23 != null && (livestreamVideoLayout = c25002e23.f119892v) != null) {
                AbstractC26112n.m134374O(livestreamVideoLayout);
            }
        }
        this.f52943Q0 = true;
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: ec */
    public void mo54477ec(String str, List list) {
        String str2;
        C9767c c9767c;
        LivestreamItem m52684n;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(list, "comment");
        LivestreamData m54452pL = m54452pL();
        if (m54452pL != null) {
            str2 = m54452pL.m51016f();
        } else {
            str2 = null;
        }
        if (AbstractC19074t.m100204b(str2, str) && (c9767c = this.f52931E0) != null && (m52684n = c9767c.m52684n()) != null) {
            m52684n.m52245B0(list);
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: gs */
    public void mo54478gs(String str) {
        if (!mo60294yp() && str != null && str.length() != 0) {
            C25097t.f120556a.m130154o(m92689tK(), str);
        }
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: ho */
    public void mo54479ho(String str, List list) {
        List list2;
        LivestreamItem m54453qL;
        LivestreamData m54452pL = m54452pL();
        if (m54452pL == null || mo60294yp() || !AbstractC19074t.m100204b(m54452pL.m51016f(), str) || (list2 = list) == null || list2.isEmpty() || (m54453qL = m54453qL()) == null) {
            return;
        }
        m54453qL.m52266z(str, list);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView.InterfaceC10622a
    /* renamed from: lz */
    public boolean mo53979lz() {
        return true;
    }

    @Override // e20.InterfaceC18189c
    /* renamed from: ni */
    public void mo54480ni() {
        InterfaceC18189c.a.m96944b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        Section m151828V;
        List m51168m;
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            LivestreamData livestreamData = (LivestreamData) m92642L3.getParcelable("RESERVED_VIDEO");
            if (livestreamData != null) {
                C31178n c31178n = this.f52930D0;
                LivestreamData livestreamData2 = null;
                if (c31178n != null && (m151828V = c31178n.m151828V()) != null && (m51168m = m151828V.m51168m()) != null) {
                    Iterator it = m51168m.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (AbstractC19074t.m100204b(((LivestreamData) next).m51016f(), livestreamData.m51016f())) {
                            livestreamData2 = next;
                            break;
                        }
                    }
                    livestreamData2 = livestreamData2;
                }
                if (livestreamData2 == null) {
                    AbstractC19074t.m100205c(livestreamData);
                } else {
                    livestreamData = livestreamData2;
                }
                bVar.m111023b(1, livestreamData);
            }
            Object obj = this.f52930D0;
            if (obj != null) {
                bVar.m111023b(2, obj);
            }
            C9767c c9767c = this.f52931E0;
            if (c9767c != null) {
                bVar.m111023b(3, Integer.valueOf(c9767c.m52683m()));
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        this.f52934H0 = configuration.orientation;
        m54460zL();
        if (this.f52939M0) {
            this.f52939M0 = false;
            m54455sL();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        CommentBox commentBox;
        if (i11 == 4) {
            if (super.onKeyUp(i11, keyEvent)) {
                return true;
            }
            if (this.f52941O0 && m54458vL() && this.f52934H0 == EnumC10286d.f52947s.m54491c()) {
                m54483xL();
                m54456tL();
            }
            if (this.f52934H0 == EnumC10286d.f52947s.m54491c()) {
                m54483xL();
                return true;
            }
            C25002e2 c25002e2 = (C25002e2) m55556SK();
            if (c25002e2 != null && (commentBox = c25002e2.f119887q) != null && commentBox.m55692C()) {
                C25002e2 c25002e22 = (C25002e2) m55556SK();
                if (c25002e22 != null) {
                    c25002e22.f119887q.m55703x();
                    CommentBox commentBox2 = c25002e22.f119887q;
                    AbstractC19074t.m100207e(commentBox2, "boxComment");
                    AbstractC26112n.m134374O(commentBox2);
                }
                return true;
            }
            m54456tL();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(48);
        }
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        LivestreamData livestreamData;
        C31178n c31178n;
        int i11;
        AbstractC19074t.m100208f(bVar, "extras");
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            Object m111022a = bVar.m111022a(1);
            Integer num = null;
            if (m111022a instanceof LivestreamData) {
                livestreamData = (LivestreamData) m111022a;
            } else {
                livestreamData = null;
            }
            AbstractC26102d.m134326a(m92642L3, "RESERVED_VIDEO", livestreamData);
            Object m111022a2 = bVar.m111022a(2);
            if (m111022a2 instanceof C31178n) {
                c31178n = (C31178n) m111022a2;
            } else {
                c31178n = null;
            }
            this.f52937K0 = c31178n;
            Object m111022a3 = bVar.m111022a(3);
            if (m111022a3 instanceof Integer) {
                num = (Integer) m111022a3;
            }
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = -1;
            }
            this.f52938L0 = i11;
        }
    }

    @Override // e20.InterfaceC18187a
    /* renamed from: r4 */
    public void mo53937r4() {
        InterfaceC18189c.a.m96945c(this);
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: sg */
    public void mo54481sg(LiveChanelStats liveChanelStats) {
        boolean m50741Q;
        boolean z11;
        AbstractC19074t.m100208f(liveChanelStats, "stats");
        LivestreamData m54452pL = m54452pL();
        if (m54452pL == null) {
            return;
        }
        Channel m51010b = m54452pL.m51010b();
        if (liveChanelStats.m51602d() == null || AbstractC19074t.m100204b(m54452pL.m51016f(), liveChanelStats.m51602d())) {
            ProfileLivestreamBottomSheet.C9510b c9510b = ProfileLivestreamBottomSheet.Companion;
            String m50754c = m51010b.m50754c();
            Boolean m51605g = liveChanelStats.m51605g();
            if (m51605g != null) {
                m50741Q = m51605g.booleanValue();
            } else {
                m50741Q = m51010b.m50741Q();
            }
            boolean z12 = m50741Q;
            String m50775o = m51010b.m50775o();
            if (!liveChanelStats.m51604f()) {
                liveChanelStats = LiveChanelStats.Companion.m51609a(m51010b);
            }
            LiveChanelStats liveChanelStats2 = liveChanelStats;
            if (this.f52934H0 == EnumC10286d.f52947s.m54491c()) {
                z11 = true;
            } else {
                z11 = false;
            }
            ProfileLivestreamBottomSheet m51895a = c9510b.m51895a(m50754c, z12, m50775o, liveChanelStats2, z11);
            m51895a.m51893rL(new C10298p(m54452pL, m51010b));
            C17487o0 m92649TI = m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            m51895a.m51762gL(m92649TI, ProfileLivestreamBottomSheet.class.getCanonicalName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    @Override // m20.InterfaceC22758j0
    /* renamed from: xD */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9440a mo54482xD(GetCommentLiveRes.CommentData commentData) {
        C9767c c9767c;
        LivestreamItem m52684n;
        C9440a c9440a;
        C25002e2 c25002e2;
        String str;
        String str2;
        if (mo60294yp() || (c9767c = this.f52931E0) == null || (m52684n = c9767c.m52684n()) == null) {
            return null;
        }
        if (commentData != null) {
            LivestreamData m54452pL = m54452pL();
            if (m54452pL != null) {
                str = m54452pL.m51016f();
            } else {
                str = null;
            }
            Long m51644b = commentData.m51644b();
            if (m51644b != null) {
                str2 = m51644b.toString();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str, str2)) {
                c9440a = m52684n.m52256q(commentData);
                c25002e2 = (C25002e2) m55556SK();
                if (c25002e2 != null) {
                    return null;
                }
                c25002e2.f119887q.m55691B();
                c25002e2.f119887q.m55702w();
                m52684n.setFooterText("");
                return c9440a;
            }
        }
        c9440a = null;
        c25002e2 = (C25002e2) m55556SK();
        if (c25002e2 != null) {
        }
    }

    /* renamed from: xL */
    public final void m54483xL() {
        int i11;
        if (this.f52934H0 != EnumC10286d.f52947s.m54491c()) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.setRequestedOrientation(0);
            }
            this.f52933G0 = 0;
            return;
        }
        if (this.f52941O0 && m54458vL()) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        InterfaceC27218a m92676n22 = m92676n2();
        if (m92676n22 != null) {
            m92676n22.setRequestedOrientation(i11);
        }
        this.f52933G0 = i11;
    }

    @Override // m20.InterfaceC22758j0
    /* renamed from: y7 */
    public void mo54484y7(String str, EnumC24601e enumC24601e, Long l11, Long l12) {
        LivestreamItem m52684n;
        String str2;
        LivestreamData currentStream;
        LivestreamData livestreamData;
        String str3;
        LivestreamVideoLayout livestreamVideoLayout;
        AbstractC19074t.m100208f(str, "liveId");
        AbstractC19074t.m100208f(enumC24601e, "status");
        C9767c c9767c = this.f52931E0;
        if (c9767c != null && (m52684n = c9767c.m52684n()) != null) {
            LivestreamData currentStream2 = m52684n.getCurrentStream();
            String str4 = null;
            if (currentStream2 != null) {
                str2 = currentStream2.m51016f();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str2, str) && ((currentStream = m52684n.getCurrentStream()) == null || currentStream.m51029q() != enumC24601e.m128090c())) {
                if (enumC24601e == EnumC24601e.f118374s && this.f52934H0 == EnumC10286d.f52947s.m54491c()) {
                    m54483xL();
                }
                C25002e2 c25002e2 = (C25002e2) m55556SK();
                if (c25002e2 != null && (livestreamVideoLayout = c25002e2.f119892v) != null) {
                    AbstractC19074t.m100205c(livestreamVideoLayout);
                    LivestreamVideoLayout.m52521w0(livestreamVideoLayout, enumC24601e.m128090c(), false, 2, null);
                }
                LivestreamItem.m52189F0(m52684n, enumC24601e.m128090c(), l11, l12, false, 8, null);
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null) {
                    livestreamData = (LivestreamData) m92642L3.getParcelable("RESERVED_VIDEO");
                } else {
                    livestreamData = null;
                }
                if (livestreamData != null) {
                    str4 = livestreamData.m51016f();
                }
                if (AbstractC19074t.m100204b(str4, str)) {
                    LivestreamReceiver.C10078a c10078a = LivestreamReceiver.Companion;
                    int m128090c = enumC24601e.m128090c();
                    LivestreamData currentStream3 = m52684n.getCurrentStream();
                    if (currentStream3 == null || (str3 = currentStream3.m51030t()) == null) {
                        str3 = "";
                    }
                    c10078a.m53729a(str, m128090c, str3);
                }
            }
            C31178n c31178n = this.f52930D0;
            if (c31178n != null) {
                c31178n.m151837e0(str, enumC24601e.m128090c(), l11, l12);
            }
        }
    }

    /* renamed from: yL */
    public final void m54485yL(InterfaceC10284b interfaceC10284b) {
        this.f52928B0 = interfaceC10284b;
    }
}
