package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import ao.InterfaceC2259a;
import ao.InterfaceC2263e;
import bo.C2949b;
import bo.C2954c;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3033r3;
import bo.C3063z0;
import bo.EnumC2963d3;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p077ui.picker.location.MapInAppView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.social.controls.AbstractC10871j;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.animation.AnimationTarget;
import ho0.AbstractC20110a;
import i40.C20275e;
import ig0.AbstractC20550a;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import is.AbstractC20828w0;
import kd0.C21693c;
import l30.AbstractC22055v0;
import l30.C22033k0;
import l80.C22129e;
import me0.AbstractC23047d8;
import me0.AbstractC23059e9;
import me0.AbstractC23152n3;
import mm0.AbstractC23350e;
import nb0.C23672c;
import p172fy.C19171b;
import p304ks.C21933s;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p494rv.C25979a;
import p510sq.C26365a;
import p716zh.C31874cb;
import p716zh.C31877d;
import p716zh.C32002l4;
import p716zh.C32106s7;
import vg.AbstractC28207v1;
import vg.C28100j3;
import vg.C28209v3;

/* loaded from: classes6.dex */
public abstract class FeedCallbackZaloView extends SlidableZaloView implements InterfaceC2259a, InterfaceC10867f, InterfaceC2263e {

    /* renamed from: P0 */
    protected boolean f73260P0 = true;

    /* renamed from: Q0 */
    AbstractC22055v0.g f73261Q0 = new C14255a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.FeedCallbackZaloView$a */
    /* loaded from: classes6.dex */
    public class C14255a implements AbstractC22055v0.g {
        C14255a() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: O */
        public void mo46561O() {
        }

        @Override // l30.AbstractC22055v0.g
        /* renamed from: a */
        public void mo46562a(String str, C22033k0.g gVar) {
            if (FeedCallbackZaloView.this.m92672lJ()) {
                ToastUtils.showMess(str);
            }
            mo46561O();
        }
    }

    /* renamed from: oM */
    private void m79518oM(boolean z11, C3000l0 c3000l0, int i11, int i12) {
        AbstractC23059e9.m118318G(3);
        if (c3000l0 == null) {
            return;
        }
        String m47566x = FeedActionZUtils.m47566x(c3000l0, i11);
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(m47566x, m79520hM()).m135741H(AbstractC20828w0.Companion.m108853b(c3000l0.m14324b0(i11))).m135739F(FeedActionZUtils.m47561s(z11, c3000l0, i11)).m135743b(), i12, 1));
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: AD */
    public void mo11915AD(String str, String str2, TrackingSource trackingSource, C32002l4 c32002l4) {
        try {
            C17487o0 mo35579p = this.f72421L0.m92676n2().mo35579p();
            if (!TextUtils.isEmpty(str) && mo35579p != null) {
                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(str, c32002l4).m135739F(str2).m135741H(trackingSource).m135743b(), 0, 1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Ak */
    public void mo11916Ak(int i11, String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:2:0x0000, B:9:0x0010, B:11:0x0020, B:13:0x0026, B:15:0x0032, B:16:0x0059, B:18:0x005f, B:22:0x0067, B:25:0x0042), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    @Override // ao.InterfaceC2259a
    /* renamed from: Bz */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo11917Bz(C3020p0 c3020p0, int i11) {
        int mo46047iM;
        try {
            int i12 = c3020p0.f12058q;
            if (i12 != 2 && i12 != 3) {
                if (i12 == 23) {
                    C2954c c2954c = (C2954c) c3020p0.f12023C.f12107P.get(i11);
                    if (c2954c.m13986a() != null && c2954c.m13990e()) {
                        ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
                        itemAlbumMobile.m40519e0(c2954c);
                        if (itemAlbumMobile.f42591p == 1) {
                            QuickPreviewZView.m83490fM(this.f72421L0.m92676n2().mo35579p(), null, 0, itemAlbumMobile);
                        }
                    }
                }
                mo46047iM = mo46047iM();
                if (mo46047iM != 1) {
                    AbstractC23647d.m123897g("49150101");
                    return;
                } else {
                    if (mo46047iM == 2) {
                        AbstractC23647d.m123897g("655001");
                        return;
                    }
                    return;
                }
            }
            QuickPreviewZView.m83490fM(this.f72421L0.m92676n2().mo35579p(), null, 0, (ItemAlbumMobile) c3020p0.f12023C.f12118i.get(i11));
            mo46047iM = mo46047iM();
            if (mo46047iM != 1) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: CB */
    public void mo11918CB(int i11) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Eu */
    public void mo11919Eu(C3020p0 c3020p0, C3000l0 c3000l0, String str, Bundle bundle) {
    }

    @Override // com.zing.zalo.social.controls.InterfaceC10867f
    /* renamed from: Fj */
    public void mo43564Fj(String str, double d11, double d12) {
        try {
            Bundle bundle = new Bundle();
            bundle.putDouble("EXTRA_INIT_LONGTITUDE", d11);
            bundle.putDouble("EXTRA_INIT_LATITUDE", d12);
            this.f72421L0.m92676n2().mo35579p().m93069k2(MapInAppView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: GI */
    public void mo11920GI(C3000l0 c3000l0) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: HA */
    public void mo11921HA(C3000l0 c3000l0, int i11) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: HG */
    public void mo11922HG(Bundle bundle, int i11) {
        FeedActionZUtils.m47542b0(this.f72421L0.m92676n2(), bundle, i11);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Jd */
    public boolean mo11923Jd(C3020p0 c3020p0) {
        C32106s7 m154973b;
        if (c3020p0 == null || !c3020p0.m14480I() || (m154973b = C32106s7.m154973b(c3020p0)) == null) {
            return false;
        }
        this.f72421L0.m92676n2().mo35579p().m93069k2(OAVideoPlaylistView.class, OAVideoPlaylistView.m82410kM(m154973b, m154973b.m154978g(), 1), 2, true);
        return true;
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: KG */
    public void mo11924KG() {
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (super.mo37488Li() && this.f73260P0) {
            return true;
        }
        return false;
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: M2 */
    public void mo11925M2(C3000l0 c3000l0) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: M5 */
    public void mo11926M5(C2949b c2949b, int i11, C32002l4 c32002l4) {
        C17487o0 c17487o0;
        try {
            if (m92676n2() != null) {
                c17487o0 = m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            C17487o0 c17487o02 = c17487o0;
            if (c17487o02 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_user_id", c2949b.m13959b());
                bundle.putInt("extra_album_type", i11);
                bundle.putLong("extra_album_id", c2949b.m13958a());
                bundle.putInt("extra_preload_bg_color", c2949b.m13960c().getDecorItem().getBgColor());
                bundle.putInt("extra_preload_text_color", c2949b.m13960c().getContent().getTitleColor());
                bundle.putInt("extra_preload_text_color_01", c2949b.m13960c().getContent().getTextColor01());
                bundle.putInt("extra_preload_text_color_02", c2949b.m13960c().getContent().getTextColor02());
                bundle.putInt("extra_preload_arrow_color", c2949b.m13960c().getContent().getArrowColor());
                if (c32002l4 != null) {
                    bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
                }
                c17487o02.m93066i2(ProfileAlbumDetailView.class, bundle, mo79521jM(ProfileAlbumDetailView.class), 2, true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: N4 */
    public void mo11979N4(String str) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: O */
    public void mo11927O() {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Ou */
    public void mo11928Ou(String str, String str2, TrackingSource trackingSource, C32002l4 c32002l4) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Pw */
    public void mo11929Pw() {
        C17487o0 c17487o0;
        if (this.f72421L0.m92676n2() != null) {
            c17487o0 = this.f72421L0.m92676n2().mo35579p();
        } else {
            c17487o0 = null;
        }
        Context context = getContext();
        if (context == null) {
            context = MainApplication.getAppContext();
        }
        if (c17487o0 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_mode", 2);
            bundle.putInt("extra_init_page", C21933s.m114404I().f107899Z.f108001g + 1);
            bundle.putString("extra_title_action_bar", context.getString(AbstractC8020f0.suggestfriend_title));
            c17487o0.m93069k2(SuggestFriendDetailView.class, bundle, 1, true);
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Q2 */
    public void mo11930Q2(C3020p0 c3020p0, C32002l4 c32002l4) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: R5 */
    public void mo11931R5(C3020p0 c3020p0) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: R9 */
    public void mo11932R9(C3033r3 c3033r3) {
        try {
            AbstractC28207v1.m141994i3("action.open.channel_home", 4, m92676n2(), this, c3033r3.m14587a(), null);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: RC */
    public void mo11933RC(String str) {
        AbstractC23152n3.m119048i0(this.f72421L0.m92648SI(), str);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Sl */
    public void mo11934Sl(View view, C3000l0 c3000l0, int i11) {
        FeedActionZUtils.m47522J(view instanceof ImageView, c3000l0, i11, this.f72421L0.m92676n2(), this);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: T7 */
    public void mo11935T7(C3000l0 c3000l0, int i11) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Tt */
    public void mo11936Tt(C16719g c16719g, C3000l0 c3000l0, int i11, boolean z11, Bundle bundle) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Tu */
    public void mo11937Tu(Bundle bundle) {
        this.f72421L0.m92676n2().mo35579p().m93069k2(FeedDetailsView.class, bundle, 1, true);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: V2 */
    public void mo11938V2(String str, String str2, C31877d c31877d) {
        m78959pL(str, str2, 4, c31877d);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC20814p0.m108593A();
        AbstractC10871j.m56415d();
        C10866e.m56360g();
        AbstractC23047d8.m118262n();
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: We */
    public void mo11939We(View view, C3000l0 c3000l0, int i11) {
        m79518oM(view instanceof ImageView, c3000l0, i11, 0);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: X */
    public void mo11940X(C3000l0 c3000l0) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Yk */
    public void mo11941Yk(AnimationTarget animationTarget, String str, Bundle bundle, C20275e c20275e, C3020p0 c3020p0, TrackingSource trackingSource, boolean z11) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Ys */
    public void mo11942Ys(C3000l0 c3000l0, String str, boolean z11) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: Zf */
    public void mo11944Zf(C3000l0 c3000l0) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: af */
    public void mo11945af(C16719g c16719g, C3000l0 c3000l0, int i11) {
        boolean z11;
        if (!(c16719g instanceof C21693c) && !(c16719g instanceof C22129e)) {
            z11 = false;
        } else {
            z11 = true;
        }
        m79518oM(z11, c3000l0, i11, 0);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: b1 */
    public void mo11946b1() {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: bw */
    public void mo11947bw(C3000l0 c3000l0) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: c1 */
    public void mo11948c1(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            if (c3020p0.f12058q == 23) {
                mo79526pM(c3020p0);
            } else {
                FeedActionZUtils.m47540a0(c3020p0, mo79522kM());
            }
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: cm */
    public void mo11949cm(C16719g c16719g, C3000l0 c3000l0, int i11) {
        boolean z11;
        if (!(c16719g instanceof C21693c) && !(c16719g instanceof C22129e)) {
            z11 = false;
        } else {
            z11 = true;
        }
        FeedActionZUtils.m47522J(z11, c3000l0, i11, this.f72421L0.m92676n2(), this);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: cx */
    public void mo11950cx() {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: dx */
    public void mo11951dx(View view, C3000l0 c3000l0, int i11) {
        FeedActionZUtils.m47531S(view instanceof ImageView, c3000l0, i11, this.f72421L0.m92676n2(), this);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: f1 */
    public void mo11952f1(int i11, int i12, String str, int i13) {
        if (i11 > 0) {
            try {
                if (this.f72421L0.m92676n2() != null) {
                    AbstractC23152n3.m119066r0(this.f72421L0.m92676n2(), i11, "", i12, str, i13);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: fv */
    public void mo11953fv(boolean z11) {
        this.f73260P0 = z11;
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: fz */
    public void mo11954fz(C16719g c16719g, C3000l0 c3000l0, int i11) {
        boolean z11;
        if (!(c16719g instanceof C21693c) && !(c16719g instanceof C22129e)) {
            z11 = false;
        } else {
            z11 = true;
        }
        FeedActionZUtils.m47531S(z11, c3000l0, i11, this.f72421L0.m92676n2(), this);
    }

    /* renamed from: gM */
    public void m79519gM() {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: gn */
    public void mo11955gn(C3020p0 c3020p0) {
    }

    /* renamed from: hM */
    C32002l4 m79520hM() {
        if (this instanceof TimelineView) {
            return C32002l4.m154265h(10002, 2);
        }
        if (this instanceof FeedDetailsView) {
            return C32002l4.m154265h(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, 2);
        }
        if (this instanceof MutualFeedView) {
            return C32002l4.m154265h(10003, 2);
        }
        return C32002l4.m154264g(10000);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: i7 */
    public void mo11956i7() {
    }

    /* renamed from: iM */
    public abstract int mo46047iM();

    /* renamed from: jM */
    public int mo79521jM(Class cls) {
        return 0;
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: ji */
    public void mo11958ji(String str) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: k0 */
    public void mo11959k0(ContactProfile contactProfile) {
        AbstractC20826v0.m108848z0(this.f72421L0.m92676n2(), contactProfile);
    }

    /* renamed from: kM */
    protected FeedActionZUtils.InterfaceC8913k mo79522kM() {
        return null;
    }

    /* renamed from: kb */
    public void mo11980kb(String str, String str2) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: kq */
    public void mo11961kq(C3000l0 c3000l0, int i11) {
    }

    /* renamed from: lM */
    public void m79523lM(ContactProfile contactProfile) {
        FeedActionZUtils.m47523K(this.f72421L0.m92676n2(), contactProfile);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: lw */
    public void mo11962lw(int i11) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: mE */
    public void mo11963mE(AnimationTarget animationTarget, C23528a c23528a, String str, C20275e c20275e, Bundle bundle, int i11, C3020p0 c3020p0) {
    }

    /* renamed from: mM */
    public void mo79524mM() {
    }

    /* renamed from: nM */
    public void mo79525nM(Bundle bundle) {
        this.f72421L0.m92676n2().mo35579p().m93066i2(TagsListView.class, bundle, 1006, 0, true);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: o5 */
    public void mo11964o5() {
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (C25979a.m133814e(this, i11, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: op */
    public void mo11965op() {
    }

    /* renamed from: pM */
    public void mo79526pM(C3020p0 c3020p0) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: po */
    public void mo11966po() {
    }

    /* renamed from: qg */
    public void mo11981qg(String str, String str2, EnumC2963d3 enumC2963d3) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: rA */
    public void mo11967rA(Bundle bundle) {
        this.f72421L0.m92676n2().mo35579p().m93069k2(ShareView.class, bundle, 1, true);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: s5 */
    public void mo11968s5(C16719g c16719g, C3000l0 c3000l0, int i11, int i12) {
        boolean z11;
        if (!(c16719g instanceof C21693c) && !(c16719g instanceof C22129e)) {
            z11 = false;
        } else {
            z11 = true;
        }
        m79518oM(z11, c3000l0, i11, i12);
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: ta */
    public void mo11969ta(String str) {
        AbstractC23059e9.m118318G(3);
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(str, C32002l4.m154265h(10002, 3)).m135739F("18500").m135743b(), 0, 1));
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: tq */
    public void mo11970tq(String str) {
        try {
            AbstractC20550a.m106805b(this.f72421L0.m92648SI(), str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: un */
    public void mo11971un(C3063z0 c3063z0) {
        if (c3063z0 == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putDouble("EXTRA_INIT_LONGTITUDE", c3063z0.m153170b());
            bundle.putDouble("EXTRA_INIT_LATITUDE", c3063z0.m153169a());
            this.f72421L0.m92676n2().mo35579p().m93069k2(MapInAppView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: v3 */
    public void mo11972v3(C3020p0 c3020p0, C32002l4 c32002l4, int i11, int i12, int i13) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: vq */
    public void mo11973vq(String str, String str2, C31877d c31877d) {
        AbstractC28207v1.m141994i3(str, 0, this.f72421L0.m92676n2(), null, str2, c31877d);
    }

    @Override // com.zing.zalo.social.controls.InterfaceC10867f
    /* renamed from: wo */
    public void mo43565wo(C10866e c10866e, String str) {
        if (c10866e instanceof C23672c) {
            FeedActionZUtils.m47541b(this, new C28209v3(true, ((C23672c) c10866e).f114678g0, 2));
        } else {
            AbstractC10871j.m56416e(c10866e, str, this, this.f72421L0.m92676n2());
        }
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: wp */
    public void mo11974wp(C3020p0 c3020p0) {
        FeedActionZUtils.m47528P(c3020p0, this.f72421L0.m92676n2());
    }

    @Override // p489rn.C25927x0.a
    /* renamed from: x2 */
    public void mo36956x2(C31874cb c31874cb, int i11, int i12) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: xt */
    public void mo11975xt(String str, String str2, TrackingSource trackingSource) {
    }

    @Override // ao.InterfaceC2259a
    /* renamed from: xz */
    public void mo11976xz(C3000l0 c3000l0, int i11) {
    }

    @Override // com.zing.zalo.social.controls.InterfaceC10861a
    /* renamed from: yf */
    public void mo43566yf(C28100j3 c28100j3) {
    }

    /* renamed from: za */
    public void mo79527za(int i11, C3020p0 c3020p0, ContactProfile contactProfile) {
    }
}
