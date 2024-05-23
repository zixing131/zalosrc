package p562v;

import android.text.TextUtils;
import p410p.AbstractC24587a;
import p467r.C25589l;
import p467r.EnumC25583f;
import p467r.EnumC25585h;
import p467r.EnumC25586i;

/* renamed from: v.e */
/* loaded from: classes2.dex */
public abstract class AbstractC27392e {
    /* renamed from: a */
    public static void m140335a() {
        if (!AbstractC24587a.m128056b()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: b */
    public static void m140336b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: c */
    public static void m140337c(String str, int i11, String str2) {
        if (str.length() > i11) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: d */
    public static void m140338d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: e */
    public static void m140339e(EnumC25586i enumC25586i, EnumC25583f enumC25583f, EnumC25585h enumC25585h) {
        if (enumC25586i == EnumC25586i.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (enumC25583f == EnumC25583f.DEFINED_BY_JAVASCRIPT && enumC25586i == EnumC25586i.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (enumC25585h == EnumC25585h.DEFINED_BY_JAVASCRIPT && enumC25586i == EnumC25586i.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: f */
    public static void m140340f(C25589l c25589l) {
        if (c25589l.m132173r()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: g */
    public static void m140341g(C25589l c25589l) {
        if (c25589l.m132174s()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: h */
    public static void m140342h(C25589l c25589l) {
        m140347m(c25589l);
        m140341g(c25589l);
    }

    /* renamed from: i */
    public static void m140343i(C25589l c25589l) {
        if (c25589l.m132176u().m146289p() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: j */
    public static void m140344j(C25589l c25589l) {
        if (c25589l.m132176u().m146290q() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: k */
    public static void m140345k(C25589l c25589l) {
        if (!c25589l.m132177v()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: l */
    public static void m140346l(C25589l c25589l) {
        if (!c25589l.m132178w()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: m */
    private static void m140347m(C25589l c25589l) {
        if (!c25589l.m132173r()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
