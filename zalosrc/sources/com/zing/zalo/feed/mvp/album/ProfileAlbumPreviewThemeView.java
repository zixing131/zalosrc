package com.zing.zalo.feed.mvp.album;

import ag0.C0815e1;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.graphics.AbstractC1409d;
import androidx.core.text.AbstractC1463b;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import bo.C2966e1;
import bo.C2996k1;
import bo.C3000l0;
import bo.C3054x;
import bo.C3061y2;
import bo.C3062z;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p559uv.C27373c;
import p649xl.C30102w9;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import qm0.AbstractC25368s;

/* loaded from: classes4.dex */
public final class ProfileAlbumPreviewThemeView extends SlidableZaloView implements InterfaceC17463d.d {
    public static final C8518a Companion = new C8518a(null);

    /* renamed from: Q0 */
    private ThemeItem f46096Q0;

    /* renamed from: R0 */
    private boolean f46097R0;

    /* renamed from: S0 */
    private C27373c f46098S0;

    /* renamed from: T0 */
    private C8050a f46099T0;

    /* renamed from: U0 */
    private C30102w9 f46100U0;

    /* renamed from: Y0 */
    private List f46104Y0;

    /* renamed from: Z0 */
    private boolean f46105Z0;

    /* renamed from: P0 */
    private C32002l4 f46095P0 = C32002l4.Companion.m154287a(IMediaPlayer.MEDIA_INFO_HAVE_AUDIO_STREAM);

    /* renamed from: V0 */
    private final List f46101V0 = new ArrayList();

    /* renamed from: W0 */
    private final C1761c0 f46102W0 = new C1761c0();

    /* renamed from: X0 */
    private ProfileAlbumItem f46103X0 = new ProfileAlbumItem(null, 1, null);

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewThemeView$a */
    /* loaded from: classes4.dex */
    public static final class C8518a {
        private C8518a() {
        }

        public /* synthetic */ C8518a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewThemeView$b */
    /* loaded from: classes4.dex */
    public static final class C8519b implements ProfileAlbumThemePickerControl.InterfaceC8525a {
        C8519b() {
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: L1 */
        public void mo45407L1() {
            ProfileAlbumThemePickerControl.InterfaceC8525a.a.m45432a(this);
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: N2 */
        public void mo45408N2(ThemeItem themeItem) {
            AbstractC19074t.m100208f(themeItem, "theme");
            ProfileAlbumPreviewThemeView.this.m45403sM(themeItem, false);
            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154343Q(ProfileAlbumPreviewThemeView.this.f46095P0.m154284u(49)), false);
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: V0 */
        public void mo45409V0(ThemeItem themeItem) {
            AbstractC19074t.m100208f(themeItem, "themeInfo");
            ProfileAlbumPreviewThemeView.this.f46097R0 = false;
            ProfileAlbumPreviewThemeView.this.m45404oM().m46300c().m46270C(themeItem);
            ProfileAlbumPreviewThemeView.this.m45401nM();
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: g2 */
        public void mo45410g2(ThemeItem themeItem) {
            AbstractC19074t.m100208f(themeItem, "selectedTheme");
            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154343Q(ProfileAlbumPreviewThemeView.this.f46095P0.m154284u(50)), false);
        }

        @Override // com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl.InterfaceC8525a
        /* renamed from: v */
        public void mo45411v(boolean z11) {
            ProfileAlbumPreviewThemeView.this.f46105Z0 = z11;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewThemeView$c */
    /* loaded from: classes4.dex */
    public static final class C8520c implements FeedBaseAdapter.AlbumProfileCallback {
        C8520c() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: W0 */
        public void mo43226W0() {
            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154343Q(ProfileAlbumPreviewThemeView.this.f46095P0.m154284u(51)), false);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: X0 */
        public void mo43227X0() {
        }

        @Override // com.zing.zalo.feed.components.FeedItemTitleDivider.InterfaceC8146a
        /* renamed from: a */
        public void mo44157a() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: a4 */
        public void mo43228a4(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
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
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: f4 */
        public void mo43235f4(View view, View view2) {
            AbstractC19074t.m100208f(view, "headerRootView");
            AbstractC19074t.m100208f(view2, "headerTitleView");
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: i */
        public void mo43428i(int i11) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: l0 */
        public void mo43236l0() {
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
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: u */
        public void mo43238u() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: v */
        public void mo43239v(boolean z11) {
            ProfileAlbumPreviewThemeView.this.f46105Z0 = z11;
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: w */
        public void mo43240w(View view) {
            AbstractC19074t.m100208f(view, "view");
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: x */
        public void mo43241x(boolean z11) {
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
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewThemeView$d */
    /* loaded from: classes4.dex */
    public static final class C8521d extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ C30102w9 f46108a;

        C8521d(C30102w9 c30102w9) {
            this.f46108a = c30102w9;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "view");
            if (i11 == 0) {
                this.f46108a.f139804s.m45430r();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i12 != 0) {
                this.f46108a.f139804s.m45431s();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewThemeView$e */
    /* loaded from: classes4.dex */
    public static final class C8522e extends AbstractC19075u implements InterfaceC18505l {
        C8522e() {
            super(1);
        }

        /* renamed from: a */
        public final void m45412a(List list) {
            AbstractC19074t.m100208f(list, "list");
            ProfileAlbumPreviewThemeView.this.m45400mM(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45412a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewThemeView$f */
    /* loaded from: classes4.dex */
    public static final class C8523f extends ZdsActionBar.AbstractC16987c {
        C8523f() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            if (ProfileAlbumPreviewThemeView.this.m45405pM()) {
                ProfileAlbumPreviewThemeView.this.showDialog(1);
            } else if (!ProfileAlbumPreviewThemeView.this.m92681pJ() && !ProfileAlbumPreviewThemeView.this.m92677nJ()) {
                ProfileAlbumPreviewThemeView.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewThemeView$g */
    /* loaded from: classes4.dex */
    public static final class C8524g implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46111p;

        C8524g(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46111p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46111p;
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
            this.f46111p.mo205i9(obj);
        }
    }

    public ProfileAlbumPreviewThemeView() {
        List m131502j;
        m131502j = AbstractC25368s.m131502j();
        this.f46104Y0 = m131502j;
        this.f46105Z0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public final void m45400mM(List list) {
        C8050a c8050a = this.f46099T0;
        C8050a c8050a2 = null;
        if (c8050a == null) {
            AbstractC19074t.m100223u("adapter");
            c8050a = null;
        }
        c8050a.m43297g0(list);
        C8050a c8050a3 = this.f46099T0;
        if (c8050a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c8050a2 = c8050a3;
        }
        c8050a2.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public final void m45401nM() {
        this.f46101V0.clear();
        List list = this.f46101V0;
        C30102w9 c30102w9 = null;
        C2996k1 c2996k1 = new C2996k1(this.f46103X0.m46300c().m46286n(), null, 2, null);
        c2996k1.m14225y(this.f46103X0.m46300c().m46285m());
        c2996k1.m14215o(this.f46103X0.m46300c().m46274b());
        c2996k1.m14220t(this.f46103X0.m46302e());
        c2996k1.m14221u(new PrivacyInfo(this.f46103X0.m46300c().m46282j()));
        c2996k1.m14217q(true);
        list.add(new C2966e1(c2996k1));
        if (!(!this.f46104Y0.isEmpty()) && this.f46098S0 == null) {
            this.f46101V0.add(new C2966e1(m45402rM()));
        } else {
            List list2 = this.f46101V0;
            C3061y2 c3061y2 = new C3061y2(this.f46104Y0, this.f46098S0);
            c3061y2.m14720i(false);
            c3061y2.m14719h(false);
            list2.add(new C2966e1(c3061y2));
        }
        List list3 = this.f46101V0;
        C3062z c3062z = new C3062z(AbstractC23136l9.m118742r(200.0f));
        c3062z.m14724c(this.f46103X0.m46300c().m46285m().getDecorAlbum().getBgColor());
        list3.add(new C2966e1(c3062z));
        this.f46102W0.mo9221n(this.f46101V0);
        C30102w9 c30102w92 = this.f46100U0;
        if (c30102w92 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30102w9 = c30102w92;
        }
        c30102w9.f139802q.setBackgroundColor(this.f46103X0.m46300c().m46285m().getDecorAlbum().getBgColor());
    }

    /* renamed from: rM */
    private final C3054x m45402rM() {
        int descColor;
        int m7147p;
        C3054x c3054x = new C3054x(false, 1, null);
        c3054x.m14664V(2);
        c3054x.m14655M(true);
        c3054x.m14663U(true);
        c3054x.m14648F(C23212s8.m119607o(getContext(), AbstractC16781w.ProfileSecondaryBackgroundColor));
        ThemeItem m46285m = this.f46103X0.m46300c().m46285m();
        c3054x.m14648F(m46285m.getDecorAlbum().getBgColor());
        c3054x.m14649G(m46285m.getContent().getEmptyBorderColor());
        c3054x.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_preview_theme_empty_title));
        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_preview_theme_empty_desc));
        c3054x.m14657O(AbstractC16803z.icon_profile_empty_section_photo);
        if (this.f46103X0.m46300c().m46285m().isThemeDefault()) {
            descColor = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1);
        } else {
            descColor = this.f46103X0.m46300c().m46285m().getContent().getDescColor();
        }
        c3054x.m14668Z(descColor);
        if (this.f46103X0.m46300c().m46285m().isThemeDefault()) {
            m7147p = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1);
        } else {
            m7147p = AbstractC1409d.m7147p(this.f46103X0.m46300c().m46285m().getContent().getDescColor(), 178);
        }
        c3054x.m14651I(m7147p);
        return c3054x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public final void m45403sM(ThemeItem themeItem, boolean z11) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_RESULT_THEME_ID", themeItem);
        intent.putExtra("EXTRA_RESULT_FROM_BACK", z11);
        C24848g0 c24848g0 = C24848g0.f119245a;
        mo50035CK(-1, intent);
        finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 == null) {
            return;
        }
        this.f46095P0.m154273c(C32002l4.Companion.m154292f(m92642L3.getString("extra_entry_point_flow")));
        ProfileAlbumItem profileAlbumItem = (ProfileAlbumItem) m92642L3.getParcelable("EXTRA_PARAM_PROFILE_ALBUM");
        if (profileAlbumItem == null) {
            profileAlbumItem = this.f46103X0;
        }
        this.f46103X0 = profileAlbumItem;
        List parcelableArrayList = m92642L3.getParcelableArrayList("EXTRA_PARAM_MEDIA_ITEM_PICKED");
        if (parcelableArrayList == null) {
            parcelableArrayList = this.f46104Y0;
        }
        this.f46104Y0 = parcelableArrayList;
        this.f46098S0 = (C27373c) m92642L3.getSerializable("EXTRA_PARAM_VIDEO_INFO");
        this.f46097R0 = m92642L3.getBoolean("EXTRA_PARAM_RANDOM_PICK_THEME");
        this.f46096Q0 = this.f46103X0.m46300c().m46285m();
        if (bundle != null) {
            ProfileAlbumItem profileAlbumItem2 = (ProfileAlbumItem) bundle.getParcelable("album_item");
            if (profileAlbumItem2 == null) {
                profileAlbumItem2 = this.f46103X0;
            } else {
                AbstractC19074t.m100205c(profileAlbumItem2);
            }
            this.f46103X0 = profileAlbumItem2;
            ThemeItem themeItem = (ThemeItem) bundle.getParcelable("ori_theme");
            if (themeItem == null) {
                themeItem = this.f46096Q0;
                if (themeItem == null) {
                    AbstractC19074t.m100223u("oriTheme");
                    themeItem = null;
                }
            } else {
                AbstractC19074t.m100205c(themeItem);
            }
            this.f46096Q0 = themeItem;
            this.f46097R0 = bundle.getBoolean("random_theme", this.f46097R0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            try {
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(4);
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_preview_theme_back_confirm);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format = String.format(m118743r0, Arrays.copyOf(new Object[]{this.f46103X0.m46300c().m46285m().getContent().getTitle()}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                aVar.m43162k(AbstractC1463b.m7440a(format, 63));
                aVar.m43165n(m92652XI(AbstractC8020f0.str_no), this);
                aVar.m43169r(AbstractC8020f0.str_yes, this);
                return aVar.m43152a();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m92637BK(true);
        C30102w9 m148656c = C30102w9.m148656c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148656c, "inflate(...)");
        this.f46100U0 = m148656c;
        m45406qM();
        C30102w9 c30102w9 = this.f46100U0;
        if (c30102w9 == null) {
            AbstractC19074t.m100223u("binding");
            c30102w9 = null;
        }
        RelativeLayout root = c30102w9.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d == null) {
            return;
        }
        try {
            if (interfaceC17463d.mo92862f() == 1) {
                if (i11 != -2) {
                    if (i11 == -1) {
                        interfaceC17463d.dismiss();
                        m45403sM(this.f46103X0.m46300c().m46285m(), true);
                    }
                } else {
                    interfaceC17463d.dismiss();
                    finish();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (super.mo37488Li() && this.f46105Z0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C8523f());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putParcelable("album_item", this.f46103X0);
        ThemeItem themeItem = this.f46096Q0;
        if (themeItem == null) {
            AbstractC19074t.m100223u("oriTheme");
            themeItem = null;
        }
        bundle.putParcelable("ori_theme", themeItem);
        bundle.putBoolean("random_theme", this.f46097R0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        m45401nM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProfileAlbumPreviewThemeView";
    }

    /* renamed from: oM */
    public final ProfileAlbumItem m45404oM() {
        return this.f46103X0;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && m45405pM()) {
            showDialog(1);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: pM */
    public final boolean m45405pM() {
        ThemeItem themeItem = this.f46096Q0;
        if (themeItem == null) {
            AbstractC19074t.m100223u("oriTheme");
            themeItem = null;
        }
        if (themeItem.getId() != this.f46103X0.m46300c().m46285m().getId() && !this.f46103X0.m46300c().m46285m().isThemeDefault()) {
            return true;
        }
        return false;
    }

    /* renamed from: qM */
    public final void m45406qM() {
        C30102w9 c30102w9 = this.f46100U0;
        C8050a c8050a = null;
        if (c30102w9 == null) {
            AbstractC19074t.m100223u("binding");
            c30102w9 = null;
        }
        c30102w9.f139804s.setThemePickerCallback(new C8519b());
        c30102w9.f139804s.setRandomPickTheme(this.f46097R0);
        c30102w9.f139804s.m45424e(this.f46103X0.m46300c().m46285m());
        C8050a c8050a2 = new C8050a(this.f72421L0.m92648SI(), new C23528a(getContext()));
        this.f46099T0 = c8050a2;
        c8050a2.m43220Y(new C8520c());
        c30102w9.f139803r.setLayoutManager(new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI()));
        FeedRecyclerView feedRecyclerView = c30102w9.f139803r;
        C8050a c8050a3 = this.f46099T0;
        if (c8050a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c8050a = c8050a3;
        }
        feedRecyclerView.setAdapter(c8050a);
        c30102w9.f139803r.m9826E(new C8521d(c30102w9));
        this.f46102W0.m9219j(this, new C8524g(new C8522e()));
    }
}
