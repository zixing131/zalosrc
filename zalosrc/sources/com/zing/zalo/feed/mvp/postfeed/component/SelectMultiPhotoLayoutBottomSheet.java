package com.zing.zalo.feed.mvp.postfeed.component;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gq.C19586i;
import gq.C19587j;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import p107dq.C18051g;
import p500s1.C26086a;
import p500s1.C26088c;
import p649xl.C29803fb;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class SelectMultiPhotoLayoutBottomSheet extends BottomSheet {
    public static final C8626a Companion = new C8626a(null);

    /* renamed from: b1 */
    private C29803fb f46442b1;

    /* renamed from: c1 */
    private InterfaceC8627b f46443c1;

    /* renamed from: d1 */
    private int f46444d1;

    /* renamed from: e1 */
    private int f46445e1;

    /* renamed from: f1 */
    private C19586i f46446f1;

    /* renamed from: g1 */
    private boolean f46447g1;

    /* renamed from: h1 */
    public boolean f46448h1;

    /* renamed from: i1 */
    private final boolean f46449i1 = true;

    /* renamed from: j1 */
    private final EnumC17017m f46450j1 = EnumC17017m.HUG_CONTENT;

    /* renamed from: k1 */
    private final C8628c f46451k1 = new C8628c();

    /* renamed from: com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C8626a {
        private C8626a() {
        }

        public /* synthetic */ C8626a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final SelectMultiPhotoLayoutBottomSheet m45947a(Bundle bundle) {
            SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet = new SelectMultiPhotoLayoutBottomSheet();
            selectMultiPhotoLayoutBottomSheet.mo60305zK(bundle);
            return selectMultiPhotoLayoutBottomSheet;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8627b {
        /* renamed from: a */
        void mo45948a();

        /* renamed from: b */
        void mo45949b();

        /* renamed from: c */
        void mo45950c();

        /* renamed from: d */
        void mo45951d(C18051g c18051g);

        /* renamed from: e */
        void mo45952e();
    }

    /* renamed from: com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet$c */
    /* loaded from: classes4.dex */
    public static final class C8628c implements C19586i.a {
        C8628c() {
        }

        @Override // gq.C19586i.a
        /* renamed from: a */
        public void mo45953a(C18051g c18051g) {
            AbstractC19074t.m100208f(c18051g, "layoutItem");
            if (c18051g.m95939e() != SelectMultiPhotoLayoutBottomSheet.this.m45939NL()) {
                SelectMultiPhotoLayoutBottomSheet.this.m45945WL(c18051g.m95939e());
                InterfaceC8627b interfaceC8627b = SelectMultiPhotoLayoutBottomSheet.this.f46443c1;
                if (interfaceC8627b != null) {
                    interfaceC8627b.mo45951d(c18051g);
                }
            }
        }

        @Override // gq.C19586i.a
        /* renamed from: b */
        public void mo45954b(C18051g c18051g) {
            AbstractC19074t.m100208f(c18051g, "layoutItem");
            InterfaceC8627b interfaceC8627b = SelectMultiPhotoLayoutBottomSheet.this.f46443c1;
            if (interfaceC8627b != null) {
                interfaceC8627b.mo45951d(c18051g);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet$d */
    /* loaded from: classes4.dex */
    public static final class C8629d extends RecyclerView.AbstractC1887n {
        C8629d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            if (recyclerView.m9817A0(view) > 0) {
                rect.set(AbstractC23136l9.m118742r(27.5f), 0, 0, 0);
            } else {
                rect.set(AbstractC23136l9.m118742r(26.5f), 0, 0, 0);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.postfeed.component.SelectMultiPhotoLayoutBottomSheet$e */
    /* loaded from: classes4.dex */
    public static final class C8630e extends BottomSheet.AbstractC16910a {
        C8630e() {
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet = SelectMultiPhotoLayoutBottomSheet.this;
            selectMultiPhotoLayoutBottomSheet.f46448h1 = false;
            InterfaceC8627b interfaceC8627b = selectMultiPhotoLayoutBottomSheet.f46443c1;
            if (interfaceC8627b != null) {
                interfaceC8627b.mo45948a();
            }
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
            SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet = SelectMultiPhotoLayoutBottomSheet.this;
            selectMultiPhotoLayoutBottomSheet.f46448h1 = true;
            InterfaceC8627b interfaceC8627b = selectMultiPhotoLayoutBottomSheet.f46443c1;
            if (interfaceC8627b != null) {
                interfaceC8627b.mo45952e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public static final void m45931PL(SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(selectMultiPhotoLayoutBottomSheet, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        BottomSheetLayout m90518hL = selectMultiPhotoLayoutBottomSheet.m90518hL();
        if (m90518hL != null) {
            AbstractC19074t.m100206d(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
            m90518hL.setViewTranslationY(((Integer) r2).intValue());
        }
    }

    /* renamed from: QL */
    private final void m45932QL() {
        Context context = getContext();
        if (context != null) {
            int i11 = 0;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
            this.f46446f1 = new C19586i(context);
            C29803fb c29803fb = this.f46442b1;
            C29803fb c29803fb2 = null;
            if (c29803fb == null) {
                AbstractC19074t.m100223u("_binding");
                c29803fb = null;
            }
            c29803fb.f137763s.setLayoutManager(linearLayoutManager);
            C29803fb c29803fb3 = this.f46442b1;
            if (c29803fb3 == null) {
                AbstractC19074t.m100223u("_binding");
                c29803fb3 = null;
            }
            c29803fb3.f137763s.setAdapter(this.f46446f1);
            C29803fb c29803fb4 = this.f46442b1;
            if (c29803fb4 == null) {
                AbstractC19074t.m100223u("_binding");
            } else {
                c29803fb2 = c29803fb4;
            }
            c29803fb2.f137763s.m9816A(new C8629d());
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                i11 = m92642L3.getInt("layout_id");
            }
            this.f46445e1 = i11;
        }
    }

    /* renamed from: RL */
    private final void m45933RL() {
        m90532yL(true);
        m90525tL(this.f46449i1);
        m90533zL(this.f46450j1);
        Context context = getContext();
        C29803fb c29803fb = null;
        if (context != null) {
            C29803fb c29803fb2 = this.f46442b1;
            if (c29803fb2 == null) {
                AbstractC19074t.m100223u("_binding");
                c29803fb2 = null;
            }
            c29803fb2.f137762r.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_line_16, AbstractC2807a.icon_01));
        }
        C29803fb c29803fb3 = this.f46442b1;
        if (c29803fb3 == null) {
            AbstractC19074t.m100223u("_binding");
        } else {
            c29803fb = c29803fb3;
        }
        c29803fb.f137762r.setOnClickListener(new View.OnClickListener() { // from class: eq.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectMultiPhotoLayoutBottomSheet.m45934SL(SelectMultiPhotoLayoutBottomSheet.this, view);
            }
        });
        m90530xL(new C8630e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SL */
    public static final void m45934SL(SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet, View view) {
        AbstractC19074t.m100208f(selectMultiPhotoLayoutBottomSheet, "this$0");
        selectMultiPhotoLayoutBottomSheet.close();
    }

    /* renamed from: UL */
    private final void m45935UL(Bundle bundle) {
        if (bundle != null && bundle.containsKey("layoutId")) {
            this.f46445e1 = bundle.getInt("layoutId");
            this.f46447g1 = true;
        } else {
            this.f46447g1 = false;
        }
    }

    /* renamed from: XL */
    private final void m45936XL() {
        C19586i c19586i = this.f46446f1;
        if (c19586i != null) {
            c19586i.m102521R(C19587j.f97307a.m102526a());
        }
        C19586i c19586i2 = this.f46446f1;
        if (c19586i2 != null) {
            c19586i2.m102523T(this.f46451k1);
        }
        if (this.f46447g1) {
            C19586i c19586i3 = this.f46446f1;
            if (c19586i3 != null) {
                c19586i3.m102520Q(this.f46445e1);
                return;
            }
            return;
        }
        C19586i c19586i4 = this.f46446f1;
        if (c19586i4 != null) {
            c19586i4.m102522S(this.f46445e1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZL */
    public static final void m45937ZL(SelectMultiPhotoLayoutBottomSheet selectMultiPhotoLayoutBottomSheet, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(selectMultiPhotoLayoutBottomSheet, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        BottomSheetLayout m90518hL = selectMultiPhotoLayoutBottomSheet.m90518hL();
        if (m90518hL != null) {
            AbstractC19074t.m100206d(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
            m90518hL.setViewTranslationY(((Integer) r2).intValue());
        }
    }

    /* renamed from: ML */
    public final int m45938ML() {
        return this.f46444d1;
    }

    /* renamed from: NL */
    public final int m45939NL() {
        return this.f46445e1;
    }

    /* renamed from: OL */
    public final void m45940OL() {
        View m92656bJ = m92656bJ();
        if (m92656bJ == null || m92656bJ.getVisibility() != 8) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, m90514dL());
            ofInt.setDuration(150L);
            ofInt.setInterpolator(new C26086a());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eq.k
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SelectMultiPhotoLayoutBottomSheet.m45931PL(SelectMultiPhotoLayoutBottomSheet.this, valueAnimator);
                }
            });
            ofInt.start();
        }
        View m92656bJ2 = m92656bJ();
        if (m92656bJ2 != null) {
            m92656bJ2.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29803fb c29803fb = this.f46442b1;
        if (c29803fb == null) {
            AbstractC19074t.m100223u("_binding");
            c29803fb = null;
        }
        RelativeLayout root = c29803fb.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        bundle.putInt("layoutId", this.f46445e1);
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: T2 */
    public void mo45942T2(float f11) {
        super.mo45942T2(f11);
        this.f46444d1 = (int) f11;
        InterfaceC8627b interfaceC8627b = this.f46443c1;
        if (interfaceC8627b != null) {
            interfaceC8627b.mo45950c();
        }
    }

    /* renamed from: TL */
    public final boolean m45943TL() {
        View m92656bJ = m92656bJ();
        if (m92656bJ == null || m92656bJ.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: VL */
    public final void m45944VL(InterfaceC8627b interfaceC8627b) {
        AbstractC19074t.m100208f(interfaceC8627b, "listener");
        this.f46443c1 = interfaceC8627b;
    }

    /* renamed from: WL */
    public final void m45945WL(int i11) {
        this.f46445e1 = i11;
    }

    /* renamed from: YL */
    public final void m45946YL() {
        View m92656bJ = m92656bJ();
        if (m92656bJ == null || m92656bJ.getVisibility() != 0) {
            ValueAnimator ofInt = ValueAnimator.ofInt(m90514dL(), 0);
            ofInt.setDuration(250L);
            ofInt.setInterpolator(new C26088c());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eq.j
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SelectMultiPhotoLayoutBottomSheet.m45937ZL(SelectMultiPhotoLayoutBottomSheet.this, valueAnimator);
                }
            });
            ofInt.start();
        }
        View m92656bJ2 = m92656bJ();
        if (m92656bJ2 != null) {
            m92656bJ2.setVisibility(0);
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    public void close() {
        InterfaceC8627b interfaceC8627b = this.f46443c1;
        if (interfaceC8627b != null) {
            interfaceC8627b.mo45949b();
        }
        super.close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29803fb m147952c = C29803fb.m147952c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147952c, "inflate(...)");
        this.f46442b1 = m147952c;
        m45933RL();
        m45932QL();
        m45935UL(bundle);
        m45936XL();
    }
}
