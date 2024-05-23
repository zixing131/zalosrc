package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p175g0.AbstractC19187j;

/* loaded from: classes2.dex */
public final class ViewStubCompat extends View {

    /* renamed from: p */
    private int f4568p;

    /* renamed from: q */
    private int f4569q;

    /* renamed from: r */
    private WeakReference f4570r;

    /* renamed from: s */
    private LayoutInflater f4571s;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1147a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View m5445a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f4568p != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f4571s;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f4568p, viewGroup, false);
                int i11 = this.f4569q;
                if (i11 != -1) {
                    inflate.setId(i11);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f4570r = new WeakReference(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4569q;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4571s;
    }

    public int getLayoutResource() {
        return this.f4568p;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i11) {
        this.f4569q = i11;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4571s = layoutInflater;
    }

    public void setLayoutResource(int i11) {
        this.f4568p = i11;
    }

    public void setOnInflateListener(InterfaceC1147a interfaceC1147a) {
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        WeakReference weakReference = this.f4570r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i11);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i11);
        if (i11 == 0 || i11 == 4) {
            m5445a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4568p = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.ViewStubCompat, i11, 0);
        this.f4569q = obtainStyledAttributes.getResourceId(AbstractC19187j.ViewStubCompat_android_inflatedId, -1);
        this.f4568p = obtainStyledAttributes.getResourceId(AbstractC19187j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(AbstractC19187j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
