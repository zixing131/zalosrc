package tk;

import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: tk.e */
/* loaded from: classes3.dex */
public final class C26726e {

    /* renamed from: a */
    private final ContactProfile f126754a;

    /* renamed from: b */
    private String f126755b;

    public C26726e(ContactProfile contactProfile, String str) {
        AbstractC19074t.m100208f(contactProfile, "cp");
        AbstractC19074t.m100208f(str, "name");
        this.f126754a = contactProfile;
        this.f126755b = str;
    }

    /* renamed from: a */
    public final ContactProfile m137460a() {
        return this.f126754a;
    }

    /* renamed from: b */
    public final String m137461b() {
        return this.f126755b;
    }

    /* renamed from: c */
    public final void m137462c(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f126755b = str;
    }

    public /* synthetic */ C26726e(ContactProfile contactProfile, String str, int i11, AbstractC19060k abstractC19060k) {
        this(contactProfile, (i11 & 2) != 0 ? "" : str);
    }
}
