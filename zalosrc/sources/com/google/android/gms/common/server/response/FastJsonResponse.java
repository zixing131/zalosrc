package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p031b5.AbstractC2552a;
import p229i5.AbstractC20282c;
import p229i5.AbstractC20292m;
import p229i5.AbstractC20293n;

/* loaded from: classes2.dex */
public abstract class FastJsonResponse {

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4258a {
        /* renamed from: d */
        Object mo19853d(Object obj);
    }

    /* renamed from: f */
    public static final Object m19857f(Field field, Object obj) {
        if (field.f16751z != null) {
            return field.m19868D0(obj);
        }
        return obj;
    }

    /* renamed from: g */
    private static final void m19858g(StringBuilder sb2, Field field, Object obj) {
        int i11 = field.f16742q;
        if (i11 != 11) {
            if (i11 == 7) {
                sb2.append("\"");
                sb2.append(AbstractC20292m.m105944a((String) obj));
                sb2.append("\"");
                return;
            }
            sb2.append(obj);
            return;
        }
        Class cls = field.f16748w;
        AbstractC4205o.m19722k(cls);
        sb2.append(((FastJsonResponse) cls.cast(obj)).toString());
    }

    /* renamed from: a */
    public abstract Map mo19034a();

    /* renamed from: b */
    public Object mo19035b(Field field) {
        boolean z11;
        String str = field.f16746u;
        if (field.f16748w != null) {
            if (mo19859c(str) == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19728q(z11, "Concrete field shouldn't be value object: %s", field.f16746u);
            try {
                return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
        return mo19859c(str);
    }

    /* renamed from: c */
    protected abstract Object mo19859c(String str);

    /* renamed from: d */
    public boolean mo19036d(Field field) {
        if (field.f16744s == 11) {
            if (field.f16745t) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return mo19860e(field.f16746u);
    }

    /* renamed from: e */
    protected abstract boolean mo19860e(String str);

    public String toString() {
        Map mo19034a = mo19034a();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : mo19034a.keySet()) {
            Field field = (Field) mo19034a.get(str);
            if (mo19036d(field)) {
                Object m19857f = m19857f(field, mo19035b(field));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (m19857f == null) {
                    sb2.append("null");
                } else {
                    switch (field.f16744s) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(AbstractC20282c.m105908a((byte[]) m19857f));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(AbstractC20282c.m105909b((byte[]) m19857f));
                            sb2.append("\"");
                            break;
                        case 10:
                            AbstractC20293n.m105945a(sb2, (HashMap) m19857f);
                            break;
                        default:
                            if (field.f16743r) {
                                ArrayList arrayList = (ArrayList) m19857f;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    if (i11 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i11);
                                    if (obj != null) {
                                        m19858g(sb2, field, obj);
                                    }
                                }
                                sb2.append("]");
                                break;
                            } else {
                                m19858g(sb2, field, m19857f);
                                break;
                            }
                    }
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }

    /* loaded from: classes2.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C4259a CREATOR = new C4259a();

        /* renamed from: p */
        private final int f16741p;

        /* renamed from: q */
        protected final int f16742q;

        /* renamed from: r */
        protected final boolean f16743r;

        /* renamed from: s */
        protected final int f16744s;

        /* renamed from: t */
        protected final boolean f16745t;

        /* renamed from: u */
        protected final String f16746u;

        /* renamed from: v */
        protected final int f16747v;

        /* renamed from: w */
        protected final Class f16748w;

        /* renamed from: x */
        protected final String f16749x;

        /* renamed from: y */
        private zan f16750y;

        /* renamed from: z */
        private InterfaceC4258a f16751z;

        public Field(int i11, int i12, boolean z11, int i13, boolean z12, String str, int i14, String str2, zaa zaaVar) {
            this.f16741p = i11;
            this.f16742q = i12;
            this.f16743r = z11;
            this.f16744s = i13;
            this.f16745t = z12;
            this.f16746u = str;
            this.f16747v = i14;
            if (str2 == null) {
                this.f16748w = null;
                this.f16749x = null;
            } else {
                this.f16748w = SafeParcelResponse.class;
                this.f16749x = str2;
            }
            if (zaaVar == null) {
                this.f16751z = null;
            } else {
                this.f16751z = zaaVar.m19856F();
            }
        }

        /* renamed from: F */
        public static Field m19861F(String str, int i11, Class cls) {
            return new Field(11, false, 11, false, str, i11, cls, null);
        }

        /* renamed from: J */
        public static Field m19862J(String str, int i11, Class cls) {
            return new Field(11, true, 11, true, str, i11, cls, null);
        }

        /* renamed from: K */
        public static Field m19863K(String str, int i11) {
            return new Field(0, false, 0, false, str, i11, null, null);
        }

        /* renamed from: M */
        public static Field m19864M(String str, int i11) {
            return new Field(7, false, 7, false, str, i11, null, null);
        }

        /* renamed from: Q */
        public static Field m19865Q(String str, int i11) {
            return new Field(7, true, 7, true, str, i11, null, null);
        }

        /* renamed from: t */
        public static Field m19867t(String str, int i11) {
            return new Field(8, false, 8, false, str, i11, null, null);
        }

        /* renamed from: D0 */
        public final Object m19868D0(Object obj) {
            AbstractC4205o.m19722k(this.f16751z);
            return this.f16751z.mo19853d(obj);
        }

        /* renamed from: E0 */
        final String m19869E0() {
            String str = this.f16749x;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: F0 */
        public final Map m19870F0() {
            AbstractC4205o.m19722k(this.f16749x);
            AbstractC4205o.m19722k(this.f16750y);
            return (Map) AbstractC4205o.m19722k(this.f16750y.m19879F(this.f16749x));
        }

        /* renamed from: G0 */
        public final void m19871G0(zan zanVar) {
            this.f16750y = zanVar;
        }

        /* renamed from: H0 */
        public final boolean m19872H0() {
            return this.f16751z != null;
        }

        /* renamed from: Z */
        public int m19873Z() {
            return this.f16747v;
        }

        /* renamed from: i0 */
        final zaa m19874i0() {
            InterfaceC4258a interfaceC4258a = this.f16751z;
            if (interfaceC4258a == null) {
                return null;
            }
            return zaa.m19855t(interfaceC4258a);
        }

        public final String toString() {
            AbstractC4199m.a m19704a = AbstractC4199m.m19703c(this).m19704a("versionCode", Integer.valueOf(this.f16741p)).m19704a("typeIn", Integer.valueOf(this.f16742q)).m19704a("typeInArray", Boolean.valueOf(this.f16743r)).m19704a("typeOut", Integer.valueOf(this.f16744s)).m19704a("typeOutArray", Boolean.valueOf(this.f16745t)).m19704a("outputFieldName", this.f16746u).m19704a("safeParcelFieldId", Integer.valueOf(this.f16747v)).m19704a("concreteTypeName", m19869E0());
            Class cls = this.f16748w;
            if (cls != null) {
                m19704a.m19704a("concreteType.class", cls.getCanonicalName());
            }
            InterfaceC4258a interfaceC4258a = this.f16751z;
            if (interfaceC4258a != null) {
                m19704a.m19704a("converterName", interfaceC4258a.getClass().getCanonicalName());
            }
            return m19704a.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            int m12912a = AbstractC2552a.m12912a(parcel);
            AbstractC2552a.m12924m(parcel, 1, this.f16741p);
            AbstractC2552a.m12924m(parcel, 2, this.f16742q);
            AbstractC2552a.m12914c(parcel, 3, this.f16743r);
            AbstractC2552a.m12924m(parcel, 4, this.f16744s);
            AbstractC2552a.m12914c(parcel, 5, this.f16745t);
            AbstractC2552a.m12934w(parcel, 6, this.f16746u, false);
            AbstractC2552a.m12924m(parcel, 7, m19873Z());
            AbstractC2552a.m12934w(parcel, 8, m19869E0(), false);
            AbstractC2552a.m12932u(parcel, 9, m19874i0(), i11, false);
            AbstractC2552a.m12913b(parcel, m12912a);
        }

        protected Field(int i11, boolean z11, int i12, boolean z12, String str, int i13, Class cls, InterfaceC4258a interfaceC4258a) {
            this.f16741p = 1;
            this.f16742q = i11;
            this.f16743r = z11;
            this.f16744s = i12;
            this.f16745t = z12;
            this.f16746u = str;
            this.f16747v = i13;
            this.f16748w = cls;
            if (cls == null) {
                this.f16749x = null;
            } else {
                this.f16749x = cls.getCanonicalName();
            }
            this.f16751z = interfaceC4258a;
        }
    }
}
