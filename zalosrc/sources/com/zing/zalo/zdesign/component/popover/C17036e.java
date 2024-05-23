package com.zing.zalo.zdesign.component.popover;

import ac.C0708i;
import android.graphics.drawable.Drawable;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.zdesign.component.popover.e */
/* loaded from: classes7.dex */
public final class C17036e implements InterfaceC17034c {

    /* renamed from: a */
    private int f87181a;

    /* renamed from: b */
    private Drawable f87182b;

    /* renamed from: c */
    private String f87183c;

    /* renamed from: d */
    private String f87184d;

    /* renamed from: e */
    private boolean f87185e;

    /* renamed from: f */
    private EnumC17037f f87186f;

    /* renamed from: g */
    private String f87187g;

    /* renamed from: h */
    private C0708i f87188h;

    public C17036e() {
        this(0, null, null, null, false, null, null, null, 255, null);
    }

    @Override // com.zing.zalo.zdesign.component.popover.InterfaceC17034c
    /* renamed from: a */
    public boolean mo91197a() {
        return this.f87185e;
    }

    @Override // com.zing.zalo.zdesign.component.popover.InterfaceC17034c
    /* renamed from: b */
    public String mo91198b() {
        return this.f87187g;
    }

    @Override // com.zing.zalo.zdesign.component.popover.InterfaceC17034c
    /* renamed from: c */
    public EnumC17037f mo91199c() {
        return this.f87186f;
    }

    @Override // com.zing.zalo.zdesign.component.popover.InterfaceC17034c
    /* renamed from: d */
    public C0708i mo91200d() {
        return this.f87188h;
    }

    @Override // com.zing.zalo.zdesign.component.popover.InterfaceC17034c
    /* renamed from: e */
    public String mo91201e() {
        return this.f87184d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17036e)) {
            return false;
        }
        C17036e c17036e = (C17036e) obj;
        return m91217f() == c17036e.m91217f() && AbstractC19074t.m100204b(getIcon(), c17036e.getIcon()) && AbstractC19074t.m100204b(getTitle(), c17036e.getTitle()) && AbstractC19074t.m100204b(mo91201e(), c17036e.mo91201e()) && mo91197a() == c17036e.mo91197a() && mo91199c() == c17036e.mo91199c() && AbstractC19074t.m100204b(mo91198b(), c17036e.mo91198b()) && AbstractC19074t.m100204b(mo91200d(), c17036e.mo91200d());
    }

    /* renamed from: f */
    public int m91217f() {
        return this.f87181a;
    }

    /* renamed from: g */
    public void m91218g(Drawable drawable) {
        this.f87182b = drawable;
    }

    @Override // com.zing.zalo.zdesign.component.popover.InterfaceC17034c
    public Drawable getIcon() {
        return this.f87182b;
    }

    @Override // com.zing.zalo.zdesign.component.popover.InterfaceC17034c
    public String getTitle() {
        return this.f87183c;
    }

    /* renamed from: h */
    public void m91219h(int i11) {
        this.f87181a = i11;
    }

    public int hashCode() {
        int m91217f = ((((((m91217f() * 31) + (getIcon() == null ? 0 : getIcon().hashCode())) * 31) + getTitle().hashCode()) * 31) + mo91201e().hashCode()) * 31;
        boolean mo91197a = mo91197a();
        int i11 = mo91197a;
        if (mo91197a) {
            i11 = 1;
        }
        return ((((((m91217f + i11) * 31) + mo91199c().hashCode()) * 31) + (mo91198b() == null ? 0 : mo91198b().hashCode())) * 31) + (mo91200d() != null ? mo91200d().hashCode() : 0);
    }

    /* renamed from: i */
    public void m91220i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f87183c = str;
    }

    public String toString() {
        return "PopoverItem(id=" + m91217f() + ", icon=" + getIcon() + ", title=" + getTitle() + ", subtitle=" + mo91201e() + ", dotBadgeEnabled=" + mo91197a() + ", viewType=" + mo91199c() + ", idTracking=" + mo91198b() + ", extraData=" + mo91200d() + ')';
    }

    public C17036e(int i11, Drawable drawable, String str, String str2, boolean z11, EnumC17037f enumC17037f, String str3, C0708i c0708i) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
        AbstractC19074t.m100208f(enumC17037f, "viewType");
        this.f87181a = i11;
        this.f87182b = drawable;
        this.f87183c = str;
        this.f87184d = str2;
        this.f87185e = z11;
        this.f87186f = enumC17037f;
        this.f87187g = str3;
        this.f87188h = c0708i;
    }

    public /* synthetic */ C17036e(int i11, Drawable drawable, String str, String str2, boolean z11, EnumC17037f enumC17037f, String str3, C0708i c0708i, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? null : drawable, (i12 & 4) != 0 ? "" : str, (i12 & 8) == 0 ? str2 : "", (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? EnumC17037f.NORMAL : enumC17037f, (i12 & 64) != 0 ? null : str3, (i12 & 128) == 0 ? c0708i : null);
    }
}
