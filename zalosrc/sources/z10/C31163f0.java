package z10;

import a20.C0093d;
import a20.C0095f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.BlinkTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import java.util.ArrayList;
import java.util.List;
import mj0.AbstractC23322a;
import p338m2.InterfaceC22715a;
import pm0.C24848g0;
import q10.C25000e0;
import q10.C25004f0;
import q10.C25008g0;
import q10.C25016i0;
import q10.C25020j0;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27413h;

/* renamed from: z10.f0 */
/* loaded from: classes5.dex */
public final class C31163f0 extends RecyclerView.AbstractC1880g {
    public static final c Companion = new c(null);

    /* renamed from: r */
    private List f143694r;

    /* renamed from: s */
    private List f143695s;

    /* renamed from: t */
    private b f143696t;

    /* renamed from: u */
    private final C0093d f143697u;

    /* renamed from: v */
    private boolean f143698v;

    /* renamed from: z10.f0$a */
    /* loaded from: classes5.dex */
    public abstract class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C31163f0 f143699I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31163f0 c31163f0, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f143699I = c31163f0;
        }

        /* renamed from: i0 */
        public abstract void mo151577i0(Object obj);
    }

    /* renamed from: z10.f0$b */
    /* loaded from: classes5.dex */
    public interface b {

        /* renamed from: z10.f0$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static /* synthetic */ void m151578a(b bVar, String str, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 1) != 0) {
                        str = null;
                    }
                    bVar.mo54835a(str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRemoveHistory");
            }
        }

        /* renamed from: a */
        void mo54835a(String str);

        /* renamed from: b */
        void mo54836b(String str, boolean z11);
    }

    /* renamed from: z10.f0$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: z10.f0$d */
    /* loaded from: classes5.dex */
    public final class d extends a {

        /* renamed from: J */
        private final C25004f0 f143700J;

        /* renamed from: K */
        final /* synthetic */ C31163f0 f143701K;

        /* renamed from: z10.f0$d$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31163f0 f143702q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31163f0 c31163f0) {
                super(1);
                this.f143702q = c31163f0;
            }

            /* renamed from: a */
            public final void m151579a(View view) {
                AbstractC19074t.m100208f(view, "it");
                b m151569N = this.f143702q.m151569N();
                if (m151569N != null) {
                    b.a.m151578a(m151569N, null, 1, null);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151579a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(C31163f0 c31163f0, C25004f0 c25004f0) {
            super(c31163f0, r0);
            AbstractC19074t.m100208f(c25004f0, "binding");
            this.f143701K = c31163f0;
            FrameLayout root = c25004f0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143700J = c25004f0;
        }

        @Override // z10.C31163f0.a
        /* renamed from: i0 */
        public void mo151577i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            C25004f0 c25004f0 = this.f143700J;
            C31163f0 c31163f0 = this.f143701K;
            BlinkTextView blinkTextView = c25004f0.f119897q;
            AbstractC19074t.m100207e(blinkTextView, "txtClear");
            AbstractC26112n.m134407k0(blinkTextView, new a(c31163f0));
        }
    }

    /* renamed from: z10.f0$e */
    /* loaded from: classes5.dex */
    public final class e extends a {

        /* renamed from: J */
        private final C25008g0 f143703J;

        /* renamed from: K */
        final /* synthetic */ C31163f0 f143704K;

        /* renamed from: z10.f0$e$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31163f0 f143705q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31163f0 c31163f0) {
                super(1);
                this.f143705q = c31163f0;
            }

            /* renamed from: a */
            public final void m151580a(View view) {
                AbstractC19074t.m100208f(view, "view");
                this.f143705q.f143698v = true;
                C31163f0.m151568Q(this.f143705q, null, 1, null);
                AbstractC26112n.m134369J(view);
                C19205a.m100675M(C19205a.f95429a, AbstractC26112n.m134366G(view, AbstractC27413h.zch_action_key_search_history_expand, new Object[0]), null, 2, null);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151580a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(C31163f0 c31163f0, C25008g0 c25008g0) {
            super(c31163f0, r0);
            AbstractC19074t.m100208f(c25008g0, "binding");
            this.f143704K = c31163f0;
            FrameLayout root = c25008g0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143703J = c25008g0;
            BlinkTextView blinkTextView = c25008g0.f119913q;
            AbstractC19074t.m100207e(blinkTextView, "txtExpand");
            Context context = c25008g0.getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            AbstractC26112n.m134397f0(blinkTextView, C27280g.m139659b(context, AbstractC23322a.zds_ic_chevron_down_line_16, AbstractC27406a.zch_icon_tertiary));
        }

        @Override // z10.C31163f0.a
        /* renamed from: i0 */
        public void mo151577i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            C25008g0 c25008g0 = this.f143703J;
            C31163f0 c31163f0 = this.f143704K;
            BlinkTextView blinkTextView = c25008g0.f119913q;
            AbstractC19074t.m100207e(blinkTextView, "txtExpand");
            AbstractC26112n.m134407k0(blinkTextView, new a(c31163f0));
        }
    }

    /* renamed from: z10.f0$f */
    /* loaded from: classes5.dex */
    public final class f extends a {

        /* renamed from: J */
        private final C25000e0 f143706J;

        /* renamed from: K */
        final /* synthetic */ C31163f0 f143707K;

        /* renamed from: z10.f0$f$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31163f0 f143708q;

            /* renamed from: r */
            final /* synthetic */ Object f143709r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31163f0 c31163f0, Object obj) {
                super(1);
                this.f143708q = c31163f0;
                this.f143709r = obj;
            }

            /* renamed from: a */
            public final void m151581a(View view) {
                AbstractC19074t.m100208f(view, "it");
                b m151569N = this.f143708q.m151569N();
                if (m151569N != null) {
                    m151569N.mo54835a((String) this.f143709r);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151581a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: z10.f0$f$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31163f0 f143710q;

            /* renamed from: r */
            final /* synthetic */ Object f143711r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C31163f0 c31163f0, Object obj) {
                super(1);
                this.f143710q = c31163f0;
                this.f143711r = obj;
            }

            /* renamed from: a */
            public final void m151582a(View view) {
                AbstractC19074t.m100208f(view, "it");
                b m151569N = this.f143710q.m151569N();
                if (m151569N != null) {
                    m151569N.mo54836b((String) this.f143711r, true);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151582a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(C31163f0 c31163f0, C25000e0 c25000e0) {
            super(c31163f0, r0);
            AbstractC19074t.m100208f(c25000e0, "binding");
            this.f143707K = c31163f0;
            LinearLayout root = c25000e0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143706J = c25000e0;
            ImageView imageView = c25000e0.f119867r;
            Context context = c25000e0.getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            imageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_clock_1_line_16, AbstractC27406a.zch_icon_tertiary));
            PulseImageView pulseImageView = c25000e0.f119866q;
            Context context2 = c25000e0.getRoot().getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            pulseImageView.setImageDrawable(C27280g.m139659b(context2, AbstractC23322a.zds_ic_close_line_16, AbstractC27406a.zch_icon_tertiary));
        }

        @Override // z10.C31163f0.a
        /* renamed from: i0 */
        public void mo151577i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            C25000e0 c25000e0 = this.f143706J;
            C31163f0 c31163f0 = this.f143707K;
            c25000e0.f119868s.setText((String) obj);
            PulseImageView pulseImageView = c25000e0.f119866q;
            AbstractC19074t.m100207e(pulseImageView, "btnRemove");
            AbstractC26112n.m134407k0(pulseImageView, new a(c31163f0, obj));
            LinearLayout root = c25000e0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            AbstractC26112n.m134407k0(root, new b(c31163f0, obj));
        }
    }

    /* renamed from: z10.f0$g */
    /* loaded from: classes5.dex */
    public final class g extends a {

        /* renamed from: J */
        private final C25020j0 f143712J;

        /* renamed from: K */
        final /* synthetic */ C31163f0 f143713K;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(C31163f0 c31163f0, C25020j0 c25020j0) {
            super(c31163f0, r0);
            AbstractC19074t.m100208f(c25020j0, "binding");
            this.f143713K = c31163f0;
            FrameLayout root = c25020j0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143712J = c25020j0;
        }

        @Override // z10.C31163f0.a
        /* renamed from: i0 */
        public void mo151577i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
        }
    }

    /* renamed from: z10.f0$h */
    /* loaded from: classes5.dex */
    public final class h extends a {

        /* renamed from: J */
        private final C25016i0 f143714J;

        /* renamed from: K */
        final /* synthetic */ C31163f0 f143715K;

        /* renamed from: z10.f0$h$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31163f0 f143716q;

            /* renamed from: r */
            final /* synthetic */ Object f143717r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31163f0 c31163f0, Object obj) {
                super(1);
                this.f143716q = c31163f0;
                this.f143717r = obj;
            }

            /* renamed from: a */
            public final void m151583a(View view) {
                AbstractC19074t.m100208f(view, "it");
                b m151569N = this.f143716q.m151569N();
                if (m151569N != null) {
                    m151569N.mo54836b((String) this.f143717r, false);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151583a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public h(C31163f0 c31163f0, C25016i0 c25016i0) {
            super(c31163f0, r0);
            AbstractC19074t.m100208f(c25016i0, "binding");
            this.f143715K = c31163f0;
            LinearLayout root = c25016i0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143714J = c25016i0;
            ImageView imageView = c25016i0.f119956q;
            Context context = c25016i0.getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            imageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_search_line_16, AbstractC27406a.zch_icon_tertiary));
        }

        @Override // z10.C31163f0.a
        /* renamed from: i0 */
        public void mo151577i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            C25016i0 c25016i0 = this.f143714J;
            C31163f0 c31163f0 = this.f143715K;
            c25016i0.f119957r.setText((String) obj);
            LinearLayout root = c25016i0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            AbstractC26112n.m134407k0(root, new a(c31163f0, obj));
        }
    }

    /* renamed from: z10.f0$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f143718q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m151584a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m151584a() {
        }
    }

    /* renamed from: z10.f0$j */
    /* loaded from: classes5.dex */
    public /* synthetic */ class j extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final j f143719y = new j();

        j() {
            super(3, C25000e0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchHistoryBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151585h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25000e0 m151585h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25000e0.m129797c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: z10.f0$k */
    /* loaded from: classes5.dex */
    public /* synthetic */ class k extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final k f143720y = new k();

        k() {
            super(3, C25008g0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchHistoryMoreBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151586h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25008g0 m151586h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25008g0.m129819c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: z10.f0$l */
    /* loaded from: classes5.dex */
    public /* synthetic */ class l extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final l f143721y = new l();

        l() {
            super(3, C25004f0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchHistoryClearBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151587h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25004f0 m151587h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25004f0.m129808c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: z10.f0$m */
    /* loaded from: classes5.dex */
    public /* synthetic */ class m extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final m f143722y = new m();

        m() {
            super(3, C25020j0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchSuggestionTitleBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151588h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25020j0 m151588h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25020j0.m129856c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: z10.f0$n */
    /* loaded from: classes5.dex */
    public /* synthetic */ class n extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final n f143723y = new n();

        n() {
            super(3, C25016i0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchSuggestionBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151589h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25016i0 m151589h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25016i0.m129846c(layoutInflater, viewGroup, z11);
        }
    }

    public /* synthetic */ C31163f0(List list, List list2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new ArrayList() : list, (i11 & 2) != 0 ? new ArrayList() : list2);
    }

    /* renamed from: M */
    private final void m151567M(ArrayList arrayList, ArrayList arrayList2) {
        if (!this.f143694r.isEmpty()) {
            if (this.f143694r.size() < 5) {
                for (String str : this.f143694r) {
                    arrayList.add(0);
                    arrayList2.add(str);
                }
                this.f143698v = false;
            } else if (this.f143698v) {
                for (String str2 : this.f143694r) {
                    arrayList.add(0);
                    arrayList2.add(str2);
                }
                arrayList.add(2);
                arrayList2.add(new Object());
            } else {
                for (int i11 = 0; i11 < 3; i11++) {
                    arrayList.add(0);
                    arrayList2.add(this.f143694r.get(i11));
                }
                arrayList.add(1);
                arrayList2.add(new Object());
            }
        }
        if (!this.f143695s.isEmpty()) {
            arrayList.add(3);
            arrayList2.add(new Object());
            for (String str3 : this.f143695s) {
                arrayList.add(4);
                arrayList2.add(str3);
            }
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m151568Q(C31163f0 c31163f0, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC18494a = i.f143718q;
        }
        c31163f0.m151571P(interfaceC18494a);
    }

    /* renamed from: N */
    public final b m151569N() {
        return this.f143696t;
    }

    /* renamed from: O */
    public final List m151570O() {
        return this.f143695s;
    }

    /* renamed from: P */
    public final void m151571P(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "commitCallback");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m151567M(arrayList, arrayList2);
        this.f143697u.m416e(arrayList, arrayList2, interfaceC18494a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        aVar.mo151577i0(this.f143697u.m419k(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        InterfaceC22715a m134373N = AbstractC26112n.m134373N(viewGroup, n.f143723y, false, 2, null);
                        AbstractC19074t.m100205c(m134373N);
                        return new h(this, (C25016i0) m134373N);
                    }
                    InterfaceC22715a m134373N2 = AbstractC26112n.m134373N(viewGroup, m.f143722y, false, 2, null);
                    AbstractC19074t.m100205c(m134373N2);
                    return new g(this, (C25020j0) m134373N2);
                }
                InterfaceC22715a m134373N3 = AbstractC26112n.m134373N(viewGroup, l.f143721y, false, 2, null);
                AbstractC19074t.m100205c(m134373N3);
                return new d(this, (C25004f0) m134373N3);
            }
            InterfaceC22715a m134373N4 = AbstractC26112n.m134373N(viewGroup, k.f143720y, false, 2, null);
            AbstractC19074t.m100205c(m134373N4);
            return new e(this, (C25008g0) m134373N4);
        }
        InterfaceC22715a m134373N5 = AbstractC26112n.m134373N(viewGroup, j.f143719y, false, 2, null);
        AbstractC19074t.m100205c(m134373N5);
        return new f(this, (C25000e0) m134373N5);
    }

    /* renamed from: T */
    public final void m151574T(b bVar) {
        this.f143696t = bVar;
    }

    /* renamed from: U */
    public final void m151575U(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f143694r = list;
    }

    /* renamed from: V */
    public final void m151576V(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f143695s = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143697u.m418j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return this.f143697u.m420l(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: z */
    public void mo10018z(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        this.f143697u.m417i(recyclerView);
    }

    public C31163f0(List list, List list2) {
        AbstractC19074t.m100208f(list, "history");
        AbstractC19074t.m100208f(list2, "suggestion");
        this.f143694r = list;
        this.f143695s = list2;
        this.f143697u = new C0093d(this, new C0095f());
    }
}
