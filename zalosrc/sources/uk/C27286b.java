package uk;

import fn0.AbstractC19074t;
import ga0.C19364u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p612wk.AbstractC29076h;
import pm0.AbstractC24866w;
import qm0.AbstractC25363p0;

/* renamed from: uk.b */
/* loaded from: classes3.dex */
public final class C27286b {

    /* renamed from: a */
    private final List f128369a;

    /* renamed from: b */
    private final Set f128370b;

    /* renamed from: c */
    private final List f128371c;

    /* renamed from: d */
    private final List f128372d;

    /* renamed from: e */
    private final C19364u0 f128373e;

    /* renamed from: f */
    private int f128374f;

    /* renamed from: g */
    private boolean f128375g;

    /* renamed from: h */
    private final List f128376h;

    /* renamed from: i */
    private boolean f128377i;

    /* renamed from: j */
    private final Map f128378j;

    /* renamed from: k */
    private boolean f128379k;

    /* renamed from: l */
    private String f128380l;

    /* renamed from: m */
    private boolean f128381m;

    public C27286b() {
        HashMap m131406k;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f128369a = synchronizedList;
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        AbstractC19074t.m100207e(synchronizedSet, "synchronizedSet(...)");
        this.f128370b = synchronizedSet;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList2, "synchronizedList(...)");
        this.f128371c = synchronizedList2;
        List synchronizedList3 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList3, "synchronizedList(...)");
        this.f128372d = synchronizedList3;
        this.f128373e = new C19364u0();
        this.f128374f = 6;
        this.f128375g = true;
        List synchronizedList4 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList4, "synchronizedList(...)");
        this.f128376h = synchronizedList4;
        m131406k = AbstractC25363p0.m131406k(AbstractC24866w.m129235a(AbstractC29076h.h.f134822b, Boolean.TRUE));
        Map synchronizedMap = Collections.synchronizedMap(m131406k);
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f128378j = synchronizedMap;
        this.f128380l = "";
    }

    /* renamed from: a */
    public final List m139683a() {
        return this.f128371c;
    }

    /* renamed from: b */
    public final List m139684b() {
        return this.f128376h;
    }

    /* renamed from: c */
    public final int m139685c() {
        return this.f128374f;
    }

    /* renamed from: d */
    public final C19364u0 m139686d() {
        return this.f128373e;
    }

    /* renamed from: e */
    public final List m139687e() {
        return this.f128369a;
    }

    /* renamed from: f */
    public final Set m139688f() {
        return this.f128370b;
    }

    /* renamed from: g */
    public final boolean m139689g() {
        return this.f128381m;
    }

    /* renamed from: h */
    public final boolean m139690h() {
        return this.f128377i;
    }

    /* renamed from: i */
    public final boolean m139691i() {
        return this.f128375g;
    }

    /* renamed from: j */
    public final boolean m139692j() {
        return this.f128379k;
    }

    /* renamed from: k */
    public final Map m139693k() {
        return this.f128378j;
    }

    /* renamed from: l */
    public final void m139694l(boolean z11) {
        this.f128381m = z11;
    }

    /* renamed from: m */
    public final void m139695m(boolean z11) {
        this.f128377i = z11;
    }

    /* renamed from: n */
    public final void m139696n(int i11) {
        this.f128374f = i11;
    }

    /* renamed from: o */
    public final void m139697o(boolean z11) {
        this.f128375g = z11;
    }

    /* renamed from: p */
    public final void m139698p(boolean z11) {
        this.f128379k = z11;
    }

    /* renamed from: q */
    public final void m139699q(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f128380l = str;
    }
}
