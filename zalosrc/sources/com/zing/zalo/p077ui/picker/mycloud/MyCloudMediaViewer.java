package com.zing.zalo.p077ui.picker.mycloud;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.picker.mycloud.MyCloudMediaViewer;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zview.ZaloView;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17969i0;
import dj.C18009w0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p500s1.C26088c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class MyCloudMediaViewer extends BaseZaloView implements ZaloView.InterfaceC17421f {
    public static final C12866a Companion = new C12866a(null);

    /* renamed from: M0 */
    private ViewGroup f66848M0;

    /* renamed from: N0 */
    private AppCompatImageView f66849N0;

    /* renamed from: O0 */
    private AppCompatImageView f66850O0;

    /* renamed from: P0 */
    private MyCloudMessageItem f66851P0;

    /* renamed from: Q0 */
    private float[] f66852Q0;

    /* renamed from: R0 */
    private Size f66853R0;

    /* renamed from: S0 */
    private final int f66854S0;

    /* renamed from: T0 */
    private final Size f66855T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f66856U0;

    /* renamed from: com.zing.zalo.ui.picker.mycloud.MyCloudMediaViewer$a */
    /* loaded from: classes6.dex */
    public static final class C12866a {
        private C12866a() {
        }

        public /* synthetic */ C12866a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mycloud.MyCloudMediaViewer$b */
    /* loaded from: classes6.dex */
    static final class C12867b extends AbstractC19075u implements InterfaceC18494a {
        C12867b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(MyCloudMediaViewer.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mycloud.MyCloudMediaViewer$c */
    /* loaded from: classes6.dex */
    public static final class C12868c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f66858l1;

        /* renamed from: m1 */
        final /* synthetic */ MyCloudMediaViewer f66859m1;

        C12868c(String str, MyCloudMediaViewer myCloudMediaViewer) {
            this.f66858l1 = str;
            this.f66859m1 = myCloudMediaViewer;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (AbstractC19074t.m100204b(str, this.f66858l1) && c3979l != null && c3979l.m18839c() != null) {
                AppCompatImageView appCompatImageView = this.f66859m1.f66849N0;
                if (appCompatImageView == null) {
                    AbstractC19074t.m100223u("ivViewFullMedia");
                    appCompatImageView = null;
                }
                appCompatImageView.setImageBitmap(c3979l.m18839c());
            }
        }
    }

    public MyCloudMediaViewer() {
        InterfaceC24854k m129210a;
        int m118713h0 = AbstractC23136l9.m118713h0() - AbstractC23136l9.m118737p0();
        this.f66854S0 = m118713h0;
        this.f66855T0 = new Size((int) (AbstractC23136l9.m118722k0() * 0.8f), (int) (m118713h0 * 0.7f));
        m129210a = AbstractC24856m.m129210a(new C12867b());
        this.f66856U0 = m129210a;
    }

    /* renamed from: fM */
    private final C23528a m72560fM() {
        return (C23528a) this.f66856U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public static final void m72561gM(MyCloudMediaViewer myCloudMediaViewer, View view) {
        AbstractC19074t.m100208f(myCloudMediaViewer, "this$0");
        myCloudMediaViewer.finish();
    }

    /* renamed from: hM */
    private final void m72562hM(MyCloudMessageItem myCloudMessageItem, float[] fArr) {
        Size size;
        Context context;
        int i11;
        int i12;
        C17961f1 c17961f1;
        String m95090b5;
        int i13;
        int i14;
        int i15;
        C18009w0 c18009w0;
        if (myCloudMessageItem == null || fArr == null || fArr.length < 2 || (size = this.f66853R0) == null || (context = getContext()) == null) {
            return;
        }
        boolean m102886D1 = AbstractC19646n0.m102886D1(myCloudMessageItem.m71033m().m95041W4());
        if (AbstractC19646n0.m103031t1(myCloudMessageItem.m71033m().m95041W4())) {
            C17969i0 m94929K2 = myCloudMessageItem.m71033m().m94929K2();
            if (m94929K2 instanceof C18009w0) {
                c18009w0 = (C18009w0) m94929K2;
            } else {
                c18009w0 = null;
            }
            if (c18009w0 != null) {
                i12 = c18009w0.m95787u();
            } else {
                i12 = 0;
            }
            if (c18009w0 != null) {
                i11 = c18009w0.m95785s();
            }
            i11 = 0;
        } else if (m102886D1) {
            C17969i0 m94929K22 = myCloudMessageItem.m71033m().m94929K2();
            if (m94929K22 instanceof C17961f1) {
                c17961f1 = (C17961f1) m94929K22;
            } else {
                c17961f1 = null;
            }
            if (c17961f1 != null) {
                i12 = c17961f1.m95456J();
            } else {
                i12 = 0;
            }
            if (c17961f1 != null) {
                i11 = c17961f1.m95514z();
            }
            i11 = 0;
        } else {
            i11 = 0;
            i12 = 0;
        }
        Size size2 = new Size(this.f66855T0.getWidth(), (this.f66855T0.getWidth() * i11) / i12);
        Size size3 = new Size((this.f66855T0.getHeight() * i12) / i11, this.f66855T0.getHeight());
        if (size2.getHeight() > this.f66855T0.getHeight()) {
            size2 = size3;
        }
        AppCompatImageView appCompatImageView = this.f66849N0;
        if (appCompatImageView == null) {
            AbstractC19074t.m100223u("ivViewFullMedia");
            appCompatImageView = null;
        }
        appCompatImageView.getLayoutParams().width = size2.getWidth();
        AppCompatImageView appCompatImageView2 = this.f66849N0;
        if (appCompatImageView2 == null) {
            AbstractC19074t.m100223u("ivViewFullMedia");
            appCompatImageView2 = null;
        }
        appCompatImageView2.getLayoutParams().height = size2.getHeight();
        C17945a0 m71033m = myCloudMessageItem.m71033m();
        if (m102886D1) {
            m95090b5 = m71033m.m95131f5();
        } else {
            m95090b5 = m71033m.m95090b5();
        }
        AbstractC19074t.m100205c(m95090b5);
        ((C23528a) m72560fM().m123612r(new C3977j(context))).m123579C(m95090b5, C23278z2.m120068F(), new C12868c(m95090b5, this));
        AppCompatImageView appCompatImageView3 = this.f66849N0;
        if (appCompatImageView3 == null) {
            AbstractC19074t.m100223u("ivViewFullMedia");
            appCompatImageView3 = null;
        }
        appCompatImageView3.setTranslationX(fArr[0]);
        appCompatImageView3.setTranslationY(fArr[1]);
        appCompatImageView3.setScaleX(size.getWidth() / size2.getWidth());
        appCompatImageView3.setScaleY(size.getHeight() / size2.getHeight());
        appCompatImageView3.setPivotX(0.0f);
        appCompatImageView3.setPivotY(0.0f);
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        Drawable m62584j1 = x3Var.m62584j1();
        if (m62584j1 != null) {
            i13 = m62584j1.getIntrinsicWidth();
        } else {
            i13 = 0;
        }
        Drawable m62584j12 = x3Var.m62584j1();
        if (m62584j12 != null) {
            i14 = m62584j12.getIntrinsicHeight();
        } else {
            i14 = 0;
        }
        if (m102886D1) {
            AppCompatImageView appCompatImageView4 = this.f66850O0;
            if (appCompatImageView4 == null) {
                AbstractC19074t.m100223u("ivPlayVideo");
                appCompatImageView4 = null;
            }
            appCompatImageView4.setVisibility(0);
            appCompatImageView4.setTranslationX(fArr[0] + ((size.getWidth() - i13) / 2));
            appCompatImageView4.setTranslationY(fArr[1] + ((size.getHeight() - i14) / 2));
            appCompatImageView4.setAlpha(0.0f);
        }
        AppCompatImageView appCompatImageView5 = this.f66849N0;
        if (appCompatImageView5 == null) {
            AbstractC19074t.m100223u("ivViewFullMedia");
            appCompatImageView5 = null;
        }
        float f11 = 2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView5, "translationX", (AbstractC23136l9.m118722k0() - size2.getWidth()) / f11);
        AppCompatImageView appCompatImageView6 = this.f66849N0;
        if (appCompatImageView6 == null) {
            AbstractC19074t.m100223u("ivViewFullMedia");
            appCompatImageView6 = null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatImageView6, "translationY", AbstractC23136l9.m118737p0() + ((AbstractC23136l9.m118713h0() - size2.getHeight()) / f11));
        AppCompatImageView appCompatImageView7 = this.f66849N0;
        if (appCompatImageView7 == null) {
            AbstractC19074t.m100223u("ivViewFullMedia");
            appCompatImageView7 = null;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(appCompatImageView7, "scaleX", size.getWidth() / size2.getWidth(), 1.0f);
        AppCompatImageView appCompatImageView8 = this.f66849N0;
        if (appCompatImageView8 == null) {
            AbstractC19074t.m100223u("ivViewFullMedia");
            i15 = 2;
            appCompatImageView8 = null;
        } else {
            i15 = 2;
        }
        float[] fArr2 = new float[i15];
        fArr2[0] = size.getHeight() / size2.getHeight();
        fArr2[1] = 1.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(appCompatImageView8, "scaleY", fArr2);
        AppCompatImageView appCompatImageView9 = this.f66850O0;
        if (appCompatImageView9 == null) {
            AbstractC19074t.m100223u("ivPlayVideo");
            appCompatImageView9 = null;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(appCompatImageView9, "alpha", 0.0f, 1.0f);
        AppCompatImageView appCompatImageView10 = this.f66850O0;
        if (appCompatImageView10 == null) {
            AbstractC19074t.m100223u("ivPlayVideo");
            appCompatImageView10 = null;
        }
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(appCompatImageView10, "translationX", (AbstractC23136l9.m118722k0() - i13) / 2);
        AppCompatImageView appCompatImageView11 = this.f66850O0;
        if (appCompatImageView11 == null) {
            AbstractC19074t.m100223u("ivPlayVideo");
            appCompatImageView11 = null;
        }
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(appCompatImageView11, "translationY", AbstractC23136l9.m118737p0() + ((AbstractC23136l9.m118713h0() - i14) / 2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7);
        animatorSet.setInterpolator(new C26088c());
        animatorSet.start();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f66851P0 = (MyCloudMessageItem) m92642L3.getParcelable("EXTRA_ITEM");
            this.f66852Q0 = m92642L3.getFloatArray("EXTRA_COORDINATION");
            this.f66853R0 = m92642L3.getSize("EXTRA_THUMB_SIZE");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        Context context = getContext();
        if (context == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(AbstractC23136l9.m118641B(context, AbstractC16801x.black_60));
        this.f66848M0 = frameLayout;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        appCompatImageView.setImageDrawable(AbstractC23136l9.m118665N(context, AbstractC16803z.chat_icloud_default));
        appCompatImageView.setClickable(true);
        appCompatImageView.setFocusable(true);
        this.f66849N0 = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        appCompatImageView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        appCompatImageView2.setImageDrawable(AbstractC11531v0.Companion.m62584j1());
        appCompatImageView2.setVisibility(8);
        appCompatImageView2.setEnabled(false);
        this.f66850O0 = appCompatImageView2;
        ViewGroup viewGroup2 = this.f66848M0;
        if (viewGroup2 == null) {
            AbstractC19074t.m100223u("rootView");
            viewGroup2 = null;
        }
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: p90.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudMediaViewer.m72561gM(MyCloudMediaViewer.this, view);
            }
        });
        ViewGroup viewGroup3 = this.f66848M0;
        if (viewGroup3 == null) {
            AbstractC19074t.m100223u("rootView");
            viewGroup3 = null;
        }
        AppCompatImageView appCompatImageView3 = this.f66849N0;
        if (appCompatImageView3 == null) {
            AbstractC19074t.m100223u("ivViewFullMedia");
            appCompatImageView3 = null;
        }
        viewGroup3.addView(appCompatImageView3);
        ViewGroup viewGroup4 = this.f66848M0;
        if (viewGroup4 == null) {
            AbstractC19074t.m100223u("rootView");
            viewGroup4 = null;
        }
        AppCompatImageView appCompatImageView4 = this.f66850O0;
        if (appCompatImageView4 == null) {
            AbstractC19074t.m100223u("ivPlayVideo");
            appCompatImageView4 = null;
        }
        viewGroup4.addView(appCompatImageView4);
        ViewGroup viewGroup5 = this.f66848M0;
        if (viewGroup5 == null) {
            AbstractC19074t.m100223u("rootView");
            return null;
        }
        return viewGroup5;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MyCloudMediaViewer";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m72562hM(this.f66851P0, this.f66852Q0);
    }
}
