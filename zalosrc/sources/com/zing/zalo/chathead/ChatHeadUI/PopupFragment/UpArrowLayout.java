package com.zing.zalo.chathead.ChatHeadUI.PopupFragment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import zl0.AbstractC32232i;

/* loaded from: classes3.dex */
public class UpArrowLayout extends ViewGroup {

    /* renamed from: p */
    private final Point f42078p;

    /* renamed from: q */
    private final Rect f42079q;

    /* renamed from: r */
    private int f42080r;

    /* renamed from: s */
    private final FrameLayout f42081s;

    /* renamed from: t */
    private final View f42082t;

    /* renamed from: u */
    private final Rect f42083u;

    public UpArrowLayout(Context context) {
        super(context);
        this.f42078p = new Point(0, 0);
        this.f42079q = new Rect();
        this.f42080r = 0;
        this.f42083u = new Rect();
        FrameLayout frameLayout = (FrameLayout) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.fake_zview, (ViewGroup) this, false);
        this.f42081s = frameLayout;
        this.f42082t = frameLayout.findViewById(AbstractC6918a0.fake_action_bar);
        frameLayout.setEnabled(false);
        frameLayout.setClickable(false);
    }

    /* renamed from: a */
    public void m39855a(int i11, int i12, int i13) {
        Point point = this.f42078p;
        point.x = i11;
        point.y = i12;
        this.f42080r = i13;
        invalidate();
    }

    /* renamed from: b */
    public void m39856b() {
        this.f42081s.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.CSCPrimaryBackground));
        this.f42082t.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.stencil_bg_action_bar));
    }

    /* renamed from: c */
    Path m39857c(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11) {
        Path path = new Path();
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        float f17 = f13 - f11;
        float f18 = f14 - f12;
        float f19 = f17 / 2.0f;
        if (f15 > f19) {
            f15 = f19;
        }
        float f21 = f18 / 2.0f;
        if (f16 > f21) {
            f16 = f21;
        }
        float f22 = f17 - (f15 * 2.0f);
        float f23 = f18 - (2.0f * f16);
        path.moveTo(f13, f12 + f16);
        float f24 = -f16;
        float f25 = -f15;
        path.rQuadTo(0.0f, f24, f25, f24);
        path.rLineTo(-f22, 0.0f);
        path.rQuadTo(f25, 0.0f, f25, f16);
        path.rLineTo(0.0f, f23);
        if (z11) {
            path.rLineTo(0.0f, f16);
            path.rLineTo(f17, 0.0f);
            path.rLineTo(0.0f, f24);
        } else {
            path.rQuadTo(0.0f, f16, f15, f16);
            path.rLineTo(f22, 0.0f);
            path.rQuadTo(f15, 0.0f, f15, f24);
        }
        path.rLineTo(0.0f, -f23);
        path.close();
        return path;
    }

    /* renamed from: d */
    public void m39858d(boolean z11) {
        int i11;
        if (this.f42081s.getParent() == null) {
            addView(this.f42081s, new ViewGroup.LayoutParams(-1, -1));
        }
        FrameLayout frameLayout = this.f42081s;
        int i12 = 0;
        if (frameLayout != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            frameLayout.setVisibility(i11);
        }
        if (!AbstractC32232i.m155457e("x86")) {
            if (z11) {
                i12 = 2;
            }
            AbstractC32232i.m155462j(this, i12, null);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        canvas.clipPath(m39857c(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), AbstractC32232i.m155453a(6.0f), AbstractC32232i.m155453a(6.0f), true));
        return super.drawChild(canvas, view, j11);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FrameLayout.LayoutParams(getContext(), attributeSet);
    }

    public Point getPointTo() {
        return this.f42078p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        if (getResources().getConfiguration().orientation == 2) {
            this.f42079q.set(i13 - this.f42078p.x, i12, i13, i14);
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt = getChildAt(i16);
                if (this.f42083u.top != 0) {
                    i15 = this.f42080r;
                } else {
                    i15 = 0;
                }
                childAt.layout(i11, i15 + i12, i13 - this.f42078p.x, i14);
            }
            return;
        }
        this.f42079q.set(i11, i12, i13, this.f42078p.y + i12);
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            getChildAt(i17).layout(i11, this.f42078p.y + i12, i13, i14);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        setMeasuredDimension(size, size2);
        if (getResources().getConfiguration().orientation == 2) {
            getRootView().getWindowVisibleDisplayFrame(this.f42083u);
            if (this.f42083u.top != 0) {
                size2 -= this.f42080r;
            }
            size -= this.f42078p.x;
        } else {
            size2 -= this.f42078p.y;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1 && !this.f42079q.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
