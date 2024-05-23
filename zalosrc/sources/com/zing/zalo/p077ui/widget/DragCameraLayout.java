package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.zing.zalo.camera.ZaloCameraView;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public class DragCameraLayout extends FrameLayout {

    /* renamed from: I */
    public static final int f69179I = AbstractC23136l9.m118713h0() - AbstractC23136l9.m118742r(252.0f);

    /* renamed from: J */
    public static final int f69180J = AbstractC23136l9.m118713h0() - AbstractC23222t7.f112539R;

    /* renamed from: A */
    int f69181A;

    /* renamed from: B */
    float f69182B;

    /* renamed from: C */
    float f69183C;

    /* renamed from: D */
    VelocityTracker f69184D;

    /* renamed from: E */
    InterfaceC13495a f69185E;

    /* renamed from: F */
    boolean f69186F;

    /* renamed from: G */
    float f69187G;

    /* renamed from: H */
    float f69188H;

    /* renamed from: p */
    boolean f69189p;

    /* renamed from: q */
    boolean f69190q;

    /* renamed from: r */
    boolean f69191r;

    /* renamed from: s */
    boolean f69192s;

    /* renamed from: t */
    boolean f69193t;

    /* renamed from: u */
    boolean f69194u;

    /* renamed from: v */
    boolean f69195v;

    /* renamed from: w */
    int f69196w;

    /* renamed from: x */
    int f69197x;

    /* renamed from: y */
    int f69198y;

    /* renamed from: z */
    int f69199z;

    /* renamed from: com.zing.zalo.ui.widget.DragCameraLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13495a {
        /* renamed from: a */
        void mo39155a(float f11, float f12, float f13, float f14, boolean z11, boolean z12);

        /* renamed from: b */
        void mo39156b(float f11, float f12, float f13, float f14);

        /* renamed from: c */
        void mo39157c(float f11, float f12, int i11);
    }

    public DragCameraLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69191r = true;
        this.f69192s = false;
        this.f69193t = false;
        this.f69194u = true;
        this.f69195v = false;
        this.f69199z = 1000;
        this.f69181A = -1;
        this.f69187G = AbstractC32232i.m155454b(0.4f, true);
        this.f69188H = AbstractC32232i.m155454b(0.4f, false);
        this.f69199z = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f69191r && onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01fc, code lost:            if (r10 >= 0.0f) goto L150;     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0205, code lost:            if ((r8 - r13.f69197x) == 0.0f) goto L150;     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0210, code lost:            if (java.lang.Math.abs(r10) <= r13.f69199z) goto L150;     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0212, code lost:            r14 = true;     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x000e, B:9:0x0012, B:11:0x0016, B:13:0x0038, B:24:0x004d, B:26:0x0067, B:28:0x006b, B:30:0x0079, B:34:0x0089, B:36:0x00ac, B:38:0x00b0, B:41:0x00b7, B:46:0x00c3, B:56:0x00ec, B:58:0x0102, B:59:0x0108, B:62:0x0110, B:64:0x0126, B:65:0x012c, B:67:0x0135, B:69:0x013b, B:71:0x00dc, B:77:0x00cd, B:84:0x008d, B:86:0x0098, B:90:0x00a8, B:93:0x0148, B:95:0x014c, B:97:0x0150, B:99:0x0154, B:100:0x015d, B:102:0x0161, B:103:0x0166, B:105:0x016e, B:106:0x0171, B:108:0x0175, B:110:0x0179, B:112:0x019a, B:116:0x01a2, B:119:0x01b0, B:121:0x01be, B:129:0x01d4, B:131:0x01d8, B:139:0x01ee, B:146:0x01fe, B:148:0x0207, B:151:0x0215, B:153:0x021d, B:155:0x0222, B:157:0x022c, B:158:0x0233), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        boolean z15;
        int i13;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i14;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!this.f69193t) {
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 && !this.f69190q && !this.f69189p) {
                    this.f69189p = true;
                    this.f69196w = (int) motionEvent.getX();
                    this.f69197x = (int) motionEvent.getY();
                    this.f69182B = motionEvent.getX();
                    this.f69183C = motionEvent.getY();
                    this.f69186F = false;
                    VelocityTracker velocityTracker2 = this.f69184D;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else {
                    if (actionMasked != 3 && actionMasked != 1 && actionMasked != 6) {
                        if (actionMasked == 2) {
                            float x11 = motionEvent.getX();
                            float y11 = motionEvent.getY();
                            int i15 = ((int) x11) - this.f69196w;
                            int i16 = ((int) y11) - this.f69197x;
                            float f11 = x11 - this.f69182B;
                            float f12 = this.f69183C;
                            if (this.f69189p && !this.f69190q) {
                                this.f69181A = -1;
                                if (Math.abs(i16) >= this.f69188H && Math.abs(i16) / 3 > Math.abs(i15)) {
                                    if (i16 > 0) {
                                        i14 = 1;
                                    } else {
                                        i14 = 0;
                                    }
                                    this.f69181A = i14;
                                } else if (Math.abs(i15) >= this.f69187G && Math.abs(i15) / 3 > Math.abs(i16)) {
                                    if (i15 > 0) {
                                        i11 = 2;
                                    } else {
                                        i11 = 3;
                                    }
                                    this.f69181A = i11;
                                } else {
                                    z14 = false;
                                    i12 = this.f69198y;
                                    if (i12 <= 0 && this.f69197x >= i12) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    i13 = this.f69181A;
                                    if (i13 != 1) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (i13 != 0) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if ((!this.f69195v && z17) || ((z16 && z15) || this.f69197x >= f69180J)) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    if ((i13 != 2 && i13 != 3) || (!z15 && this.f69197x > ZaloCameraView.f40825K2)) {
                                        z19 = false;
                                        if (!z14 && (z18 || z19)) {
                                            this.f69189p = false;
                                            this.f69190q = false;
                                            this.f69196w = (int) motionEvent.getX();
                                            this.f69197x = (int) motionEvent.getY();
                                            if (this.f69184D == null) {
                                                this.f69184D = VelocityTracker.obtain();
                                            }
                                            this.f69184D.addMovement(motionEvent);
                                            return false;
                                        }
                                        if (z14) {
                                            this.f69189p = false;
                                            this.f69190q = true;
                                            this.f69196w = (int) motionEvent.getX();
                                            this.f69197x = (int) motionEvent.getY();
                                            if (this.f69184D == null) {
                                                this.f69184D = VelocityTracker.obtain();
                                            }
                                            this.f69184D.addMovement(motionEvent);
                                            if (!this.f69186F) {
                                                this.f69186F = true;
                                                InterfaceC13495a interfaceC13495a = this.f69185E;
                                                if (interfaceC13495a != null) {
                                                    interfaceC13495a.mo39157c(this.f69196w, this.f69197x, this.f69181A);
                                                }
                                            }
                                        }
                                    }
                                    z19 = true;
                                    if (!z14) {
                                    }
                                    if (z14) {
                                    }
                                }
                                z14 = true;
                                i12 = this.f69198y;
                                if (i12 <= 0) {
                                }
                                z15 = false;
                                i13 = this.f69181A;
                                if (i13 != 1) {
                                }
                                if (i13 != 0) {
                                }
                                if (!this.f69195v) {
                                }
                                z18 = false;
                                if (i13 != 2) {
                                    z19 = false;
                                    if (!z14) {
                                    }
                                    if (z14) {
                                    }
                                }
                                z19 = false;
                                if (!z14) {
                                }
                                if (z14) {
                                }
                            } else if (this.f69190q && this.f69186F) {
                                InterfaceC13495a interfaceC13495a2 = this.f69185E;
                                if (interfaceC13495a2 != null) {
                                    this.f69182B = x11;
                                    this.f69183C = f12;
                                    interfaceC13495a2.mo39156b(i15, i16, f11, f12);
                                }
                                VelocityTracker velocityTracker3 = this.f69184D;
                                if (velocityTracker3 != null) {
                                    velocityTracker3.addMovement(motionEvent);
                                }
                            }
                        }
                    }
                    this.f69190q = false;
                    this.f69189p = false;
                    VelocityTracker velocityTracker4 = this.f69184D;
                    if (velocityTracker4 != null) {
                        velocityTracker4.addMovement(motionEvent);
                    }
                    if (this.f69186F && (velocityTracker = this.f69184D) != null) {
                        velocityTracker.computeCurrentVelocity(1000);
                        float x12 = motionEvent.getX();
                        float y12 = motionEvent.getY();
                        this.f69182B = x12;
                        this.f69183C = y12;
                        float xVelocity = this.f69184D.getXVelocity();
                        float yVelocity = this.f69184D.getYVelocity();
                        if (this.f69185E != null) {
                            int i17 = this.f69181A;
                            if (i17 != 0 && i17 != 1) {
                                if (Math.abs(xVelocity) > this.f69199z) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                int measuredWidth = getMeasuredWidth() / 2;
                                float f13 = x12 - this.f69196w;
                                if (this.f69181A == 2 && (Math.abs(f13) >= measuredWidth || (xVelocity > 0.0f && f13 != 0.0f && z11))) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (this.f69181A == 3 && (Math.abs(x12) <= measuredWidth || (xVelocity < 0.0f && f13 != 0.0f && z11))) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                this.f69185E.mo39155a(x12, y12, xVelocity, yVelocity, !z12, !z13);
                            }
                            boolean z21 = false;
                            this.f69185E.mo39155a(x12, y12, xVelocity, yVelocity, !z21, false);
                        }
                    }
                    this.f69186F = false;
                }
            } else if (motionEvent == null) {
                this.f69189p = false;
                this.f69190q = false;
                this.f69186F = false;
                VelocityTracker velocityTracker5 = this.f69184D;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.f69184D = null;
                }
            }
            return this.f69186F;
        }
        this.f69189p = false;
        this.f69190q = false;
        this.f69186F = false;
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (!this.f69192s) {
            onTouchEvent(null);
            super.requestDisallowInterceptTouchEvent(z11);
        } else {
            getParent().requestDisallowInterceptTouchEvent(z11);
        }
    }

    public void setCanHandleTouch(boolean z11) {
        this.f69194u = z11;
    }

    public void setCanInterceptTouch(boolean z11) {
        this.f69191r = z11;
        if (z11) {
            this.f69189p = false;
        }
    }

    public void setDisableTouch(boolean z11) {
        this.f69193t = z11;
    }

    public void setOnDragCameraListener(InterfaceC13495a interfaceC13495a) {
        this.f69185E = interfaceC13495a;
    }

    public void setPickerMiniY(int i11) {
        this.f69198y = i11;
    }

    public void setShowBgPickerBox(boolean z11) {
        this.f69195v = z11;
    }
}
