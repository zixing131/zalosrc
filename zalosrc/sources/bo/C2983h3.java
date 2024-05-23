package bo;

import com.zing.zalo.control.ContactProfile;
import fi.C18953k;
import p716zh.C31917f9;

/* renamed from: bo.h3 */
/* loaded from: classes4.dex */
public class C2983h3 {

    /* renamed from: a */
    private ContactProfile f11788a;

    /* renamed from: b */
    private String f11789b;

    /* renamed from: c */
    private C31917f9 f11790c;

    /* renamed from: d */
    private C18953k.b f11791d;

    /* renamed from: e */
    private boolean f11792e;

    public C2983h3(ContactProfile contactProfile, String str, C31917f9 c31917f9, C18953k.b bVar) {
        this.f11792e = false;
        this.f11788a = contactProfile;
        this.f11789b = str;
        this.f11790c = c31917f9;
        this.f11791d = bVar;
    }

    /* renamed from: a */
    public ContactProfile m14141a() {
        return this.f11788a;
    }

    /* renamed from: b */
    public C18953k.b m14142b() {
        return this.f11791d;
    }

    /* renamed from: c */
    public String m14143c() {
        return this.f11789b;
    }

    /* renamed from: d */
    public C31917f9 m14144d() {
        return this.f11790c;
    }

    /* renamed from: e */
    public boolean m14145e() {
        return this.f11792e;
    }

    /* renamed from: f */
    public void m14146f(boolean z11) {
        this.f11792e = z11;
    }

    public C2983h3() {
        this.f11788a = null;
        this.f11789b = "";
        this.f11790c = null;
        this.f11792e = false;
        this.f11788a = new ContactProfile();
        this.f11790c = new C31917f9();
        this.f11791d = new C18953k.b();
    }
}
