package ar;

import bo.C3020p0;
import com.zing.zalo.control.ItemAlbumMobile;

/* renamed from: ar.v */
/* loaded from: classes4.dex */
public class C2321v extends AbstractC2325z {

    /* renamed from: b */
    private final C3020p0 f9805b;

    /* renamed from: c */
    private final ItemAlbumMobile f9806c;

    /* renamed from: d */
    private final boolean f9807d;

    /* renamed from: ar.v$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        private C3020p0 f9808a;

        /* renamed from: b */
        private ItemAlbumMobile f9809b;

        /* renamed from: c */
        private boolean f9810c;

        /* renamed from: a */
        public C2321v m12271a() {
            return new C2321v(this.f9808a, this.f9809b, this.f9810c);
        }

        /* renamed from: b */
        public a m12272b(C3020p0 c3020p0) {
            this.f9808a = c3020p0;
            return this;
        }

        /* renamed from: c */
        public a m12273c(boolean z11) {
            this.f9810c = z11;
            return this;
        }

        /* renamed from: d */
        public a m12274d(ItemAlbumMobile itemAlbumMobile) {
            this.f9809b = itemAlbumMobile;
            return this;
        }
    }

    /* renamed from: b */
    public static a m12267b() {
        return new a();
    }

    /* renamed from: c */
    public C3020p0 m12268c() {
        return this.f9805b;
    }

    /* renamed from: d */
    public ItemAlbumMobile m12269d() {
        return this.f9806c;
    }

    /* renamed from: e */
    public boolean m12270e() {
        return this.f9807d;
    }

    private C2321v(C3020p0 c3020p0, ItemAlbumMobile itemAlbumMobile, boolean z11) {
        this.f9805b = c3020p0;
        this.f9806c = itemAlbumMobile;
        this.f9807d = z11;
        m12283a(12);
    }
}
