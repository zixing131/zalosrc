package com.zing.zalo.p077ui.widget.springback;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ListView;
import androidx.core.view.C1535c0;
import androidx.core.view.C1547f0;
import androidx.core.view.InterfaceC1491a0;
import androidx.core.view.InterfaceC1543e0;
import androidx.core.widget.AbstractC1637i;
import com.zing.zalo.AbstractC8923h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import ob0.C24196b;
import p664y.AbstractC30228a;

/* loaded from: classes6.dex */
public class SpringBackLayout extends ViewGroup implements InterfaceC1543e0, InterfaceC1491a0 {

    /* renamed from: A */
    private final C1535c0 f71335A;

    /* renamed from: B */
    private final C1547f0 f71336B;

    /* renamed from: C */
    private final int[] f71337C;

    /* renamed from: D */
    private List f71338D;

    /* renamed from: E */
    private int f71339E;

    /* renamed from: F */
    private final int[] f71340F;

    /* renamed from: G */
    private final int[] f71341G;

    /* renamed from: H */
    private final int f71342H;

    /* renamed from: I */
    private final int f71343I;

    /* renamed from: J */
    private boolean f71344J;

    /* renamed from: K */
    private int f71345K;

    /* renamed from: L */
    private int f71346L;

    /* renamed from: M */
    private boolean f71347M;

    /* renamed from: N */
    private int f71348N;

    /* renamed from: O */
    private C24196b f71349O;

    /* renamed from: P */
    private View f71350P;

    /* renamed from: Q */
    private int f71351Q;

    /* renamed from: R */
    private float f71352R;

    /* renamed from: S */
    private float f71353S;

    /* renamed from: T */
    private float f71354T;

    /* renamed from: U */
    private int f71355U;

    /* renamed from: V */
    private float f71356V;

    /* renamed from: W */
    private float f71357W;

    /* renamed from: p */
    private int f71358p;

    /* renamed from: q */
    private int f71359q;

    /* renamed from: r */
    private C13790a f71360r;

    /* renamed from: s */
    private float f71361s;

    /* renamed from: t */
    private float f71362t;

    /* renamed from: u */
    private float f71363u;

    /* renamed from: v */
    private float f71364v;

    /* renamed from: w */
    private boolean f71365w;

    /* renamed from: x */
    private boolean f71366x;

    /* renamed from: y */
    private int f71367y;

    /* renamed from: z */
    private boolean f71368z;

    /* renamed from: com.zing.zalo.ui.widget.springback.SpringBackLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13789a {
    }

    public SpringBackLayout(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private float m77000A(float f11, int i11) {
        int i12;
        if (i11 == 2) {
            i12 = this.f71342H;
        } else {
            i12 = this.f71343I;
        }
        double d11 = i12;
        return (float) (d11 - (Math.pow(d11, 0.6666666666666666d) * Math.pow(i12 - (f11 * 3.0f), 0.3333333333333333d)));
    }

    /* renamed from: B */
    private boolean m77001B(MotionEvent motionEvent) {
        boolean z11;
        if (!m77024u(1) && !m77023q(1)) {
            return false;
        }
        if (m77024u(1) && !m77013P()) {
            return false;
        }
        if (m77023q(1) && !m77012O()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i11 = this.f71359q;
                    if (i11 == -1) {
                        AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    if (findPointerIndex < 0) {
                        AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float x11 = motionEvent.getX(findPointerIndex);
                    if (m77023q(1) && m77024u(1)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((!z11 && m77024u(1)) || (z11 && x11 > this.f71361s)) {
                        if (x11 - this.f71361s > this.f71355U && !this.f71365w) {
                            this.f71365w = true;
                            m77020l(1);
                            this.f71363u = x11;
                        }
                    } else if (this.f71361s - x11 > this.f71355U && !this.f71365w) {
                        this.f71365w = true;
                        m77020l(1);
                        this.f71363u = x11;
                    }
                } else if (actionMasked != 3 && actionMasked == 6) {
                    m77007H(motionEvent);
                }
            }
            this.f71365w = false;
            this.f71359q = -1;
        } else {
            int pointerId = motionEvent.getPointerId(0);
            this.f71359q = pointerId;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f71361s = motionEvent.getX(findPointerIndex2);
            if (getScrollX() != 0) {
                this.f71365w = true;
                this.f71363u = this.f71361s;
            } else {
                this.f71365w = false;
            }
        }
        return this.f71365w;
    }

    /* renamed from: C */
    private boolean m77002C(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!m77024u(1) && !m77023q(1)) {
            return false;
        }
        if (m77024u(1) && m77023q(1)) {
            return m77005F(motionEvent, actionMasked, 1);
        }
        if (m77023q(1)) {
            return m77006G(motionEvent, actionMasked, 1);
        }
        return m77004E(motionEvent, actionMasked, 1);
    }

    /* renamed from: D */
    private void m77003D(int i11, int[] iArr, int i12) {
        boolean z11;
        int i13;
        int scrollX;
        float f11;
        if (this.f71367y == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i13 = 2;
        } else {
            i13 = 1;
        }
        if (z11) {
            scrollX = getScrollY();
        } else {
            scrollX = getScrollX();
        }
        int abs = Math.abs(scrollX);
        float f12 = 0.0f;
        if (i12 == 0) {
            if (i11 > 0) {
                float f13 = this.f71354T;
                if (f13 > 0.0f) {
                    float f14 = i11;
                    if (f14 > f13) {
                        m77018e((int) f13, iArr, i13);
                        this.f71354T = 0.0f;
                    } else {
                        this.f71354T = f13 - f14;
                        m77018e(i11, iArr, i13);
                    }
                    m77020l(1);
                    m77025w(m77028z(this.f71354T, i13), i13);
                    return;
                }
            }
            if (i11 < 0) {
                float f15 = this.f71353S;
                float f16 = -f15;
                if (f16 < 0.0f) {
                    float f17 = i11;
                    if (f17 < f16) {
                        m77018e((int) f15, iArr, i13);
                        this.f71353S = 0.0f;
                    } else {
                        this.f71353S = f15 + f17;
                        m77018e(i11, iArr, i13);
                    }
                    m77020l(1);
                    m77025w(-m77028z(this.f71353S, i13), i13);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 2) {
            f11 = this.f71357W;
        } else {
            f11 = this.f71356V;
        }
        if (i11 > 0) {
            float f18 = this.f71354T;
            if (f18 > 0.0f) {
                if (f11 > 2000.0f) {
                    float m77028z = m77028z(f18, i13);
                    float f19 = i11;
                    if (f19 > m77028z) {
                        m77018e((int) m77028z, iArr, i13);
                        this.f71354T = 0.0f;
                    } else {
                        m77018e(i11, iArr, i13);
                        f12 = m77028z - f19;
                        this.f71354T = m77000A(f12, i13);
                    }
                    m77025w(f12, i13);
                    m77020l(1);
                    return;
                }
                if (!this.f71344J) {
                    this.f71344J = true;
                    m77010L(f11, i13, false);
                }
                if (this.f71349O.m126137a()) {
                    scrollTo(this.f71349O.m126139c(), this.f71349O.m126140d());
                    this.f71354T = m77000A(abs, i13);
                } else {
                    this.f71354T = 0.0f;
                }
                m77018e(i11, iArr, i13);
                return;
            }
        }
        if (i11 < 0) {
            float f21 = this.f71353S;
            if ((-f21) < 0.0f) {
                if (f11 < -2000.0f) {
                    float m77028z2 = m77028z(f21, i13);
                    float f22 = i11;
                    if (f22 < (-m77028z2)) {
                        m77018e((int) m77028z2, iArr, i13);
                        this.f71353S = 0.0f;
                    } else {
                        m77018e(i11, iArr, i13);
                        f12 = m77028z2 + f22;
                        this.f71353S = m77000A(f12, i13);
                    }
                    m77020l(1);
                    m77025w(-f12, i13);
                    return;
                }
                if (!this.f71344J) {
                    this.f71344J = true;
                    m77010L(f11, i13, false);
                }
                if (this.f71349O.m126137a()) {
                    scrollTo(this.f71349O.m126139c(), this.f71349O.m126140d());
                    this.f71353S = m77000A(abs, i13);
                } else {
                    this.f71353S = 0.0f;
                }
                m77018e(i11, iArr, i13);
                return;
            }
        }
        if (i11 == 0) {
            return;
        }
        if ((this.f71353S == 0.0f || this.f71354T == 0.0f) && this.f71344J && getScrollY() == 0) {
            m77018e(i11, iArr, i13);
        }
    }

    /* renamed from: E */
    private boolean m77004E(MotionEvent motionEvent, int i11, int i12) {
        int actionIndex;
        float signum;
        float m77028z;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f71359q);
                    if (findPointerIndex < 0) {
                        AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    if (this.f71365w) {
                        if (i12 == 2) {
                            float y11 = motionEvent.getY(findPointerIndex);
                            signum = Math.signum(y11 - this.f71364v);
                            m77028z = m77028z(y11 - this.f71364v, i12);
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            signum = Math.signum(x11 - this.f71363u);
                            m77028z = m77028z(x11 - this.f71363u, i12);
                        }
                        float f11 = signum * m77028z;
                        if (f11 > 0.0f) {
                            m77029K(true);
                            m77025w(f11, i12);
                        } else {
                            m77025w(0.0f, i12);
                            return false;
                        }
                    }
                } else if (i11 != 3) {
                    if (i11 == 5) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f71359q);
                        if (findPointerIndex2 < 0) {
                            AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid active pointer id.");
                            return false;
                        }
                        if (i12 == 2) {
                            float y12 = motionEvent.getY(findPointerIndex2) - this.f71362t;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float y13 = motionEvent.getY(actionIndex) - y12;
                            this.f71362t = y13;
                            this.f71364v = y13;
                        } else {
                            float x12 = motionEvent.getX(findPointerIndex2) - this.f71361s;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float x13 = motionEvent.getX(actionIndex) - x12;
                            this.f71361s = x13;
                            this.f71363u = x13;
                        }
                        this.f71359q = motionEvent.getPointerId(actionIndex);
                    } else if (i11 == 6) {
                        m77007H(motionEvent);
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.f71359q) < 0) {
                AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f71365w) {
                this.f71365w = false;
                m77011M(i12);
            }
            this.f71359q = -1;
            return false;
        }
        this.f71359q = motionEvent.getPointerId(0);
        m77016c(i12);
        return true;
    }

    /* renamed from: F */
    private boolean m77005F(MotionEvent motionEvent, int i11, int i12) {
        int actionIndex;
        float signum;
        float m77028z;
        if (i11 == 0) {
            this.f71359q = motionEvent.getPointerId(0);
            m77016c(i12);
        } else if (i11 != 1) {
            if (i11 == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f71359q);
                if (findPointerIndex < 0) {
                    AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                if (this.f71365w) {
                    if (i12 == 2) {
                        float y11 = motionEvent.getY(findPointerIndex);
                        signum = Math.signum(y11 - this.f71364v);
                        m77028z = m77028z(y11 - this.f71364v, i12);
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        signum = Math.signum(x11 - this.f71363u);
                        m77028z = m77028z(x11 - this.f71363u, i12);
                    }
                    m77029K(true);
                    m77025w(signum * m77028z, i12);
                }
            } else {
                if (i11 == 3) {
                    return false;
                }
                if (i11 == 5) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.f71359q);
                    if (findPointerIndex2 < 0) {
                        AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid active pointer id.");
                        return false;
                    }
                    if (i12 == 2) {
                        float y12 = motionEvent.getY(findPointerIndex2) - this.f71362t;
                        actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        float y13 = motionEvent.getY(actionIndex) - y12;
                        this.f71362t = y13;
                        this.f71364v = y13;
                    } else {
                        float x12 = motionEvent.getX(findPointerIndex2) - this.f71361s;
                        actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        float x13 = motionEvent.getX(actionIndex) - x12;
                        this.f71361s = x13;
                        this.f71363u = x13;
                    }
                    this.f71359q = motionEvent.getPointerId(actionIndex);
                } else if (i11 == 6) {
                    m77007H(motionEvent);
                }
            }
        } else {
            if (motionEvent.findPointerIndex(this.f71359q) < 0) {
                AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f71365w) {
                this.f71365w = false;
                m77011M(i12);
            }
            this.f71359q = -1;
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private boolean m77006G(MotionEvent motionEvent, int i11, int i12) {
        int actionIndex;
        float signum;
        float m77028z;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f71359q);
                    if (findPointerIndex < 0) {
                        AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    if (this.f71365w) {
                        if (i12 == 2) {
                            float y11 = motionEvent.getY(findPointerIndex);
                            signum = Math.signum(this.f71364v - y11);
                            m77028z = m77028z(this.f71364v - y11, i12);
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            signum = Math.signum(this.f71363u - x11);
                            m77028z = m77028z(this.f71363u - x11, i12);
                        }
                        float f11 = signum * m77028z;
                        if (f11 > 0.0f) {
                            m77029K(true);
                            m77025w(-f11, i12);
                        } else {
                            m77025w(0.0f, i12);
                            return false;
                        }
                    }
                } else if (i11 != 3) {
                    if (i11 == 5) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f71359q);
                        if (findPointerIndex2 < 0) {
                            AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid active pointer id.");
                            return false;
                        }
                        if (i12 == 2) {
                            float y12 = motionEvent.getY(findPointerIndex2) - this.f71362t;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float y13 = motionEvent.getY(actionIndex) - y12;
                            this.f71362t = y13;
                            this.f71364v = y13;
                        } else {
                            float x12 = motionEvent.getX(findPointerIndex2) - this.f71361s;
                            actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            float x13 = motionEvent.getX(actionIndex) - x12;
                            this.f71361s = x13;
                            this.f71363u = x13;
                        }
                        this.f71359q = motionEvent.getPointerId(actionIndex);
                    } else if (i11 == 6) {
                        m77007H(motionEvent);
                    }
                }
            }
            if (motionEvent.findPointerIndex(this.f71359q) < 0) {
                AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f71365w) {
                this.f71365w = false;
                m77011M(i12);
            }
            this.f71359q = -1;
            return false;
        }
        this.f71359q = motionEvent.getPointerId(0);
        m77016c(i12);
        return true;
    }

    /* renamed from: H */
    private void m77007H(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f71359q) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.f71359q = motionEvent.getPointerId(i11);
        }
    }

    /* renamed from: I */
    private boolean m77008I(MotionEvent motionEvent) {
        boolean z11;
        if (!m77024u(2) && !m77023q(2)) {
            return false;
        }
        if (m77024u(2) && !m77013P()) {
            return false;
        }
        if (m77023q(2) && !m77012O()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i11 = this.f71359q;
                    if (i11 == -1) {
                        AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    if (findPointerIndex < 0) {
                        AbstractC23350e.m122774d("SpringBackLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y11 = motionEvent.getY(findPointerIndex);
                    if (m77023q(2) && m77024u(2)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((!z11 && m77024u(2)) || (z11 && y11 > this.f71362t)) {
                        if (y11 - this.f71362t > this.f71355U && !this.f71365w) {
                            this.f71365w = true;
                            m77020l(1);
                            this.f71364v = y11;
                        }
                    } else if (this.f71362t - y11 > this.f71355U && !this.f71365w) {
                        this.f71365w = true;
                        m77020l(1);
                        this.f71364v = y11;
                    }
                } else if (actionMasked != 3 && actionMasked == 6) {
                    m77007H(motionEvent);
                }
            }
            this.f71365w = false;
            this.f71359q = -1;
        } else {
            int pointerId = motionEvent.getPointerId(0);
            this.f71359q = pointerId;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f71362t = motionEvent.getY(findPointerIndex2);
            if (getScrollY() != 0) {
                this.f71365w = true;
                this.f71364v = this.f71362t;
            } else {
                this.f71365w = false;
            }
        }
        return this.f71365w;
    }

    /* renamed from: J */
    private boolean m77009J(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!m77024u(2) && !m77023q(2)) {
            return false;
        }
        if (m77024u(2) && m77023q(2)) {
            return m77005F(motionEvent, actionMasked, 2);
        }
        if (m77023q(2)) {
            return m77006G(motionEvent, actionMasked, 2);
        }
        return m77004E(motionEvent, actionMasked, 2);
    }

    /* renamed from: L */
    private void m77010L(float f11, int i11, boolean z11) {
        this.f71349O.m126138b();
        this.f71349O.m126143g(getScrollX(), 0.0f, getScrollY(), 0.0f, f11, i11, false);
        m77020l(2);
        if (z11) {
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: M */
    private void m77011M(int i11) {
        m77010L(0.0f, i11, true);
    }

    /* renamed from: O */
    private boolean m77012O() {
        return (this.f71348N & 2) != 0;
    }

    /* renamed from: P */
    private boolean m77013P() {
        return (this.f71348N & 1) != 0;
    }

    /* renamed from: a */
    private void m77014a() {
        if (getScrollX() != 0) {
            this.f71365w = true;
            float m77000A = m77000A(Math.abs(getScrollX()), 2);
            if (getScrollX() < 0) {
                this.f71361s -= m77000A;
            } else {
                this.f71361s += m77000A;
            }
            this.f71363u = this.f71361s;
            return;
        }
        this.f71365w = false;
    }

    /* renamed from: b */
    private void m77015b(MotionEvent motionEvent) {
        int i11;
        this.f71360r.m77034a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            m77007H(motionEvent);
                            return;
                        }
                        return;
                    }
                } else {
                    if (this.f71345K == 0 && (i11 = this.f71360r.f71372d) != 0) {
                        this.f71345K = i11;
                        return;
                    }
                    return;
                }
            }
            m77019f(false);
            if ((this.f71339E & 2) != 0) {
                m77011M(2);
                return;
            } else {
                m77011M(1);
                return;
            }
        }
        C13790a c13790a = this.f71360r;
        this.f71362t = c13790a.f71371c;
        this.f71361s = c13790a.f71370b;
        this.f71359q = c13790a.f71369a;
        if (getScrollY() != 0) {
            this.f71345K = 2;
            m77029K(true);
        } else if (getScrollX() != 0) {
            this.f71345K = 1;
            m77029K(true);
        } else {
            this.f71345K = 0;
        }
        if ((this.f71339E & 2) != 0) {
            m77016c(2);
        } else {
            m77016c(1);
        }
    }

    /* renamed from: c */
    private void m77016c(int i11) {
        if (i11 == 2) {
            m77017d();
        } else {
            m77014a();
        }
    }

    /* renamed from: d */
    private void m77017d() {
        if (getScrollY() != 0) {
            this.f71365w = true;
            float m77000A = m77000A(Math.abs(getScrollY()), 2);
            if (getScrollY() < 0) {
                this.f71362t -= m77000A;
            } else {
                this.f71362t += m77000A;
            }
            this.f71364v = this.f71362t;
            return;
        }
        this.f71365w = false;
    }

    /* renamed from: e */
    private void m77018e(int i11, int[] iArr, int i12) {
        if (i12 == 2) {
            iArr[1] = i11;
        } else {
            iArr[0] = i11;
        }
    }

    /* renamed from: f */
    private void m77019f(boolean z11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    /* renamed from: l */
    private void m77020l(int i11) {
        if (this.f71346L != i11) {
            this.f71346L = i11;
            Iterator it = this.f71338D.iterator();
            if (it.hasNext()) {
                AbstractC30228a.m149044a(it.next());
                this.f71349O.m126142f();
                throw null;
            }
        }
    }

    /* renamed from: m */
    private void m77021m() {
        if (this.f71350P == null) {
            int i11 = this.f71351Q;
            if (i11 != -1) {
                this.f71350P = findViewById(i11);
            } else {
                throw new IllegalArgumentException("invalid target Id");
            }
        }
        if (this.f71350P != null) {
            if (isEnabled()) {
                View view = this.f71350P;
                if ((view instanceof InterfaceC1491a0) && !view.isNestedScrollingEnabled()) {
                    this.f71350P.setNestedScrollingEnabled(true);
                }
            }
            if (this.f71350P.getOverScrollMode() != 2) {
                this.f71350P.setOverScrollMode(2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("fail to get target");
    }

    /* renamed from: p */
    private boolean m77022p(int i11) {
        return this.f71345K == i11;
    }

    /* renamed from: q */
    private boolean m77023q(int i11) {
        if (i11 != 2) {
            return !this.f71350P.canScrollHorizontally(1);
        }
        if (this.f71350P instanceof ListView) {
            return !AbstractC1637i.m8397a((ListView) r3, 1);
        }
        return !r3.canScrollVertically(1);
    }

    /* renamed from: u */
    private boolean m77024u(int i11) {
        if (i11 != 2) {
            return !this.f71350P.canScrollHorizontally(-1);
        }
        if (this.f71350P instanceof ListView) {
            return !AbstractC1637i.m8397a((ListView) r3, -1);
        }
        return !r3.canScrollVertically(-1);
    }

    /* renamed from: w */
    private void m77025w(float f11, int i11) {
        if (i11 == 2) {
            scrollTo(0, (int) (-f11));
        } else {
            scrollTo((int) (-f11), 0);
        }
    }

    /* renamed from: x */
    private float m77026x(float f11, int i11) {
        int i12;
        if (i11 == 2) {
            i12 = this.f71342H;
        } else {
            i12 = this.f71343I;
        }
        double min = Math.min(f11, 1.0f);
        return ((float) (((Math.pow(min, 3.0d) / 3.0d) - Math.pow(min, 2.0d)) + min)) * i12;
    }

    /* renamed from: y */
    private float m77027y(int i11) {
        return m77026x(1.0f, i11);
    }

    /* renamed from: z */
    private float m77028z(float f11, int i11) {
        int i12;
        float abs = Math.abs(f11);
        if (i11 == 2) {
            i12 = this.f71342H;
        } else {
            i12 = this.f71343I;
        }
        return m77026x(Math.min(abs / i12, 1.0f), i11);
    }

    /* renamed from: K */
    public void m77029K(boolean z11) {
        ViewParent parent = getParent();
        parent.requestDisallowInterceptTouchEvent(z11);
        while (parent != null) {
            if (parent instanceof SpringBackLayout) {
                ((SpringBackLayout) parent).m77033n(z11);
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: N */
    public void m77030N(int i11) {
        this.f71335A.m7728r(i11);
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f71349O.m126137a()) {
            scrollTo(this.f71349O.m126139c(), this.f71349O.m126140d());
            if (!this.f71349O.m126142f()) {
                postInvalidateOnAnimation();
            } else {
                m77020l(0);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f71335A.m7715a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f71335A.m7716b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f71335A.m7717c(i11, i12, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && this.f71346L == 2 && this.f71360r.m77035b(motionEvent)) {
            m77020l(1);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 && this.f71346L != 2) {
            m77020l(0);
        }
        return dispatchTouchEvent;
    }

    /* renamed from: g */
    public boolean m77031g(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return this.f71335A.m7718d(i11, i12, iArr, iArr2, i13);
    }

    public int getSpringBackMode() {
        return this.f71348N;
    }

    /* renamed from: h */
    public void m77032h(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        this.f71335A.m7719e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: i */
    public void mo5176i(View view, View view2, int i11, int i12) {
        boolean z11;
        int scrollX;
        if (this.f71347M) {
            int i13 = 2;
            if (this.f71367y == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                i13 = 1;
            }
            if (z11) {
                scrollX = getScrollY();
            } else {
                scrollX = getScrollX();
            }
            float f11 = scrollX;
            if (i12 != 0) {
                if (f11 == 0.0f) {
                    this.f71352R = 0.0f;
                } else {
                    this.f71352R = m77000A(Math.abs(f11), i13);
                }
                this.f71366x = true;
                this.f71358p = 0;
            } else {
                if (f11 == 0.0f) {
                    this.f71354T = 0.0f;
                    this.f71353S = 0.0f;
                } else if (f11 < 0.0f) {
                    this.f71354T = m77000A(Math.abs(f11), i13);
                    this.f71353S = 0.0f;
                } else {
                    this.f71354T = 0.0f;
                    this.f71353S = m77000A(Math.abs(f11), i13);
                }
                this.f71368z = true;
            }
            this.f71357W = 0.0f;
            this.f71356V = 0.0f;
            this.f71344J = false;
            this.f71349O.m126138b();
        }
        onNestedScrollAccepted(view, view2, i11);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f71335A.m7723l();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: j */
    public void mo5177j(View view, int i11) {
        boolean z11;
        float f11;
        int scrollX;
        this.f71336B.m7765e(view, i11);
        m77030N(i11);
        if (this.f71347M) {
            int i12 = 1;
            if (this.f71367y == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i12 = 2;
            }
            if (this.f71368z) {
                this.f71368z = false;
                if (z11) {
                    scrollX = getScrollY();
                } else {
                    scrollX = getScrollX();
                }
                float f12 = scrollX;
                if (!this.f71366x && f12 != 0.0f) {
                    m77011M(i12);
                    return;
                } else {
                    if (f12 != 0.0f) {
                        m77020l(2);
                        return;
                    }
                    return;
                }
            }
            if (this.f71366x) {
                this.f71366x = false;
                if (this.f71344J) {
                    if (this.f71349O.m126142f()) {
                        if (i12 == 2) {
                            f11 = this.f71357W;
                        } else {
                            f11 = this.f71356V;
                        }
                        m77010L(f11, i12, false);
                    }
                    postInvalidateOnAnimation();
                    return;
                }
                m77011M(i12);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: k */
    public void mo5178k(View view, int i11, int i12, int[] iArr, int i13) {
        if (this.f71347M) {
            if (this.f71367y == 2) {
                m77003D(i12, iArr, i13);
            } else {
                m77003D(i11, iArr, i13);
            }
        }
        int[] iArr2 = this.f71341G;
        if (m77031g(i11 - iArr[0], i12 - iArr[1], iArr2, null, i13)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    /* renamed from: n */
    public void m77033n(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f71347M && isEnabled() && !this.f71366x && !this.f71368z && !this.f71350P.isNestedScrollingEnabled()) {
            int actionMasked = motionEvent.getActionMasked();
            if (!this.f71349O.m126142f() && actionMasked == 0) {
                this.f71349O.m126138b();
            }
            if (!m77013P() && !m77012O()) {
                return false;
            }
            int i11 = this.f71339E;
            if ((i11 & 4) != 0) {
                m77015b(motionEvent);
                if (m77022p(2) && (this.f71339E & 1) != 0 && getScrollX() == 0.0f) {
                    return false;
                }
                if (m77022p(1) && (this.f71339E & 2) != 0 && getScrollY() == 0.0f) {
                    return false;
                }
                if (m77022p(2) || m77022p(1)) {
                    m77019f(true);
                }
            } else {
                this.f71345K = i11;
            }
            if (m77022p(2)) {
                return m77008I(motionEvent);
            }
            if (m77022p(1)) {
                return m77001B(motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f71350P.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        m77021m();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        measureChild(this.f71350P, i11, i12);
        if (size > this.f71350P.getMeasuredWidth()) {
            size = this.f71350P.getMeasuredWidth();
        }
        if (size2 > this.f71350P.getMeasuredHeight()) {
            size2 = this.f71350P.getMeasuredHeight();
        }
        if (mode != 1073741824) {
            size = this.f71350P.getMeasuredWidth();
        }
        if (mode2 != 1073741824) {
            size2 = this.f71350P.getMeasuredHeight();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return dispatchNestedFling(f11, f12, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        mo5182r(view, i11, i12, i13, i14, 0, this.f71337C);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f71336B.m7762b(view, view2, i11);
        startNestedScroll(i11 & 2);
    }

    @Override // android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        Iterator it = this.f71338D.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC30228a.m149044a(it.next());
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return isEnabled();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !this.f71366x && !this.f71368z && !this.f71350P.isNestedScrollingEnabled()) {
            if (!this.f71349O.m126142f() && actionMasked == 0) {
                this.f71349O.m126138b();
            }
            if (m77022p(2)) {
                return m77009J(motionEvent);
            }
            if (m77022p(1)) {
                return m77002C(motionEvent);
            }
        }
        return false;
    }

    @Override // androidx.core.view.InterfaceC1543e0
    /* renamed from: r */
    public void mo5182r(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22 = 0;
        if (this.f71367y == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i16 = i12;
        } else {
            i16 = i11;
        }
        if (z11) {
            i17 = iArr[1];
        } else {
            i17 = iArr[0];
        }
        int i23 = i17;
        m77032h(i11, i12, i13, i14, this.f71340F, i15, iArr);
        if (this.f71347M) {
            if (z11) {
                i18 = iArr[1];
            } else {
                i18 = iArr[0];
            }
            int i24 = i18 - i23;
            if (z11) {
                i19 = i14 - i24;
            } else {
                i19 = i13 - i24;
            }
            if (i19 != 0) {
                i22 = i19;
            }
            if (z11) {
                i21 = 2;
            } else {
                i21 = 1;
            }
            if (i22 < 0 && m77024u(i21) && m77013P()) {
                if (i15 != 0) {
                    float m77027y = m77027y(i21);
                    if (this.f71357W == 0.0f && this.f71356V == 0.0f) {
                        if (this.f71354T == 0.0f) {
                            float f11 = m77027y - this.f71352R;
                            if (this.f71358p < 4) {
                                if (f11 <= Math.abs(i22)) {
                                    this.f71352R += f11;
                                    iArr[1] = (int) (iArr[1] + f11);
                                } else {
                                    this.f71352R += Math.abs(i22);
                                    iArr[1] = iArr[1] + i19;
                                }
                                m77020l(2);
                                m77025w(m77028z(this.f71352R, i21), i21);
                                this.f71358p++;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.f71344J = true;
                    if (i16 != 0 && (-i22) <= m77027y) {
                        this.f71349O.m126144h(i22);
                    }
                    m77020l(2);
                    return;
                }
                if (this.f71349O.m126142f()) {
                    this.f71354T += Math.abs(i22);
                    m77020l(1);
                    m77025w(m77028z(this.f71354T, i21), i21);
                    iArr[1] = iArr[1] + i19;
                    return;
                }
                return;
            }
            if (i22 > 0 && m77023q(i21) && m77012O()) {
                if (i15 != 0) {
                    float m77027y2 = m77027y(i21);
                    if (this.f71357W == 0.0f && this.f71356V == 0.0f) {
                        if (this.f71353S == 0.0f) {
                            float f12 = m77027y2 - this.f71352R;
                            if (this.f71358p < 4) {
                                if (f12 <= Math.abs(i22)) {
                                    this.f71352R += f12;
                                    iArr[1] = (int) (iArr[1] + f12);
                                } else {
                                    this.f71352R += Math.abs(i22);
                                    iArr[1] = iArr[1] + i19;
                                }
                                m77020l(2);
                                m77025w(-m77028z(this.f71352R, i21), i21);
                                this.f71358p++;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.f71344J = true;
                    if (i16 != 0 && i22 <= m77027y2) {
                        this.f71349O.m126144h(i22);
                    }
                    m77020l(2);
                    return;
                }
                if (this.f71349O.m126142f()) {
                    this.f71353S += Math.abs(i22);
                    m77020l(1);
                    m77025w(-m77028z(this.f71353S, i21), i21);
                    iArr[1] = iArr[1] + i19;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (!isEnabled() || !this.f71347M) {
            super.requestDisallowInterceptTouchEvent(z11);
        }
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: s */
    public void mo5183s(View view, int i11, int i12, int i13, int i14, int i15) {
        mo5182r(view, i11, i12, i13, i14, i15, this.f71337C);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        View view = this.f71350P;
        if ((view instanceof InterfaceC1491a0) && z11 != view.isNestedScrollingEnabled()) {
            this.f71350P.setNestedScrollingEnabled(z11);
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.f71335A.m7724m(z11);
    }

    public void setOnSpringListener(InterfaceC13789a interfaceC13789a) {
    }

    public void setScrollOrientation(int i11) {
        this.f71339E = i11;
        this.f71360r.f71374f = i11;
    }

    public void setSpringBackEnable(boolean z11) {
        this.f71347M = z11;
    }

    public void setSpringBackMode(int i11) {
        this.f71348N = i11;
    }

    public void setTarget(View view) {
        this.f71350P = view;
        if ((view instanceof InterfaceC1491a0) && !view.isNestedScrollingEnabled()) {
            this.f71350P.setNestedScrollingEnabled(true);
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return this.f71335A.m7725o(i11);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f71335A.m7727q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:            if ((r4.f71350P instanceof androidx.core.widget.NestedScrollView) != false) goto L24;     */
    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo5184v(View view, View view2, int i11, int i12) {
        boolean z11;
        int scrollX;
        if (this.f71347M) {
            this.f71367y = i11;
            int i13 = 2;
            if (i11 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                i13 = 1;
            }
            if ((i13 & this.f71339E) != 0 && onStartNestedScroll(view, view, i11)) {
                if (z11) {
                    scrollX = getScrollY();
                } else {
                    scrollX = getScrollX();
                }
                float f11 = scrollX;
                if (i12 != 0) {
                    if (f11 != 0.0f) {
                    }
                }
            }
            return false;
        }
        this.f71335A.m7726p(i11, i12);
        return true;
    }

    public SpringBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71359q = -1;
        this.f71358p = 0;
        this.f71341G = new int[2];
        this.f71340F = new int[2];
        this.f71337C = new int[2];
        this.f71347M = true;
        this.f71338D = new ArrayList();
        this.f71346L = 0;
        this.f71336B = new C1547f0(this);
        this.f71335A = new C1535c0(this);
        this.f71355U = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.SpringBackLayout);
        this.f71351Q = obtainStyledAttributes.getResourceId(AbstractC8923h0.SpringBackLayout_scrollableView, -1);
        this.f71339E = obtainStyledAttributes.getInt(AbstractC8923h0.SpringBackLayout_scrollOrientation, 2);
        this.f71348N = obtainStyledAttributes.getInt(AbstractC8923h0.SpringBackLayout_springBackMode, 3);
        obtainStyledAttributes.recycle();
        this.f71349O = new C24196b();
        this.f71360r = new C13790a(this, this.f71339E);
        setNestedScrollingEnabled(true);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f71343I = displayMetrics.widthPixels;
        this.f71342H = displayMetrics.heightPixels;
    }
}
