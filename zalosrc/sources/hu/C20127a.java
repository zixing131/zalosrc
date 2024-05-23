package hu;

import am.AbstractC0908e0;
import am.AbstractC0926n0;
import am.AbstractC0930p0;
import am.AbstractC0932q0;
import com.zing.zalo.preferences.C9049a;
import com.zing.zalo.preferences.IPreferences;
import com.zing.zalocore.CoreUtility;
import ec.InterfaceC18379a;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import kz.AbstractC21971b;
import mu.C23444b;
import oh0.C24267b;
import on0.AbstractC24341v;
import on0.AbstractC24342w;

/* renamed from: hu.a */
/* loaded from: classes.dex */
public final class C20127a {

    /* renamed from: a */
    public static final C20127a f99254a = new C20127a();

    /* renamed from: b */
    private static HashSet f99255b;

    private C20127a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:            if (r1 != false) goto L9;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String m104750a(String str, String str2, InterfaceC18379a interfaceC18379a, boolean z11) {
        boolean m127149O;
        boolean m127149O2;
        boolean m127149O3;
        m127149O = AbstractC24342w.m127149O(str, "${UserID}", false, 2, null);
        if (m127149O) {
            str = AbstractC24341v.m127114D(str, "${UserID}", str2, false, 4, null);
        }
        m127149O2 = AbstractC24342w.m127149O(str, "%s", false, 2, null);
        if (!m127149O2) {
            m127149O3 = AbstractC24342w.m127149O(str, "%S", false, 2, null);
        }
        str = AbstractC24341v.m127112B(str, "%s", str2, true);
        if (interfaceC18379a != null && interfaceC18379a.perUser()) {
            str = str + "_" + str2;
        }
        if (z11) {
            return str + str2;
        }
        return str;
    }

    /* renamed from: b */
    public static final void m104751b(HashSet hashSet, boolean z11) {
        if (hashSet != null) {
            f99255b = hashSet;
        }
        C20127a c20127a = f99254a;
        m104753d(c20127a, AbstractC0926n0.class, f99255b, z11, false, 8, null);
        m104753d(c20127a, AbstractC0930p0.class, f99255b, z11, false, 8, null);
        m104753d(c20127a, C23444b.class, f99255b, z11, false, 8, null);
        m104753d(c20127a, C24267b.class, f99255b, z11, false, 8, null);
        m104753d(c20127a, AbstractC21971b.class, f99255b, z11, false, 8, null);
        c20127a.m104752c(AbstractC0932q0.class, f99255b, z11, true);
        c20127a.m104752c(AbstractC0908e0.a.class, f99255b, z11, true);
    }

    /* renamed from: c */
    private final void m104752c(Class cls, HashSet hashSet, boolean z11, boolean z12) {
        boolean m127149O;
        IPreferences m2807a = AbstractC0908e0.m2807a();
        if (!(m2807a instanceof C9049a)) {
            return;
        }
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100205c(str);
        if (str.length() == 0) {
            str = AbstractC0908e0.m2815i("currentUserUid", "", false);
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AbstractC19074t.m100207e(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    Object obj = field.get(null);
                    if (obj instanceof String) {
                        InterfaceC18379a interfaceC18379a = (InterfaceC18379a) field.getAnnotation(InterfaceC18379a.class);
                        AbstractC19074t.m100205c(str);
                        String m104750a = m104750a((String) obj, str, interfaceC18379a, z12);
                        if (hashSet == null || !hashSet.contains(m104750a)) {
                            if (!z11) {
                                AbstractC19074t.m100205c(str);
                                m127149O = AbstractC24342w.m127149O(m104750a, str, false, 2, null);
                                if (!m127149O) {
                                }
                            }
                            ((C9049a) m2807a).m48450k(m104750a);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104551d("Error when preload cache " + e11, new Object[0]);
                }
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m104753d(C20127a c20127a, Class cls, HashSet hashSet, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        c20127a.m104752c(cls, hashSet, z11, z12);
    }
}
