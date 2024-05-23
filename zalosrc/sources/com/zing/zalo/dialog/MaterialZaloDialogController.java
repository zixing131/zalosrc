package com.zing.zalo.dialog;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.dialog.MaterialZaloDialogController;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import java.lang.ref.WeakReference;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes3.dex */
public class MaterialZaloDialogController {

    /* renamed from: A */
    LinearLayout f43577A;

    /* renamed from: B */
    ImageView f43578B;

    /* renamed from: C */
    TextView f43579C;

    /* renamed from: D */
    TextView f43580D;

    /* renamed from: E */
    View f43581E;

    /* renamed from: F */
    boolean f43582F;

    /* renamed from: G */
    ListAdapter f43583G;

    /* renamed from: I */
    Handler f43585I;

    /* renamed from: a */
    final InterfaceC17463d f43596a;

    /* renamed from: b */
    private final C17465f f43597b;

    /* renamed from: c */
    final Context f43598c;

    /* renamed from: d */
    CharSequence f43599d;

    /* renamed from: e */
    CharSequence f43600e;

    /* renamed from: f */
    MovementMethod f43601f;

    /* renamed from: g */
    ListView f43602g;

    /* renamed from: h */
    View f43603h;

    /* renamed from: i */
    View f43604i;

    /* renamed from: j */
    int f43605j;

    /* renamed from: k */
    int f43606k;

    /* renamed from: l */
    int f43607l;

    /* renamed from: m */
    int f43608m;

    /* renamed from: o */
    Button f43610o;

    /* renamed from: p */
    CharSequence f43611p;

    /* renamed from: q */
    Message f43612q;

    /* renamed from: r */
    Button f43613r;

    /* renamed from: s */
    CharSequence f43614s;

    /* renamed from: t */
    Message f43615t;

    /* renamed from: u */
    Button f43616u;

    /* renamed from: v */
    CharSequence f43617v;

    /* renamed from: w */
    Message f43618w;

    /* renamed from: x */
    ScrollView f43619x;

    /* renamed from: z */
    Drawable f43621z;

    /* renamed from: n */
    boolean f43609n = false;

    /* renamed from: y */
    int f43620y = -1;

    /* renamed from: H */
    int f43584H = -1;

    /* renamed from: J */
    boolean f43586J = true;

    /* renamed from: K */
    boolean f43587K = false;

    /* renamed from: L */
    boolean f43588L = false;

    /* renamed from: M */
    int f43589M = 0;

    /* renamed from: N */
    int f43590N = 0;

    /* renamed from: O */
    int f43591O = 1;

    /* renamed from: P */
    int f43592P = 0;

    /* renamed from: Q */
    boolean f43593Q = true;

    /* renamed from: R */
    boolean f43594R = false;

    /* renamed from: S */
    View.OnClickListener f43595S = new ViewOnClickListenerC7991a();

    /* loaded from: classes3.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: p */
        boolean f43622p;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f43622p = true;
        }

        public RecycleListView(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.f43622p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.MaterialZaloDialogController$a */
    /* loaded from: classes3.dex */
    public class ViewOnClickListenerC7991a implements View.OnClickListener {
        ViewOnClickListenerC7991a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            MaterialZaloDialogController materialZaloDialogController = MaterialZaloDialogController.this;
            if (view == materialZaloDialogController.f43610o && (message4 = materialZaloDialogController.f43612q) != null) {
                message = Message.obtain(message4);
            } else if (view == materialZaloDialogController.f43613r && (message3 = materialZaloDialogController.f43615t) != null) {
                message = Message.obtain(message3);
            } else if (view == materialZaloDialogController.f43616u && (message2 = materialZaloDialogController.f43618w) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            MaterialZaloDialogController materialZaloDialogController2 = MaterialZaloDialogController.this;
            if (materialZaloDialogController2.f43586J) {
                materialZaloDialogController2.f43585I.obtainMessage(1, materialZaloDialogController2.f43596a).sendToTarget();
            }
        }
    }

    /* renamed from: com.zing.zalo.dialog.MaterialZaloDialogController$b */
    /* loaded from: classes3.dex */
    public static class C7992b {

        /* renamed from: A */
        public int f43624A;

        /* renamed from: C */
        public boolean[] f43626C;

        /* renamed from: D */
        public boolean f43627D;

        /* renamed from: E */
        public boolean f43628E;

        /* renamed from: G */
        public Cursor f43630G;

        /* renamed from: H */
        public String f43631H;

        /* renamed from: I */
        public String f43632I;

        /* renamed from: J */
        public boolean f43633J;

        /* renamed from: K */
        public AdapterView.OnItemSelectedListener f43634K;

        /* renamed from: a */
        public final Context f43645a;

        /* renamed from: b */
        public final LayoutInflater f43646b;

        /* renamed from: d */
        public Drawable f43648d;

        /* renamed from: e */
        public CharSequence f43649e;

        /* renamed from: f */
        public View f43650f;

        /* renamed from: g */
        public CharSequence f43651g;

        /* renamed from: h */
        public MovementMethod f43652h;

        /* renamed from: i */
        public CharSequence f43653i;

        /* renamed from: j */
        public InterfaceC17463d.d f43654j;

        /* renamed from: k */
        public CharSequence f43655k;

        /* renamed from: l */
        public InterfaceC17463d.d f43656l;

        /* renamed from: m */
        public CharSequence f43657m;

        /* renamed from: n */
        public InterfaceC17463d.d f43658n;

        /* renamed from: o */
        public CharSequence f43659o;

        /* renamed from: p */
        public InterfaceC17463d.d f43660p;

        /* renamed from: r */
        public InterfaceC17463d.c f43662r;

        /* renamed from: s */
        public InterfaceC17463d.f f43663s;

        /* renamed from: t */
        public CharSequence[] f43664t;

        /* renamed from: u */
        public ListAdapter f43665u;

        /* renamed from: v */
        public InterfaceC17463d.d f43666v;

        /* renamed from: w */
        public View f43667w;

        /* renamed from: x */
        public int f43668x;

        /* renamed from: y */
        public int f43669y;

        /* renamed from: z */
        public int f43670z;

        /* renamed from: c */
        public int f43647c = -1;

        /* renamed from: B */
        public boolean f43625B = false;

        /* renamed from: F */
        public int f43629F = -1;

        /* renamed from: L */
        public boolean f43635L = true;

        /* renamed from: M */
        public boolean f43636M = true;

        /* renamed from: N */
        public boolean f43637N = false;

        /* renamed from: O */
        public boolean f43638O = false;

        /* renamed from: P */
        public int f43639P = 2;

        /* renamed from: Q */
        public int f43640Q = 0;

        /* renamed from: R */
        public int f43641R = 0;

        /* renamed from: S */
        public int f43642S = 0;

        /* renamed from: T */
        public boolean f43643T = true;

        /* renamed from: U */
        public boolean f43644U = false;

        /* renamed from: q */
        public boolean f43661q = true;

        /* renamed from: com.zing.zalo.dialog.MaterialZaloDialogController$b$a */
        /* loaded from: classes3.dex */
        public class a extends ArrayAdapter {

            /* renamed from: p */
            final /* synthetic */ RecycleListView f43671p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i11, int i12, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i11, i12, charSequenceArr);
                this.f43671p = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i11, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i11, view, viewGroup);
                boolean[] zArr = C7992b.this.f43626C;
                if (zArr != null && zArr[i11]) {
                    this.f43671p.setItemChecked(i11, true);
                }
                return view2;
            }
        }

        /* renamed from: com.zing.zalo.dialog.MaterialZaloDialogController$b$b */
        /* loaded from: classes3.dex */
        public class b extends CursorAdapter {

            /* renamed from: p */
            private final int f43673p;

            /* renamed from: q */
            private final int f43674q;

            /* renamed from: r */
            final /* synthetic */ RecycleListView f43675r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z11, RecycleListView recycleListView) {
                super(context, cursor, z11);
                this.f43675r = recycleListView;
                Cursor cursor2 = getCursor();
                this.f43673p = cursor2.getColumnIndexOrThrow(C7992b.this.f43631H);
                this.f43674q = cursor2.getColumnIndexOrThrow(C7992b.this.f43632I);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(AbstractC6918a0.text1)).setText(cursor.getString(this.f43673p));
                RecycleListView recycleListView = this.f43675r;
                int position = cursor.getPosition();
                boolean z11 = true;
                if (cursor.getInt(this.f43674q) != 1) {
                    z11 = false;
                }
                recycleListView.setItemChecked(position, z11);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C7992b.this.f43646b.inflate(AbstractC7409c0.zalo_select_dialog_multichoice, viewGroup, false);
            }
        }

        public C7992b(Context context) {
            this.f43645a = context;
            this.f43646b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: d */
        public /* synthetic */ void m43038d(MaterialZaloDialogController materialZaloDialogController, AdapterView adapterView, View view, int i11, long j11) {
            this.f43666v.mo605K8(materialZaloDialogController.f43596a, i11);
            if (!this.f43628E) {
                materialZaloDialogController.f43596a.dismiss();
            }
        }

        /* renamed from: b */
        public void m43039b(MaterialZaloDialogController materialZaloDialogController) {
            View view = this.f43650f;
            if (view != null) {
                materialZaloDialogController.m43020j(view);
            } else {
                if (this.f43649e != null) {
                    materialZaloDialogController.m43027q(this.f43639P);
                    materialZaloDialogController.m43026p(this.f43649e);
                }
                Drawable drawable = this.f43648d;
                if (drawable != null) {
                    materialZaloDialogController.m43022l(drawable);
                }
                int i11 = this.f43647c;
                if (i11 >= 0) {
                    materialZaloDialogController.m43021k(i11);
                }
            }
            CharSequence charSequence = this.f43651g;
            if (charSequence != null) {
                materialZaloDialogController.m43024n(charSequence);
            }
            MovementMethod movementMethod = this.f43652h;
            if (movementMethod != null) {
                materialZaloDialogController.m43025o(movementMethod);
            }
            CharSequence charSequence2 = this.f43653i;
            if (charSequence2 != null) {
                materialZaloDialogController.m43015e(-1, charSequence2, this.f43654j, null);
            }
            CharSequence charSequence3 = this.f43655k;
            if (charSequence3 != null) {
                materialZaloDialogController.m43015e(-2, charSequence3, this.f43656l, null);
            }
            CharSequence charSequence4 = this.f43657m;
            if (charSequence4 != null) {
                materialZaloDialogController.m43015e(-3, charSequence4, this.f43658n, null);
            }
            CharSequence charSequence5 = this.f43659o;
            if (charSequence5 != null) {
                materialZaloDialogController.m43015e(-4, charSequence5, this.f43660p, null);
            }
            if (this.f43633J) {
                materialZaloDialogController.m43023m(true);
            }
            if (this.f43664t != null || this.f43630G != null || this.f43665u != null) {
                m43040c(materialZaloDialogController);
            }
            View view2 = this.f43667w;
            if (view2 != null) {
                if (this.f43625B) {
                    materialZaloDialogController.m43033w(view2, this.f43668x, this.f43669y, this.f43670z, this.f43624A);
                } else {
                    materialZaloDialogController.m43032v(view2);
                }
                boolean z11 = this.f43637N;
                if (z11) {
                    materialZaloDialogController.m43029s(z11);
                }
                int i12 = this.f43640Q;
                if (i12 > 0) {
                    materialZaloDialogController.m43019i(i12);
                }
                boolean z12 = this.f43638O;
                if (z12) {
                    materialZaloDialogController.m43028r(z12);
                }
            }
            materialZaloDialogController.m43030t(this.f43643T);
            materialZaloDialogController.m43031u(this.f43644U);
            materialZaloDialogController.m43016f(this.f43636M);
            materialZaloDialogController.m43017g(this.f43641R);
            materialZaloDialogController.m43018h(this.f43642S);
        }

        /* renamed from: c */
        void m43040c(MaterialZaloDialogController materialZaloDialogController) {
            int i11;
            ListAdapter simpleCursorAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f43646b.inflate(AbstractC7409c0.zalo_select_dialog, (ViewGroup) null);
            if (this.f43627D) {
                if (this.f43630G == null) {
                    simpleCursorAdapter = new a(this.f43645a, AbstractC7409c0.zalo_select_dialog_multichoice, AbstractC6918a0.text1, this.f43664t, recycleListView);
                } else {
                    simpleCursorAdapter = new b(this.f43645a, this.f43630G, false, recycleListView);
                }
            } else {
                if (this.f43628E) {
                    i11 = AbstractC7409c0.select_dialog_singlechoice;
                } else {
                    i11 = AbstractC7409c0.zalo_select_dialog_item;
                }
                int i12 = i11;
                if (this.f43630G == null) {
                    ListAdapter listAdapter = this.f43665u;
                    if (listAdapter == null) {
                        listAdapter = new ArrayAdapter(this.f43645a, i12, AbstractC6918a0.text1, this.f43664t);
                    }
                    simpleCursorAdapter = listAdapter;
                } else {
                    simpleCursorAdapter = new SimpleCursorAdapter(this.f43645a, i12, this.f43630G, new String[]{this.f43631H}, new int[]{AbstractC6918a0.text1});
                }
            }
            materialZaloDialogController.f43583G = simpleCursorAdapter;
            materialZaloDialogController.f43584H = this.f43629F;
            if (this.f43666v != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: bn.z0

                    /* renamed from: q */
                    public final /* synthetic */ MaterialZaloDialogController f11595q;

                    public /* synthetic */ C2930z0(MaterialZaloDialogController materialZaloDialogController2) {
                        r2 = materialZaloDialogController2;
                    }

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView adapterView, View view, int i13, long j11) {
                        MaterialZaloDialogController.C7992b.this.m43038d(r2, adapterView, view, i13, j11);
                    }
                });
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f43634K;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f43628E) {
                recycleListView.setChoiceMode(1);
            } else if (this.f43627D) {
                recycleListView.setChoiceMode(2);
            }
            recycleListView.f43622p = this.f43635L;
            materialZaloDialogController2.f43602g = recycleListView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.dialog.MaterialZaloDialogController$c */
    /* loaded from: classes3.dex */
    public static final class HandlerC7993c extends Handler {

        /* renamed from: a */
        WeakReference f43677a;

        public HandlerC7993c(InterfaceC17463d interfaceC17463d) {
            this.f43677a = new WeakReference(interfaceC17463d);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != -4 && i11 != -3 && i11 != -2 && i11 != -1) {
                if (i11 == 1) {
                    ((InterfaceC17463d) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((InterfaceC17463d.d) message.obj).mo605K8((InterfaceC17463d) this.f43677a.get(), message.what);
        }
    }

    public MaterialZaloDialogController(Context context, InterfaceC17463d interfaceC17463d, C17465f c17465f) {
        this.f43598c = context;
        this.f43596a = interfaceC17463d;
        this.f43597b = c17465f;
        this.f43585I = new HandlerC7993c(interfaceC17463d);
    }

    /* renamed from: a */
    static boolean m43010a(View view) {
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
            if (m43010a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    void m43011A() {
        ListAdapter listAdapter;
        LinearLayout linearLayout;
        int i11;
        this.f43577A = (LinearLayout) this.f43597b.m92899f(AbstractC6918a0.parenLayout_alert_dlg);
        m43035y((LinearLayout) this.f43597b.m92899f(AbstractC6918a0.contentPanel));
        boolean m43034x = m43034x();
        m43036z((LinearLayout) this.f43597b.m92899f(AbstractC6918a0.topPanel));
        View m92899f = this.f43597b.m92899f(AbstractC6918a0.buttonPanel);
        if (!m43034x) {
            m92899f.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f43577A;
        if (linearLayout2 != null && (i11 = this.f43592P) != 0) {
            linearLayout2.setBackgroundResource(i11);
        }
        if (this.f43603h != null) {
            FrameLayout frameLayout = (FrameLayout) this.f43597b.m92899f(AbstractC6918a0.customPanel);
            frameLayout.addView(this.f43603h, new ViewGroup.LayoutParams(-1, -1));
            if (this.f43609n) {
                frameLayout.setPadding(this.f43605j, this.f43606k, this.f43607l, this.f43608m);
            }
            if (this.f43587K) {
                LinearLayout linearLayout3 = this.f43577A;
                if (linearLayout3 != null) {
                    linearLayout3.setBackgroundResource(0);
                }
                frameLayout.setBackgroundResource(0);
            }
            if (this.f43602g != null) {
                ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
            }
        } else {
            this.f43597b.m92899f(AbstractC6918a0.customPanel).setVisibility(8);
        }
        int i12 = this.f43589M;
        if (i12 > 0 && (linearLayout = this.f43577A) != null) {
            linearLayout.setPadding(i12, i12, i12, i12);
        }
        ListView listView = this.f43602g;
        if (listView != null && (listAdapter = this.f43583G) != null) {
            listView.setAdapter(listAdapter);
            int i13 = this.f43584H;
            if (i13 > -1) {
                this.f43602g.setItemChecked(i13, true);
                this.f43602g.setSelection(this.f43584H);
            }
        }
        View m92899f2 = this.f43597b.m92899f(AbstractC6918a0.topPanel_divider);
        this.f43604i = m92899f2;
        if (!this.f43593Q && m92899f2 != null) {
            m92899f2.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void m43012b() {
        View view = this.f43603h;
        if (view == null || !m43010a(view)) {
            this.f43597b.m92887F(131072, 131072);
        }
        this.f43597b.m92882A(AbstractC7409c0.material_zalo_dialog);
        m43011A();
    }

    /* renamed from: c */
    public boolean m43013c(int i11, KeyEvent keyEvent) {
        ScrollView scrollView = this.f43619x;
        if (scrollView != null && scrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m43014d(int i11, KeyEvent keyEvent) {
        ScrollView scrollView = this.f43619x;
        if (scrollView != null && scrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m43015e(int i11, CharSequence charSequence, InterfaceC17463d.d dVar, Message message) {
        if (message == null && dVar != null) {
            message = this.f43585I.obtainMessage(i11, dVar);
        }
        if (i11 != -4) {
            if (i11 != -3) {
                if (i11 != -2) {
                    if (i11 != -1) {
                        throw new IllegalArgumentException("Button does not exist");
                    }
                } else {
                    this.f43614s = charSequence;
                    this.f43615t = message;
                    return;
                }
            }
            this.f43611p = charSequence;
            this.f43612q = message;
            return;
        }
        this.f43617v = charSequence;
        this.f43618w = message;
    }

    /* renamed from: f */
    public void m43016f(boolean z11) {
        this.f43586J = z11;
    }

    /* renamed from: g */
    public void m43017g(int i11) {
        this.f43590N = i11;
    }

    /* renamed from: h */
    public void m43018h(int i11) {
        this.f43592P = i11;
    }

    /* renamed from: i */
    public void m43019i(int i11) {
        this.f43589M = i11;
    }

    /* renamed from: j */
    public void m43020j(View view) {
        this.f43581E = view;
    }

    /* renamed from: k */
    public void m43021k(int i11) {
        this.f43620y = i11;
        ImageView imageView = this.f43578B;
        if (imageView != null) {
            if (i11 > 0) {
                imageView.setImageResource(i11);
            } else if (i11 == 0) {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: l */
    public void m43022l(Drawable drawable) {
        this.f43621z = drawable;
        ImageView imageView = this.f43578B;
        if (imageView != null && drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: m */
    public void m43023m(boolean z11) {
        this.f43582F = z11;
    }

    /* renamed from: n */
    public void m43024n(CharSequence charSequence) {
        Spanned fromHtml;
        if (TextUtils.equals(this.f43600e, charSequence)) {
            return;
        }
        this.f43600e = charSequence;
        TextView textView = this.f43580D;
        if (textView != null) {
            if (this.f43594R) {
                if (Build.VERSION.SDK_INT >= 24) {
                    fromHtml = Html.fromHtml(String.valueOf(charSequence), 63);
                    textView.setText(fromHtml);
                    return;
                } else {
                    textView.setText(Html.fromHtml(String.valueOf(charSequence)));
                    return;
                }
            }
            textView.setText(charSequence);
        }
    }

    /* renamed from: o */
    public void m43025o(MovementMethod movementMethod) {
        TextView textView;
        this.f43601f = movementMethod;
        if (movementMethod != null && (textView = this.f43580D) != null) {
            textView.setMovementMethod(movementMethod);
        }
    }

    /* renamed from: p */
    public void m43026p(CharSequence charSequence) {
        this.f43599d = charSequence;
        TextView textView = this.f43579C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m43027q(int i11) {
        this.f43591O = i11;
    }

    /* renamed from: r */
    public void m43028r(boolean z11) {
        this.f43588L = z11;
    }

    /* renamed from: s */
    public void m43029s(boolean z11) {
        this.f43587K = z11;
    }

    /* renamed from: t */
    void m43030t(boolean z11) {
        View view;
        this.f43593Q = z11;
        if (!z11 && (view = this.f43604i) != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: u */
    void m43031u(boolean z11) {
        this.f43594R = z11;
    }

    /* renamed from: v */
    public void m43032v(View view) {
        this.f43603h = view;
        this.f43609n = false;
    }

    /* renamed from: w */
    public void m43033w(View view, int i11, int i12, int i13, int i14) {
        this.f43603h = view;
        this.f43609n = true;
        this.f43605j = i11;
        this.f43606k = i12;
        this.f43607l = i13;
        this.f43608m = i14;
    }

    /* renamed from: x */
    boolean m43034x() {
        int i11;
        View view;
        if (this.f43588L && (view = this.f43603h) != null) {
            Button button = (Button) view.findViewById(AbstractC6918a0.button1);
            this.f43610o = button;
            if (button != null) {
                button.setOnClickListener(this.f43595S);
            }
            Button button2 = (Button) this.f43603h.findViewById(AbstractC6918a0.button2);
            this.f43613r = button2;
            if (button2 != null) {
                button2.setOnClickListener(this.f43595S);
            }
            AbstractC23136l9.m118744r1(this.f43597b.m92899f(AbstractC6918a0.buttonPanel), 8);
            if (this.f43610o != null || this.f43613r != null) {
                return true;
            }
            return false;
        }
        Button button3 = (Button) this.f43597b.m92899f(AbstractC6918a0.button1);
        this.f43610o = button3;
        button3.setOnClickListener(this.f43595S);
        if (TextUtils.isEmpty(this.f43611p)) {
            this.f43610o.setVisibility(8);
            i11 = 0;
        } else {
            this.f43610o.setText(this.f43611p.toString().toUpperCase());
            this.f43610o.setVisibility(0);
            i11 = 1;
        }
        Button button4 = (Button) this.f43597b.m92899f(AbstractC6918a0.button2);
        this.f43613r = button4;
        button4.setOnClickListener(this.f43595S);
        if (TextUtils.isEmpty(this.f43614s)) {
            this.f43613r.setVisibility(8);
        } else {
            this.f43613r.setText(this.f43614s.toString().toUpperCase());
            this.f43613r.setVisibility(0);
            i11 |= 4;
        }
        Button button5 = (Button) this.f43597b.m92899f(AbstractC6918a0.button3);
        this.f43616u = button5;
        button5.setOnClickListener(this.f43595S);
        if (TextUtils.isEmpty(this.f43617v)) {
            this.f43616u.setVisibility(8);
        } else {
            this.f43616u.setText(this.f43617v.toString().toUpperCase());
            this.f43616u.setVisibility(0);
            i11 |= 2;
        }
        switch (this.f43590N) {
            case 1:
                Button button6 = this.f43613r;
                if (button6 != null) {
                    button6.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                }
                Button button7 = this.f43616u;
                if (button7 != null) {
                    button7.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                }
                Button button8 = this.f43610o;
                if (button8 != null) {
                    button8.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC7354t0.NotificationColor1));
                    if (TextUtils.isEmpty(this.f43610o.getText())) {
                        this.f43610o.setText(this.f43598c.getResources().getString(AbstractC8020f0.str_cap_delete));
                        break;
                    }
                }
                break;
            case 2:
                Button button9 = this.f43613r;
                if (button9 != null) {
                    button9.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                }
                Button button10 = this.f43616u;
                if (button10 != null) {
                    button10.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                }
                Button button11 = this.f43610o;
                if (button11 != null) {
                    button11.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC7354t0.NotificationColor1));
                    this.f43610o.setText(this.f43598c.getResources().getString(AbstractC8020f0.str_cap_delete));
                    break;
                }
                break;
            case 3:
                Button button12 = this.f43613r;
                if (button12 != null) {
                    button12.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                }
                Button button13 = this.f43616u;
                if (button13 != null) {
                    button13.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                }
                Button button14 = this.f43610o;
                if (button14 != null) {
                    button14.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                    break;
                }
                break;
            case 4:
                Button button15 = this.f43613r;
                if (button15 != null) {
                    button15.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                }
                Button button16 = this.f43616u;
                if (button16 != null) {
                    button16.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                }
                Button button17 = this.f43610o;
                if (button17 != null) {
                    button17.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                    break;
                }
                break;
            case 5:
                Button button18 = this.f43613r;
                if (button18 != null) {
                    button18.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                }
                Button button19 = this.f43616u;
                if (button19 != null) {
                    button19.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                }
                Button button20 = this.f43610o;
                if (button20 != null) {
                    button20.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                    break;
                }
                break;
            case 6:
                if (this.f43613r != null && !TextUtils.isEmpty(this.f43614s)) {
                    this.f43613r.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                    this.f43613r.setText(this.f43598c.getResources().getString(AbstractC8020f0.str_cap_okay));
                }
                if (this.f43616u != null && !TextUtils.isEmpty(this.f43614s)) {
                    this.f43616u.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                }
                if (this.f43610o != null && !TextUtils.isEmpty(this.f43611p)) {
                    this.f43610o.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                    this.f43610o.setText(this.f43598c.getResources().getString(AbstractC8020f0.str_cap_okay));
                    break;
                }
                break;
            case 7:
                if (this.f43613r != null && !TextUtils.isEmpty(this.f43614s)) {
                    this.f43613r.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                }
                if (this.f43616u != null && !TextUtils.isEmpty(this.f43614s)) {
                    this.f43616u.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                }
                if (this.f43610o != null && !TextUtils.isEmpty(this.f43611p)) {
                    this.f43610o.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC7354t0.NotificationColor1));
                    break;
                }
                break;
            case 8:
                if (this.f43613r != null && !TextUtils.isEmpty(this.f43614s)) {
                    this.f43613r.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                }
                if (this.f43616u != null && !TextUtils.isEmpty(this.f43614s)) {
                    this.f43616u.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                }
                if (this.f43610o != null && !TextUtils.isEmpty(this.f43611p)) {
                    this.f43610o.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC7354t0.NotificationColor1));
                    break;
                }
                break;
            case 9:
                if (this.f43613r != null && !TextUtils.isEmpty(this.f43614s)) {
                    this.f43613r.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC16781w.btn_type_3_text_n));
                }
                if (this.f43616u != null && !TextUtils.isEmpty(this.f43614s)) {
                    this.f43616u.setTextColor(AbstractC23136l9.m118641B(this.f43598c, AbstractC16801x.Light_btn_type_2_text_n));
                }
                if (this.f43610o != null && !TextUtils.isEmpty(this.f43611p)) {
                    this.f43610o.setTextColor(C23212s8.m119607o(this.f43598c, AbstractC7354t0.NotificationColor1));
                    break;
                }
                break;
        }
        if (i11 != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    void m43035y(LinearLayout linearLayout) {
        Spanned fromHtml;
        ScrollView scrollView = (ScrollView) this.f43597b.m92899f(AbstractC6918a0.scrollView);
        this.f43619x = scrollView;
        scrollView.setFocusable(false);
        TextView textView = (TextView) this.f43597b.m92899f(AbstractC6918a0.message);
        this.f43580D = textView;
        if (textView == null) {
            return;
        }
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(AbstractC16802y.dialog_message_line_spacing);
        float textSize = this.f43580D.getTextSize();
        float f11 = dimensionPixelSize;
        if (textSize < f11) {
            this.f43580D.setLineSpacing(0.0f, f11 / textSize);
        }
        CharSequence charSequence = this.f43600e;
        if (charSequence != null) {
            if (this.f43594R) {
                if (Build.VERSION.SDK_INT >= 24) {
                    TextView textView2 = this.f43580D;
                    fromHtml = Html.fromHtml(String.valueOf(charSequence), 63);
                    textView2.setText(fromHtml);
                } else {
                    this.f43580D.setText(Html.fromHtml(String.valueOf(charSequence)));
                }
            } else {
                this.f43580D.setText(charSequence);
            }
            MovementMethod movementMethod = this.f43601f;
            if (movementMethod != null) {
                this.f43580D.setMovementMethod(movementMethod);
                return;
            }
            return;
        }
        this.f43580D.setVisibility(8);
        this.f43619x.removeView(this.f43580D);
        if (this.f43602g != null) {
            linearLayout.removeView(this.f43597b.m92899f(AbstractC6918a0.scrollView));
            linearLayout.addView(this.f43602g, new LinearLayout.LayoutParams(-1, -1));
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            View m92899f = this.f43597b.m92899f(AbstractC6918a0.topPanel_divider);
            if (m92899f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m92899f.getLayoutParams();
                marginLayoutParams.bottomMargin = m92899f.getResources().getDimensionPixelSize(AbstractC16802y.dialog_title_divider_bottom_margin_small);
                m92899f.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        linearLayout.setVisibility(8);
    }

    /* renamed from: z */
    boolean m43036z(LinearLayout linearLayout) {
        if (this.f43581E != null) {
            linearLayout.addView(this.f43581E, new LinearLayout.LayoutParams(-1, -2));
            this.f43597b.m92899f(AbstractC6918a0.title_template).setVisibility(8);
            return true;
        }
        boolean z11 = !TextUtils.isEmpty(this.f43599d);
        this.f43578B = (ImageView) this.f43597b.m92899f(AbstractC6918a0.icon);
        if (z11) {
            TextView textView = (TextView) this.f43597b.m92899f(AbstractC6918a0.alertTitle);
            this.f43579C = textView;
            if (this.f43591O <= 1) {
                textView.setSingleLine(true);
            } else {
                textView.setSingleLine(false);
                this.f43579C.setMaxLines(this.f43591O);
            }
            this.f43579C.setText(this.f43599d);
            this.f43578B.setImageResource(AbstractC16803z.ico_pophead_default);
            int i11 = this.f43620y;
            if (i11 > 0) {
                this.f43578B.setImageResource(i11);
                this.f43578B.setVisibility(0);
                return true;
            }
            this.f43579C.setPadding(this.f43578B.getPaddingLeft(), this.f43578B.getPaddingTop(), this.f43578B.getPaddingRight(), this.f43578B.getPaddingBottom());
            this.f43578B.setVisibility(8);
            return true;
        }
        View m92899f = this.f43597b.m92899f(AbstractC6918a0.title_template);
        this.f43597b.m92899f(AbstractC6918a0.topPanel).setVisibility(8);
        View m92899f2 = this.f43597b.m92899f(AbstractC6918a0.topPanel_divider);
        if (m92899f2 != null) {
            m92899f2.setVisibility(8);
        }
        m92899f.setVisibility(8);
        this.f43578B.setVisibility(8);
        if (this.f43590N != 0) {
            this.f43597b.m92899f(AbstractC6918a0.top_padding_view).setVisibility(0);
        }
        try {
            int paddingBottom = this.f43597b.m92899f(AbstractC6918a0.parenLayout_alert_dlg).getPaddingBottom();
            this.f43597b.m92899f(AbstractC6918a0.parenLayout_alert_dlg).setPadding(0, paddingBottom, 0, paddingBottom);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }
}
