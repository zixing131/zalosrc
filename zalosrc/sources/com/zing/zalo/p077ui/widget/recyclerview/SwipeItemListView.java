package com.zing.zalo.p077ui.widget.recyclerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowWebContentPlus;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0;
import com.zing.zalo.p077ui.widget.layoutmanager.LinearLayoutManagerFixed;
import dj.C17945a0;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class SwipeItemListView extends TouchListView {

    /* renamed from: H1 */
    public static final float f71246H1 = AbstractC23136l9.m118742r(32.0f);

    /* renamed from: I1 */
    public static DecelerateInterpolator f71247I1 = new DecelerateInterpolator();

    /* renamed from: A1 */
    ChatRow f71248A1;

    /* renamed from: B1 */
    ChatRowWebContentPlus f71249B1;

    /* renamed from: C1 */
    private float f71250C1;

    /* renamed from: D1 */
    private long f71251D1;

    /* renamed from: E1 */
    private float f71252E1;

    /* renamed from: F1 */
    private float f71253F1;

    /* renamed from: G1 */
    private long f71254G1;

    /* renamed from: n1 */
    private boolean f71255n1;

    /* renamed from: o1 */
    private boolean f71256o1;

    /* renamed from: p1 */
    private int f71257p1;

    /* renamed from: q1 */
    private int f71258q1;

    /* renamed from: r1 */
    private int f71259r1;

    /* renamed from: s1 */
    boolean f71260s1;

    /* renamed from: t1 */
    public InterfaceC11475g0 f71261t1;

    /* renamed from: u1 */
    private boolean f71262u1;

    /* renamed from: v1 */
    private InterfaceC13766a f71263v1;

    /* renamed from: w1 */
    private boolean f71264w1;

    /* renamed from: x1 */
    private long f71265x1;

    /* renamed from: y1 */
    private float f71266y1;

    /* renamed from: z1 */
    boolean f71267z1;

    /* renamed from: com.zing.zalo.ui.widget.recyclerview.SwipeItemListView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13766a {
        /* renamed from: a */
        void mo76922a(C17945a0 c17945a0);
    }

    public SwipeItemListView(Context context) {
        super(context);
        this.f71260s1 = true;
        this.f71266y1 = 0.0f;
        this.f71267z1 = false;
    }

    /* renamed from: E2 */
    private boolean m76912E2(MotionEvent motionEvent) {
        if (getScrollState() == 1) {
            this.f71248A1 = null;
            this.f71249B1 = null;
            return false;
        }
        if (motionEvent.getAction() == 0) {
            View m9893m0 = m9893m0(f71246H1, motionEvent.getY());
            if (m9893m0 instanceof ChatRow) {
                ChatRow chatRow = (ChatRow) m9893m0;
                this.f71248A1 = chatRow;
                if (chatRow.getMessage() != null && this.f71248A1.getMessage().m94990R0()) {
                    ChatRow chatRow2 = this.f71248A1;
                    if (chatRow2.m61004P1(chatRow2.getMessage())) {
                        return true;
                    }
                }
                this.f71248A1 = null;
            } else if (m9893m0 instanceof ChatRowWebContentPlus) {
                ChatRowWebContentPlus chatRowWebContentPlus = (ChatRowWebContentPlus) m9893m0;
                this.f71249B1 = chatRowWebContentPlus;
                if (chatRowWebContentPlus.getMessage() != null && this.f71249B1.getMessage().m94990R0() && this.f71249B1.m61846S()) {
                    return true;
                }
                this.f71249B1 = null;
            }
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
            if (motionEvent.getAction() == 3) {
                if (this.f71248A1 != null) {
                    this.f71248A1 = null;
                    return true;
                }
                if (this.f71249B1 != null) {
                    this.f71249B1 = null;
                    return true;
                }
            }
        } else {
            ChatRow chatRow3 = this.f71248A1;
            if (chatRow3 != null) {
                if (this.f71263v1 != null) {
                    chatRow3.mo61033X2(motionEvent.getX() - this.f71248A1.getX(), motionEvent.getY() - this.f71248A1.getY());
                }
                this.f71248A1 = null;
                return true;
            }
            ChatRowWebContentPlus chatRowWebContentPlus2 = this.f71249B1;
            if (chatRowWebContentPlus2 != null) {
                if (this.f71263v1 != null) {
                    chatRowWebContentPlus2.m61896M0();
                }
                this.f71249B1 = null;
                return true;
            }
        }
        return false;
    }

    /* renamed from: F2 */
    private boolean m76913F2(Canvas canvas) {
        InterfaceC11475g0 interfaceC11475g0;
        boolean z11;
        float f11;
        float min;
        float measuredWidth;
        try {
            interfaceC11475g0 = this.f71261t1;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (interfaceC11475g0 == null) {
            return false;
        }
        float translationXAbs = interfaceC11475g0.getTranslationXAbs();
        long currentTimeMillis = System.currentTimeMillis();
        long min2 = Math.min(17L, currentTimeMillis - this.f71254G1);
        this.f71254G1 = currentTimeMillis;
        if (Math.abs(translationXAbs) >= AbstractC23136l9.m118742r(40.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            float f12 = this.f71253F1;
            if (f12 < 1.0f) {
                float f13 = f12 + (((float) min2) / 200.0f);
                this.f71253F1 = f13;
                if (f13 > 1.0f) {
                    this.f71253F1 = 1.0f;
                }
            }
        } else {
            float f14 = this.f71253F1;
            if (f14 > 0.0f) {
                float f15 = f14 - (((float) min2) / 180.0f);
                this.f71253F1 = f15;
                if (f15 < 0.0f) {
                    this.f71253F1 = 0.0f;
                }
            }
        }
        if (z11) {
            float f16 = this.f71253F1;
            if (f16 <= 0.8f) {
                f11 = (f16 / 0.8f) * 1.2f;
            } else {
                f11 = 1.2f - (((f16 - 0.8f) / 0.2f) * 0.2f);
            }
            min = Math.min(255.0f, (f16 / 0.8f) * 255.0f);
        } else {
            f11 = this.f71253F1;
            min = Math.min(255.0f, f11 * 255.0f);
        }
        int i11 = (int) min;
        Drawable m62336v3 = AbstractC11531v0.m62336v3();
        int intrinsicHeight = m62336v3.getIntrinsicHeight();
        int i12 = intrinsicHeight / 2;
        int m118742r = AbstractC23136l9.m118742r(20.0f);
        m62336v3.setAlpha(i11);
        if (this.f71267z1) {
            measuredWidth = this.f71261t1.getTranslationXAbs() - intrinsicHeight;
        } else {
            measuredWidth = getMeasuredWidth() + this.f71261t1.getTranslationXAbs() + m118742r;
        }
        Rect bubbleRect = this.f71261t1.getBubbleRect();
        float topAbs = this.f71261t1.getTopAbs() + bubbleRect.top + (((bubbleRect.bottom - bubbleRect.top) - intrinsicHeight) >> 1) + i12;
        float f17 = i12 * f11;
        m62336v3.setBounds((int) (measuredWidth - f17), (int) (topAbs - f17), (int) (measuredWidth + f17), (int) (topAbs + f17));
        m62336v3.draw(canvas);
        m62336v3.setAlpha(255);
        return false;
    }

    /* renamed from: J2 */
    private boolean m76914J2(MotionEvent motionEvent) {
        InterfaceC13766a interfaceC13766a;
        int max;
        float m118689Z;
        if (!m76920H2()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && !this.f71256o1 && !this.f71255n1) {
            KeyEvent.Callback m9893m0 = m9893m0(motionEvent.getX(), motionEvent.getY());
            if (m9893m0 instanceof InterfaceC11475g0) {
                InterfaceC11475g0 interfaceC11475g0 = (InterfaceC11475g0) m9893m0;
                this.f71261t1 = interfaceC11475g0;
                C17945a0 messageForReply = interfaceC11475g0.getMessageForReply();
                if (messageForReply != null && messageForReply.m94981Q0() && !messageForReply.m95228p8()) {
                    this.f71259r1 = motionEvent.getPointerId(0);
                    this.f71255n1 = true;
                    this.f71257p1 = (int) motionEvent.getX();
                    this.f71258q1 = (int) motionEvent.getY();
                } else {
                    this.f71261t1 = null;
                    return false;
                }
            }
        } else if (this.f71261t1 != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f71259r1) {
            if (this.f71267z1) {
                max = Math.min(AbstractC23136l9.m118742r(80.0f), Math.max(0, (int) (motionEvent.getX() - this.f71257p1)));
                m118689Z = AbstractC23136l9.m118689Z(0.1f, true);
            } else {
                max = Math.max(AbstractC23136l9.m118742r(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.f71257p1)));
                m118689Z = AbstractC23136l9.m118689Z(0.3f, true);
            }
            int abs = Math.abs(((int) motionEvent.getY()) - this.f71258q1);
            if (getScrollState() == 0 && this.f71255n1 && !this.f71256o1 && Math.abs(max) >= m118689Z && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                this.f71261t1.mo61065h(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                LinearLayoutManager linearLayoutManager = this.f71271X0;
                if (linearLayoutManager instanceof LinearLayoutManagerFixed) {
                    ((LinearLayoutManagerFixed) linearLayoutManager).m76390N2(false);
                }
                this.f71255n1 = false;
                this.f71256o1 = true;
                this.f71257p1 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (this.f71256o1) {
                if (Math.abs(max) >= AbstractC23136l9.m118742r(50.0f)) {
                    if (!this.f71262u1) {
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.f71262u1 = true;
                    }
                } else {
                    this.f71262u1 = false;
                }
                m76916L2(this.f71261t1, max);
            }
        } else if (this.f71261t1 != null && motionEvent.getPointerId(0) == this.f71259r1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (Math.abs(this.f71261t1.getTranslationXAbs()) >= AbstractC23136l9.m118742r(50.0f) && (interfaceC13766a = this.f71263v1) != null) {
                interfaceC13766a.mo76922a(this.f71261t1.getMessageForReply());
            }
            m76915K2(true);
        }
        return this.f71256o1;
    }

    /* renamed from: K2 */
    private void m76915K2(boolean z11) {
        InterfaceC11475g0 interfaceC11475g0 = this.f71261t1;
        if (interfaceC11475g0 != null) {
            if (z11) {
                this.f71250C1 = interfaceC11475g0.getTranslationXAbs();
                this.f71251D1 = System.currentTimeMillis();
            } else {
                m76916L2(interfaceC11475g0, 0.0f);
                Object obj = this.f71261t1;
                if (obj instanceof View) {
                    ((View) obj).invalidate();
                }
                this.f71261t1 = null;
                this.f71250C1 = 0.0f;
                this.f71251D1 = 0L;
            }
            this.f71252E1 = 0.0f;
            this.f71255n1 = false;
            this.f71256o1 = false;
            LinearLayoutManager linearLayoutManager = this.f71271X0;
            if (linearLayoutManager instanceof LinearLayoutManagerFixed) {
                ((LinearLayoutManagerFixed) linearLayoutManager).m76390N2(true);
            }
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L2 */
    private void m76916L2(InterfaceC11475g0 interfaceC11475g0, float f11) {
        int i11;
        invalidate();
        long mo95204n = interfaceC11475g0.getMessageForReply().mo95204n();
        if (mo95204n < 0) {
            interfaceC11475g0.setTranslationXAbs(f11);
            return;
        }
        int childCount = getChildCount();
        if (interfaceC11475g0 instanceof View) {
            i11 = indexOfChild((View) interfaceC11475g0);
        } else {
            i11 = 0;
        }
        int i12 = i11;
        while (true) {
            int i13 = i12 - 1;
            if (i13 < 0) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!(childAt instanceof ChatRow)) {
                break;
            }
            ChatRow chatRow = (ChatRow) childAt;
            if (chatRow.getMessage() == null || chatRow.getMessage().mo95204n() != mo95204n) {
                break;
            } else {
                i12--;
            }
        }
        while (true) {
            int i14 = i11 + 1;
            if (i14 > childCount) {
                break;
            }
            View childAt2 = getChildAt(i14);
            if (!(childAt2 instanceof ChatRow)) {
                break;
            }
            ChatRow chatRow2 = (ChatRow) childAt2;
            if (chatRow2.getMessage() == null || chatRow2.getMessage().mo95204n() != mo95204n) {
                break;
            } else {
                i11 = i14;
            }
        }
        while (i12 <= i11) {
            View childAt3 = getChildAt(i12);
            if (childAt3 instanceof ChatRow) {
                ((ChatRow) childAt3).setTranslationX(f11);
            }
            i12++;
        }
    }

    /* renamed from: M2 */
    private void m76917M2(View view) {
        ChatRow chatRow;
        C17945a0 message;
        float f11;
        if (this.f71261t1 == null && (view instanceof ChatRow) && (message = (chatRow = (ChatRow) view).getMessage()) != null) {
            if (!message.m95032V6() && message.m94990R0() && chatRow.m61004P1(message)) {
                f11 = this.f71266y1;
            } else {
                f11 = 0.0f;
            }
            if (view.getTranslationX() != f11) {
                view.setTranslationX(f11);
            }
        }
    }

    /* renamed from: N2 */
    private void m76918N2() {
        long currentTimeMillis = System.currentTimeMillis();
        float f11 = this.f71252E1 + (((float) (currentTimeMillis - this.f71251D1)) / 200.0f);
        this.f71252E1 = f11;
        if (f11 > 1.0f) {
            this.f71252E1 = 1.0f;
        }
        this.f71251D1 = currentTimeMillis;
        float interpolation = this.f71250C1 * (1.0f - f71247I1.getInterpolation(this.f71252E1));
        if (interpolation == 0.0f) {
            this.f71250C1 = 0.0f;
        }
        m76916L2(this.f71261t1, interpolation);
    }

    /* renamed from: G2 */
    public boolean m76919G2() {
        return this.f71264w1;
    }

    /* renamed from: H2 */
    public boolean m76920H2() {
        return this.f71260s1;
    }

    /* renamed from: I2 */
    public boolean m76921I2(InterfaceC11475g0 interfaceC11475g0) {
        InterfaceC11475g0 interfaceC11475g02 = this.f71261t1;
        if (interfaceC11475g02 == null || !this.f71256o1) {
            return false;
        }
        if (interfaceC11475g0 == interfaceC11475g02) {
            return true;
        }
        if (interfaceC11475g02.getMessageForReply() == null || interfaceC11475g0.getMessageForReply() == null) {
            return false;
        }
        long mo95204n = this.f71261t1.getMessageForReply().mo95204n();
        if (mo95204n <= 0 || mo95204n != interfaceC11475g0.getMessageForReply().mo95204n()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        boolean z11;
        ChatRow chatRow;
        C17945a0 message;
        boolean z12 = view instanceof ChatRow;
        if (z12) {
            z11 = ((ChatRow) view).m60948B0(canvas);
        } else {
            z11 = false;
        }
        m76917M2(view);
        InterfaceC11475g0 interfaceC11475g0 = this.f71261t1;
        if (view == interfaceC11475g0) {
            if (!this.f71255n1 && !this.f71256o1) {
                if (this.f71250C1 != 0.0f && interfaceC11475g0.getTranslationXAbs() != 0.0f) {
                    m76918N2();
                } else {
                    this.f71261t1 = null;
                }
                view.invalidate();
                z11 = true;
            }
            z11 |= m76913F2(canvas);
        }
        boolean drawChild = super.drawChild(canvas, view, j11) | z11;
        if (z12 && (message = (chatRow = (ChatRow) view).getMessage()) != null) {
            chatRow.getDelegate().mo62079c4(message.m95029V3()).f133304B = this.f71265x1;
            drawChild |= chatRow.m61014R2(canvas);
        }
        if (drawChild) {
            invalidate();
        }
        return drawChild;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f11 = 0.0f;
        if (this.f71265x1 > 0) {
            float currentTimeMillis = (float) (System.currentTimeMillis() - this.f71265x1);
            if (currentTimeMillis > 200.0f) {
                this.f71265x1 = 0L;
                if (m76919G2()) {
                    f11 = f71246H1;
                }
                this.f71266y1 = f11;
            } else {
                if (m76919G2()) {
                    f11 = f71246H1;
                }
                float f12 = this.f71266y1;
                this.f71266y1 = f12 + ((currentTimeMillis / 200.0f) * (f11 - f12));
            }
            invalidate();
            return;
        }
        if (m76919G2()) {
            f11 = f71246H1;
        }
        this.f71266y1 = f11;
    }

    @Override // com.zing.zalo.p077ui.widget.recyclerview.TouchListView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m76914J2(motionEvent) | super.onInterceptTouchEvent(motionEvent) | m76919G2();
    }

    @Override // com.zing.zalo.p077ui.widget.recyclerview.TouchListView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent) | m76914J2(motionEvent);
        if (m76919G2()) {
            return onTouchEvent | m76912E2(motionEvent);
        }
        return onTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        m76915K2(true);
        this.f71248A1 = null;
        this.f71249B1 = null;
    }

    public void setEnableMultiSelection(boolean z11) {
        if (this.f71264w1 != z11) {
            this.f71264w1 = z11;
            this.f71265x1 = System.currentTimeMillis();
            invalidate();
        }
    }

    public void setEnableSwipeItem(boolean z11) {
        this.f71260s1 = z11;
        if (!z11) {
            m76915K2(false);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.recyclerview.TouchListView, androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.AbstractC1888o abstractC1888o) {
        super.setLayoutManager(abstractC1888o);
        if (abstractC1888o instanceof LinearLayoutManagerFixed) {
            this.f71271X0 = (LinearLayoutManagerFixed) abstractC1888o;
        } else {
            this.f71271X0 = null;
        }
    }

    public void setSwipeListViewListener(InterfaceC13766a interfaceC13766a) {
        this.f71263v1 = interfaceC13766a;
    }
}
