package p458qr;

import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import p665y0.C30239a;

/* renamed from: qr.c */
/* loaded from: classes4.dex */
public class C25470c {

    /* renamed from: a */
    private final C30239a f122051a;

    public C25470c() {
        this(0);
    }

    /* renamed from: a */
    public boolean m131938a(String str) {
        return this.f122051a.containsKey(str);
    }

    /* renamed from: b */
    public boolean m131939b(String str, boolean z11) {
        Object obj = this.f122051a.get(str);
        if (obj == null) {
            return z11;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException unused) {
            return z11;
        }
    }

    /* renamed from: c */
    public int m131940c(String str, int i11) {
        Object obj = this.f122051a.get(str);
        if (obj == null) {
            return i11;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException unused) {
            return i11;
        }
    }

    /* renamed from: d */
    public Parcelable m131941d(String str) {
        Object obj = this.f122051a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Parcelable) obj;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public ArrayList m131942e(String str) {
        Object obj = this.f122051a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public Serializable m131943f(String str) {
        Object obj = this.f122051a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Serializable) obj;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public String m131944g(String str, String str2) {
        Object obj = this.f122051a.get(str);
        if (obj == null) {
            return str2;
        }
        try {
            return (String) obj;
        } catch (ClassCastException unused) {
            return str2;
        }
    }

    /* renamed from: h */
    public void m131945h(String str, boolean z11) {
        this.f122051a.put(str, Boolean.valueOf(z11));
    }

    /* renamed from: i */
    public void m131946i(String str, int i11) {
        this.f122051a.put(str, Integer.valueOf(i11));
    }

    /* renamed from: j */
    public void m131947j(String str, Parcelable parcelable) {
        this.f122051a.put(str, parcelable);
    }

    /* renamed from: k */
    public void m131948k(String str, ArrayList arrayList) {
        this.f122051a.put(str, arrayList);
    }

    /* renamed from: l */
    public void m131949l(String str, Serializable serializable) {
        this.f122051a.put(str, serializable);
    }

    /* renamed from: m */
    public void m131950m(String str, String str2) {
        this.f122051a.put(str, str2);
    }

    public C25470c(int i11) {
        this.f122051a = i11 > 0 ? new C30239a(i11) : new C30239a();
    }
}
