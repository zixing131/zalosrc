package com.zing.zalo.p077ui.picker.landingpage;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.AbstractC1579n0;
import bf.AbstractC2790b;
import c30.C3255n;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.adapters.C7157o0;
import com.zing.zalo.camera.filterpicker.FilterPickerView;
import com.zing.zalo.camera.location.LocationFilterPager;
import com.zing.zalo.camera.photocrop.CropView;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView;
import com.zing.zalo.p077ui.imgdecor.caption.CaptionView;
import com.zing.zalo.p077ui.imgdecor.doodle.DoodleView;
import com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.StickerIndicatorView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.photoview.PhotoView;
import com.zing.zalo.photoview.ViewOnTouchListenerC9043a;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import ht.C20125e;
import hu.AbstractC20130d;
import im.C20610a;
import im.C20612c;
import im.C20620k;
import is.AbstractC20826v0;
import j90.C21141v;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import lt.AbstractC22647c;
import m70.C22949b;
import me0.AbstractC23006a0;
import me0.AbstractC23009a3;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23067f6;
import me0.AbstractC23136l9;
import me0.AbstractC23202r9;
import me0.AbstractC23203s;
import me0.AbstractC23222t7;
import me0.AbstractC23280z4;
import me0.C23081g9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p168ft.C19141a;
import p276jt.AbstractC21351f;
import p276jt.C21347b;
import p276jt.C21348c;
import p276jt.C21352g;
import p276jt.C21354i;
import p276jt.C21357l;
import p276jt.C21358m;
import p276jt.C21362q;
import p305kt.InterfaceC21941a;
import p322lf.AbstractC22463d;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p370nt.C23934a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p471r3.C25630b;
import p471r3.EnumC25629a;
import p500s1.C26087b;
import p500s1.C26088c;
import p546uf.InterfaceC27243b;
import p588vw.C28644j;
import p642xe.C29605a;
import p643xf.C29614g;
import p643xf.C29617j;
import t50.C26490b;
import tg.C26657h;
import tg.C26674y;
import th.AbstractC26689j;
import ve.AbstractC27985d;
import ve.C27989h;
import vg.C28020b3;
import vg.C28193t5;
import y90.EnumC30861e;
import z90.AbstractC31727b;
import zh0.AbstractC32212c;
import zl0.AbstractC32226c;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class LandingPhotoView extends FrameLayout implements C29617j.a, View.OnClickListener {

    /* renamed from: c1 */
    private static final AtomicBoolean f66225c1 = new AtomicBoolean(false);

    /* renamed from: d1 */
    private static final int f66226d1 = AbstractC23222t7.f112517C0;

    /* renamed from: e1 */
    private static final int f66227e1 = AbstractC23136l9.m118742r(100.0f);

    /* renamed from: f1 */
    private static final int f66228f1 = AbstractC23136l9.m118713h0() / 8;

    /* renamed from: A */
    private DoodleView f66229A;

    /* renamed from: A0 */
    private boolean f66230A0;

    /* renamed from: B */
    private C21358m f66231B;

    /* renamed from: B0 */
    private boolean f66232B0;

    /* renamed from: C */
    private AbstractC32226c.b f66233C;

    /* renamed from: C0 */
    private boolean f66234C0;

    /* renamed from: D */
    private FrameLayout f66235D;

    /* renamed from: D0 */
    private boolean f66236D0;

    /* renamed from: E */
    private StickerPanelView f66237E;

    /* renamed from: E0 */
    private final HandlerThread f66238E0;

    /* renamed from: F */
    private AbstractC32226c.b f66239F;

    /* renamed from: F0 */
    private Handler f66240F0;

    /* renamed from: G */
    private CaptionView f66241G;

    /* renamed from: G0 */
    private long f66242G0;

    /* renamed from: H */
    private C21357l f66243H;

    /* renamed from: H0 */
    private final C23528a f66244H0;

    /* renamed from: I */
    private CaptionView.InterfaceC12092b f66245I;

    /* renamed from: I0 */
    private final Handler f66246I0;

    /* renamed from: J */
    private C22949b f66247J;

    /* renamed from: J0 */
    private final Runnable f66248J0;

    /* renamed from: K */
    private C22949b.b f66249K;

    /* renamed from: K0 */
    private final Runnable f66250K0;

    /* renamed from: L */
    private C22949b.b f66251L;

    /* renamed from: L0 */
    private final ImageDecorView.InterfaceC7828c f66252L0;

    /* renamed from: M */
    private float f66253M;

    /* renamed from: M0 */
    private int f66254M0;

    /* renamed from: N */
    private float f66255N;

    /* renamed from: N0 */
    private float f66256N0;

    /* renamed from: O */
    private final PointF f66257O;

    /* renamed from: O0 */
    private float f66258O0;

    /* renamed from: P */
    private boolean f66259P;

    /* renamed from: P0 */
    private boolean f66260P0;

    /* renamed from: Q */
    private AbstractC32226c.b f66261Q;

    /* renamed from: Q0 */
    private long f66262Q0;

    /* renamed from: R */
    private LocationFilterPager f66263R;

    /* renamed from: R0 */
    private VelocityTracker f66264R0;

    /* renamed from: S */
    private AbstractC32226c.b f66265S;

    /* renamed from: S0 */
    private final ImageDecorView.InterfaceC7827b f66266S0;

    /* renamed from: T */
    private AbstractC2790b f66267T;

    /* renamed from: T0 */
    private final Runnable f66268T0;

    /* renamed from: U */
    private CropView f66269U;

    /* renamed from: U0 */
    private C20620k f66270U0;

    /* renamed from: V */
    private C21362q f66271V;

    /* renamed from: V0 */
    private boolean f66272V0;

    /* renamed from: W */
    private int f66273W;

    /* renamed from: W0 */
    private C3979l f66274W0;

    /* renamed from: X0 */
    private final Runnable f66275X0;

    /* renamed from: Y0 */
    private final Runnable f66276Y0;

    /* renamed from: Z0 */
    private final Runnable f66277Z0;

    /* renamed from: a0 */
    private boolean f66278a0;

    /* renamed from: a1 */
    private final Runnable f66279a1;

    /* renamed from: b0 */
    private boolean f66280b0;

    /* renamed from: b1 */
    private final Runnable f66281b1;

    /* renamed from: c0 */
    private boolean f66282c0;

    /* renamed from: d0 */
    private AbstractC32226c.b f66283d0;

    /* renamed from: e0 */
    private FilterPickerView f66284e0;

    /* renamed from: f0 */
    private Animator f66285f0;

    /* renamed from: g0 */
    private C29605a f66286g0;

    /* renamed from: h0 */
    private long f66287h0;

    /* renamed from: i0 */
    private DocumentScanView f66288i0;

    /* renamed from: j0 */
    private AbstractC32226c.b f66289j0;

    /* renamed from: k0 */
    private C20125e f66290k0;

    /* renamed from: l0 */
    private ImageView f66291l0;

    /* renamed from: m0 */
    private final Rect f66292m0;

    /* renamed from: n0 */
    private boolean f66293n0;

    /* renamed from: o0 */
    private boolean f66294o0;

    /* renamed from: p */
    private int f66295p;

    /* renamed from: p0 */
    private boolean f66296p0;

    /* renamed from: q */
    private final int f66297q;

    /* renamed from: q0 */
    private String f66298q0;

    /* renamed from: r */
    private BaseZaloView f66299r;

    /* renamed from: r0 */
    private String f66300r0;

    /* renamed from: s */
    private MediaItem f66301s;

    /* renamed from: s0 */
    private String f66302s0;

    /* renamed from: t */
    private ImageDecorView f66303t;

    /* renamed from: t0 */
    private String f66304t0;

    /* renamed from: u */
    private PhotoView f66305u;

    /* renamed from: u0 */
    private C21362q f66306u0;

    /* renamed from: v */
    private PhotoView f66307v;

    /* renamed from: v0 */
    private int f66308v0;

    /* renamed from: w */
    private View f66309w;

    /* renamed from: w0 */
    private float f66310w0;

    /* renamed from: x */
    private View f66311x;

    /* renamed from: x0 */
    private boolean f66312x0;

    /* renamed from: y */
    private ViewOnTouchListenerC9043a.i f66313y;

    /* renamed from: y0 */
    private boolean f66314y0;

    /* renamed from: z */
    private InterfaceC12748z f66315z;

    /* renamed from: z0 */
    private boolean f66316z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$a */
    /* loaded from: classes6.dex */
    public class C12721a implements DocumentScanView.InterfaceC11249b {
        C12721a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m71907f(Bitmap bitmap) {
            LandingPhotoView.this.m71774J0();
            LandingPhotoView.this.setPhotoViewImageInfo(new C3979l(bitmap, EnumC25629a.DEFAULT));
            LandingPhotoView.this.m71899J1(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m71908g(final Bitmap bitmap, int i11, String str) {
            boolean z11;
            if (i11 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            LandingPageView.f66110u2 = z11;
            if (i11 == 0) {
                if (LandingPhotoView.this.f66301s != null) {
                    LandingPhotoView.this.f66301s.m41136a1(str);
                    LandingPhotoView.this.f66301s.m41124T0(str);
                    LandingPhotoView.this.f66301s.m41155l1(bitmap.getWidth());
                    LandingPhotoView.this.f66301s.m41151j1(bitmap.getHeight());
                    if (LandingPhotoView.this.f66315z != null) {
                        LandingPhotoView.this.f66315z.mo71745f(LandingPhotoView.this.f66301s);
                    }
                }
                LandingPhotoView.this.m71883v0();
                LandingPhotoView.this.f66299r.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.picker.landingpage.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        LandingPhotoView.C12721a.this.m71907f(bitmap);
                    }
                });
                LandingPhotoView.this.f66301s.m41094B0(true);
                return;
            }
            if (z11) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
            }
            LandingPhotoView.this.m71899J1(0);
        }

        @Override // com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView.InterfaceC11249b
        /* renamed from: a */
        public void mo38382a(Bitmap bitmap, boolean z11) {
            if (!LandingPhotoView.this.m71840f1()) {
                return;
            }
            if (!z11) {
                final Bitmap m71768H0 = LandingPhotoView.this.m71768H0(bitmap);
                AbstractC27985d.m141003t(m71768H0, new File(AbstractC20130d.m104905y() + CoreUtility.f89233i + "_document_scan_" + System.currentTimeMillis() + ".jpg"), AbstractC26689j.m137112u(1), true, AbstractC26689j.m137103l(), new AbstractC27985d.d() { // from class: com.zing.zalo.ui.picker.landingpage.m
                    @Override // ve.AbstractC27985d.d
                    /* renamed from: a */
                    public final void mo39425a(int i11, String str) {
                        LandingPhotoView.C12721a.this.m71908g(m71768H0, i11, str);
                    }
                });
                return;
            }
            LandingPhotoView.this.m71899J1(0);
        }

        @Override // com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView.InterfaceC11249b
        /* renamed from: b */
        public void mo38383b() {
            LandingPhotoView.this.m71899J1(0);
        }

        @Override // com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView.InterfaceC11249b
        /* renamed from: c */
        public void mo38384c() {
            LandingPhotoView.this.m71899J1(0);
        }

        @Override // com.zing.zalo.p077ui.camera.documentscanner.DocumentScanView.InterfaceC11249b
        /* renamed from: j */
        public void mo38385j(String str) {
            LandingPhotoView.this.m71834d2(str);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$a0 */
    /* loaded from: classes6.dex */
    public interface InterfaceC12722a0 {
        /* renamed from: a */
        void mo71909a(Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$b */
    /* loaded from: classes6.dex */
    public class C12723b extends AnimatorListenerAdapter {
        C12723b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            LandingPhotoView.this.f66285f0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                if (animator == LandingPhotoView.this.f66285f0) {
                    LandingPhotoView.this.f66284e0.setAlpha(1.0f);
                    LandingPhotoView.this.f66284e0.setTranslationY(0.0f);
                    AbstractC23136l9.m118744r1(LandingPhotoView.this.f66284e0, 8);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$b0 */
    /* loaded from: classes6.dex */
    public interface InterfaceC12724b0 {
        /* renamed from: a */
        void mo71709a();

        /* renamed from: b */
        void mo71710b();

        /* renamed from: c */
        void mo71711c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$c */
    /* loaded from: classes6.dex */
    public class C12725c implements FilterPickerView.InterfaceC7604c {
        C12725c() {
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: b */
        public void mo39131b(int i11) {
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: c */
        public boolean mo39132c() {
            return false;
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: d */
        public void mo39133d() {
            LandingPhotoView.this.m71899J1(0);
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: e */
        public void mo39134e(String str, boolean z11) {
            String str2;
            if (!str.equals("filter_swipe_down") && !str.equals("filter_thumbnail") && !str.equals("filter_arrow_down")) {
                LandingPhotoView.this.m71822a2(str);
                return;
            }
            LandingPhotoView landingPhotoView = LandingPhotoView.this;
            if (z11) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            landingPhotoView.m71826b2(str, str2);
        }

        @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7604c
        /* renamed from: f */
        public void mo39135f(boolean z11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$d */
    /* loaded from: classes6.dex */
    public class C12726d implements DoodleView.InterfaceC12102c {
        C12726d() {
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: a */
        public void mo38319a() {
            LandingPhotoView.this.f66303t.mo39680s();
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: j */
        public void mo38320j(String str) {
            LandingPhotoView.this.m71834d2(str);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: k */
        public void mo38321k(String str) {
            LandingPhotoView.this.m71822a2(str);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: l */
        public void mo38322l() {
            LandingPhotoView.this.m71899J1(0);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.doodle.DoodleView.InterfaceC12102c
        /* renamed from: m */
        public void mo38323m() {
            LandingPhotoView.this.m71899J1(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$e */
    /* loaded from: classes6.dex */
    public class C12727e implements InterfaceC21941a {
        C12727e() {
        }

        @Override // p305kt.InterfaceC21941a
        /* renamed from: c */
        public void mo38263c() {
            LandingPhotoView.this.f66246I0.sendEmptyMessage(2);
        }

        @Override // p305kt.InterfaceC21941a
        /* renamed from: h */
        public void mo38276h() {
            LandingPhotoView.this.f66303t.getRender().m98321v2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$f */
    /* loaded from: classes6.dex */
    public class C12728f implements CaptionView.InterfaceC12092b {
        C12728f() {
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: a */
        public void mo38361a(AbstractC21351f abstractC21351f) {
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: b */
        public void mo38362b(C21357l c21357l) {
            try {
                if (c21357l != null) {
                    LandingPhotoView.this.m71796R1(c21357l);
                } else {
                    LandingPhotoView.this.f66259P = false;
                    LandingPhotoView.this.f66303t.setTouchEnable(true);
                }
                LandingPhotoView.this.m71899J1(0);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: c */
        public void mo38363c(boolean z11) {
            int i11;
            View view = LandingPhotoView.this.f66311x;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: j */
        public void mo38364j(String str) {
            LandingPhotoView.this.m71834d2(str);
        }

        @Override // com.zing.zalo.p077ui.imgdecor.caption.CaptionView.InterfaceC12092b
        /* renamed from: k */
        public void mo38365k(String str) {
            LandingPhotoView.this.m71822a2(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$g */
    /* loaded from: classes6.dex */
    public class C12729g implements C22949b.b {
        C12729g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m71911d() {
            LandingPhotoView.this.f66303t.mo39680s();
        }

        @Override // m70.C22949b.b
        /* renamed from: a */
        public void mo38324a(AbstractC21351f abstractC21351f) {
            LandingPhotoView.this.f66303t.setTouchEnable(true);
            if (abstractC21351f instanceof C21357l) {
                C21357l c21357l = (C21357l) abstractC21351f;
                if (c21357l.m110663N0()) {
                    c21357l.m110677z0(new C21357l.a() { // from class: com.zing.zalo.ui.picker.landingpage.o
                        @Override // p276jt.C21357l.a
                        /* renamed from: a */
                        public final void mo39668a() {
                            LandingPhotoView.C12729g.this.m71911d();
                        }
                    });
                }
            }
        }

        @Override // m70.C22949b.b
        /* renamed from: b */
        public void mo38325b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$h */
    /* loaded from: classes6.dex */
    public class C12730h implements C22949b.b {
        C12730h() {
        }

        @Override // m70.C22949b.b
        /* renamed from: a */
        public void mo38324a(AbstractC21351f abstractC21351f) {
            if (abstractC21351f != null) {
                try {
                    if (abstractC21351f instanceof C21357l) {
                        LandingPhotoView.this.f66241G.setEditingDecorText((C21357l) abstractC21351f);
                    }
                    LandingPhotoView.this.f66303t.m39760R(abstractC21351f);
                    LandingPhotoView.this.f66303t.mo39680s();
                    LandingPhotoView.this.f66303t.setTouchEnable(true);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DirectEditor", e11);
                }
            }
        }

        @Override // m70.C22949b.b
        /* renamed from: b */
        public void mo38325b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$i */
    /* loaded from: classes6.dex */
    public class C12731i implements LocationFilterPager.InterfaceC7674d {
        C12731i() {
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: j */
        public void mo38309j(String str) {
            LandingPhotoView.this.m71834d2(str);
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: k */
        public void mo38310k(String str) {
            LandingPhotoView.this.m71822a2(str);
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: l */
        public void mo38311l() {
            LandingPhotoView.this.m71875s0(null);
            LandingPhotoView.this.m71899J1(0);
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: m */
        public void mo38312m() {
            LandingPhotoView.this.m71899J1(0);
        }

        @Override // com.zing.zalo.camera.location.LocationFilterPager.InterfaceC7674d
        /* renamed from: n */
        public void mo38313n(AbstractC2790b abstractC2790b) {
            LandingPhotoView.this.m71875s0(abstractC2790b);
            LandingPhotoView.this.m71899J1(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$j */
    /* loaded from: classes6.dex */
    public class C12732j implements C28193t5.b {
        C12732j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m71913e() {
            LandingPhotoView.this.m71899J1(4);
        }

        @Override // vg.C28193t5.b
        /* renamed from: a */
        public void mo38388a() {
            LandingPhotoView.f66225c1.set(false);
            LandingPhotoView.this.f66246I0.removeMessages(201);
            LandingPhotoView.this.f66299r.mo78960q3();
            if (LandingPhotoView.this.f66315z != null) {
                LandingPhotoView.this.f66315z.mo71744e();
            }
        }

        @Override // vg.C28193t5.b
        /* renamed from: b */
        public void mo38389b() {
            LandingPhotoView.f66225c1.set(false);
            LandingPhotoView.this.f66246I0.removeMessages(201);
            LandingPhotoView.this.f66299r.mo78960q3();
            if (LandingPhotoView.this.f66315z != null) {
                LandingPhotoView.this.f66315z.mo71747h();
            }
        }

        @Override // vg.C28193t5.b
        /* renamed from: c */
        public void mo38390c(List list) {
            LandingPhotoView.f66225c1.set(false);
            LandingPhotoView.this.f66246I0.removeMessages(201);
            LandingPhotoView.this.f66299r.mo78960q3();
            LandingPhotoView.this.f66299r.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.picker.landingpage.p
                @Override // java.lang.Runnable
                public final void run() {
                    LandingPhotoView.C12732j.this.m71913e();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$k */
    /* loaded from: classes6.dex */
    class HandlerC12733k extends Handler {
        HandlerC12733k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i11 = message.what;
                if (i11 == 0) {
                    LandingPhotoView.this.f66312x0 = true;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("#");
                    sb2.append(LandingPhotoView.this.hashCode());
                    sb2.append(": MSG_RESTORE_ALL_DECOR_DATA_COMPLETE");
                } else if (i11 == 1) {
                    LandingPhotoView.this.f66316z0 = true;
                    LandingPhotoView.this.m71880u0();
                } else if (i11 == 2) {
                    LandingPhotoView.this.f66314y0 = true;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("#");
                    sb3.append(LandingPhotoView.this.hashCode());
                    sb3.append(": MSG_RESTORE_DOODLE_DATA_COMPLETE");
                    LandingPhotoView.this.m71880u0();
                } else if (i11 == 3) {
                    LandingPhotoView.this.f66230A0 = true;
                    LandingPhotoView.this.m71880u0();
                } else if (i11 == 4) {
                    LandingPhotoView.this.f66232B0 = true;
                    LandingPhotoView.this.m71880u0();
                } else if (i11 == 5) {
                    LandingPhotoView.this.f66234C0 = true;
                    LandingPhotoView.this.m71880u0();
                } else if (i11 != 201) {
                    if (i11 == 202 && LandingPhotoView.this.f66263R != null) {
                        LandingPhotoView.this.f66263R.m39370b();
                    }
                } else {
                    LandingPhotoView.this.f66299r.mo78950cq(LandingPhotoView.this.getContext().getString(AbstractC8020f0.location_loading_place));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$l */
    /* loaded from: classes6.dex */
    public class C12734l extends AnimatorListenerAdapter {
        C12734l() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$m */
    /* loaded from: classes6.dex */
    public class C12735m extends AnimatorListenerAdapter {
        C12735m() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LandingPhotoView.this.f66311x.setAlpha(0.0f);
            AbstractC23136l9.m118744r1(LandingPhotoView.this.f66263R, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$n */
    /* loaded from: classes6.dex */
    public class C12736n extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ InterfaceC12722a0 f66330l1;

        C12736n(InterfaceC12722a0 interfaceC12722a0) {
            this.f66330l1 = interfaceC12722a0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null) {
                LandingPhotoView.this.setPhotoThumbImageInfo(c3979l);
                this.f66330l1.mo71909a(c3979l.m18839c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$o */
    /* loaded from: classes6.dex */
    public class C12737o extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ MediaItem f66332l1;

        C12737o(MediaItem mediaItem) {
            this.f66332l1 = mediaItem;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null && c3979l.m18839c() != null) {
                this.f66332l1.m41164p1(c3979l.m18839c().getWidth());
                this.f66332l1.m41118Q0(c3979l.m18839c().getHeight());
                LandingPhotoView.this.setPhotoViewImageInfo(c3979l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$p */
    /* loaded from: classes6.dex */
    public class C12738p extends AbstractC31727b {
        C12738p() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: o */
        public void mo38307o(C25630b c25630b, int i11, int i12, int i13) {
            try {
                try {
                    LandingPhotoView.this.m71834d2("121N011");
                    C28020b3 c28020b3 = C28020b3.f130648a;
                    String m141207x = c28020b3.m141207x(c25630b);
                    LandingPhotoView.this.f66303t.m39749G(c25630b, c28020b3.m141205v(c25630b, false), m141207x, LandingPhotoView.this.getWidth(), LandingPhotoView.this.getHeight());
                    LandingPhotoView.this.f66303t.mo39680s();
                    C3255n.m16562n().m16577u(c25630b);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DirectEditor", e11);
                }
            } finally {
                LandingPhotoView.this.m71899J1(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$q */
    /* loaded from: classes6.dex */
    public class C12739q extends AnimatorListenerAdapter {
        C12739q() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LandingPhotoView.this.f66291l0.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$r */
    /* loaded from: classes6.dex */
    public class C12740r implements ImageDecorView.InterfaceC7828c {

        /* renamed from: a */
        private Animator f66336a = null;

        /* renamed from: b */
        private boolean f66337b = false;

        /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$r$a */
        /* loaded from: classes6.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                LandingPhotoView.this.f66291l0.requestLayout();
            }
        }

        /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$r$b */
        /* loaded from: classes6.dex */
        class b extends AnimatorListenerAdapter {
            b() {
            }
        }

        /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$r$c */
        /* loaded from: classes6.dex */
        class c extends AnimatorListenerAdapter {
            c() {
            }
        }

        C12740r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m71915b() {
            LandingPhotoView.this.m71899J1(2);
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: c */
        public void mo39102c() {
            LandingPhotoView.this.f66267T = null;
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: d */
        public void mo39103d(AbstractC21351f abstractC21351f) {
            LandingPhotoView.this.f66243H = (C21357l) abstractC21351f;
            LandingPhotoView.this.f66299r.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.picker.landingpage.q
                @Override // java.lang.Runnable
                public final void run() {
                    LandingPhotoView.C12740r.this.m71915b();
                }
            });
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: e */
        public void mo39104e(boolean z11) {
            if (LandingPhotoView.this.getParent() != null) {
                LandingPhotoView.this.getParent().requestDisallowInterceptTouchEvent(!z11);
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: f */
        public void mo39105f(AbstractC21351f abstractC21351f) {
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: g */
        public void mo39106g(boolean z11) {
            if (z11 == this.f66337b) {
                return;
            }
            this.f66337b = z11;
            try {
                Animator animator = this.f66336a;
                if (animator != null && animator.isRunning()) {
                    this.f66336a.cancel();
                }
                if (this.f66337b) {
                    LandingPhotoView.this.f66291l0.setEnabled(true);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(LandingPhotoView.this.f66291l0, "scaleX", 1.25f), ObjectAnimator.ofFloat(LandingPhotoView.this.f66291l0, "scaleY", 1.25f));
                    animatorSet.setDuration(100L);
                    this.f66336a = animatorSet;
                    C23081g9.m118410g(50L);
                } else {
                    LandingPhotoView.this.f66291l0.setEnabled(false);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(LandingPhotoView.this.f66291l0, "scaleX", 1.0f), ObjectAnimator.ofFloat(LandingPhotoView.this.f66291l0, "scaleY", 1.0f));
                    animatorSet2.setDuration(100L);
                    this.f66336a = animatorSet2;
                }
                this.f66336a.addListener(new a());
                this.f66336a.start();
                LandingPhotoView.this.f66291l0.requestLayout();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: h */
        public void mo39107h(AbstractC21351f abstractC21351f) {
            if (abstractC21351f instanceof C21357l) {
                LandingPhotoView.this.m71822a2("text_trash");
            } else if (abstractC21351f instanceof C21354i) {
                LandingPhotoView.this.m71822a2("sticker_trash");
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: i */
        public void mo39108i() {
            C23081g9.m118410g(30L);
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: j */
        public void mo39109j(boolean z11) {
            try {
                if (LandingPhotoView.this.getParent() != null) {
                    LandingPhotoView.this.getParent().requestDisallowInterceptTouchEvent(z11);
                }
                LandingPhotoView.this.f66246I0.removeCallbacks(LandingPhotoView.this.f66268T0);
                if (z11) {
                    LandingPhotoView.this.f66246I0.removeCallbacks(LandingPhotoView.this.f66248J0);
                    LandingPhotoView.this.f66246I0.removeCallbacks(LandingPhotoView.this.f66250K0);
                    LandingPhotoView.this.f66246I0.postDelayed(LandingPhotoView.this.f66248J0, 150L);
                    LandingPhotoView.this.m71899J1(0);
                } else {
                    LandingPhotoView.this.f66246I0.removeCallbacks(LandingPhotoView.this.f66248J0);
                    LandingPhotoView.this.f66246I0.removeCallbacks(LandingPhotoView.this.f66250K0);
                    LandingPhotoView.this.f66246I0.post(LandingPhotoView.this.f66250K0);
                    LandingPhotoView.this.f66246I0.postDelayed(LandingPhotoView.this.f66268T0, 1000L);
                }
                if (z11) {
                    LandingPhotoView.this.m71766G1(false);
                } else if (LandingPhotoView.this.f66295p == 0) {
                    LandingPhotoView.this.m71766G1(true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: k */
        public void mo39110k(AbstractC21351f abstractC21351f) {
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7828c
        /* renamed from: l */
        public void mo39111l(MotionEvent motionEvent) {
            if (LandingPhotoView.this.f66295p == 3) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        AbstractC23202r9.m119539g(LandingPhotoView.this.f66229A, 100L, new c());
                        return;
                    }
                    return;
                }
                AbstractC23202r9.m119541i(LandingPhotoView.this.f66229A, 100L, new b());
                return;
            }
            if (LandingPhotoView.this.f66295p == 6) {
                LandingPhotoView.this.m71899J1(0);
                LandingPhotoView.this.m71822a2("filter_click_notclear");
            } else if (LandingPhotoView.this.f66295p == 0) {
                LandingPhotoView.this.m71782M0(motionEvent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$s */
    /* loaded from: classes6.dex */
    public class C12741s extends AnimatorListenerAdapter {
        C12741s() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (LandingPhotoView.this.f66313y != null) {
                LandingPhotoView.this.f66313y.mo48413d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$t */
    /* loaded from: classes6.dex */
    public class C12742t extends AnimatorListenerAdapter {
        C12742t() {
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$u */
    /* loaded from: classes6.dex */
    class C12743u implements ImageDecorView.InterfaceC7827b {
        C12743u() {
        }

        @Override // com.zing.zalo.cameradecor.view.ImageDecorView.InterfaceC7827b
        /* renamed from: a */
        public void mo39793a() {
            LandingPhotoView.this.f66246I0.removeCallbacks(LandingPhotoView.this.f66268T0);
            LandingPhotoView.this.f66246I0.postDelayed(LandingPhotoView.this.f66268T0, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$v */
    /* loaded from: classes6.dex */
    public class HandlerC12744v extends Handler {
        HandlerC12744v(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$w */
    /* loaded from: classes6.dex */
    public class C12745w implements InterfaceC12747y {
        C12745w() {
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12747y
        /* renamed from: a */
        public void mo71916a() {
            LandingPhotoView.this.f66246I0.sendEmptyMessage(4);
        }

        @Override // com.zing.zalo.p077ui.picker.landingpage.LandingPhotoView.InterfaceC12747y
        /* renamed from: b */
        public void mo71917b() {
            LandingPhotoView.this.f66246I0.sendEmptyMessage(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$x */
    /* loaded from: classes6.dex */
    public class C12746x extends C23999j {
        C12746x() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null && c3979l.m18839c() != null && LandingPhotoView.this.f66295p == 7) {
                LandingPhotoView.this.m71814X1(c3979l.m18839c(), str);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$y */
    /* loaded from: classes6.dex */
    public interface InterfaceC12747y {
        /* renamed from: a */
        void mo71916a();

        /* renamed from: b */
        void mo71917b();
    }

    /* renamed from: com.zing.zalo.ui.picker.landingpage.LandingPhotoView$z */
    /* loaded from: classes6.dex */
    public interface InterfaceC12748z {
        /* renamed from: a */
        void mo71740a(int i11);

        /* renamed from: b */
        void mo71741b(boolean z11);

        /* renamed from: c */
        void mo71742c(boolean z11);

        /* renamed from: d */
        void mo71743d(boolean z11);

        /* renamed from: e */
        void mo71744e();

        /* renamed from: f */
        void mo71745f(MediaItem mediaItem);

        /* renamed from: g */
        void mo71746g();

        /* renamed from: h */
        void mo71747h();
    }

    public LandingPhotoView(Context context, int i11, BaseZaloView baseZaloView, HandlerThread handlerThread) {
        super(context);
        this.f66295p = 0;
        this.f66301s = null;
        this.f66229A = null;
        this.f66231B = null;
        this.f66233C = null;
        this.f66235D = null;
        this.f66237E = null;
        this.f66239F = null;
        this.f66241G = null;
        this.f66243H = null;
        this.f66245I = null;
        this.f66247J = null;
        this.f66249K = null;
        this.f66251L = null;
        this.f66253M = 0.0f;
        this.f66255N = 1.0f;
        this.f66257O = new PointF();
        this.f66259P = false;
        this.f66261Q = null;
        this.f66263R = null;
        this.f66265S = null;
        this.f66267T = null;
        this.f66269U = null;
        this.f66271V = null;
        this.f66273W = 0;
        this.f66278a0 = false;
        this.f66280b0 = false;
        this.f66282c0 = false;
        this.f66283d0 = null;
        this.f66284e0 = null;
        this.f66285f0 = null;
        this.f66286g0 = null;
        this.f66287h0 = -1L;
        this.f66290k0 = null;
        this.f66292m0 = new Rect(0, 0, 0, 0);
        this.f66293n0 = false;
        this.f66294o0 = false;
        this.f66296p0 = true;
        this.f66298q0 = "";
        this.f66300r0 = "";
        this.f66302s0 = "";
        this.f66304t0 = "";
        this.f66306u0 = new C21362q(0.0d, 0.0d, 1.0d, 1.0d);
        this.f66308v0 = 0;
        this.f66310w0 = 100.0f;
        this.f66312x0 = false;
        this.f66314y0 = false;
        this.f66316z0 = false;
        this.f66230A0 = false;
        this.f66232B0 = false;
        this.f66234C0 = false;
        this.f66236D0 = false;
        this.f66240F0 = null;
        this.f66246I0 = new HandlerC12733k(Looper.getMainLooper());
        this.f66248J0 = new Runnable() { // from class: j90.d0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71878t1();
            }
        };
        this.f66250K0 = new Runnable() { // from class: j90.e0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71881u1();
            }
        };
        this.f66252L0 = new C12740r();
        this.f66254M0 = 0;
        this.f66264R0 = null;
        this.f66266S0 = new C12743u();
        this.f66268T0 = new Runnable() { // from class: j90.f0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71884v1();
            }
        };
        this.f66270U0 = null;
        this.f66272V0 = false;
        this.f66274W0 = null;
        this.f66275X0 = new Runnable() { // from class: j90.g0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71786N1();
            }
        };
        this.f66276Y0 = new Runnable() { // from class: com.zing.zalo.ui.picker.landingpage.k
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71901P1();
            }
        };
        this.f66277Z0 = new Runnable() { // from class: com.zing.zalo.ui.picker.landingpage.l
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71900O1();
            }
        };
        this.f66279a1 = new Runnable() { // from class: j90.i0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71780L1();
            }
        };
        this.f66281b1 = new Runnable() { // from class: j90.j0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71783M1();
            }
        };
        this.f66297q = i11;
        this.f66299r = baseZaloView;
        this.f66238E0 = handlerThread;
        this.f66244H0 = new C23528a(context);
        m71788O0();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("New LandingPhotoView(");
        sb2.append(i11);
        sb2.append(")");
    }

    /* renamed from: A0 */
    private void m71750A0() {
        this.f66290k0.m104741a();
        this.f66290k0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public /* synthetic */ void m71751A1() {
        this.f66293n0 = true;
        if (this.f66294o0) {
            this.f66294o0 = false;
            m71816Y0();
        } else {
            m71776K0();
        }
    }

    /* renamed from: B0 */
    private void m71753B0(long j11, final C29605a c29605a, final int i11, final InterfaceC12747y interfaceC12747y) {
        try {
            if (AbstractC23309i.m121108K1()) {
                this.f66287h0 = j11;
                this.f66286g0 = c29605a;
                final String valueOf = String.valueOf(c29605a.m147131h());
                C26674y.m136865t().m136876l(new C26657h(this.f66286g0), "color_filter_edit_photo", new C26674y.b() { // from class: j90.b0
                    @Override // tg.C26674y.b
                    /* renamed from: a */
                    public final void mo15759a(int i12, String str, String str2, C26657h c26657h) {
                        LandingPhotoView.this.m71856l1(valueOf, i11, interfaceC12747y, c29605a, i12, str, str2, c26657h);
                    }
                });
            } else if (interfaceC12747y != null) {
                interfaceC12747y.mo71917b();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public /* synthetic */ void m71754B1() {
        if (this.f66293n0) {
            m71816Y0();
        } else {
            this.f66294o0 = true;
        }
    }

    /* renamed from: C0 */
    private void m71756C0(final InterfaceC27243b interfaceC27243b, final ColorFilterConfig colorFilterConfig) {
        this.f66303t.getRender().m1952U(new Runnable() { // from class: j90.l0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71859m1(interfaceC27243b, colorFilterConfig);
            }
        });
        this.f66303t.mo39680s();
    }

    /* renamed from: D0 */
    private void m71758D0() {
        this.f66303t.getRender().m1983u0();
        this.f66303t.mo39680s();
        this.f66287h0 = -1L;
        this.f66286g0 = null;
    }

    /* renamed from: E0 */
    private void m71760E0() {
        boolean m120312X = AbstractC23280z4.m120312X(this.f66301s);
        this.f66272V0 = m120312X;
        if (!m120312X) {
            this.f66246I0.sendEmptyMessage(0);
            return;
        }
        this.f66240F0.removeCallbacks(this.f66275X0);
        this.f66240F0.post(this.f66275X0);
        this.f66240F0.removeCallbacks(this.f66279a1);
        this.f66240F0.post(this.f66279a1);
    }

    /* renamed from: F0 */
    private void m71762F0() {
        if (this.f66272V0) {
            long currentTimeMillis = (this.f66242G0 + 350) - System.currentTimeMillis();
            long j11 = 0;
            if (currentTimeMillis > 0) {
                j11 = Math.min(currentTimeMillis, 200L);
            }
            setUpImageDecorBgDelay(j11);
            this.f66240F0.removeCallbacks(this.f66277Z0);
            this.f66240F0.post(this.f66277Z0);
            this.f66272V0 = false;
            return;
        }
        this.f66312x0 = true;
        this.f66246I0.sendEmptyMessage(0);
    }

    /* renamed from: F1 */
    private void m71763F1() {
        try {
            this.f66303t.getRender().m98285a2(getHeight() - f66226d1);
            this.f66303t.mo39680s();
            this.f66269U.m39483j(this.f66303t.getNewWidth(), this.f66303t.getNewHeight(), getWidth(), getHeight(), this.f66269U.getCropOverlayRectInPercentage(), true, false);
            m71834d2("121N051");
            m71822a2("crop_rotate");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* renamed from: G0 */
    private void m71765G0() {
        int i11;
        this.f66240F0.removeCallbacks(this.f66276Y0);
        this.f66240F0.post(this.f66276Y0);
        MediaItem mediaItem = this.f66301s;
        if (mediaItem != null && AbstractC23280z4.m120308T(mediaItem.m41178z())) {
            i11 = this.f66301s.m41178z().m41183d();
        } else {
            i11 = 0;
        }
        while (i11 != this.f66303t.getRender().f93547o0) {
            this.f66303t.getRender().m98285a2(0);
        }
        this.f66240F0.removeCallbacks(this.f66281b1);
        this.f66240F0.post(this.f66281b1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public void m71766G1(boolean z11) {
        InterfaceC12748z interfaceC12748z = this.f66315z;
        if (interfaceC12748z != null) {
            interfaceC12748z.mo71741b(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public Bitmap m71768H0(Bitmap bitmap) {
        if (this.f66290k0 == null) {
            this.f66290k0 = new C20125e(new C19141a());
        }
        return this.f66290k0.m104742b(bitmap);
    }

    /* renamed from: H1 */
    private void m71769H1() {
        String str;
        RectF rectF;
        try {
            boolean z11 = !this.f66278a0;
            this.f66278a0 = z11;
            if (z11) {
                str = "1";
            } else {
                str = "0";
            }
            m71826b2("crop_11", str);
            if (this.f66278a0) {
                m71834d2("121N053");
                if (!this.f66269U.f41502v.m39464A()) {
                    this.f66269U.f41502v.setAspectRatioX(1);
                    this.f66269U.f41502v.setAspectRatioY(1);
                    this.f66269U.f41502v.setFixedAspectRatio(true);
                    int newWidth = this.f66303t.getNewWidth();
                    int newHeight = this.f66303t.getNewHeight();
                    if (newWidth < newHeight) {
                        float f11 = (newHeight - newWidth) / 2.0f;
                        float f12 = newHeight;
                        rectF = new RectF(0.0f, f11 / f12, 1.0f, (f12 - f11) / f12);
                    } else {
                        float f13 = (newWidth - newHeight) / 2.0f;
                        float f14 = newWidth;
                        rectF = new RectF(f13 / f14, 0.0f, (f14 - f13) / f14, 1.0f);
                    }
                    this.f66269U.m39483j(this.f66303t.getNewWidth(), this.f66303t.getNewHeight(), getWidth(), getHeight(), rectF, false, false);
                }
                ((ImageView) findViewById(AbstractC6918a0.btn_square_crop)).setImageResource(AbstractC16803z.icn_crop_1_1_active);
                return;
            }
            this.f66269U.f41502v.setFixedAspectRatio(false);
            this.f66269U.m39483j(this.f66303t.getNewWidth(), this.f66303t.getNewHeight(), getWidth(), getHeight(), new RectF(0.0f, 0.0f, 1.0f, 1.0f), false, false);
            ((ImageView) findViewById(AbstractC6918a0.btn_square_crop)).setImageResource(AbstractC16803z.icn_crop_1_1);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:3:0x0002, B:15:0x001c, B:17:0x0034, B:19:0x003a, B:20:0x004d, B:22:0x005b, B:23:0x008d, B:27:0x0046, B:29:0x004a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m71771I0() {
        int i11;
        try {
            int i12 = this.f66297q;
            if (i12 != 3) {
                i11 = 4;
                if (i12 != 4 && i12 != 15) {
                    if (i12 != 16 && i12 != 24) {
                        i11 = -1;
                    }
                }
                if (i11 < 0) {
                    C20612c c20612c = new C20612c(i11, 0);
                    this.f66303t.getRender().m98261B2(c20612c);
                    this.f66303t.m39747C0(c20612c, true);
                    LocationFilterPager locationFilterPager = this.f66263R;
                    if (locationFilterPager != null && locationFilterPager.getLocationFilter() != null) {
                        this.f66263R.getLocationFilter().m13449l(c20612c);
                    } else {
                        AbstractC2790b abstractC2790b = this.f66267T;
                        if (abstractC2790b != null) {
                            abstractC2790b.m13449l(c20612c);
                        }
                    }
                    c20612c.m107269K(false);
                    c20612c.m107295s().clear();
                    if (this.f66286g0 != null) {
                        c20612c.m107295s().add(new C20610a(this.f66286g0.m147131h() + "", this.f66287h0 + "", false));
                    }
                    c20612c.m107265G(AbstractC23280z4.m120309U(this.f66301s.m41178z()));
                    c20612c.m107264F(this.f66270U0);
                    c20612c.m107271M(this.f66301s.m41157m0());
                    this.f66301s.m41099E0(c20612c.m107280d());
                    return;
                }
                return;
            }
            i11 = 0;
            if (i11 < 0) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
            this.f66301s.m41099E0("");
        }
    }

    /* renamed from: I1 */
    private void m71772I1() {
        RectF rectF;
        try {
            CropView cropView = this.f66269U;
            if (cropView != null) {
                cropView.findViewById(AbstractC6918a0.btn_back_crop).setEnabled(true);
                this.f66269U.findViewById(AbstractC6918a0.btn_finish_crop_photo).setEnabled(true);
                this.f66271V = new C21362q(this.f66303t.getRender().m98288d1());
                this.f66273W = this.f66303t.getRender().f93547o0;
                this.f66303t.getRender().m98290f2(getHeight() - f66226d1);
                CropView cropView2 = this.f66269U;
                int newWidth = this.f66303t.getNewWidth();
                int newHeight = this.f66303t.getNewHeight();
                int width = getWidth();
                int height = getHeight();
                C21362q c21362q = this.f66271V;
                if (c21362q != null) {
                    rectF = c21362q.m110706a();
                } else {
                    rectF = null;
                }
                cropView2.m39483j(newWidth, newHeight, width, height, rectF, false, false);
                this.f66269U.setVisibility(0);
                this.f66269U.post(new Runnable() { // from class: j90.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LandingPhotoView.this.m71889x1();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public void m71774J0() {
        if (!this.f66296p0) {
            m71875s0(null);
            m71758D0();
            this.f66303t.m39779m0();
            this.f66303t.m39758P();
            this.f66303t.mo39680s();
            this.f66231B = null;
            this.f66303t.getRender().m98300k2(false);
            this.f66303t.getRender().m98302l2();
            this.f66303t.setVisibility(8);
            this.f66296p0 = true;
        }
    }

    /* renamed from: K0 */
    private void m71776K0() {
        if (this.f66312x0 && this.f66293n0) {
            m71779L0();
            this.f66309w.setVisibility(8);
        }
    }

    /* renamed from: K1 */
    private void m71777K1() {
        ZaloView m92996E0 = this.f66299r.m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f66299r.m92649TI().mo92702G1(m92996E0, 0);
        }
    }

    /* renamed from: L0 */
    private void m71779L0() {
        this.f66305u.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public void m71780L1() {
        try {
            MediaItem mediaItem = this.f66301s;
            if (mediaItem != null && AbstractC23280z4.m120295G(mediaItem.m41178z())) {
                m71753B0(this.f66301s.m41178z().m41181b(), C29605a.m147124a(this.f66301s.m41178z().m41180a()), (int) this.f66301s.m41178z().m41182c(), new C12745w());
            } else {
                this.f66246I0.sendEmptyMessage(4);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:            if (r2 != 3) goto L71;     */
    /* renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m71782M0(MotionEvent motionEvent) {
        InterfaceC12748z interfaceC12748z;
        float f11;
        int i11;
        float f12;
        if (this.f66260P0) {
            return;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.f66254M0 != 0) {
                        float f13 = rawX - this.f66256N0;
                        float f14 = rawY - this.f66258O0;
                        VelocityTracker velocityTracker = this.f66264R0;
                        if (velocityTracker != null) {
                            velocityTracker.addMovement(motionEvent);
                            f12 = this.f66264R0.getYVelocity();
                        } else {
                            f12 = 0.0f;
                        }
                        if (((System.currentTimeMillis() - this.f66262Q0 > 100 && f12 > 0.0f) || (Math.abs(f14) > Math.abs(f13) && Math.abs(f14) > 50.0f)) && this.f66254M0 == 1) {
                            this.f66254M0 = 2;
                        }
                        if (this.f66254M0 == 2) {
                            ViewOnTouchListenerC9043a.i iVar = this.f66313y;
                            if (iVar != null) {
                                iVar.mo48411b();
                            }
                            this.f66254M0 = 3;
                        }
                        if (this.f66254M0 == 3) {
                            setTranslationY(getTranslationY() + f14);
                            float abs = 1.0f - ((Math.abs(getTranslationY()) * 2.0f) / AbstractC23136l9.m118713h0());
                            ViewOnTouchListenerC9043a.i iVar2 = this.f66313y;
                            if (iVar2 != null) {
                                iVar2.mo48410a(abs);
                            }
                            this.f66256N0 = rawX;
                            this.f66258O0 = rawY;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Velocity Drag ");
                            sb2.append(f12);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("LandingPhotoView.this.setTranslationY - ");
                            sb3.append(f14);
                        }
                    }
                }
            }
            if (this.f66254M0 == 3) {
                float translationY = getTranslationY();
                VelocityTracker velocityTracker2 = this.f66264R0;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                    this.f66264R0.computeCurrentVelocity(1000);
                    f11 = this.f66264R0.getYVelocity();
                } else {
                    f11 = 0.0f;
                }
                if (Math.abs(translationY) <= f66228f1 && f11 <= 1000.0f) {
                    AbstractC23202r9.m119546n(this, 0.0f, 200L, new C12742t());
                    ViewOnTouchListenerC9043a.i iVar3 = this.f66313y;
                    if (iVar3 != null) {
                        iVar3.mo48414e();
                    }
                } else {
                    this.f66260P0 = true;
                    float[] fArr = new float[2];
                    fArr[0] = AbstractC1579n0.m7836S(this);
                    if (translationY > 0.0f) {
                        i11 = AbstractC23136l9.m118713h0();
                    } else {
                        i11 = -AbstractC23136l9.m118713h0();
                    }
                    fArr[1] = i11;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", fArr);
                    ofFloat.addListener(new C12741s());
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j90.m0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LandingPhotoView.this.m71864o1(valueAnimator);
                        }
                    });
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(new DecelerateInterpolator());
                    ofFloat.start();
                }
            } else if (System.currentTimeMillis() - this.f66262Q0 <= 100 && (interfaceC12748z = this.f66315z) != null && 1 == action) {
                interfaceC12748z.mo71746g();
            }
            this.f66254M0 = 0;
        } else {
            this.f66254M0 = 1;
            this.f66256N0 = rawX;
            this.f66258O0 = rawY;
            this.f66262Q0 = System.currentTimeMillis();
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f66264R0 = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
        }
        this.f66303t.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public void m71783M1() {
        try {
            try {
                MediaItem mediaItem = this.f66301s;
                if (mediaItem != null && AbstractC23280z4.m120309U(mediaItem.m41178z())) {
                    this.f66303t.getRender().m98269N0(new C21362q(this.f66301s.m41178z().m41184e()), 0, 0);
                    this.f66303t.mo39680s();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        } finally {
            this.f66246I0.sendEmptyMessage(5);
        }
    }

    /* renamed from: N0 */
    private void m71785N0() {
        AbstractC23136l9.m118744r1(this.f66288i0, 8);
        m71766G1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N1 */
    public void m71786N1() {
        C21358m c21358m;
        m71810W0();
        MediaItem mediaItem = this.f66301s;
        if (mediaItem != null && AbstractC23280z4.m120297I(mediaItem.m41178z()) && (c21358m = this.f66231B) != null) {
            c21358m.m110695p0(this.f66301s.m41178z().m41185f());
            m71805U1();
        } else {
            this.f66246I0.sendEmptyMessage(2);
        }
    }

    /* renamed from: O0 */
    private void m71788O0() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        ImageDecorView imageDecorView = new ImageDecorView(getContext());
        this.f66303t = imageDecorView;
        imageDecorView.setRenderMode(0);
        this.f66303t.setZOrderMediaOverlay(false);
        this.f66303t.setZOrderOnTop(false);
        this.f66303t.setScaleType(0);
        this.f66303t.setHandleDecorObjectListener(this.f66252L0);
        this.f66303t.setExtractBitmapCallback(this.f66266S0);
        this.f66303t.setVisibility(8);
        this.f66303t.getRender().m98298j2(AbstractC23309i.m122281pf());
        this.f66303t.getRender().m98300k2(false);
        addView(this.f66303t, layoutParams);
        PhotoView photoView = new PhotoView(getContext());
        this.f66307v = photoView;
        photoView.setVisibility(8);
        this.f66307v.setId(AbstractC6918a0.landing_page_photo_view);
        PhotoView photoView2 = this.f66307v;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        photoView2.setScaleType(scaleType);
        this.f66307v.setAllowScrollingAway(true);
        addView(this.f66307v);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 17);
        View view = new View(getContext());
        this.f66309w = view;
        view.setBackgroundResource(AbstractC16801x.black);
        this.f66309w.setVisibility(0);
        addView(this.f66309w, layoutParams2);
        PhotoView photoView3 = new PhotoView(getContext());
        this.f66305u = photoView3;
        photoView3.setScaleType(scaleType);
        this.f66305u.setAllowScale(false);
        this.f66305u.setEnableZoomPhotoFitWidth(false);
        this.f66305u.setAllowScrollingAway(false);
        this.f66305u.setVisibility(0);
        addView(this.f66305u);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1, 17);
        View view2 = new View(getContext());
        this.f66311x = view2;
        view2.setBackgroundResource(AbstractC16801x.black_50);
        this.f66311x.setVisibility(8);
        addView(this.f66311x, layoutParams3);
        m71798S0();
        this.f66240F0 = new HandlerC12744v(this.f66238E0.getLooper());
        this.f66242G0 = System.currentTimeMillis();
    }

    /* renamed from: P0 */
    private void m71790P0() {
        try {
            if (this.f66245I == null) {
                this.f66245I = new C12728f();
            }
            if (this.f66241G == null) {
                CaptionView captionView = (CaptionView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.caption_layout, (ViewGroup) null);
                this.f66241G = captionView;
                captionView.setEventListener(this.f66245I);
                this.f66241G.m67447P(AbstractC22463d.m116126a(getContext(), AbstractC32212c.m155331a(getContext())));
                addView(this.f66241G, new FrameLayout.LayoutParams(-1, -1));
                m71833d1();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* renamed from: Q0 */
    private FilterPickerView m71792Q0() {
        final FilterPickerView filterPickerView = new FilterPickerView(getContext(), false, 1);
        filterPickerView.setThumbPath(AbstractC23280z4.m120355u(this.f66301s));
        filterPickerView.setCameraInput(2);
        filterPickerView.setOnDemandListener(new FilterPickerView.InterfaceC7607f() { // from class: j90.r0
            @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7607f
            /* renamed from: a */
            public final void mo39283a() {
                LandingPhotoView.this.m71867p1();
            }
        });
        filterPickerView.setStateListener(new FilterPickerView.InterfaceC7608g() { // from class: j90.s0
            @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7608g
            /* renamed from: a */
            public final void mo39284a(boolean z11, long j11, C29605a c29605a) {
                LandingPhotoView.this.m71870q1(filterPickerView, z11, j11, c29605a);
            }
        });
        MediaItem mediaItem = this.f66301s;
        if (mediaItem != null && mediaItem.m41178z() != null) {
            filterPickerView.getSeekBar().setProgress((int) this.f66301s.m41178z().m41182c());
        }
        filterPickerView.setIntensityFilterAdjustListener(new FilterPickerView.InterfaceC7606e() { // from class: j90.t0
            @Override // com.zing.zalo.camera.filterpicker.FilterPickerView.InterfaceC7606e
            /* renamed from: a */
            public final void mo39282a(int i11) {
                LandingPhotoView.this.m71873r1(i11);
            }
        });
        filterPickerView.setEventListener(new C12725c());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.bottomMargin = AbstractC23222t7.f112586t;
        addView(filterPickerView, 1, layoutParams);
        C29605a c29605a = this.f66286g0;
        if (c29605a != null) {
            filterPickerView.setSelectedFilter(c29605a);
        }
        filterPickerView.setVisibility(8);
        return filterPickerView;
    }

    /* renamed from: Q1 */
    private void m71793Q1(C21357l c21357l) {
        int i11;
        try {
            m71829c1();
            this.f66303t.setTouchEnable(false);
            this.f66257O.set(c21357l.m110606f0(), c21357l.m110607g0());
            this.f66253M = c21357l.m110604c0();
            this.f66255N = c21357l.m110605e0();
            int width = this.f66303t.getWidth() >> 1;
            int defaultDecorTextPositionY = getDefaultDecorTextPositionY();
            this.f66247J.m117670j(c21357l);
            float f11 = width;
            float f12 = defaultDecorTextPositionY;
            this.f66247J.m117674n(f11, f12);
            this.f66247J.m117673m(this.f66251L);
            this.f66247J.m117676p(this.f66241G.getTextSize());
            this.f66247J.m117669i(0.0f);
            if (!TextUtils.isEmpty(c21357l.m110654E0())) {
                i11 = (int) (((Math.abs(c21357l.m110606f0() - f11) + Math.abs(c21357l.m110607g0() - f12)) * 1000.0f) / (AbstractC23136l9.m118713h0() + AbstractC23136l9.m118722k0()));
            } else {
                i11 = 100;
            }
            this.f66247J.m117671k(Math.max(i11, 100));
            this.f66247J.m117677q(false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* renamed from: R0 */
    private CropView m71795R0() {
        CropView cropView = (CropView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.crop_view, (ViewGroup) null);
        cropView.f41495E = new CropView.InterfaceC7716a() { // from class: j90.n0
            @Override // com.zing.zalo.camera.photocrop.CropView.InterfaceC7716a
            /* renamed from: a */
            public final void mo39484a() {
                LandingPhotoView.this.m71876s1();
            }
        };
        cropView.findViewById(AbstractC6918a0.btn_back_crop).setOnClickListener(this);
        cropView.findViewById(AbstractC6918a0.btn_rotate_left_crop).setOnClickListener(this);
        cropView.findViewById(AbstractC6918a0.btn_square_crop).setOnClickListener(this);
        cropView.findViewById(AbstractC6918a0.btn_finish_crop_photo).setOnClickListener(this);
        cropView.setVisibility(4);
        addView(cropView);
        return cropView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R1 */
    public void m71796R1(C21357l c21357l) {
        int i11;
        if (c21357l != null) {
            try {
                m71829c1();
                c21357l.m110616t0();
                c21357l.m110674a1(this.f66241G.getInputTextWidth());
                c21357l.mo97628p0(this.f66241G.getTextSize() / c21357l.m110653D0().f104106m);
                c21357l.mo110614r0(this.f66303t.getWidth() >> 1);
                c21357l.m110615s0(getDefaultDecorTextPositionY());
                c21357l.m110611n0(0.0f);
                this.f66303t.m39748F(c21357l);
                this.f66247J.m117670j(c21357l);
                this.f66247J.m117673m(this.f66249K);
                if (this.f66259P) {
                    this.f66257O.set(this.f66303t.getWidth() >> 1, this.f66303t.getHeight() >> 1);
                }
                this.f66259P = false;
                C22949b c22949b = this.f66247J;
                PointF pointF = this.f66257O;
                c22949b.m117674n(pointF.x, pointF.y);
                this.f66247J.m117669i(this.f66253M);
                this.f66247J.m117675o(this.f66255N);
                if (!TextUtils.isEmpty(c21357l.m110654E0())) {
                    i11 = (int) (((Math.abs(c21357l.m110606f0() - this.f66257O.x) + Math.abs(c21357l.m110607g0() - this.f66257O.y)) * 1000.0f) / (AbstractC23136l9.m118713h0() + AbstractC23136l9.m118722k0()));
                } else {
                    i11 = 100;
                }
                this.f66247J.m117671k(i11);
                this.f66247J.m117677q(true);
                AbstractC23136l9.m118744r1(this.f66311x, 8);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        }
    }

    /* renamed from: S0 */
    private void m71798S0() {
        Rect rect = this.f66292m0;
        int m118722k0 = AbstractC23136l9.m118722k0();
        int i11 = f66227e1;
        rect.left = (m118722k0 - i11) / 2;
        Rect rect2 = this.f66292m0;
        int i12 = AbstractC23222t7.f112586t;
        rect2.top = i12;
        rect2.right = rect2.left + i11;
        rect2.bottom = i12 + i11;
        this.f66303t.setDeleteArea(rect2);
        ImageView imageView = new ImageView(getContext());
        this.f66291l0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f66291l0.setImageResource(AbstractC16803z.icn_trashcan_editphoto);
        this.f66291l0.setEnabled(false);
        this.f66291l0.setVisibility(8);
        this.f66291l0.setAlpha(0.0f);
        addView(this.f66291l0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11, 49);
        layoutParams.setMargins(0, this.f66292m0.top, 0, 0);
        this.f66291l0.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[Catch: all -> 0x001f, Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0013, B:10:0x001a, B:11:0x0027, B:13:0x0042, B:16:0x0055, B:17:0x0059, B:19:0x005d, B:20:0x0064, B:22:0x006c, B:23:0x0076, B:25:0x0095, B:26:0x009b, B:28:0x00a3, B:29:0x00aa, B:31:0x00af, B:33:0x00b3, B:35:0x00c1, B:36:0x00d5), top: B:2:0x0001, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[Catch: all -> 0x001f, Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0013, B:10:0x001a, B:11:0x0027, B:13:0x0042, B:16:0x0055, B:17:0x0059, B:19:0x005d, B:20:0x0064, B:22:0x006c, B:23:0x0076, B:25:0x0095, B:26:0x009b, B:28:0x00a3, B:29:0x00aa, B:31:0x00af, B:33:0x00b3, B:35:0x00c1, B:36:0x00d5), top: B:2:0x0001, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[Catch: all -> 0x001f, Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0013, B:10:0x001a, B:11:0x0027, B:13:0x0042, B:16:0x0055, B:17:0x0059, B:19:0x005d, B:20:0x0064, B:22:0x006c, B:23:0x0076, B:25:0x0095, B:26:0x009b, B:28:0x00a3, B:29:0x00aa, B:31:0x00af, B:33:0x00b3, B:35:0x00c1, B:36:0x00d5), top: B:2:0x0001, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[Catch: all -> 0x001f, Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0013, B:10:0x001a, B:11:0x0027, B:13:0x0042, B:16:0x0055, B:17:0x0059, B:19:0x005d, B:20:0x0064, B:22:0x006c, B:23:0x0076, B:25:0x0095, B:26:0x009b, B:28:0x00a3, B:29:0x00aa, B:31:0x00af, B:33:0x00b3, B:35:0x00c1, B:36:0x00d5), top: B:2:0x0001, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[Catch: all -> 0x001f, Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0013, B:10:0x001a, B:11:0x0027, B:13:0x0042, B:16:0x0055, B:17:0x0059, B:19:0x005d, B:20:0x0064, B:22:0x006c, B:23:0x0076, B:25:0x0095, B:26:0x009b, B:28:0x00a3, B:29:0x00aa, B:31:0x00af, B:33:0x00b3, B:35:0x00c1, B:36:0x00d5), top: B:2:0x0001, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    /* renamed from: S1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void m71799S1() {
        String str;
        AbstractC2790b abstractC2790b;
        String str2;
        C29605a c29605a;
        JSONObject jSONObject;
        String str3;
        try {
            try {
                if (this.f66301s != null) {
                    String str4 = "";
                    JSONArray m98301l1 = this.f66303t.getRender().m98301l1();
                    if (m98301l1 != null && m98301l1.length() != 0) {
                        str = m98301l1.toString();
                        C21362q c21362q = new C21362q(this.f66303t.getRender().m98288d1());
                        int i11 = this.f66303t.getRender().f93547o0;
                        if (this.f66231B != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            this.f66231B.m110693l0(jSONObject2);
                            if (C21358m.m110679h0(jSONObject2)) {
                                str4 = "";
                            } else {
                                str4 = jSONObject2.toString();
                            }
                        }
                        abstractC2790b = this.f66267T;
                        if (abstractC2790b == null) {
                            str2 = abstractC2790b.m13447g();
                        } else {
                            str2 = "";
                        }
                        if (this.f66301s.m41178z() == null) {
                            this.f66301s.m41103H0(new MediaItem.RestoreDecorData());
                        }
                        this.f66301s.m41178z().m41196q(str);
                        this.f66301s.m41178z().m41194o(str4);
                        this.f66301s.m41178z().m41195p(str2);
                        c29605a = this.f66286g0;
                        if (c29605a == null) {
                            jSONObject = c29605a.m147147x();
                        } else {
                            jSONObject = null;
                        }
                        MediaItem.RestoreDecorData m41178z = this.f66301s.m41178z();
                        if (jSONObject == null) {
                            str3 = jSONObject.toString();
                        } else {
                            str3 = "";
                        }
                        m41178z.m41189j(str3);
                        if (jSONObject != null && this.f66284e0 != null && (this.f66303t.getRender().m1976l0() instanceof C29614g)) {
                            this.f66301s.m41178z().m41191l(this.f66284e0.getSeekBar().getProgress());
                        }
                        this.f66301s.m41178z().m41190k(this.f66287h0);
                        this.f66301s.m41178z().m41193n(new C21362q(c21362q));
                        this.f66301s.m41178z().m41192m(i11);
                    }
                    str = "";
                    C21362q c21362q2 = new C21362q(this.f66303t.getRender().m98288d1());
                    int i112 = this.f66303t.getRender().f93547o0;
                    if (this.f66231B != null) {
                    }
                    abstractC2790b = this.f66267T;
                    if (abstractC2790b == null) {
                    }
                    if (this.f66301s.m41178z() == null) {
                    }
                    this.f66301s.m41178z().m41196q(str);
                    this.f66301s.m41178z().m41194o(str4);
                    this.f66301s.m41178z().m41195p(str2);
                    c29605a = this.f66286g0;
                    if (c29605a == null) {
                    }
                    MediaItem.RestoreDecorData m41178z2 = this.f66301s.m41178z();
                    if (jSONObject == null) {
                    }
                    m41178z2.m41189j(str3);
                    if (jSONObject != null) {
                        this.f66301s.m41178z().m41191l(this.f66284e0.getSeekBar().getProgress());
                    }
                    this.f66301s.m41178z().m41190k(this.f66287h0);
                    this.f66301s.m41178z().m41193n(new C21362q(c21362q2));
                    this.f66301s.m41178z().m41192m(i112);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: T0 */
    private DocumentScanView m71801T0() {
        DocumentScanView documentScanView = new DocumentScanView(getContext());
        documentScanView.setDocumentScanListener(new C12721a());
        addView(documentScanView, new ViewGroup.LayoutParams(-1, -1));
        return documentScanView;
    }

    /* renamed from: T1 */
    private void m71802T1(final AbstractC27985d.d dVar, final InterfaceC12724b0 interfaceC12724b0) {
        if (interfaceC12724b0 != null) {
            interfaceC12724b0.mo71710b();
        }
        C21141v.m109632c().m109634d(this.f66303t, new C27989h.a() { // from class: j90.y
            @Override // ve.C27989h.a
            /* renamed from: a */
            public final void mo39367a(Bitmap bitmap) {
                LandingPhotoView.this.m71892y1(interfaceC12724b0, dVar, bitmap);
            }
        });
    }

    /* renamed from: U0 */
    private void m71804U0() {
        m71810W0();
        m71807V0();
        m71805U1();
    }

    /* renamed from: U1 */
    private void m71805U1() {
        if (this.f66303t.getRender().m98291g1() == null) {
            this.f66303t.getRender().m98292g2(this.f66231B);
            this.f66303t.mo39680s();
        }
    }

    /* renamed from: V0 */
    private void m71807V0() {
        try {
            if (this.f66229A == null) {
                DoodleView doodleView = (DoodleView) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.doodle_layout, (ViewGroup) null);
                this.f66229A = doodleView;
                addView(doodleView, new FrameLayout.LayoutParams(-1, -1));
                this.f66229A.m67527D(AbstractC23309i.m122281pf());
                this.f66229A.setDoodleLayoutListener(new C12726d());
                this.f66229A.setVisibility(8);
                m71833d1();
            }
            this.f66229A.setDecorRenderer(this.f66231B);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* renamed from: V1 */
    private void m71808V1() {
        long j11;
        if (this.f66299r.m92676n2() != null && this.f66299r.m92676n2().mo35576n3()) {
            j11 = 150;
        } else {
            j11 = 0;
        }
        setUpImageDecorBgDelay(j11);
    }

    /* renamed from: W0 */
    private void m71810W0() {
        try {
            if (this.f66231B == null) {
                this.f66231B = m71813X0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* renamed from: W1 */
    private void m71811W1() {
        ((C23528a) this.f66244H0.m123612r(this.f66307v)).m123586J(this.f66301s.mo41081Q(), true, true, AbstractC23006a0.m117875E(), 0, new C12746x().m125773e3(true), false, C23278z2.m120110a(), true);
        m71766G1(false);
    }

    /* renamed from: X0 */
    private C21358m m71813X0() {
        C21358m c21358m = new C21358m(new C21348c(new C21347b[]{new C21347b(getResources(), 0), new C21347b(getResources(), 1), new C21347b(getResources(), 2), new C21347b(getResources(), 3)}), new C21352g(new C23934a[]{new C23934a(0), new C23934a(1), new C23934a(2)}));
        c21358m.m110701v0(new C12727e());
        return c21358m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X1 */
    public void m71814X1(Bitmap bitmap, String str) {
        DocumentScanView documentScanView = this.f66288i0;
        if (documentScanView == null || documentScanView.getParent() == null) {
            this.f66288i0 = m71801T0();
            m71833d1();
        }
        m71799S1();
        this.f66288i0.setViewArgs(C26490b.m136453d(bitmap, str));
        AbstractC23136l9.m118744r1(this.f66288i0, 0);
    }

    /* renamed from: Y0 */
    private void m71816Y0() {
        try {
            C3979l c3979l = this.f66274W0;
            if (c3979l != null && c3979l.m18839c() != null && !this.f66274W0.m18839c().isRecycled() && this.f66296p0) {
                this.f66296p0 = false;
                this.f66307v.setAllowScale(false);
                this.f66307v.setAllowScrollingAway(false);
                this.f66303t.setVisibility(0);
                this.f66303t.getRender().m98300k2(true);
                m71830c2(new Size(getWidth(), getHeight()));
                String m41123T = this.f66301s.m41123T();
                ImageDecorView imageDecorView = this.f66303t;
                Bitmap m18839c = this.f66274W0.m18839c();
                if (m41123T.equals("")) {
                    m41123T = this.f66301s.mo41081Q();
                }
                imageDecorView.m39786t0(m18839c, m41123T, this);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* renamed from: Z0 */
    private void m71817Z0() {
        if (this.f66263R == null) {
            LocationFilterPager locationFilterPager = (LocationFilterPager) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.camera_location_filter_layout, (ViewGroup) null);
            this.f66263R = locationFilterPager;
            addView(locationFilterPager);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f66263R.setLayoutParams(layoutParams);
            this.f66263R.setVisibility(8);
            this.f66263R.setOnLocationFilterSelectedListener(new C12731i());
            this.f66263R.setImageDecorView(this.f66303t);
            m71833d1();
        }
    }

    /* renamed from: Z1 */
    private void m71818Z1() {
        m71834d2("121N050");
        m71808V1();
        if (this.f66269U == null) {
            this.f66269U = m71795R0();
            m71833d1();
        }
        if (this.f66236D0) {
            setShowCropLayout(true);
        } else {
            this.f66280b0 = true;
        }
    }

    /* renamed from: a1 */
    private void m71821a1() {
        if (this.f66235D != null) {
            return;
        }
        m71777K1();
        C28644j.m143233Y().m143298b0();
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(AbstractC7409c0.zphoto_editor_sticker_layout, (ViewGroup) null);
        this.f66235D = frameLayout;
        addView(frameLayout);
        ActiveImageButton activeImageButton = (ActiveImageButton) this.f66235D.findViewById(AbstractC6918a0.btn_sticker_layout_back_cam);
        if (activeImageButton != null) {
            activeImageButton.setVisibility(0);
            activeImageButton.setOnClickListener(this);
        }
        this.f66235D.setVisibility(4);
        m71833d1();
        StickerIndicatorView.C13538e c13538e = new StickerIndicatorView.C13538e(0.35f, 0, AbstractC23222t7.f112530J, 1);
        C7110j8.d dVar = new C7110j8.d(4, AbstractC23222t7.f112557e0, AbstractC23222t7.f112552c);
        C7157o0.f fVar = new C7157o0.f();
        fVar.f39183p = false;
        fVar.f39184q = 38;
        dVar.f38890u = fVar;
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142418q, 0, false, false, c13538e, dVar, false, 0, C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f66299r.m92676n2()), true, 1, AbstractC16781w.indicator_camera_bg_color, false, -1, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f66237E = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!this.f66299r.mo60294yp()) {
            this.f66299r.m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f66237E, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m71825b1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a2 */
    public void m71822a2(String str) {
        m71826b2(str, "");
    }

    /* renamed from: b1 */
    private void m71825b1() {
        this.f66237E.m72709oO(new C12738p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b2 */
    public void m71826b2(String str, String str2) {
        int i11 = this.f66297q;
        String str3 = "chat_gallery";
        if (i11 != 3) {
            if (i11 != 4 && i11 != 15) {
                if (i11 == 16 || i11 == 20 || i11 != 22) {
                }
            } else {
                str3 = "social_galleryupload";
            }
        }
        C0815e1.m2075D().m2100V(new C23648e(34, str3, 0, str, str2), false);
    }

    /* renamed from: c1 */
    private void m71829c1() {
        try {
            if (this.f66247J == null) {
                C22949b c22949b = new C22949b(this.f66303t, null, 0, 0, 0.0f, this.f66241G.getTextSize());
                this.f66247J = c22949b;
                c22949b.m117672l(new AccelerateDecelerateInterpolator());
            }
            if (this.f66249K == null) {
                this.f66249K = new C12729g();
            }
            if (this.f66251L == null) {
                this.f66251L = new C12730h();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* renamed from: c2 */
    private void m71830c2(Size size) {
        int width;
        int height;
        try {
            Size size2 = new Size(getWidth(), getHeight());
            float width2 = (size.getWidth() * 1.0f) / size2.getWidth();
            float height2 = (size.getHeight() * 1.0f) / size2.getHeight();
            if (width2 > height2) {
                width = size2.getWidth();
                height = (int) (((size2.getWidth() * size.getHeight()) * 1.0f) / size.getWidth());
            } else if (width2 < height2) {
                width = (int) (((size2.getHeight() * size.getWidth()) * 1.0f) / size.getHeight());
                height = size2.getHeight();
            } else {
                width = size2.getWidth();
                height = size2.getHeight();
            }
            this.f66303t.getLayoutParams().width = width;
            this.f66303t.getLayoutParams().height = height;
            this.f66303t.requestLayout();
            this.f66303t.mo39680s();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* renamed from: d1 */
    private void m71833d1() {
        DocumentScanView documentScanView;
        FrameLayout frameLayout;
        CropView cropView;
        LocationFilterPager locationFilterPager;
        CaptionView captionView;
        DoodleView doodleView;
        if (this.f66299r.m92676n2() != null && this.f66299r.m92676n2().mo35576n3()) {
            return;
        }
        if (this.f66233C == null && (doodleView = this.f66229A) != null) {
            AbstractC32226c.b bVar = new AbstractC32226c.b(doodleView.getTopPanel());
            this.f66233C = bVar;
            bVar.f148631c = true;
            AbstractC32226c.m155403b(bVar, false);
        }
        if (this.f66261Q == null && (captionView = this.f66241G) != null) {
            AbstractC32226c.b bVar2 = new AbstractC32226c.b(captionView.getCaptionTopPanel());
            this.f66261Q = bVar2;
            bVar2.f148631c = true;
            bVar2.f148639k = false;
            AbstractC32226c.m155403b(bVar2, false);
        }
        if (this.f66265S == null && (locationFilterPager = this.f66263R) != null) {
            AbstractC32226c.b bVar3 = new AbstractC32226c.b(locationFilterPager.getTopPanel());
            this.f66265S = bVar3;
            bVar3.f148631c = true;
            AbstractC32226c.m155403b(bVar3, false);
        }
        if (this.f66283d0 == null && (cropView = this.f66269U) != null) {
            AbstractC32226c.b bVar4 = new AbstractC32226c.b(cropView.getTopPanel());
            this.f66283d0 = bVar4;
            bVar4.f148631c = true;
            bVar4.f148639k = true;
            AbstractC32226c.m155403b(bVar4, false);
        }
        if (this.f66239F == null && (frameLayout = this.f66235D) != null) {
            AbstractC32226c.b bVar5 = new AbstractC32226c.b(frameLayout);
            this.f66239F = bVar5;
            bVar5.f148631c = true;
            AbstractC32226c.m155403b(bVar5, false);
        }
        if (this.f66289j0 == null && (documentScanView = this.f66288i0) != null) {
            AbstractC32226c.b bVar6 = new AbstractC32226c.b(documentScanView.getTopView());
            this.f66289j0 = bVar6;
            bVar6.f148631c = true;
            AbstractC32226c.m155403b(bVar6, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* renamed from: d2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m71834d2(String str) {
        String str2;
        int i11 = this.f66297q;
        if (i11 != 3) {
            if (i11 != 4 && i11 != 15) {
                if (i11 != 16 && i11 != 24) {
                    str2 = "7";
                }
            } else {
                str2 = "6";
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str.replace("N", str2);
            }
            AbstractC23647d.m123897g(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("writeActionLog(");
            sb2.append(str);
            sb2.append(")");
        }
        str2 = "2";
        if (!TextUtils.isEmpty(str2)) {
        }
        AbstractC23647d.m123897g(str);
        StringBuilder sb22 = new StringBuilder();
        sb22.append("writeActionLog(");
        sb22.append(str);
        sb22.append(")");
    }

    /* renamed from: e1 */
    private boolean m71837e1() {
        MediaItem mediaItem;
        if (this.f66303t.getCurrentLoadedImage() != null && (mediaItem = this.f66301s) != null && mediaItem.m41178z() != null && (!TextUtils.equals(this.f66301s.m41178z().m41185f(), this.f66298q0) || !TextUtils.equals(this.f66301s.m41178z().m41187h(), this.f66300r0) || !TextUtils.equals(this.f66301s.m41178z().m41186g(), this.f66302s0) || !TextUtils.equals(this.f66301s.m41178z().m41180a(), this.f66304t0) || !this.f66301s.m41178z().m41184e().equals(this.f66306u0) || this.f66301s.m41178z().m41183d() != this.f66308v0 || this.f66301s.m41178z().m41182c() != this.f66310w0)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f1 */
    public boolean m71840f1() {
        return this.f66295p == 7;
    }

    private int getDefaultDecorTextPositionY() {
        return ((this.f66241G.getTextBottomMargin() + (this.f66241G.getTextHeight() / 2)) - ((getHeight() - this.f66303t.getHeight()) / 2)) - AbstractC23222t7.f112594x;
    }

    private void getLocationEditorData() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j90.o0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71862n1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public static /* synthetic */ void m71845h1(InterfaceC12724b0 interfaceC12724b0) {
        if (interfaceC12724b0 != null) {
            interfaceC12724b0.mo71709a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public /* synthetic */ void m71848i1(int i11, String str, final InterfaceC12724b0 interfaceC12724b0) {
        try {
            m71877t0();
            boolean z11 = true;
            if (i11 != 1) {
                z11 = false;
            }
            LandingPageView.f66110u2 = z11;
            if (i11 == 0) {
                MediaItem mediaItem = this.f66301s;
                if (mediaItem != null) {
                    mediaItem.m41124T0(str);
                    InterfaceC12748z interfaceC12748z = this.f66315z;
                    if (interfaceC12748z != null) {
                        interfaceC12748z.mo71745f(this.f66301s);
                    }
                }
            } else if (z11) {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            }
            m71771I0();
            this.f66299r.mo70710wy(new Runnable() { // from class: j90.k0
                @Override // java.lang.Runnable
                public final void run() {
                    LandingPhotoView.m71845h1(LandingPhotoView.InterfaceC12724b0.this);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m71850j1(final InterfaceC12724b0 interfaceC12724b0, final int i11, final String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j90.a0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71848i1(i11, str, interfaceC12724b0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m71853k1(int i11, String str, String str2, String str3, int i12, InterfaceC12747y interfaceC12747y, C29605a c29605a) {
        boolean z11;
        if (i11 == 0) {
            try {
                if (!TextUtils.isEmpty(str) && TextUtils.equals(str, str2)) {
                    m71756C0(AbstractC23203s.m119548a(MainApplication.getAppContext(), str3, AbstractC23203s.m119549b(str3)), new ColorFilterConfig(str3, i12 / 100.0f));
                    if (interfaceC12747y != null) {
                        interfaceC12747y.mo71916a();
                        return;
                    }
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
                if (interfaceC12747y != null) {
                    interfaceC12747y.mo71917b();
                    return;
                }
                return;
            }
        }
        if (interfaceC12747y != null) {
            interfaceC12747y.mo71917b();
        }
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        c29605a.m147143t(z11);
        FilterPickerView filterPickerView = this.f66284e0;
        if (filterPickerView != null) {
            filterPickerView.m39267O(c29605a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public /* synthetic */ void m71856l1(final String str, final int i11, final InterfaceC12747y interfaceC12747y, final C29605a c29605a, final int i12, final String str2, final String str3, C26657h c26657h) {
        this.f66246I0.post(new Runnable() { // from class: j90.c0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71853k1(i12, str, str2, str3, i11, interfaceC12747y, c29605a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m71859m1(InterfaceC27243b interfaceC27243b, ColorFilterConfig colorFilterConfig) {
        if (!this.f66303t.getRender().m1979o0()) {
            this.f66303t.getRender().m1985w0();
        }
        this.f66303t.getRender().m1969e0(interfaceC27243b, colorFilterConfig);
        this.f66303t.mo39680s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ void m71862n1() {
        try {
            AtomicBoolean atomicBoolean = f66225c1;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            this.f66246I0.removeMessages(201);
            this.f66246I0.sendEmptyMessageDelayed(201, 200L);
            C28193t5.m141757e().m141761d(new C12732j(), true);
        } catch (Exception e11) {
            f66225c1.set(false);
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m71864o1(ValueAnimator valueAnimator) {
        this.f66303t.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ void m71867p1() {
        m71899J1(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m71870q1(FilterPickerView filterPickerView, boolean z11, long j11, C29605a c29605a) {
        if (z11) {
            m71753B0(j11, c29605a, filterPickerView.getSeekBar().getProgress(), null);
        } else {
            m71758D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ void m71873r1(int i11) {
        this.f66303t.getRender().m1968d0(i11);
        this.f66303t.mo39680s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public void m71875s0(AbstractC2790b abstractC2790b) {
        AbstractC22647c abstractC22647c;
        this.f66267T = abstractC2790b;
        ImageDecorView imageDecorView = this.f66303t;
        if (abstractC2790b != null) {
            abstractC22647c = abstractC2790b.m13446d(false);
        } else {
            abstractC22647c = null;
        }
        imageDecorView.setLocationFilter(abstractC22647c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ void m71876s1() {
        m71834d2("121N052");
    }

    private void setShowCropLayout(boolean z11) {
        if (z11) {
            m71772I1();
        } else {
            m71886w0();
        }
        m71766G1(!z11);
    }

    private void setShowDoodleLayout(boolean z11) {
        int i11;
        if (z11) {
            m71834d2("121N030");
            m71808V1();
            m71804U0();
        }
        DoodleView doodleView = this.f66229A;
        if (doodleView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(doodleView, i11);
            if (z11) {
                this.f66229A.m67536L0();
                this.f66303t.m39776j0();
            } else {
                this.f66303t.m39755M();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setShowDoodleLayout(");
        sb2.append(z11);
        sb2.append(")");
        m71766G1(!z11);
    }

    private void setShowLocationLayout(boolean z11) {
        try {
            if (z11) {
                m71834d2("121N060");
                m71808V1();
                m71817Z0();
                AbstractC2790b m141763g = C28193t5.m141757e().m141763g();
                if (m141763g != null) {
                    AbstractC23309i.m121687Zp(m141763g.f11109a);
                    m71875s0(m141763g);
                }
                this.f66263R.setLocationFilterSelected(this.f66267T);
                this.f66263R.setLocationFilters(C28193t5.m141757e().m141762f());
                AbstractC23136l9.m118744r1(this.f66263R, 0);
                AbstractC23136l9.m118744r1(this.f66311x, 0);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(this.f66311x, "alpha", 1.0f));
                arrayList.add(this.f66263R.getOpenAnim());
                animatorSet.playTogether(arrayList);
                animatorSet.setInterpolator(new C26088c());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new C12734l());
                animatorSet.start();
                this.f66246I0.sendEmptyMessage(202);
            } else if (this.f66263R != null) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ObjectAnimator.ofFloat(this.f66311x, "alpha", 0.0f));
                arrayList2.add(this.f66263R.getCloseAnim());
                animatorSet2.playTogether(arrayList2);
                animatorSet2.setInterpolator(new C26088c());
                animatorSet2.setDuration(250L);
                animatorSet2.addListener(new C12735m());
                animatorSet2.start();
            }
            m71766G1(!z11);
            this.f66303t.mo39680s();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    private void setShowPhotoFilterLayout(boolean z11) {
        int m118742r;
        try {
            Animator animator = this.f66285f0;
            if (animator != null && animator.isRunning()) {
                this.f66285f0.cancel();
            }
            if (z11) {
                m71834d2("121N041");
                m71808V1();
                if (this.f66284e0 == null) {
                    this.f66284e0 = m71792Q0();
                }
                AbstractC23136l9.m118744r1(this.f66284e0, 0);
                this.f66284e0.m39272W(true);
            } else {
                FilterPickerView filterPickerView = this.f66284e0;
                if (filterPickerView != null && filterPickerView.isShown()) {
                    AbstractC23136l9.m118744r1(this.f66284e0, 0);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this.f66284e0, "alpha", 0.0f));
                    FilterPickerView filterPickerView2 = this.f66284e0;
                    float[] fArr = new float[1];
                    if (filterPickerView2.getHeight() > 0) {
                        m118742r = this.f66284e0.getHeight();
                    } else {
                        m118742r = AbstractC23136l9.m118742r(140.0f);
                    }
                    fArr[0] = m118742r / 2.0f;
                    arrayList.add(ObjectAnimator.ofFloat(filterPickerView2, "translationY", fArr));
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(200L);
                    animatorSet.setInterpolator(new C26087b());
                    this.f66285f0 = animatorSet;
                    animatorSet.addListener(new C12723b());
                    this.f66285f0.start();
                }
                return;
            }
            InterfaceC12748z interfaceC12748z = this.f66315z;
            if (interfaceC12748z != null) {
                interfaceC12748z.mo71743d(true ^ z11);
                this.f66315z.mo71742c(z11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    private void setShowStickerLayout(boolean z11) {
        int i11;
        if (z11) {
            m71834d2("121N010");
            m71808V1();
            m71821a1();
        }
        FrameLayout frameLayout = this.f66235D;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        AbstractC23136l9.m118744r1(frameLayout, i11);
        m71902Y1(this.f66237E, z11);
        m71766G1(!z11);
    }

    private void setShowTextDecorLayout(boolean z11) {
        if (z11) {
            try {
                m71834d2("121N020");
                m71808V1();
                m71790P0();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
                return;
            }
        }
        if (this.f66241G != null) {
            if (z11) {
                if (this.f66243H == null) {
                    this.f66259P = true;
                    this.f66243H = new C21357l("", new C21357l.b(), 10, AbstractC0924m0.m3036F(), 1, AbstractC23136l9.m118707f0());
                }
                this.f66241G.m67458i0();
                m71793Q1(this.f66243H);
            } else {
                if (!this.f66247J.m117667g()) {
                    this.f66247J.m117665e();
                }
                this.f66241G.m67459i1();
                AbstractC23136l9.m118744r1(this.f66241G, 8);
            }
            m71766G1(!z11);
            this.f66243H = null;
        }
    }

    private void setUpImageDecorBgDelay(long j11) {
        this.f66246I0.postDelayed(new Runnable() { // from class: j90.u0
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71754B1();
            }
        }, j11);
    }

    /* renamed from: t0 */
    private void m71877t0() {
        MediaItem mediaItem = this.f66301s;
        if (mediaItem != null && mediaItem.m41178z() != null) {
            this.f66298q0 = this.f66301s.m41178z().m41185f();
            this.f66300r0 = this.f66301s.m41178z().m41187h();
            this.f66302s0 = this.f66301s.m41178z().m41186g();
            this.f66304t0 = this.f66301s.m41178z().m41180a();
            this.f66310w0 = this.f66301s.m41178z().m41182c();
            this.f66306u0 = new C21362q(this.f66301s.m41178z().m41184e());
            this.f66308v0 = this.f66301s.m41178z().m41183d();
            return;
        }
        this.f66298q0 = "";
        this.f66300r0 = "";
        this.f66302s0 = "";
        this.f66304t0 = "";
        this.f66310w0 = 100.0f;
        this.f66306u0 = new C21362q(0.0d, 0.0d, 1.0d, 1.0d);
        this.f66308v0 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ void m71878t1() {
        this.f66291l0.setVisibility(0);
        this.f66291l0.setAlpha(0.0f);
        AbstractC23202r9.m119539g(this.f66291l0, 150L, new C12739q());
        if (this.f66299r.m92676n2() != null && !this.f66299r.m92676n2().mo35576n3()) {
            AbstractC32226c.b bVar = new AbstractC32226c.b(this.f66291l0);
            bVar.f148631c = true;
            AbstractC32226c.m155403b(bVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public void m71880u0() {
        if (this.f66314y0 && this.f66316z0 && this.f66230A0 && this.f66232B0 && this.f66234C0) {
            this.f66312x0 = true;
            m71776K0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ void m71881u1() {
        AbstractC23136l9.m118744r1(this.f66291l0, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public void m71883v0() {
        MediaItem mediaItem = this.f66301s;
        if (mediaItem != null) {
            mediaItem.m41103H0(new MediaItem.RestoreDecorData());
        }
        m71877t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public /* synthetic */ void m71884v1() {
        m71904x0(null);
    }

    /* renamed from: w0 */
    private void m71886w0() {
        String str;
        C21362q c21362q;
        CropView cropView;
        try {
            CropView cropView2 = this.f66269U;
            if (cropView2 != null) {
                cropView2.findViewById(AbstractC6918a0.btn_back_crop).setEnabled(false);
                this.f66269U.findViewById(AbstractC6918a0.btn_finish_crop_photo).setEnabled(false);
                AbstractC23136l9.m118744r1(this.f66269U, 4);
            }
            if (this.f66282c0) {
                str = "crop_done_notclear";
            } else {
                str = "crop_back_clear";
            }
            m71822a2(str);
            if (!this.f66282c0) {
                while (this.f66273W != this.f66303t.getRender().f93547o0) {
                    this.f66303t.getRender().m98285a2(0);
                }
            }
            if (this.f66282c0 && (cropView = this.f66269U) != null) {
                c21362q = new C21362q(cropView.getCropOverlayRectInPercentage());
            } else {
                c21362q = this.f66271V;
            }
            this.f66303t.getRender().m98269N0(c21362q, 0, 0);
            this.f66303t.mo39680s();
            this.f66271V = null;
            this.f66282c0 = false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public /* synthetic */ void m71887w1() {
        m71776K0();
        AbstractC23136l9.m118744r1(this.f66307v, 8);
        if (this.f66280b0) {
            setShowCropLayout(true);
        }
        this.f66280b0 = false;
        this.f66236D0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public /* synthetic */ void m71889x1() {
        this.f66303t.mo39680s();
    }

    /* renamed from: y0 */
    private void m71891y0(int i11) {
        switch (i11) {
            case 1:
                setShowStickerLayout(false);
                break;
            case 2:
                setShowTextDecorLayout(false);
                break;
            case 3:
                setShowDoodleLayout(false);
                break;
            case 4:
                setShowLocationLayout(false);
                break;
            case 5:
                setShowCropLayout(false);
                break;
            case 6:
                setShowPhotoFilterLayout(false);
                break;
            case 7:
                m71785N0();
                break;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("closeEditMode(");
        sb2.append(i11);
        sb2.append(")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public /* synthetic */ void m71892y1(InterfaceC12724b0 interfaceC12724b0, AbstractC27985d.d dVar, Bitmap bitmap) {
        int i11;
        int i12;
        MediaItem mediaItem = this.f66301s;
        if (mediaItem != null && bitmap != null) {
            if (bitmap.getWidth() > 0) {
                i11 = bitmap.getWidth();
            } else {
                i11 = 1;
            }
            mediaItem.m41155l1(i11);
            MediaItem mediaItem2 = this.f66301s;
            if (bitmap.getHeight() > 0) {
                i12 = bitmap.getHeight();
            } else {
                i12 = 1;
            }
            mediaItem2.m41151j1(i12);
        }
        if (interfaceC12724b0 != null) {
            interfaceC12724b0.mo71711c();
        }
        AbstractC27985d.m141003t(bitmap, AbstractC23280z4.m120345p(), AbstractC26689j.m137112u(1), true, AbstractC26689j.m137103l(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public void m71894z0() {
        try {
            if (this.f66270U0 != null || this.f66301s.m41174v0()) {
                return;
            }
            String mo41081Q = this.f66301s.mo41081Q();
            C23307g m118367a = AbstractC23067f6.m118367a(mo41081Q);
            this.f66270U0 = C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(mo41081Q).m107353d(AbstractC23041d2.m118216o(mo41081Q)).m107359j(this.f66301s.m41121S()).m107355f(m118367a.f113481h).m107360k(AbstractC23009a3.m117960k(mo41081Q)).m107350a();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public /* synthetic */ void m71895z1(C3979l c3979l) {
        if (!this.f66293n0) {
            this.f66305u.setImageInfo(c3979l);
        } else {
            m71779L0();
        }
    }

    /* renamed from: C1 */
    public void m71896C1(MediaItem mediaItem, C24003n c24003n, InterfaceC12722a0 interfaceC12722a0) {
        try {
            C3979l m108841w = AbstractC20826v0.m108841w(AbstractC23280z4.m120364z(mediaItem), Integer.valueOf(c24003n.f116260a), Integer.valueOf(AbstractC23006a0.m117875E()), Integer.valueOf(AbstractC23006a0.m117871A()), Integer.valueOf(AbstractC23006a0.m117928x()), Integer.valueOf(AbstractC23006a0.m117925u()));
            if (m108841w != null) {
                setPhotoThumbImageInfo(m108841w);
                interfaceC12722a0.mo71909a(m108841w.m18839c());
            } else {
                ((C23528a) this.f66244H0.m123612r(this.f66305u)).m123579C(AbstractC23280z4.m120364z(mediaItem), c24003n, new C12736n(interfaceC12722a0));
            }
            ((C23528a) this.f66244H0.m123612r(this.f66307v)).m123586J(AbstractC23280z4.m120363y(mediaItem), true, true, AbstractC23006a0.m117875E(), 0, new C12737o(mediaItem).m125773e3(true), false, C23278z2.m120110a(), true);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: D1 */
    public void m71897D1() {
        m71762F0();
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: j90.x
            @Override // java.lang.Runnable
            public final void run() {
                LandingPhotoView.this.m71894z0();
            }
        });
    }

    /* renamed from: E1 */
    public void m71898E1(InterfaceC12724b0 interfaceC12724b0) {
        m71904x0(interfaceC12724b0);
        m71899J1(0);
    }

    /* renamed from: J1 */
    public void m71899J1(int i11) {
        if (!this.f66312x0 || i11 == this.f66295p) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("openEditMode(");
        sb2.append(i11);
        sb2.append("). Curr=");
        sb2.append(this.f66295p);
        m71891y0(this.f66295p);
        if (LandingPageView.f66110u2) {
            i11 = 0;
        }
        this.f66295p = i11;
        this.f66246I0.removeCallbacks(this.f66268T0);
        switch (this.f66295p) {
            case 0:
                this.f66246I0.postDelayed(this.f66268T0, 1000L);
                break;
            case 1:
                setShowStickerLayout(true);
                break;
            case 2:
                setShowTextDecorLayout(true);
                break;
            case 3:
                setShowDoodleLayout(true);
                break;
            case 4:
                if (!AbstractC23034c6.m118114C(MainApplication.getAppContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                    this.f66295p = 0;
                    AbstractC23034c6.m118184v0(this.f66299r, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10);
                    break;
                } else if (C28193t5.m141757e().m141764h()) {
                    this.f66295p = 0;
                    getLocationEditorData();
                    break;
                } else {
                    setShowLocationLayout(true);
                    break;
                }
            case 5:
                m71818Z1();
                break;
            case 6:
                setShowPhotoFilterLayout(true);
                break;
            case 7:
                m71811W1();
                break;
        }
        InterfaceC12748z interfaceC12748z = this.f66315z;
        if (interfaceC12748z != null) {
            interfaceC12748z.mo71740a(this.f66295p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O1 */
    public void m71900O1() {
        try {
            try {
                MediaItem mediaItem = this.f66301s;
                if (mediaItem != null && mediaItem.m41178z() != null) {
                    String m41186g = this.f66301s.m41178z().m41186g();
                    if (!TextUtils.isEmpty(m41186g)) {
                        m71875s0(AbstractC2790b.m13442e(new JSONObject(m41186g)));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        } finally {
            this.f66246I0.sendEmptyMessage(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P1 */
    public void m71901P1() {
        try {
            try {
                MediaItem mediaItem = this.f66301s;
                if (mediaItem != null && AbstractC23280z4.m120296H(mediaItem.m41178z())) {
                    this.f66303t.m39781o0(this.f66301s.m41178z().m41187h());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DirectEditor", e11);
            }
        } finally {
            this.f66246I0.sendEmptyMessage(1);
        }
    }

    /* renamed from: Y1 */
    protected void m71902Y1(ZaloView zaloView, boolean z11) {
        if (zaloView != null) {
            try {
                C17487o0 m92649TI = this.f66299r.m92649TI();
                if (z11) {
                    m92649TI.m93077o2(zaloView);
                    if (zaloView.m92656bJ() != null) {
                        zaloView.m92656bJ().bringToFront();
                    }
                } else {
                    m92649TI.m93045X0(zaloView);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: g1 */
    public boolean m71903g1() {
        return this.f66295p != 0;
    }

    public PhotoView getPhotoView() {
        return this.f66307v;
    }

    public boolean getRestoreAllDataComplete() {
        return this.f66312x0;
    }

    @Override // p643xf.C29617j.a
    /* renamed from: j */
    public void mo38280j() {
        try {
            m71765G0();
            this.f66246I0.post(new Runnable() { // from class: j90.z
                @Override // java.lang.Runnable
                public final void run() {
                    LandingPhotoView.this.m71887w1();
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null) {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_sticker_layout_back_cam) {
                m71899J1(0);
                m71822a2("sticker_back");
                return;
            }
            if (id2 == AbstractC6918a0.btn_back_crop) {
                this.f66282c0 = false;
                m71899J1(0);
            } else if (id2 == AbstractC6918a0.btn_finish_crop_photo) {
                this.f66282c0 = true;
                m71899J1(0);
            } else if (id2 == AbstractC6918a0.btn_square_crop) {
                m71769H1();
            } else if (id2 == AbstractC6918a0.btn_rotate_left_crop) {
                m71763F1();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f66290k0 != null) {
            m71750A0();
        }
        this.f66303t.m39779m0();
        this.f66303t.m39758P();
        this.f66303t.mo39680s();
        removeView(this.f66303t);
        super.onDetachedFromWindow();
    }

    public void setLandingPhotoViewListener(InterfaceC12748z interfaceC12748z) {
        this.f66315z = interfaceC12748z;
    }

    public void setMediaItem(MediaItem mediaItem) {
        this.f66301s = mediaItem;
        m71760E0();
        m71877t0();
    }

    public void setOnScrollingAwayListener(ViewOnTouchListenerC9043a.i iVar) {
        this.f66313y = iVar;
        if (this.f66307v.getPhotoViewAttacher() != null) {
            this.f66307v.getPhotoViewAttacher().m48370b0(this.f66313y);
        }
    }

    public void setPhotoThumbImageInfo(final C3979l c3979l) {
        if (c3979l != null && c3979l.m18839c() != null) {
            this.f66246I0.post(new Runnable() { // from class: j90.w
                @Override // java.lang.Runnable
                public final void run() {
                    LandingPhotoView.this.m71895z1(c3979l);
                }
            });
        }
    }

    public void setPhotoViewImageInfo(C3979l c3979l) {
        this.f66274W0 = c3979l;
        if (c3979l != null && c3979l.m18839c() != null && this.f66301s != null) {
            this.f66307v.setImageInfo(this.f66274W0);
            this.f66307v.setVisibility(0);
            this.f66307v.setAllowScrollingAway(true);
            this.f66301s.m41164p1(this.f66274W0.m18839c().getWidth());
            this.f66301s.m41118Q0(this.f66274W0.m18839c().getHeight());
            this.f66246I0.post(new Runnable() { // from class: j90.p0
                @Override // java.lang.Runnable
                public final void run() {
                    LandingPhotoView.this.m71751A1();
                }
            });
        }
    }

    /* renamed from: x0 */
    public boolean m71904x0(final InterfaceC12724b0 interfaceC12724b0) {
        try {
            this.f66246I0.removeCallbacks(this.f66268T0);
            if (!this.f66312x0) {
                return false;
            }
            m71799S1();
            if (m71837e1() && AbstractC23280z4.m120312X(this.f66301s) && !LandingPageView.f66110u2) {
                m71802T1(new AbstractC27985d.d() { // from class: j90.h0
                    @Override // ve.AbstractC27985d.d
                    /* renamed from: a */
                    public final void mo39425a(int i11, String str) {
                        LandingPhotoView.this.m71850j1(interfaceC12724b0, i11, str);
                    }
                }, interfaceC12724b0);
                return true;
            }
            if (AbstractC23280z4.m120312X(this.f66301s)) {
                return false;
            }
            MediaItem mediaItem = this.f66301s;
            if (mediaItem != null) {
                mediaItem.m41124T0(mediaItem.m41123T());
                MediaItem mediaItem2 = this.f66301s;
                mediaItem2.m41151j1(mediaItem2.getHeight());
                MediaItem mediaItem3 = this.f66301s;
                mediaItem3.m41155l1(mediaItem3.getWidth());
                this.f66301s.m41099E0("");
                InterfaceC12748z interfaceC12748z = this.f66315z;
                if (interfaceC12748z != null) {
                    interfaceC12748z.mo71745f(this.f66301s);
                }
            }
            m71877t0();
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DirectEditor", e11);
            return false;
        }
    }
}
