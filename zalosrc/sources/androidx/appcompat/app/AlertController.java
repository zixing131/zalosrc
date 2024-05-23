package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
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
import android.view.Window;
import android.widget.AbsListView;
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
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.AbstractC1579n0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19187j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f3624A;

    /* renamed from: C */
    private Drawable f3626C;

    /* renamed from: D */
    private ImageView f3627D;

    /* renamed from: E */
    private TextView f3628E;

    /* renamed from: F */
    private TextView f3629F;

    /* renamed from: G */
    private View f3630G;

    /* renamed from: H */
    ListAdapter f3631H;

    /* renamed from: J */
    private int f3633J;

    /* renamed from: K */
    private int f3634K;

    /* renamed from: L */
    int f3635L;

    /* renamed from: M */
    int f3636M;

    /* renamed from: N */
    int f3637N;

    /* renamed from: O */
    int f3638O;

    /* renamed from: P */
    private boolean f3639P;

    /* renamed from: R */
    Handler f3641R;

    /* renamed from: a */
    private final Context f3643a;

    /* renamed from: b */
    final AbstractDialogC1060j f3644b;

    /* renamed from: c */
    private final Window f3645c;

    /* renamed from: d */
    private final int f3646d;

    /* renamed from: e */
    private CharSequence f3647e;

    /* renamed from: f */
    private CharSequence f3648f;

    /* renamed from: g */
    ListView f3649g;

    /* renamed from: h */
    private View f3650h;

    /* renamed from: i */
    private int f3651i;

    /* renamed from: j */
    private int f3652j;

    /* renamed from: k */
    private int f3653k;

    /* renamed from: l */
    private int f3654l;

    /* renamed from: m */
    private int f3655m;

    /* renamed from: o */
    Button f3657o;

    /* renamed from: p */
    private CharSequence f3658p;

    /* renamed from: q */
    Message f3659q;

    /* renamed from: r */
    private Drawable f3660r;

    /* renamed from: s */
    Button f3661s;

    /* renamed from: t */
    private CharSequence f3662t;

    /* renamed from: u */
    Message f3663u;

    /* renamed from: v */
    private Drawable f3664v;

    /* renamed from: w */
    Button f3665w;

    /* renamed from: x */
    private CharSequence f3666x;

    /* renamed from: y */
    Message f3667y;

    /* renamed from: z */
    private Drawable f3668z;

    /* renamed from: n */
    private boolean f3656n = false;

    /* renamed from: B */
    private int f3625B = 0;

    /* renamed from: I */
    int f3632I = -1;

    /* renamed from: Q */
    private int f3640Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f3642S = new ViewOnClickListenerC1025a();

    /* loaded from: classes2.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: p */
        private final int f3669p;

        /* renamed from: q */
        private final int f3670q;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.RecycleListView);
            this.f3670q = obtainStyledAttributes.getDimensionPixelOffset(AbstractC19187j.RecycleListView_paddingBottomNoButtons, -1);
            this.f3669p = obtainStyledAttributes.getDimensionPixelOffset(AbstractC19187j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void m4735a(boolean z11, boolean z12) {
            int i11;
            int i12;
            if (!z12 || !z11) {
                int paddingLeft = getPaddingLeft();
                if (z11) {
                    i11 = getPaddingTop();
                } else {
                    i11 = this.f3669p;
                }
                int paddingRight = getPaddingRight();
                if (z12) {
                    i12 = getPaddingBottom();
                } else {
                    i12 = this.f3670q;
                }
                setPadding(paddingLeft, i11, paddingRight, i12);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes2.dex */
    class ViewOnClickListenerC1025a implements View.OnClickListener {
        ViewOnClickListenerC1025a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f3657o && (message4 = alertController.f3659q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f3661s && (message3 = alertController.f3663u) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f3665w && (message2 = alertController.f3667y) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f3641R.obtainMessage(1, alertController2.f3644b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes2.dex */
    public class C1026b implements NestedScrollView.InterfaceC1628c {

        /* renamed from: a */
        final /* synthetic */ View f3672a;

        /* renamed from: b */
        final /* synthetic */ View f3673b;

        C1026b(View view, View view2) {
            this.f3672a = view;
            this.f3673b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC1628c
        /* renamed from: a */
        public void mo4736a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
            AlertController.m4711f(nestedScrollView, this.f3672a, this.f3673b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes2.dex */
    public class RunnableC1027c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f3675p;

        /* renamed from: q */
        final /* synthetic */ View f3676q;

        RunnableC1027c(View view, View view2) {
            this.f3675p = view;
            this.f3676q = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m4711f(AlertController.this.f3624A, this.f3675p, this.f3676q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes2.dex */
    public class C1028d implements AbsListView.OnScrollListener {

        /* renamed from: p */
        final /* synthetic */ View f3678p;

        /* renamed from: q */
        final /* synthetic */ View f3679q;

        C1028d(View view, View view2) {
            this.f3678p = view;
            this.f3679q = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            AlertController.m4711f(absListView, this.f3678p, this.f3679q);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes2.dex */
    public class RunnableC1029e implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f3681p;

        /* renamed from: q */
        final /* synthetic */ View f3682q;

        RunnableC1029e(View view, View view2) {
            this.f3681p = view;
            this.f3682q = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m4711f(AlertController.this.f3649g, this.f3681p, this.f3682q);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes2.dex */
    public static class C1030f {

        /* renamed from: A */
        public int f3684A;

        /* renamed from: B */
        public int f3685B;

        /* renamed from: C */
        public int f3686C;

        /* renamed from: D */
        public int f3687D;

        /* renamed from: F */
        public boolean[] f3689F;

        /* renamed from: G */
        public boolean f3690G;

        /* renamed from: H */
        public boolean f3691H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f3693J;

        /* renamed from: K */
        public Cursor f3694K;

        /* renamed from: L */
        public String f3695L;

        /* renamed from: M */
        public String f3696M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f3697N;

        /* renamed from: a */
        public final Context f3699a;

        /* renamed from: b */
        public final LayoutInflater f3700b;

        /* renamed from: d */
        public Drawable f3702d;

        /* renamed from: f */
        public CharSequence f3704f;

        /* renamed from: g */
        public View f3705g;

        /* renamed from: h */
        public CharSequence f3706h;

        /* renamed from: i */
        public CharSequence f3707i;

        /* renamed from: j */
        public Drawable f3708j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f3709k;

        /* renamed from: l */
        public CharSequence f3710l;

        /* renamed from: m */
        public Drawable f3711m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f3712n;

        /* renamed from: o */
        public CharSequence f3713o;

        /* renamed from: p */
        public Drawable f3714p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f3715q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f3717s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f3718t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f3719u;

        /* renamed from: v */
        public CharSequence[] f3720v;

        /* renamed from: w */
        public ListAdapter f3721w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f3722x;

        /* renamed from: y */
        public int f3723y;

        /* renamed from: z */
        public View f3724z;

        /* renamed from: c */
        public int f3701c = 0;

        /* renamed from: e */
        public int f3703e = 0;

        /* renamed from: E */
        public boolean f3688E = false;

        /* renamed from: I */
        public int f3692I = -1;

        /* renamed from: O */
        public boolean f3698O = true;

        /* renamed from: r */
        public boolean f3716r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes2.dex */
        public class a extends ArrayAdapter {

            /* renamed from: p */
            final /* synthetic */ RecycleListView f3725p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i11, int i12, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i11, i12, charSequenceArr);
                this.f3725p = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i11, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i11, view, viewGroup);
                boolean[] zArr = C1030f.this.f3689F;
                if (zArr != null && zArr[i11]) {
                    this.f3725p.setItemChecked(i11, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes2.dex */
        public class b extends CursorAdapter {

            /* renamed from: p */
            private final int f3727p;

            /* renamed from: q */
            private final int f3728q;

            /* renamed from: r */
            final /* synthetic */ RecycleListView f3729r;

            /* renamed from: s */
            final /* synthetic */ AlertController f3730s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z11, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z11);
                this.f3729r = recycleListView;
                this.f3730s = alertController;
                Cursor cursor2 = getCursor();
                this.f3727p = cursor2.getColumnIndexOrThrow(C1030f.this.f3695L);
                this.f3728q = cursor2.getColumnIndexOrThrow(C1030f.this.f3696M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f3727p));
                RecycleListView recycleListView = this.f3729r;
                int position = cursor.getPosition();
                boolean z11 = true;
                if (cursor.getInt(this.f3728q) != 1) {
                    z11 = false;
                }
                recycleListView.setItemChecked(position, z11);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C1030f.this.f3700b.inflate(this.f3730s.f3636M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes2.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: p */
            final /* synthetic */ AlertController f3732p;

            c(AlertController alertController) {
                this.f3732p = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                C1030f.this.f3722x.onClick(this.f3732p.f3644b, i11);
                if (!C1030f.this.f3691H) {
                    this.f3732p.f3644b.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes2.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: p */
            final /* synthetic */ RecycleListView f3734p;

            /* renamed from: q */
            final /* synthetic */ AlertController f3735q;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f3734p = recycleListView;
                this.f3735q = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                boolean[] zArr = C1030f.this.f3689F;
                if (zArr != null) {
                    zArr[i11] = this.f3734p.isItemChecked(i11);
                }
                C1030f.this.f3693J.onClick(this.f3735q.f3644b, i11, this.f3734p.isItemChecked(i11));
            }
        }

        public C1030f(Context context) {
            this.f3699a = context;
            this.f3700b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m4737b(AlertController alertController) {
            int i11;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f3700b.inflate(alertController.f3635L, (ViewGroup) null);
            if (this.f3690G) {
                if (this.f3694K == null) {
                    listAdapter = new a(this.f3699a, alertController.f3636M, R.id.text1, this.f3720v, recycleListView);
                } else {
                    listAdapter = new b(this.f3699a, this.f3694K, false, recycleListView, alertController);
                }
            } else {
                if (this.f3691H) {
                    i11 = alertController.f3637N;
                } else {
                    i11 = alertController.f3638O;
                }
                int i12 = i11;
                if (this.f3694K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f3699a, i12, this.f3694K, new String[]{this.f3695L}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f3721w;
                    if (listAdapter == null) {
                        listAdapter = new C1032h(this.f3699a, i12, R.id.text1, this.f3720v);
                    }
                }
            }
            alertController.f3631H = listAdapter;
            alertController.f3632I = this.f3692I;
            if (this.f3722x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f3693J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3697N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f3691H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f3690G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f3649g = recycleListView;
        }

        /* renamed from: a */
        public void m4738a(AlertController alertController) {
            View view = this.f3705g;
            if (view != null) {
                alertController.m4727l(view);
            } else {
                CharSequence charSequence = this.f3704f;
                if (charSequence != null) {
                    alertController.m4731q(charSequence);
                }
                Drawable drawable = this.f3702d;
                if (drawable != null) {
                    alertController.m4729n(drawable);
                }
                int i11 = this.f3701c;
                if (i11 != 0) {
                    alertController.m4728m(i11);
                }
                int i12 = this.f3703e;
                if (i12 != 0) {
                    alertController.m4728m(alertController.m4721c(i12));
                }
            }
            CharSequence charSequence2 = this.f3706h;
            if (charSequence2 != null) {
                alertController.m4730o(charSequence2);
            }
            CharSequence charSequence3 = this.f3707i;
            if (charSequence3 != null || this.f3708j != null) {
                alertController.m4726k(-1, charSequence3, this.f3709k, null, this.f3708j);
            }
            CharSequence charSequence4 = this.f3710l;
            if (charSequence4 != null || this.f3711m != null) {
                alertController.m4726k(-2, charSequence4, this.f3712n, null, this.f3711m);
            }
            CharSequence charSequence5 = this.f3713o;
            if (charSequence5 != null || this.f3714p != null) {
                alertController.m4726k(-3, charSequence5, this.f3715q, null, this.f3714p);
            }
            if (this.f3720v != null || this.f3694K != null || this.f3721w != null) {
                m4737b(alertController);
            }
            View view2 = this.f3724z;
            if (view2 != null) {
                if (this.f3688E) {
                    alertController.m4734t(view2, this.f3684A, this.f3685B, this.f3686C, this.f3687D);
                    return;
                } else {
                    alertController.m4733s(view2);
                    return;
                }
            }
            int i13 = this.f3723y;
            if (i13 != 0) {
                alertController.m4732r(i13);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes2.dex */
    private static final class HandlerC1031g extends Handler {

        /* renamed from: a */
        private WeakReference f3737a;

        public HandlerC1031g(DialogInterface dialogInterface) {
            this.f3737a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != -3 && i11 != -2 && i11 != -1) {
                if (i11 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f3737a.get(), message.what);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes2.dex */
    public static class C1032h extends ArrayAdapter {
        public C1032h(Context context, int i11, int i12, CharSequence[] charSequenceArr) {
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

    public AlertController(Context context, AbstractDialogC1060j abstractDialogC1060j, Window window) {
        this.f3643a = context;
        this.f3644b = abstractDialogC1060j;
        this.f3645c = window;
        this.f3641R = new HandlerC1031g(abstractDialogC1060j);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC19187j.AlertDialog, AbstractC19178a.alertDialogStyle, 0);
        this.f3633J = obtainStyledAttributes.getResourceId(AbstractC19187j.AlertDialog_android_layout, 0);
        this.f3634K = obtainStyledAttributes.getResourceId(AbstractC19187j.AlertDialog_buttonPanelSideLayout, 0);
        this.f3635L = obtainStyledAttributes.getResourceId(AbstractC19187j.AlertDialog_listLayout, 0);
        this.f3636M = obtainStyledAttributes.getResourceId(AbstractC19187j.AlertDialog_multiChoiceItemLayout, 0);
        this.f3637N = obtainStyledAttributes.getResourceId(AbstractC19187j.AlertDialog_singleChoiceItemLayout, 0);
        this.f3638O = obtainStyledAttributes.getResourceId(AbstractC19187j.AlertDialog_listItemLayout, 0);
        this.f3639P = obtainStyledAttributes.getBoolean(AbstractC19187j.AlertDialog_showTitle, true);
        this.f3646d = obtainStyledAttributes.getDimensionPixelSize(AbstractC19187j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        abstractDialogC1060j.m4893d(1);
    }

    /* renamed from: a */
    static boolean m4709a(View view) {
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
            if (m4709a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m4710b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m4711f(View view, View view2, View view3) {
        int i11;
        int i12 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            view2.setVisibility(i11);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i12 = 0;
            }
            view3.setVisibility(i12);
        }
    }

    /* renamed from: i */
    private ViewGroup m4712i(View view, View view2) {
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
    private int m4713j() {
        int i11 = this.f3634K;
        return (i11 != 0 && this.f3640Q == 1) ? i11 : this.f3633J;
    }

    /* renamed from: p */
    private void m4714p(ViewGroup viewGroup, View view, int i11, int i12) {
        View findViewById = this.f3645c.findViewById(AbstractC19183f.scrollIndicatorUp);
        View findViewById2 = this.f3645c.findViewById(AbstractC19183f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC1579n0.m7849Y0(view, i11, i12);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i11 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i11 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f3648f != null) {
                this.f3624A.setOnScrollChangeListener(new C1026b(findViewById, findViewById2));
                this.f3624A.post(new RunnableC1027c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f3649g;
            if (listView != null) {
                listView.setOnScrollListener(new C1028d(findViewById, findViewById2));
                this.f3649g.post(new RunnableC1029e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    /* renamed from: u */
    private void m4715u(ViewGroup viewGroup) {
        int i11;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f3657o = button;
        button.setOnClickListener(this.f3642S);
        if (TextUtils.isEmpty(this.f3658p) && this.f3660r == null) {
            this.f3657o.setVisibility(8);
            i11 = 0;
        } else {
            this.f3657o.setText(this.f3658p);
            Drawable drawable = this.f3660r;
            if (drawable != null) {
                int i12 = this.f3646d;
                drawable.setBounds(0, 0, i12, i12);
                this.f3657o.setCompoundDrawables(this.f3660r, null, null, null);
            }
            this.f3657o.setVisibility(0);
            i11 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f3661s = button2;
        button2.setOnClickListener(this.f3642S);
        if (TextUtils.isEmpty(this.f3662t) && this.f3664v == null) {
            this.f3661s.setVisibility(8);
        } else {
            this.f3661s.setText(this.f3662t);
            Drawable drawable2 = this.f3664v;
            if (drawable2 != null) {
                int i13 = this.f3646d;
                drawable2.setBounds(0, 0, i13, i13);
                this.f3661s.setCompoundDrawables(this.f3664v, null, null, null);
            }
            this.f3661s.setVisibility(0);
            i11 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f3665w = button3;
        button3.setOnClickListener(this.f3642S);
        if (TextUtils.isEmpty(this.f3666x) && this.f3668z == null) {
            this.f3665w.setVisibility(8);
        } else {
            this.f3665w.setText(this.f3666x);
            Drawable drawable3 = this.f3668z;
            if (drawable3 != null) {
                int i14 = this.f3646d;
                drawable3.setBounds(0, 0, i14, i14);
                this.f3665w.setCompoundDrawables(this.f3668z, null, null, null);
            }
            this.f3665w.setVisibility(0);
            i11 |= 4;
        }
        if (m4720z(this.f3643a)) {
            if (i11 == 1) {
                m4710b(this.f3657o);
            } else if (i11 == 2) {
                m4710b(this.f3661s);
            } else if (i11 == 4) {
                m4710b(this.f3665w);
            }
        }
        if (i11 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m4716v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f3645c.findViewById(AbstractC19183f.scrollView);
        this.f3624A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f3624A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f3629F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f3648f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f3624A.removeView(this.f3629F);
        if (this.f3649g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f3624A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f3624A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f3649g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    private void m4717w(ViewGroup viewGroup) {
        View view = this.f3650h;
        boolean z11 = false;
        if (view == null) {
            if (this.f3651i != 0) {
                view = LayoutInflater.from(this.f3643a).inflate(this.f3651i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z11 = true;
        }
        if (!z11 || !m4709a(view)) {
            this.f3645c.setFlags(131072, 131072);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) this.f3645c.findViewById(AbstractC19183f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f3656n) {
                frameLayout.setPadding(this.f3652j, this.f3653k, this.f3654l, this.f3655m);
            }
            if (this.f3649g != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).f4339a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m4718x(ViewGroup viewGroup) {
        if (this.f3630G != null) {
            viewGroup.addView(this.f3630G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f3645c.findViewById(AbstractC19183f.title_template).setVisibility(8);
            return;
        }
        this.f3627D = (ImageView) this.f3645c.findViewById(R.id.icon);
        if ((!TextUtils.isEmpty(this.f3647e)) && this.f3639P) {
            TextView textView = (TextView) this.f3645c.findViewById(AbstractC19183f.alertTitle);
            this.f3628E = textView;
            textView.setText(this.f3647e);
            int i11 = this.f3625B;
            if (i11 != 0) {
                this.f3627D.setImageResource(i11);
                return;
            }
            Drawable drawable = this.f3626C;
            if (drawable != null) {
                this.f3627D.setImageDrawable(drawable);
                return;
            } else {
                this.f3628E.setPadding(this.f3627D.getPaddingLeft(), this.f3627D.getPaddingTop(), this.f3627D.getPaddingRight(), this.f3627D.getPaddingBottom());
                this.f3627D.setVisibility(8);
                return;
            }
        }
        this.f3645c.findViewById(AbstractC19183f.title_template).setVisibility(8);
        this.f3627D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    private void m4719y() {
        boolean z11;
        boolean z12;
        boolean z13;
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3;
        View findViewById4 = this.f3645c.findViewById(AbstractC19183f.parentPanel);
        View findViewById5 = findViewById4.findViewById(AbstractC19183f.topPanel);
        View findViewById6 = findViewById4.findViewById(AbstractC19183f.contentPanel);
        View findViewById7 = findViewById4.findViewById(AbstractC19183f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById4.findViewById(AbstractC19183f.customPanel);
        m4717w(viewGroup);
        View findViewById8 = viewGroup.findViewById(AbstractC19183f.topPanel);
        View findViewById9 = viewGroup.findViewById(AbstractC19183f.contentPanel);
        View findViewById10 = viewGroup.findViewById(AbstractC19183f.buttonPanel);
        ViewGroup m4712i = m4712i(findViewById8, findViewById5);
        ViewGroup m4712i2 = m4712i(findViewById9, findViewById6);
        ViewGroup m4712i3 = m4712i(findViewById10, findViewById7);
        m4716v(m4712i2);
        m4715u(m4712i3);
        m4718x(m4712i);
        int i11 = 0;
        if (viewGroup.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m4712i != null && m4712i.getVisibility() != 8) {
            z12 = 1;
        } else {
            z12 = 0;
        }
        if (m4712i3 != null && m4712i3.getVisibility() != 8) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && m4712i2 != null && (findViewById3 = m4712i2.findViewById(AbstractC19183f.textSpacerNoButtons)) != null) {
            findViewById3.setVisibility(0);
        }
        if (z12 != 0) {
            NestedScrollView nestedScrollView = this.f3624A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f3648f == null && this.f3649g == null) {
                findViewById2 = null;
            } else {
                findViewById2 = m4712i.findViewById(AbstractC19183f.titleDividerNoCustom);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else if (m4712i2 != null && (findViewById = m4712i2.findViewById(AbstractC19183f.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f3649g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m4735a(z12, z13);
        }
        if (!z11) {
            View view = this.f3649g;
            if (view == null) {
                view = this.f3624A;
            }
            if (view != null) {
                if (z13) {
                    i11 = 2;
                }
                m4714p(m4712i2, view, z12 | i11, 3);
            }
        }
        ListView listView2 = this.f3649g;
        if (listView2 != null && (listAdapter = this.f3631H) != null) {
            listView2.setAdapter(listAdapter);
            int i12 = this.f3632I;
            if (i12 > -1) {
                listView2.setItemChecked(i12, true);
                listView2.setSelection(i12);
            }
        }
    }

    /* renamed from: z */
    private static boolean m4720z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC19178a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m4721c(int i11) {
        TypedValue typedValue = new TypedValue();
        this.f3643a.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m4722d() {
        return this.f3649g;
    }

    /* renamed from: e */
    public void m4723e() {
        this.f3644b.setContentView(m4713j());
        m4719y();
    }

    /* renamed from: g */
    public boolean m4724g(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3624A;
        if (nestedScrollView != null && nestedScrollView.m8321J(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m4725h(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3624A;
        if (nestedScrollView != null && nestedScrollView.m8321J(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m4726k(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f3641R.obtainMessage(i11, onClickListener);
        }
        if (i11 != -3) {
            if (i11 != -2) {
                if (i11 == -1) {
                    this.f3658p = charSequence;
                    this.f3659q = message;
                    this.f3660r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f3662t = charSequence;
            this.f3663u = message;
            this.f3664v = drawable;
            return;
        }
        this.f3666x = charSequence;
        this.f3667y = message;
        this.f3668z = drawable;
    }

    /* renamed from: l */
    public void m4727l(View view) {
        this.f3630G = view;
    }

    /* renamed from: m */
    public void m4728m(int i11) {
        this.f3626C = null;
        this.f3625B = i11;
        ImageView imageView = this.f3627D;
        if (imageView != null) {
            if (i11 != 0) {
                imageView.setVisibility(0);
                this.f3627D.setImageResource(this.f3625B);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: n */
    public void m4729n(Drawable drawable) {
        this.f3626C = drawable;
        this.f3625B = 0;
        ImageView imageView = this.f3627D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f3627D.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: o */
    public void m4730o(CharSequence charSequence) {
        this.f3648f = charSequence;
        TextView textView = this.f3629F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m4731q(CharSequence charSequence) {
        this.f3647e = charSequence;
        TextView textView = this.f3628E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m4732r(int i11) {
        this.f3650h = null;
        this.f3651i = i11;
        this.f3656n = false;
    }

    /* renamed from: s */
    public void m4733s(View view) {
        this.f3650h = view;
        this.f3651i = 0;
        this.f3656n = false;
    }

    /* renamed from: t */
    public void m4734t(View view, int i11, int i12, int i13, int i14) {
        this.f3650h = view;
        this.f3651i = 0;
        this.f3656n = true;
        this.f3652j = i11;
        this.f3653k = i12;
        this.f3654l = i13;
        this.f3655m = i14;
    }
}
