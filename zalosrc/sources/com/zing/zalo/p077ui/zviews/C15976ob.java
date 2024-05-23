package com.zing.zalo.p077ui.zviews;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.ui.zviews.ob */
/* loaded from: classes6.dex */
public final class C15976ob {

    /* renamed from: a */
    private final String f81452a;

    /* renamed from: b */
    private final Integer f81453b;

    /* renamed from: c */
    private final String f81454c;

    /* renamed from: d */
    private final String f81455d;

    public C15976ob(String str, Integer num, String str2, String str3) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "action");
        this.f81452a = str;
        this.f81453b = num;
        this.f81454c = str2;
        this.f81455d = str3;
    }

    /* renamed from: a */
    public final String m87385a() {
        return this.f81454c;
    }

    /* renamed from: b */
    public final Integer m87386b() {
        return this.f81453b;
    }

    /* renamed from: c */
    public final String m87387c() {
        return this.f81455d;
    }

    /* renamed from: d */
    public final String m87388d() {
        return this.f81452a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15976ob)) {
            return false;
        }
        C15976ob c15976ob = (C15976ob) obj;
        return AbstractC19074t.m100204b(this.f81452a, c15976ob.f81452a) && AbstractC19074t.m100204b(this.f81453b, c15976ob.f81453b) && AbstractC19074t.m100204b(this.f81454c, c15976ob.f81454c) && AbstractC19074t.m100204b(this.f81455d, c15976ob.f81455d);
    }

    public int hashCode() {
        int hashCode = this.f81452a.hashCode() * 31;
        Integer num = this.f81453b;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f81454c.hashCode()) * 31;
        String str = this.f81455d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DownloadInfo(url=" + this.f81452a + ", shareId=" + this.f81453b + ", action=" + this.f81454c + ", successMsg=" + this.f81455d + ")";
    }

    public /* synthetic */ C15976ob(String str, Integer num, String str2, String str3, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? "action.webview.save.file" : str2, (i11 & 8) != 0 ? null : str3);
    }
}
