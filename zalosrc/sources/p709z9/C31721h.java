package p709z9;

import ba.AbstractC2669b;
import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.InterfaceC6742c;
import com.google.gson.InterfaceC6751l;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p637x9.InterfaceC29511b;
import p637x9.InterfaceC29512c;
import p674y9.AbstractC30845b;
import p674y9.AbstractC30854k;
import p674y9.C30846c;
import p674y9.C30847d;
import p674y9.InterfaceC30852i;

/* renamed from: z9.h */
/* loaded from: classes3.dex */
public final class C31721h implements InterfaceC6751l {

    /* renamed from: p */
    private final C30846c f145696p;

    /* renamed from: q */
    private final InterfaceC6742c f145697q;

    /* renamed from: r */
    private final C30847d f145698r;

    /* renamed from: s */
    private final C31717d f145699s;

    /* renamed from: t */
    private final AbstractC2669b f145700t = AbstractC2669b.m13120a();

    /* renamed from: z9.h$a */
    /* loaded from: classes3.dex */
    public class a extends c {

        /* renamed from: d */
        final /* synthetic */ Field f145701d;

        /* renamed from: e */
        final /* synthetic */ boolean f145702e;

        /* renamed from: f */
        final /* synthetic */ AbstractC6750k f145703f;

        /* renamed from: g */
        final /* synthetic */ C6743d f145704g;

        /* renamed from: h */
        final /* synthetic */ TypeToken f145705h;

        /* renamed from: i */
        final /* synthetic */ boolean f145706i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z11, boolean z12, Field field, boolean z13, AbstractC6750k abstractC6750k, C6743d c6743d, TypeToken typeToken, boolean z14) {
            super(str, z11, z12);
            this.f145701d = field;
            this.f145702e = z13;
            this.f145703f = abstractC6750k;
            this.f145704g = c6743d;
            this.f145705h = typeToken;
            this.f145706i = z14;
        }

        @Override // p709z9.C31721h.c
        /* renamed from: a */
        void mo152614a(C3380a c3380a, Object obj) {
            Object mo34534b = this.f145703f.mo34534b(c3380a);
            if (mo34534b != null || !this.f145706i) {
                this.f145701d.set(obj, mo34534b);
            }
        }

        @Override // p709z9.C31721h.c
        /* renamed from: b */
        void mo152615b(C3382c c3382c, Object obj) {
            AbstractC6750k c31724k;
            Object obj2 = this.f145701d.get(obj);
            if (this.f145702e) {
                c31724k = this.f145703f;
            } else {
                c31724k = new C31724k(this.f145704g, this.f145703f, this.f145705h.getType());
            }
            c31724k.mo34535d(c3382c, obj2);
        }

        @Override // p709z9.C31721h.c
        /* renamed from: c */
        public boolean mo152616c(Object obj) {
            if (!this.f145711b || this.f145701d.get(obj) == obj) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: z9.h$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6750k {

        /* renamed from: a */
        private final InterfaceC30852i f145708a;

        /* renamed from: b */
        private final Map f145709b;

        b(InterfaceC30852i interfaceC30852i, Map map) {
            this.f145708a = interfaceC30852i;
            this.f145709b = map;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: b */
        public Object mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            Object mo149955a = this.f145708a.mo149955a();
            try {
                c3380a.m17004b();
                while (c3380a.m17010q()) {
                    c cVar = (c) this.f145709b.get(c3380a.m16998F());
                    if (cVar != null && cVar.f145712c) {
                        cVar.mo152614a(c3380a, mo149955a);
                    }
                    c3380a.m17006g0();
                }
                c3380a.m17008i();
                return mo149955a;
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            } catch (IllegalStateException e12) {
                throw new JsonSyntaxException(e12);
            }
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: d */
        public void mo34535d(C3382c c3382c, Object obj) {
            if (obj == null) {
                c3382c.mo17043v();
                return;
            }
            c3382c.mo17036d();
            try {
                for (c cVar : this.f145709b.values()) {
                    if (cVar.mo152616c(obj)) {
                        c3382c.mo17042s(cVar.f145710a);
                        cVar.mo152615b(c3382c, obj);
                    }
                }
                c3382c.mo17038i();
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    /* renamed from: z9.h$c */
    /* loaded from: classes3.dex */
    public static abstract class c {

        /* renamed from: a */
        final String f145710a;

        /* renamed from: b */
        final boolean f145711b;

        /* renamed from: c */
        final boolean f145712c;

        protected c(String str, boolean z11, boolean z12) {
            this.f145710a = str;
            this.f145711b = z11;
            this.f145712c = z12;
        }

        /* renamed from: a */
        abstract void mo152614a(C3380a c3380a, Object obj);

        /* renamed from: b */
        abstract void mo152615b(C3382c c3382c, Object obj);

        /* renamed from: c */
        abstract boolean mo152616c(Object obj);
    }

    public C31721h(C30846c c30846c, InterfaceC6742c interfaceC6742c, C30847d c30847d, C31717d c31717d) {
        this.f145696p = c30846c;
        this.f145697q = interfaceC6742c;
        this.f145698r = c30847d;
        this.f145699s = c31717d;
    }

    /* renamed from: b */
    private c m152609b(C6743d c6743d, Field field, String str, TypeToken typeToken, boolean z11, boolean z12) {
        AbstractC6750k abstractC6750k;
        boolean z13;
        boolean m149992a = AbstractC30854k.m149992a(typeToken.getRawType());
        InterfaceC29511b interfaceC29511b = (InterfaceC29511b) field.getAnnotation(InterfaceC29511b.class);
        if (interfaceC29511b != null) {
            abstractC6750k = this.f145699s.m152601b(this.f145696p, c6743d, typeToken, interfaceC29511b);
        } else {
            abstractC6750k = null;
        }
        if (abstractC6750k != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (abstractC6750k == null) {
            abstractC6750k = c6743d.m34526j(typeToken);
        }
        return new a(str, z11, z12, field, z13, abstractC6750k, c6743d, typeToken, m149992a);
    }

    /* renamed from: d */
    static boolean m152610d(Field field, boolean z11, C30847d c30847d) {
        if (!c30847d.m149965c(field.getType(), z11) && !c30847d.m149966g(field, z11)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private Map m152611e(C6743d c6743d, TypeToken typeToken, Class cls) {
        boolean z11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken typeToken2 = typeToken;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z12 = false;
            int i11 = 0;
            while (i11 < length) {
                Field field = declaredFields[i11];
                boolean m152613c = m152613c(field, true);
                boolean m152613c2 = m152613c(field, z12);
                if (m152613c || m152613c2) {
                    this.f145700t.mo13119b(field);
                    Type m149945p = AbstractC30845b.m149945p(typeToken2.getType(), cls2, field.getGenericType());
                    List m152612f = m152612f(field);
                    int size = m152612f.size();
                    c cVar = null;
                    int i12 = 0;
                    while (i12 < size) {
                        String str = (String) m152612f.get(i12);
                        if (i12 != 0) {
                            z11 = false;
                        } else {
                            z11 = m152613c;
                        }
                        int i13 = i12;
                        c cVar2 = cVar;
                        int i14 = size;
                        List list = m152612f;
                        Field field2 = field;
                        c cVar3 = (c) linkedHashMap.put(str, m152609b(c6743d, field, str, TypeToken.get(m149945p), z11, m152613c2));
                        if (cVar2 == null) {
                            cVar = cVar3;
                        } else {
                            cVar = cVar2;
                        }
                        i12 = i13 + 1;
                        m152613c = z11;
                        m152612f = list;
                        size = i14;
                        field = field2;
                    }
                    c cVar4 = cVar;
                    if (cVar4 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar4.f145710a);
                    }
                }
                i11++;
                z12 = false;
            }
            typeToken2 = TypeToken.get(AbstractC30845b.m149945p(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List m152612f(Field field) {
        InterfaceC29512c interfaceC29512c = (InterfaceC29512c) field.getAnnotation(InterfaceC29512c.class);
        if (interfaceC29512c == null) {
            return Collections.singletonList(this.f145697q.mo34515b(field));
        }
        String value = interfaceC29512c.value();
        String[] alternate = interfaceC29512c.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.InterfaceC6751l
    /* renamed from: a */
    public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new b(this.f145696p.m149954a(typeToken), m152611e(c6743d, typeToken, rawType));
    }

    /* renamed from: c */
    public boolean m152613c(Field field, boolean z11) {
        return m152610d(field, z11, this.f145698r);
    }
}
