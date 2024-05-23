package com.zing.zalo.feed.adapters;

import a30.C0105d;
import ac.C0708i;
import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import ao.InterfaceC2261c;
import au.EnumC2369r;
import bi0.AbstractC2807a;
import bo.C2944a;
import bo.C2958c3;
import bo.C2961d1;
import bo.C2966e1;
import bo.C2974g;
import bo.C2977g2;
import bo.C2979h;
import bo.C2991j1;
import bo.C2993j3;
import bo.C2994k;
import bo.C3000l0;
import bo.C3001l1;
import bo.C3008m3;
import bo.C3010n0;
import bo.C3019p;
import bo.C3020p0;
import bo.C3032r2;
import bo.C3037s2;
import bo.C3041t2;
import bo.C3054x;
import bo.C3061y2;
import bo.C3062z;
import cd0.C3427f;
import ck.C3563d;
import com.adtima.Adtima;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7307b0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.AlbumListingView;
import com.zing.zalo.feed.components.AlbumRowPreviewGridView;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.feed.components.FeedItemAlbumActionModulesView;
import com.zing.zalo.feed.components.FeedItemComposeFeedModuleView;
import com.zing.zalo.feed.components.FeedItemDateDividerModuleView;
import com.zing.zalo.feed.components.FeedItemDateDividerSpacingModuleView;
import com.zing.zalo.feed.components.FeedItemHeaderBarModuleView;
import com.zing.zalo.feed.components.FeedItemHeaderSubMenuModuleView;
import com.zing.zalo.feed.components.FeedItemLinkModulesView;
import com.zing.zalo.feed.components.FeedItemMemory;
import com.zing.zalo.feed.components.FeedItemPhotoModuleView;
import com.zing.zalo.feed.components.FeedItemPhotoMultiModuleView;
import com.zing.zalo.feed.components.FeedItemSectionRemindLimitVisibleFeed;
import com.zing.zalo.feed.components.FeedItemStickerModulesView;
import com.zing.zalo.feed.components.FeedItemSuggestFriends;
import com.zing.zalo.feed.components.FeedItemTextModuleView;
import com.zing.zalo.feed.components.FeedItemTitleDivider;
import com.zing.zalo.feed.components.FeedItemZInstantLifecycleHelper;
import com.zing.zalo.feed.components.InterfaceC8343n5;
import com.zing.zalo.feed.components.InterfaceC8395t6;
import com.zing.zalo.feed.components.InterfaceC8403u6;
import com.zing.zalo.feed.components.InterfaceC8438y1;
import com.zing.zalo.feed.components.ProfileMediaItemYearDivider;
import com.zing.zalo.feed.components.ProfileQuickActionView;
import com.zing.zalo.feed.mvp.profile.ProfileSkeletonView;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.widget.ChangeableHeightView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView;
import com.zing.zalo.p077ui.zviews.SuggestChatLayout;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.uicontrol.mediastore.ProfileMediaHeaderView;
import com.zing.zalo.uicontrol.mediastore.ProfileMediaModulesView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TrackingFrameLayout;
import com.zing.zalo.zdesign.component.TrackingLinearLayout;
import com.zing.zalo.zdesign.component.TrackingTextView;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import hf0.C20040b;
import ho0.AbstractC20110a;
import i40.C20275e;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23244v8;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p167fs.C19140e;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p448qh.AbstractC25280e;
import p448qh.C25284i;
import p491rq.C25956d;
import p542ub.InterfaceC27218a;
import p716zh.AbstractC32173x4;
import p716zh.C31862c;
import p716zh.C32187y4;
import p726zr.C32547c;
import ui0.C27280g;

/* renamed from: com.zing.zalo.feed.adapters.a */
/* loaded from: classes4.dex */
public class C8050a extends FeedBaseAdapter implements AbstractC11859g.c {

    /* renamed from: J */
    private boolean f43953J;

    /* renamed from: L */
    LayoutInflater f43955L;

    /* renamed from: M */
    Context f43956M;

    /* renamed from: N */
    C23528a f43957N;

    /* renamed from: S */
    C20275e f43962S;

    /* renamed from: U */
    InterfaceC8438y1 f43964U;

    /* renamed from: V */
    InterfaceC8343n5 f43965V;

    /* renamed from: W */
    C20040b f43966W;

    /* renamed from: X */
    AbstractC25280e f43967X;

    /* renamed from: Y */
    public s f43968Y;

    /* renamed from: a0 */
    t f43970a0;

    /* renamed from: b0 */
    InterfaceC2261c f43971b0;

    /* renamed from: c0 */
    public g f43972c0;

    /* renamed from: K */
    public int f43954K = (int) (AbstractC23136l9.m118713h0() * 0.5f);

    /* renamed from: O */
    Map f43958O = new HashMap();

    /* renamed from: P */
    String f43959P = "uid";

    /* renamed from: Q */
    private SparseIntArray f43960Q = new SparseIntArray();

    /* renamed from: R */
    private SparseIntArray f43961R = new SparseIntArray();

    /* renamed from: T */
    protected final Object f43963T = new Object();

    /* renamed from: Z */
    int f43969Z = 3;

    /* renamed from: com.zing.zalo.feed.adapters.a$a */
    /* loaded from: classes4.dex */
    public class a extends FeedBaseAdapter.AbstractC8023b {

        /* renamed from: I */
        FeedItemAlbumActionModulesView f43973I;

        public a(View view, Context context) {
            super(view);
            FeedItemAlbumActionModulesView feedItemAlbumActionModulesView = (FeedItemAlbumActionModulesView) view;
            this.f43973I = feedItemAlbumActionModulesView;
            feedItemAlbumActionModulesView.m43652W();
        }

        /* renamed from: l0 */
        public /* synthetic */ void m43315l0(View view) {
            try {
                FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                if (interfaceC8021a != null && (interfaceC8021a instanceof FeedBaseAdapter.AlbumProfileCallback)) {
                    ((FeedBaseAdapter.AlbumProfileCallback) interfaceC8021a).mo43233e2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            C2944a c2944a = c2966e1.f11727y;
            if (c2944a == null) {
                return;
            }
            this.f43973I.m43651V(c2944a);
            this.f43973I.setOnClickListener(new View.OnClickListener() { // from class: rn.o0
                public /* synthetic */ ViewOnClickListenerC25900o0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8050a.a.this.m43315l0(view);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$a0 */
    /* loaded from: classes4.dex */
    public class a0 extends FeedBaseAdapter.AbstractC8023b {

        /* renamed from: I */
        AlbumListingView f43975I;

        public a0(View view, Context context) {
            super(view);
            AlbumListingView albumListingView = (AlbumListingView) view;
            this.f43975I = albumListingView;
            albumListingView.setMode(0);
            this.f43975I.m43418f(C8050a.this.f43956M);
            FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
            if (interfaceC8021a != null && (interfaceC8021a instanceof FeedBaseAdapter.AlbumProfileCallback)) {
                this.f43975I.setFeedProfileCallback((FeedBaseAdapter.AlbumProfileCallback) interfaceC8021a);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            if (c2966e1.f11721s != null && this.f43975I != null) {
                ArrayList arrayList = new ArrayList();
                if (AbstractC0924m0.m4195s9() && c2966e1.f11721s.m14133b()) {
                    arrayList.add(C2974g.a.m14098a(new C2979h(1)));
                }
                Iterator it = c2966e1.f11721s.m14132a().iterator();
                while (it.hasNext()) {
                    arrayList.add(C2974g.a.m14099b(new C2994k((ProfilePreviewAlbumItem) it.next(), c2966e1.f11721s.m14134c(), 1)));
                }
                this.f43975I.m43415c(arrayList);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$b */
    /* loaded from: classes4.dex */
    public class b extends FeedBaseAdapter.AbstractC8023b {

        /* renamed from: I */
        public AlbumRowPreviewGridView f43977I;

        public b(AlbumRowPreviewGridView albumRowPreviewGridView, Context context) {
            super(albumRowPreviewGridView);
            this.f43977I = albumRowPreviewGridView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            C3061y2 c3061y2 = c2966e1.f11692A;
            if (c3061y2 == null) {
                return;
            }
            this.f43977I.m43481d(c3061y2);
            FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
            if (interfaceC8021a instanceof FeedBaseAdapter.AlbumProfileCallback) {
                this.f43977I.setAlbumRowPreviewGridListener((FeedBaseAdapter.AlbumProfileCallback) interfaceC8021a);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$b0 */
    /* loaded from: classes4.dex */
    public class b0 extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        LinearLayout f43979M;

        /* renamed from: N */
        FeedItemSuggestFriends f43980N;

        /* renamed from: O */
        View f43981O;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.adapters.a$b0$a */
        /* loaded from: classes4.dex */
        public class a implements FeedItemSuggestFriends.InterfaceC8144d {

            /* renamed from: a */
            final /* synthetic */ C8050a f43983a;

            a(C8050a c8050a) {
                this.f43983a = c8050a;
            }

            @Override // com.zing.zalo.feed.components.FeedItemSuggestFriends.InterfaceC8144d
            /* renamed from: a */
            public void mo43316a() {
                try {
                    FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                    if (interfaceC8021a != null) {
                        interfaceC8021a.mo43239v(false);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // com.zing.zalo.feed.components.FeedItemSuggestFriends.InterfaceC8144d
            /* renamed from: b */
            public void mo43317b() {
                try {
                    FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                    if (interfaceC8021a != null) {
                        interfaceC8021a.mo43239v(true);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // com.zing.zalo.feed.components.FeedItemSuggestFriends.InterfaceC8144d
            /* renamed from: c */
            public void mo43318c() {
                try {
                    FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                    if (interfaceC8021a != null) {
                        interfaceC8021a.mo43239v(true);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public b0(View view, Context context) {
            super(view, context);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layout_friend_suggest_profile);
            this.f43979M = linearLayout;
            this.f43981O = linearLayout.findViewById(AbstractC6918a0.suggest_friend_separate);
            FeedItemSuggestFriends feedItemSuggestFriends = (FeedItemSuggestFriends) this.f43979M.findViewById(AbstractC6918a0.suggest_friend_pager);
            this.f43980N = feedItemSuggestFriends;
            feedItemSuggestFriends.m44132h(context, 95);
            this.f43980N.setCatchTouchEventListener(new a(C8050a.this));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            C2993j3 c2993j3 = c2966e1.f11718p;
            if (c2993j3 == null) {
                return;
            }
            try {
                this.f43979M.getLayoutParams().height = -2;
                if (c2993j3.m14191b()) {
                    AbstractC23136l9.m118747s1(this.f43979M, 0, c2993j3.m14193d());
                    if (c2993j3.m14192c()) {
                        this.f43980N.m44134k(c2993j3.m14190a(), C8050a.this.f43896w);
                        this.f43980N.m44130d();
                        AbstractC23136l9.m118744r1(this.f43981O, 0);
                    } else {
                        AbstractC23136l9.m118747s1(this.f43980N, 8, c2993j3.m14193d());
                        AbstractC23136l9.m118744r1(this.f43981O, 8);
                    }
                } else {
                    this.f43979M.getLayoutParams().height = 0;
                    AbstractC23136l9.m118747s1(this.f43980N, 8, c2993j3.m14193d());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$c */
    /* loaded from: classes4.dex */
    public class c extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        View f43985M;

        /* renamed from: N */
        TrackingTextView f43986N;

        /* renamed from: O */
        TrackingLinearLayout f43987O;

        /* renamed from: P */
        TextView f43988P;

        /* renamed from: Q */
        AutoMeasureTextView f43989Q;

        /* renamed from: R */
        LinearLayout f43990R;

        /* renamed from: S */
        RobotoTextView f43991S;

        /* renamed from: T */
        RobotoTextView f43992T;

        /* renamed from: U */
        View f43993U;

        /* renamed from: V */
        AppCompatImageView f43994V;

        /* renamed from: W */
        int f43995W;

        /* renamed from: com.zing.zalo.feed.adapters.a$c$a */
        /* loaded from: classes4.dex */
        class a implements AutoMeasureTextView.InterfaceC13795a {
            a() {
            }

            @Override // com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView.InterfaceC13795a
            /* renamed from: a */
            public void mo43324a(CharSequence charSequence) {
            }

            @Override // com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView.InterfaceC13795a
            /* renamed from: b */
            public void mo43325b() {
                try {
                    ((FeedBaseAdapter.InterfaceC8024b0) C8050a.this.f43890I).mo43247U2();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public c(View view, Context context) {
            super(view, context);
            this.f43985M = view;
            this.f43986N = (TrackingTextView) view.findViewById(AbstractC6918a0.user_display_bio);
            this.f43987O = (TrackingLinearLayout) view.findViewById(AbstractC6918a0.btn_edit_bio);
            this.f43988P = (TextView) view.findViewById(AbstractC6918a0.status_bio);
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(AbstractC6918a0.status_bio_icon);
            this.f43994V = appCompatImageView;
            appCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_edit_text_line_16, AbstractC2807a.link_01));
            AutoMeasureTextView autoMeasureTextView = (AutoMeasureTextView) view.findViewById(AbstractC6918a0.user_display_name);
            this.f43989Q = autoMeasureTextView;
            autoMeasureTextView.setEditDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_edit_text_line_24, AbstractC2807a.text_01));
            this.f43990R = (LinearLayout) view.findViewById(AbstractC6918a0.business_info);
            this.f43991S = (RobotoTextView) view.findViewById(AbstractC6918a0.business_label);
            this.f43992T = (RobotoTextView) view.findViewById(AbstractC6918a0.business_category);
            this.f43993U = view.findViewById(AbstractC6918a0.business_info_dot_divider);
            this.f43995W = context.getResources().getInteger(AbstractC7307b0.ext_profile_limit_lenght_text_large);
        }

        /* renamed from: n0 */
        public /* synthetic */ void m43321n0(View view) {
            m43323p0();
        }

        /* renamed from: o0 */
        public /* synthetic */ void m43322o0(View view) {
            m43323p0();
        }

        /* renamed from: p0 */
        private void m43323p0() {
            try {
                FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                if (interfaceC8021a != null && (interfaceC8021a instanceof FeedBaseAdapter.InterfaceC8048y)) {
                    ((FeedBaseAdapter.InterfaceC8048y) interfaceC8021a).mo43272k1();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            String str;
            super.mo43244i0(c2966e1, i11);
            C3019p c3019p = c2966e1.f11712j;
            if (c3019p == null) {
                return;
            }
            TrackingTextView trackingTextView = this.f43986N;
            int i18 = 8;
            int i19 = 0;
            if (c3019p.m14442h()) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            AbstractC23136l9.m118744r1(trackingTextView, i12);
            AutoMeasureTextView autoMeasureTextView = this.f43989Q;
            if (c3019p.m14443i()) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            AbstractC23136l9.m118744r1(autoMeasureTextView, i13);
            this.f43989Q.setDrawableVisible(c3019p.m14444j());
            TrackingLinearLayout trackingLinearLayout = this.f43987O;
            if (c3019p.m14441g()) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            AbstractC23136l9.m118744r1(trackingLinearLayout, i14);
            this.f43988P.setText(c3019p.m14437c());
            if (this.f43987O.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                if (c3019p.m14440f()) {
                    ((ViewGroup.MarginLayoutParams) this.f43987O.getLayoutParams()).setMargins(0, AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(12.0f));
                } else {
                    ((ViewGroup.MarginLayoutParams) this.f43987O.getLayoutParams()).setMargins(0, AbstractC23136l9.m118742r(20.0f), 0, AbstractC23136l9.m118742r(12.0f));
                }
            }
            this.f43986N.setText(c3019p.m14438d());
            this.f43989Q.setText(c3019p.m14436b());
            boolean m14440f = c3019p.m14440f();
            boolean z11 = !TextUtils.isEmpty(c3019p.m14435a());
            LinearLayout linearLayout = this.f43990R;
            if (!m14440f && !z11) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            AbstractC23136l9.m118744r1(linearLayout, i15);
            RobotoTextView robotoTextView = this.f43991S;
            if (m14440f) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            AbstractC23136l9.m118744r1(robotoTextView, i16);
            RobotoTextView robotoTextView2 = this.f43992T;
            if (z11) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            AbstractC23136l9.m118744r1(robotoTextView2, i17);
            View view = this.f43993U;
            if (m14440f && z11) {
                i18 = 0;
            }
            AbstractC23136l9.m118744r1(view, i18);
            if (z11) {
                this.f43992T.setText(c3019p.m14435a());
            }
            FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
            if (interfaceC8021a != null) {
                interfaceC8021a.mo43240w(this.f7784p);
            }
            FeedBaseAdapter.InterfaceC8021a interfaceC8021a2 = C8050a.this.f43890I;
            if (interfaceC8021a2 != null && (interfaceC8021a2 instanceof FeedBaseAdapter.InterfaceC8024b0)) {
                this.f43989Q.setClickListener(new a());
            }
            TrackingTextView trackingTextView2 = this.f43986N;
            String str2 = "no_tracking";
            if (!c3019p.f12020k) {
                str = "no_tracking";
            } else {
                str = "social_profile_update_bio";
            }
            trackingTextView2.setIdTracking(str);
            TrackingLinearLayout trackingLinearLayout2 = this.f43987O;
            if (c3019p.f12020k) {
                str2 = "social_profile_update_bio";
            }
            trackingLinearLayout2.setIdTracking(str2);
            this.f43986N.setOnClickListener(new View.OnClickListener() { // from class: rn.p0
                public /* synthetic */ ViewOnClickListenerC25903p0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C8050a.c.this.m43321n0(view2);
                }
            });
            this.f43987O.setOnClickListener(new View.OnClickListener() { // from class: rn.q0
                public /* synthetic */ ViewOnClickListenerC25906q0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C8050a.c.this.m43322o0(view2);
                }
            });
            C0708i c0708i = new C0708i();
            if (c3019p.m14440f() || c3019p.m14439e()) {
                i19 = 1;
            }
            c0708i.m1072c("isBusinessAccount", i19);
            this.f43986N.setTrackingExtraData(c0708i);
            this.f43987O.setTrackingExtraData(c0708i);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$c0 */
    /* loaded from: classes4.dex */
    public class c0 extends FeedBaseAdapter.AbstractC8023b {

        /* renamed from: I */
        FeedItemTitleDivider f43998I;

        public c0(View view, Context context) {
            super(view);
            this.f43998I = (FeedItemTitleDivider) view;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            FeedItemTitleDivider feedItemTitleDivider;
            C3008m3 c3008m3 = c2966e1.f11722t;
            if (c3008m3 != null && (feedItemTitleDivider = this.f43998I) != null) {
                feedItemTitleDivider.m44155b(c3008m3);
                this.f43998I.setFeedItemTitleDividerListener((FeedItemTitleDivider.InterfaceC8146a) C8050a.this.f43890I);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$d */
    /* loaded from: classes4.dex */
    public class d extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        SuggestChatLayout f44000M;

        public d(View view, Context context) {
            super(view, context);
            SuggestChatLayout suggestChatLayout = new SuggestChatLayout(context);
            this.f44000M = suggestChatLayout;
            suggestChatLayout.m84861V(view, C8050a.this.f43884C);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            this.f44000M.m84860T(c2966e1.f11713k, C8050a.this.f43890I);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$d0 */
    /* loaded from: classes4.dex */
    public enum d0 {
        FEED,
        GRID
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$e */
    /* loaded from: classes4.dex */
    public class e extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        TrackingFrameLayout f44005M;

        public e(TrackingFrameLayout trackingFrameLayout, Context context) {
            super(trackingFrameLayout, context);
            this.f44005M = trackingFrameLayout;
            trackingFrameLayout.setBackgroundColor(AbstractC23136l9.m118641B(context, AbstractC16801x.transparent));
            this.f44005M.setClickable(true);
            this.f44005M.setIdTracking("social_profile_cover");
            this.f44005M.setTrackingExtraData(m43328m0(C8050a.this.f43886E));
            this.f44005M.setOnClickListener(new View.OnClickListener() { // from class: rn.r0
                public /* synthetic */ ViewOnClickListenerC25909r0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8050a.e.this.m43329n0(view);
                }
            });
        }

        /* renamed from: m0 */
        private C0708i m43328m0(String str) {
            int i11 = !Objects.equals(str, CoreUtility.f89233i) ? 1 : 0;
            C0708i c0708i = new C0708i();
            c0708i.m1072c("profile_type", i11);
            return c0708i;
        }

        /* renamed from: n0 */
        public /* synthetic */ void m43329n0(View view) {
            try {
                FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                if (interfaceC8021a != null && (interfaceC8021a instanceof FeedBaseAdapter.InterfaceC8049z)) {
                    ((FeedBaseAdapter.InterfaceC8049z) interfaceC8021a).mo43274X();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            ViewGroup.LayoutParams layoutParams = this.f44005M.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RecyclerView.LayoutParams(-1, -2);
            }
            layoutParams.height = C8050a.this.f43954K;
            this.f44005M.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$f */
    /* loaded from: classes4.dex */
    public class f extends u {

        /* renamed from: K */
        View f44007K;

        public f(View view) {
            super(view);
            this.f44007K = view;
            this.f44007K.setLayoutParams(new AbsListView.LayoutParams(-1, AbstractC23136l9.m118742r(2.0f)));
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$g */
    /* loaded from: classes4.dex */
    public interface g {
        /* renamed from: a */
        boolean mo43330a();
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$h */
    /* loaded from: classes4.dex */
    public class h extends u {

        /* renamed from: K */
        ProfileMediaModulesView f44009K;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.adapters.a$h$a */
        /* loaded from: classes4.dex */
        public class a implements ProfileMediaModulesView.InterfaceC16624d {

            /* renamed from: a */
            final /* synthetic */ C8050a f44011a;

            a(C8050a c8050a) {
                this.f44011a = c8050a;
            }

            @Override // com.zing.zalo.uicontrol.mediastore.ProfileMediaModulesView.InterfaceC16624d
            /* renamed from: a */
            public void mo43333a(AnimationTarget animationTarget, C32187y4 c32187y4, C16719g c16719g) {
                try {
                    h hVar = h.this;
                    hVar.m43332m0(c32187y4, animationTarget, null, hVar.m9929A());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // com.zing.zalo.uicontrol.mediastore.ProfileMediaModulesView.InterfaceC16624d
            /* renamed from: b */
            public void mo43334b(C32187y4 c32187y4, ProfileMediaModulesView profileMediaModulesView, C16719g c16719g) {
                try {
                    if (C8050a.this.f43970a0 != null) {
                        ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                        itemAlbumMobile.f42591p = c32187y4.m155188p();
                        itemAlbumMobile.f42607x = c32187y4.m155185m();
                        itemAlbumMobile.f42548C = c32187y4.m155187o();
                        C8050a.this.f43970a0.mo43360a(0, itemAlbumMobile, null, null);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public h(ProfileMediaModulesView profileMediaModulesView) {
            super(profileMediaModulesView);
            this.f44009K = profileMediaModulesView;
            profileMediaModulesView.setModuleViewItemListener(new a(C8050a.this));
        }

        /* renamed from: m0 */
        public void m43332m0(C32187y4 c32187y4, AnimationTarget animationTarget, ViewGroup viewGroup, int i11) {
            try {
                if (C8050a.this.f43970a0 != null) {
                    ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                    itemAlbumMobile.f42591p = c32187y4.m155188p();
                    itemAlbumMobile.f42607x = c32187y4.m155185m();
                    itemAlbumMobile.f42548C = c32187y4.m155187o();
                    itemAlbumMobile.f42593q = c32187y4.m155182j();
                    itemAlbumMobile.f42564O = c32187y4.m155173a();
                    itemAlbumMobile.f42595r = c32187y4.m155183k() + "";
                    C8050a.this.f43970a0.mo43361b(i11, itemAlbumMobile, animationTarget, null);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.u, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        protected void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            ProfileAlbumItem profileAlbumItem = c2966e1.f11724v;
            if (profileAlbumItem != null) {
                this.f44009K.setEnableShowComment(profileAlbumItem.m46306i());
                this.f44009K.setEnableShowLike(c2966e1.f11724v.m46307j());
            }
            this.f44009K.setBeingHarassing(C8050a.this.f43953J);
            boolean z11 = false;
            this.f44009K.m88392a0(this.f44048I, i11, false, false);
            this.f44009K.setLayoutParams(new AbsListView.LayoutParams(this.f44009K.getLayoutParams().width, this.f44009K.getLayoutParams().height));
            this.f44009K.requestLayout();
            ProfileMediaModulesView profileMediaModulesView = this.f44009K;
            C2966e1 c2966e12 = this.f44048I;
            C8050a c8050a = C8050a.this;
            if (c8050a.f43895v || c8050a.m43281u0()) {
                z11 = true;
            }
            profileMediaModulesView.m88393b0(c2966e12, z11, i11);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$i */
    /* loaded from: classes4.dex */
    public class i extends u {

        /* renamed from: K */
        ProfileMediaHeaderView f44013K;

        public i(ProfileMediaHeaderView profileMediaHeaderView) {
            super(profileMediaHeaderView);
            this.f44013K = profileMediaHeaderView;
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.u, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        protected void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            this.f44013K.m88382b(this.f44048I.f11707e, false, c2966e1.f11693B);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$j */
    /* loaded from: classes4.dex */
    public class j extends u {

        /* renamed from: K */
        public ProfileMediaItemYearDivider f44015K;

        public j(View view) {
            super(view);
            ProfileMediaItemYearDivider profileMediaItemYearDivider = (ProfileMediaItemYearDivider) view;
            this.f44015K = profileMediaItemYearDivider;
            profileMediaItemYearDivider.m44474b();
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.u, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        protected void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            this.f44015K.m44473a(this.f44048I.f11694C);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$k */
    /* loaded from: classes4.dex */
    public class k extends FeedBaseAdapter.AbstractC8023b {

        /* renamed from: I */
        private final EmptyContentView f44017I;

        public k(EmptyContentView emptyContentView) {
            super(emptyContentView);
            this.f44017I = emptyContentView;
        }

        /* renamed from: l0 */
        public /* synthetic */ void m43336l0(C3054x c3054x) {
            FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
            if (interfaceC8021a != null) {
                interfaceC8021a.mo43237s(c3054x);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            C3054x c3054x = c2966e1.f11725w;
            c3054x.m14661S(AbstractC23136l9.m118742r(16.0f));
            c3054x.m14660R(AbstractC23136l9.m118742r(16.0f));
            c3054x.m14662T(0);
            this.f44017I.m43610e(c3054x);
            this.f44017I.setEmptyContentListener(new EmptyContentView.InterfaceC8078a() { // from class: rn.s0
                public /* synthetic */ C25912s0() {
                }

                @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
                /* renamed from: s */
                public final void mo43432s(C3054x c3054x2) {
                    C8050a.k.this.m43336l0(c3054x2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$l */
    /* loaded from: classes4.dex */
    public class l extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        FeedItemSectionRemindLimitVisibleFeed f44019M;

        public l(FeedItemSectionRemindLimitVisibleFeed feedItemSectionRemindLimitVisibleFeed, Context context) {
            super(feedItemSectionRemindLimitVisibleFeed, context);
            this.f44019M = feedItemSectionRemindLimitVisibleFeed;
            feedItemSectionRemindLimitVisibleFeed.mo43705j0(context, C8050a.this.f43884C);
            FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
            if (interfaceC8021a != null && (interfaceC8021a instanceof FeedBaseAdapter.InterfaceC8048y)) {
                this.f44019M.setFeedProfileCallback((FeedBaseAdapter.InterfaceC8048y) interfaceC8021a);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            C3000l0 c3000l0;
            super.mo43244i0(c2966e1, i11);
            FeedItemSectionRemindLimitVisibleFeed feedItemSectionRemindLimitVisibleFeed = this.f44019M;
            if (feedItemSectionRemindLimitVisibleFeed != null && (c3000l0 = this.f43900I) != null && c3000l0.f11898r0) {
                feedItemSectionRemindLimitVisibleFeed.m44005o0(c3000l0.f11900s0, C8050a.this.m43212O());
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$m */
    /* loaded from: classes4.dex */
    public class m extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        public View f44021M;

        /* renamed from: N */
        public View f44022N;

        /* renamed from: O */
        public View f44023O;

        public m(View view, Context context) {
            super(view, context);
            this.f44021M = view.findViewById(AbstractC6918a0.layoutFeedFooterError);
            this.f44022N = view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
            this.f44023O = view.findViewById(AbstractC6918a0.layoutFeedFooter);
            this.f44021M.setOnClickListener(new View.OnClickListener() { // from class: rn.t0
                public /* synthetic */ ViewOnClickListenerC25915t0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C8050a.m.this.m43338m0(view2);
                }
            });
        }

        /* renamed from: m0 */
        public /* synthetic */ void m43338m0(View view) {
            try {
                FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                if (interfaceC8021a != null) {
                    interfaceC8021a.mo43238u();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            m43340o0(c2966e1.f11709g);
        }

        /* renamed from: n0 */
        public void m43339n0() {
            this.f44023O.getLayoutParams().height = AbstractC23136l9.m118742r(50.0f);
        }

        /* renamed from: o0 */
        public void m43340o0(C3010n0 c3010n0) {
            if (this.f44021M != null && this.f44022N != null) {
                if (c3010n0.m14426a() == 1) {
                    m43339n0();
                    this.f44021M.setVisibility(0);
                    this.f44022N.setVisibility(8);
                } else if (c3010n0.m14426a() == 2) {
                    m43339n0();
                    this.f44021M.setVisibility(8);
                    this.f44022N.setVisibility(0);
                } else {
                    this.f44021M.setVisibility(8);
                    this.f44022N.setVisibility(8);
                    this.f44023O.getLayoutParams().height = 0;
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$n */
    /* loaded from: classes4.dex */
    public class n extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        RelativeLayout f44025M;

        public n(View view, Context context) {
            super(view, context);
            this.f44025M = (RelativeLayout) view;
            ((TextView) view.findViewById(AbstractC6918a0.text_notification_latest_post)).setText(String.format(context.getString(AbstractC8020f0.str_noti_latest_post), 10));
            AbstractC23136l9.m118747s1(this.f44025M, 8, false);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            int i12;
            super.mo43244i0(c2966e1, i11);
            C3001l1 c3001l1 = c2966e1.f11719q;
            if (c3001l1 == null) {
                return;
            }
            RelativeLayout relativeLayout = this.f44025M;
            if (c3001l1.f11954a) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            AbstractC23136l9.m118747s1(relativeLayout, i12, c3001l1.f11955b);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$o */
    /* loaded from: classes4.dex */
    public class o extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        public MultiStateView f44027M;

        public o(View view, Context context) {
            super(view, context);
            MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
            this.f44027M = multiStateView;
            multiStateView.setEnableSwapStateAnim(false);
            this.f44027M.setEnableRecommend(true);
            this.f44027M.setEnableBtnFullEmpty(true);
            this.f44027M.setEnableImageFullEmpty(false);
            this.f44027M.setEnableImageErrorView(false);
            this.f44027M.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: rn.u0
                public /* synthetic */ C25918u0() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    C8050a.o.this.m43342m0();
                }
            });
        }

        /* renamed from: m0 */
        public /* synthetic */ void m43342m0() {
            try {
                FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                if (interfaceC8021a != null) {
                    interfaceC8021a.mo43243z();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            C2977g2 c2977g2 = c2966e1.f11710h;
            if (c2977g2 == null) {
                return;
            }
            try {
                this.f44027M.getLayoutParams().height = -2;
                this.f44027M.setBackgroundColor(c2977g2.m14127a());
                switch (c2977g2.m14128b()) {
                    case 0:
                        this.f44027M.getLayoutParams().height = 0;
                        this.f44027M.setState(MultiStateView.EnumC15914e.CONTENT);
                        break;
                    case 1:
                        MultiStateView multiStateView = this.f44027M;
                        if (multiStateView != null) {
                            multiStateView.setVisibility(0);
                            this.f44027M.setState(MultiStateView.EnumC15914e.LOADING);
                            break;
                        }
                        break;
                    case 2:
                        this.f44027M.getLayoutParams().height = 0;
                        this.f44027M.setState(MultiStateView.EnumC15914e.CONTENT);
                        break;
                    case 3:
                        MultiStateView multiStateView2 = this.f44027M;
                        if (multiStateView2 != null) {
                            multiStateView2.setVisibility(0);
                            this.f44027M.setState(MultiStateView.EnumC15914e.ERROR);
                            this.f44027M.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_loadfeedfail));
                            this.f44027M.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                            break;
                        }
                        break;
                    case 4:
                        MultiStateView multiStateView3 = this.f44027M;
                        if (multiStateView3 != null) {
                            multiStateView3.setVisibility(0);
                            this.f44027M.setState(MultiStateView.EnumC15914e.ERROR);
                            this.f44027M.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_errorAvtgallery));
                            this.f44027M.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                            break;
                        }
                        break;
                    case 5:
                        this.f44027M.setVisibility(0);
                        this.f44027M.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
                        this.f44027M.setState(MultiStateView.EnumC15914e.ERROR);
                        this.f44027M.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.PROFILE_NETWORK_ERROR_MSG));
                        this.f44027M.getButtonRetry().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry));
                        this.f44027M.setEnableImageErrorView(true);
                        if (C23212s8.m119602i()) {
                            this.f44027M.setErrorImageResource(AbstractC23322a.zds_il_no_connection_dark_spot_1_1);
                        } else {
                            this.f44027M.setErrorImageResource(AbstractC23322a.zds_il_no_connection_light_spot_1_1);
                        }
                        this.f44027M.getButtonRetry().setAllCaps(false);
                        break;
                    case 7:
                        MultiStateView multiStateView4 = this.f44027M;
                        if (multiStateView4 != null) {
                            multiStateView4.setVisibility(0);
                            this.f44027M.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_emptyAvtgallery));
                            this.f44027M.setState(MultiStateView.EnumC15914e.EMPTY);
                            break;
                        }
                        break;
                    case 8:
                        MultiStateView multiStateView5 = this.f44027M;
                        if (multiStateView5 != null) {
                            multiStateView5.setVisibility(0);
                            this.f44027M.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_empty_album));
                            this.f44027M.setState(MultiStateView.EnumC15914e.ERROR);
                            this.f44027M.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                            break;
                        }
                        break;
                    case 10:
                        MultiStateView multiStateView6 = this.f44027M;
                        if (multiStateView6 != null) {
                            multiStateView6.setVisibility(0);
                            this.f44027M.setState(MultiStateView.EnumC15914e.ERROR);
                            this.f44027M.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
                            this.f44027M.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                            break;
                        }
                        break;
                }
                FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                if (interfaceC8021a != null && (interfaceC8021a instanceof FeedBaseAdapter.InterfaceC8024b0)) {
                    ((FeedBaseAdapter.InterfaceC8024b0) interfaceC8021a).mo43249W2(this.f44027M.getState(), this.f44027M.getHeight());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$p */
    /* loaded from: classes4.dex */
    public class p extends FeedBaseAdapter.C8022a0 implements View.OnClickListener {

        /* renamed from: M */
        View f44029M;

        /* renamed from: N */
        RecyclingImageView f44030N;

        /* renamed from: O */
        CircleImage f44031O;

        /* renamed from: P */
        AutoMeasureTextView f44032P;

        /* renamed from: Q */
        RobotoTextView f44033Q;

        public p(View view, Context context) {
            super(view, context);
            this.f44029M = view;
            this.f44030N = (RecyclingImageView) view.findViewById(AbstractC6918a0.cover_image_oa);
            CircleImage circleImage = (CircleImage) this.f44029M.findViewById(AbstractC6918a0.imv_avatar_oa);
            this.f44031O = circleImage;
            circleImage.setOnClickListener(this);
            AutoMeasureTextView autoMeasureTextView = (AutoMeasureTextView) this.f44029M.findViewById(AbstractC6918a0.user_display_name_oa);
            this.f44032P = autoMeasureTextView;
            autoMeasureTextView.setDrawableVisible(false);
            this.f44033Q = (RobotoTextView) this.f44029M.findViewById(AbstractC6918a0.user_display_status_oa);
            View findViewById = this.f44029M.findViewById(AbstractC6918a0.top_profile_cover_gradient_oa);
            View findViewById2 = this.f44029M.findViewById(AbstractC6918a0.profile_cover_gradient_oa);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            C3032r2 c3032r2 = c2966e1.f11715m;
            if (c3032r2 == null) {
                return;
            }
            m43343l0(c3032r2.f12218a);
            m43344m0(c3032r2.f12219b);
            m43345n0(c3032r2.f12220c);
            m43346o0(c3032r2.f12221d);
        }

        /* renamed from: l0 */
        public void m43343l0(String str) {
            CircleImage circleImage = this.f44031O;
            circleImage.setImageDrawable(C23212s8.m119609q(circleImage.getContext(), AbstractC16781w.default_avatar));
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                ((C23528a) C8050a.this.f43957N.m123612r(this.f44031O)).m123618x(str, C23278z2.m120143n());
            }
        }

        /* renamed from: m0 */
        public void m43344m0(String str) {
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                ((C23528a) C8050a.this.f43957N.m123612r(this.f44030N)).m123618x(str, C23278z2.m120132i0());
            }
        }

        /* renamed from: n0 */
        public void m43345n0(String str) {
            AutoMeasureTextView autoMeasureTextView = this.f44032P;
            if (autoMeasureTextView != null) {
                autoMeasureTextView.setText(str);
            }
        }

        /* renamed from: o0 */
        public void m43346o0(String str) {
            RobotoTextView robotoTextView = this.f44033Q;
            if (robotoTextView != null) {
                robotoTextView.setText(str);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s sVar;
            try {
                if (view.getId() == AbstractC6918a0.imv_avatar_oa && (sVar = C8050a.this.f43968Y) != null) {
                    sVar.mo43357u0();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$q */
    /* loaded from: classes4.dex */
    public class q extends FeedBaseAdapter.C8022a0 implements View.OnClickListener {

        /* renamed from: M */
        RobotoTextView f44035M;

        public q(View view, Context context) {
            super(view, context);
            RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_action);
            this.f44035M = robotoTextView;
            robotoTextView.setOnClickListener(this);
            ((LinearLayout) view.findViewById(AbstractC6918a0.layout_view_recent_msg)).setOnClickListener(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            C3037s2 c3037s2 = c2966e1.f11717o;
            if (c3037s2 == null) {
                return;
            }
            m43347l0(c3037s2.f12236a);
        }

        /* renamed from: l0 */
        public void m43347l0(String str) {
            RobotoTextView robotoTextView = this.f44035M;
            if (robotoTextView != null) {
                robotoTextView.setText(str);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s sVar;
            try {
                int id2 = view.getId();
                if (id2 == AbstractC6918a0.btn_action) {
                    s sVar2 = C8050a.this.f43968Y;
                    if (sVar2 != null) {
                        sVar2.mo43359w2();
                    }
                } else if (id2 == AbstractC6918a0.layout_view_recent_msg && (sVar = C8050a.this.f43968Y) != null) {
                    sVar.mo43358u1();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$r */
    /* loaded from: classes4.dex */
    public class r extends FeedBaseAdapter.C8022a0 implements View.OnClickListener {

        /* renamed from: M */
        RelativeLayout f44037M;

        /* renamed from: N */
        View f44038N;

        /* renamed from: O */
        RobotoTextView f44039O;

        /* renamed from: P */
        LinearLayout f44040P;

        /* renamed from: Q */
        View f44041Q;

        /* renamed from: R */
        RobotoTextView f44042R;

        /* renamed from: S */
        View f44043S;

        /* renamed from: com.zing.zalo.feed.adapters.a$r$a */
        /* loaded from: classes4.dex */
        public class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ C3977j f44045l1;

            /* renamed from: m1 */
            final /* synthetic */ ImageButton f44046m1;

            a(C3977j c3977j, ImageButton imageButton) {
                this.f44045l1 = c3977j;
                this.f44046m1 = imageButton;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                if (c3979l.m18839c() != null) {
                    this.f44045l1.setImageInfo(c3979l, false);
                    this.f44046m1.setImageBitmap(c3979l.m18839c());
                }
            }
        }

        public r(View view, Context context) {
            super(view, context);
            RelativeLayout relativeLayout = (RelativeLayout) view;
            this.f44037M = relativeLayout;
            this.f44038N = relativeLayout.findViewById(AbstractC6918a0.divider_top_promote);
            this.f44040P = (LinearLayout) this.f44037M.findViewById(AbstractC6918a0.layout_promote);
            this.f44039O = (RobotoTextView) this.f44037M.findViewById(AbstractC6918a0.tv_desc);
            this.f44041Q = this.f44037M.findViewById(AbstractC6918a0.icon_desc_next);
            this.f44042R = (RobotoTextView) this.f44037M.findViewById(AbstractC6918a0.tv_certificate);
            View findViewById = this.f44037M.findViewById(AbstractC6918a0.layout_desc);
            this.f44043S = findViewById;
            findViewById.setOnClickListener(this);
        }

        /* renamed from: m0 */
        public static /* synthetic */ void m43349m0(String str, View view) {
            try {
                if (str.startsWith("http")) {
                    AbstractC23647d.m123906p("870040");
                    AbstractC23647d.m123893c();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            C3041t2 c3041t2 = c2966e1.f11716n;
            if (c3041t2 == null) {
                return;
            }
            m43352p0(c3041t2.f12250a);
            m43354r0(c3041t2.f12251b);
            m43351o0(c3041t2.f12252c);
            m43355s0(c3041t2.f12253d);
            m43353q0(c3041t2.f12254e);
            m43350n0(c3041t2.f12255f, c3041t2.f12256g);
        }

        /* renamed from: n0 */
        public void m43350n0(List list, boolean z11) {
            int m118641B;
            if (list != null && list.size() > 0) {
                this.f44040P.removeAllViews();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C3563d.a aVar = (C3563d.a) list.get(i11);
                    View inflate = LayoutInflater.from(this.f43902K).inflate(AbstractC7409c0.layout_oa_item, (ViewGroup) null);
                    RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_name);
                    RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_value);
                    ImageButton imageButton = (ImageButton) inflate.findViewById(AbstractC6918a0.icon);
                    View findViewById = inflate.findViewById(AbstractC6918a0.divider_bottom);
                    C3977j c3977j = new C3977j(this.f43902K);
                    robotoTextView.setText(aVar.m18103b());
                    if (C16741a.m89329r().m89334E(aVar.m18104c(), AbstractC23309i.m121704a5())) {
                        String m18104c = aVar.m18104c();
                        if (!m18104c.equals("invalid") && !TextUtils.isEmpty(m18104c)) {
                            SpannableString spannableString = new SpannableString(m18104c);
                            Linkify.addLinks(spannableString, 4);
                            robotoTextView2.setText(spannableString);
                            robotoTextView2.setLinkTextColor(AbstractC23136l9.m118641B(robotoTextView2.getContext(), AbstractC16801x.cM1));
                        }
                    } else {
                        robotoTextView2.setText(AbstractC20826v0.m108762H0((InterfaceC27218a) this.f43902K, aVar.m18104c()));
                    }
                    robotoTextView2.setMovementMethod(CustomMovementMethod.m56305e());
                    robotoTextView2.setOnClickListener(new View.OnClickListener() { // from class: rn.v0

                        /* renamed from: p */
                        public final /* synthetic */ String f123614p;

                        public /* synthetic */ ViewOnClickListenerC25921v0(String str) {
                            r1 = str;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C8050a.r.m43349m0(r1, view);
                        }
                    });
                    if (!TextUtils.isEmpty(aVar.m18102a())) {
                        imageButton.setVisibility(0);
                        ((C23528a) C8050a.this.f43957N.m123612r(c3977j)).m123579C(aVar.m18102a(), C23278z2.m120090Q(), new a(c3977j, imageButton));
                    } else {
                        imageButton.setVisibility(8);
                    }
                    if (i11 == list.size() - 1) {
                        m118641B = -1;
                    } else {
                        m118641B = AbstractC23136l9.m118641B(findViewById.getContext(), AbstractC16801x.cLine1);
                    }
                    findViewById.setBackgroundColor(m118641B);
                    this.f44040P.addView(inflate);
                }
                AbstractC23136l9.m118747s1(this.f44040P, 0, z11);
            }
        }

        /* renamed from: o0 */
        public void m43351o0(String str) {
            RobotoTextView robotoTextView = this.f44039O;
            if (robotoTextView != null) {
                robotoTextView.setText(str);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s sVar;
            try {
                if (view.getId() == AbstractC6918a0.layout_desc && (sVar = C8050a.this.f43968Y) != null) {
                    sVar.mo43356X2();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        /* renamed from: p0 */
        public void m43352p0(boolean z11) {
            int i11;
            RobotoTextView robotoTextView = this.f44042R;
            if (robotoTextView != null) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                robotoTextView.setVisibility(i11);
            }
        }

        /* renamed from: q0 */
        public void m43353q0(boolean z11) {
            int i11;
            View view = this.f44038N;
            if (view != null) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                view.setVisibility(i11);
            }
        }

        /* renamed from: r0 */
        public void m43354r0(boolean z11) {
            int i11;
            RobotoTextView robotoTextView = this.f44039O;
            if (robotoTextView != null) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                robotoTextView.setVisibility(i11);
            }
        }

        /* renamed from: s0 */
        public void m43355s0(boolean z11) {
            int i11;
            View view = this.f44041Q;
            if (view != null) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                view.setVisibility(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$s */
    /* loaded from: classes4.dex */
    public interface s {
        /* renamed from: X2 */
        void mo43356X2();

        /* renamed from: u0 */
        void mo43357u0();

        /* renamed from: u1 */
        void mo43358u1();

        /* renamed from: w2 */
        void mo43359w2();
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$t */
    /* loaded from: classes4.dex */
    public interface t {
        /* renamed from: a */
        void mo43360a(int i11, ItemAlbumMobile itemAlbumMobile, ImageView imageView, View view);

        /* renamed from: b */
        void mo43361b(int i11, ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget, View view);
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$u */
    /* loaded from: classes4.dex */
    public abstract class u extends FeedBaseAdapter.AbstractC8023b {

        /* renamed from: I */
        C2966e1 f44048I;

        public u(View view) {
            super(view);
            this.f44048I = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            m43362k0(c2966e1);
        }

        /* renamed from: k0 */
        protected void m43362k0(C2966e1 c2966e1) {
            this.f44048I = c2966e1;
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$v */
    /* loaded from: classes4.dex */
    public class v extends FeedBaseAdapter.C8022a0 implements View.OnClickListener {

        /* renamed from: M */
        Button f44050M;

        /* renamed from: N */
        Button f44051N;

        /* renamed from: O */
        View f44052O;

        /* renamed from: P */
        RobotoTextView f44053P;

        public v(View view, Context context) {
            super(view, context);
            this.f44050M = (Button) view.findViewById(AbstractC6918a0.btn_send_message);
            this.f44051N = (Button) view.findViewById(AbstractC6918a0.btn_send_friend_request);
            this.f44052O = view.findViewById(AbstractC6918a0.center_baseline_view);
            this.f44053P = (RobotoTextView) view.findViewById(AbstractC6918a0.description);
            this.f44050M.setIdTracking("social_profile_suggest_action_send_message");
            this.f44050M.setOnClickListener(this);
            this.f44051N.setIdTracking("social_profile_suggest_action_send_friend_request");
            this.f44051N.setOnClickListener(this);
        }

        /* renamed from: l0 */
        private void m43363l0() {
            if (this.f44050M.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                this.f44050M.getLayoutParams().width = -1;
                ((RelativeLayout.LayoutParams) this.f44050M.getLayoutParams()).addRule(0, this.f44052O.getId());
            }
            if (this.f44051N.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                this.f44051N.getLayoutParams().width = -1;
                ((RelativeLayout.LayoutParams) this.f44051N.getLayoutParams()).removeRule(21);
                ((RelativeLayout.LayoutParams) this.f44051N.getLayoutParams()).addRule(1, this.f44052O.getId());
            }
        }

        /* renamed from: m0 */
        private void m43364m0() {
            if (this.f44050M.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                this.f44050M.getLayoutParams().width = -1;
                ((RelativeLayout.LayoutParams) this.f44050M.getLayoutParams()).addRule(0, this.f44051N.getId());
            }
            if (this.f44051N.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                this.f44051N.getLayoutParams().width = AbstractC23136l9.m118742r(64.0f);
                ((RelativeLayout.LayoutParams) this.f44051N.getLayoutParams()).addRule(21);
                ((RelativeLayout.LayoutParams) this.f44051N.getLayoutParams()).removeRule(1);
            }
        }

        /* renamed from: n0 */
        private void m43365n0(boolean z11) {
            if (z11) {
                m43363l0();
            } else {
                m43364m0();
            }
        }

        /* renamed from: o0 */
        private void m43366o0(boolean z11) {
            try {
                if (z11) {
                    this.f44051N.setSupportiveIcon((Drawable) null);
                    this.f44051N.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_recall_friend_request));
                    FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                    if (interfaceC8021a != null && (interfaceC8021a instanceof FeedBaseAdapter.InterfaceC8024b0)) {
                        ((FeedBaseAdapter.InterfaceC8024b0) interfaceC8021a).mo43251Y2(AbstractC23136l9.m118743r0(AbstractC8020f0.str_recall_friend_request));
                    }
                } else {
                    this.f44051N.setSupportiveIcon(AbstractC23322a.zds_ic_add_user_line_24);
                    this.f44051N.setText("");
                    FeedBaseAdapter.InterfaceC8021a interfaceC8021a2 = C8050a.this.f43890I;
                    if (interfaceC8021a2 != null && (interfaceC8021a2 instanceof FeedBaseAdapter.InterfaceC8024b0)) {
                        ((FeedBaseAdapter.InterfaceC8024b0) interfaceC8021a2).mo43251Y2(AbstractC23136l9.m118743r0(AbstractC8020f0.bump_add_friend));
                    }
                }
                m43365n0(z11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            int i12;
            int i13;
            super.mo43244i0(c2966e1, i11);
            C2991j1 c2991j1 = c2966e1.f11714l;
            if (c2991j1 == null) {
                return;
            }
            try {
                View view = this.f7784p;
                int i14 = 8;
                if (c2991j1.m14181c()) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                view.setVisibility(i12);
                ViewGroup.LayoutParams layoutParams = this.f7784p.getLayoutParams();
                if (c2991j1.m14181c()) {
                    i13 = -2;
                } else {
                    i13 = 0;
                }
                layoutParams.height = i13;
                RobotoTextView robotoTextView = this.f44053P;
                if (!TextUtils.isEmpty(c2991j1.m14179a())) {
                    i14 = 0;
                }
                robotoTextView.setVisibility(i14);
                this.f44053P.setText(c2991j1.m14179a());
                if (c2991j1.m14181c()) {
                    m43366o0(c2991j1.m14180b());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
                if (interfaceC8021a != null && (interfaceC8021a instanceof FeedBaseAdapter.InterfaceC8024b0)) {
                    int id2 = view.getId();
                    if (id2 == AbstractC6918a0.btn_send_message) {
                        ((FeedBaseAdapter.InterfaceC8024b0) C8050a.this.f43890I).mo43250X2();
                    } else if (id2 == AbstractC6918a0.btn_send_friend_request) {
                        ((FeedBaseAdapter.InterfaceC8024b0) C8050a.this.f43890I).mo43248V2();
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$w */
    /* loaded from: classes4.dex */
    public class w extends FeedBaseAdapter.AbstractC8023b {

        /* renamed from: I */
        C25956d f44055I;

        public w(View view, Context context) {
            super(view);
            C25956d c25956d = new C25956d(view, context);
            this.f44055I = c25956d;
            FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
            if (interfaceC8021a instanceof FeedBaseAdapter.InterfaceC8049z) {
                c25956d.m133719l((FeedBaseAdapter.InterfaceC8049z) interfaceC8021a);
            }
            this.f44055I.m133722o();
            this.f44055I.m133716f();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            Drawable m119609q;
            C2961d1 c2961d1 = c2966e1.f11720r;
            if (c2961d1 != null && this.f44055I != null) {
                if (c2961d1.m14021c()) {
                    this.f44055I.m133720m();
                    if (!c2961d1.m14020b()) {
                        this.f44055I.m133718k(c2961d1);
                        this.f44055I.m133721n();
                    }
                    View view = this.f7784p;
                    if (c2961d1.m14022d()) {
                        m119609q = AbstractC23136l9.m118665N(this.f7784p.getContext(), AbstractC16803z.profile_gradient_background);
                    } else {
                        m119609q = C23212s8.m119609q(this.f7784p.getContext(), AbstractC16781w.ProfilePrimaryBackgroundColor);
                    }
                    view.setBackground(m119609q);
                    return;
                }
                this.f44055I.m133715e();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$x */
    /* loaded from: classes4.dex */
    public class x extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        public ProfileQuickActionView f44057M;

        public x(ProfileQuickActionView profileQuickActionView, Context context) {
            super(profileQuickActionView, context);
            this.f44057M = profileQuickActionView;
            profileQuickActionView.setQuickActionCallback(new ProfileQuickActionView.InterfaceC8219b() { // from class: rn.w0
                public /* synthetic */ C25924w0() {
                }

                @Override // com.zing.zalo.feed.components.ProfileQuickActionView.InterfaceC8219b
                /* renamed from: Y */
                public final void mo44495Y(String str, String str2) {
                    C8050a.x.this.m43368m0(str, str2);
                }
            });
        }

        /* renamed from: m0 */
        public /* synthetic */ void m43368m0(String str, String str2) {
            FeedBaseAdapter.InterfaceC8021a interfaceC8021a = C8050a.this.f43890I;
            if (interfaceC8021a != null && (interfaceC8021a instanceof FeedBaseAdapter.InterfaceC8049z)) {
                ((FeedBaseAdapter.InterfaceC8049z) interfaceC8021a).mo43275Y(str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            C31862c c31862c;
            super.mo43244i0(c2966e1, i11);
            if (c2966e1 != null) {
                c31862c = c2966e1.f11728z;
            } else {
                c31862c = null;
            }
            this.f44057M.m44487b(c31862c, C8050a.this.f43895v);
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$y */
    /* loaded from: classes4.dex */
    public class y extends u {

        /* renamed from: K */
        ProfileSkeletonView f44059K;

        public y(ProfileSkeletonView profileSkeletonView) {
            super(profileSkeletonView);
            this.f44059K = profileSkeletonView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.C8050a.u, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            C2958c3 c2958c3;
            super.mo43244i0(c2966e1, i11);
            if (this.f44059K != null && (c2958c3 = c2966e1.f11695D) != null) {
                if (c2958c3.m14006c()) {
                    this.f44059K.setColorModule(c2966e1.f11695D.m14005b());
                }
                this.f44059K.setSkeletonLayoutType(c2966e1.f11695D.m14007d());
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.adapters.a$z */
    /* loaded from: classes4.dex */
    public class z extends FeedBaseAdapter.C8022a0 {

        /* renamed from: M */
        public ChangeableHeightView f44061M;

        public z(ChangeableHeightView changeableHeightView, Context context) {
            super(changeableHeightView, context);
            this.f44061M = changeableHeightView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.C8022a0, com.zing.zalo.feed.adapters.FeedBaseAdapter.AbstractC8023b
        /* renamed from: i0 */
        public void mo43244i0(C2966e1 c2966e1, int i11) {
            super.mo43244i0(c2966e1, i11);
            C3062z c3062z = c2966e1.f11711i;
            if (c3062z == null) {
                return;
            }
            this.f44061M.setHeight(c3062z.m14723b());
            this.f44061M.setBackgroundColor(c3062z.m14722a());
        }
    }

    public C8050a(Context context, C23528a c23528a) {
        try {
            this.f43955L = (LayoutInflater) context.getSystemService("layout_inflater");
            this.f43957N = c23528a;
            this.f43956M = context;
            this.f43892s = new HashMap();
            this.f43882A = C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor);
            if (ZMediaPlayerSettings.isVideoAutoplay()) {
                this.f43966W = new C20040b(this, 2);
                C25284i c25284i = new C25284i(this.f43959P, this);
                this.f43967X = c25284i;
                this.f43966W.m104017g0(c25284i);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k0 */
    private void m43280k0(InterfaceC8403u6 interfaceC8403u6) {
        InterfaceC8438y1 interfaceC8438y1 = this.f43964U;
        if (interfaceC8438y1 != null) {
            FeedItemZInstantLifecycleHelper.m44299a(interfaceC8438y1.mo44963a(), interfaceC8403u6);
        }
        if (interfaceC8403u6 instanceof InterfaceC8395t6) {
            ((InterfaceC8395t6) interfaceC8403u6).setParentStateInfoProvider(this.f43965V);
        }
    }

    /* renamed from: u0 */
    public boolean m43281u0() {
        g gVar = this.f43972c0;
        if (gVar != null && gVar.mo43330a()) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public void m43282A0() {
        if (m43301l0() != null) {
            m43301l0().m104005P();
        }
    }

    /* renamed from: B0 */
    public void m43283B0() {
        if (m43301l0() != null) {
            m43301l0().m104006Q();
        }
    }

    /* renamed from: C0 */
    public void m43284C0(RecyclerView recyclerView, int i11, int i12, C20040b.b bVar) {
        try {
            if (m43301l0() != null) {
                m43301l0().m104007R(this.f43959P, recyclerView, i11, i12, bVar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D0 */
    public void m43285D0(RecyclerView recyclerView, int i11) {
        try {
            if (m43301l0() != null) {
                m43301l0().m104008S(recyclerView, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E0 */
    public void m43286E0() {
        if (m43301l0() != null) {
            m43301l0().m104009T();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: F0 */
    public void mo9995F(FeedBaseAdapter.AbstractC8023b abstractC8023b) {
        super.mo9995F(abstractC8023b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: G0 */
    public void mo9996G(FeedBaseAdapter.AbstractC8023b abstractC8023b) {
        super.mo9996G(abstractC8023b);
    }

    /* renamed from: H0 */
    public void m43289H0(InterfaceC2261c interfaceC2261c) {
        this.f43971b0 = interfaceC2261c;
    }

    /* renamed from: I0 */
    public void m43290I0(boolean z11) {
        this.f43953J = z11;
    }

    /* renamed from: J0 */
    public void m43291J0(InterfaceC8438y1 interfaceC8438y1) {
        this.f43964U = interfaceC8438y1;
    }

    /* renamed from: K0 */
    public void m43292K0(t tVar) {
        this.f43970a0 = tVar;
    }

    /* renamed from: L0 */
    public void m43293L0(s sVar) {
        this.f43968Y = sVar;
    }

    /* renamed from: M0 */
    public void m43294M0(InterfaceC8343n5 interfaceC8343n5) {
        this.f43965V = interfaceC8343n5;
    }

    /* renamed from: N0 */
    public void m43295N0() {
        m43308t0();
        C20275e c20275e = this.f43962S;
        if (c20275e != null) {
            c20275e.m105857C(this.f43960Q);
            this.f43962S.m105858D(this.f43961R);
        }
    }

    /* renamed from: O0 */
    public void m43296O0(String str, C32547c c32547c) {
        synchronized (this.f43963T) {
            try {
                if (this.f43894u == null) {
                    return;
                }
                for (int i11 = 0; i11 < this.f43894u.size(); i11++) {
                    C2966e1 c2966e1 = (C2966e1) this.f43894u.get(i11);
                    C3020p0 c3020p0 = c2966e1.f11704b;
                    if (c2966e1.f11705c == 40 && c3020p0 != null && c3020p0.f12057p.equals(str)) {
                        C19140e.f95172a.m100456h(c2966e1.f11704b, c32547c);
                        m10008p();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.custom.AbstractC11859g.c
    /* renamed from: g */
    public String mo36810g(int i11) {
        return m43305q0(i11);
    }

    /* renamed from: g0 */
    public void m43297g0(List list) {
        this.f43894u = new ArrayList(list);
    }

    /* renamed from: h0 */
    public void m43298h0(List list, List list2) {
        new ArrayList(list);
        this.f43894u = new ArrayList(list);
        this.f43893t = new ArrayList(list2);
        C20040b c20040b = this.f43966W;
        if (c20040b != null && c20040b.m104002J() != null) {
            this.f43966W.m104002J().m130842t();
        }
    }

    /* renamed from: i0 */
    public void m43299i0() {
        try {
            ArrayList arrayList = this.f43893t;
            if (arrayList != null) {
                arrayList.clear();
                this.f43893t = null;
            }
            this.f43957N = null;
            C0105d.m474b().m475a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j0 */
    public void m43300j0() {
        Map map = this.f43958O;
        if (map != null) {
            map.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f43894u;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: l0 */
    public C20040b m43301l0() {
        return this.f43966W;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C2966e1 c2966e1;
        List list = this.f43894u;
        if (list != null && (c2966e1 = (C2966e1) list.get(i11)) != null) {
            return c2966e1.f11705c;
        }
        return 0;
    }

    /* renamed from: m0 */
    public int m43302m0(String str) {
        C3000l0 c3000l0;
        List list = this.f43894u;
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < this.f43894u.size(); i11++) {
                C2966e1 c2966e1 = (C2966e1) this.f43894u.get(i11);
                if (c2966e1 != null && (c3000l0 = c2966e1.f11703a) != null && c2966e1.f11705c == 40 && TextUtils.equals(str, c3000l0.f11895q)) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: o0 */
    public int m43303o0(String str) {
        C3000l0 c3000l0;
        List list = this.f43894u;
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < this.f43894u.size(); i11++) {
                C2966e1 c2966e1 = (C2966e1) this.f43894u.get(i11);
                if (c2966e1 != null && (c3000l0 = c2966e1.f11703a) != null && c2966e1.f11705c == 61 && TextUtils.equals(str, c3000l0.f11895q)) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: p0 */
    public long m43304p0(int i11) {
        C2966e1 m43214Q;
        AbstractC32173x4 abstractC32173x4;
        if (i11 < 0 || i11 >= mo10003k() || (m43214Q = m43214Q(i11)) == null || (abstractC32173x4 = m43214Q.f11707e) == null || !abstractC32173x4.m155152k()) {
            return 0L;
        }
        return abstractC32173x4.m155147f();
    }

    /* renamed from: q0 */
    public String m43305q0(int i11) {
        C2966e1 m43214Q;
        String str;
        String str2 = "";
        if (i11 >= 0 && i11 < mo10003k() && (m43214Q = m43214Q(i11)) != null) {
            AbstractC32173x4 abstractC32173x4 = m43214Q.f11707e;
            C3000l0 c3000l0 = m43214Q.f11703a;
            if (abstractC32173x4 != null) {
                if (abstractC32173x4.m155147f() != 0) {
                    str2 = AbstractC23160o0.m119305y0(abstractC32173x4.m155147f());
                }
                return AbstractC23244v8.m119738b(str2);
            }
            if (c3000l0 != null && (str = c3000l0.f11869R) != null) {
                return str;
            }
        }
        return "";
    }

    /* renamed from: r0 */
    public SparseIntArray m43306r0() {
        return this.f43960Q;
    }

    /* renamed from: s0 */
    public SparseIntArray m43307s0() {
        return this.f43961R;
    }

    /* renamed from: t0 */
    public void m43308t0() {
        try {
            this.f43960Q.clear();
            this.f43961R.clear();
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < mo10003k(); i11++) {
                C2966e1 m43214Q = m43214Q(i11);
                if (m43214Q != null && m43214Q.f11705c == 56 && m43214Q.f11708f != null) {
                    for (int i12 = 0; i12 < m43214Q.f11708f.size(); i12++) {
                        arrayList.add((C32187y4) m43214Q.f11708f.get(i12));
                        this.f43960Q.put(arrayList.size() - 1, i11);
                        if (i12 == 0) {
                            this.f43961R.put(i11, arrayList.size() - 1);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: v0 */
    public void mo9990A(FeedBaseAdapter.AbstractC8023b abstractC8023b, int i11) {
        abstractC8023b.mo43244i0(m43214Q(i11), i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: w0 */
    public void mo9991B(FeedBaseAdapter.AbstractC8023b abstractC8023b, int i11, List list) {
        try {
            if (!list.isEmpty()) {
                abstractC8023b.mo43245j0(m43214Q(i11), i11, list);
            } else {
                super.mo9991B(abstractC8023b, i11, list);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: x0 */
    public FeedBaseAdapter.AbstractC8023b mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 5) {
                    if (i11 != 33) {
                        if (i11 != 40) {
                            if (i11 != 45) {
                                if (i11 != 47) {
                                    if (i11 != 49) {
                                        if (i11 != 90) {
                                            if (i11 != 8) {
                                                if (i11 != 9) {
                                                    if (i11 != 42) {
                                                        if (i11 != 43) {
                                                            switch (i11) {
                                                                case 53:
                                                                    return new FeedBaseAdapter.C8043t(C3427f.m17207r(this.f43955L, viewGroup), this.f43956M);
                                                                case 54:
                                                                    return new FeedBaseAdapter.C8029f(new FeedItemComposeFeedModuleView(this.f43956M), this.f43956M);
                                                                case 55:
                                                                    ProfileMediaHeaderView profileMediaHeaderView = new ProfileMediaHeaderView(this.f43956M);
                                                                    profileMediaHeaderView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                                                                    profileMediaHeaderView.setHeaderMode(EnumC2369r.f9912r);
                                                                    return new i(profileMediaHeaderView);
                                                                case 56:
                                                                    return new h(new ProfileMediaModulesView(this.f43956M));
                                                                case 57:
                                                                    return new j(new ProfileMediaItemYearDivider(this.f43956M));
                                                                case 58:
                                                                    return new f(new View(this.f43956M));
                                                                case 59:
                                                                    return new FeedBaseAdapter.C8027d(this.f43955L.inflate(AbstractC7409c0.feed_item_biography, viewGroup, false), this.f43956M);
                                                                case 60:
                                                                    return new FeedBaseAdapter.C8030g(new FeedItemDateDividerModuleView(this.f43956M), this.f43956M);
                                                                case 61:
                                                                    return new FeedBaseAdapter.C8035l(new FeedItemHeaderSubMenuModuleView(this.f43956M), this.f43956M);
                                                                case 62:
                                                                    return new FeedBaseAdapter.C8031h(new FeedItemDateDividerSpacingModuleView(this.f43956M), this.f43956M);
                                                                case 63:
                                                                    return new FeedBaseAdapter.C8037n(new FeedItemHeaderBarModuleView(this.f43956M), this.f43956M);
                                                                case 64:
                                                                    return new FeedBaseAdapter.C8032i(new FeedItemDateDividerSpacingModuleView(this.f43956M), this.f43956M);
                                                                case 65:
                                                                    FeedBaseAdapter.C8038o c8038o = new FeedBaseAdapter.C8038o(this.f43955L.inflate(AbstractC7409c0.feed_item_memory, viewGroup, false), this.f43956M);
                                                                    FeedItemMemory feedItemMemory = c8038o.f43931M;
                                                                    if (feedItemMemory != null) {
                                                                        m43280k0(feedItemMemory);
                                                                    }
                                                                    return c8038o;
                                                                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                                                    return new e(new TrackingFrameLayout(this.f43956M), this.f43956M);
                                                                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                                                    return new c(this.f43955L.inflate(AbstractC7409c0.layout_profile_bio, viewGroup, false), this.f43956M);
                                                                default:
                                                                    switch (i11) {
                                                                        case 69:
                                                                            return new x(new ProfileQuickActionView(this.f43956M), this.f43956M);
                                                                        case 70:
                                                                            return new o(this.f43955L.inflate(AbstractC7409c0.user_details_header_loading, viewGroup, false), this.f43956M);
                                                                        case 71:
                                                                            ChangeableHeightView changeableHeightView = new ChangeableHeightView(this.f43956M);
                                                                            changeableHeightView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                            return new z(changeableHeightView, this.f43956M);
                                                                        case 72:
                                                                            return new m(this.f43955L.inflate(AbstractC7409c0.profile_footer_loading, viewGroup, false), this.f43956M);
                                                                        case 73:
                                                                            return new d(this.f43955L.inflate(AbstractC7409c0.layout_suggest_chat_profile, viewGroup, false), this.f43956M);
                                                                        case 74:
                                                                            return new p(this.f43955L.inflate(AbstractC7409c0.layout_header_cover_avatar, viewGroup, false), this.f43956M);
                                                                        case 75:
                                                                            return new r(this.f43955L.inflate(AbstractC7409c0.layout_header_oa, viewGroup, false), this.f43956M);
                                                                        case 76:
                                                                            return new q(this.f43955L.inflate(AbstractC7409c0.layout_footer_oa, viewGroup, false), this.f43956M);
                                                                        case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                                                                            return new b0(this.f43955L.inflate(AbstractC7409c0.layout_friend_suggest_profile, viewGroup, false), this.f43956M);
                                                                        case 78:
                                                                            return new n(this.f43955L.inflate(AbstractC7409c0.layout_notification_latest_post, viewGroup, false), this.f43956M);
                                                                        case 79:
                                                                            return new w(this.f43955L.inflate(AbstractC7409c0.profile_section_photo_quick_access_layout, viewGroup, false), this.f43956M);
                                                                        case 80:
                                                                            return new a0(new AlbumListingView(this.f43956M), this.f43956M);
                                                                        case 81:
                                                                            return new c0(new FeedItemTitleDivider(this.f43956M), this.f43956M);
                                                                        case 82:
                                                                            return new C8051b(new RelativeLayout(this.f43956M), this.f43956M, this.f43890I);
                                                                        case 83:
                                                                            ProfileSkeletonView profileSkeletonView = new ProfileSkeletonView(this.f43956M);
                                                                            profileSkeletonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                            return new y(profileSkeletonView);
                                                                        case 84:
                                                                            return new k(new EmptyContentView(this.f43956M, EmptyContentView.EnumC8079b.f44205q));
                                                                        case 85:
                                                                            FeedItemAlbumActionModulesView feedItemAlbumActionModulesView = new FeedItemAlbumActionModulesView(this.f43956M);
                                                                            feedItemAlbumActionModulesView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                            return new a(feedItemAlbumActionModulesView, this.f43956M);
                                                                        case 86:
                                                                            return new v(this.f43955L.inflate(AbstractC7409c0.layout_profile_suggest_action, viewGroup, false), this.f43956M);
                                                                        case 87:
                                                                            return new b(new AlbumRowPreviewGridView(this.f43956M), this.f43956M);
                                                                        case 88:
                                                                            return new FeedBaseAdapter.C8041r(this.f43955L.inflate(AbstractC7409c0.feed_item_social_album, viewGroup, false), this.f43956M);
                                                                        default:
                                                                            return new FeedBaseAdapter.C8026c0(this.f43955L.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false), this.f43956M);
                                                                    }
                                                            }
                                                        }
                                                        return new FeedBaseAdapter.C8034k(new FeedItemHeaderBarModuleView(this.f43956M), this.f43956M);
                                                    }
                                                    return new FeedBaseAdapter.C8028e(this.f43955L.inflate(AbstractC7409c0.feed_item_footer_comment, viewGroup, false), this.f43956M);
                                                }
                                                return new FeedBaseAdapter.C8036m(new FeedItemLinkModulesView(this.f43956M), this.f43956M);
                                            }
                                            return new FeedBaseAdapter.C8042s(new FeedItemStickerModulesView(this.f43956M), this.f43956M);
                                        }
                                        FeedItemSectionRemindLimitVisibleFeed feedItemSectionRemindLimitVisibleFeed = new FeedItemSectionRemindLimitVisibleFeed(this.f43956M);
                                        feedItemSectionRemindLimitVisibleFeed.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                        return new l(feedItemSectionRemindLimitVisibleFeed, this.f43956M);
                                    }
                                    return new FeedBaseAdapter.C8046w(this.f43955L.inflate(AbstractC7409c0.feed_item_video, viewGroup, false), this.f43956M);
                                }
                                return new FeedBaseAdapter.C8044u(this.f43955L.inflate(AbstractC7409c0.feed_item_suggest_header, viewGroup, false), this.f43956M);
                            }
                            return new FeedBaseAdapter.C8047x(this.f43955L.inflate(AbstractC7409c0.feed_item_year_divider, viewGroup, false), this.f43956M);
                        }
                        ModulesView modulesView = new ModulesView(this.f43956M);
                        modulesView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        modulesView.setId(AbstractC6918a0.feedItemFooterBarModule);
                        return new FeedBaseAdapter.C8033j(modulesView, this.f43956M);
                    }
                    return new FeedBaseAdapter.C8025c(this.f43955L.inflate(AbstractC7409c0.feed_item_async_fail, viewGroup, false), this.f43956M);
                }
                return new FeedBaseAdapter.C8040q(new FeedItemPhotoMultiModuleView(this.f43956M), this.f43956M);
            }
            return new FeedBaseAdapter.C8039p(new FeedItemPhotoModuleView(this.f43956M), this.f43956M);
        }
        return new FeedBaseAdapter.C8045v(new FeedItemTextModuleView(this.f43956M), this.f43956M);
    }

    /* renamed from: y0 */
    public void m43312y0() {
        if (m43301l0() != null) {
            m43301l0().m104003N();
        }
    }

    /* renamed from: z0 */
    public boolean m43313z0(int i11, KeyEvent keyEvent) {
        if (m43301l0() != null) {
            return m43301l0().m104004O(i11, keyEvent);
        }
        return false;
    }
}
