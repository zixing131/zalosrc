package com.zing.zalo.feed.adapters;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ao.InterfaceC2259a;
import ao.InterfaceC2263e;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import bo.C3054x;
import bo.InterfaceC2946a1;
import cd0.C3427f;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.adapters.AbstractC7220t8;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.AlbumRowPreviewGridView;
import com.zing.zalo.feed.components.C8323l1;
import com.zing.zalo.feed.components.C8406v1;
import com.zing.zalo.feed.components.FeedItemAsyncFail;
import com.zing.zalo.feed.components.FeedItemBase;
import com.zing.zalo.feed.components.FeedItemBaseModuleView;
import com.zing.zalo.feed.components.FeedItemBiography;
import com.zing.zalo.feed.components.FeedItemCommentBar;
import com.zing.zalo.feed.components.FeedItemComposeFeedModuleView;
import com.zing.zalo.feed.components.FeedItemDateDividerModuleView;
import com.zing.zalo.feed.components.FeedItemDateDividerSpacingModuleView;
import com.zing.zalo.feed.components.FeedItemHeaderBarModuleView;
import com.zing.zalo.feed.components.FeedItemHeaderSubMenuModuleView;
import com.zing.zalo.feed.components.FeedItemLinkModulesView;
import com.zing.zalo.feed.components.FeedItemMemory;
import com.zing.zalo.feed.components.FeedItemPhotoModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.components.FeedItemSocialAlbum;
import com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto;
import com.zing.zalo.feed.components.FeedItemSocialAlbumVideo;
import com.zing.zalo.feed.components.FeedItemStickerModulesView;
import com.zing.zalo.feed.components.FeedItemSuggestHeader;
import com.zing.zalo.feed.components.FeedItemTextModuleView;
import com.zing.zalo.feed.components.FeedItemTitleDivider;
import com.zing.zalo.feed.components.FeedItemVideo;
import com.zing.zalo.feed.components.FeedItemYearDivider;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.zviews.FeedCallbackZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22012a;
import l30.C22014b;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import p361nb.AbstractC23647d;
import p368nq.C23927b;
import p489rn.C25866f0;
import p716zh.C31862c;
import p716zh.C31902e9;

/* loaded from: classes4.dex */
public abstract class FeedBaseAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    int f43882A;

    /* renamed from: B */
    protected View f43883B;

    /* renamed from: D */
    boolean f43885D;

    /* renamed from: G */
    AbstractC22055v0.l f43888G;

    /* renamed from: H */
    AbstractC7220t8 f43889H;

    /* renamed from: I */
    public InterfaceC8021a f43890I;

    /* renamed from: s */
    protected HashMap f43892s;

    /* renamed from: t */
    protected ArrayList f43893t;

    /* renamed from: w */
    protected InterfaceC2259a f43896w;

    /* renamed from: x */
    protected InterfaceC2263e f43897x;

    /* renamed from: z */
    protected WeakReference f43899z;

    /* renamed from: r */
    private boolean f43891r = false;

    /* renamed from: u */
    protected List f43894u = new ArrayList();

    /* renamed from: v */
    protected boolean f43895v = false;

    /* renamed from: y */
    protected C25866f0 f43898y = new C25866f0();

    /* renamed from: C */
    int f43884C = 2;

    /* renamed from: E */
    String f43886E = null;

    /* renamed from: F */
    protected C31862c f43887F = null;

    /* loaded from: classes4.dex */
    public interface AlbumProfileCallback extends InterfaceC8021a, FeedItemTitleDivider.InterfaceC8146a, AlbumRowPreviewGridView.InterfaceC8067a {
        /* renamed from: W0 */
        void mo43226W0();

        /* renamed from: X0 */
        void mo43227X0();

        /* renamed from: a4 */
        void mo43228a4(ProfilePreviewAlbumItem profilePreviewAlbumItem);

        /* renamed from: b4 */
        void mo43229b4();

        /* renamed from: c4 */
        void mo43230c4();

        /* renamed from: d4 */
        void mo43231d4();

        /* renamed from: e */
        void mo43232e();

        /* renamed from: e2 */
        void mo43233e2();

        /* renamed from: e4 */
        void mo43234e4(ProfilePreviewAlbumItem profilePreviewAlbumItem);

        /* renamed from: f4 */
        void mo43235f4(View view, View view2);

        /* renamed from: l0 */
        void mo43236l0();
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8021a {
        /* renamed from: s */
        void mo43237s(C3054x c3054x);

        /* renamed from: u */
        void mo43238u();

        /* renamed from: v */
        void mo43239v(boolean z11);

        /* renamed from: w */
        void mo43240w(View view);

        /* renamed from: x */
        void mo43241x(boolean z11);

        /* renamed from: y */
        void mo43242y(C3000l0 c3000l0);

        /* renamed from: z */
        void mo43243z();
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$a0 */
    /* loaded from: classes4.dex */
    public class C8022a0 extends AbstractC8023b {

        /* renamed from: I */
        C3000l0 f43900I;

        /* renamed from: J */
        C3020p0 f43901J;

        /* renamed from: K */
        Context f43902K;

        public C8022a0(View view, Context context) {
            super(view);
            this.f43902K = context;
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            m43246k0(c2966e1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: j0 */
        public void mo43245j0(C2966e1 c2966e1, int i11, List list) {
            m43246k0(c2966e1);
        }

        /* renamed from: k0 */
        protected void m43246k0(C2966e1 c2966e1) {
            C3000l0 c3000l0;
            C3020p0 c3020p0 = null;
            if (c2966e1 != null) {
                c3000l0 = c2966e1.f11703a;
            } else {
                c3000l0 = null;
            }
            this.f43900I = c3000l0;
            if (c2966e1 != null) {
                c3020p0 = c2966e1.f11704b;
            }
            this.f43901J = c3020p0;
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8023b extends RecyclerView.AbstractC1876c0 {
        public AbstractC8023b(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public abstract void mo43244i0(C2966e1 c2966e1, int i11);

        /* renamed from: j0 */
        public void mo43245j0(C2966e1 c2966e1, int i11, List list) {
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$b0 */
    /* loaded from: classes4.dex */
    public interface InterfaceC8024b0 extends InterfaceC8049z {
        /* renamed from: U2 */
        void mo43247U2();

        /* renamed from: V2 */
        void mo43248V2();

        /* renamed from: W2 */
        void mo43249W2(MultiStateView.EnumC15914e enumC15914e, int i11);

        /* renamed from: X2 */
        void mo43250X2();

        /* renamed from: Y2 */
        void mo43251Y2(String str);

        /* renamed from: z0 */
        void mo43252z0(C31902e9 c31902e9, ContactProfile contactProfile, String str);
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$c */
    /* loaded from: classes4.dex */
    public class C8025c extends C8022a0 {

        /* renamed from: M */
        public FeedItemAsyncFail f43904M;

        public C8025c(View view, Context context) {
            super(view, context);
            this.f43904M = (FeedItemAsyncFail) view.findViewById(AbstractC6918a0.feedItemAsyncFail);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            int i12;
            super.mo43244i0(c2966e1, i11);
            this.f43901J.f12043W = false;
            FeedItemAsyncFail feedItemAsyncFail = this.f43904M;
            if (i11 == 0) {
                i12 = AbstractC23136l9.m118742r(10.0f);
            } else {
                i12 = 0;
            }
            feedItemAsyncFail.setPadding(0, i12, 0, 0);
            this.f43904M.setBackgroundColor(FeedBaseAdapter.this.f43882A);
            this.f43904M.m43656d(this.f43900I, FeedBaseAdapter.this.f43896w);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$c0 */
    /* loaded from: classes4.dex */
    public class C8026c0 extends C8022a0 {

        /* renamed from: M */
        View f43906M;

        public C8026c0(View view, Context context) {
            super(view, context);
            this.f43906M = view;
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$d */
    /* loaded from: classes4.dex */
    public class C8027d extends C8022a0 {

        /* renamed from: M */
        public FeedItemBiography f43908M;

        public C8027d(View view, Context context) {
            super(view, context);
            FeedItemBiography feedItemBiography = (FeedItemBiography) view.findViewById(AbstractC6918a0.feedItemBiography);
            this.f43908M = feedItemBiography;
            feedItemBiography.mo43688p(context, FeedBaseAdapter.this.f43884C);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemBase.m43679x(this.f43908M, this.f43900I);
            this.f43908M.m43711S(this.f43900I, 0, FeedBaseAdapter.this.f43895v);
            this.f43908M.setOnClickListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$e */
    /* loaded from: classes4.dex */
    public class C8028e extends C8022a0 {

        /* renamed from: M */
        public FeedItemCommentBar f43910M;

        public C8028e(View view, Context context) {
            super(view, context);
            FeedItemCommentBar feedItemCommentBar = (FeedItemCommentBar) view.findViewById(AbstractC6918a0.feedItemCommentBar);
            this.f43910M = feedItemCommentBar;
            feedItemCommentBar.m43718d(context, FeedBaseAdapter.this.f43884C);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            this.f43910M.m43719h(this.f43900I, 0, false, FeedBaseAdapter.this.f43896w);
            this.f43910M.setOnClickListener(FeedBaseAdapter.this.m43210S(this.f43900I));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$f */
    /* loaded from: classes4.dex */
    public class C8029f extends C8022a0 {

        /* renamed from: M */
        public FeedItemComposeFeedModuleView f43912M;

        public C8029f(FeedItemComposeFeedModuleView feedItemComposeFeedModuleView, Context context) {
            super(feedItemComposeFeedModuleView, context);
            this.f43912M = feedItemComposeFeedModuleView;
            feedItemComposeFeedModuleView.mo43705j0(context, FeedBaseAdapter.this.f43884C);
        }

        /* renamed from: n0 */
        public /* synthetic */ void m43255n0(C16719g c16719g) {
            try {
                InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11946b1();
                }
                AbstractC23647d.m123897g("600001");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: o0 */
        public /* synthetic */ void m43256o0(C16719g c16719g) {
            try {
                InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11956i7();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            this.f43912M.setOnClickComposeFeed(new C16719g.c() { // from class: rn.c
                public /* synthetic */ C25853c() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedBaseAdapter.C8029f.this.m43255n0(c16719g);
                }
            });
            this.f43912M.setOnClickComposePhoto(new C16719g.c() { // from class: rn.d
                public /* synthetic */ C25857d() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedBaseAdapter.C8029f.this.m43256o0(c16719g);
                }
            });
            InterfaceC8021a interfaceC8021a = FeedBaseAdapter.this.f43890I;
            if (interfaceC8021a != null && (interfaceC8021a instanceof InterfaceC8048y)) {
                ((InterfaceC8048y) interfaceC8021a).mo43273l1(this.f43912M);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$g */
    /* loaded from: classes4.dex */
    public class C8030g extends C8022a0 {

        /* renamed from: M */
        public FeedItemDateDividerModuleView f43914M;

        public C8030g(FeedItemDateDividerModuleView feedItemDateDividerModuleView, Context context) {
            super(feedItemDateDividerModuleView, context);
            this.f43914M = feedItemDateDividerModuleView;
            feedItemDateDividerModuleView.mo43705j0(context, FeedBaseAdapter.this.f43884C);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            if (c2966e1 instanceof C22012a) {
                C22012a c22012a = (C22012a) c2966e1;
                FeedItemDateDividerModuleView feedItemDateDividerModuleView = this.f43914M;
                feedItemDateDividerModuleView.f44375f0 = c22012a.f108381L;
                feedItemDateDividerModuleView.f44376g0 = c22012a.f108382M;
            }
            this.f43914M.m43731m0(this.f43900I, FeedBaseAdapter.this.f43895v);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$h */
    /* loaded from: classes4.dex */
    public class C8031h extends C8022a0 {

        /* renamed from: M */
        public FeedItemDateDividerSpacingModuleView f43916M;

        public C8031h(FeedItemDateDividerSpacingModuleView feedItemDateDividerSpacingModuleView, Context context) {
            super(feedItemDateDividerSpacingModuleView, context);
            this.f43916M = feedItemDateDividerSpacingModuleView;
            feedItemDateDividerSpacingModuleView.m43742n0(context, FeedBaseAdapter.this.f43884C, 0);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            boolean z11;
            super.mo43244i0(c2966e1, i11);
            FeedItemDateDividerSpacingModuleView feedItemDateDividerSpacingModuleView = this.f43916M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemDateDividerSpacingModuleView.m43696Y(c3000l0, 0, feedBaseAdapter.f43895v, null, feedBaseAdapter.m43212O());
            FeedItemDateDividerSpacingModuleView feedItemDateDividerSpacingModuleView2 = this.f43916M;
            if (c2966e1 != null && c2966e1.m14030b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            feedItemDateDividerSpacingModuleView2.setEnableTimebar(z11);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$i */
    /* loaded from: classes4.dex */
    public class C8032i extends C8022a0 {

        /* renamed from: M */
        public FeedItemDateDividerSpacingModuleView f43918M;

        public C8032i(FeedItemDateDividerSpacingModuleView feedItemDateDividerSpacingModuleView, Context context) {
            super(feedItemDateDividerSpacingModuleView, context);
            this.f43918M = feedItemDateDividerSpacingModuleView;
            feedItemDateDividerSpacingModuleView.m43742n0(context, FeedBaseAdapter.this.f43884C, 1);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            boolean z11;
            super.mo43244i0(c2966e1, i11);
            FeedItemDateDividerSpacingModuleView feedItemDateDividerSpacingModuleView = this.f43918M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemDateDividerSpacingModuleView.m43696Y(c3000l0, 0, feedBaseAdapter.f43895v, null, feedBaseAdapter.m43212O());
            FeedItemDateDividerSpacingModuleView feedItemDateDividerSpacingModuleView2 = this.f43918M;
            if (c2966e1 != null && c2966e1.m14030b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            feedItemDateDividerSpacingModuleView2.setEnableTimebar(z11);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$j */
    /* loaded from: classes4.dex */
    public class C8033j extends C8022a0 {

        /* renamed from: M */
        public C8323l1 f43920M;

        /* renamed from: N */
        SimpleDateFormat f43921N;

        public C8033j(ModulesView modulesView, Context context) {
            super(modulesView, context);
            this.f43921N = new SimpleDateFormat("D");
            C8323l1 c8323l1 = new C8323l1(context);
            this.f43920M = c8323l1;
            c8323l1.m44778w1(context, FeedBaseAdapter.this.f43884C);
            this.f43920M.m44768U1(FeedBaseAdapter.this.f43885D);
            modulesView.mo69681L(this.f43920M);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            m43258m0(c2966e1);
            this.f43920M.m44767T1(this.f43900I, 0, FeedBaseAdapter.this.f43896w, false);
            this.f43920M.mo89109M0(FeedBaseAdapter.this.m43211T(this.f43900I));
            this.f43920M.m44769V1(FeedBaseAdapter.this.m43211T(this.f43900I));
            this.f43920M.m44770W1(FeedBaseAdapter.this.f43898y.m133499F(this.f43900I, this.f43901J));
            this.f43920M.m44772Y1(FeedBaseAdapter.this.f43898y.m133501J(this.f43900I, 0));
            this.f43920M.m44771X1(FeedBaseAdapter.this.f43898y.m133507P(this.f43901J));
        }

        /* renamed from: l0 */
        boolean m43257l0(C3020p0 c3020p0, C3020p0 c3020p02) {
            if (c3020p0 == null || c3020p02 == null) {
                return false;
            }
            AbstractC23160o0.m119268l1(this.f43921N);
            Date date = new Date(c3020p0.f12062u);
            Date date2 = new Date(c3020p02.f12062u);
            Date date3 = new Date(System.currentTimeMillis());
            int parseInt = Integer.parseInt(this.f43921N.format(date));
            int parseInt2 = Integer.parseInt(this.f43921N.format(date2));
            Integer.parseInt(this.f43921N.format(date3));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int i11 = calendar.get(1);
            calendar.setTime(date2);
            int i12 = calendar.get(1);
            calendar.setTime(date3);
            calendar.get(1);
            if (i12 != i11 || parseInt2 != parseInt) {
                return false;
            }
            return true;
        }

        /* renamed from: m0 */
        void m43258m0(C2966e1 c2966e1) {
            try {
                boolean z11 = true;
                int indexOf = FeedBaseAdapter.this.f43893t.indexOf(c2966e1.f11703a) + 1;
                if (indexOf < FeedBaseAdapter.this.f43893t.size()) {
                    C3020p0 m14322a0 = ((C3000l0) FeedBaseAdapter.this.f43893t.get(indexOf)).m14322a0();
                    C3020p0 c3020p0 = c2966e1.f11704b;
                    c3020p0.f12045Y = m43257l0(c3020p0, m14322a0);
                    String str = c2966e1.f11703a.f11869R;
                    C3020p0 c3020p02 = c2966e1.f11704b;
                    if (str != null && str.equals(((C3000l0) FeedBaseAdapter.this.f43893t.get(indexOf)).f11869R)) {
                        z11 = false;
                    }
                    c3020p02.f12046Z = z11;
                    return;
                }
                C3020p0 c3020p03 = c2966e1.f11704b;
                c3020p03.f12045Y = true;
                c3020p03.f12046Z = true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$k */
    /* loaded from: classes4.dex */
    public class C8034k extends C8022a0 {

        /* renamed from: M */
        public FeedItemHeaderBarModuleView f43923M;

        public C8034k(FeedItemHeaderBarModuleView feedItemHeaderBarModuleView, Context context) {
            super(feedItemHeaderBarModuleView, context);
            this.f43923M = feedItemHeaderBarModuleView;
            feedItemHeaderBarModuleView.m43757W(context, FeedBaseAdapter.this.f43884C, FeedBaseAdapter.this.f43885D);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            int i12;
            super.mo43244i0(c2966e1, i11);
            this.f43923M.m43758Y(false);
            FeedItemHeaderBarModuleView feedItemHeaderBarModuleView = this.f43923M;
            if (i11 == 0) {
                i12 = AbstractC23136l9.m118742r(10.0f);
            } else {
                i12 = 0;
            }
            feedItemHeaderBarModuleView.setPadding(0, i12, 0, 0);
            C8406v1 headerBarModule = this.f43923M.getHeaderBarModule();
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            headerBarModule.m44928b2(c3000l0, 0, feedBaseAdapter.f43895v, feedBaseAdapter.f43896w, feedBaseAdapter.m43212O());
            C8406v1 headerBarModule2 = this.f43923M.getHeaderBarModule();
            C3000l0 c3000l02 = this.f43900I;
            Context context = this.f43902K;
            FeedBaseAdapter feedBaseAdapter2 = FeedBaseAdapter.this;
            headerBarModule2.m44932f2(c3000l02, 0, context, feedBaseAdapter2.f43896w, feedBaseAdapter2.m43212O());
            this.f43923M.getHeaderBarModule().m44926Z1(FeedBaseAdapter.this.f43898y.m133495B(this.f43900I, 0, true, null));
            this.f43923M.setOnClickListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$l */
    /* loaded from: classes4.dex */
    public class C8035l extends C8022a0 {

        /* renamed from: M */
        public FeedItemHeaderSubMenuModuleView f43925M;

        public C8035l(FeedItemHeaderSubMenuModuleView feedItemHeaderSubMenuModuleView, Context context) {
            super(feedItemHeaderSubMenuModuleView, context);
            this.f43925M = feedItemHeaderSubMenuModuleView;
            feedItemHeaderSubMenuModuleView.m43768o0(context, FeedBaseAdapter.this.f43884C, FeedBaseAdapter.this.f43885D);
        }

        /* renamed from: m0 */
        public /* synthetic */ void m43260m0(C16719g c16719g) {
            C3047v0 c3047v0;
            AbstractC22055v0.l lVar;
            C3020p0 c3020p0 = this.f43901J;
            if (c3020p0 != null && (c3047v0 = c3020p0.f12022B) != null && AbstractC22055v0.m115114D(c3047v0.f12280b, false) && (lVar = FeedBaseAdapter.this.f43888G) != null) {
                lVar.mo47172c(AbstractC22055v0.m115161u(this.f43901J.f12022B.f12280b), null, -1);
                return;
            }
            InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11945af(c16719g, this.f43900I, 0);
            }
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemHeaderSubMenuModuleView feedItemHeaderSubMenuModuleView = this.f43925M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemHeaderSubMenuModuleView.m43696Y(c3000l0, 0, feedBaseAdapter.f43895v, feedBaseAdapter.f43896w, feedBaseAdapter.m43212O());
            this.f43925M.m43772w0(this.f43900I, 0, FeedBaseAdapter.this.f43896w);
            this.f43925M.setOnFeedMenuClickListener(FeedBaseAdapter.this.f43898y.m133499F(this.f43900I, this.f43901J));
            this.f43925M.setOnProfileClickListener(new C16719g.c() { // from class: rn.e
                public /* synthetic */ C25861e() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedBaseAdapter.C8035l.this.m43260m0(c16719g);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$m */
    /* loaded from: classes4.dex */
    public class C8036m extends C8022a0 {

        /* renamed from: M */
        public FeedItemLinkModulesView f43927M;

        public C8036m(FeedItemLinkModulesView feedItemLinkModulesView, Context context) {
            super(feedItemLinkModulesView, context);
            this.f43927M = feedItemLinkModulesView;
            feedItemLinkModulesView.mo43705j0(context, FeedBaseAdapter.this.f43884C);
            this.f43927M.setShowMutualAvatar(FeedBaseAdapter.this.f43885D);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemBaseModuleView.m43693l0(this.f43927M, this.f43900I);
            FeedItemLinkModulesView feedItemLinkModulesView = this.f43927M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemLinkModulesView.m43696Y(c3000l0, 0, feedBaseAdapter.f43895v, feedBaseAdapter.f43896w, feedBaseAdapter.m43212O());
            FeedItemLinkModulesView feedItemLinkModulesView2 = this.f43927M;
            C3000l0 c3000l02 = this.f43900I;
            Context context = this.f43902K;
            FeedBaseAdapter feedBaseAdapter2 = FeedBaseAdapter.this;
            feedItemLinkModulesView2.m43800B0(c3000l02, 0, context, feedBaseAdapter2.f43895v, feedBaseAdapter2.f43896w, feedBaseAdapter2.m43212O());
            this.f43927M.setOpenFeedDetailListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
            this.f43927M.setOnProfileClickListener(FeedBaseAdapter.this.f43898y.m133501J(this.f43900I, 0));
            this.f43927M.setOnFeedMenuClickListener(FeedBaseAdapter.this.f43898y.m133499F(this.f43900I, this.f43901J));
            this.f43927M.setOnClickListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$n */
    /* loaded from: classes4.dex */
    public class C8037n extends C8022a0 {

        /* renamed from: M */
        public FeedItemHeaderBarModuleView f43929M;

        public C8037n(View view, Context context) {
            super(view, context);
            FeedItemHeaderBarModuleView feedItemHeaderBarModuleView = (FeedItemHeaderBarModuleView) view;
            this.f43929M = feedItemHeaderBarModuleView;
            feedItemHeaderBarModuleView.m43757W(context, FeedBaseAdapter.this.f43884C, FeedBaseAdapter.this.f43885D);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            int i12;
            try {
                super.mo43244i0(c2966e1, i11);
                if (this.f43900I != null) {
                    AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[ProfileAdapter] bind header feed fail, fcid=%s", this.f43900I.f11895q);
                }
                this.f43929M.m43758Y(true);
                FeedItemHeaderBarModuleView feedItemHeaderBarModuleView = this.f43929M;
                if (i11 == 0) {
                    i12 = AbstractC23136l9.m118742r(10.0f);
                } else {
                    i12 = 0;
                }
                feedItemHeaderBarModuleView.setPadding(0, i12, 0, 0);
                this.f43929M.getLocalHeaderBarModule().m44655t1(this.f43900I);
                this.f43929M.getLocalHeaderBarModule().m44656u1(FeedBaseAdapter.this.f43896w);
                this.f43929M.getLocalHeaderBarModule().m44657v1(0, FeedBaseAdapter.this.f43895v);
                this.f43929M.setOnClickListener(null);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$o */
    /* loaded from: classes4.dex */
    public class C8038o extends C8022a0 {

        /* renamed from: M */
        public FeedItemMemory f43931M;

        public C8038o(View view, Context context) {
            super(view, context);
            FeedItemMemory feedItemMemory = (FeedItemMemory) view.findViewById(AbstractC6918a0.feedItemMemory);
            this.f43931M = feedItemMemory;
            feedItemMemory.mo43688p(context, FeedBaseAdapter.this.f43884C);
            this.f43931M.setShowMutualAvatar(FeedBaseAdapter.this.f43885D);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemBase.m43679x(this.f43931M, this.f43900I);
            FeedItemMemory feedItemMemory = this.f43931M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            FeedItemBase.m43657B(feedItemMemory, c3000l0, 0, feedBaseAdapter.f43895v, feedBaseAdapter.m43212O());
            FeedItemMemory feedItemMemory2 = this.f43931M;
            C3000l0 c3000l02 = this.f43900I;
            Context context = this.f43902K;
            FeedBaseAdapter feedBaseAdapter2 = FeedBaseAdapter.this;
            FeedItemBase.m43660F(feedItemMemory2, c3000l02, 0, context, feedBaseAdapter2.f43896w, feedBaseAdapter2.m43212O(), false, null);
            this.f43931M.setFeedCallback(FeedBaseAdapter.this.f43896w);
            C3020p0 c3020p0 = this.f43901J;
            if (c3020p0 != null) {
                C3025q0 c3025q0 = c3020p0.f12023C;
            }
            this.f43931M.m43837W(c3020p0, FeedBaseAdapter.this.f43895v);
            FeedItemBase.m43664J(this.f43931M, FeedBaseAdapter.this.f43898y.m133500I(this.f43900I, 0));
            FeedItemBase.m43662H(this.f43931M, FeedBaseAdapter.this.f43898y.m133498E(this.f43900I, this.f43901J));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$p */
    /* loaded from: classes4.dex */
    public class C8039p extends C8022a0 {

        /* renamed from: M */
        public FeedItemPhotoModuleView f43933M;

        public C8039p(FeedItemPhotoModuleView feedItemPhotoModuleView, Context context) {
            super(feedItemPhotoModuleView, context);
            this.f43933M = feedItemPhotoModuleView;
            feedItemPhotoModuleView.mo43705j0(context, FeedBaseAdapter.this.f43884C);
            this.f43933M.setShowMutualAvatar(FeedBaseAdapter.this.f43885D);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemBaseModuleView.m43693l0(this.f43933M, this.f43900I);
            FeedItemPhotoModuleView feedItemPhotoModuleView = this.f43933M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemPhotoModuleView.m43696Y(c3000l0, 0, feedBaseAdapter.f43895v, feedBaseAdapter.f43896w, feedBaseAdapter.m43212O());
            FeedItemPhotoModuleView feedItemPhotoModuleView2 = this.f43933M;
            C3000l0 c3000l02 = this.f43900I;
            Context context = this.f43902K;
            FeedBaseAdapter feedBaseAdapter2 = FeedBaseAdapter.this;
            feedItemPhotoModuleView2.mo43698b0(c3000l02, 0, context, feedBaseAdapter2.f43896w, feedBaseAdapter2.m43212O(), false, null, FeedBaseAdapter.this.f43895v);
            this.f43933M.setFeedList(FeedBaseAdapter.this.f43893t);
            FeedItemPhotoModuleView feedItemPhotoModuleView3 = this.f43933M;
            C3000l0 c3000l03 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter3 = FeedBaseAdapter.this;
            feedItemPhotoModuleView3.m43936W0(c3000l03, 0, i11, feedBaseAdapter3.f43883B, false, null, feedBaseAdapter3.f43896w);
            this.f43933M.setOnProfileClickListener(FeedBaseAdapter.this.f43898y.m133501J(this.f43900I, 0));
            this.f43933M.setOnFeedMenuClickListener(FeedBaseAdapter.this.f43898y.m133499F(this.f43900I, this.f43901J));
            this.f43933M.setFeedMusicCallback(FeedBaseAdapter.this.f43897x);
            this.f43933M.m43882z0(c2966e1.f11698G);
            InterfaceC8021a interfaceC8021a = FeedBaseAdapter.this.f43890I;
            if (interfaceC8021a != null) {
                interfaceC8021a.mo43242y(this.f43900I);
            }
            this.f43933M.setPhotoLongClickListener(FeedBaseAdapter.this.f43898y.m133511x());
            this.f43933M.setOnClickListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: j0 */
        public void mo43245j0(C2966e1 c2966e1, int i11, List list) {
            super.mo43245j0(c2966e1, i11, list);
            if (list.get(0) instanceof InterfaceC2946a1) {
                InterfaceC2946a1 interfaceC2946a1 = (InterfaceC2946a1) list.get(0);
                if (c2966e1.f11698G != null) {
                    this.f43933M.m43882z0(interfaceC2946a1);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$q */
    /* loaded from: classes4.dex */
    public class C8040q extends C8022a0 {

        /* renamed from: M */
        public FeedItemPhotoMultiModuleView f43935M;

        public C8040q(FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView, Context context) {
            super(feedItemPhotoMultiModuleView, context);
            this.f43935M = feedItemPhotoMultiModuleView;
            feedItemPhotoMultiModuleView.mo43705j0(context, FeedBaseAdapter.this.f43884C);
            this.f43935M.setShowMutualAvatar(FeedBaseAdapter.this.f43885D);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemBaseModuleView.m43693l0(this.f43935M, this.f43900I);
            FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView = this.f43935M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemPhotoMultiModuleView.m43696Y(c3000l0, 0, feedBaseAdapter.f43895v, feedBaseAdapter.f43896w, feedBaseAdapter.m43212O());
            FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView2 = this.f43935M;
            C3000l0 c3000l02 = this.f43900I;
            Context context = this.f43902K;
            FeedBaseAdapter feedBaseAdapter2 = FeedBaseAdapter.this;
            feedItemPhotoMultiModuleView2.mo43698b0(c3000l02, 0, context, feedBaseAdapter2.f43896w, feedBaseAdapter2.m43212O(), false, null, FeedBaseAdapter.this.f43895v);
            this.f43935M.setFeedList(FeedBaseAdapter.this.f43893t);
            FeedItemPhotoMultiModuleView feedItemPhotoMultiModuleView3 = this.f43935M;
            C3000l0 c3000l03 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter3 = FeedBaseAdapter.this;
            feedItemPhotoMultiModuleView3.m43983g1(c3000l03, 0, feedBaseAdapter3.f43883B, false, i11, 0, null, feedBaseAdapter3.f43896w, 0);
            this.f43935M.setOnProfileClickListener(FeedBaseAdapter.this.f43898y.m133501J(this.f43900I, 0));
            this.f43935M.setOnFeedMenuClickListener(FeedBaseAdapter.this.f43898y.m133499F(this.f43900I, this.f43901J));
            this.f43935M.setFeedMusicCallback(FeedBaseAdapter.this.f43897x);
            this.f43935M.m43882z0(c2966e1.f11698G);
            InterfaceC8021a interfaceC8021a = FeedBaseAdapter.this.f43890I;
            if (interfaceC8021a != null) {
                interfaceC8021a.mo43242y(this.f43900I);
            }
            this.f43935M.setPhotoLongClickListener(FeedBaseAdapter.this.f43898y.m133511x());
            this.f43935M.setOnClickListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: j0 */
        public void mo43245j0(C2966e1 c2966e1, int i11, List list) {
            super.mo43245j0(c2966e1, i11, list);
            if (list.get(0) instanceof InterfaceC2946a1) {
                InterfaceC2946a1 interfaceC2946a1 = (InterfaceC2946a1) list.get(0);
                if (c2966e1.f11698G != null) {
                    this.f43935M.m43882z0(interfaceC2946a1);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$r */
    /* loaded from: classes4.dex */
    public class C8041r extends C8022a0 {

        /* renamed from: M */
        public FeedItemSocialAlbum f43937M;

        public C8041r(View view, Context context) {
            super(view, context);
            FeedItemSocialAlbum feedItemSocialAlbum = (FeedItemSocialAlbum) view.findViewById(AbstractC6918a0.feedItemSocialAlbum);
            this.f43937M = feedItemSocialAlbum;
            feedItemSocialAlbum.m44014W(context, FeedBaseAdapter.this.f43884C, view);
        }

        /* renamed from: n0 */
        public /* synthetic */ void m43263n0(View view) {
            try {
                InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
                if (interfaceC2259a != null) {
                    C3000l0 c3000l0 = this.f43900I;
                    C17391z m108787U = AbstractC20826v0.m108787U(c3000l0.m14322a0(), 0);
                    FeedItemSocialAlbumVideo feedItemSocialAlbumVideo = this.f43937M.f44639s0;
                    interfaceC2259a.mo11957ig(c3000l0, 0, m108787U, 2, feedItemSocialAlbumVideo, feedItemSocialAlbumVideo.getVideoDisplayView());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: o0 */
        public /* synthetic */ void m43264o0(int i11) {
            try {
                InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
                if (interfaceC2259a != null) {
                    C3000l0 c3000l0 = this.f43900I;
                    interfaceC2259a.mo11957ig(c3000l0, 0, AbstractC20826v0.m108787U(c3000l0.m14322a0(), i11), 1, null, null);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemBase.m43679x(this.f43937M, this.f43900I);
            this.f43937M.setParentView(FeedBaseAdapter.this.f43883B);
            FeedItemSocialAlbum feedItemSocialAlbum = this.f43937M;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemSocialAlbum.m44010R(0, feedBaseAdapter.f43896w, feedBaseAdapter.m43212O(), null);
            FeedItemBase.m43664J(this.f43937M, FeedBaseAdapter.this.f43898y.m133500I(this.f43900I, 0));
            FeedItemBase.m43662H(this.f43937M, FeedBaseAdapter.this.f43898y.m133498E(this.f43900I, this.f43901J));
            this.f43937M.setViewTag(i11);
            this.f43937M.setOnVideoViewClickListener(new View.OnClickListener() { // from class: rn.f
                public /* synthetic */ ViewOnClickListenerC25865f() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedBaseAdapter.C8041r.this.m43263n0(view);
                }
            });
            this.f43937M.setVideoMixClickListener(new FeedItemSocialAlbumPhoto.InterfaceC8127a() { // from class: rn.g
                public /* synthetic */ C25869g() {
                }

                @Override // com.zing.zalo.feed.components.FeedItemSocialAlbumPhoto.InterfaceC8127a
                /* renamed from: a */
                public final void mo44050a(int i12) {
                    FeedBaseAdapter.C8041r.this.m43264o0(i12);
                }
            });
            this.f43937M.setOnViewClickListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$s */
    /* loaded from: classes4.dex */
    public class C8042s extends C8022a0 {

        /* renamed from: M */
        public FeedItemStickerModulesView f43939M;

        public C8042s(FeedItemStickerModulesView feedItemStickerModulesView, Context context) {
            super(feedItemStickerModulesView, context);
            this.f43939M = feedItemStickerModulesView;
            feedItemStickerModulesView.mo43705j0(context, FeedBaseAdapter.this.f43884C);
            this.f43939M.setShowMutualAvatar(FeedBaseAdapter.this.f43885D);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemBaseModuleView.m43693l0(this.f43939M, this.f43900I);
            FeedItemStickerModulesView feedItemStickerModulesView = this.f43939M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemStickerModulesView.m43696Y(c3000l0, 0, feedBaseAdapter.f43895v, feedBaseAdapter.f43896w, feedBaseAdapter.m43212O());
            FeedItemStickerModulesView feedItemStickerModulesView2 = this.f43939M;
            C3000l0 c3000l02 = this.f43900I;
            Context context = this.f43902K;
            FeedBaseAdapter feedBaseAdapter2 = FeedBaseAdapter.this;
            feedItemStickerModulesView2.mo43698b0(c3000l02, 0, context, feedBaseAdapter2.f43896w, feedBaseAdapter2.m43212O(), false, null, FeedBaseAdapter.this.f43895v);
            FeedItemStickerModulesView feedItemStickerModulesView3 = this.f43939M;
            C3000l0 c3000l03 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter3 = FeedBaseAdapter.this;
            feedItemStickerModulesView3.m44092o0(c3000l03, 0, feedBaseAdapter3.f43895v, feedBaseAdapter3.f43896w, "PROFILE_");
            this.f43939M.setOnProfileClickListener(FeedBaseAdapter.this.f43898y.m133501J(this.f43900I, 0));
            this.f43939M.setOnFeedMenuClickListener(FeedBaseAdapter.this.f43898y.m133499F(this.f43900I, this.f43901J));
            this.f43939M.setOpenFeedDetailListener(FeedBaseAdapter.this.f43898y.m133495B(this.f43900I, 0, false, null));
            this.f43939M.setOnClickListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$t */
    /* loaded from: classes4.dex */
    public class C8043t extends C8022a0 {

        /* renamed from: M */
        public C3427f f43941M;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$t$a */
        /* loaded from: classes4.dex */
        public class a implements FeedRecyclerView.InterfaceC8863b {

            /* renamed from: a */
            final /* synthetic */ FeedBaseAdapter f43943a;

            a(FeedBaseAdapter feedBaseAdapter) {
                this.f43943a = feedBaseAdapter;
            }

            @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
            /* renamed from: a */
            public void mo43265a() {
                InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11953fv(false);
                }
            }

            @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
            /* renamed from: b */
            public void mo43266b() {
                InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11953fv(true);
                }
            }

            @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
            /* renamed from: c */
            public void mo43267c() {
                InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11953fv(true);
                }
            }
        }

        public C8043t(View view, Context context) {
            super(view, context);
            C3427f c3427f = new C3427f(8, TextUtils.equals(CoreUtility.f89233i, FeedBaseAdapter.this.f43886E), view, FeedBaseAdapter.this.f43888G, FeedBaseAdapter.this.f43889H);
            this.f43941M = c3427f;
            c3427f.m17212v(new a(FeedBaseAdapter.this));
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            if (c2966e1 instanceof C22014b) {
                this.f43941M.m17211u(((C22014b) c2966e1).f108405L);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$u */
    /* loaded from: classes4.dex */
    public class C8044u extends C8022a0 {

        /* renamed from: M */
        public FeedItemSuggestHeader f43945M;

        public C8044u(View view, Context context) {
            super(view, context);
            FeedItemSuggestHeader feedItemSuggestHeader = (FeedItemSuggestHeader) view.findViewById(AbstractC6918a0.feedItemSuggestHeader);
            this.f43945M = feedItemSuggestHeader;
            feedItemSuggestHeader.m44136a(context, FeedBaseAdapter.this.f43884C);
        }

        /* renamed from: m0 */
        public /* synthetic */ void m43269m0(View view) {
            try {
                InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
                if (interfaceC2259a != null) {
                    interfaceC2259a.mo11934Sl(view, this.f43900I, 0);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemSuggestHeader feedItemSuggestHeader = this.f43945M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemSuggestHeader.m44137b(c3000l0, 0, feedBaseAdapter.f43895v, feedBaseAdapter.m43212O());
            this.f43945M.m44138c(this.f43902K, this.f43900I, 0, FeedBaseAdapter.this.m43212O());
            this.f43945M.setOnProfileClickListener(new View.OnClickListener() { // from class: rn.h
                public /* synthetic */ ViewOnClickListenerC25873h() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedBaseAdapter.C8044u.this.m43269m0(view);
                }
            });
            this.f43945M.setOnFeedMenuClickListener(FeedBaseAdapter.this.f43898y.m133498E(this.f43900I, this.f43901J));
            this.f43945M.setOnSuggestLocationClickListener(FeedBaseAdapter.this.f43898y.m133504M(this.f43900I, 0, this.f43901J));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$v */
    /* loaded from: classes4.dex */
    public class C8045v extends C8022a0 {

        /* renamed from: M */
        public FeedItemTextModuleView f43947M;

        public C8045v(FeedItemTextModuleView feedItemTextModuleView, Context context) {
            super(feedItemTextModuleView, context);
            this.f43947M = feedItemTextModuleView;
            feedItemTextModuleView.mo43705j0(context, FeedBaseAdapter.this.f43884C);
            this.f43947M.setShowMutualAvatar(FeedBaseAdapter.this.f43885D);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemBaseModuleView.m43693l0(this.f43947M, this.f43900I);
            FeedItemTextModuleView feedItemTextModuleView = this.f43947M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            feedItemTextModuleView.m43696Y(c3000l0, 0, feedBaseAdapter.f43895v, null, feedBaseAdapter.m43212O());
            FeedItemTextModuleView feedItemTextModuleView2 = this.f43947M;
            C3000l0 c3000l02 = this.f43900I;
            Context context = this.f43902K;
            FeedBaseAdapter feedBaseAdapter2 = FeedBaseAdapter.this;
            feedItemTextModuleView2.mo43698b0(c3000l02, 0, context, feedBaseAdapter2.f43896w, feedBaseAdapter2.m43212O(), false, null, FeedBaseAdapter.this.f43895v);
            this.f43947M.setOnProfileClickListener(FeedBaseAdapter.this.f43898y.m133501J(this.f43900I, 0));
            this.f43947M.setOnFeedMenuClickListener(FeedBaseAdapter.this.f43898y.m133499F(this.f43900I, this.f43901J));
            this.f43947M.setOnClickListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$w */
    /* loaded from: classes4.dex */
    public class C8046w extends C8022a0 {

        /* renamed from: M */
        public FeedItemVideo f43949M;

        public C8046w(View view, Context context) {
            super(view, context);
            FeedItemVideo feedItemVideo = (FeedItemVideo) view.findViewById(AbstractC6918a0.feedItemVideo);
            this.f43949M = feedItemVideo;
            feedItemVideo.mo43688p(context, FeedBaseAdapter.this.f43884C);
            this.f43949M.setShowMutualAvatar(FeedBaseAdapter.this.f43885D);
        }

        /* renamed from: m0 */
        public /* synthetic */ void m43271m0(View view) {
            try {
                InterfaceC2259a interfaceC2259a = FeedBaseAdapter.this.f43896w;
                if (interfaceC2259a != null) {
                    C3000l0 c3000l0 = this.f43900I;
                    C17391z m108789V = AbstractC20826v0.m108789V(c3000l0.m14322a0());
                    FeedItemVideo feedItemVideo = this.f43949M;
                    interfaceC2259a.mo11957ig(c3000l0, 0, m108789V, 2, feedItemVideo, feedItemVideo.getVideoDisplayView());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            FeedItemBase.m43679x(this.f43949M, this.f43900I);
            FeedItemVideo feedItemVideo = this.f43949M;
            C3000l0 c3000l0 = this.f43900I;
            FeedBaseAdapter feedBaseAdapter = FeedBaseAdapter.this;
            FeedItemBase.m43657B(feedItemVideo, c3000l0, 0, feedBaseAdapter.f43895v, feedBaseAdapter.m43212O());
            this.f43949M.mo43897w0(this.f43900I, 0, false, this.f43902K, FeedBaseAdapter.this.m43212O(), FeedBaseAdapter.this.f43896w);
            FeedItemBase.m43664J(this.f43949M, FeedBaseAdapter.this.f43898y.m133500I(this.f43900I, 0));
            FeedItemBase.m43662H(this.f43949M, FeedBaseAdapter.this.f43898y.m133498E(this.f43900I, this.f43901J));
            this.f43949M.setOnVideoViewClickListener(new View.OnClickListener() { // from class: rn.i
                public /* synthetic */ ViewOnClickListenerC25877i() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedBaseAdapter.C8046w.this.m43271m0(view);
                }
            });
            this.f43949M.setOnClickListener(FeedBaseAdapter.this.f43898y.m133494A(this.f43900I, 0, false, null));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$x */
    /* loaded from: classes4.dex */
    public class C8047x extends C8022a0 {

        /* renamed from: M */
        public FeedItemYearDivider f43951M;

        public C8047x(View view, Context context) {
            super(view, context);
            FeedItemYearDivider feedItemYearDivider = (FeedItemYearDivider) view.findViewById(AbstractC6918a0.feedItemYearDivider);
            this.f43951M = feedItemYearDivider;
            feedItemYearDivider.m44265b();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            this.f43951M.m44266e(this.f43900I, FeedBaseAdapter.this.f43895v);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$y */
    /* loaded from: classes4.dex */
    public interface InterfaceC8048y extends InterfaceC8049z {
        /* renamed from: k1 */
        void mo43272k1();

        /* renamed from: l1 */
        void mo43273l1(View view);
    }

    /* renamed from: com.zing.zalo.feed.adapters.FeedBaseAdapter$z */
    /* loaded from: classes4.dex */
    public interface InterfaceC8049z extends InterfaceC8021a {
        /* renamed from: X */
        void mo43274X();

        /* renamed from: Y */
        void mo43275Y(String str, String str2);

        /* renamed from: Z */
        String mo43276Z();

        /* renamed from: a0 */
        void mo43277a0(C23927b c23927b);
    }

    /* renamed from: N */
    private Bundle m43209N() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra_need_scroll_to_bottom", true);
        return bundle;
    }

    /* renamed from: S */
    public View.OnClickListener m43210S(C3000l0 c3000l0) {
        return this.f43898y.m133494A(c3000l0, 0, false, m43209N());
    }

    /* renamed from: T */
    public C16719g.c m43211T(C3000l0 c3000l0) {
        return this.f43898y.m133495B(c3000l0, 0, false, m43209N());
    }

    /* renamed from: O */
    public InterfaceC10867f m43212O() {
        WeakReference weakReference = this.f43899z;
        if (weakReference != null) {
            return (InterfaceC10867f) weakReference.get();
        }
        return null;
    }

    /* renamed from: P */
    public ArrayList m43213P() {
        return this.f43893t;
    }

    /* renamed from: Q */
    public C2966e1 m43214Q(int i11) {
        List list = this.f43894u;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            return (C2966e1) this.f43894u.get(i11);
        }
        return null;
    }

    /* renamed from: R */
    public List m43215R() {
        return this.f43894u;
    }

    /* renamed from: U */
    public boolean m43216U(int i11) {
        return i11 == 43 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7 || i11 == 8 || i11 == 9 || i11 == 10 || i11 == 34 || i11 == 48 || i11 == 49 || i11 == 65 || i11 == 88 || i11 == 91;
    }

    /* renamed from: V */
    public void m43217V(boolean z11) {
        this.f43885D = z11;
        this.f43898y.m133510o0(z11);
    }

    /* renamed from: W */
    public void m43218W(InterfaceC2259a interfaceC2259a) {
        this.f43896w = interfaceC2259a;
        this.f43898y.m133508l0(interfaceC2259a);
    }

    /* renamed from: X */
    public void m43219X(InterfaceC2263e interfaceC2263e) {
        this.f43897x = interfaceC2263e;
    }

    /* renamed from: Y */
    public void m43220Y(InterfaceC8021a interfaceC8021a) {
        this.f43890I = interfaceC8021a;
    }

    /* renamed from: Z */
    public void m43221Z(int i11) {
        this.f43884C = i11;
    }

    /* renamed from: a0 */
    public void m43222a0(String str) {
        this.f43886E = str;
    }

    /* renamed from: b0 */
    public void m43223b0(boolean z11) {
        this.f43895v = z11;
    }

    /* renamed from: c0 */
    public void m43224c0(AbstractC22055v0.l lVar, AbstractC7220t8 abstractC7220t8) {
        this.f43888G = lVar;
        this.f43889H = abstractC7220t8;
    }

    /* renamed from: d0 */
    public void m43225d0(FeedCallbackZaloView feedCallbackZaloView) {
        WeakReference weakReference;
        if (feedCallbackZaloView != null) {
            weakReference = new WeakReference(feedCallbackZaloView);
        } else {
            weakReference = null;
        }
        this.f43899z = weakReference;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: z */
    public void mo10018z(RecyclerView recyclerView) {
        super.mo10018z(recyclerView);
        this.f43883B = recyclerView;
    }
}
