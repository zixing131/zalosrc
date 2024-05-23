package vn0;

import fn0.AbstractC19074t;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import ln0.AbstractC22543l;

/* renamed from: vn0.b0 */
/* loaded from: classes7.dex */
public abstract class AbstractC28309b0 {
    /* renamed from: a */
    public static final JsonDecodingException m142636a(Number number, String str, String str2) {
        AbstractC19074t.m100208f(number, "value");
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "output");
        return m142640e(-1, m142646k(number, str, str2));
    }

    /* renamed from: b */
    public static final JsonEncodingException m142637b(Number number, String str) {
        AbstractC19074t.m100208f(number, "value");
        AbstractC19074t.m100208f(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m142644i(str, 0, 1, null)));
    }

    /* renamed from: c */
    public static final JsonEncodingException m142638c(Number number, String str, String str2) {
        AbstractC19074t.m100208f(number, "value");
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "output");
        return new JsonEncodingException(m142646k(number, str, str2));
    }

    /* renamed from: d */
    public static final JsonEncodingException m142639d(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + serialDescriptor.mo113953i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.mo113948d() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* renamed from: e */
    public static final JsonDecodingException m142640e(int i11, String str) {
        AbstractC19074t.m100208f(str, "message");
        if (i11 >= 0) {
            str = "Unexpected JSON token at offset " + i11 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    /* renamed from: f */
    public static final JsonDecodingException m142641f(int i11, String str, CharSequence charSequence) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(charSequence, "input");
        return m142640e(i11, str + "\nJSON input: " + ((Object) m142643h(charSequence, i11)));
    }

    /* renamed from: g */
    public static final JsonDecodingException m142642g(String str, String str2) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "input");
        return m142640e(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) m142644i(str2, 0, 1, null)));
    }

    /* renamed from: h */
    private static final CharSequence m142643h(CharSequence charSequence, int i11) {
        String str;
        int m116580c;
        int m116584g;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i11 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i12 = i11 - 30;
        int i13 = i11 + 30;
        if (i12 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i13 >= charSequence.length()) {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        m116580c = AbstractC22543l.m116580c(i12, 0);
        m116584g = AbstractC22543l.m116584g(i13, charSequence.length());
        sb2.append(charSequence.subSequence(m116580c, m116584g).toString());
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: i */
    static /* synthetic */ CharSequence m142644i(CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        return m142643h(charSequence, i11);
    }

    /* renamed from: j */
    public static final Void m142645j(AbstractC28305a abstractC28305a, Number number) {
        AbstractC19074t.m100208f(abstractC28305a, "<this>");
        AbstractC19074t.m100208f(number, "result");
        AbstractC28305a.m142595y(abstractC28305a, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: k */
    private static final String m142646k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m142644i(str2, 0, 1, null));
    }
}
