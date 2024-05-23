package kotlinx.serialization;

import fn0.AbstractC19074t;
import java.util.List;

/* loaded from: classes7.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: p */
    private final List f107625p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List list, String str, Throwable th2) {
        super(str, th2);
        AbstractC19074t.m100208f(list, "missingFields");
        this.f107625p = list;
    }

    /* renamed from: a */
    public final List m113945a() {
        return this.f107625p;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MissingFieldException(List list, String str) {
        this(list, r4, null);
        String str2;
        AbstractC19074t.m100208f(list, "missingFields");
        AbstractC19074t.m100208f(str, "serialName");
        if (list.size() == 1) {
            str2 = "Field '" + ((String) list.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
    }
}
