package com.zing.zalo.shortvideo.data.utils;

import android.graphics.Color;
import com.zing.zalo.shortvideo.data.model.CursorLoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.PagingLoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25358n;
import qm0.AbstractC25363p0;
import un0.AbstractC27331i;

/* renamed from: com.zing.zalo.shortvideo.data.utils.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9465b {
    /* renamed from: a */
    public static final ArrayList m51720a(JsonElement jsonElement, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(jsonElement, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "deserializer");
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC27331i.m139915l(jsonElement).iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC18505l.mo205i9(AbstractC27331i.m139916m((JsonElement) it.next())));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m51721b(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "<this>");
        return AbstractC27331i.m139908e(AbstractC27331i.m139917n(jsonElement));
    }

    /* renamed from: c */
    public static final boolean m51722c(JsonObject jsonObject, String[] strArr, boolean z11) {
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return m51721b((JsonElement) m131405j);
            }
        }
        return z11;
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m51723d(JsonObject jsonObject, String[] strArr, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m51722c(jsonObject, strArr, z11);
    }

    /* renamed from: e */
    public static final Integer m51724e(JsonObject jsonObject, String... strArr) {
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        String m51743x = m51743x(jsonObject, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (m51743x == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(m51743x));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static final float m51725f(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "<this>");
        return AbstractC27331i.m139913j(AbstractC27331i.m139917n(jsonElement));
    }

    /* renamed from: g */
    public static final int m51726g(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "<this>");
        return AbstractC27331i.m139914k(AbstractC27331i.m139917n(jsonElement));
    }

    /* renamed from: h */
    public static final int m51727h(JsonObject jsonObject, String[] strArr, int i11) {
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return m51726g((JsonElement) m131405j);
            }
        }
        return i11;
    }

    /* renamed from: i */
    public static /* synthetic */ int m51728i(JsonObject jsonObject, String[] strArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m51727h(jsonObject, strArr, i11);
    }

    /* renamed from: j */
    public static final Integer m51729j(JsonObject jsonObject, String... strArr) {
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return Integer.valueOf(m51726g((JsonElement) m131405j));
            }
        }
        return null;
    }

    /* renamed from: k */
    public static final JsonArray m51730k(JsonObject jsonObject, String... strArr) {
        String m131375W;
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return AbstractC27331i.m139915l((JsonElement) m131405j);
            }
        }
        m131375W = AbstractC25358n.m131375W(strArr, null, null, null, 0, null, null, 63, null);
        throw new NoSuchElementException("Keys [" + m131375W + "] are missing in the map.");
    }

    /* renamed from: l */
    public static final JsonArray m51731l(JsonObject jsonObject, String... strArr) {
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return AbstractC27331i.m139915l((JsonElement) m131405j);
            }
        }
        return null;
    }

    /* renamed from: m */
    public static final JsonObject m51732m(JsonObject jsonObject, String... strArr) {
        String m131375W;
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return AbstractC27331i.m139916m((JsonElement) m131405j);
            }
        }
        m131375W = AbstractC25358n.m131375W(strArr, null, null, null, 0, null, null, 63, null);
        throw new NoSuchElementException("Keys [" + m131375W + "] are missing in the map.");
    }

    /* renamed from: n */
    public static final JsonObject m51733n(JsonObject jsonObject, String... strArr) {
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return AbstractC27331i.m139916m((JsonElement) m131405j);
            }
        }
        return null;
    }

    /* renamed from: o */
    public static final long m51734o(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "<this>");
        return AbstractC27331i.m139919p(AbstractC27331i.m139917n(jsonElement));
    }

    /* renamed from: p */
    public static final long m51735p(JsonObject jsonObject, String[] strArr, long j11) {
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return m51734o((JsonElement) m131405j);
            }
        }
        return j11;
    }

    /* renamed from: q */
    public static /* synthetic */ long m51736q(JsonObject jsonObject, String[] strArr, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        return m51735p(jsonObject, strArr, j11);
    }

    /* renamed from: r */
    public static final Long m51737r(JsonObject jsonObject, String... strArr) {
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return Long.valueOf(m51734o((JsonElement) m131405j));
            }
        }
        return null;
    }

    /* renamed from: s */
    public static final Section m51738s(JsonElement jsonElement, InterfaceC18505l interfaceC18505l) {
        LoadMoreInfo loadMoreInfo;
        AbstractC19074t.m100208f(jsonElement, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "deserializer");
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        boolean z11 = false;
        for (Map.Entry<String, JsonElement> entry : AbstractC27331i.m139916m(jsonElement).entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            switch (key.hashCode()) {
                case -1349119146:
                    if (key.equals("cursor")) {
                        str = m51739t(value);
                        break;
                    } else {
                        break;
                    }
                case -1109897647:
                    if (key.equals("lastId")) {
                        str2 = m51739t(value);
                        break;
                    } else {
                        break;
                    }
                case -219173649:
                    if (key.equals("moreLink")) {
                        str4 = m51739t(value);
                        break;
                    } else {
                        break;
                    }
                case 100526016:
                    if (key.equals("items")) {
                        Iterator it = AbstractC27331i.m139915l(value).iterator();
                        while (it.hasNext()) {
                            arrayList.add(interfaceC18505l.mo205i9(AbstractC27331i.m139916m((JsonElement) it.next())));
                        }
                        break;
                    } else {
                        break;
                    }
                case 110549828:
                    if (key.equals("total")) {
                        j11 = m51734o(value);
                        break;
                    } else {
                        break;
                    }
                case 696739087:
                    if (key.equals("hasMore")) {
                        z11 = m51721b(value);
                        break;
                    } else {
                        break;
                    }
                case 1011826421:
                    if (key.equals("pagingExt")) {
                        str5 = m51739t(value);
                        break;
                    } else {
                        break;
                    }
                case 1992807388:
                    if (key.equals("lastIndex")) {
                        str3 = m51739t(value);
                        break;
                    } else {
                        break;
                    }
            }
        }
        if (z11) {
            if (str.length() > 0) {
                loadMoreInfo = new CursorLoadMoreInfo(z11, str, str4, str5);
            } else {
                loadMoreInfo = new PagingLoadMoreInfo(z11, str2, str3, str4, str5);
            }
        } else {
            loadMoreInfo = null;
        }
        return new Section(arrayList, j11, loadMoreInfo);
    }

    /* renamed from: t */
    public static final String m51739t(JsonElement jsonElement) {
        AbstractC19074t.m100208f(jsonElement, "<this>");
        return AbstractC27331i.m139917n(jsonElement).mo114124d();
    }

    /* renamed from: u */
    public static final String m51740u(JsonObject jsonObject, String... strArr) {
        String m131375W;
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return m51739t((JsonElement) m131405j);
            }
        }
        m131375W = AbstractC25358n.m131375W(strArr, null, null, null, 0, null, null, 63, null);
        throw new NoSuchElementException("Keys [" + m131375W + "] are missing in the map.");
    }

    /* renamed from: v */
    public static final String m51741v(JsonObject jsonObject, String[] strArr, String str) {
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        AbstractC19074t.m100208f(str, "elseValue");
        for (String str2 : strArr) {
            if (jsonObject.containsKey(str2)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str2);
                return m51739t((JsonElement) m131405j);
            }
        }
        return str;
    }

    /* renamed from: w */
    public static /* synthetic */ String m51742w(JsonObject jsonObject, String[] strArr, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        return m51741v(jsonObject, strArr, str);
    }

    /* renamed from: x */
    public static final String m51743x(JsonObject jsonObject, String... strArr) {
        Object m131405j;
        AbstractC19074t.m100208f(jsonObject, "<this>");
        AbstractC19074t.m100208f(strArr, "keys");
        for (String str : strArr) {
            if (jsonObject.containsKey(str)) {
                m131405j = AbstractC25363p0.m131405j(jsonObject, str);
                return m51739t((JsonElement) m131405j);
            }
        }
        return null;
    }
}
