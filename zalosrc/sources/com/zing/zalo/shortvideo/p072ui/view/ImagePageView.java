package com.zing.zalo.shortvideo.p072ui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import p354n3.C23528a;
import pm0.C24848g0;
import q10.C24998d2;
import s20.AbstractC26112n;

/* loaded from: classes5.dex */
public final class ImagePageView extends AbstractC10623a {
    public static final C10272b Companion = new C10272b(null);

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ImagePageView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10271a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10271a f52901y = new C10271a();

        C10271a() {
            super(3, C24998d2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchPageImageBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54400h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24998d2 m54400h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24998d2.m129791c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ImagePageView$b */
    /* loaded from: classes5.dex */
    public static final class C10272b {
        private C10272b() {
        }

        public /* synthetic */ C10272b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ImagePageView$c */
    /* loaded from: classes5.dex */
    static final class C10273c extends AbstractC19075u implements InterfaceC18505l {
        C10273c() {
            super(1);
        }

        /* renamed from: a */
        public final void m54401a(View view) {
            AbstractC19074t.m100208f(view, "it");
            ImagePageView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54401a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public ImagePageView() {
        super(C10271a.f52901y);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String string;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C24998d2 c24998d2 = (C24998d2) m55556SK();
        if (c24998d2 != null) {
            LinearLayout linearLayout = c24998d2.f119857r;
            AbstractC19074t.m100207e(linearLayout, "lytHeader");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                FrameLayout root = c24998d2.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                layoutParams2.topMargin = AbstractC26112n.m134365F(root);
                linearLayout.setLayoutParams(layoutParams2);
                ImageView imageView = c24998d2.f119856q;
                AbstractC19074t.m100207e(imageView, "btnClose");
                AbstractC26112n.m134407k0(imageView, new C10273c());
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null && (string = m92642L3.getString("IMAGE_URL")) != null) {
                    c24998d2.f119859t.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    C23528a c23528a = (C23528a) new C23528a(view.getContext()).m123612r(c24998d2.f119859t);
                    FrameLayout root2 = c24998d2.getRoot();
                    AbstractC19074t.m100207e(root2, "getRoot(...)");
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }
}
