package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19181d;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19184g;
import p175g0.AbstractC19185h;
import p175g0.AbstractC19187j;
import p310l0.InterfaceC21982c;
import p311l1.AbstractC21995a;

/* loaded from: classes2.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC21982c {

    /* renamed from: C0 */
    static final C1138n f4405C0;

    /* renamed from: A0 */
    private final AdapterView.OnItemSelectedListener f4406A0;

    /* renamed from: B0 */
    private TextWatcher f4407B0;

    /* renamed from: E */
    final SearchAutoComplete f4408E;

    /* renamed from: F */
    private final View f4409F;

    /* renamed from: G */
    private final View f4410G;

    /* renamed from: H */
    private final View f4411H;

    /* renamed from: I */
    final ImageView f4412I;

    /* renamed from: J */
    final ImageView f4413J;

    /* renamed from: K */
    final ImageView f4414K;

    /* renamed from: L */
    final ImageView f4415L;

    /* renamed from: M */
    private final View f4416M;

    /* renamed from: N */
    private C1139o f4417N;

    /* renamed from: O */
    private Rect f4418O;

    /* renamed from: P */
    private Rect f4419P;

    /* renamed from: Q */
    private int[] f4420Q;

    /* renamed from: R */
    private int[] f4421R;

    /* renamed from: S */
    private final ImageView f4422S;

    /* renamed from: T */
    private final Drawable f4423T;

    /* renamed from: U */
    private final int f4424U;

    /* renamed from: V */
    private final int f4425V;

    /* renamed from: W */
    private final Intent f4426W;

    /* renamed from: a0 */
    private final Intent f4427a0;

    /* renamed from: b0 */
    private final CharSequence f4428b0;

    /* renamed from: c0 */
    View.OnFocusChangeListener f4429c0;

    /* renamed from: d0 */
    private View.OnClickListener f4430d0;

    /* renamed from: e0 */
    private boolean f4431e0;

    /* renamed from: f0 */
    private boolean f4432f0;

    /* renamed from: g0 */
    AbstractC21995a f4433g0;

    /* renamed from: h0 */
    private boolean f4434h0;

    /* renamed from: i0 */
    private CharSequence f4435i0;

    /* renamed from: j0 */
    private boolean f4436j0;

    /* renamed from: k0 */
    private boolean f4437k0;

    /* renamed from: l0 */
    private int f4438l0;

    /* renamed from: m0 */
    private boolean f4439m0;

    /* renamed from: n0 */
    private CharSequence f4440n0;

    /* renamed from: o0 */
    private CharSequence f4441o0;

    /* renamed from: p0 */
    private boolean f4442p0;

    /* renamed from: q0 */
    private int f4443q0;

    /* renamed from: r0 */
    SearchableInfo f4444r0;

    /* renamed from: s0 */
    private Bundle f4445s0;

    /* renamed from: t0 */
    private final Runnable f4446t0;

    /* renamed from: u0 */
    private Runnable f4447u0;

    /* renamed from: v0 */
    private final WeakHashMap f4448v0;

    /* renamed from: w0 */
    private final View.OnClickListener f4449w0;

    /* renamed from: x0 */
    View.OnKeyListener f4450x0;

    /* renamed from: y0 */
    private final TextView.OnEditorActionListener f4451y0;

    /* renamed from: z0 */
    private final AdapterView.OnItemClickListener f4452z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1123a();

        /* renamed from: r */
        boolean f4453r;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        /* loaded from: classes2.dex */
        class C1123a implements Parcelable.ClassLoaderCreator {
            C1123a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f4453r + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeValue(Boolean.valueOf(this.f4453r));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4453r = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes2.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: s */
        private int f4454s;

        /* renamed from: t */
        private SearchView f4455t;

        /* renamed from: u */
        private boolean f4456u;

        /* renamed from: v */
        final Runnable f4457v;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes2.dex */
        class RunnableC1124a implements Runnable {
            RunnableC1124a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m5381c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC19178a.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i11 = configuration.screenWidthDp;
            int i12 = configuration.screenHeightDp;
            if (i11 >= 960 && i12 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i11 < 600) {
                if (i11 < 640 || i12 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        /* renamed from: a */
        void m5379a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f4405C0.m5385c(this);
        }

        /* renamed from: b */
        boolean m5380b() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        void m5381c() {
            if (this.f4456u) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f4456u = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            if (this.f4454s > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4456u) {
                removeCallbacks(this.f4457v);
                post(this.f4457v);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z11, int i11, Rect rect) {
            super.onFocusChanged(z11, i11, rect);
            this.f4455t.m5371b0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i11, KeyEvent keyEvent) {
            if (i11 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f4455t.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i11, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z11) {
            super.onWindowFocusChanged(z11);
            if (z11 && this.f4455t.hasFocus() && getVisibility() == 0) {
                this.f4456u = true;
                if (SearchView.m5345O(getContext())) {
                    m5379a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z11) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z11) {
                this.f4456u = false;
                removeCallbacks(this.f4457v);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f4456u = false;
                    removeCallbacks(this.f4457v);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f4456u = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f4455t = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i11) {
            super.setThreshold(i11);
            this.f4454s = i11;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.f4457v = new RunnableC1124a();
            this.f4454s = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes2.dex */
    class C1125a implements TextWatcher {
        C1125a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            SearchView.this.m5370a0(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes2.dex */
    class RunnableC1126b implements Runnable {
        RunnableC1126b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m5375h0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes2.dex */
    class RunnableC1127c implements Runnable {
        RunnableC1127c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC21995a abstractC21995a = SearchView.this.f4433g0;
            if (abstractC21995a instanceof ViewOnClickListenerC1196o1) {
                abstractC21995a.mo5668a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes2.dex */
    class ViewOnFocusChangeListenerC1128d implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC1128d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f4429c0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z11);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes2.dex */
    class ViewOnLayoutChangeListenerC1129e implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC1129e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            SearchView.this.m5358D();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes2.dex */
    class ViewOnClickListenerC1130f implements View.OnClickListener {
        ViewOnClickListenerC1130f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f4412I) {
                searchView.m5366X();
                return;
            }
            if (view == searchView.f4414K) {
                searchView.m5362T();
                return;
            }
            if (view == searchView.f4413J) {
                searchView.m5367Y();
            } else if (view == searchView.f4415L) {
                searchView.m5372c0();
            } else if (view == searchView.f4408E) {
                searchView.m5359J();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes2.dex */
    class ViewOnKeyListenerC1131g implements View.OnKeyListener {
        ViewOnKeyListenerC1131g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i11, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f4444r0 == null) {
                return false;
            }
            if (searchView.f4408E.isPopupShowing() && SearchView.this.f4408E.getListSelection() != -1) {
                return SearchView.this.m5368Z(view, i11, keyEvent);
            }
            if (SearchView.this.f4408E.m5380b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i11 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m5361R(0, null, searchView2.f4408E.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes2.dex */
    class C1132h implements TextView.OnEditorActionListener {
        C1132h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            SearchView.this.m5367Y();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes2.dex */
    class C1133i implements AdapterView.OnItemClickListener {
        C1133i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
            SearchView.this.m5363U(i11, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes2.dex */
    class C1134j implements AdapterView.OnItemSelectedListener {
        C1134j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i11, long j11) {
            SearchView.this.m5364V(i11);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes2.dex */
    public interface InterfaceC1135k {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes2.dex */
    public interface InterfaceC1136l {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes2.dex */
    public interface InterfaceC1137m {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes2.dex */
    public static class C1138n {

        /* renamed from: a */
        private Method f4469a;

        /* renamed from: b */
        private Method f4470b;

        /* renamed from: c */
        private Method f4471c;

        C1138n() {
            this.f4469a = null;
            this.f4470b = null;
            this.f4471c = null;
            m5382d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f4469a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f4470b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f4471c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m5382d() {
            if (Build.VERSION.SDK_INT < 29) {
            } else {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        void m5383a(AutoCompleteTextView autoCompleteTextView) {
            m5382d();
            Method method = this.f4470b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m5384b(AutoCompleteTextView autoCompleteTextView) {
            m5382d();
            Method method = this.f4469a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m5385c(AutoCompleteTextView autoCompleteTextView) {
            m5382d();
            Method method = this.f4471c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes2.dex */
    private static class C1139o extends TouchDelegate {

        /* renamed from: a */
        private final View f4472a;

        /* renamed from: b */
        private final Rect f4473b;

        /* renamed from: c */
        private final Rect f4474c;

        /* renamed from: d */
        private final Rect f4475d;

        /* renamed from: e */
        private final int f4476e;

        /* renamed from: f */
        private boolean f4477f;

        public C1139o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f4476e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f4473b = new Rect();
            this.f4475d = new Rect();
            this.f4474c = new Rect();
            m5386a(rect, rect2);
            this.f4472a = view;
        }

        /* renamed from: a */
        public void m5386a(Rect rect, Rect rect2) {
            this.f4473b.set(rect);
            this.f4475d.set(rect);
            Rect rect3 = this.f4475d;
            int i11 = this.f4476e;
            rect3.inset(-i11, -i11);
            this.f4474c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z11;
            boolean z12;
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z13 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z12 = this.f4477f;
                        this.f4477f = false;
                    }
                    z11 = true;
                    z13 = false;
                } else {
                    z12 = this.f4477f;
                    if (z12 && !this.f4475d.contains(x11, y11)) {
                        z13 = z12;
                        z11 = false;
                    }
                }
                z13 = z12;
                z11 = true;
            } else {
                if (this.f4473b.contains(x11, y11)) {
                    this.f4477f = true;
                    z11 = true;
                }
                z11 = true;
                z13 = false;
            }
            if (!z13) {
                return false;
            }
            if (z11 && !this.f4474c.contains(x11, y11)) {
                motionEvent.setLocation(this.f4472a.getWidth() / 2, this.f4472a.getHeight() / 2);
            } else {
                Rect rect = this.f4474c;
                motionEvent.setLocation(x11 - rect.left, y11 - rect.top);
            }
            return this.f4472a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        C1138n c1138n;
        if (Build.VERSION.SDK_INT < 29) {
            c1138n = new C1138n();
        } else {
            c1138n = null;
        }
        f4405C0 = c1138n;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: E */
    private Intent m5337E(String str, Uri uri, String str2, String str3, int i11, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f4441o0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f4445s0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i11 != 0) {
            intent.putExtra("action_key", i11);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f4444r0.getSearchActivity());
        return intent;
    }

    /* renamed from: F */
    private Intent m5338F(Cursor cursor, int i11, String str) {
        int i12;
        Uri parse;
        String m5659o;
        try {
            try {
                String m5659o2 = ViewOnClickListenerC1196o1.m5659o(cursor, "suggest_intent_action");
                if (m5659o2 == null) {
                    m5659o2 = this.f4444r0.getSuggestIntentAction();
                }
                if (m5659o2 == null) {
                    m5659o2 = "android.intent.action.SEARCH";
                }
                String str2 = m5659o2;
                String m5659o3 = ViewOnClickListenerC1196o1.m5659o(cursor, "suggest_intent_data");
                if (m5659o3 == null) {
                    m5659o3 = this.f4444r0.getSuggestIntentData();
                }
                if (m5659o3 != null && (m5659o = ViewOnClickListenerC1196o1.m5659o(cursor, "suggest_intent_data_id")) != null) {
                    m5659o3 = m5659o3 + "/" + Uri.encode(m5659o);
                }
                if (m5659o3 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(m5659o3);
                }
                return m5337E(str2, parse, ViewOnClickListenerC1196o1.m5659o(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC1196o1.m5659o(cursor, "suggest_intent_query"), i11, str);
            } catch (RuntimeException unused) {
                i12 = cursor.getPosition();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Search suggestions cursor at row ");
                sb2.append(i12);
                sb2.append(" returned exception.");
                return null;
            }
        } catch (RuntimeException unused2) {
            i12 = -1;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Search suggestions cursor at row ");
            sb22.append(i12);
            sb22.append(" returned exception.");
            return null;
        }
    }

    /* renamed from: G */
    private Intent m5339G(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i11;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4445s0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i11 = searchableInfo.getVoiceMaxResults();
        } else {
            i11 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i11);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: H */
    private Intent m5340H(Intent intent, SearchableInfo searchableInfo) {
        String flattenToShortString;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            flattenToShortString = null;
        } else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }

    /* renamed from: I */
    private void m5341I() {
        this.f4408E.dismissDropDown();
    }

    /* renamed from: K */
    private void m5342K(View view, Rect rect) {
        view.getLocationInWindow(this.f4420Q);
        getLocationInWindow(this.f4421R);
        int[] iArr = this.f4420Q;
        int i11 = iArr[1];
        int[] iArr2 = this.f4421R;
        int i12 = i11 - iArr2[1];
        int i13 = iArr[0] - iArr2[0];
        rect.set(i13, i12, view.getWidth() + i13, view.getHeight() + i12);
    }

    /* renamed from: L */
    private CharSequence m5343L(CharSequence charSequence) {
        if (this.f4431e0 && this.f4423T != null) {
            int textSize = (int) (this.f4408E.getTextSize() * 1.25d);
            this.f4423T.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f4423T), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    /* renamed from: M */
    private boolean m5344M() {
        Intent intent;
        SearchableInfo searchableInfo = this.f4444r0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f4444r0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f4426W;
        } else if (this.f4444r0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f4427a0;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    static boolean m5345O(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private boolean m5346P() {
        if ((this.f4434h0 || this.f4439m0) && !m5360N()) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    private void m5347Q(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed launch activity: ");
            sb2.append(intent);
        }
    }

    /* renamed from: S */
    private boolean m5348S(int i11, int i12, String str) {
        Cursor mo114869d = this.f4433g0.mo114869d();
        if (mo114869d != null && mo114869d.moveToPosition(i11)) {
            m5347Q(m5338F(mo114869d, i12, str));
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private void m5349d0() {
        post(this.f4446t0);
    }

    /* renamed from: e0 */
    private void m5350e0(int i11) {
        Editable text = this.f4408E.getText();
        Cursor mo114869d = this.f4433g0.mo114869d();
        if (mo114869d == null) {
            return;
        }
        if (mo114869d.moveToPosition(i11)) {
            CharSequence mo5669b = this.f4433g0.mo5669b(mo114869d);
            if (mo5669b != null) {
                setQuery(mo5669b);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    /* renamed from: g0 */
    private void m5351g0() {
        int[] iArr;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f4408E.getText());
        int i11 = 0;
        if (!z12 && (!this.f4431e0 || this.f4442p0)) {
            z11 = false;
        }
        ImageView imageView = this.f4414K;
        if (!z11) {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        Drawable drawable = this.f4414K.getDrawable();
        if (drawable != null) {
            if (z12) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC19181d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC19181d.abc_search_view_preferred_width);
    }

    /* renamed from: i0 */
    private void m5352i0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f4408E;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m5343L(queryHint));
    }

    /* renamed from: j0 */
    private void m5353j0() {
        this.f4408E.setThreshold(this.f4444r0.getSuggestThreshold());
        this.f4408E.setImeOptions(this.f4444r0.getImeOptions());
        int inputType = this.f4444r0.getInputType();
        int i11 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f4444r0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f4408E.setInputType(inputType);
        AbstractC21995a abstractC21995a = this.f4433g0;
        if (abstractC21995a != null) {
            abstractC21995a.mo5668a(null);
        }
        if (this.f4444r0.getSuggestAuthority() != null) {
            ViewOnClickListenerC1196o1 viewOnClickListenerC1196o1 = new ViewOnClickListenerC1196o1(getContext(), this, this.f4444r0, this.f4448v0);
            this.f4433g0 = viewOnClickListenerC1196o1;
            this.f4408E.setAdapter(viewOnClickListenerC1196o1);
            ViewOnClickListenerC1196o1 viewOnClickListenerC1196o12 = (ViewOnClickListenerC1196o1) this.f4433g0;
            if (this.f4436j0) {
                i11 = 2;
            }
            viewOnClickListenerC1196o12.m5675x(i11);
        }
    }

    /* renamed from: k0 */
    private void m5354k0() {
        int i11;
        if (m5346P() && (this.f4413J.getVisibility() == 0 || this.f4415L.getVisibility() == 0)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f4411H.setVisibility(i11);
    }

    /* renamed from: l0 */
    private void m5355l0(boolean z11) {
        int i11;
        if (this.f4434h0 && m5346P() && hasFocus() && (z11 || !this.f4439m0)) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f4413J.setVisibility(i11);
    }

    /* renamed from: m0 */
    private void m5356m0(boolean z11) {
        int i11;
        int i12;
        this.f4432f0 = z11;
        int i13 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f4408E.getText());
        this.f4412I.setVisibility(i11);
        m5355l0(!isEmpty);
        View view = this.f4409F;
        if (z11) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        view.setVisibility(i12);
        if (this.f4422S.getDrawable() != null && !this.f4431e0) {
            i13 = 0;
        }
        this.f4422S.setVisibility(i13);
        m5351g0();
        m5357n0(isEmpty);
        m5354k0();
    }

    /* renamed from: n0 */
    private void m5357n0(boolean z11) {
        int i11 = 8;
        if (this.f4439m0 && !m5360N() && z11) {
            this.f4413J.setVisibility(8);
            i11 = 0;
        }
        this.f4415L.setVisibility(i11);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        this.f4408E.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f4408E;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    /* renamed from: D */
    void m5358D() {
        int i11;
        int i12;
        if (this.f4416M.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f4410G.getPaddingLeft();
            Rect rect = new Rect();
            boolean m5459b = AbstractC1152a2.m5459b(this);
            if (this.f4431e0) {
                i11 = resources.getDimensionPixelSize(AbstractC19181d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(AbstractC19181d.abc_dropdownitem_text_padding_left);
            } else {
                i11 = 0;
            }
            this.f4408E.getDropDownBackground().getPadding(rect);
            if (m5459b) {
                i12 = -rect.left;
            } else {
                i12 = paddingLeft - (rect.left + i11);
            }
            this.f4408E.setDropDownHorizontalOffset(i12);
            this.f4408E.setDropDownWidth((((this.f4416M.getWidth() + rect.left) + rect.right) + i11) - paddingLeft);
        }
    }

    /* renamed from: J */
    void m5359J() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4408E.refreshAutoCompleteResults();
            return;
        }
        C1138n c1138n = f4405C0;
        c1138n.m5384b(this.f4408E);
        c1138n.m5383a(this.f4408E);
    }

    /* renamed from: N */
    public boolean m5360N() {
        return this.f4432f0;
    }

    /* renamed from: R */
    void m5361R(int i11, String str, String str2) {
        getContext().startActivity(m5337E("android.intent.action.SEARCH", null, null, str2, i11, str));
    }

    /* renamed from: T */
    void m5362T() {
        if (TextUtils.isEmpty(this.f4408E.getText())) {
            if (this.f4431e0) {
                clearFocus();
                m5356m0(true);
                return;
            }
            return;
        }
        this.f4408E.setText("");
        this.f4408E.requestFocus();
        this.f4408E.setImeVisibility(true);
    }

    /* renamed from: U */
    boolean m5363U(int i11, int i12, String str) {
        m5348S(i11, 0, null);
        this.f4408E.setImeVisibility(false);
        m5341I();
        return true;
    }

    /* renamed from: V */
    boolean m5364V(int i11) {
        m5350e0(i11);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m5365W(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: X */
    void m5366X() {
        m5356m0(false);
        this.f4408E.requestFocus();
        this.f4408E.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f4430d0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: Y */
    void m5367Y() {
        Editable text = this.f4408E.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f4444r0 != null) {
                m5361R(0, null, text.toString());
            }
            this.f4408E.setImeVisibility(false);
            m5341I();
        }
    }

    /* renamed from: Z */
    boolean m5368Z(View view, int i11, KeyEvent keyEvent) {
        int length;
        if (this.f4444r0 != null && this.f4433g0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i11 != 66 && i11 != 84 && i11 != 61) {
                if (i11 != 21 && i11 != 22) {
                    if (i11 == 19) {
                        this.f4408E.getListSelection();
                        return false;
                    }
                } else {
                    if (i11 == 21) {
                        length = 0;
                    } else {
                        length = this.f4408E.length();
                    }
                    this.f4408E.setSelection(length);
                    this.f4408E.setListSelection(0);
                    this.f4408E.clearListSelection();
                    this.f4408E.m5379a();
                    return true;
                }
            } else {
                return m5363U(this.f4408E.getListSelection(), 0, null);
            }
        }
        return false;
    }

    @Override // p310l0.InterfaceC21982c
    /* renamed from: a */
    public void mo5369a() {
        if (this.f4442p0) {
            return;
        }
        this.f4442p0 = true;
        int imeOptions = this.f4408E.getImeOptions();
        this.f4443q0 = imeOptions;
        this.f4408E.setImeOptions(imeOptions | 33554432);
        this.f4408E.setText("");
        setIconified(false);
    }

    /* renamed from: a0 */
    void m5370a0(CharSequence charSequence) {
        Editable text = this.f4408E.getText();
        this.f4441o0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        m5355l0(!isEmpty);
        m5357n0(isEmpty);
        m5351g0();
        m5354k0();
        this.f4440n0 = charSequence.toString();
    }

    /* renamed from: b0 */
    void m5371b0() {
        m5356m0(m5360N());
        m5349d0();
        if (this.f4408E.hasFocus()) {
            m5359J();
        }
    }

    /* renamed from: c0 */
    void m5372c0() {
        SearchableInfo searchableInfo = this.f4444r0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m5340H(this.f4426W, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m5339G(this.f4427a0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f4437k0 = true;
        super.clearFocus();
        this.f4408E.clearFocus();
        this.f4408E.setImeVisibility(false);
        this.f4437k0 = false;
    }

    @Override // p310l0.InterfaceC21982c
    /* renamed from: d */
    public void mo5373d() {
        m5374f0("", false);
        clearFocus();
        m5356m0(true);
        this.f4408E.setImeOptions(this.f4443q0);
        this.f4442p0 = false;
    }

    /* renamed from: f0 */
    public void m5374f0(CharSequence charSequence, boolean z11) {
        this.f4408E.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f4408E;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f4441o0 = charSequence;
        }
        if (z11 && !TextUtils.isEmpty(charSequence)) {
            m5367Y();
        }
    }

    public int getImeOptions() {
        return this.f4408E.getImeOptions();
    }

    public int getInputType() {
        return this.f4408E.getInputType();
    }

    public int getMaxWidth() {
        return this.f4438l0;
    }

    public CharSequence getQuery() {
        return this.f4408E.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f4435i0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f4444r0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f4444r0.getHintId());
            }
            return this.f4428b0;
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f4425V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f4424U;
    }

    public AbstractC21995a getSuggestionsAdapter() {
        return this.f4433g0;
    }

    /* renamed from: h0 */
    void m5375h0() {
        int[] iArr;
        if (this.f4408E.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f4410G.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f4411H.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f4446t0);
        post(this.f4447u0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            m5342K(this.f4408E, this.f4418O);
            Rect rect = this.f4419P;
            Rect rect2 = this.f4418O;
            rect.set(rect2.left, 0, rect2.right, i14 - i12);
            C1139o c1139o = this.f4417N;
            if (c1139o == null) {
                C1139o c1139o2 = new C1139o(this.f4419P, this.f4418O, this.f4408E);
                this.f4417N = c1139o2;
                setTouchDelegate(c1139o2);
                return;
            }
            c1139o.m5386a(this.f4419P, this.f4418O);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        if (m5360N()) {
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i13 = this.f4438l0) > 0) {
                    size = Math.min(i13, size);
                }
            } else {
                size = this.f4438l0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i14 = this.f4438l0;
            size = i14 > 0 ? Math.min(i14, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        m5356m0(savedState.f4453r);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4453r = m5360N();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        m5349d0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i11, Rect rect) {
        if (this.f4437k0 || !isFocusable()) {
            return false;
        }
        if (!m5360N()) {
            boolean requestFocus = this.f4408E.requestFocus(i11, rect);
            if (requestFocus) {
                m5356m0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i11, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f4445s0 = bundle;
    }

    public void setIconified(boolean z11) {
        if (z11) {
            m5362T();
        } else {
            m5366X();
        }
    }

    public void setIconifiedByDefault(boolean z11) {
        if (this.f4431e0 == z11) {
            return;
        }
        this.f4431e0 = z11;
        m5356m0(z11);
        m5352i0();
    }

    public void setImeOptions(int i11) {
        this.f4408E.setImeOptions(i11);
    }

    public void setInputType(int i11) {
        this.f4408E.setInputType(i11);
    }

    public void setMaxWidth(int i11) {
        this.f4438l0 = i11;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC1135k interfaceC1135k) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4429c0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC1136l interfaceC1136l) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f4430d0 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC1137m interfaceC1137m) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f4435i0 = charSequence;
        m5352i0();
    }

    public void setQueryRefinementEnabled(boolean z11) {
        int i11;
        this.f4436j0 = z11;
        AbstractC21995a abstractC21995a = this.f4433g0;
        if (abstractC21995a instanceof ViewOnClickListenerC1196o1) {
            ViewOnClickListenerC1196o1 viewOnClickListenerC1196o1 = (ViewOnClickListenerC1196o1) abstractC21995a;
            if (z11) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            viewOnClickListenerC1196o1.m5675x(i11);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f4444r0 = searchableInfo;
        if (searchableInfo != null) {
            m5353j0();
            m5352i0();
        }
        boolean m5344M = m5344M();
        this.f4439m0 = m5344M;
        if (m5344M) {
            this.f4408E.setPrivateImeOptions("nm");
        }
        m5356m0(m5360N());
    }

    public void setSubmitButtonEnabled(boolean z11) {
        this.f4434h0 = z11;
        m5356m0(m5360N());
    }

    public void setSuggestionsAdapter(AbstractC21995a abstractC21995a) {
        this.f4433g0 = abstractC21995a;
        this.f4408E.setAdapter(abstractC21995a);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4418O = new Rect();
        this.f4419P = new Rect();
        this.f4420Q = new int[2];
        this.f4421R = new int[2];
        this.f4446t0 = new RunnableC1126b();
        this.f4447u0 = new RunnableC1127c();
        this.f4448v0 = new WeakHashMap();
        ViewOnClickListenerC1130f viewOnClickListenerC1130f = new ViewOnClickListenerC1130f();
        this.f4449w0 = viewOnClickListenerC1130f;
        this.f4450x0 = new ViewOnKeyListenerC1131g();
        C1132h c1132h = new C1132h();
        this.f4451y0 = c1132h;
        C1133i c1133i = new C1133i();
        this.f4452z0 = c1133i;
        C1134j c1134j = new C1134j();
        this.f4406A0 = c1134j;
        this.f4407B0 = new C1125a();
        C1211t1 m5716v = C1211t1.m5716v(context, attributeSet, AbstractC19187j.SearchView, i11, 0);
        LayoutInflater.from(context).inflate(m5716v.m5730n(AbstractC19187j.SearchView_layout, AbstractC19184g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC19183f.search_src_text);
        this.f4408E = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f4409F = findViewById(AbstractC19183f.search_edit_frame);
        View findViewById = findViewById(AbstractC19183f.search_plate);
        this.f4410G = findViewById;
        View findViewById2 = findViewById(AbstractC19183f.submit_area);
        this.f4411H = findViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC19183f.search_button);
        this.f4412I = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC19183f.search_go_btn);
        this.f4413J = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC19183f.search_close_btn);
        this.f4414K = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC19183f.search_voice_btn);
        this.f4415L = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC19183f.search_mag_icon);
        this.f4422S = imageView5;
        AbstractC1579n0.m7807D0(findViewById, m5716v.m5723g(AbstractC19187j.SearchView_queryBackground));
        AbstractC1579n0.m7807D0(findViewById2, m5716v.m5723g(AbstractC19187j.SearchView_submitBackground));
        imageView.setImageDrawable(m5716v.m5723g(AbstractC19187j.SearchView_searchIcon));
        imageView2.setImageDrawable(m5716v.m5723g(AbstractC19187j.SearchView_goIcon));
        imageView3.setImageDrawable(m5716v.m5723g(AbstractC19187j.SearchView_closeIcon));
        imageView4.setImageDrawable(m5716v.m5723g(AbstractC19187j.SearchView_voiceIcon));
        imageView5.setImageDrawable(m5716v.m5723g(AbstractC19187j.SearchView_searchIcon));
        this.f4423T = m5716v.m5723g(AbstractC19187j.SearchView_searchHintIcon);
        AbstractC1220w1.m5757a(imageView, getResources().getString(AbstractC19185h.abc_searchview_description_search));
        this.f4424U = m5716v.m5730n(AbstractC19187j.SearchView_suggestionRowLayout, AbstractC19184g.abc_search_dropdown_item_icons_2line);
        this.f4425V = m5716v.m5730n(AbstractC19187j.SearchView_commitIcon, 0);
        imageView.setOnClickListener(viewOnClickListenerC1130f);
        imageView3.setOnClickListener(viewOnClickListenerC1130f);
        imageView2.setOnClickListener(viewOnClickListenerC1130f);
        imageView4.setOnClickListener(viewOnClickListenerC1130f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC1130f);
        searchAutoComplete.addTextChangedListener(this.f4407B0);
        searchAutoComplete.setOnEditorActionListener(c1132h);
        searchAutoComplete.setOnItemClickListener(c1133i);
        searchAutoComplete.setOnItemSelectedListener(c1134j);
        searchAutoComplete.setOnKeyListener(this.f4450x0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1128d());
        setIconifiedByDefault(m5716v.m5717a(AbstractC19187j.SearchView_iconifiedByDefault, true));
        int m5722f = m5716v.m5722f(AbstractC19187j.SearchView_android_maxWidth, -1);
        if (m5722f != -1) {
            setMaxWidth(m5722f);
        }
        this.f4428b0 = m5716v.m5732p(AbstractC19187j.SearchView_defaultQueryHint);
        this.f4435i0 = m5716v.m5732p(AbstractC19187j.SearchView_queryHint);
        int m5727k = m5716v.m5727k(AbstractC19187j.SearchView_android_imeOptions, -1);
        if (m5727k != -1) {
            setImeOptions(m5727k);
        }
        int m5727k2 = m5716v.m5727k(AbstractC19187j.SearchView_android_inputType, -1);
        if (m5727k2 != -1) {
            setInputType(m5727k2);
        }
        setFocusable(m5716v.m5717a(AbstractC19187j.SearchView_android_focusable, true));
        m5716v.m5736w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4426W = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4427a0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f4416M = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1129e());
        }
        m5356m0(this.f4431e0);
        m5352i0();
    }
}
