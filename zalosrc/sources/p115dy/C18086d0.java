package p115dy;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import androidx.work.AbstractC2144f;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.productcatalog.model.Product;
import com.zing.zalo.productcatalog.model.ProductPhoto;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.productcatalog.utils.AddProductSource;
import com.zing.zalo.productcatalog.utils.DeleteProductSource;
import com.zing.zalo.productcatalog.utils.EditProductSource;
import com.zing.zalo.productcatalog.utils.MoveProductSource;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import cy.C17583b;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23258x2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import on0.AbstractC24342w;
import p115dy.C18086d0;
import p354n3.C23528a;
import p361nb.C23648e;
import p379o3.C23994e;
import p379o3.C23995f;
import p534u1.AbstractC26941a;
import p589vx.AbstractC28665j;
import p589vx.AbstractC28671p;
import p589vx.C28669n;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p624wx.C29264g;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25370t;
import qm0.AbstractC25381y0;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25749o;

/* renamed from: dy.d0 */
/* loaded from: classes4.dex */
public final class C18086d0 extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final LiveData f91544A;

    /* renamed from: B */
    private final C28669n f91545B;

    /* renamed from: C */
    private InterfaceC18505l f91546C;

    /* renamed from: D */
    private Parcelable f91547D;

    /* renamed from: E */
    private boolean f91548E;

    /* renamed from: F */
    private final HashSet f91549F;

    /* renamed from: s */
    private long f91550s;

    /* renamed from: t */
    private long f91551t;

    /* renamed from: u */
    private Product f91552u;

    /* renamed from: v */
    private final ArrayList f91553v = new ArrayList();

    /* renamed from: w */
    private Product f91554w;

    /* renamed from: x */
    private final C1761c0 f91555x;

    /* renamed from: y */
    private final LiveData f91556y;

    /* renamed from: z */
    private final C1761c0 f91557z;

    /* renamed from: dy.d0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dy.d0$b */
    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: dy.d0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a */
            public static final a f91558a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: dy.d0$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32809b extends b {

            /* renamed from: a */
            public static final C32809b f91559a = new C32809b();

            private C32809b() {
                super(null);
            }
        }

        /* renamed from: dy.d0$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: a */
            public static final c f91560a = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: dy.d0$b$d */
        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a */
            public static final d f91561a = new d();

            private d() {
                super(null);
            }
        }

        /* renamed from: dy.d0$b$e */
        /* loaded from: classes4.dex */
        public static final class e extends b {

            /* renamed from: a */
            public static final e f91562a = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: dy.d0$b$f */
        /* loaded from: classes4.dex */
        public static final class f extends b {

            /* renamed from: a */
            public static final f f91563a = new f();

            private f() {
                super(null);
            }
        }

        /* renamed from: dy.d0$b$g */
        /* loaded from: classes4.dex */
        public static final class g extends b {

            /* renamed from: a */
            private final boolean f91564a;

            public g(boolean z11) {
                super(null);
                this.f91564a = z11;
            }

            /* renamed from: a */
            public final boolean m96219a() {
                return this.f91564a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f91564a == ((g) obj).f91564a;
            }

            public int hashCode() {
                return AbstractC2144f.m11520a(this.f91564a);
            }

            public String toString() {
                return "RefreshAllPhotos(scrollPhotoListToEnd=" + this.f91564a + ")";
            }
        }

        /* renamed from: dy.d0$b$h */
        /* loaded from: classes4.dex */
        public static final class h extends b {

            /* renamed from: a */
            private final ProductPhoto f91565a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(ProductPhoto productPhoto) {
                super(null);
                AbstractC19074t.m100208f(productPhoto, "photo");
                this.f91565a = productPhoto;
            }

            /* renamed from: a */
            public final ProductPhoto m96220a() {
                return this.f91565a;
            }
        }

        /* renamed from: dy.d0$b$i */
        /* loaded from: classes4.dex */
        public static final class i extends b {

            /* renamed from: a */
            public static final i f91566a = new i();

            private i() {
                super(null);
            }
        }

        /* renamed from: dy.d0$b$j */
        /* loaded from: classes4.dex */
        public static final class j extends b {

            /* renamed from: a */
            private final String f91567a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(String str) {
                super(null);
                AbstractC19074t.m100208f(str, "message");
                this.f91567a = str;
            }

            /* renamed from: a */
            public final String m96221a() {
                return this.f91567a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && AbstractC19074t.m100204b(this.f91567a, ((j) obj).f91567a);
            }

            public int hashCode() {
                return this.f91567a.hashCode();
            }

            public String toString() {
                return "ShowMessage(message=" + this.f91567a + ")";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dy.d0$c */
    /* loaded from: classes4.dex */
    public static final class c implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C18086d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.d0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {
        d() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m96223c(C18086d0 c18086d0, AbstractC28671p abstractC28671p) {
            InterfaceC18505l interfaceC18505l;
            AbstractC19074t.m100208f(c18086d0, "this$0");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            InterfaceC18505l interfaceC18505l2 = c18086d0.f91546C;
            if (interfaceC18505l2 != null) {
                interfaceC18505l2.mo205i9(b.C32809b.f91559a);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                InterfaceC18505l interfaceC18505l3 = c18086d0.f91546C;
                if (interfaceC18505l3 != null) {
                    interfaceC18505l3.mo205i9(b.e.f91562a);
                    return;
                }
                return;
            }
            if ((abstractC28671p instanceof AbstractC28671p.a) && (interfaceC18505l = c18086d0.f91546C) != null) {
                interfaceC18505l.mo205i9(new b.j(((AbstractC28671p.a) abstractC28671p).m143579a()));
            }
        }

        /* renamed from: b */
        public final void m96224b(final AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18086d0.this.f91548E = false;
            final C18086d0 c18086d0 = C18086d0.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.e0
                @Override // java.lang.Runnable
                public final void run() {
                    C18086d0.d.m96223c(C18086d0.this, abstractC28671p);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96224b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: dy.d0$e */
    /* loaded from: classes4.dex */
    public static final class e extends C23994e {

        /* renamed from: v0 */
        final /* synthetic */ String f91569v0;

        /* renamed from: w0 */
        final /* synthetic */ String f91570w0;

        /* renamed from: x0 */
        final /* synthetic */ ProductPhoto f91571x0;

        /* renamed from: y0 */
        final /* synthetic */ File f91572y0;

        /* renamed from: z0 */
        final /* synthetic */ C18086d0 f91573z0;

        e(String str, String str2, ProductPhoto productPhoto, File file, C18086d0 c18086d0) {
            this.f91569v0 = str;
            this.f91570w0 = str2;
            this.f91571x0 = productPhoto;
            this.f91572y0 = file;
            this.f91573z0 = c18086d0;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, File file, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c23995f, "status");
            if (file != null && AbstractC23258x2.m119958q(file.getPath()) && c23995f.m125657h() == 200) {
                if (AbstractC9183a.m48999g()) {
                    String str2 = this.f91569v0;
                    String str3 = this.f91570w0;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("doRenew#SUCCESS: remoteUrl: ");
                    sb2.append(str2);
                    sb2.append(", downloadPath: ");
                    sb2.append(str3);
                }
                ProductPhoto productPhoto = this.f91571x0;
                String path = this.f91572y0.getPath();
                AbstractC19074t.m100207e(path, "getPath(...)");
                productPhoto.m48511j(path);
                this.f91573z0.m96197z0(this.f91571x0);
                return;
            }
            if (AbstractC9183a.m48999g()) {
                AbstractC23350e.m122774d("ProductCatalogAddEditVM", "doRenew#ERROR: remoteUrl: " + this.f91569v0);
            }
            this.f91573z0.m96195x0(this.f91571x0);
        }
    }

    /* renamed from: dy.d0$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ String f91574a;

        /* renamed from: b */
        final /* synthetic */ ProductPhoto f91575b;

        /* renamed from: c */
        final /* synthetic */ C18086d0 f91576c;

        f(String str, ProductPhoto productPhoto, C18086d0 c18086d0) {
            this.f91574a = str;
            this.f91575b = productPhoto;
            this.f91576c = c18086d0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m96229g(ProductPhoto productPhoto, C25749o c25749o, C18086d0 c18086d0) {
            AbstractC19074t.m100208f(productPhoto, "$productPhoto");
            AbstractC19074t.m100208f(c25749o, "$uploadResponse");
            AbstractC19074t.m100208f(c18086d0, "this$0");
            productPhoto.m48512k(3);
            productPhoto.m48514m(c25749o.m132881a());
            productPhoto.m48513l(100L);
            InterfaceC18505l interfaceC18505l = c18086d0.f91546C;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(new b.h(productPhoto));
            }
            if (c18086d0.f91548E && c18086d0.m96186e0() <= 0) {
                c18086d0.f91548E = false;
                c18086d0.m96199B0();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m96230h(ProductPhoto productPhoto, C18086d0 c18086d0) {
            AbstractC19074t.m100208f(productPhoto, "$productPhoto");
            AbstractC19074t.m100208f(c18086d0, "this$0");
            productPhoto.m48512k(4);
            productPhoto.m48513l(0L);
            InterfaceC18505l interfaceC18505l = c18086d0.f91546C;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(new b.h(productPhoto));
            }
            if (c18086d0.f91548E) {
                c18086d0.f91548E = false;
                InterfaceC18505l interfaceC18505l2 = c18086d0.f91546C;
                if (interfaceC18505l2 != null) {
                    interfaceC18505l2.mo205i9(b.C32809b.f91559a);
                }
                InterfaceC18505l interfaceC18505l3 = c18086d0.f91546C;
                if (interfaceC18505l3 != null) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_add_view_error_general);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC18505l3.mo205i9(new b.j(m118743r0));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m96231i(ProductPhoto productPhoto, long j11, C18086d0 c18086d0) {
            AbstractC19074t.m100208f(productPhoto, "$productPhoto");
            AbstractC19074t.m100208f(c18086d0, "this$0");
            productPhoto.m48513l(j11);
            InterfaceC18505l interfaceC18505l = c18086d0.f91546C;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(new b.h(productPhoto));
            }
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            AbstractC19074t.m100208f(bVar, "uploadSuccess");
            AbstractC25751q m132889b = bVar.m132889b();
            AbstractC19074t.m100206d(m132889b, "null cannot be cast to non-null type com.zing.zalo.upload.models.UploadProductPhotoResponse");
            final C25749o c25749o = (C25749o) m132889b;
            if (AbstractC9183a.m48999g()) {
                String str = this.f91574a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("doUpload#onDataProcessed: photoPath: ");
                sb2.append(str);
                sb2.append(", response: ");
                sb2.append(c25749o);
            }
            final ProductPhoto productPhoto = this.f91575b;
            final C18086d0 c18086d0 = this.f91576c;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C18086d0.f.m96229g(ProductPhoto.this, c25749o, c18086d0);
                }
            });
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            AbstractC19074t.m100208f(aVar, "uploadFailure");
            if (AbstractC9183a.m48999g()) {
                AbstractC23350e.m122774d("ProductCatalogAddEditVM", "doUpload#onErrorData: photoPath: " + this.f91574a + ", errorMessage: " + aVar.m132886a());
            }
            final ProductPhoto productPhoto = this.f91575b;
            final C18086d0 c18086d0 = this.f91576c;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C18086d0.f.m96230h(ProductPhoto.this, c18086d0);
                }
            });
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(final long j11) {
            final ProductPhoto productPhoto = this.f91575b;
            final C18086d0 c18086d0 = this.f91576c;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C18086d0.f.m96231i(ProductPhoto.this, j11, c18086d0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.d0$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {
        g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m96233c(C18086d0 c18086d0, AbstractC28671p abstractC28671p) {
            InterfaceC18505l interfaceC18505l;
            AbstractC19074t.m100208f(c18086d0, "this$0");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            InterfaceC18505l interfaceC18505l2 = c18086d0.f91546C;
            if (interfaceC18505l2 != null) {
                interfaceC18505l2.mo205i9(b.C32809b.f91559a);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                InterfaceC18505l interfaceC18505l3 = c18086d0.f91546C;
                if (interfaceC18505l3 != null) {
                    interfaceC18505l3.mo205i9(b.f.f91563a);
                    return;
                }
                return;
            }
            if ((abstractC28671p instanceof AbstractC28671p.a) && (interfaceC18505l = c18086d0.f91546C) != null) {
                interfaceC18505l.mo205i9(new b.j(((AbstractC28671p.a) abstractC28671p).m143579a()));
            }
        }

        /* renamed from: b */
        public final void m96234b(final AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18086d0.this.f91548E = false;
            final C18086d0 c18086d0 = C18086d0.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.i0
                @Override // java.lang.Runnable
                public final void run() {
                    C18086d0.g.m96233c(C18086d0.this, abstractC28671p);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96234b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.d0$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ long f91579r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j11) {
            super(1);
            this.f91579r = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m96237d(C18086d0 c18086d0) {
            AbstractC19074t.m100208f(c18086d0, "this$0");
            InterfaceC18505l interfaceC18505l = c18086d0.f91546C;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(b.C32809b.f91559a);
            }
            InterfaceC18505l interfaceC18505l2 = c18086d0.f91546C;
            if (interfaceC18505l2 != null) {
                interfaceC18505l2.mo205i9(b.f.f91563a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m96238e(C18086d0 c18086d0, AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(c18086d0, "this$0");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            InterfaceC18505l interfaceC18505l = c18086d0.f91546C;
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(b.C32809b.f91559a);
            }
            InterfaceC18505l interfaceC18505l2 = c18086d0.f91546C;
            if (interfaceC18505l2 != null) {
                interfaceC18505l2.mo205i9(new b.j(((AbstractC28671p.a) abstractC28671p).m143579a()));
            }
        }

        /* renamed from: c */
        public final void m96239c(final AbstractC28671p abstractC28671p) {
            Product product;
            AbstractC19074t.m100208f(abstractC28671p, "result");
            if (abstractC28671p instanceof AbstractC28671p.b) {
                long m96210i0 = C18086d0.this.m96210i0();
                long j11 = this.f91579r;
                if (m96210i0 == j11) {
                    C18086d0.this.f91548E = false;
                    final C18086d0 c18086d0 = C18086d0.this;
                    AbstractC19444a.m101697e(new Runnable() { // from class: dy.j0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18086d0.h.m96237d(C18086d0.this);
                        }
                    });
                    return;
                }
                long m96210i02 = C18086d0.this.m96210i0();
                Product product2 = C18086d0.this.f91554w;
                if (product2 == null) {
                    AbstractC19074t.m100223u("product");
                    product2 = null;
                }
                String m48486j = product2.m48486j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveProduct(MOVE-PRODUCT-AFTER-EDIT) oldCatalogId: ");
                sb2.append(j11);
                sb2.append(", destCatalogId: ");
                sb2.append(m96210i02);
                sb2.append(", product: ");
                sb2.append(m48486j);
                C18086d0 c18086d02 = C18086d0.this;
                long j12 = this.f91579r;
                long m96210i03 = c18086d02.m96210i0();
                Product product3 = C18086d0.this.f91554w;
                if (product3 == null) {
                    AbstractC19074t.m100223u("product");
                    product = null;
                } else {
                    product = product3;
                }
                c18086d02.m96194w0(j12, m96210i03, product);
                return;
            }
            if (abstractC28671p instanceof AbstractC28671p.a) {
                C18086d0.this.f91548E = false;
                final C18086d0 c18086d03 = C18086d0.this;
                AbstractC19444a.m101697e(new Runnable() { // from class: dy.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18086d0.h.m96238e(C18086d0.this, abstractC28671p);
                    }
                });
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96239c((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dy.d0$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {
        i() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m96241c(C18086d0 c18086d0, AbstractC28671p abstractC28671p) {
            InterfaceC18505l interfaceC18505l;
            AbstractC19074t.m100208f(c18086d0, "this$0");
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            InterfaceC18505l interfaceC18505l2 = c18086d0.f91546C;
            if (interfaceC18505l2 != null) {
                interfaceC18505l2.mo205i9(b.C32809b.f91559a);
            }
            if (abstractC28671p instanceof AbstractC28671p.b) {
                InterfaceC18505l interfaceC18505l3 = c18086d0.f91546C;
                if (interfaceC18505l3 != null) {
                    interfaceC18505l3.mo205i9(b.d.f91561a);
                    return;
                }
                return;
            }
            if ((abstractC28671p instanceof AbstractC28671p.a) && (interfaceC18505l = c18086d0.f91546C) != null) {
                interfaceC18505l.mo205i9(new b.j(((AbstractC28671p.a) abstractC28671p).m143579a()));
            }
        }

        /* renamed from: b */
        public final void m96242b(final AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18086d0.this.f91548E = false;
            final C18086d0 c18086d0 = C18086d0.this;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C18086d0.i.m96241c(C18086d0.this, abstractC28671p);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96242b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    public C18086d0() {
        C1761c0 c1761c0 = new C1761c0();
        this.f91555x = c1761c0;
        this.f91556y = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f91557z = c1761c02;
        this.f91544A = c1761c02;
        this.f91545B = C28669n.Companion.m143559a();
        this.f91549F = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m96166C0(C18086d0 c18086d0) {
        AbstractC19074t.m100208f(c18086d0, "this$0");
        InterfaceC18505l interfaceC18505l = c18086d0.f91546C;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(b.C32809b.f91559a);
        }
        InterfaceC18505l interfaceC18505l2 = c18086d0.f91546C;
        if (interfaceC18505l2 != null) {
            String m104492d = AbstractC28665j.m143429e().m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18505l2.mo205i9(new b.j(m104492d));
        }
    }

    /* renamed from: D0 */
    private final void m96167D0(long j11) {
        this.f91551t = j11;
        m96190s0();
    }

    /* renamed from: K0 */
    private final void m96168K0(String str) {
        if (!this.f91549F.contains(str)) {
            return;
        }
        C0815e1.m2075D().m2100V(new C23648e(49, "", 0, "product_create_dup", new String[0]), false);
    }

    /* renamed from: M0 */
    private final void m96170M0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.x
            @Override // java.lang.Runnable
            public final void run() {
                C18086d0.m96172N0(C18086d0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m96172N0(C18086d0 c18086d0) {
        C29259b m143543S;
        String m146160o;
        AbstractC19074t.m100208f(c18086d0, "this$0");
        long j11 = c18086d0.f91551t;
        String str = "";
        if (j11 > 0 && (m143543S = c18086d0.f91545B.m143543S(j11)) != null && (m146160o = m143543S.m146160o()) != null) {
            str = m146160o;
        }
        c18086d0.f91557z.mo9221n(str);
    }

    /* renamed from: O0 */
    private final void m96174O0(long j11, Product product) {
        this.f91552u = product;
        Product product2 = new Product(product.m48485i(), null, null, 0L, null, null, null, null, 0L, null, 0 == true ? 1 : 0, 2046, null);
        product2.m48478b(product);
        this.f91554w = product2;
        this.f91555x.mo9221n(product2);
        m96203I0(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final int m96186e0() {
        int i11;
        Product product = this.f91554w;
        Product product2 = null;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        synchronized (product) {
            try {
                Product product3 = this.f91554w;
                if (product3 == null) {
                    AbstractC19074t.m100223u("product");
                } else {
                    product2 = product3;
                }
                Iterator it = product2.m48487k().iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (((ProductPhoto) it.next()).m48510i().length() == 0) {
                        i11++;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    /* renamed from: g0 */
    private final void m96187g0(ProductPhoto productPhoto) {
        String m48503b = productPhoto.m48503b();
        String str = C20131e.f99303a.m104947d() + AbstractC23352g.m122788d(m48503b) + AbstractC23041d2.m118220s(m48503b);
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("doRenew#START: remoteUrl: ");
            sb2.append(m48503b);
            sb2.append(", downloadPath: ");
            sb2.append(str);
        }
        try {
            File file = new File(str);
            if (AbstractC23258x2.m119958q(file.getPath())) {
                String path = file.getPath();
                AbstractC19074t.m100207e(path, "getPath(...)");
                productPhoto.m48511j(path);
                m96197z0(productPhoto);
                return;
            }
            file.delete();
            new C23528a(MainApplication.Companion.m35500c()).m123600e(m48503b, file, new e(m48503b, str, productPhoto, file, this));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m96195x0(productPhoto);
        }
    }

    /* renamed from: h0 */
    private final void m96188h0(ProductPhoto productPhoto) {
        String m48504c = productPhoto.m48504c();
        int m48505d = productPhoto.m48505d();
        productPhoto.m48512k(2);
        InterfaceC18505l interfaceC18505l = this.f91546C;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new b.h(productPhoto));
        }
        if (AbstractC9183a.m48999g()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("doUpload START photoPath: ");
            sb2.append(m48504c);
        }
        C24226d.b bVar = C24226d.Companion;
        C24230h m126433h = C24226d.b.m126433h(bVar, m48505d, EnumC24229g.f116975N, m48504c, null, null, null, 5000L, false, 56, null);
        m126433h.m126510j0(true);
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        m126433h.m126482B0(str);
        m126433h.m126505h(new f(m48504c, productPhoto, this));
        bVar.m126442j(m126433h);
    }

    /* renamed from: k0 */
    private final C17583b m96189k0(Product product, Product product2) {
        int m131511r;
        Set m131189Q0;
        int m131511r2;
        Set m131189Q02;
        Set m131564j;
        int i11;
        Set m131564j2;
        C17583b c17583b = new C17583b(0, 0, 0, 0, 15, null);
        if (product == null) {
            c17583b.m93630f(1);
            c17583b.m93631g(1);
            c17583b.m93629e(1);
            c17583b.m93632h(1);
        } else {
            List m48479c = product.m48479c();
            m131511r = AbstractC25370t.m131511r(m48479c, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m48479c.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductPhoto) it.next()).m48502a());
            }
            m131189Q0 = AbstractC25332a0.m131189Q0(arrayList);
            List m48479c2 = product2.m48479c();
            m131511r2 = AbstractC25370t.m131511r(m48479c2, 10);
            ArrayList arrayList2 = new ArrayList(m131511r2);
            Iterator it2 = m48479c2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ProductPhoto) it2.next()).m48502a());
            }
            m131189Q02 = AbstractC25332a0.m131189Q0(arrayList2);
            m131564j = AbstractC25381y0.m131564j(m131189Q0, m131189Q02);
            if (m131564j.isEmpty()) {
                m131564j2 = AbstractC25381y0.m131564j(m131189Q02, m131189Q0);
                if (m131564j2.isEmpty()) {
                    i11 = 0;
                    c17583b.m93630f(i11);
                    c17583b.m93631g(!AbstractC19074t.m100204b(product.m48488l(), product2.m48488l()) ? 1 : 0);
                    c17583b.m93629e(!AbstractC19074t.m100204b(product.m48483g(), product2.m48483g()) ? 1 : 0);
                    c17583b.m93632h(!AbstractC19074t.m100204b(product.m48491o(), product2.m48491o()) ? 1 : 0);
                }
            }
            i11 = 1;
            c17583b.m93630f(i11);
            c17583b.m93631g(!AbstractC19074t.m100204b(product.m48488l(), product2.m48488l()) ? 1 : 0);
            c17583b.m93629e(!AbstractC19074t.m100204b(product.m48483g(), product2.m48483g()) ? 1 : 0);
            c17583b.m93632h(!AbstractC19074t.m100204b(product.m48491o(), product2.m48491o()) ? 1 : 0);
        }
        return c17583b;
    }

    /* renamed from: s0 */
    private final void m96190s0() {
        if (this.f91551t == -1000) {
            synchronized (this.f91553v) {
                this.f91553v.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.y
                @Override // java.lang.Runnable
                public final void run() {
                    C18086d0.m96191t0(C18086d0.this);
                }
            });
            return;
        }
        synchronized (this.f91553v) {
            this.f91553v.clear();
            C24848g0 c24848g02 = C24848g0.f119245a;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: dy.z
            @Override // java.lang.Runnable
            public final void run() {
                C18086d0.m96192u0(C18086d0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static final void m96191t0(C18086d0 c18086d0) {
        AbstractC19074t.m100208f(c18086d0, "this$0");
        InterfaceC18505l interfaceC18505l = c18086d0.f91546C;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(b.a.f91558a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m96192u0(final C18086d0 c18086d0) {
        AbstractC19074t.m100208f(c18086d0, "this$0");
        List m143548Z = c18086d0.f91545B.m143548Z(c18086d0.f91551t);
        synchronized (c18086d0.f91553v) {
            c18086d0.f91553v.clear();
            c18086d0.f91553v.addAll(m143548Z);
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: dy.b0
            @Override // java.lang.Runnable
            public final void run() {
                C18086d0.m96193v0(C18086d0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m96193v0(C18086d0 c18086d0) {
        AbstractC19074t.m100208f(c18086d0, "this$0");
        InterfaceC18505l interfaceC18505l = c18086d0.f91546C;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(b.a.f91558a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public final void m96194w0(long j11, long j12, Product product) {
        List m131496e;
        m131496e = AbstractC25366r.m131496e(Long.valueOf(product.m48485i()));
        this.f91545B.m143555p0(j11, j12, m131496e, MoveProductSource.ProductEditView.f48770q, new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public final void m96195x0(final ProductPhoto productPhoto) {
        AbstractC19444a.m101697e(new Runnable() { // from class: dy.c0
            @Override // java.lang.Runnable
            public final void run() {
                C18086d0.m96196y0(ProductPhoto.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m96196y0(ProductPhoto productPhoto, C18086d0 c18086d0) {
        AbstractC19074t.m100208f(productPhoto, "$productPhoto");
        AbstractC19074t.m100208f(c18086d0, "this$0");
        productPhoto.m48512k(4);
        productPhoto.m48513l(0L);
        InterfaceC18505l interfaceC18505l = c18086d0.f91546C;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new b.h(productPhoto));
        }
        if (c18086d0.f91548E) {
            c18086d0.f91548E = false;
            InterfaceC18505l interfaceC18505l2 = c18086d0.f91546C;
            if (interfaceC18505l2 != null) {
                interfaceC18505l2.mo205i9(b.C32809b.f91559a);
            }
            InterfaceC18505l interfaceC18505l3 = c18086d0.f91546C;
            if (interfaceC18505l3 != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_add_view_error_general);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                interfaceC18505l3.mo205i9(new b.j(m118743r0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public final void m96197z0(ProductPhoto productPhoto) {
        m96188h0(productPhoto);
    }

    /* renamed from: A0 */
    public final void m96198A0(ProductPhoto productPhoto) {
        AbstractC19074t.m100208f(productPhoto, "productPhoto");
        Product product = this.f91554w;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        product.m48493q(productPhoto);
    }

    /* renamed from: B0 */
    public final void m96199B0() {
        int i11;
        Product product;
        AddProductSource addProductSource;
        int i12;
        Product product2;
        EditProductSource editProductSource;
        Product product3;
        if (this.f91548E) {
            return;
        }
        this.f91548E = true;
        InterfaceC18505l interfaceC18505l = this.f91546C;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(b.i.f91566a);
        }
        Product product4 = null;
        if (m96186e0() > 0) {
            Product product5 = this.f91554w;
            if (product5 == null) {
                AbstractC19074t.m100223u("product");
                product5 = null;
            }
            synchronized (product5) {
                try {
                    Product product6 = this.f91554w;
                    if (product6 == null) {
                        AbstractC19074t.m100223u("product");
                    } else {
                        product4 = product6;
                    }
                    for (ProductPhoto productPhoto : product4.m48487k()) {
                        if (productPhoto.m48510i().length() == 0) {
                            if (productPhoto.m48504c().length() > 0) {
                                m96188h0(productPhoto);
                            } else if (productPhoto.m48503b().length() > 0) {
                                m96187g0(productPhoto);
                            }
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        Product product7 = this.f91554w;
        if (product7 == null) {
            AbstractC19074t.m100223u("product");
            product7 = null;
        }
        if (product7.m48485i() != -1000) {
            Product product8 = this.f91552u;
            Product product9 = this.f91554w;
            if (product9 == null) {
                AbstractC19074t.m100223u("product");
                product9 = null;
            }
            C17583b m96189k0 = m96189k0(product8, product9);
            if (!m96189k0.m93633i()) {
                long j11 = this.f91550s;
                long j12 = this.f91551t;
                if (j11 != j12) {
                    Product product10 = this.f91554w;
                    if (product10 == null) {
                        AbstractC19074t.m100223u("product");
                        product10 = null;
                    }
                    String m48486j = product10.m48486j();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("saveProduct(MOVE-PRODUCT) oldCatalogId: ");
                    sb2.append(j11);
                    sb2.append(", destCatalogId: ");
                    sb2.append(j12);
                    sb2.append(", product: ");
                    sb2.append(m48486j);
                    long j13 = this.f91550s;
                    long j14 = this.f91551t;
                    Product product11 = this.f91554w;
                    if (product11 == null) {
                        AbstractC19074t.m100223u("product");
                        product3 = null;
                    } else {
                        product3 = product11;
                    }
                    m96194w0(j13, j14, product3);
                    return;
                }
            }
            long j15 = this.f91550s;
            if (j15 == -1000) {
                this.f91548E = false;
                AbstractC19444a.m101697e(new Runnable() { // from class: dy.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18086d0.m96166C0(C18086d0.this);
                    }
                });
                return;
            }
            Product product12 = this.f91554w;
            if (product12 == null) {
                AbstractC19074t.m100223u("product");
                product12 = null;
            }
            String m48486j2 = product12.m48486j();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("saveProduct(EDIT-PRODUCT) catalogId: ");
            sb3.append(j15);
            sb3.append(", product: ");
            sb3.append(m48486j2);
            C28669n c28669n = this.f91545B;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            C29259b m143545U = c28669n.m143545U(str, j15);
            if (m143545U != null) {
                i12 = m143545U.m146167v();
            } else {
                i12 = 0;
            }
            C28669n c28669n2 = this.f91545B;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            int m146253h = c28669n2.m143551e0(str2).m146253h();
            C28669n c28669n3 = this.f91545B;
            Product product13 = this.f91554w;
            if (product13 == null) {
                AbstractC19074t.m100223u("product");
                product2 = null;
            } else {
                product2 = product13;
            }
            Parcelable parcelable = this.f91547D;
            if (parcelable instanceof EditProductSource) {
                editProductSource = (EditProductSource) parcelable;
            } else {
                editProductSource = null;
            }
            if (editProductSource == null) {
                editProductSource = EditProductSource.Unknown.f48768q;
            }
            c28669n3.m143540N(j15, i12, m146253h, product2, editProductSource, m96189k0, new h(j15));
            Product product14 = this.f91554w;
            if (product14 == null) {
                AbstractC19074t.m100223u("product");
            } else {
                product4 = product14;
            }
            m96168K0(product4.m48488l());
            return;
        }
        long j16 = this.f91551t;
        Product product15 = this.f91554w;
        if (product15 == null) {
            AbstractC19074t.m100223u("product");
            product15 = null;
        }
        String m48486j3 = product15.m48486j();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("saveProduct(ADD-PRODUCT) catalogId: ");
        sb4.append(j16);
        sb4.append(", product: ");
        sb4.append(m48486j3);
        C28669n c28669n4 = this.f91545B;
        String str3 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str3, "currentUserUid");
        C29259b m143545U2 = c28669n4.m143545U(str3, this.f91551t);
        if (m143545U2 != null) {
            i11 = m143545U2.m146167v();
        } else {
            i11 = 0;
        }
        C28669n c28669n5 = this.f91545B;
        String str4 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str4, "currentUserUid");
        int m146253h2 = c28669n5.m143551e0(str4).m146253h();
        C28669n c28669n6 = this.f91545B;
        long j17 = this.f91551t;
        Product product16 = this.f91554w;
        if (product16 == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        } else {
            product = product16;
        }
        Parcelable parcelable2 = this.f91547D;
        if (parcelable2 instanceof AddProductSource) {
            addProductSource = (AddProductSource) parcelable2;
        } else {
            addProductSource = null;
        }
        if (addProductSource == null) {
            addProductSource = AddProductSource.Unknown.f48752q;
        }
        c28669n6.m143554p(j17, i11, m146253h2, product, addProductSource, new i());
        Product product17 = this.f91554w;
        if (product17 == null) {
            AbstractC19074t.m100223u("product");
        } else {
            product4 = product17;
        }
        m96168K0(product4.m48488l());
    }

    /* renamed from: E0 */
    public final void m96200E0(String str) {
        CharSequence m127168X0;
        AbstractC19074t.m100208f(str, "description");
        Product product = this.f91554w;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        m127168X0 = AbstractC24342w.m127168X0(str);
        product.m48497x(m127168X0.toString());
    }

    /* renamed from: F0 */
    public final void m96201F0(String str) {
        CharSequence m127168X0;
        AbstractC19074t.m100208f(str, "name");
        Product product = this.f91554w;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        m127168X0 = AbstractC24342w.m127168X0(str);
        product.m48498y(m127168X0.toString());
    }

    /* renamed from: G0 */
    public final void m96202G0(String str) {
        CharSequence m127168X0;
        AbstractC19074t.m100208f(str, "price");
        Product product = this.f91554w;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        m127168X0 = AbstractC24342w.m127168X0(str);
        product.m48475B(m127168X0.toString());
    }

    /* renamed from: I0 */
    public final void m96203I0(long j11) {
        m96167D0(j11);
        m96170M0();
    }

    /* renamed from: J0 */
    public final void m96204J0(InterfaceC18505l interfaceC18505l) {
        this.f91546C = interfaceC18505l;
    }

    /* renamed from: L0 */
    public final void m96205L0(String str) {
        AbstractC19074t.m100208f(str, "productName");
        if (str.length() == 0 || this.f91549F.contains(str)) {
            return;
        }
        this.f91549F.add(str);
        C0815e1.m2075D().m2100V(new C23648e(49, "", 1, "product_warning_dup", new String[0]), false);
    }

    /* renamed from: a0 */
    public final void m96206a0(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        if (!m96207b0()) {
            return;
        }
        String mo41081Q = mediaItem.mo41081Q();
        if (mo41081Q.length() == 0) {
            return;
        }
        Product product = this.f91554w;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        product.m48477a(mo41081Q);
        InterfaceC18505l interfaceC18505l = this.f91546C;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(new b.g(true));
        }
    }

    /* renamed from: b0 */
    public final boolean m96207b0() {
        Product product = this.f91554w;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        if (product.m48484h() < m96212l0()) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public final boolean m96208c0() {
        int m131511r;
        int m131511r2;
        Set m131189Q0;
        List m131220t0;
        Set m131189Q02;
        List m131220t02;
        if (this.f91551t <= 0) {
            return false;
        }
        Product product = this.f91554w;
        Product product2 = null;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            product = null;
        }
        if (product.m48488l().length() == 0) {
            return false;
        }
        Product product3 = this.f91552u;
        if (product3 != null) {
            String m48488l = product3.m48488l();
            Product product4 = this.f91554w;
            if (product4 == null) {
                AbstractC19074t.m100223u("product");
                product4 = null;
            }
            if (AbstractC19074t.m100204b(m48488l, product4.m48488l())) {
                String m48491o = product3.m48491o();
                Product product5 = this.f91554w;
                if (product5 == null) {
                    AbstractC19074t.m100223u("product");
                    product5 = null;
                }
                if (AbstractC19074t.m100204b(m48491o, product5.m48491o())) {
                    String m48483g = product3.m48483g();
                    Product product6 = this.f91554w;
                    if (product6 == null) {
                        AbstractC19074t.m100223u("product");
                        product6 = null;
                    }
                    if (AbstractC19074t.m100204b(m48483g, product6.m48483g())) {
                        List m48479c = product3.m48479c();
                        m131511r = AbstractC25370t.m131511r(m48479c, 10);
                        ArrayList arrayList = new ArrayList(m131511r);
                        Iterator it = m48479c.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ProductPhoto) it.next()).m48502a());
                        }
                        Product product7 = this.f91554w;
                        if (product7 == null) {
                            AbstractC19074t.m100223u("product");
                        } else {
                            product2 = product7;
                        }
                        List m48479c2 = product2.m48479c();
                        m131511r2 = AbstractC25370t.m131511r(m48479c2, 10);
                        ArrayList arrayList2 = new ArrayList(m131511r2);
                        Iterator it2 = m48479c2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((ProductPhoto) it2.next()).m48502a());
                        }
                        m131189Q0 = AbstractC25332a0.m131189Q0(arrayList2);
                        m131220t0 = AbstractC25332a0.m131220t0(arrayList, m131189Q0);
                        if (m131220t0.isEmpty()) {
                            m131189Q02 = AbstractC25332a0.m131189Q0(arrayList);
                            m131220t02 = AbstractC25332a0.m131220t0(arrayList2, m131189Q02);
                            if (m131220t02.isEmpty() && this.f91550s == this.f91551t) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: f0 */
    public final void m96209f0(Product product, DeleteProductSource deleteProductSource) {
        int i11;
        List m131496e;
        AbstractC19074t.m100208f(product, "product");
        AbstractC19074t.m100208f(deleteProductSource, "source");
        if (this.f91548E) {
            return;
        }
        this.f91548E = true;
        InterfaceC18505l interfaceC18505l = this.f91546C;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(b.i.f91566a);
        }
        C28669n c28669n = this.f91545B;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C29259b m143545U = c28669n.m143545U(str, this.f91551t);
        if (m143545U != null) {
            i11 = m143545U.m146167v();
        } else {
            i11 = 0;
        }
        C28669n c28669n2 = this.f91545B;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        int m146253h = c28669n2.m143551e0(str2).m146253h();
        C28669n c28669n3 = this.f91545B;
        long m48480d = product.m48480d();
        m131496e = AbstractC25366r.m131496e(product);
        c28669n3.m143538L(m48480d, i11, m146253h, m131496e, deleteProductSource, new d());
    }

    /* renamed from: i0 */
    public final long m96210i0() {
        return this.f91551t;
    }

    /* renamed from: j0 */
    public final LiveData m96211j0() {
        return this.f91544A;
    }

    /* renamed from: l0 */
    public final int m96212l0() {
        return C29264g.f135604a.m146197a();
    }

    /* renamed from: m0 */
    public final Product m96213m0() {
        Product product = this.f91554w;
        if (product == null) {
            AbstractC19074t.m100223u("product");
            return null;
        }
        return product;
    }

    /* renamed from: n0 */
    public final LiveData m96214n0() {
        return this.f91556y;
    }

    /* renamed from: o0 */
    public final void m96215o0(AbstractC29263f abstractC29263f) {
        InterfaceC18505l interfaceC18505l;
        InterfaceC18505l interfaceC18505l2;
        InterfaceC18505l interfaceC18505l3;
        InterfaceC18505l interfaceC18505l4;
        InterfaceC18505l interfaceC18505l5;
        AbstractC19074t.m100208f(abstractC29263f, "localEvent");
        if (abstractC29263f instanceof AbstractC29263f.g) {
            if (!((AbstractC29263f.g) abstractC29263f).m146189c() && (interfaceC18505l5 = this.f91546C) != null) {
                interfaceC18505l5.mo205i9(b.c.f91560a);
                return;
            }
            return;
        }
        if (abstractC29263f instanceof AbstractC29263f.j) {
            Product product = this.f91552u;
            if (product != null && ((AbstractC29263f.j) abstractC29263f).m146193c().m48485i() == product.m48485i()) {
                m96174O0(product.m48480d(), product);
                if (abstractC29263f.m146183a() && (interfaceC18505l4 = this.f91546C) != null) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_toast_product_edited_sync);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    interfaceC18505l4.mo205i9(new b.j(m118743r0));
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC29263f instanceof AbstractC29263f.i) {
            Product product2 = this.f91552u;
            if (product2 != null && ((AbstractC29263f.i) abstractC29263f).m146192d().contains(Long.valueOf(product2.m48485i()))) {
                InterfaceC18505l interfaceC18505l6 = this.f91546C;
                if (interfaceC18505l6 != null) {
                    interfaceC18505l6.mo205i9(b.c.f91560a);
                }
                if (abstractC29263f.m146183a() && (interfaceC18505l3 = this.f91546C) != null) {
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_toast_product_deleted_sync);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    interfaceC18505l3.mo205i9(new b.j(m118743r02));
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC29263f instanceof AbstractC29263f.k) {
            Product product3 = this.f91552u;
            if (product3 != null) {
                AbstractC29263f.k kVar = (AbstractC29263f.k) abstractC29263f;
                if (kVar.m146195d().contains(Long.valueOf(product3.m48485i()))) {
                    product3.m48494t(kVar.m146194c());
                    m96174O0(product3.m48480d(), product3);
                    if (abstractC29263f.m146183a() && (interfaceC18505l2 = this.f91546C) != null) {
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_toast_product_edited_sync);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        interfaceC18505l2.mo205i9(new b.j(m118743r03));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if ((abstractC29263f instanceof AbstractC29263f.e) && ((AbstractC29263f.e) abstractC29263f).m146188c().contains(Long.valueOf(this.f91551t))) {
            InterfaceC18505l interfaceC18505l7 = this.f91546C;
            if (interfaceC18505l7 != null) {
                interfaceC18505l7.mo205i9(b.c.f91560a);
            }
            if (abstractC29263f.m146183a() && (interfaceC18505l = this.f91546C) != null) {
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.product_catalog_toast_catalog_deleted_sync);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                interfaceC18505l.mo205i9(new b.j(m118743r04));
            }
        }
    }

    /* renamed from: p0 */
    public final boolean m96216p0() {
        int m131511r;
        Set m131189Q0;
        int m131511r2;
        Set m131189Q02;
        Set m131564j;
        Set m131564j2;
        Product product = this.f91552u;
        Product product2 = null;
        if (product != null) {
            String m48488l = product.m48488l();
            Product product3 = this.f91554w;
            if (product3 == null) {
                AbstractC19074t.m100223u("product");
                product3 = null;
            }
            if (AbstractC19074t.m100204b(m48488l, product3.m48488l())) {
                String m48491o = product.m48491o();
                Product product4 = this.f91554w;
                if (product4 == null) {
                    AbstractC19074t.m100223u("product");
                    product4 = null;
                }
                if (AbstractC19074t.m100204b(m48491o, product4.m48491o())) {
                    String m48483g = product.m48483g();
                    Product product5 = this.f91554w;
                    if (product5 == null) {
                        AbstractC19074t.m100223u("product");
                        product5 = null;
                    }
                    if (AbstractC19074t.m100204b(m48483g, product5.m48483g())) {
                        List m48479c = product.m48479c();
                        m131511r = AbstractC25370t.m131511r(m48479c, 10);
                        ArrayList arrayList = new ArrayList(m131511r);
                        Iterator it = m48479c.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ProductPhoto) it.next()).m48502a());
                        }
                        m131189Q0 = AbstractC25332a0.m131189Q0(arrayList);
                        Product product6 = this.f91554w;
                        if (product6 == null) {
                            AbstractC19074t.m100223u("product");
                        } else {
                            product2 = product6;
                        }
                        List m48479c2 = product2.m48479c();
                        m131511r2 = AbstractC25370t.m131511r(m48479c2, 10);
                        ArrayList arrayList2 = new ArrayList(m131511r2);
                        Iterator it2 = m48479c2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((ProductPhoto) it2.next()).m48502a());
                        }
                        m131189Q02 = AbstractC25332a0.m131189Q0(arrayList2);
                        m131564j = AbstractC25381y0.m131564j(m131189Q0, m131189Q02);
                        if (m131564j.isEmpty()) {
                            m131564j2 = AbstractC25381y0.m131564j(m131189Q02, m131189Q0);
                            if (m131564j2.isEmpty() && this.f91550s == this.f91551t) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        Product product7 = this.f91554w;
        if (product7 == null) {
            AbstractC19074t.m100223u("product");
            product7 = null;
        }
        if (product7.m48488l().length() <= 0) {
            Product product8 = this.f91554w;
            if (product8 == null) {
                AbstractC19074t.m100223u("product");
                product8 = null;
            }
            if (product8.m48491o().length() <= 0) {
                Product product9 = this.f91554w;
                if (product9 == null) {
                    AbstractC19074t.m100223u("product");
                    product9 = null;
                }
                if (product9.m48483g().length() <= 0) {
                    Product product10 = this.f91554w;
                    if (product10 == null) {
                        AbstractC19074t.m100223u("product");
                    } else {
                        product2 = product10;
                    }
                    if (product2.m48484h() <= 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: q0 */
    public final void m96217q0(long j11, Product product, Product product2, Product product3, Parcelable parcelable) {
        Product product4;
        Iterable arrayList;
        int m131511r;
        m96167D0(j11);
        this.f91550s = j11;
        this.f91552u = product;
        if (product3 != null) {
            product4 = product3;
        } else if (product != null) {
            Product product5 = new Product(product.m48485i(), null, null, 0L, null, null, null, null, 0L, null, 0 == true ? 1 : 0, 2046, null);
            product5.m48478b(product);
            product4 = product5;
        } else if (product2 != null) {
            Product product6 = new Product(-1000L, null, null, 0L, null, null, null, null, 0L, null, null, 2046, null);
            product6.m48478b(product2);
            synchronized (product6) {
                try {
                    product6.m48490n().clear();
                    if (product2.m48490n().size() > m96212l0()) {
                        arrayList = new ArrayList(product2.m48490n()).subList(0, m96212l0());
                    } else {
                        arrayList = new ArrayList(product2.m48490n());
                    }
                    AbstractC19074t.m100205c(arrayList);
                    Iterable<String> iterable = arrayList;
                    m131511r = AbstractC25370t.m131511r(iterable, 10);
                    ArrayList arrayList2 = new ArrayList(m131511r);
                    for (String str : iterable) {
                        AbstractC19074t.m100205c(str);
                        arrayList2.add(new ProductPhoto(2, "", "", str));
                    }
                    product6.m48490n().clear();
                    product6.m48487k().clear();
                    product6.m48487k().addAll(arrayList2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.product_catalog_duplicated_product_pattern, product6.m48488l());
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            product6.m48498y(m118746s0);
            product4 = product6;
        } else {
            product4 = new Product(-1000L, null, null, 0L, null, null, null, null, 0L, null, null, 2046, null);
        }
        this.f91554w = product4;
        this.f91555x.mo9221n(product4);
        this.f91547D = parcelable;
        m96170M0();
    }

    /* renamed from: r0 */
    public final boolean m96218r0(Product product) {
        AbstractC19074t.m100208f(product, "product");
        if (product.m48488l().length() == 0) {
            return false;
        }
        synchronized (this.f91553v) {
            for (C24860q c24860q : this.f91553v) {
                if (AbstractC19074t.m100204b(c24860q.m129216d(), product.m48488l()) && ((Number) c24860q.m129215c()).longValue() != product.m48485i()) {
                    return true;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            return false;
        }
    }
}
