package ug0;

import com.zing.zalo.zalocloud.backup.GetBackupMetadataException;
import fn0.AbstractC19074t;

/* renamed from: ug0.h */
/* loaded from: classes7.dex */
public abstract class AbstractC27253h {
    /* renamed from: a */
    public static final boolean m139436a(int i11) {
        return i11 == 101 || i11 == 103 || i11 == 106;
    }

    /* renamed from: b */
    public static final boolean m139437b(int i11) {
        return i11 == 100 || i11 == 104 || i11 == 107 || i11 == 108 || i11 == 111 || i11 == 105;
    }

    /* renamed from: c */
    public static final boolean m139438c(int i11) {
        return i11 == 109 || i11 == 110;
    }

    /* renamed from: d */
    public static final boolean m139439d(int i11) {
        return i11 == 2003;
    }

    /* renamed from: e */
    public static final boolean m139440e(int i11) {
        return i11 == 2016;
    }

    /* renamed from: f */
    public static final boolean m139441f(int i11) {
        return i11 == 2006 || i11 == 2007;
    }

    /* renamed from: g */
    public static final boolean m139442g(int i11) {
        return i11 == 2008;
    }

    /* renamed from: h */
    public static final boolean m139443h(C27246a c27246a) {
        AbstractC19074t.m100208f(c27246a, "<this>");
        if (!m139442g(c27246a.m139385a()) && !m139438c(c27246a.m139385a())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static final boolean m139444i(GetBackupMetadataException getBackupMetadataException) {
        AbstractC19074t.m100208f(getBackupMetadataException, "<this>");
        return m139441f(getBackupMetadataException.m89735a());
    }

    /* renamed from: j */
    public static final boolean m139445j(C27246a c27246a) {
        AbstractC19074t.m100208f(c27246a, "<this>");
        return m139441f(c27246a.m139385a());
    }

    /* renamed from: k */
    public static final boolean m139446k(GetBackupMetadataException getBackupMetadataException) {
        AbstractC19074t.m100208f(getBackupMetadataException, "<this>");
        return m139439d(getBackupMetadataException.m89735a());
    }

    /* renamed from: l */
    public static final boolean m139447l(C27246a c27246a) {
        AbstractC19074t.m100208f(c27246a, "<this>");
        if (!m139439d(c27246a.m139385a()) && !m139436a(c27246a.m139385a())) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final boolean m139448m(C27246a c27246a) {
        AbstractC19074t.m100208f(c27246a, "<this>");
        if (!m139440e(c27246a.m139385a()) && !m139437b(c27246a.m139385a())) {
            return false;
        }
        return true;
    }
}
