package z10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.SearchHashTag;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import java.util.List;
import mj0.AbstractC23322a;
import p338m2.InterfaceC22715a;
import pm0.C24848g0;
import q10.C24996d0;
import q20.C25085h;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27413h;

/* renamed from: z10.e0 */
/* loaded from: classes5.dex */
public final class C31161e0 extends AbstractC31153a0 {

    /* renamed from: u */
    private Section f143680u;

    /* renamed from: v */
    private b f143681v;

    /* renamed from: w */
    private boolean f143682w;

    /* renamed from: z10.e0$a */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
        }
    }

    /* renamed from: z10.e0$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo54791a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo54792b(SearchHashTag searchHashTag);
    }

    /* renamed from: z10.e0$c */
    /* loaded from: classes5.dex */
    public final class c extends a {

        /* renamed from: I */
        private final C24996d0 f143683I;

        /* renamed from: J */
        final /* synthetic */ C31161e0 f143684J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(C31161e0 c31161e0, C24996d0 c24996d0) {
            super(r0);
            AbstractC19074t.m100208f(c24996d0, "binding");
            this.f143684J = c31161e0;
            LinearLayout root = c24996d0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143683I = c24996d0;
            if (c31161e0.m151546U()) {
                ImageView imageView = c24996d0.f119841q;
                AbstractC19074t.m100207e(imageView, "ivHashtag");
                AbstractC26112n.m134431w0(imageView);
                c24996d0.f119841q.setImageDrawable(C25085h.m130019c(C25085h.f120485a, AbstractC27406a.zch_icon_accent_gray_subtle, 0, 0, AbstractC23322a.zch_ic_hashtag_16, AbstractC27406a.zch_text_secondary, AbstractC27407b.zch_page_search_completion_icon_inset, 6, null));
                return;
            }
            ImageView imageView2 = c24996d0.f119841q;
            AbstractC19074t.m100207e(imageView2, "ivHashtag");
            AbstractC26112n.m134367H(imageView2);
        }

        /* renamed from: i0 */
        public void m151553i0(Object obj) {
            SearchHashTag searchHashTag;
            AbstractC19074t.m100208f(obj, "data");
            if (obj instanceof SearchHashTag) {
                searchHashTag = (SearchHashTag) obj;
            } else {
                searchHashTag = null;
            }
            if (searchHashTag != null) {
                this.f7784p.setTag(searchHashTag);
                this.f143683I.f119842r.setText(searchHashTag.m51145c());
                SimpleShadowTextView simpleShadowTextView = this.f143683I.f119843s;
                View view = this.f7784p;
                AbstractC19074t.m100207e(view, "itemView");
                simpleShadowTextView.setText(AbstractC26112n.m134366G(view, AbstractC27413h.zch_page_search_hashtag_view_count, AbstractC26105g.m134334a(searchHashTag.m51146d())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.e0$d */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final d f143685y = new d();

        d() {
            super(3, C24996d0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchHashtagBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151554h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24996d0 m151554h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24996d0.m129785c(layoutInflater, viewGroup, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.e0$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ c f143686q;

        /* renamed from: r */
        final /* synthetic */ C31161e0 f143687r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c cVar, C31161e0 c31161e0) {
            super(1);
            this.f143686q = cVar;
            this.f143687r = c31161e0;
        }

        /* renamed from: a */
        public final void m151555a(View view) {
            SearchHashTag searchHashTag;
            b m151544S;
            AbstractC19074t.m100208f(view, "it");
            Object tag = this.f143686q.f7784p.getTag();
            if (tag instanceof SearchHashTag) {
                searchHashTag = (SearchHashTag) tag;
            } else {
                searchHashTag = null;
            }
            if (searchHashTag != null && (m151544S = this.f143687r.m151544S()) != null) {
                m151544S.mo54792b(searchHashTag);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151555a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31161e0(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143681v;
        if (bVar == null || (m51171p = this.f143680u.m51171p()) == null) {
            return;
        }
        bVar.mo54791a(m51171p);
    }

    /* renamed from: R */
    public final void m151543R() {
        this.f143680u = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        m10008p();
    }

    /* renamed from: S */
    public final b m151544S() {
        return this.f143681v;
    }

    /* renamed from: T */
    public final Section m151545T() {
        return this.f143680u;
    }

    /* renamed from: U */
    public final boolean m151546U() {
        return this.f143682w;
    }

    /* renamed from: V */
    public final void m151547V(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "commitCallback");
        m10008p();
        interfaceC18494a.mo12V4();
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo9990A(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "holder");
        super.mo9990A(cVar, i11);
        cVar.m151553i0(this.f143680u.m51168m().get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        InterfaceC22715a m134373N = AbstractC26112n.m134373N(viewGroup, d.f143685y, false, 2, null);
        AbstractC19074t.m100205c(m134373N);
        c cVar = new c(this, (C24996d0) m134373N);
        View view = cVar.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        AbstractC26112n.m134407k0(view, new e(cVar, this));
        return cVar;
    }

    /* renamed from: Y */
    public final void m151550Y(b bVar) {
        this.f143681v = bVar;
    }

    /* renamed from: Z */
    public final void m151551Z(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143680u = section;
    }

    /* renamed from: a0 */
    public final void m151552a0(boolean z11) {
        this.f143682w = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143680u.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31161e0(Section section) {
        super(10);
        AbstractC19074t.m100208f(section, "data");
        this.f143680u = section;
        this.f143682w = true;
    }
}
