package gq;

import am.AbstractC0924m0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import org.json.JSONArray;
import org.json.JSONObject;
import p107dq.C18050f;
import p107dq.C18051g;
import p107dq.C18052h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: gq.j */
/* loaded from: classes4.dex */
public final class C19587j {

    /* renamed from: a */
    public static final C19587j f97307a = new C19587j();

    /* renamed from: b */
    private static List f97308b = new ArrayList();

    /* renamed from: gq.j$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f97309s;

        /* renamed from: t */
        /* synthetic */ Object f97310t;

        /* renamed from: v */
        int f97312v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f97310t = obj;
            this.f97312v |= Integer.MIN_VALUE;
            return C19587j.this.m102532h(this);
        }
    }

    private C19587j() {
    }

    /* renamed from: c */
    private final List m102525c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C18050f(1, 1));
        arrayList.add(new C18050f(2, 1));
        arrayList.add(new C18050f(3, 1));
        return arrayList;
    }

    /* renamed from: a */
    public final List m102526a() {
        ArrayList arrayList = new ArrayList();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_default_layout);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList.add(new C18051g(0, 1, m118743r0, AbstractC23322a.zds_ic_ban_line_32, AbstractC16781w.fpf_ic_default_layout, AbstractC23136l9.m118742r(12.0f), AbstractC16803z.background_thumb_default_layout, false));
        for (C18050f c18050f : f97308b) {
            int m95933a = c18050f.m95933a();
            if (m95933a != 1) {
                if (m95933a != 2) {
                    if (m95933a == 3) {
                        if (c18050f.m95934b() == 1) {
                            int m95934b = c18050f.m95934b();
                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_flower_layout_theme_default);
                            AbstractC19074t.m100207e(m118743r02, "getString(...)");
                            arrayList.add(new C18051g(3, m95934b, m118743r02, AbstractC23322a.zds_oic_photo_layout_flowers_56, AbstractC16781w.thumb_layout_icon_color, 0, AbstractC16803z.background_thumb_flower_layout_theme_default, false));
                        } else if (c18050f.m95934b() == 2) {
                            int m95934b2 = c18050f.m95934b();
                            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_flower_layout_theme_lunar_new_year_2024);
                            AbstractC19074t.m100207e(m118743r03, "getString(...)");
                            arrayList.add(new C18051g(3, m95934b2, m118743r03, AbstractC23322a.zds_oic_photo_layout_flowers_56, AbstractC16781w.thumb_layout_icon_color, 0, AbstractC16803z.background_thumb_flower_layout_theme_lunar_new_year_2024, false));
                        }
                    }
                } else {
                    int m95934b3 = c18050f.m95934b();
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_column_layout);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    arrayList.add(new C18051g(2, m95934b3, m118743r04, AbstractC23322a.zds_oic_photo_layout_columns_56, AbstractC16781w.thumb_layout_icon_color, 0, AbstractC16803z.background_thumb_column_layout, false));
                }
            } else {
                int m95934b4 = c18050f.m95934b();
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_dynamic_layout);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                arrayList.add(new C18051g(1, m95934b4, m118743r05, AbstractC23322a.zds_oic_photo_layout_dynamic_56, AbstractC16781w.thumb_layout_icon_color, 0, AbstractC16803z.background_thumb_dynamic_layout, false));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final int m102527b(int i11) {
        Object obj;
        if (i11 != 0 && i11 != 1 && i11 != 2 && i11 != 3) {
            i11 = 1;
        }
        Iterator it = f97308b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C18050f) obj).m95933a() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            return 0;
        }
        return i11;
    }

    /* renamed from: d */
    public final int m102528d(int i11) {
        Object obj;
        Iterator it = f97308b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C18050f) obj).m95933a() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C18050f c18050f = (C18050f) obj;
        if (c18050f != null) {
            return c18050f.m95934b();
        }
        return 1;
    }

    /* renamed from: e */
    public final boolean m102529e(int i11) {
        return i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3;
    }

    /* renamed from: f */
    public final InterfaceC19584g m102530f(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return C19581d.f97279a;
                    }
                    throw new IllegalArgumentException("The layout id don't exist");
                }
                return C19578a.f97276a;
            }
            return C19580c.f97278a;
        }
        return C19579b.f97277a;
    }

    /* renamed from: g */
    public final void m102531g(JSONObject jSONObject, boolean z11) {
        JSONArray jSONArray;
        List m131187O0;
        List m131187O02;
        f97308b.clear();
        if (jSONObject != null) {
            jSONArray = jSONObject.optJSONArray("layout_list");
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                if (jSONObject2 != null) {
                    int optInt = jSONObject2.optInt("layout_id", -1);
                    int optInt2 = jSONObject2.optInt("theme_id", 1);
                    if (m102529e(optInt)) {
                        f97308b.add(new C18050f(optInt, optInt2));
                    }
                }
            }
        }
        if (f97308b.isEmpty()) {
            m131187O02 = AbstractC25332a0.m131187O0(m102525c());
            f97308b = m131187O02;
        }
        List list = f97308b;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(Integer.valueOf(((C18050f) obj).m95933a()))) {
                arrayList.add(obj);
            }
        }
        m131187O0 = AbstractC25332a0.m131187O0(arrayList);
        f97308b = m131187O0;
        if (z11 && jSONObject != null) {
            AbstractC0924m0.m2993De(jSONObject.toString());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27)(1:28))|12|(1:17)|19|20))|31|6|7|(0)(0)|12|(2:14|17)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002d, code lost:            r5 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:            mm0.AbstractC23350e.m122778h(r5);     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m102532h(Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        C19587j c19587j;
        String str;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f97312v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f97312v = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f97310t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f97312v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19587j = (C19587j) aVar.f97309s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C18052h c18052h = new C18052h(null, 1, null);
                    aVar.f97309s = this;
                    aVar.f97312v = 1;
                    obj = c18052h.m101503a(aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c19587j = this;
                }
                str = (String) obj;
                if (str != null && str.length() != 0) {
                    c19587j.m102531g(new JSONObject(str), false);
                }
                return C24848g0.f119245a;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f97310t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f97312v;
        if (i11 == 0) {
        }
        str = (String) obj2;
        if (str != null) {
            c19587j.m102531g(new JSONObject(str), false);
        }
        return C24848g0.f119245a;
    }
}
