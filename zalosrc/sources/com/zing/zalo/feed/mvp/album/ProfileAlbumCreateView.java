package com.zing.zalo.feed.mvp.album;

import ac.C0697c0;
import ac.C0732w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import au.C2370r0;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bo.C2989j;
import bo.C2999l;
import bo.C3004m;
import bo.C3054x;
import co.C3615h;
import co.InterfaceC3612f;
import co.InterfaceC3614g;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.AlbumRowInputDescView;
import com.zing.zalo.feed.components.AlbumRowPreviewGridView;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import com.zing.zalo.p077ui.zviews.PostPhotoEditorView;
import com.zing.zalo.p077ui.zviews.PrivacyPickGroupView;
import com.zing.zalo.p077ui.zviews.ProfilePickerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import i40.C20275e;
import java.util.ArrayList;
import java.util.List;
import m90.EnumC22962a;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p133ek.C18460c;
import p227i3.C20215s;
import p322lf.AbstractC22470k;
import p458qr.C25470c;
import p458qr.C25471d;
import p489rn.C25845a;
import p559uv.C27373c;
import p649xl.C30034s9;
import p716zh.C31890dc;
import p716zh.C32002l4;
import pm0.C24848g0;
import pm0.InterfaceC24847g;

/* loaded from: classes4.dex */
public final class ProfileAlbumCreateView extends SlidableZaloView implements InterfaceC3614g, InterfaceC17463d.d {
    public static final C8487a Companion = new C8487a(null);

    /* renamed from: P0 */
    private InterfaceC3612f f46033P0;

    /* renamed from: Q0 */
    private C25845a f46034Q0;

    /* renamed from: R0 */
    private C30034s9 f46035R0;

    /* renamed from: S0 */
    private boolean f46036S0;

    /* renamed from: T0 */
    private MenuListPopupView f46037T0;

    /* renamed from: U0 */
    private QuickPickerView f46038U0;

    /* renamed from: V0 */
    private C20275e f46039V0;

    /* renamed from: W0 */
    private SparseIntArray f46040W0 = new SparseIntArray();

    /* renamed from: X0 */
    private SparseIntArray f46041X0 = new SparseIntArray();

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$a */
    /* loaded from: classes4.dex */
    public static final class C8487a {
        private C8487a() {
        }

        public /* synthetic */ C8487a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$b */
    /* loaded from: classes4.dex */
    public static final class C8488b implements QuickPickerView.InterfaceC12659u {
        C8488b() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: O */
        public void mo45270O(MediaItem mediaItem) {
            AbstractC19074t.m100208f(mediaItem, "photo");
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18226O(mediaItem);
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: m */
        public void mo45271m(List list) {
            AbstractC19074t.m100208f(list, "selectedItems");
            if (!list.isEmpty()) {
                InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
                if (interfaceC3612f == null) {
                    AbstractC19074t.m100223u("mPresenter");
                    interfaceC3612f = null;
                }
                interfaceC3612f.mo18222Fm(list);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: n */
        public void mo45272n(boolean z11, boolean z12) {
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$c */
    /* loaded from: classes4.dex */
    public static final class C8489c implements QuickPickerView.InterfaceC12657s {
        C8489c() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: Z */
        public void mo45273Z(C27373c c27373c, String str) {
            AbstractC19074t.m100208f(c27373c, "video");
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18234Z(c27373c, str);
            ProfileAlbumCreateView.this.mo18257Tr();
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: a */
        public void mo45274a() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: b */
        public boolean mo45275b() {
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18242m5();
            return true;
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: c */
        public void mo45276c(int i11) {
            if (i11 == 0) {
                ProfileAlbumCreateView.this.mo18257Tr();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: d */
        public void mo45277d() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: e */
        public void mo45278e(List list, boolean z11) {
            AbstractC19074t.m100208f(list, "selectedItems");
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18229Rd(list);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$d */
    /* loaded from: classes4.dex */
    public static final class C8490d implements QuickPickerView.InterfaceC12663y {
        C8490d() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: K */
        public void mo45279K(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
            AbstractC19074t.m100208f(c18460c, "item");
            AbstractC19074t.m100208f(str, "appId");
            AbstractC19074t.m100208f(str2, "selectedId");
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: b */
        public void mo45280b() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: e */
        public void mo45281e() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: g */
        public void mo45282g() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: h */
        public void mo45283h() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: i */
        public void mo45284i(C31890dc c31890dc) {
            AbstractC19074t.m100208f(c31890dc, "item");
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: j */
        public void mo45285j() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: k */
        public void mo45286k(Bundle bundle) {
            AbstractC19074t.m100208f(bundle, "savedInstanceState");
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: l */
        public void mo45287l() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: m */
        public void mo45288m() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: n */
        public void mo45289n() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12663y
        /* renamed from: o */
        public void mo45290o() {
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$e */
    /* loaded from: classes4.dex */
    public static final class C8491e implements C25845a.a {
        C8491e() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowInputDescView.InterfaceC8062a
        /* renamed from: V3 */
        public void mo43421V3(String str) {
            AbstractC19074t.m100208f(str, C20215s.f99966b);
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18232V3(str);
        }

        @Override // com.zing.zalo.feed.components.ProfileAlbumItemCreateSquareView.InterfaceC8214a
        /* renamed from: X0 */
        public void mo43422X0() {
            C25845a.a.C32968a.m133303e(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewThemeView.InterfaceC8069a
        /* renamed from: a */
        public void mo43423a(C2999l c2999l) {
            C25845a.a.C32968a.m133300b(this, c2999l);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewAlbumView.InterfaceC8066a
        /* renamed from: b */
        public void mo43424b(C2989j c2989j) {
            C25845a.a.C32968a.m133299a(this, c2989j);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: c */
        public void mo43425c(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18237di(animationTarget, itemAlbumMobile, i11);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowSelectInfoView.InterfaceC8070a
        /* renamed from: d */
        public void mo43426d(C3004m c3004m) {
            AbstractC19074t.m100208f(c3004m, "albumRowSelectInfo");
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18227O6(c3004m);
        }

        @Override // com.zing.zalo.feed.components.AlbumItemSquareView.InterfaceC8052a
        /* renamed from: f */
        public void mo43406f(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            C25845a.a.C32968a.m133311m(this, profilePreviewAlbumItem);
        }

        @Override // com.zing.zalo.feed.components.AlbumItemSquareView.InterfaceC8052a
        /* renamed from: g */
        public void mo43407g(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            C25845a.a.C32968a.m133306h(this, profilePreviewAlbumItem);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowCreateAlbumView.InterfaceC8061a
        /* renamed from: h */
        public void mo43427h() {
            C25845a.a.C32968a.m133302d(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: i */
        public void mo43428i(int i11) {
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18239ge(i11);
        }

        @Override // com.zing.zalo.feed.components.ProfileAlbumItemSeeMoreView.InterfaceC8215a
        /* renamed from: l0 */
        public void mo43429l0() {
            C25845a.a.C32968a.m133305g(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: n1 */
        public void mo43430n1() {
            C0732w.m1177r(C0732w.Companion.m1189a(), "click_open_gallery_add_more", null, null, null, 14, null);
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18243n1();
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: r2 */
        public void mo43431r2() {
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18245r2();
        }

        @Override // com.zing.zalo.feed.components.EmptyContentView.InterfaceC8078a
        /* renamed from: s */
        public void mo43432s(C3054x c3054x) {
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
            C0732w.m1177r(C0732w.Companion.m1189a(), "click_open_gallery_button_empty", null, null, null, 14, null);
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18243n1();
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: x1 */
        public void mo43433x1() {
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18247x1();
        }

        @Override // com.zing.zalo.feed.components.AlbumRowInputTitleView.InterfaceC8064a
        /* renamed from: z2 */
        public void mo43434z2(String str) {
            AbstractC19074t.m100208f(str, C20215s.f99966b);
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18249z2(str);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$f */
    /* loaded from: classes4.dex */
    public static final class C8492f extends C20275e {
        C8492f() {
        }

        @Override // i40.C20275e
        /* renamed from: h */
        public int mo36887h(int i11) {
            return i11;
        }

        @Override // i40.C20275e
        /* renamed from: s */
        public boolean mo36888s() {
            return true;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$g */
    /* loaded from: classes4.dex */
    public static final class C8493g extends AbstractC19075u implements InterfaceC18505l {
        C8493g() {
            super(1);
        }

        /* renamed from: a */
        public final void m45291a(List list) {
            AbstractC19074t.m100208f(list, "list");
            ProfileAlbumCreateView.this.m45263uM(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45291a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$h */
    /* loaded from: classes4.dex */
    public static final class C8494h extends AbstractC19075u implements InterfaceC18505l {
        C8494h() {
            super(1);
        }

        /* renamed from: a */
        public final void m45292a(String str) {
            AbstractC19074t.m100208f(str, "title");
            ProfileAlbumCreateView.this.m45259qM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45292a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$i */
    /* loaded from: classes4.dex */
    public static final class C8495i extends AbstractC19075u implements InterfaceC18505l {
        C8495i() {
            super(1);
        }

        /* renamed from: a */
        public final void m45293a(boolean z11) {
            ProfileAlbumCreateView.this.m45248FM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45293a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$j */
    /* loaded from: classes4.dex */
    public static final class C8496j extends ZdsActionBar.AbstractC16987c {
        C8496j() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18228Qo();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$k */
    /* loaded from: classes4.dex */
    public static final class C8497k implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46049p;

        C8497k(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46049p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46049p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f46049p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView$l */
    /* loaded from: classes4.dex */
    public static final class C8498l extends C7145n.g {
        C8498l() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            try {
                InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
                if (interfaceC3612f == null) {
                    AbstractC19074t.m100223u("mPresenter");
                    interfaceC3612f = null;
                }
                interfaceC3612f.mo18223G0(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: c */
        public void mo36359c(int i11) {
            try {
                InterfaceC3612f interfaceC3612f = ProfileAlbumCreateView.this.f46033P0;
                if (interfaceC3612f == null) {
                    AbstractC19074t.m100223u("mPresenter");
                    interfaceC3612f = null;
                }
                interfaceC3612f.mo18244p2(i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: BM */
    public static final void m45244BM(ProfileAlbumCreateView profileAlbumCreateView, int i11, int i12, Intent intent) {
        AbstractC19074t.m100208f(profileAlbumCreateView, "this$0");
        QuickPickerView quickPickerView = profileAlbumCreateView.f46038U0;
        if (quickPickerView != null) {
            quickPickerView.onActivityResult(i11, i12, intent);
        }
    }

    /* renamed from: CM */
    public static final void m45245CM(ProfileAlbumCreateView profileAlbumCreateView, View view) {
        AbstractC19074t.m100208f(profileAlbumCreateView, "this$0");
        InterfaceC3612f interfaceC3612f = profileAlbumCreateView.f46033P0;
        if (interfaceC3612f == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC3612f = null;
        }
        interfaceC3612f.mo18230Re();
    }

    /* renamed from: DM */
    public static final void m45246DM(ProfileAlbumCreateView profileAlbumCreateView, int i11) {
        QuickPickerView quickPickerView;
        AbstractC19074t.m100208f(profileAlbumCreateView, "this$0");
        QuickPickerView quickPickerView2 = profileAlbumCreateView.f46038U0;
        if (quickPickerView2 != null) {
            quickPickerView2.m71234SN(true);
        }
        if (i11 != 1) {
            if (i11 == 2 && (quickPickerView = profileAlbumCreateView.f46038U0) != null) {
                quickPickerView.m71284sO(true, new SensitiveData("gallery_album_feed", "social_timeline", null, 4, null));
            }
        } else {
            QuickPickerView quickPickerView3 = profileAlbumCreateView.f46038U0;
            if (quickPickerView3 != null) {
                quickPickerView3.m71281pO(true, new SensitiveData("gallery_album_feed", "social_timeline", null, 4, null));
            }
        }
        profileAlbumCreateView.m45261sM();
    }

    /* renamed from: EM */
    public static final void m45247EM(ProfileAlbumCreateView profileAlbumCreateView, TrackingSource trackingSource, ProfilePreviewAlbumItem profilePreviewAlbumItem, PrivacyInfo privacyInfo, ArrayList arrayList, C27373c c27373c, int i11) {
        AbstractC19074t.m100208f(profileAlbumCreateView, "this$0");
        AbstractC19074t.m100208f(trackingSource, "$trackingSource");
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "$albumItem");
        AbstractC19074t.m100208f(privacyInfo, "$privacyInfo");
        AbstractC19074t.m100208f(arrayList, "$mediaList");
        profileAlbumCreateView.finish();
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        bundle.putString("extra_tracking_source", trackingSource.m40686z());
        bundle.putParcelable("EXTRA_CREATE_ALBUM_ITEM", profilePreviewAlbumItem);
        bundle.putParcelable("EXTRA_PRIVACY_UPDATE", privacyInfo);
        if (!arrayList.isEmpty()) {
            bundle.putBoolean("multiUpload", true);
            bundle.putParcelableArrayList("extra_initial_photos", arrayList);
        } else if (c27373c != null) {
            bundle.putSerializable("extra_video_info", c27373c);
        }
        bundle.putSerializable("media_type", Integer.valueOf(i11));
        C17487o0 m92662fJ = profileAlbumCreateView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(UpdateStatusView.class, bundle, 1, true);
        }
    }

    /* renamed from: FM */
    public final void m45248FM(boolean z11) {
        int m119606n;
        if (z11) {
            m119606n = AbstractC23136l9.m118639A(AbstractC2808b.f150821b60);
        } else {
            m119606n = C23212s8.m119606n(AbstractC2807a.button_disabled_text);
        }
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setEnableTrailingButton(z11);
            Button trailingButton = m87077NK.getTrailingButton();
            if (trailingButton != null) {
                trailingButton.setTextColor(m119606n);
            }
        }
    }

    /* renamed from: qM */
    public final void m45259qM(String str) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setMiddleTitle(str);
        }
    }

    /* renamed from: rM */
    private final void m45260rM() {
        QuickPickerView quickPickerView = this.f46038U0;
        if (quickPickerView != null) {
            quickPickerView.m71252YN(new C8488b());
        }
        QuickPickerView quickPickerView2 = this.f46038U0;
        if (quickPickerView2 != null) {
            quickPickerView2.m71247WN(new C8489c());
        }
        QuickPickerView quickPickerView3 = this.f46038U0;
        if (quickPickerView3 != null) {
            quickPickerView3.m71261bO(new C8490d());
        }
    }

    /* renamed from: sM */
    private final void m45261sM() {
        if (!this.f46036S0) {
            this.f72827B0.postDelayed(new Runnable() { // from class: co.l
                public /* synthetic */ RunnableC3619l() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAlbumCreateView.m45262tM(ProfileAlbumCreateView.this);
                }
            }, 100L);
            this.f46036S0 = true;
        }
    }

    /* renamed from: tM */
    public static final void m45262tM(ProfileAlbumCreateView profileAlbumCreateView) {
        AbstractC19074t.m100208f(profileAlbumCreateView, "this$0");
        InterfaceC3612f interfaceC3612f = profileAlbumCreateView.f46033P0;
        if (interfaceC3612f == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC3612f = null;
        }
        interfaceC3612f.mo18220C5();
    }

    /* renamed from: uM */
    public final void m45263uM(List list) {
        C25845a c25845a = this.f46034Q0;
        C25845a c25845a2 = null;
        if (c25845a == null) {
            AbstractC19074t.m100223u("adapter");
            c25845a = null;
        }
        c25845a.m133297O(list);
        C25845a c25845a3 = this.f46034Q0;
        if (c25845a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c25845a2 = c25845a3;
        }
        c25845a2.m10008p();
    }

    /* renamed from: wM */
    private final void m45264wM(Bundle bundle) {
        if (bundle != null) {
            this.f46038U0 = (QuickPickerView) m92649TI().m92993D0(QuickPickerView.class);
            m45260rM();
            return;
        }
        this.f46038U0 = new QuickPickerView();
        m45260rM();
        QuickPickerView quickPickerView = this.f46038U0;
        if (quickPickerView != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("extra_media_picker_source", EnumC22962a.f111693q);
            bundle2.putBoolean("extra_should_init_media_picker", true);
            bundle2.putInt("extra_preload_grid_mode", -1);
            bundle2.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_album_feed", "social_timeline", null, 4, null));
            quickPickerView.mo60305zK(bundle2);
        }
        this.f72421L0.m92649TI().m93058d2(AbstractC6918a0.quick_picker_container, this.f46038U0, 0, "mQuickPickerFragment", 0, false);
        m45261sM();
    }

    /* renamed from: yM */
    public static final boolean m45265yM(C30034s9 c30034s9, ProfileAlbumCreateView profileAlbumCreateView, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(c30034s9, "$this_apply");
        AbstractC19074t.m100208f(profileAlbumCreateView, "this$0");
        int childCount = c30034s9.f139322s.f83582p0.getChildCount();
        if (childCount >= 0) {
            int i11 = 0;
            while (true) {
                View childAt = c30034s9.f139322s.f83582p0.getChildAt(i11);
                if (childAt != null && (childAt instanceof AlbumRowInputDescView)) {
                    childAt.getLocationInWindow(new int[2]);
                    if (r3[1] + ((AlbumRowInputDescView) childAt).getHeight() < motionEvent.getY()) {
                        C30034s9 c30034s92 = profileAlbumCreateView.f46035R0;
                        if (c30034s92 == null) {
                            AbstractC19074t.m100223u("binding");
                            c30034s92 = null;
                        }
                        AbstractC2379w.m12430d(c30034s92.getRoot());
                    }
                }
                if (i11 == childCount) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    /* renamed from: AM */
    public final boolean m45266AM() {
        QuickPickerView quickPickerView = this.f46038U0;
        if (quickPickerView != null) {
            return quickPickerView.m71255ZM();
        }
        return false;
    }

    @Override // co.InterfaceC3614g
    /* renamed from: C9 */
    public void mo18250C9(ProfilePreviewAlbumItem profilePreviewAlbumItem, PrivacyInfo privacyInfo, int i11, ArrayList arrayList, C27373c c27373c, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "albumItem");
        AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
        AbstractC19074t.m100208f(arrayList, "mediaList");
        AbstractC19074t.m100208f(trackingSource, "trackingSource");
        try {
            QuickPickerView quickPickerView = this.f46038U0;
            if (quickPickerView != null) {
                quickPickerView.finish();
            }
            this.f72827B0.postDelayed(new Runnable() { // from class: co.p

                /* renamed from: q */
                public final /* synthetic */ TrackingSource f15274q;

                /* renamed from: r */
                public final /* synthetic */ ProfilePreviewAlbumItem f15275r;

                /* renamed from: s */
                public final /* synthetic */ PrivacyInfo f15276s;

                /* renamed from: t */
                public final /* synthetic */ ArrayList f15277t;

                /* renamed from: u */
                public final /* synthetic */ C27373c f15278u;

                /* renamed from: v */
                public final /* synthetic */ int f15279v;

                public /* synthetic */ RunnableC3623p(TrackingSource trackingSource2, ProfilePreviewAlbumItem profilePreviewAlbumItem2, PrivacyInfo privacyInfo2, ArrayList arrayList2, C27373c c27373c2, int i112) {
                    r2 = trackingSource2;
                    r3 = profilePreviewAlbumItem2;
                    r4 = privacyInfo2;
                    r5 = arrayList2;
                    r6 = c27373c2;
                    r7 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAlbumCreateView.m45247EM(ProfileAlbumCreateView.this, r2, r3, r4, r5, r6, r7);
                }
            }, 100L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C3615h c3615h = new C3615h(this);
        this.f46033P0 = c3615h;
        c3615h.mo995Nd(C8534d.Companion.m45457a(m92642L3()), null);
    }

    @Override // co.InterfaceC3614g
    /* renamed from: Cr */
    public void mo18251Cr(ProfileAlbumItem profileAlbumItem, ArrayList arrayList, C27373c c27373c, boolean z11, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(profileAlbumItem, "albumItem");
        AbstractC19074t.m100208f(arrayList, "itemAlbumMobileList");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_PARAM_PROFILE_ALBUM", profileAlbumItem);
            bundle.putBoolean("EXTRA_PARAM_RANDOM_PICK_THEME", z11);
            bundle.putParcelableArrayList("EXTRA_PARAM_MEDIA_ITEM_PICKED", arrayList);
            bundle.putSerializable("EXTRA_PARAM_VIDEO_INFO", c27373c);
            bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(ProfileAlbumPreviewThemeView.class, bundle, 1021, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // co.InterfaceC3614g
    /* renamed from: D2 */
    public void mo18252D2(List list) {
        AbstractC19074t.m100208f(list, "excludedProfileList");
        try {
            Bundle m83055pM = ProfilePickerView.m83055pM(new ArrayList(list), 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_except_friends));
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            m83055pM.putBoolean("extra_type_exclude_friends", true);
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(ProfilePickerView.class, m83055pM, 1020, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_warning_cancel_create_album_v2)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stay), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_leave), this);
            return aVar.m43152a();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m92637BK(true);
        C30034s9 m148492c = C30034s9.m148492c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148492c, "inflate(...)");
        this.f46035R0 = m148492c;
        m45268xM();
        C30034s9 c30034s9 = this.f46035R0;
        if (c30034s9 == null) {
            AbstractC19074t.m100223u("binding");
            c30034s9 = null;
        }
        RelativeLayout root = c30034s9.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        Integer valueOf;
        InterfaceC3612f interfaceC3612f = null;
        if (interfaceC17463d != null) {
            try {
                valueOf = Integer.valueOf(interfaceC17463d.mo92862f());
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            valueOf = null;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            if (i11 == -1) {
                InterfaceC3612f interfaceC3612f2 = this.f46033P0;
                if (interfaceC3612f2 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                } else {
                    interfaceC3612f = interfaceC3612f2;
                }
                interfaceC3612f.mo18225Kb();
            }
            interfaceC17463d.dismiss();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    @Override // co.InterfaceC3614g
    /* renamed from: N9 */
    public void mo18253N9(int i11, Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        mo50035CK(-1, intent);
        finish();
    }

    @Override // co.InterfaceC3614g
    /* renamed from: Nf */
    public void mo18254Nf(List list) {
        AbstractC19074t.m100208f(list, "externalSelectedItems");
        QuickPickerView quickPickerView = this.f46038U0;
        if (quickPickerView != null) {
            quickPickerView.m71222Nf(list);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: co.k
                public /* synthetic */ ViewOnClickListenerC3618k() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileAlbumCreateView.m45245CM(ProfileAlbumCreateView.this, view);
                }
            });
            m87077NK.setLeadingFunctionCallback(new C8496j());
        }
        InterfaceC3612f interfaceC3612f = this.f46033P0;
        if (interfaceC3612f == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC3612f = null;
        }
        interfaceC3612f.mo18240k();
    }

    @Override // co.InterfaceC3614g
    /* renamed from: PD */
    public void mo18255PD(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "mediaList");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("EXTRA_SELECTED_PHOTOS", arrayList);
        bundle.putBoolean("extra_enable_inline_banner", true);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(PostPhotoEditorView.class, bundle, 1022, 1, true);
        }
    }

    @Override // co.InterfaceC3614g
    /* renamed from: RG */
    public void mo18256RG(ArrayList arrayList, AnimationTarget animationTarget, int i11) {
        AbstractC19074t.m100208f(arrayList, "mediaItems");
        this.f46040W0.clear();
        this.f46041X0.clear();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f46040W0.put(i12, 0);
        }
        this.f46041X0.put(0, 0);
        C20275e c20275e = this.f46039V0;
        if (c20275e != null) {
            c20275e.m105861G(new C2370r0(m45267vM()));
        }
        C20275e c20275e2 = this.f46039V0;
        if (c20275e2 != null) {
            c20275e2.m105857C(this.f46040W0);
        }
        C20275e c20275e3 = this.f46039V0;
        if (c20275e3 != null) {
            c20275e3.m105858D(this.f46041X0);
        }
        C20275e c20275e4 = this.f46039V0;
        if (c20275e4 != null) {
            c20275e4.m105855A(true);
        }
        C20275e c20275e5 = this.f46039V0;
        if (c20275e5 != null) {
            c20275e5.m105865K(i11);
        }
        Object obj = arrayList.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        MediaItem mediaItem = (MediaItem) obj;
        QuickPickerView quickPickerView = this.f46038U0;
        if (quickPickerView != null) {
            quickPickerView.m71206DN(arrayList, mediaItem, animationTarget, this.f46039V0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        try {
            InterfaceC3612f interfaceC3612f = this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            bundle.putInt("extra_data_retain_key", C25471d.m131951c().m131953a(interfaceC3612f.mo18236c()));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // co.InterfaceC3614g
    /* renamed from: Tr */
    public void mo18257Tr() {
        QuickPickerView quickPickerView = this.f46038U0;
        if (quickPickerView != null) {
            quickPickerView.m71234SN(false);
        }
        QuickPickerView quickPickerView2 = this.f46038U0;
        if (quickPickerView2 != null) {
            quickPickerView2.m71289vO();
        }
    }

    @Override // co.InterfaceC3614g
    /* renamed from: U0 */
    public void mo18258U0(PrivacyInfo privacyInfo) {
        AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
        MenuListPopupView m87747qL = MenuListPopupView.m87747qL(m92689tK(), false, privacyInfo, new C8498l(), privacyInfo.f45974q.size());
        this.f46037T0 = m87747qL;
        if (m87747qL != null) {
            m87747qL.m92602UK(this.f72421L0.m92649TI(), "MenuListPopupView");
        }
    }

    @Override // co.InterfaceC3614g
    /* renamed from: U2 */
    public void mo18259U2() {
        try {
            MenuListPopupView menuListPopupView = this.f46037T0;
            if (menuListPopupView != null) {
                if (menuListPopupView != null) {
                    menuListPopupView.dismiss();
                }
            } else {
                ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("MenuListPopupView");
                if (m92996E0 != null) {
                    m92996E0.finish();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C30034s9 c30034s9 = this.f46035R0;
        if (c30034s9 == null) {
            AbstractC19074t.m100223u("binding");
            c30034s9 = null;
        }
        AbstractC2379w.m12430d(c30034s9.getRoot());
    }

    @Override // co.InterfaceC3614g
    /* renamed from: f4 */
    public void mo18260f4() {
        try {
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(PrivacyPickGroupView.class, null, 1018, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // co.InterfaceC3614g
    /* renamed from: fF */
    public void mo18261fF(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "photo");
        QuickPickerView quickPickerView = this.f46038U0;
        if (quickPickerView != null) {
            quickPickerView.m71209FN(mediaItem);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        super.finish();
        C30034s9 c30034s9 = this.f46035R0;
        if (c30034s9 == null) {
            AbstractC19074t.m100223u("binding");
            c30034s9 = null;
        }
        AbstractC2379w.m12430d(c30034s9.getRoot());
    }

    @Override // co.InterfaceC3614g
    /* renamed from: ft */
    public void mo18262ft(int i11, int i12, int i13, int i14) {
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1054h(getTrackingKey(), "privacy_setting", Integer.valueOf(i11));
        bVar.m1054h(getTrackingKey(), "decorated_topic", Integer.valueOf(i14));
        bVar.m1054h(getTrackingKey(), "added_photos", Integer.valueOf(i12));
        bVar.m1054h(getTrackingKey(), "added_videos", Integer.valueOf(i13));
    }

    @Override // co.InterfaceC3614g
    /* renamed from: g */
    public void mo18263g() {
        finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProfileAlbumCreateView";
    }

    @Override // co.InterfaceC3614g
    /* renamed from: gt */
    public void mo18264gt(int i11) {
        QuickPickerView quickPickerView = this.f46038U0;
        if (quickPickerView != null) {
            quickPickerView.m71269gt(i11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        InterfaceC3612f interfaceC3612f = null;
        if (i11 != 1017) {
            if (i11 != 1018) {
                if (i11 != 2001 && i11 != 11111 && i11 != 11112) {
                    switch (i11) {
                        case 1020:
                            InterfaceC3612f interfaceC3612f2 = this.f46033P0;
                            if (interfaceC3612f2 == null) {
                                AbstractC19074t.m100223u("mPresenter");
                            } else {
                                interfaceC3612f = interfaceC3612f2;
                            }
                            interfaceC3612f.mo18233Y1(i12, intent);
                            return;
                        case 1021:
                            InterfaceC3612f interfaceC3612f3 = this.f46033P0;
                            if (interfaceC3612f3 == null) {
                                AbstractC19074t.m100223u("mPresenter");
                            } else {
                                interfaceC3612f = interfaceC3612f3;
                            }
                            interfaceC3612f.mo18224Ia(i12, intent);
                            return;
                        case 1022:
                            InterfaceC3612f interfaceC3612f4 = this.f46033P0;
                            if (interfaceC3612f4 == null) {
                                AbstractC19074t.m100223u("mPresenter");
                            } else {
                                interfaceC3612f = interfaceC3612f4;
                            }
                            interfaceC3612f.mo18248y8(i12, intent);
                            return;
                        default:
                            return;
                    }
                }
                AbstractC19444a.m101694b(new Runnable() { // from class: co.m

                    /* renamed from: q */
                    public final /* synthetic */ int f15266q;

                    /* renamed from: r */
                    public final /* synthetic */ int f15267r;

                    /* renamed from: s */
                    public final /* synthetic */ Intent f15268s;

                    public /* synthetic */ RunnableC3620m(int i112, int i122, Intent intent2) {
                        r2 = i112;
                        r3 = i122;
                        r4 = intent2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfileAlbumCreateView.m45244BM(ProfileAlbumCreateView.this, r2, r3, r4);
                    }
                }, 200L);
                return;
            }
            InterfaceC3612f interfaceC3612f5 = this.f46033P0;
            if (interfaceC3612f5 == null) {
                AbstractC19074t.m100223u("mPresenter");
            } else {
                interfaceC3612f = interfaceC3612f5;
            }
            interfaceC3612f.mo18246w3(i122, intent2);
            return;
        }
        InterfaceC3612f interfaceC3612f6 = this.f46033P0;
        if (interfaceC3612f6 == null) {
            AbstractC19074t.m100223u("mPresenter");
        } else {
            interfaceC3612f = interfaceC3612f6;
        }
        interfaceC3612f.mo18246w3(i122, intent2);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (m45266AM()) {
                QuickPickerView quickPickerView = this.f46038U0;
                if (quickPickerView != null) {
                    return quickPickerView.onKeyUp(i11, keyEvent);
                }
                return false;
            }
            if (m45269zM()) {
                mo18257Tr();
            } else {
                InterfaceC3612f interfaceC3612f = this.f46033P0;
                if (interfaceC3612f == null) {
                    AbstractC19074t.m100223u("mPresenter");
                    interfaceC3612f = null;
                }
                interfaceC3612f.mo18228Qo();
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // co.InterfaceC3614g
    /* renamed from: u0 */
    public void mo18265u0(List list) {
        AbstractC19074t.m100208f(list, "listPrivacyFriend");
        try {
            Bundle m83055pM = ProfilePickerView.m83055pM(new ArrayList(list), 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_select_title));
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            C17487o0 m92662fJ = this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(ProfilePickerView.class, m83055pM, 1017, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    public final View m45267vM() {
        C30034s9 c30034s9 = this.f46035R0;
        if (c30034s9 == null) {
            AbstractC19074t.m100223u("binding");
            c30034s9 = null;
        }
        RecyclerView recyclerView = c30034s9.f139322s.f83582p0;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                AbstractC19074t.m100207e(childAt, "getChildAt(...)");
                if (childAt instanceof AlbumRowPreviewGridView) {
                    return ((AlbumRowPreviewGridView) childAt).getPreviewGrid();
                }
            }
        }
        return null;
    }

    @Override // co.InterfaceC3614g
    /* renamed from: vo */
    public void mo18266vo(List list, List list2) {
        AbstractC19074t.m100208f(list, "selectedList");
        AbstractC19074t.m100208f(list2, "modifiedList");
        QuickPickerView quickPickerView = this.f46038U0;
        if (quickPickerView != null) {
            quickPickerView.m71216JO(list, list2);
        }
    }

    @Override // co.InterfaceC3614g
    /* renamed from: wI */
    public void mo18267wI(C27373c c27373c) {
        if (c27373c != null) {
            CameraInputParams m39204n = CameraInputParams.m39204n(c27373c);
            AbstractC19074t.m100207e(m39204n, "newEditFeedVideoInputParams(...)");
            ZaloCameraView m116167s = AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 11112, 0, m39204n);
            if (m116167s != null) {
                m116167s.f40833A1 = true;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        int i11;
        C25470c m131954b;
        super.mo37135xJ(bundle);
        if (bundle != null && (i11 = bundle.getInt("extra_data_retain_key", -1)) != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
            InterfaceC3612f interfaceC3612f = this.f46033P0;
            if (interfaceC3612f == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC3612f = null;
            }
            interfaceC3612f.mo18235b(m131954b);
        }
        m45264wM(bundle);
    }

    /* renamed from: xM */
    public final void m45268xM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C30034s9 c30034s9 = this.f46035R0;
        InterfaceC3612f interfaceC3612f = null;
        if (c30034s9 == null) {
            AbstractC19074t.m100223u("binding");
            c30034s9 = null;
        }
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        c30034s9.f139322s.setVisibility(0);
        c30034s9.f139322s.f83582p0.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        c30034s9.f139322s.f83582p0.setVisibility(0);
        c30034s9.f139322s.setSwipeRefreshEnable(false);
        C25845a c25845a = new C25845a(m92689tK);
        this.f46034Q0 = c25845a;
        c25845a.m133298P(new C8491e());
        RecyclerView recyclerView = c30034s9.f139322s.f83582p0;
        C25845a c25845a2 = this.f46034Q0;
        if (c25845a2 == null) {
            AbstractC19074t.m100223u("adapter");
            c25845a2 = null;
        }
        recyclerView.setAdapter(c25845a2);
        c30034s9.f139323t.setOnTouchListener(new View.OnTouchListener() { // from class: co.n

            /* renamed from: q */
            public final /* synthetic */ ProfileAlbumCreateView f15270q;

            public /* synthetic */ ViewOnTouchListenerC3621n(ProfileAlbumCreateView this) {
                r2 = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m45265yM;
                m45265yM = ProfileAlbumCreateView.m45265yM(C30034s9.this, r2, view, motionEvent);
                return m45265yM;
            }
        });
        this.f46039V0 = new C8492f();
        InterfaceC3612f interfaceC3612f2 = this.f46033P0;
        if (interfaceC3612f2 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC3612f2 = null;
        }
        interfaceC3612f2.mo18238e7().m9219j(this, new C8497k(new C8493g()));
        InterfaceC3612f interfaceC3612f3 = this.f46033P0;
        if (interfaceC3612f3 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC3612f3 = null;
        }
        interfaceC3612f3.mo18231To().m9219j(this, new C8497k(new C8494h()));
        InterfaceC3612f interfaceC3612f4 = this.f46033P0;
        if (interfaceC3612f4 == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC3612f4 = null;
        }
        interfaceC3612f4.mo18241kg().m9219j(this, new C8497k(new C8495i()));
        InterfaceC3612f interfaceC3612f5 = this.f46033P0;
        if (interfaceC3612f5 == null) {
            AbstractC19074t.m100223u("mPresenter");
        } else {
            interfaceC3612f = interfaceC3612f5;
        }
        interfaceC3612f.mo18221D();
    }

    @Override // co.InterfaceC3614g
    /* renamed from: yt */
    public void mo18268yt(int i11) {
        C30034s9 c30034s9 = this.f46035R0;
        if (c30034s9 == null) {
            AbstractC19074t.m100223u("binding");
            c30034s9 = null;
        }
        c30034s9.getRoot().post(new Runnable() { // from class: co.o

            /* renamed from: q */
            public final /* synthetic */ int f15272q;

            public /* synthetic */ RunnableC3622o(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ProfileAlbumCreateView.m45246DM(ProfileAlbumCreateView.this, r2);
            }
        });
    }

    /* renamed from: zM */
    public final boolean m45269zM() {
        QuickPickerView quickPickerView;
        QuickPickerView quickPickerView2 = this.f46038U0;
        if (quickPickerView2 != null && quickPickerView2.m92674mJ() && ((quickPickerView = this.f46038U0) == null || quickPickerView.m71254ZL() != -1)) {
            return true;
        }
        return false;
    }

    @Override // co.InterfaceC3614g
    /* renamed from: zi */
    public void mo18269zi() {
        showDialog(1);
    }
}
