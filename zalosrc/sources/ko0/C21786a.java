package ko0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;

/* renamed from: ko0.a */
/* loaded from: classes7.dex */
public final class C21786a {

    /* renamed from: a */
    private String f105742a;

    /* renamed from: b */
    private String f105743b;

    /* renamed from: c */
    private ArrayList f105744c;

    /* renamed from: ko0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        private int f105745a;

        /* renamed from: b */
        private int f105746b;

        /* renamed from: c */
        private int f105747c;

        /* renamed from: d */
        private int f105748d;

        public a() {
            this(0, 0, 0, 0, 15, null);
        }

        /* renamed from: a */
        public final int m112438a() {
            return this.f105745a;
        }

        /* renamed from: b */
        public final int m112439b() {
            return this.f105746b;
        }

        /* renamed from: c */
        public final void m112440c(int i11) {
            this.f105745a = i11;
        }

        /* renamed from: d */
        public final void m112441d(int i11) {
            this.f105748d = i11;
        }

        /* renamed from: e */
        public final void m112442e(int i11) {
            this.f105746b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f105745a == aVar.f105745a && this.f105746b == aVar.f105746b && this.f105747c == aVar.f105747c && this.f105748d == aVar.f105748d;
        }

        /* renamed from: f */
        public final void m112443f(int i11) {
            this.f105747c = i11;
        }

        public int hashCode() {
            return (((((this.f105745a * 31) + this.f105746b) * 31) + this.f105747c) * 31) + this.f105748d;
        }

        public String toString() {
            return "TrendingSticker(cateId=" + this.f105745a + ", stickerId=" + this.f105746b + ", stickerType=" + this.f105747c + ", order=" + this.f105748d + ")";
        }

        public a(int i11, int i12, int i13, int i14) {
            this.f105745a = i11;
            this.f105746b = i12;
            this.f105747c = i13;
            this.f105748d = i14;
        }

        public /* synthetic */ a(int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
            this((i15 & 1) != 0 ? -1 : i11, (i15 & 2) != 0 ? -1 : i12, (i15 & 4) != 0 ? -1 : i13, (i15 & 8) != 0 ? -1 : i14);
        }
    }

    public C21786a() {
        this(null, null, null, 7, null);
    }

    /* renamed from: a */
    public final ArrayList m112432a() {
        return this.f105744c;
    }

    /* renamed from: b */
    public final String m112433b() {
        return this.f105743b;
    }

    /* renamed from: c */
    public final String m112434c() {
        return this.f105742a;
    }

    /* renamed from: d */
    public final void m112435d(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f105744c = arrayList;
    }

    /* renamed from: e */
    public final void m112436e(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f105743b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21786a)) {
            return false;
        }
        C21786a c21786a = (C21786a) obj;
        return AbstractC19074t.m100204b(this.f105742a, c21786a.f105742a) && AbstractC19074t.m100204b(this.f105743b, c21786a.f105743b) && AbstractC19074t.m100204b(this.f105744c, c21786a.f105744c);
    }

    /* renamed from: f */
    public final void m112437f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f105742a = str;
    }

    public int hashCode() {
        return (((this.f105742a.hashCode() * 31) + this.f105743b.hashCode()) * 31) + this.f105744c.hashCode();
    }

    public String toString() {
        return "CallStickerModel(titleVni=" + this.f105742a + ", titleEng=" + this.f105743b + ", listTrendingSticker=" + this.f105744c + ")";
    }

    public C21786a(String str, String str2, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "titleVni");
        AbstractC19074t.m100208f(str2, "titleEng");
        AbstractC19074t.m100208f(arrayList, "listTrendingSticker");
        this.f105742a = str;
        this.f105743b = str2;
        this.f105744c = arrayList;
    }

    public /* synthetic */ C21786a(String str, String str2, ArrayList arrayList, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
