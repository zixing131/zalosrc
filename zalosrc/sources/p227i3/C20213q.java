package p227i3;

import com.adtima.ads.ZAdsBannerSize;
import p009a3.C0098c;
import p090d3.C17718a;
import p090d3.C17719b;
import p090d3.C17720c;
import p148f3.C18709a;
import p148f3.C18710b;
import p148f3.C18711c;
import p178g3.AbstractC19213h;
import p178g3.C19212g;

/* renamed from: i3.q */
/* loaded from: classes2.dex */
public final class C20213q {

    /* renamed from: a */
    private static C20213q f99958a;

    private C20213q() {
    }

    /* renamed from: e */
    public static C20213q m105480e() {
        if (f99958a == null) {
            f99958a = new C20213q();
        }
        return f99958a;
    }

    /* renamed from: f */
    private String m105481f(String str, C0098c c0098c, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String str3 = c0098c.f499c;
        if (str3 == null) {
            str3 = "";
        }
        String replace = str.replace("##title##", str3);
        String str4 = c0098c.f501d;
        if (str4 == null) {
            str4 = "";
        }
        String replace2 = replace.replace("##info##", str4);
        String str5 = c0098c.f503e;
        if (str5 == null) {
            str5 = "";
        }
        String replace3 = replace2.replace("##cta##", str5);
        String str6 = c0098c.f515k;
        if (str6 == null) {
            str6 = "";
        }
        String replace4 = replace3.replace("##avaUrl##", str6);
        String str7 = c0098c.f517l;
        if (str7 == null) {
            str7 = "";
        }
        String replace5 = replace4.replace("##portCoverUrl##", str7);
        String str8 = c0098c.f519m;
        if (str8 == null) {
            str8 = "";
        }
        String replace6 = replace5.replace("##landCoverUrl##", str8).replace("##stars##", String.valueOf(C0098c.m440c(c0098c.f525p)));
        String str9 = c0098c.f527q;
        if (str9 == null) {
            str9 = "";
        }
        String replace7 = replace6.replace("##promo##", str9);
        String str10 = c0098c.f529r;
        if (str10 == null) {
            str10 = "";
        }
        String replace8 = replace7.replace("##appName##", str10);
        String str11 = c0098c.f531s;
        if (str11 == null) {
            str11 = "";
        }
        String replace9 = replace8.replace("##appCaption##", str11);
        String str12 = c0098c.f533t;
        if (str12 == null) {
            str12 = "";
        }
        String replace10 = replace9.replace("##appDescription##", str12);
        String str13 = c0098c.f535u;
        return replace10.replace("##contextString##", str13 != null ? str13 : "").replace("##templatePath##", "file://" + str2);
    }

    /* renamed from: a */
    public C17718a m105482a(C0098c c0098c, C18709a c18709a, ZAdsBannerSize zAdsBannerSize, boolean z11) {
        C17718a c17718a;
        try {
            String m100829t = C19212g.m100811q().m100829t();
            if (c0098c == null || c18709a == null || m100829t == null) {
                c17718a = new C17718a();
            } else {
                if (z11) {
                    C20199c.m105336g().m105345j(c0098c.f517l);
                }
                c0098c = AbstractC19213h.m100830a(zAdsBannerSize, c0098c);
                String str = c18709a.f94006c;
                if (str != null) {
                    c18709a.f94006c = m105481f(str, c0098c, m100829t);
                }
                String str2 = c18709a.f94007d;
                if (str2 != null) {
                    c18709a.f94007d = m105481f(str2, c0098c, m100829t);
                }
                c17718a = new C17718a();
            }
            try {
                c17718a.f89802a = c0098c;
                c17718a.f89803b = c18709a;
                return c17718a;
            } catch (Exception unused) {
                return c17718a;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public C17718a m105483b(C17718a c17718a, String str, String str2, String str3) {
        try {
            C18709a c18709a = c17718a.f89803b;
            String str4 = c18709a.f94006c;
            if (str4 != null) {
                c18709a.f94006c = str4.replace("##portCoverUrl2##", str).replace("##portCoverUrl3##", str2).replace("##portCoverUrl4##", str3).replace("##landCoverUrl2##", str).replace("##landCoverUrl3##", str2).replace("##landCoverUrl4##", str3);
            }
            C18709a c18709a2 = c17718a.f89803b;
            String str5 = c18709a2.f94007d;
            if (str5 != null) {
                c18709a2.f94007d = str5.replace("##portCoverUrl2##", str).replace("##portCoverUrl3##", str2).replace("##portCoverUrl4##", str3).replace("##landCoverUrl2##", str).replace("##landCoverUrl3##", str2).replace("##landCoverUrl4##", str3);
            }
        } catch (Exception unused) {
        }
        return c17718a;
    }

    /* renamed from: c */
    public C17719b m105484c(C0098c c0098c, C18710b c18710b, String str) {
        C17719b c17719b;
        try {
            String m100829t = C19212g.m100811q().m100829t();
            if (c0098c == null || c18710b == null || m100829t == null) {
                c17719b = new C17719b();
            } else {
                C20199c.m105336g().m105345j(c0098c.f517l);
                c0098c = AbstractC19213h.m100830a(ZAdsBannerSize.FULL_PAGE, c0098c);
                String str2 = c18710b.f94011b;
                if (str2 != null) {
                    c18710b.f94011b = m105481f(str2, c0098c, m100829t);
                }
                String str3 = c18710b.f94012c;
                if (str3 != null) {
                    c18710b.f94012c = m105481f(str3, c0098c, m100829t);
                }
                c17719b = new C17719b();
            }
            try {
                c17719b.f89805a = c0098c;
                c17719b.f89806b = c18710b;
                return c17719b;
            } catch (Exception unused) {
                return c17719b;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: d */
    public C17720c m105485d(C0098c c0098c, C18711c c18711c, String str) {
        C17720c c17720c;
        try {
            String m100829t = C19212g.m100811q().m100829t();
            if (c0098c == null || c18711c == null || m100829t == null) {
                c17720c = new C17720c();
            } else {
                C20199c.m105336g().m105345j(c0098c.f517l);
                c0098c = AbstractC19213h.m100830a(ZAdsBannerSize.FULL_PAGE, c0098c);
                String str2 = c18711c.f94016b;
                if (str2 != null) {
                    c18711c.f94016b = m105481f(str2, c0098c, m100829t);
                }
                String str3 = c18711c.f94017c;
                if (str3 != null) {
                    c18711c.f94017c = m105481f(str3, c0098c, m100829t);
                }
                String str4 = c18711c.f94018d;
                if (str4 != null) {
                    c18711c.f94018d = m105481f(str4, c0098c, m100829t);
                }
                c17720c = new C17720c();
            }
            try {
                c17720c.f89808a = c0098c;
                c17720c.f89809b = c18711c;
                return c17720c;
            } catch (Exception unused) {
                return c17720c;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
