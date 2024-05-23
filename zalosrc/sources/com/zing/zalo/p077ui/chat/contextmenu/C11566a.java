package com.zing.zalo.p077ui.chat.contextmenu;

import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.contextmenu.C11566a;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zlottie.widget.LottieImageView;
import dj.C17945a0;
import fn0.AbstractC19074t;
import gw.AbstractC19656s0;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import in.C20629c;
import in.InterfaceC20633g;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23193r0;
import mm0.AbstractC23352g;
import nl0.EnumC23879i;
import p173fz.C19172a;
import p227i3.C20218v;
import pm0.C24848g0;
import vg.C28211v5;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.chat.contextmenu.a */
/* loaded from: classes5.dex */
public final class C11566a {

    /* renamed from: a */
    public static final C11566a f59744a = new C11566a();

    /* renamed from: b */
    private static Boolean f59745b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.chat.contextmenu.a$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f59746p = new a("NO_ONBOARD", 0);

        /* renamed from: q */
        public static final a f59747q = new a("SELECT_TEXT_ONBOARD", 1);

        /* renamed from: r */
        private static final /* synthetic */ a[] f59748r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f59749s;

        static {
            a[] m62756b = m62756b();
            f59748r = m62756b;
            f59749s = AbstractC30166b.m148796a(m62756b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m62756b() {
            return new a[]{f59746p, f59747q};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f59748r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.a$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59750a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f59747q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f59746p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f59750a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.contextmenu.a$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC20633g {
        c() {
        }

        @Override // in.InterfaceC20633g
        /* renamed from: a */
        public void mo62757a(String str, long j11) {
        }

        @Override // in.InterfaceC20633g
        /* renamed from: b */
        public void mo62758b(String str, int i11) {
        }

        @Override // in.InterfaceC20633g
        /* renamed from: c */
        public void mo62759c(String str, String str2, boolean z11) {
        }
    }

    private C11566a() {
    }

    /* renamed from: d */
    private final boolean m62746d(C17945a0 c17945a0) {
        if (!AbstractC19656s0.m103083z(c17945a0) || C19172a.m100600k("features@chat@select_text_onboarding", 0) != 1 || AbstractC0924m0.m3049Fc() || AbstractC0924m0.m4192s6() >= 3) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final View m62747f(Context context, int i11) {
        String c28211v5 = new C28211v5(C19172a.m100604o("context_menu_async@onboarding_lottie_url", null, 2, null)).toString();
        if (c28211v5.length() <= 0) {
            c28211v5 = null;
        }
        if (c28211v5 == null) {
            return null;
        }
        File file = new File(AbstractC20130d.m104892r0(), AbstractC23352g.m122788d(c28211v5));
        if (f59745b == null) {
            if (file.exists()) {
                f59745b = Boolean.TRUE;
            } else {
                f59745b = Boolean.FALSE;
                String path = file.getPath();
                AbstractC19074t.m100207e(path, "getPath(...)");
                m62750i(c28211v5, path);
            }
        }
        if (!AbstractC19074t.m100204b(f59745b, Boolean.TRUE)) {
            return null;
        }
        LottieImageView lottieImageView = new LottieImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, -2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = ChatRow.f57201L5;
        int i12 = i11 / 12;
        lottieImageView.setPadding(i12, 0, i12, 0);
        lottieImageView.setBackground(AbstractC1388a.m6964f(context, AbstractC16803z.chat_context_menu_background));
        lottieImageView.getBackground().setColorFilter(new PorterDuffColorFilter(Color.parseColor("#006AF5"), PorterDuff.Mode.SRC_OVER));
        lottieImageView.setLayoutParams(layoutParams);
        lottieImageView.setVisibility(4);
        lottieImageView.setLottieScaleType(EnumC23879i.SCALE_TYPE_FIXED_WIDTH);
        lottieImageView.m92147B(file.getPath(), "MessageContextMenuView", !AbstractC23193r0.m119506o(), false);
        return lottieImageView;
    }

    /* renamed from: g */
    private final TimeInterpolator m62748g() {
        final Float[] fArr = {Float.valueOf(0.0f), Float.valueOf(0.064277f), Float.valueOf(0.125944f), Float.valueOf(0.185051f), Float.valueOf(0.241651f), Float.valueOf(0.295795f), Float.valueOf(0.347535f), Float.valueOf(0.396922f), Float.valueOf(0.444007f), Float.valueOf(0.488843f), Float.valueOf(0.531482f), Float.valueOf(0.571974f), Float.valueOf(0.610371f), Float.valueOf(0.646725f), Float.valueOf(0.681088f), Float.valueOf(0.71351f), Float.valueOf(0.744045f), Float.valueOf(0.772743f), Float.valueOf(0.799656f), Float.valueOf(0.824835f), Float.valueOf(0.848333f), Float.valueOf(0.8702f), Float.valueOf(0.890489f), Float.valueOf(0.909251f), Float.valueOf(0.926537f), Float.valueOf(0.9424f), Float.valueOf(0.956891f), Float.valueOf(0.97006f), Float.valueOf(0.981962f), Float.valueOf(0.992645f), Float.valueOf(1.002163f), Float.valueOf(1.010567f), Float.valueOf(1.017908f), Float.valueOf(1.024239f), Float.valueOf(1.02961f), Float.valueOf(1.034074f), Float.valueOf(1.037681f), Float.valueOf(1.040484f), Float.valueOf(1.042534f), Float.valueOf(1.043883f), Float.valueOf(1.044582f), Float.valueOf(1.044684f), Float.valueOf(1.044239f), Float.valueOf(1.043299f), Float.valueOf(1.041915f), Float.valueOf(1.040141f), Float.valueOf(1.038026f), Float.valueOf(1.035623f), Float.valueOf(1.032983f), Float.valueOf(1.030158f), Float.valueOf(1.0272f), Float.valueOf(1.02416f), Float.valueOf(1.021089f), Float.valueOf(1.01804f), Float.valueOf(1.015063f), Float.valueOf(1.012211f), Float.valueOf(1.009535f), Float.valueOf(1.007087f), Float.valueOf(1.004919f), Float.valueOf(1.003081f), Float.valueOf(1.001626f), Float.valueOf(1.000605f), Float.valueOf(1.0f)};
        return new TimeInterpolator() { // from class: z50.i
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f11) {
                float m62749h;
                m62749h = C11566a.m62749h(fArr, f11);
                return m62749h;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final float m62749h(Float[] fArr, float f11) {
        AbstractC19074t.m100208f(fArr, "$bounceInterpolate");
        return fArr[(int) (f11 * (fArr.length - 1))].floatValue();
    }

    /* renamed from: i */
    private final void m62750i(String str, String str2) {
        C20629c.Companion.m107461a().m107458r(str, str2, "MessageContextMenuView", new c(), false, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m62751l(View view, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(view, "$v");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setTranslationY(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m62752m(View view, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(view, "$v");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(((Float) animatedValue).floatValue());
    }

    /* renamed from: e */
    public final View m62753e(Context context, int i11, a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        try {
            int i12 = b.f59750a[aVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return m62747f(context, i11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: j */
    public final a m62754j(C17945a0 c17945a0) {
        try {
            if (m62746d(c17945a0)) {
                return a.f59747q;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return a.f59746p;
    }

    /* renamed from: k */
    public final void m62755k(final View view, long j11, Animator.AnimatorListener animatorListener) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        AbstractC19074t.m100208f(animatorListener, "listener");
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getHeight() * 3, 0.0f);
        ofFloat.setDuration(j11);
        ofFloat.setInterpolator(f59744a.m62748g());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z50.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C11566a.m62751l(view, valueAnimator);
            }
        });
        C24848g0 c24848g0 = C24848g0.f119245a;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(j11 / 4);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z50.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C11566a.m62752m(view, valueAnimator);
            }
        });
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(animatorListener);
        animatorSet.start();
    }
}
