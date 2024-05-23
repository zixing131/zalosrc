package p489rn;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import ao.InterfaceC2259a;
import ao.InterfaceC2262d;
import ao.InterfaceC2264f;
import ao.InterfaceC2265g;
import au.C2370r0;
import bi0.AbstractC2807a;
import bn.C2864d1;
import bo.C2966e1;
import bo.C2968e3;
import bo.C2976g1;
import bo.C2988i3;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3033r3;
import bo.InterfaceC2946a1;
import cd0.C3426e;
import com.adtima.Adtima;
import com.androidquery.util.C3979l;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.AbstractC7220t8;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.C8314k0;
import com.zing.zalo.feed.components.C8323l1;
import com.zing.zalo.feed.components.FeedItemAsyncFail;
import com.zing.zalo.feed.components.FeedItemBase;
import com.zing.zalo.feed.components.FeedItemBaseModuleView;
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
import com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto;
import com.zing.zalo.feed.components.FeedItemSocialAlbumVideo;
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
import com.zing.zalo.feed.components.FeedItemZInstantLifecycleHelper;
import com.zing.zalo.feed.components.FeedItemZaloVideoContainerView;
import com.zing.zalo.feed.components.FeedItemZaloVideoView;
import com.zing.zalo.feed.components.InterfaceC8343n5;
import com.zing.zalo.feed.components.InterfaceC8395t6;
import com.zing.zalo.feed.components.InterfaceC8403u6;
import com.zing.zalo.feed.components.InterfaceC8438y1;
import com.zing.zalo.feed.components.LoadingLayoutWithIndeterminateProgressBar;
import com.zing.zalo.feed.components.TimelineFeedItemFooterBar;
import com.zing.zalo.feed.formpostfeed.p063ui.TimelineFpfEntry;
import com.zing.zalo.feed.mvp.feed.view.UndoTabRowView;
import com.zing.zalo.feed.mvp.feed.view.component.TimelineEmptyContentView;
import com.zing.zalo.feed.uicontrols.suggestcomment.C8890a;
import com.zing.zalo.feed.uicontrols.suggestcomment.SuggestCommentView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hf0.C20040b;
import hf0.C20047i;
import ho0.AbstractC20110a;
import i40.C20275e;
import is.AbstractC20826v0;
import is.C20791e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l30.AbstractC22055v0;
import l30.C22021e0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import nk0.C23855s0;
import np.InterfaceC23922a;
import p022ap.C2271b;
import p022ap.C2272c;
import p022ap.C2274e;
import p167fs.C19140e;
import p175g0.AbstractC19181d;
import p354n3.C23528a;
import p425po.C24894p;
import p448qh.AbstractC25280e;
import p448qh.C25284i;
import p455qo.C25429q;
import p489rn.AbstractC25848a2;
import p489rn.AbstractC25881j;
import p583vq.C28570b;
import p716zh.C31877d;
import p716zh.C32002l4;
import p726zr.C32547c;
import pr.C24906b;
import sm.AbstractC26324b;
import sn.C26333b;
import tr.C26885i;
import ui0.C27280g;

/* renamed from: rn.a2 */
/* loaded from: classes4.dex */
public abstract class AbstractC25848a2 extends AbstractC25881j {

    /* renamed from: E */
    LayoutInflater f123288E;

    /* renamed from: F */
    Context f123289F;

    /* renamed from: M */
    AbstractC22055v0.l f123296M;

    /* renamed from: N */
    AbstractC7220t8 f123297N;

    /* renamed from: O */
    C23528a f123298O;

    /* renamed from: P */
    Rect f123299P;

    /* renamed from: Q */
    InterfaceC8438y1 f123300Q;

    /* renamed from: R */
    InterfaceC8343n5 f123301R;

    /* renamed from: W */
    C2864d1 f123306W;

    /* renamed from: X */
    KeyEventCallbackC17462c f123307X;

    /* renamed from: Y */
    C20047i f123308Y;

    /* renamed from: Z */
    AbstractC25280e f123309Z;

    /* renamed from: b0 */
    RecyclerView f123311b0;

    /* renamed from: G */
    Map f123290G = new HashMap();

    /* renamed from: H */
    Map f123291H = new HashMap();

    /* renamed from: I */
    public HashMap f123292I = new HashMap();

    /* renamed from: J */
    Parcelable f123293J = null;

    /* renamed from: K */
    public boolean f123294K = false;

    /* renamed from: L */
    Handler f123295L = new Handler(Looper.getMainLooper());

    /* renamed from: S */
    private final float f123302S = 0.7f;

    /* renamed from: T */
    private final int f123303T = 0;

    /* renamed from: U */
    private final int f123304U = 1;

    /* renamed from: V */
    private final int f123305V = 2;

    /* renamed from: a0 */
    Object f123310a0 = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$a */
    /* loaded from: classes4.dex */
    public class a implements FeedItemVideoChannel.InterfaceC8155e {

        /* renamed from: a */
        final /* synthetic */ C3000l0 f123312a;

        a(C3000l0 c3000l0) {
            this.f123312a = c3000l0;
        }

        @Override // com.zing.zalo.feed.components.FeedItemVideoChannel.InterfaceC8155e
        /* renamed from: a */
        public void mo44246a() {
            FeedActionZUtils.m47529Q(AbstractC25848a2.this.f123437x, this.f123312a, "", false);
        }

        @Override // com.zing.zalo.feed.components.FeedItemVideoChannel.InterfaceC8155e
        /* renamed from: b */
        public void mo44247b() {
            InterfaceC2264f interfaceC2264f = AbstractC25848a2.this.f123427A;
            if (interfaceC2264f != null) {
                interfaceC2264f.mo11982b();
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemVideoChannel.InterfaceC8155e
        /* renamed from: c */
        public void mo44248c(String str, int i11, C23855s0 c23855s0) {
            InterfaceC2264f interfaceC2264f = AbstractC25848a2.this.f123427A;
            if (interfaceC2264f != null) {
                interfaceC2264f.mo11983c(str, i11, c23855s0);
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemVideoChannel.InterfaceC8155e
        /* renamed from: d */
        public void mo44249d(String str, String str2) {
            InterfaceC2264f interfaceC2264f = AbstractC25848a2.this.f123427A;
            if (interfaceC2264f != null) {
                interfaceC2264f.mo11984d(str, str2);
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemVideoChannel.InterfaceC8155e
        /* renamed from: e */
        public void mo44250e(String str) {
            InterfaceC2264f interfaceC2264f = AbstractC25848a2.this.f123427A;
            if (interfaceC2264f != null) {
                interfaceC2264f.mo11985e(str);
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemVideoChannel.InterfaceC8155e
        /* renamed from: f */
        public void mo44251f() {
            InterfaceC2264f interfaceC2264f = AbstractC25848a2.this.f123427A;
            if (interfaceC2264f != null) {
                interfaceC2264f.mo11986f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$b */
    /* loaded from: classes4.dex */
    public class b implements FeedItemZInstantAds.InterfaceC8168b {
        b() {
        }

        @Override // com.zing.zalo.feed.components.FeedItemZInstantAds.InterfaceC8168b
        /* renamed from: a */
        public void mo44284a(String str) {
            InterfaceC2265g interfaceC2265g = AbstractC25848a2.this.f123428B;
            if (interfaceC2265g != null) {
                interfaceC2265g.mo11987a(str);
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemZInstantAds.InterfaceC8168b
        /* renamed from: b */
        public void mo44285b(String str) {
            InterfaceC2265g interfaceC2265g = AbstractC25848a2.this.f123428B;
            if (interfaceC2265g != null) {
                interfaceC2265g.mo11988b(str);
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemZInstantAds.InterfaceC8168b
        /* renamed from: c */
        public void mo44286c(String str) {
            InterfaceC2265g interfaceC2265g = AbstractC25848a2.this.f123428B;
            if (interfaceC2265g != null) {
                interfaceC2265g.mo11989c(str);
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemZInstantAds.InterfaceC8168b
        /* renamed from: d */
        public void mo44287d(String str) {
            InterfaceC2265g interfaceC2265g = AbstractC25848a2.this.f123428B;
            if (interfaceC2265g != null) {
                interfaceC2265g.mo11990d(str);
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemZInstantAds.InterfaceC8168b
        /* renamed from: e */
        public void mo44288e(int i11, String str) {
            InterfaceC2265g interfaceC2265g = AbstractC25848a2.this.f123428B;
            if (interfaceC2265g != null) {
                interfaceC2265g.mo11991e(i11, str);
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemZInstantAds.InterfaceC8168b
        /* renamed from: f */
        public void mo44289f(C3000l0 c3000l0, C3020p0 c3020p0) {
            InterfaceC2265g interfaceC2265g = AbstractC25848a2.this.f123428B;
            if (interfaceC2265g != null) {
                interfaceC2265g.mo11992f(c3000l0, c3020p0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$c */
    /* loaded from: classes4.dex */
    public class c implements TimelineFpfEntry.InterfaceC8456a {
        c() {
        }

        @Override // com.zing.zalo.feed.formpostfeed.p063ui.TimelineFpfEntry.InterfaceC8456a
        /* renamed from: t0 */
        public void mo45031t0() {
            try {
                InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11915AD(CoreUtility.f89233i, "", null, C32002l4.m154265h(10002, 4));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.formpostfeed.p063ui.TimelineFpfEntry.InterfaceC8456a
        /* renamed from: u0 */
        public void mo45032u0(int i11, String str) {
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11916Ak(i11, str);
            }
        }

        @Override // com.zing.zalo.feed.formpostfeed.p063ui.TimelineFpfEntry.InterfaceC8456a
        /* renamed from: v0 */
        public void mo45033v0(String str) {
            if (str != null && Boolean.TRUE.equals(new C25429q().m101506a())) {
                AbstractC26324b.m135471a(str, AbstractC25848a2.this.f123430D.m92692wK());
            }
        }

        @Override // com.zing.zalo.feed.formpostfeed.p063ui.TimelineFpfEntry.InterfaceC8456a
        /* renamed from: w0 */
        public void mo45034w0() {
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11924KG();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$d */
    /* loaded from: classes4.dex */
    public class d extends ViewPager.C6879n {

        /* renamed from: p */
        final /* synthetic */ AbstractC25881j.a f123316p;

        /* renamed from: q */
        final /* synthetic */ C3000l0 f123317q;

        d(AbstractC25881j.a aVar, C3000l0 c3000l0) {
            this.f123316p = aVar;
            this.f123317q = c3000l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m133424b() {
            AbstractC25848a2.this.m10008p();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onPageScrollStateChanged(int i11) {
            int currentItem;
            boolean z11;
            Handler handler;
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11918CB(i11);
            }
            if (i11 == 0 && ((Integer) AbstractC25848a2.this.f123290G.get(this.f123317q.f11895q)).intValue() != (currentItem = this.f123316p.f123449P.getPager().getCurrentItem())) {
                AbstractC25848a2.this.f123290G.put(this.f123317q.f11895q, Integer.valueOf(currentItem));
                C25897n0 c25897n0 = (C25897n0) this.f123316p.f123449P.getPager().getAdapter();
                boolean[] zArr = c25897n0.f123542G;
                if (zArr != null && currentItem < zArr.length && this.f123317q.m14322a0() != null) {
                    boolean[] zArr2 = c25897n0.f123542G;
                    if (!zArr2[currentItem]) {
                        zArr2[currentItem] = true;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (currentItem > 0) {
                        int i12 = currentItem - 1;
                        if (!zArr2[i12]) {
                            zArr2[i12] = true;
                            z11 = true;
                        }
                    }
                    if (currentItem < zArr2.length - 1) {
                        int i13 = currentItem + 1;
                        if (!zArr2[i13]) {
                            zArr2[i13] = true;
                            handler = AbstractC25848a2.this.f123295L;
                            if (handler == null) {
                                handler.post(new Runnable() { // from class: rn.b2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC25848a2.d.this.m133424b();
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    if (!z11) {
                        return;
                    }
                    handler = AbstractC25848a2.this.f123295L;
                    if (handler == null) {
                    }
                }
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            C3020p0 m14324b0;
            try {
                C3000l0 c3000l0 = this.f123317q;
                int i12 = c3000l0.f11886i0;
                if (i11 != i12 && (m14324b0 = c3000l0.m14324b0(i12)) != null) {
                    C26333b.f125013a.m135518n(m14324b0.f12057p, 1);
                }
                this.f123317q.f11886i0 = i11;
                InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11962lw(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$e */
    /* loaded from: classes4.dex */
    public class e extends ViewPager.C6879n {

        /* renamed from: p */
        final /* synthetic */ AbstractC25881j.a f123319p;

        /* renamed from: q */
        final /* synthetic */ C3000l0 f123320q;

        e(AbstractC25881j.a aVar, C3000l0 c3000l0) {
            this.f123319p = aVar;
            this.f123320q = c3000l0;
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            int currentItem;
            boolean z11;
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11918CB(i11);
            }
            if (i11 == 0 && ((Integer) AbstractC25848a2.this.f123290G.get(this.f123320q.f11895q)).intValue() != (currentItem = this.f123319p.f123450Q.getPager().getCurrentItem())) {
                AbstractC25848a2.this.f123290G.put(this.f123320q.f11895q, Integer.valueOf(currentItem));
                boolean[] zArr = ((C25897n0) this.f123319p.f123450Q.getPager().getAdapter()).f123542G;
                if (zArr != null && currentItem < zArr.length) {
                    if (!zArr[currentItem]) {
                        zArr[currentItem] = true;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (currentItem > 0) {
                        int i12 = currentItem - 1;
                        if (!zArr[i12]) {
                            zArr[i12] = true;
                            z11 = true;
                        }
                    }
                    if (currentItem < zArr.length - 1) {
                        int i13 = currentItem + 1;
                        if (!zArr[i13]) {
                            zArr[i13] = true;
                            AbstractC25848a2.this.m10008p();
                        }
                    }
                    if (!z11) {
                        return;
                    }
                    AbstractC25848a2.this.m10008p();
                }
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11966po();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$f */
    /* loaded from: classes4.dex */
    public class f implements C8890a.f {

        /* renamed from: a */
        final /* synthetic */ C3020p0 f123322a;

        /* renamed from: b */
        final /* synthetic */ C3000l0 f123323b;

        f(C3020p0 c3020p0, C3000l0 c3000l0) {
            this.f123322a = c3020p0;
            this.f123323b = c3000l0;
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.f
        /* renamed from: c */
        public void mo46559c() {
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.f
        /* renamed from: d */
        public void mo46560d(C2988i3 c2988i3, int i11, int i12) {
            AbstractC25848a2.this.m133386w1(this.f123322a, this.f123323b, c2988i3, i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$g */
    /* loaded from: classes4.dex */
    public class g implements C8890a.f {

        /* renamed from: a */
        final /* synthetic */ C3020p0 f123325a;

        /* renamed from: b */
        final /* synthetic */ C3000l0 f123326b;

        g(C3020p0 c3020p0, C3000l0 c3000l0) {
            this.f123325a = c3020p0;
            this.f123326b = c3000l0;
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.f
        /* renamed from: c */
        public void mo46559c() {
        }

        @Override // com.zing.zalo.feed.uicontrols.suggestcomment.C8890a.f
        /* renamed from: d */
        public void mo46560d(C2988i3 c2988i3, int i11, int i12) {
            AbstractC25848a2.this.m133386w1(this.f123325a, this.f123326b, c2988i3, i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$h */
    /* loaded from: classes4.dex */
    public class h extends ViewPager.C6879n {

        /* renamed from: p */
        final /* synthetic */ AbstractC25881j.a f123328p;

        /* renamed from: q */
        final /* synthetic */ C3000l0 f123329q;

        h(AbstractC25881j.a aVar, C3000l0 c3000l0) {
            this.f123328p = aVar;
            this.f123329q = c3000l0;
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            int currentItem;
            boolean z11;
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11918CB(i11);
            }
            if (i11 == 0 && ((Integer) AbstractC25848a2.this.f123290G.get(this.f123329q.f11895q)).intValue() != (currentItem = this.f123328p.f123453T.getPager().getCurrentItem())) {
                AbstractC25848a2.this.f123290G.put(this.f123329q.f11895q, Integer.valueOf(currentItem));
                C25930y0 c25930y0 = (C25930y0) this.f123328p.f123453T.getPager().getAdapter();
                boolean[] zArr = c25930y0.f123649B;
                if (zArr != null && currentItem < zArr.length && this.f123329q.m14322a0() != null) {
                    boolean[] zArr2 = c25930y0.f123649B;
                    if (!zArr2[currentItem]) {
                        zArr2[currentItem] = true;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (currentItem > 0) {
                        int i12 = currentItem - 1;
                        if (!zArr2[i12]) {
                            zArr2[i12] = true;
                            z11 = true;
                        }
                    }
                    if (currentItem < zArr2.length - 1) {
                        int i13 = currentItem + 1;
                        if (!zArr2[i13]) {
                            zArr2[i13] = true;
                            AbstractC25848a2.this.m10008p();
                        }
                    }
                    if (!z11) {
                        return;
                    }
                    AbstractC25848a2.this.m10008p();
                }
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11966po();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$i */
    /* loaded from: classes4.dex */
    public class i extends ViewPager.C6879n {

        /* renamed from: p */
        final /* synthetic */ AbstractC25881j.a f123331p;

        /* renamed from: q */
        final /* synthetic */ C3000l0 f123332q;

        i(AbstractC25881j.a aVar, C3000l0 c3000l0) {
            this.f123331p = aVar;
            this.f123332q = c3000l0;
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            int currentItem;
            boolean z11;
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11918CB(i11);
            }
            if (i11 == 0 && ((Integer) AbstractC25848a2.this.f123290G.get(this.f123332q.f11895q)).intValue() != (currentItem = this.f123331p.f123454U.getPager().getCurrentItem())) {
                AbstractC25848a2.this.f123290G.put(this.f123332q.f11895q, Integer.valueOf(currentItem));
                C25930y0 c25930y0 = (C25930y0) this.f123331p.f123454U.getPager().getAdapter();
                boolean[] zArr = c25930y0.f123649B;
                if (zArr != null && currentItem < zArr.length && this.f123332q.m14322a0() != null) {
                    boolean[] zArr2 = c25930y0.f123649B;
                    if (!zArr2[currentItem]) {
                        zArr2[currentItem] = true;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (currentItem > 0) {
                        int i12 = currentItem - 1;
                        if (!zArr2[i12]) {
                            zArr2[i12] = true;
                            z11 = true;
                        }
                    }
                    if (currentItem < zArr2.length - 1) {
                        int i13 = currentItem + 1;
                        if (!zArr2[i13]) {
                            zArr2[i13] = true;
                            AbstractC25848a2.this.m10008p();
                        }
                    }
                    if (!z11) {
                        return;
                    }
                    AbstractC25848a2.this.m10008p();
                }
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11966po();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$j */
    /* loaded from: classes4.dex */
    public class j extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ AbstractC25881j.a f123334a;

        j(AbstractC25881j.a aVar) {
            this.f123334a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                C25927x0 feedSuggestFriendAdapter = this.f123334a.f123463d0.getFeedSuggestFriendAdapter();
                if (i11 == 0) {
                    feedSuggestFriendAdapter.m133591S(false);
                    feedSuggestFriendAdapter.m10008p();
                    AbstractC25848a2.this.f123293J = this.f123334a.f123463d0.f44770v.mo9743b1();
                } else {
                    feedSuggestFriendAdapter.m133591S(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rn.a2$k */
    /* loaded from: classes4.dex */
    public class k implements FeedItemMemoryEntry.InterfaceC8100e {
        k() {
        }

        @Override // com.zing.zalo.feed.components.FeedItemMemoryEntry.InterfaceC8100e
        /* renamed from: V2 */
        public void mo43864V2(String str, String str2, C31877d c31877d) {
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11938V2(str, str2, new C31877d());
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemMemoryEntry.InterfaceC8100e
        /* renamed from: a */
        public void mo43865a(String str, String str2) {
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11928Ou(str, str2, new TrackingSource(100), C32002l4.m154265h(10002, 13));
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemMemoryEntry.InterfaceC8100e
        /* renamed from: b */
        public void mo43866b(String str) {
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11958ji(str);
            }
        }

        @Override // com.zing.zalo.feed.components.FeedItemMemoryEntry.InterfaceC8100e
        /* renamed from: c */
        public void mo43867c(String str) {
        }

        @Override // com.zing.zalo.feed.components.FeedItemMemoryEntry.InterfaceC8100e
        /* renamed from: d */
        public void mo43868d(String str, String str2) {
            InterfaceC2259a interfaceC2259a = AbstractC25848a2.this.f123437x;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11928Ou(str, str2, new TrackingSource(1), C32002l4.m154265h(10002, 13));
            }
        }
    }

    /* renamed from: rn.a2$l */
    /* loaded from: classes4.dex */
    public class l extends AbstractC25881j.a {
        public l(View view, C16719g c16719g, int i11, Context context) {
            super(view, c16719g, i11, context);
        }

        @Override // p489rn.AbstractC25881j.a
        /* renamed from: i0 */
        public void mo133425i0(View view, C16719g c16719g, int i11, Context context) {
            switch (i11) {
                case 2:
                    FeedItemTextModuleView feedItemTextModuleView = (FeedItemTextModuleView) view;
                    this.f123442I = feedItemTextModuleView;
                    feedItemTextModuleView.mo43705j0(context, 0);
                    return;
                case 3:
                    FeedItemPhotoModuleView feedItemPhotoModuleView = (FeedItemPhotoModuleView) view;
                    this.f123443J = feedItemPhotoModuleView;
                    feedItemPhotoModuleView.mo43705j0(context, 0);
                    return;
                case 4:
                case 6:
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                case 17:
                case 18:
                case 20:
                case 21:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                case 31:
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                case 45:
                case 48:
                case 50:
                case 54:
                case 60:
                case 76:
                default:
                    return;
                case 5:
                    FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView = (FeedItemPhotoMultiModuleView) view;
                    this.f123444K = feedItemPhotoMultiModuleView;
                    feedItemPhotoMultiModuleView.mo43705j0(context, 0);
                    return;
                case 8:
                    if (view instanceof FeedItemStickerModulesView) {
                        FeedItemStickerModulesView feedItemStickerModulesView = (FeedItemStickerModulesView) view;
                        this.f123445L = feedItemStickerModulesView;
                        feedItemStickerModulesView.mo43705j0(context, 0);
                        return;
                    }
                    return;
                case 9:
                    if (view instanceof FeedItemLinkModulesView) {
                        FeedItemLinkModulesView feedItemLinkModulesView = (FeedItemLinkModulesView) view;
                        this.f123446M = feedItemLinkModulesView;
                        feedItemLinkModulesView.mo43705j0(context, 0);
                        return;
                    }
                    return;
                case 19:
                    FeedItemGroupHorizontal feedItemGroupHorizontal = (FeedItemGroupHorizontal) view.findViewById(AbstractC6918a0.feedItemGroupHorizontal);
                    this.f123449P = feedItemGroupHorizontal;
                    feedItemGroupHorizontal.setFeedCallback(AbstractC25848a2.this.f123437x);
                    FeedItemGroupHorizontal feedItemGroupHorizontal2 = this.f123449P;
                    AbstractC25848a2 abstractC25848a2 = AbstractC25848a2.this;
                    feedItemGroupHorizontal2.f44401G = abstractC25848a2.f123296M;
                    feedItemGroupHorizontal2.setCallbackSpanListener(abstractC25848a2.m133528N());
                    this.f123449P.m43751c(context, 0);
                    return;
                case 22:
                    if (view instanceof FeedItemVerticalGroupItemModulesView) {
                        FeedItemVerticalGroupItemModulesView feedItemVerticalGroupItemModulesView = (FeedItemVerticalGroupItemModulesView) view;
                        this.f123456W = feedItemVerticalGroupItemModulesView;
                        feedItemVerticalGroupItemModulesView.m44161V();
                        return;
                    }
                    return;
                case 23:
                    if (view instanceof FeedItemVerticalGroupItemMoreModulesView) {
                        FeedItemVerticalGroupItemMoreModulesView feedItemVerticalGroupItemMoreModulesView = (FeedItemVerticalGroupItemMoreModulesView) view;
                        this.f123457X = feedItemVerticalGroupItemMoreModulesView;
                        feedItemVerticalGroupItemMoreModulesView.m44165V();
                        return;
                    }
                    return;
                case 24:
                    if (view instanceof FeedItemVerticalGroupLinkModulesView) {
                        FeedItemVerticalGroupLinkModulesView feedItemVerticalGroupLinkModulesView = (FeedItemVerticalGroupLinkModulesView) view;
                        this.f123458Y = feedItemVerticalGroupLinkModulesView;
                        feedItemVerticalGroupLinkModulesView.m44177g0();
                        return;
                    }
                    return;
                case 33:
                    this.f123451R = (FeedItemAsyncFail) view.findViewById(AbstractC6918a0.feedItemAsyncFail);
                    return;
                case 38:
                    FeedItemSuggestBanner feedItemSuggestBanner = (FeedItemSuggestBanner) view.findViewById(AbstractC6918a0.feedItemSuggestBanner);
                    this.f123452S = feedItemSuggestBanner;
                    feedItemSuggestBanner.mo43688p(context, 0);
                    if (this.f123452S.getFeedZinstantBanner() != null) {
                        AbstractC25848a2.this.m133332F0(this.f123452S.getFeedZinstantBanner());
                        return;
                    }
                    return;
                case 39:
                    FeedItemGroupHorizontal feedItemGroupHorizontal3 = (FeedItemGroupHorizontal) view.findViewById(AbstractC6918a0.feedItemGroupHorizontal);
                    this.f123450Q = feedItemGroupHorizontal3;
                    feedItemGroupHorizontal3.setFeedCallback(AbstractC25848a2.this.f123437x);
                    this.f123450Q.setCallbackSpanListener(AbstractC25848a2.this.m133528N());
                    this.f123450Q.m43751c(context, 2);
                    return;
                case 40:
                    if (c16719g instanceof C8323l1) {
                        C8323l1 c8323l1 = (C8323l1) c16719g;
                        this.f123484y0 = c8323l1;
                        c8323l1.m44778w1(context, 0);
                        return;
                    }
                    return;
                case 42:
                    if (view instanceof FeedItemCommentBarModulesView) {
                        FeedItemCommentBarModulesView feedItemCommentBarModulesView = (FeedItemCommentBarModulesView) view;
                        this.f123482w0 = feedItemCommentBarModulesView;
                        feedItemCommentBarModulesView.m43726Y(context, 0);
                        return;
                    }
                    return;
                case 43:
                    FeedItemHeaderBarModuleView feedItemHeaderBarModuleView = (FeedItemHeaderBarModuleView) view;
                    this.f123480u0 = feedItemHeaderBarModuleView;
                    feedItemHeaderBarModuleView.m43757W(context, 0, false);
                    return;
                case 46:
                    FeedItemSuggestMultiItems feedItemSuggestMultiItems = (FeedItemSuggestMultiItems) view.findViewById(AbstractC6918a0.feedItemSuggestMultiItems);
                    this.f123453T = feedItemSuggestMultiItems;
                    feedItemSuggestMultiItems.mo43688p(context, 0);
                    return;
                case 47:
                    FeedItemSuggestHeaderModulesView feedItemSuggestHeaderModulesView = (FeedItemSuggestHeaderModulesView) view;
                    this.f123481v0 = feedItemSuggestHeaderModulesView;
                    feedItemSuggestHeaderModulesView.m44139V(context, 0);
                    return;
                case 49:
                    FeedItemVideo feedItemVideo = (FeedItemVideo) view.findViewById(AbstractC6918a0.feedItemVideo);
                    this.f123447N = feedItemVideo;
                    feedItemVideo.mo43688p(context, 0);
                    return;
                case 51:
                    FeedItemSuggestTitleBar feedItemSuggestTitleBar = (FeedItemSuggestTitleBar) view.findViewById(AbstractC6918a0.feedItemSuggestTitleBar);
                    this.f123479t0 = feedItemSuggestTitleBar;
                    feedItemSuggestTitleBar.m44147a();
                    return;
                case 52:
                    FeedItemSuggestOA feedItemSuggestOA = (FeedItemSuggestOA) view.findViewById(AbstractC6918a0.feedItemSuggestOA);
                    this.f123454U = feedItemSuggestOA;
                    feedItemSuggestOA.mo43688p(context, 0);
                    return;
                case 53:
                    this.f123460a0 = (TimelineFpfEntry) view;
                    return;
                case 55:
                case 56:
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
                    this.f123461b0 = linearLayout;
                    linearLayout.setBackgroundResource(AbstractC17466e.transparent);
                    this.f123462c0 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterError);
                    return;
                case 57:
                    AbstractC25848a2 abstractC25848a22 = AbstractC25848a2.this;
                    this.f123465f0 = new C3426e(view, abstractC25848a22.f123296M, abstractC25848a22.f123297N);
                    return;
                case 58:
                    FeedItemSuggestFriends feedItemSuggestFriends = (FeedItemSuggestFriends) view.findViewById(AbstractC6918a0.feedItemSuggestFriends);
                    this.f123463d0 = feedItemSuggestFriends;
                    feedItemSuggestFriends.m44132h(context, 94);
                    return;
                case 59:
                    if (view instanceof FeedItemLastSuggestModulesView) {
                        FeedItemLastSuggestModulesView feedItemLastSuggestModulesView = (FeedItemLastSuggestModulesView) view;
                        this.f123464e0 = feedItemLastSuggestModulesView;
                        feedItemLastSuggestModulesView.m43781X(context, 0);
                        return;
                    }
                    return;
                case 61:
                    if (view instanceof FeedItemFooterActionBarModulesView) {
                        FeedItemFooterActionBarModulesView feedItemFooterActionBarModulesView = (FeedItemFooterActionBarModulesView) view;
                        this.f123466g0 = feedItemFooterActionBarModulesView;
                        feedItemFooterActionBarModulesView.m43745W();
                        return;
                    }
                    return;
                case 62:
                    View findViewById = view.findViewById(AbstractC6918a0.feedItemOAVideo);
                    if (findViewById instanceof FeedItemOAVideo) {
                        FeedItemOAVideo feedItemOAVideo = (FeedItemOAVideo) findViewById;
                        this.f123455V = feedItemOAVideo;
                        feedItemOAVideo.mo43688p(context, 0);
                        return;
                    }
                    return;
                case 63:
                    SuggestCommentView suggestCommentView = (SuggestCommentView) view;
                    this.f123471l0 = suggestCommentView;
                    suggestCommentView.setMode(10);
                    return;
                case 64:
                    FeedItemBiography feedItemBiography = (FeedItemBiography) view.findViewById(AbstractC6918a0.feedItemBiography);
                    this.f123467h0 = feedItemBiography;
                    feedItemBiography.mo43688p(context, 0);
                    return;
                case 65:
                    FeedItemMemoryEntry feedItemMemoryEntry = (FeedItemMemoryEntry) view.findViewById(AbstractC6918a0.feedItemMemoryEntry);
                    this.f123468i0 = feedItemMemoryEntry;
                    AbstractC25848a2.this.m133332F0(feedItemMemoryEntry);
                    return;
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    FeedItemMemory feedItemMemory = (FeedItemMemory) view.findViewById(AbstractC6918a0.feedItemMemory);
                    this.f123469j0 = feedItemMemory;
                    feedItemMemory.mo43688p(context, 0);
                    AbstractC25848a2.this.m133332F0(this.f123469j0);
                    return;
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    if (view instanceof FeedItemCommentBarModulesView) {
                        FeedItemCommentBarModulesView feedItemCommentBarModulesView2 = (FeedItemCommentBarModulesView) view;
                        this.f123483x0 = feedItemCommentBarModulesView2;
                        feedItemCommentBarModulesView2.m43726Y(context, 0);
                        return;
                    }
                    return;
                case 68:
                    FeedItemSocialAlbum feedItemSocialAlbum = (FeedItemSocialAlbum) view.findViewById(AbstractC6918a0.feedItemSocialAlbum);
                    this.f123470k0 = feedItemSocialAlbum;
                    feedItemSocialAlbum.m44014W(context, 0, view);
                    return;
                case 69:
                    if (view instanceof SuggestCommentView) {
                        SuggestCommentView suggestCommentView2 = (SuggestCommentView) view;
                        this.f123471l0 = suggestCommentView2;
                        suggestCommentView2.setMode(10);
                        return;
                    }
                    return;
                case 70:
                    if (view instanceof FeedItemOptionModuleView) {
                        FeedItemOptionModuleView feedItemOptionModuleView = (FeedItemOptionModuleView) view;
                        this.f123472m0 = feedItemOptionModuleView;
                        feedItemOptionModuleView.m43908t0(0);
                        return;
                    }
                    return;
                case 71:
                    if (view instanceof FeedItemOptionModuleView) {
                        FeedItemOptionModuleView feedItemOptionModuleView2 = (FeedItemOptionModuleView) view;
                        this.f123472m0 = feedItemOptionModuleView2;
                        feedItemOptionModuleView2.m43908t0(12);
                        return;
                    }
                    return;
                case 72:
                    if (view instanceof ListItem) {
                        this.f123473n0 = (ListItem) view;
                        ImageView imageView = new ImageView(context);
                        imageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_setting_line_24, AbstractC2807a.icon_02));
                        this.f123473n0.m90587c(imageView);
                        ListItem listItem = this.f123473n0;
                        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
                        listItem.setLeadingGravity(enumC16952b0);
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
                        this.f123473n0.m90589e(imageView2);
                        this.f123473n0.setTrailingGravity(enumC16952b0);
                        this.f123473n0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_timeline_manage_tab_other_title));
                        this.f123473n0.setIdTracking("timeline_setting_manage_move_tab_user");
                        return;
                    }
                    return;
                case 73:
                    if (view instanceof UndoTabRowView) {
                        this.f123474o0 = (UndoTabRowView) view;
                        return;
                    }
                    return;
                case 74:
                    if (view instanceof TimelineEmptyContentView) {
                        this.f123475p0 = (TimelineEmptyContentView) view;
                        return;
                    }
                    return;
                case 75:
                    if (view instanceof FrameLayout) {
                        this.f123476q0 = (FrameLayout) view;
                        return;
                    }
                    return;
                case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                    if (view instanceof FeedItemStatusPostModuleView) {
                        FeedItemStatusPostModuleView feedItemStatusPostModuleView = (FeedItemStatusPostModuleView) view;
                        this.f123485z0 = feedItemStatusPostModuleView;
                        feedItemStatusPostModuleView.m44082W(context, 0);
                        return;
                    }
                    return;
                case 78:
                    if (view instanceof FeedItemVideoChannel) {
                        this.f123477r0 = (FeedItemVideoChannel) view;
                        return;
                    }
                    return;
                case 79:
                    if (view instanceof FeedItemZaloVideoContainerView) {
                        FeedItemZaloVideoContainerView feedItemZaloVideoContainerView = (FeedItemZaloVideoContainerView) view;
                        this.f123448O = feedItemZaloVideoContainerView;
                        feedItemZaloVideoContainerView.m44300a(context, 0);
                        return;
                    }
                    return;
                case 80:
                    if (view instanceof TimelineFeedItemFooterBar) {
                        this.f123441B0 = (TimelineFeedItemFooterBar) view;
                        return;
                    }
                    return;
                case 81:
                    if (view instanceof FeedItemZInstantAds) {
                        FeedItemZInstantAds feedItemZInstantAds = (FeedItemZInstantAds) view;
                        this.f123478s0 = feedItemZInstantAds;
                        AbstractC25848a2.this.m133332F0(feedItemZInstantAds);
                        return;
                    }
                    return;
            }
        }
    }

    public AbstractC25848a2(Context context, AbstractC22055v0.l lVar, AbstractC7220t8 abstractC7220t8) {
        this.f123288E = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f123289F = context;
        this.f123432s = new HashMap();
        this.f123298O = new C23528a(context);
        this.f123296M = lVar;
        this.f123297N = abstractC7220t8;
        if (ZMediaPlayerSettings.isVideoAutoplay()) {
            this.f123308Y = new C20047i(1);
            C25284i c25284i = new C25284i(CoreUtility.f89233i, this);
            this.f123309Z = c25284i;
            this.f123308Y.m104094h0(c25284i);
        }
    }

    /* renamed from: D0 */
    private void m133331D0(C3000l0 c3000l0) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11920GI(c3000l0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public void m133332F0(InterfaceC8403u6 interfaceC8403u6) {
        InterfaceC8438y1 interfaceC8438y1 = this.f123300Q;
        if (interfaceC8438y1 != null) {
            FeedItemZInstantLifecycleHelper.m44299a(interfaceC8438y1.mo44963a(), interfaceC8403u6);
        }
        if (interfaceC8403u6 instanceof InterfaceC8395t6) {
            ((InterfaceC8395t6) interfaceC8403u6).setParentStateInfoProvider(this.f123301R);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public /* synthetic */ void m133333L0(C3000l0 c3000l0, View view) {
        m133331D0(c3000l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public /* synthetic */ void m133334M0(C3000l0 c3000l0, C16719g c16719g) {
        m133331D0(c3000l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public /* synthetic */ void m133335N0(C3033r3 c3033r3) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11932R9(c3033r3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ void m133336O0(View view) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11965op();
        }
    }

    /* renamed from: O1 */
    private void m133337O1(C2966e1 c2966e1, C32547c c32547c, int i11) {
        C3020p0 c3020p0 = c2966e1.f11704b;
        if (c3020p0 != null) {
            C19140e.f95172a.m100456h(c3020p0, c32547c);
            m10009q(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public /* synthetic */ void m133338P0(C3033r3 c3033r3) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11932R9(c3033r3);
        }
    }

    /* renamed from: P1 */
    private void m133339P1(C2966e1 c2966e1, String str, C32547c c32547c, int i11) {
        C3000l0 c3000l0 = c2966e1.f11703a;
        if (c3000l0 != null && c3000l0.f11899s != null) {
            for (int i12 = 0; i12 < c2966e1.f11703a.f11899s.size(); i12++) {
                if (c2966e1.f11703a.m14324b0(i12) != null && Objects.equals(c2966e1.f11703a.m14324b0(i12).f12057p, str)) {
                    C19140e.f95172a.m100456h(c2966e1.f11703a.m14324b0(i12), c32547c);
                    c2966e1.f11703a.m14298H1();
                    m10009q(i11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ void m133340Q0(C3020p0 c3020p0, View view) {
        try {
            if (this.f123437x != null) {
                if (m133397G0() != null) {
                    m133397G0().m104095v();
                }
                this.f123437x.mo11923Jd(c3020p0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ void m133341R0(AbstractC25881j.a aVar, AnimationTarget animationTarget, C17391z c17391z) {
        try {
            if (m133397G0() != null) {
                m133397G0().m104095v();
                m133397G0().m104092Z(true);
            }
            int dimension = (int) this.f123289F.getResources().getDimension(AbstractC19181d.abc_action_bar_default_height_material);
            int dimension2 = (int) this.f123289F.getResources().getDimension(AbstractC16802y.abs__action_bar_default_height);
            C20275e c20275e = new C20275e();
            c20275e.m105882u(dimension);
            c20275e.m105881t(dimension2);
            C2370r0 c2370r0 = aVar.f123459Z;
            if (c2370r0 != null) {
                c20275e.m105860F((View) c2370r0.m12394a());
            }
            Context context = this.f123289F;
            if (context != null && (context instanceof BaseZaloActivity)) {
                ((BaseZaloActivity) context).m56682E3((BaseZaloActivity) context, animationTarget, c17391z.f88622e, new Bundle(), c20275e, c17391z, 1);
            }
        } catch (Resources.NotFoundException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public /* synthetic */ void m133342S0(C3020p0 c3020p0, C3000l0 c3000l0, C16719g c16719g) {
        AbstractC22055v0.l lVar;
        if (AbstractC22055v0.m115114D(c3020p0.f12022B.f12280b, false) && (lVar = this.f123296M) != null) {
            lVar.mo47172c(AbstractC22055v0.m115161u(c3020p0.f12022B.f12280b), null, 346);
            return;
        }
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11945af(c16719g, c3000l0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ void m133343T0(C3020p0 c3020p0, C3000l0 c3000l0, C16719g c16719g) {
        AbstractC22055v0.l lVar;
        if (AbstractC22055v0.m115114D(c3020p0.f12022B.f12280b, false) && (lVar = this.f123296M) != null) {
            lVar.mo47172c(AbstractC22055v0.m115161u(c3020p0.f12022B.f12280b), null, 346);
            return;
        }
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11945af(c16719g, c3000l0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ void m133344U0(C3000l0 c3000l0, C16719g c16719g) {
        int i11;
        if (this.f123290G.get(c3000l0.f11895q) != null) {
            i11 = ((Integer) this.f123290G.get(c3000l0.f11895q)).intValue();
        } else {
            i11 = 0;
        }
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11949cm(c16719g, c3000l0, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m133345V0(C3020p0 c3020p0, C3000l0 c3000l0, C16719g c16719g) {
        if (c3020p0 != null) {
            try {
                if (c3020p0.f12023C.f12093B != null && m133397G0() != null) {
                    m133397G0().m104095v();
                }
                if (this.f123437x != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("extra_need_scroll_to_bottom", true);
                    this.f123437x.mo11936Tt(c16719g, c3000l0, 0, true, bundle);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m133346W0(C3020p0 c3020p0, C3000l0 c3000l0, C16719g c16719g) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11919Eu(c3020p0, c3000l0, "", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m133347X0(C3020p0 c3020p0, C3000l0 c3000l0, View view) {
        if (c3020p0 != null) {
            try {
                if (c3020p0.f12023C.f12093B != null && m133397G0() != null) {
                    m133397G0().m104095v();
                }
                if (this.f123437x != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("extra_need_scroll_to_bottom", true);
                    this.f123437x.mo11960kf(view, c3000l0, 0, true, bundle);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ void m133348Y0(C3020p0 c3020p0, C3000l0 c3000l0, View view) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11919Eu(c3020p0, c3000l0, "", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ void m133350Z0(View view) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a instanceof AbstractC25881j.b) {
            ((AbstractC25881j.b) interfaceC2259a).mo14631rG(new C2272c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ void m133352a1(C3020p0 c3020p0, C3000l0 c3000l0, View view) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11919Eu(c3020p0, c3000l0, "", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ void m133354b1(C3020p0 c3020p0, C3000l0 c3000l0, View view) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11919Eu(c3020p0, c3000l0, "", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ void m133356c1(C3000l0 c3000l0, AbstractC25881j.a aVar, View view) {
        try {
            if (this.f123437x != null) {
                if (m133397G0() != null) {
                    m133397G0().m104095v();
                }
                InterfaceC2259a interfaceC2259a = this.f123437x;
                C17391z m108787U = AbstractC20826v0.m108787U(c3000l0.m14322a0(), 0);
                FeedItemSocialAlbumVideo feedItemSocialAlbumVideo = aVar.f123470k0.f44639s0;
                interfaceC2259a.mo11957ig(c3000l0, 0, m108787U, 1, feedItemSocialAlbumVideo, feedItemSocialAlbumVideo.getVideoDisplayView());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public /* synthetic */ void m133358d1(C3000l0 c3000l0, int i11) {
        try {
            if (this.f123437x != null) {
                if (m133397G0() != null) {
                    m133397G0().m104095v();
                }
                this.f123437x.mo11957ig(c3000l0, 0, AbstractC20826v0.m108787U(c3000l0.m14322a0(), i11), 1, null, null);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public /* synthetic */ void m133360e1(C24894p c24894p) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a instanceof AbstractC25881j.b) {
            ((AbstractC25881j.b) interfaceC2259a).mo14631rG(new C2271b(c24894p));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public /* synthetic */ void m133363g1(C3000l0 c3000l0, C3000l0 c3000l02, String str) {
        FeedActionZUtils.m47529Q(this.f123437x, c3000l0, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ void m133365h1(C3000l0 c3000l0, View view) {
        Map map;
        if (c3000l0 != null && (map = this.f123290G) != null && map.get(c3000l0.f11895q) != null) {
            int intValue = ((Integer) this.f123290G.get(c3000l0.f11895q)).intValue();
            if (intValue >= 0 && intValue < c3000l0.f11899s.size()) {
                InterfaceC2259a interfaceC2259a = this.f123437x;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11939We(view, c3000l0, intValue);
                    return;
                }
                return;
            }
            InterfaceC2259a interfaceC2259a2 = this.f123437x;
            if (interfaceC2259a2 != null) {
                interfaceC2259a2.mo11939We(view, c3000l0, 0);
                return;
            }
            return;
        }
        InterfaceC2259a interfaceC2259a3 = this.f123437x;
        if (interfaceC2259a3 != null) {
            interfaceC2259a3.mo11939We(view, c3000l0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ void m133367i1(C3000l0 c3000l0, C3000l0 c3000l02, String str) {
        FeedActionZUtils.m47529Q(this.f123437x, c3000l0, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m133369j1(C3020p0 c3020p0, C3000l0 c3000l0, int i11, C16719g c16719g) {
        AbstractC22055v0.l lVar;
        if (AbstractC22055v0.m115114D(c3020p0.f12022B.f12280b, false) && (lVar = this.f123296M) != null) {
            lVar.mo47172c(AbstractC22055v0.m115161u(c3020p0.f12022B.f12280b), null, 346);
            return;
        }
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11945af(c16719g, c3000l0, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m133371k1(C3000l0 c3000l0, C16719g c16719g) {
        InterfaceC2259a interfaceC2259a = this.f123437x;
        if (interfaceC2259a instanceof AbstractC25881j.b) {
            ((AbstractC25881j.b) interfaceC2259a).mo14631rG(new C2274e(c3000l0.f11895q));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m133373l1(C3000l0 c3000l0, AbstractC25881j.a aVar, View view) {
        try {
            if (this.f123437x != null) {
                if (m133397G0() != null) {
                    m133397G0().m104095v();
                }
                InterfaceC2259a interfaceC2259a = this.f123437x;
                C17391z m108789V = AbstractC20826v0.m108789V(c3000l0.m14322a0());
                FeedItemVideo feedItemVideo = aVar.f123447N;
                interfaceC2259a.mo11957ig(c3000l0, 0, m108789V, 1, feedItemVideo, feedItemVideo.getVideoDisplayView());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m133375m1(int i11, InterfaceC2946a1 interfaceC2946a1) {
        m10010r(i11, interfaceC2946a1);
    }

    /* renamed from: n1 */
    private void m133376n1(int i11, int i12, int i13, int i14) {
        C24906b.f119505a.m129546E("timeline", i11, i12, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public void m133386w1(C3020p0 c3020p0, C3000l0 c3000l0, C2988i3 c2988i3, int i11, int i12) {
        if (c3020p0 != null && c3000l0 != null) {
            if (this.f123437x != null) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("EXTRA_OPEN_WITH_SUGGEST_COMMENT", true);
                bundle.putString("EXTRA_SUGGEST_COMMENT", c2988i3.m14170i().toString());
                this.f123437x.mo11919Eu(c3020p0, c3000l0, "", bundle);
            }
            m133376n1(i11, i12, c3020p0.f12058q, c2988i3.m14164c());
            C24906b c24906b = C24906b.f119505a;
            C2976g1 m129551v = c24906b.m129551v(c3020p0.f12057p);
            if (m129551v != null) {
                c24906b.m129550N(m129551v, true);
            }
        }
    }

    /* renamed from: A1 */
    public void m133390A1(RecyclerView recyclerView, int i11) {
        try {
            if (m133397G0() != null) {
                m133397G0().m104086Q(recyclerView, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B1 */
    public void m133391B1() {
        if (m133397G0() != null) {
            m133397G0().m104087R();
        }
        C2864d1 c2864d1 = this.f123306W;
        if (c2864d1 != null && c2864d1.m92868m()) {
            this.f123306W.dismiss();
        }
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f123307X;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f123307X.dismiss();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo9997H(AbstractC25881j.a aVar) {
        super.mo9997H(aVar);
        if (aVar != null && aVar.m9931C() == 57) {
            ZMediaPlayer.releaseUrlBySection(ZMediaPlayerSettings.getVideoConfig(2));
        }
    }

    /* renamed from: D1 */
    public void m133393D1() {
        try {
            synchronized (this.f123435v) {
                try {
                    if (this.f123434u == null) {
                        return;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < this.f123434u.size()) {
                            if (((C2966e1) this.f123434u.get(i11)).f11705c == 38) {
                                break;
                            } else {
                                i11++;
                            }
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 != -1) {
                        this.f123434u.remove(i11);
                        m10008p();
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E0 */
    public void m133394E0() {
        Map map = this.f123290G;
        if (map != null) {
            map.clear();
        }
    }

    /* renamed from: E1 */
    public void m133395E1(List list, List list2) {
        this.f123433t = new ArrayList(list);
        synchronized (this.f123435v) {
            this.f123434u = list2;
        }
        C20047i c20047i = this.f123308Y;
        if (c20047i != null && c20047i.m104080G() != null) {
            this.f123308Y.m104080G().m130842t();
        }
    }

    /* renamed from: F1 */
    public void m133396F1(InterfaceC8438y1 interfaceC8438y1) {
        this.f123300Q = interfaceC8438y1;
    }

    /* renamed from: G0 */
    public C20047i m133397G0() {
        if (this.f123308Y == null && ZMediaPlayerSettings.isVideoAutoplay()) {
            this.f123308Y = new C20047i(1);
            C25284i c25284i = new C25284i(CoreUtility.f89233i, this);
            this.f123309Z = c25284i;
            this.f123308Y.m104094h0(c25284i);
        }
        return this.f123308Y;
    }

    /* renamed from: G1 */
    public void m133398G1(InterfaceC23922a interfaceC23922a) {
        C20047i c20047i = this.f123308Y;
        if (c20047i != null) {
            c20047i.m104093g0(interfaceC23922a);
        }
    }

    /* renamed from: H0 */
    public InterfaceC2259a m133399H0() {
        return this.f123437x;
    }

    /* renamed from: H1 */
    public void m133400H1(InterfaceC8343n5 interfaceC8343n5) {
        this.f123301R = interfaceC8343n5;
    }

    /* renamed from: I0 */
    View.OnClickListener m133401I0(final C3000l0 c3000l0) {
        return new View.OnClickListener() { // from class: rn.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC25848a2.this.m133333L0(c3000l0, view);
            }
        };
    }

    /* renamed from: I1 */
    public void m133402I1(boolean z11) {
        try {
            synchronized (this.f123435v) {
                try {
                    List list = this.f123434u;
                    if (list != null && !list.isEmpty()) {
                        if (z11) {
                            Iterator it = this.f123434u.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C2966e1) it.next()).f11705c == 56) {
                                        break;
                                    }
                                } else {
                                    this.f123434u.add(new C2966e1((C3000l0) null, (C3020p0) null, 56));
                                    m10011s(this.f123434u.size() - 1);
                                    break;
                                }
                            }
                        } else {
                            int mo10003k = mo10003k();
                            int i11 = 0;
                            while (true) {
                                if (i11 < mo10003k) {
                                    if (((C2966e1) this.f123434u.get(i11)).f11705c == 56) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                } else {
                                    i11 = -1;
                                    break;
                                }
                            }
                            if (i11 != -1) {
                                this.f123434u.remove(i11);
                                m10017y(i11);
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J0 */
    C16719g.c m133403J0(final C3000l0 c3000l0) {
        return new C16719g.c() { // from class: rn.r1
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                AbstractC25848a2.this.m133334M0(c3000l0, c16719g);
            }
        };
    }

    /* renamed from: J1 */
    public void m133404J1(boolean z11) {
        try {
            synchronized (this.f123435v) {
                try {
                    List list = this.f123434u;
                    if (list != null && !list.isEmpty()) {
                        if (z11) {
                            Iterator it = this.f123434u.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C2966e1) it.next()).f11705c == 55) {
                                        break;
                                    }
                                } else {
                                    this.f123434u.add(new C2966e1((C3000l0) null, (C3020p0) null, 55));
                                    m10011s(this.f123434u.size() - 1);
                                    break;
                                }
                            }
                        } else {
                            int mo10003k = mo10003k();
                            int i11 = 0;
                            while (true) {
                                if (i11 < mo10003k) {
                                    if (((C2966e1) this.f123434u.get(i11)).f11705c == 55) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                } else {
                                    i11 = -1;
                                    break;
                                }
                            }
                            if (i11 != -1) {
                                this.f123434u.remove(i11);
                                m10017y(i11);
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K0 */
    public AbstractC25280e m133405K0() {
        return this.f123309Z;
    }

    /* renamed from: K1 */
    public void m133406K1(C3000l0 c3000l0) {
        String str;
        String str2;
        synchronized (this.f123435v) {
            try {
                if (this.f123434u == null) {
                    return;
                }
                for (int i11 = 0; i11 < this.f123434u.size(); i11++) {
                    C3000l0 c3000l02 = ((C2966e1) this.f123434u.get(i11)).f11703a;
                    if (c3000l02 != null && (str = c3000l02.f11895q) != null && (str2 = c3000l0.f11895q) != null && str.equals(str2)) {
                        m10009q(i11);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: L1 */
    public void m133407L1(C3000l0 c3000l0) {
        if (c3000l0 != null) {
            try {
                Map map = this.f123290G;
                if (map != null && map.get(c3000l0.f11895q) != null) {
                    int intValue = ((Integer) this.f123290G.get(c3000l0.f11895q)).intValue();
                    if (intValue > 0) {
                        intValue--;
                    }
                    this.f123290G.put(c3000l0.f11895q, Integer.valueOf(intValue));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: M1 */
    public void m133408M1(int i11) {
        synchronized (this.f123435v) {
            try {
                if (this.f123434u == null) {
                    return;
                }
                for (int i12 = 0; i12 < this.f123434u.size(); i12++) {
                    if (((C2966e1) this.f123434u.get(i12)).f11705c == i11) {
                        m10009q(i12);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: N1 */
    public void m133409N1(String str) {
        synchronized (this.f123435v) {
            try {
                if (this.f123434u == null) {
                    return;
                }
                for (int i11 = 0; i11 < this.f123434u.size(); i11++) {
                    C2966e1 c2966e1 = (C2966e1) this.f123434u.get(i11);
                    C3020p0 c3020p0 = c2966e1.f11704b;
                    if (c3020p0 != null && c3020p0.f12057p.equals(str) && c2966e1.f11705c == 79) {
                        m10010r(i11, new Object());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Q1 */
    public void m133410Q1(String str, final InterfaceC2946a1 interfaceC2946a1) {
        C3025q0 c3025q0;
        int i11;
        synchronized (this.f123435v) {
            try {
                if (this.f123434u == null) {
                    return;
                }
                for (final int i12 = 0; i12 < this.f123434u.size(); i12++) {
                    C2966e1 c2966e1 = (C2966e1) this.f123434u.get(i12);
                    C3020p0 c3020p0 = c2966e1.f11704b;
                    if (C20791e.f102159a.m108488d() && c3020p0 != null && c3020p0.f12057p.equals(str) && (c3025q0 = c3020p0.f12023C) != null && c3025q0.f12108Q != null && ((i11 = c2966e1.f11705c) == 3 || i11 == 5)) {
                        c2966e1.f11698G = interfaceC2946a1;
                        this.f123295L.post(new Runnable() { // from class: rn.q1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC25848a2.this.m133375m1(i12, interfaceC2946a1);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: R1 */
    public void m133411R1(boolean z11) {
        C3000l0 c3000l0;
        synchronized (this.f123435v) {
            try {
                if (this.f123434u == null) {
                    return;
                }
                for (int i11 = 0; i11 < this.f123434u.size(); i11++) {
                    C2966e1 c2966e1 = (C2966e1) this.f123434u.get(i11);
                    if (c2966e1 != null && (c3000l0 = c2966e1.f11703a) != null) {
                        mo85444p1(c3000l0);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: S1 */
    public void m133412S1(String str, C32547c c32547c, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        C3000l0 c3000l0;
        synchronized (this.f123435v) {
            try {
                if (this.f123434u == null) {
                    return;
                }
                for (int i11 = 0; i11 < this.f123434u.size(); i11++) {
                    C2966e1 c2966e1 = (C2966e1) this.f123434u.get(i11);
                    C3020p0 c3020p0 = c2966e1.f11704b;
                    boolean z15 = true;
                    if (c2966e1.f11705c == 63 && c3020p0 != null && c3020p0.f12057p.equals(str)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i12 = c2966e1.f11705c;
                    if ((i12 == 40 || i12 == 80) && c3020p0 != null && c3020p0.f12057p.equals(str)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c2966e1.f11705c == 19 && (c3000l0 = c2966e1.f11703a) != null && c3000l0.f11895q.contains(str)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c2966e1.f11705c != 22 || c3020p0 == null || !c3020p0.f12057p.equals(str)) {
                        z15 = false;
                    }
                    if (!z12 && !z13 && !z15) {
                        if (z14) {
                            m133339P1(c2966e1, str, c32547c, i11);
                        }
                    }
                    m133337O1(c2966e1, c32547c, i11);
                    c2966e1.f11702K = z11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: T1 */
    public void m133413T1() {
        C3000l0 c3000l0;
        synchronized (this.f123435v) {
            try {
                if (this.f123434u == null) {
                    return;
                }
                for (int i11 = 0; i11 < this.f123434u.size(); i11++) {
                    C2966e1 c2966e1 = (C2966e1) this.f123434u.get(i11);
                    if (c2966e1 != null && (c3000l0 = c2966e1.f11703a) != null) {
                        mo85444p1(c3000l0);
                        if (c2966e1.f11705c == 49) {
                            m10009q(i11);
                        }
                        if (c2966e1.f11705c == 79) {
                            m10010r(i11, new Object());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        int size;
        synchronized (this.f123435v) {
            List list = this.f123434u;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        int i12;
        synchronized (this.f123435v) {
            i12 = ((C2966e1) this.f123434u.get(i11)).f11705c;
        }
        return i12;
    }

    /* renamed from: o1 */
    public void m133414o1() {
        synchronized (this.f123435v) {
            int i11 = 0;
            while (true) {
                try {
                    if (i11 < this.f123434u.size()) {
                        if (((C2966e1) this.f123434u.get(i11)).f11705c != 53) {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                } finally {
                }
            }
            if (i11 >= 0) {
                m10009q(i11);
            }
        }
    }

    /* renamed from: p1 */
    protected abstract void mo85444p1(C3000l0 c3000l0);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public void mo9990A(final AbstractC25881j.a aVar, int i11) {
        C3426e c3426e;
        C2968e3 c2968e3;
        int i12;
        int i13;
        int i14;
        int i15;
        LoadingLayoutWithIndeterminateProgressBar.C8210a c8210a;
        FeedItemPhotoModuleView feedItemPhotoModuleView;
        if (aVar != null) {
            try {
                if (aVar.m9931C() == 57 && (c3426e = aVar.f123465f0) != null) {
                    c3426e.m17203v(C22021e0.f108429m);
                    aVar.f123465f0.mo17187l();
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        C2966e1 m133530P = m133530P(i11);
        if (m133530P == null) {
            return;
        }
        final C3000l0 c3000l0 = m133530P.f11703a;
        final C3020p0 c3020p0 = m133530P.f11704b;
        int mo10005m = mo10005m(i11);
        if (mo10005m == 3 && c3000l0 != null && aVar != null && (feedItemPhotoModuleView = aVar.f123443J) != null) {
            feedItemPhotoModuleView.setScaleOption(c3000l0.m14322a0());
            aVar.f123443J.f44571l0 = (int) (this.f123299P.height() * 0.7f);
        }
        aVar.f123440A0 = c3000l0 == null ? null : c3000l0.f11895q;
        aVar.f7784p.setTag(AbstractC6918a0.position, Integer.valueOf(i11));
        if (mo10005m == 53) {
            aVar.f123460a0.setScrolling(this.f123436w);
            aVar.f123460a0.m45030w();
            aVar.f123460a0.setTimelineFpfEntryListener(new c());
        }
        if (mo10005m == 55) {
            aVar.f123461b0.setVisibility(0);
            aVar.f123462c0.setVisibility(8);
        } else if (mo10005m == 56) {
            aVar.f123462c0.setVisibility(0);
            aVar.f123461b0.setVisibility(8);
            aVar.f123462c0.setOnClickListener(new View.OnClickListener() { // from class: rn.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC25848a2.this.m133336O0(view);
                }
            });
        } else if (mo10005m == 72) {
            aVar.f123473n0.setOnClickListener(new View.OnClickListener() { // from class: rn.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC25848a2.this.m133350Z0(view);
                }
            });
        } else if (mo10005m == 73) {
            aVar.f123474o0.m45671X(c3000l0, (AbstractC25881j.b) this.f123437x);
        } else if (mo10005m == 74) {
            aVar.f123475p0.m45691b(m133530P.f11726x);
            aVar.f123475p0.setEmptyContentListener(new TimelineEmptyContentView.InterfaceC8571a() { // from class: rn.g1
                @Override // com.zing.zalo.feed.mvp.feed.view.component.TimelineEmptyContentView.InterfaceC8571a
                /* renamed from: vB */
                public final void mo45636vB(C24894p c24894p) {
                    AbstractC25848a2.this.m133360e1(c24894p);
                }
            });
        } else if (mo10005m == 75 && (c2968e3 = m133530P.f11697F) != null) {
            aVar.f123476q0.setLayoutParams(new ViewGroup.LayoutParams(-1, c2968e3.m14044b()));
            FrameLayout frameLayout = aVar.f123476q0;
            frameLayout.setBackgroundColor(C23212s8.m119607o(frameLayout.getContext(), c2968e3.m14043a()));
        }
        if (mo10005m == 76 && (c8210a = m133530P.f11701J) != null) {
            View view = aVar.f7784p;
            if (view instanceof LoadingLayoutWithIndeterminateProgressBar) {
                ((LoadingLayoutWithIndeterminateProgressBar) view).m44431a(c8210a);
            }
        }
        if (c3000l0 != null) {
            if (c3000l0.m14281A0()) {
                C2370r0 m133532R = !TextUtils.isEmpty(c3000l0.f11895q) ? m133532R(c3000l0.f11895q) : null;
                if (m133532R == null) {
                    m133532R = new C2370r0(aVar.f7784p);
                    m133537W(m133532R, c3000l0.f11895q);
                } else {
                    m133532R.m12395b(aVar.f7784p);
                }
                aVar.f123459Z = m133532R;
                if (mo10005m == 19) {
                    InterfaceC2262d interfaceC2262d = new InterfaceC2262d() { // from class: rn.h1
                        @Override // ao.InterfaceC2262d
                        /* renamed from: a */
                        public final void mo11978a(C3000l0 c3000l02, String str) {
                            AbstractC25848a2.this.m133363g1(c3000l0, c3000l02, str);
                        }
                    };
                    if (this.f123290G.get(c3000l0.f11895q) != null) {
                        i14 = ((Integer) this.f123290G.get(c3000l0.f11895q)).intValue();
                    } else {
                        this.f123290G.put(c3000l0.f11895q, 0);
                        i14 = 0;
                    }
                    aVar.f123449P.m43753f(c3000l0, 0, this.f123436w, m133528N());
                    aVar.f123449P.m43754g(c3000l0, m133528N());
                    C25866f0.m133484n0(aVar.f123449P, interfaceC2262d);
                    aVar.f123449P.m43752e(aVar.f123459Z, this.f123289F, c3000l0, this.f123436w, this.f123292I, i14);
                    aVar.f123449P.getPager().setOnPageChangeListener(new d(aVar, c3000l0));
                    aVar.f123449P.setOnProfileClickListener(new View.OnClickListener() { // from class: rn.i1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            AbstractC25848a2.this.m133365h1(c3000l0, view2);
                        }
                    });
                    aVar.f123449P.setOnFeedMenuClickListener(m133401I0(c3000l0));
                    aVar.f123449P.getPager().setTag(c3000l0);
                    aVar.f123449P.getPager().setCurrentItem(i14);
                    aVar.f123449P.setAutoPlayerManager(m133397G0());
                    return;
                }
                if (mo10005m == 39) {
                    InterfaceC2262d interfaceC2262d2 = new InterfaceC2262d() { // from class: rn.j1
                        @Override // ao.InterfaceC2262d
                        /* renamed from: a */
                        public final void mo11978a(C3000l0 c3000l02, String str) {
                            AbstractC25848a2.this.m133367i1(c3000l0, c3000l02, str);
                        }
                    };
                    if (this.f123290G.get(c3000l0.f11895q) != null) {
                        i15 = ((Integer) this.f123290G.get(c3000l0.f11895q)).intValue();
                    } else {
                        this.f123290G.put(c3000l0.f11895q, 0);
                        i15 = 0;
                    }
                    aVar.f123450Q.setSuggestedData(c3000l0);
                    C25866f0.m133484n0(aVar.f123450Q, interfaceC2262d2);
                    aVar.f123450Q.m43752e(aVar.f123459Z, this.f123289F, c3000l0, this.f123436w, this.f123292I, i15);
                    aVar.f123450Q.getPager().addOnPageChangeListener(new e(aVar, c3000l0));
                    aVar.f123450Q.getPager().setTag(c3000l0);
                    aVar.f123450Q.getPager().setCurrentItem(i15);
                    return;
                }
                if (mo10005m == 70) {
                    aVar.f123472m0.setFeedContent(c3000l0);
                    aVar.f123472m0.setFeedCallback(m133399H0());
                    aVar.f123472m0.m43900m0(c3000l0, 0);
                    return;
                }
                if (mo10005m != 71) {
                    switch (mo10005m) {
                        case 22:
                            final int m14327d0 = c3000l0.m14327d0(c3020p0.f12057p);
                            aVar.f123456W.m44163X(c3000l0, m14327d0, this.f123436w, this.f123437x, m133528N());
                            aVar.f123456W.m44164Y(c3000l0, c3020p0, false, this.f123289F, this.f123437x, m133528N());
                            aVar.f123456W.m44162W(c3000l0, m14327d0, this.f123437x, this.f123436w);
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("extra_need_scroll_to_bottom", true);
                            aVar.f123456W.setOnFooterClickListener(this.f123438y.m133495B(c3000l0, m14327d0, true, bundle));
                            aVar.f123456W.setOnProfileClickListener(this.f123438y.m133501J(c3000l0, m14327d0));
                            aVar.f123456W.setOnAvatarClickListener(new C16719g.c() { // from class: rn.l1
                                @Override // com.zing.zalo.uidrawing.C16719g.c
                                /* renamed from: y */
                                public final void mo929y(C16719g c16719g) {
                                    AbstractC25848a2.this.m133369j1(c3020p0, c3000l0, m14327d0, c16719g);
                                }
                            });
                            aVar.f123456W.setOnFeedMenuClickListener(this.f123438y.m133499F(c3000l0, c3020p0));
                            aVar.f123456W.setOnClickListener(this.f123438y.m133494A(c3000l0, m14327d0, true, null));
                            aVar.f123456W.setOnRecentlyLikeClickListener(this.f123438y.m133507P(c3020p0));
                            return;
                        case 23:
                            aVar.f123457X.setFeedContent(c3000l0);
                            aVar.f123457X.setOnActionClickListener(new C16719g.c() { // from class: rn.m1
                                @Override // com.zing.zalo.uidrawing.C16719g.c
                                /* renamed from: y */
                                public final void mo929y(C16719g c16719g) {
                                    AbstractC25848a2.this.m133371k1(c3000l0, c16719g);
                                }
                            });
                            return;
                        case 24:
                            aVar.f123458Y.m44160X(c3000l0, m133528N(), m133403J0(c3000l0));
                            aVar.f123458Y.m44175d0(c3020p0);
                            aVar.f123458Y.m44178l0(c3020p0, this.f123436w, this.f123437x);
                            aVar.f123458Y.m44159W(c3000l0, this.f123436w, this.f123437x);
                            return;
                        default:
                            return;
                    }
                }
                aVar.f123472m0.setFeedContent(c3000l0);
                aVar.f123472m0.setFeedCallback(m133399H0());
                aVar.f123472m0.m43900m0(c3000l0, c3000l0.m14327d0(c3020p0.f12057p));
                return;
            }
            if (mo10005m == 3 || mo10005m == 5 || mo10005m == 38) {
                C2370r0 m133532R2 = !TextUtils.isEmpty(c3020p0.f12057p) ? m133532R(c3020p0.f12057p) : null;
                if (m133532R2 == null) {
                    m133532R2 = new C2370r0(aVar.f7784p);
                    m133537W(m133532R2, c3020p0.f12057p);
                } else {
                    m133532R2.m12395b(aVar.f7784p);
                }
                aVar.f123459Z = m133532R2;
            }
            if (mo10005m == 2) {
                FeedItemBaseModuleView.m43693l0(aVar.f123442I, c3000l0);
                aVar.f123442I.m43696Y(c3000l0, 0, this.f123436w, null, this.f123429C);
                aVar.f123442I.mo43698b0(c3000l0, 0, this.f123289F, this.f123437x, m133528N(), false, null, this.f123436w);
                aVar.f123442I.setOnProfileClickListener(this.f123438y.m133501J(c3000l0, 0));
                aVar.f123442I.setOnFeedMenuClickListener(this.f123438y.m133499F(c3000l0, c3020p0));
                aVar.f123442I.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                return;
            }
            if (mo10005m == 3) {
                FeedItemBaseModuleView.m43693l0(aVar.f123443J, c3000l0);
                aVar.f123443J.m43936W0(c3000l0, 0, i11, this.f123311b0, this.f123436w, null, this.f123437x);
                aVar.f123443J.setPhotoLongClickListener(this.f123438y.m133511x());
                aVar.f123443J.setFeedMusicCallback(this.f123439z);
                aVar.f123443J.m43882z0(m133530P.f11698G);
                mo85444p1(c3000l0);
                aVar.f123443J.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                return;
            }
            if (mo10005m == 5) {
                FeedItemBaseModuleView.m43693l0(aVar.f123444K, c3000l0);
                aVar.f123444K.setType4log(C3979l.b.FEED_THUMBNAIL);
                aVar.f123444K.m43984n1(m133530P.f11705c, i11, c3000l0, 0, this.f123311b0, this.f123436w, 0, null, this.f123437x);
                aVar.f123444K.setPhotoLongClickListener(this.f123438y.m133511x());
                aVar.f123444K.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                aVar.f123444K.setFeedMusicCallback(this.f123439z);
                aVar.f123444K.m43882z0(m133530P.f11698G);
                mo85444p1(c3000l0);
                return;
            }
            if (mo10005m == 33) {
                aVar.f123451R.setPadding(0, i11 == 0 ? AbstractC23136l9.m118742r(10.0f) : 0, 0, 0);
                aVar.f123451R.m43656d(c3000l0, this.f123437x);
                return;
            }
            if (mo10005m == 38) {
                aVar.f123452S.m44109b0(c3000l0, 0, this.f123437x, this.f123436w);
                aVar.f123452S.setOnVideoClickListener(new FeedItemSuggestBanner.InterfaceC8140d() { // from class: rn.t1
                    @Override // com.zing.zalo.feed.components.FeedItemSuggestBanner.InterfaceC8140d
                    /* renamed from: a */
                    public final void mo44115a(AnimationTarget animationTarget, C17391z c17391z) {
                        AbstractC25848a2.this.m133341R0(aVar, animationTarget, c17391z);
                    }
                });
                aVar.f123452S.setTag(AbstractC6918a0.id_video_data_index, Integer.valueOf(i11));
                return;
            }
            if (mo10005m == 40) {
                aVar.f123484y0.m44767T1(c3000l0, 0, this.f123437x, false);
                aVar.f123484y0.mo89109M0(new C16719g.c() { // from class: rn.x1
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        AbstractC25848a2.this.m133345V0(c3020p0, c3000l0, c16719g);
                    }
                });
                if (C28570b.m142996a().m142998b(0)) {
                    aVar.f123484y0.m44769V1(new C16719g.c() { // from class: rn.y1
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            AbstractC25848a2.this.m133346W0(c3020p0, c3000l0, c16719g);
                        }
                    });
                }
                aVar.f123484y0.m44770W1(this.f123438y.m133499F(c3000l0, c3020p0));
                aVar.f123484y0.m44771X1(this.f123438y.m133507P(c3020p0));
                return;
            }
            if (mo10005m == 49) {
                FeedItemBase.m43679x(aVar.f123447N, c3000l0);
                Rect rect = this.f123299P;
                if (rect != null) {
                    aVar.f123447N.m44214v0(rect.width(), (int) (this.f123299P.height() * 0.7f));
                }
                aVar.f123447N.mo43897w0(c3000l0, 0, this.f123436w, this.f123289F, m133528N(), this.f123437x);
                aVar.f123447N.setOnVideoViewClickListener(new View.OnClickListener() { // from class: rn.n1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AbstractC25848a2.this.m133373l1(c3000l0, aVar, view2);
                    }
                });
                aVar.f123447N.setTag(AbstractC6918a0.id_video_data_index, Integer.valueOf(i11));
                aVar.f123447N.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                return;
            }
            if (mo10005m == 70) {
                aVar.f123472m0.setFeedContent(c3000l0);
                aVar.f123472m0.setFeedCallback(m133399H0());
                aVar.f123472m0.m43900m0(c3000l0, 0);
                return;
            }
            if (mo10005m == 8) {
                FeedItemBaseModuleView.m43693l0(aVar.f123445L, c3000l0);
                aVar.f123445L.m44092o0(c3000l0, 0, this.f123436w, this.f123437x, "TIMELINE_");
                aVar.f123445L.mo43698b0(c3000l0, 0, this.f123289F, this.f123437x, m133528N(), true, null, this.f123436w);
                aVar.f123445L.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                return;
            }
            if (mo10005m == 9) {
                FeedItemBaseModuleView.m43693l0(aVar.f123446M, c3000l0);
                aVar.f123446M.m43800B0(c3000l0, 0, this.f123289F, this.f123436w, this.f123437x, m133528N());
                aVar.f123446M.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                return;
            }
            if (mo10005m == 42) {
                if (c3020p0 != null) {
                    aVar.f123482w0.m43727d0(c3020p0.m14533x(), 0, false, this.f123437x);
                    new Bundle().putBoolean("extra_need_scroll_to_bottom", true);
                    if (C28570b.m142996a().m142998b(3)) {
                        aVar.f123482w0.setOnClickListener(new View.OnClickListener() { // from class: rn.b1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                AbstractC25848a2.this.m133352a1(c3020p0, c3000l0, view2);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            if (mo10005m == 43) {
                if (c3000l0.m14285C0() && !c3000l0.m14322a0().m14498b0()) {
                    AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[TimeLineAdapter] bind header feed fail, fcid=%s", c3000l0.f11895q);
                    aVar.f123480u0.m43758Y(true);
                    aVar.f123480u0.getLocalHeaderBarModule().m44655t1(c3000l0);
                    aVar.f123480u0.getLocalHeaderBarModule().m44656u1(this.f123437x);
                    aVar.f123480u0.getLocalHeaderBarModule().m44657v1(0, this.f123436w);
                    aVar.f123480u0.getLocalHeaderBarModule().m44658w1(0, this.f123289F, m133528N(), this.f123436w);
                    aVar.f123480u0.getLocalHeaderBarModule().m44660y1(this.f123438y.m133501J(c3000l0, 0));
                    aVar.f123480u0.setOnAvatarClickListener(new C16719g.c() { // from class: rn.u1
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            AbstractC25848a2.this.m133342S0(c3020p0, c3000l0, c16719g);
                        }
                    });
                    aVar.f123480u0.setOnClickListener(null);
                    return;
                }
                aVar.f123480u0.m43758Y(false);
                aVar.f123480u0.getHeaderBarModule().m44928b2(c3000l0, 0, this.f123436w, this.f123437x, m133528N());
                aVar.f123480u0.getHeaderBarModule().m44932f2(c3000l0, 0, this.f123289F, this.f123437x, m133528N());
                aVar.f123480u0.getHeaderBarModule().m44935i2(this.f123438y.m133501J(c3000l0, 0));
                aVar.f123480u0.setOnAvatarClickListener(new C16719g.c() { // from class: rn.v1
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        AbstractC25848a2.this.m133343T0(c3020p0, c3000l0, c16719g);
                    }
                });
                aVar.f123480u0.getHeaderBarModule().m44934h2(this.f123438y.m133499F(c3000l0, c3020p0));
                aVar.f123480u0.getHeaderBarModule().m44927a2(c3000l0, 0);
                aVar.f123480u0.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                aVar.f123480u0.getHeaderBarModule().m44926Z1(this.f123438y.m133495B(c3000l0, 0, true, null));
                return;
            }
            if (mo10005m == 46) {
                if (this.f123290G.get(c3000l0.f11895q) != null) {
                    i12 = ((Integer) this.f123290G.get(c3000l0.f11895q)).intValue();
                } else {
                    this.f123290G.put(c3000l0.f11895q, 0);
                    i12 = 0;
                }
                aVar.f123453T.m44141P(this.f123289F, c3000l0, this.f123436w, this.f123292I, i12, this.f123437x);
                aVar.f123453T.getPager().addOnPageChangeListener(new h(aVar, c3000l0));
                aVar.f123453T.getPager().setTag(c3000l0);
                aVar.f123453T.getPager().setCurrentItem(i12);
                return;
            }
            if (mo10005m == 47) {
                aVar.f123481v0.getFeedItemSuggestHeaderModule().m44882p1(c3000l0, 0, this.f123436w, m133528N());
                aVar.f123481v0.getFeedItemSuggestHeaderModule().m44885s1(this.f123289F, c3000l0, 0, m133528N());
                aVar.f123481v0.getFeedItemSuggestHeaderModule().m44887u1(new C16719g.c() { // from class: rn.w1
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        AbstractC25848a2.this.m133344U0(c3000l0, c16719g);
                    }
                });
                aVar.f123481v0.getFeedItemSuggestHeaderModule().m44886t1(this.f123438y.m133498E(c3000l0, c3020p0));
                aVar.f123481v0.getFeedItemSuggestHeaderModule().m44888v1(this.f123438y.m133505N(c3000l0, 0, c3020p0));
                return;
            }
            if (mo10005m == 51) {
                aVar.f123479t0.m44148b(c3000l0, 0, m133528N());
                return;
            }
            if (mo10005m == 52) {
                if (this.f123290G.get(c3000l0.f11895q) != null) {
                    i13 = ((Integer) this.f123290G.get(c3000l0.f11895q)).intValue();
                } else {
                    this.f123290G.put(c3000l0.f11895q, 0);
                    i13 = 0;
                }
                aVar.f123454U.m44141P(this.f123289F, c3000l0, this.f123436w, this.f123292I, i13, this.f123437x);
                aVar.f123454U.getPager().addOnPageChangeListener(new i(aVar, c3000l0));
                aVar.f123454U.getPager().setTag(c3000l0);
                aVar.f123454U.getPager().setCurrentItem(i13);
                return;
            }
            if (mo10005m == 58) {
                aVar.f123463d0.m44134k(c3000l0, this.f123437x);
                aVar.f123463d0.getRecycleView().m9826E(new j(aVar));
                aVar.f123463d0.m44133j(this.f123293J);
                aVar.f123463d0.m44131e(c3000l0);
                return;
            }
            if (mo10005m != 59) {
                switch (mo10005m) {
                    case 61:
                        FeedItemFooterActionBarModulesView feedItemFooterActionBarModulesView = aVar.f123466g0;
                        if (feedItemFooterActionBarModulesView != null) {
                            feedItemFooterActionBarModulesView.m43746X(c3000l0, 0, this.f123436w, this.f123437x, 0, 1);
                            return;
                        }
                        return;
                    case 62:
                        Rect rect2 = this.f123299P;
                        if (rect2 != null) {
                            aVar.f123455V.m44214v0(rect2.width(), this.f123299P.height() - this.f123289F.getResources().getDimensionPixelSize(AbstractC16802y.timeline_video_vertical_padding));
                        }
                        aVar.f123455V.mo43897w0(c3000l0, 0, this.f123436w, this.f123289F, m133528N(), this.f123437x);
                        aVar.f123455V.setOnVideoViewClickListener(new View.OnClickListener() { // from class: rn.s1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                AbstractC25848a2.this.m133340Q0(c3020p0, view2);
                            }
                        });
                        aVar.f123455V.setTag(AbstractC6918a0.id_video_data_index, Integer.valueOf(i11));
                        return;
                    case 63:
                        C2976g1 m129551v = C24906b.f119505a.m129551v(c3020p0.f12057p);
                        boolean z11 = m129551v != null && m129551v.m14120h();
                        boolean z12 = c3020p0.f12064w || z11;
                        List m14117c = z11 ? m129551v.m14117c() : new ArrayList();
                        aVar.f123471l0.setScrolling(this.f123436w);
                        aVar.f123471l0.setFeedCallback(this.f123437x);
                        aVar.f123471l0.setShowInput(z12);
                        SuggestCommentView suggestCommentView = aVar.f123471l0;
                        String str = c3020p0.f12057p;
                        if (str == null) {
                            str = "";
                        }
                        suggestCommentView.m47448k(m14117c, str, false, c3020p0, c3000l0);
                        aVar.f123471l0.setOnSuggestCommentClickListener(new g(c3020p0, c3000l0));
                        return;
                    case 64:
                        aVar.f123467h0.m43711S(c3000l0, 0, this.f123436w);
                        aVar.f123467h0.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, false, null));
                        return;
                    case 65:
                        aVar.f123468i0.setFeedItemMemoryEntryListener(new k());
                        if (!aVar.f123468i0.m43860n(c3000l0.f11881d0) || this.f123436w) {
                            return;
                        }
                        aVar.f123468i0.m43857e(c3000l0.f11881d0);
                        return;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                        FeedItemBase.m43679x(aVar.f123469j0, c3000l0);
                        aVar.f123469j0.setFeedCallback(this.f123437x);
                        aVar.f123469j0.m43837W(c3020p0, this.f123436w);
                        return;
                    case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                        if (c3020p0 != null) {
                            aVar.f123483x0.m43727d0(m133530P.f11706d, 0, false, this.f123437x);
                            new Bundle().putBoolean("extra_need_scroll_to_bottom", true);
                            if (C28570b.m142996a().m142998b(3)) {
                                aVar.f123483x0.setOnClickListener(new View.OnClickListener() { // from class: rn.d1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        AbstractC25848a2.this.m133354b1(c3020p0, c3000l0, view2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        return;
                    case 68:
                        FeedItemBase.m43679x(aVar.f123470k0, c3000l0);
                        aVar.f123470k0.setMaxHeight((int) (this.f123299P.height() * 0.7f));
                        aVar.f123470k0.setScrolling(this.f123436w);
                        aVar.f123470k0.setDataType(m133530P.f11705c);
                        aVar.f123470k0.setDataPosition(i11);
                        aVar.f123470k0.setCurrentPosition(0);
                        aVar.f123470k0.setParentView(this.f123311b0);
                        Rect rect3 = this.f123299P;
                        if (rect3 != null) {
                            aVar.f123470k0.m44018a0(rect3.width(), (int) (this.f123299P.height() * 0.7f));
                        }
                        aVar.f123470k0.m44010R(0, m133399H0(), m133528N(), null);
                        aVar.f123470k0.setViewTag(i11);
                        aVar.f123470k0.setOnVideoViewClickListener(new View.OnClickListener() { // from class: rn.e1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                AbstractC25848a2.this.m133356c1(c3000l0, aVar, view2);
                            }
                        });
                        aVar.f123470k0.setVideoMixClickListener(new FeedItemSocialAlbumPhoto.InterfaceC8127a() { // from class: rn.f1
                            @Override // com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto.InterfaceC8127a
                            /* renamed from: a */
                            public final void mo44050a(int i16) {
                                AbstractC25848a2.this.m133358d1(c3000l0, i16);
                            }
                        });
                        aVar.f123470k0.setPhotoLongClickListener(this.f123438y.m133511x());
                        aVar.f123470k0.setOnViewClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                        return;
                    default:
                        switch (mo10005m) {
                            case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                                aVar.f123485z0.f44693K.m44681u1(c3000l0, 0, this.f123289F, m133528N());
                                return;
                            case 78:
                                C26885i c26885i = m133530P.f11699H;
                                FeedItemVideoChannel feedItemVideoChannel = aVar.f123477r0;
                                if (feedItemVideoChannel == null || c3000l0.f11902t0 == null || c26885i == null) {
                                    return;
                                }
                                feedItemVideoChannel.setSectionVideoChannelListener(new a(c3000l0));
                                aVar.f123477r0.m44240m(c3000l0, c26885i);
                                return;
                            case 79:
                                aVar.f123448O.setVideoFeedContent(c3000l0);
                                Rect rect4 = this.f123299P;
                                if (rect4 != null) {
                                    aVar.f123448O.m44302c(rect4.width(), (int) (this.f123299P.width() * 1.3333334f));
                                }
                                aVar.f123448O.setOpenZShortVideoListener(new FeedItemZaloVideoView.InterfaceC8181b() { // from class: rn.o1
                                    @Override // com.zing.zalo.feed.components.FeedItemZaloVideoView.InterfaceC8181b
                                    /* renamed from: a */
                                    public final void mo44364a(C3033r3 c3033r3) {
                                        AbstractC25848a2.this.m133338P0(c3033r3);
                                    }
                                });
                                mo85445s1(c3000l0);
                                aVar.f123448O.m44303e(c3000l0, 0, this.f123436w, this.f123289F, m133528N(), this.f123437x);
                                aVar.f123448O.setTag(AbstractC6918a0.id_video_data_index, Integer.valueOf(i11));
                                aVar.f123448O.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                                return;
                            case 80:
                                TimelineFeedItemFooterBar timelineFeedItemFooterBar = aVar.f123441B0;
                                if (timelineFeedItemFooterBar != null) {
                                    timelineFeedItemFooterBar.m44544i(c3000l0, 0, this.f123437x, m133530P.f11702K);
                                    m133530P.f11702K = false;
                                    aVar.f123441B0.setOnClickListener(new View.OnClickListener() { // from class: rn.z1
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            AbstractC25848a2.this.m133347X0(c3020p0, c3000l0, view2);
                                        }
                                    });
                                    if (C28570b.m142996a().m142998b(0)) {
                                        aVar.f123441B0.setOnCommentClickListener(new View.OnClickListener() { // from class: rn.a1
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view2) {
                                                AbstractC25848a2.this.m133348Y0(c3020p0, c3000l0, view2);
                                            }
                                        });
                                    }
                                    aVar.f123441B0.setOnSuggestCommentListener(new f(c3020p0, c3000l0));
                                    aVar.f123441B0.setOnLikeDescriptionClickListener(this.f123438y.m133507P(c3020p0));
                                    return;
                                }
                                return;
                            case 81:
                                C8314k0 c8314k0 = m133530P.f11700I;
                                FeedItemZInstantAds feedItemZInstantAds = aVar.f123478s0;
                                if (feedItemZInstantAds == null || c8314k0 == null) {
                                    return;
                                }
                                feedItemZInstantAds.setActionListener(new b());
                                aVar.f123478s0.m44280h(c3000l0, i11, c8314k0);
                                return;
                            default:
                                return;
                        }
                }
            }
            aVar.f123464e0.m43782c0(c3000l0, this.f123436w, this.f123437x);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public void mo9991B(AbstractC25881j.a aVar, int i11, List list) {
        try {
            if (!list.isEmpty()) {
                C2966e1 m133530P = m133530P(i11);
                if (m133530P == null) {
                    return;
                }
                C3000l0 c3000l0 = m133530P.f11703a;
                int mo10005m = mo10005m(i11);
                if (c3000l0 != null && !c3000l0.m14281A0()) {
                    if (mo10005m != 3) {
                        if (mo10005m != 5) {
                            if (mo10005m == 79) {
                                aVar.f123448O.setVideoFeedContent(c3000l0);
                                Rect rect = this.f123299P;
                                if (rect != null) {
                                    aVar.f123448O.m44302c(rect.width(), (int) (this.f123299P.width() * 1.3333334f));
                                }
                                aVar.f123448O.setOpenZShortVideoListener(new FeedItemZaloVideoView.InterfaceC8181b() { // from class: rn.z0
                                    @Override // com.zing.zalo.feed.components.FeedItemZaloVideoView.InterfaceC8181b
                                    /* renamed from: a */
                                    public final void mo44364a(C3033r3 c3033r3) {
                                        AbstractC25848a2.this.m133335N0(c3033r3);
                                    }
                                });
                                aVar.f123448O.m44303e(c3000l0, 0, this.f123436w, this.f123289F, m133528N(), this.f123437x);
                                aVar.f123448O.setTag(AbstractC6918a0.id_video_data_index, Integer.valueOf(i11));
                                aVar.f123448O.setOnClickListener(this.f123438y.m133494A(c3000l0, 0, true, null));
                                return;
                            }
                            return;
                        }
                        if (list.get(0) instanceof InterfaceC2946a1) {
                            InterfaceC2946a1 interfaceC2946a1 = (InterfaceC2946a1) list.get(0);
                            if (m133530P.f11698G != null) {
                                aVar.f123444K.m43882z0(interfaceC2946a1);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (list.get(0) instanceof InterfaceC2946a1) {
                        InterfaceC2946a1 interfaceC2946a12 = (InterfaceC2946a1) list.get(0);
                        if (m133530P.f11698G != null) {
                            aVar.f123443J.m43882z0(interfaceC2946a12);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            super.mo9991B(aVar, i11, list);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: s1 */
    protected abstract void mo85445s1(C3000l0 c3000l0);

    /* renamed from: t1 */
    public void m133417t1(RecyclerView recyclerView) {
        if (m133397G0() != null) {
            m133397G0().m104096y(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public AbstractC25881j.a mo9992C(ViewGroup viewGroup, int i11) {
        View view;
        View view2;
        if (this.f123299P == null && viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            this.f123299P = new Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        }
        C16719g c16719g = null;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 5) {
                    if (i11 != 19) {
                        if (i11 != 33) {
                            if (i11 != 49) {
                                if (i11 != 8) {
                                    if (i11 != 9) {
                                        if (i11 != 46) {
                                            if (i11 != 47) {
                                                switch (i11) {
                                                    case 21:
                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                                                        break;
                                                    case 22:
                                                        view2 = new FeedItemVerticalGroupItemModulesView(this.f123289F);
                                                        break;
                                                    case 23:
                                                        view2 = new FeedItemVerticalGroupItemMoreModulesView(this.f123289F);
                                                        break;
                                                    case 24:
                                                        view2 = new FeedItemVerticalGroupLinkModulesView(this.f123289F);
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case 38:
                                                                view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_suggest_banner, viewGroup, false);
                                                                break;
                                                            case 39:
                                                                view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_group_horizontal, viewGroup, false);
                                                                break;
                                                            case 40:
                                                                ModulesView modulesView = new ModulesView(this.f123289F);
                                                                modulesView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                modulesView.setId(AbstractC6918a0.feedItemFooterBarModule);
                                                                c16719g = new C8323l1(this.f123289F);
                                                                modulesView.mo69681L(c16719g);
                                                                view2 = modulesView;
                                                                break;
                                                            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                                                view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_footer_bottom_shadow, viewGroup, false);
                                                                break;
                                                            case 42:
                                                                view2 = new FeedItemCommentBarModulesView(this.f123289F);
                                                                break;
                                                            case 43:
                                                                view2 = new FeedItemHeaderBarModuleView(this.f123289F);
                                                                break;
                                                            default:
                                                                switch (i11) {
                                                                    case 51:
                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_suggest_title_bar, viewGroup, false);
                                                                        break;
                                                                    case 52:
                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_suggest_oa, viewGroup, false);
                                                                        break;
                                                                    case 53:
                                                                        View timelineFpfEntry = new TimelineFpfEntry(this.f123289F);
                                                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                                                                        layoutParams.setMargins(0, 0, 0, AbstractC23136l9.m118655I(AbstractC16802y.feed_bottom_divider_height));
                                                                        timelineFpfEntry.setLayoutParams(layoutParams);
                                                                        view2 = timelineFpfEntry;
                                                                        break;
                                                                    default:
                                                                        switch (i11) {
                                                                            case 55:
                                                                            case 56:
                                                                                view2 = this.f123288E.inflate(AbstractC7409c0.footer_loading, viewGroup, false);
                                                                                break;
                                                                            case 57:
                                                                                view2 = C3426e.m17196q(this.f123288E, viewGroup);
                                                                                break;
                                                                            case 58:
                                                                                view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_suggest_friend, viewGroup, false);
                                                                                break;
                                                                            case 59:
                                                                                view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_last_suggest, viewGroup, false);
                                                                                break;
                                                                            default:
                                                                                switch (i11) {
                                                                                    case 61:
                                                                                        view2 = new FeedItemFooterActionBarModulesView(this.f123289F);
                                                                                        break;
                                                                                    case 62:
                                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_oa_video, viewGroup, false);
                                                                                        break;
                                                                                    case 63:
                                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_suggest_comment_layout, viewGroup, false);
                                                                                        break;
                                                                                    case 64:
                                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_biography, viewGroup, false);
                                                                                        break;
                                                                                    case 65:
                                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_memory_entry, viewGroup, false);
                                                                                        break;
                                                                                    case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_memory, viewGroup, false);
                                                                                        break;
                                                                                    case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                                                                        view2 = new FeedItemCommentBarModulesView(this.f123289F);
                                                                                        break;
                                                                                    case 68:
                                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_social_album, viewGroup, false);
                                                                                        break;
                                                                                    case 69:
                                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_suggest_comment_layout, viewGroup, false);
                                                                                        break;
                                                                                    case 70:
                                                                                    case 71:
                                                                                        view2 = new FeedItemOptionModuleView(this.f123289F);
                                                                                        break;
                                                                                    case 72:
                                                                                        view2 = new ListItem(this.f123289F);
                                                                                        break;
                                                                                    case 73:
                                                                                        View undoTabRowView = new UndoTabRowView(this.f123289F);
                                                                                        undoTabRowView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                                                                                        view2 = undoTabRowView;
                                                                                        break;
                                                                                    case 74:
                                                                                        View timelineEmptyContentView = new TimelineEmptyContentView(this.f123289F);
                                                                                        timelineEmptyContentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                                                                                        view2 = timelineEmptyContentView;
                                                                                        break;
                                                                                    case 75:
                                                                                        View frameLayout = new FrameLayout(this.f123289F);
                                                                                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                                        view2 = frameLayout;
                                                                                        break;
                                                                                    case 76:
                                                                                        View loadingLayoutWithIndeterminateProgressBar = new LoadingLayoutWithIndeterminateProgressBar(this.f123289F);
                                                                                        loadingLayoutWithIndeterminateProgressBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                                                                        view2 = loadingLayoutWithIndeterminateProgressBar;
                                                                                        break;
                                                                                    case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                                                                                        View feedItemStatusPostModuleView = new FeedItemStatusPostModuleView(this.f123289F);
                                                                                        feedItemStatusPostModuleView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                                        view2 = feedItemStatusPostModuleView;
                                                                                        break;
                                                                                    case 78:
                                                                                        FeedItemVideoChannel feedItemVideoChannel = new FeedItemVideoChannel(this.f123289F);
                                                                                        m133332F0(feedItemVideoChannel);
                                                                                        feedItemVideoChannel.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                                        view2 = feedItemVideoChannel;
                                                                                        break;
                                                                                    case 79:
                                                                                        view2 = new FeedItemZaloVideoContainerView(this.f123289F);
                                                                                        break;
                                                                                    case 80:
                                                                                        view2 = new TimelineFeedItemFooterBar(this.f123289F);
                                                                                        break;
                                                                                    case 81:
                                                                                        View feedItemZInstantAds = new FeedItemZInstantAds(this.f123289F);
                                                                                        feedItemZInstantAds.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                                        view2 = feedItemZInstantAds;
                                                                                        break;
                                                                                    default:
                                                                                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                            } else {
                                                view2 = new FeedItemSuggestHeaderModulesView(this.f123289F);
                                            }
                                        } else {
                                            view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_suggest_multi_items, viewGroup, false);
                                        }
                                    } else {
                                        view2 = new FeedItemLinkModulesView(this.f123289F);
                                    }
                                } else {
                                    view2 = new FeedItemStickerModulesView(this.f123289F);
                                }
                            } else {
                                view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_video, viewGroup, false);
                            }
                        } else {
                            view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_async_fail, viewGroup, false);
                        }
                    } else {
                        view2 = this.f123288E.inflate(AbstractC7409c0.feed_item_group_horizontal, viewGroup, false);
                    }
                } else {
                    view2 = new FeedItemPhotoMultiModuleView(this.f123289F);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                View feedItemPhotoModuleView = new FeedItemPhotoModuleView(viewGroup.getContext());
                feedItemPhotoModuleView.setLayoutParams(layoutParams2);
                view = feedItemPhotoModuleView;
                return new l(view, c16719g, i11, this.f123289F);
            }
        } else {
            view2 = new FeedItemTextModuleView(this.f123289F);
        }
        view = view2;
        return new l(view, c16719g, i11, this.f123289F);
    }

    /* renamed from: v1 */
    public void m133419v1() {
        if (m133397G0() != null) {
            m133397G0().m104081L();
        }
    }

    /* renamed from: x1 */
    public void m133420x1() {
        if (m133397G0() != null) {
            m133397G0().m104083N();
        }
    }

    /* renamed from: y1 */
    public void m133421y1() {
        if (m133397G0() != null) {
            m133397G0().m104084O();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: z */
    public void mo10018z(RecyclerView recyclerView) {
        super.mo10018z(recyclerView);
        this.f123311b0 = recyclerView;
    }

    /* renamed from: z1 */
    public void m133422z1(RecyclerView recyclerView, int i11, int i12, C20040b.b bVar) {
        try {
            if (m133397G0() != null) {
                m133397G0().m104085P(CoreUtility.f89233i, recyclerView, i11, i12, bVar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
