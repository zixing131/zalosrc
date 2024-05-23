package p309l;

import java.util.HashMap;
import java.util.List;
import p283k.AbstractC21420a;
import p335m.C22694a;
import p335m.C22695b;

/* renamed from: l.d */
/* loaded from: classes2.dex */
public final class C21976d {

    /* renamed from: l */
    private static String f108177l = "DAASTModel";

    /* renamed from: a */
    private String f108178a = null;

    /* renamed from: b */
    private String f108179b = null;

    /* renamed from: c */
    private String f108180c = null;

    /* renamed from: d */
    private C22694a f108181d = null;

    /* renamed from: e */
    private List f108182e = null;

    /* renamed from: f */
    private C22695b f108183f = null;

    /* renamed from: g */
    private List f108184g = null;

    /* renamed from: h */
    private List f108185h = null;

    /* renamed from: i */
    private HashMap f108186i = null;

    /* renamed from: j */
    private HashMap f108187j = null;

    /* renamed from: k */
    private List f108188k = null;

    /* renamed from: a */
    public List m114751a() {
        return this.f108188k;
    }

    /* renamed from: b */
    public void m114752b(int i11) {
    }

    /* renamed from: c */
    public void m114753c(String str) {
    }

    /* renamed from: d */
    public void m114754d(HashMap hashMap) {
        this.f108186i = hashMap;
    }

    /* renamed from: e */
    public void m114755e(List list) {
        this.f108188k = list;
    }

    /* renamed from: f */
    public void m114756f(C22694a c22694a) {
        this.f108181d = c22694a;
    }

    /* renamed from: g */
    public void m114757g(C22695b c22695b) {
        this.f108183f = c22695b;
    }

    /* renamed from: h */
    public C22694a m114758h() {
        return this.f108181d;
    }

    /* renamed from: i */
    public void m114759i(String str) {
    }

    /* renamed from: j */
    public void m114760j(HashMap hashMap) {
        this.f108187j = hashMap;
    }

    /* renamed from: k */
    public void m114761k(List list) {
        this.f108185h = list;
    }

    /* renamed from: l */
    public String m114762l() {
        return this.f108180c;
    }

    /* renamed from: m */
    public void m114763m(String str) {
        this.f108180c = str;
    }

    /* renamed from: n */
    public void m114764n(List list) {
        this.f108184g = list;
    }

    /* renamed from: o */
    public String m114765o() {
        return this.f108178a;
    }

    /* renamed from: p */
    public void m114766p(String str) {
        this.f108178a = str;
    }

    /* renamed from: q */
    public void m114767q(List list) {
        this.f108182e = list;
    }

    /* renamed from: r */
    public List m114768r() {
        return this.f108185h;
    }

    /* renamed from: s */
    public void m114769s(String str) {
        this.f108179b = str;
    }

    /* renamed from: t */
    public HashMap m114770t() {
        return this.f108186i;
    }

    /* renamed from: u */
    public List m114771u() {
        return this.f108184g;
    }

    /* renamed from: v */
    public C22695b m114772v() {
        return this.f108183f;
    }

    /* renamed from: w */
    public List m114773w() {
        return this.f108182e;
    }

    /* renamed from: x */
    public HashMap m114774x() {
        return this.f108187j;
    }

    /* renamed from: y */
    public String m114775y() {
        return this.f108179b;
    }

    /* renamed from: z */
    public boolean m114776z() {
        List m114773w;
        try {
            m114773w = m114773w();
            this.f108182e = m114773w;
        } catch (Exception e11) {
            AbstractC21420a.m110922b(f108177l, "validate", e11);
        }
        if (m114773w != null && m114773w.size() != 0) {
            C22695b m114772v = m114772v();
            this.f108183f = m114772v;
            if (m114772v != null && m114772v.m117382g() != null) {
                if (this.f108183f.m117382g().length() != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
