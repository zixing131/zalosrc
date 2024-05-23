package com.zing.zalo.uicomponents.framelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import p663xz.C30226b;

/* loaded from: classes.dex */
public class DragToCloseLayout extends BaseRootFrameLayout {

    /* renamed from: A */
    boolean f82898A;

    /* renamed from: B */
    int f82899B;

    /* renamed from: C */
    boolean f82900C;

    /* renamed from: D */
    public boolean f82901D;

    /* renamed from: E */
    int f82902E;

    /* renamed from: F */
    int f82903F;

    /* renamed from: G */
    int f82904G;

    /* renamed from: H */
    int f82905H;

    /* renamed from: I */
    InterfaceC16432a f82906I;

    /* renamed from: J */
    InterfaceC16433b f82907J;

    /* renamed from: K */
    int f82908K;

    /* renamed from: L */
    private InterfaceC16434c f82909L;

    /* renamed from: p */
    int f82910p;

    /* renamed from: q */
    protected boolean f82911q;

    /* renamed from: r */
    boolean f82912r;

    /* renamed from: s */
    int f82913s;

    /* renamed from: t */
    int f82914t;

    /* renamed from: u */
    int f82915u;

    /* renamed from: v */
    VelocityTracker f82916v;

    /* renamed from: w */
    int f82917w;

    /* renamed from: x */
    int f82918x;

    /* renamed from: y */
    int f82919y;

    /* renamed from: z */
    boolean f82920z;

    /* renamed from: com.zing.zalo.uicomponents.framelayout.DragToCloseLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC16432a {
        /* renamed from: Dg */
        void mo38328Dg(float f11);

        /* renamed from: EC */
        void mo38329EC(boolean z11);

        /* renamed from: f2 */
        void mo38330f2();
    }

    /* renamed from: com.zing.zalo.uicomponents.framelayout.DragToCloseLayout$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC16433b {
        /* renamed from: b */
        void mo80889b();

        /* renamed from: c */
        void mo80890c(int i11, int i12);
    }

    /* renamed from: com.zing.zalo.uicomponents.framelayout.DragToCloseLayout$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC16434c {
        /* renamed from: a */
        void mo39366a(MotionEvent motionEvent);
    }

    /* renamed from: com.zing.zalo.uicomponents.framelayout.DragToCloseLayout$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC16435d {
    }

    public DragToCloseLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC16434c interfaceC16434c = this.f82909L;
        if (interfaceC16434c != null) {
            interfaceC16434c.mo39366a(motionEvent);
        }
        if (this.f82920z && onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uicomponents.framelayout.BaseRootFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        if (getResources().getConfiguration().orientation == 1) {
            if (this.f82901D) {
                int size = View.MeasureSpec.getSize(i12);
                if (size > this.f82902E) {
                    this.f82902E = size;
                    int i13 = this.f82903F;
                    if (size > i13) {
                        this.f82902E = i13;
                    }
                }
                i12 = View.MeasureSpec.makeMeasureSpec(this.f82902E, 1073741824);
            }
        } else if (getResources().getConfiguration().orientation == 2 && this.f82901D) {
            i12 = View.MeasureSpec.makeMeasureSpec(this.f82904G, 1073741824);
        }
        super.onMeasure(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uicomponents.framelayout.BaseRootFrameLayout, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f82919y = getMeasuredHeight();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        int i11;
        if (this.f82900C) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f82912r && !this.f82911q) {
            this.f82915u = motionEvent.getPointerId(0);
            this.f82911q = true;
            this.f82913s = (int) motionEvent.getRawX();
            this.f82914t = (int) motionEvent.getRawY();
            VelocityTracker velocityTracker = this.f82916v;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
            InterfaceC16433b interfaceC16433b = this.f82907J;
            if (interfaceC16433b != null) {
                interfaceC16433b.mo80890c(this.f82913s, this.f82914t);
            }
        } else if (this.f82920z && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f82915u) {
            if (this.f82916v == null) {
                this.f82916v = VelocityTracker.obtain();
            }
            int rawX = (int) (motionEvent.getRawX() - this.f82913s);
            int rawY = ((int) motionEvent.getRawY()) - this.f82914t;
            int i12 = this.f82910p;
            if (i12 == 2) {
                i11 = Math.abs(rawY);
            } else if (i12 == 1) {
                i11 = rawY;
            } else if (i12 == 0) {
                i11 = -rawY;
            } else {
                i11 = 0;
            }
            this.f82916v.addMovement(motionEvent);
            if (this.f82911q && !this.f82912r && i11 >= this.f82917w && i11 > Math.abs(rawX)) {
                this.f82911q = false;
                this.f82912r = true;
                this.f82913s = (int) motionEvent.getRawX();
                this.f82914t = (int) motionEvent.getRawY();
                InterfaceC16432a interfaceC16432a = this.f82906I;
                if (interfaceC16432a != null) {
                    interfaceC16432a.mo38330f2();
                }
            } else if (this.f82912r) {
                int i13 = this.f82919y;
                if (i13 - i11 >= i13) {
                    super.setTranslationY(this.f82905H);
                    InterfaceC16432a interfaceC16432a2 = this.f82906I;
                    if (interfaceC16432a2 != null) {
                        interfaceC16432a2.mo38328Dg(this.f82905H);
                    }
                } else if (i13 - i11 >= this.f82918x) {
                    super.setTranslationY(this.f82905H + rawY);
                    InterfaceC16432a interfaceC16432a3 = this.f82906I;
                    if (interfaceC16432a3 != null) {
                        interfaceC16432a3.mo38328Dg(rawY + this.f82905H);
                    }
                }
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f82915u && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.f82916v == null) {
                this.f82916v = VelocityTracker.obtain();
            }
            this.f82916v.computeCurrentVelocity(1000);
            if (this.f82912r) {
                float yVelocity = this.f82916v.getYVelocity();
                int i14 = this.f82910p;
                if (i14 != 2 ? !(i14 != 1 ? i14 != 0 || (-yVelocity) <= this.f82899B : yVelocity <= this.f82899B) : Math.abs(yVelocity) > this.f82899B) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float translationY = getTranslationY() - this.f82905H;
                int i15 = this.f82908K;
                if (i15 <= 0) {
                    i15 = getMeasuredHeight() / 3;
                }
                if (Math.abs(translationY) < i15 && (translationY == 0.0f || !z11)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                InterfaceC16432a interfaceC16432a4 = this.f82906I;
                if (interfaceC16432a4 != null) {
                    interfaceC16432a4.mo38329EC(!z12);
                }
            } else {
                InterfaceC16433b interfaceC16433b2 = this.f82907J;
                if (interfaceC16433b2 != null) {
                    interfaceC16433b2.mo80889b();
                }
            }
            this.f82911q = false;
            this.f82912r = false;
            VelocityTracker velocityTracker2 = this.f82916v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f82916v = null;
            }
        } else if (motionEvent == null) {
            this.f82911q = false;
            this.f82912r = false;
            VelocityTracker velocityTracker3 = this.f82916v;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f82916v = null;
            }
        }
        return this.f82912r;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (!this.f82898A) {
            onTouchEvent(null);
            super.requestDisallowInterceptTouchEvent(z11);
        } else {
            getParent().requestDisallowInterceptTouchEvent(z11);
        }
    }

    public void setCanInterceptTouch(boolean z11) {
        this.f82920z = z11;
        if (z11) {
            this.f82911q = false;
        }
    }

    public void setDirection(int i11) {
        this.f82910p = i11;
    }

    public void setDisableTouch(boolean z11) {
        this.f82900C = z11;
    }

    public void setForceInterceptTouch(boolean z11) {
        this.f82898A = z11;
    }

    public void setMinDistanceToClose(int i11) {
        this.f82908K = i11;
    }

    public void setMinFlingVelocity(int i11) {
        this.f82899B = i11;
    }

    public void setOnDragToCloseListener(InterfaceC16432a interfaceC16432a) {
        this.f82906I = interfaceC16432a;
    }

    public void setOnDragToCloseMoreOption(InterfaceC16433b interfaceC16433b) {
        this.f82907J = interfaceC16433b;
    }

    public void setOnTouchEventListener(InterfaceC16434c interfaceC16434c) {
        this.f82909L = interfaceC16434c;
    }

    public void setOnTranslationListener(InterfaceC16435d interfaceC16435d) {
    }

    public void setStartDragYPos(int i11) {
        this.f82905H = i11;
    }

    public DragToCloseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82910p = 1;
        this.f82919y = 0;
        this.f82920z = true;
        this.f82898A = false;
        this.f82899B = 1000;
        this.f82900C = false;
        this.f82901D = false;
        this.f82902E = 0;
        this.f82903F = 0;
        this.f82904G = 0;
        this.f82905H = 0;
        this.f82908K = 0;
        C30226b c30226b = new C30226b(getContext());
        this.f82918x = c30226b.mo149041e(48);
        this.f82917w = (int) (getResources().getDisplayMetrics().ydpi * 0.157480317325747d);
        this.f82899B = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f82903F = c30226b.mo149039c();
        this.f82904G = c30226b.mo149038b();
    }
}
