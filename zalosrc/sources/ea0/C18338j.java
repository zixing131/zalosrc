package ea0;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalResultPageLayout;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p612wk.C29078j;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ea0.j */
/* loaded from: classes6.dex */
public final class C18338j extends AbstractC6881a implements InterfaceC18319c {
    public static final b Companion = new b(null);

    /* renamed from: r */
    private InterfaceC18319c f92678r;

    /* renamed from: s */
    private final List f92679s;

    /* renamed from: t */
    private final List f92680t;

    /* renamed from: u */
    private final InterfaceC24854k f92681u;

    /* renamed from: v */
    private ViewPager f92682v;

    /* renamed from: w */
    private final ViewPager.InterfaceC6875j f92683w;

    /* renamed from: ea0.j$a */
    /* loaded from: classes6.dex */
    public static final class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            C18338j.this.m97305C();
        }
    }

    /* renamed from: ea0.j$b */
    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ea0.j$c */
    /* loaded from: classes6.dex */
    public static final class c implements ViewPager.InterfaceC6875j {

        /* renamed from: p */
        private int f92685p;

        c() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            ViewPager m97303A;
            Object obj;
            Object obj2;
            if (this.f92685p == 0 && i11 == 1 && (m97303A = C18338j.this.m97303A()) != null) {
                Integer valueOf = Integer.valueOf(m97303A.getCurrentItem());
                C18338j c18338j = C18338j.this;
                int intValue = valueOf.intValue();
                if (intValue > 0) {
                    Iterator it = c18338j.m97311y().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((SearchGlobalResultPageLayout) obj2).getPagePosition() == intValue - 1) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    SearchGlobalResultPageLayout searchGlobalResultPageLayout = (SearchGlobalResultPageLayout) obj2;
                    if (searchGlobalResultPageLayout != null) {
                        SearchGlobalResultPageLayout.m73416r(searchGlobalResultPageLayout, false, 1, null);
                    }
                }
                if (intValue < c18338j.m97309w().size() - 1) {
                    Iterator it2 = c18338j.m97311y().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((SearchGlobalResultPageLayout) obj).getPagePosition() == intValue + 1) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    SearchGlobalResultPageLayout searchGlobalResultPageLayout2 = (SearchGlobalResultPageLayout) obj;
                    if (searchGlobalResultPageLayout2 != null) {
                        SearchGlobalResultPageLayout.m73416r(searchGlobalResultPageLayout2, false, 1, null);
                    }
                }
            }
            this.f92685p = i11;
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            Object obj;
            Iterator it = C18338j.this.m97311y().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((SearchGlobalResultPageLayout) obj).getPagePosition() == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            SearchGlobalResultPageLayout searchGlobalResultPageLayout = (SearchGlobalResultPageLayout) obj;
            if (searchGlobalResultPageLayout != null) {
                SearchGlobalResultPageLayout.m73416r(searchGlobalResultPageLayout, false, 1, null);
            }
        }
    }

    /* renamed from: ea0.j$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f92687q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView.C1893t mo12V4() {
            return new RecyclerView.C1893t();
        }
    }

    public C18338j() {
        InterfaceC24854k m129210a;
        m35342n(new a());
        this.f92679s = new ArrayList();
        this.f92680t = new ArrayList();
        m129210a = AbstractC24856m.m129210a(d.f92687q);
        this.f92681u = m129210a;
        this.f92683w = new c();
    }

    /* renamed from: z */
    private final RecyclerView.C1893t m97302z() {
        return (RecyclerView.C1893t) this.f92681u.getValue();
    }

    /* renamed from: A */
    public final ViewPager m97303A() {
        return this.f92682v;
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        InterfaceC18319c interfaceC18319c = this.f92678r;
        if (interfaceC18319c != null) {
            return (C18316b) interfaceC18319c.mo205i9(c18316b);
        }
        return null;
    }

    /* renamed from: C */
    public final void m97305C() {
        Object obj;
        Iterator it = this.f92680t.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                SearchGlobalResultPageLayout searchGlobalResultPageLayout = (SearchGlobalResultPageLayout) obj;
                ViewPager viewPager = this.f92682v;
                if (viewPager != null && searchGlobalResultPageLayout.getPagePosition() == viewPager.getCurrentItem()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SearchGlobalResultPageLayout searchGlobalResultPageLayout2 = (SearchGlobalResultPageLayout) obj;
        if (searchGlobalResultPageLayout2 != null) {
            SearchGlobalResultPageLayout.m73416r(searchGlobalResultPageLayout2, false, 1, null);
        }
    }

    /* renamed from: D */
    public final void m97306D(InterfaceC18319c interfaceC18319c) {
        this.f92678r = interfaceC18319c;
    }

    /* renamed from: E */
    public final void m97307E(List list) {
        AbstractC19074t.m100208f(list, "data");
        this.f92679s.clear();
        this.f92679s.addAll(list);
        mo35341m();
    }

    /* renamed from: F */
    public final void m97308F(ViewPager viewPager) {
        if (viewPager != null) {
            viewPager.setAdapter(this);
        }
        ViewPager viewPager2 = this.f92682v;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this.f92683w);
        }
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this.f92683w);
        }
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(this.f92683w);
        }
        this.f92682v = viewPager;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        AbstractC19074t.m100208f(viewGroup, "container");
        AbstractC19074t.m100208f(obj, "item");
        viewGroup.removeView((View) obj);
        AbstractC19069o0.m100184a(this.f92680t).remove(obj);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("destroy item at position ");
        sb2.append(i11);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f92679s.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: i */
    public CharSequence mo35337i(int i11) {
        String string = MainApplication.Companion.m35500c().getString(((C29078j) this.f92679s.get(i11)).m145307g().m145312a());
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "container");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("instantiate item at position ");
        sb2.append(i11);
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        SearchGlobalResultPageLayout searchGlobalResultPageLayout = new SearchGlobalResultPageLayout(context, null, 0, 6, null);
        searchGlobalResultPageLayout.setPagePosition(i11);
        searchGlobalResultPageLayout.setActionResponder(this);
        searchGlobalResultPageLayout.setRecyclerViewViewPool(m97302z());
        this.f92680t.add(searchGlobalResultPageLayout);
        viewGroup.addView(searchGlobalResultPageLayout);
        return searchGlobalResultPageLayout;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(obj, "item");
        return AbstractC19074t.m100204b(view, obj);
    }

    /* renamed from: w */
    public final List m97309w() {
        return this.f92679s;
    }

    /* renamed from: x */
    public final C29078j m97310x(int i11) {
        if (this.f92679s.size() > i11) {
            return (C29078j) this.f92679s.get(i11);
        }
        return null;
    }

    /* renamed from: y */
    public final List m97311y() {
        return this.f92680t;
    }
}
