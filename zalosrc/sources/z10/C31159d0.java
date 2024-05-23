package z10;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import java.util.ArrayList;
import java.util.List;
import mj0.AbstractC23322a;
import on0.AbstractC24342w;
import p338m2.InterfaceC22715a;
import pm0.C24848g0;
import q10.C24988b0;
import q20.C25085h;
import s20.AbstractC26112n;
import u20.C26983d;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* renamed from: z10.d0 */
/* loaded from: classes5.dex */
public final class C31159d0 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private String f143670r;

    /* renamed from: s */
    private List f143671s;

    /* renamed from: t */
    private a f143672t;

    /* renamed from: z10.d0$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo54839a(String str);
    }

    /* renamed from: z10.d0$b */
    /* loaded from: classes5.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C24988b0 f143673I;

        /* renamed from: J */
        final /* synthetic */ C31159d0 f143674J;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z10.d0$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31159d0 f143675q;

            /* renamed from: r */
            final /* synthetic */ Object f143676r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31159d0 c31159d0, Object obj) {
                super(1);
                this.f143675q = c31159d0;
                this.f143676r = obj;
            }

            /* renamed from: a */
            public final void m151541a(View view) {
                AbstractC19074t.m100208f(view, "it");
                a m151532L = this.f143675q.m151532L();
                if (m151532L != null) {
                    m151532L.mo54839a((String) this.f143676r);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151541a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C31159d0 c31159d0, C24988b0 c24988b0) {
            super(c24988b0.getRoot());
            AbstractC19074t.m100208f(c24988b0, "binding");
            this.f143674J = c31159d0;
            this.f143673I = c24988b0;
            c24988b0.f119759q.setImageDrawable(C25085h.m130019c(C25085h.f120485a, AbstractC27406a.zch_icon_accent_gray_subtle, 0, 0, AbstractC23322a.zds_ic_search_line_16, AbstractC27406a.zch_icon_tertiary, AbstractC27407b.zch_page_search_completion_icon_inset, 6, null));
        }

        /* renamed from: i0 */
        public final void m151540i0(Object obj) {
            int m127173b0;
            AbstractC19074t.m100208f(obj, "data");
            C24988b0 c24988b0 = this.f143673I;
            C31159d0 c31159d0 = this.f143674J;
            EllipsizedTextView ellipsizedTextView = c24988b0.f119760r;
            SpannableString spannableString = new SpannableString((String) obj);
            m127173b0 = AbstractC24342w.m127173b0(spannableString, c31159d0.m151533M(), 0, true, 2, null);
            Integer valueOf = Integer.valueOf(m127173b0);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Context context = c24988b0.getRoot().getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                spannableString.setSpan(new C26983d(C13718q1.m76694c(context, 5)), intValue, c31159d0.m151533M().length() + intValue, 17);
            }
            ellipsizedTextView.setText(spannableString);
            LinearLayout root = c24988b0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            AbstractC26112n.m134407k0(root, new a(c31159d0, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.d0$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final c f143677y = new c();

        c() {
            super(3, C24988b0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchCompletionBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151542h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24988b0 m151542h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24988b0.m129761c(layoutInflater, viewGroup, z11);
        }
    }

    public /* synthetic */ C31159d0(String str, List list, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? new ArrayList() : list);
    }

    /* renamed from: L */
    public final a m151532L() {
        return this.f143672t;
    }

    /* renamed from: M */
    public final String m151533M() {
        return this.f143670r;
    }

    /* renamed from: N */
    public final void m151534N(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "commitCallback");
        m10008p();
        interfaceC18494a.mo12V4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        bVar.m151540i0(this.f143671s.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        InterfaceC22715a m134373N = AbstractC26112n.m134373N(viewGroup, c.f143677y, false, 2, null);
        AbstractC19074t.m100205c(m134373N);
        return new b(this, (C24988b0) m134373N);
    }

    /* renamed from: Q */
    public final void m151537Q(a aVar) {
        this.f143672t = aVar;
    }

    /* renamed from: R */
    public final void m151538R(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f143671s = list;
    }

    /* renamed from: S */
    public final void m151539S(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f143670r = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143671s.size();
    }

    public C31159d0(String str, List list) {
        AbstractC19074t.m100208f(str, "keyword");
        AbstractC19074t.m100208f(list, "completion");
        this.f143670r = str;
        this.f143671s = list;
    }
}
