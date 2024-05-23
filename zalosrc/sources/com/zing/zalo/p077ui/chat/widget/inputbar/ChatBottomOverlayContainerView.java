package com.zing.zalo.p077ui.chat.widget.inputbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatBottomOverlayContainerView;
import com.zing.zalo.p077ui.widget.recyclerview.TouchListView;

/* loaded from: classes5.dex */
public class ChatBottomOverlayContainerView extends FrameLayout {

    /* renamed from: p */
    TouchListView f61003p;

    /* renamed from: q */
    View f61004q;

    /* renamed from: r */
    int f61005r;

    /* renamed from: s */
    boolean f61006s;

    /* renamed from: t */
    float f61007t;

    /* renamed from: u */
    private final RecyclerView.AbstractC1892s f61008u;

    /* renamed from: v */
    Handler f61009v;

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatBottomOverlayContainerView$a */
    /* loaded from: classes5.dex */
    class C11734a extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ TouchListView f61010a;

        C11734a(TouchListView touchListView) {
            this.f61010a = touchListView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                this.f61010a.m9821B1(this);
                TouchListView touchListView = this.f61010a;
                touchListView.scrollBy(0, touchListView.getPaddingBottom());
                TouchListView touchListView2 = this.f61010a;
                touchListView2.setPadding(touchListView2.getPaddingLeft(), this.f61010a.getPaddingTop(), this.f61010a.getPaddingRight(), 0);
                this.f61010a.m76942D2(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatBottomOverlayContainerView$b */
    /* loaded from: classes5.dex */
    class C11735b extends RecyclerView.AbstractC1892s {
        C11735b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            ChatBottomOverlayContainerView chatBottomOverlayContainerView;
            TouchListView touchListView;
            super.mo952b(recyclerView, i11);
            View view = ChatBottomOverlayContainerView.this.f61004q;
            if (view != null && view.getVisibility() == 0 && (touchListView = (chatBottomOverlayContainerView = ChatBottomOverlayContainerView.this).f61003p) != null && chatBottomOverlayContainerView.f61005r != 0 && !touchListView.m76950t2()) {
                if (i11 == 0 || i11 == 1) {
                    int m65351f = ChatBottomOverlayContainerView.this.m65351f();
                    if (i11 == 0) {
                        if (m65351f >= 0 && m65351f < ChatBottomOverlayContainerView.this.getHeight()) {
                            ChatBottomOverlayContainerView.this.m65362n();
                        } else {
                            ChatBottomOverlayContainerView.this.m65363p();
                        }
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            ChatBottomOverlayContainerView chatBottomOverlayContainerView;
            TouchListView touchListView;
            int i13;
            super.mo10176d(recyclerView, i11, i12);
            View view = ChatBottomOverlayContainerView.this.f61004q;
            if (view != null && view.getVisibility() == 0 && (touchListView = (chatBottomOverlayContainerView = ChatBottomOverlayContainerView.this).f61003p) != null && chatBottomOverlayContainerView.f61005r != 0 && !touchListView.m76950t2()) {
                if (ChatBottomOverlayContainerView.this.f61004q.getTranslationY() >= ChatBottomOverlayContainerView.this.getHeight() && i12 < 0) {
                    return;
                }
                if (ChatBottomOverlayContainerView.this.f61004q.getTranslationY() != 0.0f || i12 < 0) {
                    int m65351f = ChatBottomOverlayContainerView.this.m65351f();
                    if (m65351f >= 0) {
                        i13 = (int) (m65351f * 0.5f);
                    } else {
                        i13 = -1;
                    }
                    if (i13 >= 0 && i13 < ChatBottomOverlayContainerView.this.getHeight()) {
                        ChatBottomOverlayContainerView.this.m65353q(Math.max(0.0f, m65351f * 0.5f));
                    } else {
                        ChatBottomOverlayContainerView.this.m65353q(r3.getHeight());
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatBottomOverlayContainerView$c */
    /* loaded from: classes5.dex */
    class HandlerC11736c extends Handler {
        HandlerC11736c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ChatBottomOverlayContainerView chatBottomOverlayContainerView;
            TouchListView touchListView;
            boolean z11;
            View view = ChatBottomOverlayContainerView.this.f61004q;
            if (view != null && view.getVisibility() == 0 && (touchListView = (chatBottomOverlayContainerView = ChatBottomOverlayContainerView.this).f61003p) != null && chatBottomOverlayContainerView.f61005r != 0 && !touchListView.m76950t2() && message.what == 1) {
                float translationY = ChatBottomOverlayContainerView.this.f61004q.getTranslationY();
                float f11 = ChatBottomOverlayContainerView.this.f61007t;
                if (translationY != f11) {
                    float abs = Math.abs(f11 - translationY);
                    if (abs > 12.0f) {
                        if (ChatBottomOverlayContainerView.this.f61007t > translationY) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float max = Math.max(12.0f, abs / 4.0f);
                        View view2 = ChatBottomOverlayContainerView.this.f61004q;
                        if (!z11) {
                            max = -max;
                        }
                        view2.setTranslationY(translationY + max);
                        ChatBottomOverlayContainerView.this.f61009v.removeMessages(1);
                        ChatBottomOverlayContainerView.this.f61009v.sendEmptyMessage(1);
                        return;
                    }
                    ChatBottomOverlayContainerView chatBottomOverlayContainerView2 = ChatBottomOverlayContainerView.this;
                    chatBottomOverlayContainerView2.f61004q.setTranslationY(chatBottomOverlayContainerView2.f61007t);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatBottomOverlayContainerView$d */
    /* loaded from: classes5.dex */
    public class C11737d extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ TouchListView f61014a;

        C11737d(TouchListView touchListView) {
            this.f61014a = touchListView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                this.f61014a.m9821B1(this);
                this.f61014a.m76942D2(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.inputbar.ChatBottomOverlayContainerView$e */
    /* loaded from: classes5.dex */
    class C11738e extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f61016p;

        C11738e(Runnable runnable) {
            this.f61016p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = ChatBottomOverlayContainerView.this.f61004q;
            if (view != null) {
                view.animate().setListener(null);
            }
            Runnable runnable = this.f61016p;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ChatBottomOverlayContainerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public int m65351f() {
        View m76944n2 = this.f61003p.m76944n2(this.f61003p.getCount() - 1);
        if (m76944n2 != null) {
            return m76944n2.getBottom() - (this.f61003p.getHeight() - this.f61003p.getPaddingBottom());
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m65352i(int i11, int i12) {
        TouchListView touchListView = this.f61003p;
        if (touchListView != null) {
            touchListView.m9845O1(0, i11 + i12);
            TouchListView touchListView2 = this.f61003p;
            touchListView2.m9826E(new C11737d(touchListView2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m65353q(float f11) {
        boolean z11;
        float translationY = this.f61004q.getTranslationY();
        this.f61007t = f11;
        float abs = Math.abs(f11 - translationY);
        if (abs <= 30.0f) {
            this.f61004q.setTranslationY(this.f61007t);
            return;
        }
        if (this.f61007t > translationY) {
            z11 = true;
        } else {
            z11 = false;
        }
        float max = Math.max(12.0f, abs / 4.0f);
        View view = this.f61004q;
        if (!z11) {
            max = -max;
        }
        view.setTranslationY(translationY + max);
        this.f61009v.sendEmptyMessageDelayed(1, 15L);
    }

    /* renamed from: d */
    public void m65354d(TouchListView touchListView) {
        this.f61003p = touchListView;
        touchListView.m9826E(this.f61008u);
    }

    /* renamed from: e */
    public void m65355e() {
        RecyclerView.AbstractC1892s abstractC1892s = this.f61008u;
        if (abstractC1892s != null) {
            abstractC1892s.mo10176d(this.f61003p, 0, 0);
        }
    }

    /* renamed from: g */
    public void m65356g(boolean z11) {
        int i11;
        int m65351f;
        TouchListView touchListView = this.f61003p;
        if (touchListView != null) {
            touchListView.m9821B1(this.f61008u);
            if (z11 && (m65351f = m65351f()) >= 0 && m65351f < this.f61003p.getPaddingBottom()) {
                i11 = this.f61003p.getPaddingBottom() - m65351f;
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                TouchListView touchListView2 = this.f61003p;
                touchListView2.m76942D2(true);
                touchListView2.m9845O1(0, -i11);
                touchListView2.m9826E(new C11734a(touchListView2));
            } else {
                this.f61003p.m76942D2(true);
                TouchListView touchListView3 = this.f61003p;
                touchListView3.scrollBy(0, touchListView3.getPaddingBottom());
                TouchListView touchListView4 = this.f61003p;
                touchListView4.setPadding(touchListView4.getPaddingLeft(), this.f61003p.getPaddingTop(), this.f61003p.getPaddingRight(), 0);
                this.f61003p.m76942D2(false);
            }
            this.f61003p = null;
        }
    }

    /* renamed from: h */
    public boolean m65357h() {
        View view = this.f61004q;
        if (view != null && view.getVisibility() == 0 && (this.f61005r == 0 || this.f61004q.getTranslationY() < getHeight())) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m65358j(Runnable runnable) {
        View view = this.f61004q;
        if (view != null && view.getTranslationY() != getHeight()) {
            this.f61004q.animate().translationY(getHeight()).setDuration(200L).setListener(new C11738e(runnable)).start();
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: k */
    public void m65359k() {
        View view = this.f61004q;
        if (view != null) {
            removeView(view);
            this.f61004q = null;
        }
        setVisibility(8);
    }

    /* renamed from: l */
    public void m65360l(View view, int i11) {
        if (view == null) {
            m65359k();
            return;
        }
        this.f61005r = i11;
        setVisibility(0);
        View view2 = this.f61004q;
        if (view2 != view) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f61004q = view;
            addView(view);
            this.f61006s = true;
        }
    }

    /* renamed from: m */
    public void m65361m(boolean z11) {
        View view = this.f61004q;
        if (view != null) {
            if (z11 && view.getVisibility() == 8) {
                this.f61006s = true;
                this.f61004q.setVisibility(0);
            } else if (!z11 && this.f61004q.getVisibility() == 0) {
                this.f61004q.setVisibility(8);
            }
        }
    }

    /* renamed from: n */
    public void m65362n() {
        View view = this.f61004q;
        if (view != null && view.getTranslationY() != 0.0f) {
            this.f61007t = 0.0f;
            this.f61004q.animate().translationY(this.f61007t).setDuration(200L).start();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        final int i15;
        boolean z13;
        boolean z14;
        super.onLayout(z11, i11, i12, i13, i14);
        if ((this.f61006s || z11) && this.f61003p != null && this.f61004q != null) {
            int height = getHeight();
            int max = Math.max((this.f61003p.getBottom() + ((int) this.f61003p.getTranslationY())) - getTop(), 0);
            final int paddingBottom = max - this.f61003p.getPaddingBottom();
            if (this.f61006s) {
                float f11 = height;
                this.f61007t = f11;
                this.f61004q.setTranslationY(f11);
                i15 = m65351f();
                if (i15 >= 0 && f11 > i15 * 0.5f) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (paddingBottom != 0 && z14) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.f61005r != 0 && !z14) {
                    z12 = false;
                } else {
                    z12 = true;
                }
            } else {
                z12 = false;
                i15 = 0;
                z13 = false;
            }
            if (paddingBottom != 0) {
                TouchListView touchListView = this.f61003p;
                touchListView.setPadding(touchListView.getPaddingLeft(), this.f61003p.getPaddingTop(), this.f61003p.getPaddingRight(), max);
                this.f61003p.m76942D2(true);
                this.f61003p.scrollBy(0, -paddingBottom);
                this.f61003p.m76942D2(false);
            }
            if (z12) {
                m65362n();
                if (z13) {
                    this.f61003p.m76942D2(true);
                    this.f61003p.postDelayed(new Runnable() { // from class: m60.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatBottomOverlayContainerView.this.m65352i(paddingBottom, i15);
                        }
                    }, 200L);
                }
            }
            this.f61006s = false;
        }
    }

    /* renamed from: p */
    public void m65363p() {
        View view = this.f61004q;
        if (view != null && view.getTranslationY() < getHeight()) {
            this.f61007t = getHeight();
            this.f61004q.animate().translationY(this.f61007t).setDuration(200L).start();
        }
    }

    public ChatBottomOverlayContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatBottomOverlayContainerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f61006s = true;
        this.f61007t = 0.0f;
        this.f61008u = new C11735b();
        this.f61009v = new HandlerC11736c(Looper.getMainLooper());
        setClipChildren(true);
    }
}
