package ko0;

import com.zing.zalo.control.ContactProfile;

/* renamed from: ko0.e */
/* loaded from: classes7.dex */
public class C21790e {

    /* renamed from: a */
    public ContactProfile f105764a;

    /* renamed from: b */
    public int f105765b;

    /* renamed from: c */
    public boolean f105766c;

    /* renamed from: d */
    public String f105767d;

    /* renamed from: e */
    public String f105768e;

    /* renamed from: f */
    private int f105769f;

    /* renamed from: g */
    private boolean f105770g;

    public C21790e(int i11) {
        this.f105768e = "";
        this.f105765b = i11;
    }

    /* renamed from: a */
    public int m112453a() {
        return this.f105769f;
    }

    /* renamed from: b */
    public int m112454b() {
        return this.f105765b;
    }

    /* renamed from: c */
    public boolean m112455c() {
        return this.f105770g;
    }

    /* renamed from: d */
    public void m112456d(boolean z11) {
        this.f105770g = z11;
    }

    /* renamed from: e */
    public void m112457e(int i11) {
        this.f105769f = i11;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C21789d) && ((C21789d) obj).f105762g == this.f105768e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f105768e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C21790e(int i11, boolean z11, String str) {
        this.f105768e = "";
        this.f105765b = i11;
        this.f105766c = z11;
        this.f105767d = str;
    }

    public C21790e(String str, int i11) {
        this.f105768e = str;
        this.f105765b = i11;
    }
}
