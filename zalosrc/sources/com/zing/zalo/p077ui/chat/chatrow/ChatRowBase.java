package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* loaded from: classes5.dex */
public class ChatRowBase extends ViewGroup implements Drawable.Callback {

    /* renamed from: w */
    public static int f57633w;

    /* renamed from: x */
    public static long f57634x;

    /* renamed from: y */
    public static long f57635y;

    /* renamed from: z */
    static Handler f57636z = new Handler(Looper.getMainLooper());

    /* renamed from: p */
    ChatRowBase f57637p;

    /* renamed from: q */
    boolean f57638q;

    /* renamed from: r */
    RunnableC11346a f57639r;

    /* renamed from: s */
    int f57640s;

    /* renamed from: t */
    RunnableC11347b f57641t;

    /* renamed from: u */
    int f57642u;

    /* renamed from: v */
    Runnable f57643v;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowBase$a */
    /* loaded from: classes5.dex */
    class RunnableC11346a implements Runnable {

        /* renamed from: p */
        public int f57644p;

        RunnableC11346a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ChatRowBase chatRowBase = ChatRowBase.this;
            if (chatRowBase.f57638q && chatRowBase.f57637p.getParent() != null) {
                int i11 = this.f57644p;
                ChatRowBase chatRowBase2 = ChatRowBase.this;
                if (i11 == chatRowBase2.f57640s) {
                    chatRowBase2.f57638q = false;
                    chatRowBase2.performHapticFeedback(0);
                    ChatRowBase.this.mo61088n();
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    ChatRowBase.this.onTouchEvent(obtain);
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowBase$b */
    /* loaded from: classes5.dex */
    private final class RunnableC11347b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ChatRowBase chatRowBase = ChatRowBase.this;
            if (chatRowBase.f57639r == null) {
                chatRowBase.f57639r = new RunnableC11346a();
            }
            ChatRowBase chatRowBase2 = ChatRowBase.this;
            RunnableC11346a runnableC11346a = chatRowBase2.f57639r;
            int i11 = chatRowBase2.f57640s + 1;
            chatRowBase2.f57640s = i11;
            runnableC11346a.f57644p = i11;
            chatRowBase2.postDelayed(runnableC11346a, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
        }

        private RunnableC11347b() {
        }
    }

    public ChatRowBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57637p = this;
        this.f57638q = false;
        this.f57639r = null;
        this.f57640s = 0;
        this.f57641t = null;
        this.f57643v = new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.t
            @Override // java.lang.Runnable
            public final void run() {
                ChatRowBase.this.m61178j();
            }
        };
    }

    public int getPosition() {
        return this.f57642u;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        this.f57637p.invalidate();
    }

    /* renamed from: j */
    public void m61178j() {
        m61179k(!this.f57638q);
    }

    /* renamed from: k */
    public void m61179k(boolean z11) {
        if (z11 && f57633w == 1) {
            mo61102q();
        }
        f57633w = 0;
        f57634x = 0L;
        f57635y = 0L;
    }

    /* renamed from: l */
    public void m61180l() {
        this.f57638q = false;
        RunnableC11346a runnableC11346a = this.f57639r;
        if (runnableC11346a != null) {
            removeCallbacks(runnableC11346a);
        }
        RunnableC11347b runnableC11347b = this.f57641t;
        if (runnableC11347b != null) {
            removeCallbacks(runnableC11347b);
        }
    }

    /* renamed from: n */
    protected void mo61088n() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    /* renamed from: q */
    protected void mo61102q() {
    }

    /* renamed from: r */
    public void m61181r() {
        if (this.f57638q) {
            return;
        }
        this.f57638q = true;
        if (this.f57641t == null) {
            this.f57641t = new RunnableC11347b();
        }
        postDelayed(this.f57641t, ViewConfiguration.getTapTimeout());
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        f57636z.postAtTime(runnable, drawable, j11);
    }

    public void setPositionTag(int i11) {
        this.f57642u = i11;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        f57636z.removeCallbacks(runnable, drawable);
    }
}
