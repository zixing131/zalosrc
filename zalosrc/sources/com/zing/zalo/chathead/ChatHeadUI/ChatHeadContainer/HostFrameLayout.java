package com.zing.zalo.chathead.ChatHeadUI.ChatHeadContainer;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import au.AbstractC2379w;
import com.zing.zalo.chathead.ChatHeadUI.ChatHeadContainer.HostFrameLayout;
import gg.C19443f;
import p209hg.C20052c;
import p348mi.AbstractC23304d;
import p716zh.C31948ha;
import xl0.InterfaceC30160a;

/* loaded from: classes3.dex */
public class HostFrameLayout extends FrameLayout {

    /* renamed from: p */
    private final C20052c f42056p;

    /* renamed from: q */
    FrameLayout f42057q;

    /* renamed from: r */
    InterfaceC30160a f42058r;

    public HostFrameLayout(Context context, C20052c c20052c) {
        super(context);
        this.f42056p = c20052c;
        setBackgroundColor(0);
        setFitsSystemWindows(true);
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ig.c
            public /* synthetic */ ViewOnApplyWindowInsetsListenerC20549c() {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m39848b;
                m39848b = HostFrameLayout.this.m39848b(view, windowInsets);
                return m39848b;
            }
        });
        setSystemUiVisibility(1280);
        setMotionEventSplittingEnabled(false);
    }

    /* renamed from: b */
    public /* synthetic */ WindowInsets m39848b(View view, WindowInsets windowInsets) {
        InterfaceC30160a interfaceC30160a = this.f42058r;
        if (interfaceC30160a != null) {
            interfaceC30160a.mo35574m(windowInsets);
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        FrameLayout frameLayout = this.f42057q;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }

    /* renamed from: c */
    public void m39849c() {
        if (!this.f42056p.m104133H()) {
            if (!AbstractC23304d.f113330T0 && this.f42056p.m104135J()) {
                this.f42056p.m104149b0(false);
            }
            AbstractC2379w.m12430d(findFocus());
            this.f42056p.m104144U();
            this.f42056p.m104145W(C19443f.class);
            this.f42056p.mo35579p().mo93079r1(true);
        }
        if (C31948ha.m153587d().m153595i() || C31948ha.m153587d().m153596j()) {
            C31948ha.m153587d().m153602p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!dispatchKeyEvent && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
            if (!this.f42056p.mo35579p().m93096z1(4, keyEvent)) {
                m39849c();
            }
            return true;
        }
        return dispatchKeyEvent;
    }

    public FrameLayout getFullContainerFrameLayout() {
        if (this.f42057q == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.f42057q = frameLayout;
            addView(frameLayout);
        }
        this.f42057q.bringToFront();
        return this.f42057q;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        this.f42056p.m104139P(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f42056p.m104141R(i11, i12, i13, i14);
    }

    public void setApplyWindowInsetsListener(InterfaceC30160a interfaceC30160a) {
        this.f42058r = interfaceC30160a;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        super.addView(view, i11);
        FrameLayout frameLayout = this.f42057q;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        FrameLayout frameLayout = this.f42057q;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, int i12) {
        super.addView(view, i11, i12);
        FrameLayout frameLayout = this.f42057q;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        FrameLayout frameLayout = this.f42057q;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
    }
}
