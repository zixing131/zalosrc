package un0;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import on0.AbstractC24339t;
import on0.AbstractC24340u;
import rn0.AbstractC25935a;
import tn0.AbstractC26777b0;
import vn0.AbstractC28351w0;

/* renamed from: un0.i */
/* loaded from: classes7.dex */
public abstract class AbstractC27331i {

    /* renamed from: a */
    private static final SerialDescriptor f128608a = AbstractC26777b0.m137805a("kotlinx.serialization.json.JsonUnquotedLiteral", AbstractC25935a.m133603D(C19067n0.f94947a));

    /* renamed from: a */
    public static final JsonPrimitive m139904a(Boolean bool) {
        if (bool == null) {
            return JsonNull.INSTANCE;
        }
        return new C27337o(bool, false, null, 4, null);
    }

    /* renamed from: b */
    public static final JsonPrimitive m139905b(Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new C27337o(number, false, null, 4, null);
    }

    /* renamed from: c */
    public static final JsonPrimitive m139906c(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new C27337o(str, true, null, 4, null);
    }

    /* renamed from: d */
    private static final Void m139907d(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + AbstractC19061k0.m100169b(jsonElement.getClass()) + " is not a " + str);
    }

    /* renamed from: e */
    public static final boolean m139908e(JsonPrimitive jsonPrimitive) {
        AbstractC19074t.m100208f(jsonPrimitive, "<this>");
        Boolean m142793d = AbstractC28351w0.m142793d(jsonPrimitive.mo114124d());
        if (m142793d != null) {
            return m142793d.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    /* renamed from: f */
    public static final Boolean m139909f(JsonPrimitive jsonPrimitive) {
        AbstractC19074t.m100208f(jsonPrimitive, "<this>");
        return AbstractC28351w0.m142793d(jsonPrimitive.mo114124d());
    }

    /* renamed from: g */
    public static final String m139910g(JsonPrimitive jsonPrimitive) {
        AbstractC19074t.m100208f(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.mo114124d();
    }

    /* renamed from: h */
    public static final double m139911h(JsonPrimitive jsonPrimitive) {
        AbstractC19074t.m100208f(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.mo114124d());
    }

    /* renamed from: i */
    public static final Double m139912i(JsonPrimitive jsonPrimitive) {
        Double m127104j;
        AbstractC19074t.m100208f(jsonPrimitive, "<this>");
        m127104j = AbstractC24339t.m127104j(jsonPrimitive.mo114124d());
        return m127104j;
    }

    /* renamed from: j */
    public static final float m139913j(JsonPrimitive jsonPrimitive) {
        AbstractC19074t.m100208f(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.mo114124d());
    }

    /* renamed from: k */
    public static final int m139914k(JsonPrimitive jsonPrimitive) {
        AbstractC19074t.m100208f(jsonPrimitive, "<this>");
        return Integer.parseInt(jsonPrimitive.mo114124d());
    }

    /* renamed from: l */
    public static final JsonArray m139915l(JsonElement jsonElement) {
        JsonArray jsonArray;
        AbstractC19074t.m100208f(jsonElement, "<this>");
        if (jsonElement instanceof JsonArray) {
            jsonArray = (JsonArray) jsonElement;
        } else {
            jsonArray = null;
        }
        if (jsonArray != null) {
            return jsonArray;
        }
        m139907d(jsonElement, "JsonArray");
        throw new KotlinNothingValueException();
    }

    /* renamed from: m */
    public static final JsonObject m139916m(JsonElement jsonElement) {
        JsonObject jsonObject;
        AbstractC19074t.m100208f(jsonElement, "<this>");
        if (jsonElement instanceof JsonObject) {
            jsonObject = (JsonObject) jsonElement;
        } else {
            jsonObject = null;
        }
        if (jsonObject != null) {
            return jsonObject;
        }
        m139907d(jsonElement, "JsonObject");
        throw new KotlinNothingValueException();
    }

    /* renamed from: n */
    public static final JsonPrimitive m139917n(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        AbstractC19074t.m100208f(jsonElement, "<this>");
        if (jsonElement instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) jsonElement;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        m139907d(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    /* renamed from: o */
    public static final SerialDescriptor m139918o() {
        return f128608a;
    }

    /* renamed from: p */
    public static final long m139919p(JsonPrimitive jsonPrimitive) {
        AbstractC19074t.m100208f(jsonPrimitive, "<this>");
        return Long.parseLong(jsonPrimitive.mo114124d());
    }

    /* renamed from: q */
    public static final Long m139920q(JsonPrimitive jsonPrimitive) {
        Long m127109o;
        AbstractC19074t.m100208f(jsonPrimitive, "<this>");
        m127109o = AbstractC24340u.m127109o(jsonPrimitive.mo114124d());
        return m127109o;
    }
}
