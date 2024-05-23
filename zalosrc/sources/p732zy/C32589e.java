package p732zy;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zview.AbstractC17466e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p732zy.C32596l;

/* renamed from: zy.e */
/* loaded from: classes4.dex */
public final class C32589e extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final Context f150576r;

    /* renamed from: s */
    private final LayoutInflater f150577s;

    /* renamed from: t */
    private final C23528a f150578t;

    /* renamed from: u */
    private final ArrayList f150579u;

    /* renamed from: v */
    private a f150580v;

    /* renamed from: zy.e$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo83375a();

        /* renamed from: b */
        void mo83376b(C32596l c32596l);

        /* renamed from: c */
        void mo83377c(C32596l c32596l);

        /* renamed from: d */
        void mo83378d();
    }

    /* renamed from: zy.e$b */
    /* loaded from: classes4.dex */
    private static final class b extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: zy.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends e {

        /* renamed from: b */
        private C32596l f150581b;

        /* renamed from: c */
        private boolean f150582c;

        /* renamed from: d */
        private boolean f150583d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C32596l c32596l, boolean z11, boolean z12) {
            super(0);
            AbstractC19074t.m100208f(c32596l, "quickMessageItem");
            this.f150581b = c32596l;
            this.f150582c = z11;
            this.f150583d = z12;
        }

        /* renamed from: b */
        public final C32596l m157727b() {
            return this.f150581b;
        }

        /* renamed from: c */
        public final boolean m157728c() {
            return this.f150583d;
        }

        /* renamed from: d */
        public final boolean m157729d() {
            return this.f150582c;
        }

        public /* synthetic */ c(C32596l c32596l, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
            this(c32596l, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? true : z12);
        }
    }

    /* renamed from: zy.e$d */
    /* loaded from: classes4.dex */
    private static final class d extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final ListItem f150584I;

        /* renamed from: J */
        private final RobotoTextView f150585J;

        /* renamed from: K */
        private final RecyclingImageView f150586K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ListItem listItem) {
            super(listItem);
            AbstractC19074t.m100208f(listItem, "itemView");
            this.f150584I = listItem;
            this.f150585J = (RobotoTextView) listItem.getTopItem();
            this.f150586K = (RecyclingImageView) listItem.getTrailingItem();
        }

        /* renamed from: i0 */
        public final RecyclingImageView m157730i0() {
            return this.f150586K;
        }

        /* renamed from: j0 */
        public final RobotoTextView m157731j0() {
            return this.f150585J;
        }

        /* renamed from: k0 */
        public final ListItem m157732k0() {
            return this.f150584I;
        }
    }

    /* renamed from: zy.e$e */
    /* loaded from: classes4.dex */
    public static class e {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private int f150587a;

        /* renamed from: zy.e$e$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public e(int i11) {
            this.f150587a = i11;
        }

        /* renamed from: a */
        public final int m157733a() {
            return this.f150587a;
        }
    }

    public C32589e(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f150576r = context;
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f150577s = (LayoutInflater) systemService;
        this.f150578t = new C23528a(context);
        this.f150579u = new ArrayList();
    }

    /* renamed from: Q */
    public static final void m157720Q(C32589e c32589e, C32596l c32596l, View view) {
        AbstractC19074t.m100208f(c32589e, "this$0");
        AbstractC19074t.m100208f(c32596l, "$qmItem");
        a aVar = c32589e.f150580v;
        if (aVar != null) {
            aVar.mo83376b(c32596l);
        }
    }

    /* renamed from: R */
    public static final boolean m157721R(C32589e c32589e, C32596l c32596l, View view) {
        AbstractC19074t.m100208f(c32589e, "this$0");
        AbstractC19074t.m100208f(c32596l, "$qmItem");
        a aVar = c32589e.f150580v;
        if (aVar != null) {
            aVar.mo83377c(c32596l);
            return true;
        }
        return true;
    }

    /* renamed from: S */
    public static final void m157722S(C32589e c32589e, View view) {
        AbstractC19074t.m100208f(c32589e, "this$0");
        a aVar = c32589e.f150580v;
        if (aVar != null) {
            aVar.mo83375a();
        }
    }

    /* renamed from: T */
    public static final void m157723T(C32589e c32589e, View view) {
        AbstractC19074t.m100208f(c32589e, "this$0");
        a aVar = c32589e.f150580v;
        if (aVar != null) {
            aVar.mo83378d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0005, B:5:0x000c, B:7:0x0010, B:9:0x0018, B:11:0x002f, B:12:0x0041, B:15:0x0066, B:18:0x007e, B:21:0x012d, B:24:0x0089, B:25:0x008e, B:27:0x0094, B:29:0x009c, B:32:0x00a3, B:33:0x00c8, B:36:0x00d6, B:38:0x00df, B:39:0x00e4, B:41:0x00ea, B:43:0x00f0, B:44:0x00d2, B:45:0x00b6, B:47:0x010e, B:50:0x012a, B:51:0x004e, B:52:0x0035, B:60:0x0164, B:63:0x016f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0005, B:5:0x000c, B:7:0x0010, B:9:0x0018, B:11:0x002f, B:12:0x0041, B:15:0x0066, B:18:0x007e, B:21:0x012d, B:24:0x0089, B:25:0x008e, B:27:0x0094, B:29:0x009c, B:32:0x00a3, B:33:0x00c8, B:36:0x00d6, B:38:0x00df, B:39:0x00e4, B:41:0x00ea, B:43:0x00f0, B:44:0x00d2, B:45:0x00b6, B:47:0x010e, B:50:0x012a, B:51:0x004e, B:52:0x0035, B:60:0x0164, B:63:0x016f), top: B:2:0x0005 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        int m119611s;
        String str;
        RecyclingImageView m157730i0;
        RecyclingImageView m157730i02;
        C32596l.b m157833h;
        C32596l.c.C33080c m157839b;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        try {
            int mo10005m = mo10005m(i11);
            if (mo10005m == 0 && (abstractC1876c0 instanceof d)) {
                e m157724P = m157724P(i11);
                if (m157724P instanceof c) {
                    C32596l m157727b = ((c) m157724P).m157727b();
                    ListItem m157732k0 = ((d) abstractC1876c0).m157732k0();
                    if (((c) m157724P).m157729d()) {
                        m119611s = AbstractC17466e.transparent;
                    } else {
                        m119611s = C23212s8.m119611s(abstractC1876c0.f7784p.getContext(), AbstractC16781w.PrimaryBackgroundColor);
                    }
                    m157732k0.setBackgroundResource(m119611s);
                    RobotoTextView m157731j0 = ((d) abstractC1876c0).m157731j0();
                    if (m157731j0 != null) {
                        m157731j0.setText("/" + m157727b.m157831f());
                    }
                    ((d) abstractC1876c0).m157732k0().setTitle(m157727b.m157829d());
                    int m157835j = m157727b.m157835j();
                    if (m157835j != 0) {
                        if (m157835j != 1) {
                            RecyclingImageView m157730i03 = ((d) abstractC1876c0).m157730i0();
                            if (m157730i03 != null) {
                                m157730i03.setVisibility(8);
                            }
                        } else {
                            C32596l.d m157834i = m157727b.m157834i();
                            if (m157834i != null) {
                                str = m157834i.m157857b();
                            } else {
                                str = null;
                            }
                            if (str != null && str.length() != 0) {
                                ((d) abstractC1876c0).m157732k0().setTitleColor(C23212s8.m119607o(this.f150576r, AbstractC21196a.TextColor1));
                                m157730i0 = ((d) abstractC1876c0).m157730i0();
                                if (m157730i0 == null) {
                                    m157730i0.setVisibility(0);
                                }
                                m157730i02 = ((d) abstractC1876c0).m157730i0();
                                if (m157730i02 != null) {
                                    m157730i02.setImageResource(AbstractC16803z.no_image2);
                                }
                                m157833h = m157727b.m157833h();
                                if (m157833h != null && (m157839b = m157833h.m157839b()) != null) {
                                }
                            }
                            ((d) abstractC1876c0).m157732k0().setTitleColor(C23212s8.m119607o(this.f150576r, AbstractC2807a.text_02));
                            m157730i0 = ((d) abstractC1876c0).m157730i0();
                            if (m157730i0 == null) {
                            }
                            m157730i02 = ((d) abstractC1876c0).m157730i0();
                            if (m157730i02 != null) {
                            }
                            m157833h = m157727b.m157833h();
                            if (m157833h != null) {
                            }
                        }
                    } else {
                        ((d) abstractC1876c0).m157732k0().setTitleColor(C23212s8.m119607o(this.f150576r, AbstractC21196a.TextColor1));
                        RecyclingImageView m157730i04 = ((d) abstractC1876c0).m157730i0();
                        if (m157730i04 != null) {
                            m157730i04.setVisibility(8);
                        }
                    }
                    ((d) abstractC1876c0).m157732k0().m90592m(((c) m157724P).m157728c());
                    ((d) abstractC1876c0).m157732k0().setOnClickListener(new View.OnClickListener() { // from class: zy.a

                        /* renamed from: q */
                        public final /* synthetic */ C32596l f150571q;

                        public /* synthetic */ ViewOnClickListenerC32585a(C32596l m157727b2) {
                            r2 = m157727b2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C32589e.m157720Q(C32589e.this, r2, view);
                        }
                    });
                    ((d) abstractC1876c0).m157732k0().setOnLongClickListener(new View.OnLongClickListener() { // from class: zy.b

                        /* renamed from: q */
                        public final /* synthetic */ C32596l f150573q;

                        public /* synthetic */ ViewOnLongClickListenerC32586b(C32596l m157727b2) {
                            r2 = m157727b2;
                        }

                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            boolean m157721R;
                            m157721R = C32589e.m157721R(C32589e.this, r2, view);
                            return m157721R;
                        }
                    });
                    return;
                }
                return;
            }
            if (mo10005m != 2 && mo10005m != 3) {
                if (mo10005m == 1) {
                    abstractC1876c0.f7784p.setOnClickListener(new View.OnClickListener() { // from class: zy.d
                        public /* synthetic */ ViewOnClickListenerC32588d() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C32589e.m157723T(C32589e.this, view);
                        }
                    });
                    return;
                }
                return;
            }
            ((RobotoTextView) abstractC1876c0.f7784p.findViewById(AbstractC6918a0.btn_create_empty)).setOnClickListener(new View.OnClickListener() { // from class: zy.c
                public /* synthetic */ ViewOnClickListenerC32587c() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C32589e.m157722S(C32589e.this, view);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        RecyclerView.AbstractC1876c0 dVar;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        View inflate = this.f150577s.inflate(AbstractC7409c0.quick_message_bottom_sheet_empty_layout, viewGroup, false);
                        AbstractC19074t.m100205c(inflate);
                        return new b(inflate);
                    }
                    throw new ClassCastException("Unknown viewType " + i11);
                }
                View inflate2 = this.f150577s.inflate(AbstractC7409c0.quick_message_listing_empty_layout, viewGroup, false);
                AbstractC19074t.m100205c(inflate2);
                return new b(inflate2);
            }
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            Button button = new Button(context);
            button.setIdTracking("quick_message_item_btn_open_full_manage_view");
            button.m90539c(AbstractC2814h.ButtonLarge_Tertiary);
            button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_quick_message_title));
            button.setPadding(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f));
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            }
            marginLayoutParams.setMargins(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(8.0f));
            button.setLayoutParams(marginLayoutParams);
            dVar = new b(button);
        } else {
            Context context2 = viewGroup.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            ListItem listItem = new ListItem(context2);
            listItem.setIdTracking("quick_message_list_item");
            listItem.setTitleMaxLine(2);
            listItem.m90591l(AbstractC23136l9.m118742r(16.0f), 0, 0, 0);
            Context context3 = viewGroup.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context3);
            robotoTextView.setId(AbstractC6918a0.qmi_keyword_roboto_text_view);
            robotoTextView.setPadding(AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(4.0f));
            robotoTextView.setTextSize(1, 14.0f);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_02));
            robotoTextView.setFontStyle(7);
            robotoTextView.setIncludeFontPadding(false);
            robotoTextView.setBackground(AbstractC23136l9.m118665N(robotoTextView.getContext(), AbstractC16803z.frame_5526));
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setMaxLines(1);
            listItem.m90588d(robotoTextView);
            RecyclingImageView recyclingImageView = new RecyclingImageView(viewGroup.getContext());
            recyclingImageView.setId(AbstractC6918a0.qmi_attachment_image_view);
            recyclingImageView.setLayoutParams(new ViewGroup.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f)));
            recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            listItem.m90589e(recyclingImageView);
            dVar = new d(listItem);
        }
        return dVar;
    }

    /* renamed from: P */
    public final e m157724P(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < mo10003k()) {
                    return (e) this.f150579u.get(i11);
                }
                return null;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
        return null;
    }

    /* renamed from: U */
    public final void m157725U(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "models");
        ArrayList arrayList2 = this.f150579u;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    /* renamed from: V */
    public final void m157726V(a aVar) {
        this.f150580v = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f150579u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        try {
            e m157724P = m157724P(i11);
            if (m157724P != null) {
                return m157724P.m157733a();
            }
            return 0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return 0;
        }
    }
}
