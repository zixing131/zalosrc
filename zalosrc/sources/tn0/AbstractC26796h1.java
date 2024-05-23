package tn0;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.C19046d;
import fn0.C19048e;
import fn0.C19052g;
import fn0.C19062l;
import fn0.C19064m;
import fn0.C19065m0;
import fn0.C19067n0;
import fn0.C19073s;
import fn0.C19076v;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mn0.InterfaceC23364b;
import on0.AbstractC24319c;
import on0.AbstractC24334o;
import on0.AbstractC24341v;
import pm0.AbstractC24866w;
import pm0.C24836a0;
import pm0.C24838b0;
import pm0.C24840c0;
import pm0.C24844e0;
import pm0.C24846f0;
import pm0.C24848g0;
import pm0.C24867x;
import pm0.C24868y;
import pm0.C24869z;
import pn0.C24873a;
import qm0.AbstractC25363p0;
import rn0.AbstractC25935a;
import sn0.AbstractC26338e;

/* renamed from: tn0.h1 */
/* loaded from: classes7.dex */
public abstract class AbstractC26796h1 {

    /* renamed from: a */
    private static final Map f127003a;

    static {
        Map m131407l;
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a(AbstractC19061k0.m100169b(String.class), AbstractC25935a.m133603D(C19067n0.f94947a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(Character.TYPE), AbstractC25935a.m133633x(C19052g.f94929a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(char[].class), AbstractC25935a.m133613d()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(Double.TYPE), AbstractC25935a.m133634y(C19062l.f94944a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(double[].class), AbstractC25935a.m133614e()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(Float.TYPE), AbstractC25935a.m133635z(C19064m.f94945a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(float[].class), AbstractC25935a.m133615f()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(Long.TYPE), AbstractC25935a.m133601B(C19076v.f94952a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(long[].class), AbstractC25935a.m133618i()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24838b0.class), AbstractC25935a.m133606G(C24838b0.f119230q)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24840c0.class), AbstractC25935a.m133628s()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(Integer.TYPE), AbstractC25935a.m133600A(C19073s.f94950a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(int[].class), AbstractC25935a.m133616g()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24869z.class), AbstractC25935a.m133605F(C24869z.f119283q)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24836a0.class), AbstractC25935a.m133627r()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(Short.TYPE), AbstractC25935a.m133602C(C19065m0.f94946a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(short[].class), AbstractC25935a.m133624o()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24844e0.class), AbstractC25935a.m133607H(C24844e0.f119240q)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24846f0.class), AbstractC25935a.m133629t()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(Byte.TYPE), AbstractC25935a.m133632w(C19048e.f94918a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(byte[].class), AbstractC25935a.m133612c()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24867x.class), AbstractC25935a.m133604E(C24867x.f119278q)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24868y.class), AbstractC25935a.m133626q()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(Boolean.TYPE), AbstractC25935a.m133631v(C19046d.f94917a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(boolean[].class), AbstractC25935a.m133611b()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24848g0.class), AbstractC25935a.m133608I(C24848g0.f119245a)), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(Void.class), AbstractC25935a.m133621l()), AbstractC24866w.m129235a(AbstractC19061k0.m100169b(C24873a.class), AbstractC25935a.m133609J(C24873a.f119357q)));
        f127003a = m131407l;
    }

    /* renamed from: a */
    public static final SerialDescriptor m137848a(String str, AbstractC26338e abstractC26338e) {
        AbstractC19074t.m100208f(str, "serialName");
        AbstractC19074t.m100208f(abstractC26338e, "kind");
        m137851d(str);
        return new C26793g1(str, abstractC26338e);
    }

    /* renamed from: b */
    public static final KSerializer m137849b(InterfaceC23364b interfaceC23364b) {
        AbstractC19074t.m100208f(interfaceC23364b, "<this>");
        return (KSerializer) f127003a.get(interfaceC23364b);
    }

    /* renamed from: c */
    private static final String m137850c(String str) {
        String valueOf;
        if (str.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf = AbstractC24319c.m126980e(charAt);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb2.append((Object) valueOf);
            String substring = str.substring(1);
            AbstractC19074t.m100207e(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return str;
    }

    /* renamed from: d */
    private static final void m137851d(String str) {
        boolean m127126v;
        String m127098f;
        boolean m127126v2;
        Iterator it = f127003a.keySet().iterator();
        while (it.hasNext()) {
            String mo100163c = ((InterfaceC23364b) it.next()).mo100163c();
            AbstractC19074t.m100205c(mo100163c);
            String m137850c = m137850c(mo100163c);
            m127126v = AbstractC24341v.m127126v(str, "kotlin." + m137850c, true);
            if (!m127126v) {
                m127126v2 = AbstractC24341v.m127126v(str, m137850c, true);
                if (!m127126v2) {
                }
            }
            m127098f = AbstractC24334o.m127098f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + m137850c(m137850c) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
            throw new IllegalArgumentException(m127098f);
        }
    }
}
