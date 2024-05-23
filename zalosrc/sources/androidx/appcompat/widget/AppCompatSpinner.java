package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC1051a;
import androidx.core.view.AbstractC1579n0;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19184g;
import p175g0.AbstractC19187j;
import p193h0.AbstractC19694b;
import p310l0.C21983d;
import p336m0.InterfaceC22701e;

/* loaded from: classes2.dex */
public class AppCompatSpinner extends Spinner {

    /* renamed from: x */
    private static final int[] f4277x = {R.attr.spinnerMode};

    /* renamed from: p */
    private final C1161d f4278p;

    /* renamed from: q */
    private final Context f4279q;

    /* renamed from: r */
    private AbstractViewOnTouchListenerC1155b1 f4280r;

    /* renamed from: s */
    private SpinnerAdapter f4281s;

    /* renamed from: t */
    private final boolean f4282t;

    /* renamed from: u */
    private InterfaceC1110f f4283u;

    /* renamed from: v */
    int f4284v;

    /* renamed from: w */
    final Rect f4285w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1104a();

        /* renamed from: p */
        boolean f4286p;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        /* loaded from: classes2.dex */
        class C1104a implements Parcelable.Creator {
            C1104a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeByte(this.f4286p ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4286p = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    /* loaded from: classes2.dex */
    class C1105a extends AbstractViewOnTouchListenerC1155b1 {

        /* renamed from: y */
        final /* synthetic */ C1109e f4287y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1105a(View view, C1109e c1109e) {
            super(view);
            this.f4287y = c1109e;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
        /* renamed from: b */
        public InterfaceC22701e mo4976b() {
            return this.f4287y;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC1155b1
        /* renamed from: c */
        public boolean mo4977c() {
            if (!AppCompatSpinner.this.getInternalPopup().mo5251b()) {
                AppCompatSpinner.this.m5248b();
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    /* loaded from: classes2.dex */
    class ViewTreeObserverOnGlobalLayoutListenerC1106b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC1106b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo5251b()) {
                AppCompatSpinner.this.m5248b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    /* loaded from: classes2.dex */
    class DialogInterfaceOnClickListenerC1107c implements InterfaceC1110f, DialogInterface.OnClickListener {

        /* renamed from: p */
        DialogInterfaceC1051a f4290p;

        /* renamed from: q */
        private ListAdapter f4291q;

        /* renamed from: r */
        private CharSequence f4292r;

        DialogInterfaceOnClickListenerC1107c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: b */
        public boolean mo5251b() {
            DialogInterfaceC1051a dialogInterfaceC1051a = this.f4290p;
            if (dialogInterfaceC1051a != null) {
                return dialogInterfaceC1051a.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: c */
        public void mo5252c(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: d */
        public int mo5253d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        public void dismiss() {
            DialogInterfaceC1051a dialogInterfaceC1051a = this.f4290p;
            if (dialogInterfaceC1051a != null) {
                dialogInterfaceC1051a.dismiss();
                this.f4290p = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: f */
        public void mo5254f(int i11) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: g */
        public CharSequence mo5255g() {
            return this.f4292r;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: h */
        public Drawable mo5256h() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: i */
        public void mo5257i(CharSequence charSequence) {
            this.f4292r = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: j */
        public void mo5258j(int i11) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: k */
        public void mo5259k(int i11) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: l */
        public void mo5260l(int i11, int i12) {
            if (this.f4291q == null) {
                return;
            }
            DialogInterfaceC1051a.a aVar = new DialogInterfaceC1051a.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f4292r;
            if (charSequence != null) {
                aVar.m4876h(charSequence);
            }
            DialogInterfaceC1051a m4869a = aVar.m4875g(this.f4291q, AppCompatSpinner.this.getSelectedItemPosition(), this).m4869a();
            this.f4290p = m4869a;
            ListView m4868e = m4869a.m4868e();
            m4868e.setTextDirection(i11);
            m4868e.setTextAlignment(i12);
            this.f4290p.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: m */
        public int mo5261m() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: n */
        public void mo5262n(ListAdapter listAdapter) {
            this.f4291q = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            AppCompatSpinner.this.setSelection(i11);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i11, this.f4291q.getItemId(i11));
            }
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    /* loaded from: classes2.dex */
    public static class C1108d implements ListAdapter, SpinnerAdapter {

        /* renamed from: p */
        private SpinnerAdapter f4294p;

        /* renamed from: q */
        private ListAdapter f4295q;

        public C1108d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            Resources.Theme dropDownViewTheme;
            this.f4294p = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f4295q = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && AbstractC1182k.m5605a(spinnerAdapter)) {
                ThemedSpinnerAdapter m5607a = AbstractC1185l.m5607a(spinnerAdapter);
                dropDownViewTheme = m5607a.getDropDownViewTheme();
                if (dropDownViewTheme != theme) {
                    m5607a.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f4295q;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f4294p;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f4294p;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i11, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i11) {
            SpinnerAdapter spinnerAdapter = this.f4294p;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i11);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            SpinnerAdapter spinnerAdapter = this.f4294p;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i11);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i11) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            return getDropDownView(i11, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f4294p;
            if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
                return true;
            }
            return false;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i11) {
            ListAdapter listAdapter = this.f4295q;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i11);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f4294p;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f4294p;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    /* loaded from: classes2.dex */
    class C1109e extends ListPopupWindow implements InterfaceC1110f {

        /* renamed from: Y */
        private CharSequence f4296Y;

        /* renamed from: Z */
        ListAdapter f4297Z;

        /* renamed from: a0 */
        private final Rect f4298a0;

        /* renamed from: b0 */
        private int f4299b0;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        /* loaded from: classes2.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: p */
            final /* synthetic */ AppCompatSpinner f4301p;

            a(AppCompatSpinner appCompatSpinner) {
                this.f4301p = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                AppCompatSpinner.this.setSelection(i11);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C1109e c1109e = C1109e.this;
                    AppCompatSpinner.this.performItemClick(view, i11, c1109e.f4297Z.getItemId(i11));
                }
                C1109e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        /* loaded from: classes2.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C1109e c1109e = C1109e.this;
                if (!c1109e.m5266U(AppCompatSpinner.this)) {
                    C1109e.this.dismiss();
                } else {
                    C1109e.this.m5264S();
                    C1109e.super.mo5011a();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        /* loaded from: classes2.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: p */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f4304p;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f4304p = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f4304p);
                }
            }
        }

        public C1109e(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.f4298a0 = new Rect();
            m5295D(AppCompatSpinner.this);
            m5301J(true);
            m5305O(0);
            m5303L(new a(AppCompatSpinner.this));
        }

        /* renamed from: S */
        void m5264S() {
            int i11;
            int m5265T;
            Drawable m5311h = m5311h();
            if (m5311h != null) {
                m5311h.getPadding(AppCompatSpinner.this.f4285w);
                if (AbstractC1152a2.m5459b(AppCompatSpinner.this)) {
                    i11 = AppCompatSpinner.this.f4285w.right;
                } else {
                    i11 = -AppCompatSpinner.this.f4285w.left;
                }
            } else {
                Rect rect = AppCompatSpinner.this.f4285w;
                rect.right = 0;
                rect.left = 0;
                i11 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i12 = appCompatSpinner.f4284v;
            if (i12 == -2) {
                int m5247a = appCompatSpinner.m5247a((SpinnerAdapter) this.f4297Z, m5311h());
                int i13 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f4285w;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (m5247a > i14) {
                    m5247a = i14;
                }
                m5297F(Math.max(m5247a, (width - paddingLeft) - paddingRight));
            } else if (i12 == -1) {
                m5297F((width - paddingLeft) - paddingRight);
            } else {
                m5297F(i12);
            }
            if (AbstractC1152a2.m5459b(AppCompatSpinner.this)) {
                m5265T = i11 + (((width - paddingRight) - m5321z()) - m5265T());
            } else {
                m5265T = i11 + paddingLeft + m5265T();
            }
            m5310f(m5265T);
        }

        /* renamed from: T */
        public int m5265T() {
            return this.f4299b0;
        }

        /* renamed from: U */
        boolean m5266U(View view) {
            if (AbstractC1579n0.m7862d0(view) && view.getGlobalVisibleRect(this.f4298a0)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: g */
        public CharSequence mo5255g() {
            return this.f4296Y;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: i */
        public void mo5257i(CharSequence charSequence) {
            this.f4296Y = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: k */
        public void mo5259k(int i11) {
            this.f4299b0 = i11;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: l */
        public void mo5260l(int i11, int i12) {
            ViewTreeObserver viewTreeObserver;
            boolean mo5012b = mo5012b();
            m5264S();
            m5300I(2);
            super.mo5011a();
            ListView mo5018p = mo5018p();
            mo5018p.setChoiceMode(1);
            mo5018p.setTextDirection(i11);
            mo5018p.setTextAlignment(i12);
            m5306P(AppCompatSpinner.this.getSelectedItemPosition());
            if (!mo5012b && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                m5302K(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.InterfaceC1110f
        /* renamed from: n */
        public void mo5262n(ListAdapter listAdapter) {
            super.mo5262n(listAdapter);
            this.f4297Z = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC1110f {
        /* renamed from: b */
        boolean mo5251b();

        /* renamed from: c */
        void mo5252c(Drawable drawable);

        /* renamed from: d */
        int mo5253d();

        void dismiss();

        /* renamed from: f */
        void mo5254f(int i11);

        /* renamed from: g */
        CharSequence mo5255g();

        /* renamed from: h */
        Drawable mo5256h();

        /* renamed from: i */
        void mo5257i(CharSequence charSequence);

        /* renamed from: j */
        void mo5258j(int i11);

        /* renamed from: k */
        void mo5259k(int i11);

        /* renamed from: l */
        void mo5260l(int i11, int i12);

        /* renamed from: m */
        int mo5261m();

        /* renamed from: n */
        void mo5262n(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.spinnerStyle);
    }

    /* renamed from: a */
    int m5247a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i11 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i12 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = Math.max(i12, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f4285w);
            Rect rect = this.f4285w;
            return i12 + rect.left + rect.right;
        }
        return i12;
    }

    /* renamed from: b */
    void m5248b() {
        this.f4283u.mo5260l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1161d c1161d = this.f4278p;
        if (c1161d != null) {
            c1161d.m5506b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null) {
            return interfaceC1110f.mo5253d();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null) {
            return interfaceC1110f.mo5261m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f4283u != null) {
            return this.f4284v;
        }
        return super.getDropDownWidth();
    }

    final InterfaceC1110f getInternalPopup() {
        return this.f4283u;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null) {
            return interfaceC1110f.mo5256h();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4279q;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null) {
            return interfaceC1110f.mo5255g();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1161d c1161d = this.f4278p;
        if (c1161d != null) {
            return c1161d.m5507c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1161d c1161d = this.f4278p;
        if (c1161d != null) {
            return c1161d.m5508d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null && interfaceC1110f.mo5251b()) {
            this.f4283u.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f4283u != null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m5247a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f4286p && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1106b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z11;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null && interfaceC1110f.mo5251b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        savedState.f4286p = z11;
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC1155b1 abstractViewOnTouchListenerC1155b1 = this.f4280r;
        if (abstractViewOnTouchListenerC1155b1 != null && abstractViewOnTouchListenerC1155b1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null) {
            if (!interfaceC1110f.mo5251b()) {
                m5248b();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1161d c1161d = this.f4278p;
        if (c1161d != null) {
            c1161d.m5510f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C1161d c1161d = this.f4278p;
        if (c1161d != null) {
            c1161d.m5511g(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i11) {
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null) {
            interfaceC1110f.mo5259k(i11);
            this.f4283u.mo5254f(i11);
        } else {
            super.setDropDownHorizontalOffset(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i11) {
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null) {
            interfaceC1110f.mo5258j(i11);
        } else {
            super.setDropDownVerticalOffset(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i11) {
        if (this.f4283u != null) {
            this.f4284v = i11;
        } else {
            super.setDropDownWidth(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null) {
            interfaceC1110f.mo5252c(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i11) {
        setPopupBackgroundDrawable(AbstractC19694b.m103336d(getPopupContext(), i11));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1110f interfaceC1110f = this.f4283u;
        if (interfaceC1110f != null) {
            interfaceC1110f.mo5257i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1161d c1161d = this.f4278p;
        if (c1161d != null) {
            c1161d.m5513i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1161d c1161d = this.f4278p;
        if (c1161d != null) {
            c1161d.m5514j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4282t) {
            this.f4281s = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f4283u != null) {
            Context context = this.f4279q;
            if (context == null) {
                context = getContext();
            }
            this.f4283u.mo5262n(new C1108d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, attributeSet, i11, i12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:            if (r10 == null) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i11, int i12, Resources.Theme theme) {
        super(context, attributeSet, i11);
        TypedArray typedArray;
        this.f4285w = new Rect();
        AbstractC1199p1.m5678a(this, getContext());
        C1211t1 m5716v = C1211t1.m5716v(context, attributeSet, AbstractC19187j.Spinner, i11, 0);
        this.f4278p = new C1161d(this);
        if (theme != null) {
            this.f4279q = new C21983d(context, theme);
        } else {
            int m5730n = m5716v.m5730n(AbstractC19187j.Spinner_popupTheme, 0);
            if (m5730n != 0) {
                this.f4279q = new C21983d(context, m5730n);
            } else {
                this.f4279q = context;
            }
        }
        TypedArray typedArray2 = null;
        if (i12 == -1) {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, f4277x, i11, 0);
            } catch (Exception unused) {
                typedArray = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (typedArray.hasValue(0)) {
                    i12 = typedArray.getInt(0, 0);
                }
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
                typedArray2 = typedArray;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
            typedArray.recycle();
        }
        if (i12 == 0) {
            DialogInterfaceOnClickListenerC1107c dialogInterfaceOnClickListenerC1107c = new DialogInterfaceOnClickListenerC1107c();
            this.f4283u = dialogInterfaceOnClickListenerC1107c;
            dialogInterfaceOnClickListenerC1107c.mo5257i(m5716v.m5731o(AbstractC19187j.Spinner_android_prompt));
        } else if (i12 == 1) {
            C1109e c1109e = new C1109e(this.f4279q, attributeSet, i11);
            C1211t1 m5716v2 = C1211t1.m5716v(this.f4279q, attributeSet, AbstractC19187j.Spinner, i11, 0);
            this.f4284v = m5716v2.m5729m(AbstractC19187j.Spinner_android_dropDownWidth, -2);
            c1109e.m5308c(m5716v2.m5723g(AbstractC19187j.Spinner_android_popupBackground));
            c1109e.mo5257i(m5716v.m5731o(AbstractC19187j.Spinner_android_prompt));
            m5716v2.m5736w();
            this.f4283u = c1109e;
            this.f4280r = new C1105a(this, c1109e);
        }
        CharSequence[] m5733q = m5716v.m5733q(AbstractC19187j.Spinner_android_entries);
        if (m5733q != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, m5733q);
            arrayAdapter.setDropDownViewResource(AbstractC19184g.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        m5716v.m5736w();
        this.f4282t = true;
        SpinnerAdapter spinnerAdapter = this.f4281s;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f4281s = null;
        }
        this.f4278p.m5509e(attributeSet, i11);
    }
}
