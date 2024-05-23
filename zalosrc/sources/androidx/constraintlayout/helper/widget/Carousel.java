package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.C1276p;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.AbstractC1298f;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Carousel extends MotionHelper {

    /* renamed from: C */
    private final ArrayList f4870C;

    /* renamed from: D */
    private int f4871D;

    /* renamed from: E */
    private int f4872E;

    /* renamed from: F */
    private MotionLayout f4873F;

    /* renamed from: G */
    private int f4874G;

    /* renamed from: H */
    private boolean f4875H;

    /* renamed from: I */
    private int f4876I;

    /* renamed from: J */
    private int f4877J;

    /* renamed from: K */
    private int f4878K;

    /* renamed from: L */
    private int f4879L;

    /* renamed from: M */
    private float f4880M;

    /* renamed from: N */
    private int f4881N;

    /* renamed from: O */
    private int f4882O;

    /* renamed from: P */
    private int f4883P;

    /* renamed from: Q */
    private float f4884Q;

    /* renamed from: R */
    private int f4885R;

    /* renamed from: S */
    private int f4886S;

    /* renamed from: T */
    int f4887T;

    /* renamed from: U */
    Runnable f4888U;

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a */
    /* loaded from: classes2.dex */
    class RunnableC1248a implements Runnable {
        RunnableC1248a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.f4873F.setProgress(0.0f);
            Carousel.this.m5929L();
            Carousel.m5927J(Carousel.this);
            int unused = Carousel.this.f4872E;
            throw null;
        }
    }

    /* renamed from: androidx.constraintlayout.helper.widget.Carousel$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1249b {
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4870C = new ArrayList();
        this.f4871D = 0;
        this.f4872E = 0;
        this.f4874G = -1;
        this.f4875H = false;
        this.f4876I = -1;
        this.f4877J = -1;
        this.f4878K = -1;
        this.f4879L = -1;
        this.f4880M = 0.9f;
        this.f4881N = 0;
        this.f4882O = 4;
        this.f4883P = 1;
        this.f4884Q = 2.0f;
        this.f4885R = -1;
        this.f4886S = 200;
        this.f4887T = -1;
        this.f4888U = new RunnableC1248a();
        m5928K(context, attributeSet);
    }

    /* renamed from: J */
    static /* synthetic */ InterfaceC1249b m5927J(Carousel carousel) {
        carousel.getClass();
        return null;
    }

    /* renamed from: K */
    private void m5928K(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.Carousel_carousel_firstView) {
                    this.f4874G = obtainStyledAttributes.getResourceId(index, this.f4874G);
                } else if (index == AbstractC1298f.Carousel_carousel_backwardTransition) {
                    this.f4876I = obtainStyledAttributes.getResourceId(index, this.f4876I);
                } else if (index == AbstractC1298f.Carousel_carousel_forwardTransition) {
                    this.f4877J = obtainStyledAttributes.getResourceId(index, this.f4877J);
                } else if (index == AbstractC1298f.Carousel_carousel_emptyViewsBehavior) {
                    this.f4882O = obtainStyledAttributes.getInt(index, this.f4882O);
                } else if (index == AbstractC1298f.Carousel_carousel_previousState) {
                    this.f4878K = obtainStyledAttributes.getResourceId(index, this.f4878K);
                } else if (index == AbstractC1298f.Carousel_carousel_nextState) {
                    this.f4879L = obtainStyledAttributes.getResourceId(index, this.f4879L);
                } else if (index == AbstractC1298f.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f4880M = obtainStyledAttributes.getFloat(index, this.f4880M);
                } else if (index == AbstractC1298f.Carousel_carousel_touchUpMode) {
                    this.f4883P = obtainStyledAttributes.getInt(index, this.f4883P);
                } else if (index == AbstractC1298f.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f4884Q = obtainStyledAttributes.getFloat(index, this.f4884Q);
                } else if (index == AbstractC1298f.Carousel_carousel_infinite) {
                    this.f4875H = obtainStyledAttributes.getBoolean(index, this.f4875H);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m5929L() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1259j
    /* renamed from: a */
    public void mo5930a(MotionLayout motionLayout, int i11, int i12, float f11) {
        this.f4887T = i11;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC1259j
    /* renamed from: b */
    public void mo5931b(MotionLayout motionLayout, int i11) {
        int i12 = this.f4872E;
        this.f4871D = i12;
        if (i11 == this.f4879L) {
            this.f4872E = i12 + 1;
        } else if (i11 == this.f4878K) {
            this.f4872E = i12 - 1;
        }
        if (this.f4875H) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f4872E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i11 = 0; i11 < this.f5455q; i11++) {
                int i12 = this.f5454p[i11];
                View m6382l = motionLayout.m6382l(i12);
                if (this.f4874G == i12) {
                    this.f4881N = i11;
                }
                this.f4870C.add(m6382l);
            }
            this.f4873F = motionLayout;
            if (this.f4883P == 2) {
                C1276p.b m6010p0 = motionLayout.m6010p0(this.f4877J);
                if (m6010p0 != null) {
                    m6010p0.m6262G(5);
                }
                C1276p.b m6010p02 = this.f4873F.m6010p0(this.f4876I);
                if (m6010p02 != null) {
                    m6010p02.m6262G(5);
                }
            }
            m5929L();
        }
    }

    public void setAdapter(InterfaceC1249b interfaceC1249b) {
    }

    public Carousel(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4870C = new ArrayList();
        this.f4871D = 0;
        this.f4872E = 0;
        this.f4874G = -1;
        this.f4875H = false;
        this.f4876I = -1;
        this.f4877J = -1;
        this.f4878K = -1;
        this.f4879L = -1;
        this.f4880M = 0.9f;
        this.f4881N = 0;
        this.f4882O = 4;
        this.f4883P = 1;
        this.f4884Q = 2.0f;
        this.f4885R = -1;
        this.f4886S = 200;
        this.f4887T = -1;
        this.f4888U = new RunnableC1248a();
        m5928K(context, attributeSet);
    }
}
