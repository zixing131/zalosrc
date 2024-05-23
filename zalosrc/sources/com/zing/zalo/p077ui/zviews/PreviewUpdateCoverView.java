package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import androidx.core.view.AbstractC1579n0;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView;
import com.zing.zalo.photoview.PhotoView;
import com.zing.zalo.photoview.ViewOnTouchListenerC9043a;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import hu.AbstractC20130d;
import hu.C20128b;
import im.C20612c;
import im.C20620k;
import k30.C21459a;
import me0.AbstractC23006a0;
import me0.AbstractC23041d2;
import me0.AbstractC23047d8;
import me0.AbstractC23067f6;
import me0.AbstractC23136l9;
import me0.AbstractC23199r6;
import me0.AbstractC23254w8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p173fz.C19172a;
import p239ih.C20551a;
import p239ih.C20556f;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import sa0.C26209i;
import vg.AbstractC28025b8;

/* loaded from: classes6.dex */
public class PreviewUpdateCoverView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    View f76096M0;

    /* renamed from: N0 */
    PhotoView f76097N0;

    /* renamed from: O0 */
    View f76098O0;

    /* renamed from: P0 */
    View f76099P0;

    /* renamed from: Q0 */
    CheckBox f76100Q0;

    /* renamed from: R0 */
    View f76101R0;

    /* renamed from: S0 */
    ViewOnTouchListenerC9043a f76102S0;

    /* renamed from: T0 */
    String f76103T0;

    /* renamed from: U0 */
    String f76104U0;

    /* renamed from: V0 */
    String f76105V0;

    /* renamed from: W0 */
    String f76106W0;

    /* renamed from: X0 */
    boolean f76107X0;

    /* renamed from: Y0 */
    View f76108Y0;

    /* renamed from: Z0 */
    int f76109Z0;

    /* renamed from: a1 */
    C13306b f76110a1;

    /* renamed from: c1 */
    AutoMeasureTextView f76112c1;

    /* renamed from: d1 */
    View f76113d1;

    /* renamed from: e1 */
    Avatar f76114e1;

    /* renamed from: f1 */
    C23528a f76115f1;

    /* renamed from: g1 */
    View f76116g1;

    /* renamed from: h1 */
    View f76117h1;

    /* renamed from: i1 */
    View f76118i1;

    /* renamed from: j1 */
    View f76119j1;

    /* renamed from: b1 */
    C13306b.c f76111b1 = new C14775a();

    /* renamed from: k1 */
    Handler f76120k1 = new HandlerC14778d(Looper.getMainLooper());

    /* renamed from: com.zing.zalo.ui.zviews.PreviewUpdateCoverView$a */
    /* loaded from: classes6.dex */
    class C14775a extends C13306b.c {
        C14775a() {
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
            if (!str.equals("tip.pushfeed.cover")) {
                return null;
            }
            return new C26209i(PreviewUpdateCoverView.this.f76100Q0);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (PreviewUpdateCoverView.this.f72421L0.m92672lJ() && PreviewUpdateCoverView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PreviewUpdateCoverView$b */
    /* loaded from: classes6.dex */
    public class C14776b extends C23999j {
        C14776b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null && c3979l.m18839c() != null) {
                PreviewUpdateCoverView.this.m82838rM(c3979l.m18839c().getWidth(), c3979l.m18839c().getHeight());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PreviewUpdateCoverView$c */
    /* loaded from: classes6.dex */
    public class C14777c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C24003n f76123l1;

        /* renamed from: com.zing.zalo.ui.zviews.PreviewUpdateCoverView$c$a */
        /* loaded from: classes6.dex */
        class a extends C23999j {
            a() {
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                AbstractC23136l9.m118744r1(PreviewUpdateCoverView.this.f76099P0, 8);
                View view = PreviewUpdateCoverView.this.f76108Y0;
                if (view != null) {
                    view.setEnabled(true);
                    PreviewUpdateCoverView.this.f76108Y0.setClickable(true);
                }
                if (c3979l != null && c3979l.m18839c() != null) {
                    PreviewUpdateCoverView.this.m82838rM(c3979l.m18839c().getWidth(), c3979l.m18839c().getHeight());
                }
            }
        }

        C14777c(C24003n c24003n) {
            this.f76123l1 = c24003n;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            this.f76123l1.f116261b = new BitmapDrawable(PreviewUpdateCoverView.this.m92651WI(), c3979l.m18839c());
            PreviewUpdateCoverView previewUpdateCoverView = PreviewUpdateCoverView.this;
            ((C23528a) previewUpdateCoverView.f76115f1.m123612r(previewUpdateCoverView.f76097N0)).m123579C(PreviewUpdateCoverView.this.f76103T0, this.f76123l1, new a());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.PreviewUpdateCoverView$d */
    /* loaded from: classes6.dex */
    class HandlerC14778d extends Handler {

        /* renamed from: a */
        final int f76126a;

        /* renamed from: b */
        int f76127b;

        HandlerC14778d(Looper looper) {
            super(looper);
            this.f76126a = 10;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            View view;
            try {
                if (message.what != 10000) {
                    super.handleMessage(message);
                    return;
                }
                PreviewUpdateCoverView previewUpdateCoverView = PreviewUpdateCoverView.this;
                View view2 = previewUpdateCoverView.f76113d1;
                if (view2 != null && previewUpdateCoverView.f76112c1 != null && view2.getHeight() != 0 && PreviewUpdateCoverView.this.f76112c1.getHeight() != 0 && (view = PreviewUpdateCoverView.this.f76116g1) != null && view.getLayoutParams() != null) {
                    this.f76127b = 0;
                    PreviewUpdateCoverView previewUpdateCoverView2 = PreviewUpdateCoverView.this;
                    if (previewUpdateCoverView2.f76097N0 != null) {
                        previewUpdateCoverView2.f76109Z0 = (int) (AbstractC23136l9.m118713h0() * 0.5f);
                        ViewGroup.LayoutParams layoutParams = PreviewUpdateCoverView.this.f76097N0.getLayoutParams();
                        PreviewUpdateCoverView previewUpdateCoverView3 = PreviewUpdateCoverView.this;
                        layoutParams.height = previewUpdateCoverView3.f76109Z0;
                        previewUpdateCoverView3.f76097N0.setLayoutParams(layoutParams);
                    }
                    PreviewUpdateCoverView previewUpdateCoverView4 = PreviewUpdateCoverView.this;
                    View view3 = previewUpdateCoverView4.f76116g1;
                    if (view3 != null && previewUpdateCoverView4.f76114e1 != null && previewUpdateCoverView4.f76112c1 != null) {
                        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                        PreviewUpdateCoverView previewUpdateCoverView5 = PreviewUpdateCoverView.this;
                        layoutParams2.height = (int) ((PreviewUpdateCoverView.this.f76114e1.getHeight() * 0.33333334f) + previewUpdateCoverView5.f76109Z0);
                        previewUpdateCoverView5.f76116g1.setLayoutParams(layoutParams2);
                    }
                    PreviewUpdateCoverView.this.m82842oM();
                    return;
                }
                int i11 = this.f76127b + 1;
                this.f76127b = i11;
                if (i11 < 10) {
                    PreviewUpdateCoverView.this.f76120k1.sendEmptyMessageDelayed(10000, 100L);
                } else {
                    this.f76127b = 0;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: hM */
    private C20612c m82834hM(String str) {
        C23307g m118367a = AbstractC23067f6.m118367a(str);
        return new C20612c(4, 54, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107363n(str).m107353d(AbstractC23041d2.m118216o(str)).m107350a());
    }

    /* renamed from: iM */
    public /* synthetic */ void m82835iM() {
        int i11;
        try {
            if (AbstractC23006a0.m117913i(this.f72421L0.m92648SI()) < 48) {
                i11 = 612;
            } else {
                i11 = -1;
            }
            boolean m48336k = this.f76097N0.m48336k(this.f76105V0, null, i11);
            String m107293q = m82834hM(this.f76106W0).m107293q();
            if (m48336k) {
                m82841nM(m107293q);
            } else {
                this.f76107X0 = false;
                AbstractC23350e.m122777g("cropWithSourceRatio failed", new Object[0]);
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f76107X0 = false;
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        } catch (OutOfMemoryError unused) {
            this.f76107X0 = false;
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.error_general_error_code, 78001));
            finish();
        }
    }

    /* renamed from: jM */
    public /* synthetic */ void m82836jM(float f11) {
        float height = f11 + this.f76116g1.getHeight();
        this.f76118i1.setTranslationY(-height);
        this.f76118i1.setPivotX(r0.getWidth() / 2.0f);
        this.f76118i1.setPivotY(0.0f);
        if (this.f76118i1.getMeasuredHeight() == 0) {
            AbstractC1579n0.m7847X0(this.f76118i1, 3.0f);
        } else {
            AbstractC1579n0.m7847X0(this.f76118i1, (r0.getMeasuredHeight() + height) / this.f76118i1.getMeasuredHeight());
        }
    }

    /* renamed from: kM */
    public /* synthetic */ void m82837kM(int i11, int i12, int i13, int i14) {
        int i15;
        try {
            if (i11 >= i12 && i13 >= i14) {
                this.f76097N0.setAllowScale(true);
                float f11 = i14;
                if (((int) ((f11 / this.f76097N0.getHeight()) * this.f76097N0.getWidth())) < i12) {
                    i15 = (int) ((i12 / this.f76097N0.getWidth()) * this.f76097N0.getHeight());
                } else {
                    i15 = i14;
                }
                if (((int) ((i12 / this.f76097N0.getWidth()) * this.f76097N0.getHeight())) < i14) {
                    i12 = (int) ((f11 / this.f76097N0.getHeight()) * this.f76097N0.getWidth());
                }
                float f12 = i11 / i12;
                float f13 = i13 / i15;
                if (f12 < 1.0f) {
                    f12 = f13;
                } else if (f13 >= 1.0f) {
                    f12 = Math.min(f12, f13);
                }
                this.f76097N0.m48338q(1.0f, (f12 + 1.0f) / 2.0f, f12);
                return;
            }
            this.f76097N0.setAllowScale(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: rM */
    public void m82838rM(int i11, int i12) {
        int m100599j = C19172a.m100599j("safety@social@upload@min_w_cover");
        int m100599j2 = C19172a.m100599j("safety@social@upload@min_h_cover");
        PhotoView photoView = this.f76097N0;
        if (photoView != null && m100599j > 0 && m100599j2 > 0) {
            photoView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.i60

                /* renamed from: q */
                public final /* synthetic */ int f80653q;

                /* renamed from: r */
                public final /* synthetic */ int f80654r;

                /* renamed from: s */
                public final /* synthetic */ int f80655s;

                /* renamed from: t */
                public final /* synthetic */ int f80656t;

                public /* synthetic */ i60(int i112, int i13, int i122, int i14) {
                    r2 = i112;
                    r3 = i13;
                    r4 = i122;
                    r5 = i14;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PreviewUpdateCoverView.this.m82837kM(r2, r3, r4, r5);
                }
            }, 100L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.mo37111CJ(bundle);
        m92637BK(true);
        String str6 = "";
        if (bundle != null) {
            if (!bundle.containsKey("EXTRA_CURRENT_IMAGE_PATH")) {
                str2 = "";
            } else {
                str2 = bundle.getString("EXTRA_CURRENT_IMAGE_PATH");
            }
            this.f76103T0 = str2;
            if (!bundle.containsKey("EXTRA_IMAGE_CACHE_URL")) {
                str3 = "";
            } else {
                str3 = bundle.getString("EXTRA_IMAGE_CACHE_URL");
            }
            this.f76104U0 = str3;
            if (!bundle.containsKey("EXTRA_CROPPED_PATH")) {
                str4 = "";
            } else {
                str4 = bundle.getString("EXTRA_CROPPED_PATH");
            }
            this.f76105V0 = str4;
            if (!bundle.containsKey("EXTRA_ORIGINAL_PATH")) {
                str5 = "";
            } else {
                str5 = bundle.getString("EXTRA_ORIGINAL_PATH");
            }
            this.f76106W0 = str5;
        }
        try {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                if (!m92642L3.containsKey("STR_EXTRA_IMG_PATH")) {
                    str = "";
                } else {
                    str = m92642L3.getString("STR_EXTRA_IMG_PATH");
                }
                this.f76103T0 = str;
                this.f76106W0 = str;
                if (m92642L3.containsKey("STR_EXTRA_IMG_CACHE_URL")) {
                    str6 = m92642L3.getString("STR_EXTRA_IMG_CACHE_URL");
                }
                this.f76104U0 = str6;
            }
            this.f76105V0 = AbstractC23254w8.m119854b(AbstractC20130d.m104874i0() + System.currentTimeMillis() + ".jpg").getPath();
            this.f76110a1 = new C13306b(m92648SI());
        } catch (Exception e11) {
            e11.printStackTrace();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            this.f76108Y0 = actionBarMenu.m92738e(AbstractC6918a0.menu_edit, AbstractC16803z.icn_social_form_edit);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.preview_update_cover_view, viewGroup, false);
        this.f76096M0 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = this.f76102S0;
            if (viewOnTouchListenerC9043a != null) {
                viewOnTouchListenerC9043a.m48387l();
            }
            super.mo39024IJ();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC6918a0.menu_edit) {
            m82840mM();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13306b c13306b = this.f76110a1;
        if (c13306b != null) {
            c13306b.m74709u();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            bundle.putString("EXTRA_CURRENT_IMAGE_PATH", this.f76103T0);
            bundle.putString("EXTRA_IMAGE_CACHE_URL", this.f76104U0);
            bundle.putString("EXTRA_CROPPED_PATH", this.f76105V0);
            bundle.putString("EXTRA_ORIGINAL_PATH", this.f76106W0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackgroundColor(AbstractC23136l9.m118641B(actionBar.getContext(), AbstractC16801x.Dark_HeaderStartColor));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.crop_cover_title));
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f76110a1;
        if (c13306b != null) {
            c13306b.m74697c(this.f76111b1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C13306b c13306b = this.f76110a1;
        if (c13306b != null) {
            c13306b.m74701i();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        ViewStub viewStub = (ViewStub) this.f76096M0.findViewById(AbstractC6918a0.stub_crop);
        viewStub.setLayoutResource(AbstractC7409c0.stub_crop_layout);
        viewStub.inflate();
        PhotoView photoView = (PhotoView) this.f76096M0.findViewById(AbstractC6918a0.cover_image);
        this.f76097N0 = photoView;
        if (photoView != null) {
            photoView.setAllowScrollingAway(false);
            this.f76102S0 = this.f76097N0.getPhotoViewAttacher();
        }
        View findViewById = this.f76096M0.findViewById(AbstractC6918a0.btn_done);
        this.f76098O0 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.f76099P0 = this.f76096M0.findViewById(AbstractC6918a0.pb_load_image);
        boolean z11 = true;
        if (AbstractC23309i.m122267p1() != 1) {
            z11 = false;
        }
        CheckBox checkBox = (CheckBox) this.f76096M0.findViewById(AbstractC6918a0.cb_push_feed_update);
        this.f76100Q0 = checkBox;
        if (checkBox != null) {
            checkBox.setChecked(z11);
        }
        View findViewById2 = this.f76096M0.findViewById(AbstractC6918a0.tv_push_feed_update);
        this.f76101R0 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        m82843pM();
        m82844qM();
        C13306b c13306b = this.f76110a1;
        if (c13306b != null) {
            c13306b.m74714z("tip.pushfeed.cover", 0);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PreviewUpdateCoverView";
    }

    /* renamed from: lM */
    void m82839lM() {
        try {
            if (this.f76107X0) {
                return;
            }
            this.f76107X0 = true;
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.h60
                public /* synthetic */ h60() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PreviewUpdateCoverView.this.m82835iM();
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: mM */
    void m82840mM() {
        try {
            if (TextUtils.isEmpty(this.f76103T0)) {
                return;
            }
            if (C20551a.m106806a(this.f76103T0)) {
                AbstractC22470k.m116167s(this.f72421L0.m92676n2(), 10001, 1, CameraInputParams.m39211x(this.f76103T0, this.f76104U0));
            } else {
                ToastUtils.m89273u();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    void m82841nM(String str) {
        try {
            if (this.f76105V0 != null) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_CROPPED_PATH", this.f76105V0);
                intent.putExtra("EXTRA_ORIGINAL_PATH", this.f76106W0);
                C23307g m118367a = AbstractC23067f6.m118367a(this.f76105V0);
                C20556f c20556f = new C20556f(this.f76105V0);
                int m100599j = C19172a.m100599j("safety@social@upload@min_size_cover");
                int i11 = m100599j / 1024;
                int m100599j2 = C19172a.m100599j("safety@social@upload@min_w_cover");
                int m100599j3 = C19172a.m100599j("safety@social@upload@min_h_cover");
                boolean z11 = false;
                if (m100599j2 > 0) {
                    if (m118367a.f113474a >= m100599j2) {
                    }
                    Pair m118250b = AbstractC23047d8.m118250b(this.f76097N0.getWidth(), this.f76097N0.getHeight(), m100599j2, m100599j3);
                    int intValue = ((Integer) m118250b.first).intValue();
                    int intValue2 = ((Integer) m118250b.second).intValue();
                    intent.putExtra("EXTRA_IS_ERROR", true);
                    intent.putExtra("EXTRA_ERROR_MSG", AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_cover_err_dimen_too_small, Integer.valueOf(intValue), Integer.valueOf(intValue2)));
                    mo50035CK(-1, intent);
                    finish();
                    return;
                }
                if (m100599j3 <= 0 || m118367a.f113475b >= m100599j3) {
                    if (m100599j > 0 && c20556f.m106845r() < m100599j) {
                        intent.putExtra("EXTRA_IS_ERROR", true);
                        intent.putExtra("EXTRA_ERROR_MSG", AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_cover_err_file_size_too_small, Integer.valueOf(i11)));
                    } else {
                        CheckBox checkBox = this.f76100Q0;
                        if (checkBox != null && checkBox.isChecked()) {
                            z11 = true;
                        }
                        intent.putExtra("EXTRA_SHOULD_PUSH_FEED", z11);
                        intent.putExtra("EXTRA_CAMERA_LOG", str);
                    }
                    mo50035CK(-1, intent);
                    finish();
                    return;
                }
                Pair m118250b2 = AbstractC23047d8.m118250b(this.f76097N0.getWidth(), this.f76097N0.getHeight(), m100599j2, m100599j3);
                int intValue3 = ((Integer) m118250b2.first).intValue();
                int intValue22 = ((Integer) m118250b2.second).intValue();
                intent.putExtra("EXTRA_IS_ERROR", true);
                intent.putExtra("EXTRA_ERROR_MSG", AbstractC23136l9.m118746s0(AbstractC8020f0.str_upload_cover_err_dimen_too_small, Integer.valueOf(intValue3), Integer.valueOf(intValue22)));
                mo50035CK(-1, intent);
                finish();
                return;
            }
            AbstractC23350e.m122774d("PreviewUpdateCoverView", "not defined image url");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: oM */
    void m82842oM() {
        try {
            float m118713h0 = AbstractC23136l9.m118713h0() * 0.16999999f;
            PhotoView photoView = this.f76097N0;
            if (photoView != null) {
                AbstractC1579n0.m7857b1(photoView, (-m118713h0) / 2.0f);
            }
            float m118713h02 = 1.2f - ((0.2f * m118713h0) / (this.f76109Z0 - ((int) (AbstractC23136l9.m118713h0() * 0.33f))));
            PhotoView photoView2 = this.f76097N0;
            if (photoView2 != null) {
                photoView2.setScale(AbstractC23199r6.m119528a(m118713h02, 1.0f, 1.2f));
            }
            View view = this.f76116g1;
            if (view != null) {
                view.setTranslationY(-m118713h0);
                View view2 = this.f76118i1;
                if (view2 != null) {
                    view2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.g60

                        /* renamed from: q */
                        public final /* synthetic */ float f80440q;

                        public /* synthetic */ g60(float m118713h03) {
                            r2 = m118713h03;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            PreviewUpdateCoverView.this.m82836jM(r2);
                        }
                    });
                }
            }
            View view3 = this.f76117h1;
            if (view3 != null) {
                view3.setTranslationY(-m118713h03);
            }
            float height = this.f76109Z0 - (this.f76113d1.getHeight() * 0.6666666f);
            float min = Math.min(height - m118713h03, height);
            View view4 = this.f76113d1;
            if (view4 != null) {
                view4.setTranslationY(min);
            }
            AutoMeasureTextView autoMeasureTextView = this.f76112c1;
            if (autoMeasureTextView != null) {
                autoMeasureTextView.setTranslationY(min);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 10001 && i12 == -1 && intent != null) {
            intent.getStringExtra("extra_result_original_path");
            this.f76103T0 = intent.getStringExtra("extra_result_output_path");
            this.f76104U0 = "";
            m82844qM();
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        CheckBox checkBox;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_done) {
            m82839lM();
        } else if (id2 == AbstractC6918a0.tv_push_feed_update && (checkBox = this.f76100Q0) != null) {
            checkBox.setChecked(!checkBox.isChecked());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C13306b c13306b = this.f76110a1;
        if (c13306b != null) {
            c13306b.m74710v();
        }
    }

    /* renamed from: pM */
    void m82843pM() {
        Avatar avatar;
        try {
            this.f76115f1 = new C23528a(this.f72421L0.m92648SI());
            this.f76112c1 = (AutoMeasureTextView) this.f76096M0.findViewById(AbstractC6918a0.user_display_name);
            View findViewById = this.f76096M0.findViewById(AbstractC6918a0.layoutAvatar);
            this.f76113d1 = findViewById;
            if (findViewById != null) {
                findViewById.bringToFront();
                this.f76114e1 = (Avatar) this.f76113d1.findViewById(AbstractC6918a0.imvAvatar);
            }
            this.f76116g1 = this.f76096M0.findViewById(AbstractC6918a0.info_background);
            this.f76118i1 = this.f76096M0.findViewById(AbstractC6918a0.dim_overlay);
            this.f76119j1 = this.f76096M0.findViewById(AbstractC6918a0.cover_crop_container);
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null) {
                this.f76112c1.setText(contactProfile.f42437s);
                if (!TextUtils.isEmpty(AbstractC23304d.f113368c0.f42323A1) && (avatar = this.f76114e1) != null) {
                    avatar.m90481x(m92689tK(), EnumC16949e.SIZE_128);
                    this.f76114e1.m90479n(AbstractC23304d.f113368c0.f42323A1);
                }
            }
            this.f76120k1.sendEmptyMessage(10000);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    void m82844qM() {
        boolean z11;
        try {
            if (C21459a.m111035c(C20128b.m104773t()) < 2048.0d) {
                z11 = true;
            } else {
                z11 = false;
            }
            C24003n m120076J = C23278z2.m120076J();
            if (z11) {
                m120076J.f116260a = AbstractC23006a0.m117875E();
            }
            if (C23999j.m125696L2(this.f76103T0, m120076J)) {
                AbstractC23136l9.m118744r1(this.f76099P0, 8);
                View view = this.f76108Y0;
                if (view != null) {
                    view.setEnabled(true);
                    this.f76108Y0.setClickable(true);
                }
                ((C23528a) this.f76115f1.m123612r(this.f76097N0)).m123579C(this.f76103T0, m120076J, new C14776b());
                return;
            }
            AbstractC23136l9.m118744r1(this.f76099P0, 0);
            View view2 = this.f76108Y0;
            if (view2 != null) {
                view2.setEnabled(false);
                this.f76108Y0.setClickable(false);
            }
            ((C23528a) this.f76115f1.m123612r(this.f76097N0)).m123579C(this.f76103T0, C23278z2.m120078K(), new C14777c(m120076J));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            finish();
        }
    }
}
