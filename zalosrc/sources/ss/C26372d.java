package ss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Switch;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.C23212s8;
import p588vw.C28652r;

/* renamed from: ss.d */
/* loaded from: classes4.dex */
public final class C26372d extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final LayoutInflater f125272r;

    /* renamed from: s */
    private final ArrayList f125273s;

    /* renamed from: t */
    private e f125274t;

    /* renamed from: ss.d$a */
    /* loaded from: classes4.dex */
    private static final class a extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: ss.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends d {

        /* renamed from: c */
        private C26376h f125275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26376h c26376h, long j11) {
            super(0, j11);
            AbstractC19074t.m100208f(c26376h, "autoReplyItem");
            this.f125275c = c26376h;
        }

        /* renamed from: c */
        public final C26376h m135785c() {
            return this.f125275c;
        }
    }

    /* renamed from: ss.d$c */
    /* loaded from: classes4.dex */
    private static final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final RobotoTextView f125276I;

        /* renamed from: J */
        private final Switch f125277J;

        /* renamed from: K */
        private final RobotoTextView f125278K;

        /* renamed from: L */
        private final RobotoTextView f125279L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            View findViewById = view.findViewById(AbstractC6918a0.time_range_tv);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f125276I = (RobotoTextView) findViewById;
            View findViewById2 = view.findViewById(AbstractC6918a0.enable_switch);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            Switch r02 = (Switch) findViewById2;
            this.f125277J = r02;
            View findViewById3 = view.findViewById(AbstractC6918a0.scope_tv);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            this.f125278K = (RobotoTextView) findViewById3;
            View findViewById4 = view.findViewById(AbstractC6918a0.content_tv);
            AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
            this.f125279L = (RobotoTextView) findViewById4;
            r02.setIdTracking("auto_reply_item_switch");
        }

        /* renamed from: i0 */
        public final Switch m135786i0() {
            return this.f125277J;
        }

        /* renamed from: j0 */
        public final RobotoTextView m135787j0() {
            return this.f125279L;
        }

        /* renamed from: k0 */
        public final RobotoTextView m135788k0() {
            return this.f125278K;
        }

        /* renamed from: l0 */
        public final RobotoTextView m135789l0() {
            return this.f125276I;
        }
    }

    /* renamed from: ss.d$d */
    /* loaded from: classes4.dex */
    public static class d {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private int f125280a;

        /* renamed from: b */
        private long f125281b;

        /* renamed from: ss.d$d$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public d(int i11, long j11) {
            this.f125280a = i11;
            this.f125281b = j11;
        }

        /* renamed from: a */
        public final long m135790a() {
            return this.f125281b;
        }

        /* renamed from: b */
        public final int m135791b() {
            return this.f125280a;
        }

        public /* synthetic */ d(int i11, long j11, int i12, AbstractC19060k abstractC19060k) {
            this(i11, (i12 & 2) != 0 ? -1L : j11);
        }
    }

    /* renamed from: ss.d$e */
    /* loaded from: classes4.dex */
    public interface e {
        /* renamed from: a */
        void mo78250a();

        /* renamed from: b */
        void mo78251b(long j11);

        /* renamed from: c */
        void mo78252c(C26376h c26376h, boolean z11);
    }

    public C26372d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f125272r = (LayoutInflater) systemService;
        this.f125273s = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m135779P(C26372d c26372d, C26376h c26376h, View view) {
        AbstractC19074t.m100208f(c26372d, "this$0");
        AbstractC19074t.m100208f(c26376h, "$arItem");
        e eVar = c26372d.f125274t;
        if (eVar != null) {
            eVar.mo78251b(c26376h.m135880g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m135780Q(C26372d c26372d, C26376h c26376h, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(c26372d, "this$0");
        AbstractC19074t.m100208f(c26376h, "$arItem");
        e eVar = c26372d.f125274t;
        if (eVar != null) {
            eVar.mo78252c(c26376h, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m135781R(C26372d c26372d, View view) {
        AbstractC19074t.m100208f(c26372d, "this$0");
        e eVar = c26372d.f125274t;
        if (eVar != null) {
            eVar.mo78250a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        try {
            int mo10005m = mo10005m(i11);
            if (mo10005m == 0 && (abstractC1876c0 instanceof c)) {
                d m135782O = m135782O(i11);
                if (m135782O instanceof b) {
                    final C26376h m135785c = ((b) m135782O).m135785c();
                    ((c) abstractC1876c0).m135789l0().setText(m135785c.m135889q(false));
                    ((c) abstractC1876c0).m135786i0().setOnCheckedChangeListener(null);
                    ((c) abstractC1876c0).m135786i0().m90686i(m135785c.m135878e(), false);
                    ((c) abstractC1876c0).m135788k0().setText(m135785c.m135885m());
                    ((c) abstractC1876c0).m135787j0().setText(C28652r.m143349v().m143357H(m135785c.m135876c()));
                    Context context = abstractC1876c0.f7784p.getContext();
                    if (m135785c.m135878e()) {
                        ((c) abstractC1876c0).m135789l0().setTextStyleBold(true);
                        ((c) abstractC1876c0).m135789l0().setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
                        ((c) abstractC1876c0).m135787j0().setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
                    } else {
                        ((c) abstractC1876c0).m135789l0().setTextStyleBold(false);
                        ((c) abstractC1876c0).m135789l0().setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_02));
                        ((c) abstractC1876c0).m135787j0().setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_03));
                    }
                    abstractC1876c0.f7784p.setOnClickListener(new View.OnClickListener() { // from class: ss.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C26372d.m135779P(C26372d.this, m135785c, view);
                        }
                    });
                    ((c) abstractC1876c0).m135786i0().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ss.b
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                            C26372d.m135780Q(C26372d.this, m135785c, compoundButton, z11);
                        }
                    });
                    return;
                }
                abstractC1876c0.f7784p.setOnClickListener(null);
                ((c) abstractC1876c0).m135786i0().setOnClickListener(null);
                return;
            }
            if (mo10005m == 2) {
                Button button = (Button) abstractC1876c0.f7784p.findViewById(AbstractC6918a0.btn_create_empty);
                button.setIdTracking("button_create_empty_listing_ar");
                button.setOnClickListener(new View.OnClickListener() { // from class: ss.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C26372d.m135781R(C26372d.this, view);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    View inflate = this.f125272r.inflate(AbstractC7409c0.auto_reply_listing_empty_layout, viewGroup, false);
                    AbstractC19074t.m100205c(inflate);
                    return new a(inflate);
                }
                throw new ClassCastException("Unknown viewType " + i11);
            }
            View inflate2 = this.f125272r.inflate(AbstractC7409c0.auto_reply_item_desc, viewGroup, false);
            AbstractC19074t.m100205c(inflate2);
            return new a(inflate2);
        }
        View inflate3 = this.f125272r.inflate(AbstractC7409c0.auto_reply_item_card_layout, viewGroup, false);
        AbstractC19074t.m100205c(inflate3);
        return new c(inflate3);
    }

    /* renamed from: O */
    public final d m135782O(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < mo10003k()) {
                    return (d) this.f125273s.get(i11);
                }
                return null;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
        return null;
    }

    /* renamed from: S */
    public final void m135783S(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "models");
        ArrayList arrayList2 = this.f125273s;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    /* renamed from: T */
    public final void m135784T(e eVar) {
        this.f125274t = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f125273s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        d m135782O = m135782O(i11);
        if (m135782O != null) {
            return m135782O.m135790a();
        }
        return super.mo10004l(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        try {
            d m135782O = m135782O(i11);
            if (m135782O != null) {
                return m135782O.m135791b();
            }
            return 0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return 0;
        }
    }
}
