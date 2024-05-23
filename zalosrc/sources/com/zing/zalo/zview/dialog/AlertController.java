package com.zing.zalo.zview.dialog;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import com.zing.zalo.zview.AbstractC17450b;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17468f;
import com.zing.zalo.zview.AbstractC17470g;
import com.zing.zalo.zview.AbstractC17472h;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import java.lang.ref.WeakReference;
import p175g0.AbstractC19187j;
import zl0.AbstractC32232i;

/* loaded from: classes7.dex */
public class AlertController {

    /* renamed from: A */
    TextView f88897A;

    /* renamed from: B */
    protected TextView f88898B;

    /* renamed from: C */
    View f88899C;

    /* renamed from: D */
    boolean f88900D;

    /* renamed from: E */
    ListAdapter f88901E;

    /* renamed from: G */
    int f88903G;

    /* renamed from: H */
    int f88904H;

    /* renamed from: I */
    int f88905I;

    /* renamed from: J */
    int f88906J;

    /* renamed from: K */
    int f88907K;

    /* renamed from: L */
    int f88908L;

    /* renamed from: M */
    boolean f88909M;

    /* renamed from: O */
    Handler f88911O;

    /* renamed from: a */
    final Context f88913a;

    /* renamed from: b */
    final InterfaceC17463d f88914b;

    /* renamed from: c */
    protected final C17465f f88915c;

    /* renamed from: d */
    CharSequence f88916d;

    /* renamed from: e */
    protected CharSequence f88917e;

    /* renamed from: f */
    protected ListView f88918f;

    /* renamed from: g */
    View f88919g;

    /* renamed from: h */
    int f88920h;

    /* renamed from: i */
    int f88921i;

    /* renamed from: j */
    int f88922j;

    /* renamed from: k */
    int f88923k;

    /* renamed from: l */
    int f88924l;

    /* renamed from: n */
    Button f88926n;

    /* renamed from: o */
    CharSequence f88927o;

    /* renamed from: p */
    Message f88928p;

    /* renamed from: q */
    Button f88929q;

    /* renamed from: r */
    CharSequence f88930r;

    /* renamed from: s */
    Message f88931s;

    /* renamed from: t */
    Button f88932t;

    /* renamed from: u */
    CharSequence f88933u;

    /* renamed from: v */
    Message f88934v;

    /* renamed from: w */
    protected ScrollView f88935w;

    /* renamed from: y */
    Drawable f88937y;

    /* renamed from: z */
    ImageView f88938z;

    /* renamed from: m */
    boolean f88925m = false;

    /* renamed from: x */
    int f88936x = 0;

    /* renamed from: F */
    int f88902F = -1;

    /* renamed from: N */
    int f88910N = 0;

    /* renamed from: P */
    final View.OnClickListener f88912P = new ViewOnClickListenerC17456a();

    /* loaded from: classes7.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: p */
        final int f88939p;

        /* renamed from: q */
        final int f88940q;

        /* renamed from: r */
        boolean f88941r;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f88941r = true;
            this.f88940q = -1;
            this.f88939p = -1;
        }

        /* renamed from: a */
        public void m92822a(boolean z11, boolean z12) {
            int i11;
            int i12;
            if (!z12 || !z11) {
                int paddingLeft = getPaddingLeft();
                if (z11) {
                    i11 = getPaddingTop();
                } else {
                    i11 = this.f88939p;
                }
                int paddingRight = getPaddingRight();
                if (z12) {
                    i12 = getPaddingBottom();
                } else {
                    i12 = this.f88940q;
                }
                setPadding(paddingLeft, i11, paddingRight, i12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.dialog.AlertController$a */
    /* loaded from: classes7.dex */
    public class ViewOnClickListenerC17456a implements View.OnClickListener {
        ViewOnClickListenerC17456a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f88926n && (message4 = alertController.f88928p) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f88929q && (message3 = alertController.f88931s) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f88932t && (message2 = alertController.f88934v) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f88911O.obtainMessage(1, alertController2.f88914b).sendToTarget();
        }
    }

    /* renamed from: com.zing.zalo.zview.dialog.AlertController$b */
    /* loaded from: classes7.dex */
    public static class C17457b {

        /* renamed from: A */
        public int f88943A;

        /* renamed from: C */
        public boolean[] f88945C;

        /* renamed from: D */
        public boolean f88946D;

        /* renamed from: E */
        public boolean f88947E;

        /* renamed from: G */
        public Cursor f88949G;

        /* renamed from: H */
        public String f88950H;

        /* renamed from: I */
        public String f88951I;

        /* renamed from: J */
        public boolean f88952J;

        /* renamed from: K */
        public AdapterView.OnItemSelectedListener f88953K;

        /* renamed from: a */
        public final Context f88955a;

        /* renamed from: b */
        public final LayoutInflater f88956b;

        /* renamed from: d */
        public Drawable f88958d;

        /* renamed from: f */
        public CharSequence f88960f;

        /* renamed from: g */
        public View f88961g;

        /* renamed from: h */
        public CharSequence f88962h;

        /* renamed from: i */
        public CharSequence f88963i;

        /* renamed from: j */
        public InterfaceC17463d.d f88964j;

        /* renamed from: k */
        public CharSequence f88965k;

        /* renamed from: l */
        public InterfaceC17463d.d f88966l;

        /* renamed from: m */
        public CharSequence f88967m;

        /* renamed from: n */
        public InterfaceC17463d.d f88968n;

        /* renamed from: p */
        public InterfaceC17463d.c f88970p;

        /* renamed from: q */
        public InterfaceC17463d.e f88971q;

        /* renamed from: r */
        public InterfaceC17463d.f f88972r;

        /* renamed from: s */
        public CharSequence[] f88973s;

        /* renamed from: t */
        public ListAdapter f88974t;

        /* renamed from: u */
        public InterfaceC17463d.d f88975u;

        /* renamed from: v */
        public int f88976v;

        /* renamed from: w */
        public View f88977w;

        /* renamed from: x */
        public int f88978x;

        /* renamed from: y */
        public int f88979y;

        /* renamed from: z */
        public int f88980z;

        /* renamed from: c */
        public int f88957c = 0;

        /* renamed from: e */
        public int f88959e = 0;

        /* renamed from: B */
        public boolean f88944B = false;

        /* renamed from: F */
        public int f88948F = -1;

        /* renamed from: L */
        public boolean f88954L = true;

        /* renamed from: o */
        public boolean f88969o = true;

        /* renamed from: com.zing.zalo.zview.dialog.AlertController$b$a */
        /* loaded from: classes7.dex */
        public class a extends ArrayAdapter {

            /* renamed from: p */
            final /* synthetic */ ListView f88981p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i11, int i12, CharSequence[] charSequenceArr, ListView listView) {
                super(context, i11, i12, charSequenceArr);
                this.f88981p = listView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i11, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i11, view, viewGroup);
                boolean[] zArr = C17457b.this.f88945C;
                if (zArr != null && zArr[i11]) {
                    this.f88981p.setItemChecked(i11, true);
                }
                return view2;
            }
        }

        /* renamed from: com.zing.zalo.zview.dialog.AlertController$b$b */
        /* loaded from: classes7.dex */
        public class b extends CursorAdapter {

            /* renamed from: p */
            final int f88983p;

            /* renamed from: q */
            final int f88984q;

            /* renamed from: r */
            final /* synthetic */ ListView f88985r;

            /* renamed from: s */
            final /* synthetic */ AlertController f88986s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z11, ListView listView, AlertController alertController) {
                super(context, cursor, z11);
                this.f88985r = listView;
                this.f88986s = alertController;
                Cursor cursor2 = getCursor();
                this.f88983p = cursor2.getColumnIndexOrThrow(C17457b.this.f88950H);
                this.f88984q = cursor2.getColumnIndexOrThrow(C17457b.this.f88951I);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f88983p));
                ListView listView = this.f88985r;
                int position = cursor.getPosition();
                boolean z11 = true;
                if (cursor.getInt(this.f88984q) != 1) {
                    z11 = false;
                }
                listView.setItemChecked(position, z11);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C17457b.this.f88956b.inflate(this.f88986s.f88906J, viewGroup, false);
            }
        }

        /* renamed from: com.zing.zalo.zview.dialog.AlertController$b$c */
        /* loaded from: classes7.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: p */
            final /* synthetic */ AlertController f88988p;

            c(AlertController alertController) {
                this.f88988p = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                C17457b.this.f88975u.mo605K8(this.f88988p.f88914b, i11);
                if (!C17457b.this.f88947E) {
                    this.f88988p.f88914b.dismiss();
                }
            }
        }

        public C17457b(Context context) {
            this.f88955a = context;
            this.f88956b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void m92823a(AlertController alertController) {
            View view = this.f88961g;
            if (view != null) {
                alertController.m92809n(view);
            } else {
                CharSequence charSequence = this.f88960f;
                if (charSequence != null) {
                    alertController.m92814s(charSequence);
                }
                Drawable drawable = this.f88958d;
                if (drawable != null) {
                    alertController.m92811p(drawable);
                }
                int i11 = this.f88957c;
                if (i11 != 0) {
                    alertController.m92810o(i11);
                }
                int i12 = this.f88959e;
                if (i12 != 0) {
                    alertController.m92810o(alertController.m92800e(i12));
                }
            }
            CharSequence charSequence2 = this.f88962h;
            if (charSequence2 != null) {
                alertController.m92813r(charSequence2);
            }
            CharSequence charSequence3 = this.f88963i;
            if (charSequence3 != null) {
                alertController.m92807l(-1, charSequence3, this.f88964j, null);
            }
            CharSequence charSequence4 = this.f88965k;
            if (charSequence4 != null) {
                alertController.m92807l(-2, charSequence4, this.f88966l, null);
            }
            CharSequence charSequence5 = this.f88967m;
            if (charSequence5 != null) {
                alertController.m92807l(-3, charSequence5, this.f88968n, null);
            }
            if (this.f88952J) {
                alertController.m92812q(true);
            }
            if (this.f88973s != null || this.f88949G != null || this.f88974t != null) {
                m92824b(alertController);
            }
            View view2 = this.f88977w;
            if (view2 != null) {
                if (this.f88944B) {
                    alertController.m92817v(view2, this.f88978x, this.f88979y, this.f88980z, this.f88943A);
                    return;
                } else {
                    alertController.m92816u(view2);
                    return;
                }
            }
            int i13 = this.f88976v;
            if (i13 != 0) {
                alertController.m92815t(i13);
            }
        }

        /* renamed from: b */
        void m92824b(AlertController alertController) {
            int i11;
            ListAdapter listAdapter;
            ListView listView = (ListView) this.f88956b.inflate(alertController.f88905I, (ViewGroup) null);
            if (listView != null) {
                listView.setBackgroundColor(AbstractC32232i.m155465m(this.f88955a, AbstractC17450b.PrimaryBackgroundColor));
            }
            if (this.f88946D) {
                if (this.f88949G == null) {
                    listAdapter = new a(this.f88955a, alertController.f88906J, R.id.text1, this.f88973s, listView);
                } else {
                    listAdapter = new b(this.f88955a, this.f88949G, false, listView, alertController);
                }
            } else {
                if (this.f88947E) {
                    i11 = alertController.f88907K;
                } else {
                    i11 = alertController.f88908L;
                }
                int i12 = i11;
                if (this.f88949G != null) {
                    listAdapter = new SimpleCursorAdapter(this.f88955a, i12, this.f88949G, new String[]{this.f88950H}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f88974t;
                    if (listAdapter == null) {
                        listAdapter = new C17459d(this.f88955a, i12, R.id.text1, this.f88973s);
                    }
                }
            }
            alertController.f88901E = listAdapter;
            alertController.f88902F = this.f88948F;
            if (this.f88975u != null && listView != null) {
                listView.setOnItemClickListener(new c(alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f88953K;
            if (onItemSelectedListener != null && listView != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (listView != null) {
                if (this.f88947E) {
                    listView.setChoiceMode(1);
                } else if (this.f88946D) {
                    listView.setChoiceMode(2);
                }
                alertController.f88918f = listView;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zview.dialog.AlertController$c */
    /* loaded from: classes7.dex */
    public static final class HandlerC17458c extends Handler {

        /* renamed from: a */
        WeakReference f88990a;

        public HandlerC17458c(InterfaceC17463d interfaceC17463d) {
            this.f88990a = new WeakReference(interfaceC17463d);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != -3 && i11 != -2 && i11 != -1) {
                if (i11 == 1) {
                    ((InterfaceC17463d) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((InterfaceC17463d.d) message.obj).mo605K8((InterfaceC17463d) this.f88990a.get(), message.what);
        }
    }

    /* renamed from: com.zing.zalo.zview.dialog.AlertController$d */
    /* loaded from: classes7.dex */
    public static class C17459d extends ArrayAdapter {
        public C17459d(Context context, int i11, int i12, CharSequence[] charSequenceArr) {
            super(context, i11, i12, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    protected AlertController(Context context, InterfaceC17463d interfaceC17463d, C17465f c17465f) {
        this.f88913a = context;
        this.f88914b = interfaceC17463d;
        this.f88915c = c17465f;
        this.f88911O = new HandlerC17458c(interfaceC17463d);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC17472h.AlertDialog, AbstractC17450b.alertDialogStyle, 0);
        this.f88903G = AbstractC17470g.alert_dialog_holo;
        this.f88904H = obtainStyledAttributes.getResourceId(AbstractC17472h.AlertDialog_buttonPanelSideLayout, 0);
        this.f88905I = obtainStyledAttributes.getResourceId(AbstractC17472h.AlertDialog_listLayout, AbstractC17470g.select_dialog);
        this.f88906J = obtainStyledAttributes.getResourceId(AbstractC17472h.AlertDialog_multiChoiceItemLayout, R.layout.select_dialog_multichoice);
        this.f88907K = obtainStyledAttributes.getResourceId(AbstractC17472h.AlertDialog_singleChoiceItemLayout, R.layout.select_dialog_singlechoice);
        this.f88908L = obtainStyledAttributes.getResourceId(AbstractC17472h.AlertDialog_listItemLayout, R.layout.select_dialog_item);
        this.f88909M = true;
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    static boolean m92794B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC17450b.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m92795a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m92795a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final AlertController m92796c(Context context, InterfaceC17463d interfaceC17463d, C17465f c17465f) {
        return new AlertController(context, interfaceC17463d, c17465f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    void m92797A() {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        View findViewById;
        View findViewById2;
        View m92899f = this.f88915c.m92899f(AbstractC17468f.parentPanel);
        View findViewById3 = m92899f.findViewById(AbstractC17468f.topPanel);
        View findViewById4 = m92899f.findViewById(AbstractC17468f.contentPanel);
        View findViewById5 = m92899f.findViewById(AbstractC17468f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) m92899f.findViewById(AbstractC17468f.customPanel);
        m92820y(viewGroup);
        View findViewById6 = viewGroup.findViewById(AbstractC17468f.topPanel);
        View findViewById7 = viewGroup.findViewById(AbstractC17468f.contentPanel);
        View findViewById8 = viewGroup.findViewById(AbstractC17468f.buttonPanel);
        ViewGroup m92804i = m92804i(findViewById6, findViewById3);
        ViewGroup m92804i2 = m92804i(findViewById7, findViewById4);
        ViewGroup m92804i3 = m92804i(findViewById8, findViewById5);
        m92819x(m92804i2);
        m92818w(m92804i3);
        m92821z(m92804i);
        if (viewGroup.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m92804i != null && m92804i.getVisibility() != 8) {
            z12 = 1;
        } else {
            z12 = 0;
        }
        if (m92804i3 != null && m92804i3.getVisibility() != 8) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            if (m92804i2 != null && (findViewById2 = m92804i2.findViewById(AbstractC17468f.textSpacerNoButtons)) != null) {
                findViewById2.setVisibility(0);
            }
            this.f88915c.m92916z(true);
        }
        if (z12 != 0) {
            ScrollView scrollView = this.f88935w;
            if (scrollView != null) {
                scrollView.setClipToPadding(true);
            }
            if (this.f88917e == null && this.f88918f == null && !z11) {
                findViewById = m92804i.findViewById(AbstractC17468f.titleDividerTop);
            } else {
                findViewById = m92804i.findViewById(AbstractC17468f.titleDivider);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        ListView listView = this.f88918f;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m92822a(z12, z13);
        }
        if (!z11) {
            View view = this.f88918f;
            if (view == null) {
                view = this.f88935w;
            }
            if (view != null && Build.VERSION.SDK_INT >= 23) {
                if (z13) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                view.setScrollIndicators(i11 | z12, 3);
            }
        }
        TypedArray obtainStyledAttributes = this.f88913a.obtainStyledAttributes(null, AbstractC19187j.AlertDialog, AbstractC17450b.alertDialogStyle, 0);
        m92806k(obtainStyledAttributes, m92804i, m92804i2, viewGroup, m92804i3, z12, z11, z13);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    void m92798b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
        View m92899f = this.f88915c.m92899f(AbstractC17468f.leftSpacer);
        if (m92899f != null) {
            m92899f.setVisibility(0);
        }
        View m92899f2 = this.f88915c.m92899f(AbstractC17468f.rightSpacer);
        if (m92899f2 != null) {
            m92899f2.setVisibility(0);
        }
    }

    /* renamed from: d */
    public Button m92799d(int i11) {
        if (i11 == -3) {
            return this.f88932t;
        }
        if (i11 == -2) {
            return this.f88929q;
        }
        if (i11 != -1) {
            return null;
        }
        return this.f88926n;
    }

    /* renamed from: e */
    public int m92800e(int i11) {
        TypedValue typedValue = new TypedValue();
        this.f88913a.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: f */
    public void m92801f() {
        this.f88915c.m92882A(m92805j());
        m92797A();
    }

    /* renamed from: g */
    public boolean m92802g(int i11, KeyEvent keyEvent) {
        ScrollView scrollView = this.f88935w;
        if (scrollView != null && scrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m92803h(int i11, KeyEvent keyEvent) {
        ScrollView scrollView = this.f88935w;
        if (scrollView != null && scrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    ViewGroup m92804i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    int m92805j() {
        int i11 = this.f88904H;
        return (i11 != 0 && this.f88910N == 1) ? i11 : this.f88903G;
    }

    /* renamed from: k */
    void m92806k(TypedArray typedArray, View view, View view2, View view3, View view4, boolean z11, boolean z12, boolean z13) {
        int i11;
        View view5;
        boolean z14;
        ListAdapter listAdapter;
        int i12 = AbstractC17466e.dialog_full_holo_light;
        int i13 = AbstractC17466e.dialog_top_holo_light;
        int i14 = AbstractC17466e.dialog_middle_holo_light;
        int i15 = AbstractC17466e.dialog_bottom_holo_light;
        View[] viewArr = new View[4];
        boolean[] zArr = new boolean[4];
        if (z11) {
            viewArr[0] = view;
            zArr[0] = false;
            i11 = 1;
        } else {
            i11 = 0;
        }
        View view6 = null;
        if (view2.getVisibility() == 8) {
            view5 = null;
        } else {
            view5 = view2;
        }
        viewArr[i11] = view5;
        if (this.f88918f != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        zArr[i11] = z14;
        int i16 = i11 + 1;
        if (z12) {
            viewArr[i16] = view3;
            zArr[i16] = this.f88900D;
            i16 = i11 + 2;
        }
        if (z13) {
            viewArr[i16] = view4;
            zArr[i16] = true;
        }
        boolean z15 = false;
        for (int i17 = 0; i17 < 4; i17++) {
            View view7 = viewArr[i17];
            if (view7 != null) {
                if (view6 != null) {
                    if (!z15) {
                        view6.setBackgroundResource(i13);
                    } else {
                        view6.setBackgroundResource(i14);
                    }
                    z15 = true;
                }
                boolean z16 = zArr[i17];
                view6 = view7;
            }
        }
        if (view6 != null) {
            if (z15) {
                view6.setBackgroundResource(i15);
            } else {
                view6.setBackgroundResource(i12);
            }
        }
        ListView listView = this.f88918f;
        if (listView != null && (listAdapter = this.f88901E) != null) {
            listView.setAdapter(listAdapter);
            int i18 = this.f88902F;
            if (i18 > -1) {
                listView.setItemChecked(i18, true);
                listView.setSelection(i18);
            }
        }
    }

    /* renamed from: l */
    public void m92807l(int i11, CharSequence charSequence, InterfaceC17463d.d dVar, Message message) {
        if (message == null && dVar != null) {
            message = this.f88911O.obtainMessage(i11, dVar);
        }
        if (i11 != -3) {
            if (i11 != -2) {
                if (i11 == -1) {
                    this.f88927o = charSequence;
                    this.f88928p = message;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f88930r = charSequence;
            this.f88931s = message;
            return;
        }
        this.f88933u = charSequence;
        this.f88934v = message;
    }

    /* renamed from: m */
    public void m92808m(int i11) {
        this.f88910N = i11;
    }

    /* renamed from: n */
    public void m92809n(View view) {
        this.f88899C = view;
    }

    /* renamed from: o */
    public void m92810o(int i11) {
        this.f88937y = null;
        this.f88936x = i11;
        ImageView imageView = this.f88938z;
        if (imageView != null) {
            if (i11 != 0) {
                imageView.setVisibility(0);
                this.f88938z.setImageResource(this.f88936x);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: p */
    public void m92811p(Drawable drawable) {
        this.f88937y = drawable;
        this.f88936x = 0;
        ImageView imageView = this.f88938z;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f88938z.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: q */
    public void m92812q(boolean z11) {
        this.f88900D = z11;
    }

    /* renamed from: r */
    public void m92813r(CharSequence charSequence) {
        this.f88917e = charSequence;
        TextView textView = this.f88898B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: s */
    public void m92814s(CharSequence charSequence) {
        this.f88916d = charSequence;
        TextView textView = this.f88897A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: t */
    public void m92815t(int i11) {
        this.f88919g = null;
        this.f88920h = i11;
        this.f88925m = false;
    }

    /* renamed from: u */
    public void m92816u(View view) {
        this.f88919g = view;
        this.f88920h = 0;
        this.f88925m = false;
    }

    /* renamed from: v */
    public void m92817v(View view, int i11, int i12, int i13, int i14) {
        this.f88919g = view;
        this.f88920h = 0;
        this.f88925m = true;
        this.f88921i = i11;
        this.f88922j = i12;
        this.f88923k = i13;
        this.f88924l = i14;
    }

    /* renamed from: w */
    protected void m92818w(ViewGroup viewGroup) {
        int i11;
        Button button = (Button) viewGroup.findViewById(AbstractC17468f.button1);
        this.f88926n = button;
        button.setOnClickListener(this.f88912P);
        if (TextUtils.isEmpty(this.f88927o)) {
            this.f88926n.setVisibility(8);
            i11 = 0;
        } else {
            this.f88926n.setText(this.f88927o);
            this.f88926n.setVisibility(0);
            i11 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(AbstractC17468f.button2);
        this.f88929q = button2;
        button2.setOnClickListener(this.f88912P);
        if (TextUtils.isEmpty(this.f88930r)) {
            this.f88929q.setVisibility(8);
        } else {
            this.f88929q.setText(this.f88930r);
            this.f88929q.setVisibility(0);
            i11 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(AbstractC17468f.button3);
        this.f88932t = button3;
        button3.setOnClickListener(this.f88912P);
        if (TextUtils.isEmpty(this.f88933u)) {
            this.f88932t.setVisibility(8);
        } else {
            this.f88932t.setText(this.f88933u);
            this.f88932t.setVisibility(0);
            i11 |= 4;
        }
        if (m92794B(this.f88913a)) {
            if (i11 == 1) {
                m92798b(this.f88926n);
            } else if (i11 == 2) {
                m92798b(this.f88929q);
            } else if (i11 == 4) {
                m92798b(this.f88932t);
            }
        }
        if (i11 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: x */
    protected void m92819x(ViewGroup viewGroup) {
        ScrollView scrollView = (ScrollView) viewGroup.findViewById(AbstractC17468f.scrollView);
        this.f88935w = scrollView;
        scrollView.setFocusable(false);
        TextView textView = (TextView) viewGroup.findViewById(AbstractC17468f.message);
        this.f88898B = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f88917e;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f88935w.removeView(this.f88898B);
        if (this.f88918f != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f88935w.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f88935w);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f88918f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: y */
    void m92820y(ViewGroup viewGroup) {
        View view = this.f88919g;
        boolean z11 = false;
        if (view == null) {
            if (this.f88920h != 0) {
                view = LayoutInflater.from(this.f88913a).inflate(this.f88920h, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z11 = true;
        }
        if (!z11 || !m92795a(view)) {
            this.f88915c.m92887F(131072, 131072);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) this.f88915c.m92899f(AbstractC17468f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f88925m) {
                frameLayout.setPadding(this.f88921i, this.f88922j, this.f88923k, this.f88924l);
            }
            if (this.f88918f != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: z */
    protected void m92821z(ViewGroup viewGroup) {
        if (this.f88899C != null && this.f88909M) {
            viewGroup.addView(this.f88899C, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f88915c.m92899f(AbstractC17468f.title_template).setVisibility(8);
            return;
        }
        this.f88938z = (ImageView) this.f88915c.m92899f(AbstractC17468f.icon);
        if ((!TextUtils.isEmpty(this.f88916d)) && this.f88909M) {
            TextView textView = (TextView) this.f88915c.m92899f(AbstractC17468f.alertTitle);
            this.f88897A = textView;
            textView.setText(this.f88916d);
            int i11 = this.f88936x;
            if (i11 != 0) {
                this.f88938z.setImageResource(i11);
                return;
            }
            Drawable drawable = this.f88937y;
            if (drawable != null) {
                this.f88938z.setImageDrawable(drawable);
                return;
            } else {
                this.f88897A.setPadding(this.f88938z.getPaddingLeft(), this.f88938z.getPaddingTop(), this.f88938z.getPaddingRight(), this.f88938z.getPaddingBottom());
                this.f88938z.setVisibility(8);
                return;
            }
        }
        this.f88915c.m92899f(AbstractC17468f.title_template).setVisibility(8);
        this.f88938z.setVisibility(8);
        viewGroup.setVisibility(8);
    }
}
