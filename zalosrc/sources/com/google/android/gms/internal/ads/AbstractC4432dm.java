package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.internal.ads.dm */
/* loaded from: classes2.dex */
public abstract class AbstractC4432dm {

    /* renamed from: a */
    public final Uri f19327a;

    /* renamed from: c */
    public final List f19329c;

    /* renamed from: e */
    public final c83 f19331e;

    /* renamed from: f */
    public final List f19332f;

    /* renamed from: g */
    public final Object f19333g;

    /* renamed from: b */
    public final String f19328b = null;

    /* renamed from: d */
    public final String f19330d = null;

    public /* synthetic */ AbstractC4432dm(Uri uri, String str, AbstractC4796ng abstractC4796ng, AbstractC4748m6 abstractC4748m6, List list, String str2, c83 c83Var, Object obj, AbstractC4616il abstractC4616il) {
        this.f19327a = uri;
        this.f19329c = list;
        this.f19331e = c83Var;
        z73 m20826p = c83.m20826p();
        if (c83Var.size() <= 0) {
            this.f19332f = m20826p.m28454h();
            this.f19333g = null;
        } else {
            AbstractC30228a.m149044a(c83Var.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4432dm)) {
            return false;
        }
        AbstractC4432dm abstractC4432dm = (AbstractC4432dm) obj;
        if (this.f19327a.equals(abstractC4432dm.f19327a) && g92.m22362t(null, null) && g92.m22362t(null, null) && g92.m22362t(null, null) && this.f19329c.equals(abstractC4432dm.f19329c) && g92.m22362t(null, null) && this.f19331e.equals(abstractC4432dm.f19331e) && g92.m22362t(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f19327a.hashCode() * 923521) + this.f19329c.hashCode()) * 961) + this.f19331e.hashCode()) * 31;
    }
}
