package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes2.dex */
public final class rr2 {

    /* renamed from: a */
    private final Pattern f27361a;

    public rr2() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) zzay.zzc().m21823b(AbstractC4554gx.f21156W5));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f27361a = pattern;
    }

    /* renamed from: a */
    public final String m26156a(String str) {
        Pattern pattern = this.f27361a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
