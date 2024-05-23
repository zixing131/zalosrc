package com.zing.zalo.p077ui.widget.recyclerview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.chat.AbstractC11316a;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatInputBar;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import x50.C29384b;

/* loaded from: classes6.dex */
public class TouchListView extends RecyclerView {

    /* renamed from: m1 */
    private static final String f71268m1 = "TouchListView";

    /* renamed from: V0 */
    private RunnableC13771e f71269V0;

    /* renamed from: W0 */
    private boolean f71270W0;

    /* renamed from: X0 */
    protected LinearLayoutManager f71271X0;

    /* renamed from: Y0 */
    private AbstractC11316a f71272Y0;

    /* renamed from: Z0 */
    private boolean f71273Z0;

    /* renamed from: a1 */
    private boolean f71274a1;

    /* renamed from: b1 */
    private boolean f71275b1;

    /* renamed from: c1 */
    private int f71276c1;

    /* renamed from: d1 */
    private int f71277d1;

    /* renamed from: e1 */
    private int f71278e1;

    /* renamed from: f1 */
    private boolean f71279f1;

    /* renamed from: g1 */
    private InterfaceC13770d f71280g1;

    /* renamed from: h1 */
    private final Runnable f71281h1;

    /* renamed from: i1 */
    private final Runnable f71282i1;

    /* renamed from: j1 */
    private final Runnable f71283j1;

    /* renamed from: k1 */
    private final Runnable f71284k1;

    /* renamed from: l1 */
    public boolean f71285l1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.recyclerview.TouchListView$a */
    /* loaded from: classes6.dex */
    public class RunnableC13767a implements Runnable {
        RunnableC13767a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TouchListView.this.getCount() > 0 && !TouchListView.this.m76945o2()) {
                    TouchListView.this.m76923B2(r0.getCount() - 1, (-100000) - TouchListView.this.getPaddingTop());
                    TouchListView touchListView = TouchListView.this;
                    touchListView.removeCallbacks(touchListView.f71282i1);
                    if (!TouchListView.this.m76945o2()) {
                        TouchListView touchListView2 = TouchListView.this;
                        touchListView2.postDelayed(touchListView2.f71282i1, 200L);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(TouchListView.f71268m1, e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.recyclerview.TouchListView$b */
    /* loaded from: classes6.dex */
    public class RunnableC13768b implements Runnable {
        RunnableC13768b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TouchListView.this.f71277d1 >= 0) {
                    TouchListView touchListView = TouchListView.this;
                    if (!touchListView.m76948r2(touchListView.f71277d1)) {
                        if (TouchListView.this.f71278e1 == Integer.MIN_VALUE) {
                            TouchListView touchListView2 = TouchListView.this;
                            touchListView2.m76940A2(touchListView2.f71277d1, true);
                        } else {
                            TouchListView touchListView3 = TouchListView.this;
                            touchListView3.m76923B2(touchListView3.f71277d1, TouchListView.this.f71278e1);
                        }
                        TouchListView touchListView4 = TouchListView.this;
                        if (!touchListView4.m76948r2(touchListView4.f71277d1) && TouchListView.this.f71276c1 <= 10) {
                            TouchListView.this.removeCallbacks(this);
                            TouchListView.this.postDelayed(this, 50L);
                            TouchListView.this.f71276c1++;
                            return;
                        }
                    }
                }
                TouchListView.this.f71276c1 = 1;
                TouchListView.this.f71277d1 = -1;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(TouchListView.f71268m1, e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.recyclerview.TouchListView$c */
    /* loaded from: classes6.dex */
    public class C13769c extends C1923p {

        /* renamed from: q */
        View f71288q;

        public C13769c(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1923p, androidx.recyclerview.widget.RecyclerView.AbstractC1898y
        /* renamed from: m */
        public void mo10241m() {
            super.mo10241m();
            TouchListView.this.f71273Z0 = true;
        }

        @Override // androidx.recyclerview.widget.C1923p, androidx.recyclerview.widget.RecyclerView.AbstractC1898y
        /* renamed from: n */
        public void mo10242n() {
            super.mo10242n();
        }

        @Override // androidx.recyclerview.widget.C1923p, androidx.recyclerview.widget.RecyclerView.AbstractC1898y
        /* renamed from: o */
        public void mo10243o(View view, RecyclerView.C1899z c1899z, RecyclerView.AbstractC1898y.a aVar) {
            this.f71288q = view;
            super.mo10243o(view, c1899z, aVar);
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: s */
        public int mo10620s(int i11, int i12, int i13, int i14, int i15) {
            int i16;
            KeyEvent.Callback callback = this.f71288q;
            if (callback instanceof InterfaceC11475g0) {
                i16 = ((InterfaceC11475g0) callback).getJumpTargetY();
            } else {
                i16 = 0;
            }
            if (i16 == 0) {
                return (i13 - i11) + (((i14 - i13) - (i12 - i11)) / 2);
            }
            return ((i13 - i11) + ((i14 - i13) / 2)) - i16;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.recyclerview.TouchListView$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC13770d {
        /* renamed from: a */
        void mo76953a();
    }

    /* renamed from: com.zing.zalo.ui.widget.recyclerview.TouchListView$e */
    /* loaded from: classes6.dex */
    public class RunnableC13771e implements Runnable {

        /* renamed from: p */
        int f71290p;

        /* renamed from: q */
        int f71291q;

        /* renamed from: r */
        int f71292r;

        /* renamed from: s */
        int f71293s;

        /* renamed from: t */
        int f71294t;

        /* renamed from: u */
        final int f71295u;

        /* renamed from: v */
        int f71296v;

        RunnableC13771e() {
            this.f71295u = ViewConfiguration.get(TouchListView.this.getContext()).getScaledFadingEdgeLength();
            this.f71296v = TouchListView.this.getCount();
        }

        /* renamed from: a */
        void m76954a(int i11) {
            int i12;
            try {
                int firstVisiblePosition = TouchListView.this.getFirstVisiblePosition();
                int lastVisiblePosition = TouchListView.this.getLastVisiblePosition();
                if (i11 <= firstVisiblePosition) {
                    i12 = (firstVisiblePosition - i11) + 1;
                    this.f71290p = 2;
                } else if (i11 >= lastVisiblePosition) {
                    int count = TouchListView.this.getCount();
                    if (i11 >= count) {
                        i11 = count - 1;
                    }
                    i12 = (i11 - lastVisiblePosition) + 1;
                    this.f71290p = 1;
                } else {
                    return;
                }
                if (i12 > 0) {
                    this.f71294t = IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING / i12;
                } else {
                    this.f71294t = IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
                }
                this.f71294t = IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
                this.f71291q = i11;
                this.f71292r = -1;
                this.f71293s = -1;
                TouchListView.this.post(this);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(TouchListView.f71268m1, e11);
            }
        }

        /* renamed from: b */
        void m76955b() {
            TouchListView.this.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            int paddingBottom;
            int paddingTop;
            int childCount;
            try {
                int height = TouchListView.this.getHeight();
                int firstVisiblePosition = TouchListView.this.getFirstVisiblePosition();
                int i11 = this.f71290p;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4 || (childCount = TouchListView.this.getChildCount() - 2) < 0) {
                                return;
                            }
                            int i12 = firstVisiblePosition + childCount;
                            if (i12 == this.f71293s) {
                                TouchListView.this.post(this);
                                return;
                            }
                            View childAt = TouchListView.this.getChildAt(childCount);
                            int height2 = childAt.getHeight();
                            int top = childAt.getTop();
                            int i13 = height - top;
                            this.f71293s = i12;
                            if (i12 > this.f71292r) {
                                TouchListView.this.m9847P1(0, -(i13 - this.f71295u), null);
                                TouchListView.this.post(this);
                                return;
                            }
                            int i14 = height - this.f71295u;
                            int i15 = top + height2;
                            if (i14 > i15) {
                                TouchListView.this.m9847P1(0, -(i14 - i15), null);
                                return;
                            }
                            return;
                        }
                        int childCount2 = TouchListView.this.getChildCount();
                        if (firstVisiblePosition != this.f71292r && childCount2 > 1 && childCount2 + firstVisiblePosition < this.f71296v) {
                            int i16 = firstVisiblePosition + 1;
                            if (i16 == this.f71293s) {
                                TouchListView.this.post(this);
                                return;
                            }
                            View childAt2 = TouchListView.this.getChildAt(1);
                            int height3 = childAt2.getHeight();
                            int top2 = childAt2.getTop();
                            int i17 = this.f71295u;
                            if (i16 < this.f71292r) {
                                TouchListView.this.m9847P1(0, Math.max(0, (height3 + top2) - i17), null);
                                this.f71293s = i16;
                                TouchListView.this.post(this);
                                return;
                            } else {
                                if (top2 > i17) {
                                    TouchListView.this.m9847P1(0, top2 - i17, null);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    if (firstVisiblePosition == this.f71293s) {
                        TouchListView.this.post(this);
                        return;
                    }
                    View childAt3 = TouchListView.this.getChildAt(0);
                    if (childAt3 == null) {
                        return;
                    }
                    int top3 = childAt3.getTop();
                    if (firstVisiblePosition > 0) {
                        paddingTop = this.f71295u;
                    } else {
                        paddingTop = TouchListView.this.getPaddingTop();
                    }
                    TouchListView.this.m9847P1(0, top3 - paddingTop, null);
                    this.f71293s = firstVisiblePosition;
                    if (firstVisiblePosition > this.f71291q) {
                        TouchListView.this.post(this);
                        return;
                    }
                    return;
                }
                int childCount3 = TouchListView.this.getChildCount() - 1;
                int i18 = firstVisiblePosition + childCount3;
                if (childCount3 < 0) {
                    return;
                }
                if (i18 == this.f71293s) {
                    TouchListView.this.post(this);
                    m76955b();
                    return;
                }
                View childAt4 = TouchListView.this.getChildAt(childCount3);
                int height4 = childAt4.getHeight();
                int top4 = height - childAt4.getTop();
                if (i18 < this.f71296v - 1) {
                    paddingBottom = this.f71295u;
                } else {
                    paddingBottom = TouchListView.this.getPaddingBottom();
                }
                if (this.f71291q > i18) {
                    paddingBottom += 10;
                }
                TouchListView.this.m9847P1(0, (height4 - top4) + paddingBottom, null);
                this.f71293s = i18;
                if (i18 < this.f71291q) {
                    TouchListView.this.post(this);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(TouchListView.f71268m1, e11);
            }
        }
    }

    public TouchListView(Context context) {
        this(context, null);
    }

    /* renamed from: B2 */
    public void m76923B2(int i11, int i12) {
        LinearLayoutManager linearLayoutManager = this.f71271X0;
        if (linearLayoutManager != null) {
            linearLayoutManager.m9721B2(i11, i12);
        }
    }

    private int getEstimatedCenterOffset() {
        return getEstimatedHeight() / 2;
    }

    /* renamed from: u2 */
    public /* synthetic */ void m76936u2() {
        try {
            m76923B2(getCount() - 1, (-100000) - getPaddingTop());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f71268m1, e11);
        }
    }

    /* renamed from: v2 */
    public /* synthetic */ void m76937v2() {
        try {
            boolean z11 = true;
            if (getLastVisiblePosition() >= (getCount() - getFooterViewsCount()) - 1) {
                z11 = false;
            }
            this.f71270W0 = z11;
            mo9854S1(getCount());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f71268m1, e11);
        }
    }

    /* renamed from: w2 */
    public /* synthetic */ void m76938w2(int i11) {
        C13769c c13769c = new C13769c(getContext());
        c13769c.m10244p(i11);
        this.f71271X0.m10090H1(c13769c);
    }

    /* renamed from: z2 */
    private void m76939z2(long j11) {
        removeCallbacks(this.f71284k1);
        postDelayed(this.f71284k1, j11);
    }

    /* renamed from: A2 */
    public void m76940A2(int i11, boolean z11) {
        LinearLayoutManager linearLayoutManager = this.f71271X0;
        if (linearLayoutManager == null) {
            return;
        }
        if (!z11) {
            linearLayoutManager.mo9756v1(i11);
            return;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        boolean z12 = true;
        if (i11 < firstVisiblePosition && firstVisiblePosition - i11 > 5) {
            this.f71271X0.m9721B2(i11, -200);
        } else if (i11 > lastVisiblePosition && i11 - lastVisiblePosition > 5) {
            this.f71271X0.m9721B2(i11, (int) (getHeight() * 0.8f));
        } else {
            z12 = false;
        }
        RunnableC13775d runnableC13775d = new Runnable() { // from class: com.zing.zalo.ui.widget.recyclerview.d

            /* renamed from: q */
            public final /* synthetic */ int f71301q;

            public /* synthetic */ RunnableC13775d(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TouchListView.this.m76938w2(r2);
            }
        };
        if (z12) {
            post(runnableC13775d);
        } else {
            runnableC13775d.run();
        }
    }

    /* renamed from: C2 */
    public void m76941C2(int i11, int i12) {
        try {
            this.f71277d1 = i11;
            this.f71278e1 = i12;
            if (this.f71276c1 == 1) {
                if (i12 == Integer.MIN_VALUE) {
                    m76940A2(i11, true);
                } else if (i12 == -1) {
                    m76923B2(i11, getEstimatedCenterOffset() - C29384b.f135890k);
                } else {
                    m76923B2(i11, i12);
                }
                if (!m76948r2(i11)) {
                    m76939z2(50L);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f71268m1, e11);
        }
    }

    /* renamed from: D2 */
    public void m76942D2(boolean z11) {
        this.f71279f1 = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: S1 */
    public void mo9854S1(int i11) {
        if (this.f71270W0) {
            super.mo9854S1(i11);
            return;
        }
        if (this.f71269V0 == null) {
            this.f71269V0 = new RunnableC13771e();
        }
        this.f71269V0.m76954a(i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        InterfaceC13770d interfaceC13770d = this.f71280g1;
        if (interfaceC13770d != null) {
            interfaceC13770d.mo76953a();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        return 0.0f;
    }

    public int getCount() {
        AbstractC11316a abstractC11316a = this.f71272Y0;
        if (abstractC11316a != null) {
            return abstractC11316a.mo10003k();
        }
        RecyclerView.AbstractC1880g adapter = getAdapter();
        if (adapter != null) {
            return adapter.mo10003k();
        }
        return 0;
    }

    public int getEstimatedHeight() {
        int height = getHeight();
        if (height == 0) {
            return ((AbstractC23136l9.m118713h0() - AbstractC23136l9.m118737p0()) - AbstractC23136l9.m118767z0(getContext())) - ChatInputBar.f61018C0;
        }
        return height;
    }

    public int getFirstCompletelyVisiblePosition() {
        LinearLayoutManager linearLayoutManager = this.f71271X0;
        if (linearLayoutManager != null) {
            return linearLayoutManager.m9737T1();
        }
        return -1;
    }

    public int getFirstVisiblePosition() {
        LinearLayoutManager linearLayoutManager = this.f71271X0;
        if (linearLayoutManager != null) {
            return linearLayoutManager.m9740Y1();
        }
        return -1;
    }

    public int getFooterViewsCount() {
        AbstractC11316a abstractC11316a = this.f71272Y0;
        if (abstractC11316a != null) {
            return abstractC11316a.m60490d0();
        }
        return 0;
    }

    public int getHeaderViewsCount() {
        AbstractC11316a abstractC11316a = this.f71272Y0;
        if (abstractC11316a != null) {
            return abstractC11316a.m60491e0();
        }
        return 0;
    }

    public int getLastCompletelyVisiblePosition() {
        LinearLayoutManager linearLayoutManager = this.f71271X0;
        if (linearLayoutManager != null) {
            return linearLayoutManager.m9741Z1();
        }
        return -1;
    }

    public int getLastVisiblePosition() {
        LinearLayoutManager linearLayoutManager = this.f71271X0;
        if (linearLayoutManager != null) {
            return linearLayoutManager.m9745c2();
        }
        return -1;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: l1 */
    public void mo9892l1(int i11) {
        boolean z11;
        super.mo9892l1(i11);
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f71274a1 = z11;
        if (i11 == 0) {
            this.f71273Z0 = false;
        } else if (i11 == 1 && !this.f71275b1) {
            this.f71275b1 = true;
        }
    }

    /* renamed from: m2 */
    public void m76943m2() {
        if (this.f71277d1 >= 0) {
            this.f71277d1 = -1;
            this.f71278e1 = -1;
            removeCallbacks(this.f71284k1);
        }
        this.f71276c1 = 1;
    }

    /* renamed from: n2 */
    public View m76944n2(int i11) {
        LinearLayoutManager linearLayoutManager = this.f71271X0;
        if (linearLayoutManager != null) {
            return linearLayoutManager.mo9732P(i11);
        }
        return null;
    }

    /* renamed from: o2 */
    public boolean m76945o2() {
        int count = getCount();
        int childCount = getChildCount();
        int lastVisiblePosition = getLastVisiblePosition();
        if (childCount <= 0) {
            return true;
        }
        if (lastVisiblePosition == count - 1 && getChildAt(getChildCount() - 1).getBottom() == getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f71285l1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f71285l1) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p2 */
    public boolean m76946p2() {
        return this.f71275b1;
    }

    /* renamed from: q2 */
    public boolean m76947q2() {
        return this.f71273Z0;
    }

    /* renamed from: r2 */
    public boolean m76948r2(int i11) {
        if (getFirstVisiblePosition() <= i11 && i11 <= getLastVisiblePosition()) {
            return true;
        }
        return false;
    }

    /* renamed from: s2 */
    public boolean m76949s2() {
        return this.f71274a1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.AbstractC1880g abstractC1880g) {
        super.setAdapter(abstractC1880g);
        if (abstractC1880g instanceof AbstractC11316a) {
            this.f71272Y0 = (AbstractC11316a) abstractC1880g;
        } else {
            this.f71272Y0 = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.AbstractC1888o abstractC1888o) {
        super.setLayoutManager(abstractC1888o);
        if (abstractC1888o instanceof LinearLayoutManager) {
            this.f71271X0 = (LinearLayoutManager) abstractC1888o;
        } else {
            this.f71271X0 = null;
        }
    }

    public void setOnDispatchDrawListener(InterfaceC13770d interfaceC13770d) {
        this.f71280g1 = interfaceC13770d;
    }

    /* renamed from: t2 */
    public boolean m76950t2() {
        return this.f71279f1;
    }

    /* renamed from: x2 */
    public void m76951x2(boolean z11) {
        try {
            removeCallbacks(this.f71283j1);
            removeCallbacks(this.f71284k1);
            this.f71277d1 = -1;
            if (!z11) {
                post(this.f71281h1);
                postDelayed(this.f71281h1, 120L);
            } else {
                postDelayed(this.f71283j1, 60L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f71268m1, e11);
        }
    }

    /* renamed from: y2 */
    public void m76952y2() {
        removeCallbacks(this.f71283j1);
        removeCallbacks(this.f71284k1);
        this.f71277d1 = -1;
        try {
            int count = getCount();
            if (count > 0) {
                m76923B2(count - 1, (-100000) - getPaddingTop());
                removeCallbacks(this.f71282i1);
                if (!m76945o2()) {
                    postDelayed(this.f71282i1, 200L);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f71268m1, e11);
        }
    }

    public TouchListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71270W0 = false;
        this.f71276c1 = 1;
        this.f71277d1 = -1;
        this.f71279f1 = false;
        this.f71281h1 = new RunnableC13767a();
        this.f71282i1 = new Runnable() { // from class: com.zing.zalo.ui.widget.recyclerview.b
            public /* synthetic */ RunnableC13773b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                TouchListView.this.m76936u2();
            }
        };
        this.f71283j1 = new Runnable() { // from class: com.zing.zalo.ui.widget.recyclerview.c
            public /* synthetic */ RunnableC13774c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                TouchListView.this.m76937v2();
            }
        };
        this.f71284k1 = new RunnableC13768b();
        this.f71285l1 = true;
        setDescendantFocusability(131072);
        setPreserveFocusAfterLayout(false);
    }
}
