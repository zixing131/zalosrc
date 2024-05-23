package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1579n0;
import p286k2.AbstractC21441e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.transition.h */
/* loaded from: classes2.dex */
public class C2015h extends ViewGroup implements InterfaceC2009e {

    /* renamed from: p */
    ViewGroup f8576p;

    /* renamed from: q */
    View f8577q;

    /* renamed from: r */
    final View f8578r;

    /* renamed from: s */
    int f8579s;

    /* renamed from: t */
    private Matrix f8580t;

    /* renamed from: u */
    private final ViewTreeObserver.OnPreDrawListener f8581u;

    /* renamed from: androidx.transition.h$a */
    /* loaded from: classes2.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            AbstractC1579n0.m7898r0(C2015h.this);
            C2015h c2015h = C2015h.this;
            ViewGroup viewGroup = c2015h.f8576p;
            if (viewGroup != null && (view = c2015h.f8577q) != null) {
                viewGroup.endViewTransition(view);
                AbstractC1579n0.m7898r0(C2015h.this.f8576p);
                C2015h c2015h2 = C2015h.this;
                c2015h2.f8576p = null;
                c2015h2.f8577q = null;
                return true;
            }
            return true;
        }
    }

    C2015h(View view) {
        super(view.getContext());
        this.f8581u = new a();
        this.f8578r = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2015h m11006b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i11;
        C2011f c2011f;
        if (view.getParent() instanceof ViewGroup) {
            C2011f m10993b = C2011f.m10993b(viewGroup);
            C2015h m11009e = m11009e(view);
            if (m11009e != null && (c2011f = (C2011f) m11009e.getParent()) != m10993b) {
                i11 = m11009e.f8579s;
                c2011f.removeView(m11009e);
                m11009e = null;
            } else {
                i11 = 0;
            }
            if (m11009e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m11007c(view, viewGroup, matrix);
                }
                m11009e = new C2015h(view);
                m11009e.m11012h(matrix);
                if (m10993b == null) {
                    m10993b = new C2011f(viewGroup);
                } else {
                    m10993b.m10999g();
                }
                m11008d(viewGroup, m10993b);
                m11008d(viewGroup, m11009e);
                m10993b.m10998a(m11009e);
                m11009e.f8579s = i11;
            } else if (matrix != null) {
                m11009e.m11012h(matrix);
            }
            m11009e.f8579s++;
            return m11009e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    static void m11007c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        AbstractC2004b0.m10976j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        AbstractC2004b0.m10977k(viewGroup, matrix);
    }

    /* renamed from: d */
    static void m11008d(View view, View view2) {
        AbstractC2004b0.m10973g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    static C2015h m11009e(View view) {
        return (C2015h) view.getTag(AbstractC21441e.ghost_view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m11010f(View view) {
        C2015h m11009e = m11009e(view);
        if (m11009e != null) {
            int i11 = m11009e.f8579s - 1;
            m11009e.f8579s = i11;
            if (i11 <= 0) {
                ((C2011f) m11009e.getParent()).removeView(m11009e);
            }
        }
    }

    /* renamed from: g */
    static void m11011g(View view, C2015h c2015h) {
        view.setTag(AbstractC21441e.ghost_view, c2015h);
    }

    @Override // androidx.transition.InterfaceC2009e
    /* renamed from: a */
    public void mo10991a(ViewGroup viewGroup, View view) {
        this.f8576p = viewGroup;
        this.f8577q = view;
    }

    /* renamed from: h */
    void m11012h(Matrix matrix) {
        this.f8580t = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m11011g(this.f8578r, this);
        this.f8578r.getViewTreeObserver().addOnPreDrawListener(this.f8581u);
        AbstractC2004b0.m10975i(this.f8578r, 4);
        if (this.f8578r.getParent() != null) {
            ((View) this.f8578r.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f8578r.getViewTreeObserver().removeOnPreDrawListener(this.f8581u);
        AbstractC2004b0.m10975i(this.f8578r, 0);
        m11011g(this.f8578r, null);
        if (this.f8578r.getParent() != null) {
            ((View) this.f8578r.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC2003b.m10966a(canvas, true);
        canvas.setMatrix(this.f8580t);
        AbstractC2004b0.m10975i(this.f8578r, 0);
        this.f8578r.invalidate();
        AbstractC2004b0.m10975i(this.f8578r, 4);
        drawChild(canvas, this.f8578r, getDrawingTime());
        AbstractC2003b.m10966a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View, androidx.transition.InterfaceC2009e
    public void setVisibility(int i11) {
        int i12;
        super.setVisibility(i11);
        if (m11009e(this.f8578r) == this) {
            if (i11 == 0) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            AbstractC2004b0.m10975i(this.f8578r, i12);
        }
    }
}
