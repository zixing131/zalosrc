package com.google.firebase.messaging;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4199m;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.messaging.v0 */
/* loaded from: classes.dex */
final class C6649v0 {

    /* renamed from: d */
    private static final Pattern f36715d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f36716a;

    /* renamed from: b */
    private final String f36717b;

    /* renamed from: c */
    private final String f36718c;

    private C6649v0(String str, String str2) {
        this.f36716a = m33964d(str2, str);
        this.f36717b = str;
        this.f36718c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C6649v0 m33963a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C6649v0(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m33964d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2);
            str = str.substring(8);
        }
        if (str != null && f36715d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    /* renamed from: b */
    public String m33965b() {
        return this.f36717b;
    }

    /* renamed from: c */
    public String m33966c() {
        return this.f36716a;
    }

    /* renamed from: e */
    public String m33967e() {
        return this.f36718c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6649v0)) {
            return false;
        }
        C6649v0 c6649v0 = (C6649v0) obj;
        if (!this.f36716a.equals(c6649v0.f36716a) || !this.f36717b.equals(c6649v0.f36717b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC4199m.m19702b(this.f36717b, this.f36716a);
    }
}
