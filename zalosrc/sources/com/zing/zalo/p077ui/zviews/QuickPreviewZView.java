package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import i40.AbstractC20279i;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23166o6;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p471r3.EnumC25629a;
import p500s1.C26087b;
import xl0.InterfaceC30161b;

/* loaded from: classes6.dex */
public class QuickPreviewZView extends BaseZaloView implements ZaloView.InterfaceC17421f, InterfaceC30161b, InterfaceC0733x {

    /* renamed from: M0 */
    C23528a f76817M0;

    /* renamed from: N0 */
    FrameLayout f76818N0;

    /* renamed from: O0 */
    LinearLayout f76819O0;

    /* renamed from: P0 */
    FrameLayout f76820P0;

    /* renamed from: Q0 */
    AbstractC14918d f76821Q0;

    /* renamed from: R0 */
    boolean f76822R0 = false;

    /* renamed from: com.zing.zalo.ui.zviews.QuickPreviewZView$a */
    /* loaded from: classes6.dex */
    class C14915a extends ViewOutlineProvider {
        C14915a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AbstractC23136l9.m118742r(10.0f));
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickPreviewZView$b */
    /* loaded from: classes6.dex */
    class C14916b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f76824p;

        C14916b(Runnable runnable) {
            this.f76824p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Runnable runnable = this.f76824p;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.QuickPreviewZView$c */
    /* loaded from: classes6.dex */
    public static class C14917c extends AbstractC14918d {

        /* renamed from: c */
        ItemAlbumMobile f76826c;

        /* renamed from: d */
        AspectRatioImageView f76827d;

        /* renamed from: com.zing.zalo.ui.zviews.QuickPreviewZView$c$a */
        /* loaded from: classes6.dex */
        public class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ String f76828l1;

            a(String str) {
                this.f76828l1 = str;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                try {
                    super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                    if (interfaceC3968a != null && this.f76828l1.equals(str) && (interfaceC3968a instanceof AspectRatioImageView)) {
                        ((AspectRatioImageView) interfaceC3968a).setShowLoading(false);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public C14917c(C23528a c23528a, ItemAlbumMobile itemAlbumMobile) {
            super(c23528a);
            this.f76826c = itemAlbumMobile;
        }

        @Override // com.zing.zalo.p077ui.zviews.QuickPreviewZView.AbstractC14918d
        /* renamed from: a */
        public void mo83491a() {
            String str;
            String str2;
            try {
                FrameLayout frameLayout = this.f76831b;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(this.f76831b.getContext());
                    this.f76827d = aspectRatioImageView;
                    aspectRatioImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.f76831b.addView(this.f76827d, new FrameLayout.LayoutParams(-2, -2));
                    ItemAlbumMobile itemAlbumMobile = this.f76826c;
                    if (itemAlbumMobile != null) {
                        if (itemAlbumMobile.f42550D.isEmpty()) {
                            str = this.f76826c.f42607x;
                        } else {
                            str = this.f76826c.f42550D;
                        }
                        if (this.f76826c.f42550D.isEmpty()) {
                            str2 = this.f76826c.m40526m0();
                        } else {
                            str2 = this.f76826c.f42550D;
                        }
                        m83493d(str, str2, true);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.QuickPreviewZView.AbstractC14918d
        /* renamed from: b */
        public void mo83492b() {
            String str;
            String str2;
            ItemAlbumMobile itemAlbumMobile = this.f76826c;
            if (itemAlbumMobile != null) {
                if (itemAlbumMobile.f42550D.isEmpty()) {
                    str = this.f76826c.f42607x;
                } else {
                    str = this.f76826c.f42550D;
                }
                if (this.f76826c.f42550D.isEmpty()) {
                    str2 = this.f76826c.m40526m0();
                } else {
                    str2 = this.f76826c.f42550D;
                }
                m83493d(str, str2, false);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.Drawable] */
        /* renamed from: d */
        void m83493d(String str, String str2, boolean z11) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            try {
                if (this.f76827d != null) {
                    a aVar = new a(str);
                    aVar.m125773e3(true);
                    int m117875E = AbstractC23006a0.m117875E();
                    EnumC25629a m120110a = C23278z2.m120110a();
                    if (C23999j.m125694K2(str, m117875E, 0, m120110a)) {
                        ((C23528a) this.f76830a.m123612r(this.f76827d)).m123585I(str, true, true, m117875E, 0, aVar, m120110a);
                        this.f76827d.setShowLoading(false);
                        return;
                    }
                    C3979l m123610p = this.f76830a.m123610p(str2, EnumC25629a.DEFAULT);
                    if (m123610p != null) {
                        bitmapDrawable = new BitmapDrawable(this.f76831b.getContext().getResources(), m123610p.m18839c());
                    } else {
                        bitmapDrawable = null;
                    }
                    if (z11 && bitmapDrawable != null) {
                        this.f76827d.setShowLoading(false);
                        this.f76827d.setImageInfo(m123610p);
                        return;
                    }
                    if (bitmapDrawable != null) {
                        this.f76827d.setShowLoading(false);
                        this.f76827d.setImageInfo(m123610p);
                    } else {
                        this.f76827d.setShowLoading(true);
                    }
                    if (bitmapDrawable != null) {
                        aVar.m125762H1(0);
                    }
                    C24003n m120106Y = C23278z2.m120106Y();
                    C23528a c23528a = (C23528a) this.f76830a.m123612r(this.f76827d);
                    if (bitmapDrawable != null) {
                        bitmapDrawable2 = bitmapDrawable;
                    } else {
                        bitmapDrawable2 = m120106Y.f116261b;
                    }
                    c23528a.m123583G(str, true, true, m117875E, 0, bitmapDrawable2, (C23999j) aVar.m125611h1(AbstractC23166o6.Companion.m119337a(), 0), m120110a);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickPreviewZView$d */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC14918d {

        /* renamed from: a */
        C23528a f76830a;

        /* renamed from: b */
        FrameLayout f76831b;

        public AbstractC14918d(C23528a c23528a) {
            this.f76830a = c23528a;
        }

        /* renamed from: a */
        public abstract void mo83491a();

        /* renamed from: b */
        public abstract void mo83492b();

        /* renamed from: c */
        public void m83494c(FrameLayout frameLayout) {
            this.f76831b = frameLayout;
        }
    }

    /* renamed from: eM */
    public /* synthetic */ void m83489eM(float f11, float f12, float f13, float f14, float f15, float f16, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        FrameLayout frameLayout = this.f76818N0;
        if (frameLayout != null) {
            frameLayout.setAlpha(AbstractC20279i.m105896d(f11, f12, animatedFraction));
        }
        LinearLayout linearLayout = this.f76819O0;
        if (linearLayout != null) {
            linearLayout.setScaleX(AbstractC20279i.m105896d(f13, f14, animatedFraction));
        }
        LinearLayout linearLayout2 = this.f76819O0;
        if (linearLayout2 != null) {
            linearLayout2.setScaleY(AbstractC20279i.m105896d(f15, f16, animatedFraction));
        }
    }

    /* renamed from: fM */
    public static void m83490fM(C17487o0 c17487o0, Bundle bundle, int i11, ItemAlbumMobile itemAlbumMobile) {
        if (c17487o0 != null && itemAlbumMobile != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putParcelable("EXTRA_PREVIEW_OBJ_ITEM_ALBUM_MOBILE", itemAlbumMobile);
            c17487o0.m93066i2(QuickPreviewZView.class, bundle2, i11, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f76817M0 = new C23528a(getContext());
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_PREVIEW_OBJ_ITEM_ALBUM_MOBILE")) {
            this.f76821Q0 = new C14917c(this.f76817M0, (ItemAlbumMobile) m92642L3.getParcelable("EXTRA_PREVIEW_OBJ_ITEM_ALBUM_MOBILE"));
        }
        if (m92676n2() != null && (m92676n2() instanceof ZaloActivity)) {
            ((ZaloActivity) m92676n2()).m35555T1(this);
        }
        if (bundle != null) {
            this.f76822R0 = true;
            this.f88756W = 0;
            finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC7409c0.quick_preview_zview_layout, viewGroup, false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        if (this.f76819O0 != null) {
            if (z11) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (z11) {
                f13 = 0.8f;
            } else {
                f13 = 1.0f;
            }
            if (z11) {
                f14 = 1.0f;
            } else {
                f14 = 0.8f;
            }
            if (z11) {
                f15 = 0.8f;
            } else {
                f15 = 1.0f;
            }
            if (z11) {
                f16 = 1.0f;
            } else {
                f16 = 0.8f;
            }
            if (z11) {
                FrameLayout frameLayout = this.f76818N0;
                if (frameLayout != null) {
                    frameLayout.setAlpha(f11);
                }
                LinearLayout linearLayout = this.f76819O0;
                if (linearLayout != null) {
                    linearLayout.setScaleX(f13);
                    this.f76819O0.setScaleY(f15);
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.pa0

                /* renamed from: q */
                public final /* synthetic */ float f81570q;

                /* renamed from: r */
                public final /* synthetic */ float f81571r;

                /* renamed from: s */
                public final /* synthetic */ float f81572s;

                /* renamed from: t */
                public final /* synthetic */ float f81573t;

                /* renamed from: u */
                public final /* synthetic */ float f81574u;

                /* renamed from: v */
                public final /* synthetic */ float f81575v;

                public /* synthetic */ pa0(float f112, float f122, float f132, float f142, float f152, float f162) {
                    r2 = f112;
                    r3 = f122;
                    r4 = f132;
                    r5 = f142;
                    r6 = f152;
                    r7 = f162;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    QuickPreviewZView.this.m83489eM(r2, r3, r4, r5, r6, r7, valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat);
            animatorSet.addListener(new C14916b(runnable));
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(new C26087b());
            return animatorSet;
        }
        return super.mo39022HJ(z11, runnable);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        if (m92676n2() != null && (m92676n2() instanceof ZaloActivity)) {
            ((ZaloActivity) m92676n2()).m35568e2(this);
        }
        super.mo39024IJ();
    }

    @Override // xl0.InterfaceC30161b
    /* renamed from: Kl */
    public boolean mo47265Kl(MotionEvent motionEvent) {
        if (this.f72421L0.m92674mJ() && m92672lJ() && !m92681pJ() && !mo60294yp() && motionEvent != null) {
            if (motionEvent.getAction() == 1) {
                finish();
            }
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        if (!mo60294yp()) {
            finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        AbstractC14918d abstractC14918d;
        super.mo37122XJ(z11, z12);
        if (z11 && !z12 && !this.f76822R0 && (abstractC14918d = this.f76821Q0) != null) {
            abstractC14918d.mo83492b();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        this.f76818N0 = (FrameLayout) view.findViewById(AbstractC6918a0.fl_quick_preview_root);
        this.f76819O0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_quick_preview_content);
        this.f76820P0 = (FrameLayout) view.findViewById(AbstractC6918a0.fl_quick_preview_media_content);
        LinearLayout linearLayout = this.f76819O0;
        if (linearLayout != null) {
            linearLayout.setElevation(AbstractC23136l9.m118742r(8.0f));
            this.f76819O0.setOutlineProvider(new C14915a());
            this.f76819O0.setClipToOutline(true);
            this.f76819O0.setBackgroundResource(AbstractC16803z.bg_item_chat_o);
        }
        AbstractC14918d abstractC14918d = this.f76821Q0;
        if (abstractC14918d != null) {
            abstractC14918d.m83494c(this.f76820P0);
            this.f76821Q0.mo83491a();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QuickPreviewZView";
    }
}
