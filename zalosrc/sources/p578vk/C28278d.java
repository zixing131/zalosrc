package p578vk;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p578vk.AbstractC28275a;

/* renamed from: vk.d */
/* loaded from: classes3.dex */
public final class C28278d {

    /* renamed from: a */
    private boolean f131947a;

    /* renamed from: b */
    private boolean f131948b;

    /* renamed from: c */
    private boolean f131949c;

    /* renamed from: d */
    private AbstractC28275a.a0 f131950d;

    /* renamed from: e */
    private final List f131951e;

    /* renamed from: f */
    private final List f131952f;

    /* renamed from: g */
    private final List f131953g;

    /* renamed from: h */
    private final List f131954h;

    /* renamed from: i */
    private final List f131955i;

    /* renamed from: j */
    private final boolean[] f131956j;

    public C28278d() {
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f131951e = synchronizedList;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList2, "synchronizedList(...)");
        this.f131952f = synchronizedList2;
        List synchronizedList3 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList3, "synchronizedList(...)");
        this.f131953g = synchronizedList3;
        List synchronizedList4 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList4, "synchronizedList(...)");
        this.f131954h = synchronizedList4;
        List synchronizedList5 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList5, "synchronizedList(...)");
        this.f131955i = synchronizedList5;
        this.f131956j = new boolean[]{false, false, false};
    }

    /* renamed from: a */
    public final List m142513a() {
        return this.f131951e;
    }

    /* renamed from: b */
    public final List m142514b() {
        return this.f131952f;
    }

    /* renamed from: c */
    public final boolean[] m142515c() {
        return this.f131956j;
    }

    /* renamed from: d */
    public final List m142516d() {
        return this.f131954h;
    }

    /* renamed from: e */
    public final List m142517e() {
        return this.f131955i;
    }

    /* renamed from: f */
    public final AbstractC28275a.a0 m142518f() {
        return this.f131950d;
    }

    /* renamed from: g */
    public final List m142519g() {
        return this.f131953g;
    }

    /* renamed from: h */
    public final boolean m142520h() {
        return this.f131948b;
    }

    /* renamed from: i */
    public final boolean m142521i() {
        return this.f131947a;
    }

    /* renamed from: j */
    public final boolean m142522j() {
        return this.f131949c;
    }

    /* renamed from: k */
    public final void m142523k(boolean z11) {
        this.f131947a = z11;
    }

    /* renamed from: l */
    public final void m142524l(boolean z11) {
        this.f131949c = z11;
    }

    /* renamed from: m */
    public final void m142525m(AbstractC28275a.a0 a0Var) {
        this.f131950d = a0Var;
    }
}
