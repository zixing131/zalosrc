package p489rn;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ao.InterfaceC2259a;
import ao.InterfaceC2263e;
import ao.InterfaceC2264f;
import ao.InterfaceC2265g;
import au.C2370r0;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3020p0;
import bo.InterfaceC3045u2;
import cd0.C3426e;
import com.zing.zalo.feed.components.C8323l1;
import com.zing.zalo.feed.components.FeedItemAsyncFail;
import com.zing.zalo.feed.components.FeedItemBiography;
import com.zing.zalo.feed.components.FeedItemCommentBarModulesView;
import com.zing.zalo.feed.components.FeedItemFooterActionBarModulesView;
import com.zing.zalo.feed.components.FeedItemGroupHorizontal;
import com.zing.zalo.feed.components.FeedItemHeaderBarModuleView;
import com.zing.zalo.feed.components.FeedItemLastSuggestModulesView;
import com.zing.zalo.feed.components.FeedItemLinkModulesView;
import com.zing.zalo.feed.components.FeedItemMemory;
import com.zing.zalo.feed.components.FeedItemMemoryEntry;
import com.zing.zalo.feed.components.FeedItemOAVideo;
import com.zing.zalo.feed.components.FeedItemOptionModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.components.FeedItemSocialAlbum;
import com.zing.zalo.feed.components.FeedItemStatusPostModuleView;
import com.zing.zalo.feed.components.FeedItemStickerModulesView;
import com.zing.zalo.feed.components.FeedItemSuggestBanner;
import com.zing.zalo.feed.components.FeedItemSuggestFriends;
import com.zing.zalo.feed.components.FeedItemSuggestHeaderModulesView;
import com.zing.zalo.feed.components.FeedItemSuggestMultiItems;
import com.zing.zalo.feed.components.FeedItemSuggestOA;
import com.zing.zalo.feed.components.FeedItemSuggestTitleBar;
import com.zing.zalo.feed.components.FeedItemTextModuleView;
import com.zing.zalo.feed.components.FeedItemVerticalGroupItemModulesView;
import com.zing.zalo.feed.components.FeedItemVerticalGroupItemMoreModulesView;
import com.zing.zalo.feed.components.FeedItemVerticalGroupLinkModulesView;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.feed.components.FeedItemVideoChannel;
import com.zing.zalo.feed.components.FeedItemZInstantAds;
import com.zing.zalo.feed.components.FeedItemZaloVideoContainerView;
import com.zing.zalo.feed.components.TimelineFeedItemFooterBar;
import com.zing.zalo.feed.formpostfeed.p063ui.TimelineFpfEntry;
import com.zing.zalo.feed.mvp.feed.view.UndoTabRowView;
import com.zing.zalo.feed.mvp.feed.view.component.TimelineEmptyContentView;
import com.zing.zalo.feed.uicontrols.suggestcomment.SuggestCommentView;
import com.zing.zalo.p077ui.zviews.FeedCallbackZaloView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.ListItem;
import is.AbstractC20809n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: rn.j */
/* loaded from: classes4.dex */
public abstract class AbstractC25881j extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    protected InterfaceC2264f f123427A;

    /* renamed from: B */
    protected InterfaceC2265g f123428B;

    /* renamed from: C */
    protected InterfaceC10867f f123429C;

    /* renamed from: D */
    protected FeedCallbackZaloView f123430D;

    /* renamed from: s */
    protected HashMap f123432s;

    /* renamed from: t */
    protected ArrayList f123433t;

    /* renamed from: x */
    protected InterfaceC2259a f123437x;

    /* renamed from: z */
    protected InterfaceC2263e f123439z;

    /* renamed from: r */
    private boolean f123431r = false;

    /* renamed from: u */
    protected List f123434u = new ArrayList();

    /* renamed from: v */
    protected final Object f123435v = new Object();

    /* renamed from: w */
    protected boolean f123436w = false;

    /* renamed from: y */
    protected C25866f0 f123438y = new C25866f0();

    /* renamed from: rn.j$a */
    /* loaded from: classes4.dex */
    public static abstract class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: A0 */
        public String f123440A0;

        /* renamed from: B0 */
        public TimelineFeedItemFooterBar f123441B0;

        /* renamed from: I */
        public FeedItemTextModuleView f123442I;

        /* renamed from: J */
        public FeedItemPhotoModuleView f123443J;

        /* renamed from: K */
        public FeedItemPhotoMultiModuleView f123444K;

        /* renamed from: L */
        public FeedItemStickerModulesView f123445L;

        /* renamed from: M */
        public FeedItemLinkModulesView f123446M;

        /* renamed from: N */
        public FeedItemVideo f123447N;

        /* renamed from: O */
        public FeedItemZaloVideoContainerView f123448O;

        /* renamed from: P */
        public FeedItemGroupHorizontal f123449P;

        /* renamed from: Q */
        public FeedItemGroupHorizontal f123450Q;

        /* renamed from: R */
        public FeedItemAsyncFail f123451R;

        /* renamed from: S */
        public FeedItemSuggestBanner f123452S;

        /* renamed from: T */
        public FeedItemSuggestMultiItems f123453T;

        /* renamed from: U */
        public FeedItemSuggestOA f123454U;

        /* renamed from: V */
        public FeedItemOAVideo f123455V;

        /* renamed from: W */
        public FeedItemVerticalGroupItemModulesView f123456W;

        /* renamed from: X */
        public FeedItemVerticalGroupItemMoreModulesView f123457X;

        /* renamed from: Y */
        public FeedItemVerticalGroupLinkModulesView f123458Y;

        /* renamed from: Z */
        public C2370r0 f123459Z;

        /* renamed from: a0 */
        public TimelineFpfEntry f123460a0;

        /* renamed from: b0 */
        public LinearLayout f123461b0;

        /* renamed from: c0 */
        public LinearLayout f123462c0;

        /* renamed from: d0 */
        public FeedItemSuggestFriends f123463d0;

        /* renamed from: e0 */
        public FeedItemLastSuggestModulesView f123464e0;

        /* renamed from: f0 */
        public C3426e f123465f0;

        /* renamed from: g0 */
        public FeedItemFooterActionBarModulesView f123466g0;

        /* renamed from: h0 */
        public FeedItemBiography f123467h0;

        /* renamed from: i0 */
        public FeedItemMemoryEntry f123468i0;

        /* renamed from: j0 */
        public FeedItemMemory f123469j0;

        /* renamed from: k0 */
        public FeedItemSocialAlbum f123470k0;

        /* renamed from: l0 */
        public SuggestCommentView f123471l0;

        /* renamed from: m0 */
        public FeedItemOptionModuleView f123472m0;

        /* renamed from: n0 */
        public ListItem f123473n0;

        /* renamed from: o0 */
        public UndoTabRowView f123474o0;

        /* renamed from: p0 */
        public TimelineEmptyContentView f123475p0;

        /* renamed from: q0 */
        public FrameLayout f123476q0;

        /* renamed from: r0 */
        public FeedItemVideoChannel f123477r0;

        /* renamed from: s0 */
        public FeedItemZInstantAds f123478s0;

        /* renamed from: t0 */
        public FeedItemSuggestTitleBar f123479t0;

        /* renamed from: u0 */
        public FeedItemHeaderBarModuleView f123480u0;

        /* renamed from: v0 */
        public FeedItemSuggestHeaderModulesView f123481v0;

        /* renamed from: w0 */
        public FeedItemCommentBarModulesView f123482w0;

        /* renamed from: x0 */
        public FeedItemCommentBarModulesView f123483x0;

        /* renamed from: y0 */
        public C8323l1 f123484y0;

        /* renamed from: z0 */
        public FeedItemStatusPostModuleView f123485z0;

        public a(View view, C16719g c16719g, int i11, Context context) {
            super(view);
            mo133425i0(view, c16719g, i11, context);
        }

        /* renamed from: i0 */
        public abstract void mo133425i0(View view, C16719g c16719g, int i11, Context context);
    }

    /* renamed from: rn.j$b */
    /* loaded from: classes4.dex */
    public interface b extends InterfaceC3045u2 {
    }

    /* renamed from: L */
    public static ArrayList m133526L(C3000l0 c3000l0, boolean z11) {
        int i11;
        ArrayList arrayList = new ArrayList();
        if (c3000l0 == null) {
            return arrayList;
        }
        C3020p0 m14324b0 = c3000l0.m14324b0(0);
        if (m14324b0 == null) {
            return arrayList;
        }
        int i12 = m14324b0.f12058q;
        int i13 = 24;
        if (i12 != 7 && i12 != 24) {
            i13 = 0;
        }
        arrayList.add(new C2966e1(c3000l0, m14324b0, i13));
        int m108561D = AbstractC20809n.m108561D(c3000l0);
        int size = c3000l0.f11899s.size();
        for (int i14 = 0; i14 < m108561D; i14++) {
            C3020p0 c3020p0 = (C3020p0) c3000l0.f11899s.get(i14);
            if (((C3020p0) c3000l0.f11899s.get(i14)).m14489T()) {
                i11 = 71;
            } else {
                i11 = 22;
            }
            arrayList.add(new C2966e1(c3000l0, c3020p0, i11));
        }
        if (m108561D < size) {
            arrayList.add(new C2966e1(c3000l0, (C3020p0) null, 23));
        } else {
            ((C2966e1) arrayList.get(arrayList.size() - 1)).f11704b.f12038R = true;
        }
        return arrayList;
    }

    /* renamed from: M */
    public static ArrayList m133527M(C3000l0 c3000l0, boolean z11) {
        List list;
        if (c3000l0 != null && (list = c3000l0.f11899s) != null && list.size() == 1 && c3000l0.f11899s.get(0) != null && ((C3020p0) c3000l0.f11899s.get(0)).m14489T()) {
            C2966e1 c2966e1 = new C2966e1(c3000l0, (C3020p0) c3000l0.f11899s.get(0), 70);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c2966e1);
            return arrayList;
        }
        return m133526L(c3000l0, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public InterfaceC10867f m133528N() {
        return this.f123430D;
    }

    /* renamed from: O */
    public ArrayList m133529O() {
        return this.f123433t;
    }

    /* renamed from: P */
    public C2966e1 m133530P(int i11) {
        synchronized (this.f123435v) {
            try {
                List list = this.f123434u;
                if (list != null && i11 >= 0 && i11 < list.size()) {
                    return (C2966e1) this.f123434u.get(i11);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Q */
    public List m133531Q() {
        List list;
        synchronized (this.f123435v) {
            list = this.f123434u;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public C2370r0 m133532R(String str) {
        return (C2370r0) this.f123432s.get(str);
    }

    /* renamed from: S */
    public void m133533S(InterfaceC2259a interfaceC2259a) {
        this.f123437x = interfaceC2259a;
        this.f123438y.m133508l0(interfaceC2259a);
    }

    /* renamed from: T */
    public void m133534T(FeedCallbackZaloView feedCallbackZaloView) {
        this.f123430D = feedCallbackZaloView;
    }

    /* renamed from: U */
    public void m133535U(InterfaceC2263e interfaceC2263e) {
        this.f123439z = interfaceC2263e;
    }

    /* renamed from: V */
    public void m133536V(InterfaceC2264f interfaceC2264f) {
        this.f123427A = interfaceC2264f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public void m133537W(C2370r0 c2370r0, String str) {
        this.f123432s.put(str, c2370r0);
    }

    /* renamed from: X */
    public void m133538X(InterfaceC2265g interfaceC2265g) {
        this.f123428B = interfaceC2265g;
    }

    /* renamed from: Y */
    public void m133539Y(boolean z11) {
        this.f123436w = z11;
    }
}
