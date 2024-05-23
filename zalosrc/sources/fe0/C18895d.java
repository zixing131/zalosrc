package fe0;

import android.text.TextUtils;
import au.C2343e;
import au.EnumC2341d;
import ci.C3492b;
import ci.C3494c;
import ci.C3508j;
import ci.C3510k;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import p185gc.AbstractC19383g;
import p304ks.AbstractC21935u;
import p348mi.C23302b;
import vg.C28203u6;

/* renamed from: fe0.d */
/* loaded from: classes4.dex */
public final class C18895d extends AbstractC19383g {

    /* renamed from: fe0.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final List f94333a;

        public a(List list) {
            AbstractC19074t.m100208f(list, "collectionItems");
            this.f94333a = list;
        }

        /* renamed from: a */
        public final List m99068a() {
            return this.f94333a;
        }
    }

    /* renamed from: fe0.d$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94334a;

        static {
            int[] iArr = new int[C3508j.b.values().length];
            try {
                iArr[C3508j.b.f14700q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3508j.b.f14701r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94334a = iArr;
        }
    }

    /* renamed from: c */
    private final void m99062c(C3508j c3508j) {
        String str;
        EnumC2341d enumC2341d;
        String str2;
        String str3;
        C3494c c3494c = new C3494c();
        int i11 = b.f94334a[c3508j.m17713y0().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                c3494c.m17536f(c3508j.m17694G0());
            }
        } else {
            c3494c.m17536f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_collection_video_title));
        }
        int i12 = AbstractC16803z.illus_empty_photos;
        EnumC2341d enumC2341d2 = EnumC2341d.f9839q;
        if (c3508j.m17713y0() == C3508j.b.f14700q) {
            i12 = AbstractC16803z.illus_empty_video_album_detail;
            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_album_video_empty_title);
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_album_video_empty_desc);
            enumC2341d = EnumC2341d.f9840r;
            str3 = "";
        } else {
            str = null;
            enumC2341d = enumC2341d2;
            str2 = null;
            str3 = null;
        }
        c3494c.m17534d(i12);
        c3494c.m17535e(str2);
        c3494c.m17533c(str);
        c3494c.m17532b(str3);
        c3494c.m17531a(enumC2341d);
        c3508j.m17702O0(c3494c);
    }

    /* renamed from: d */
    private final void m99063d(C3510k c3510k) {
        String str;
        boolean z11;
        String m118746s0;
        String m118746s02;
        String str2;
        String m118746s03;
        String m118746s04;
        if (c3510k == null) {
            return;
        }
        c3510k.m17745b1();
        if (!c3510k.m17742Y0().isEmpty()) {
            m99065f(c3510k.m17742Y0());
        }
        if (c3510k.m17692E0() <= 0) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_album_no_photo);
            AbstractC19074t.m100207e(str, "getString(...)");
        } else {
            String str3 = "";
            if (c3510k.m17690C0() <= 0) {
                str = "";
                z11 = false;
            } else {
                if (c3510k.m17690C0() == 1) {
                    m118746s04 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_photo_single, Integer.valueOf(c3510k.m17690C0()));
                } else {
                    m118746s04 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_photo_plural, Integer.valueOf(c3510k.m17690C0()));
                }
                str = "" + m118746s04;
                z11 = true;
            }
            if (c3510k.m17688A0() > 0) {
                if (!z11) {
                    str2 = "";
                } else {
                    str2 = ", ";
                }
                String str4 = str + str2;
                if (c3510k.m17688A0() == 1) {
                    m118746s03 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_file_single, Integer.valueOf(c3510k.m17688A0()));
                } else {
                    m118746s03 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_file_plural, Integer.valueOf(c3510k.m17688A0()));
                }
                str = str4 + m118746s03;
                z11 = true;
            }
            if (c3510k.m17689B0() > 0) {
                if (z11) {
                    str3 = ", ";
                }
                String str5 = str + str3;
                if (c3510k.m17689B0() == 1) {
                    m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_link_single, Integer.valueOf(c3510k.m17689B0()));
                } else {
                    m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_link_plural, Integer.valueOf(c3510k.m17689B0()));
                }
                str = str5 + m118746s02;
            }
            if (str.length() == 0) {
                if (c3510k.m17692E0() == 1) {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_media_store_album_item_count_single, Integer.valueOf(c3510k.m17692E0()));
                } else {
                    m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_media_store_album_item_count_plural, Integer.valueOf(c3510k.m17692E0()));
                }
                str = str + m118746s0;
            }
        }
        c3510k.m17703P0(str);
    }

    /* renamed from: e */
    private final void m99064e(C3508j c3508j) {
        if (c3508j instanceof C3510k) {
            m99063d((C3510k) c3508j);
        } else {
            m99066g(c3508j);
            m99062c(c3508j);
        }
    }

    /* renamed from: f */
    private final void m99065f(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3508j c3508j = (C3508j) it.next();
            if (c3508j != null) {
                m99064e(c3508j);
            }
        }
    }

    /* renamed from: g */
    private final void m99066g(C3508j c3508j) {
        String str;
        boolean z11;
        String m118746s0;
        String m118746s02;
        String str2;
        String m118746s03;
        String m118746s04;
        String m118746s05;
        String m17525d;
        boolean m127125u;
        if (c3508j == null) {
            return;
        }
        if (c3508j.m17713y0() == C3508j.b.f14701r && c3508j.m17693F0().length() > 0) {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, c3508j.m17693F0(), null, 2, null);
            if (m141798e != null) {
                String m40383Q = m141798e.m40383Q(true, false);
                c3508j.m17704Q0(m40383Q);
                AbstractC19074t.m100205c(m40383Q);
                c3508j.m17708U0(m40383Q);
                if (c3508j.m17714z0().isEmpty()) {
                    String str3 = m141798e.f42446v;
                    AbstractC19074t.m100207e(str3, "avt");
                    if (str3.length() > 0) {
                        C3492b c3492b = new C3492b();
                        c3492b.m17530i(m141798e.f42446v);
                        c3508j.m17714z0().add(c3492b);
                    }
                }
            }
            for (C3492b c3492b2 : c3508j.m17714z0()) {
                c3492b2.m17529h(c3508j.m17693F0());
                ContactProfile m141798e2 = C28203u6.m141798e(C28203u6.f131407a, c3492b2.m17524c(), null, 2, null);
                c3492b2.m17528g(false);
                c3492b2.m17526e(null);
                c3492b2.m17527f(null);
                if (m141798e2 != null && (m17525d = c3492b2.m17525d()) != null && !AbstractC19074t.m100204b(CoreUtility.f89233i, c3492b2.m17524c())) {
                    if (m17525d.length() != 0 && !C23302b.f113247a.m120523d(m17525d)) {
                        m127125u = AbstractC24341v.m127125u(m17525d, "avatar.talk.zdn.vn/default", false, 2, null);
                        if (m127125u) {
                        }
                    }
                    int m12307a = C2343e.m12307a(c3492b2.m17524c(), false);
                    String m118087g = AbstractC23028c0.m118087g(AbstractC21935u.m114542i(m141798e2.f42434r, m141798e2.f42437s));
                    AbstractC19074t.m100207e(m118087g, "getInitialShortNameByName(...)");
                    c3492b2.m17528g(true);
                    c3492b2.m17526e(C16640q2.m88404a().mo88411e(m118087g, m12307a));
                    c3492b2.m17527f(C16640q2.m88404a().mo88411e(m118087g, m12307a));
                }
            }
        } else if (TextUtils.isEmpty(c3508j.m17691D0()) && c3508j.m17713y0() == C3508j.b.f14700q) {
            c3508j.m17706S0(AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_store_collection_video_title));
        }
        if (c3508j.m17692E0() <= 0) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_album_no_photo);
            AbstractC19074t.m100207e(str, "getString(...)");
        } else {
            String str4 = "";
            if (b.f94334a[c3508j.m17713y0().ordinal()] == 1) {
                if (c3508j.m17692E0() == 1) {
                    m118746s05 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_media_store_album_item_count_single, Integer.valueOf(c3508j.m17692E0()));
                } else {
                    m118746s05 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_media_store_album_item_count_plural, Integer.valueOf(c3508j.m17692E0()));
                }
                str = "" + m118746s05;
            } else {
                if (c3508j.m17690C0() <= 0) {
                    str = "";
                    z11 = false;
                } else {
                    if (c3508j.m17690C0() == 1) {
                        m118746s04 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_photo_single, Integer.valueOf(c3508j.m17690C0()));
                    } else {
                        m118746s04 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_photo_plural, Integer.valueOf(c3508j.m17690C0()));
                    }
                    str = "" + m118746s04;
                    z11 = true;
                }
                if (c3508j.m17688A0() > 0) {
                    if (!z11) {
                        str2 = "";
                    } else {
                        str2 = ", ";
                    }
                    String str5 = str + str2;
                    if (c3508j.m17688A0() == 1) {
                        m118746s03 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_file_single, Integer.valueOf(c3508j.m17688A0()));
                    } else {
                        m118746s03 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_file_plural, Integer.valueOf(c3508j.m17688A0()));
                    }
                    str = str5 + m118746s03;
                    z11 = true;
                }
                if (c3508j.m17689B0() > 0) {
                    if (z11) {
                        str4 = ", ";
                    }
                    String str6 = str + str4;
                    if (c3508j.m17689B0() == 1) {
                        m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_link_single, Integer.valueOf(c3508j.m17689B0()));
                    } else {
                        m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_link_plural, Integer.valueOf(c3508j.m17689B0()));
                    }
                    str = str6 + m118746s02;
                }
                if (str.length() == 0) {
                    if (c3508j.m17692E0() == 1) {
                        m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_media_store_album_item_count_single, Integer.valueOf(c3508j.m17692E0()));
                    } else {
                        m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_media_store_album_item_count_plural, Integer.valueOf(c3508j.m17692E0()));
                    }
                    str = str + m118746s0;
                }
            }
        }
        c3508j.m17703P0(str);
    }

    @Override // p185gc.AbstractC19383g
    /* renamed from: h */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        m99065f(aVar.m99068a());
    }
}
