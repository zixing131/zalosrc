package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1613w;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p706z6.C31682a;
import p706z6.C31694m;
import p706z6.InterfaceC31684c;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: z */
    private static final int f35043z = AbstractC23586k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: p */
    private final List f35044p;

    /* renamed from: q */
    private final C6268c f35045q;

    /* renamed from: r */
    private final C6271f f35046r;

    /* renamed from: s */
    private final LinkedHashSet f35047s;

    /* renamed from: t */
    private final Comparator f35048t;

    /* renamed from: u */
    private Integer[] f35049u;

    /* renamed from: v */
    private boolean f35050v;

    /* renamed from: w */
    private boolean f35051w;

    /* renamed from: x */
    private boolean f35052x;

    /* renamed from: y */
    private int f35053y;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: classes3.dex */
    class C6266a implements Comparator {
        C6266a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: classes3.dex */
    class C6267b extends C1490a {
        C6267b() {
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            c1507g0.m7623g0(C1507g0.c.m7662a(0, 1, MaterialButtonToggleGroup.this.m31910n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: classes3.dex */
    public class C6268c implements MaterialButton.InterfaceC6264a {
        private C6268c() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC6264a
        /* renamed from: a */
        public void mo31897a(MaterialButton materialButton, boolean z11) {
            int i11;
            if (MaterialButtonToggleGroup.this.f35050v) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f35051w) {
                MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                if (z11) {
                    i11 = materialButton.getId();
                } else {
                    i11 = -1;
                }
                materialButtonToggleGroup.f35053y = i11;
            }
            if (MaterialButtonToggleGroup.this.m31916w(materialButton.getId(), z11)) {
                MaterialButtonToggleGroup.this.m31908l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C6268c(MaterialButtonToggleGroup materialButtonToggleGroup, C6266a c6266a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: classes3.dex */
    public static class C6269d {

        /* renamed from: e */
        private static final InterfaceC31684c f35057e = new C31682a(0.0f);

        /* renamed from: a */
        InterfaceC31684c f35058a;

        /* renamed from: b */
        InterfaceC31684c f35059b;

        /* renamed from: c */
        InterfaceC31684c f35060c;

        /* renamed from: d */
        InterfaceC31684c f35061d;

        C6269d(InterfaceC31684c interfaceC31684c, InterfaceC31684c interfaceC31684c2, InterfaceC31684c interfaceC31684c3, InterfaceC31684c interfaceC31684c4) {
            this.f35058a = interfaceC31684c;
            this.f35059b = interfaceC31684c3;
            this.f35060c = interfaceC31684c4;
            this.f35061d = interfaceC31684c2;
        }

        /* renamed from: a */
        public static C6269d m31923a(C6269d c6269d) {
            InterfaceC31684c interfaceC31684c = f35057e;
            return new C6269d(interfaceC31684c, c6269d.f35061d, interfaceC31684c, c6269d.f35060c);
        }

        /* renamed from: b */
        public static C6269d m31924b(C6269d c6269d, View view) {
            if (AbstractC6359z.m32653h(view)) {
                return m31925c(c6269d);
            }
            return m31926d(c6269d);
        }

        /* renamed from: c */
        public static C6269d m31925c(C6269d c6269d) {
            InterfaceC31684c interfaceC31684c = c6269d.f35058a;
            InterfaceC31684c interfaceC31684c2 = c6269d.f35061d;
            InterfaceC31684c interfaceC31684c3 = f35057e;
            return new C6269d(interfaceC31684c, interfaceC31684c2, interfaceC31684c3, interfaceC31684c3);
        }

        /* renamed from: d */
        public static C6269d m31926d(C6269d c6269d) {
            InterfaceC31684c interfaceC31684c = f35057e;
            return new C6269d(interfaceC31684c, interfaceC31684c, c6269d.f35059b, c6269d.f35060c);
        }

        /* renamed from: e */
        public static C6269d m31927e(C6269d c6269d, View view) {
            if (AbstractC6359z.m32653h(view)) {
                return m31926d(c6269d);
            }
            return m31925c(c6269d);
        }

        /* renamed from: f */
        public static C6269d m31928f(C6269d c6269d) {
            InterfaceC31684c interfaceC31684c = c6269d.f35058a;
            InterfaceC31684c interfaceC31684c2 = f35057e;
            return new C6269d(interfaceC31684c, interfaceC31684c2, c6269d.f35059b, interfaceC31684c2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC6270e {
        /* renamed from: a */
        void mo31929a(MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    /* loaded from: classes3.dex */
    public class C6271f implements MaterialButton.InterfaceC6265b {
        private C6271f() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC6265b
        /* renamed from: a */
        public void mo31898a(MaterialButton materialButton, boolean z11) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C6271f(MaterialButtonToggleGroup materialButtonToggleGroup, C6266a c6266a) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (m31912q(i11)) {
                return i11;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m31912q(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof MaterialButton) && m31912q(i12)) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: h */
    private void m31905h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
            MaterialButton m31909m = m31909m(i11);
            int min = Math.min(m31909m.getStrokeWidth(), m31909m(i11 - 1).getStrokeWidth());
            LinearLayout.LayoutParams m31906i = m31906i(m31909m);
            if (getOrientation() == 0) {
                AbstractC1613w.m8236c(m31906i, 0);
                AbstractC1613w.m8237d(m31906i, -min);
                m31906i.topMargin = 0;
            } else {
                m31906i.bottomMargin = 0;
                m31906i.topMargin = -min;
                AbstractC1613w.m8237d(m31906i, 0);
            }
            m31909m.setLayoutParams(m31906i);
        }
        m31913s(firstVisibleChildIndex);
    }

    /* renamed from: i */
    private LinearLayout.LayoutParams m31906i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: j */
    private void m31907j(int i11, boolean z11) {
        MaterialButton materialButton = (MaterialButton) findViewById(i11);
        if (materialButton != null) {
            materialButton.setChecked(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m31908l(int i11, boolean z11) {
        Iterator it = this.f35047s.iterator();
        while (it.hasNext()) {
            ((InterfaceC6270e) it.next()).mo31929a(this, i11, z11);
        }
    }

    /* renamed from: m */
    private MaterialButton m31909m(int i11) {
        return (MaterialButton) getChildAt(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public int m31910n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == view) {
                return i11;
            }
            if ((getChildAt(i12) instanceof MaterialButton) && m31912q(i12)) {
                i11++;
            }
        }
        return -1;
    }

    /* renamed from: p */
    private C6269d m31911p(int i11, int i12, int i13) {
        boolean z11;
        C6269d c6269d = (C6269d) this.f35044p.get(i11);
        if (i12 == i13) {
            return c6269d;
        }
        if (getOrientation() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == i12) {
            if (z11) {
                return C6269d.m31927e(c6269d, this);
            }
            return C6269d.m31928f(c6269d);
        }
        if (i11 == i13) {
            if (z11) {
                return C6269d.m31924b(c6269d, this);
            }
            return C6269d.m31923a(c6269d);
        }
        return null;
    }

    /* renamed from: q */
    private boolean m31912q(int i11) {
        if (getChildAt(i11).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private void m31913s(int i11) {
        if (getChildCount() != 0 && i11 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m31909m(i11).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            } else {
                AbstractC1613w.m8236c(layoutParams, 0);
                AbstractC1613w.m8237d(layoutParams, 0);
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
            }
        }
    }

    private void setCheckedId(int i11) {
        this.f35053y = i11;
        m31908l(i11, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(AbstractC1579n0.m7889n());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.m31890a(this.f35045q);
        materialButton.setOnPressedChangeListenerInternal(this.f35046r);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: u */
    private void m31914u(int i11, boolean z11) {
        View findViewById = findViewById(i11);
        if (findViewById instanceof MaterialButton) {
            this.f35050v = true;
            ((MaterialButton) findViewById).setChecked(z11);
            this.f35050v = false;
        }
    }

    /* renamed from: v */
    private static void m31915v(C31694m.b bVar, C6269d c6269d) {
        if (c6269d == null) {
            bVar.m152520o(0.0f);
        } else {
            bVar.m152514F(c6269d.f35058a).m152528w(c6269d.f35061d).m152518J(c6269d.f35059b).m152509A(c6269d.f35060c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public boolean m31916w(int i11, boolean z11) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f35052x && checkedButtonIds.isEmpty()) {
            m31914u(i11, true);
            this.f35053y = i11;
            return false;
        }
        if (z11 && this.f35051w) {
            checkedButtonIds.remove(Integer.valueOf(i11));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                m31914u(intValue, false);
                m31908l(intValue, false);
            }
        }
        return true;
    }

    /* renamed from: x */
    private void m31917x() {
        TreeMap treeMap = new TreeMap(this.f35048t);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            treeMap.put(m31909m(i11), Integer.valueOf(i11));
        }
        this.f35049u = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            return;
        }
        super.addView(view, i11, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m31916w(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C31694m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f35044p.add(new C6269d(shapeAppearanceModel.m152488r(), shapeAppearanceModel.m152481j(), shapeAppearanceModel.m152490t(), shapeAppearanceModel.m152483l()));
        AbstractC1579n0.m7801A0(materialButton, new C6267b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m31917x();
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public void m31918g(InterfaceC6270e interfaceC6270e) {
        this.f35047s.add(interfaceC6270e);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f35051w) {
            return this.f35053y;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            MaterialButton m31909m = m31909m(i11);
            if (m31909m.isChecked()) {
                arrayList.add(Integer.valueOf(m31909m.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        Integer[] numArr = this.f35049u;
        if (numArr != null && i12 < numArr.length) {
            return numArr[i12].intValue();
        }
        return i12;
    }

    /* renamed from: k */
    public void m31919k() {
        this.f35050v = true;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            MaterialButton m31909m = m31909m(i11);
            m31909m.setChecked(false);
            m31908l(m31909m.getId(), false);
        }
        this.f35050v = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f35053y;
        if (i11 != -1) {
            m31907j(i11, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1507g0 m7571I0 = C1507g0.m7571I0(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (m31920r()) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        m7571I0.m7622f0(C1507g0.b.m7661b(1, visibleButtonCount, false, i11));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        m31921y();
        m31905h();
        super.onMeasure(i11, i12);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.m31892i(this.f35045q);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f35044p.remove(indexOfChild);
        }
        m31921y();
        m31905h();
    }

    /* renamed from: r */
    public boolean m31920r() {
        return this.f35051w;
    }

    public void setSelectionRequired(boolean z11) {
        this.f35052x = z11;
    }

    public void setSingleSelection(boolean z11) {
        if (this.f35051w != z11) {
            this.f35051w = z11;
            m31919k();
        }
    }

    /* renamed from: y */
    void m31921y() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i11 = 0; i11 < childCount; i11++) {
            MaterialButton m31909m = m31909m(i11);
            if (m31909m.getVisibility() != 8) {
                C31694m.b m152492v = m31909m.getShapeAppearanceModel().m152492v();
                m31915v(m152492v, m31911p(i11, firstVisibleChildIndex, lastVisibleChildIndex));
                m31909m.setShapeAppearanceModel(m152492v.m152519m());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r4), attributeSet, i11);
        int i12 = f35043z;
        this.f35044p = new ArrayList();
        C6266a c6266a = null;
        this.f35045q = new C6268c(this, c6266a);
        this.f35046r = new C6271f(this, c6266a);
        this.f35047s = new LinkedHashSet();
        this.f35048t = new C6266a();
        this.f35050v = false;
        TypedArray m32639h = AbstractC6355v.m32639h(getContext(), attributeSet, AbstractC23587l.MaterialButtonToggleGroup, i11, i12, new int[0]);
        setSingleSelection(m32639h.getBoolean(AbstractC23587l.MaterialButtonToggleGroup_singleSelection, false));
        this.f35053y = m32639h.getResourceId(AbstractC23587l.MaterialButtonToggleGroup_checkedButton, -1);
        this.f35052x = m32639h.getBoolean(AbstractC23587l.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        m32639h.recycle();
        AbstractC1579n0.m7823L0(this, 1);
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }
}
