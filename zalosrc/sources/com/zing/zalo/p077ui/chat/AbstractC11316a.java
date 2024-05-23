package com.zing.zalo.p077ui.chat;

import ag0.C0833n0;
import am.AbstractC0906d0;
import am.AbstractC0924m0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2346f0;
import bo.C3020p0;
import c30.C3229a;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsErrorCode;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.AbstractC11316a;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.chatrow.ChatEmptyView;
import com.zing.zalo.p077ui.chat.chatrow.ChatLeftRichMessageMC;
import com.zing.zalo.p077ui.chat.chatrow.ChatMessageBase;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowBankCardOffline;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowCallTime;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowCollapsedMsgInfoGroup;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowDoodle;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowE2eeDecryptedFailed;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowE2eeEcardMsgInfo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowEcard;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowEcardInfo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowFile;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowGame;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowGif;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowGroupCall;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowLiveLocation;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowLocation;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMediaLink;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgFeed;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgInfo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiPhotos;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiStickers;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowPhoto;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowPhotoSticker;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendContact;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLink;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkMp3;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkPage;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkProductCatalog;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendSticker;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowSectionDivider;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowShortVideo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowShortVideoProfile;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowText;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowUnSupport;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowUndo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoGifInline;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoLiveStream;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoMask;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoOALink;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVoice;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContent;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContentPlus;
import com.zing.zalo.p077ui.chat.chatrow.E2eeDefaultHeaderView;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11530v;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.SuggestionTimeSpan;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17958e1;
import dj.C17961f1;
import dj.C17967h1;
import dj.C17969i0;
import dj.C17984n0;
import dj.C18009w0;
import dj.C18011x0;
import dj.C18013y0;
import en0.InterfaceC18494a;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import me0.AbstractC23056e6;
import me0.AbstractC23069f8;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p056cj.C3535c;
import p105dn.EnumC18030a;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p461qu.AbstractC25495a;
import p511sw.C26393b;
import p647xj.C29675a;
import p647xj.C29680f;
import p684yk.InterfaceC31005a;
import p716zh.C32091r6;
import p716zh.C32098s;
import pm0.C24848g0;
import th.AbstractC26689j;
import tj.C26712d;
import tj.C26713e;
import vg.C28176r6;
import w50.C28769a;
import w50.C28771c;
import ws.C29210k;
import y50.InterfaceC30793c;

/* renamed from: com.zing.zalo.ui.chat.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11316a extends RecyclerView.AbstractC1880g {

    /* renamed from: M */
    private static final String f57007M = "a";

    /* renamed from: F */
    private a f57013F;

    /* renamed from: G */
    private InterfaceC30793c f57014G;

    /* renamed from: v */
    protected Conversation f57024v;

    /* renamed from: x */
    protected C3535c f57026x;

    /* renamed from: r */
    protected final int[] f57020r = {-65536, -32768, -256, -34182, -16711936, -65408, -65281, -8388353, -16776961, -16744193, -13312, -6724096, -8349440, -13395712, -10072781, -16744295, -6750080, -10092391, -15073127, -16764007, -11717786, -7452530, -5217360, -10066381, -10243997, -13108, -11382017, -7368705, -3348737, -3342388};

    /* renamed from: s */
    protected int[] f57021s = null;

    /* renamed from: t */
    protected HashMap f57022t = new HashMap();

    /* renamed from: u */
    protected int f57023u = 0;

    /* renamed from: w */
    protected int f57025w = 0;

    /* renamed from: y */
    protected int f57027y = 0;

    /* renamed from: z */
    protected int f57028z = 0;

    /* renamed from: A */
    protected int f57008A = 0;

    /* renamed from: B */
    protected List f57009B = new ArrayList();

    /* renamed from: C */
    protected final Map f57010C = new HashMap();

    /* renamed from: D */
    private boolean f57011D = false;

    /* renamed from: E */
    private boolean f57012E = false;

    /* renamed from: H */
    protected MessageId f57015H = null;

    /* renamed from: I */
    protected MessageId f57016I = null;

    /* renamed from: J */
    protected InterfaceC31005a f57017J = AbstractC23306f.m120726x1();

    /* renamed from: K */
    protected long f57018K = AbstractC23306f.m120579F1().mo124314i();

    /* renamed from: L */
    protected Map f57019L = new HashMap();

    /* renamed from: com.zing.zalo.ui.chat.a$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: A */
        boolean mo60394A(String str, MessageId messageId);

        /* renamed from: O0 */
        void mo60395O0(int i11, String str, MessageId messageId);

        /* renamed from: P0 */
        void mo60396P0(ChatRow chatRow);

        /* renamed from: Q0 */
        void mo60397Q0();

        /* renamed from: R0 */
        boolean mo60398R0();

        /* renamed from: S */
        boolean mo60399S(C17945a0 c17945a0);

        /* renamed from: S0 */
        boolean mo60400S0(String str);

        /* renamed from: T0 */
        void mo60401T0();

        /* renamed from: h0 */
        boolean mo60402h0(C17945a0 c17945a0);

        /* renamed from: i0 */
        void mo60403i0();

        /* renamed from: j */
        void mo60404j(C7853b.b bVar);

        /* renamed from: k */
        void mo60405k();

        /* renamed from: m */
        void mo60406m(C7853b.d dVar);

        /* renamed from: o */
        void mo60407o();

        /* renamed from: z */
        boolean mo60408z(C17945a0 c17945a0);
    }

    /* renamed from: com.zing.zalo.ui.chat.a$b */
    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {
        public b(View view) {
            super(view);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.a$c */
    /* loaded from: classes5.dex */
    public static class c extends RecyclerView.AbstractC1876c0 {
        public c(View view) {
            super(view);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.a$d */
    /* loaded from: classes5.dex */
    public static class d extends RecyclerView.AbstractC1876c0 {
        public d(ChatEmptyView chatEmptyView) {
            super(chatEmptyView);
            chatEmptyView.setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.a$e */
    /* loaded from: classes5.dex */
    public static class e extends RecyclerView.AbstractC1876c0 {

        /* renamed from: A0 */
        public ChatRowVideoGifInline f57029A0;

        /* renamed from: B0 */
        public ChatRowCollapsedMsgInfoGroup f57030B0;

        /* renamed from: C0 */
        public ChatRowE2eeDecryptedFailed f57031C0;

        /* renamed from: D0 */
        public ChatRowE2eeEcardMsgInfo f57032D0;

        /* renamed from: E0 */
        public ChatRowBankCardOffline f57033E0;

        /* renamed from: F0 */
        public f f57034F0;

        /* renamed from: G0 */
        public TextView f57035G0;

        /* renamed from: H0 */
        public TextView f57036H0;

        /* renamed from: I */
        public View f57037I;

        /* renamed from: I0 */
        public TextView f57038I0;

        /* renamed from: J */
        public int f57039J;

        /* renamed from: J0 */
        public TextView f57040J0;

        /* renamed from: K */
        public ChatRowText f57041K;

        /* renamed from: K0 */
        public ChatRowLiveLocation f57042K0;

        /* renamed from: L */
        public ChatRowPhoto f57043L;

        /* renamed from: L0 */
        public ChatRowMultiStickers f57044L0;

        /* renamed from: M */
        public ChatRowVoice f57045M;

        /* renamed from: M0 */
        public ChatRowSectionDivider f57046M0;

        /* renamed from: N */
        public ChatRowVideo f57047N;

        /* renamed from: N0 */
        public ChatRowShortVideo f57048N0;

        /* renamed from: O */
        public ChatRowDoodle f57049O;

        /* renamed from: O0 */
        public ChatRowShortVideoProfile f57050O0;

        /* renamed from: P */
        public ChatRowLocation f57051P;

        /* renamed from: P0 */
        public TextView f57052P0;

        /* renamed from: Q */
        public ChatRowRecommendContact f57053Q;

        /* renamed from: R */
        public ChatRowRecommendSticker f57054R;

        /* renamed from: S */
        public ChatRowRecommendLink f57055S;

        /* renamed from: T */
        public ChatRowRecommendLinkPage f57056T;

        /* renamed from: U */
        public ChatRowRecommendLinkMp3 f57057U;

        /* renamed from: V */
        public ChatRowRecommendLinkProductCatalog f57058V;

        /* renamed from: W */
        public ChatRowCallTime f57059W;

        /* renamed from: X */
        public ChatRowGroupCall f57060X;

        /* renamed from: Y */
        public ChatRowMediaLink f57061Y;

        /* renamed from: Z */
        public ChatRowUndo f57062Z;

        /* renamed from: a0 */
        public ChatRowGame f57063a0;

        /* renamed from: b0 */
        public ChatLeftRichMessageMC f57064b0;

        /* renamed from: c0 */
        public ChatRowEcard f57065c0;

        /* renamed from: d0 */
        public ChatRowEcardInfo f57066d0;

        /* renamed from: e0 */
        public ChatRowMsgFeed f57067e0;

        /* renamed from: f0 */
        public ChatRowMsgFeed f57068f0;

        /* renamed from: g0 */
        public ChatRowMsgFeed f57069g0;

        /* renamed from: h0 */
        public ChatRowMsgFeed f57070h0;

        /* renamed from: i0 */
        public ChatRowMsgFeed f57071i0;

        /* renamed from: j0 */
        public ChatRowMsgFeed f57072j0;

        /* renamed from: k0 */
        public ChatRowMsgFeed f57073k0;

        /* renamed from: l0 */
        public ChatRowMsgFeed f57074l0;

        /* renamed from: m0 */
        public ChatRowMsgFeed f57075m0;

        /* renamed from: n0 */
        public ChatRowFile f57076n0;

        /* renamed from: o0 */
        public ChatRowGif f57077o0;

        /* renamed from: p0 */
        public ChatRowVideoLiveStream f57078p0;

        /* renamed from: q0 */
        public ChatRowVideoInline f57079q0;

        /* renamed from: r0 */
        public ChatRowUnSupport f57080r0;

        /* renamed from: s0 */
        public ChatRowMultiPhotos f57081s0;

        /* renamed from: t0 */
        public ChatRowPhotoSticker f57082t0;

        /* renamed from: u0 */
        public ChatRowVideoMask f57083u0;

        /* renamed from: v0 */
        public ChatRowWebContent f57084v0;

        /* renamed from: w0 */
        public ChatRowWebContentPlus f57085w0;

        /* renamed from: x0 */
        public ChatRowMsgInfo f57086x0;

        /* renamed from: y0 */
        public ChatEmptyView f57087y0;

        /* renamed from: z0 */
        public ChatRowVideoOALink f57088z0;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
            	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
            	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
            	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
            	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
            	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
            	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0017. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:14:0x001a. Please report as an issue. */
        public e(android.view.View r7, int r8) {
            /*
                Method dump skipped, instructions count: 558
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.AbstractC11316a.e.<init>(android.view.View, int):void");
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.a$f */
    /* loaded from: classes5.dex */
    public static class f {

        /* renamed from: a */
        AvatarImageView[] f57089a;

        /* renamed from: b */
        RobotoTextView[] f57090b;

        /* renamed from: c */
        View[] f57091c;

        /* renamed from: d */
        int f57092d;

        public f(int i11) {
            this.f57089a = new AvatarImageView[i11];
            this.f57090b = new RobotoTextView[i11];
            this.f57091c = new View[i11];
            this.f57092d = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public /* synthetic */ C24848g0 m60454B0() {
        this.f57013F.mo60401T0();
        return C24848g0.f119245a;
    }

    /* renamed from: C0 */
    private void m60455C0(C28771c c28771c, boolean z11, boolean z12, boolean z13, boolean z14) {
        C28771c c28771c2;
        c28771c.m143931D(c28771c.m143950j());
        if (c28771c.m143952l() == 1) {
            List m60461O = m60461O(c28771c, z11, this.f57009B.isEmpty());
            if (m60461O.size() > 0) {
                c28771c2 = (C28771c) m60461O.get(0);
            } else {
                c28771c2 = null;
            }
            this.f57009B.addAll(0, m60461O);
            c28771c = c28771c2;
        } else if (c28771c.m143964x()) {
            this.f57009B.add(0, c28771c);
        } else if (c28771c.m143952l() == 3) {
            c28771c = m60456D0(c28771c, z11);
        } else {
            c28771c = null;
        }
        if (c28771c != null) {
            c28771c.m143929B(z12);
            c28771c.m143930C(z13);
            c28771c.m143928A(z14);
        }
    }

    /* renamed from: D0 */
    private C28771c m60456D0(C28771c c28771c, boolean z11) {
        if (c28771c.m143950j().size() == 0) {
            return null;
        }
        if (c28771c.m143950j().size() > 1) {
            return m60459M(c28771c, z11);
        }
        if (c28771c.m143950j().size() != 1) {
            return null;
        }
        m60460N(c28771c, z11);
        return c28771c;
    }

    /* renamed from: J0 */
    private void m60457J0(C17969i0 c17969i0, int i11, int i12, long j11) {
        if (c17969i0 instanceof C17949b1) {
            ((C17949b1) c17969i0).m95404o(j11);
        } else if (c17969i0 instanceof C17958e1) {
            ((C17958e1) c17969i0).m95434x(j11);
        }
    }

    /* renamed from: M */
    private C28771c m60459M(C28771c c28771c, boolean z11) {
        List m60462P = m60462P(c28771c, z11);
        if (m60462P.size() == 0) {
            return null;
        }
        this.f57009B.addAll(0, m60462P);
        if (((C28771c) m60462P.get(0)).m143955o().size() % 3 == 1) {
            int size = m60462P.size();
            C28771c c28771c2 = (C28771c) m60462P.get(size - 1);
            c28771c2.m143935H(true);
            C17945a0 m143954n = c28771c2.m143954n();
            if (z11 && m60465q0(m143954n)) {
                m60473E0(m143954n.m95029V3()).f133310f = true;
                C28771c c28771c3 = (C28771c) m60462P.get(size - 2);
                if (c28771c3.m143954n() != null) {
                    m60473E0(c28771c3.m143954n().m95029V3()).f133310f = true;
                }
            }
        }
        return (C28771c) m60462P.get(0);
    }

    /* renamed from: N */
    private void m60460N(C28771c c28771c, boolean z11) {
        C17945a0 m143951k = c28771c.m143951k();
        C17969i0 m94929K2 = m143951k.m94929K2();
        long m41045i = m143951k.m95029V3().m41045i();
        List m60493g0 = m60493g0(c28771c.m143950j());
        ArrayList arrayList = new ArrayList();
        if (m143951k.m95110d8()) {
            C17949b1 c17949b1 = (C17949b1) m94929K2;
            if (m143951k.m94914I4() == -1) {
                c17949b1.m95404o(m41045i);
            }
            arrayList.add(m143951k);
        } else if (m94929K2 instanceof C17958e1) {
            C17958e1 c17958e1 = (C17958e1) m94929K2;
            if (m143951k.m94914I4() == -1) {
                c17958e1.m95434x(m41045i);
            }
        }
        m60473E0(m143951k.m95029V3()).f133310f = z11;
        c28771c.m143931D(c28771c.m143950j());
        c28771c.m143932E(m60493g0);
        c28771c.m143966z(true);
        c28771c.m143938K(true);
        c28771c.m143935H(true);
        c28771c.m143939L(true);
        c28771c.m143934G(3);
        c28771c.m143933F(arrayList);
        this.f57009B.add(0, c28771c);
    }

    /* renamed from: O */
    private List m60461O(C28771c c28771c, boolean z11, boolean z12) {
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        C28771c c28771c2;
        ArrayList arrayList;
        int i14;
        int i15;
        List list;
        int i16;
        int i17;
        C28771c c28771c3 = c28771c;
        ArrayList arrayList2 = new ArrayList();
        List m143950j = c28771c.m143950j();
        int size = m143950j.size();
        if (size == 0) {
            return arrayList2;
        }
        if (AbstractC26689j.m137087N()) {
            AbstractC19646n0.m102964c2(m143950j);
        }
        C32091r6 m154832b = C32091r6.m154832b();
        int mo60487Z = mo60487Z();
        int m143952l = c28771c.m143952l();
        boolean z24 = true;
        if ((mo60487Z == 2 || mo60487Z == 3) && size == 1) {
            C17945a0 m143951k = c28771c.m143951k();
            if (m143951k != null) {
                m60473E0(m143951k.m95029V3()).f133310f = z11;
            }
            arrayList2.add(c28771c3);
            if (mo60487Z == 3 && (((C17945a0) m143950j.get(0)).m95219o8() || ((C17945a0) m143950j.get(0)).m95091b6())) {
                c28771c3.m143966z(true);
            }
        } else if (m154832b.f147870b && ((C17945a0) m143950j.get(0)).mo95126f() <= m154832b.f147871c) {
            List m60493g0 = m60493g0(m143950j);
            int i18 = 0;
            C28771c c28771c4 = null;
            ArrayList arrayList3 = null;
            while (i18 < size) {
                if (c28771c4 == null) {
                    c28771c2 = new C28771c(m143952l);
                    c28771c2.m143931D(m143950j);
                    c28771c2.m143932E(m60493g0);
                    c28771c2.m143966z(z24);
                    arrayList2.add(c28771c2);
                    arrayList = new ArrayList();
                    c28771c2.m143933F(arrayList);
                } else {
                    c28771c2 = c28771c4;
                    arrayList = arrayList3;
                }
                C17945a0 m143953m = c28771c3.m143953m(i18);
                C17969i0 m94929K2 = m143953m.m94929K2();
                if (arrayList2.size() == z24 && m154832b.m154838g(m143953m.mo95126f())) {
                    i14 = m154832b.f147874f;
                    i15 = m154832b.f147875g;
                } else {
                    i14 = m154832b.f147872d;
                    i15 = m154832b.f147873e;
                }
                int[] m154833c = C32091r6.m154833c(m94929K2);
                int i19 = m154833c[1];
                if (i19 != 0) {
                    int i21 = (m154833c[0] * i15) / i19;
                    list = m60493g0;
                    i17 = i21;
                    i16 = m143952l;
                } else {
                    list = m60493g0;
                    i16 = m143952l;
                    i17 = i15;
                }
                int max = Math.max(i17, m154832b.f147876h);
                int max2 = Math.max(i15, m154832b.f147877i);
                C32091r6.m154836j(m94929K2, max, max2);
                c28771c2.m143941a(m143953m);
                if (!m143953m.m95219o8() && !m143953m.m95091b6()) {
                    arrayList.add(m143953m);
                }
                int m154837d = m154832b.m154837d(c28771c2);
                if (m154837d >= i14 || c28771c2.m143950j().size() >= 3 || (i18 == size - 1 && (size == m143953m.mo95126f() || !z12))) {
                    if (c28771c2.m143950j().size() == 1 && m154833c[0] <= m154833c[1]) {
                        C32091r6.m154836j(m94929K2, 1000, 750);
                    } else {
                        m154832b.m154840i(c28771c2, m154837d, max2);
                    }
                    c28771c2 = null;
                }
                i18++;
                arrayList3 = arrayList;
                c28771c4 = c28771c2;
                m60493g0 = list;
                m143952l = i16;
                z24 = true;
            }
            if (arrayList2.size() == 1) {
                C28771c c28771c5 = (C28771c) arrayList2.get(0);
                c28771c5.m143934G(3);
                m60473E0(c28771c5.m143951k().m95029V3()).f133310f = z11;
                c28771c5.m143937J(true);
                c28771c5.m143935H(true);
                c28771c5.m143938K(true);
                c28771c5.m143939L(true);
                c28771c5.m143936I(true);
                c28771c5.m143940M(true);
            } else {
                int size2 = (arrayList2.size() - 1) / 2;
                if (arrayList2.size() % 2 == 1) {
                    i13 = size2;
                } else {
                    i13 = size2 + 1;
                }
                for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                    C28771c c28771c6 = (C28771c) arrayList2.get(i22);
                    C17945a0 m143951k2 = c28771c6.m143951k();
                    if (i22 == 0) {
                        c28771c6.m143934G(0);
                        if (m143951k2 != null) {
                            m60473E0(m143951k2.m95029V3()).f133310f = false;
                        }
                    } else if (i22 == arrayList2.size() - 1) {
                        c28771c6.m143934G(2);
                        if (m143951k2 != null) {
                            m60473E0(m143951k2.m95029V3()).f133310f = z11;
                        }
                    } else {
                        if (i22 == arrayList2.size() - 2) {
                            c28771c6.m143934G(4);
                        } else {
                            c28771c6.m143934G(1);
                        }
                        if (m143951k2 != null) {
                            m60473E0(m143951k2.m95029V3()).f133310f = false;
                        }
                    }
                    if (i22 == i13) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    c28771c6.m143937J(z18);
                    if (i22 == size2) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    c28771c6.m143935H(z19);
                    if (i22 == size2) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    c28771c6.m143938K(z21);
                    if (i22 == size2) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    c28771c6.m143936I(z22);
                    if (i22 == size2) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    c28771c6.m143939L(z23);
                    c28771c6.m143940M(true);
                }
            }
        } else {
            int i23 = m143952l;
            if (size <= 3) {
                List m60493g02 = m60493g0(m143950j);
                c28771c3.m143931D(m143950j);
                c28771c3.m143932E(m60493g02);
                c28771c3.m143933F(m60493g02);
                c28771c3.m143934G(3);
                c28771c3.m143966z(true);
                m60473E0(c28771c.m143951k().m95029V3()).f133310f = z11;
                c28771c3.m143937J(true);
                c28771c3.m143935H(true);
                c28771c3.m143938K(true);
                c28771c3.m143939L(true);
                c28771c3.m143936I(true);
                arrayList2.add(c28771c3);
            } else {
                double d11 = size / 3.0d;
                int ceil = (int) ((Math.ceil(d11) - 1.0d) / 2.0d);
                if (Math.ceil(d11) % 2.0d == 1.0d) {
                    i11 = ceil;
                } else {
                    i11 = ceil + 1;
                }
                List m60493g03 = m60493g0(m143950j);
                ArrayList arrayList4 = null;
                int i24 = 0;
                C28771c c28771c7 = null;
                while (i24 < size) {
                    C17945a0 m143953m2 = c28771c3.m143953m(i24);
                    if (i24 % 3 == 0) {
                        i12 = i23;
                        C28771c c28771c8 = new C28771c(i12);
                        c28771c8.m143931D(m143950j);
                        c28771c8.m143932E(m60493g03);
                        c28771c8.m143966z(true);
                        int i25 = i24 / 3;
                        if (i25 == i11) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c28771c8.m143937J(z13);
                        if (i25 == ceil) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        c28771c8.m143935H(z14);
                        if (i25 == ceil) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        c28771c8.m143938K(z15);
                        if (i25 == ceil) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        c28771c8.m143936I(z16);
                        if (i25 == ceil) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        c28771c8.m143939L(z17);
                        c28771c8.m143941a(m143953m2);
                        arrayList2.add(c28771c8);
                        C17945a0 m143951k3 = c28771c8.m143951k();
                        if (i25 == 0) {
                            c28771c8.m143934G(0);
                            if (m143951k3 != null) {
                                m60473E0(m143951k3.m95029V3()).f133310f = false;
                            }
                        } else {
                            int i26 = (size - 1) / 3;
                            if (i25 == i26) {
                                c28771c8.m143934G(2);
                                if (m143951k3 != null) {
                                    m60473E0(m143951k3.m95029V3()).f133310f = z11;
                                }
                            } else {
                                if (i25 == i26 - 1) {
                                    c28771c8.m143934G(4);
                                } else {
                                    c28771c8.m143934G(1);
                                }
                                if (m143951k3 != null) {
                                    m60473E0(m143951k3.m95029V3()).f133310f = false;
                                }
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(m143953m2);
                        c28771c8.m143933F(arrayList5);
                        c28771c7 = c28771c8;
                        arrayList4 = arrayList5;
                    } else {
                        i12 = i23;
                        c28771c7.m143941a(m143953m2);
                        if (m143953m2 != null && !m143953m2.m95219o8()) {
                            arrayList4.add(m143953m2);
                        }
                    }
                    i24++;
                    c28771c3 = c28771c;
                    i23 = i12;
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: P */
    private List m60462P(C28771c c28771c, boolean z11) {
        List list;
        C28771c c28771c2;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        List m143950j = c28771c.m143950j();
        C17945a0 c17945a0 = (C17945a0) m143950j.get(0);
        int size = m143950j.size();
        long m41045i = c17945a0.m95029V3().m41045i();
        int mo60487Z = mo60487Z();
        int m143952l = c28771c.m143952l();
        if (mo60487Z != 2 && mo60487Z != 3) {
            List m60493g0 = m60493g0(m143950j);
            C28771c c28771c3 = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (i11 < size) {
                C17945a0 m143953m = c28771c.m143953m(i11);
                int i12 = i11;
                List list2 = m60493g0;
                m60457J0(m143953m.m94929K2(), i11, size, m41045i);
                m60473E0(m143953m.m95029V3()).f133310f = false;
                if (i12 % 3 == 0) {
                    c28771c2 = new C28771c(m143952l);
                    c28771c2.m143931D(m143950j);
                    list = list2;
                    c28771c2.m143932E(list);
                    c28771c2.m143966z(true);
                    c28771c2.m143938K(true);
                    c28771c2.m143934G(3);
                    arrayList2.add(c28771c2);
                    arrayList = new ArrayList();
                    c28771c2.m143933F(arrayList);
                } else {
                    list = list2;
                    c28771c2 = c28771c3;
                    arrayList = arrayList3;
                }
                c28771c2.m143941a(m143953m);
                if (!m143953m.m95219o8()) {
                    arrayList.add(m143953m);
                }
                c28771c3 = c28771c2;
                m60493g0 = list;
                arrayList3 = arrayList;
                i11 = i12 + 1;
            }
            C17945a0 m143954n = ((C28771c) arrayList2.get(arrayList2.size() - 1)).m143954n();
            if (m143954n != null) {
                m60473E0(m143954n.m95029V3()).f133310f = z11;
            }
        } else {
            m60457J0(c17945a0.m94929K2(), 0, 1, m41045i);
            m60473E0(c28771c.m143954n().m95029V3()).f133310f = z11;
            arrayList2.add(c28771c);
        }
        return arrayList2;
    }

    /* renamed from: c0 */
    private int m60463c0(C3020p0 c3020p0) {
        if (c3020p0 == null) {
            return 35;
        }
        int i11 = c3020p0.f12058q;
        if (i11 == 1) {
            return 22;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        if (i11 != 17) {
                            if (i11 != 22) {
                                if (i11 != 24) {
                                    return 35;
                                }
                                return 29;
                            }
                            return 67;
                        }
                        return 60;
                    }
                    return 29;
                }
                return 23;
            }
            return 26;
        }
        return 25;
    }

    /* renamed from: p0 */
    private void m60464p0(C17945a0 c17945a0) {
        String str;
        boolean z11;
        String str2;
        try {
            if (c17945a0.m94977P7() && (c17945a0.m94929K2() instanceof C18013y0) && c17945a0.m94929K2().f91016u != null) {
                if (TextUtils.equals(c17945a0.m94929K2().f91016u, "recommened.user")) {
                    if (ChatRowRecommendContact.Companion.m61602k() == 1) {
                        if (c17945a0.m95071Z3() != null) {
                            if (c17945a0.m95071Z3().m137357b() == 2) {
                            }
                            if (c17945a0.m95032V6() && c17945a0.m95071Z3() != null) {
                                c17945a0.m95071Z3().m137357b();
                            }
                        }
                        String str3 = c17945a0.m94929K2().f91017v;
                        if (((C18013y0) c17945a0.m94929K2()).f91253D == null) {
                            str2 = "";
                        } else {
                            str2 = ((C18013y0) c17945a0.m94929K2()).f91253D.f91053a;
                        }
                        String str4 = c17945a0.m94929K2().f91011p;
                        if (AbstractC2346f0.m12314a(str2) && !TextUtils.equals(str3, CoreUtility.f89233i) && AbstractC0906d0.m2800f(MainApplication.getAppContext(), AbstractC23056e6.m118285k(str2)) == null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("userId", str3);
                            jSONObject.put("phoneNumber", str2);
                            jSONObject.put("name", str4);
                            c17945a0.m95008Sa(new C26713e(MainApplication.getAppContext().getString(AbstractC8020f0.str_add_to_phone_book), 2, "open.save.phonenumber", jSONObject.toString(), true, 2));
                        } else {
                            c17945a0.m95008Sa(null);
                        }
                        if (c17945a0.m95032V6()) {
                            c17945a0.m95071Z3().m137357b();
                        }
                    }
                } else if ((TextUtils.equals(c17945a0.m94929K2().f91016u, "recommened.game") || TextUtils.equals(c17945a0.m94929K2().f91016u, "recommened.msg.game")) && c17945a0.m94912I2() != null && c17945a0.m94912I2().f147323q > 0 && !this.f57019L.containsKey(Long.valueOf(c17945a0.m94912I2().f147323q))) {
                    this.f57019L.put(Long.valueOf(c17945a0.m94912I2().f147323q), Long.valueOf(c17945a0.m95029V3().m41045i()));
                }
            }
            if (c17945a0.m94871D7() && (c17945a0.m94929K2() instanceof C18009w0)) {
                if (AbstractC0924m0.m4303w0() == 1 && !TextUtils.isEmpty(((C18009w0) c17945a0.m94929K2()).m95791y()) && !c17945a0.m95022U7()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && AbstractC0924m0.m4332x0() == 1) {
                    z11 = AbstractC0924m0.m3776ea();
                }
                if (z11) {
                    ArrayList arrayList = new ArrayList();
                    C26712d c26712d = new C26712d();
                    c26712d.m137354v(1);
                    c26712d.m137352t(1);
                    c26712d.m137351s("action.open.qrcode.footer");
                    c26712d.m137353u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_scan_qr_footer_photo));
                    arrayList.add(c26712d);
                    c17945a0.m95008Sa(new C26713e(arrayList, true, 6));
                } else if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137357b() == 6) {
                    c17945a0.m95008Sa(null);
                }
                if (c17945a0.m95022U7()) {
                    c17945a0.m95203mc();
                }
            }
            if (!this.f57011D && c17945a0.m95011T3() != null && !c17945a0.m95219o8() && ((c17945a0.m95011T3().m40860j() || c17945a0.m94986Q6()) && (c17945a0.m95071Z3() == null || c17945a0.m95071Z3().m137357b() == 1))) {
                this.f57011D = true;
                c17945a0.m95008Sa(new C26713e(MainApplication.getAppContext().getString(AbstractC8020f0.str_item_cm_reply_msg), 1, "action.reply.msg.autogen", "", true, 1));
            } else if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137357b() == 1) {
                c17945a0.m95008Sa(null);
            }
            if (!this.f57012E && ((!c17945a0.m95170j6() || AbstractC0924m0.m3685b9()) && c17945a0.m94957N3().size() > 0 && ((c17945a0.m95011T3() == null || !c17945a0.m95011T3().m40860j()) && !c17945a0.m94986Q6() && ((c17945a0.m95071Z3() == null || c17945a0.m95071Z3().m137357b() == 5) && !c17945a0.m95219o8())))) {
                if (((SuggestionTimeSpan) c17945a0.m94957N3().get(0)).f54806v) {
                    this.f57012E = true;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("openTimePicker", 0);
                    jSONObject2.put("stringTimeSuggestion", ((SuggestionTimeSpan) c17945a0.m94957N3().get(0)).f54804t);
                    jSONObject2.put("isFooterLocal", true);
                    c17945a0.m95008Sa(new C26713e(MainApplication.getAppContext().getString(AbstractC8020f0.str_title_footer_create_reminder_chat_msg), 1, "action.set.reminder.msg", jSONObject2.toString(), true, 5));
                }
            } else if (c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137357b() == 5) {
                c17945a0.m95008Sa(null);
            }
            if (c17945a0.m95071Z3() == null && c17945a0.m94862C4().equals(CoreUtility.f89233i) && !c17945a0.m95219o8() && c17945a0.m95011T3() != null && c17945a0.m95011T3().m40859i() && c17945a0.m95019U3() != null && c17945a0.m95019U3().length() >= 10 && (this.f57024v.m41013q() || ((this.f57024v.m41016w() || this.f57024v.m41015u()) && AbstractC0924m0.m3597Y9()))) {
                ArrayList arrayList2 = new ArrayList();
                C26712d c26712d2 = new C26712d();
                c26712d2.m137354v(1);
                c26712d2.m137351s("action.pin.msg.autogen");
                c26712d2.m137350r("");
                c26712d2.m137353u(MainApplication.getAppContext().getString(AbstractC8020f0.str_btn_pin_this_message));
                arrayList2.add(c26712d2);
                c17945a0.m95008Sa(new C26713e(arrayList2, true, 1));
            }
            if (c17945a0.m95071Z3() == null) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                if ((m94929K2 instanceof C18009w0) && ((C18009w0) m94929K2).m95786t() == 1) {
                    C3229a c3229a = C3229a.f13790a;
                    if (c3229a.m16395i() && c3229a.m16391e() && mo60487Z() == 1) {
                        ArrayList arrayList3 = new ArrayList();
                        C26712d c26712d3 = new C26712d();
                        c26712d3.m137353u(c3229a.m16388b());
                        c26712d3.m137351s("action.sticker.ai.open_mp");
                        c26712d3.m137354v(4);
                        arrayList3.add(c26712d3);
                        c17945a0.m95008Sa(new C26713e(arrayList3, true, 8));
                    }
                }
            }
            if (c17945a0.m95071Z3() != null) {
                if (c17945a0.m95071Z3().m137357b() == 0 || c17945a0.m95071Z3().m137357b() == 8) {
                    try {
                        JSONArray jSONArray = new JSONObject(c17945a0.m95071Z3().m137359d()).getJSONArray("footerList");
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            C26712d c26712d4 = new C26712d(jSONArray.getJSONObject(i11));
                            if (!TextUtils.isEmpty(c26712d4.m137334b())) {
                                str = c26712d4.m137334b();
                            } else if (TextUtils.isEmpty(c26712d4.m137338f())) {
                                str = "";
                            } else {
                                str = c26712d4.m137338f();
                            }
                            if (str.equals("action.groupcall.video")) {
                                if (mo60498l0() > AbstractC23309i.m121299P7()) {
                                    c17945a0.m95008Sa(null);
                                }
                            } else if (str.equals("action.sticker.ai.open_mp")) {
                                C3229a c3229a2 = C3229a.f13790a;
                                if (!c3229a2.m16395i() || !c3229a2.m16391e() || mo60487Z() != 1) {
                                    c17945a0.m95008Sa(null);
                                }
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f(f57007M, e12);
        }
    }

    /* renamed from: q0 */
    private boolean m60465q0(C17945a0 c17945a0) {
        if (c17945a0 != null && c17945a0.m95089b4() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s0 */
    private boolean m60466s0(C28771c c28771c, C17945a0 c17945a0) {
        if (c17945a0.m95178k6()) {
            return false;
        }
        if (!m60467t0(c28771c, c17945a0) && !m60468u0(c28771c, c17945a0) && !m60469v0(c28771c, c17945a0)) {
            return false;
        }
        return true;
    }

    /* renamed from: t0 */
    private boolean m60467t0(C28771c c28771c, C17945a0 c17945a0) {
        if (c28771c.m143952l() != 1 || !c17945a0.m94969O6() || !c28771c.m143951k().m94862C4().equals(c17945a0.m94862C4())) {
            return false;
        }
        long mo95204n = c28771c.m143951k().mo95204n();
        long mo95204n2 = c17945a0.mo95204n();
        if (mo95204n == -1 || mo95204n != mo95204n2) {
            return false;
        }
        return true;
    }

    /* renamed from: u0 */
    private boolean m60468u0(C28771c c28771c, C17945a0 c17945a0) {
        C17945a0 m143954n;
        if (c28771c.m143952l() != 2 || m60473E0(c17945a0.m95029V3()).f133322r == 3) {
            return false;
        }
        if ((!c17945a0.m94899G7() && !c17945a0.m95161i7() && ((!c17945a0.m94872D8() || !c17945a0.m95064Y6()) && !c17945a0.m95031V5())) || (m143954n = c28771c.m143954n()) == null) {
            return false;
        }
        if (m143954n.m94899G7()) {
            if (!c17945a0.m94899G7()) {
                return true;
            }
            return ((C18011x0) m143954n.m94929K2()).f91248K.equals(((C18011x0) c17945a0.m94929K2()).f91248K);
        }
        return !c17945a0.m94899G7();
    }

    /* renamed from: v0 */
    private boolean m60469v0(C28771c c28771c, C17945a0 c17945a0) {
        C17945a0 m143951k = c28771c.m143951k();
        if (m143951k == null || m60470w0(m143951k) || !m143951k.m94862C4().equals(c17945a0.m94862C4()) || m143951k.m95275v4() != null || c17945a0.m95275v4() != null || m143951k.m94898G6() || c17945a0.m94898G6()) {
            return false;
        }
        C29680f mo150737a = this.f57017J.mo150737a();
        if (c28771c.m143952l() != 3 || !c17945a0.m95100c8() || mo150737a == null || !mo150737a.m147613b()) {
            return false;
        }
        long m94914I4 = m143951k.m94914I4();
        long m94914I42 = c17945a0.m94914I4();
        if (m94914I4 != -1 && m94914I4 != m94914I42) {
            return false;
        }
        C29675a mo150746j = this.f57017J.mo150746j();
        if (AbstractC23069f8.m118371a(c17945a0, mo60488a0(), mo150746j) || AbstractC23069f8.m118371a(m143951k, mo60488a0(), mo150746j)) {
            return false;
        }
        long abs = Math.abs(m143951k.m94991R2() - c17945a0.m94991R2());
        if (abs > mo150737a.m147612a() || abs > 1800000) {
            return false;
        }
        return true;
    }

    /* renamed from: w0 */
    private boolean m60470w0(C17945a0 c17945a0) {
        MessageId messageId = this.f57015H;
        if (messageId != null && c17945a0.m95135f9(messageId)) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    private boolean m60471z0(C17945a0 c17945a0) {
        MessageId messageId = this.f57016I;
        if (messageId != null && c17945a0.m95135f9(messageId)) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public boolean m60472A0() {
        return this.f57016I != null;
    }

    /* renamed from: E0 */
    public C28769a m60473E0(MessageId messageId) {
        C28769a c28769a = (C28769a) this.f57010C.get(messageId);
        if (c28769a == null) {
            c28769a = new C28769a();
        }
        this.f57010C.put(messageId, c28769a);
        return c28769a;
    }

    /* renamed from: F0 */
    public void m60474F0(a aVar) {
        this.f57013F = aVar;
    }

    /* renamed from: G0 */
    public void m60475G0(InterfaceC30793c interfaceC30793c) {
        this.f57014G = interfaceC30793c;
    }

    /* renamed from: H0 */
    public void m60476H0(MessageId messageId) {
        this.f57015H = messageId;
    }

    /* renamed from: I0 */
    public void m60477I0(MessageId messageId) {
        this.f57016I = messageId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:            if (r6.m95227p7() != false) goto L22;     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0249  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m60478Q() {
        int i11;
        C17945a0 c17945a0;
        int i12;
        boolean z11;
        boolean z12;
        C28771c c28771c;
        C17945a0 m143954n;
        C17967h1 c17967h1;
        if (this.f57026x == null) {
            return;
        }
        this.f57019L.clear();
        this.f57009B.clear();
        this.f57011D = false;
        this.f57012E = false;
        synchronized (this.f57026x) {
            try {
                C26393b m136076v = this.f57026x.m136076v();
                if (m136076v == null) {
                    return;
                }
                boolean z13 = true;
                int m136016p = m136076v.m136016p() - 1;
                C28771c c28771c2 = null;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = true;
                boolean z19 = true;
                while (m136016p >= 0) {
                    C17945a0 c17945a02 = (C17945a0) m136076v.m136006f(m136016p);
                    if (!c17945a02.m94904H3()) {
                        if (c17945a02.m94879E5()) {
                            C0833n0.f2934p.m2208g(c17945a02, false);
                        }
                        if (mo60487Z() != 3) {
                            m60464p0(c17945a02);
                        }
                        if (c17945a02.m94872D8() && (c17967h1 = (C17967h1) c17945a02.m94929K2()) != null && c17967h1.m95595b()) {
                            String str = c17945a02.mo95039W2() + "_" + c17967h1.f90985K;
                            i11 = m136016p;
                            long j11 = c17967h1.f90986L;
                            Long l11 = (Long) C28176r6.m141702d().f131282h.get(str);
                            if (l11 != null && l11.longValue() > j11) {
                                c17945a02.m94998Ra(z13);
                            }
                            C28176r6.m141702d().f131282h.put(str, Long.valueOf(j11));
                            c17945a02.m94998Ra(c17967h1.f91020y);
                        } else {
                            i11 = m136016p;
                        }
                        if (c28771c2 != null && m60466s0(c28771c2, c17945a02)) {
                            if (!z15) {
                                z15 = m60470w0(c17945a02);
                            }
                            if (!z16) {
                                z16 = m60471z0(c17945a02);
                            }
                            if (!z17) {
                                z17 = m60501r0(c17945a02);
                            }
                            c28771c2.m143942b(c17945a02);
                            if (c28771c2.m143964x() && c28771c2.m143950j().size() == 2) {
                                C17945a0 m143954n2 = c28771c2.m143954n();
                                C28769a m60473E0 = m60473E0(m143954n2.m95029V3());
                                if (m143954n2.m94899G7()) {
                                    m60473E0.f133322r = 2;
                                } else {
                                    if (m143954n2.m94974P4() >= this.f57018K) {
                                        if (this.f57009B.isEmpty()) {
                                            c28771c = null;
                                        } else {
                                            c28771c = (C28771c) this.f57009B.get(0);
                                        }
                                        if (c28771c == null || c28771c.m143954n() == null || (m143954n = c28771c.m143954n()) == null || !m143954n.m94872D8() || m143954n.m94865C8()) {
                                            m60473E0.f133322r = 2;
                                        }
                                    }
                                    m60473E0.f133322r = 4;
                                }
                            }
                            c17945a0 = c17945a02;
                        } else {
                            if (c28771c2 != null) {
                                i12 = 3;
                                c17945a0 = c17945a02;
                                m60455C0(c28771c2, z14, z15, z16, z17);
                                if (z15) {
                                    z15 = false;
                                }
                                if (z16) {
                                    z16 = false;
                                }
                                c28771c2 = null;
                                z14 = false;
                                if (z17) {
                                    z17 = false;
                                }
                            } else {
                                c17945a0 = c17945a02;
                                i12 = 3;
                            }
                            if (!z15) {
                                z15 = m60470w0(c17945a0);
                            }
                            if (!z16) {
                                z16 = m60471z0(c17945a0);
                            }
                            if (!z17) {
                                z17 = m60501r0(c17945a0);
                            }
                            boolean m94969O6 = c17945a0.m94969O6();
                            boolean m95100c8 = c17945a0.m95100c8();
                            boolean m94899G7 = c17945a0.m94899G7();
                            if (!c17945a0.m95161i7() && (!c17945a0.m94872D8() || !c17945a0.m95064Y6())) {
                                z11 = false;
                                boolean m95031V5 = c17945a0.m95031V5();
                                if (m94969O6 && !m95100c8 && !m94899G7 && !z11 && !m95031V5) {
                                    C28771c c28771c3 = new C28771c(0);
                                    c28771c3.m143942b(c17945a0);
                                    c28771c3.m143931D(c28771c3.m143950j());
                                    c28771c3.m143929B(z15);
                                    c28771c3.m143930C(z16);
                                    c28771c3.m143928A(z17);
                                    this.f57009B.add(0, c28771c3);
                                    if (c17945a0.m94987Q7() && (c17945a0.m95208n8() || c17945a0.m95316z8())) {
                                        C28769a m60473E02 = m60473E0(c17945a0.m95029V3());
                                        if (!z19 && !c17945a0.m94986Q6()) {
                                            z12 = false;
                                            m60473E02.f133325u = z12;
                                        }
                                        z12 = true;
                                        m60473E02.f133325u = z12;
                                    }
                                    if (z18) {
                                        if (!c17945a0.m95161i7() && !c17945a0.m94899G7()) {
                                            if (m60465q0(c17945a0)) {
                                                m60473E0(c17945a0.m95029V3()).f133310f = true;
                                                m136016p = i11 - 1;
                                                z13 = true;
                                            } else {
                                                m60473E0(c17945a0.m95029V3()).f133310f = true;
                                            }
                                        } else {
                                            m60473E0(c17945a0.m95029V3()).f133310f = false;
                                            m136016p = i11 - 1;
                                            z13 = true;
                                        }
                                    } else {
                                        m60473E0(c17945a0.m95029V3()).f133310f = false;
                                    }
                                    if (z15) {
                                        z15 = false;
                                    }
                                    if (z16) {
                                        z16 = false;
                                    }
                                    if (z17) {
                                        z17 = false;
                                    }
                                } else {
                                    if (!m94969O6) {
                                        i12 = 1;
                                    } else if (!m95100c8) {
                                        i12 = 2;
                                    }
                                    C28771c c28771c4 = new C28771c(i12);
                                    c28771c4.m143942b(c17945a0);
                                    c28771c2 = c28771c4;
                                    z14 = z18;
                                }
                                if (c17945a0.m94987Q7()) {
                                    z19 = false;
                                }
                            }
                            z11 = true;
                            boolean m95031V52 = c17945a0.m95031V5();
                            if (m94969O6) {
                            }
                            if (!m94969O6) {
                            }
                            C28771c c28771c42 = new C28771c(i12);
                            c28771c42.m143942b(c17945a0);
                            c28771c2 = c28771c42;
                            z14 = z18;
                            if (c17945a0.m94987Q7()) {
                            }
                        }
                        if (i11 > 0) {
                            C17945a0 c17945a03 = (C17945a0) m136076v.m136006f(i11 - 1);
                            if (c17945a0.m94991R2() - c17945a03.m94991R2() > 1800000 || (!TextUtils.isEmpty(c17945a0.m94862C4()) && !c17945a0.m94862C4().equals(c17945a03.m94862C4()))) {
                                z18 = true;
                                m136016p = i11 - 1;
                                z13 = true;
                            }
                        }
                        z18 = false;
                        m136016p = i11 - 1;
                        z13 = true;
                    }
                    i11 = m136016p;
                    m136016p = i11 - 1;
                    z13 = true;
                }
                if (c28771c2 != null) {
                    m60455C0(c28771c2, z14, z15, z16, z17);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: R */
    public abstract InterfaceC11530v mo60479R();

    /* renamed from: S */
    public abstract ChatRow.InterfaceC11339n mo60480S();

    /* renamed from: T */
    public abstract ChatRowEcard.InterfaceC11352a mo60481T();

    /* renamed from: U */
    public abstract ChatRowLiveLocation.InterfaceC11371c mo60482U();

    /* renamed from: V */
    public abstract InterfaceC11505n2 mo60483V();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024e  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView.AbstractC1876c0 m60484W(Context context, int i11, ViewGroup viewGroup) {
        View view;
        if (i11 == 50) {
            return new d(new ChatEmptyView(context));
        }
        if (i11 == 82) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            E2eeDefaultHeaderView e2eeDefaultHeaderView = new E2eeDefaultHeaderView(context);
            e2eeDefaultHeaderView.setLayoutParams(layoutParams);
            e2eeDefaultHeaderView.setPadding(AbstractC23136l9.m118742r(30.0f), 0, AbstractC23136l9.m118742r(30.0f), 0);
            e2eeDefaultHeaderView.setVisibility(8);
            e2eeDefaultHeaderView.m61905Y();
            e2eeDefaultHeaderView.setOnDetailsClick(new InterfaceC18494a() { // from class: v50.a
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    C24848g0 m60454B0;
                    m60454B0 = AbstractC11316a.this.m60454B0();
                    return m60454B0;
                }
            });
            return new b(e2eeDefaultHeaderView);
        }
        if (i11 == 51) {
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, AbstractC23136l9.m118712h(viewGroup.getContext(), 4.0f));
            View view2 = new View(viewGroup.getContext());
            view2.setLayoutParams(layoutParams2);
            return new c(view2);
        }
        LayoutInflater from = LayoutInflater.from(context);
        e eVar = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 14) {
                        if (i11 != 18) {
                            if (i11 != 53) {
                                switch (i11) {
                                    case 4:
                                        view = new ChatRowVideo(context);
                                        break;
                                    case 5:
                                        view = new ChatRowDoodle(context);
                                        break;
                                    case 6:
                                        view = new ChatRowLocation(context);
                                        break;
                                    case 7:
                                        view = new ChatRowRecommendContact(context);
                                        break;
                                    case 8:
                                        view = new ChatRowRecommendSticker(context);
                                        break;
                                    case 9:
                                        view = new ChatRowRecommendLink(context);
                                        break;
                                    case 10:
                                        view = new ChatRowCallTime(context);
                                        break;
                                    case 11:
                                        view = new ChatRowMediaLink(context);
                                        break;
                                    case 12:
                                        view = new ChatRowUndo(context);
                                        break;
                                    default:
                                        switch (i11) {
                                            case 20:
                                                break;
                                            case 21:
                                                view = new ChatRowMsgInfo(context);
                                                break;
                                            case 22:
                                            case 23:
                                            case 24:
                                            case 25:
                                            case 26:
                                                view = new ChatRowMsgFeed(context);
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 29:
                                                        break;
                                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                                        new ChatRowMsgFeed(context);
                                                        view = new ChatRowMsgFeed(context);
                                                        break;
                                                    case 31:
                                                        view = new ChatRowEcardInfo(context);
                                                        break;
                                                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                                        view = new ChatRowEcard(context);
                                                        break;
                                                    case 33:
                                                        view = new ChatRowFile(context);
                                                        break;
                                                    case 34:
                                                    case 40:
                                                        view = new ChatRowGif(context);
                                                        break;
                                                    case 35:
                                                        view = new ChatRowUnSupport(context);
                                                        break;
                                                    case 36:
                                                        view = from.inflate(AbstractC7409c0.chat_row_webcontent, viewGroup, false);
                                                        break;
                                                    case 37:
                                                        RobotoTextView robotoTextView = new RobotoTextView(context);
                                                        robotoTextView.setPadding(AbstractC23136l9.m118742r(24.0f), 0, 0, 0);
                                                        robotoTextView.setTextSize(1, 14.0f);
                                                        robotoTextView.setTextColor(AbstractC11531v0.m62143G3());
                                                        robotoTextView.setTextStyleBold(true);
                                                        view = robotoTextView;
                                                        break;
                                                    case 38:
                                                        view = from.inflate(AbstractC7409c0.group_msg_state_user_row_container, viewGroup, false);
                                                        break;
                                                    case 39:
                                                        break;
                                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                                        view = new ChatRowRecommendLinkPage(context);
                                                        break;
                                                    case 42:
                                                        view = new ChatRowRecommendLinkMp3(context);
                                                        break;
                                                    case 43:
                                                        view = new ChatRowRecommendLinkProductCatalog(context);
                                                        break;
                                                    case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                                        view = new ChatRowBankCardOffline(context);
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case 55:
                                                                break;
                                                            case 56:
                                                                view = new ChatRowMultiPhotos(context);
                                                                break;
                                                            case 57:
                                                                view = new ChatRowVideoMask(context);
                                                                break;
                                                            case 58:
                                                                view = new ChatRowPhotoSticker(context, mo60496j0());
                                                                break;
                                                            case 59:
                                                                view = from.inflate(AbstractC7409c0.chat_row_video_inline, viewGroup, false);
                                                                break;
                                                            case 60:
                                                                break;
                                                            case 61:
                                                                view = new ChatEmptyView(context);
                                                                break;
                                                            case 62:
                                                            case 63:
                                                                view = from.inflate(AbstractC7409c0.chat_row_video_oa_link, viewGroup, false);
                                                                break;
                                                            case 64:
                                                                view = new ChatRowLiveLocation(context);
                                                                break;
                                                            case 65:
                                                                view = from.inflate(AbstractC7409c0.chat_row_video_gif_inline, viewGroup, false);
                                                                break;
                                                            case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                                                view = new ChatRowMultiStickers(context, mo60496j0());
                                                                break;
                                                            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                                                view = new ChatRowMsgFeed(context);
                                                                break;
                                                            case 68:
                                                                view = from.inflate(AbstractC7409c0.chat_row_webcontent_plus, viewGroup, false);
                                                                break;
                                                            case 69:
                                                                view = new ChatRowSectionDivider(context);
                                                                break;
                                                            case 70:
                                                                view = new ChatRowGroupCall(context);
                                                                break;
                                                            case 71:
                                                                view = new ChatRowCollapsedMsgInfoGroup(context);
                                                                break;
                                                            case 72:
                                                                view = new ChatRowE2eeDecryptedFailed(context);
                                                                break;
                                                            case 73:
                                                                view = new ChatRowE2eeEcardMsgInfo(context);
                                                                break;
                                                            case 74:
                                                                RobotoTextView robotoTextView2 = new RobotoTextView(context);
                                                                robotoTextView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                int m118742r = AbstractC23136l9.m118742r(24.0f);
                                                                robotoTextView2.setPadding(m118742r, AbstractC23136l9.m118742r(8.0f), m118742r, AbstractC23136l9.m118742r(8.0f));
                                                                robotoTextView2.setFontStyle(5);
                                                                robotoTextView2.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                                                                robotoTextView2.setTextSize(0, AbstractC23222t7.f112582r);
                                                                view = robotoTextView2;
                                                                break;
                                                            case 75:
                                                            case 78:
                                                                RobotoTextView robotoTextView3 = new RobotoTextView(context);
                                                                robotoTextView3.setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f));
                                                                robotoTextView3.setFontStyle(5);
                                                                robotoTextView3.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                                                                robotoTextView3.setTextSize(0, AbstractC23222t7.f112582r);
                                                                view = robotoTextView3;
                                                                break;
                                                            case 76:
                                                                view = new ChatRowShortVideo(context);
                                                                break;
                                                            case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                                                                view = new ChatRowShortVideoProfile(context);
                                                                break;
                                                            case 79:
                                                            case 80:
                                                                RobotoTextView robotoTextView4 = new RobotoTextView(context);
                                                                robotoTextView4.setPadding(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(8.0f));
                                                                robotoTextView4.setFontStyle(5);
                                                                robotoTextView4.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                                                                robotoTextView4.setTextSize(0, AbstractC23222t7.f112582r);
                                                                view = robotoTextView4;
                                                                break;
                                                            case 81:
                                                                FrameLayout frameLayout = new FrameLayout(context);
                                                                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                frameLayout.setPadding(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(16.0f));
                                                                frameLayout.addView(new Divider(context));
                                                                view = frameLayout;
                                                                break;
                                                            default:
                                                                view = null;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                            } else {
                                view = new ChatRowVideoLiveStream(context);
                            }
                        } else {
                            view = from.inflate(AbstractC7409c0.chat_row_left_rich_message_mc_layout, viewGroup, false);
                        }
                    } else {
                        view = new ChatRowGame(context);
                    }
                } else {
                    view = new ChatRowVoice(context);
                }
            }
            view = new ChatRowPhoto(context);
        } else {
            view = new ChatRowText(context);
        }
        if (view != null) {
            eVar = new e(view, i11);
            if (view instanceof ChatRow) {
                ((ChatRow) view).setDelegate(mo60479R());
            }
            if (view instanceof ChatRowVoice) {
                ((ChatRowVoice) view).setVoiceDelegate(mo60480S());
            }
            if (view instanceof ChatRowRecommendLink) {
                ((ChatRowRecommendLink) view).setVoiceDelegate(mo60480S());
            }
            if (view instanceof ChatRowEcard) {
                ((ChatRowEcard) view).setEcardDelegate(mo60481T());
            }
            if (view instanceof ChatMessageBase) {
                ((ChatMessageBase) view).setDelegate(mo60479R());
            }
            if (view instanceof ChatRowWebContent) {
                ((ChatRowWebContent) view).setDelegate(mo60485X());
            }
            if (view instanceof ChatRowLiveLocation) {
                ((ChatRowLiveLocation) view).setLiveLocationDelegate(mo60482U());
            }
            if (view instanceof ChatRowMultiStickers) {
                ((ChatRowMultiStickers) view).setStickerDelegate(mo60483V());
            }
            if (view instanceof ChatRowPhotoSticker) {
                ((ChatRowPhotoSticker) view).setStickerDelegate(mo60483V());
            }
        }
        return eVar;
    }

    /* renamed from: X */
    public abstract ChatRowWebContent.InterfaceC11446g mo60485X();

    /* renamed from: Y */
    public a m60486Y() {
        return this.f57013F;
    }

    /* renamed from: Z */
    public abstract int mo60487Z();

    /* renamed from: a0 */
    protected abstract EnumC18030a mo60488a0();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b0 */
    public List m60489b0() {
        try {
            C26393b m136076v = this.f57026x.m136076v();
            if (m136076v == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < m136076v.m136016p(); i11++) {
                C17945a0 c17945a0 = (C17945a0) m136076v.m136006f(i11);
                if (c17945a0.m95120e6()) {
                    arrayList.add(c17945a0);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f57007M, e11);
            return Collections.emptyList();
        }
    }

    /* renamed from: d0 */
    public int m60490d0() {
        return this.f57008A;
    }

    /* renamed from: e0 */
    public int m60491e0() {
        return this.f57027y;
    }

    /* renamed from: f0 */
    public Object m60492f0(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < this.f57009B.size()) {
                    return this.f57009B.get(i11);
                }
                return null;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f57007M, e11);
                return null;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public List m60493g0(List list) {
        LinkedList linkedList = new LinkedList(list);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            if (c17945a0.m95219o8() || c17945a0.m95091b6()) {
                it.remove();
            }
        }
        return linkedList;
    }

    /* renamed from: h0 */
    public List m60494h0() {
        return this.f57009B;
    }

    /* renamed from: i0 */
    public int m60495i0() {
        return this.f57025w;
    }

    /* renamed from: j0 */
    protected abstract String mo60496j0();

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f57025w + this.f57027y + this.f57008A;
    }

    /* renamed from: k0 */
    public InterfaceC30793c m60497k0() {
        return this.f57014G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    /* renamed from: l0 */
    protected abstract int mo60498l0();

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d8, code lost:            if (m60473E0(r2.m95029V3()).f133322r == 4) goto L76;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x0091. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0094. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo10005m(int i11) {
        C17945a0 m143951k;
        C18013y0 c18013y0;
        C32098s c32098s;
        C32098s c32098s2;
        int m60463c0;
        int i12;
        if (i11 < this.f57028z) {
            return 82;
        }
        int i13 = this.f57027y;
        if (i11 < i13) {
            return 50;
        }
        if (i11 >= this.f57025w + i13) {
            return 51;
        }
        int i14 = 0;
        try {
            C28771c c28771c = (C28771c) m60492f0(i11 - m60491e0());
            if (c28771c.m143964x()) {
                m143951k = c28771c.m143954n();
            } else {
                m143951k = c28771c.m143951k();
            }
            if (m143951k == null) {
                return 0;
            }
            if (c28771c.m143962v()) {
                if (c28771c.m143952l() == 1) {
                    return 56;
                }
                if (c28771c.m143952l() == 3 && (m143951k.m95275v4() == null || !m143951k.m95219o8())) {
                    return 66;
                }
            }
            int m95041W4 = m143951k.m95041W4();
            char c11 = 5;
            if (m95041W4 != 2) {
                if (m95041W4 != 3 && m95041W4 != 4) {
                    if (m95041W4 != 6) {
                        if (m95041W4 != 12) {
                            if (m95041W4 != 15) {
                                if (m95041W4 != 45) {
                                    if (m95041W4 != 100) {
                                        if (m95041W4 != 28) {
                                            if (m95041W4 != 29) {
                                                if (m95041W4 != 51 && m95041W4 != 52) {
                                                    switch (m95041W4) {
                                                        case ZAdsErrorCode.SDK_NO_ADS_FREQUENCY_CAPPING /* -8 */:
                                                            return 81;
                                                        case ZAdsErrorCode.SDK_INVALID_ZONE /* -7 */:
                                                            return 80;
                                                        case -6:
                                                            return 79;
                                                        case -5:
                                                            return 78;
                                                        case -4:
                                                            return 75;
                                                        case -3:
                                                            return 74;
                                                        case -2:
                                                            return 37;
                                                        case -1:
                                                            return 38;
                                                        case 0:
                                                            if (m143951k.m95239r4() == null || m143951k.m95239r4().f91141c == null || (m60463c0 = m60463c0(m143951k.m95239r4().f91141c.m14322a0())) == 35) {
                                                                return 0;
                                                            }
                                                            return m60463c0;
                                                        default:
                                                            switch (m95041W4) {
                                                                case 18:
                                                                    return 6;
                                                                case 19:
                                                                    if (m143951k.m94987Q7() && m60503y0()) {
                                                                        return 39;
                                                                    }
                                                                    if (m143951k.m95051X3() != null && (m143951k.m95051X3().f91060c == 1000 || m143951k.m95051X3().f91060c == 1001 || m143951k.m95051X3().f91060c == 1002)) {
                                                                        return 57;
                                                                    }
                                                                    try {
                                                                        if (ZMediaPlayerSettings.getVideoConfig(0).getPlayInline() == 1 && ZMediaPlayerSettings.getVideoConfig(0).isZaloPlayer()) {
                                                                            if (m143951k.m94929K2() instanceof C17961f1) {
                                                                                C17961f1 c17961f1 = (C17961f1) m143951k.m94929K2();
                                                                                if (c17961f1.m95456J() > 0) {
                                                                                    if (c17961f1.m95514z() > 0) {
                                                                                        i12 = 59;
                                                                                        if (!m143951k.m95288w8()) {
                                                                                            return 65;
                                                                                        }
                                                                                        return i12;
                                                                                    }
                                                                                }
                                                                            }
                                                                            i12 = 4;
                                                                            if (!m143951k.m95288w8()) {
                                                                            }
                                                                        } else {
                                                                            return 4;
                                                                        }
                                                                    } catch (Exception e11) {
                                                                        e = e11;
                                                                        i14 = 4;
                                                                        AbstractC23350e.m122776f(f57007M, e);
                                                                        return i14;
                                                                    }
                                                                    break;
                                                                case 20:
                                                                case 26:
                                                                    break;
                                                                case 21:
                                                                    if (!(m143951k.m94929K2() instanceof C17984n0)) {
                                                                        return 0;
                                                                    }
                                                                    if (m143951k.m94932K6()) {
                                                                        return 31;
                                                                    }
                                                                    return 32;
                                                                case 22:
                                                                    return 33;
                                                                case 23:
                                                                    if (m143951k.m94987Q7() && m60503y0()) {
                                                                        return 40;
                                                                    }
                                                                    return 34;
                                                                case 24:
                                                                    if (!m143951k.m95064Y6() || mo60487Z() != 1) {
                                                                        if (m143951k.m94865C8()) {
                                                                            return 68;
                                                                        }
                                                                        return 36;
                                                                    }
                                                                    break;
                                                                    break;
                                                                case 25:
                                                                    return 53;
                                                                default:
                                                                    switch (m95041W4) {
                                                                        case 31:
                                                                            return 58;
                                                                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                                                            return 64;
                                                                        case 33:
                                                                        case 36:
                                                                            return 12;
                                                                        case 34:
                                                                            C3020p0 m14322a0 = m143951k.m95205n3().m14322a0();
                                                                            if (m14322a0 != null) {
                                                                                return m60463c0(m14322a0);
                                                                            }
                                                                            break;
                                                                        case 35:
                                                                            return 61;
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    return 72;
                                                }
                                            }
                                            if (m143951k.m94924J6()) {
                                                return 73;
                                            }
                                            if (m60473E0(m143951k.m95029V3()).f133322r == 4) {
                                                return 71;
                                            }
                                            return 21;
                                        }
                                        return 35;
                                    }
                                    return 44;
                                }
                                return 69;
                            }
                            return 18;
                        }
                        String str = m143951k.m94929K2().f91016u;
                        switch (str.hashCode()) {
                            case -2138772447:
                                if (str.equals("recommened.misscall")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1103456014:
                                if (str.equals("recommened.calltime")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -999310090:
                                if (str.equals("recommened.vip")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -914296263:
                                if (str.equals("recommened.game")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -914139583:
                                if (str.equals("recommened.link")) {
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -913862126:
                                if (str.equals("recommened.user")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -302954634:
                                if (str.equals("recommened.groupcall")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1012294412:
                                if (str.equals("recommened.stickerset")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2034143494:
                                if (str.equals("recommened.msg.game")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 1:
                                return 7;
                            case 2:
                                return 8;
                            case 3:
                            case 4:
                                return 10;
                            case 5:
                                if (m143951k.m94929K2() instanceof C18013y0) {
                                    c18013y0 = (C18013y0) m143951k.m94929K2();
                                } else {
                                    c18013y0 = null;
                                }
                                if (c18013y0 != null && (c32098s2 = c18013y0.f91251B) != null && c32098s2.m154938h()) {
                                    if (m143951k.m94987Q7() && m60503y0()) {
                                        return 63;
                                    }
                                    return 62;
                                }
                                if (m143951k.m94987Q7() && m60503y0()) {
                                    return 41;
                                }
                                if (c18013y0 == null || (c32098s = c18013y0.f91251B) == null) {
                                    return 9;
                                }
                                int i15 = c32098s.f147956f;
                                if ((i15 != 1 && i15 != 3) || (!TextUtils.equals(c32098s.f147952b, "mp3.zing.vn") && !TextUtils.equals(c32098s.f147952b, "zingmp3.vn"))) {
                                    if (c32098s.m154940j()) {
                                        return 43;
                                    }
                                    if (c32098s.m154944n()) {
                                        return 76;
                                    }
                                    if (!c32098s.m154941k()) {
                                        return 9;
                                    }
                                    return 77;
                                }
                                return 42;
                            case 6:
                            case 7:
                                return 14;
                            case '\b':
                                return 70;
                            default:
                                return 0;
                        }
                    }
                    return 2;
                }
                if (m143951k.m94987Q7() && m60503y0()) {
                    return 20;
                }
                return 1;
            }
            return 5;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: m0 */
    public int m60499m0() {
        return mo10003k();
    }

    /* renamed from: o0 */
    public boolean m60500o0(int i11, int i12) {
        while (i11 <= i12 && i11 >= 0) {
            try {
                if (i11 >= this.f57009B.size()) {
                    break;
                }
                if (((C28771c) this.f57009B.get(i11)).m143963w()) {
                    return true;
                }
                i11++;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return false;
    }

    /* renamed from: r0 */
    public boolean m60501r0(C17945a0 c17945a0) {
        if (C29210k.m145804c0().m145888v(AbstractC25495a.m132079d(this.f57026x.m17944I0()), AbstractC25495a.m132078c(this.f57026x.m17944I0())) && mo60487Z() == 1) {
            return C29210k.m145804c0().m145872k0(this.f57026x.m17944I0(), c17945a0.m95029V3().m41047k());
        }
        return false;
    }

    /* renamed from: x0 */
    public boolean m60502x0() {
        return this.f57015H != null;
    }

    /* renamed from: y0 */
    public boolean m60503y0() {
        a aVar = this.f57013F;
        if (aVar != null) {
            return aVar.mo60398R0();
        }
        Conversation conversation = this.f57024v;
        if (conversation != null && conversation.m41017x()) {
            return true;
        }
        return false;
    }
}
