package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.core.graphics.C1421e;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.PreviewCropOverlayView;
import com.zing.zalo.photoview.PhotoView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import hu.AbstractC20130d;
import hu.C20128b;
import im.C20612c;
import im.C20620k;
import is.AbstractC20826v0;
import k30.C21459a;
import me0.AbstractC23006a0;
import me0.AbstractC23041d2;
import me0.AbstractC23047d8;
import me0.AbstractC23067f6;
import me0.AbstractC23136l9;
import me0.AbstractC23254w8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p173fz.C19172a;
import p239ih.C20551a;
import p239ih.C20556f;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p555uq.C27357a;
import p558uu.InterfaceC27367c;
import p716zh.C32002l4;
import p716zh.C32017m4;
import sa0.C26209i;
import vg.AbstractC28025b8;

/* loaded from: classes6.dex */
public class PreviewUpdateAvatarView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: N0 */
    View f76070N0;

    /* renamed from: O0 */
    PhotoView f76071O0;

    /* renamed from: P0 */
    PreviewCropOverlayView f76072P0;

    /* renamed from: Q0 */
    View f76073Q0;

    /* renamed from: R0 */
    View f76074R0;

    /* renamed from: S0 */
    CheckBox f76075S0;

    /* renamed from: T0 */
    View f76076T0;

    /* renamed from: U0 */
    View f76077U0;

    /* renamed from: V0 */
    View f76078V0;

    /* renamed from: W0 */
    C13306b f76079W0;

    /* renamed from: Y0 */
    C23528a f76081Y0;

    /* renamed from: Z0 */
    String f76082Z0;

    /* renamed from: a1 */
    String f76083a1;

    /* renamed from: b1 */
    String f76084b1;

    /* renamed from: c1 */
    String f76085c1;

    /* renamed from: d1 */
    private boolean f76086d1;

    /* renamed from: M0 */
    public C32002l4 f76069M0 = C32002l4.m154264g(48);

    /* renamed from: X0 */
    C13306b.c f76080X0 = new C14772a();

    /* renamed from: e1 */
    private boolean f76087e1 = false;

    /* renamed from: f1 */
    private boolean f76088f1 = false;

    /* renamed from: g1 */
    private int f76089g1 = -1;

    /* renamed from: h1 */
    private String f76090h1 = "";

    /* renamed from: com.zing.zalo.ui.zviews.PreviewUpdateAvatarView$a */
    /* loaded from: classes6.dex */
    class C14772a extends C13306b.c {
        C14772a() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130831H;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            str.hashCode();
            if (!str.equals("tip.pushfeed.avatar")) {
                return null;
            }
            return new C26209i(PreviewUpdateAvatarView.this.f76075S0);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (PreviewUpdateAvatarView.this.f72421L0.m92672lJ() && PreviewUpdateAvatarView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PreviewUpdateAvatarView$b */
    /* loaded from: classes6.dex */
    public class C14773b extends C23999j {
        C14773b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null && c3979l.m18839c() != null) {
                PreviewUpdateAvatarView.this.m82824vM(c3979l.m18839c().getWidth(), c3979l.m18839c().getHeight());
                if (PreviewUpdateAvatarView.this.f76087e1 && PreviewUpdateAvatarView.this.f76082Z0.startsWith("http")) {
                    PreviewUpdateAvatarView.this.f76090h1 = c3979l.m18848l();
                    return;
                }
                return;
            }
            AbstractC23136l9.m118744r1(PreviewUpdateAvatarView.this.f76078V0, 0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PreviewUpdateAvatarView$c */
    /* loaded from: classes6.dex */
    public class C14774c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C24003n f76093l1;

        /* renamed from: com.zing.zalo.ui.zviews.PreviewUpdateAvatarView$c$a */
        /* loaded from: classes6.dex */
        class a extends C23999j {
            a() {
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                PreviewUpdateAvatarView.this.m82829uM(false);
                if (c3979l != null && c3979l.m18839c() != null) {
                    if (PreviewUpdateAvatarView.this.f76087e1 && PreviewUpdateAvatarView.this.f76082Z0.startsWith("http")) {
                        PreviewUpdateAvatarView.this.f76090h1 = c3979l.m18848l();
                    }
                    PreviewUpdateAvatarView.this.m82824vM(c3979l.m18839c().getWidth(), c3979l.m18839c().getHeight());
                    return;
                }
                AbstractC23136l9.m118744r1(PreviewUpdateAvatarView.this.f76078V0, 0);
            }
        }

        C14774c(C24003n c24003n) {
            this.f76093l1 = c24003n;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null && c3979l.m18839c() != null) {
                PreviewUpdateAvatarView.this.m82829uM(true);
                this.f76093l1.f116261b = new BitmapDrawable(PreviewUpdateAvatarView.this.m92651WI(), c3979l.m18839c());
                PreviewUpdateAvatarView previewUpdateAvatarView = PreviewUpdateAvatarView.this;
                ((C23528a) previewUpdateAvatarView.f76081Y0.m123612r(previewUpdateAvatarView.f76071O0)).m123579C(PreviewUpdateAvatarView.this.f76082Z0, this.f76093l1, new a());
                return;
            }
            PreviewUpdateAvatarView.this.m82829uM(false);
            AbstractC23136l9.m118744r1(PreviewUpdateAvatarView.this.f76078V0, 0);
        }
    }

    /* renamed from: mM */
    private C20612c m82818mM(String str) {
        C23307g m118367a = AbstractC23067f6.m118367a(str);
        return new C20612c(4, 53, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107363n(str).m107353d(AbstractC23041d2.m118216o(str)).m107350a());
    }

    /* renamed from: nM */
    private void m82819nM(String str, boolean z11, String str2) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC20826v0.m108786T0(m92656bJ(), str, 3000);
        } else {
            TrackingSource m154339K = C32017m4.m154326S().m154339K(this.f76069M0);
            int i11 = this.f76089g1;
            if (i11 != -1) {
                m154339K.m40677a("eventType", Integer.valueOf(i11));
            }
            AbstractC23306f.m120609P1().m101508a(new C27357a.a(this.f76084b1, z11, str2, m154339K, this.f76087e1));
        }
        if (this.f76088f1) {
            C23744a.m124114c().m124116d(9007, new Object[0]);
        }
    }

    /* renamed from: oM */
    public /* synthetic */ void m82820oM(C1421e c1421e) {
        View view = this.f76070N0;
        view.setPadding(view.getPaddingLeft(), this.f76070N0.getPaddingTop(), this.f76070N0.getPaddingRight(), c1421e.f6233d);
    }

    /* renamed from: pM */
    public /* synthetic */ void m82821pM() {
        int i11;
        boolean m48336k;
        String m107293q;
        try {
            try {
                if (AbstractC23006a0.m117913i(this.f72421L0.m92648SI()) < 48) {
                    i11 = 612;
                } else {
                    i11 = -1;
                }
                m48336k = this.f76071O0.m48336k(this.f76084b1, this.f76072P0.getHighlightCropRect(), i11);
                m107293q = m82818mM(this.f76085c1).m107293q();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            }
            if (m48336k) {
                m82826lM(m107293q);
                return;
            }
            throw new Exception("cropWithSourceRatio failed");
        } finally {
            this.f76086d1 = false;
        }
    }

    /* renamed from: qM */
    public /* synthetic */ void m82822qM(boolean z11) {
        try {
            View view = this.f76074R0;
            int i11 = 0;
            if (!z11) {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(view, i11);
            View view2 = this.f76077U0;
            if (view2 != null) {
                view2.setEnabled(!z11);
                this.f76077U0.setClickable(!z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    public /* synthetic */ void m82823rM(int i11, int i12, int i13, int i14) {
        int i15;
        try {
            if (i11 >= i12 && i13 >= i14) {
                this.f76071O0.setAllowScale(true);
                float f11 = i14;
                if (((int) ((f11 / this.f76071O0.getHeight()) * this.f76071O0.getWidth())) < i12) {
                    i15 = (int) ((i12 / this.f76071O0.getWidth()) * this.f76071O0.getHeight());
                } else {
                    i15 = i14;
                }
                if (((int) ((i12 / this.f76071O0.getWidth()) * this.f76071O0.getHeight())) < i14) {
                    i12 = (int) ((f11 / this.f76071O0.getHeight()) * this.f76071O0.getWidth());
                }
                float f12 = i11 / i12;
                float f13 = i13 / i15;
                if (f12 < 1.0f) {
                    f12 = f13;
                } else if (f13 >= 1.0f) {
                    f12 = Math.min(f12, f13);
                }
                this.f76071O0.m48338q(1.0f, (f12 + 1.0f) / 2.0f, f12);
                return;
            }
            this.f76071O0.setAllowScale(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: vM */
    public void m82824vM(int i11, int i12) {
        int m100599j = C19172a.m100599j("safety@social@upload@min_w_ava");
        int m100599j2 = C19172a.m100599j("safety@social@upload@min_h_ava");
        PhotoView photoView = this.f76071O0;
        if (photoView != null && m100599j > 0 && m100599j2 > 0) {
            photoView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.f60

                /* renamed from: q */
                public final /* synthetic */ int f80322q;

                /* renamed from: r */
                public final /* synthetic */ int f80323r;

                /* renamed from: s */
                public final /* synthetic */ int f80324s;

                /* renamed from: t */
                public final /* synthetic */ int f80325t;

                public /* synthetic */ f60(int i112, int i13, int i122, int i14) {
                    r2 = i112;
                    r3 = i13;
                    r4 = i122;
                    r5 = i14;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PreviewUpdateAvatarView.this.m82823rM(r2, r3, r4, r5);
                }
            }, 100L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        boolean z11;
        int i11;
        String str2;
        String str3;
        String str4;
        String str5;
        super.mo37111CJ(bundle);
        String str6 = "";
        if (bundle != null) {
            if (!bundle.containsKey("EXTRA_CURRENT_IMAGE_PATH")) {
                str2 = "";
            } else {
                str2 = bundle.getString("EXTRA_CURRENT_IMAGE_PATH");
            }
            this.f76082Z0 = str2;
            if (!bundle.containsKey("EXTRA_IMAGE_CACHE_URL")) {
                str3 = "";
            } else {
                str3 = bundle.getString("EXTRA_IMAGE_CACHE_URL");
            }
            this.f76083a1 = str3;
            if (!bundle.containsKey("EXTRA_CROPPED_PATH")) {
                str4 = "";
            } else {
                str4 = bundle.getString("EXTRA_CROPPED_PATH");
            }
            this.f76084b1 = str4;
            if (!bundle.containsKey("EXTRA_ORIGINAL_PATH")) {
                str5 = "";
            } else {
                str5 = bundle.getString("EXTRA_ORIGINAL_PATH");
            }
            this.f76085c1 = str5;
        }
        boolean z12 = true;
        m92637BK(true);
        this.f76081Y0 = new C23528a(getContext());
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (!m92642L3.containsKey("STR_EXTRA_IMG_PATH")) {
                str = "";
            } else {
                str = m92642L3.getString("STR_EXTRA_IMG_PATH");
            }
            this.f76082Z0 = str;
            this.f76085c1 = str;
            if (m92642L3.containsKey("STR_EXTRA_IMG_CACHE_URL")) {
                str6 = m92642L3.getString("STR_EXTRA_IMG_CACHE_URL");
            }
            this.f76083a1 = str6;
            if (m92642L3.containsKey("EXTRA_UPDATE_AVT_DIRECTLY") && m92642L3.getBoolean("EXTRA_UPDATE_AVT_DIRECTLY", false)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f76087e1 = z11;
            if (!m92642L3.containsKey("EXTRA_IS_FROM_MINI_APP") || !m92642L3.getBoolean("EXTRA_IS_FROM_MINI_APP", false)) {
                z12 = false;
            }
            this.f76088f1 = z12;
            if (m92642L3.containsKey("EXTRA_EVENT_TYPE")) {
                i11 = m92642L3.getInt("EXTRA_EVENT_TYPE");
            } else {
                i11 = -1;
            }
            this.f76089g1 = i11;
            this.f76069M0 = C32002l4.m154269m(m92642L3.getString("EXTRA_ENTRY_POINT_FLOW")).m154271a(48);
        }
        this.f76084b1 = AbstractC23254w8.m119854b(AbstractC20130d.m104874i0() + System.currentTimeMillis() + ".jpg").getPath();
        this.f76079W0 = new C13306b(m92648SI());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            this.f76077U0 = actionBarMenu.m92738e(AbstractC6918a0.menu_edit, AbstractC16803z.icn_social_form_edit);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.preview_update_avatar_view, viewGroup, false);
        this.f76070N0 = inflate;
        SystemUI.m89412p(inflate).m89430n(new InterfaceC27367c() { // from class: com.zing.zalo.ui.zviews.d60
            public /* synthetic */ d60() {
            }

            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                PreviewUpdateAvatarView.this.m82820oM(c1421e);
            }
        });
        return this.f76070N0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC6918a0.menu_edit) {
            m82828tM();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13306b c13306b = this.f76079W0;
        if (c13306b != null) {
            c13306b.m74709u();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            bundle.putString("EXTRA_CURRENT_IMAGE_PATH", this.f76082Z0);
            bundle.putString("EXTRA_IMAGE_CACHE_URL", this.f76083a1);
            bundle.putString("EXTRA_CROPPED_PATH", this.f76084b1);
            bundle.putString("EXTRA_ORIGINAL_PATH", this.f76085c1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            ActionBar actionBar2 = this.f88760a0;
            actionBar2.setBackgroundColor(AbstractC23136l9.m118641B(actionBar2.getContext(), AbstractC16801x.Dark_HeaderStartColor));
            this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.action_bar_title_preview_avatar));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f76079W0;
        if (c13306b != null) {
            c13306b.m74697c(this.f76080X0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C13306b c13306b = this.f76079W0;
        if (c13306b != null) {
            c13306b.m74701i();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        PhotoView photoView = (PhotoView) this.f76070N0.findViewById(AbstractC6918a0.preview_photo_view);
        this.f76071O0 = photoView;
        if (photoView != null) {
            photoView.setAllowScrollingAway(false);
        }
        this.f76072P0 = (PreviewCropOverlayView) this.f76070N0.findViewById(AbstractC6918a0.crop_overlay_view);
        View findViewById = this.f76070N0.findViewById(AbstractC6918a0.btn_done);
        this.f76073Q0 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.f76074R0 = this.f76070N0.findViewById(AbstractC6918a0.pb_load_image);
        boolean z11 = true;
        if (AbstractC23309i.m122230o1() != 1) {
            z11 = false;
        }
        CheckBox checkBox = (CheckBox) this.f76070N0.findViewById(AbstractC6918a0.cb_push_feed_update);
        this.f76075S0 = checkBox;
        if (checkBox != null) {
            checkBox.setChecked(z11);
        }
        View findViewById2 = this.f76070N0.findViewById(AbstractC6918a0.tv_push_feed_update);
        this.f76076T0 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        View findViewById3 = this.f76070N0.findViewById(AbstractC6918a0.btn_retry);
        this.f76078V0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        m82825kM();
        C13306b c13306b = this.f76079W0;
        if (c13306b != null) {
            c13306b.m74714z("tip.pushfeed.avatar", 0);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PreviewUpdateAvatarView";
    }

    /* renamed from: kM */
    void m82825kM() {
        boolean z11;
        try {
            if (C21459a.m111035c(C20128b.m104773t()) < 2048.0d) {
                z11 = true;
            } else {
                z11 = false;
            }
            C24003n m120072H = C23278z2.m120072H();
            if (z11) {
                m120072H.f116260a = AbstractC23006a0.m117875E();
            }
            if (C23999j.m125696L2(this.f76082Z0, m120072H)) {
                m82829uM(false);
                ((C23528a) this.f76081Y0.m123612r(this.f76071O0)).m123579C(this.f76082Z0, m120072H, new C14773b());
            } else {
                ((C23528a) this.f76081Y0.m123612r(this.f76071O0)).m123579C(this.f76082Z0, C23278z2.m120074I(), new C14774c(m120072H));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0029, B:9:0x0037, B:10:0x0086, B:12:0x008a, B:15:0x0091, B:17:0x0095, B:18:0x00cb, B:21:0x0099, B:23:0x00b2, B:24:0x00c7, B:25:0x00bd, B:27:0x0033, B:30:0x006f, B:32:0x0078, B:33:0x00cf), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0029, B:9:0x0037, B:10:0x0086, B:12:0x008a, B:15:0x0091, B:17:0x0095, B:18:0x00cb, B:21:0x0099, B:23:0x00b2, B:24:0x00c7, B:25:0x00bd, B:27:0x0033, B:30:0x006f, B:32:0x0078, B:33:0x00cf), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0029, B:9:0x0037, B:10:0x0086, B:12:0x008a, B:15:0x0091, B:17:0x0095, B:18:0x00cb, B:21:0x0099, B:23:0x00b2, B:24:0x00c7, B:25:0x00bd, B:27:0x0033, B:30:0x006f, B:32:0x0078, B:33:0x00cf), top: B:1:0x0000 }] */
    /* renamed from: lM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m82826lM(String str) {
        CheckBox checkBox;
        try {
            String str2 = this.f76084b1;
            if (str2 != null) {
                C23307g m118367a = AbstractC23067f6.m118367a(str2);
                C20556f c20556f = new C20556f(this.f76084b1);
                int m100599j = C19172a.m100599j("safety@social@upload@min_size_ava");
                int i11 = m100599j / 1024;
                int m100599j2 = C19172a.m100599j("safety@social@upload@min_w_ava");
                int m100599j3 = C19172a.m100599j("safety@social@upload@min_h_ava");
                String str3 = "";
                boolean z11 = false;
                if (m100599j2 > 0) {
                    if (m118367a.f113474a >= m100599j2) {
                    }
                    Pair m118250b = AbstractC23047d8.m118250b(this.f76071O0.getWidth(), this.f76071O0.getHeight(), m100599j2, m100599j3);
                    str3 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_avt_err_dimen_too_small, Integer.valueOf(((Integer) m118250b.first).intValue()), Integer.valueOf(((Integer) m118250b.second).intValue()));
                    checkBox = this.f76075S0;
                    if (checkBox != null && checkBox.isChecked()) {
                        z11 = true;
                    }
                    if (this.f76087e1) {
                        m82819nM(str3, z11, str);
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("EXTRA_CROPPED_PATH", this.f76084b1);
                        intent.putExtra("EXTRA_ORIGINAL_PATH", this.f76085c1);
                        if (!TextUtils.isEmpty(str3)) {
                            intent.putExtra("EXTRA_IS_ERROR", true);
                            intent.putExtra("EXTRA_ERROR_MSG", str3);
                        } else {
                            intent.putExtra("EXTRA_SHOULD_PUSH_FEED", z11);
                            intent.putExtra("EXTRA_CAMERA_LOG", str);
                        }
                        mo50035CK(-1, intent);
                    }
                    finish();
                    return;
                }
                if (m100599j3 <= 0 || m118367a.f113475b >= m100599j3) {
                    if (m100599j > 0 && c20556f.m106845r() < m100599j) {
                        str3 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_avt_err_file_size_too_small, Integer.valueOf(i11));
                    }
                    checkBox = this.f76075S0;
                    if (checkBox != null) {
                        z11 = true;
                    }
                    if (this.f76087e1) {
                    }
                    finish();
                    return;
                }
                Pair m118250b2 = AbstractC23047d8.m118250b(this.f76071O0.getWidth(), this.f76071O0.getHeight(), m100599j2, m100599j3);
                str3 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_avt_err_dimen_too_small, Integer.valueOf(((Integer) m118250b2.first).intValue()), Integer.valueOf(((Integer) m118250b2.second).intValue()));
                checkBox = this.f76075S0;
                if (checkBox != null) {
                }
                if (this.f76087e1) {
                }
                finish();
                return;
            }
            AbstractC23350e.m122774d("PreviewUpdateAvatarView", "not defined image url");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 10001 && i12 == -1 && intent != null) {
            intent.getStringExtra("extra_result_original_path");
            this.f76082Z0 = intent.getStringExtra("extra_result_output_path");
            this.f76083a1 = "";
            m82825kM();
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_done) {
            m82827sM();
            return;
        }
        if (id2 == AbstractC6918a0.tv_push_feed_update) {
            CheckBox checkBox = this.f76075S0;
            if (checkBox != null) {
                checkBox.setChecked(!checkBox.isChecked());
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_retry) {
            AbstractC23136l9.m118744r1(this.f76078V0, 8);
            m82829uM(true);
            m82825kM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C13306b c13306b = this.f76079W0;
        if (c13306b != null) {
            c13306b.m74710v();
        }
    }

    /* renamed from: sM */
    void m82827sM() {
        try {
            if (this.f76086d1) {
                return;
            }
            this.f76086d1 = true;
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.e60
                public /* synthetic */ e60() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PreviewUpdateAvatarView.this.m82821pM();
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: tM */
    void m82828tM() {
        try {
            if (TextUtils.isEmpty(this.f76082Z0)) {
                return;
            }
            String str = this.f76082Z0;
            if (this.f76087e1 && !TextUtils.isEmpty(this.f76090h1)) {
                str = this.f76090h1;
            }
            if (TextUtils.isEmpty(this.f76090h1) && !C20551a.m106806a(str)) {
                ToastUtils.m89273u();
                return;
            }
            AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 10001, 1, CameraInputParams.m39211x(str, this.f76083a1));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uM */
    void m82829uM(boolean z11) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.c60

            /* renamed from: q */
            public final /* synthetic */ boolean f79995q;

            public /* synthetic */ c60(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PreviewUpdateAvatarView.this.m82822qM(r2);
            }
        });
    }
}
