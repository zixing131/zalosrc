package we0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ve0.C27997f;

/* renamed from: we0.c */
/* loaded from: classes4.dex */
public final class C28947c implements InterfaceC28946b {

    /* renamed from: a */
    private final C28948d f134001a = new C28948d(100);

    private C28947c() {
    }

    /* renamed from: b */
    public static InterfaceC28946b m144591b() {
        return new C28947c();
    }

    /* renamed from: c */
    private static boolean m144592c(CharSequence charSequence, Pattern pattern, boolean z11) {
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z11;
    }

    @Override // we0.InterfaceC28946b
    /* renamed from: a */
    public boolean mo144590a(CharSequence charSequence, C27997f c27997f, boolean z11) {
        String m141098a = c27997f.m141098a();
        if (m141098a.length() == 0) {
            return false;
        }
        return m144592c(charSequence, this.f134001a.m144593a(m141098a), z11);
    }
}
