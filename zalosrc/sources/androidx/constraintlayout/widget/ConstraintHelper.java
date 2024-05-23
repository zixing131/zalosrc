package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C1295c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p045c1.C3186e;
import p045c1.C3187f;
import p045c1.C3191j;
import p045c1.InterfaceC3190i;

/* loaded from: classes2.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: p */
    protected int[] f5454p;

    /* renamed from: q */
    protected int f5455q;

    /* renamed from: r */
    protected Context f5456r;

    /* renamed from: s */
    protected InterfaceC3190i f5457s;

    /* renamed from: t */
    protected boolean f5458t;

    /* renamed from: u */
    protected String f5459u;

    /* renamed from: v */
    protected String f5460v;

    /* renamed from: w */
    private View[] f5461w;

    /* renamed from: x */
    protected HashMap f5462x;

    public ConstraintHelper(Context context) {
        super(context);
        this.f5454p = new int[32];
        this.f5458t = false;
        this.f5461w = null;
        this.f5462x = new HashMap();
        this.f5456r = context;
        mo5935n(null);
    }

    /* renamed from: d */
    private void m6357d(String str) {
        if (str == null || str.length() == 0 || this.f5456r == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int m6362l = m6362l(trim);
        if (m6362l != 0) {
            this.f5462x.put(Integer.valueOf(m6362l), trim);
            m6358e(m6362l);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find id of \"");
            sb2.append(trim);
            sb2.append("\"");
        }
    }

    /* renamed from: e */
    private void m6358e(int i11) {
        if (i11 == getId()) {
            return;
        }
        int i12 = this.f5455q + 1;
        int[] iArr = this.f5454p;
        if (i12 > iArr.length) {
            this.f5454p = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f5454p;
        int i13 = this.f5455q;
        iArr2[i13] = i11;
        this.f5455q = i13 + 1;
    }

    /* renamed from: f */
    private void m6359f(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.f5456r == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).f5518c0)) {
                if (childAt.getId() == -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("to use ConstraintTag view ");
                    sb2.append(childAt.getClass().getSimpleName());
                    sb2.append(" must have an ID");
                } else {
                    m6358e(childAt.getId());
                }
            }
        }
    }

    /* renamed from: j */
    private int[] m6360j(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        for (String str2 : split) {
            int m6362l = m6362l(str2.trim());
            if (m6362l != 0) {
                iArr[i11] = m6362l;
                i11++;
            }
        }
        if (i11 != split.length) {
            return Arrays.copyOf(iArr, i11);
        }
        return iArr;
    }

    /* renamed from: k */
    private int m6361k(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f5456r.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: l */
    private int m6362l(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i11 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m6381g = constraintLayout.m6381g(0, str);
            if (m6381g instanceof Integer) {
                i11 = ((Integer) m6381g).intValue();
            }
        }
        if (i11 == 0 && constraintLayout != null) {
            i11 = m6361k(constraintLayout, str);
        }
        if (i11 == 0) {
            try {
                i11 = AbstractC1297e.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i11 == 0) {
            return this.f5456r.getResources().getIdentifier(str, "id", this.f5456r.getPackageName());
        }
        return i11;
    }

    /* renamed from: g */
    public void m6363g() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            m6364h((ConstraintLayout) parent);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f5454p, this.f5455q);
    }

    /* renamed from: h */
    public void m6364h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i11 = 0; i11 < this.f5455q; i11++) {
            View m6382l = constraintLayout.m6382l(this.f5454p[i11]);
            if (m6382l != null) {
                m6382l.setVisibility(visibility);
                if (elevation > 0.0f) {
                    m6382l.setTranslationZ(m6382l.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo5941i(ConstraintLayout constraintLayout) {
    }

    /* renamed from: m */
    public View[] m6365m(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f5461w;
        if (viewArr == null || viewArr.length != this.f5455q) {
            this.f5461w = new View[this.f5455q];
        }
        for (int i11 = 0; i11 < this.f5455q; i11++) {
            this.f5461w[i11] = constraintLayout.m6382l(this.f5454p[i11]);
        }
        return this.f5461w;
    }

    /* renamed from: n */
    public void mo5935n(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f5459u = string;
                    setIds(string);
                } else if (index == AbstractC1298f.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f5460v = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f5459u;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f5460v;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f5458t) {
            super.onMeasure(i11, i12);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void mo5936p(C1295c.a aVar, C3191j c3191j, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        C1295c.b bVar = aVar.f5643e;
        int[] iArr = bVar.f5707k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f5709l0;
            if (str != null) {
                if (str.length() > 0) {
                    C1295c.b bVar2 = aVar.f5643e;
                    bVar2.f5707k0 = m6360j(this, bVar2.f5709l0);
                } else {
                    aVar.f5643e.f5707k0 = null;
                }
            }
        }
        if (c3191j != null) {
            c3191j.mo16237c();
            if (aVar.f5643e.f5707k0 != null) {
                int i11 = 0;
                while (true) {
                    int[] iArr2 = aVar.f5643e.f5707k0;
                    if (i11 < iArr2.length) {
                        C3186e c3186e = (C3186e) sparseArray.get(iArr2[i11]);
                        if (c3186e != null) {
                            c3191j.mo16235a(c3186e);
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void mo5937q(C3186e c3186e, boolean z11) {
    }

    /* renamed from: r */
    public void mo5942r(ConstraintLayout constraintLayout) {
    }

    /* renamed from: s */
    public void m6366s(ConstraintLayout constraintLayout) {
    }

    protected void setIds(String str) {
        this.f5459u = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f5455q = 0;
        while (true) {
            int indexOf = str.indexOf(44, i11);
            if (indexOf == -1) {
                m6357d(str.substring(i11));
                return;
            } else {
                m6357d(str.substring(i11, indexOf));
                i11 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f5460v = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f5455q = 0;
        while (true) {
            int indexOf = str.indexOf(44, i11);
            if (indexOf == -1) {
                m6359f(str.substring(i11));
                return;
            } else {
                m6359f(str.substring(i11, indexOf));
                i11 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f5459u = null;
        this.f5455q = 0;
        for (int i11 : iArr) {
            m6358e(i11);
        }
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        super.setTag(i11, obj);
        if (obj == null && this.f5459u == null) {
            m6358e(i11);
        }
    }

    /* renamed from: u */
    public void mo5943u(ConstraintLayout constraintLayout) {
    }

    /* renamed from: v */
    public void m6367v(ConstraintLayout constraintLayout) {
        String str;
        int m6361k;
        if (isInEditMode()) {
            setIds(this.f5459u);
        }
        InterfaceC3190i interfaceC3190i = this.f5457s;
        if (interfaceC3190i == null) {
            return;
        }
        interfaceC3190i.mo16237c();
        for (int i11 = 0; i11 < this.f5455q; i11++) {
            int i12 = this.f5454p[i11];
            View m6382l = constraintLayout.m6382l(i12);
            if (m6382l == null && (m6361k = m6361k(constraintLayout, (str = (String) this.f5462x.get(Integer.valueOf(i12))))) != 0) {
                this.f5454p[i11] = m6361k;
                this.f5462x.put(Integer.valueOf(m6361k), str);
                m6382l = constraintLayout.m6382l(m6361k);
            }
            if (m6382l != null) {
                this.f5457s.mo16235a(constraintLayout.m6383m(m6382l));
            }
        }
        this.f5457s.mo16236b(constraintLayout.f5478r);
    }

    /* renamed from: w */
    public void mo5948w(C3187f c3187f, InterfaceC3190i interfaceC3190i, SparseArray sparseArray) {
        interfaceC3190i.mo16237c();
        for (int i11 = 0; i11 < this.f5455q; i11++) {
            interfaceC3190i.mo16235a((C3186e) sparseArray.get(this.f5454p[i11]));
        }
    }

    /* renamed from: x */
    public void m6368x() {
        if (this.f5457s == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).f5556v0 = (C3186e) this.f5457s;
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5454p = new int[32];
        this.f5458t = false;
        this.f5461w = null;
        this.f5462x = new HashMap();
        this.f5456r = context;
        mo5935n(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5454p = new int[32];
        this.f5458t = false;
        this.f5461w = null;
        this.f5462x = new HashMap();
        this.f5456r = context;
        mo5935n(attributeSet);
    }
}
