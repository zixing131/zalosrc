package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.internal.AbstractC6337d;
import com.google.android.material.internal.AbstractC6355v;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: s */
    private final ListPopupWindow f35972s;

    /* renamed from: t */
    private final AccessibilityManager f35973t;

    /* renamed from: u */
    private final Rect f35974u;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    /* loaded from: classes3.dex */
    class C6419a implements AdapterView.OnItemClickListener {
        C6419a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
            Object item;
            if (i11 < 0) {
                item = MaterialAutoCompleteTextView.this.f35972s.m5317v();
            } else {
                item = MaterialAutoCompleteTextView.this.getAdapter().getItem(i11);
            }
            MaterialAutoCompleteTextView.this.m33048e(item);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i11 < 0) {
                    view = MaterialAutoCompleteTextView.this.f35972s.m5320y();
                    i11 = MaterialAutoCompleteTextView.this.f35972s.m5319x();
                    j11 = MaterialAutoCompleteTextView.this.f35972s.m5318w();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f35972s.mo5018p(), view, i11, j11);
            }
            MaterialAutoCompleteTextView.this.f35972s.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.autoCompleteTextViewStyle);
    }

    /* renamed from: c */
    private TextInputLayout m33046c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m33047d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m33046c = m33046c();
        int i11 = 0;
        if (adapter == null || m33046c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f35972s.m5319x()) + 15);
        View view = null;
        int i12 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(max, view, m33046c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = Math.max(i12, view.getMeasuredWidth());
        }
        Drawable m5311h = this.f35972s.m5311h();
        if (m5311h != null) {
            m5311h.getPadding(this.f35974u);
            Rect rect = this.f35974u;
            i12 += rect.left + rect.right;
        }
        return i12 + m33046c.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m33048e(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m33046c = m33046c();
        if (m33046c != null && m33046c.m33122Q()) {
            return m33046c.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m33046c = m33046c();
        if (m33046c != null && m33046c.m33122Q() && super.getHint() == null && AbstractC6337d.m32558a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m33047d()), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t7) {
        super.setAdapter(t7);
        this.f35972s.mo5262n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f35973t;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f35972s.mo5011a();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, 0), attributeSet, i11);
        this.f35974u = new Rect();
        Context context2 = getContext();
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.MaterialAutoCompleteTextView, i11, AbstractC23586k.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (m32639h.hasValue(AbstractC23587l.MaterialAutoCompleteTextView_android_inputType) && m32639h.getInt(AbstractC23587l.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f35973t = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f35972s = listPopupWindow;
        listPopupWindow.m5301J(true);
        listPopupWindow.m5295D(this);
        listPopupWindow.m5300I(2);
        listPopupWindow.mo5262n(getAdapter());
        listPopupWindow.m5303L(new C6419a());
        m32639h.recycle();
    }
}
