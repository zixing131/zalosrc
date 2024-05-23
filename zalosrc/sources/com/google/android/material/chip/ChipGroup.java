package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.accessibility.C1507g0;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: B */
    private static final int f35140B = AbstractC23586k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: A */
    private boolean f35141A;

    /* renamed from: t */
    private int f35142t;

    /* renamed from: u */
    private int f35143u;

    /* renamed from: v */
    private boolean f35144v;

    /* renamed from: w */
    private boolean f35145w;

    /* renamed from: x */
    private final C6280b f35146x;

    /* renamed from: y */
    private ViewGroupOnHierarchyChangeListenerC6282d f35147y;

    /* renamed from: z */
    private int f35148z;

    /* loaded from: classes3.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: classes3.dex */
    public class C6280b implements CompoundButton.OnCheckedChangeListener {
        private C6280b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (ChipGroup.this.f35141A) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.f35145w) {
                ChipGroup.this.m32074s(compoundButton.getId(), true);
                ChipGroup.this.m32073r(compoundButton.getId(), false);
                return;
            }
            int id2 = compoundButton.getId();
            if (z11) {
                if (ChipGroup.this.f35148z != -1 && ChipGroup.this.f35148z != id2 && ChipGroup.this.f35144v) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.m32074s(chipGroup.f35148z, false);
                }
                ChipGroup.this.setCheckedId(id2);
                return;
            }
            if (ChipGroup.this.f35148z == id2) {
                ChipGroup.this.setCheckedId(-1);
            }
        }

        /* synthetic */ C6280b(ChipGroup chipGroup, C6279a c6279a) {
            this();
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC6281c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: classes3.dex */
    public class ViewGroupOnHierarchyChangeListenerC6282d implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: p */
        private ViewGroup.OnHierarchyChangeListener f35150p;

        private ViewGroupOnHierarchyChangeListenerC6282d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(AbstractC1579n0.m7889n());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m32076m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f35146x);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f35150p;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f35150p;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ ViewGroupOnHierarchyChangeListenerC6282d(ChipGroup chipGroup, C6279a c6279a) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.chipGroupStyle);
    }

    private int getChipCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) instanceof Chip) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: r */
    public void m32073r(int i11, boolean z11) {
        this.f35148z = i11;
    }

    /* renamed from: s */
    public void m32074s(int i11, boolean z11) {
        View findViewById = findViewById(i11);
        if (findViewById instanceof Chip) {
            this.f35141A = true;
            ((Chip) findViewById).setChecked(z11);
            this.f35141A = false;
        }
    }

    public void setCheckedId(int i11) {
        m32073r(i11, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i12 = this.f35148z;
                if (i12 != -1 && this.f35144v) {
                    m32074s(i12, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i11, layoutParams);
    }

    @Override // com.google.android.material.internal.FlowLayout
    /* renamed from: c */
    public boolean mo32075c() {
        return super.mo32075c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f35144v) {
            return this.f35148z;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f35144v) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f35142t;
    }

    public int getChipSpacingVertical() {
        return this.f35143u;
    }

    /* renamed from: m */
    public void m32076m(int i11) {
        int i12 = this.f35148z;
        if (i11 == i12) {
            return;
        }
        if (i12 != -1 && this.f35144v) {
            m32074s(i12, false);
        }
        if (i11 != -1) {
            m32074s(i11, true);
        }
        setCheckedId(i11);
    }

    /* renamed from: n */
    public void m32077n() {
        this.f35141A = true;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f35141A = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f35148z;
        if (i11 != -1) {
            m32074s(i11, true);
            setCheckedId(this.f35148z);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i11;
        int i12;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1507g0 m7571I0 = C1507g0.m7571I0(accessibilityNodeInfo);
        if (mo32075c()) {
            i11 = getChipCount();
        } else {
            i11 = -1;
        }
        int rowCount = getRowCount();
        if (m32079q()) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        m7571I0.m7622f0(C1507g0.b.m7661b(rowCount, i11, false, i12));
    }

    /* renamed from: p */
    public int m32078p(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) instanceof Chip) {
                if (((Chip) getChildAt(i12)) == view) {
                    return i11;
                }
                i11++;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public boolean m32079q() {
        return this.f35144v;
    }

    public void setChipSpacing(int i11) {
        setChipSpacingHorizontal(i11);
        setChipSpacingVertical(i11);
    }

    public void setChipSpacingHorizontal(int i11) {
        if (this.f35142t != i11) {
            this.f35142t = i11;
            setItemSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i11) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingResource(int i11) {
        setChipSpacing(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingVertical(int i11) {
        if (this.f35143u != i11) {
            this.f35143u = i11;
            setLineSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i11) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i11));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i11) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC6281c interfaceC6281c) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f35147y.f35150p = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z11) {
        this.f35145w = z11;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z11) {
        super.setSingleLine(z11);
    }

    public void setSingleSelection(boolean z11) {
        if (this.f35144v != z11) {
            this.f35144v = z11;
            m32077n();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r4), attributeSet, i11);
        int i12 = f35140B;
        this.f35146x = new C6280b();
        this.f35147y = new ViewGroupOnHierarchyChangeListenerC6282d();
        this.f35148z = -1;
        this.f35141A = false;
        TypedArray m32639h = AbstractC6355v.m32639h(getContext(), attributeSet, AbstractC23587l.ChipGroup, i11, i12, new int[0]);
        int dimensionPixelOffset = m32639h.getDimensionPixelOffset(AbstractC23587l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(m32639h.getDimensionPixelOffset(AbstractC23587l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(m32639h.getDimensionPixelOffset(AbstractC23587l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(m32639h.getBoolean(AbstractC23587l.ChipGroup_singleLine, false));
        setSingleSelection(m32639h.getBoolean(AbstractC23587l.ChipGroup_singleSelection, false));
        setSelectionRequired(m32639h.getBoolean(AbstractC23587l.ChipGroup_selectionRequired, false));
        int resourceId = m32639h.getResourceId(AbstractC23587l.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f35148z = resourceId;
        }
        m32639h.recycle();
        super.setOnHierarchyChangeListener(this.f35147y);
        AbstractC1579n0.m7823L0(this, 1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i11) {
        setSingleLine(getResources().getBoolean(i11));
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }
}
