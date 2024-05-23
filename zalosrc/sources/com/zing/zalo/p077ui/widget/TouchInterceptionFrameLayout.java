package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class TouchInterceptionFrameLayout extends FrameLayout {

    /* renamed from: p */
    private boolean f69843p;

    /* renamed from: q */
    private boolean f69844q;

    /* renamed from: r */
    private boolean f69845r;

    /* renamed from: s */
    private boolean f69846s;

    /* renamed from: t */
    private PointF f69847t;

    /* renamed from: u */
    private float f69848u;

    /* renamed from: v */
    private MotionEvent f69849v;

    /* renamed from: w */
    private InterfaceC13549b f69850w;

    /* renamed from: x */
    private boolean f69851x;

    /* renamed from: y */
    private float f69852y;

    /* renamed from: z */
    private InterfaceC13548a f69853z;

    /* renamed from: com.zing.zalo.ui.widget.TouchInterceptionFrameLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13548a {
        /* renamed from: a */
        void mo72876a(float f11);
    }

    /* renamed from: com.zing.zalo.ui.widget.TouchInterceptionFrameLayout$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13549b {
        /* renamed from: Jz */
        void mo71217Jz(View view, MotionEvent motionEvent, float f11, float f12, boolean z11);

        /* renamed from: Kj */
        void mo71219Kj(View view, MotionEvent motionEvent);

        /* renamed from: TH */
        void mo71235TH(View view, MotionEvent motionEvent, boolean z11);

        /* renamed from: m6 */
        boolean mo71274m6(View view, MotionEvent motionEvent, boolean z11, float f11, float f12, boolean z12);
    }

    public TouchInterceptionFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69848u = 0.0f;
        this.f69851x = false;
        this.f69852y = 0.0f;
    }

    /* renamed from: a */
    private void m75970a(MotionEvent motionEvent, MotionEvent... motionEventArr) {
        if (motionEvent == null) {
            return;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                if (rect.contains((int) obtainNoHistory.getX(), (int) obtainNoHistory.getY())) {
                    float f11 = -childAt.getLeft();
                    float f12 = -childAt.getTop();
                    boolean z11 = false;
                    if (motionEventArr != null) {
                        boolean z12 = false;
                        for (MotionEvent motionEvent2 : motionEventArr) {
                            if (motionEvent2 != null) {
                                MotionEvent obtainNoHistory2 = MotionEvent.obtainNoHistory(motionEvent2);
                                obtainNoHistory2.offsetLocation(f11, f12);
                                z12 |= childAt.dispatchTouchEvent(obtainNoHistory2);
                            }
                        }
                        z11 = z12;
                    }
                    obtainNoHistory.offsetLocation(f11, f12);
                    if ((childAt.dispatchTouchEvent(obtainNoHistory) | z11) != 0) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: b */
    private MotionEvent m75971b(MotionEvent motionEvent, int i11) {
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        obtainNoHistory.setAction(i11);
        return obtainNoHistory;
    }

    public float getPosition() {
        return getTranslationY();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        boolean z11;
        ViewParent parent;
        if (this.f69850w == null) {
            return false;
        }
        try {
            actionMasked = motionEvent.getActionMasked();
            z11 = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else {
                    if (this.f69847t == null) {
                        this.f69847t = new PointF(motionEvent.getX(), motionEvent.getY());
                    }
                    float x11 = motionEvent.getX() - this.f69847t.x;
                    float y11 = motionEvent.getY() - this.f69847t.y;
                    if (motionEvent.getRawY() - this.f69848u <= 0.0f) {
                        z11 = false;
                    }
                    this.f69851x = z11;
                    this.f69848u = motionEvent.getRawY();
                    boolean mo71274m6 = this.f69850w.mo71274m6(this, motionEvent, true, x11, y11, this.f69851x);
                    this.f69843p = mo71274m6;
                    return mo71274m6;
                }
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
        this.f69847t = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f69848u = motionEvent.getRawY();
        this.f69849v = MotionEvent.obtainNoHistory(motionEvent);
        this.f69844q = true;
        boolean mo71274m62 = this.f69850w.mo71274m6(this, motionEvent, false, 0.0f, 0.0f, this.f69851x);
        this.f69843p = mo71274m62;
        if (mo71274m62 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        boolean z12 = this.f69843p;
        this.f69845r = z12;
        this.f69846s = false;
        return z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:            if (r0 != 3) goto L48;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        float f11;
        float f12;
        if (this.f69850w != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (this.f69847t == null) {
                            this.f69847t = new PointF(motionEvent.getX(), motionEvent.getY());
                        }
                        float x11 = motionEvent.getX() - this.f69847t.x;
                        float y11 = motionEvent.getY() - this.f69847t.y;
                        if (motionEvent.getRawY() - this.f69848u > 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f69851x = z11;
                        this.f69848u = motionEvent.getRawY();
                        boolean mo71274m6 = this.f69850w.mo71274m6(this, motionEvent, true, x11, y11, this.f69851x);
                        this.f69843p = mo71274m6;
                        if (mo71274m6) {
                            if (!this.f69845r) {
                                this.f69845r = true;
                                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(this.f69849v);
                                obtainNoHistory.setLocation(motionEvent.getX(), motionEvent.getY());
                                this.f69850w.mo71219Kj(this, obtainNoHistory);
                                this.f69847t = new PointF(motionEvent.getX(), motionEvent.getY());
                                f11 = 0.0f;
                                f12 = 0.0f;
                            } else {
                                f11 = x11;
                                f12 = y11;
                            }
                            if (!this.f69846s) {
                                this.f69846s = true;
                                m75970a(m75971b(motionEvent, 3), new MotionEvent[0]);
                            }
                            this.f69850w.mo71217Jz(this, motionEvent, f11, f12, this.f69851x);
                            this.f69844q = true;
                            return true;
                        }
                        if (this.f69844q) {
                            this.f69844q = false;
                            MotionEvent obtainNoHistory2 = MotionEvent.obtainNoHistory(this.f69849v);
                            obtainNoHistory2.setLocation(motionEvent.getX(), motionEvent.getY());
                            m75970a(motionEvent, obtainNoHistory2);
                        } else {
                            m75970a(motionEvent, new MotionEvent[0]);
                        }
                        this.f69845r = false;
                        this.f69846s = false;
                    }
                }
                this.f69845r = false;
                if (this.f69843p) {
                    this.f69850w.mo71235TH(this, motionEvent, this.f69851x);
                }
                if (!this.f69846s) {
                    this.f69846s = true;
                    if (this.f69844q) {
                        this.f69844q = false;
                        MotionEvent obtainNoHistory3 = MotionEvent.obtainNoHistory(this.f69849v);
                        obtainNoHistory3.setLocation(motionEvent.getX(), motionEvent.getY());
                        m75970a(motionEvent, obtainNoHistory3);
                    } else {
                        m75970a(motionEvent, new MotionEvent[0]);
                    }
                }
                return true;
            }
            if (this.f69843p) {
                this.f69850w.mo71219Kj(this, motionEvent);
                m75970a(motionEvent, new MotionEvent[0]);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPosition(float f11) {
        InterfaceC13548a interfaceC13548a = this.f69853z;
        if (interfaceC13548a != null) {
            interfaceC13548a.mo72876a(f11);
        }
        setTranslationY(f11);
    }

    public void setPositionListener(InterfaceC13548a interfaceC13548a) {
        this.f69853z = interfaceC13548a;
    }

    public void setScrollInterceptionListener(InterfaceC13549b interfaceC13549b) {
        this.f69850w = interfaceC13549b;
    }
}
