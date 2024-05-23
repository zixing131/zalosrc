package gf;

import android.graphics.Typeface;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p208hf.C20028b;
import p489rn.C25892l2;

/* renamed from: gf.a */
/* loaded from: classes3.dex */
public final class C19435a {

    /* renamed from: a */
    public static final C19435a f96406a = new C19435a();

    /* renamed from: b */
    private static final Map f96407b = new ConcurrentHashMap();

    /* renamed from: gf.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final int f96408a;

        /* renamed from: b */
        private final int f96409b;

        /* renamed from: c */
        private final int f96410c;

        /* renamed from: d */
        private final String f96411d;

        /* renamed from: e */
        private final int f96412e;

        public a(int i11, int i12, int i13, String str, int i14) {
            AbstractC19074t.m100208f(str, "fontPath");
            this.f96408a = i11;
            this.f96409b = i12;
            this.f96410c = i13;
            this.f96411d = str;
            this.f96412e = i14;
        }

        /* renamed from: a */
        public final int m101603a() {
            return this.f96409b;
        }

        /* renamed from: b */
        public final String m101604b() {
            return this.f96411d;
        }

        /* renamed from: c */
        public final int m101605c() {
            return this.f96412e;
        }

        /* renamed from: d */
        public final int m101606d() {
            return this.f96410c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f96408a == aVar.f96408a && this.f96409b == aVar.f96409b && this.f96410c == aVar.f96410c && AbstractC19074t.m100204b(this.f96411d, aVar.f96411d) && this.f96412e == aVar.f96412e;
        }

        public int hashCode() {
            return (((((((this.f96408a * 31) + this.f96409b) * 31) + this.f96410c) * 31) + this.f96411d.hashCode()) * 31) + this.f96412e;
        }

        public String toString() {
            return "StoryMusicVisualComboConfig(visualId=" + this.f96408a + ", fontId=" + this.f96409b + ", width=" + this.f96410c + ", fontPath=" + this.f96411d + ", fontSize=" + this.f96412e + ")";
        }
    }

    private C19435a() {
    }

    /* renamed from: a */
    public final String m101598a(int i11) {
        switch (i11) {
            case 1000:
                return "fonts/Roboto-Bold.ttf";
            case 1001:
                return "fonts/camera/DancingScript-Bold.ttf";
            case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                return "fonts/camera/Raleway-BlackItalic.ttf";
            default:
                return "";
        }
    }

    /* renamed from: b */
    public final List m101599b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C20028b(1000, "fonts/Roboto-Bold.ttf", "Aa"));
        arrayList.add(new C20028b(1001, "fonts/camera/DancingScript-Bold.ttf", "Aa"));
        arrayList.add(new C20028b(ZAbstractBase.ZVU_BLEND_PERCENTAGE, "fonts/camera/Raleway-BlackItalic.ttf", "AA"));
        return arrayList;
    }

    /* renamed from: c */
    public final List m101600c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C25892l2.c(1, AbstractC16803z.ic_story_effect_lyric_1, false));
        arrayList.add(new C25892l2.c(2, AbstractC16803z.ic_story_effect_lyric_2, false));
        arrayList.add(new C25892l2.c(3, AbstractC16803z.ic_story_effect_lyric_3, false));
        arrayList.add(new C25892l2.c(4, AbstractC16803z.ic_story_effect_badge_music, false));
        arrayList.add(new C25892l2.c(0, AbstractC16803z.ic_story_effect_no_effect, false));
        return arrayList;
    }

    /* renamed from: d */
    public final a m101601d(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return null;
                        }
                        return new a(4, -1, AbstractC23136l9.m118742r(200.0f), "", 0);
                    }
                    return new a(3, ZAbstractBase.ZVU_BLEND_PERCENTAGE, AbstractC23136l9.m118742r(286.0f), "fonts/camera/Raleway-BlackItalic.ttf", AbstractC23222t7.f112518D);
                }
                return new a(2, 1001, AbstractC23136l9.m118742r(286.0f), "fonts/camera/DancingScript-Bold.ttf", AbstractC23222t7.f112522F);
            }
            return new a(1, 1000, AbstractC23136l9.m118742r(286.0f), "fonts/Roboto-Bold.ttf", AbstractC23222t7.f112518D);
        }
        return new a(0, -1, 0, "", 0);
    }

    /* renamed from: e */
    public final Typeface m101602e(int i11, String str) {
        AbstractC19074t.m100208f(str, "fontPath");
        if (i11 == -1) {
            return null;
        }
        Map map = f96407b;
        Typeface typeface = (Typeface) map.get(Integer.valueOf(i11));
        if (typeface == null) {
            if (str.length() > 0) {
                typeface = Typeface.createFromAsset(MainApplication.Companion.m35500c().getAssets(), str);
            }
            if (typeface != null) {
                map.put(Integer.valueOf(i11), typeface);
            }
        }
        return typeface;
    }
}
