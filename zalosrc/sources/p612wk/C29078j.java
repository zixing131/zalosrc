package p612wk;

import android.view.View;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p612wk.AbstractC29072d;

/* renamed from: wk.j */
/* loaded from: classes3.dex */
public final class C29078j {

    /* renamed from: a */
    private final AbstractC29080l f134873a;

    /* renamed from: b */
    private final List f134874b;

    /* renamed from: c */
    private int f134875c;

    /* renamed from: d */
    private AbstractC29072d f134876d;

    /* renamed from: e */
    private int f134877e;

    /* renamed from: f */
    private boolean f134878f;

    /* renamed from: g */
    private final int f134879g;

    public C29078j(AbstractC29080l abstractC29080l, List list, int i11, AbstractC29072d abstractC29072d, int i12, boolean z11, int i13) {
        AbstractC19074t.m100208f(abstractC29080l, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(list, "data");
        AbstractC19074t.m100208f(abstractC29072d, "state");
        this.f134873a = abstractC29080l;
        this.f134874b = list;
        this.f134875c = i11;
        this.f134876d = abstractC29072d;
        this.f134877e = i12;
        this.f134878f = z11;
        this.f134879g = i13;
    }

    /* renamed from: a */
    public final List m145301a() {
        return this.f134874b;
    }

    /* renamed from: b */
    public final int m145302b() {
        return this.f134879g;
    }

    /* renamed from: c */
    public final int m145303c() {
        return this.f134877e;
    }

    /* renamed from: d */
    public final boolean m145304d() {
        return this.f134878f;
    }

    /* renamed from: e */
    public final AbstractC29072d m145305e() {
        return this.f134876d;
    }

    /* renamed from: f */
    public final int m145306f() {
        return this.f134875c;
    }

    /* renamed from: g */
    public final AbstractC29080l m145307g() {
        return this.f134873a;
    }

    /* renamed from: h */
    public final void m145308h(int i11) {
        this.f134877e = i11;
    }

    /* renamed from: i */
    public final void m145309i(boolean z11) {
        this.f134878f = z11;
    }

    /* renamed from: j */
    public final void m145310j(int i11) {
        this.f134875c = i11;
    }

    public /* synthetic */ C29078j(AbstractC29080l abstractC29080l, List list, int i11, AbstractC29072d abstractC29072d, int i12, boolean z11, int i13, int i14, AbstractC19060k abstractC19060k) {
        this(abstractC29080l, (i14 & 2) != 0 ? new ArrayList() : list, i11, (i14 & 8) != 0 ? AbstractC29072d.b.f134804a : abstractC29072d, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? false : z11, (i14 & 64) != 0 ? View.generateViewId() : i13);
    }
}
