package bo;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bo.d1 */
/* loaded from: classes4.dex */
public class C2961d1 {

    /* renamed from: a */
    public List f11676a;

    /* renamed from: b */
    public boolean f11677b;

    /* renamed from: c */
    private boolean f11678c;

    /* renamed from: d */
    private boolean f11679d;

    /* renamed from: e */
    private int f11680e;

    public C2961d1() {
        this.f11677b = true;
        this.f11678c = true;
        this.f11679d = false;
        this.f11680e = 0;
        this.f11676a = new ArrayList();
        this.f11677b = true;
        this.f11678c = true;
    }

    /* renamed from: a */
    public int m14019a() {
        return this.f11680e;
    }

    /* renamed from: b */
    public boolean m14020b() {
        return this.f11678c;
    }

    /* renamed from: c */
    public boolean m14021c() {
        return this.f11677b;
    }

    /* renamed from: d */
    public boolean m14022d() {
        return this.f11679d;
    }

    /* renamed from: e */
    public void m14023e(int i11) {
        this.f11680e = i11;
    }

    /* renamed from: f */
    public void m14024f(boolean z11) {
        this.f11678c = z11;
    }

    /* renamed from: g */
    public void m14025g(boolean z11) {
        this.f11677b = z11;
    }

    public C2961d1(List list) {
        boolean z11 = true;
        this.f11677b = true;
        this.f11678c = true;
        this.f11679d = false;
        this.f11680e = 0;
        if (list != null && list.size() > 0) {
            z11 = false;
        }
        this.f11678c = z11;
        this.f11676a = list;
    }

    public C2961d1(boolean z11) {
        this.f11678c = true;
        this.f11679d = false;
        this.f11680e = 0;
        this.f11677b = z11;
        this.f11676a = new ArrayList();
    }
}
