package com.zing.zalo.feed.mvp.profile;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.C2370r0;
import bo.C3000l0;
import bo.C3054x;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView;
import com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView;
import com.zing.zalo.feed.mvp.profile.ProfilePhotoView;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ProfileBaseView;
import com.zing.zalo.p077ui.zviews.QuickPreviewZView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.animation.AnimationTarget;
import ho0.AbstractC20110a;
import i40.C20275e;
import iq.C20719n1;
import iq.C20774y1;
import iq.InterfaceC20684g1;
import iq.InterfaceC20689h1;
import is.AbstractC20783a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import p354n3.C23528a;
import p363nh.C23744a;
import p645xh.C29630g;
import p716zh.C32002l4;

/* loaded from: classes4.dex */
public class ProfilePhotoView extends SlidableZaloView implements InterfaceC20689h1, C23744a.c, View.OnClickListener, InterfaceC0733x {

    /* renamed from: n1 */
    private static final int f46514n1 = AbstractC23136l9.m118742r(76.0f);

    /* renamed from: P0 */
    protected C23528a f46515P0;

    /* renamed from: R0 */
    private InterfaceC20684g1 f46517R0;

    /* renamed from: S0 */
    SwipeRefreshListView f46518S0;

    /* renamed from: T0 */
    protected RecyclerView f46519T0;

    /* renamed from: U0 */
    LinearLayoutManager f46520U0;

    /* renamed from: V0 */
    protected C8050a f46521V0;

    /* renamed from: X0 */
    View f46523X0;

    /* renamed from: Y0 */
    TextView f46524Y0;

    /* renamed from: Z0 */
    Animation f46525Z0;

    /* renamed from: a1 */
    Animation f46526a1;

    /* renamed from: b1 */
    protected RobotoTextView f46527b1;

    /* renamed from: c1 */
    protected View f46528c1;

    /* renamed from: d1 */
    protected View f46529d1;

    /* renamed from: e1 */
    AbstractC11859g f46530e1;

    /* renamed from: g1 */
    public int f46532g1;

    /* renamed from: h1 */
    C20275e f46533h1;

    /* renamed from: i1 */
    ArrayList f46534i1;

    /* renamed from: j1 */
    boolean f46535j1;

    /* renamed from: k1 */
    String f46536k1;

    /* renamed from: l1 */
    Parcelable f46537l1;

    /* renamed from: Q0 */
    protected Handler f46516Q0 = new Handler(Looper.getMainLooper());

    /* renamed from: W0 */
    private final int f46522W0 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height) + AbstractC17484n.Companion.m92931b();

    /* renamed from: f1 */
    private boolean f46531f1 = true;

    /* renamed from: m1 */
    ProfileBaseView.RunnableC14795j f46538m1 = new ProfileBaseView.RunnableC14795j(new C8658g());

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfilePhotoView$a */
    /* loaded from: classes4.dex */
    class C8652a extends RecyclerView.AbstractC1892s {
        C8652a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            try {
                if (i11 == 0) {
                    ProfilePhotoView.this.f46521V0.m43290I0(false);
                    ProfilePhotoView.this.f46521V0.m43223b0(false);
                    ProfilePhotoView.this.f46521V0.m10008p();
                } else {
                    ProfilePhotoView.this.f46521V0.m43223b0(true);
                    ProfilePhotoView.this.f46518S0.m88202K();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            try {
                int m9740Y1 = ProfilePhotoView.this.f46520U0.m9740Y1();
                int m9745c2 = ProfilePhotoView.this.f46520U0.m9745c2();
                ProfilePhotoView.this.f46520U0.m9737T1();
                ProfilePhotoView.this.f46520U0.m10110a();
                int m10127i = ProfilePhotoView.this.f46520U0.m10127i();
                boolean z11 = false;
                for (int i13 = 0; i13 <= m9745c2 - m9740Y1; i13++) {
                    View m10105V = ProfilePhotoView.this.f46520U0.m10105V(i13);
                    if (m10105V != null && m10105V.getY() < ProfilePhotoView.this.f46527b1.getY()) {
                        ProfilePhotoView.this.m46071CM(m9740Y1 + i13);
                    }
                }
                ProfilePhotoView.this.m46071CM(m9740Y1);
                C8050a c8050a = ProfilePhotoView.this.f46521V0;
                if (Math.abs(i12) >= ProfilePhotoView.f46514n1) {
                    z11 = true;
                }
                c8050a.m43290I0(z11);
                if (m9745c2 >= m10127i - 5) {
                    ProfilePhotoView.this.f46517R0.mo107816j4();
                }
                ProfileBaseView.RunnableC14795j runnableC14795j = ProfilePhotoView.this.f46538m1;
                if (runnableC14795j != null) {
                    runnableC14795j.m83008a();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfilePhotoView$b */
    /* loaded from: classes4.dex */
    class C8653b implements FeedBaseAdapter.AlbumProfileCallback {
        C8653b() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: W0 */
        public void mo43226W0() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: X0 */
        public void mo43227X0() {
            ProfilePhotoView.this.f46517R0.mo107823vh();
        }

        @Override // com.zing.zalo.feed.components.FeedItemTitleDivider.InterfaceC8146a
        /* renamed from: a */
        public void mo44157a() {
            ProfilePhotoView.this.f46517R0.mo107818l0();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: a4 */
        public void mo43228a4(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            ProfilePhotoView.this.f46517R0.mo107811a4(profilePreviewAlbumItem);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: b4 */
        public void mo43229b4() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: c */
        public void mo43425c(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: c4 */
        public void mo43230c4() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: d4 */
        public void mo43231d4() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: e */
        public void mo43232e() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: e2 */
        public void mo43233e2() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: e4 */
        public void mo43234e4(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            ProfilePhotoView.this.f46517R0.mo107813fp(profilePreviewAlbumItem);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: f4 */
        public void mo43235f4(View view, View view2) {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: i */
        public void mo43428i(int i11) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: l0 */
        public void mo43236l0() {
            ProfilePhotoView.this.f46517R0.mo107818l0();
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: n1 */
        public void mo43430n1() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: r2 */
        public void mo43431r2() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: s */
        public void mo43237s(C3054x c3054x) {
            ProfilePhotoView.this.f46517R0.mo107822uf();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: u */
        public void mo43238u() {
            ProfilePhotoView.this.f46517R0.mo107821u();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: v */
        public void mo43239v(boolean z11) {
            ProfilePhotoView.this.f46531f1 = z11;
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: w */
        public void mo43240w(View view) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: x */
        public void mo43241x(boolean z11) {
            ProfilePhotoView.this.f46518S0.setSwipeRefreshEnable(!z11);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: x1 */
        public void mo43433x1() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: y */
        public void mo43242y(C3000l0 c3000l0) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: z */
        public void mo43243z() {
            ProfilePhotoView.this.f46517R0.mo107804E();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfilePhotoView$c */
    /* loaded from: classes4.dex */
    class C8654c implements C8050a.t {
        C8654c() {
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.t
        /* renamed from: a */
        public void mo43360a(int i11, ItemAlbumMobile itemAlbumMobile, ImageView imageView, View view) {
            ProfilePhotoView.this.f46517R0.mo107805E2(itemAlbumMobile);
        }

        @Override // com.zing.zalo.feed.adapters.C8050a.t
        /* renamed from: b */
        public void mo43361b(int i11, ItemAlbumMobile itemAlbumMobile, AnimationTarget animationTarget, View view) {
            if (itemAlbumMobile.f42591p == 2) {
                ProfilePhotoView.this.f46517R0.mo107803Dg(itemAlbumMobile, animationTarget, i11);
            } else {
                ProfilePhotoView.this.f46517R0.mo107815hp(itemAlbumMobile, animationTarget, i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfilePhotoView$d */
    /* loaded from: classes4.dex */
    class ViewOnLayoutChangeListenerC8655d implements View.OnLayoutChangeListener {

        /* renamed from: p */
        int f46542p = 0;

        ViewOnLayoutChangeListenerC8655d() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            try {
                if (this.f46542p != view.getMeasuredWidth()) {
                    this.f46542p = view.getMeasuredWidth();
                    ProfilePhotoView.this.f46521V0.m10008p();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfilePhotoView$e */
    /* loaded from: classes4.dex */
    class C8656e extends C20275e {
        C8656e() {
        }

        @Override // i40.C20275e
        /* renamed from: h */
        public int mo36887h(int i11) {
            ProfilePhotoView.this.f46532g1 = i11;
            return i11;
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfilePhotoView$f */
    /* loaded from: classes4.dex */
    class C8657f extends AbstractC11859g {
        C8657f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
            super(recyclerView, stateListDrawable, drawable, stateListDrawable2, drawable2);
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: d0 */
        protected void mo46064d0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: e0 */
        public void mo46065e0(int i11) {
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: f0 */
        protected void mo46066f0() {
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.ProfilePhotoView$g */
    /* loaded from: classes4.dex */
    class C8658g implements ProfileBaseView.RunnableC14795j.c {
        C8658g() {
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView.RunnableC14795j.c
        /* renamed from: a */
        public boolean mo46114a() {
            if (ProfilePhotoView.this.m92687sJ() && ProfilePhotoView.this.f46517R0.mo107819m3() == 1) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.zviews.ProfileBaseView.RunnableC14795j.c
        /* renamed from: b */
        public void mo46115b() {
            ProfilePhotoView profilePhotoView = ProfilePhotoView.this;
            Handler handler = profilePhotoView.f46516Q0;
            if (handler != null) {
                handler.postDelayed(profilePhotoView.f46538m1, 100L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m46070AM() {
        try {
            SwipeRefreshListView swipeRefreshListView = this.f46518S0;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.m88209V();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public void m46071CM(int i11) {
        String mo36810g = this.f46521V0.mo36810g(i11);
        if (!TextUtils.isEmpty(mo36810g)) {
            m46095BM(mo36810g);
        } else {
            m46111sM();
        }
    }

    /* renamed from: DM */
    private void m46072DM() {
        View view = this.f46523X0;
        if (view != null && this.f46526a1 != null) {
            view.setVisibility(8);
            this.f46523X0.clearAnimation();
            this.f46523X0.startAnimation(this.f46526a1);
        }
    }

    /* renamed from: EM */
    private void m46073EM() {
        View view = this.f46523X0;
        if (view != null && this.f46525Z0 != null) {
            view.setVisibility(0);
            this.f46523X0.clearAnimation();
            this.f46523X0.startAnimation(this.f46525Z0);
        }
    }

    /* renamed from: FM */
    private void m46074FM() {
        if (!m46087tM()) {
            m46073EM();
        }
    }

    /* renamed from: rM */
    private void m46086rM() {
        if (m46087tM()) {
            m46072DM();
        }
    }

    /* renamed from: tM */
    private boolean m46087tM() {
        View view = this.f46523X0;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m46088uM(int i11, Object[] objArr) {
        try {
            if (i11 == 5100) {
                finish();
            } else if (i11 == 6009 && objArr != null) {
                if (objArr.length > 0) {
                    this.f46517R0.mo107809Zb((List) objArr[0], ((Long) objArr[1]).longValue());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m46089vM() {
        try {
            SwipeRefreshListView swipeRefreshListView = this.f46518S0;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setRefreshing(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m46090wM() {
        try {
            SwipeRefreshListView swipeRefreshListView = this.f46518S0;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.m88202K();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m46091xM() {
        this.f46517R0.mo107812e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ boolean m46092yM() {
        AbstractC11859g abstractC11859g = this.f46530e1;
        if (abstractC11859g != null && abstractC11859g.m114868x()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m46093zM(List list) {
        try {
            this.f46521V0.m43297g0(list);
            this.f46521V0.m10008p();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: A4 */
    public void mo46094A4() {
        Bundle bundle = new Bundle();
        bundle.putString("extra_entry_point_flow", this.f46517R0.mo107814g().m154277l());
        m92662fJ().m93066i2(ProfileAlbumCreateView.class, bundle, 0, 1, true);
    }

    /* renamed from: BM */
    public void m46095BM(String str) {
        this.f46528c1.setVisibility(0);
        this.f46527b1.setText(str);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C20719n1 c20719n1 = new C20719n1(this);
        this.f46517R0 = c20719n1;
        c20719n1.mo995Nd(C20774y1.m108414a(m92642L3()), null);
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: Ck */
    public void mo46096Ck(boolean z11) {
        try {
            if (z11) {
                m46074FM();
            } else {
                m46086rM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: Cn */
    public void mo46097Cn(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PARAM_USER_ID", str);
        m92662fJ().m93066i2(ProfileAlbumListingAllView.class, bundle, 1054, 1, true);
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: D3 */
    public void mo46098D3(ItemAlbumMobile itemAlbumMobile) {
        QuickPreviewZView.m83490fM(m92676n2().mo35579p(), null, 0, itemAlbumMobile);
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: Em */
    public void mo46099Em() {
        AbstractC20783a.m108431a(m92689tK());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        this.f46515P0 = new C23528a(this.f72421L0.m92648SI());
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_in);
        this.f46525Z0 = loadAnimation;
        loadAnimation.setDuration(100L);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_out);
        this.f46526a1 = loadAnimation2;
        loadAnimation2.setDuration(100L);
        return layoutInflater.inflate(AbstractC7409c0.profile_photo_view, (ViewGroup) null);
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: I1 */
    public void mo46100I1(boolean z11, boolean z12, int i11, int i12) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SOURCE_ACTION", "4902");
            bundle.putBoolean("EXTRA_ALLOW_RESTORE_LAST_COMPOSE", true);
            if (z12) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(i11);
                bundle.putBoolean("EXTRA_SHOW_EXTERNAL_BG", true);
                bundle.putString("EXTRA_EXTERNAL_TYPO_ID", jSONArray.toString());
            }
            bundle.putString("extra_tracking_source", new TrackingSource(i12).m40686z());
            m92662fJ().m93066i2(UpdateStatusView.class, bundle, ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, true);
            C29630g.m147299E0().m147319V0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        C23744a.m124114c().m124117e(this, 5100);
        C23744a.m124114c().m124117e(this, 6009);
        super.mo40200KJ();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (super.mo37488Li() && this.f46531f1) {
            return true;
        }
        return false;
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: O3 */
    public void mo46101O3(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11, Bundle bundle) {
        try {
            this.f46532g1 = -1;
            this.f46533h1 = new C8656e();
            this.f46521V0.m43308t0();
            this.f46533h1.m105857C(this.f46521V0.m43306r0());
            this.f46533h1.m105858D(this.f46521V0.m43307s0());
            this.f46533h1.m105861G(new C2370r0(this.f46519T0));
            this.f46533h1.m105865K(i11);
            this.f46533h1.m105882u((int) m92651WI().getDimension(AbstractC17454d.action_bar_default_height));
            this.f46517R0.mo107807K0(bundle);
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().mo35551H2(animationTarget, itemAlbumMobile.m40504N(), bundle, this.f46533h1, 1051);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ProfilePhotoView", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        InterfaceC20684g1 interfaceC20684g1 = this.f46517R0;
        if (interfaceC20684g1 != null) {
            interfaceC20684g1.mo107817k();
        }
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: S */
    public void mo46102S() {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: iq.w1
            @Override // java.lang.Runnable
            public final void run() {
                ProfilePhotoView.this.m46070AM();
            }
        });
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: T */
    public void mo46103T() {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: iq.v1
            @Override // java.lang.Runnable
            public final void run() {
                ProfilePhotoView.this.m46090wM();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        this.f46517R0.mo107810a1();
        this.f46517R0.mo107802D();
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: a0 */
    public void mo46104a0() {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: iq.r1
            @Override // java.lang.Runnable
            public final void run() {
                ProfilePhotoView.this.m46089vM();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        Intent intent = new Intent();
        ArrayList arrayList = this.f46534i1;
        if (arrayList != null && arrayList.size() > 0) {
            intent.putExtra("deletedPhoto", this.f46534i1);
        }
        boolean z11 = this.f46535j1;
        if (z11) {
            intent.putExtra("EXTRA_BOOL_FEED_DELETED", z11);
            intent.putExtra("EXTRA_STRING_FEED_ID", this.f46536k1);
            Parcelable parcelable = this.f46537l1;
            if (parcelable != null) {
                intent.putExtra("extra_feed_like_status", parcelable);
            }
        }
        mo50035CK(-1, intent);
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProfilePhotoView";
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: h2 */
    public void mo46105h2() {
        View findViewById = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.root_backgroundmain);
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f46518S0 = swipeRefreshListView;
        if (swipeRefreshListView == null) {
            return;
        }
        swipeRefreshListView.setContainerViewSnackBar(findViewById);
        this.f46518S0.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: iq.s1
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                ProfilePhotoView.this.m46091xM();
            }
        });
        this.f46519T0 = this.f46518S0.f83582p0;
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        this.f46520U0 = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        this.f46519T0.setLayoutManager(this.f46520U0);
        this.f46519T0.setBackgroundResource(AbstractC16803z.rectangle_transparent);
        this.f46519T0.setVisibility(0);
        this.f46519T0.setVerticalScrollBarEnabled(false);
        this.f46519T0.m9826E(new C8652a());
        C8050a c8050a = new C8050a(this.f72421L0.m92648SI(), this.f46515P0);
        this.f46521V0 = c8050a;
        c8050a.m43220Y(new C8653b());
        this.f46521V0.m43292K0(new C8654c());
        this.f46521V0.f43972c0 = new C8050a.g() { // from class: iq.t1
            @Override // com.zing.zalo.feed.adapters.C8050a.g
            /* renamed from: a */
            public final boolean mo43330a() {
                boolean m46092yM;
                m46092yM = ProfilePhotoView.this.m46092yM();
                return m46092yM;
            }
        };
        this.f46521V0.m43297g0(new ArrayList());
        this.f46519T0.setAdapter(this.f46521V0);
        findViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8655d());
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: hk */
    public void mo46106hk() {
        this.f46528c1 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.profile_photo_sticky_header);
        this.f46529d1 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.fake_action_bar_above_header_sticky);
        this.f46527b1 = (RobotoTextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.tv_sticky_date);
        this.f46529d1.getLayoutParams().height = this.f46522W0;
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: i2 */
    public void mo46107i2() {
        C8657f c8657f = new C8657f(this.f46519T0, (StateListDrawable) AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable), AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent), (StateListDrawable) AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable), AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent));
        this.f46530e1 = c8657f;
        c8657f.m114859H(AbstractC23136l9.m118742r(300.0f), AbstractC23136l9.m118742r(60.0f));
        RobotoTextView robotoTextView = (RobotoTextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.bubble_date);
        this.f46530e1.m65929g0(robotoTextView);
        ((RelativeLayout.LayoutParams) robotoTextView.getLayoutParams()).addRule(6, this.f46518S0.getId());
        this.f46530e1.m114844Y(3);
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: ia */
    public void mo46108ia(String str) {
        if (m87077NK() != null) {
            m87077NK().setMiddleTitle(str);
        }
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: ih */
    public void mo46109ih(final List list) {
        this.f46516Q0.post(new Runnable() { // from class: iq.x1
            @Override // java.lang.Runnable
            public final void run() {
                ProfilePhotoView.this.m46093zM(list);
            }
        });
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: ke */
    public void mo46110ke() {
        ((ViewStub) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.stub_user_details_bottom_bar)).inflate();
        this.f46523X0 = this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.user_details_bottom_bar_container);
        TextView textView = (TextView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.imgButtonUpdateStatus);
        this.f46524Y0 = textView;
        textView.setText(AbstractC8020f0.profile_uploadpic);
        this.f46524Y0.setOnClickListener(this);
        this.f46538m1.f76246q = this.f46524Y0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        Bundle bundle = null;
        if (i11 == 1051) {
            if (i12 == -1) {
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                if (bundle != null) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("deletedPhoto");
                    this.f46534i1 = stringArrayList;
                    this.f46517R0.mo107808Z7(stringArrayList);
                    C8050a c8050a = this.f46521V0;
                    if (c8050a != null) {
                        c8050a.m43295N0();
                    }
                }
            }
            if (this.f46521V0 != null) {
                this.f46520U0.mo9756v1(this.f46532g1);
                return;
            }
            return;
        }
        if (i11 == 10014) {
            if (i12 == -1) {
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                if (bundle != null) {
                    this.f46535j1 = bundle.getBoolean("EXTRA_BOOL_FEED_DELETED");
                    this.f46536k1 = bundle.getString("EXTRA_STRING_FEED_ID");
                    if (intent.hasExtra("extra_feed_like_status")) {
                        this.f46537l1 = intent.getParcelableExtra("extra_feed_like_status");
                    }
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) bundle.getParcelable("EXTRA_RESULT_ITEM_ALBUM_MOBILE");
                    if (this.f46535j1 && itemAlbumMobile != null) {
                        this.f46517R0.mo107806E3(itemAlbumMobile.f42595r);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 1002) {
            if (i12 == -1) {
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                if (bundle != null && bundle.getBoolean("EXTRA_BOL_UPDATE_STATUS_FINISHED", false)) {
                    finish();
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 1053) {
            if (i12 == -1) {
                if (intent != null) {
                    bundle = intent.getExtras();
                }
                if (bundle != null && bundle.getBoolean("extra_bool_finished_compose_feed", false)) {
                    finish();
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 1054 && i12 == -1) {
            if (intent != null) {
                bundle = intent.getExtras();
            }
            if (bundle != null && bundle.getBoolean("extra_bool_finished_compose_feed", false)) {
                finish();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.imgButtonUpdateStatus) {
            this.f46517R0.mo107820s1();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            finish();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
    }

    /* renamed from: sM */
    public void m46111sM() {
        this.f46528c1.setVisibility(8);
        this.f46527b1.setText("");
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(final int i11, final Object... objArr) {
        this.f46516Q0.post(new Runnable() { // from class: iq.u1
            @Override // java.lang.Runnable
            public final void run() {
                ProfilePhotoView.this.m46088uM(i11, objArr);
            }
        });
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: y */
    public String mo46112y() {
        return this.f72829D0;
    }

    @Override // iq.InterfaceC20689h1
    /* renamed from: yG */
    public void mo46113yG(String str, ProfilePreviewAlbumItem profilePreviewAlbumItem, C32002l4 c32002l4) {
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_user_id", str);
                bundle.putInt("extra_album_type", profilePreviewAlbumItem.getType());
                bundle.putLong("extra_album_id", profilePreviewAlbumItem.getId());
                bundle.putString("extra_desc_total", profilePreviewAlbumItem.getDesc());
                bundle.putInt("extra_preload_bg_color", profilePreviewAlbumItem.getThemeInfo().getDecorItem().getBgColor());
                bundle.putInt("extra_preload_text_color", profilePreviewAlbumItem.getThemeInfo().getContent().getTitleColor());
                bundle.putInt("extra_preload_text_color_01", profilePreviewAlbumItem.getThemeInfo().getContent().getTextColor01());
                bundle.putInt("extra_preload_text_color_02", profilePreviewAlbumItem.getThemeInfo().getContent().getTextColor02());
                bundle.putInt("extra_preload_arrow_color", profilePreviewAlbumItem.getThemeInfo().getContent().getArrowColor());
                if (c32002l4 != null) {
                    bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                m92662fJ.m93066i2(ProfileAlbumDetailView.class, bundle, 1053, 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 5100);
        C23744a.m124114c().m124115b(this, 6009);
    }
}
