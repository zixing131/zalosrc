package com.zing.zalo.p077ui.widget.reaction;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.reaction.AnimReactionCounterView;
import gw.AbstractC19646n0;
import me0.AbstractC23136l9;
import p500s1.C26087b;

/* loaded from: classes6.dex */
public class AnimReactionCounterView extends View {

    /* renamed from: G */
    static final int f71016G;

    /* renamed from: H */
    static final int f71017H;

    /* renamed from: I */
    static final int f71018I;

    /* renamed from: J */
    static C13704p1 f71019J;

    /* renamed from: A */
    String f71020A;

    /* renamed from: B */
    ValueAnimator f71021B;

    /* renamed from: C */
    ValueAnimator f71022C;

    /* renamed from: D */
    ValueAnimator f71023D;

    /* renamed from: E */
    InterfaceC13727d f71024E;

    /* renamed from: F */
    AnimReactionCounterView f71025F;

    /* renamed from: p */
    int f71026p;

    /* renamed from: q */
    int f71027q;

    /* renamed from: r */
    int f71028r;

    /* renamed from: s */
    int f71029s;

    /* renamed from: t */
    float f71030t;

    /* renamed from: u */
    float f71031u;

    /* renamed from: v */
    float f71032v;

    /* renamed from: w */
    float f71033w;

    /* renamed from: x */
    float f71034x;

    /* renamed from: y */
    float f71035y;

    /* renamed from: z */
    boolean f71036z;

    /* renamed from: com.zing.zalo.ui.widget.reaction.AnimReactionCounterView$a */
    /* loaded from: classes6.dex */
    class C13724a extends AnimatorListenerAdapter {
        C13724a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (!AnimReactionCounterView.this.f71023D.isRunning()) {
                    AnimReactionCounterView.this.f71023D.start();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.AnimReactionCounterView$b */
    /* loaded from: classes6.dex */
    class C13725b extends AnimatorListenerAdapter {
        C13725b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            try {
                AnimReactionCounterView animReactionCounterView = AnimReactionCounterView.this;
                animReactionCounterView.f71030t = 1.0f;
                animReactionCounterView.f71032v = 1.0f;
                animReactionCounterView.f71036z = true;
                animReactionCounterView.f71025F.invalidate();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.AnimReactionCounterView$c */
    /* loaded from: classes6.dex */
    class C13726c extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ InterfaceC13727d f71039p;

        C13726c(InterfaceC13727d interfaceC13727d) {
            this.f71039p = interfaceC13727d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            try {
                InterfaceC13727d interfaceC13727d = this.f71039p;
                if (interfaceC13727d != null) {
                    AnimReactionCounterView animReactionCounterView = AnimReactionCounterView.this;
                    interfaceC13727d.mo59560A3(animReactionCounterView.f71026p, animReactionCounterView.f71027q - AnimReactionCounterView.f71017H);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.AnimReactionCounterView$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC13727d {
        /* renamed from: A3 */
        void mo59560A3(int i11, int i12);

        /* renamed from: VD */
        void mo59863VD();

        /* renamed from: g9 */
        void mo60013g9();
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(45.0f);
        f71016G = m118742r;
        f71017H = AbstractC23136l9.m118742r(75.0f);
        f71018I = (int) (m118742r * 1.75d);
    }

    public AnimReactionCounterView(Context context, final InterfaceC13727d interfaceC13727d) {
        super(context);
        this.f71030t = 1.0f;
        this.f71031u = 1.0f;
        this.f71032v = 0.0f;
        this.f71033w = 1.0f;
        this.f71034x = 0.0f;
        this.f71035y = 0.0f;
        this.f71036z = false;
        this.f71025F = this;
        this.f71024E = interfaceC13727d;
        if (f71019J == null) {
            C13704p1 c13704p1 = new C13704p1();
            f71019J = c13704p1;
            c13704p1.setColor(-1);
            f71019J.setTextSize(AbstractC23136l9.m118742r(14.0f));
            f71019J.m76613c();
        }
        final PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("counter_alpha", 0.0f, 1.0f);
        final PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("counter_translation_y", 0.0f, 1.0f);
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(ofFloat, ofFloat2);
        this.f71021B = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lb0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimReactionCounterView.this.m76699d(ofFloat, ofFloat2, valueAnimator);
            }
        });
        this.f71021B.addListener(new C13724a());
        this.f71021B.setDuration(100L);
        this.f71021B.setInterpolator(new OvershootInterpolator(0.1f));
        final PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("counter_alpha", 1.0f, 0.0f);
        final PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("counter_translation_y", 1.0f, 0.0f);
        ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(ofFloat3, ofFloat4);
        this.f71022C = ofPropertyValuesHolder2;
        ofPropertyValuesHolder2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lb0.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimReactionCounterView.this.m76700e(ofFloat3, ofFloat4, interfaceC13727d, valueAnimator);
            }
        });
        this.f71022C.addListener(new C13725b());
        this.f71022C.setDuration(200L);
        this.f71022C.setInterpolator(new AnticipateInterpolator(0.1f));
        final PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat("counter_scale", 1.0f, 1.15f, 1.0f);
        final PropertyValuesHolder ofFloat6 = PropertyValuesHolder.ofFloat("firework_scale", 0.0f, 1.25f, 1.55f);
        final PropertyValuesHolder ofFloat7 = PropertyValuesHolder.ofFloat("firework_alpha", 0.0f, 1.0f, 0.0f);
        ValueAnimator ofPropertyValuesHolder3 = ValueAnimator.ofPropertyValuesHolder(ofFloat5, ofFloat6, ofFloat7);
        this.f71023D = ofPropertyValuesHolder3;
        ofPropertyValuesHolder3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lb0.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnimReactionCounterView.this.m76701f(ofFloat5, ofFloat6, ofFloat7, valueAnimator);
            }
        });
        this.f71023D.addListener(new C13726c(interfaceC13727d));
        this.f71023D.setDuration(300L);
        this.f71023D.setInterpolator(new C26087b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m76699d(PropertyValuesHolder propertyValuesHolder, PropertyValuesHolder propertyValuesHolder2, ValueAnimator valueAnimator) {
        try {
            this.f71030t = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder.getPropertyName())).floatValue();
            this.f71032v = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder2.getPropertyName())).floatValue();
            this.f71025F.invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m76700e(PropertyValuesHolder propertyValuesHolder, PropertyValuesHolder propertyValuesHolder2, InterfaceC13727d interfaceC13727d, ValueAnimator valueAnimator) {
        boolean z11;
        try {
            this.f71030t = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder.getPropertyName())).floatValue();
            this.f71032v = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder2.getPropertyName())).floatValue();
            if (this.f71030t != 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f71036z = z11;
            this.f71025F.invalidate();
            if (!this.f71036z && interfaceC13727d != null) {
                interfaceC13727d.mo59863VD();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m76701f(PropertyValuesHolder propertyValuesHolder, PropertyValuesHolder propertyValuesHolder2, PropertyValuesHolder propertyValuesHolder3, ValueAnimator valueAnimator) {
        try {
            this.f71031u = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder.getPropertyName())).floatValue();
            this.f71034x = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder2.getPropertyName())).floatValue();
            this.f71033w = ((Float) valueAnimator.getAnimatedValue(propertyValuesHolder3.getPropertyName())).floatValue();
            this.f71025F.invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m76702g(int i11, int i12, int i13) {
        this.f71026p = i11;
        this.f71027q = i12;
        String str = this.f71020A;
        String m102954a0 = AbstractC19646n0.m102954a0(i13);
        this.f71020A = m102954a0;
        if (TextUtils.isEmpty(m102954a0)) {
            return;
        }
        if (this.f71028r == 0 || this.f71020A.length() != str.length()) {
            this.f71028r = AbstractC23136l9.m118764y0(f71019J, this.f71020A);
        }
        if (this.f71029s == 0) {
            this.f71029s = AbstractC23136l9.m118761x0(f71019J, this.f71020A);
        }
        this.f71035y = (float) (Math.random() * 360.0d);
        this.f71022C.cancel();
        this.f71023D.cancel();
        if (this.f71036z) {
            this.f71023D.start();
        } else {
            this.f71036z = true;
            InterfaceC13727d interfaceC13727d = this.f71024E;
            if (interfaceC13727d != null) {
                interfaceC13727d.mo60013g9();
            }
            this.f71021B.start();
        }
        this.f71022C.setStartDelay(600L);
        this.f71022C.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            if (!TextUtils.isEmpty(this.f71020A) && this.f71030t > 0.0f) {
                int i11 = (int) (this.f71027q - (f71017H * this.f71032v));
                if (this.f71033w > 0.0f) {
                    float f11 = this.f71034x;
                    if (f11 > 0.0f) {
                        int i12 = (int) (f71018I * f11);
                        int i13 = this.f71026p - (i12 / 2);
                        int i14 = i11 - (i12 / 2);
                        canvas.save();
                        canvas.rotate(this.f71035y, this.f71026p, i11);
                        AbstractC11531v0.m62260g2().setBounds(i13, i14, i13 + i12, i12 + i14);
                        AbstractC11531v0.m62260g2().setAlpha((int) (this.f71033w * 255.0f));
                        AbstractC11531v0.m62260g2().draw(canvas);
                        canvas.restore();
                    }
                }
                int i15 = (int) (f71016G * this.f71031u);
                int i16 = this.f71026p - (i15 / 2);
                int i17 = i11 - (i15 / 2);
                AbstractC11531v0.m62185P1().setBounds(i16, i17, i16 + i15, i17 + i15);
                AbstractC11531v0.m62185P1().setAlpha((int) (this.f71030t * 255.0f));
                AbstractC11531v0.m62185P1().draw(canvas);
                f71019J.setAlpha((int) (this.f71030t * 255.0f));
                canvas.drawText(this.f71020A, (i16 + (i15 / 2)) - (this.f71028r / 2), i17 + (i15 / 2) + (this.f71029s / 2), f71019J);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
