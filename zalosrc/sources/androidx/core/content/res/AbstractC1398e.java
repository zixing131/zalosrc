package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.provider.C1458e;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p176g1.AbstractC19202d;

/* renamed from: androidx.core.content.res.e */
/* loaded from: classes2.dex */
public abstract class AbstractC1398e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.e$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static int m7058a(TypedArray typedArray, int i11) {
            return typedArray.getType(i11);
        }
    }

    /* renamed from: androidx.core.content.res.e$b */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* renamed from: androidx.core.content.res.e$c */
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final d[] f6131a;

        public c(d[] dVarArr) {
            this.f6131a = dVarArr;
        }

        /* renamed from: a */
        public d[] m7059a() {
            return this.f6131a;
        }
    }

    /* renamed from: androidx.core.content.res.e$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        private final String f6132a;

        /* renamed from: b */
        private final int f6133b;

        /* renamed from: c */
        private final boolean f6134c;

        /* renamed from: d */
        private final String f6135d;

        /* renamed from: e */
        private final int f6136e;

        /* renamed from: f */
        private final int f6137f;

        public d(String str, int i11, boolean z11, String str2, int i12, int i13) {
            this.f6132a = str;
            this.f6133b = i11;
            this.f6134c = z11;
            this.f6135d = str2;
            this.f6136e = i12;
            this.f6137f = i13;
        }

        /* renamed from: a */
        public String m7060a() {
            return this.f6132a;
        }

        /* renamed from: b */
        public int m7061b() {
            return this.f6137f;
        }

        /* renamed from: c */
        public int m7062c() {
            return this.f6136e;
        }

        /* renamed from: d */
        public String m7063d() {
            return this.f6135d;
        }

        /* renamed from: e */
        public int m7064e() {
            return this.f6133b;
        }

        /* renamed from: f */
        public boolean m7065f() {
            return this.f6134c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e */
    /* loaded from: classes2.dex */
    public static final class e implements b {

        /* renamed from: a */
        private final C1458e f6138a;

        /* renamed from: b */
        private final int f6139b;

        /* renamed from: c */
        private final int f6140c;

        /* renamed from: d */
        private final String f6141d;

        public e(C1458e c1458e, int i11, int i12, String str) {
            this.f6138a = c1458e;
            this.f6140c = i11;
            this.f6139b = i12;
            this.f6141d = str;
        }

        /* renamed from: a */
        public int m7066a() {
            return this.f6140c;
        }

        /* renamed from: b */
        public C1458e m7067b() {
            return this.f6138a;
        }

        /* renamed from: c */
        public String m7068c() {
            return this.f6141d;
        }

        /* renamed from: d */
        public int m7069d() {
            return this.f6139b;
        }
    }

    /* renamed from: a */
    private static int m7050a(TypedArray typedArray, int i11) {
        return a.m7058a(typedArray, i11);
    }

    /* renamed from: b */
    public static b m7051b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m7053d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List m7052c(Resources resources, int i11) {
        if (i11 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i11);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m7050a(obtainTypedArray, 0) == 1) {
                for (int i12 = 0; i12 < obtainTypedArray.length(); i12++) {
                    int resourceId = obtainTypedArray.getResourceId(i12, 0);
                    if (resourceId != 0) {
                        arrayList.add(m7057h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m7057h(resources.getStringArray(i11)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static b m7053d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m7054e(xmlPullParser, resources);
        }
        m7056g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static b m7054e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC19202d.FontFamily);
        String string = obtainAttributes.getString(AbstractC19202d.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(AbstractC19202d.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(AbstractC19202d.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(AbstractC19202d.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(AbstractC19202d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(AbstractC19202d.FontFamily_fontProviderFetchTimeout, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        String string4 = obtainAttributes.getString(AbstractC19202d.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m7056g(xmlPullParser);
            }
            return new e(new C1458e(string, string2, string3, m7052c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m7055f(xmlPullParser, resources));
                } else {
                    m7056g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    /* renamed from: f */
    private static d m7055f(XmlPullParser xmlPullParser, Resources resources) {
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC19202d.FontFamilyFont);
        if (obtainAttributes.hasValue(AbstractC19202d.FontFamilyFont_fontWeight)) {
            i11 = AbstractC19202d.FontFamilyFont_fontWeight;
        } else {
            i11 = AbstractC19202d.FontFamilyFont_android_fontWeight;
        }
        int i16 = obtainAttributes.getInt(i11, 400);
        if (obtainAttributes.hasValue(AbstractC19202d.FontFamilyFont_fontStyle)) {
            i12 = AbstractC19202d.FontFamilyFont_fontStyle;
        } else {
            i12 = AbstractC19202d.FontFamilyFont_android_fontStyle;
        }
        if (1 == obtainAttributes.getInt(i12, 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (obtainAttributes.hasValue(AbstractC19202d.FontFamilyFont_ttcIndex)) {
            i13 = AbstractC19202d.FontFamilyFont_ttcIndex;
        } else {
            i13 = AbstractC19202d.FontFamilyFont_android_ttcIndex;
        }
        if (obtainAttributes.hasValue(AbstractC19202d.FontFamilyFont_fontVariationSettings)) {
            i14 = AbstractC19202d.FontFamilyFont_fontVariationSettings;
        } else {
            i14 = AbstractC19202d.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i14);
        int i17 = obtainAttributes.getInt(i13, 0);
        if (obtainAttributes.hasValue(AbstractC19202d.FontFamilyFont_font)) {
            i15 = AbstractC19202d.FontFamilyFont_font;
        } else {
            i15 = AbstractC19202d.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i15, 0);
        String string2 = obtainAttributes.getString(i15);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m7056g(xmlPullParser);
        }
        return new d(string2, i16, z11, string, i17, resourceId);
    }

    /* renamed from: g */
    private static void m7056g(XmlPullParser xmlPullParser) {
        int i11 = 1;
        while (i11 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i11--;
                }
            } else {
                i11++;
            }
        }
    }

    /* renamed from: h */
    private static List m7057h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
