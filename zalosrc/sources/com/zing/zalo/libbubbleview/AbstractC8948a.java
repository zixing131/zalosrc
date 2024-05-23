package com.zing.zalo.libbubbleview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import com.zing.zalo.libbubbleview.AbstractC8948a;
import com.zing.zalo.zview.AbstractC17484n;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.libbubbleview.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8948a {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.libbubbleview.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: com.zing.zalo.libbubbleview.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32712a implements Animator.AnimatorListener {

            /* renamed from: p */
            final /* synthetic */ InterfaceC18494a f47812p;

            public C32712a(InterfaceC18494a interfaceC18494a) {
                this.f47812p = interfaceC18494a;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
                InterfaceC18494a interfaceC18494a = this.f47812p;
                if (interfaceC18494a != null) {
                    interfaceC18494a.mo12V4();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: d */
        private final int m47747d(DisplayMetrics displayMetrics, float f11) {
            float applyDimension = TypedValue.applyDimension(1, f11, displayMetrics);
            if (applyDimension < 1.0f) {
                applyDimension = 1.0f;
            }
            return (int) applyDimension;
        }

        /* renamed from: g */
        public static /* synthetic */ Animator m47748g(a aVar, View view, float f11, long j11, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
            InterfaceC18494a interfaceC18494a2;
            InterfaceC18505l interfaceC18505l2;
            if ((i11 & 4) != 0) {
                j11 = 300;
            }
            long j12 = j11;
            if ((i11 & 8) != 0) {
                interfaceC18494a2 = null;
            } else {
                interfaceC18494a2 = interfaceC18494a;
            }
            if ((i11 & 16) != 0) {
                interfaceC18505l2 = null;
            } else {
                interfaceC18505l2 = interfaceC18505l;
            }
            return aVar.m47753f(view, f11, j12, interfaceC18494a2, interfaceC18505l2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m47749h(InterfaceC18505l interfaceC18505l, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(valueAnimator, "value");
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(valueAnimator);
            }
        }

        /* renamed from: b */
        public final int m47750b(Context context, int i11) {
            AbstractC19074t.m100208f(context, "context");
            return (int) (context.getResources().getDimension(i11) + 0.5f);
        }

        /* renamed from: c */
        public final int m47751c(Context context, float f11) {
            AbstractC19074t.m100208f(context, "context");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = context.getSystemService("window");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return m47747d(displayMetrics, f11);
        }

        /* renamed from: e */
        public final int m47752e() {
            return AbstractC17484n.Companion.m92931b();
        }

        /* renamed from: f */
        public final Animator m47753f(View view, float f11, long j11, InterfaceC18494a interfaceC18494a, final InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(view, "view");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", f11);
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.addListener(new C32712a(interfaceC18494a));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yt.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC8948a.a.m47749h(InterfaceC18505l.this, valueAnimator);
                }
            });
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.setDuration(j11);
            ofFloat.start();
            AbstractC19074t.m100207e(ofFloat, "apply(...)");
            return ofFloat;
        }

        /* renamed from: i */
        public final void m47754i(Context context, long j11) {
            VibrationEffect createOneShot;
            AbstractC19074t.m100208f(context, "context");
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    createOneShot = VibrationEffect.createOneShot(j11, -1);
                    vibrator.vibrate(createOneShot);
                } else {
                    vibrator.vibrate(j11);
                }
            }
        }
    }
}
