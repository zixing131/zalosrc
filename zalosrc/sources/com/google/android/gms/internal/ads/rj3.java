package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rj3 {

    /* renamed from: a */
    private final Map f27267a;

    /* renamed from: b */
    private final Map f27268b;

    /* renamed from: c */
    private final Map f27269c;

    /* renamed from: d */
    private final Map f27270d;

    public rj3() {
        this.f27267a = new HashMap();
        this.f27268b = new HashMap();
        this.f27269c = new HashMap();
        this.f27270d = new HashMap();
    }

    /* renamed from: a */
    public final rj3 m26088a(ti3 ti3Var) {
        tj3 tj3Var = new tj3(ti3Var.m26621b(), ti3Var.m26620a(), null);
        if (this.f27268b.containsKey(tj3Var)) {
            ti3 ti3Var2 = (ti3) this.f27268b.get(tj3Var);
            if (!ti3Var2.equals(ti3Var) || !ti3Var.equals(ti3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(tj3Var.toString()));
            }
        } else {
            this.f27268b.put(tj3Var, ti3Var);
        }
        return this;
    }

    /* renamed from: b */
    public final rj3 m26089b(wi3 wi3Var) {
        vj3 vj3Var = new vj3(wi3Var.m27620a(), wi3Var.m27621b(), null);
        if (this.f27267a.containsKey(vj3Var)) {
            wi3 wi3Var2 = (wi3) this.f27267a.get(vj3Var);
            if (!wi3Var2.equals(wi3Var) || !wi3Var.equals(wi3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(vj3Var.toString()));
            }
        } else {
            this.f27267a.put(vj3Var, wi3Var);
        }
        return this;
    }

    /* renamed from: c */
    public final rj3 m26090c(jj3 jj3Var) {
        tj3 tj3Var = new tj3(jj3Var.m23622b(), jj3Var.m23621a(), null);
        if (this.f27270d.containsKey(tj3Var)) {
            jj3 jj3Var2 = (jj3) this.f27270d.get(tj3Var);
            if (!jj3Var2.equals(jj3Var) || !jj3Var.equals(jj3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(tj3Var.toString()));
            }
        } else {
            this.f27270d.put(tj3Var, jj3Var);
        }
        return this;
    }

    /* renamed from: d */
    public final rj3 m26091d(mj3 mj3Var) {
        vj3 vj3Var = new vj3(mj3Var.m24611a(), mj3Var.m24612b(), null);
        if (this.f27269c.containsKey(vj3Var)) {
            mj3 mj3Var2 = (mj3) this.f27269c.get(vj3Var);
            if (!mj3Var2.equals(mj3Var) || !mj3Var.equals(mj3Var2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(vj3Var.toString()));
            }
        } else {
            this.f27269c.put(vj3Var, mj3Var);
        }
        return this;
    }

    public rj3(xj3 xj3Var) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = xj3Var.f30484a;
        this.f27267a = new HashMap(map);
        map2 = xj3Var.f30485b;
        this.f27268b = new HashMap(map2);
        map3 = xj3Var.f30486c;
        this.f27269c = new HashMap(map3);
        map4 = xj3Var.f30487d;
        this.f27270d = new HashMap(map4);
    }
}
