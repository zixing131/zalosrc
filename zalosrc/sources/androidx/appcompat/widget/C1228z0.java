package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.C1611v0;
import androidx.core.widget.C1636h;
import java.lang.reflect.Field;
import p175g0.AbstractC19178a;
import p224i0.AbstractC20176e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.z0 */
/* loaded from: classes2.dex */
public class C1228z0 extends ListView {

    /* renamed from: A */
    private C1611v0 f4771A;

    /* renamed from: B */
    private C1636h f4772B;

    /* renamed from: C */
    b f4773C;

    /* renamed from: p */
    private final Rect f4774p;

    /* renamed from: q */
    private int f4775q;

    /* renamed from: r */
    private int f4776r;

    /* renamed from: s */
    private int f4777s;

    /* renamed from: t */
    private int f4778t;

    /* renamed from: u */
    private int f4779u;

    /* renamed from: v */
    private Field f4780v;

    /* renamed from: w */
    private a f4781w;

    /* renamed from: x */
    private boolean f4782x;

    /* renamed from: y */
    private boolean f4783y;

    /* renamed from: z */
    private boolean f4784z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.z0$a */
    /* loaded from: classes2.dex */
    public static class a extends AbstractC20176e {

        /* renamed from: q */
        private boolean f4785q;

        a(Drawable drawable) {
            super(drawable);
            this.f4785q = true;
        }

        /* renamed from: c */
        void m5790c(boolean z11) {
            this.f4785q = z11;
        }

        @Override // p224i0.AbstractC20176e, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f4785q) {
                super.draw(canvas);
            }
        }

        @Override // p224i0.AbstractC20176e, android.graphics.drawable.Drawable
        public void setHotspot(float f11, float f12) {
            if (this.f4785q) {
                super.setHotspot(f11, f12);
            }
        }

        @Override // p224i0.AbstractC20176e, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i11, int i12, int i13, int i14) {
            if (this.f4785q) {
                super.setHotspotBounds(i11, i12, i13, i14);
            }
        }

        @Override // p224i0.AbstractC20176e, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f4785q) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p224i0.AbstractC20176e, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z11, boolean z12) {
            if (this.f4785q) {
                return super.setVisible(z11, z12);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.z0$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
        }

        /* renamed from: a */
        public void m5791a() {
            C1228z0 c1228z0 = C1228z0.this;
            c1228z0.f4773C = null;
            c1228z0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m5792b() {
            C1228z0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C1228z0 c1228z0 = C1228z0.this;
            c1228z0.f4773C = null;
            c1228z0.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1228z0(Context context, boolean z11) {
        super(context, null, AbstractC19178a.dropDownListViewStyle);
        this.f4774p = new Rect();
        this.f4775q = 0;
        this.f4776r = 0;
        this.f4777s = 0;
        this.f4778t = 0;
        this.f4783y = z11;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f4780v = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m5780a() {
        this.f4784z = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f4779u - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1611v0 c1611v0 = this.f4771A;
        if (c1611v0 != null) {
            c1611v0.m8216c();
            this.f4771A = null;
        }
    }

    /* renamed from: b */
    private void m5781b(View view, int i11) {
        performItemClick(view, i11, getItemIdAtPosition(i11));
    }

    /* renamed from: c */
    private void m5782c(Canvas canvas) {
        Drawable selector;
        if (!this.f4774p.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f4774p);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m5783f(int i11, View view) {
        Rect rect = this.f4774p;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f4775q;
        rect.top -= this.f4776r;
        rect.right += this.f4777s;
        rect.bottom += this.f4778t;
        try {
            boolean z11 = this.f4780v.getBoolean(this);
            if (view.isEnabled() != z11) {
                this.f4780v.set(this, Boolean.valueOf(!z11));
                if (i11 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m5784g(int i11, View view) {
        boolean z11;
        Drawable selector = getSelector();
        boolean z12 = true;
        if (selector != null && i11 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            selector.setVisible(false, false);
        }
        m5783f(i11, view);
        if (z11) {
            Rect rect = this.f4774p;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z12 = false;
            }
            selector.setVisible(z12, false);
            AbstractC1414a.m7193k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m5785h(int i11, View view, float f11, float f12) {
        m5784g(i11, view);
        Drawable selector = getSelector();
        if (selector != null && i11 != -1) {
            AbstractC1414a.m7193k(selector, f11, f12);
        }
    }

    /* renamed from: i */
    private void m5786i(View view, int i11, float f11, float f12) {
        View childAt;
        this.f4784z = true;
        drawableHotspotChanged(f11, f12);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.f4779u;
        if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f4779u = i11;
        view.drawableHotspotChanged(f11 - view.getLeft(), f12 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m5785h(i11, view, f11, f12);
        m5787j(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private void m5787j(boolean z11) {
        a aVar = this.f4781w;
        if (aVar != null) {
            aVar.m5790c(z11);
        }
    }

    /* renamed from: k */
    private boolean m5788k() {
        return this.f4784z;
    }

    /* renamed from: l */
    private void m5789l() {
        Drawable selector = getSelector();
        if (selector != null && m5788k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: d */
    public int mo5326d(int i11, int i12, int i13, int i14, int i15) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i16 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < count; i19++) {
            int itemViewType = adapter.getItemViewType(i19);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i19, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i21 = layoutParams.height;
            if (i21 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i11, makeMeasureSpec);
            view.forceLayout();
            if (i19 > 0) {
                i16 += dividerHeight;
            }
            i16 += view.getMeasuredHeight();
            if (i16 >= i14) {
                if (i15 >= 0 && i19 > i15 && i18 > 0 && i16 != i14) {
                    return i18;
                }
                return i14;
            }
            if (i15 >= 0 && i19 >= i15) {
                i18 = i16;
            }
        }
        return i16;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m5782c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f4773C != null) {
            return;
        }
        super.drawableStateChanged();
        m5787j(true);
        m5789l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:            if (r0 != 3) goto L8;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo5327e(MotionEvent motionEvent, int i11) {
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i11);
        if (findPointerIndex >= 0) {
            int x11 = (int) motionEvent.getX(findPointerIndex);
            int y11 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x11, y11);
            if (pointToPosition == -1) {
                z12 = true;
                if (z11 || z12) {
                    m5780a();
                }
                if (z11) {
                    if (this.f4772B == null) {
                        this.f4772B = new C1636h(this);
                    }
                    this.f4772B.m8350m(true);
                    this.f4772B.onTouch(this, motionEvent);
                } else {
                    C1636h c1636h = this.f4772B;
                    if (c1636h != null) {
                        c1636h.m8350m(false);
                    }
                }
                return z11;
            }
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            m5786i(childAt, pointToPosition, x11, y11);
            if (actionMasked == 1) {
                m5781b(childAt, pointToPosition);
            }
            z12 = false;
            z11 = true;
            if (z11) {
            }
            m5780a();
            if (z11) {
            }
            return z11;
        }
        z12 = false;
        z11 = false;
        if (z11) {
        }
        m5780a();
        if (z11) {
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        if (!this.f4783y && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        if (!this.f4783y && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (!this.f4783y && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        if ((this.f4783y && this.f4782x) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f4773C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4773C == null) {
            b bVar = new b();
            this.f4773C = bVar;
            bVar.m5792b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m5789l();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4779u = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f4773C;
        if (bVar != null) {
            bVar.m5791a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z11) {
        this.f4782x = z11;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar;
        if (drawable != null) {
            aVar = new a(drawable);
        } else {
            aVar = null;
        }
        this.f4781w = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4775q = rect.left;
        this.f4776r = rect.top;
        this.f4777s = rect.right;
        this.f4778t = rect.bottom;
    }
}
