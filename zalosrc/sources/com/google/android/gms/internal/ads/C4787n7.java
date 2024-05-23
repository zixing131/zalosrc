package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n7 */
/* loaded from: classes2.dex */
public final class C4787n7 {

    /* renamed from: a */
    private String f25063a;

    /* renamed from: b */
    private Uri f25064b;

    /* renamed from: c */
    private final C4493f9 f25065c = new C4493f9();

    /* renamed from: d */
    private final C4646jf f25066d = new C4646jf(null);

    /* renamed from: e */
    private final List f25067e = Collections.emptyList();

    /* renamed from: f */
    private final c83 f25068f = c83.m20832w();

    /* renamed from: g */
    private final C4613ii f25069g = new C4613ii();

    /* renamed from: h */
    private final C5252zq f25070h = C5252zq.f31674c;

    /* renamed from: a */
    public final C4787n7 m24856a(String str) {
        this.f25063a = str;
        return this;
    }

    /* renamed from: b */
    public final C4787n7 m24857b(Uri uri) {
        this.f25064b = uri;
        return this;
    }

    /* renamed from: c */
    public final C4330au m24858c() {
        C5212yn c5212yn;
        Uri uri = this.f25064b;
        if (uri != null) {
            c5212yn = new C5212yn(uri, null, null, null, this.f25067e, null, this.f25068f, null, null);
        } else {
            c5212yn = null;
        }
        String str = this.f25063a;
        if (str == null) {
            str = "";
        }
        return new C4330au(str, new C4644jd(this.f25065c, null), c5212yn, new C4688kk(this.f25069g), f00.f19888v, this.f25070h, null);
    }
}
