package com.zing.zalo.feed.mvp.album;

import ae.C0766k;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.graphics.AbstractC1409d;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import au.C2370r0;
import bo.C2966e1;
import bo.C2996k1;
import bo.C3000l0;
import bo.C3054x;
import bo.C3061y2;
import bo.C3062z;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.AlbumRowPreviewGridView;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumHeader;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumThemeCollection;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import com.zing.zalo.p077ui.zviews.PostPhotoEditorView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.C20275e;
import is.AbstractC20783a;
import is.AbstractC20784a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m90.EnumC22962a;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23250w4;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p133ek.C18460c;
import p187gk.C19464a;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import p649xl.C30085v9;
import p716zh.C31890dc;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import qm0.AbstractC25368s;

/* loaded from: classes4.dex */
public final class ProfileAlbumPreviewAlbumView extends SlidableZaloView implements InterfaceC17463d.d {
    public static final C8506a Companion = new C8506a(null);

    /* renamed from: Q0 */
    private C8050a f46069Q0;

    /* renamed from: R0 */
    private C30085v9 f46070R0;

    /* renamed from: V0 */
    private boolean f46074V0;

    /* renamed from: Y0 */
    private C27373c f46077Y0;

    /* renamed from: Z0 */
    private boolean f46078Z0;

    /* renamed from: b1 */
    private QuickPickerView f46080b1;

    /* renamed from: c1 */
    private C20275e f46081c1;

    /* renamed from: f1 */
    private boolean f46084f1;

    /* renamed from: h1 */
    private boolean f46086h1;

    /* renamed from: P0 */
    private C32002l4 f46068P0 = C32002l4.Companion.m154287a(IMediaPlayer.MEDIA_INFO_HAVE_VIDEO_STREAM);

    /* renamed from: S0 */
    private final List f46071S0 = new ArrayList();

    /* renamed from: T0 */
    private final C1761c0 f46072T0 = new C1761c0();

    /* renamed from: U0 */
    private final C1761c0 f46073U0 = new C1761c0();

    /* renamed from: W0 */
    private ProfileAlbumItem f46075W0 = new ProfileAlbumItem(null, 1, null);

    /* renamed from: X0 */
    private ArrayList f46076X0 = new ArrayList();

    /* renamed from: a1 */
    private String f46079a1 = CoreUtility.f89233i;

    /* renamed from: d1 */
    private SparseIntArray f46082d1 = new SparseIntArray();

    /* renamed from: e1 */
    private SparseIntArray f46083e1 = new SparseIntArray();

    /* renamed from: g1 */
    private ProfileAlbumThemeCollection f46085g1 = ProfileAlbumThemeCollection.Companion.m46313a();

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$a */
    /* loaded from: classes4.dex */
    public static final class C8506a {
        private C8506a() {
        }

        public /* synthetic */ C8506a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$b */
    /* loaded from: classes4.dex */
    public static final class C8507b implements QuickPickerView.InterfaceC12659u {
        C8507b() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: O */
        public void mo45270O(MediaItem mediaItem) {
            AbstractC19074t.m100208f(mediaItem, "photo");
            if (!mediaItem.m41173u0()) {
                ProfileAlbumPreviewAlbumView.this.m45359BM().remove(mediaItem);
            } else if (ProfileAlbumPreviewAlbumView.this.m45359BM().size() < AbstractC0924m0.m3769e3()) {
                ProfileAlbumPreviewAlbumView.this.m45359BM().add(mediaItem);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: m */
        public void mo45271m(List list) {
            AbstractC19074t.m100208f(list, "selectedItems");
            if (!list.isEmpty()) {
                ProfileAlbumPreviewAlbumView.this.m45370RM(list);
            }
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12659u
        /* renamed from: n */
        public void mo45272n(boolean z11, boolean z12) {
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$c */
    /* loaded from: classes4.dex */
    public static final class C8508c implements QuickPickerView.InterfaceC12657s {
        C8508c() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: Z */
        public void mo45273Z(C27373c c27373c, String str) {
            AbstractC19074t.m100208f(c27373c, "video");
            ProfileAlbumPreviewAlbumView.this.m45373VM(c27373c);
            ProfileAlbumPreviewAlbumView.this.m45372Tr();
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: a */
        public void mo45274a() {
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: b */
        public boolean mo45275b() {
            ProfileAlbumPreviewAlbumView.this.m45357xM();
            ProfileAlbumPreviewAlbumView.this.m45372Tr();
            return true;
        }

        @Override // com.zing.zalo.p077ui.picker.QuickPickerView.InterfaceC12657s
        /* renamed from: c */
        public void mo45276c(int i11) {
            if (i11 == 0) {
                ProfileAlbumPreviewAlbumView.this.m45372Tr();
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
            ProfileAlbumPreviewAlbumView.this.m45368QM(list);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$d */
    /* loaded from: classes4.dex */
    public static final class C8509d implements QuickPickerView.InterfaceC12663y {
        C8509d() {
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

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$e */
    /* loaded from: classes4.dex */
    public static final class C8510e implements InterfaceC20094a {
        C8510e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m45388e(ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView, ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "$album");
            profileAlbumPreviewAlbumView.finish();
            profileAlbumPreviewAlbumView.m45375ZM(profilePreviewAlbumItem, profileAlbumPreviewAlbumView.m45383yM().m46300c().m46282j(), profileAlbumPreviewAlbumView.m45359BM(), profileAlbumPreviewAlbumView.f46077Y0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m45389f(ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView, C20096c c20096c) {
            AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$p0");
            profileAlbumPreviewAlbumView.mo49315c4();
            AbstractC20783a.a aVar = AbstractC20783a.Companion;
            Context m92689tK = profileAlbumPreviewAlbumView.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            aVar.m108434c(m92689tK, c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "p0");
            ProfileAlbumPreviewAlbumView.this.m45376bN(false);
            final ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView = ProfileAlbumPreviewAlbumView.this;
            profileAlbumPreviewAlbumView.mo70710wy(new Runnable() { // from class: co.y
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAlbumPreviewAlbumView.C8510e.m45389f(ProfileAlbumPreviewAlbumView.this, c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "p0");
            ProfileAlbumPreviewAlbumView.this.m45376bN(false);
            JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
            if (optJSONObject != null) {
                final ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView = ProfileAlbumPreviewAlbumView.this;
                ProfilePreviewAlbumItem.C8670b c8670b = ProfilePreviewAlbumItem.Companion;
                String jSONObject = optJSONObject.toString();
                AbstractC19074t.m100207e(jSONObject, "toString(...)");
                final ProfilePreviewAlbumItem m46319a = c8670b.m46319a(jSONObject);
                profileAlbumPreviewAlbumView.mo70710wy(new Runnable() { // from class: co.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfileAlbumPreviewAlbumView.C8510e.m45388e(ProfileAlbumPreviewAlbumView.this, m46319a);
                    }
                });
            }
            ProfileAlbumPreviewAlbumView.this.mo49315c4();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$f */
    /* loaded from: classes4.dex */
    public static final class C8511f implements InterfaceC20094a {
        C8511f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m45391d(ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView) {
            AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
            profileAlbumPreviewAlbumView.mo49315c4();
            profileAlbumPreviewAlbumView.m45383yM().m46300c().m46270C(profileAlbumPreviewAlbumView.m45361DM().getTheme(profileAlbumPreviewAlbumView.m45383yM().m46300c().m46285m().getId()));
            profileAlbumPreviewAlbumView.m45357xM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "p0");
            ProfileAlbumPreviewAlbumView.this.m45377cN(false);
            ProfileAlbumPreviewAlbumView.this.mo78960q3();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "p0");
            ProfileAlbumPreviewAlbumView.this.m45377cN(false);
            JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
            if (optJSONObject != null) {
                final ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView = ProfileAlbumPreviewAlbumView.this;
                String str = profileAlbumPreviewAlbumView.f46079a1;
                AbstractC19074t.m100207e(str, "access$getUserId$p(...)");
                String jSONObject = optJSONObject.toString();
                AbstractC19074t.m100207e(jSONObject, "toString(...)");
                C19464a.m101789h(str, jSONObject, 5);
                ProfileAlbumThemeCollection.C8667a c8667a = ProfileAlbumThemeCollection.Companion;
                String jSONObject2 = optJSONObject.toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                profileAlbumPreviewAlbumView.m45379eN(c8667a.m46314b(jSONObject2));
                profileAlbumPreviewAlbumView.mo70710wy(new Runnable() { // from class: co.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProfileAlbumPreviewAlbumView.C8511f.m45391d(ProfileAlbumPreviewAlbumView.this);
                    }
                });
            }
            ProfileAlbumPreviewAlbumView.this.m45378dN(true);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$g */
    /* loaded from: classes4.dex */
    public static final class C8512g implements FeedBaseAdapter.AlbumProfileCallback {
        C8512g() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: W0 */
        public void mo43226W0() {
            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154343Q(ProfileAlbumPreviewAlbumView.this.f46068P0.m154284u(52)), false);
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
            ProfileAlbumPreviewAlbumView.this.m45374WM();
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: c */
        public void mo43425c(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
            if (ProfileAlbumPreviewAlbumView.this.m45359BM().size() > 9 && i11 == 8) {
                ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView = ProfileAlbumPreviewAlbumView.this;
                profileAlbumPreviewAlbumView.m45366PD(profileAlbumPreviewAlbumView.m45359BM());
            } else {
                ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView2 = ProfileAlbumPreviewAlbumView.this;
                profileAlbumPreviewAlbumView2.m45369RG(profileAlbumPreviewAlbumView2.m45359BM(), animationTarget, i11);
            }
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
            ProfileAlbumPreviewAlbumView.this.m45371SM(i11);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: l0 */
        public void mo43236l0() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: n1 */
        public void mo43430n1() {
            ProfileAlbumPreviewAlbumView.this.m45384yt(1);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: r2 */
        public void mo43431r2() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: s */
        public void mo43237s(C3054x c3054x) {
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
            ProfileAlbumPreviewAlbumView.this.m45384yt(1);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: u */
        public void mo43238u() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: v */
        public void mo43239v(boolean z11) {
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

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$h */
    /* loaded from: classes4.dex */
    public static final class C8513h extends RecyclerView.AbstractC1892s {
        C8513h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "view");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$i */
    /* loaded from: classes4.dex */
    public static final class C8514i extends C20275e {
        C8514i() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$j */
    /* loaded from: classes4.dex */
    public static final class C8515j extends AbstractC19075u implements InterfaceC18505l {
        C8515j() {
            super(1);
        }

        /* renamed from: a */
        public final void m45392a(List list) {
            AbstractC19074t.m100208f(list, "list");
            ProfileAlbumPreviewAlbumView.this.m45355uM(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45392a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$k */
    /* loaded from: classes4.dex */
    public static final class C8516k extends AbstractC19075u implements InterfaceC18505l {
        C8516k() {
            super(1);
        }

        /* renamed from: a */
        public final void m45393a(boolean z11) {
            ProfileAlbumPreviewAlbumView.this.m45343iN(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45393a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumPreviewAlbumView$l */
    /* loaded from: classes4.dex */
    public static final class C8517l implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46094p;

        C8517l(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46094p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46094p;
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
            this.f46094p.mo205i9(obj);
        }
    }

    /* renamed from: EM */
    private final void m45326EM(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("EXTRA_SELECTED_PHOTOS")) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_SELECTED_PHOTOS");
                    ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("EXTRA_MODIFIED_PHOTOS");
                    if (parcelableArrayListExtra != null) {
                        m45368QM(parcelableArrayListExtra);
                        if (parcelableArrayListExtra2 != null) {
                            m45356vo(parcelableArrayListExtra, parcelableArrayListExtra2);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: FM */
    private final void m45327FM(Bundle bundle) {
        if (bundle != null) {
            this.f46080b1 = (QuickPickerView) m92649TI().m92993D0(QuickPickerView.class);
            m45354tM();
            return;
        }
        this.f46080b1 = new QuickPickerView();
        m45354tM();
        QuickPickerView quickPickerView = this.f46080b1;
        if (quickPickerView != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("extra_media_picker_source", EnumC22962a.f111693q);
            bundle2.putInt("extra_preload_grid_mode", -1);
            quickPickerView.mo60305zK(bundle2);
        }
        this.f72421L0.m92649TI().m93058d2(AbstractC6918a0.quick_picker_container, this.f46080b1, 0, "mQuickPickerFragment", 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m45328HM(ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView, View view) {
        AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
        profileAlbumPreviewAlbumView.m45374WM();
    }

    /* renamed from: IM */
    private final boolean m45329IM() {
        return this.f46076X0.isEmpty();
    }

    /* renamed from: JM */
    private final boolean m45330JM() {
        boolean m127128x;
        m127128x = AbstractC24341v.m127128x(this.f46075W0.m46300c().m46286n());
        return m127128x;
    }

    /* renamed from: NM */
    private final C3054x m45331NM() {
        int descColor;
        int m7147p;
        C3054x c3054x = new C3054x(false, 1, null);
        c3054x.m14664V(2);
        c3054x.m14655M(true);
        c3054x.m14663U(true);
        c3054x.m14648F(C23212s8.m119607o(getContext(), AbstractC16781w.ProfileSecondaryBackgroundColor));
        ThemeItem m46285m = this.f46075W0.m46300c().m46285m();
        c3054x.m14648F(m46285m.getDecorAlbum().getBgColor());
        c3054x.m14649G(m46285m.getContent().getEmptyBorderColor());
        c3054x.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_preview_theme_empty_title));
        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_preview_theme_empty_desc));
        c3054x.m14657O(AbstractC16803z.icon_profile_empty_section_photo);
        c3054x.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_empty_state_cta_post));
        if (this.f46075W0.m46300c().m46285m().isThemeDefault()) {
            descColor = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1);
        } else {
            descColor = this.f46075W0.m46300c().m46285m().getContent().getDescColor();
        }
        c3054x.m14668Z(descColor);
        if (this.f46075W0.m46300c().m46285m().isThemeDefault()) {
            m7147p = C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1);
        } else {
            m7147p = AbstractC1409d.m7147p(this.f46075W0.m46300c().m46285m().getContent().getDescColor(), 178);
        }
        c3054x.m14651I(m7147p);
        return c3054x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static final void m45332OM(ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView, int i11, int i12, Intent intent) {
        AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
        QuickPickerView quickPickerView = profileAlbumPreviewAlbumView.f46080b1;
        if (quickPickerView != null) {
            quickPickerView.onActivityResult(i11, i12, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m45333TM(ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView, View view) {
        AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
        profileAlbumPreviewAlbumView.m45367PM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m45334UM(ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView) {
        AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
        profileAlbumPreviewAlbumView.m45382wM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XM */
    public static final void m45335XM(final ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView, int i11) {
        QuickPickerView quickPickerView;
        AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
        QuickPickerView quickPickerView2 = profileAlbumPreviewAlbumView.f46080b1;
        if (quickPickerView2 != null) {
            quickPickerView2.m71234SN(true);
        }
        if (i11 != 1) {
            if (i11 == 2 && (quickPickerView = profileAlbumPreviewAlbumView.f46080b1) != null) {
                quickPickerView.m71284sO(true, new SensitiveData("gallery_album_feed", "social_timeline", null, 4, null));
            }
        } else {
            QuickPickerView quickPickerView3 = profileAlbumPreviewAlbumView.f46080b1;
            if (quickPickerView3 != null) {
                quickPickerView3.m71281pO(true, new SensitiveData("gallery_album_feed", "social_timeline", null, 4, null));
            }
        }
        if (!profileAlbumPreviewAlbumView.f46074V0) {
            profileAlbumPreviewAlbumView.f72827B0.postDelayed(new Runnable() { // from class: co.x
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAlbumPreviewAlbumView.m45336YM(ProfileAlbumPreviewAlbumView.this);
                }
            }, 100L);
            profileAlbumPreviewAlbumView.f46074V0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YM */
    public static final void m45336YM(ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView) {
        List m131502j;
        AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
        ArrayList arrayList = profileAlbumPreviewAlbumView.f46076X0;
        m131502j = AbstractC25368s.m131502j();
        profileAlbumPreviewAlbumView.m45356vo(arrayList, m131502j);
    }

    /* renamed from: aN */
    private final void m45337aN(int i11) {
        QuickPickerView quickPickerView;
        if (i11 >= 0 && i11 < this.f46076X0.size() && (quickPickerView = this.f46080b1) != null) {
            quickPickerView.m71209FN((MediaItem) this.f46076X0.get(i11));
        }
    }

    /* renamed from: fN */
    private final void m45338fN() {
        int iconColor;
        int m118641B;
        ProfileAlbumItem profileAlbumItem = this.f46075W0;
        if (profileAlbumItem.m46300c().m46285m().isThemeDefault()) {
            iconColor = C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor);
        } else {
            iconColor = profileAlbumItem.m46300c().m46285m().getContent().getIconColor();
        }
        if (profileAlbumItem.m46300c().m46285m().isThemeDefault()) {
            m118641B = C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor);
        } else {
            m118641B = AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.white);
        }
        m45380gN(iconColor, m118641B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hN */
    public static final void m45341hN(ProfileAlbumPreviewAlbumView profileAlbumPreviewAlbumView, int i11, int i12) {
        AbstractC19074t.m100208f(profileAlbumPreviewAlbumView, "this$0");
        try {
            C30085v9 c30085v9 = profileAlbumPreviewAlbumView.f46070R0;
            C30085v9 c30085v92 = null;
            if (c30085v9 == null) {
                AbstractC19074t.m100223u("binding");
                c30085v9 = null;
            }
            c30085v9.f139680r.setColorFilter(i11);
            C30085v9 c30085v93 = profileAlbumPreviewAlbumView.f46070R0;
            if (c30085v93 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30085v92 = c30085v93;
            }
            Drawable mutate = c30085v92.f139679q.getBackground().mutate();
            AbstractC19074t.m100207e(mutate, "mutate(...)");
            if (mutate instanceof GradientDrawable) {
                ((GradientDrawable) mutate).setColor(i12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iN */
    public final void m45343iN(boolean z11) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setEnableTrailingButton(z11);
        }
    }

    /* renamed from: tM */
    private final void m45354tM() {
        QuickPickerView quickPickerView = this.f46080b1;
        if (quickPickerView != null) {
            quickPickerView.m71252YN(new C8507b());
        }
        QuickPickerView quickPickerView2 = this.f46080b1;
        if (quickPickerView2 != null) {
            quickPickerView2.m71247WN(new C8508c());
        }
        QuickPickerView quickPickerView3 = this.f46080b1;
        if (quickPickerView3 != null) {
            quickPickerView3.m71261bO(new C8509d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public final void m45355uM(List list) {
        C8050a c8050a = this.f46069Q0;
        C8050a c8050a2 = null;
        if (c8050a == null) {
            AbstractC19074t.m100223u("adapter");
            c8050a = null;
        }
        c8050a.m43297g0(list);
        C8050a c8050a3 = this.f46069Q0;
        if (c8050a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c8050a2 = c8050a3;
        }
        c8050a2.m10008p();
    }

    /* renamed from: vo */
    private final void m45356vo(List list, List list2) {
        QuickPickerView quickPickerView = this.f46080b1;
        if (quickPickerView != null) {
            quickPickerView.m71216JO(list, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final void m45357xM() {
        this.f46071S0.clear();
        List list = this.f46071S0;
        C30085v9 c30085v9 = null;
        C2996k1 c2996k1 = new C2996k1(this.f46075W0.m46300c().m46286n(), null, 2, null);
        c2996k1.m14225y(this.f46075W0.m46300c().m46285m());
        c2996k1.m14215o(this.f46075W0.m46300c().m46274b());
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_album_photos);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(m45385zM())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        c2996k1.m14220t(format);
        c2996k1.m14221u(new PrivacyInfo(this.f46075W0.m46300c().m46282j()));
        c2996k1.m14217q(true);
        list.add(new C2966e1(c2996k1));
        if (!(!m45358AM().isEmpty()) && this.f46077Y0 == null) {
            this.f46071S0.add(new C2966e1(m45331NM()));
        } else {
            List list2 = this.f46071S0;
            C3061y2 c3061y2 = new C3061y2(m45358AM(), this.f46077Y0);
            c3061y2.m14720i(true);
            list2.add(new C2966e1(c3061y2));
        }
        List list3 = this.f46071S0;
        C3062z c3062z = new C3062z(AbstractC23136l9.m118742r(200.0f));
        c3062z.m14724c(this.f46075W0.m46300c().m46285m().getDecorAlbum().getBgColor());
        list3.add(new C2966e1(c3062z));
        this.f46072T0.mo9221n(this.f46071S0);
        m45338fN();
        C30085v9 c30085v92 = this.f46070R0;
        if (c30085v92 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30085v9 = c30085v92;
        }
        c30085v9.f139681s.setBackgroundColor(this.f46075W0.m46300c().m46285m().getDecorAlbum().getBgColor());
    }

    /* renamed from: AM */
    public final List m45358AM() {
        ArrayList arrayList = new ArrayList();
        List m108447k = AbstractC20784a0.m108447k(this.f46076X0);
        int i11 = 0;
        for (Object obj : this.f46076X0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            itemAlbumMobile.m40513X((MediaItem) obj, true);
            if (i11 < m108447k.size()) {
                itemAlbumMobile.f42596r0 = (ItemAlbumMobile.C7883c) m108447k.get(i11);
                arrayList.add(itemAlbumMobile);
            }
            i11 = i12;
        }
        return arrayList;
    }

    /* renamed from: BM */
    public final ArrayList m45359BM() {
        return this.f46076X0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 == null) {
            return;
        }
        ProfileAlbumItem profileAlbumItem = (ProfileAlbumItem) m92642L3.getParcelable("EXTRA_PARAM_PROFILE_ALBUM");
        if (profileAlbumItem == null) {
            profileAlbumItem = this.f46075W0;
        }
        this.f46075W0 = profileAlbumItem;
        this.f46068P0.m154273c(C32002l4.Companion.m154292f(m92642L3.getString("extra_entry_point_flow")));
        if (bundle != null) {
            ProfileAlbumThemeCollection profileAlbumThemeCollection = (ProfileAlbumThemeCollection) bundle.getParcelable("list_theme");
            if (profileAlbumThemeCollection == null) {
                profileAlbumThemeCollection = this.f46085g1;
            } else {
                AbstractC19074t.m100205c(profileAlbumThemeCollection);
            }
            this.f46085g1 = profileAlbumThemeCollection;
            ProfileAlbumItem profileAlbumItem2 = (ProfileAlbumItem) bundle.getParcelable("album_item");
            if (profileAlbumItem2 == null) {
                profileAlbumItem2 = this.f46075W0;
            } else {
                AbstractC19074t.m100205c(profileAlbumItem2);
            }
            this.f46075W0 = profileAlbumItem2;
            this.f46078Z0 = bundle.getBoolean("loaded_server", this.f46078Z0);
        }
    }

    /* renamed from: CM */
    public final View m45360CM() {
        C30085v9 c30085v9 = this.f46070R0;
        if (c30085v9 == null) {
            AbstractC19074t.m100223u("binding");
            c30085v9 = null;
        }
        FeedRecyclerView feedRecyclerView = c30085v9.f139683u;
        AbstractC19074t.m100207e(feedRecyclerView, "recyclerView");
        int childCount = feedRecyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = feedRecyclerView.getChildAt(i11);
            AbstractC19074t.m100207e(childAt, "getChildAt(...)");
            if (childAt instanceof AlbumRowPreviewGridView) {
                return ((AlbumRowPreviewGridView) childAt).getPreviewGrid();
            }
        }
        return null;
    }

    /* renamed from: DM */
    public final ProfileAlbumThemeCollection m45361DM() {
        return this.f46085g1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m92637BK(true);
        C30085v9 m148619c = C30085v9.m148619c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148619c, "inflate(...)");
        this.f46070R0 = m148619c;
        m45362GM();
        C30085v9 c30085v9 = this.f46070R0;
        if (c30085v9 == null) {
            AbstractC19074t.m100223u("binding");
            c30085v9 = null;
        }
        RelativeLayout root = c30085v9.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: GM */
    public final void m45362GM() {
        C30085v9 c30085v9 = this.f46070R0;
        C8050a c8050a = null;
        if (c30085v9 == null) {
            AbstractC19074t.m100223u("binding");
            c30085v9 = null;
        }
        C8050a c8050a2 = new C8050a(this.f72421L0.m92648SI(), new C23528a(getContext()));
        this.f46069Q0 = c8050a2;
        c8050a2.m43220Y(new C8512g());
        c30085v9.f139683u.setLayoutManager(new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI()));
        FeedRecyclerView feedRecyclerView = c30085v9.f139683u;
        C8050a c8050a3 = this.f46069Q0;
        if (c8050a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c8050a = c8050a3;
        }
        feedRecyclerView.setAdapter(c8050a);
        c30085v9.f139683u.m9826E(new C8513h());
        c30085v9.f139679q.setOnClickListener(new View.OnClickListener() { // from class: co.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileAlbumPreviewAlbumView.m45328HM(ProfileAlbumPreviewAlbumView.this, view);
            }
        });
        c30085v9.f139681s.setBackgroundColor(this.f46075W0.m46300c().m46285m().getDecorAlbum().getBgColor());
        this.f46081c1 = new C8514i();
        this.f46072T0.m9219j(this, new C8517l(new C8515j()));
        this.f46073U0.m9219j(this, new C8517l(new C8516k()));
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* renamed from: KM */
    public final boolean m45363KM() {
        QuickPickerView quickPickerView;
        QuickPickerView quickPickerView2 = this.f46080b1;
        if (quickPickerView2 != null && quickPickerView2.m92674mJ() && ((quickPickerView = this.f46080b1) == null || quickPickerView.m71254ZL() != -1)) {
            return true;
        }
        return false;
    }

    /* renamed from: LM */
    public final boolean m45364LM() {
        QuickPickerView quickPickerView = this.f46080b1;
        if (quickPickerView != null) {
            return quickPickerView.m71255ZM();
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    /* renamed from: MM */
    public final void m45365MM() {
        String str = this.f46079a1;
        AbstractC19074t.m100207e(str, "userId");
        String m101783b = C19464a.m101783b(str, 5);
        if (m101783b != null) {
            this.f46085g1 = ProfileAlbumThemeCollection.Companion.m46314b(m101783b);
            this.f46075W0.m46300c().m46270C(this.f46085g1.getTheme(this.f46075W0.m46300c().m46285m().getId()));
            m45357xM();
            return;
        }
        mo46829Y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: co.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileAlbumPreviewAlbumView.m45333TM(ProfileAlbumPreviewAlbumView.this, view);
                }
            });
        }
    }

    /* renamed from: PD */
    public final void m45366PD(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "mediaList");
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("EXTRA_SELECTED_PHOTOS", arrayList);
        bundle.putBoolean("extra_enable_inline_banner", true);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(PostPhotoEditorView.class, bundle, 1001, 1, true);
        }
    }

    /* renamed from: PM */
    public final void m45367PM() {
        if (m45330JM()) {
            mo59032jx(AbstractC8020f0.str_profile_album_create_album_empty_title);
        } else if (m45329IM()) {
            mo59032jx(AbstractC8020f0.str_no_image_selected);
        } else {
            m45381vM();
        }
    }

    /* renamed from: QM */
    public final void m45368QM(List list) {
        AbstractC19074t.m100208f(list, "selectedItems");
        this.f46076X0.clear();
        this.f46076X0.addAll(list);
        m45357xM();
        m45372Tr();
    }

    /* renamed from: RG */
    public final void m45369RG(ArrayList arrayList, AnimationTarget animationTarget, int i11) {
        AbstractC19074t.m100208f(arrayList, "mediaItems");
        this.f46082d1.clear();
        this.f46083e1.clear();
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f46082d1.put(i12, 0);
        }
        this.f46083e1.put(0, 0);
        C20275e c20275e = this.f46081c1;
        if (c20275e != null) {
            c20275e.m105861G(new C2370r0(m45360CM()));
        }
        C20275e c20275e2 = this.f46081c1;
        if (c20275e2 != null) {
            c20275e2.m105857C(this.f46082d1);
        }
        C20275e c20275e3 = this.f46081c1;
        if (c20275e3 != null) {
            c20275e3.m105858D(this.f46083e1);
        }
        C20275e c20275e4 = this.f46081c1;
        if (c20275e4 != null) {
            c20275e4.m105855A(true);
        }
        C20275e c20275e5 = this.f46081c1;
        if (c20275e5 != null) {
            c20275e5.m105865K(i11);
        }
        Object obj = arrayList.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        MediaItem mediaItem = (MediaItem) obj;
        QuickPickerView quickPickerView = this.f46080b1;
        if (quickPickerView != null) {
            quickPickerView.m71206DN(arrayList, mediaItem, animationTarget, this.f46081c1);
        }
    }

    /* renamed from: RM */
    public final void m45370RM(List list) {
        AbstractC19074t.m100208f(list, "selectedItems");
        this.f46076X0.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            if (mediaItem.m41173u0()) {
                this.f46076X0.add(mediaItem);
            }
        }
        m45357xM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putParcelable("list_theme", this.f46085g1);
        bundle.putParcelable("album_item", this.f46075W0);
        bundle.putBoolean("loaded_server", this.f46078Z0);
    }

    /* renamed from: SM */
    public final void m45371SM(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < this.f46076X0.size()) {
                    this.f46076X0.remove(i11);
                    m45357xM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m45337aN(i11);
    }

    /* renamed from: Tr */
    public final void m45372Tr() {
        QuickPickerView quickPickerView = this.f46080b1;
        if (quickPickerView != null) {
            quickPickerView.m71234SN(false);
        }
        QuickPickerView quickPickerView2 = this.f46080b1;
        if (quickPickerView2 != null) {
            quickPickerView2.m71289vO();
        }
    }

    /* renamed from: VM */
    public final void m45373VM(C27373c c27373c) {
        AbstractC19074t.m100208f(c27373c, "video");
        this.f46077Y0 = c27373c;
        m45357xM();
    }

    /* renamed from: WM */
    public final void m45374WM() {
        Bundle bundle = new Bundle();
        bundle.putLong("albumid", this.f46075W0.m46300c().m46277e());
        bundle.putString("title", this.f46075W0.m46300c().m46286n());
        bundle.putString("desc", this.f46075W0.m46300c().m46274b());
        bundle.putParcelable("theme", this.f46075W0.m46300c().m46285m());
        bundle.putParcelableArrayList("medialist", this.f46076X0);
        bundle.putSerializable("videoinfo", this.f46077Y0);
        bundle.putInt("mode", 2);
        bundle.putString("extra_entry_point_flow", this.f46068P0.m154277l());
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ProfileAlbumCreateView.class, bundle, 1000, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        m45365MM();
        if (!this.f46078Z0) {
            mo78955kl(new Runnable() { // from class: co.r
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAlbumPreviewAlbumView.m45334UM(ProfileAlbumPreviewAlbumView.this);
                }
            }, 500L);
        }
    }

    /* renamed from: ZM */
    public final void m45375ZM(ProfilePreviewAlbumItem profilePreviewAlbumItem, PrivacyInfo privacyInfo, ArrayList arrayList, C27373c c27373c) {
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "albumItem");
        AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
        AbstractC19074t.m100208f(arrayList, "mediaList");
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_CREATE_ALBUM_ITEM", profilePreviewAlbumItem);
            bundle.putParcelable("EXTRA_PRIVACY_UPDATE", privacyInfo);
            bundle.putBoolean("EXTRA_AUTO_ADD_PHOTO_TO_ALBUM", true);
            if (!arrayList.isEmpty()) {
                bundle.putBoolean("multiUpload", true);
                bundle.putParcelableArrayList("extra_initial_photos", arrayList);
            } else if (c27373c != null) {
                bundle.putSerializable("extra_video_info", c27373c);
            }
            bundle.putSerializable("media_type", 1);
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(UpdateStatusView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bN */
    public final void m45376bN(boolean z11) {
        this.f46084f1 = z11;
    }

    /* renamed from: cN */
    public final void m45377cN(boolean z11) {
        this.f46086h1 = z11;
    }

    /* renamed from: dN */
    public final void m45378dN(boolean z11) {
        this.f46078Z0 = z11;
    }

    /* renamed from: eN */
    public final void m45379eN(ProfileAlbumThemeCollection profileAlbumThemeCollection) {
        AbstractC19074t.m100208f(profileAlbumThemeCollection, "<set-?>");
        this.f46085g1 = profileAlbumThemeCollection;
    }

    /* renamed from: gN */
    public final void m45380gN(final int i11, final int i12) {
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.runOnUiThread(new Runnable() { // from class: co.s
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileAlbumPreviewAlbumView.m45341hN(ProfileAlbumPreviewAlbumView.this, i11, i12);
                }
            });
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProfileAlbumPreviewAlbumView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(final int i11, final int i12, final Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 != 1000) {
            if (i11 != 1001) {
                if (i11 == 2001 || i11 == 11111 || i11 == 11112) {
                    this.f72827B0.postDelayed(new Runnable() { // from class: co.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfileAlbumPreviewAlbumView.m45332OM(ProfileAlbumPreviewAlbumView.this, i11, i12, intent);
                        }
                    }, 200L);
                    return;
                }
                return;
            }
            m45326EM(i12, intent);
            return;
        }
        if (i12 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("title_updated");
            if (stringExtra != null) {
                ProfileAlbumHeader m46300c = this.f46075W0.m46300c();
                AbstractC19074t.m100205c(stringExtra);
                m46300c.m46271D(stringExtra);
            }
            String stringExtra2 = intent.getStringExtra("desc_updated");
            if (stringExtra2 != null) {
                ProfileAlbumHeader m46300c2 = this.f46075W0.m46300c();
                AbstractC19074t.m100205c(stringExtra2);
                m46300c2.m46291u(stringExtra2);
            }
            ThemeItem themeItem = (ThemeItem) intent.getParcelableExtra("theme_updated");
            if (themeItem != null) {
                ProfileAlbumHeader m46300c3 = this.f46075W0.m46300c();
                AbstractC19074t.m100205c(themeItem);
                m46300c3.m46270C(themeItem);
            }
            m45357xM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (m45364LM()) {
                QuickPickerView quickPickerView = this.f46080b1;
                if (quickPickerView != null) {
                    return quickPickerView.onKeyUp(i11, keyEvent);
                }
                return false;
            }
            if (m45363KM()) {
                m45372Tr();
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: vM */
    public final void m45381vM() {
        if (this.f46084f1) {
            return;
        }
        this.f46084f1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C8510e());
        c0766k.m1851j(this.f46075W0.m46300c().m46286n(), this.f46075W0.m46300c().m46274b(), this.f46075W0.m46300c().m46282j(), this.f46075W0.m46300c().m46285m().getId(), C32017m4.m154326S().m154373s(this.f46068P0));
    }

    /* renamed from: wM */
    public final void m45382wM() {
        if (this.f46086h1) {
            return;
        }
        this.f46086h1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C8511f());
        c0766k.m1817K(0, 40, C23250w4.m119786E());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m45327FM(bundle);
    }

    /* renamed from: yM */
    public final ProfileAlbumItem m45383yM() {
        return this.f46075W0;
    }

    /* renamed from: yt */
    public final void m45384yt(final int i11) {
        C30085v9 c30085v9 = this.f46070R0;
        if (c30085v9 == null) {
            AbstractC19074t.m100223u("binding");
            c30085v9 = null;
        }
        c30085v9.getRoot().post(new Runnable() { // from class: co.w
            @Override // java.lang.Runnable
            public final void run() {
                ProfileAlbumPreviewAlbumView.m45335XM(ProfileAlbumPreviewAlbumView.this, i11);
            }
        });
    }

    /* renamed from: zM */
    public final int m45385zM() {
        if (!m45358AM().isEmpty()) {
            return m45358AM().size();
        }
        if (this.f46077Y0 != null) {
            return 1;
        }
        return 0;
    }
}
