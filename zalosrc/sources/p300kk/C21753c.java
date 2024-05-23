package p300kk;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kk.c */
/* loaded from: classes3.dex */
public final class C21753c {

    /* renamed from: a */
    private final List f105631a;

    /* renamed from: b */
    private int f105632b;

    /* renamed from: c */
    private boolean f105633c;

    public C21753c(int i11) {
        this.f105632b = i11;
        this.f105631a = new ArrayList();
    }

    /* renamed from: a */
    public final boolean m112205a() {
        return this.f105633c;
    }

    /* renamed from: b */
    public final List m112206b() {
        return this.f105631a;
    }

    /* renamed from: c */
    public final int m112207c() {
        return this.f105632b;
    }

    /* renamed from: d */
    public final void m112208d(boolean z11) {
        this.f105633c = z11;
    }

    /* renamed from: e */
    public final void m112209e(int i11) {
        this.f105632b = i11;
    }

    public C21753c(int i11, List list) {
        AbstractC19074t.m100208f(list, "mediaStoreItems");
        this.f105632b = i11;
        this.f105631a = list;
    }
}
