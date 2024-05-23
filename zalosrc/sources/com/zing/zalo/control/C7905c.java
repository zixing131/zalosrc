package com.zing.zalo.control;

import au.EnumC2382z;
import ci.C3503g0;
import com.zing.zalo.control.C7906d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.control.c */
/* loaded from: classes3.dex */
public final class C7905c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f42757a;

    /* renamed from: b */
    private long f42758b;

    /* renamed from: c */
    private C7906d f42759c;

    /* renamed from: d */
    private final List f42760d;

    /* renamed from: e */
    private CharSequence f42761e;

    /* renamed from: f */
    private CharSequence f42762f;

    /* renamed from: g */
    private int f42763g;

    /* renamed from: h */
    private boolean f42764h;

    /* renamed from: i */
    private C3503g0 f42765i;

    /* renamed from: j */
    private final InterfaceC24854k f42766j;

    /* renamed from: k */
    private int f42767k;

    /* renamed from: l */
    private int f42768l;

    /* renamed from: m */
    private int f42769m;

    /* renamed from: n */
    private EnumC2382z f42770n;

    /* renamed from: com.zing.zalo.control.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7905c m40808a(EnumC2382z enumC2382z) {
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            C7905c c7905c = new C7905c(10, null, null, 6, null);
            c7905c.m40799r(enumC2382z);
            return c7905c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.control.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f42771q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    public C7905c(int i11, C7906d c7906d, List list) {
        InterfaceC24854k m129210a;
        this.f42757a = i11;
        this.f42759c = c7906d;
        ArrayList arrayList = new ArrayList();
        this.f42760d = arrayList;
        this.f42763g = -1;
        this.f42764h = true;
        m129210a = AbstractC24856m.m129210a(b.f42771q);
        this.f42766j = m129210a;
        this.f42767k = 6;
        this.f42768l = 1;
        this.f42769m = 1;
        this.f42770n = EnumC2382z.f9945r;
        if (list != null) {
            arrayList.clear();
            arrayList.addAll(list);
        }
    }

    /* renamed from: a */
    public final List m40782a() {
        return (List) this.f42766j.getValue();
    }

    /* renamed from: b */
    public final long m40783b() {
        C7906d c7906d = this.f42759c;
        if (c7906d != null && c7906d.m40826o()) {
            C7906d c7906d2 = this.f42759c;
            AbstractC19074t.m100205c(c7906d2);
            C7906d.b m40819h = c7906d2.m40819h();
            if (m40819h == null) {
                return 0L;
            }
            return m40819h.m40842b();
        }
        if (!(!this.f42760d.isEmpty())) {
            return 0L;
        }
        return ((MediaStoreItem) this.f42760d.get(0)).m40599m().m95313z4();
    }

    /* renamed from: c */
    public final EnumC2382z m40784c() {
        return this.f42770n;
    }

    /* renamed from: d */
    public final int m40785d() {
        return this.f42769m;
    }

    /* renamed from: e */
    public final CharSequence m40786e() {
        return this.f42762f;
    }

    /* renamed from: f */
    public final float m40787f() {
        float f11 = 0.0f;
        if (!this.f42760d.isEmpty()) {
            for (MediaStoreItem mediaStoreItem : this.f42760d) {
                if (mediaStoreItem.m40561C() > f11) {
                    f11 = mediaStoreItem.m40561C();
                }
            }
        }
        return f11;
    }

    /* renamed from: g */
    public final MediaStoreItem m40788g() {
        if (!this.f42760d.isEmpty()) {
            return (MediaStoreItem) this.f42760d.get(0);
        }
        return null;
    }

    /* renamed from: h */
    public final List m40789h() {
        return this.f42760d;
    }

    /* renamed from: i */
    public final long m40790i() {
        return this.f42758b;
    }

    /* renamed from: j */
    public final CharSequence m40791j() {
        return this.f42761e;
    }

    /* renamed from: k */
    public final int m40792k() {
        return this.f42763g;
    }

    /* renamed from: l */
    public final C3503g0 m40793l() {
        return this.f42765i;
    }

    /* renamed from: m */
    public final C7906d m40794m() {
        return this.f42759c;
    }

    /* renamed from: n */
    public final boolean m40795n() {
        return this.f42764h;
    }

    /* renamed from: o */
    public final int m40796o() {
        return this.f42768l;
    }

    /* renamed from: p */
    public final int m40797p() {
        return this.f42767k;
    }

    /* renamed from: q */
    public final int m40798q() {
        return this.f42757a;
    }

    /* renamed from: r */
    public final void m40799r(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "<set-?>");
        this.f42770n = enumC2382z;
    }

    /* renamed from: s */
    public final void m40800s(int i11) {
        this.f42769m = i11;
    }

    /* renamed from: t */
    public final void m40801t(long j11) {
        this.f42758b = j11;
    }

    /* renamed from: u */
    public final void m40802u(CharSequence charSequence) {
        this.f42761e = charSequence;
    }

    /* renamed from: v */
    public final void m40803v(int i11) {
        this.f42763g = i11;
    }

    /* renamed from: w */
    public final void m40804w(C3503g0 c3503g0) {
        this.f42765i = c3503g0;
    }

    /* renamed from: x */
    public final void m40805x(C7906d c7906d) {
        this.f42759c = c7906d;
    }

    /* renamed from: y */
    public final void m40806y(int i11) {
        this.f42768l = i11;
    }

    /* renamed from: z */
    public final void m40807z(int i11) {
        this.f42767k = i11;
    }

    public /* synthetic */ C7905c(int i11, C7906d c7906d, List list, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? null : c7906d, (i12 & 4) != 0 ? null : list);
    }
}
