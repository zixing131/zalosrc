package com.zing.zalo.shortvideo.data.model;

import androidx.work.AbstractC2144f;
import b10.AbstractC2487f;
import com.zing.zalo.shortvideo.data.model.Comment;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.shortvideo.data.model.a */
/* loaded from: classes5.dex */
public final class C9440a extends AbstractC2487f {

    /* renamed from: b */
    private String f50092b;

    /* renamed from: c */
    private final Comment.Identity f50093c;

    /* renamed from: d */
    private String f50094d;

    /* renamed from: e */
    private String f50095e;

    /* renamed from: f */
    private final boolean f50096f;

    /* renamed from: g */
    private boolean f50097g;

    public /* synthetic */ C9440a(String str, Comment.Identity identity, String str2, String str3, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : identity, (i11 & 4) != 0 ? null : str2, (i11 & 8) == 0 ? str3 : null, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12);
    }

    /* renamed from: b */
    public final String m51399b() {
        return this.f50094d;
    }

    /* renamed from: c */
    public final Comment.Identity m51400c() {
        return this.f50093c;
    }

    /* renamed from: d */
    public final String m51401d() {
        return this.f50092b;
    }

    /* renamed from: e */
    public final boolean m51402e() {
        return this.f50096f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9440a)) {
            return false;
        }
        C9440a c9440a = (C9440a) obj;
        return AbstractC19074t.m100204b(this.f50092b, c9440a.f50092b) && AbstractC19074t.m100204b(this.f50093c, c9440a.f50093c) && AbstractC19074t.m100204b(this.f50094d, c9440a.f50094d) && AbstractC19074t.m100204b(this.f50095e, c9440a.f50095e) && this.f50096f == c9440a.f50096f && this.f50097g == c9440a.f50097g;
    }

    /* renamed from: f */
    public final boolean m51403f() {
        return this.f50097g;
    }

    /* renamed from: g */
    public final boolean m51404g() {
        boolean z11;
        String str = this.f50095e;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    /* renamed from: h */
    public final void m51405h(String str) {
        this.f50092b = str;
    }

    public int hashCode() {
        String str = this.f50092b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Comment.Identity identity = this.f50093c;
        int hashCode2 = (hashCode + (identity == null ? 0 : identity.hashCode())) * 31;
        String str2 = this.f50094d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50095e;
        return ((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f50096f)) * 31) + AbstractC2144f.m11520a(this.f50097g);
    }

    /* renamed from: i */
    public final void m51406i(boolean z11) {
        this.f50097g = z11;
    }

    /* renamed from: j */
    public final void m51407j(String str) {
        this.f50095e = str;
    }

    /* renamed from: k */
    public final String m51408k() {
        return this.f50095e;
    }

    /* renamed from: l */
    public final C9440a m51409l(boolean z11) {
        return new C9440a(this.f50092b, this.f50093c, this.f50094d, this.f50095e, z11, false, 32, null);
    }

    public String toString() {
        return "ContentUserComment(id=" + this.f50092b + ", owner=" + this.f50093c + ", content=" + this.f50094d + ", statusMsg=" + this.f50095e + ", isLandscape=" + this.f50096f + ", isMissId=" + this.f50097g + ")";
    }

    public C9440a(String str, Comment.Identity identity, String str2, String str3, boolean z11, boolean z12) {
        super(0);
        this.f50092b = str;
        this.f50093c = identity;
        this.f50094d = str2;
        this.f50095e = str3;
        this.f50096f = z11;
        this.f50097g = z12;
    }
}
