package com.zing.zalo.productcatalog.p068ui.zview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import au.C2370r0;
import bi0.AbstractC2807a;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.productcatalog.model.ProductPhoto;
import com.zing.zalo.productcatalog.p068ui.zview.ProductAddEditView;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.productcatalog.utils.DeleteProductSource;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zdesign.component.TextField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zdesign.component.inputfield.EditText;
import com.zing.zalo.zdesign.component.inputfield.EnumC17006h;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ed0.AbstractC18391a;
import ed0.C18392b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19071q;
import gg0.AbstractC19444a;
import i40.C20275e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p115dy.C18086d0;
import p227i3.C20215s;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p542ub.InterfaceC27218a;
import p589vx.C28669n;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p649xl.C29981p9;
import p649xl.C29999q9;
import p661xx.InterfaceC30219e;
import p716zh.C31944h6;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ProductAddEditView extends SlidableZaloView implements InterfaceC30219e {
    public static final C9095b Companion = new C9095b(null);

    /* renamed from: c1 */
    private static int f48627c1 = AbstractC23222t7.f112579p0;

    /* renamed from: P0 */
    private C29999q9 f48628P0;

    /* renamed from: T0 */
    private Product f48632T0;

    /* renamed from: V0 */
    private boolean f48634V0;

    /* renamed from: W0 */
    private C9094a f48635W0;

    /* renamed from: X0 */
    private C23528a f48636X0;

    /* renamed from: Y0 */
    private C16972e0 f48637Y0;

    /* renamed from: Z0 */
    private C16972e0 f48638Z0;

    /* renamed from: a1 */
    private boolean f48639a1;

    /* renamed from: b1 */
    private final InterfaceC24854k f48640b1;

    /* renamed from: Q0 */
    private final InterfaceC24854k f48629Q0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18086d0.class), new C9104k(new C9103j(this)), C9105l.f48654q);

    /* renamed from: R0 */
    private final InterfaceC1764d0 f48630R0 = new InterfaceC1764d0() { // from class: ay.g0
        public /* synthetic */ C2413g0() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            ProductAddEditView.m48711gN(ProductAddEditView.this, (Product) obj);
        }
    };

    /* renamed from: S0 */
    private final InterfaceC1764d0 f48631S0 = new InterfaceC1764d0() { // from class: ay.k0
        public /* synthetic */ C2425k0() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            ProductAddEditView.m48682EM(ProductAddEditView.this, (CharSequence) obj);
        }
    };

    /* renamed from: U0 */
    private CharSequence f48633U0 = "";

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$a */
    /* loaded from: classes4.dex */
    public static final class C9094a {

        /* renamed from: a */
        private final View f48641a;

        public C9094a(View view) {
            AbstractC19074t.m100208f(view, "view");
            this.f48641a = view;
        }

        /* renamed from: a */
        public final View m48738a() {
            return this.f48641a;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$b */
    /* loaded from: classes4.dex */
    public static final class C9095b {
        private C9095b() {
        }

        public /* synthetic */ C9095b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$c */
    /* loaded from: classes4.dex */
    public static final class C9096c {

        /* renamed from: a */
        private final C29981p9 f48642a;

        /* renamed from: b */
        private ProductPhoto f48643b;

        /* renamed from: c */
        private int f48644c;

        /* renamed from: d */
        private final AnimationTarget f48645d;

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends SimpleAnimationTarget {
            a() {
            }

            @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
            public Rect getAnimTargetLocationOnScreen() {
                int[] iArr = new int[2];
                RoundCornerImageView roundCornerImageView = C9096c.this.m48741c().f139002r;
                AbstractC19074t.m100207e(roundCornerImageView, "productPhotoImv");
                roundCornerImageView.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                return new Rect(i11, i12, roundCornerImageView.getMeasuredWidth() + i11, roundCornerImageView.getMeasuredHeight() + i12);
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends C23999j {
            b() {
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c23995f, "status");
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            }
        }

        public C9096c(C29981p9 c29981p9) {
            AbstractC19074t.m100208f(c29981p9, "binding");
            this.f48642a = c29981p9;
            this.f48645d = new a();
            c29981p9.getRoot().setTag(this);
        }

        /* renamed from: a */
        public final void m48739a(ProductPhoto productPhoto, int i11, C23528a c23528a) {
            long m116585h;
            AbstractC19074t.m100208f(productPhoto, "photo");
            AbstractC19074t.m100208f(c23528a, "aQuery");
            this.f48643b = productPhoto;
            this.f48644c = i11;
            String m48504c = productPhoto.m48504c();
            String m48510i = productPhoto.m48510i();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bindPhoto index: ");
            sb2.append(i11);
            sb2.append(", localPath: ");
            sb2.append(m48504c);
            sb2.append(", remoteUrl: ");
            sb2.append(m48510i);
            ((C23528a) c23528a.m123612r(this.f48642a.f139002r)).m123579C(productPhoto.m48502a(), C23278z2.m120066E(), new b());
            int i12 = 0;
            if (productPhoto.m48507f() != 1 && productPhoto.m48507f() != 2) {
                this.f48642a.f139003s.setVisibility(8);
            } else {
                int m48508g = productPhoto.m48508g();
                if (m48508g != 1 && m48508g != 2) {
                    if (m48508g != 4) {
                        this.f48642a.f139003s.setVisibility(8);
                        this.f48642a.f139004t.setVisibility(8);
                        this.f48642a.f139006v.setVisibility(8);
                    } else {
                        this.f48642a.f139003s.setVisibility(0);
                        this.f48642a.f139004t.setVisibility(8);
                        this.f48642a.f139006v.setVisibility(0);
                    }
                } else {
                    this.f48642a.f139003s.setVisibility(0);
                    this.f48642a.f139004t.setVisibility(0);
                    ProgressBar progressBar = this.f48642a.f139004t;
                    m116585h = AbstractC22543l.m116585h(productPhoto.m48509h(), 100L);
                    progressBar.setProgress((int) m116585h);
                    this.f48642a.f139006v.setVisibility(8);
                }
            }
            FrameLayout frameLayout = this.f48642a.f139001q;
            if (i11 != 0) {
                i12 = 8;
            }
            frameLayout.setVisibility(i12);
        }

        /* renamed from: b */
        public final AnimationTarget m48740b() {
            return this.f48645d;
        }

        /* renamed from: c */
        public final C29981p9 m48741c() {
            return this.f48642a;
        }

        /* renamed from: d */
        public final int m48742d() {
            return this.f48644c;
        }

        /* renamed from: e */
        public final ProductPhoto m48743e() {
            return this.f48643b;
        }

        /* renamed from: f */
        public final void m48744f(int i11) {
            int i12;
            this.f48644c = i11;
            FrameLayout frameLayout = this.f48642a.f139001q;
            if (i11 == 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            frameLayout.setVisibility(i12);
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$d */
    /* loaded from: classes4.dex */
    static final class C9097d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends C20275e {
            a() {
            }

            @Override // i40.C20275e
            /* renamed from: h */
            public int mo36887h(int i11) {
                return i11;
            }

            @Override // i40.C20275e
            /* renamed from: s */
            public boolean mo36888s() {
                return true;
            }
        }

        C9097d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final a mo12V4() {
            a aVar = new a();
            C29999q9 c29999q9 = ProductAddEditView.this.f48628P0;
            if (c29999q9 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q9 = null;
            }
            aVar.m105861G(new C2370r0(c29999q9.getRoot()));
            return aVar;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$e */
    /* loaded from: classes4.dex */
    /* synthetic */ class C9098e extends C19071q implements InterfaceC18505l {
        C9098e(Object obj) {
            super(1, obj, ProductAddEditView.class, "handleUiAction", "handleUiAction(Lcom/zing/zalo/productcatalog/viewmodel/ProductAddEditViewModel$UiAction;)V", 0);
        }

        /* renamed from: h */
        public final void m48746h(C18086d0.b bVar) {
            AbstractC19074t.m100208f(bVar, "p0");
            ((ProductAddEditView) this.f94922q).m48691NM(bVar);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48746h((C18086d0.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$f */
    /* loaded from: classes4.dex */
    public static final class C9099f extends AbstractC18391a {
        C9099f() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
            ProductAddEditView.this.m48690MM().m96201F0(editable.toString());
            ProductAddEditView.this.m48723mN();
            ProductAddEditView.this.m48685HM();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$g */
    /* loaded from: classes4.dex */
    public static final class C9100g extends AbstractC18391a {
        C9100g() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
            ProductAddEditView.this.m48690MM().m96202G0(editable.toString());
            ProductAddEditView.this.m48723mN();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$h */
    /* loaded from: classes4.dex */
    public static final class C9101h extends AbstractC18391a {
        C9101h() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
            C31944h6.m153537c(editable, 7);
            ProductAddEditView.this.m48690MM().m96200E0(editable.toString());
            ProductAddEditView.this.m48723mN();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$i */
    /* loaded from: classes4.dex */
    public static final class C9102i extends ZdsActionBar.AbstractC16987c {
        C9102i() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            ProductAddEditView.this.m48704aN(true);
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$j */
    /* loaded from: classes4.dex */
    public static final class C9103j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48652q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9103j(ZaloView zaloView) {
            super(0);
            this.f48652q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f48652q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$k */
    /* loaded from: classes4.dex */
    public static final class C9104k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48653q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9104k(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48653q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48653q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductAddEditView$l */
    /* loaded from: classes4.dex */
    static final class C9105l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9105l f48654q = new C9105l();

        C9105l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return new C18086d0.c();
        }
    }

    public ProductAddEditView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C9097d());
        this.f48640b1 = m129210a;
    }

    /* renamed from: AM */
    private final void m48678AM() {
        if (this.f48632T0 == null) {
            return;
        }
        C29999q9 c29999q9 = this.f48628P0;
        Product product = null;
        if (c29999q9 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q9 = null;
        }
        String valueOf = String.valueOf(c29999q9.f139108t.getEditText().getText());
        Product product2 = this.f48632T0;
        if (product2 == null) {
            AbstractC19074t.m100223u("product");
            product2 = null;
        }
        if (!AbstractC19074t.m100204b(valueOf, product2.m48488l())) {
            C29999q9 c29999q92 = this.f48628P0;
            if (c29999q92 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q92 = null;
            }
            EditText editText = c29999q92.f139108t.getEditText();
            Product product3 = this.f48632T0;
            if (product3 == null) {
                AbstractC19074t.m100223u("product");
                product3 = null;
            }
            editText.setText(product3.m48488l());
        }
        m48685HM();
        C29999q9 c29999q93 = this.f48628P0;
        if (c29999q93 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q93 = null;
        }
        String valueOf2 = String.valueOf(c29999q93.f139107s.getEditText().getText());
        Product product4 = this.f48632T0;
        if (product4 == null) {
            AbstractC19074t.m100223u("product");
            product4 = null;
        }
        if (!AbstractC19074t.m100204b(valueOf2, product4.m48483g())) {
            C29999q9 c29999q94 = this.f48628P0;
            if (c29999q94 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q94 = null;
            }
            EditText editText2 = c29999q94.f139107s.getEditText();
            Product product5 = this.f48632T0;
            if (product5 == null) {
                AbstractC19074t.m100223u("product");
                product5 = null;
            }
            editText2.setText(product5.m48483g());
        }
        C29999q9 c29999q95 = this.f48628P0;
        if (c29999q95 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q95 = null;
        }
        String valueOf3 = String.valueOf(c29999q95.f139112x.getEditText().getText());
        Product product6 = this.f48632T0;
        if (product6 == null) {
            AbstractC19074t.m100223u("product");
            product6 = null;
        }
        if (!AbstractC19074t.m100204b(valueOf3, product6.m48491o())) {
            C29999q9 c29999q96 = this.f48628P0;
            if (c29999q96 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q96 = null;
            }
            EditText editText3 = c29999q96.f139112x.getEditText();
            Product product7 = this.f48632T0;
            if (product7 == null) {
                AbstractC19074t.m100223u("product");
            } else {
                product = product7;
            }
            editText3.setText(product.m48491o());
        }
        m48679BM();
        m48723mN();
    }

    /* renamed from: BM */
    private final void m48679BM() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        C9096c c9096c;
        ProductPhoto productPhoto;
        Product product = this.f48632T0;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        List m48479c = product.m48479c();
        boolean m96207b0 = m48690MM().m96207b0();
        HashMap hashMap = new HashMap();
        C29999q9 c29999q9 = this.f48628P0;
        if (c29999q9 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q9 = null;
        }
        int childCount = c29999q9.f139109u.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            C29999q9 c29999q92 = this.f48628P0;
            if (c29999q92 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q92 = null;
            }
            Object tag = c29999q92.f139109u.getChildAt(i12).getTag();
            if (tag instanceof C9096c) {
                c9096c = (C9096c) tag;
            } else {
                c9096c = null;
            }
            if (c9096c != null) {
                productPhoto = c9096c.m48743e();
            } else {
                productPhoto = null;
            }
            if (productPhoto != null) {
                ProductPhoto m48743e = c9096c.m48743e();
                AbstractC19074t.m100205c(m48743e);
                hashMap.put(m48743e.m48506e(), c9096c);
            }
        }
        C29999q9 c29999q93 = this.f48628P0;
        if (c29999q93 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q93 = null;
        }
        c29999q93.f139109u.removeAllViews();
        int i13 = 0;
        for (Object obj : m48479c) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC25368s.m131509q();
            }
            ProductPhoto productPhoto2 = (ProductPhoto) obj;
            C19059j0 c19059j0 = new C19059j0();
            Object obj2 = hashMap.get(productPhoto2.m48506e());
            c19059j0.f94941p = obj2;
            if (obj2 == null || ((C9096c) obj2).m48741c().getRoot().getParent() != null) {
                LayoutInflater from = LayoutInflater.from(getContext());
                C29999q9 c29999q94 = this.f48628P0;
                if (c29999q94 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29999q94 = null;
                }
                C29981p9 m148366c = C29981p9.m148366c(from, c29999q94.f139109u, false);
                AbstractC19074t.m100207e(m148366c, "inflate(...)");
                c19059j0.f94941p = new C9096c(m148366c);
            }
            FrameLayout root = ((C9096c) c19059j0.f94941p).m48741c().getRoot();
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                C29999q9 c29999q95 = this.f48628P0;
                if (c29999q95 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29999q95 = null;
                }
                if (c29999q95.f139109u.getChildCount() > 0) {
                    i11 = AbstractC23222t7.f112556e;
                } else {
                    i11 = 0;
                }
                marginLayoutParams.leftMargin = i11;
                int i15 = f48627c1;
                marginLayoutParams.width = i15;
                marginLayoutParams.height = i15;
            }
            C29999q9 c29999q96 = this.f48628P0;
            if (c29999q96 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q96 = null;
            }
            c29999q96.f139109u.addView(root);
            ((C9096c) c19059j0.f94941p).m48741c().f139005u.setOnClickListener(new View.OnClickListener() { // from class: ay.r0

                /* renamed from: q */
                public final /* synthetic */ C19059j0 f10042q;

                public /* synthetic */ ViewOnClickListenerC2446r0(C19059j0 c19059j02) {
                    r2 = c19059j02;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductAddEditView.m48680CM(ProductAddEditView.this, r2, view);
                }
            });
            ((C9096c) c19059j02.f94941p).m48741c().f139002r.setRoundCornerColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
            ((C9096c) c19059j02.f94941p).m48741c().f139002r.setOnClickListener(new View.OnClickListener() { // from class: ay.s0

                /* renamed from: q */
                public final /* synthetic */ ProductAddEditView f10048q;

                public /* synthetic */ ViewOnClickListenerC2449s0(ProductAddEditView this) {
                    r2 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductAddEditView.m48681DM(C19059j0.this, r2, view);
                }
            });
            C9096c c9096c2 = (C9096c) c19059j02.f94941p;
            C23528a c23528a = this.f48636X0;
            if (c23528a == null) {
                AbstractC19074t.m100223u("aQuery");
                c23528a = null;
            }
            c9096c2.m48739a(productPhoto2, i13, c23528a);
            i13 = i14;
        }
        if (m96207b0) {
            m48683FM();
        }
        m48736zM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:            if (r6.m48738a().getParent() == null) goto L38;     */
    /* renamed from: CM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m48680CM(ProductAddEditView productAddEditView, C19059j0 c19059j0, View view) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        AbstractC19074t.m100208f(c19059j0, "$photoHolder");
        C29999q9 c29999q9 = productAddEditView.f48628P0;
        C29999q9 c29999q92 = null;
        if (c29999q9 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q9 = null;
        }
        LinearLayout linearLayout = c29999q9.f139109u;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(200L);
        TransitionManager.beginDelayedTransition(linearLayout, changeBounds);
        C29999q9 c29999q93 = productAddEditView.f48628P0;
        if (c29999q93 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29999q92 = c29999q93;
        }
        c29999q92.f139109u.removeView(((C9096c) c19059j0.f94941p).m48741c().getRoot());
        if (((C9096c) c19059j0.f94941p).m48743e() != null) {
            C18086d0 m48690MM = productAddEditView.m48690MM();
            ProductPhoto m48743e = ((C9096c) c19059j0.f94941p).m48743e();
            AbstractC19074t.m100205c(m48743e);
            m48690MM.m96198A0(m48743e);
            if (productAddEditView.m48690MM().m96207b0()) {
                C9094a c9094a = productAddEditView.f48635W0;
                if (c9094a != null) {
                    AbstractC19074t.m100205c(c9094a);
                }
                productAddEditView.m48683FM();
            }
            productAddEditView.m48736zM();
            productAddEditView.m48723mN();
            productAddEditView.m48721lN();
            productAddEditView.m48684GM();
        }
    }

    /* renamed from: DM */
    public static final void m48681DM(C19059j0 c19059j0, ProductAddEditView productAddEditView, View view) {
        AbstractC19074t.m100208f(c19059j0, "$photoHolder");
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        ProductPhoto m48743e = ((C9096c) c19059j0.f94941p).m48743e();
        if (m48743e != null && m48743e.m48508g() == 3) {
            productAddEditView.m48709fN(((C9096c) c19059j0.f94941p).m48742d(), ((C9096c) c19059j0.f94941p).m48740b());
        }
    }

    /* renamed from: EM */
    public static final void m48682EM(ProductAddEditView productAddEditView, CharSequence charSequence) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        AbstractC19074t.m100208f(charSequence, "catalogName");
        productAddEditView.f48633U0 = charSequence;
        C29999q9 c29999q9 = productAddEditView.f48628P0;
        if (c29999q9 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q9 = null;
        }
        c29999q9.f139106r.getEditText().setText(charSequence);
        productAddEditView.m48723mN();
    }

    /* renamed from: FM */
    private final void m48683FM() {
        View m48738a;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        m48693PM();
        C9094a c9094a = this.f48635W0;
        if (c9094a != null && (m48738a = c9094a.m48738a()) != null && m48738a.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = m48738a.getLayoutParams();
            C29999q9 c29999q9 = null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                C29999q9 c29999q92 = this.f48628P0;
                if (c29999q92 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29999q92 = null;
                }
                if (c29999q92.f139109u.getChildCount() > 0) {
                    i11 = AbstractC23222t7.f112556e;
                } else {
                    i11 = 0;
                }
                marginLayoutParams.leftMargin = i11;
                int i12 = f48627c1;
                marginLayoutParams.width = i12;
                marginLayoutParams.height = i12;
            }
            C29999q9 c29999q93 = this.f48628P0;
            if (c29999q93 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29999q9 = c29999q93;
            }
            c29999q9.f139109u.addView(m48738a);
        }
    }

    /* renamed from: GM */
    private final void m48684GM() {
        if (m48690MM().m96212l0() <= 0) {
            if (!this.f48634V0 || m48690MM().m96213m0().m48490n().isEmpty()) {
                C29999q9 c29999q9 = this.f48628P0;
                ViewGroup.MarginLayoutParams marginLayoutParams = null;
                if (c29999q9 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29999q9 = null;
                }
                c29999q9.f139110v.setVisibility(8);
                C29999q9 c29999q92 = this.f48628P0;
                if (c29999q92 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29999q92 = null;
                }
                c29999q92.f139111w.setVisibility(8);
                C29999q9 c29999q93 = this.f48628P0;
                if (c29999q93 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29999q93 = null;
                }
                ViewGroup.LayoutParams layoutParams = c29999q93.f139108t.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = 0;
                }
            }
        }
    }

    /* renamed from: HM */
    public final void m48685HM() {
        if (this.f48632T0 == null) {
            return;
        }
        C18086d0 m48690MM = m48690MM();
        Product product = this.f48632T0;
        C29999q9 c29999q9 = null;
        Product product2 = null;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        boolean m96218r0 = m48690MM.m96218r0(product);
        if (m96218r0 != this.f48639a1) {
            C29999q9 c29999q92 = this.f48628P0;
            if (c29999q92 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q92 = null;
            }
            LinearLayout linearLayout = c29999q92.f139113y;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(100L);
            TransitionManager.beginDelayedTransition(linearLayout, changeBounds);
        }
        if (m96218r0) {
            C29999q9 c29999q93 = this.f48628P0;
            if (c29999q93 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q93 = null;
            }
            c29999q93.f139108t.setFieldState(EnumC17007i.NORMAL);
            C29999q9 c29999q94 = this.f48628P0;
            if (c29999q94 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q94 = null;
            }
            TextField textField = c29999q94.f139108t;
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            String string = m92651WI().getString(AbstractC8020f0.product_catalog_add_view_name_duplicated_hint);
            AbstractC19074t.m100207e(string, "getString(...)");
            textField.setHelperText(AbstractC9183a.m49000h(context, string, AbstractC23322a.zds_ic_info_circle_line_16));
            C18086d0 m48690MM2 = m48690MM();
            Product product3 = this.f48632T0;
            if (product3 == null) {
                AbstractC19074t.m100223u("product");
            } else {
                product2 = product3;
            }
            m48690MM2.m96205L0(product2.m48488l());
        } else {
            C29999q9 c29999q95 = this.f48628P0;
            if (c29999q95 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q95 = null;
            }
            c29999q95.f139108t.setFieldState(EnumC17007i.NORMAL);
            C29999q9 c29999q96 = this.f48628P0;
            if (c29999q96 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29999q9 = c29999q96;
            }
            c29999q9.f139108t.setHelperText("");
        }
        this.f48639a1 = m96218r0;
    }

    /* renamed from: IM */
    private final boolean m48686IM() {
        ZaloView zaloView;
        C17487o0 m92662fJ = m92662fJ();
        CatalogPickerBottomSheetView catalogPickerBottomSheetView = null;
        if (m92662fJ != null) {
            zaloView = m92662fJ.m92996E0("CatalogPickerBottomSheet");
        } else {
            zaloView = null;
        }
        if (zaloView instanceof CatalogPickerBottomSheetView) {
            catalogPickerBottomSheetView = (CatalogPickerBottomSheetView) zaloView;
        }
        if (catalogPickerBottomSheetView != null && catalogPickerBottomSheetView.m48621uM()) {
            catalogPickerBottomSheetView.close();
            return true;
        }
        return false;
    }

    /* renamed from: JM */
    private final void m48687JM(Product product) {
        m48690MM().m96209f0(product, DeleteProductSource.ProductEditView.f48758q);
    }

    /* renamed from: KM */
    private final void m48688KM() {
        finish();
    }

    /* renamed from: LM */
    private final C20275e m48689LM() {
        return (C20275e) this.f48640b1.getValue();
    }

    /* renamed from: MM */
    public final C18086d0 m48690MM() {
        return (C18086d0) this.f48629Q0.getValue();
    }

    /* renamed from: NM */
    public final void m48691NM(C18086d0.b bVar) {
        if (AbstractC19074t.m100204b(bVar, C18086d0.b.i.f91566a)) {
            mo46829Y();
            return;
        }
        if (AbstractC19074t.m100204b(bVar, C18086d0.b.C32809b.f91559a)) {
            mo49315c4();
            return;
        }
        if (AbstractC19074t.m100204b(bVar, C18086d0.b.f.f91563a)) {
            ToastUtils.m89266n(AbstractC8020f0.product_catalog_toast_product_edited, new Object[0]);
            m48705bN(this, false, 1, null);
            return;
        }
        if (AbstractC19074t.m100204b(bVar, C18086d0.b.d.f91561a)) {
            ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_toast_product_added), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
            m48705bN(this, false, 1, null);
            return;
        }
        if (AbstractC19074t.m100204b(bVar, C18086d0.b.e.f91562a)) {
            ToastUtils.m89266n(AbstractC8020f0.product_catalog_toast_product_deleted, new Object[0]);
            m48705bN(this, false, 1, null);
            return;
        }
        if (bVar instanceof C18086d0.b.g) {
            m48679BM();
            m48723mN();
            if (((C18086d0.b.g) bVar).m96219a()) {
                AbstractC19444a.m101694b(new Runnable() { // from class: ay.o0
                    public /* synthetic */ RunnableC2437o0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ProductAddEditView.m48692OM(ProductAddEditView.this);
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (bVar instanceof C18086d0.b.h) {
            m48719kN(((C18086d0.b.h) bVar).m96220a());
            return;
        }
        if (bVar instanceof C18086d0.b.j) {
            ToastUtils.showMess(((C18086d0.b.j) bVar).m96221a());
        } else if (bVar instanceof C18086d0.b.c) {
            finish();
        } else if (bVar instanceof C18086d0.b.a) {
            m48685HM();
        }
    }

    /* renamed from: OM */
    public static final void m48692OM(ProductAddEditView productAddEditView) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        C29999q9 c29999q9 = productAddEditView.f48628P0;
        C29999q9 c29999q92 = null;
        if (c29999q9 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q9 = null;
        }
        HorizontalScrollView horizontalScrollView = c29999q9.f139111w;
        C29999q9 c29999q93 = productAddEditView.f48628P0;
        if (c29999q93 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29999q92 = c29999q93;
        }
        horizontalScrollView.smoothScrollTo(c29999q92.f139109u.getWidth(), 0);
    }

    /* renamed from: PM */
    private final void m48693PM() {
        if (this.f48635W0 == null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            int i11 = AbstractC7409c0.prodcat_product_creating_btn_add_photo;
            C29999q9 c29999q9 = this.f48628P0;
            if (c29999q9 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q9 = null;
            }
            View inflate = from.inflate(i11, (ViewGroup) c29999q9.f139109u, false);
            if (inflate != null) {
                inflate.setOnClickListener(new View.OnClickListener() { // from class: ay.j0
                    public /* synthetic */ ViewOnClickListenerC2422j0() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ProductAddEditView.m48694QM(ProductAddEditView.this, view);
                    }
                });
            }
            AbstractC19074t.m100205c(inflate);
            this.f48635W0 = new C9094a(inflate);
        }
    }

    /* renamed from: QM */
    public static final void m48694QM(ProductAddEditView productAddEditView, View view) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        if (productAddEditView.m48690MM().m96207b0()) {
            productAddEditView.m48706cN();
        }
    }

    /* renamed from: RM */
    private final boolean m48695RM() {
        return m48690MM().m96208c0();
    }

    /* renamed from: SM */
    private final void m48696SM(Product product) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C16972e0 c16972e0 = this.f48637Y0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("ProductAddEditView-ConfirmDelete");
        String string = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_this_product);
        AbstractC19074t.m100207e(string, "getString(...)");
        aVar.m90949z(string);
        aVar.m90921E(true);
        aVar.m90947x("ProductAddEditView-ConfirmDelete-Positive");
        String string2 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_confirm);
        AbstractC19074t.m100207e(string2, "getString(...)");
        aVar.m90943t(string2, new InterfaceC17463d.d() { // from class: ay.h0

            /* renamed from: q */
            public final /* synthetic */ Product f10004q;

            public /* synthetic */ C2416h0(Product product2) {
                r2 = product2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ProductAddEditView.m48697TM(ProductAddEditView.this, r2, interfaceC17463d, i11);
            }
        });
        aVar.m90937n("ProductAddEditView-ConfirmDelete-Negative");
        String string3 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_cancel);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar.m90934k(string3, new InterfaceC17463d.d() { // from class: ay.i0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ProductAddEditView.m48698UM(interfaceC17463d, i11);
            }
        });
        this.f48637Y0 = aVar.m90923G();
    }

    /* renamed from: TM */
    public static final void m48697TM(ProductAddEditView productAddEditView, Product product, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        AbstractC19074t.m100208f(product, "$product");
        productAddEditView.m48687JM(product);
    }

    /* renamed from: UM */
    public static final void m48698UM(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* renamed from: VM */
    private final void m48699VM() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C16972e0 c16972e0 = this.f48638Z0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("ProductAddEditView-ConfirmExit");
        if (this.f48634V0) {
            String string = m92651WI().getString(AbstractC8020f0.product_catalog_edit_view_confirm_exit_message);
            AbstractC19074t.m100207e(string, "getString(...)");
            aVar.m90949z(string);
        } else {
            String string2 = m92651WI().getString(AbstractC8020f0.product_catalog_add_view_confirm_exit_message);
            AbstractC19074t.m100207e(string2, "getString(...)");
            aVar.m90949z(string2);
        }
        aVar.m90921E(true);
        aVar.m90947x("ProductAddEditView-ConfirmExit-Positive");
        String string3 = m92651WI().getString(AbstractC8020f0.product_catalog_add_view_confirm_exit_btn_exit);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar.m90943t(string3, new InterfaceC17463d.d() { // from class: ay.p0
            public /* synthetic */ C2440p0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ProductAddEditView.m48700WM(ProductAddEditView.this, interfaceC17463d, i11);
            }
        });
        aVar.m90937n("ProductAddEditView-ConfirmExit-Negative");
        String string4 = m92651WI().getString(AbstractC8020f0.product_catalog_add_view_confirm_exit_btn_stay);
        AbstractC19074t.m100207e(string4, "getString(...)");
        aVar.m90934k(string4, new InterfaceC17463d.d() { // from class: ay.q0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ProductAddEditView.m48701XM(interfaceC17463d, i11);
            }
        });
        this.f48638Z0 = aVar.m90923G();
    }

    /* renamed from: WM */
    public static final void m48700WM(ProductAddEditView productAddEditView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        productAddEditView.m48688KM();
    }

    /* renamed from: XM */
    public static final void m48701XM(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* renamed from: YM */
    public static final void m48702YM(ProductAddEditView productAddEditView, View view) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        Product product = productAddEditView.f48632T0;
        if (product == null) {
            return;
        }
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        productAddEditView.m48696SM(product);
    }

    /* renamed from: ZM */
    public static final boolean m48703ZM(ProductAddEditView productAddEditView, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        if (motionEvent.getAction() == 0) {
            productAddEditView.m48708eN();
            return true;
        }
        return false;
    }

    /* renamed from: aN */
    public final void m48704aN(boolean z11) {
        if (z11 && m48690MM().m96216p0()) {
            m48699VM();
        } else {
            m48688KM();
        }
    }

    /* renamed from: bN */
    static /* synthetic */ void m48705bN(ProductAddEditView productAddEditView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        productAddEditView.m48704aN(z11);
    }

    /* renamed from: cN */
    private final void m48706cN() {
        Bundle bundle = new Bundle();
        bundle.putInt("extra_photo_type", 12);
        bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_product_catalog", "product_catalog", null, 4, null));
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.mo89694j2(GalleryPickerView.class, bundle, 1, "ProductCatalogAddEditView", 1, true);
        }
    }

    /* renamed from: dN */
    public static final void m48707dN(ProductAddEditView productAddEditView, View view) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        if (productAddEditView.m48695RM()) {
            productAddEditView.m48690MM().m96199B0();
        }
    }

    /* renamed from: eN */
    private final void m48708eN() {
        m48715iN();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 23);
        bundle.putLong("EXTRA_SELECTED_CATALOG_ID", m48690MM().m96210i0());
        if (this.f48634V0) {
            bundle.putString("EXTRA_TITLE", m92652XI(AbstractC8020f0.catalog_picker_title_edit_product));
        } else {
            bundle.putString("EXTRA_TITLE", m92652XI(AbstractC8020f0.catalog_picker_title_add_product));
        }
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 0, 2, true);
        }
    }

    /* renamed from: fN */
    private final void m48709fN(int i11, AnimationTarget animationTarget) {
        String str;
        Product product = (Product) m48690MM().m96214n0().mo9215f();
        if (product == null) {
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(AbstractC9183a.m49003k(product));
        if (arrayList.isEmpty()) {
            return;
        }
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK == null || (str = m87077NK.getMiddleTitle()) == null) {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("medialist", arrayList);
        bundle.putInt("currentIndex", i11);
        bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 9);
        bundle.putString("EXTRA_STR_TITLE", str);
        m48689LM().m105865K(i11);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35551H2(animationTarget, ((ItemAlbumMobile) arrayList.get(i11)).f42607x, bundle, m48689LM(), 0);
        }
    }

    /* renamed from: gN */
    public static final void m48711gN(ProductAddEditView productAddEditView, Product product) {
        AbstractC19074t.m100208f(productAddEditView, "this$0");
        AbstractC19074t.m100208f(product, "product");
        productAddEditView.f48632T0 = product;
        productAddEditView.m48678AM();
    }

    /* renamed from: hN */
    private final void m48713hN() {
        C23744a.Companion.m124119a().m124115b(this, 5300);
    }

    /* renamed from: iN */
    private final void m48715iN() {
        ZaloView m92993D0;
        C17487o0 m92662fJ;
        C17487o0 m92662fJ2 = m92662fJ();
        if (m92662fJ2 != null && (m92993D0 = m92662fJ2.m92993D0(FrameLayoutKeepBtmSheetZaloView.class)) != null && (m92993D0 instanceof FrameLayoutKeepBtmSheetZaloView) && ((FrameLayoutKeepBtmSheetZaloView) m92993D0).m79790fM() == 23 && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.mo92702G1(m92993D0, 0);
        }
    }

    /* renamed from: jN */
    private final void m48717jN() {
        C23744a.Companion.m124119a().m124117e(this, 5300);
    }

    /* renamed from: kN */
    private final void m48719kN(ProductPhoto productPhoto) {
        C9096c c9096c;
        ProductPhoto productPhoto2;
        String str;
        C29999q9 c29999q9 = this.f48628P0;
        if (c29999q9 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q9 = null;
        }
        int childCount = c29999q9.f139109u.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            C29999q9 c29999q92 = this.f48628P0;
            if (c29999q92 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q92 = null;
            }
            Object tag = c29999q92.f139109u.getChildAt(i11).getTag();
            if (tag instanceof C9096c) {
                c9096c = (C9096c) tag;
            } else {
                c9096c = null;
            }
            if (c9096c != null) {
                productPhoto2 = c9096c.m48743e();
            } else {
                productPhoto2 = null;
            }
            if (productPhoto2 != null) {
                ProductPhoto m48743e = c9096c.m48743e();
                if (m48743e != null) {
                    str = m48743e.m48506e();
                } else {
                    str = null;
                }
                if (AbstractC19074t.m100204b(str, productPhoto.m48506e())) {
                    C23528a c23528a = this.f48636X0;
                    if (c23528a == null) {
                        AbstractC19074t.m100223u("aQuery");
                        c23528a = null;
                    }
                    c9096c.m48739a(productPhoto, i11, c23528a);
                }
            }
        }
    }

    /* renamed from: lN */
    private final void m48721lN() {
        C9096c c9096c;
        C29999q9 c29999q9 = this.f48628P0;
        if (c29999q9 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q9 = null;
        }
        int childCount = c29999q9.f139109u.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            C29999q9 c29999q92 = this.f48628P0;
            if (c29999q92 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q92 = null;
            }
            Object tag = c29999q92.f139109u.getChildAt(i11).getTag();
            if (tag instanceof C9096c) {
                c9096c = (C9096c) tag;
            } else {
                c9096c = null;
            }
            if (c9096c != null) {
                c9096c.m48744f(i11);
            }
        }
    }

    /* renamed from: mN */
    public final void m48723mN() {
        Button button;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            button = m87077NK.getTrailingButton();
        } else {
            button = null;
        }
        if (button != null) {
            button.setEnabled(m48695RM());
        }
    }

    /* renamed from: zM */
    private final void m48736zM() {
        Product product = this.f48632T0;
        C29999q9 c29999q9 = null;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        List m48479c = product.m48479c();
        int m96212l0 = m48690MM().m96212l0();
        C29999q9 c29999q92 = this.f48628P0;
        if (c29999q92 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29999q9 = c29999q92;
        }
        c29999q9.f139110v.setText(m92653YI(AbstractC8020f0.product_catalog_add_view_photo_section, Integer.valueOf(m48479c.size()), Integer.valueOf(m96212l0)));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        Object obj;
        Parcelable parcelable;
        long j11;
        Object obj2;
        super.mo37111CJ(bundle);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(18);
        }
        Bundle m92642L3 = m92642L3();
        Product product = null;
        if (m92642L3 != null) {
            long j12 = m92642L3.getLong("EXTRA_CATALOG_ID");
            Object parcelable2 = m92642L3.getParcelable("EXTRA_EDITED_PRODUCT");
            Object parcelable3 = m92642L3.getParcelable("EXTRA_DUPLICATED_PRODUCT");
            parcelable = m92642L3.getParcelable("EXTRA_TRACKING_SOURCE");
            obj = parcelable2;
            obj2 = parcelable3;
            j11 = j12;
        } else {
            obj = null;
            parcelable = null;
            j11 = 0;
            obj2 = null;
        }
        if (bundle != null) {
            product = (Product) bundle.getParcelable("SAVE_EXTRA_USER_INPUTTED_PRODUCT");
        }
        m48690MM().m96217q0(j11, (Product) obj, (Product) obj2, product, parcelable);
        m48690MM().m96204J0(new C9098e(this));
        m48690MM().m96214n0().m9219j(this, this.f48630R0);
        m48690MM().m96211j0().m9219j(this, this.f48631S0);
        m48713hN();
        if (obj != null) {
            this.f48634V0 = true;
        }
        this.f48636X0 = new C23528a(getContext());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        int i11 = 0;
        C29999q9 m148407c = C29999q9.m148407c(LayoutInflater.from(context), viewGroup, false);
        AbstractC19074t.m100207e(m148407c, "inflate(...)");
        this.f48628P0 = m148407c;
        C28669n.b bVar = C28669n.Companion;
        int m146131f = bVar.m143559a().m143541Q().m146131f();
        C29999q9 c29999q9 = this.f48628P0;
        C29999q9 c29999q92 = null;
        if (c29999q9 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q9 = null;
        }
        c29999q9.f139108t.m91046E(true);
        C29999q9 c29999q93 = this.f48628P0;
        if (c29999q93 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q93 = null;
        }
        EditText editText = c29999q93.f139108t.getEditText();
        editText.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
        String string = editText.getResources().getString(AbstractC8020f0.product_catalog_toast_product_name_exceeds_limit, Integer.valueOf(m146131f));
        AbstractC19074t.m100207e(string, "getString(...)");
        editText.setFilters(new InputFilter[]{new C18392b(m146131f, string)});
        editText.addTextChangedListener(new C9099f());
        int m146133h = bVar.m143559a().m143541Q().m146133h();
        C29999q9 c29999q94 = this.f48628P0;
        if (c29999q94 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q94 = null;
        }
        EditText editText2 = c29999q94.f139112x.getEditText();
        editText2.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
        String string2 = editText2.getResources().getString(AbstractC8020f0.product_catalog_toast_product_price_exceeds_limit, Integer.valueOf(m146133h));
        AbstractC19074t.m100207e(string2, "getString(...)");
        editText2.setFilters(new InputFilter[]{new C18392b(m146133h, string2)});
        editText2.addTextChangedListener(new C9100g());
        int m146130e = bVar.m143559a().m143541Q().m146130e();
        C29999q9 c29999q95 = this.f48628P0;
        if (c29999q95 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q95 = null;
        }
        c29999q95.f139107s.setMaxLength(m146130e);
        C29999q9 c29999q96 = this.f48628P0;
        if (c29999q96 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q96 = null;
        }
        EditText editText3 = c29999q96.f139107s.getEditText();
        editText3.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
        String string3 = editText3.getResources().getString(AbstractC8020f0.product_catalog_toast_product_description_exceeds_limit, Integer.valueOf(m146130e));
        AbstractC19074t.m100207e(string3, "getString(...)");
        editText3.setFilters(new InputFilter[]{new C18392b(m146130e, string3)});
        editText3.addTextChangedListener(new C9101h());
        C29999q9 c29999q97 = this.f48628P0;
        if (c29999q97 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q97 = null;
        }
        c29999q97.f139106r.m91046E(true);
        C29999q9 c29999q98 = this.f48628P0;
        if (c29999q98 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q98 = null;
        }
        c29999q98.f139106r.getEditText().setInputType(0);
        if (!this.f48634V0) {
            C29999q9 c29999q99 = this.f48628P0;
            if (c29999q99 == null) {
                AbstractC19074t.m100223u("binding");
                c29999q99 = null;
            }
            TextField textField = c29999q99.f139106r;
            String string4 = m92651WI().getString(AbstractC8020f0.product_catalog_add_view_catalog_section_helper);
            AbstractC19074t.m100207e(string4, "getString(...)");
            textField.setHelperText(AbstractC9183a.m49000h(context, string4, AbstractC23322a.zds_ic_info_circle_solid_16));
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_chevron_down_line_16, AbstractC2807a.icon_01));
        C29999q9 c29999q910 = this.f48628P0;
        if (c29999q910 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q910 = null;
        }
        c29999q910.f139106r.m90700G(true);
        C29999q9 c29999q911 = this.f48628P0;
        if (c29999q911 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q911 = null;
        }
        c29999q911.f139106r.setTrailingView(imageView);
        C29999q9 c29999q912 = this.f48628P0;
        if (c29999q912 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q912 = null;
        }
        c29999q912.f139106r.setClearIconMode(EnumC17006h.Never);
        C29999q9 c29999q913 = this.f48628P0;
        if (c29999q913 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q913 = null;
        }
        c29999q913.f139106r.getEditText().setOnTouchListener(new View.OnTouchListener() { // from class: ay.m0
            public /* synthetic */ ViewOnTouchListenerC2431m0() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m48703ZM;
                m48703ZM = ProductAddEditView.m48703ZM(ProductAddEditView.this, view, motionEvent);
                return m48703ZM;
            }
        });
        C29999q9 c29999q914 = this.f48628P0;
        if (c29999q914 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q914 = null;
        }
        c29999q914.f139106r.getEditText().setText(this.f48633U0);
        C29999q9 c29999q915 = this.f48628P0;
        if (c29999q915 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q915 = null;
        }
        RobotoTextView robotoTextView = c29999q915.f139105q;
        if (!this.f48634V0) {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        C29999q9 c29999q916 = this.f48628P0;
        if (c29999q916 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q916 = null;
        }
        c29999q916.f139105q.setOnClickListener(new View.OnClickListener() { // from class: ay.n0
            public /* synthetic */ ViewOnClickListenerC2434n0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductAddEditView.m48702YM(ProductAddEditView.this, view);
            }
        });
        m48684GM();
        C29999q9 c29999q917 = this.f48628P0;
        if (c29999q917 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29999q92 = c29999q917;
        }
        RelativeLayout root = c29999q92.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m48690MM().m96204J0(null);
        m48690MM().m96214n0().mo9222o(this.f48630R0);
        m48690MM().m96211j0().mo9222o(this.f48631S0);
        C16972e0 c16972e0 = this.f48638Z0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        C16972e0 c16972e02 = this.f48637Y0;
        if (c16972e02 != null) {
            c16972e02.dismiss();
        }
        m48717jN();
        m48715iN();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        int i11;
        String m92652XI;
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            if (this.f48634V0) {
                i11 = AbstractC8020f0.product_catalog_edit_view_title;
            } else {
                i11 = AbstractC8020f0.product_catalog_add_view_title;
            }
            String m92652XI2 = m92652XI(i11);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m87077NK.setMiddleTitle(m92652XI2);
            if (this.f48634V0) {
                m92652XI = m92652XI(AbstractC8020f0.product_catalog_add_view_btn_save_edit);
            } else {
                m92652XI = m92652XI(AbstractC8020f0.product_catalog_add_view_btn_save);
            }
            AbstractC19074t.m100205c(m92652XI);
            m87077NK.setTrailingButtonText(m92652XI);
            m87077NK.setLeadingFunctionCallback(new C9102i());
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: ay.l0
                public /* synthetic */ ViewOnClickListenerC2428l0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProductAddEditView.m48707dN(ProductAddEditView.this, view);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C29999q9 c29999q9 = this.f48628P0;
        if (c29999q9 == null) {
            AbstractC19074t.m100223u("binding");
            c29999q9 = null;
        }
        AbstractC2379w.m12430d(c29999q9.f139108t.getEditText());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putParcelable("SAVE_EXTRA_USER_INPUTTED_PRODUCT", m48690MM().m96213m0());
    }

    @Override // p661xx.InterfaceC30219e
    /* renamed from: et */
    public void mo48737et(long j11, C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        m48690MM().m96203I0(j11);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProductCreatingView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Parcelable parcelable;
        if (i11 == 1) {
            if (i12 == -1 && intent != null) {
                Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("result_selected_items");
                MediaItem mediaItem = null;
                if (parcelableArrayExtra != null) {
                    parcelable = parcelableArrayExtra[0];
                } else {
                    parcelable = null;
                }
                if (parcelable instanceof MediaItem) {
                    mediaItem = (MediaItem) parcelable;
                }
                if (mediaItem != null) {
                    m48690MM().m96206a0(mediaItem);
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (m48686IM()) {
                return true;
            }
            m48704aN(true);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC29263f abstractC29263f;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 5300) {
            Object obj = objArr[0];
            if (obj instanceof AbstractC29263f) {
                abstractC29263f = (AbstractC29263f) obj;
            } else {
                abstractC29263f = null;
            }
            if (abstractC29263f == null) {
                return;
            }
            m48690MM().m96215o0(abstractC29263f);
            return;
        }
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
    }
}
